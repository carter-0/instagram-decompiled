package X;

/* renamed from: X.Htd  reason: case insensitive filesystem */
public abstract class C56151Htd {
    public static final C56151Htd A00 = new C52879GeF(new C56560I1o((C56115Ht2) null, (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));

    public final int hashCode() {
        return ((C52879GeF) this).A00.hashCode();
    }

    public final C52879GeF A00(C56151Htd htd) {
        C56560I1o i1o = ((C52879GeF) htd).A00;
        C56068HsH hsH = i1o.A01;
        if (hsH == null) {
            hsH = ((C52879GeF) this).A00.A01;
        }
        C56069HsI hsI = i1o.A03;
        if (hsI == null) {
            hsI = ((C52879GeF) this).A00.A03;
        }
        C56115Ht2 ht2 = i1o.A00;
        if (ht2 == null) {
            ht2 = ((C52879GeF) this).A00.A00;
        }
        C56099Hsm hsm = i1o.A02;
        if (hsm == null) {
            hsm = ((C52879GeF) this).A00.A02;
        }
        return new C52879GeF(new C56560I1o(ht2, hsH, hsm, hsI, 0Yt.A04(((C52879GeF) this).A00.A04, i1o.A04), false));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C56151Htd) || !0qQ.A0K(((C52879GeF) ((C56151Htd) obj)).A00, ((C52879GeF) this).A00)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(A00)) {
            return "EnterTransition.None";
        }
        C56560I1o i1o = ((C52879GeF) this).A00;
        C56068HsH hsH = i1o.A01;
        String str4 = null;
        if (hsH != null) {
            str = hsH.toString();
        } else {
            str = null;
        }
        C56069HsI hsI = i1o.A03;
        if (hsI != null) {
            str2 = hsI.toString();
        } else {
            str2 = null;
        }
        C56115Ht2 ht2 = i1o.A00;
        if (ht2 != null) {
            str3 = ht2.toString();
        } else {
            str3 = null;
        }
        C56099Hsm hsm = i1o.A02;
        if (hsm != null) {
            str4 = hsm.toString();
        }
        return 002.A16("EnterTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - ", str3, ",\nScale - ", str4);
    }
}
