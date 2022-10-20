package com.lucasfarias_yanbatista.semocapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
                                "Moderação: Matheus Martins de Oliveira (UCSAL e OAB-BA)",
                        ""),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: A Jurisdição Constitucional e a Defesa das " +
                                "Constituições Normativas",
                        "Coordenação: Prof. Dr. Dirley da Cunha Júnior (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Me. Ana Cláudia Gusmão Cunha (UCSAL)\n" +
                                "• Prof. Me. André Quadros Côrtes (UCSAL)\n" +
                                "• Eugênia Vilk Sturaro (UCSAL)\n\n" +
                                "Moderação: Me. Andrea Boczar (UCSAL)",
                        "MR"),
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
                                "Moderação: Me. Milton Silva Vasconcellos (UCSAL)",
                        "MR"),
                new Evento("18/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Primeira infância primeiro",
                        "Coordenação: Profa. Dra. Sumaia Midlej Pimentel Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Patrícia Vilas Boas (UFBA)\n" +
                                "• Helena Oliveira (UNICEF)\n" +
                                "• Simone Café (Núcleo Especial de Apoio à Primeira Infância/PMS)",
                        "MR"),
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
                                "• Profa. Me. Vinnie Mayana Lima Ramos",
                        "MR"),
                new Evento("18/10",
                        "14h00 às 16h30",
                        "Sala 201\nBloco B",
                        "Jornada de Pesquisa: Geotecnologias aplicadas ao " +
                                "Planejamento Urbano e Desenvolvimento Social",
                        "Grupo de Pesquisa Geotecnologias e Planejamento " +
                                "Territorial - GEOPLAN\n\n" +
                                "Líderes:\n" +
                                "• Profa. Dra. Silvana Sá de Carvalho\n" +
                                "• Prof. Dr. Arnaldo Bispo de Jesus\n\n" +
                                "Participantes:\n" +
                                "• Thalita Emanuele Santiago\n" +
                                "• Fernando Guerra\n" +
                                "• João Paulo Santos Guimarães\n" +
                                "• Mariana Gomes Ribeiro" +
                                "• Luis Cláudio Rios Santos",
                        "JP"),
                new Evento("18/10",
                        "14h00 às 16h30",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: O Olhar na História para Identificar os Caminhos da " +
                                "Ciência",
                        "Coordenação: Profa. Dra. Kátia Oliver de Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Me. Stela Gleide Oliveira Santana Lago (UCSAL)\n" +
                                "• Me. Marcella Pinto de Almeida (UCSAL)\n" +
                                "• Me. Ademir Silva (UNEB)",
                        "MR"),
                new Evento("18/10",
                        "18h30 às 21h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: O PIBID e a Residência Pedagógica na UCSAL: " +
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
                                "• Profa.Me. Anna Paola Misi (UCSAL)",
                        "MR"),
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
                                "Moderação: Francisco Couto (UCSAL)",
                        "MR"),
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
                                "Moderação: Camilla Mota (OAB-LF)",
                        "MR"),
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
                                "• Prof. Dr. Raúl Márquez Porras (Universidad de Barcelona)",
                        "MR"),
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
                                "• Jocimar Sol de Macedo (UCSAL)",
                        "MR"),
                new Evento("19/10",
                        "9h30 às 12h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Inclusão educacional das pessoas com deficiência" +
                                " e boas práticas",
                        "Coordenação: Profa. Me. Lea Maria Medeiros (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Silvia Bezerra Pereira (UCSAL)\n" +
                                "• Marcos Filipe de Carvalho (UNEB)\n" +
                                "• Prof. Me. Carlos Coutinho (UCSAL)",
                        "MR"),
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
                                "• Me. Cesar Oliveira Carneiro (UCSAL)",
                        "MR"),
                new Evento("19/10",
                        "14h00 às 16h30",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: A pessoa com deficiência no ensino superior: " +
                                "desafios e conquistas",
                        "Coordenação: Profa. Dra. Sumaia Midlej Pimentel Sá (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Dra. Juliana Viana Freitas (UNEB e " +
                                "Faculdade Santa Casa)\n" +
                                "• Profa. Dra. Claudia Paranhos de Jesus Portela (UNEB)\n" +
                                "• Jornalista Marcelo Cavalcanti Moita (SECOM/PMS)",
                        "MR"),
                new Evento("19/10",
                        "18h30 às 21h00",
                        "Auditório da Pós",
                        "Mesa-redonda: A questão racial na educação e a luta por direitos",
                        "Coordenação: Profa. Me. Germana Pinheiro (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Rudolf Specht (UCSAL)\n" +
                                "• Me. Jonata William (UFBA)\n" +
                                "• Me. Dandara Pinho (UFF)\n\n +" +
                                "• Moderação: Liz Felix (UCSAL)",
                        "MR"),
                new Evento("19/10",
                        "18h30 às 21h00",
                        "Auditório da Pós",
                        "Mesa-redonda: : A figura do poliedro em tempos de crise: o " +
                                "processo de inclusão e diálogo fraterno",
                        "Coordenação: Prof. Dr. Pe Jairo de Jesus Menezes (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Dra. Iracema Vasconcelos (UCSAL)\n\n" +
                                "• Giovane Souza Cruz (UCSAL)\n" +
                                "• Esp. Sergio Esteban González Martínez (UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "9h30 às 12h00",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Mesa-redonda: As cidades digitais, o Governo eletrônico e a " +
                                "participação popular",
                        "Coordenação: Prof. Dra. Silvana Sá de Carvalho (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Dra. Mariana Lameira de Souza (UMINHO)\n" +
                                "• Prof. Dr. Arnaldo Bispo de Jesus (UCSAL)\n" +
                                "• Me. Ricardo Marques Carrera (UCSAL)\n" +
                                "• Prof. Me. Rubens Mario Ribeiro Pacheco (Moderniza " +
                                "Consultoria Empresarial/UNEB)",
                        "MR"),
                new Evento("20/10",
                        "9h30 às 12h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: Bioética e Relação Médico-Paciente",
                        "Coordenação: Profa. Dra. Ana Thereza Meirelles (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Júlia Sousa (UCSAL)\n" +
                                "• Adriana Zollinguer (UCSAL)\n" +
                                "• Jacira Dantas (UCSAL)\n" +
                                "• Henrique Princhak (UCSAL)\n" +
                                "• Bruno Gil (UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Envelhecimento e Educação Inclusiva: o idoso como " +
                                "sujeito de direitos",
                        "Coordenação: Profa. Dra. Wanderlene Cardozo Ferreira " +
                                "Reis (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Profa. Dra. Ariadne de Araujo Cruz (UCSAL)\n" +
                                "• Prof. Dr. Elmar Silva de Abreu (UCSAL)\n" +
                                "• Profa. Dra. Teresa Cristina Merly Leal (UNIDOMPEDRO/UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "14h30 às 16h30",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Mesa-redonda: Racismo Ambiental, Refugiados Ambientais, Políticas " +
                                "Públicas e Inclusão Social",
                        "Coordenação: Profa. Dra. Julie Sarah Lourau Alves da " +
                                "Silva (UCSAL)" +
                                "Participantes:\n" +
                                "• Prof. Dr. Maitu Abibo Buanango (Faculdade de Ciências de " +
                                "Saúde da Universidade de Zambeze, Moçambique)\n" +
                                "• Prof. Dr. Farã Cafacaiã Vaz (UFRS)\n" +
                                "• Prof. Dr. Bas’Ilele Malomalo (UNILAB/UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "18h30 às 21h00",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Mesa-redonda: Paradigmas, Constituição e Educação para e pelos " +
                                "Direitos Humanos",
                        "Coordenação: Prof. Dr. Deivid Carvalho Lorenzo (UCSAL)" +
                                "Participantes:\n" +
                                "• Maria Tereza de Jesus Damasceno Rodrigues (UCSAL)\n" +
                                "• Maria Carolina Dannemann Sampaio (UCSAL)\n" +
                                "• Rodrigo Bastos de Araujo (UCSAL)\n" +
                                "• Matheus Martins de Oliveira (UCSAL)\n\n" +
                                "Moderação: Licia Ferreira Reis (UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "18h30 às 21h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Constituição, Política e Instituições Judiciais",
                        "Coordenação: Prof. Dr. Alexandre Douglas Zaidan (UCSAL)" +
                                "Participantes:\n" +
                                "• Gabriel Antonio Pereira Santos (UCSAL)\n" +
                                "• Florisvaldo Pasquinha (UCSAL)\n" +
                                "• Marcus Vinicius Lopes (UCSAL)\n" +
                                "• Gabriel Muniz Carletto (UCSAL)\n" +
                                "• Érica Silva Teixeira (UNIFACS)\n" +
                                "• Thaís Fazzio (ALBA)",
                        "MR"),
                new Evento("20/10",
                        "18h30 às 21h00",
                        "Auditório da Pós",
                        "Mesa-redonda: A educação inclusiva como meio de ressocialização" +
                                " no sistema carcerário",
                        "Coordenação:  Profa. Dra. Fernanda Ravazzano (UCSAL)" +
                                "Participantes:\n" +
                                "• Prof. Dr. Marcos Melo (UCSAL)\n" +
                                "• Carlos Clovis Gomes Neto (UCSAL)\n" +
                                "• Yuri Fonseca Lopes (Pol. Penal)\n" +
                                "• Maj. Hêndrio Inandy José de Souza (PMBA)\n\n" +
                                "Moderador: Marcos Paulo Paranhos dos Santos (UCSAL)",
                        "MR"),
                new Evento("20/10",
                        "18h30 às 21h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Educação, inclusão e serviço social, interfaces " +
                                "da segregação",
                        "Coordenação: Profa. Dra. Maria Gorete Borges " +
                                "Figueirêdo (UCSAL)\n)" +
                                "Participantes:\n" +
                                "• Elizete Evelyn Bonifácio (UCSAL)\n" +
                                "• Me. Cássia Marly Moreira Barros (UCSAL)\n" +
                                "• Prof. Dr. Clodoaldo da Anunciação (UESC)\n" +
                                "• Marcos Marcelo Ferreira Barreto (UCSAL)\n\n" +
                                "Moderação: Me. Nadjane Crisóstomo Prado (UCSAL)",
                        "MR"),
                new Evento("21/10",
                        "9h30 às 12h00",
                        "Auditório\nTérreo\nBloco A",
                        "Mesa-redonda: Pós-Humanismo como Novo Paradigma Jurídico para o " +
                                "Estudo da Terra",
                        "Coordenação:\n" +
                                "• Prof. Dr. Tagore Trajano (UCSAL)\n" +
                                "• Prof. Dr. Heron Gordilho (UCSAL)\n\n" +
                                "Participantes:\n" +
                                "• Baónandje António Silva Biaguê (UCSAL)\n" +
                                "• Gislane Junqueira Brandão (UCSAL)\n" +
                                "• Jaime Augusto Freire de Carvalho Marques (UCSAL)\n" +
                                "• Jamily Duarte da Silva (UCSAL)\n" +
                                "• Yenifer Marcela Muñoz Cerón (UCSAL)",
                        "MR"),
                new Evento("21/10",
                        "9h30 às 12h00",
                        "Auditório da Pós",
                        "Mesa-redonda: Políticas Públicas e Promoção das Capacidades",
                        "Coordenação: Profa. Dra. Thais Novaes Cavalcanti (UCSAL)" +
                                "Participantes:\n" +
                                "• Neuvanete Duarte (UCSAL)\n" +
                                "• Telmo Lima (UCSAL)\n" +
                                "• Maria Abygail Aguiar (UCSAL)",
                        "MR"),
                new Evento("21/10",
                        "9h30 às 12h00",
                        "Sala 201\nBloco B",
                        "Mesa-redonda: Arbitragem Empresarial e Acesso à Justiça",
                        "Coordenação: Prof. Dr. João Glicério de O. Filho (UCSAL)" +
                                "Participantes:\n" +
                                "• Lizandra Colossi (UCSAL)\n" +
                                "• Wanderley Sampaio (UCSAL)\n" +
                                "• Solange Chaves (UCSAL)\n" +
                                "• Ana Terra Borges (UCSAL)\n" +
                                "• Gabriela Expósito (UFBA)\n" +
                                "• Pedro Vitor Rebouças (UFBA)",
                        "MR"),
                new Evento("21/10",
                        "9h30 às 12h00",
                        "Online\nYouTube\nUCSAL Oficial",
                        "Encerramento das Mesas-redondas: Inclusão social: o reverso da " +
                                "exclusão social?",
                        "Coordenação: Profa. Dra. Liana Silvia de Viveiros e Oliveira" +
                                "Participantes:\n" +
                                "• Dra. Alessia Bertuleza Tuxá (Povo Tuxá/Defensoria Pública " +
                                "do Estado da Bahia)\n" +
                                "• Ana Cristina da Silva Caminha (Articulação Centro Antigo " +
                                "de Salvador/Associação e Amigos de Gegê dos Moradores " +
                                "da Gamboa de Baixo)\n" +
                                "• Me. Rodrigo dos Santos Costa (UCSAL)\n" +
                                "• Joilson Santos Santana (UCSAL)",
                        "MR")
        );
    }
}
