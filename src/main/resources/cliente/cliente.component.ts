import {Component, ViewContainerRef} from "@angular/core";
import {CrudComponent} from "../component/crud.component";
import {CrudService} from "../service/crud.service";
import {ToastsManager} from "ng2-toastr";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {Grupo} from "./grupo";
import {GrupoService} from "./grupo.service";
import {MenuService} from "../menu/menu.service";
import {MenuAgrupador} from "../menu/menuAgrupador";
import {Menu} from "../menu/menu";
import {GrupoMenu} from "./grupoMenu";
import {Configuracao} from "../menu/configuracao";
import {ConfiguracaoService} from "../menu/configuracao.service";
import {GrupoConfiguracao} from "./grupoConfiguracao";
import {GrupoRelatorio} from "./grupoRelatorio";
import {GrupoRole} from "./grupoRole";
import {AppService} from "../app.service";
import {FormControl} from "@angular/forms";

@Component({
    templateUrl: './cliente.component.html',
    styleUrls: ['./cliente.component.css']
})
export class ClienteComponent {

}
