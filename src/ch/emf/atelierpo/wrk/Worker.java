package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    private final int LONGUEUR_CANTON = 2;

    /**
     *
     * Vérifie si un numéro de plaque de voiture suisse est valide.
     *
     * @param canton le canton de la plaque (doit être écrit en 2 lettres de A-Z
     * en majuscule)
     * @param numeroDePlaque le numéro de la plaque (constitué uniquement de
     * nombres entiers)
     * @return true si le numéro de plaque est valide, false sinon
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {

        boolean controle = true;
        String lettreCanton = canton;

        if (lettreCanton.length() != LONGUEUR_CANTON) {

            controle = false;

        } else {

            if (!lettreCanton.equals(lettreCanton.toUpperCase())) {

                controle = false;
            }
        }

        try {
            Integer.valueOf(numeroDePlaque);
        } catch (NumberFormatException e) {
            controle = false;
        }

        return controle;

    }

}
