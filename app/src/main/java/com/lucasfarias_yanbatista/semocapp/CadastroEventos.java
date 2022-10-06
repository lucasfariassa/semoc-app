package com.lucasfarias_yanbatista.semocapp;

import java.util.Arrays;
import java.util.List;

public class CadastroEventos {
    protected List<Evento> eventos;

    protected void cadastrarEventos() {
        eventos = Arrays.asList(
                new Evento("17/10",
                        "18h30 às 21h00",
                        "Auditório\nTérreo\nBloco A",
                        "Abertura da SEMOC 2022",
                        "Participantes:\n" +
                                "• Profa. Dra. Roberta Gontijo (Reitora)\n" +
                                "• Prof. Dr. Deivid Carvalho Lorenzo (Pró Reitor de Graduação)\n" +
                                "• Profa. Dra. Silvana Sá de Carvalho,\n" +
                                "• Profa. Dra. Theresinha Guimarães Miranda (UFBA)\n" +
                                "• Prof. Dr. João Danilo Batista de Oliveira (UNEB e CEE-BA)\n" +
                                "• Alexandre Carvalho Baroni (SJDHDS-BA)\n\n" +
                                "Moderação: Matheus Martins de Oliveira (UCSAL e OAB-BA)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: Direitos Fundamentais, Efetividade e Jurisdição " +
                                "Constitucional",
                        "Coordenação: Prof. Dr. Dirley da Cunha Júnior (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Me. Ana Cláudia Gusmão Cunha (UCSAL)\n" +
                                "• Prof. Me. André Quadros Côrtes (UCSAL)\n" +
                                "• Eugênia Vilk Sturaro (UCSAL)\n\n" +
                                "Moderação: Me. Andrea Boczar (UCSAL)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Acessibilidade em Escolas Municipais: ir, estar e " +
                                "voltar",
                        "Coordenação: Matheus Martins de Oliveira (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Me. Nadjane Crisóstomo Prado (UCSAL)\n" +
                                "• Silvânia Mendes Libório Leão (UNIME)\n" +
                                "• Valdirene Santos de Sena (UCSAL)\n\n" +
                                "Moderação: Me. Milton Silva Vasconcellos (UCSAL)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Primeira infância primeiro",
                        "Coordenação: Profa. Dra. Sumaia Midlej Pimentel Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Patrícia Vilas Boas (UFBA)\n" +
                                "• Helena Oliveira (UNICEF)\n" +
                                "• Simone Café (Núcleo Especial de Apoio à Primeira Infância/PMS)"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Mesa-redonda: Povos tradicionais e o direito ao território",
                        "Coordenação: MDébora Carol Luz da Porciuncula\n\n" +
                                "Participantes:\n" +
                                "• Dona Donana, Mãe espiritual do Quilombo Quingoma\n" +
                                "• Prof. Dr. Paulo Rosa Torres (Universidade Estadual de Feira de " +
                                "Santana)\n" +
                                "• Prof. Dr. Gregório Mesa Cuadros (Universidad Nacional de " +
                                "Colombia)\n" +
                                "• Sra. Rita Ferreira (MSTB)\n\n" +
                                "Moderação:\n" +
                                "• Prof. Dr. Manuel Vitor Portugal Gonçalves\n" +
                                "• Profa. Me. Vinnie Mayana Lima Ramos"),
                new Evento("18/10",
                        "14h00 às 16h30",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa redonda: O Olhar na História para Identificar os Caminhos da " +
                                "Ciência",
                        "Coordenação: Profa. Dra. Kátia Oliver de Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Me. Stela Gleide Oliveira Santana Lago (UCSAL)\n" +
                                "• Me. Marcella Pinto de Almeida (UCSAL)\n" +
                                "• Me. Ademir Silva (UNEB)"),
                new Evento("18/10",
                        "18h30 às 21h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa redonda: O PIBID e a Residência Pedagógica na UCSAL: " +
                                "Desafios e experiências da Inclusão na Educação Básica e a " +
                                "Formação de Professores",
                        "Coordenação:\n" +
                                "• Profa. Dra. Liliane Vasconcelos (UCSAL)\n" +
                                "• Profa. Me. Alessandra Carvalho(UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Prof. Me. Eduardo Bertussi (UCSAL)\n" +
                                "• Prof. Me. João Luciano Gomes (UCSAL)\n" +
                                "• Prof. Me. José Abbade (UCSAL)\n" +
                                "• Profa. Dra. Luciana Martins (UCSAL)\n" +
                                "• Profa. Dra. Rujane Mota Alves (UCSAL)\n" +
                                "• Profa. Esp. Jucy Silva (CEEBC/STEVE BIKO)\n" +
                                "• Profa. Me. Josenilda Pinto Mesquita (UCSAL)\n" +
                                "• Profa. Me. Luciene dos Reis Santos (CEEBC/FAMEC)\n" +
                                "• Profa. Me. Odete Martinez (UCSAL)\n" +
                                "• Profa.Me. Anna Paola Misi (UCSAL)"),
                new Evento("18/10",
                        "18h30 às 21h00",
                        "Auditório da Pós",
                        "Mesa Redonda: Alteridade e busca de sentido para uma educação " +
                                "inclusiva e dialógica",
                        "Coordenação: Prof. Dr. Jose Luis Sepúlveda Ferriz (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Prof. Dr. Giorgio Borghi (UCSAL)\n" +
                                "• Mônica Patricia Oliveira Sousa (UNIME)\n" +
                                "• Me. Ademir Silva (UNEB)\n\n" +
                                "Moderação: Francisco Couto (UCSAL)"),
                new Evento("18/10",
                        "18h30 às 21h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Instrumentos democráticos por uma educação inclusiva" +
                                " e efetiva",
                        "Coordenação: Claudio Queiroz (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Lívia Mesquita Borges (SERDOWN)\n" +
                                "• Lucas Teles Oliveira (OAB-BA)\n" +
                                "• Silvanete Brandão (COMPED-SSA)\n" +
                                "• Josenita Luz (MLPCDI-LF)\n\n" +
                                "Moderação: Camilla Mota (OAB-LF)"),
                new Evento("19/10",
                        "9h30 às 12h00",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Mesa-redonda: Direito à moradia e violações na pandemia de COVID-19",
                        "Coordenação: Profa. Dra. Liana Viveiros (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Dra. Adriana Nogueira Vieira Lima (UEFS)\n" +
                                "• Gilson Santiago Macedo Júnior (Rede Nordeste de \nMonitoramento " +
                                "e Incidência em Conflitos Fundiários Urbanos)\n" +
                                "• Guillem Domingo (Observatori de Drets Econòmics, Socials i " +
                                "Culturals - ODESC)\n" +
                                "• Maura Cristina da Silva (Articulação do Centro Antigo de " +
                                "\nSalvador/Campanha Despejo Zero - Bahia)\n" +
                                "• Prof. Dr. Raúl Márquez Porras (Universidad de Barcelona)"),
                new Evento("19/10",
                        "9h30 às 12h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: Criminologia Crítica na América Latina: Punitivismo " +
                                "e Direitos Humanos",
                        "Coordenação:\n" +
                                "• Prof. Dr. Fábio Roque (UCSAL)\n" +
                                "• Profa. Dra. Fernanda Ravazzano (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Kalita Paixão (UCSAL)\n" +
                                "• João de Melo Cruz Filho (UCSAL)\n" +
                                "• Fábio Moreira Ramiro (UCSAL)\n" +
                                "• Jocimar Sol de Macedo (UCSAL)"),
                new Evento("19/10",
                        "9h30 às 12h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Inclusão educacional das pessoas com deficiência" +
                                " e boas práticas",
                        "Coordenação: Profa. Me. Lea Maria Medeiros (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Silvia Bezerra Pereira (UCSAL)\n" +
                                "• Marcos Filipe de Carvalho (UNEB)\n" +
                                "• Prof. Me. Carlos Coutinho (UCSAL)"),
                new Evento("19/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Famílias e Educação: Novos olhares e reflexões " +
                                "sobre inclusão social",
                        "Coordenação: Profa. Dra. Livia Alessandra Fialho da Costa" +
                                " (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Olgair Marques da Silva (UCSAL)\n" +
                                "• Sandra Alves Moura de Jesus (UCSAL)\n" +
                                "• Anderson dos Santos Dias (UCSAL)\n" +
                                "• Me. Jane de Jesus Soares (UCSAL)\n" +
                                "• Me. Cesar Oliveira Carneiro (UCSAL)")
        );
    }
}
