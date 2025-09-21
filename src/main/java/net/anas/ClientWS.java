package net.anas;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public  static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.convertionEuroToDH(800));

        Compte cp = proxy.getCompte(5) ;
        System.out.println( "code="+ cp.getCode());
        System.out.println( "solde="+ cp.getSolde());
        System.out.println( "date création="+ cp.getDateCreation());

        List<Compte> comptesList = proxy.getComptes();
        for (Compte c : comptesList) {
            System.out.println( "--------------");
            System.out.println( "code="+ c.getCode());
            System.out.println( "solde="+ cp.getSolde());
            System.out.println( "date création="+ cp.getDateCreation());
        }
    }
}
