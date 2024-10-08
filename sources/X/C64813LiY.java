package X;

import java.util.AbstractCollection;

/* renamed from: X.LiY  reason: case insensitive filesystem */
public final class C64813LiY implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;

    public static void A00(String str, String str2, String str3, AbstractCollection abstractCollection) {
        abstractCollection.add(new C64813LiY(str, str2, str3));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64813LiY liY = (C64813LiY) obj;
        String str2 = this.A02;
        String str3 = null;
        if (liY != null) {
            str = liY.A02;
        } else {
            str = null;
        }
        if (2PP.A00(str2, str)) {
            String str4 = this.A00;
            if (liY != null) {
                str3 = liY.A00;
            }
            if (!2PP.A00(str4, str3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C64813LiY(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
