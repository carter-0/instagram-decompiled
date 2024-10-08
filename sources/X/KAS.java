package X;

import com.instagram.pendingmedia.model.constants.ShareType;

public final class KAS extends 1P0 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public KAS(Object obj, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    public final void onFail(C268654dm r8) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1606834000);
            C56911IHg iHg = (C56911IHg) this.A01;
            C64189LSw.A03(iHg.A0A, ShareType.FOLLOWERS_SHARE, "feed_share_later", (String) null, this.A02);
            iHg.A0E.A49(AnonymousClass3YP.NOT_SHARED);
            C59689JTv.A0F(iHg.A04.getContext(), AnonymousClass000.A00(287), 2131962363);
            i = 303964715;
        } else {
            A032 = AnonymousClass0fD.A03(86741630);
            C61738KKd kKd = ((L6D) this.A01).A01;
            0sn r2 = 0sn.A00;
            kKd.A0L(this.A02, r2, r2, false);
            i = -1448887604;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        if (this.A00 != 0) {
            KAS.super.onStart();
            return;
        }
        int A032 = AnonymousClass0fD.A03(-39604829);
        C61738KKd kKd = ((L6D) this.A01).A01;
        kKd.A05 = false;
        27p.A01(kKd.A0A);
        AnonymousClass0fD.A0A(691734611, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            if (r0 == 0) goto L_0x0088
            r0 = 1252926281(0x4aae2349, float:5706148.5)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 689353820(0x2916b45c, float:3.3463128E-14)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r9 = r10.A01
            X.IHg r9 = (X.C56911IHg) r9
            com.instagram.common.session.UserSession r4 = r9.A0A
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            java.lang.String r2 = r10.A02
            java.lang.String r1 = "feed_share_later"
            r0 = 0
            X.C64189LSw.A04(r4, r3, r1, r0, r2)
            X.1Xj r2 = r9.A0E
            X.3YP r0 = X.AnonymousClass3YP.SHARED
            r2.A49(r0)
            boolean r8 = r10.A03
            X.8jd r1 = X.C363388je.A00(r4)
            com.facebook.common.callercontext.CallerContext r0 = r9.A08
            X.5wF r0 = r1.A00(r0)
            java.lang.String r5 = r0.A05
            com.instagram.common.typedurl.ImageUrl r4 = r2.A1Q()
            X.6ap r3 = X.DbS.A0a()
            r2 = 0
            androidx.fragment.app.Fragment r0 = r9.A04
            android.content.Context r1 = r0.getContext()
            if (r8 == 0) goto L_0x0082
            if (r1 == 0) goto L_0x0051
            r0 = 2131962367(0x7f1329ff, float:1.9561457E38)
        L_0x004d:
            java.lang.String r2 = r1.getString(r0)
        L_0x0051:
            r3.A0D = r2
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x0077
            X.6ar r0 = X.C310356ar.CIRCULAR
            r3.A0B(r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r5)
        L_0x0062:
            r3.A09 = r0
            r3.A06()
        L_0x0067:
            X.Dbb.A1Q(r3)
            r0 = 27775424(0x1a7d1c0, float:6.164709E-38)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1867919512(0xffffffff90a9cf68, float:-6.6978306E-29)
        L_0x0073:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0077:
            if (r4 == 0) goto L_0x0067
            r3.A03()
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r4)
            goto L_0x0062
        L_0x0082:
            if (r1 == 0) goto L_0x0051
            r0 = 2131962366(0x7f1329fe, float:1.9561455E38)
            goto L_0x004d
        L_0x0088:
            r0 = -617570082(0xffffffffdb30a0de, float:-4.9716471E16)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.K1g r11 = (X.C61293K1g) r11
            r0 = 2095246901(0x7ce2ee35, float:9.426324E36)
            int r5 = X.AnonymousClass7TG.A0D(r11, r0)
            X.Kot r0 = r11.A01
            java.util.List r0 = r0.A04
            java.util.List r0 = X.JTR.A16(r0)
            X.0qQ.A07(r0)
            java.lang.Object r1 = r10.A01
            X.L6D r1 = (X.L6D) r1
            java.lang.String r4 = r10.A02
            android.util.Pair r0 = X.C63281KuQ.A00(r0)
            java.lang.Object r3 = r0.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.second
            java.util.List r2 = (java.util.List) r2
            X.KKd r1 = r1.A01
            X.0qQ.A0A(r3)
            X.0qQ.A0A(r2)
            r0 = 1
            r1.A0L(r4, r3, r2, r0)
            r0 = 1721294785(0x6698dfc1, float:3.6096362E23)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1417007691(0x5475d24b, float:4.22318047E12)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KAS.onSuccess(java.lang.Object):void");
    }
}
