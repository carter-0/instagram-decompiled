package X;

import android.app.Dialog;

public final class E86 extends C361158fl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public E86(AnonymousClass4DH r1, C229382nI r2, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A02 = r1;
            this.A01 = r2;
        } else {
            this.A02 = r2;
            this.A01 = r1;
        }
    }

    public static void A00(E86 e86, Object obj) {
        C46620Di0 di0 = (C46620Di0) obj;
        0qQ.A0B(di0, 0);
        C48382Edd.A00((C229382nI) e86.A01, di0);
    }

    public static void A01(C360678ey r1, Object obj, Object obj2, int i) {
        r1.A00(new E86(i, obj, obj2));
    }

    public final void A03() {
        Dialog dialog;
        Object obj;
        switch (this.A00) {
            case 4:
                I72.A00 = false;
                return;
            case 5:
            case 6:
            case 17:
                obj = this.A02;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                obj = this.A01;
                break;
            case 13:
                dialog = (Dialog) this.A01;
                if (dialog == null) {
                    return;
                }
                break;
            case 15:
                ((C49602EzL) this.A01).A00 = false;
                return;
            case 20:
                C49912FEk.A00 = false;
                return;
            case 26:
                ((0SM) this.A01).A08();
                return;
            default:
                super.A03();
                return;
        }
        dialog = (Dialog) obj;
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012a, code lost:
        X.C59689JTv.A0F(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0169, code lost:
        X.C59689JTv.A0E(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        if (r1 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        X.0wb.A06(r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c5, code lost:
        X.0wb.A03(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C268654dm r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0005;
                case 2: goto L_0x018e;
                case 3: goto L_0x0074;
                case 4: goto L_0x016d;
                case 5: goto L_0x01b7;
                case 6: goto L_0x0005;
                case 7: goto L_0x015f;
                case 8: goto L_0x0154;
                case 9: goto L_0x015f;
                case 10: goto L_0x0154;
                case 11: goto L_0x0006;
                case 12: goto L_0x0005;
                case 13: goto L_0x0133;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0117;
                case 17: goto L_0x0101;
                case 18: goto L_0x00fb;
                case 19: goto L_0x00f5;
                case 20: goto L_0x0005;
                case 21: goto L_0x018e;
                case 22: goto L_0x018e;
                case 23: goto L_0x018e;
                case 24: goto L_0x00eb;
                case 25: goto L_0x00df;
                case 26: goto L_0x00a9;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r3 = r7.A02
            X.FGH r3 = (X.FGH) r3
            java.util.concurrent.atomic.AtomicBoolean r5 = r3.A0F
            boolean r0 = r5.get()
            if (r0 == 0) goto L_0x001b
            r0 = 1
            r5.compareAndSet(r0, r6)
            return
        L_0x001b:
            X.02m r4 = r3.A04
            java.lang.String r0 = "qpl"
            if (r4 != 0) goto L_0x0029
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            r2 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r1 = "1"
            r0 = 1535(0x5ff, float:2.151E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r1)
            r4.markerPoint(r2, r6, r0)
            java.lang.Throwable r0 = r8.A01()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r1 = "unknown"
        L_0x0049:
            java.lang.String r0 = "failure_reason"
            r4.markerAnnotate(r2, r0, r1)
            android.os.Handler r1 = r3.A0A
            java.lang.Runnable r0 = r3.A0E
            r1.removeCallbacks(r0)
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x0005
            X.0eM r0 = r3.A0G
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x01c9
            X.0Tu r2 = X.0Tu.A06
            r0 = 18309969568870442(0x410cd20000302a, double:1.896884291884753E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x01c9
            X.FGH.A01(r3)
            return
        L_0x0074:
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r5 = r7.A02
            X.FBc r5 = (X.C49878FBc) r5
            r5.A03()
            java.lang.String r4 = r8.toString()
            boolean r0 = r5 instanceof X.ELU
            if (r0 == 0) goto L_0x0005
            X.ELU r5 = (X.ELU) r5
            X.0qQ.A0B(r4, r1)
            X.FYz r3 = r5.A01
            java.lang.String r2 = r5.A05
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "initial_async_controller_request_error"
            X.C50342FYz.A00(r3, r0, r4, r2, r1)
            X.02m r2 = r5.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "initial_async_controller_request_failure"
            r2.markerPoint(r1, r0)
            r0 = 87
            r2.markerEnd(r1, r0)
            return
        L_0x00a9:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r7.A02
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            android.content.Context r1 = r0.A0n
            java.lang.String r0 = "status_details_screen_for_overlay_ads_failed"
            X.C59689JTv.A0D(r1, r0)
            java.lang.Throwable r5 = r8.A01()
            java.lang.String r4 = "message"
            r0 = 4323(0x10e3, float:6.058E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r2 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r1 = "Status Details Screen for Overlay Ads failed"
            X.0wj r0 = X.0wj.A01
            X.0f9 r0 = r0.AEf(r3, r2)
            if (r5 == 0) goto L_0x00db
            r0.ABQ(r4, r1)
            r0.ERJ(r5)
        L_0x00d7:
            r0.report()
            return
        L_0x00db:
            r0.ABQ(r4, r1)
            goto L_0x00d7
        L_0x00df:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.C49952FGh.A03(r0, r8)
            return
        L_0x00eb:
            java.lang.Object r2 = r7.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "bloks_error"
            r0 = 2131969781(0x7f1346f5, float:1.9576495E38)
            goto L_0x012a
        L_0x00f5:
            java.lang.Object r0 = r7.A02
            X.DbS.A1U(r0)
            return
        L_0x00fb:
            java.lang.Object r0 = r7.A02
            X.DbS.A1V(r0)
            return
        L_0x0101:
            java.lang.Object r0 = r7.A01
            X.EyH r0 = (X.EyH) r0
            X.E6c r0 = r0.A02
            android.content.Context r2 = r0.getContext()
            r2.getClass()
            r1 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r0 = "open_help_screen_failed"
            X.C59689JTv.A0F(r2, r0, r1)
            return
        L_0x0117:
            java.lang.Object r1 = r7.A02
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            X.2jx r0 = r1.A01
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x012e
            java.lang.String r1 = "business_age_gating_failed"
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
        L_0x012a:
            X.C59689JTv.A0F(r2, r1, r0)
            return
        L_0x012e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0133:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Throwable r2 = r8.A01()
            java.lang.String r3 = "OpenBloksActionHandler Unable to fetch bloks action"
            java.lang.Object r0 = r7.A02
            X.FjQ r0 = (X.C50846FjQ) r0
            if (r2 == 0) goto L_0x014b
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C46436Dey.A00(r1, r0, r3, r2)
            return
        L_0x014b:
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r0 = 0
            X.C46436Dey.A00(r2, r1, r3, r0)
            return
        L_0x0154:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = "open_similar_user_failed"
            goto L_0x0169
        L_0x015f:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = "open_possible_scammer_bottom_sheet"
        L_0x0169:
            X.C59689JTv.A0E(r1, r0)
            return
        L_0x016d:
            r4 = 0
            X.0qQ.A0B(r8, r4)
            java.lang.Object r3 = r7.A01
            X.4DH r3 = (X.AnonymousClass4DH) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x0183
            java.lang.String r1 = "igtv_network_request_generic_load_error"
            r0 = 2131964047(0x7f13308f, float:1.9564865E38)
            X.C59689JTv.A01(r2, r1, r0, r4)
        L_0x0183:
            java.lang.Throwable r1 = r8.A01()
            java.lang.String r2 = "Unable to fetch bloks action"
            java.lang.String r0 = r3.getModuleName()
            goto L_0x01bf
        L_0x018e:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1I(r0)
            return
        L_0x0196:
            java.lang.Object r0 = r7.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Zn r3 = X.1Zm.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0K
            r0 = 0
            X.1Zp r2 = r3.A01(r2, r1, r0)
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1562(0x61a, float:2.189E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A03(r0, r1)
            return
        L_0x01b7:
            java.lang.Throwable r1 = r8.A01()
            java.lang.String r2 = "Unable to fetch bloks action"
            java.lang.String r0 = "DefaultNewsfeedRowDelegate"
        L_0x01bf:
            if (r1 == 0) goto L_0x01c5
            X.0wb.A06(r0, r2, r1)
            return
        L_0x01c5:
            X.0wb.A03(r0, r2)
            return
        L_0x01c9:
            java.lang.String r0 = "failure"
            X.FGH.A02(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E86.A04(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r1 = X.AnonymousClass7TE.A14(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00da, code lost:
        r1 = X.DbT.A0M(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e4, code lost:
        r1 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r1 = (X.C229382nI) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        X.C48382Edd.A00(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A05(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x00e8;
                case 2: goto L_0x01b8;
                case 3: goto L_0x018f;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00b5;
                case 10: goto L_0x00b5;
                case 11: goto L_0x012b;
                case 12: goto L_0x00a8;
                case 13: goto L_0x009b;
                case 14: goto L_0x0098;
                case 15: goto L_0x0098;
                case 16: goto L_0x0005;
                case 17: goto L_0x0081;
                case 18: goto L_0x006a;
                case 19: goto L_0x0122;
                case 20: goto L_0x0048;
                case 21: goto L_0x0117;
                case 22: goto L_0x010c;
                case 23: goto L_0x0101;
                case 24: goto L_0x0035;
                case 25: goto L_0x001f;
                case 26: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A01
        L_0x000b:
            X.2nI r1 = (X.C229382nI) r1
        L_0x000d:
            X.C48382Edd.A00(r1, r8)
        L_0x0010:
            return
        L_0x0011:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A02
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            com.instagram.common.session.UserSession r1 = r0.A0s
            X.4DH r0 = r0.A0q
            goto L_0x00da
        L_0x001f:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A02
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.String r0 = "Password Reset"
            X.2nI r1 = X.DbY.A0L(r1, r2, r0)
            r0 = 1
            r1.A00 = r0
            goto L_0x000d
        L_0x0035:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r2 = r7.A01
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r7.A02
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.String r0 = "pro2pro_framework_ccp_page_link_to_existing_page_flow"
            X.2nI r1 = X.DbY.A0L(r1, r2, r0)
            goto L_0x000d
        L_0x0048:
            X.Di0 r4 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A02
            android.content.Context r3 = X.DbT.A07(r0)
            if (r3 == 0) goto L_0x0010
            java.lang.Object r2 = r7.A01
            X.2nI r2 = (X.C229382nI) r2
            X.0sm r1 = X.0Yt.A0E()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.4uI r0 = r4.A02
            if (r0 == 0) goto L_0x0010
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C307886Rw.A02(r3, r4, r2, r0, r1)
            return
        L_0x006a:
            X.Di0 r8 = (X.C46620Di0) r8
            X.Fri r2 = new X.Fri
            r2.<init>(r7)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A04(r2, r0)
            java.lang.Object r1 = r7.A01
            X.ESU r1 = (X.ESU) r1
            com.instagram.common.session.UserSession r0 = r1.A02
            X.2nI r1 = X.DbT.A0M(r1, r0)
            goto L_0x000d
        L_0x0081:
            X.Di0 r8 = (X.C46620Di0) r8
            java.lang.Object r0 = r7.A01
            X.EyH r0 = (X.EyH) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.E6c r2 = r0.A02
            X.FUq r1 = new X.FUq
            r1.<init>(r7)
            X.2el r0 = r0.A01
            X.2nI r1 = X.C229382nI.A02(r2, r1, r3, r0)
            goto L_0x000d
        L_0x0098:
            X.Di0 r8 = (X.C46620Di0) r8
            goto L_0x00e4
        L_0x009b:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A02
            X.FjQ r0 = (X.C50846FjQ) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.4DH r0 = r0.A00
            goto L_0x00da
        L_0x00a8:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r1 = r7.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x00da
        L_0x00b5:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A02
            X.E6l r0 = (X.C47525E6l) r0
            X.0eM r0 = r0.A06
            goto L_0x00ca
        L_0x00c0:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r0 = r7.A02
            X.E2q r0 = (X.C47444E2q) r0
            X.0eM r0 = r0.A02
        L_0x00ca:
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            goto L_0x000b
        L_0x00d0:
            X.Di0 r8 = (X.C46620Di0) r8
            java.lang.Object r0 = r7.A01
            X.Dd4 r0 = (X.Dd4) r0
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.4DH r0 = r0.A07
        L_0x00da:
            X.2nI r1 = X.DbT.A0M(r0, r1)
            goto L_0x000d
        L_0x00e0:
            X.Di0 r8 = X.DbV.A0Q(r8)
        L_0x00e4:
            java.lang.Object r1 = r7.A02
            goto L_0x000b
        L_0x00e8:
            X.Di0 r8 = X.DbV.A0Q(r8)
            java.lang.Object r3 = r7.A02
            X.0lg r3 = (X.0lg) r3
            java.lang.Object r2 = r7.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r0 = "pro_to_pro.framework.async.controller.entry"
            X.0xG r1 = X.DbS.A0O(r0)
            r0 = 0
            X.2nI r1 = X.C229382nI.A02(r2, r1, r3, r0)
            goto L_0x000d
        L_0x0101:
            A00(r7, r8)
            java.lang.Object r1 = r7.A02
            X.E3l r1 = (X.C47463E3l) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x010c:
            A00(r7, r8)
            java.lang.Object r1 = r7.A02
            X.E3k r1 = (X.C47462E3k) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x0117:
            A00(r7, r8)
            java.lang.Object r1 = r7.A02
            X.E3j r1 = (X.C47461E3j) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x0122:
            A00(r7, r8)
            java.lang.Object r0 = r7.A02
            X.DbS.A1U(r0)
            return
        L_0x012b:
            X.Di0 r8 = (X.C46620Di0) r8
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r4 = r7.A02
            X.FGH r4 = (X.FGH) r4
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0F
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x0142
            r0 = 1
            r1.compareAndSet(r0, r6)
            return
        L_0x0142:
            android.os.Handler r5 = r4.A0A
            java.lang.Runnable r0 = r4.A0E
            r5.removeCallbacks(r0)
            X.02m r3 = r4.A04
            if (r3 != 0) goto L_0x0157
            java.lang.String r0 = "qpl"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            java.lang.String r2 = "1"
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            r0 = 1535(0x5ff, float:2.151E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r2)
            r3.markerPoint(r1, r6, r0)
            java.lang.Object r0 = r7.A01
            X.2nI r0 = (X.C229382nI) r0
            X.C48382Edd.A00(r0, r8)
            boolean r3 = r4.A06
            if (r3 == 0) goto L_0x0182
            X.Fqw r2 = new X.Fqw
            r2.<init>(r4)
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r2, r0)
        L_0x017e:
            X.FGH.A03(r4, r3)
            return
        L_0x0182:
            X.Eyk r2 = r4.A01
            android.os.Handler r1 = r2.A02
            X.FpU r0 = new X.FpU
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x017e
        L_0x018f:
            A00(r7, r8)
            java.lang.Object r5 = r7.A02
            X.FBc r5 = (X.C49878FBc) r5
            boolean r0 = r5 instanceof X.ELT
            if (r0 == 0) goto L_0x019e
            r5.A03()
            return
        L_0x019e:
            X.ELU r5 = (X.ELU) r5
            X.FYz r4 = r5.A01
            java.lang.String r3 = r5.A05
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "initial_async_controller_request_success"
            java.lang.String r0 = ""
            X.C50342FYz.A00(r4, r2, r0, r3, r1)
            X.02m r1 = r5.A00
            r0 = 444800256(0x1a831d00, float:5.422718E-23)
            r1.markerPoint(r0, r2)
            return
        L_0x01b8:
            A00(r7, r8)
            java.lang.Object r1 = r7.A02
            X.E3i r1 = (X.C47460E3i) r1
            r0 = 1
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E86.A05(java.lang.Object):void");
    }

    public E86(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
