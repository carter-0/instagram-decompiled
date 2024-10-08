package X;

public final class PUC implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PUC(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        ((X.1a8) r6.A01).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0270, code lost:
        r4 = new X.C71524OmL(r0, r2, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x028d, code lost:
        r5.A02(r0);
        r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02cc, code lost:
        r7.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0344, code lost:
        r5 = (X.AnonymousClass67Z) r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0348, code lost:
        X.0qQ.A0A(r5);
        r5.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034e, code lost:
        r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0351, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x02d0;
                case 1: goto L_0x02b8;
                case 2: goto L_0x0276;
                case 3: goto L_0x0267;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01b6;
                case 7: goto L_0x01ab;
                case 8: goto L_0x0118;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0092;
                case 12: goto L_0x007d;
                case 13: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Nj7 r7 = (X.C69306Nj7) r7
            if (r7 == 0) goto L_0x004a
            int r1 = r7.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0031
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 4
            if (r1 != r0) goto L_0x004a
            java.lang.Object r0 = r6.A03
            X.OMX r0 = (X.OMX) r0
            com.instagram.common.session.UserSession r4 = r0.A01
            java.lang.Object r3 = r6.A01
            X.5HJ r3 = (X.AnonymousClass5HJ) r3
            java.lang.Object r1 = r6.A02
            com.instagram.common.notifications.push.intf.PushChannelType r1 = (com.instagram.common.notifications.push.intf.PushChannelType) r1
            java.lang.String r2 = "processPushPathNotification: invalid mailbox"
        L_0x0026:
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.lang.String r1 = r1.A01
            r0 = 7
        L_0x002d:
            X.C67295MlU.A02(r3, r4, r2, r1, r0)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r0 = r6.A03
            X.OMX r0 = (X.OMX) r0
            com.instagram.common.session.UserSession r4 = r0.A01
            java.lang.Object r3 = r6.A01
            X.5HJ r3 = (X.AnonymousClass5HJ) r3
            java.lang.Object r1 = r6.A02
            com.instagram.common.notifications.push.intf.PushChannelType r1 = (com.instagram.common.notifications.push.intf.PushChannelType) r1
            java.lang.String r2 = "insert push notification in the push path"
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.lang.String r1 = r1.A01
            r0 = 10
            goto L_0x002d
        L_0x004a:
            java.lang.Object r0 = r6.A03
            X.OMX r0 = (X.OMX) r0
            com.instagram.common.session.UserSession r4 = r0.A01
            java.lang.Object r3 = r6.A01
            X.5HJ r3 = (X.AnonymousClass5HJ) r3
            java.lang.Object r1 = r6.A02
            com.instagram.common.notifications.push.intf.PushChannelType r1 = (com.instagram.common.notifications.push.intf.PushChannelType) r1
            java.lang.String r2 = "processPushPathNotification: Unable to insert into DB"
            goto L_0x0026
        L_0x005b:
            X.JwJ r7 = (X.C61081JwJ) r7
            java.lang.Object r4 = r6.A02
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r6.A03
            X.OTe r3 = (X.C70957OTe) r3
            com.instagram.common.session.UserSession r1 = r3.A03
            java.lang.Object r0 = r6.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.Md0 r2 = new X.Md0
            r2.<init>(r4, r0, r1)
            X.Mcz r1 = r3.A04
            X.NmK r0 = X.C69476NmK.PROACTIVE_WARNING_BANNER_PRIMARY_ACTION
            X.C66813Mcz.A00(r0, r1)
            java.lang.String r0 = r7.A01
            r2.A00(r0)
            return
        L_0x007d:
            java.lang.Object r0 = r6.A03
            X.PEQ r0 = (X.PEQ) r0
            X.1Ng r2 = r0.A00
            java.lang.Object r1 = r6.A02
            X.3sy r1 = (X.C254743sy) r1
            X.3t3 r1 = (X.C254793t3) r1
            X.2Kd r0 = new X.2Kd
            r0.<init>(r1)
            r2.A00(r0)
            goto L_0x00a2
        L_0x0092:
            java.lang.Object r0 = r6.A03
            X.MZ9 r0 = (X.MZ9) r0
            java.lang.String r1 = "ACT init completed"
            r0.A00(r1)
            java.lang.Object r0 = r6.A02
            X.MZB r0 = (X.MZB) r0
            r0.A02(r1)
        L_0x00a2:
            java.lang.Object r0 = r6.A01
            X.1a8 r0 = (X.1a8) r0
            r0.A01()
            return
        L_0x00aa:
            java.lang.String r3 = X.C41847B3o.A1E(r7)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r3)
            java.lang.Object r2 = r6.A03
            X.MdB r2 = (X.C66819MdB) r2
            com.instagram.common.typedurl.ImageUrlBase.A00(r1)
            com.instagram.common.typedurl.ImageCacheKey r0 = r1.A00
            X.0Sd.A00(r0)
            com.instagram.common.typedurl.ImageCacheKey r0 = r1.A00
            java.lang.String r1 = r0.A03
            X.0qQ.A07(r1)
            X.Mcf r0 = new X.Mcf
            r0.<init>(r1)
            r2.DQn(r0)
            java.lang.Object r2 = r6.A02
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r3)
            java.lang.Object r0 = r6.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r2.setUrl(r1, r0)
            return
        L_0x00dd:
            X.ODa r7 = (X.C70603ODa) r7
            android.graphics.drawable.shapes.RectShape r3 = new android.graphics.drawable.shapes.RectShape
            r3.<init>()
            r1 = 0
            X.77E r0 = X.AnonymousClass77E.A00
            X.77D r2 = new X.77D
            r2.<init>(r3, r0)
            int r0 = r7.A01
            r2.A00 = r0
            r2.A02 = r1
            X.AnonymousClass77D.A00(r2)
            java.lang.Object r1 = r6.A01
            com.instagram.feed.widget.IgProgressImageView r1 = (com.instagram.feed.widget.IgProgressImageView) r1
            android.graphics.Bitmap r0 = r7.A02
            r1.setBitmapAndImageRenderer(r0, r2)
            java.lang.Object r1 = r6.A02
            X.MdB r1 = (X.C66819MdB) r1
            X.PA7 r0 = X.PA7.A00
            r1.DQn(r0)
            r1.Ddt()
            java.lang.Object r1 = r6.A03
            X.0sP r1 = (X.0sP) r1
            float r0 = r7.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.invoke(r0)
            return
        L_0x0118:
            X.NoL r7 = (X.C69577NoL) r7
            X.NTz r0 = X.C68713NTz.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x012c
            java.lang.Object r1 = r6.A02
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "BLOCKSTORE_RECOVERY_CODE_FETCHED"
            r1.A0B(r0)
            return
        L_0x012c:
            X.NU1 r0 = X.NU1.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.Object r0 = r6.A02
            X.Mex r0 = (X.C66913Mex) r0
            r0.A08()
            java.lang.Object r0 = r6.A03
            X.MuD r0 = (X.C67758MuD) r0
            X.C67758MuD.A01(r0)
            return
        L_0x0143:
            X.NTy r0 = X.C68712NTy.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x015c
            X.NU0 r0 = X.NU0.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x015c
            boolean r0 = r7 instanceof X.C68711NTx
            if (r0 != 0) goto L_0x015c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015c:
            java.lang.Object r3 = r6.A03
            X.MuD r3 = (X.C67758MuD) r3
            X.05G r1 = r3.A0M
            X.NiO r0 = X.C69262NiO.OFF
            r1.FIA(r0)
            boolean r0 = r7 instanceof X.C68711NTx
            if (r0 == 0) goto L_0x018f
            java.lang.Object r2 = r6.A02
            X.Mex r2 = (X.C66913Mex) r2
            X.NTx r7 = (X.C68711NTx) r7
            java.lang.String r1 = r7.A00
        L_0x0173:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "BLOCKSTORE_FAILURE_REASON"
            r2.A0D(r0, r1)
        L_0x017c:
            X.OW5 r0 = r3.A08
            java.lang.Object r1 = r6.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            X.NiX r3 = X.C69271NiX.FULLSCREEN_MODAL
            r5 = 0
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0.A02(r1, r2, r3, r4, r5)
            return
        L_0x018f:
            boolean r0 = r7 instanceof X.C68712NTy
            if (r0 == 0) goto L_0x019a
            java.lang.Object r2 = r6.A02
            X.Mex r2 = (X.C66913Mex) r2
            java.lang.String r1 = "Blockstore Not Supported"
            goto L_0x0173
        L_0x019a:
            boolean r0 = r7 instanceof X.NU0
            if (r0 == 0) goto L_0x017c
            java.lang.Object r1 = r6.A02
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "BLOCKSTORE_RECOVERY_CODE_NOT_FOUND"
            r1.A0B(r0)
            r1.A07()
            goto L_0x017c
        L_0x01ab:
            X.ObS r7 = (X.C71087ObS) r7
            java.lang.Object r3 = r6.A01
            java.lang.Object r2 = r6.A03
            java.lang.Object r1 = r6.A02
            r0 = 4
            goto L_0x0270
        L_0x01b6:
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.N0I
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r2 = r6.A03
            X.OO6 r2 = (X.OO6) r2
            android.content.Context r0 = r2.A00
            X.ObS r1 = r2.A00(r0)
            r0 = 9
            X.C71087ObS.A01(r1, r2, r0)
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.NTs r0 = X.C68706NTs.A00
            goto L_0x028d
        L_0x01d5:
            java.lang.Object r3 = r6.A02
            X.1a8 r3 = (X.1a8) r3
            java.lang.Object r2 = r6.A03
            X.OO6 r2 = (X.OO6) r2
            X.1aU r1 = r2.A01(r3)
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            r0 = 4
            X.PU9.A00(r1, r3, r5, r2, r0)
            goto L_0x034e
        L_0x01eb:
            X.ObS r7 = (X.C71087ObS) r7
            java.lang.Object r3 = r6.A01
            java.lang.Object r2 = r6.A03
            java.lang.Object r1 = r6.A02
            r0 = 3
            goto L_0x0270
        L_0x01f5:
            boolean r0 = r7 instanceof X.NEF
            if (r0 == 0) goto L_0x0249
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.NTo r0 = X.C68702NTo.A00
            r5.A02(r0)
            java.lang.Object r4 = r6.A03
            X.OO6 r4 = (X.OO6) r4
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.OyT r0 = (X.C72203OyT) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x022f
            java.lang.Object r3 = r6.A02
            X.1a8 r3 = (X.1a8) r3
            X.0qQ.A0A(r5)
            r1 = 4
            X.Oxe r0 = new X.Oxe
            r0.<init>((X.1a8) r3, (X.OO6) r4, (int) r1)
            X.1aU r2 = X.1aU.A06(r0)
            r1 = 6
            X.PUC r0 = new X.PUC
            r0.<init>((X.AnonymousClass67Z) r5, (X.1a8) r3, (X.OO6) r4, (int) r1)
            r3.A02(r2, r0)
            return
        L_0x022f:
            java.lang.String r1 = "Invalid backup status for VD creation"
            X.NTn r3 = new X.NTn
            r3.<init>(r1)
            X.NUV r0 = r4.A06
            java.util.List r0 = r0.A00
            r0.add(r1)
            android.content.Context r0 = r4.A00
            X.ObS r1 = r4.A00(r0)
            r0 = 6
            X.C71087ObS.A01(r1, r4, r0)
            goto L_0x0348
        L_0x0249:
            java.lang.String r1 = "Failed to backup RC"
            X.NTn r3 = new X.NTn
            r3.<init>(r1)
            java.lang.Object r2 = r6.A03
            X.OO6 r2 = (X.OO6) r2
            X.NUV r0 = r2.A06
            java.util.List r0 = r0.A00
            r0.add(r1)
            android.content.Context r0 = r2.A00
            X.ObS r1 = r2.A00(r0)
            r0 = 7
            X.C71087ObS.A01(r1, r2, r0)
            goto L_0x0344
        L_0x0267:
            X.ObS r7 = (X.C71087ObS) r7
            java.lang.Object r3 = r6.A01
            java.lang.Object r2 = r6.A03
            java.lang.Object r1 = r6.A02
            r0 = 2
        L_0x0270:
            X.OmL r4 = new X.OmL
            r4.<init>(r0, r2, r3, r1)
            goto L_0x02cc
        L_0x0276:
            r1 = 0
            X.0qQ.A0B(r7, r1)
            boolean r0 = r7 instanceof X.N0I
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r6.A03
            X.OHi r0 = (X.C70713OHi) r0
            X.NUY r0 = r0.A05
            r0.A08()
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.NTb r0 = X.C68689NTb.A00
        L_0x028d:
            r5.A02(r0)
            r5.A00()
            goto L_0x034e
        L_0x0295:
            java.lang.Object r4 = r6.A02
            X.1a8 r4 = (X.1a8) r4
            java.lang.Object r3 = r6.A03
            X.OHi r3 = (X.C70713OHi) r3
            X.0qQ.A0B(r4, r1)
            X.1aU r2 = r3.A02
            r0 = 27
            X.PqZ r1 = new X.PqZ
            r1.<init>(r3, r0)
            r0 = 1
            X.1aU r1 = X.C72168Oxd.A00(r2, r4, r1, r0)
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            r0 = 2
            X.PU9.A00(r1, r4, r5, r3, r0)
            goto L_0x034e
        L_0x02b8:
            X.OOB r7 = (X.OOB) r7
            X.Njv r0 = X.C69356Njv.A08
            X.ObS r7 = r7.A04(r0)
            java.lang.Object r3 = r6.A01
            java.lang.Object r2 = r6.A02
            java.lang.Object r1 = r6.A03
            r0 = 1
            X.OmL r4 = new X.OmL
            r4.<init>(r0, r1, r3, r2)
        L_0x02cc:
            r7.A04(r4)
            return
        L_0x02d0:
            X.NoH r7 = (X.C69573NoH) r7
            X.NTj r0 = X.C68697NTj.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0327
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.NTX r0 = X.NTX.A00
            r5.A02(r0)
            java.lang.Object r4 = r6.A03
            X.OHi r4 = (X.C70713OHi) r4
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.OyT r0 = (X.C72203OyT) r0
            boolean r0 = r0.A08()
            java.lang.Object r3 = r6.A02
            X.1a8 r3 = (X.1a8) r3
            if (r0 == 0) goto L_0x030f
            X.0qQ.A0A(r5)
            r1 = 2
            X.Oxe r0 = new X.Oxe
            r0.<init>((X.1a8) r3, (X.C70713OHi) r4, (int) r1)
            X.1aU r0 = X.1aU.A06(r0)
            X.PUC r2 = new X.PUC
            r2.<init>((X.AnonymousClass67Z) r5, (X.1a8) r3, (X.C70713OHi) r4, (int) r1)
        L_0x030b:
            r3.A02(r0, r2)
            return
        L_0x030f:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.1aU r2 = r4.A02
            r1 = 27
            X.PqZ r0 = new X.PqZ
            r0.<init>(r4, r1)
            r1 = 1
            X.1aU r0 = X.C72168Oxd.A00(r2, r3, r0, r1)
            X.PU9 r2 = new X.PU9
            r2.<init>(r1, r5, r4)
            goto L_0x030b
        L_0x0327:
            boolean r0 = r7 instanceof X.C68698NTk
            java.lang.String r2 = "Failed to save to cloud prefs"
            if (r0 == 0) goto L_0x0352
            X.NTk r7 = (X.C68698NTk) r7
            java.lang.Exception r0 = r7.A00
        L_0x0331:
            X.NTW r3 = new X.NTW
            r3.<init>(r0, r2)
            java.lang.Object r0 = r6.A03
            X.OHi r0 = (X.C70713OHi) r0
            X.NUY r1 = r0.A05
            java.util.List r0 = r1.A00
            r0.add(r2)
            r1.A0H()
        L_0x0344:
            java.lang.Object r5 = r6.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
        L_0x0348:
            X.0qQ.A0A(r5)
            r5.A02(r3)
        L_0x034e:
            r5.A00()
            return
        L_0x0352:
            r0 = 0
            goto L_0x0331
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUC.accept(java.lang.Object):void");
    }

    public PUC(AnonymousClass67Z r1, 1a8 r2, C70713OHi oHi, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = r1;
                this.A03 = oHi;
                break;
            case 1:
                this.A01 = r1;
                this.A02 = r2;
                this.A03 = oHi;
                break;
            default:
                this.A03 = oHi;
                this.A01 = r1;
                break;
        }
        this.A02 = r2;
    }

    public PUC(AnonymousClass67Z r1, 1a8 r2, OO6 oo6, int i) {
        this.A00 = i;
        switch (i) {
            case 4:
                this.A01 = r1;
                this.A03 = oo6;
                break;
            case 5:
                this.A01 = r1;
                this.A03 = r2;
                this.A02 = oo6;
                break;
            default:
                this.A03 = oo6;
                this.A01 = r1;
                break;
        }
        this.A02 = r2;
    }
}
