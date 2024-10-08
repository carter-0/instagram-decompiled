package X;

/* renamed from: X.Fha  reason: case insensitive filesystem */
public final class C50735Fha implements C230902qW {
    public final int A00;
    public final Object A01;

    public C50735Fha(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a4, code lost:
        r5 = "quickPromotionDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b5, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bc, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r1.AIY(r1.getValue(), r7) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DR0(X.AnonymousClass4UE r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x017c;
                case 1: goto L_0x01a7;
                case 2: goto L_0x0148;
                case 3: goto L_0x010f;
                case 4: goto L_0x0085;
                case 5: goto L_0x0047;
                case 6: goto L_0x002a;
                case 7: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            X.Dcv r2 = (X.C46352Dcv) r2
            boolean r0 = r7 instanceof X.AnonymousClass4UC
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r1 = r7
        L_0x000f:
            X.5Oz r0 = r2.A04
            r0.Epw(r1)
        L_0x0014:
            return
        L_0x0015:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass4UC
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r6.A01
            X.E6l r0 = (X.C47525E6l) r0
            X.0eM r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            goto L_0x003a
        L_0x002a:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.AnonymousClass4UC
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r6.A01
            X.E2q r0 = (X.C47444E2q) r0
            X.E7c r0 = X.C47444E2q.A00(r0)
        L_0x003a:
            X.05G r1 = r0.A09
        L_0x003c:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r7)
            if (r0 == 0) goto L_0x003c
            return
        L_0x0047:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.C16138UpP
            if (r0 == 0) goto L_0x0014
            X.4UC r7 = (X.AnonymousClass4UC) r7
            if (r7 == 0) goto L_0x0014
            java.lang.Object r4 = r6.A01
            X.F0K r4 = (X.F0K) r4
            X.3oV r1 = r4.A05
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0063
            X.DpA r3 = r4.A01
            if (r3 != 0) goto L_0x0070
        L_0x0063:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r0 = r1.getView()
            X.DpA r3 = new X.DpA
            r3.<init>(r0)
            r4.A01 = r3
        L_0x0070:
            X.0iw r0 = r4.A03
            X.Fk5 r2 = new X.Fk5
            r2.<init>(r0)
            r4.A02 = r2
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x01cc
            X.2qi r0 = r4.A00
            if (r0 == 0) goto L_0x01c7
            r2.ADo(r0, r7, r3)
            return
        L_0x0085:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.C16138UpP
            if (r0 == 0) goto L_0x0014
            X.4UC r7 = (X.AnonymousClass4UC) r7
            if (r7 == 0) goto L_0x0014
            java.lang.Object r3 = r6.A01
            X.K6I r3 = (X.K6I) r3
            X.4VA r0 = r7.A09
            java.lang.String r2 = r0.A00
            X.3oV r4 = r3.A01
            if (r4 != 0) goto L_0x00a1
            java.lang.String r5 = "qpMegaphoneViewStubber"
            goto L_0x01b5
        L_0x00a1:
            boolean r0 = r4.CVM()
            if (r0 != 0) goto L_0x00cf
            int r1 = r2.hashCode()
            r0 = -1300165181(0xffffffffb2810dc3, float:-1.5023835E-8)
            if (r1 == r0) goto L_0x010c
            r0 = -303268285(0xffffffffedec7e43, float:-9.148888E27)
            if (r1 == r0) goto L_0x0105
            r0 = 336609433(0x14104099, float:7.282882E-27)
            if (r1 != r0) goto L_0x01dd
            java.lang.String r0 = "audio_browser_condensed_megaphone_ig"
        L_0x00bc:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01dd
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r4.getView()
            X.DpA r0 = new X.DpA
            r0.<init>(r1)
            r3.A06 = r0
        L_0x00cf:
            int r1 = r2.hashCode()
            r0 = -1300165181(0xffffffffb2810dc3, float:-1.5023835E-8)
            if (r1 == r0) goto L_0x0102
            r0 = -303268285(0xffffffffedec7e43, float:-9.148888E27)
            if (r1 == r0) goto L_0x00fb
            r0 = 336609433(0x14104099, float:7.282882E-27)
            if (r1 != r0) goto L_0x01d6
            java.lang.String r0 = "audio_browser_condensed_megaphone_ig"
        L_0x00e4:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01d6
            X.Fk5 r2 = new X.Fk5
            r2.<init>(r3)
            X.DpA r1 = r3.A06
            if (r1 == 0) goto L_0x01d1
            X.2qi r0 = r3.A05
            if (r0 == 0) goto L_0x01a4
            r2.ADo(r0, r7, r1)
            return
        L_0x00fb:
            r0 = 1836(0x72c, float:2.573E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00e4
        L_0x0102:
            java.lang.String r0 = "audio_browser_standard_megaphone_ig"
            goto L_0x00e4
        L_0x0105:
            r0 = 1836(0x72c, float:2.573E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00bc
        L_0x010c:
            java.lang.String r0 = "audio_browser_standard_megaphone_ig"
            goto L_0x00bc
        L_0x010f:
            r4 = 0
            X.0qQ.A0B(r7, r4)
            java.lang.Object r3 = r6.A01
            X.H1C r3 = (X.H1C) r3
            X.2sj r0 = r3.A05
            if (r0 == 0) goto L_0x0014
            X.2u9 r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            android.widget.FrameLayout r0 = r3.A01
            java.lang.String r5 = "qpView"
            r2 = 0
            if (r0 == 0) goto L_0x01b5
            r0.removeAllViews()
            X.2u9 r1 = r3.A02
            if (r1 == 0) goto L_0x0132
            X.2sj r0 = r3.A05
            r1.A03(r0, r7, r2)
        L_0x0132:
            X.2u9 r1 = r3.A02
            if (r1 == 0) goto L_0x0014
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x01b5
            android.view.View r1 = r1.A01(r4, r2, r0)
            if (r1 == 0) goto L_0x0014
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x01b5
            r0.addView(r1)
            return
        L_0x0148:
            r4 = 0
            X.0qQ.A0B(r7, r4)
            java.lang.Object r3 = r6.A01
            X.EN2 r3 = (X.EN2) r3
            X.2qi r1 = r3.A00
            if (r1 == 0) goto L_0x01a4
            X.4UC r7 = (X.AnonymousClass4UC) r7
            X.Lu6 r0 = new X.Lu6
            r0.<init>(r1, r7)
            r3.A00 = r0
            X.0eM r2 = r3.A0B
            java.lang.Object r0 = r2.getValue()
            X.JlH r0 = (X.C60424JlH) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            X.Lu6 r0 = r3.A00
            if (r0 == 0) goto L_0x0172
            r1.add(r4, r0)
        L_0x0172:
            java.lang.Object r0 = r2.getValue()
            X.JlH r0 = (X.C60424JlH) r0
            r0.A00(r1)
            return
        L_0x017c:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r1 = r6.A01
            X.E47 r1 = (X.E47) r1
            X.0eM r0 = r1.A04
            java.lang.Object r3 = r0.getValue()
            X.Jj4 r3 = (X.C60305Jj4) r3
            X.2qi r2 = r1.A00
            if (r2 == 0) goto L_0x01a4
            boolean r0 = r7 instanceof X.AnonymousClass4UC
            r1 = 0
            if (r0 == 0) goto L_0x019e
            X.4UC r7 = (X.AnonymousClass4UC) r7
            if (r7 == 0) goto L_0x019e
            X.Lu6 r1 = new X.Lu6
            r1.<init>(r2, r7)
        L_0x019e:
            X.05G r0 = r3.A0E
            r0.Epw(r1)
            return
        L_0x01a4:
            java.lang.String r5 = "quickPromotionDelegate"
            goto L_0x01b5
        L_0x01a7:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.H1y r0 = (X.C54178H1y) r0
            X.E9H r1 = r0.A00
            if (r1 != 0) goto L_0x01bd
            java.lang.String r5 = "listAdapter"
        L_0x01b5:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01bd:
            X.4UE r0 = r1.A00
            if (r7 == r0) goto L_0x0014
            r1.A00 = r7
            X.E9H.A00(r1)
            return
        L_0x01c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01d6:
            java.lang.String r0 = "Unsupported template: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        L_0x01dd:
            java.lang.String r0 = "Unsupported template: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50735Fha.DR0(X.4UE):void");
    }
}
