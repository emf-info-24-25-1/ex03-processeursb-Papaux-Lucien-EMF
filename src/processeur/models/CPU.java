package processeur.models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CPU {

    /**
     * Cette constante (-1.0) représente une performance MIPS (Millions Instructions
     * Per Second) inconnue.
     */
    public static final double UNKNOWN_MIPS = -1.0;
    /**
     * Attribut qui représente le nom du CPU.
     */
    private String nom;

    /**
     * Attribut qui représente l'année de sortie du CPU.
     */
    private int annee;

    /**
     * Attribut qui représente le nombre de transistors utilisés dans le CPU.
     */
    private long transistors;

    /**
     * Attribut qui représente la performance en MIPS (Millions Instructions Per
     * Second) du CPU.
     */
    private double mips;

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on connaît la valeur de
     * chaque attribut.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     * @param mips        la performance en MIPS (Millions Instructions Per Second)
     *                    du CPU
     */
    public CPU(String nom, int annee, long transistors, double mips) {
        this.nom = nom;
        this.annee = annee;
        this.transistors = transistors;
        this.mips = mips;
    }

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on ne connaît pas la
     * performance du CPU. Dans ce cas, l'attribut
     * "mips" sera initialisé avec la valeur UNKNOWN_MIPS pour indiquer que cette
     * information n'est pas connue.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     */
    public CPU(String nom, int annee, long transistors) {
        this.nom = nom;
        this.transistors = transistors;
    }

    /**
     * Getter de l'attribut nom.
     *
     * @return la valeur de l'attribut nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de l'attribut annee.
     *
     * @return la valeur de l'attribut annee
     */

    public int getAnnee() {
        return annee;
    }

    /**
     * Getter de l'attribut transistors.
     *
     * @return la valeur de l'attribut transistors
     */
    public long getTransistors() {
        return transistors;
    }

    /**
     * Getter de l'attribut mips.
     *
     * @return la valeur de l'attribut mips
     */
    public double getMips() {
        return mips;
    }

    public String toString() {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.FRANCE);
        symbols.setGroupingSeparator('\'');

        DecimalFormat df = new DecimalFormat(
                "#,###", symbols);
        
        String voila = "";

        if (this.getMips() == this.UNKNOWN_MIPS) {
            voila += ("En " + this.getAnnee() + " le CPU " + this.getNom() + " avec " + df.format(this.getTransistors()) +
                    " transistors et une puissance de calcul inconnue.");
        } else {
            voila += ("En " + this.getAnnee() + " le CPU " + this.getNom() + " avec " + df.format(this.getTransistors()) +
                    " transistors et une puissance de calcul de " + this.getMips() + " mips.");
        }

        return voila;
    }
   

}
