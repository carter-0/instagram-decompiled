package X;

/* renamed from: X.Iwl  reason: case insensitive filesystem */
public final class C58738Iwl extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58738Iwl(String str, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ee, code lost:
        if (((java.util.List) r10.A01).isEmpty() == false) goto L_0x01f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x017f;
                case 1: goto L_0x0174;
                case 2: goto L_0x0253;
                case 3: goto L_0x0200;
                case 4: goto L_0x01db;
                case 5: goto L_0x015b;
                case 6: goto L_0x0149;
                case 7: goto L_0x0133;
                case 8: goto L_0x00ce;
                case 9: goto L_0x0072;
                case 10: goto L_0x01a6;
                case 11: goto L_0x005e;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.View r0 = X.C51969G9p.A0O(r11)
            java.lang.Object r5 = r0.getTag()
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r0)
            X.6kx r5 = (X.C316006kx) r5
            java.lang.Object r4 = r10.A01
            X.6aa r4 = (X.C310196aa) r4
            X.4mU r3 = r4.A01
            r0 = r3
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r2 = r0.A0a
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x01a1
            X.3mM r0 = r5.A09
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r0 = r4.A00
            boolean r0 = r2.A0E(r0)
            if (r0 != 0) goto L_0x005b
            X.3uh r4 = r3.Au5()
            if (r4 == 0) goto L_0x019c
            java.lang.String r3 = r10.A02
            if (r3 == 0) goto L_0x0055
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x0197
            java.util.ArrayList r2 = X.1Xj.A0Y(r0)
            if (r2 == 0) goto L_0x0055
            r1 = 30
            X.MYK r0 = new X.MYK
            r0.<init>(r3, r1)
            X.018.A1A(r2, r0)
        L_0x0055:
            X.6mO r1 = r5.A1R
            r0 = 0
            X.AnonymousClass6WX.A00(r4, r1, r0)
        L_0x005b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x005e:
            X.Bjb r11 = (X.C42829Bjb) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.GCg r0 = (X.C52034GCg) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            com.instagram.common.session.UserSession r1 = r0.A0B
            java.lang.String r0 = r10.A02
            X.C48896Elw.A00(r2, r1, r11, r0)
            goto L_0x005b
        L_0x0072:
            boolean r6 = X.AnonymousClass7TE.A1a(r11)
            java.lang.Object r5 = r10.A01
            X.K57 r5 = (X.K57) r5
            android.content.Context r4 = r5.getContext()
            if (r4 == 0) goto L_0x005b
            java.lang.String r3 = r10.A02
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = X.DbS.A0a()
            r0 = 2131955419(0x7f130edb, float:1.9547365E38)
            if (r6 == 0) goto L_0x0090
            r0 = 2131955414(0x7f130ed6, float:1.9547355E38)
        L_0x0090:
            X.DbS.A19(r4, r1, r0)
            r1.A06()
            r0 = 2131238939(0x7f08201b, float:1.809417E38)
            if (r6 == 0) goto L_0x009e
            r0 = 2131238644(0x7f081ef4, float:1.8093573E38)
        L_0x009e:
            r1.A07(r0)
            r1.A02()
            X.DbY.A1K(r2, r1)
            com.instagram.common.session.UserSession r0 = r5.A05()
            X.27r r0 = X.27p.A01(r0)
            X.29O r2 = r0.A06
            X.0wc r0 = r2.A01
            X.1Ln r1 = X.1Ln.A07(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r6 == 0) goto L_0x00c9
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "PIN_APPLIED"
        L_0x00c1:
            X.1Ln r0 = X.C51975G9x.A0T(r1, r2, r0, r3)
            r0.Cgf()
            goto L_0x005b
        L_0x00c9:
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "UNPIN_APPLIED"
            goto L_0x00c1
        L_0x00ce:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto L_0x005b
            java.lang.Object r6 = r10.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r2 = r10.A02
            r0 = 812(0x32c, float:1.138E-42)
            java.lang.String r7 = X.C66579MXk.A00(r0)
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.002.A0R(r2, r0)
            java.io.File r8 = new java.io.File
            r8.<init>(r1, r0)
            r0 = 727(0x2d7, float:1.019E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            r4 = 0
            r1.mkdir()     // Catch:{ IOException -> 0x0123 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0123 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0123 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0123 }
            r0 = 100
            X.0fO.A02(r1, r11, r2, r0)     // Catch:{ IOException -> 0x0123 }
            r2.flush()     // Catch:{ IOException -> 0x0123 }
            r2.close()     // Catch:{ IOException -> 0x0123 }
            r3 = 1
            java.lang.String r0 = r8.toString()     // Catch:{ IOException -> 0x0123 }
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ IOException -> 0x0123 }
            r1 = 0
            X.I9O r0 = X.I9O.A00     // Catch:{ IOException -> 0x0123 }
            android.media.MediaScannerConnection.scanFile(r6, r2, r1, r0)     // Catch:{ IOException -> 0x0123 }
            r5.putExtra(r7, r3)     // Catch:{ IOException -> 0x0123 }
            goto L_0x0126
        L_0x0123:
            r5.putExtra(r7, r4)
        L_0x0126:
            X.0b6 r0 = X.0b6.A00()
            X.0R3 r0 = r0.A07()
            r0.A0C(r6, r5)
            goto L_0x005b
        L_0x0133:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r0 = r10.A01
            X.GwC r0 = (X.C53906GwC) r0
            X.0sP r0 = r0.A02
            java.lang.String r1 = r10.A02
            java.lang.String r2 = java.lang.String.valueOf(r1)
            if (r11 == 0) goto L_0x005b
            X.HHs r1 = new X.HHs
            r1.<init>(r11, r2)
            goto L_0x017a
        L_0x0149:
            X.OFk r11 = (X.C70663OFk) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = r10.A02
            r11.A01 = r0
            java.lang.Object r0 = r10.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.A02 = r0
            goto L_0x005b
        L_0x015b:
            X.5SW r11 = (X.AnonymousClass5SW) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = r10.A02
            X.C285645Sc.A03(r11, r0)
            java.lang.Object r1 = r10.A01
            r0 = 34
            X.Ivv r1 = X.C58686Ivv.A00(r1, r0)
            r0 = 0
            X.C285645Sc.A04(r11, r0, r1)
            goto L_0x005b
        L_0x0174:
            java.lang.Object r0 = r10.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.String r1 = r10.A02
        L_0x017a:
            r0.invoke(r1)
            goto L_0x005b
        L_0x017f:
            X.Oq3 r11 = (X.C71743Oq3) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r0 = r10.A02
            X.PPN r1 = new X.PPN
            r1.<init>(r11, r0)
            java.lang.Object r0 = r10.A01
            X.Nep r0 = (X.C69110Nep) r0
            X.Ocu r0 = r0.A0A
            r0.A03(r1)
            goto L_0x005b
        L_0x0197:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r1)
            throw r0
        L_0x019c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01a6:
            X.2Uy r11 = (X.C70762Uy) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            android.view.MotionEvent r4 = r11.A00
            X.0qQ.A0A(r4)
            X.0qQ.A0B(r4, r0)
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x01d9
            java.lang.Object r0 = r10.A01
            X.GHU r0 = (X.GHU) r0
            X.JTB r3 = r0.A07
            X.4bN r2 = r0.A02
            com.instagram.common.session.UserSession r0 = r0.A04
            com.instagram.user.model.User r1 = r2.A08(r0)
            java.lang.String r0 = r10.A02
            android.view.View$OnTouchListener r1 = r3.Da7(r2, r1, r0)
            android.view.View r0 = r11.A01
            boolean r0 = r1.onTouch(r0, r4)
        L_0x01d4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x01d9:
            r0 = 0
            goto L_0x01d4
        L_0x01db:
            X.Gmj r11 = (X.C53359Gmj) r11
            r4 = 0
            X.0qQ.A0B(r11, r4)
            java.lang.String r1 = r10.A02
            if (r1 != 0) goto L_0x01f0
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r6 = 1
            if (r0 != 0) goto L_0x01f1
        L_0x01f0:
            r6 = 0
        L_0x01f1:
            boolean r9 = X.DbW.A1a(r1)
            boolean r7 = r11.A01
            r3 = 1
            X.Gmj r2 = new X.Gmj
            r5 = r4
            r8 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0200:
            X.ULE r11 = (X.ULE) r11
            r6 = 0
            X.0qQ.A0B(r11, r6)
            java.lang.Object r5 = r10.A01
            X.JwE r5 = (X.C61076JwE) r5
            java.lang.String r4 = r10.A02
            X.AnonymousClass7TG.A1O(r5, r4)
            java.util.List r3 = r11.A04
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
        L_0x0216:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r1.next()
            X.N3k r0 = (X.C68169N3k) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x022e
            int r2 = r2 + 1
            goto L_0x0216
        L_0x022d:
            r2 = -1
        L_0x022e:
            java.util.List r1 = r3.subList(r6, r2)
            java.lang.Object r0 = r5.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            int r0 = r2 + 1
            java.util.List r0 = X.C51969G9p.A0v(r3, r0)
            java.util.ArrayList r3 = X.00k.A0S(r0, r1)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r1 = r11.A01
            X.Jw0 r0 = r11.A00
            java.util.List r4 = r11.A03
            boolean r5 = r11.A05
            java.lang.String r2 = r11.A02
            X.ULE r2 = X.ULE.A00(r0, r1, r2, r3, r4, r5)
            return r2
        L_0x0253:
            X.Vd2 r11 = (X.C17733Vd2) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            X.1NY r2 = X.DbU.A0M(r0)
            java.lang.Class<X.NfY> r1 = X.C69149NfY.class
            java.lang.Class<X.OR2> r0 = X.OR2.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = r10.A02
            r0 = 134(0x86, float:1.88E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r0, r1)
            X.C18242Vo9.A01(r2, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58738Iwl.invoke(java.lang.Object):java.lang.Object");
    }
}
