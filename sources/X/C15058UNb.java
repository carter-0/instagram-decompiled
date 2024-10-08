package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UNb  reason: case insensitive filesystem */
public final class C15058UNb extends AnonymousClass0T0 implements C21033XAm {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C15058UNb FCC() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15058UNb) {
                C15058UNb uNb = (C15058UNb) obj;
                if (!0qQ.A0K(this.A02, uNb.A02) || !0qQ.A0K(this.A00, uNb.A00) || !0qQ.A0K(this.A03, uNb.A03) || !0qQ.A0K(this.A01, uNb.A01) || !0qQ.A0K(this.A04, uNb.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BW8() {
        return this.A03;
    }

    public final Boolean Bwb() {
        return this.A01;
    }

    public final Boolean CSq() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSurveyAnswerDict", V8K.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public C15058UNb(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A01 = bool2;
        this.A04 = str3;
    }
}
