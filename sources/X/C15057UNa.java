package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UNa  reason: case insensitive filesystem */
public final class C15057UNa extends AnonymousClass0T0 implements C21026XAf {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C15057UNa FB5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15057UNa) {
                C15057UNa uNa = (C15057UNa) obj;
                if (!0qQ.A0K(this.A01, uNa.A01) || !0qQ.A0K(this.A02, uNa.A02) || !0qQ.A0K(this.A00, uNa.A00) || !0qQ.A0K(this.A03, uNa.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Arb() {
        return this.A01;
    }

    public final String BDf() {
        return this.A02;
    }

    public final Boolean CUj() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryQuizTallyDict", V8J.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public C15057UNa(Boolean bool, Integer num, String str, String str2) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
    }
}
