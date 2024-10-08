package X;

import android.content.DialogInterface;

/* renamed from: X.FJg  reason: case insensitive filesystem */
public final class C50021FJg implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C50021FJg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C50021FJg A00(Object obj, int i) {
        return new C50021FJg(obj, i);
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0I(new C50021FJg(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04e7, code lost:
        r0 = "twoFacIdentifier";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04eb, code lost:
        r0 = "requestDeviceId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04ef, code lost:
        r0 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0729, code lost:
        X.FG4.A02(r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x072c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x072d, code lost:
        r0 = "dialog";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x072f, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0736, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x07b7, code lost:
        X.C322936we.A01(r3, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x07ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0848, code lost:
        r0 = r4.requireActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x084c, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x084f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r5.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0215, code lost:
        r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0218, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004d, code lost:
        X.DbT.A1T(r4, X.AnonymousClass05K.A06, r3, X.Dba.A02(r5, r4));
        r5.A0R();
        r0 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        r0.dismiss();
        r5.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r5 = r19
            r7 = r20
            switch(r0) {
                case 0: goto L_0x0360;
                case 1: goto L_0x07fb;
                case 2: goto L_0x083d;
                case 3: goto L_0x033d;
                case 4: goto L_0x0315;
                case 5: goto L_0x07cb;
                case 6: goto L_0x07c3;
                case 7: goto L_0x07c3;
                case 8: goto L_0x0834;
                case 9: goto L_0x07bb;
                case 10: goto L_0x02d5;
                case 11: goto L_0x0789;
                case 12: goto L_0x075a;
                case 13: goto L_0x0737;
                case 14: goto L_0x02bf;
                case 15: goto L_0x070a;
                case 16: goto L_0x0298;
                case 17: goto L_0x06e6;
                case 18: goto L_0x0283;
                case 19: goto L_0x0277;
                case 20: goto L_0x022f;
                case 21: goto L_0x0277;
                case 22: goto L_0x06ba;
                case 23: goto L_0x069e;
                case 24: goto L_0x01e6;
                case 25: goto L_0x0696;
                case 26: goto L_0x0155;
                case 27: goto L_0x0686;
                case 28: goto L_0x067e;
                case 29: goto L_0x0686;
                case 30: goto L_0x000f;
                case 31: goto L_0x000b;
                case 32: goto L_0x0672;
                case 33: goto L_0x062e;
                case 34: goto L_0x0626;
                case 35: goto L_0x061b;
                case 36: goto L_0x0601;
                case 37: goto L_0x05ce;
                case 38: goto L_0x0587;
                case 39: goto L_0x057b;
                case 40: goto L_0x0573;
                case 41: goto L_0x0573;
                case 42: goto L_0x056b;
                case 43: goto L_0x0122;
                case 44: goto L_0x0544;
                case 45: goto L_0x000e;
                case 46: goto L_0x00ec;
                case 47: goto L_0x0064;
                case 48: goto L_0x050a;
                case 49: goto L_0x0504;
                case 50: goto L_0x04fc;
                case 51: goto L_0x04f3;
                case 52: goto L_0x04a0;
                case 53: goto L_0x0459;
                case 54: goto L_0x0444;
                case 55: goto L_0x043c;
                case 56: goto L_0x043c;
                case 57: goto L_0x0043;
                case 58: goto L_0x0038;
                case 59: goto L_0x0434;
                case 60: goto L_0x03c1;
                default: goto L_0x000b;
            }
        L_0x000b:
            r5.dismiss()
        L_0x000e:
            return
        L_0x000f:
            X.DbT.A15()
            java.lang.Object r0 = r1.A01
            X.F1m r0 = (X.C49679F1m) r0
            X.EDh r4 = r0.A00
            com.instagram.registration.model.RegFlowExtras r1 = r4.A03
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r3.putParcelable(r0, r1)
            X.0aP r2 = r4.A08
            X.DbU.A1C(r3)
            X.DuH r1 = new X.DuH
            r1.<init>()
            r1.setArguments(r3)
            androidx.fragment.app.FragmentActivity r0 = r4.A00
            X.6Yo r3 = X.DbV.A0N(r1, r0, r2)
            goto L_0x0215
        L_0x0038:
            java.lang.Object r0 = r1.A01
            X.DdV r0 = (X.C46358DdV) r0
            X.2Aq r5 = r0.A01
            com.instagram.common.session.UserSession r4 = r5.A05
            java.lang.String r3 = "scheduled_break_reminder"
            goto L_0x004d
        L_0x0043:
            java.lang.Object r0 = r1.A01
            X.DdV r0 = (X.C46358DdV) r0
            X.2Aq r5 = r0.A01
            com.instagram.common.session.UserSession r4 = r5.A05
            java.lang.String r3 = "guardian_daily_limit_near"
        L_0x004d:
            long r1 = X.Dba.A02(r5, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.DbT.A1T(r4, r0, r3, r1)
            r5.A0R()
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x000e
            r0.dismiss()
            r0 = 0
            r5.A03 = r0
            return
        L_0x0064:
            java.lang.Object r0 = r1.A01
            X.EvJ r0 = (X.C49417EvJ) r0
            X.E2j r2 = r0.A00
            X.FEs r3 = r2.A04
            if (r3 == 0) goto L_0x009f
            X.FAI r1 = r3.A09
            java.util.Deque r0 = r1.A01
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            r3.A02 = r0
            java.util.Map r0 = r1.A02
            java.util.Set r0 = r0.keySet()
            com.google.common.collect.ImmutableList r9 = X.DbU.A0K(r0)
            r3.A03 = r9
            java.util.List r0 = r3.A02
            java.util.HashMap r10 = X.C49918FEs.A01(r0)
            java.lang.String r8 = r3.A01
            X.EZf r4 = X.C48137EZf.BLOCKED_ACCOUNTS
            X.EZZ r5 = X.EZZ.SUGGESTED_BLOCKS
            com.instagram.common.session.UserSession r7 = r3.A07
            X.0iw r6 = r3.A06
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r11 = 3
            X.AnonymousClass7TG.A1S(r7, r6)
            X.C49760F5m.A01(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x009f:
            r4 = 0
            r3 = 8
            r1 = 0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r2.A02
            if (r0 == 0) goto L_0x00aa
            r0.setPrimaryButtonEnabled(r1)
        L_0x00aa:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r2.A02
            if (r1 == 0) goto L_0x00b4
            r0 = 2131953878(0x7f1308d6, float:1.954424E38)
            X.DbZ.A1A(r2, r1, r0)
        L_0x00b4:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r2.A03
            if (r0 == 0) goto L_0x00bb
            X.DbS.A1T(r0)
        L_0x00bb:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r2.A03
            if (r0 == 0) goto L_0x00c2
            r0.setOnClickListener(r4)
        L_0x00c2:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            if (r0 == 0) goto L_0x00c9
            r0.setVisibility(r3)
        L_0x00c9:
            X.FEs r0 = r2.A04
            if (r0 == 0) goto L_0x000e
            X.EDf r3 = r2.A07
            com.instagram.common.session.UserSession r2 = r0.A07
            java.lang.String r1 = r0.A01
            r0 = 1
            X.AnonymousClass7TF.A1D(r2, r0, r3)
            X.1OC r1 = X.FCY.A02(r2, r1, r4)
            r1.A00 = r3
            X.8jT r0 = X.C363288jT.A00(r2)
            r0.A06()
            X.1ET r0 = X.1ES.A01()
            r0.schedule(r1)
            return
        L_0x00ec:
            java.lang.Object r0 = r1.A01
            X.EvJ r0 = (X.C49417EvJ) r0
            X.E2j r0 = r0.A00
            X.FEs r2 = r0.A04
            if (r2 == 0) goto L_0x000e
            X.FAI r1 = r2.A09
            java.util.Map r0 = r1.A02
            java.util.Set r0 = r0.keySet()
            com.google.common.collect.ImmutableList r8 = X.DbU.A0K(r0)
            java.util.Deque r0 = r1.A01
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            java.util.HashMap r9 = X.C49918FEs.A01(r0)
            java.lang.String r7 = r2.A01
            X.EZf r3 = X.C48137EZf.BLOCKED_ACCOUNTS
            X.EZZ r4 = X.EZZ.SUGGESTED_BLOCKS
            com.instagram.common.session.UserSession r6 = r2.A07
            X.0iw r5 = r2.A06
            r0 = 2
            X.0qQ.A0B(r7, r0)
            r10 = 4
            X.AnonymousClass7TG.A1S(r6, r5)
            X.C49760F5m.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0122:
            java.lang.Object r2 = r1.A01
            X.F0w r2 = (X.C49664F0w) r2
            java.lang.Integer r0 = r2.A05
            int r1 = r0.intValue()
            r7 = 0
            r8 = 1
            if (r1 == r7) goto L_0x0809
            if (r1 == r8) goto L_0x0809
            r0 = 2
            if (r1 != r0) goto L_0x000e
            X.F0m r0 = r2.A04
            com.instagram.common.session.UserSession r3 = r0.A03
            X.0iw r9 = r0.A01
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            com.instagram.user.model.User r4 = r0.A04
            r5 = 0
            java.lang.String r14 = r0.A07
            r10 = r3
            r11 = r4
            r13 = r5
            X.C49176Eqh.A00(r9, r10, r11, r12, r13, r14)
            android.content.Context r1 = r0.A00
            java.lang.String r6 = r9.getModuleName()
            X.1P0 r2 = r0.A02
            r9 = r7
            X.FCW.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0155:
            java.lang.Object r0 = r1.A01
            X.FAY r0 = (X.FAY) r0
            com.instagram.model.reels.Reel r1 = r0.A07
            android.content.Context r10 = r0.A00
            com.instagram.common.session.UserSession r11 = r0.A04
            androidx.fragment.app.Fragment r0 = r0.A01
            X.0hq r2 = r0.getParentFragmentManager()
            r8 = 0
            r4 = 1
            java.util.List r1 = r1.A0O(r11)
            X.0qQ.A07(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3 = 0
            X.F3H r13 = new X.F3H
            r13.<init>(r3, r2, r0)
            r13.A01()
            int r0 = r1.size()
            java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
            r12.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean
            r15.<init>(r8)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r1.iterator()
        L_0x0199:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r6.next()
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r14 = r0.A0b
            if (r14 == 0) goto L_0x0199
            X.1NY r5 = X.AnonymousClass7TG.A0a(r11)
            java.lang.String r1 = r14.getId()
            X.1iA r0 = r14.BR7()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            r0 = 320(0x140, float:4.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbU.A1P(r5, r0, r1)
            java.lang.String r1 = r14.getId()
            java.lang.String r0 = "media_id"
            r5.A9m(r0, r1)
            java.lang.Class<X.UXg> r1 = X.C15246UXg.class
            java.lang.Class<X.Vo3> r0 = X.C18236Vo3.class
            r5.A0O(r3, r1, r0, r8)
            r5.A0R = r4
            X.H4U r7 = new X.H4U
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.1OC r0 = r5.A0M()
            r0.A00 = r7
            r2.add(r0)
            X.1ES.A03(r0)
            goto L_0x0199
        L_0x01e6:
            X.C49765F5y.A01()
            java.lang.Object r3 = r1.A01
            X.Fjz r3 = (X.C50881Fjz) r3
            com.instagram.common.session.UserSession r5 = r3.A02
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            androidx.fragment.app.FragmentActivity r0 = r3.A01
            boolean r2 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r1 = "confirmation_dialog"
            if (r0 == 0) goto L_0x0219
            X.6Yo r3 = X.DbS.A0M(r0, r5)
            X.C49765F5y.A01()
            android.os.Bundle r1 = X.C49766F5z.A00(r5, r4, r1, r2)
            X.ELb r0 = new X.ELb
            r0.<init>()
            r0.setArguments(r1)
            r3.A0D(r0)
            java.lang.String r0 = "GDPR.Fragment.Entrance"
            r3.A0A = r0
        L_0x0215:
            r3.A04()
            return
        L_0x0219:
            android.app.Activity r3 = r3.A00
            if (r3 == 0) goto L_0x000e
            java.lang.String r0 = X.0Gl.A02(r5)
            if (r0 == 0) goto L_0x082d
            android.os.Bundle r2 = X.C49766F5z.A00(r5, r4, r1, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "gdpr_consent"
            X.DbU.A0w(r3, r2, r5, r1, r0)
            return
        L_0x022f:
            java.lang.Object r4 = r1.A01
            X.E31 r4 = (X.E31) r4
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "edit_model"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.profile.intf.MultipleLinksEditModel r0 = (com.instagram.profile.intf.MultipleLinksEditModel) r0
            if (r0 == 0) goto L_0x000e
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x000e
            X.0eM r0 = r4.A09
            X.0lg r1 = X.DbY.A0R(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONArray r3 = r0.put(r2)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r0 = "accounts/remove_bio_links/"
            r2.A0A(r0)
            java.lang.Class<X.DvQ> r1 = X.DvQ.class
            java.lang.Class<X.F7z> r0 = X.C49812F7z.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "link_ids"
            r2.A9m(r0, r1)
            X.1OC r1 = X.DbW.A0K(r2)
            r0 = 9
            X.C47696EDf.A00(r4, r1, r0)
            return
        L_0x0277:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x000e
            goto L_0x084c
        L_0x0283:
            java.lang.Object r1 = r1.A01
            X.E3F r1 = (X.E3F) r1
            X.0eM r0 = r1.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.0wc r1 = X.DbX.A0O(r1, r0)
            java.lang.String r0 = "fb_page_show_profile_dialog_cancel_clicked"
            X.DbZ.A1R(r1, r0)
            goto L_0x000b
        L_0x0298:
            java.lang.Object r3 = r1.A01
            X.E3F r3 = (X.E3F) r3
            X.0eM r2 = r3.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "organic"
            X.AnonymousClass736.A05(r3, r1, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.6ve r4 = X.C322316vd.A00(r0)
            java.lang.String r3 = "profile_facebook_link_change_cancel"
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r2 = r4.A0A
            long r0 = r4.A00
            r2.flowMarkPoint(r0, r3)
            java.lang.String r0 = "edit_profile_link"
            r4.A04(r0)
            goto L_0x000b
        L_0x02bf:
            java.lang.Object r0 = r1.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            X.Dkt r0 = r0.A0D
            if (r0 == 0) goto L_0x000e
            X.EQ4 r0 = r0.A01
            X.1Av r0 = r0.A03
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "pokes_impression_v2"
            X.DbW.A1L(r1, r0)
            return
        L_0x02d5:
            java.lang.Object r6 = r1.A01
            X.F2d r6 = (X.C49693F2d) r6
            r5 = 2131976640(0x7f1361c0, float:1.9590406E38)
            androidx.fragment.app.Fragment r4 = r6.A01
            java.lang.String r1 = X.DbU.A0m(r4, r5)
            r3 = 2131969038(0x7f13440e, float:1.9574988E38)
            java.lang.String r0 = X.DbU.A0m(r4, r3)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[]{r1, r0}
            r1 = r2[r20]
            java.lang.String r0 = X.DbU.A0m(r4, r3)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0301
            X.G7J r0 = r6.A00
            if (r0 == 0) goto L_0x000e
            r0.DVM()
            return
        L_0x0301:
            r1 = r2[r20]
            java.lang.String r0 = X.DbU.A0m(r4, r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000e
            X.G7J r0 = r6.A00
            if (r0 == 0) goto L_0x000e
            r0.Dz7()
            return
        L_0x0315:
            java.lang.Object r3 = r1.A01
            X.FGB r3 = (X.FGB) r3
            X.4DH r4 = r3.A09
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x000e
            com.instagram.common.session.UserSession r0 = r3.A0D
            X.F3s r2 = X.C49061Eof.A00(r0)
            X.EWT r1 = X.EWT.EDIT_BIO_FLOW
            java.lang.String r0 = "edit_bio_cancel"
            r2.A03(r1, r0)
            X.6ve r2 = r3.A01
            r1 = 1
            java.lang.String r0 = "cancel_changes"
            r2.A0A(r0, r1)
            java.lang.String r0 = "edit_bio"
            r2.A04(r0)
            goto L_0x0848
        L_0x033d:
            java.lang.Object r0 = r1.A01
            X.FPC r0 = (X.FPC) r0
            java.lang.Object r3 = r0.A01
            X.Dib r3 = (X.C46656Dib) r3
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x000e
            X.6ve r2 = r3.A0m
            r1 = 0
            java.lang.String r0 = "cancel_changes"
            r2.A0A(r0, r1)
            X.6ve r1 = r3.A0m
            java.lang.String r0 = "edit_full_name"
            r1.A04(r0)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            goto L_0x084c
        L_0x0360:
            java.lang.Object r6 = r1.A01
            X.Ubh r6 = (X.C15383Ubh) r6
            X.1Xl r0 = r6.A06
            if (r0 == 0) goto L_0x000e
            X.1Xj r1 = r0.BPf()
            if (r1 == 0) goto L_0x000e
            com.instagram.common.session.UserSession r0 = X.C15383Ubh.A01(r6)
            com.instagram.user.model.User r4 = r1.A2A(r0)
            if (r4 == 0) goto L_0x000e
            X.1Xl r0 = r6.A06
            if (r0 == 0) goto L_0x039d
            X.1Xj r1 = r0.BPf()
            if (r1 == 0) goto L_0x039d
            com.instagram.common.session.UserSession r0 = X.C15383Ubh.A01(r6)
            com.instagram.user.model.User r0 = r1.A2A(r0)
            if (r0 == 0) goto L_0x039d
            com.instagram.common.session.UserSession r3 = X.C15383Ubh.A01(r6)
            X.6rY r2 = X.DbV.A0e(r0)
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "report"
            X.C319976rX.A05(r6, r3, r2, r0, r1)
        L_0x039d:
            com.instagram.common.session.UserSession r7 = X.C15383Ubh.A01(r6)
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            java.lang.String r10 = r4.getId()
            X.TpH r8 = X.C14068TpH.PROFILE
            X.UzD r9 = X.C16677UzD.USER
            X.OcF r2 = X.ORV.A01(r5, r6, r7, r8, r9, r10)
            r1 = 5
            X.EUb r0 = new X.EUb
            r0.<init>(r6, r1)
            r2.A07(r0)
            r0 = 1
            r2.A0H = r0
            r2.A06()
            return
        L_0x03c1:
            r5.dismiss()
            java.lang.Object r9 = r1.A01
            X.Ey2 r9 = (X.Ey2) r9
            X.FgX r4 = r9.A01
            com.instagram.common.session.UserSession r8 = r4.A02
            java.lang.String r7 = r8.A06
            com.instagram.user.model.User r6 = r9.A02
            java.lang.String r3 = r6.getId()
            com.instagram.profile.fragment.UserDetailFragment r5 = r4.A04
            X.0xN r2 = X.C60510iO.A00(r8)
            java.lang.String r0 = "profile_tagging_tap_your_profile_remove_click"
            X.0xI r1 = X.0xI.A00(r5, r0)
            java.lang.String r0 = "self_user_id"
            r1.A0C(r0, r7)
            r0 = 750(0x2ee, float:1.051E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0C(r0, r3)
            r2.EFq(r1)
            X.3tp r3 = r9.A00
            java.lang.String r1 = r6.getId()
            X.1NY r2 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "accounts/unlink_from_bio/"
            r2.A0A(r0)
            X.DbS.A1P(r2, r1)
            java.lang.Class<X.CFT> r1 = X.CFT.class
            java.lang.Class<X.D23> r0 = X.D23.class
            r2.A0Q(r1, r0)
            X.1OC r1 = X.DbW.A0K(r2)
            r0 = 5
            X.C47696EDf.A01(r1, r4, r0)
            r5.schedule(r1)
            X.4Cl r0 = r6.A03
            X.3qt r0 = r0.Afr()
            if (r0 == 0) goto L_0x042e
            java.util.List r0 = r0.B1p()
            if (r0 == 0) goto L_0x042e
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            java.util.Collection r0 = X.0u4.A00(r0)
            r0.remove(r3)
        L_0x042e:
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A06
            r0.A0F()
            return
        L_0x0434:
            java.lang.Object r0 = r1.A01
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            r0.onClick(r5, r7)
            return
        L_0x043c:
            java.lang.Object r0 = r1.A01
            X.G87 r0 = (X.G87) r0
            r0.Dox()
            return
        L_0x0444:
            r5.dismiss()
            java.lang.Object r1 = r1.A01
            X.0lg r1 = (X.0lg) r1
            X.0iw r0 = X.C46359DdX.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r1 = "quiet_mode_interstitial"
            java.lang.String r0 = "quiet_mode_interstitial_ok_button"
            X.Dbc.A0U(r2, r1, r0)
            return
        L_0x0459:
            java.lang.Object r4 = r1.A01
            X.E3A r4 = (X.E3A) r4
            com.instagram.common.session.UserSession r0 = r4.A04
            if (r0 == 0) goto L_0x04ef
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x04eb
            java.lang.String r5 = r4.A0B
            if (r5 == 0) goto L_0x04e7
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "two_factor/update_trusted_notification_status/"
            r3.A0A(r0)
            java.lang.String r0 = "requestor_device_id"
            r3.A9m(r0, r1)
            r1 = 2
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A0C(r0, r1)
            r2 = 31
            r1 = 21
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.AnonymousClass9NE.A01(r2, r1, r0)
            r3.A9m(r0, r5)
            java.lang.Class<X.CGF> r1 = X.CGF.class
            java.lang.Class<X.D31> r0 = X.D31.class
            X.1OC r2 = X.DbT.A0S(r3, r1, r0)
            X.0hq r1 = r4.getParentFragmentManager()
            r0 = 12
            X.C48001EQk.A00(r1, r4, r2, r0)
            return
        L_0x04a0:
            java.lang.Object r4 = r1.A01
            X.E3A r4 = (X.E3A) r4
            com.instagram.common.session.UserSession r0 = r4.A04
            if (r0 == 0) goto L_0x04ef
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x04eb
            java.lang.String r5 = r4.A0B
            if (r5 == 0) goto L_0x04e7
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "two_factor/update_trusted_notification_status/"
            r3.A0A(r0)
            java.lang.String r0 = "requestor_device_id"
            r3.A9m(r0, r1)
            r1 = 1
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A0C(r0, r1)
            r2 = 31
            r1 = 21
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.AnonymousClass9NE.A01(r2, r1, r0)
            r3.A9m(r0, r5)
            java.lang.Class<X.CGF> r1 = X.CGF.class
            java.lang.Class<X.D31> r0 = X.D31.class
            X.1OC r2 = X.DbT.A0S(r3, r1, r0)
            X.0hq r1 = r4.getParentFragmentManager()
            r0 = 11
            X.C48001EQk.A00(r1, r4, r2, r0)
            return
        L_0x04e7:
            java.lang.String r0 = "twoFacIdentifier"
            goto L_0x072f
        L_0x04eb:
            java.lang.String r0 = "requestDeviceId"
            goto L_0x072f
        L_0x04ef:
            java.lang.String r0 = "userSession"
            goto L_0x072f
        L_0x04f3:
            java.lang.Object r1 = r1.A01
            X.G7R r1 = (X.G7R) r1
            r0 = 0
            r1.D5T(r0, r0)
            return
        L_0x04fc:
            java.lang.Object r0 = r1.A01
            X.G7R r0 = (X.G7R) r0
            r0.onCancel()
            return
        L_0x0504:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            return
        L_0x050a:
            java.lang.Object r4 = r1.A01
            X.Der r4 = (X.C46430Der) r4
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r4)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r3 = 1
            X.1NY r2 = X.DbZ.A0L(r0)
            java.lang.String r0 = "friendships/remove_all_followers/"
            r2.A0A(r0)
            java.lang.String r1 = X.C320126ro.A05(r1)
            java.lang.String r0 = "user_ids"
            r2.A9m(r0, r1)
            java.lang.String r1 = "remove_all_spam_followers"
            java.lang.String r0 = "true"
            r2.A9m(r1, r0)
            java.lang.Class<X.CDq> r1 = X.C43798CDq.class
            java.lang.Class<X.CyY> r0 = X.C45560CyY.class
            X.1OC r1 = X.DbW.A0L(r2, r1, r0, r3)
            X.C46445Df7.A01(r4, r3)
            r0 = 52
            X.C47696EDf.A01(r1, r4, r0)
            r4.schedule(r1)
            return
        L_0x0544:
            java.lang.Object r0 = r1.A01
            X.F0w r0 = (X.C49664F0w) r0
            X.F0m r0 = r0.A04
            com.instagram.common.session.UserSession r3 = r0.A03
            X.0iw r6 = r0.A01
            java.lang.Integer r9 = X.AnonymousClass05K.A0u
            com.instagram.user.model.User r4 = r0.A04
            java.lang.String r5 = r0.A06
            java.lang.String r11 = r0.A07
            r7 = r3
            r8 = r4
            r10 = r5
            X.C49176Eqh.A00(r6, r7, r8, r9, r10, r11)
            android.content.Context r1 = r0.A00
            java.lang.String r6 = r6.getModuleName()
            X.1P0 r2 = r0.A02
            r7 = 1
            r8 = r7
            r9 = r7
            X.FCW.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x056b:
            java.lang.Object r0 = r1.A01
            X.G81 r0 = (X.G81) r0
            r0.onCancel()
            return
        L_0x0573:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x057b:
            java.lang.Object r0 = r1.A01
            X.FnB r0 = (X.C51019FnB) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            com.instagram.url.UrlHandlerActivity r0 = (com.instagram.url.UrlHandlerActivity) r0
            r0.onBackPressed()
            return
        L_0x0587:
            java.lang.Object r9 = r1.A01
            X.E4v r9 = (X.C47491E4v) r9
            X.0eM r0 = r9.A06
            X.0lg r8 = X.DbT.A0X(r0)
            java.lang.String r7 = "find_friends_fb"
            r6 = 0
            double r4 = X.DbV.A00(r8, r6)
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r8)
            java.lang.String r0 = "skip_confirmed"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dbc.A0X(r0, r4, r2)
            X.DbZ.A1J(r0, r7)
            X.FH8.A04(r0)
            X.FH8.A09(r0, r8)
            X.DbT.A1P(r0)
            r0.Cgf()
            X.G8t r0 = X.C49047EoR.A00(r9)
            if (r0 == 0) goto L_0x05c2
            r0.Cm0(r6)
            return
        L_0x05c2:
            X.FRN r0 = r9.A02
            if (r0 != 0) goto L_0x05ca
            java.lang.String r0 = "nuxHelper"
            goto L_0x072f
        L_0x05ca:
            r0.A01()
            return
        L_0x05ce:
            java.lang.Object r8 = r1.A01
            X.E4v r8 = (X.C47491E4v) r8
            X.0eM r0 = r8.A06
            X.0lg r7 = X.DbT.A0X(r0)
            java.lang.String r6 = "find_friends_fb"
            double r4 = X.Dbb.A00(r7)
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r7)
            java.lang.String r0 = "connect_after_skip"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dbc.A0X(r0, r4, r2)
            X.DbS.A1H(r0, r6)
            X.DbZ.A1E(r0)
            X.FH8.A06(r0)
            X.FH8.A08(r0, r7)
            X.EXN r0 = X.EXN.NUX_FIND_FRIENDS_DIALOG
            X.C47491E4v.A00(r0, r8)
            return
        L_0x0601:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.0hq r1 = r2.mFragmentManager
            if (r1 == 0) goto L_0x0617
            int r0 = r1.A0M()
            if (r0 <= 0) goto L_0x0617
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0617
            r1.A0c()
            return
        L_0x0617:
            X.DbX.A1J(r2)
            return
        L_0x061b:
            r5.dismiss()
            java.lang.Object r0 = r1.A01
            X.ESU r0 = (X.ESU) r0
            X.ESU.A09(r0)
            return
        L_0x0626:
            java.lang.Object r0 = r1.A01
            X.FEp r0 = (X.C49915FEp) r0
            X.C49915FEp.A01(r0)
            return
        L_0x062e:
            java.lang.Object r4 = r1.A01
            X.FEp r4 = (X.C49915FEp) r4
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A03
            java.lang.String r6 = "switch_back"
            r9 = 0
            java.lang.String r7 = "setting"
            java.lang.String r8 = "confirm"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ckp(r5)
            com.instagram.common.session.UserSession r0 = r4.A07
            X.1NY r3 = X.DbU.A0N(r0)
            java.lang.Class<X.92k> r1 = X.C3727892k.class
            java.lang.Class<X.92l> r0 = X.C3727992l.class
            r3.A0R(r1, r0)
            java.lang.String r0 = "business/account/convert_account/"
            r3.A0A(r0)
            r2 = 1
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "to_account_type"
            r3.A9m(r0, r1)
            X.1OC r1 = X.DbT.A0U(r3, r2)
            r0 = 29
            X.C47696EDf.A01(r1, r4, r0)
            X.4DH r0 = r4.A02
            X.Dbb.A15(r0, r1)
            return
        L_0x0672:
            java.lang.Object r0 = r1.A01
            X.ESI r0 = (X.ESI) r0
            X.0wc r1 = r0.A03
            java.lang.String r0 = "remove_self_followers_dialog_dismissed"
            X.Dba.A1I(r1, r0)
            return
        L_0x067e:
            java.lang.Object r0 = r1.A01
            X.G7K r0 = (X.G7K) r0
            r0.onCancel()
            return
        L_0x0686:
            java.lang.Object r1 = r1.A01
            X.G7K r1 = (X.G7K) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.Dje(r0)
            return
        L_0x0696:
            java.lang.Object r0 = r1.A01
            X.4mU r0 = (X.C273384mU) r0
            r0.EHd()
            return
        L_0x069e:
            java.lang.Object r0 = r1.A01
            X.Fjy r0 = (X.C50880Fjy) r0
            android.content.Context r1 = r0.A00
            boolean r0 = X.AnonymousClass0oH.A01(r1)
            if (r0 == 0) goto L_0x06b6
            boolean r0 = X.2Gm.A03(r1)
            if (r0 == 0) goto L_0x06b6
            X.2HA r0 = X.2HA.A08
            X.C3726691w.A08(r1, r0)
            return
        L_0x06b6:
            X.AnonymousClass0oH.A00(r1)
            return
        L_0x06ba:
            java.lang.Object r4 = r1.A01
            X.E53 r4 = (X.E53) r4
            X.0eM r0 = r4.A0B
            java.lang.Object r3 = r0.getValue()
            X.DlR r3 = (X.C46792DlR) r3
            java.lang.Object r0 = r0.getValue()
            X.DlR r0 = (X.C46792DlR) r0
            boolean r0 = r0.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "surface_exit"
            r0 = 0
            r3.A02(r2, r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A0A
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A06()
            return
        L_0x06e6:
            java.lang.Object r3 = r1.A01
            X.E3F r3 = (X.E3F) r3
            X.0eM r2 = r3.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.0wc r1 = X.DbX.A0O(r3, r0)
            java.lang.String r0 = "fb_page_show_profile_dialog_add_clicked"
            X.DbZ.A1R(r1, r0)
            r5.dismiss()
            X.6ST r0 = r3.A04
            if (r0 == 0) goto L_0x072d
            X.AnonymousClass0fN.A00(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            r0 = 21
            goto L_0x0729
        L_0x070a:
            java.lang.Object r3 = r1.A01
            X.E3F r3 = (X.E3F) r3
            X.0eM r2 = r3.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "organic"
            X.AnonymousClass736.A04(r3, r1, r0)
            r5.dismiss()
            X.6ST r0 = r3.A04
            if (r0 == 0) goto L_0x072d
            X.AnonymousClass0fN.A00(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            r0 = 20
        L_0x0729:
            X.FG4.A02(r1, r3, r0)
            return
        L_0x072d:
            java.lang.String r0 = "dialog"
        L_0x072f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0737:
            java.lang.Object r2 = r1.A01
            com.instagram.profile.fragment.UserDetailFragment r2 = (com.instagram.profile.fragment.UserDetailFragment) r2
            X.Euk r1 = r2.A0w
            if (r1 != 0) goto L_0x0748
            com.instagram.common.session.UserSession r0 = r2.A0I
            X.Euk r1 = new X.Euk
            r1.<init>(r0)
            r2.A0w = r1
        L_0x0748:
            X.Dc6 r0 = r2.A10
            java.lang.String r2 = r0.A03()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "remove_follower_dialog_cancelled"
            X.DbZ.A1S(r1, r0, r2)
            return
        L_0x075a:
            java.lang.Object r4 = r1.A01
            X.6we r4 = (X.C322936we) r4
            com.instagram.common.session.UserSession r3 = r4.A0A
            X.1Av r0 = X.1Au.A00(r3)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 1401(0x579, float:1.963E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A0C
            X.0h9 r0 = r0.mLifecycleRegistry
            X.0qQ.A07(r0)
            X.0xx r1 = X.C71772f0.A00(r0)
            r0 = 47
            X.C51647Fy6.A02(r4, r1, r0)
            r0 = 2131963412(0x7f132e14, float:1.9563577E38)
            goto L_0x07b7
        L_0x0789:
            java.lang.Object r4 = r1.A01
            X.6we r4 = (X.C322936we) r4
            com.instagram.common.session.UserSession r3 = r4.A0A
            X.1Av r0 = X.1Au.A00(r3)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 1401(0x579, float:1.963E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A0C
            X.0h9 r0 = r0.mLifecycleRegistry
            X.0qQ.A07(r0)
            X.0xx r1 = X.C71772f0.A00(r0)
            r0 = 46
            X.C51647Fy6.A02(r4, r1, r0)
            r0 = 2131963411(0x7f132e13, float:1.9563575E38)
        L_0x07b7:
            X.C322936we.A01(r3, r4, r0)
            return
        L_0x07bb:
            java.lang.Object r0 = r1.A01
            X.E33 r0 = (X.E33) r0
            X.E33.A01(r0)
            return
        L_0x07c3:
            java.lang.Object r0 = r1.A01
            X.E38 r0 = (X.E38) r0
            X.E38.A02(r0)
            return
        L_0x07cb:
            java.lang.Object r4 = r1.A01
            X.FPH r4 = (X.FPH) r4
            java.lang.Object r3 = r4.A01
            X.E2x r3 = (X.C47451E2x) r3
            boolean r2 = r3.A03
            java.util.GregorianCalendar r0 = r3.A02
            long r0 = r0.getTimeInMillis()
            boolean r0 = X.F78.A01(r0, r2)
            if (r0 == 0) goto L_0x07f3
            r5.dismiss()
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            com.instagram.common.session.UserSession r1 = r3.A00
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 0
            X.FCN.A02(r2, r1, r0)
            return
        L_0x07f3:
            java.lang.Object r0 = r4.A02
            X.2da r0 = (X.2da) r0
            X.C47451E2x.A00(r0, r3)
            return
        L_0x07fb:
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r7)
            X.70x r0 = (X.C3250670x) r0
            r0.onClick()
            return
        L_0x0809:
            X.F0m r0 = r2.A04
            com.instagram.common.session.UserSession r11 = r0.A03
            X.0iw r1 = r0.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            com.instagram.user.model.User r12 = r0.A04
            java.lang.String r13 = r0.A06
            r6 = 0
            r2 = r11
            r3 = r12
            r5 = r13
            X.C49176Eqh.A00(r1, r2, r3, r4, r5, r6)
            android.content.Context r9 = r0.A00
            java.lang.String r14 = r1.getModuleName()
            X.1P0 r10 = r0.A02
            r15 = r8
            r16 = r7
            r17 = r8
            X.FCW.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x082d:
            java.lang.String r0 = "Must call setUserId() with non-null userId first"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0834:
            java.lang.Object r0 = r1.A01
            X.FPC r0 = (X.FPC) r0
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            goto L_0x0848
        L_0x083d:
            java.lang.Object r0 = r1.A01
            X.FPD r0 = (X.FPD) r0
            java.lang.Object r4 = r0.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r4 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r4
            r0 = 1
            r4.A09 = r0
        L_0x0848:
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
        L_0x084c:
            r0.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50021FJg.onClick(android.content.DialogInterface, int):void");
    }
}
