package X;

import android.content.DialogInterface;

/* renamed from: X.OgE  reason: case insensitive filesystem */
public final class C71249OgE implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public static Object A01(C71249OgE ogE, Object obj) {
        0qQ.A0B(obj, 0);
        return ogE.A01;
    }

    public C71249OgE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C71249OgE A00(Object obj, int i) {
        return new C71249OgE(obj, i);
    }

    public static void A02(C358248ab r1, Object obj, int i, int i2) {
        r1.A0I(new C71249OgE(obj, i), i2);
    }

    public static void A03(C358248ab r1, Object obj, int i, int i2) {
        r1.A0H(new C71249OgE(obj, i), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0282, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a2, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x033e, code lost:
        X.C72202OyR.A03((X.C69493Nmb) null, r3, r4, r5, r6, r7, r8, r9, "delete_challenge_dialog", (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0345, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x041c, code lost:
        r2.DVU(new X.N4G(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0424, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r10 = "threadKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r10 = "threadId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0589, code lost:
        r3.A0G(r0.requireActivity(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0590, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r10 = "dailyPromptsLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06c6, code lost:
        r5.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0230, code lost:
        if (r0 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0232, code lost:
        r3.A00(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0235, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0236, code lost:
        r10 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0239, code lost:
        r10 = "context";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0244, code lost:
        if (r0 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0249, code lost:
        r13.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        r10 = "audLogging";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0249;
                case 1: goto L_0x023c;
                case 2: goto L_0x0220;
                case 3: goto L_0x0217;
                case 4: goto L_0x0206;
                case 5: goto L_0x01fd;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01e3;
                case 8: goto L_0x01d2;
                case 9: goto L_0x0350;
                case 10: goto L_0x0350;
                case 11: goto L_0x0350;
                case 12: goto L_0x018b;
                case 13: goto L_0x0711;
                case 14: goto L_0x06f6;
                case 15: goto L_0x06ca;
                case 16: goto L_0x014d;
                case 17: goto L_0x0133;
                case 18: goto L_0x0119;
                case 19: goto L_0x06bf;
                case 20: goto L_0x06a4;
                case 21: goto L_0x067d;
                case 22: goto L_0x0108;
                case 23: goto L_0x0005;
                case 24: goto L_0x0346;
                case 25: goto L_0x0346;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x02f4;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02a6;
                case 31: goto L_0x0271;
                case 32: goto L_0x0005;
                case 33: goto L_0x0250;
                case 34: goto L_0x0654;
                case 35: goto L_0x0631;
                case 36: goto L_0x0100;
                case 37: goto L_0x0626;
                case 38: goto L_0x0094;
                case 39: goto L_0x0087;
                case 40: goto L_0x0611;
                case 41: goto L_0x0594;
                case 42: goto L_0x056e;
                case 43: goto L_0x0517;
                case 44: goto L_0x0005;
                case 45: goto L_0x050f;
                case 46: goto L_0x04f2;
                case 47: goto L_0x04d2;
                case 48: goto L_0x04b0;
                case 49: goto L_0x0005;
                case 50: goto L_0x0078;
                case 51: goto L_0x049d;
                case 52: goto L_0x0495;
                case 53: goto L_0x048b;
                case 54: goto L_0x046d;
                case 55: goto L_0x0452;
                case 56: goto L_0x0037;
                case 57: goto L_0x0014;
                case 58: goto L_0x000b;
                case 59: goto L_0x044a;
                case 60: goto L_0x044a;
                case 61: goto L_0x0437;
                case 62: goto L_0x000b;
                case 63: goto L_0x044a;
                case 64: goto L_0x000b;
                case 65: goto L_0x0425;
                case 66: goto L_0x0249;
                case 67: goto L_0x0417;
                case 68: goto L_0x0411;
                case 69: goto L_0x0409;
                case 70: goto L_0x03dc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
        L_0x0007:
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r12.A01
            X.PuW r0 = (X.C74416PuW) r0
            r0.onDismiss()
            goto L_0x0249
        L_0x0014:
            java.lang.Object r1 = A01(r12, r13)
            X.NKp r1 = (X.C68496NKp) r1
            X.MfP r2 = r1.A02
            if (r2 == 0) goto L_0x0074
            java.lang.String r3 = r1.A0C
            if (r3 == 0) goto L_0x0070
            com.instagram.model.direct.DirectThreadKey r0 = r1.A08
            if (r0 == 0) goto L_0x006c
            java.lang.String r4 = r0.A01
            int r9 = r1.A00
            java.lang.String r5 = "delete_daily_prompt_cancel"
            java.lang.String r6 = "tap"
            java.lang.String r7 = "cancel_button"
            java.lang.String r8 = "delete_daily_prompt_dialog"
            X.C66930MfP.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0249
        L_0x0037:
            java.lang.Object r5 = r12.A01
            X.NKp r5 = (X.C68496NKp) r5
            X.0eM r0 = r5.A0K
            X.2YL r4 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 15
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.MfP r1 = r5.A02
            if (r1 == 0) goto L_0x0074
            java.lang.String r2 = r5.A0C
            if (r2 == 0) goto L_0x0070
            com.instagram.model.direct.DirectThreadKey r0 = r5.A08
            if (r0 == 0) goto L_0x006c
            java.lang.String r3 = r0.A01
            int r8 = r5.A00
            java.lang.String r4 = "delete_daily_prompt"
            java.lang.String r5 = "tap"
            java.lang.String r6 = "delete_button"
            java.lang.String r7 = "delete_daily_prompt_dialog"
            X.C66930MfP.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x006c:
            java.lang.String r10 = "threadKey"
            goto L_0x027b
        L_0x0070:
            java.lang.String r10 = "threadId"
            goto L_0x027b
        L_0x0074:
            java.lang.String r10 = "dailyPromptsLogger"
            goto L_0x027b
        L_0x0078:
            java.lang.Object r2 = r12.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment r2 = (com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment) r2
            X.7BY r1 = r2.A03
            r0 = 1
            r1.A05(r0)
            com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment.A01(r2)
            goto L_0x0249
        L_0x0087:
            java.lang.Object r1 = r12.A01
            X.NJS r1 = (X.NJS) r1
            r0 = 0
            r1.A0C = r0
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            goto L_0x02a2
        L_0x0094:
            java.lang.Object r7 = r12.A01
            X.NJS r7 = (X.NJS) r7
            X.NJS.A01(r7)
            X.Mq3 r0 = r7.A0A
            if (r0 == 0) goto L_0x0368
            java.lang.String r8 = r0.A00()
            if (r8 == 0) goto L_0x00f6
            com.instagram.common.session.UserSession r0 = r7.A08
            if (r0 == 0) goto L_0x0236
            X.McN r2 = X.C66778McO.A00(r0)
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            X.Pux r0 = r2.A00
            if (r0 == 0) goto L_0x00b9
            r0.CtU()
        L_0x00b9:
            java.util.Map r1 = r2.A07
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x035d
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x0358
            com.instagram.common.session.UserSession r0 = r2.A05
            java.lang.String r6 = r2.A01
            r5 = 1
            X.NMG r4 = new X.NMG
            r4.<init>(r5, r1, r2, r5)
            X.1NY r2 = X.DbU.A0N(r0)
            r2.A0R = r5
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "direct_v2/quick_reply/delete/%s/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "modification_token"
            r2.A9m(r0, r6)
            java.lang.Class<X.MpS> r1 = X.C67533MpS.class
            java.lang.Class<X.OX9> r0 = X.OX9.class
            X.1OC r2 = X.DbT.A0S(r2, r1, r0)
            r2.A00 = r4
            r1 = 115(0x73, float:1.61E-43)
            r0 = 4
            X.1ES.A05(r2, r1, r0, r3, r5)
        L_0x00f6:
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 504(0x1f8, float:7.06E-43)
            r1.setResult(r0)
            return
        L_0x0100:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            goto L_0x02a2
        L_0x0108:
            java.lang.Object r0 = r12.A01
            X.NUs r0 = (X.C68732NUs) r0
            X.0eM r0 = r0.A02
            X.Mex r1 = X.C66580MXl.A0U(r0)
            java.lang.String r0 = "OTC_RESTORE_EXIT_DIALOG_GO_BACK_TAP"
            r1.A0B(r0)
            goto L_0x0249
        L_0x0119:
            java.lang.Object r0 = A01(r12, r13)
            X.NID r0 = (X.NID) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Mtv r0 = (X.C67742Mtv) r0
            X.NUH r1 = r0.A03
            java.lang.String r0 = "OTC_DISPLAY_CODE_DONE_TAP"
            r1.A0B(r0)
            r1.A08()
            goto L_0x0249
        L_0x0133:
            java.lang.Object r0 = A01(r12, r13)
            X.NIC r0 = (X.NIC) r0
            X.0eM r2 = r0.A00
            X.Mex r1 = X.C66580MXl.A0U(r2)
            java.lang.String r0 = "OTC_DISPLAY_CODE_NOT_NOW_TAP"
            r1.A0B(r0)
            X.Mex r0 = X.C66580MXl.A0U(r2)
            r0.A07()
            goto L_0x0249
        L_0x014d:
            java.lang.Object r3 = A01(r12, r13)
            X.NIC r3 = (X.NIC) r3
            X.0eM r2 = r3.A00
            X.Mex r1 = X.C66580MXl.A0U(r2)
            java.lang.String r0 = "OTC_DISPLAY_CODE_CONFIRM_THIS_WASNT_ME_TAP"
            r1.A0B(r0)
            X.Mex r0 = X.C66580MXl.A0U(r2)
            r0.A08()
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.0eM r1 = r3.A01
            X.6Yo r3 = X.DbX.A0N(r0, r1)
            r3.A08()
            X.1WU r0 = X.AnonymousClass35B.A00()
            X.F3j r2 = r0.A01()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            r1 = 0
            X.E75 r0 = r2.A00(r0, r1)
            r3.A0B(r1, r0)
            r3.A04()
            goto L_0x0249
        L_0x018b:
            java.lang.Object r6 = r12.A01
            X.NJe r6 = (X.C68466NJe) r6
            X.0eM r0 = r6.A03
            X.1vn r5 = X.Dba.A0G(r0)
            com.google.common.collect.ImmutableList$Builder r8 = com.google.common.collect.ImmutableList.builder()
            X.Mv1 r0 = r6.A00
            java.lang.String r10 = "itemAdapter"
            if (r0 == 0) goto L_0x027b
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r9 = 0
            java.util.Iterator r7 = r0.iterator()
        L_0x01aa:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x036d
            java.lang.Object r4 = r7.next()
            int r2 = r9 + 1
            if (r9 >= 0) goto L_0x01bd
            X.0sr.A1T()
            goto L_0x027e
        L_0x01bd:
            X.Mv1 r0 = r6.A00
            if (r0 == 0) goto L_0x027b
            java.util.TreeSet r1 = r0.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01d0
            r3.add(r4)
        L_0x01d0:
            r9 = r2
            goto L_0x01aa
        L_0x01d2:
            java.lang.Object r0 = r12.A01
            X.OW4 r0 = (X.OW4) r0
            X.FAt r3 = X.C49872FAt.A00
            android.content.Context r2 = r0.A00
            if (r2 == 0) goto L_0x0239
            com.instagram.common.session.UserSession r1 = r0.A02
            if (r1 == 0) goto L_0x0236
            X.6iu r0 = r0.A01
            goto L_0x0230
        L_0x01e3:
            java.lang.Object r0 = A01(r12, r13)
            X.OW4 r0 = (X.OW4) r0
            X.6iu r0 = r0.A01
            goto L_0x0244
        L_0x01ec:
            java.lang.Object r0 = r12.A01
            X.OEt r0 = (X.C70647OEt) r0
            X.FAt r3 = X.C49872FAt.A00
            android.content.Context r2 = r0.A00
            if (r2 == 0) goto L_0x0239
            com.instagram.common.session.UserSession r1 = r0.A03
            if (r1 == 0) goto L_0x0236
            X.6iu r0 = r0.A02
            goto L_0x0230
        L_0x01fd:
            java.lang.Object r0 = A01(r12, r13)
            X.OEt r0 = (X.C70647OEt) r0
            X.6iu r0 = r0.A02
            goto L_0x0244
        L_0x0206:
            java.lang.Object r0 = r12.A01
            X.OEs r0 = (X.C70646OEs) r0
            X.FAt r3 = X.C49872FAt.A00
            android.content.Context r2 = r0.A00
            if (r2 == 0) goto L_0x0239
            com.instagram.common.session.UserSession r1 = r0.A03
            if (r1 == 0) goto L_0x0236
            X.6iu r0 = r0.A02
            goto L_0x0230
        L_0x0217:
            java.lang.Object r0 = A01(r12, r13)
            X.OEs r0 = (X.C70646OEs) r0
            X.6iu r0 = r0.A02
            goto L_0x0244
        L_0x0220:
            java.lang.Object r0 = r12.A01
            X.OW2 r0 = (X.OW2) r0
            X.FAt r3 = X.C49872FAt.A00
            android.content.Context r2 = r0.A00
            if (r2 == 0) goto L_0x0239
            com.instagram.common.session.UserSession r1 = r0.A02
            if (r1 == 0) goto L_0x0236
            X.6iu r0 = r0.A01
        L_0x0230:
            if (r0 == 0) goto L_0x024d
            r3.A00(r2, r0, r1)
            return
        L_0x0236:
            java.lang.String r10 = "userSession"
            goto L_0x027b
        L_0x0239:
            java.lang.String r10 = "context"
            goto L_0x027b
        L_0x023c:
            java.lang.Object r0 = A01(r12, r13)
            X.OW2 r0 = (X.OW2) r0
            X.6iu r0 = r0.A01
        L_0x0244:
            if (r0 == 0) goto L_0x024d
            r0.A00()
        L_0x0249:
            r13.dismiss()
            return
        L_0x024d:
            java.lang.String r10 = "audLogging"
            goto L_0x027b
        L_0x0250:
            java.lang.Object r3 = r12.A01
            X.NJ5 r3 = (X.NJ5) r3
            X.OSf r2 = r3.A07
            java.lang.String r1 = "icebreaker_settings_delete_question_button_click"
            r0 = 0
            X.C70932OSf.A00(r2, r1, r0, r0)
            X.OMj r2 = r3.A08
            if (r2 == 0) goto L_0x000a
            X.OyN r1 = r3.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A08(r2, r0)
            android.content.Intent r2 = r3.A00
            java.lang.String r1 = "should_seen_messaging_hub_afterparty_dialog"
            r0 = 504(0x1f8, float:7.06E-43)
            r2.putExtra(r1, r0)
            return
        L_0x0271:
            java.lang.Object r6 = r12.A01
            X.NIh r6 = (X.C68444NIh) r6
            X.Mtz r5 = r6.A04
            if (r5 != 0) goto L_0x0283
            java.lang.String r10 = "viewModel"
        L_0x027b:
            X.0qQ.A0F(r10)
        L_0x027e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0283:
            X.05G r0 = r5.A08
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x029c
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 21
            X.MFW r0 = new X.MFW
            r0.<init>(r5, r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x029c:
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x000a
        L_0x02a2:
            r0.onBackPressed()
            return
        L_0x02a6:
            java.lang.Object r0 = r12.A01
            X.NKo r0 = (X.C68495NKo) r0
            X.MuF r5 = r0.A0E()
            com.instagram.model.direct.DirectThreadKey r0 = r5.A09
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L_0x000a
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 17
            X.MFW r0 = new X.MFW
            r0.<init>(r5, r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x02c4:
            X.DbW.A0r(r13)
            java.lang.Object r2 = r12.A01
            X.NKo r2 = (X.C68495NKo) r2
            java.lang.String r1 = r2.A0K
            java.lang.String r0 = "challenges"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000a
            X.0eM r0 = r2.A0S
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OyR r3 = X.C69869NtX.A00(r0)
            java.lang.String r5 = X.C66580MXl.A0w(r2)
            com.instagram.model.direct.DirectThreadKey r0 = r2.A0G()
            java.lang.String r6 = r0.A01
            java.lang.Integer r4 = X.C66583MXo.A0d(r2)
            java.lang.String r7 = "delete_challenge_cancel"
            java.lang.String r8 = "tap"
            java.lang.String r9 = "cancel_button"
            goto L_0x033e
        L_0x02f4:
            java.lang.Object r1 = r12.A01
            X.NKo r1 = (X.C68495NKo) r1
            X.MuF r3 = r1.A0E()
            java.lang.Boolean r0 = r1.A0G
            boolean r7 = X.DbX.A1a(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r3.A09
            java.lang.String r4 = r0.A00
            if (r4 == 0) goto L_0x0316
            X.6oS r0 = X.C318116oQ.A00(r3)
            r5 = 0
            r6 = 4
            X.MEW r2 = new X.MEW
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x0316:
            java.lang.String r2 = r1.A0K
            java.lang.String r0 = "challenges"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x000a
            X.0eM r0 = r1.A0S
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OyR r3 = X.C69869NtX.A00(r0)
            java.lang.String r5 = X.C66580MXl.A0w(r1)
            com.instagram.model.direct.DirectThreadKey r0 = r1.A0G()
            java.lang.String r6 = r0.A01
            java.lang.Integer r4 = X.C66583MXo.A0d(r1)
            java.lang.String r7 = "delete_challenge"
            java.lang.String r8 = "tap"
            java.lang.String r9 = "delete_button"
        L_0x033e:
            java.lang.String r10 = "delete_challenge_dialog"
            r2 = 0
            r11 = r2
            X.C72202OyR.A03(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0346:
            java.lang.Object r0 = r12.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x000a
            r0.invoke()
            return
        L_0x0350:
            java.lang.Object r0 = r12.A01
            X.GnV r0 = (X.C53398GnV) r0
            java.lang.Object r0 = r0.A01
            goto L_0x0007
        L_0x0358:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x035d:
            java.lang.String r0 = "Error while deleting. No quick reply with ID: "
            java.lang.String r0 = X.002.A0R(r0, r8)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0368:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x036d:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r3.iterator()
        L_0x0375:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x038b
            X.3lr r1 = X.C41845B3m.A0V(r2)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0375
            r7.add(r0)
            goto L_0x0375
        L_0x038b:
            java.util.Iterator r3 = r3.iterator()
        L_0x038f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a9
            X.3lr r2 = X.C41845B3m.A0V(r3)
            java.lang.String r1 = "id"
            java.lang.String r0 = r2.A07(r1)
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = r2.A07(r1)
            r8.add(r0)
            goto L_0x038f
        L_0x03a9:
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            java.lang.String r1 = X.DbV.A0s()
            java.lang.String r0 = "client_mutation_id"
            boolean r2 = X.C41848B3p.A1Z(r4, r0, r1)
            com.google.common.collect.ImmutableList r1 = r8.build()
            java.lang.String r0 = "subscription_ids"
            r4.A05(r0, r1)
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            com.facebook.pando.PandoGraphQLRequest r2 = X.C71581OnI.A00(r4, r3, r2, r0)
            X.0qQ.A0A(r2)
            r0 = 8
            X.OnG r1 = new X.OnG
            r1.<init>(r0, r6, r7)
            r0 = 10
            X.C71567On2.A00(r1, r2, r5, r6, r0)
            return
        L_0x03dc:
            if (r14 == 0) goto L_0x03f5
            r0 = 1
            if (r14 == r0) goto L_0x03ee
            r0 = 2
            if (r14 != r0) goto L_0x03fc
            java.lang.Object r1 = r12.A01
            X.PtP r1 = (X.C74349PtP) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x03ea:
            r1.DVV(r0)
            return
        L_0x03ee:
            java.lang.Object r1 = r12.A01
            X.PtP r1 = (X.C74349PtP) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x03ea
        L_0x03f5:
            java.lang.Object r1 = r12.A01
            X.PtP r1 = (X.C74349PtP) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x03ea
        L_0x03fc:
            java.lang.String r1 = "The dialog option index "
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0c(r1, r0, r14)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0409:
            java.lang.Object r0 = r12.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0411:
            java.lang.Object r2 = r12.A01
            X.PuZ r2 = (X.C74419PuZ) r2
            r1 = 1
            goto L_0x041c
        L_0x0417:
            java.lang.Object r2 = r12.A01
            X.PuZ r2 = (X.C74419PuZ) r2
            r1 = 0
        L_0x041c:
            X.N4G r0 = new X.N4G
            r0.<init>(r1)
            r2.DVU(r0)
            return
        L_0x0425:
            java.lang.Object r2 = r12.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.0cT r0 = com.instagram.direct.stella.permission.StellaPermissionActivity.A01
            android.content.Intent r1 = X.DbS.A09()
            r0 = 0
            r2.setResult(r0, r1)
            r2.finish()
            return
        L_0x0437:
            java.lang.Object r0 = r12.A01
            X.PuW r0 = (X.C74416PuW) r0
            X.PEc r0 = (X.C72649PEc) r0
            java.lang.Object r2 = r0.A02
            X.MiI r2 = (X.C67098MiI) r2
            java.lang.Object r1 = r0.A01
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            r0 = 1
            r2.CLI(r1, r0)
            return
        L_0x044a:
            java.lang.Object r0 = r12.A01
            X.PuW r0 = (X.C74416PuW) r0
            r0.D84()
            return
        L_0x0452:
            java.lang.Object r1 = r12.A01
            X.P8g r1 = (X.C72497P8g) r1
            com.instagram.common.session.UserSession r3 = r1.A05
            X.0eK r0 = r1.A0s
            java.lang.Object r2 = X.C66580MXl.A0s(r0)
            X.3sy r2 = (X.C254743sy) r2
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r1.A00
            if (r0 == 0) goto L_0x046b
            java.lang.String r1 = r0.A01
        L_0x0466:
            r0 = 1
            X.C3265677h.A0k(r3, r2, r1, r0)
            return
        L_0x046b:
            r1 = 0
            goto L_0x0466
        L_0x046d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r3 = r0.A04()
            if (r2 < r1) goto L_0x0488
            java.lang.String r0 = "android.settings.BIOMETRIC_ENROLL"
        L_0x047d:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x0589
        L_0x0488:
            java.lang.String r0 = "android.settings.SECURITY_SETTINGS"
            goto L_0x047d
        L_0x048b:
            java.lang.Object r1 = r12.A01
            X.NIn r1 = (X.C68449NIn) r1
            X.Nmo r0 = X.C69506Nmo.A0A
            X.C68449NIn.A09(r0, r1)
            return
        L_0x0495:
            java.lang.Object r0 = r12.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.C68449NIn.A0I(r0)
            return
        L_0x049d:
            java.lang.Object r0 = r12.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.MuH r2 = X.C68449NIn.A02(r0)
            X.05G r1 = r2.A0E
            X.NjF r0 = X.C69314NjF.PROMPT_NOTE
            r1.Epw(r0)
            X.C67761MuH.A02(r2)
            return
        L_0x04b0:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r3 = r0.A04()
            if (r2 < r1) goto L_0x04cf
            java.lang.String r0 = "android.settings.BIOMETRIC_ENROLL"
        L_0x04c0:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.Object r1 = r12.A01
            X.Moe r1 = (X.C67484Moe) r1
            X.OIr r0 = X.C67484Moe.A08
            androidx.fragment.app.Fragment r0 = r1.A01
            goto L_0x0589
        L_0x04cf:
            java.lang.String r0 = "android.settings.SECURITY_SETTINGS"
            goto L_0x04c0
        L_0x04d2:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r3 = r0.A04()
            if (r2 < r1) goto L_0x04ef
            java.lang.String r0 = "android.settings.BIOMETRIC_ENROLL"
        L_0x04e2:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.Object r0 = r12.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            X.4DH r0 = r0.A1J
            goto L_0x0589
        L_0x04ef:
            java.lang.String r0 = "android.settings.SECURITY_SETTINGS"
            goto L_0x04e2
        L_0x04f2:
            java.lang.Object r0 = r12.A01
            X.NKN r0 = (X.NKN) r0
            X.0eM r0 = r0.A0M
            java.lang.Object r3 = r0.getValue()
            X.FYu r3 = (X.C50337FYu) r3
            X.EZo r2 = X.C48146EZo.STORY
            X.EZp r1 = X.C48147EZp.FOLLOW_TO_JOIN_CHAT_SHEET
            r0 = 3062(0xbf6, float:4.291E-42)
            java.lang.String r4 = X.C273654mx.A00(r0)
            java.lang.String r5 = "tap"
            r6 = 0
            X.C50337FYu.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x050f:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A17(r0)
            return
        L_0x0517:
            java.lang.Object r5 = r12.A01
            X.P2i r5 = (X.C72343P2i) r5
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r4 = r5.A01
            com.instagram.user.model.User r0 = r0.A01(r4)
            boolean r0 = r0.CPm()
            if (r0 == 0) goto L_0x0557
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316422388846956(0x8105980000116c, double:3.029989980977622E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0557
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r0 = 73
        L_0x053c:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r4)
            r0 = 2131963000(0x7f132c78, float:1.9562741E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0U = r0
            r3.A0D(r2, r1)
            return
        L_0x0557:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315675064536532(0x8104ea00000dd4, double:3.0295173700744765E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x056b
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x053c
        L_0x056b:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x053c
        L_0x056e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r3 = r0.A04()
            if (r2 < r1) goto L_0x0591
            java.lang.String r0 = "android.settings.BIOMETRIC_ENROLL"
        L_0x057e:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.Object r0 = r12.A01
            X.P2x r0 = (X.C72358P2x) r0
            androidx.fragment.app.Fragment r0 = r0.A01
        L_0x0589:
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r3.A0G(r0, r2)
            return
        L_0x0591:
            java.lang.String r0 = "android.settings.SECURITY_SETTINGS"
            goto L_0x057e
        L_0x0594:
            java.lang.Object r5 = r12.A01
            X.P2a r5 = (X.C72335P2a) r5
            com.instagram.common.session.UserSession r1 = r5.A02
            java.lang.String r0 = "CreateCutoverThreadSection"
            X.6EZ r0 = X.AnonymousClass6EY.A00(r1, r0)
            X.6Ea r6 = r0.A00
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.N4P r2 = r5.A04
            X.0eM r1 = r2.A0c
            java.util.List r0 = X.JTO.A15(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x05dd
            java.util.List r0 = r2.A0T
            java.util.List r0 = X.00k.A0a(r0)
        L_0x05ba:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x05c2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05e2
            java.lang.Object r0 = r2.next()
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r1 = r0.A00
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            r4.add(r0)
            goto L_0x05c2
        L_0x05dd:
            java.util.List r0 = X.JTO.A15(r1)
            goto L_0x05ba
        L_0x05e2:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x05ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05fc
            java.lang.Object r0 = r1.next()
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = (com.instagram.model.direct.threadkey.impl.MsysPendingRecipient) r0
            java.lang.String r0 = r0.A07
            r3.add(r0)
            goto L_0x05ea
        L_0x05fc:
            X.1aU r2 = r6.A00
            java.lang.String r1 = "get_should_use_secure_thread"
            r0 = 54
            X.1aU r0 = X.C72120Owf.A01(r2, r3, r0)
            X.1aU r2 = X.C66582MXn.A0N(r0, r1)
            X.1a8 r1 = r5.A01
            r0 = 7
            X.PU9.A00(r2, r1, r4, r5, r0)
            return
        L_0x0611:
            java.lang.Object r4 = r12.A01
            X.Mc7 r4 = (X.C66762Mc7) r4
            androidx.fragment.app.FragmentActivity r3 = r4.A0E
            com.instagram.common.session.UserSession r2 = r4.A0G
            r1 = 1
            X.Oro r0 = new X.Oro
            r0.<init>(r4, r1)
            X.C18676VwZ.A00(r3, r0, r2)
            X.C66762Mc7.A01(r4)
            return
        L_0x0626:
            java.lang.Object r0 = r12.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r0 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r0
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment.A00(r0)
            r0.A02()
            return
        L_0x0631:
            java.lang.Object r5 = r12.A01
            X.OVT r5 = (X.OVT) r5
            X.OSf r4 = r5.A06
            r3 = 0
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "0"
            java.lang.String r0 = "enabled_status"
            r2.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "icebreaker_settings_show_question_button_toggled"
            X.C70932OSf.A00(r4, r0, r1, r2)
            X.OyN r0 = r5.A07
            r0.A09(r3)
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r0 = r5.A05
            r0.A08()
            return
        L_0x0654:
            java.lang.Object r3 = r12.A01
            X.NJ5 r3 = (X.NJ5) r3
            X.OSf r2 = r3.A07
            java.lang.String r1 = "icebreaker_settings_discard_changes_button_click"
            r0 = 0
            X.C70932OSf.A00(r2, r1, r0, r0)
            X.OyN r0 = r3.A09
            java.lang.Integer r1 = r0.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            if (r1 != r0) goto L_0x0676
            r0 = 0
            r2.setResult(r0)
        L_0x0672:
            X.DbT.A1K(r3)
            return
        L_0x0676:
            r1 = -1
            android.content.Intent r0 = r3.A00
            r2.setResult(r1, r0)
            goto L_0x0672
        L_0x067d:
            java.lang.Object r3 = r12.A01
            X.NUs r3 = (X.C68732NUs) r3
            X.0eM r2 = r3.A02
            X.Mex r1 = X.C66580MXl.A0U(r2)
            java.lang.String r0 = "OTC_RESTORE_EXIT_DIALOG_CONFIRM_TAP"
            r1.A0B(r0)
            X.Mex r0 = X.C66580MXl.A0U(r2)
            r0.A07()
            r13.dismiss()
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2DR r0 = X.OYI.A00(r0)
            r0.APX(r3)
            return
        L_0x06a4:
            r13.dismiss()
            java.lang.Object r5 = r12.A01
            X.NID r5 = (X.NID) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0eM r0 = r5.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A1e
            java.lang.String r1 = "EncryptedBackupsOneTimeCodeDisplayCodeV2Fragment"
            java.lang.String r0 = "https://help.instagram.com/219914557612468"
            X.FH7.A08(r4, r3, r2, r0, r1)
            goto L_0x06c6
        L_0x06bf:
            r13.dismiss()
            java.lang.Object r5 = r12.A01
            X.0SM r5 = (X.0SM) r5
        L_0x06c6:
            r5.A07()
            return
        L_0x06ca:
            java.lang.Object r2 = A01(r12, r13)
            X.NIC r2 = (X.NIC) r2
            X.0eM r0 = r2.A00
            X.Mex r1 = X.C66580MXl.A0U(r0)
            java.lang.String r0 = "OTC_DISPLAY_CODE_CONFIRM_THIS_WAS_ME_TAP"
            r1.A0B(r0)
            r13.dismiss()
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OW5 r4 = X.C69900Nu2.A00(r0)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.Njy r2 = X.C69358Njy.OTC_DISPLAY_CODE_V2
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.NiX r0 = X.C69271NiX.DIALOG
            X.OW5.A00(r3, r2, r0, r4, r1)
            return
        L_0x06f6:
            r13.dismiss()
            java.lang.Object r0 = r12.A01
            X.NJT r0 = (X.NJT) r0
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A1e
            java.lang.String r1 = "EncryptedBackupsOneTimeCodeDisplayCodeFragment"
            java.lang.String r0 = "https://help.instagram.com/219914557612468"
            X.FH7.A08(r4, r3, r2, r0, r1)
            return
        L_0x0711:
            java.lang.Object r1 = r12.A01
            X.Pu1 r1 = (X.C74385Pu1) r1
            r0 = 2
            r1.D0M(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71249OgE.onClick(android.content.DialogInterface, int):void");
    }
}
