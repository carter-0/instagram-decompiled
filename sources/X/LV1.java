package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class LV1 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public LV1(UserSession userSession, String str, int i) {
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [X.07Z, X.KXg, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r1 = r0.getActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = X.C63556Kz5.A01;
        r3 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r3 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r0.A03(r1, (X.C267624bv) null, r3, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", (java.lang.String) null, r7, (java.lang.String) null, (java.util.List) null, false, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r1 = "create_from_scratch_cta_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        X.C64372Lao.A00(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r2 = r3.A01;
        r4 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        r0 = X.0qQ.A0K(r1, r0);
        r2 = r3.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        if (r0 == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        r2.DnS();
        r0 = X.JZY.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0118, code lost:
        r2.Dku(r3.A03, r3.A08);
        r0 = X.JZY.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r2 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01be, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r11 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r1 = "instant_avatars_cta_button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        X.LRq.A03(r2, X.AnonymousClass000.A00(642), r1, r7);
        r0 = (androidx.fragment.app.Fragment) r3.A0H.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r18, int r19) {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x0196;
                case 2: goto L_0x0050;
                case 3: goto L_0x0180;
                case 4: goto L_0x015e;
                case 5: goto L_0x013e;
                case 6: goto L_0x0130;
                case 7: goto L_0x01b1;
                case 8: goto L_0x0122;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00c2;
                case 12: goto L_0x0010;
                case 13: goto L_0x0008;
                case 14: goto L_0x00a8;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r3 = r2.A01
            X.6ZN r3 = (X.AnonymousClass6ZN) r3
            java.lang.String r7 = r2.A02
            r11 = 0
            goto L_0x0017
        L_0x0010:
            java.lang.Object r3 = r2.A01
            X.6ZN r3 = (X.AnonymousClass6ZN) r3
            java.lang.String r7 = r2.A02
            r11 = 1
        L_0x0017:
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.String r4 = "userSession"
            if (r2 == 0) goto L_0x01be
            if (r11 == 0) goto L_0x004d
            java.lang.String r1 = "instant_avatars_cta_button"
        L_0x0021:
            r0 = 642(0x282, float:9.0E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.LRq.A03(r2, r0, r1, r7)
            java.lang.ref.WeakReference r0 = r3.A0H
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0007
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0007
            X.GUi r0 = X.C63556Kz5.A01
            com.instagram.common.session.UserSession r3 = r3.A01
            if (r3 == 0) goto L_0x01be
            r2 = 0
            java.lang.String r4 = "ig_stories_creation"
            java.lang.String r5 = "ig_stories_creation_avatar_cta_dialog"
            r10 = 0
            r6 = r2
            r8 = r2
            r9 = r2
            r0.A03(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x004d:
            java.lang.String r1 = "create_from_scratch_cta_button"
            goto L_0x0021
        L_0x0050:
            java.lang.Object r4 = r2.A01
            X.KXg r4 = (X.KXg) r4
            java.lang.String r3 = r2.A02
            X.0s0 r2 = r4.A0C
            X.0YZ[] r0 = X.KXg.A0D
            r1 = 1
            boolean r0 = X.AnonymousClass7TG.A1a(r4, r2, r0, r1)
            if (r0 != 0) goto L_0x0007
            X.KXg.A08(r4, r1)
            X.0xx r1 = X.DbW.A0E(r4)
            r0 = 29
            X.MGE.A01(r4, r3, r1, r0)
            return
        L_0x006e:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "in_thread_add_example_dialogue"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r2.A01
            X.LTH r0 = (X.LTH) r0
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "thread_view_add_example_dialogue_submit_for_review_dialog_cancel_clicked"
        L_0x0088:
            r1.A0l(r0)
            r1.Cgf()
            return
        L_0x008f:
            java.lang.String r0 = "in_thread_instruction"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r2.A01
            X.LTH r0 = (X.LTH) r0
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "thread_view_add_instruction_submit_for_review_dialog_cancel_clicked"
            goto L_0x0088
        L_0x00a8:
            java.lang.Object r0 = r2.A01
            X.6ZN r0 = (X.AnonymousClass6ZN) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            if (r3 != 0) goto L_0x00b4
            java.lang.String r4 = "userSession"
            goto L_0x01be
        L_0x00b4:
            java.lang.String r2 = r2.A02
            r0 = 642(0x282, float:9.0E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "not_now_cta_button"
            X.LRq.A03(r3, r1, r0, r2)
            return
        L_0x00c2:
            java.lang.Object r4 = r2.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.8sM r3 = X.C368278sM.DECLINE
            java.lang.String r1 = r2.A02
            r0 = 0
            X.C64373Lap.A03(r3, r4, r1, r0)
            r18.dismiss()
            return
        L_0x00d2:
            java.lang.String r1 = r2.A02
            java.lang.Object r3 = r2.A01
            X.Lao r3 = (X.C64372Lao) r3
            java.lang.String r0 = r3.A0K
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00ec
            X.6cU r2 = r3.A09
            X.3uh r1 = r3.A08
            X.818 r0 = r3.A03
            r2.Cx5(r0, r1)
            X.JZY r0 = X.JZY.AUTO_ON
            goto L_0x0104
        L_0x00ec:
            java.lang.String r0 = r3.A0F
            goto L_0x010a
        L_0x00ef:
            java.lang.String r1 = r2.A02
            java.lang.Object r3 = r2.A01
            X.Lao r3 = (X.C64372Lao) r3
            java.lang.String r0 = r3.A0H
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0108
            X.6cU r0 = r3.A09
            r0.DnK()
            X.JZY r0 = X.JZY.AUTO_OFF
        L_0x0104:
            X.C64372Lao.A00(r0, r3)
            return
        L_0x0108:
            java.lang.String r0 = r3.A0I
        L_0x010a:
            boolean r0 = X.0qQ.A0K(r1, r0)
            X.6cU r2 = r3.A09
            if (r0 == 0) goto L_0x0118
            r2.DnS()
            X.JZY r0 = X.JZY.ONE_TIME_OFF
            goto L_0x0104
        L_0x0118:
            X.3uh r1 = r3.A08
            X.818 r0 = r3.A03
            r2.Dku(r0, r1)
            X.JZY r0 = X.JZY.ONE_TIME_ON
            goto L_0x0104
        L_0x0122:
            java.lang.String r0 = r2.A02
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0kR.A04(r1, r0)
            return
        L_0x0130:
            java.lang.Object r0 = r2.A01
            X.K66 r0 = (X.K66) r0
            X.MXh r1 = X.K66.A03(r0)
            java.lang.String r0 = r2.A02
            r1.CnS(r0)
            return
        L_0x013e:
            java.lang.Object r0 = r2.A01
            X.Lt4 r0 = (X.C65424Lt4) r0
            java.lang.String r5 = r2.A02
            X.K5H r4 = r0.A01
            X.4O6 r3 = r4.A0H
            com.instagram.common.session.UserSession r2 = r4.A0B
            X.Uwa r0 = X.K5H.A01(r4)
            java.lang.String r1 = r0.name()
            X.4O7 r0 = X.VK6.A00
            r0.A02(r2, r3, r1, r5)
            android.os.Handler r1 = r4.A0c
            r0 = 1
            r1.sendEmptyMessage(r0)
            return
        L_0x015e:
            java.lang.Object r0 = r2.A01
            X.Lt4 r0 = (X.C65424Lt4) r0
            java.lang.String r5 = r2.A02
            X.K5H r4 = r0.A01
            X.4O6 r3 = r4.A0H
            com.instagram.common.session.UserSession r2 = r4.A0B
            X.Uwa r0 = X.K5H.A01(r4)
            java.lang.String r1 = r0.name()
            X.4O7 r0 = X.VK6.A00
            r0.A04(r2, r3, r1, r5)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 0
            X.W38.A06(r1, r0)
            return
        L_0x0180:
            java.lang.Object r3 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r3 = (com.instagram.creation.fragment.EditMediaInfoFragment) r3
            java.lang.String r2 = r2.A02
            android.view.ViewGroup r1 = r3.mOptionsContainer
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
            r3.A0T = r2
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r3)
            return
        L_0x0196:
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VwK r4 = X.VA1.A00(r0)
            r0 = 1725(0x6bd, float:2.417E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r2.A02
            r0 = 4200(0x1068, float:5.885E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            r4.A08(r3, r1, r2, r0)
            return
        L_0x01b1:
            java.lang.Object r4 = r2.A01
            X.K66 r4 = (X.K66) r4
            java.lang.String r2 = r2.A02
            X.847 r0 = r4.A00
            r6 = 0
            if (r0 != 0) goto L_0x01c6
            java.lang.String r4 = "brandedContentTaggingUpsellController"
        L_0x01be:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01c6:
            X.0eM r5 = r4.A0T
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            if (r2 != 0) goto L_0x01d0
            java.lang.String r2 = ""
        L_0x01d0:
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A00(r4)
            java.util.List r0 = r0.A0q
            com.instagram.user.model.User r3 = X.AnonymousClass847.A00(r1, r2, r0)
            if (r3 == 0) goto L_0x0228
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            r12 = 0
            X.0qQ.A0B(r2, r12)
            r0 = 36316126036627432(0x81055300080fe8, double:3.0298025666406805E-306)
            boolean r0 = X.AnonymousClass430.A03(r2, r0)
            if (r0 == 0) goto L_0x0228
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>((com.instagram.user.model.User) r3)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            X.3Q2 r0 = X.C61829KNs.A02(r4)
            if (r0 == 0) goto L_0x0226
            java.lang.String r9 = r0.A3t
        L_0x0210:
            java.lang.String r10 = "reel"
            r13 = 1
            X.0qQ.A0B(r8, r13)
            r7 = r6
            r14 = r12
            r15 = r12
            r16 = r13
            androidx.fragment.app.Fragment r0 = X.LLA.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A0B(r6, r0)
            r1.A04()
            return
        L_0x0226:
            r9 = r6
            goto L_0x0210
        L_0x0228:
            X.MXh r0 = X.K66.A03(r4)
            r0.Cz1(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LV1.onClick(android.content.DialogInterface, int):void");
    }

    public LV1(String str, Object obj, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
    }
}
