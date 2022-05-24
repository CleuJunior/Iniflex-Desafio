package main.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DBFunct {

    private static List<Funcionario> dbFuncionarios = new ArrayList<>();


    public DBFunct() {
        dbFuncionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        dbFuncionarios.add(new Funcionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        dbFuncionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        dbFuncionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        dbFuncionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        dbFuncionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        dbFuncionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        dbFuncionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        dbFuncionarios.add(new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        dbFuncionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));


    }

    public static String orderByFunc() {
        StringBuilder st = new StringBuilder("Nome | Data Nascimento | Salario | Funcao\n");

        dbFuncionarios.sort(Comparator.comparing(Funcionario::getFunct));

        st.append(
                dbFuncionarios.stream().collect(Collectors.toCollection(() -> ))
        );

        return st.toString();
    }




    public static void printDBFuncionarios() {
        System.out.println("Nome | Data Nascimento | Salario | Funcao");
        dbFuncionarios
                .forEach(System.out::println);
    }
}
