package X;

import android.util.SparseArray;

/* renamed from: X.KiN  reason: case insensitive filesystem */
public enum C62590KiN {
    A07("COLOR", true, 2131953566),
    A08("EMOJI", false, 2131953568),
    A0A("SELFIE", false, 2131953570),
    A09("IMAGE", false, 2131953569);
    
    public static final SparseArray A03 = null;
    public static final SparseArray A04 = null;
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* access modifiers changed from: public */
    static {
        C62590KiN[] kiNArr;
        A05 = 0oU.A00(kiNArr);
        A03 = new SparseArray();
        A04 = new SparseArray();
        for (C62590KiN kiN : values()) {
            A03.put(kiN.A01, kiN);
            if (kiN != A09) {
                A04.put(kiN.A01, kiN);
            }
        }
    }

    /* access modifiers changed from: public */
    C62590KiN(String str, boolean z, int i) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = i;
    }
}
