package X;

import android.content.LocusId;

/* renamed from: X.S7r  reason: case insensitive filesystem */
public abstract class C11047S7r {
    public static LocusId A00(String str) {
        return new LocusId(str);
    }

    public static String A01(LocusId locusId) {
        return locusId.getId();
    }
}
