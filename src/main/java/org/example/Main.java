package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProdutoLivroPU");
        EntityManager em = emf.createEntityManager();

        ProdutoLivro livro = new ProdutoLivro("Java Programming", "James Gosling", 99.99);

        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();

        System.out.println("Livro salvo: " + livro);

        em.close();
        emf.close();
    }
}