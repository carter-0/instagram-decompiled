package X;

import java.util.TreeMap;

public final class SPE {
    public static final 16L[] A04;
    public long A00;
    public SPE A01;
    public TreeMap A02;
    public final Object[] A03 = new Object[16];

    static {
        16L[] r4 = new 16L[16];
        A04 = r4;
        16L[] values = 16L.values();
        System.arraycopy(values, 1, r4, 1, Math.min(15, values.length - 1));
    }

    private final void A00(int i, Object obj, Object obj2) {
        TreeMap treeMap = this.A02;
        if (treeMap == null) {
            treeMap = new TreeMap();
            this.A02 = treeMap;
        }
        if (obj != null) {
            Pxh.A1I(obj, treeMap, i + i + 1);
        }
        if (obj2 != null) {
            Pxh.A1I(obj2, this.A02, i + i);
        }
    }

    public final SPE A01(16L r6, int i) {
        if (i < 16) {
            long ordinal = (long) r6.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 |= ordinal;
            return null;
        }
        SPE spe = new SPE();
        this.A01 = spe;
        spe.A00 |= (long) r6.ordinal();
        return spe;
    }

    public final SPE A02(16L r6, Object obj, int i) {
        if (i < 16) {
            this.A03[i] = obj;
            long ordinal = (long) r6.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            return null;
        }
        SPE spe = new SPE();
        this.A01 = spe;
        spe.A03[0] = obj;
        spe.A00 = ((long) r6.ordinal()) | spe.A00;
        return spe;
    }

    public final SPE A03(16L r7, Object obj, Object obj2, int i) {
        if (i < 16) {
            long ordinal = (long) r7.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            A00(i, obj, obj2);
            return null;
        }
        SPE spe = new SPE();
        this.A01 = spe;
        spe.A00 = ((long) r7.ordinal()) | spe.A00;
        spe.A00(0, obj, obj2);
        return this.A01;
    }

    public final SPE A04(16L r7, Object obj, Object obj2, Object obj3, int i) {
        if (i < 16) {
            this.A03[i] = obj;
            long ordinal = (long) r7.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.A00 = ordinal | this.A00;
            A00(i, obj2, obj3);
            return null;
        }
        SPE spe = new SPE();
        this.A01 = spe;
        spe.A03[0] = obj;
        spe.A00 = ((long) r7.ordinal()) | spe.A00;
        spe.A00(0, obj2, obj3);
        return this.A01;
    }
}
