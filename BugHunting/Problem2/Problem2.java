/**
 * Base bugged
 */
@override
public double[] computeMean(){
        // Not supported except for singletons.
        return points.size() == 1 ? points.get(1) : null;
        }

