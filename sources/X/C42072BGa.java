package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BGa  reason: case insensitive filesystem */
public final class C42072BGa extends AnonymousClass0T0 implements C46286DTp {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C42072BGa F9S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42072BGa) {
                C42072BGa bGa = (C42072BGa) obj;
                if (!0qQ.A0K(this.A02, bGa.A02) || !0qQ.A0K(this.A03, bGa.A03) || !0qQ.A0K(this.A00, bGa.A00) || !0qQ.A0K(this.A01, bGa.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AgA() {
        return this.A02;
    }

    public final Boolean BuN() {
        return this.A00;
    }

    public final Integer Bw4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryAntiBullyStickerTappableData", C44375Cdv.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42072BGa(Boolean bool, Integer num, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
        this.A01 = num;
    }
}
