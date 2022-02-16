import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int tam=20;
        char[] gabarito=new char[tam];
        String[] perguntas=new String[20];
        String[] descricao=new String[4];
        char[] rei={'d','a','b','d','c','b','a','c','d','a','b','c','c','d','b','c','a','b','d','a'};
        char[] guerreiro={'a','c','a','c','b','d','b','d','a','b','c','d','d','a','c','b','d','a','c','b'};
        char[] mago={'c','b','c','a','d','a','d','b','b','c','a','b','a','c','d','d','b','c','a','d'};
        char[] amante={'b','d','d','b','a','c','c','a','c','d','d','a','b','b','a','a','c','d','b','c'};
        int[] nota={0,0,0,0};
        int[] porcentagem={0,0,0,0};

        perguntas[0] = "1 - A situação com a qual mais me identifico é: " +
                "\na)Sou batalhador. Faço o que precisa ser feito. " +
                "\nb)Sou prestativo. Gosto de integrar as pessoas." +
                "\nc)Sou lógico. Sou muito exigente comigo mesmo e com os outros." +
                "\nd)Sou \"alto astral\". Gosto de dar idéias novas e criativas.";

        perguntas[1] = "2 - Conside que realizo minha missão pessoal quando: " +
                "\na)Pronponho idéias criativas que vão gerar resultados futuros." +
                "\nb)Estruturo regras e procedimentos que organizam as coisas." +
                "\nc)Atinjo as metas e objetivos no prazo definido." +
                "\nd)Consigo um ambiente harmonioso entre as pessoas.";

        perguntas[2] = "3 - Fico feliz quando: " +
                "\na)Obtenho resultados mais imediatos." +
                "\nb)Posso interagir com os outros." +
                "\nc)Posso ser exato em minhas análises." +
                "\nd)Consigo um ambiente harmonioso entre as pessoas.";

        perguntas[3] = "4 - Encontro grande satisfação quando: " +
                "\na)Tudo esta em ordem." +
                "\nb)O ambiente está calmo e sereno." +
                "\nc)Estou no comando das atividades." +
                "\nd)Consigo livrar-me dos detalhes.";

        perguntas[4] = "5 - Um aspecto de meu desempenho que gosto muito é quando: " +
                "\na)Posso criar um ambiente harmonioso e previsível." +
                "\nb)Faço as coisas com rapidez, sem medo de riscos e mudanças." +
                "\nc)Posso convencer as pessoas e ter um trabalho alegre." +
                "\nd)Realizo as tarefas com padrões precisos, lógicos e impessoais.";

        perguntas[5] = "6 - Os termores que tenho são principalmente devidos a: " +
                "\na)Estar errado e ter que improvisar." +
                "\nb)Perder a aprovação e o afeto dos outros." +
                "\nc)Enfrentar situações de confronto entre as pessoas." +
                "\nd)Parecer fraco e perder o controle da situação.";

        perguntas[6] = "7 - Acho que meu desempenho é ruim quando: " +
                "\na)Não dou atenção aos detalhes." +
                "\nb)Centralizo tudo e não abro espaço para os outros." +
                "\nc)Fico muito em \"Cima do muro\"." +
                "\nd)Sou muito rígido e inflexível";

        perguntas[7] = "8 - Considero que sou mais eficaz quando: " +
                "\na)Expresso o meu descontentamento." +
                "\nb)Sou mais flexível com as regras e regulamentos." +
                "\nc)Coloco em prática e termino as muitas idéias que tive." +
                "\nd)Sou mais paciente e tolerante com o ritmo dos outros.";

        perguntas[8] = "9 - Eu exagero (e isto é ruim) quando: " +
                "\na)Tenho pressa para tudo e atropelo os outros." +
                "\nb)Prendo-me muito a detalhes e sou exigente demais." +
                "\nc)Deixo sempre a vontade dos outros prevalecer." +
                "\nd)Faço brincadeiras o tempo todo.";

        perguntas[9] = "10 - Como características pessoais eu sou: " +
                "\na)Entusiasmado, estimulador, carismático, ambicioso." +
                "\nb)Decidido, prático, determinado, dedicado." +
                "\nc)Meticuloso, organizado, cuidadoso, persistente." +
                "\nd)Calmo, agradável, cordial, respeitador.";

        perguntas[10] = "11 - Os apelidos que melhor me identificam são: " +
                "\na)Chato, cri-cri, burocrata, coruja." +
                "\nb)Incendiário, sonhador, inventor, Prof. Pardal." +
                "\nc)Tocador, trator, lobo solitário, \"pau prá toda obra\"." +
                "\nd)Liso, sabonetão, vaselina, político.";

        perguntas[11] = "12 - Eu sofro quando: " +
                "\na)Falta mais harmonia entre nós, não temos espírito de equipe." +
                "\nb)Não estão fazendo do jeito certo, não leram as instruções." +
                "\nc)Ninguém me entende, estão tentando me sabotar." +
                "\nd)As coisas estão muito lentas por aqui, o dia não tem horas suficientes.";

        perguntas[12] = "13 - Os meus horários são: " +
                "\na)Exatos e precisos, conforme estabelecido." +
                "\nb)Flexíveis, se for para me ajustar aos outros." +
                "\nc)Caóticos, sem nenhuma previsão." +
                "\nd)Primeiro a chegar, último a sair.";

        perguntas[13] = "14 - Uma oração que me caracteriza muito bem é: " +
                "\na)Senhor, me dê paciência, mas tem que ser já!!!." +
                "\nb)Senhor, me faça pensar um pouco mais em mim mesmo, se isto não incomodar aos outros." +
                "\nc)Senhor, ajude-me a me importar menos com pequenos detalhes, a partir de amanhã às 13h 45min." +
                "\nd)Senhor, faça-me aberto às idéias dos outros, mesmo sendo tão erradas como são.";

        perguntas[14] = "15 - O provérbio que melhor me identifica é: " +
                "\na)A união faz a força." +
                "\nb)Quem não arrisca, não petisca." +
                "\nc)Manda quem pode, obedece quem tem juízo." +
                "\nd)Não se mexe em time que está ganhando.";

        perguntas[15] = "16 - O comportamento que melhor me identifica é: " +
                "\na)Sou cuidadoso: harmonizo, logo existo." +
                "\nb)Sou impulsivo: faço, logo existo." +
                "\nc)Sou tempestuoso: crio, logo existo." +
                "\nd)Sou persistente: organizo, logo existo";

        perguntas[16] = "17 - Dou preferência a atividades em que eu possa... " +
                "\na)Ter a visão geral do projeto. A idéia em si me interessa mais do que colocá-la em prática." +
                "\nb)Planejar em vez de fazer. Gosto de analisar as diversas alternativas." +
                "\nc)Buscar que todos concordem e sintam-se motivados a fazer. Isso é mais importante que a tarefa em si." +
                "\nd)Fazer em vez de planejar. Gosto dos desafios de fazer e não tanto de ficar planejando.";

        perguntas[17] = "18 - Meu local de trabalho está geralmente: " +
                "\na)Bastante bagunçado, muitas coisas fora do lugar. Gavetas meio desarrumadas. Gosto de expor fotos de pessoas importantes que estiveram comigo" +
                "\nb)Não muito organizado, mas procuro ter as últimas novidades sempre à vista. O ambiente é bastente agradável para receber as pessoas." +
                "\nc)Super arrumado e organizado. Só fica fora o material que estou usando naquele momento." +
                "\nd)Muito acolhedor. Tenho muitas fotos da família e de amigos, flores e plantas de local.";

        perguntas[18] = "19 - Minhas qualidades principais são: " +
                "\na)Ordem e disciplina. Perfeição em cada detalhe." +
                "\nb)Ser prestativo e tolerante. Harmonia acima de tudo." +
                "\nc)Rapidez para agir e coragem de \"meter as caras\"." +
                "\nd)Entusiasmar as pessoas e trazer idéias novas.";

        perguntas[19] = "20 - Nas minhas atividades uso mais: " +
                "\na)A intuição e a criatividade." +
                "\nb)Os dados objetivos e concretos." +
                "\nc)Os sentimentos e as emoções." +
                "\nd)O pensamentos e a lógica.";

        descricao[0] = "Eles têm a energia Yang, agem no mundo, são mais voltados aos resultados \n" +
                "de longo prazo. Os reis têm uma visão de tempo mais a longo prazo, \n" +
                "situando-se mais no futuro que no presente." +
                "\nOs reis são ótimos nos relacionamentos, tendendo a ser afáveis, simpáticos, brincalhões, \n" +
                "sendo a \"alegria da festa\". Adoram ser o foco das atenções e gostam de gente \n" +
                "ao seu lado, principalmente se estiverem aplaudindo." +
                "\nO rei usa muito seu lado intuitivo, pervebendo claramente o sistema como um todo: sabe de \n" +
                "onde as coisas vieram e para onde vão";

        descricao[1] = "Eles têm a energia Yang, agem no mundo, são mais voltados aos resultados de curto\n" +
                "prazo, são diretos e mais \"secos\" nos relacionamentos. Os guerreiros são ótimos\n" +
                "para realizar metas, são os \"tocadores\" da atividades. Dentro desta característica, \n" +
                "os querreiros têm a tendência ao estresse, sendo workaholics (viciados no trabalho).\n" +
                "Os guerreiros têm o foco nas coisas a serem feitas no presente, no \"aqui e agora\",\n" +
                "depreferência em curto prazo e em sequência. Os guerreiros estão ligados aos fatos \n" +
                "concretos, lembram deles com facilidade, sempre no presente. Diferentemente dos reis,\n" +
                "os guerreiros preocupam-se mais em assegurar a concretização de objetivos do que em\n" +
                "criar novos caminhos ou buscar novas alternativas. ";

        descricao[2] = "Eles têm a energia Yin, se ajustam ao mundo, são mais voltados a estruturação de curto\n" +
                "prazo, são diretos e secos nos relacionamentos. Os magos são ótimos para estruturar e\n" +
                "oirganizar coisas. São metódicos e tedem ao perfeccionismo.\n" +
                "Levam suas tarefas até o fim. tendem a se isolar, curtindo mais seus momentos de análise\n" +
                "que muitos contatos sociais ou festa. adoram estar certos e têm muito prazer em resolver\n" +
                "problemas difíceis e complexos. Usam muito seu lado racional e lógico, a função pensamento.\n" +
                "São detalhistas e adoram escrever e registrar. a busca continuada do perfeccionismo,\n" +
                "do que é certo e o que é errado leva-o a cobrar isto dos outros e de si mesmo, levando a\n" +
                "um alto grau de estresse.";

        descricao[3] = "Eles têm a energia Yin, se ajustam ao mundo, são mais voltados a estruturação de longo prazo,\n" +
                "são ótimos nos relacionamentos. Os amantes são ótimos para construir e manter equipes. São\n" +
                "pouco metódicos, mas dão um enorme foco na relações. Ouvem os outros e têm sempre um \"ombro \n" +
                "amigo à disposição de quem precisa. Sendo muito pacientes têm dificuldade em dar limites e\n" +
                "dizer \"não\" para os outros. São amáveis, calorosos e verdadeiros nos relacionamentos.";


        for(int i=0;i<tam;i++) {
            System.out.println(perguntas[i]);
            System.out.print("R: ");
            gabarito[i] = scan.nextLine().charAt(0);

            if (gabarito[i] == rei[i]) {
                nota[0]++;
            }
            if (gabarito[i] == guerreiro[i]) {
                nota[1]++;
            }
            if (gabarito[i] == mago[i]) {
                nota[2]++;
            }
            if (gabarito[i] == amante[i]) {
                nota[3]++;
            }
        }
        porcentagem[0] = nota[0] * 5;
        porcentagem[1] = nota[1] * 5;
        porcentagem[2] = nota[2] * 5;
        porcentagem[3] = nota[3] * 5;

        if((nota[0] > nota[1]) && (nota[0] > nota[2]) && (nota[0] > nota[3])){
            System.out.println("Você é rei: " + descricao[0]);
            System.out.println("\nTotal de pontos : \nRei :" + nota[0] + " \nGuerreiro: " + nota[1] + " \nMago: " + nota[2] + " \nAmante: " + nota[3]);
            System.out.println("\nPorcentagem : Rei :" + porcentagem[0]+ "%" + " \nGuerreiro: " + porcentagem[1] + "%" + " \nMago: " + porcentagem[2] + "%" + " \nAmante: " + porcentagem[3] + "%");
        }if((nota[1] > nota[0]) && (nota[1] > nota[2]) && (nota[1] > nota[3])) {
            System.out.println("Você é guerreiro: " + descricao[1]);
            System.out.println("\nTotal de pontos : \nRei :" + nota[0] + " \nGuerreiro: " + nota[1] + " \nMago: " + nota[2] + " \nAmante: " + nota[3]);
            System.out.println("\nPorcentagem : Rei :" + porcentagem[0] + "%" + " \nGuerreiro: " + porcentagem[1] + "%" + " \nMago: " + porcentagem[2] + "%" + " \nAmante: " + porcentagem[3] + "%");
        }if((nota[2] > nota[1]) && (nota[2] > nota[0]) && (nota[2] > nota[3])) {
            System.out.println("Você é mago: " + descricao[2]);
            System.out.println("\nTotal de pontos : \nRei :" + nota[0] + " \nGuerreiro: " + nota[1] + " \nMago: " + nota[2] + " \nAmante: " + nota[3]);
            System.out.println("\nPorcentagem : Rei :" + porcentagem[0] + "%" + " \nGuerreiro: " + porcentagem[1] + "%" + " \nMago: " + porcentagem[2] + "%" + " \nAmante: " + porcentagem[3] + "%");
        }else{
            System.out.println("Você é amante: " + descricao[3]);
            System.out.println("\nTotal de pontos : \nRei :" + nota[0] + " \nGuerreiro: " + nota[1] + " \nMago: " + nota[2] + " \nAmante: " + nota[3]);
            System.out.println("\nPorcentagem : Rei :" + porcentagem[0] + "%" + " \nGuerreiro: " + porcentagem[1] + "%" + " \nMago: " + porcentagem[2] + "%" + " \nAmante: " + porcentagem[3] + "%");
        }
    }
}
