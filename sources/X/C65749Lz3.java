package X;

/* renamed from: X.Lz3  reason: case insensitive filesystem */
public final class C65749Lz3 implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65749Lz3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d3, code lost:
        X.0qQ.A0B(r7, 0);
        r6 = new X.C61217JzA(new X.C61217JzA(r7, "-").A00, "-");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9V() {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0124;
                case 1: goto L_0x0135;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A02
            X.K42 r0 = (X.K42) r0
            X.0eM r0 = r0.A02
            X.JjW r13 = X.JTT.A0a(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.mediakit.model.MediaKitSectionType r0 = (com.instagram.mediakit.model.MediaKitSectionType) r0
            r1 = 0
            java.lang.Integer r14 = X.AnonymousClass05K.A0P
            r6 = 0
            java.util.HashMap r17 = X.AnonymousClass7TE.A1E()
            X.KkN r12 = X.C63312Kuv.A00(r0)
            r15 = r6
            r16 = r6
            X.C64127LPb.A00(r12, r13, r14, r15, r16, r17)
            int r3 = r0.ordinal()
            r2 = 1
            r0 = 3
            if (r3 == r0) goto L_0x0109
            r0 = 2
            if (r3 == r0) goto L_0x007b
            if (r3 == r2) goto L_0x0064
            com.instagram.mediakit.repository.MediaKitRepository r0 = r13.A07
            X.LFM r0 = r0.A02
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.instagram.mediakit.model.MediaKitSectionType r0 = com.instagram.mediakit.model.MediaKitSectionType.TEXT
            java.lang.String r8 = ""
            X.JzD r0 = X.LQJ.A00(r0, r1, r8)
            java.lang.String r9 = r0.A03
            java.lang.String r10 = r0.A04
            com.instagram.mediakit.model.MediaKitSectionType r7 = r0.A01
            X.AnonymousClass7TH.A0K()
            X.JzD r5 = new X.JzD
            r11 = r6
            r12 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.6oS r1 = X.C318116oQ.A00(r13)
            r0 = 18
            X.MH3.A00(r13, r5, r1, r0)
            return
        L_0x0064:
            X.MQn[] r3 = new X.C66407MQn[r2]
            com.instagram.mediakit.repository.MediaKitRepository r0 = r13.A07
            X.LFM r0 = r0.A02
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.Ltg r2 = new X.Ltg
            r2.<init>(r0)
            goto L_0x011e
        L_0x007b:
            com.instagram.mediakit.repository.MediaKitRepository r2 = r13.A07
            X.LFM r4 = r2.A02
            java.util.ArrayList r2 = r4.A04
            int r2 = r2.size()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            com.instagram.mediakit.model.MediaKitSectionType r3 = com.instagram.mediakit.model.MediaKitSectionType.INSIGHTS
            r2 = 2328(0x918, float:3.262E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.JzD r2 = X.LQJ.A00(r3, r5, r2)
            java.lang.String r9 = r2.A03
            java.lang.String r10 = r2.A04
            com.instagram.mediakit.model.MediaKitSectionType r7 = r2.A01
            java.lang.String r8 = ""
            X.0sn r12 = X.0sn.A00
            r11 = r6
            X.JzD r5 = X.C63319Kv2.A00(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r2 = X.KUS.A03
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x00ae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00e8
            java.lang.Object r7 = r8.next()
            com.instagram.mediakit.model.MediaKitInsightType r7 = (com.instagram.mediakit.model.MediaKitInsightType) r7
            java.util.ArrayList r2 = r4.A03
            java.util.Iterator r3 = r2.iterator()
        L_0x00c0:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r6 = r3.next()
            r2 = r6
            X.JzA r2 = (X.C61217JzA) r2
            com.instagram.mediakit.model.MediaKitInsightType r2 = r2.A00
            if (r2 != r7) goto L_0x00c0
            if (r6 != 0) goto L_0x00e4
        L_0x00d3:
            java.lang.String r3 = "-"
            X.0qQ.A0B(r7, r1)
            X.JzA r2 = new X.JzA
            r2.<init>(r7, r3)
            com.instagram.mediakit.model.MediaKitInsightType r2 = r2.A00
            X.JzA r6 = new X.JzA
            r6.<init>(r2, r3)
        L_0x00e4:
            r10.add(r6)
            goto L_0x00ae
        L_0x00e8:
            java.util.List r9 = r5.A05
            java.lang.String r6 = r5.A02
            java.lang.String r7 = r5.A03
            X.JzC r4 = r5.A00
            java.lang.String r8 = r5.A04
            com.instagram.mediakit.model.MediaKitSectionType r5 = r5.A01
            X.0qQ.A0B(r7, r0)
            X.AnonymousClass7TG.A1S(r8, r5)
            X.JzD r3 = new X.JzD
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.6oS r1 = X.C318116oQ.A00(r13)
            r0 = 18
            X.MH3.A00(r13, r3, r1, r0)
            return
        L_0x0109:
            X.MQn[] r3 = new X.C66407MQn[r2]
            com.instagram.mediakit.repository.MediaKitRepository r0 = r13.A07
            X.LFM r0 = r0.A02
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.Ltj r2 = new X.Ltj
            r2.<init>(r0)
        L_0x011e:
            r3[r1] = r2
            r13.A05(r3)
            return
        L_0x0124:
            java.lang.Object r0 = r3.A01
            X.Dg1 r0 = (X.C46498Dg1) r0
            X.FFy r1 = new X.FFy
            r1.<init>(r0)
            java.lang.Object r0 = r3.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A03(r0)
            return
        L_0x0135:
            java.lang.Object r2 = r3.A01
            X.7Pu r2 = (X.C331157Pu) r2
            java.lang.Object r0 = r3.A02
            X.KB6 r0 = (X.KB6) r0
            android.app.Activity r1 = r0.A0A
            X.K7o r0 = r0.A0H
            r2.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65749Lz3.D9V():void");
    }

    public final void D9a() {
    }
}
