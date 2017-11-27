export class ${model.nome} {

    <#list model.atributes as attr>
        ${attr.nome}: ${attr.tipo};
    </#list>
}