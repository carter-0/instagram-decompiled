package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.save.model.SavedCollection;

public final class H4V extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public H4V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, boolean z) {
        this.A00 = i;
        this.A05 = obj2;
        this.A06 = str;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A07 = z;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r7) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-991414495);
            C64189LSw.A03((UserSession) this.A05, ShareType.FOLLOWERS_SHARE, "likes_sheet", (String) null, this.A06);
            ((1Xj) this.A04).A49(AnonymousClass3YP.NOT_SHARED);
            C64374Laq.A04(((LB7) this.A03).A08, false);
            ((C47522E6i) this.A02).A03();
            C59689JTv.A01((Context) this.A01, AnonymousClass000.A00(287), 2131962363, 0);
            i = -823377475;
        } else {
            A032 = AnonymousClass0fD.A03(-236480805);
            I6V.A01(((C56561I1p) this.A01).A00, ((SavedCollection) this.A02).A0G, AnonymousClass7TF.A1W(this.A05, AnonymousClass05K.A00));
            i = 529987787;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.Hj6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d8, code lost:
        if (r4.A0F.equals(r9.A06) == false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r9.A00
            if (r0 == 0) goto L_0x0067
            r0 = 803758495(0x2fe8619f, float:4.2269918E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1268873668(0xffffffffb45e863c, float:-2.0724195E-7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r9.A05
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            java.lang.String r2 = r9.A06
            java.lang.String r1 = "likes_sheet"
            r0 = 0
            X.C64189LSw.A04(r6, r5, r1, r0, r2)
            java.lang.Object r1 = r9.A04
            X.1Xj r1 = (X.1Xj) r1
            X.3YP r0 = X.AnonymousClass3YP.SHARED
            r1.A49(r0)
            java.lang.Object r0 = r9.A03
            X.LB7 r0 = (X.LB7) r0
            com.instagram.igds.components.button.IgdsButton r1 = r0.A08
            r0 = 0
            X.C64374Laq.A04(r1, r0)
            java.lang.Object r0 = r9.A02
            X.E6i r0 = (X.C47522E6i) r0
            r0.A03()
            boolean r0 = r9.A07
            r2 = 2131962362(0x7f1329fa, float:1.9561447E38)
            if (r0 == 0) goto L_0x0046
            r2 = 2131962361(0x7f1329f9, float:1.9561445E38)
        L_0x0046:
            java.lang.Object r0 = r9.A01
            android.content.Context r0 = (android.content.Context) r0
            X.6ap r1 = X.DbS.A0a()
            X.DbS.A19(r0, r1, r2)
            r0 = 1
            r1.A0O = r0
            r1.A06()
            X.Dbb.A1Q(r1)
            r0 = 262285358(0xfa2282e, float:1.598991E-29)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1128343319(0x43412717, float:193.1527)
        L_0x0063:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0067:
            r0 = -1941760986(0xffffffff8c431426, float:-1.5028317E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1316610019(0xffffffffb186201d, float:-3.903564E-9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r9.A05
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            java.lang.Object r7 = r9.A03
            X.1Xj r7 = (X.1Xj) r7
            java.util.List r1 = r7.A3i()
            java.lang.Object r4 = r9.A02
            com.instagram.save.model.SavedCollection r4 = (com.instagram.save.model.SavedCollection) r4
            java.lang.String r0 = r4.A0F
            if (r6 != r5) goto L_0x010e
            r1.add(r0)
            X.1Xj r0 = r4.A04
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = r7.getId()
            r4.A0H = r0
            r4.A04 = r7
        L_0x0098:
            java.lang.Object r8 = r9.A01
            X.I1p r8 = (X.C56561I1p) r8
            X.1Ng r13 = r8.A01
            X.Hj6 r12 = new X.Hj6
            r12.<init>()
            r12.A00 = r7
            java.lang.String r11 = r4.A0F
            X.HMw r10 = r4.A07
            boolean r1 = r9.A07
            X.INo r0 = new X.INo
            r0.<init>(r12, r10, r11, r1)
            r13.A00(r0)
            r0 = 9
            X.IVl r10 = new X.IVl
            r10.<init>(r9, r0)
            X.4DU r0 = r8.A03
            r0.getClass()
            java.lang.String r1 = r0.getModuleName()
            r0 = 285(0x11d, float:4.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = r9.A06
            boolean r0 = r1.equals(r0)
            r14 = 0
            if (r0 != 0) goto L_0x00db
        L_0x00da:
            r14 = 1
        L_0x00db:
            androidx.fragment.app.FragmentActivity r8 = r8.A00
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r7.A1n(r8)
            X.HMw r1 = r4.A07
            X.HMw r0 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            if (r1 != r0) goto L_0x010b
            r0 = 2131972558(0x7f1351ce, float:1.9582127E38)
            java.lang.String r12 = r8.getString(r0)
        L_0x00ee:
            r0 = 2131952148(0x7f130214, float:1.954073E38)
            java.lang.String r13 = r8.getString(r0)
            boolean r15 = X.AnonymousClass7TF.A1W(r6, r5)
            r16 = 0
            X.HMw r11 = r4.A07
            X.I6V.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 417788039(0x18e6f087, float:5.9696477E-24)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1760347099(0xffffffff97133c25, float:-4.7574175E-25)
            goto L_0x0063
        L_0x010b:
            java.lang.String r12 = r4.A0G
            goto L_0x00ee
        L_0x010e:
            r1.remove(r0)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4V.onSuccess(java.lang.Object):void");
    }
}
