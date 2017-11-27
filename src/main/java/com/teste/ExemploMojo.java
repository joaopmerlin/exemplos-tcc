package com.teste;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "generate",
        defaultPhase = LifecyclePhase.PROCESS_CLASSES,
        threadSafe = true)
public class ExemploMojo extends AbstractMojo {

    @Component
    private MavenProject project;

    @Parameter(required = true)
    private String diretorio;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
