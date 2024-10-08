package X;

import com.facebook.msys.mci.JQLResultSet;
import java.util.Map;

public final class OHE {
    public Map A00;
    public double[] A01;
    public int[] A02;
    public long[] A03;
    public Object[] A04;
    public boolean[] A05;
    public boolean[] A06;

    public static Object A00(JQLResultSet jQLResultSet, int i, int i2) {
        return jQLResultSet.A01.A04[(i * jQLResultSet.A07) + jQLResultSet.A09[i2]];
    }
}
