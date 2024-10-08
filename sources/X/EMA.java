package X;

public final class EMA extends C47695EDe {
    public final AnonymousClass0aP A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EMA(X.C307896Rx r14, X.AnonymousClass0aP r15, X.E54 r16) {
        /*
            r13 = this;
            r4 = r15
            r5 = r16
            X.AnonymousClass7TG.A1P(r15, r5)
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r14)
            X.DiE r7 = X.C46634DiE.A0z
            X.0iw r3 = X.C308206Td.A08(r14)
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r14)
            android.net.Uri r2 = X.C46413Dea.A00(r0)
            r6 = 0
            r0 = r13
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMA.<init>(X.6Rx, X.0aP, X.E54):void");
    }

    public final void onFail(C268654dm r5) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r5, -627805681);
        super.onFail(r5);
        C49886FBm A06 = 1Q0.A1D.A02(this.A00).A06((EXD) null, C46634DiE.A0z);
        1XP r0 = (1XP) r5.A00();
        if (r0 != null) {
            str = r0.mErrorType;
        } else {
            str = null;
        }
        if (!(r5 instanceof C268674do) || str == null) {
            str = this.A00;
            0qQ.A07(str);
        }
        A06.A04("error", str);
        A06.A02();
        AnonymousClass0fD.A0A(1538622639, A0D);
    }
}
