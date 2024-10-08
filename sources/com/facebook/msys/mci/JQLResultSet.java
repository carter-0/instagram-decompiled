package com.facebook.msys.mci;

import X.002;
import X.AnonymousClass62U;
import X.AnonymousClass7TF;
import X.C51970G9q;
import X.OHE;
import java.util.Map;

public final class JQLResultSet implements CQLResultSet {
    public static final JQLResultSet A0D = new JQLResultSet((byte[]) null, (short[]) null, (short[]) null, (short[]) null, 0, 0, 0, 0, 0, 0, 0, 0, (int[]) null, (long[]) null, (double[]) null, (boolean[]) null, (boolean[]) null, (Object[]) null, (Map) null);
    public final int A00;
    public final OHE A01;
    public final short A02;
    public final short A03;
    public final short A04;
    public final short A05;
    public final short A06;
    public final short A07;
    public final byte[] A08;
    public final short[] A09;
    public final short A0A;
    public final short[] A0B;
    public final short[] A0C;

    private void A00(int i, int i2, byte b) {
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        AnonymousClass62U.A00(z2);
        AnonymousClass62U.A00(AnonymousClass7TF.A1T(i, this.A00));
        if (i2 >= this.A03) {
            z = false;
        }
        AnonymousClass62U.A00(z);
        AnonymousClass62U.A00(AnonymousClass7TF.A1S((byte) (this.A08[i2] & 63), b));
    }

    public final byte[] getBlob(int i, int i2) {
        A00(i, i2, (byte) 6);
        return (byte[]) OHE.A00(this, i, i2);
    }

    public final boolean getBoolean(int i, int i2) {
        A00(i, i2, (byte) 4);
        return this.A01.A05[(i * this.A02) + this.A09[i2]];
    }

    public final CQLResultSet getChildResultSet(int i, int i2) {
        A00(i, i2, (byte) 7);
        return (CQLResultSet) OHE.A00(this, i, i2);
    }

    public final int getInteger(int i, int i2) {
        A00(i, i2, (byte) 1);
        return this.A01.A02[(i * this.A05) + this.A09[i2]];
    }

    public final long getLong(int i, int i2) {
        A00(i, i2, (byte) 2);
        return this.A01.A03[(i * this.A06) + this.A09[i2]];
    }

    public final Boolean getNullableBoolean(int i, int i2) {
        A00(i, i2, (byte) 4);
        if (A01(i, i2)) {
            return null;
        }
        return Boolean.valueOf(this.A01.A05[(i * this.A02) + this.A09[i2]]);
    }

    public final Integer getNullableInteger(int i, int i2) {
        A00(i, i2, (byte) 1);
        if (A01(i, i2)) {
            return null;
        }
        return Integer.valueOf(this.A01.A02[(i * this.A05) + this.A09[i2]]);
    }

    public final Long getNullableLong(int i, int i2) {
        A00(i, i2, (byte) 2);
        if (A01(i, i2)) {
            return null;
        }
        return Long.valueOf(this.A01.A03[(i * this.A06) + this.A09[i2]]);
    }

    public final String getString(int i, int i2) {
        A00(i, i2, (byte) 5);
        return (String) OHE.A00(this, i, i2);
    }

    private boolean A01(int i, int i2) {
        byte b = this.A08[i2];
        if (C51970G9q.A1W((byte) (b & 63), 4)) {
            if (OHE.A00(this, i, i2) == null) {
                return true;
            }
            return false;
        } else if ((b & Byte.MIN_VALUE) == 0) {
            return this.A01.A06[(i * this.A0A) + this.A0B[i2]];
        } else {
            return false;
        }
    }

    public static JQLResultSet emptyResultSet() {
        return A0D;
    }

    public final JQLResultSet A02(String str, int i) {
        Map map = this.A01.A00;
        if (map != null) {
            return (JQLResultSet) map.get(002.A04(i, "::", str));
        }
        return null;
    }

    public final int getCount() {
        return this.A00;
    }

    public final Double getNullableDouble(int i, int i2) {
        A00(i, 71, (byte) 3);
        if (A01(i, 71)) {
            return null;
        }
        return Double.valueOf(this.A01.A01[(i * this.A04) + this.A09[71]]);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OHE, java.lang.Object] */
    public JQLResultSet(byte[] bArr, short[] sArr, short[] sArr2, short[] sArr3, short s, short s2, short s3, short s4, short s5, short s6, short s7, int i, int[] iArr, long[] jArr, double[] dArr, boolean[] zArr, boolean[] zArr2, Object[] objArr, Map map) {
        this.A08 = bArr;
        this.A09 = sArr;
        this.A0B = sArr2;
        this.A0C = sArr3;
        this.A03 = s;
        this.A05 = s2;
        this.A06 = s3;
        this.A04 = s4;
        this.A02 = s5;
        this.A0A = s6;
        this.A07 = s7;
        this.A00 = i;
        ? obj = new Object();
        obj.A02 = iArr;
        obj.A03 = jArr;
        obj.A01 = dArr;
        obj.A05 = zArr;
        obj.A06 = zArr2;
        obj.A04 = objArr;
        obj.A00 = map;
        this.A01 = obj;
    }
}
