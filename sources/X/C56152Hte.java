package X;

/* renamed from: X.Hte  reason: case insensitive filesystem */
public abstract class C56152Hte {
    public static final C56152Hte A00 = new C52880GeG(new C56560I1o((C56115Ht2) null, (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), false));
    public static final C56152Hte A01 = new C52880GeG(new C56560I1o((C56115Ht2) null, (C56068HsH) null, (C56099Hsm) null, (C56069HsI) null, 0Yt.A0E(), true));

    public final int hashCode() {
        return ((C52880GeG) this).A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (((X.C52880GeG) r9).A00.A05 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52880GeG A00(X.C56152Hte r10) {
        /*
            r9 = this;
            X.GeG r10 = (X.C52880GeG) r10
            X.I1o r2 = r10.A00
            X.HsH r4 = r2.A01
            if (r4 != 0) goto L_0x000f
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.HsH r4 = r0.A01
        L_0x000f:
            X.HsI r6 = r2.A03
            if (r6 != 0) goto L_0x001a
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.HsI r6 = r0.A03
        L_0x001a:
            X.Ht2 r3 = r2.A00
            if (r3 != 0) goto L_0x0025
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.Ht2 r3 = r0.A00
        L_0x0025:
            X.Hsm r5 = r2.A02
            if (r5 != 0) goto L_0x0030
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            X.Hsm r5 = r0.A02
        L_0x0030:
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x003e
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            boolean r0 = r0.A05
            r8 = 0
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r8 = 1
        L_0x003f:
            r0 = r9
            X.GeG r0 = (X.C52880GeG) r0
            X.I1o r0 = r0.A00
            java.util.Map r1 = r0.A04
            java.util.Map r0 = r2.A04
            java.util.LinkedHashMap r7 = X.0Yt.A04(r1, r0)
            X.I1o r2 = new X.I1o
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.GeG r0 = new X.GeG
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56152Hte.A00(X.Hte):X.GeG");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C56152Hte) || !0qQ.A0K(((C52880GeG) ((C56152Hte) obj)).A00, ((C52880GeG) this).A00)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(A00)) {
            return "ExitTransition.None";
        }
        if (equals(A01)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C56560I1o i1o = ((C52880GeG) this).A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ExitTransition: \nFade - ");
        C56068HsH hsH = i1o.A01;
        String str4 = null;
        if (hsH != null) {
            str = hsH.toString();
        } else {
            str = null;
        }
        A1A.append(str);
        A1A.append(",\nSlide - ");
        C56069HsI hsI = i1o.A03;
        if (hsI != null) {
            str2 = hsI.toString();
        } else {
            str2 = null;
        }
        A1A.append(str2);
        A1A.append(",\nShrink - ");
        C56115Ht2 ht2 = i1o.A00;
        if (ht2 != null) {
            str3 = ht2.toString();
        } else {
            str3 = null;
        }
        A1A.append(str3);
        A1A.append(",\nScale - ");
        C56099Hsm hsm = i1o.A02;
        if (hsm != null) {
            str4 = hsm.toString();
        }
        A1A.append(str4);
        A1A.append(",\nKeepUntilTransitionsFinished - ");
        A1A.append(i1o.A05);
        return A1A.toString();
    }
}
