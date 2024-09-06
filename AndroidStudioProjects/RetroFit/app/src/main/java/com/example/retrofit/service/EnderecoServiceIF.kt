package com.example.retrofit.service
import com.example.retrofit.data.Endereco
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call
interface EnderecoServiceIF {

    @GET("{cep}/json/")
    suspend fun getDetailsByCep(
        @Path("cep") cep: String,
    ): Endereco

}