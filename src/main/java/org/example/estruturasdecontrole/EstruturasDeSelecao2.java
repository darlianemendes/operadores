package org.example.estruturasdecontrole;

public class EstruturasDeSelecao2 {

    public static void main(String[] args) {

        //Um único valor, baseado em multiplas condições
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }

        //Qual estação estamos
        String mes = "Janeiro";
        switch (mes) {
            case "Janeiro":
            case "Fevereiro":
            case "Março":
                System.out.println("Verão");
                break;
            case "Abril":
            case "Maio":
            case "Junho":
                System.out.println("Outono");
                break;
            case "Julho":
            case "Agosto":
            case "Setembro":
                System.out.println("Inverno");
                break;
            case "Outubro":
            case "Novembro":
            case "Dezembro":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }

        //Informando o número de dias em um mês específico.
        String mesInformado = "Fevereiro";
        int dias;
        switch (mesInformado) {
            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                dias = 31;
                break;
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                dias = 30;
                break;
            case "Fevereiro":
                dias = 28; // Considerando anos não bissextos
                break;
            default:
                dias = 0;
                break;
        }
        System.out.println("Número de dias em " + mes + ": " + dias);
    }
}
