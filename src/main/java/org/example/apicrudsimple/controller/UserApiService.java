package org.example.apicrudsimple.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.example.apicrudsimple.Model.UserRegister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserRegister")
public class UserApiService {

    UserRegister userRegister;

    @Operation(description = "Retorna o usuario")
    @ApiResponses(
            {@ApiResponse(responseCode = "200", description = "Ok retornou."),
                    @ApiResponse(responseCode = "600", description = "n existe id")}
    )

    @GetMapping("/{userId}")
    public UserRegister getUserRegisterDetails(String userId) {


        return userRegister;
    }

    @Operation(description = "Envia o usuario")
    @ApiResponses(
            {@ApiResponse(responseCode = "200", description = "Ok enviado."),
                    @ApiResponse(responseCode = "600", description = "erro ao enviar.")}
    )

    @PostMapping
    public String CreateuserRegisterDatails(@RequestBody UserRegister userRegister) {

        this.userRegister = userRegister;
        return "criado com sucesso.";
    }

    @Operation(description = "atualiza o usuario")
    @ApiResponses(
            {@ApiResponse(responseCode = "200", description = "Ok atualizado."),
                    @ApiResponse(responseCode = "600", description = "erro ao atualizar.")}
    )

    @PutMapping
    public String UpdateCloudVendorDatails(@RequestBody UserRegister userRegister) {

        this.userRegister = userRegister;
        return "atualizado com sucesso.";
    }

     @Operation(description = "Deleta o usuario")
    @ApiResponses(
            {@ApiResponse(responseCode = "200", description = "Ok deletado"),
                    @ApiResponse(responseCode = "600", description = "erro ao deletar.")}
    )
    @DeleteMapping("/{userId}")
    public String DeleteUserRegisterDetails(String userId) {

        this.userRegister = null;
//        if(this.userRegister == null){
//            return "deletado com sucesso.";
//        }
//        else {
//            return "erro ao deletar.";
//        }

         return userId;
     }


}

