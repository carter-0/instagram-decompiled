package X;

/* renamed from: X.LoH  reason: case insensitive filesystem */
public final class C65152LoH implements C66512MUq {
    public final /* synthetic */ C60694Jpf A00;
    public final /* synthetic */ C59792JYl A01;
    public final /* synthetic */ C63873LAc A02;

    public C65152LoH(C60694Jpf jpf, C59792JYl jYl, C63873LAc lAc) {
        this.A01 = jYl;
        this.A00 = jpf;
        this.A02 = lAc;
    }

    public final void DHl() {
        C60694Jpf jpf = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        if (jpf.A05) {
            this.A01.A06.DC8();
            jpf.A05 = false;
        }
    }

    public final void DP0() {
        MV4 mv4 = this.A01.A06;
        if (mv4.CRZ()) {
            C60694Jpf jpf = this.A00;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            if (!jpf.A05) {
                jpf.A05 = true;
                mv4.DmR(jpf);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dl1() {
        /*
            r6 = this;
            X.JYl r5 = r6.A01
            X.MV4 r3 = r5.A06
            X.JYD r3 = (X.JYD) r3
            X.80U r0 = r3.A0R
            X.80V r1 = r0.Atr()
            X.8uV r0 = X.C369378uV.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 8
            if (r1 == r0) goto L_0x00a1
            X.Jpf r4 = r5.A00
            r2 = 1
            if (r4 == 0) goto L_0x002c
            X.Jpf r0 = r6.A00
            if (r4 == r0) goto L_0x002c
            X.LAc r0 = r6.A02
            if (r0 == 0) goto L_0x0028
            X.7zv r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r4.A04(r0)
        L_0x002c:
            X.Jpf r1 = r6.A00
            X.LAc r0 = r6.A02
            if (r0 == 0) goto L_0x00fb
            X.7zv r0 = r0.A05
            if (r0 == 0) goto L_0x00fb
        L_0x0036:
            r1.A04(r2)
            X.Jpf r0 = r5.A00
            if (r0 == r1) goto L_0x00c2
            r5.A00 = r1
            int r4 = r1.getLayoutPosition()
            X.JYl r0 = r3.A0M
            int r1 = r0.getItemCount()
            X.Jc9 r2 = r3.A0P
            X.7wF r0 = r3.A01
            java.util.List r0 = X.C59943Jc9.A00(r2, r0)
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00a4
            X.8Yz r1 = r3.A0J
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = X.C357638Yz.A03(r0, r1)
            if (r0 != 0) goto L_0x00a1
            X.7wF r0 = r3.A01
            X.L7p r0 = r2.A04(r0, r4)
        L_0x0069:
            float r5 = r0.A02
            float r0 = r0.A00
            float r5 = r5 + r0
            int r0 = r3.A07
            float r1 = (float) r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a2
            r5 = 0
        L_0x0076:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.A0C
            X.JYG.A01(r0, r3, r5)
            X.L7p r4 = X.JYD.A01(r3)
            X.7l2 r0 = r3.A0E
            android.view.View r0 = r0.A0F
            X.5nL r1 = X.JTP.A0b(r0)
            X.2co r0 = X.JYD.A0f
            X.5nL r0 = r1.A0E(r0)
            X.5nL r2 = r0.A0A()
            float r1 = r4.A02
            float r1 = r1 - r5
            r2.A0K(r1)
            r0 = 10
            X.C65724Lye.A00(r2, r3, r0)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r0 = r3.A0G
            r0.setTranslationY(r1)
        L_0x00a1:
            return
        L_0x00a2:
            float r5 = r5 - r1
            goto L_0x0076
        L_0x00a4:
            X.7wF r1 = r3.A01
            X.7wF r0 = X.C347087wF.A0E
            if (r1 == r0) goto L_0x00ae
            X.7wF r0 = X.C347087wF.A0D
            if (r1 != r0) goto L_0x00a1
        L_0x00ae:
            X.L7p r0 = r2.A04(r1, r4)
            if (r0 == 0) goto L_0x00f4
            float r2 = r0.A02
            float r0 = r0.A00
            float r2 = r2 + r0
            int r0 = r3.A07
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00f4
            float r2 = r2 - r1
            goto L_0x00f5
        L_0x00c2:
            r0 = 0
            r5.A00 = r0
            X.JYl r0 = r3.A0M
            int r2 = r0.getItemCount()
            X.Jc9 r1 = r3.A0P
            X.7wF r0 = r3.A01
            java.util.List r0 = X.C59943Jc9.A00(r1, r0)
            if (r0 == 0) goto L_0x0103
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x00ea
            X.8Yz r1 = r3.A0J
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = X.C357638Yz.A03(r0, r1)
            if (r0 != 0) goto L_0x00a1
            X.L7p r0 = X.JYD.A01(r3)
            goto L_0x0069
        L_0x00ea:
            X.7wF r1 = r3.A01
            X.7wF r0 = X.C347087wF.A0E
            if (r1 == r0) goto L_0x00f4
            X.7wF r0 = X.C347087wF.A0D
            if (r1 != r0) goto L_0x00a1
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.A0C
            X.JYG.A01(r0, r3, r2)
            return
        L_0x00fb:
            r2 = 0
            goto L_0x0036
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65152LoH.Dl1():void");
    }
}
