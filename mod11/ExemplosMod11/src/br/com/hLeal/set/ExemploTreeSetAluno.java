package br.com.hLeal.set;

import br.com.hLeal.domain.Aluno;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author haysl
 */

public class ExemploTreeSetAluno {

    public static void main(String[] args) {
        exemploTreeSetAluno();
    }

    /**
     * Para não repetir objetos na lista é necessário que a classe Aluno implemente a classe Comparable
     * Tem ordem natural dos objetos
     */

    private static void exemploTreeSetAluno() {
        System.out.println("**** exemploTreeSetAluno ****");
        Set<Aluno> conjunto = new TreeSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
