package com.lucasfarias_yanbatista.semocapp;

import java.util.Arrays;
import java.util.List;

public class CadastroEventos {
    protected List<Evento> eventos;

    protected void cadastrarEventos() {
        eventos = Arrays.asList(
                new Evento("17/10",
                        "18h30 às 21h00",
                        "Auditório Térreo\nBloco A",
                        "Abertura da SEMOC 2022",
                        "Participantes:\n" +
                                "Profa. Dra. Roberta Gontijo (Reitora)\n" +
                                "Prof. Dr. Deivid Carvalho Lorenzo (Pró Reitor de Graduação)\n" +
                                "Profa. Dra. Silvana Sá de Carvalho,\n" +
                                "Profa. Dra. Theresinha Guimarães Miranda (UFBA)\n" +
                                "Prof. Dr. João Danilo Batista de Oliveira (UNEB e CEE-BA)\n" +
                                "Alexandre Carvalho Baroni (SJDHDS-BA)\n\n" +
                                "Moderação: Matheus Martins de Oliveira (UCSAL e OAB-BA)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório Térreo\nBloco A",
                        "Mesa-redonda: Direitos Fundamentais, Efetividade e Jurisdição Constitucional",
                        "Coordenação: Prof. Dr. Dirley da Cunha Júnior (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "Profa. Me. Ana Cláudia Gusmão Cunha (UCSAL)\n" +
                                "Prof. Me. André Quadros Côrtes (UCSAL)\n" +
                                "Eugênia Vilk Sturaro (UCSAL)\n\n" +
                                "Moderação: Me. Andrea Boczar (UCSAL)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Acessibilidade em Escolas Municipais: ir, estar e voltar",
                        "Coordenação: Matheus Martins de Oliveira (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "Me. Nadjane Crisóstomo Prado (UCSAL)\n" +
                                "Silvânia Mendes Libório Leão (UNIME)\n" +
                                "Valdirene Santos de Sena (UCSAL)\n\n" +
                                "Moderação: Me. Milton Silva Vasconcellos (UCSAL)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Primeira infância primeiro",
                        "Coordenação: Profa. Dra. Sumaia Midlej Pimentel Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "Patrícia Vilas Boas (UFBA)\n" +
                                "Helena Oliveira (UNICEF)\n" +
                                "Simone Café (Núcleo Especial de Apoio à Primeira Infância/PMS)")

        );
    }
}
