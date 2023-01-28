package client;

import fabriques.FactoryVol;
import vols.Vol;

public class Test {

	public static void main(String[] args) {
        FactoryVol factoryVols = new FactoryVol();

        Vol volNational = factoryVols.getVols("NATIONAUX");
        volNational.afficherInformation();

        Vol volInternational = factoryVols.getVols("INTERNATIONAUX");
        volInternational.afficherInformation();
    }
}
