package com.example;

/**
 * Classe que representa um jogador de futebol com atributos: número, posição,habilidade(GER) e time
 *
 * @author josuelsantosDEV
 */
public class FootballPlayer {
    private int number = 1;
    private String position;
    private int ger = 1;
    private String team;

    /**
     * Construtor que inicializa o jogador com o time e a posição
     *
     * @param team    o time ao qual o jogador pertence
     * @param position a posição do jogador em campo
     */
    public FootballPlayer(String team, String position) {
        this.team = team;
        this.position = position;
    }

    /**
     * Incrementa ou decrementa o nivel de habilidade do player
     *
     * @param newGer o novo valor para o índice de habilidade
     *
     * @deprecated
     * @see public void changeGer(int newGer)
     */
    public void increaseAndDecrementGer(int newGer) {
        this.ger = newGer;
    }

    /**
     * Incrementa ou decrementa o numero do player
     *
     * @param newNumber o novo numero do player
     *
     * @deprecated
     * @see public void changeNumber(int newGer)
     */
    public void increaseAndDecrementNumber(int newNumber) {
        this.number = newNumber;
    }

    /**
     * Altera habilidade GER) do jogador
     *
     * @param newGer o novo valor para o índice de habilidade
     */
    public void changeGer(int newGer) {
        this.setGer(newGer);
    }

    /**
     * Altera o número do jogador.
     *
     * @param newNumber o novo número do jogador
     */
    public void changeNumber(int newNumber) {
        this.setNumber(newNumber);
    }

    /**
     * Altera o time do jogador
     *
     * @param newTeam novo time do jogador
     */
    public void changeTeam(String newTeam) {
        this.team = newTeam;
    }

    /**
     * @return o número do jogador
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number o número do jogador
     */
    public void setNumber(int number) {
        if (number < 1 || number > 99) return;
        this.number = number;
    }

    /**
     * @return a posição do jogador
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position a posição do jogador
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return o índice de habilidade do jogador
     */
    public int getGer() {
        return ger;
    }

    /**
     * @param ger a novo indice habilidade do jogador
     */
    public void setGer(int ger) {
        if (ger < 0 || ger > 120) return;
        this.ger = ger;
    }

    /**
     * @return time do jogador
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team o time do jogador
     */
    public void setTeam(String team) {
        this.team = team;
    }
}
