package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fkb  reason: case insensitive filesystem */
public final class C50896Fkb implements C230222pE {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public C50896Fkb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Activity activity, RectF rectF, AnonymousClass32A r4, Object obj, int i) {
        r4.A05 = new C16165Upq(activity, rectF, (C230222pE) new C50896Fkb(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        X.0fE.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r0 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c6, code lost:
        ((X.2Rw) r0.getValue()).notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFj(com.instagram.model.reels.Reel r3, X.AnonymousClass6UY r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x00f0;
                case 1: goto L_0x009c;
                case 2: goto L_0x007e;
                case 3: goto L_0x005c;
                case 4: goto L_0x00da;
                case 5: goto L_0x0051;
                case 6: goto L_0x00d0;
                case 7: goto L_0x000b;
                case 8: goto L_0x0041;
                case 9: goto L_0x00c0;
                case 10: goto L_0x0005;
                case 11: goto L_0x00b9;
                case 12: goto L_0x00b2;
                case 13: goto L_0x0032;
                case 14: goto L_0x0090;
                case 15: goto L_0x002b;
                case 16: goto L_0x001c;
                case 17: goto L_0x0015;
                case 18: goto L_0x0005;
                case 19: goto L_0x00a8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r2.A01
            X.E6Z r0 = (X.E6Z) r0
            X.E91 r1 = r0.A02
            r0 = -283925022(0xffffffffef13a5e2, float:-4.5694836E28)
            goto L_0x003d
        L_0x0015:
            java.lang.Object r0 = r2.A01
            X.E6i r0 = (X.C47522E6i) r0
            X.E9N r0 = r0.A0A
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = r2.A01
            X.Der r0 = (X.C46430Der) r0
            X.Dex r1 = r0.A0E
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "followListAdapter"
            goto L_0x0088
        L_0x0027:
            r0 = -1884431246(0xffffffff8faddc72, float:-1.714403E-29)
            goto L_0x003d
        L_0x002b:
            java.lang.Object r0 = r2.A01
            X.E6d r0 = (X.C47519E6d) r0
            X.E9N r0 = r0.A00
            goto L_0x0057
        L_0x0032:
            java.lang.Object r0 = r2.A01
            X.E6a r0 = (X.E6a) r0
            X.E8z r1 = r0.A02
            if (r1 == 0) goto L_0x0059
            r0 = -461356147(0xffffffffe480438d, float:-1.8928406E22)
        L_0x003d:
            X.0fE.A00(r1, r0)
            return
        L_0x0041:
            java.lang.Object r0 = r2.A01
            X.EHF r0 = (X.EHF) r0
            X.4DH r1 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.fragment.ClickableCategoryFragment"
            X.0qQ.A0C(r1, r0)
            X.E1U r1 = (X.E1U) r1
            X.2t9 r0 = r1.A01
            goto L_0x0057
        L_0x0051:
            java.lang.Object r0 = r2.A01
            X.E64 r0 = (X.E64) r0
            X.2t9 r0 = r0.A01
        L_0x0057:
            if (r0 != 0) goto L_0x0098
        L_0x0059:
            java.lang.String r0 = "adapter"
            goto L_0x0088
        L_0x005c:
            java.lang.Object r1 = r2.A01
            X.ELQ r1 = (X.ELQ) r1
            boolean r0 = r1 instanceof X.EKJ
            if (r0 == 0) goto L_0x006f
            X.EKJ r1 = (X.EKJ) r1
            X.E6e r0 = r1.A00
            X.E9M r0 = r0.A01
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "oneCategoryAdapter"
            goto L_0x0088
        L_0x006f:
            boolean r0 = r1 instanceof X.EKI
            if (r0 == 0) goto L_0x000a
            X.EKI r1 = (X.EKI) r1
            X.E6m r0 = r1.A00
            X.E9L r0 = r0.A00
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "accountDiscoveryAdapter"
            goto L_0x0088
        L_0x007e:
            java.lang.Object r0 = r2.A01
            X.E6o r0 = (X.C47528E6o) r0
            X.E9N r0 = r0.A03
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "userListAdapter"
        L_0x0088:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0090:
            java.lang.Object r0 = r2.A01
            X.E6n r0 = (X.C47527E6n) r0
            X.E9N r0 = r0.A00
            if (r0 == 0) goto L_0x000a
        L_0x0098:
            r0.notifyDataSetChanged()
            return
        L_0x009c:
            java.lang.Object r0 = r2.A01
            X.MaJ r0 = (X.C66650MaJ) r0
            java.lang.Runnable r0 = r0.A03
            if (r0 == 0) goto L_0x000a
            r0.run()
            return
        L_0x00a8:
            java.lang.Object r0 = r2.A01
            X.FkH r0 = (X.FkH) r0
            X.E5d r0 = r0.A00
            X.C47498E5d.A01(r0)
            return
        L_0x00b2:
            java.lang.Object r0 = r2.A01
            X.K7c r0 = (X.C61427K7c) r0
            X.0eM r0 = r0.A07
            goto L_0x00c6
        L_0x00b9:
            java.lang.Object r0 = r2.A01
            X.K7b r0 = (X.K7b) r0
            X.0eM r0 = r0.A0A
            goto L_0x00c6
        L_0x00c0:
            java.lang.Object r0 = r2.A01
            X.K7U r0 = (X.K7U) r0
            X.0eM r0 = r0.A02
        L_0x00c6:
            java.lang.Object r0 = r0.getValue()
            X.2Rw r0 = (X.2Rw) r0
            r0.notifyDataSetChanged()
            return
        L_0x00d0:
            java.lang.Object r0 = r2.A01
            X.Dd4 r0 = (X.Dd4) r0
            X.G5x r0 = r0.A0D
            r0.Dcm()
            return
        L_0x00da:
            java.lang.Object r0 = r2.A01
            X.E7M r0 = (X.E7M) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.DlY r0 = (X.C46797DlY) r0
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r0 = r0.A03
            X.0V2 r1 = r0.A08
            X.0gF r0 = X.C60340gF.A00
            r1.FIA(r0)
            return
        L_0x00f0:
            java.lang.Object r0 = r2.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            X.EIn r0 = r0.A0J
            r0.notifyDataSetChanged()
            return
        L_0x00fa:
            X.E9M.A00(r0)
            return
        L_0x00fe:
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50896Fkb.DFj(com.instagram.model.reels.Reel, X.6UY):void");
    }
}
