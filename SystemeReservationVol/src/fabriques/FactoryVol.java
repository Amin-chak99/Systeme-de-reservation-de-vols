package fabriques;

import vols.Vol;
import vols.VolInternational;
import vols.VolNational;

public class FactoryVol {

    public Vol getVols(String typeVols) {
        if (typeVols == null) {
            return null;
        }
        if (typeVols.equalsIgnoreCase("NATIONAUX")) {
            return new VolNational();
        } else if (typeVols.equalsIgnoreCase("INTERNATIONAUX")) {
            return new VolInternational();
        }
        return null;
    }
}
