import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pagamento pag = new Pagamento();
        Garcom gar = new Garcom();
        Cozinha coz = new Cozinha();
        Cardapio card = new Cardapio();
        Cliente cli = new Cliente();
        int lerQham, lerQbeb, lerQacom, lerQsob, lerQradicpri, lerQradicMaispri, lerQradicMaisseg, lerQradicMaister, lerQladicpri, lerQladicseg, lerQladicter, lerQladicqua, lerAdicHam, lerAdicSorv, lerAdicBat, lerAdicBeb, lerBeb, lerAcom, lerSob, lerHam, lerAcard;

        do {
            System.out.println("=== RESTAURANTE ===");
            System.out.println("Abra o cardápio\n" +
                    "1- Abrir cardápio.");
            lerAcard = scan.nextInt();

            if (lerAcard == 1) {
                card.abrirCardapio();
                card.mostrarCardapio();
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 para abrir o cardápio");
            }
        } while(lerAcard != 1);

        do {
            System.out.println("Gostaria de hambúguer?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            lerQham = scan.nextInt();

            if (lerQham == 1) {
                do {
                System.out.println("Qual Hamburguer deseja?");
                lerHam = 0;
                lerHam = scan.nextInt();
                card.escolherHamburguer(lerHam);
                }while (lerHam != 1 && lerHam != 2 && lerHam != 3 && lerHam != 4 && lerHam != 5);
            } else if (lerQham == 2){
                System.out.println("Sem Hambúrguer\n");
            } else {
                System.out.println("escolha nao valida");
            }
        } while(lerQham != 1 && lerQham != 2);

        do {
            System.out.println("Gostaria de Bebida?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            lerQbeb = scan.nextInt();
            if (lerQbeb == 1) {
                do {
                    System.out.println("Qual deseja?");
                    lerBeb = 0;
                    lerBeb = scan.nextInt();
                    card.escolherBebida(lerBeb);
                }while (lerBeb != 1 && lerBeb != 2 && lerBeb != 3 && lerBeb != 4 && lerBeb != 5) ;
            } else if (lerQbeb == 2) {
                    System.out.println("Sem Bebida\n");
            } else {
                    System.out.println("Opção Inválida.\n" +
                            "Aperte 1 ou 2");
                }
        } while(lerQbeb != 1 && lerQbeb != 2);
        do {
            System.out.println("Gostaria de Sobremesa?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            lerQsob = scan.nextInt();

            if (lerQsob == 1) {
                do {
                    System.out.println("Qual deseja?");
                    lerSob = 0;
                    lerSob = scan.nextInt();
                    card.escolherSobremesa(lerSob);
                }while (lerSob != 1 && lerSob != 2 && lerSob != 3 && lerSob != 4);
            } else if(lerQsob == 2){
                System.out.println("Sem Sobremesa\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(lerQsob != 1 && lerQsob != 2);

        do {
            System.out.println("Gostaria de Acompanhamento?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            lerQacom = scan.nextInt();

            if (lerQacom == 1) {
                do{
                System.out.println("Qual deseja?");
                lerAcom = 0;
                lerAcom = scan.nextInt();
                card.escolherAcompanhamento(lerAcom);
                }while (lerAcom != 1 && lerAcom != 2 && lerAcom != 3);
            } else if(lerQacom == 2){
                System.out.println("Sem Acompanhamento\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(lerQacom != 1 && lerQacom != 2);

        do {
            System.out.println("Gostaria de ver os adicionais?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            lerQradicpri = 0;
            lerQradicpri = scan.nextInt();

            if (lerQradicpri == 1) {
                card.mostrarAdicionais();
                System.out.println("Deseja qual dicional?\n" +
                        "1- Adicional de Hamburguer\n" +
                        "2- Adicional de Batata\n" +
                        "3- Adicional de Sorvete\n" +
                        "4- Adicional de Bebida\n" +
                        "5- Nenhum adicional");
                lerQladicpri = 0;
                lerQladicpri = scan.nextInt();

                do {
                    switch (lerQladicpri) {
                        case 1:
                            lerAdicHam = 0;
                            System.out.println("Qual deseja?");
                            lerAdicHam = scan.nextInt();
                            card.escolherAdicionalHamb(lerAdicHam);
                            do {
                                System.out.println("Gostaria de mais algum adidonal?");
                                System.out.println("1- Sim");
                                System.out.println("2- Não");
                                lerQradicMaispri = 0;
                                lerQradicMaispri = scan.nextInt();

                                if (lerQradicMaispri == 1) {
                                    System.out.println("Deseja qual adicional?\n" +
                                            "1- Adicional de Batata\n" +
                                            "2- Adicional de Sorvete\n" +
                                            "3- Adicional de Bebida\n" +
                                            "4- Nenhum Adicional\n");
                                    lerQladicseg = 0;
                                    lerQladicseg = scan.nextInt();

                                    do {
                                        switch (lerQladicseg) {
                                            case 1:
                                                lerAdicBat = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBat = scan.nextInt();
                                                card.escolherAdicionalBat(lerAdicBat);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Sorvete\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 2:
                                                lerAdicSorv = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicSorv = scan.nextInt();
                                                card.escolherAdicionalSorv(lerAdicSorv);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 3:
                                                lerAdicBeb = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBeb = scan.nextInt();
                                                card.escolherAdicionalBeb(lerAdicBeb);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Sorvete\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 4:
                                                System.out.println("Sem adicional");
                                            default:
                                                System.out.println("Escolha uma opção válida");
                                                lerQladicseg = scan.nextInt();
                                        }
                                    } while (lerQladicseg != 1 && lerQladicseg != 2 && lerQladicseg != 3 && lerQladicseg != 4);
                                } else if(lerQradicMaispri == 2){
                                    System.out.println("Sem Adicional\n");
                                } else {
                                    System.out.println("Opção Inválida.\n" +
                                            "Aperte 1 ou 2");
                                }
                            } while(lerQradicMaispri != 1 && lerQradicMaispri != 2);
                        case 2:
                            lerAdicBat = 0;
                            System.out.println("Qual deseja?");
                            lerAdicBat = scan.nextInt();
                            card.escolherAdicionalBat(lerAdicBat);
                            do {
                                System.out.println("Gostaria de mais algum adidonal?");
                                System.out.println("1- Sim");
                                System.out.println("2- Não");
                                lerQradicMaispri = 0;
                                lerQradicMaispri = scan.nextInt();

                                if (lerQradicMaispri == 1) {
                                    System.out.println("Deseja qual adicional?\n" +
                                            "1- Adicional de Hamburguer\n" +
                                            "2- Adicional de Sorvete\n" +
                                            "3- Adicional de Bebida\n" +
                                            "4- Nenhum Adicional\n");
                                    lerQladicseg = 0;
                                    lerQladicseg = scan.nextInt();

                                    do {
                                        switch (lerQladicseg) {
                                            case 1:
                                                lerAdicHam = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicHam = scan.nextInt();
                                                card.escolherAdicionalHamb(lerAdicHam);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Sorvete\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 2:
                                                lerAdicSorv = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicSorv = scan.nextInt();
                                                card.escolherAdicionalSorv(lerAdicSorv);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Hamburguer\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 3:
                                                lerAdicBeb = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBeb = scan.nextInt();
                                                card.escolherAdicionalBeb(lerAdicBeb);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Hamburguer\n" +
                                                                "2- Adicional de Sorvete\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 4:
                                                System.out.println("Sem adicional");
                                            default:
                                                System.out.println("Escolha uma opção válida");
                                                lerQladicseg = scan.nextInt();
                                        }
                                    } while (lerQladicseg != 1 && lerQladicseg != 2 && lerQladicseg != 3 && lerQladicseg != 4);
                                } else if(lerQradicMaispri == 2){
                                    System.out.println("Sem Adicional\n");
                                } else {
                                    System.out.println("Opção Inválida.\n" +
                                            "Aperte 1 ou 2");
                                }
                            } while(lerQradicMaispri != 1 && lerQradicMaispri != 2);
                        case 3:
                            lerAdicSorv = 0;
                            System.out.println("Qual deseja?");
                            lerAdicSorv = scan.nextInt();
                            card.escolherAdicionalSorv(lerAdicSorv);
                            do {
                                System.out.println("Gostaria de mais algum adidonal?");
                                System.out.println("1- Sim");
                                System.out.println("2- Não");
                                lerQradicMaispri = 0;
                                lerQradicMaispri = scan.nextInt();

                                if (lerQradicMaispri == 1) {
                                    System.out.println("Deseja qual adicional?\n" +
                                            "1- Adicional de Batata\n" +
                                            "2- Adicional de Hamburguer\n" +
                                            "3- Adicional de Bebida\n" +
                                            "4- Nenhum Adicional\n");
                                    lerQladicseg = 0;
                                    lerQladicseg = scan.nextInt();

                                    do {
                                        switch (lerQladicseg) {
                                            case 1:
                                                lerAdicBat = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBat = scan.nextInt();
                                                card.escolherAdicionalBat(lerAdicBat);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Hamburguer\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 2:
                                                lerAdicHam = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicHam = scan.nextInt();
                                                card.escolherAdicionalHamb(lerAdicHam);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Bebida\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Bebida\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBeb = 0;
                                                                                    lerAdicBeb = scan.nextInt();
                                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBeb = 0;
                                                                    lerAdicBeb = scan.nextInt();
                                                                    card.escolherAdicionalBeb(lerAdicBeb);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 3:
                                                lerAdicBeb = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBeb = scan.nextInt();
                                                card.escolherAdicionalBeb(lerAdicBeb);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Hamburguer\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 4:
                                                System.out.println("Sem adicional");
                                            default:
                                                System.out.println("Escolha uma opção válida");
                                                lerQladicseg = scan.nextInt();
                                        }
                                    } while (lerQladicseg != 1 && lerQladicseg != 2 && lerQladicseg != 3 && lerQladicseg != 4);
                                } else if(lerQradicMaispri == 2){
                                    System.out.println("Sem Adicional\n");
                                } else {
                                    System.out.println("Opção Inválida.\n" +
                                            "Aperte 1 ou 2");
                                }
                            } while(lerQradicMaispri != 1 && lerQradicMaispri != 2);

                        case 4:
                            lerAdicBeb = 0;
                            System.out.println("Qual deseja?");
                            lerAdicBeb = scan.nextInt();
                            card.escolherAdicionalBeb(lerAdicBeb);
                            do {
                                System.out.println("Gostaria de mais algum adidonal?");
                                System.out.println("1- Sim");
                                System.out.println("2- Não");
                                lerQradicMaispri = 0;
                                lerQradicMaispri = scan.nextInt();

                                if (lerQradicMaispri == 1) {
                                    System.out.println("Deseja qual adicional?\n" +
                                            "1- Adicional de Batata\n" +
                                            "2- Adicional de Sorvete\n" +
                                            "3- Adicional de Hamburguer\n" +
                                            "4- Nenhum Adicional\n");
                                    lerQladicseg = 0;
                                    lerQladicseg = scan.nextInt();

                                    do {
                                        switch (lerQladicseg) {
                                            case 1:
                                                lerAdicBat = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicBat = scan.nextInt();
                                                card.escolherAdicionalBat(lerAdicBat);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Sorvete\n" +
                                                                "2- Adicional de Hamburguer\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 2:
                                                lerAdicSorv = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicSorv = scan.nextInt();
                                                card.escolherAdicionalSorv(lerAdicSorv);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Hamburguer\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Hamburguer\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicHam = 0;
                                                                                    lerAdicHam = scan.nextInt();
                                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicHam = 0;
                                                                    lerAdicHam = scan.nextInt();
                                                                    card.escolherAdicionalHamb(lerAdicHam);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 3:
                                                lerAdicHam = 0;
                                                System.out.println("Qual deseja?");
                                                lerAdicHam = scan.nextInt();
                                                card.escolherAdicionalHamb(lerAdicHam);
                                                do {
                                                    System.out.println("Gostaria de mais algum adidonal?");
                                                    System.out.println("1- Sim");
                                                    System.out.println("2- Não");
                                                    lerQradicMaisseg = 0;
                                                    lerQradicMaisseg = scan.nextInt();

                                                    if (lerQradicMaisseg == 1) {
                                                        System.out.println("Deseja qual adicional?\n" +
                                                                "1- Adicional de Batata\n" +
                                                                "2- Adicional de Sorvete\n" +
                                                                "3- Nenhum adicional\n");
                                                        lerQladicter = 0;
                                                        lerQladicter = scan.nextInt();
                                                        do{
                                                            switch (lerQladicter){
                                                                case 1:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicBat = 0;
                                                                    lerAdicBat = scan.nextInt();
                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Sorvete\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicSorv = 0;
                                                                                    lerAdicSorv = scan.nextInt();
                                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 2:
                                                                    System.out.println("Qual deseja?");
                                                                    lerAdicSorv = 0;
                                                                    lerAdicSorv = scan.nextInt();
                                                                    card.escolherAdicionalSorv(lerAdicSorv);
                                                                    do{
                                                                        System.out.println("Gostaria de mais algum adidonal?");
                                                                        System.out.println("1- Sim");
                                                                        System.out.println("2- Não");
                                                                        lerQradicMaister = 0;
                                                                        lerQradicMaister = scan.nextInt();

                                                                        if (lerQradicMaister == 1) {
                                                                            System.out.println("Deseja qual adicional?\n" +
                                                                                    "1- Adicional de Batata\n" +
                                                                                    "2- Nenhum adicional\n");
                                                                            lerQladicqua = 0;
                                                                            lerQladicqua = scan.nextInt();
                                                                            switch (lerQladicqua){
                                                                                case 1:
                                                                                    System.out.println("Qual deseja?");
                                                                                    lerAdicBat = 0;
                                                                                    lerAdicBat = scan.nextInt();
                                                                                    card.escolherAdicionalBat(lerAdicBat);
                                                                                case 2:
                                                                                    System.out.println("Sem adicional");
                                                                                default:
                                                                                    System.out.println("Escolha uma opção válida");
                                                                                    lerQladicqua = scan.nextInt();
                                                                            }
                                                                        } else if (lerQradicMaister == 2){
                                                                            System.out.println("Sem adicional");
                                                                        } else {
                                                                            System.out.println("Escolha uma opção válida");
                                                                            lerQradicMaister = scan.nextInt();
                                                                        }
                                                                    } while(lerQradicMaister != 1 && lerQradicMaister != 2);
                                                                case 3:
                                                                    System.out.println("Sem adicional");
                                                                default:
                                                                    System.out.println("Escolha uma opção válida");
                                                                    lerQladicter = scan.nextInt();
                                                            }
                                                        } while(lerQladicter != 1 && lerQladicter != 2 && lerQladicter != 3);
                                                    } else if(lerQradicMaisseg == 2){
                                                        System.out.println("Sem Adicional\n");
                                                    } else {
                                                        System.out.println("Opção Inválida.\n" +
                                                                "Aperte 1 ou 2");
                                                    }
                                                } while(lerQradicMaisseg != 1 && lerQradicMaisseg != 2);
                                            case 4:
                                                System.out.println("Sem adicional");
                                            default:
                                                System.out.println("Escolha uma opção válida");
                                                lerQladicseg = scan.nextInt();
                                        }
                                    } while (lerQladicseg != 1 && lerQladicseg != 2 && lerQladicseg != 3 && lerQladicseg != 4);
                                } else if(lerQradicMaispri == 2){
                                    System.out.println("Sem Adicional\n");
                                } else {
                                    System.out.println("Opção Inválida.\n" +
                                            "Aperte 1 ou 2");
                                }
                            } while(lerQradicMaispri != 1 && lerQradicMaispri != 2);
                        case 5:
                            System.out.println("Sem adicional");
                        default:
                            System.out.println("Escolha uma opção válida.");
                            lerQladicpri = scan.nextInt();
                    }
                } while (lerQladicpri != 1 && lerQladicpri != 2 && lerQladicpri != 3 && lerQladicpri != 4 && lerQladicpri != 5);
            } else if(lerQradicpri == 2){
                System.out.println("Sem Adicional\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(lerQradicpri != 1 && lerQradicpri != 2);

        System.out.println("Pedido feito\n");
        gar.mostrarPedido();

    }
}