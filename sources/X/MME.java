package X;

public final class MME extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MME(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new MME(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        X.C51968G9o.A1O(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0167, code lost:
        r0 = X.C273654mx.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x017c, code lost:
        return java.lang.Boolean.valueOf(X.DbT.A1X(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ef, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0209;
                case 1: goto L_0x021e;
                case 2: goto L_0x0202;
                case 3: goto L_0x0005;
                case 4: goto L_0x01f0;
                case 5: goto L_0x021e;
                case 6: goto L_0x0202;
                case 7: goto L_0x0005;
                case 8: goto L_0x01e3;
                case 9: goto L_0x021e;
                case 10: goto L_0x0202;
                case 11: goto L_0x0005;
                case 12: goto L_0x01bc;
                case 13: goto L_0x01b6;
                case 14: goto L_0x01ad;
                case 15: goto L_0x021e;
                case 16: goto L_0x0202;
                case 17: goto L_0x0005;
                case 18: goto L_0x019b;
                case 19: goto L_0x018c;
                case 20: goto L_0x017d;
                case 21: goto L_0x016c;
                case 22: goto L_0x015f;
                case 23: goto L_0x0156;
                case 24: goto L_0x014d;
                case 25: goto L_0x0138;
                case 26: goto L_0x012d;
                case 27: goto L_0x021e;
                case 28: goto L_0x0202;
                case 29: goto L_0x0005;
                case 30: goto L_0x011d;
                case 31: goto L_0x00f1;
                case 32: goto L_0x021e;
                case 33: goto L_0x00e4;
                case 34: goto L_0x01b6;
                case 35: goto L_0x01b6;
                case 36: goto L_0x00da;
                case 37: goto L_0x00da;
                case 38: goto L_0x00cf;
                case 39: goto L_0x009b;
                case 40: goto L_0x0089;
                case 41: goto L_0x0077;
                case 42: goto L_0x0067;
                case 43: goto L_0x021e;
                case 44: goto L_0x0202;
                case 45: goto L_0x0005;
                case 46: goto L_0x004b;
                case 47: goto L_0x0041;
                case 48: goto L_0x003b;
                case 49: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x000c:
            java.lang.Object r2 = r11.A01
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            X.I46 r0 = r2.A09
            X.5dh r0 = r0.A03
            int r0 = r0.BI6()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.5Oz r0 = r2.A0H
            java.lang.Object r0 = r0.getValue()
            X.JL7 r0 = (X.JL7) r0
            X.IGW r0 = (X.IGW) r0
            java.util.List r0 = r0.A0C
            java.lang.Object r0 = X.00k.A0L(r0)
            X.MW2 r0 = (X.MW2) r0
            if (r0 == 0) goto L_0x0039
            X.IFG r0 = (X.IFG) r0
            int r0 = r0.A08
        L_0x0034:
            X.0eP r5 = X.AnonymousClass7TF.A0x(r1, r0)
            return r5
        L_0x0039:
            r0 = 0
            goto L_0x0034
        L_0x003b:
            java.lang.Object r1 = r11.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
            goto L_0x0046
        L_0x0041:
            java.lang.Object r1 = r11.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 1
        L_0x0046:
            X.C51968G9o.A1O(r1, r0)
            goto L_0x01ed
        L_0x004b:
            java.lang.Object r4 = r11.A01
            X.H0y r4 = (X.C54154H0y) r4
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = r4.A02
            android.content.Context r1 = r4.requireContext()
            r0 = 171(0xab, float:2.4E-43)
            int r0 = X.DbS.A02(r1, r0)
            X.H6S r5 = new X.H6S
            r5.<init>(r4, r3, r2, r0)
            return r5
        L_0x0067:
            java.lang.Object r1 = r11.A01
            X.H0y r1 = (X.C54154H0y) r1
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VgC r5 = new X.VgC
            r5.<init>(r1, r0)
            return r5
        L_0x0077:
            java.lang.Object r0 = r11.A01
            X.H0y r0 = (X.C54154H0y) r0
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.GhW r1 = (X.C53040GhW) r1
            r0 = 0
            r1.A05(r0)
            goto L_0x01ed
        L_0x0089:
            java.lang.Object r0 = r11.A01
            X.H0y r0 = (X.C54154H0y) r0
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.GhW r1 = (X.C53040GhW) r1
            r0 = 1
            r1.A06(r0)
            goto L_0x01ed
        L_0x009b:
            android.view.animation.Interpolator r0 = X.C338507i4.A07
            java.lang.Object r2 = r11.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r0 = r2.requireContext()
            X.7i4 r5 = new X.7i4
            r5.<init>(r0)
            android.content.Context r1 = r2.requireContext()
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.0nA.A00(r1, r0)
            r5.A00(r0)
            android.content.Context r0 = r2.requireContext()
            int r0 = X.AnonymousClass7TE.A09(r0)
            int[] r0 = new int[]{r0}
            r5.A05(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.A02(r0)
            r5.stop()
            return r5
        L_0x00cf:
            java.lang.Object r1 = r11.A01
            X.H0y r1 = (X.C54154H0y) r1
            X.28D r0 = X.28D.A5L
            X.C54154H0y.A01(r0, r1)
            goto L_0x01ed
        L_0x00da:
            java.lang.Object r1 = r11.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
            X.C51967G9n.A16(r1, r0)
            goto L_0x01ed
        L_0x00e4:
            java.lang.Object r0 = r11.A01
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = (androidx.compose.foundation.lazy.grid.LazyGridState) r0
            boolean r0 = r0.CbH()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x00f1:
            java.lang.Object r2 = r11.A01
            X.K65 r2 = (X.K65) r2
            android.os.Bundle r1 = r2.requireArguments()
            r0 = 3437(0xd6d, float:4.816E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r10 = X.DbT.A1X(r1, r0)
            X.0eM r0 = r2.A07
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0xx r6 = X.DbV.A0J(r2)
            java.lang.String r8 = r2.getModuleName()
            X.0eM r0 = r2.A04
            boolean r9 = X.AnonymousClass7TF.A1Z(r0)
            X.KEE r5 = new X.KEE
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x011d:
            java.lang.Object r1 = r11.A01
            X.K65 r1 = (X.K65) r1
            X.0eM r0 = r1.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VgC r5 = new X.VgC
            r5.<init>(r1, r0)
            return r5
        L_0x012d:
            java.lang.Object r0 = r11.A01
            X.Jj7 r0 = X.JTU.A0C(r0)
            r0.A02()
            goto L_0x01ed
        L_0x0138:
            java.lang.Object r0 = r11.A01
            X.K65 r0 = (X.K65) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r1 = 31799936(0x1e53a80, float:8.420526E-38)
            java.lang.String r0 = "archive"
            X.Dbx r5 = new X.Dbx
            r5.<init>(r2, r0, r1)
            return r5
        L_0x014d:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0167
        L_0x0156:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 81
            goto L_0x0167
        L_0x015f:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 768(0x300, float:1.076E-42)
        L_0x0167:
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0174
        L_0x016c:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "hide_privacy_footer"
        L_0x0174:
            boolean r0 = X.DbT.A1X(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x017d:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.String r1 = "edit_highlights_reel_id"
            java.lang.String r0 = "placeholder"
            java.lang.String r5 = r2.getString(r1, r0)
            return r5
        L_0x018c:
            java.lang.Object r0 = r11.A01
            X.K65 r0 = (X.K65) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.WT0 r5 = X.WT0.A00(r0)
            return r5
        L_0x019b:
            java.lang.Object r2 = r11.A01
            X.K68 r2 = (X.K68) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.api.schemas.HighlightReelTypeStr r0 = r2.A00
            X.KCT r5 = new X.KCT
            r5.<init>(r0, r1)
            return r5
        L_0x01ad:
            java.lang.Object r0 = r11.A01
            X.6rQ r0 = (X.C319906rQ) r0
            X.6pZ r0 = (X.C318806pZ) r0
            X.3BT r5 = r0.A00
            return r5
        L_0x01b6:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            goto L_0x01ed
        L_0x01bc:
            java.lang.Object r1 = r11.A01
            X.K6p r1 = (X.C61418K6p) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x01e1
            android.content.Context r1 = r0.getApplicationContext()
        L_0x01d0:
            r0 = 29
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.app.Application r1 = (android.app.Application) r1
            X.KCS r5 = new X.KCS
            r5.<init>(r1, r2)
            return r5
        L_0x01e1:
            r1 = 0
            goto L_0x01d0
        L_0x01e3:
            java.lang.Object r0 = r11.A01
            X.K6p r0 = (X.C61418K6p) r0
            X.Lcv r1 = r0.A00
            r0 = 0
            r1.D6h(r0)
        L_0x01ed:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x01f0:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "HIDE_FROM_PROFILE_GRID"
            boolean r0 = r1.getBoolean(r0)
            X.KBP r5 = new X.KBP
            r5.<init>(r0)
            return r5
        L_0x0202:
            java.lang.Object r0 = r11.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x0209:
            java.lang.Object r2 = r11.A01
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment r2 = (com.instagram.archive.fragment.ArchiveReelRecycleBinFragment) r2
            X.0eM r0 = r2.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r5 = new X.32A
            r5.<init>(r2, r1, r0)
            return r5
        L_0x021e:
            java.lang.Object r5 = r11.A01
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MME.invoke():java.lang.Object");
    }
}
