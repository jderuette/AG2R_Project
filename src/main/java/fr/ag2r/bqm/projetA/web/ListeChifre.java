package fr.ag2r.bqm.projetA.web;

import java.util.ArrayList;
import java.util.List;

//TODO by Djer : Je ne comprend pas l'intéret de cette classe ... Peut-être que je comprendrais mieu quand les algo de "répartitions" seront codés.....
public class ListeChifre {

    public List<Integer> listChiffre;

    public ListeChifre() {
        listChiffre = new ArrayList<Integer>();
    }

    /**
     * @return the listChiffre
     */
    public List<Integer> getListChiffre() {
        return listChiffre;
    }

    /**
     * @param listChiffre the listChiffre to set
     */
    public void setListChiffre(List<Integer> listChiffre) {
        this.listChiffre = listChiffre;
    }

}
