package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BHq  reason: case insensitive filesystem */
public final class C42112BHq extends AnonymousClass0T0 implements C46269DSy {
    public final String A00;
    public final String A01;

    public final C42112BHq FCb() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42112BHq) {
                C42112BHq bHq = (C42112BHq) obj;
                if (!0qQ.A0K(this.A00, bHq.A00) || !0qQ.A0K(this.A01, bHq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextColorSpec", C44517CgD.A00(this));
    }

    public final String getDark() {
        return this.A00;
    }

    public final String getLight() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C42112BHq(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
