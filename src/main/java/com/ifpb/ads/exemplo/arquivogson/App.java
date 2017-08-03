package com.ifpb.ads.exemplo.arquivogson;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Joseph Sousa
 * @mail Jsantos.te@gmail.com
 * @since 02/08/2017 , 21:23:57
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Gson gson = new Gson();
        Produto p = new Produto();
        p.setCodigo(1);
        p.setDescrição("coca cola");
        p.setPreco(4);
        String json = gson.toJson(p);
        FileWriter writer = new FileWriter("file.json");
        writer.write(json);
        writer.close();
        BufferedReader br = new BufferedReader(new FileReader("file.json"));
        Produto b= gson.fromJson(br,Produto.class);
        System.out.println(b);
    }
}
