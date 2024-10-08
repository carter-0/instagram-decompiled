package X;

/* renamed from: X.M3u  reason: case insensitive filesystem */
public final class C65905M3u implements Runnable {
    public final /* synthetic */ K6A A00;

    public C65905M3u(K6A k6a) {
        this.A00 = k6a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        r2 = (X.C61868KPh) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.K6A r4 = r10.A00
            X.3Q2 r1 = X.JTT.A0f(r4)
            java.lang.String r7 = "VideoEditFragment"
            if (r1 != 0) goto L_0x001e
            X.0wj r1 = X.0wj.A01
            r0 = 817901174(0x30c02e76, float:1.3983044E-9)
            X.0f9 r2 = r1.AEf(r7, r0)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Getting pendingMedia failed"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x001d:
            return
        L_0x001e:
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x001d
            com.instagram.pendingmedia.model.ClipInfo r3 = r1.A1N
            int r0 = X.JTT.A06(r4)
            double r0 = (double) r0
            r5 = 4620130267728707584(0x401e000000000000, double:7.5)
            double r0 = r0 / r5
            X.LNE r6 = X.C61870KPj.A0Z
            android.content.Context r5 = r4.requireContext()
            X.0eM r9 = r4.A0O
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            double r5 = r6.A01(r5, r2, r3)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            r0 = r5
        L_0x0041:
            int r8 = (int) r0
            android.content.res.Resources r1 = X.JTR.A0R(r4)
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r0 = r1.getDimensionPixelSize(r0)
            double r1 = (double) r0
            android.content.res.Resources r5 = X.JTR.A0R(r4)
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            int r0 = r5.getDimensionPixelSize(r0)
            double r5 = (double) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r1 = r5
        L_0x005f:
            int r5 = (int) r1
            X.LA8 r2 = X.LKM.A00(r3)     // Catch:{ IOException -> 0x0070 }
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)     // Catch:{ IOException -> 0x0070 }
            X.LP1 r0 = new X.LP1     // Catch:{ IOException -> 0x0070 }
            r0.<init>(r1, r2, r8, r5)     // Catch:{ IOException -> 0x0070 }
            r4.A0H = r0     // Catch:{ IOException -> 0x0070 }
            goto L_0x0076
        L_0x0070:
            r1 = move-exception
            java.lang.String r0 = "Video frame generator setup failed"
            X.0kD.A09(r7, r0, r1)
        L_0x0076:
            java.lang.Integer r1 = r4.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0080
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x009d
        L_0x0080:
            X.K3p r2 = r4.A0E
            if (r2 == 0) goto L_0x009d
            X.LP1 r0 = r4.A0H
            r2.A07 = r0
            boolean r0 = r2 instanceof X.C61870KPj
            if (r0 == 0) goto L_0x00aa
            X.KPj r2 = (X.C61870KPj) r2
            X.LP1 r0 = r2.A07
            if (r0 == 0) goto L_0x0094
            r0.A02 = r2
        L_0x0094:
            android.widget.LinearLayout r1 = r2.A0E
            if (r1 == 0) goto L_0x00bd
            java.lang.Runnable r0 = r2.A0X
        L_0x009a:
            r1.post(r0)
        L_0x009d:
            X.9Po r2 = r4.A0G
            if (r2 == 0) goto L_0x001d
            int r1 = r3.A09
            int r0 = r3.A06
            r2.A01 = r1
            r2.A00 = r0
            return
        L_0x00aa:
            boolean r0 = r2 instanceof X.C61869KPi
            if (r0 != 0) goto L_0x009d
            X.KPh r2 = (X.C61868KPh) r2
            X.LP1 r0 = r2.A07
            if (r0 == 0) goto L_0x009d
            r0.A02 = r2
            android.widget.LinearLayout r1 = r2.A04
            if (r1 == 0) goto L_0x00c2
            java.lang.Runnable r0 = r2.A0D
            goto L_0x009a
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65905M3u.run():void");
    }
}
