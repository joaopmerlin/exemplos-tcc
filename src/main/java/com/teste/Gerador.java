package com.teste;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.FileOutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Gerador {

    public Gerador(Model model) {
        try {
            Version version = new Version(2, 3, 20);
            Configuration cfg = new Configuration(version);
            cfg.setClassForTemplateLoading(this.getClass(), "/");
            cfg.setIncompatibleImprovements(version);
            cfg.setDefaultEncoding("UTF-8");
            cfg.setLocale(Locale.US);
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            Template template = cfg.getTemplate("template.ftl");
            Map<String, Object> parametroList = new HashMap<>();
            parametroList.put("model", model);
            StringWriter stringWriter = new StringWriter();
            try (Writer writer = stringWriter) {
                template.process(parametroList, writer);
            }

            System.out.println(stringWriter.toString());

            FileOutputStream fileOutputStream = new FileOutputStream(model.getNome() + ".ts");
            fileOutputStream.write(stringWriter.toString().getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
