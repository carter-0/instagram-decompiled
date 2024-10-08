package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.user.model.User;
import org.webrtc.EglBase14Impl;

/* renamed from: X.IHg  reason: case insensitive filesystem */
public final class C56911IHg implements CallerContextable {
    public static final String __redex_internal_original_name = "MediaOptionsOverflowHelper";
    public 1wn A00;
    public final int A01;
    public final int A02;
    public final DialogInterface.OnDismissListener A03;
    public final Fragment A04;
    public final FragmentActivity A05;
    public final 0hq A06;
    public final AnonymousClass07i A07;
    public final CallerContext A08 = CallerContext.A01(__redex_internal_original_name);
    public final C227282ix A09;
    public final UserSession A0A;
    public final C56519Hzq A0B;
    public final I7R A0C;
    public final C2360932k A0D;
    public final 1Xj A0E;
    public final AnonymousClass4DU A0F;
    public final AnonymousClass3W1 A0G;
    public final 1sy A0H;
    public final AnonymousClass57U A0I;
    public final AnonymousClass6ST A0J;
    public final C59555JOb A0K;
    public final C249763kK A0L;
    public final C270394gf A0M;
    public final C2355930l A0N;
    public final 0wc A0O;
    public final C2356130n A0P;
    public final AnonymousClass57N A0Q;
    public final C2363233h A0R;
    public final AnonymousClass324 A0S;
    public final C59612JQg A0T;
    public final AnonymousClass325 A0U;
    public final C71093OcF A0V;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0480, code lost:
        if (X.AnonymousClass3WS.A0D(r5) != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0638, code lost:
        X.C46395DeI.A0F(r0.A05, r0.A06, r0.A07, r0.A0A, r0.A0E, r0.A0F, r0.A0G, r20, (java.lang.Runnable) null, "feed_action_sheet", (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x07b8, code lost:
        X.DbW.A1J(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ee, code lost:
        if (X.182.A06(r7, r6, 36325360216191910L) == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0808, code lost:
        r5 = new X.MH0((java.lang.Object) r3, (java.lang.Object) r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0b43, code lost:
        r5.A0H(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0b85, code lost:
        r5.A0r(true);
        r5.A0s(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0bdf, code lost:
        r2.A9V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0c20, code lost:
        r4.setArguments(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0c23, code lost:
        r5.A0D(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0c26, code lost:
        r5.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0cb9, code lost:
        r13 = new X.C64695LgQ(r14, r0, r16, r17, 1);
        r0.A00 = r13;
        r5 = r0.A0A;
        X.AnonymousClass1Nd.A00(r5).A01(r13, X.C61149Jy0.class);
        X.C48153EZv.A05.A04(r0.A04, r5, new X.C57323IXg(0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0e06, code lost:
        r5 = new X.C66167MGe((java.lang.Object) r3, (java.lang.Object) r4, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0e0b, code lost:
        X.AnonymousClass7TE.A1Z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x1011, code lost:
        r14 = null;
        r6 = r0.A0G;
        r6.A1V = "sfplt_in_menu";
        r15 = r0.A0A;
        r13 = r0.A0F;
        r3 = r0.A0E;
        r19 = r0.A0L.getSessionId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x1028, code lost:
        if ((r13 instanceof X.C232682uF) == false) goto L_0x1035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x102a, code lost:
        r14 = ((X.C232682uF) r13).E4l(r3).A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x1035, code lost:
        r16 = r3;
        X.I7O.A04(r13, r14, r15, r16, r6, "sfplt_in_menu", r19, (java.lang.String) null, (java.lang.String) null, X.DbT.A0x(r3), r0.A02, r6.A2a);
        r0.A0K.DJA(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a3, code lost:
        r5.A00((android.content.DialogInterface.OnClickListener) null, r0.A0A, r0.A0E, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x10d6, code lost:
        r5.A0r(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x10d9, code lost:
        r5.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x10dc, code lost:
        X.DbT.A1V(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0311, code lost:
        X.C56719I8z.A01(r5, r0, r1, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x06c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.HNR r41) {
        /*
            r40 = this;
            r4 = 0
            r12 = r41
            int r2 = X.DbU.A02(r12, r4)
            java.lang.String r9 = "Required value was null."
            r0 = 8
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r5 = "media_options"
            r3 = 1
            r0 = r40
            switch(r2) {
                case 0: goto L_0x0c2b;
                case 1: goto L_0x0017;
                case 2: goto L_0x0017;
                case 3: goto L_0x0017;
                case 4: goto L_0x0017;
                case 5: goto L_0x0017;
                case 6: goto L_0x0017;
                case 7: goto L_0x0be4;
                case 8: goto L_0x0b98;
                case 9: goto L_0x0b8d;
                case 10: goto L_0x0017;
                case 11: goto L_0x0017;
                case 12: goto L_0x0c8b;
                case 13: goto L_0x10e1;
                case 14: goto L_0x0b67;
                case 15: goto L_0x1099;
                case 16: goto L_0x0b48;
                case 17: goto L_0x0ae5;
                case 18: goto L_0x0a6d;
                case 19: goto L_0x09b2;
                case 20: goto L_0x0970;
                case 21: goto L_0x08e1;
                case 22: goto L_0x08bd;
                case 23: goto L_0x0017;
                case 24: goto L_0x107f;
                case 25: goto L_0x08b0;
                case 26: goto L_0x089b;
                case 27: goto L_0x0886;
                case 28: goto L_0x107a;
                case 29: goto L_0x0850;
                case 30: goto L_0x07bd;
                case 31: goto L_0x105d;
                case 32: goto L_0x0774;
                case 33: goto L_0x0750;
                case 34: goto L_0x0720;
                case 35: goto L_0x0761;
                case 36: goto L_0x0017;
                case 37: goto L_0x0017;
                case 38: goto L_0x100c;
                case 39: goto L_0x100f;
                case 40: goto L_0x0706;
                case 41: goto L_0x06a6;
                case 42: goto L_0x0fee;
                case 43: goto L_0x065b;
                case 44: goto L_0x0636;
                case 45: goto L_0x0633;
                case 46: goto L_0x0a6d;
                case 47: goto L_0x0017;
                case 48: goto L_0x0125;
                case 49: goto L_0x0125;
                case 50: goto L_0x0cb1;
                case 51: goto L_0x0125;
                case 52: goto L_0x0017;
                case 53: goto L_0x0017;
                case 54: goto L_0x0fe3;
                case 55: goto L_0x05ee;
                case 56: goto L_0x0fd8;
                case 57: goto L_0x05da;
                case 58: goto L_0x0017;
                case 59: goto L_0x05b2;
                case 60: goto L_0x057d;
                case 61: goto L_0x055b;
                case 62: goto L_0x052a;
                case 63: goto L_0x0504;
                case 64: goto L_0x0fcf;
                case 65: goto L_0x0017;
                case 66: goto L_0x03db;
                case 67: goto L_0x03ad;
                case 68: goto L_0x03ad;
                case 69: goto L_0x0711;
                case 70: goto L_0x0711;
                case 71: goto L_0x0fc1;
                case 72: goto L_0x0ef9;
                case 73: goto L_0x0e60;
                case 74: goto L_0x07f5;
                case 75: goto L_0x0017;
                case 76: goto L_0x0017;
                case 77: goto L_0x0017;
                case 78: goto L_0x1065;
                case 79: goto L_0x1065;
                case 80: goto L_0x1065;
                case 81: goto L_0x1065;
                case 82: goto L_0x0017;
                case 83: goto L_0x0017;
                case 84: goto L_0x0017;
                case 85: goto L_0x0017;
                case 86: goto L_0x0017;
                case 87: goto L_0x0017;
                case 88: goto L_0x0017;
                case 89: goto L_0x0fb1;
                case 90: goto L_0x07e4;
                case 91: goto L_0x0017;
                case 92: goto L_0x083e;
                case 93: goto L_0x0388;
                case 94: goto L_0x0363;
                case 95: goto L_0x115d;
                case 96: goto L_0x114b;
                case 97: goto L_0x0e53;
                case 98: goto L_0x0340;
                case 99: goto L_0x0e37;
                case 100: goto L_0x0e26;
                case 101: goto L_0x108a;
                case 102: goto L_0x0326;
                case 103: goto L_0x02e3;
                case 104: goto L_0x02d1;
                case 105: goto L_0x0e1b;
                case 106: goto L_0x0e10;
                case 107: goto L_0x02a9;
                case 108: goto L_0x025f;
                case 109: goto L_0x0dbf;
                case 110: goto L_0x0d9f;
                case 111: goto L_0x1058;
                case 112: goto L_0x1053;
                case 113: goto L_0x0017;
                case 114: goto L_0x0017;
                case 115: goto L_0x0017;
                case 116: goto L_0x045b;
                case 117: goto L_0x0415;
                case 118: goto L_0x021b;
                case 119: goto L_0x0df3;
                case 120: goto L_0x0ddf;
                case 121: goto L_0x01c7;
                case 122: goto L_0x0bb0;
                case 123: goto L_0x0017;
                case 124: goto L_0x0017;
                case 125: goto L_0x0017;
                case 126: goto L_0x0cdd;
                case 127: goto L_0x0017;
                case 128: goto L_0x0017;
                case 129: goto L_0x0017;
                case 130: goto L_0x0017;
                case 131: goto L_0x0017;
                case 132: goto L_0x0017;
                case 133: goto L_0x01ad;
                case 134: goto L_0x019a;
                case 135: goto L_0x0017;
                case 136: goto L_0x0190;
                case 137: goto L_0x0172;
                case 138: goto L_0x0017;
                case 139: goto L_0x0017;
                case 140: goto L_0x0017;
                case 141: goto L_0x0017;
                case 142: goto L_0x005c;
                case 143: goto L_0x0017;
                case 144: goto L_0x0017;
                case 145: goto L_0x0017;
                case 146: goto L_0x0017;
                case 147: goto L_0x0017;
                case 148: goto L_0x0017;
                case 149: goto L_0x0017;
                case 150: goto L_0x0017;
                case 151: goto L_0x0017;
                case 152: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            X.I7R r1 = r0.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0C(r12, r0)
            return
        L_0x001f:
            X.1Xj r2 = r0.A0E
            boolean r1 = r2.A5G()
            if (r1 == 0) goto L_0x0059
            X.9OT r6 = X.AnonymousClass9OT.REEL
        L_0x0029:
            androidx.fragment.app.FragmentActivity r5 = r0.A05
            com.instagram.common.session.UserSession r8 = r0.A0A
            X.4DU r1 = r0.A0F
            java.lang.String r9 = r1.getModuleName()
            java.lang.String r10 = r2.A2n()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r7 = r2.A1I()
            r11 = r4
            X.JUL.A00(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r17 = r1.getModuleName()
            java.lang.String r19 = r2.A2n()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r14 = r2.A1I()
            r16 = 0
            r1 = 1388(0x56c, float:1.945E-42)
            java.lang.String r18 = X.AnonymousClass000.A00(r1)
            r13 = r6
            r15 = r8
            X.C250563lf.A0e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0017
        L_0x0059:
            X.9OT r6 = X.AnonymousClass9OT.POST
            goto L_0x0029
        L_0x005c:
            com.instagram.common.session.UserSession r6 = r0.A0A
            X.0Tu r7 = X.0Tu.A05
            r1 = 36325360216126373(0x810db9000533a5, double:3.035642298938867E-306)
            boolean r1 = X.182.A06(r7, r6, r1)
            if (r1 == 0) goto L_0x009a
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            X.1Xj r1 = r0.A0E
            java.lang.String r8 = r1.A2n()
            X.0iw r5 = X.AnonymousClass6WL.A01(r2)
            if (r5 == 0) goto L_0x009a
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r6)
            java.lang.String r1 = "instagram_feed_self_view_overflow_menu_move_to_drafts_option_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x009a
            X.DbW.A15(r2, r5)
            java.lang.Long r1 = X.DbZ.A0d(r8)
            X.C51965G9l.A1E(r2, r1)
            X.DbX.A1L(r2)
        L_0x009a:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            androidx.fragment.app.Fragment r11 = r0.A04
            X.1Xj r5 = r0.A0E
            r14 = 0
            X.ELE r32 = new X.ELE
            r33 = r1
            r34 = r6
            r35 = r5
            r36 = r14
            r37 = r4
            r38 = r3
            r39 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            com.facebook.common.callercontext.CallerContext r1 = X.C56910IHf.A00
            androidx.fragment.app.FragmentActivity r26 = r11.requireActivity()
            X.0wc r31 = X.AnonymousClass0kN.A02(r6)
            androidx.fragment.app.FragmentActivity r10 = r11.requireActivity()
            X.2MU r2 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            android.app.Application r1 = r10.getApplication()
            X.0qQ.A07(r1)
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r9 = r2.A00(r1, r6)
            r1 = 9
            X.Iny r8 = new X.Iny
            r8.<init>(r1, r5, r6, r9)
            X.I6o r25 = X.C56659I6o.A00
            boolean r3 = X.C56659I6o.A03(r6, r5)
            java.lang.String r22 = X.I5I.A00(r10, r6, r3)
            if (r3 == 0) goto L_0x00f0
            r1 = 36325360216191910(0x810db9000633a6, double:3.035642298980313E-306)
            boolean r1 = X.182.A06(r7, r6, r1)
            r24 = 2131956706(0x7f1313e2, float:1.9549975E38)
            if (r1 != 0) goto L_0x00f3
        L_0x00f0:
            r24 = 2131971792(0x7f134ed0, float:1.9580573E38)
        L_0x00f3:
            X.8ae r19 = X.C358278ae.BLUE
            r27 = r14
            r28 = r14
            r29 = r11
            r30 = r9
            r33 = r6
            r34 = r5
            r35 = r8
            r36 = r3
            android.content.DialogInterface$OnClickListener r13 = r25.A05(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            X.I9M r17 = X.C56659I6o.A00(r1, r6, r5, r4)
            r23 = 2131971793(0x7f134ed1, float:1.9580575E38)
            r25 = 2131954722(0x7f130c22, float:1.9545951E38)
            r15 = r14
            r16 = r14
            r20 = r14
            r21 = r14
            r18 = r10
            X.C56659I6o.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0017
        L_0x0125:
            com.instagram.common.session.UserSession r7 = r0.A0A
            java.lang.Integer r10 = X.C246353eS.A02(r7)
            if (r10 == 0) goto L_0x116f
            X.1Xj r8 = r0.A0E
            X.Dfd r5 = X.C246353eS.A01(r8)
            X.HPj r9 = X.C59724JVi.A00(r8)
            boolean r1 = r9 instanceof X.KYX
            if (r1 == 0) goto L_0x015e
            X.4DU r6 = r0.A0F
            X.C246353eS.A08(r5, r6, r7, r8, r9, r10)
            X.LQz r5 = X.C64158LQz.A00
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r4 = r1.requireContext()
            X.KYX r9 = (X.KYX) r9
            X.Ki8 r3 = r9.A00()
            java.lang.String r2 = r9.A00
            if (r2 == 0) goto L_0x0158
            int r1 = r2.length()
            if (r1 > 0) goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            r5.A01(r4, r7, r3, r2)
            goto L_0x0017
        L_0x015e:
            boolean r1 = r5.A00()
            if (r1 != 0) goto L_0x0017
            X.4DU r6 = r0.A0F
            X.C246353eS.A08(r5, r6, r7, r8, r9, r10)
            X.2ix r1 = r0.A09
            if (r1 == 0) goto L_0x0017
            r1.Dk5(r8)
            goto L_0x0017
        L_0x0172:
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.I0v r2 = new X.I0v
            r2.<init>(r5)
            X.1Xj r4 = r0.A0E
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.I0v.A00(r1, r4, r2, r3)
            X.LRh r3 = new X.LRh
            r3.<init>(r5, r1)
            X.HOu r2 = X.C54689HOu.OPEN_CAROUSEL_TURN_ON_FROM_MORE_MENU
            java.lang.String r1 = r4.A2n()
            r3.A04(r2, r1)
            goto L_0x0017
        L_0x0190:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.Hpj r5 = new X.Hpj
            r5.<init>(r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x01a3
        L_0x019a:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.Hpj r5 = new X.Hpj
            r5.<init>(r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x01a3:
            X.1Xj r3 = r0.A0E
            com.instagram.common.session.UserSession r2 = r0.A0A
            r1 = 0
            r5.A00(r1, r2, r3, r4)
            goto L_0x0017
        L_0x01ad:
            androidx.fragment.app.Fragment r2 = r0.A04
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x0017
            X.I7R r1 = r0.A0C
            X.2Q9 r3 = r1.A00
            if (r3 == 0) goto L_0x01c2
            X.0xx r6 = X.G9t.A0t(r2)
            r2 = 0
            r1 = 11
            goto L_0x0808
        L_0x01c2:
            A04(r0)
            goto L_0x0017
        L_0x01c7:
            androidx.fragment.app.FragmentActivity r13 = r0.A05
            X.0hq r14 = r0.A06
            X.1Xj r10 = r0.A0E
            X.3W1 r9 = r0.A0G
            X.4DU r8 = r0.A0F
            X.07i r15 = r0.A07
            com.instagram.common.session.UserSession r7 = r0.A0A
            java.lang.String r6 = "feed_action_sheet"
            r23 = 0
            java.lang.String r1 = r10.getId()
            java.lang.String r5 = "qr_code"
            X.C22031Xty.A0D(r8, r7, r1, r6, r5)
            X.0Tu r11 = X.0Tu.A05
            r1 = 36314859024616287(0x81042c003b0b5f, double:3.0290013031429846E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r11, r7, r1)
            boolean r30 = r1.booleanValue()
            java.lang.Integer r22 = X.AnonymousClass05K.A0A
            java.lang.Boolean r21 = X.DbT.A0l(r30)
            X.FT5 r16 = new X.FT5
            r24 = r16
            r25 = r3
            r26 = r13
            r27 = r7
            r28 = r10
            r29 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r26 = r4
            r17 = r7
            r18 = r10
            r19 = r8
            r20 = r9
            r24 = r6
            r25 = r5
            X.C46395DeI.A0C(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0017
        L_0x021b:
            X.1Xj r6 = r0.A0E
            X.1Xy r1 = r6.A0C
            X.DUd r1 = r1.Bmy()
            if (r1 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r15 = r0.A0A
            java.lang.String r1 = r1.Bmx()
            X.0qQ.A0B(r1, r3)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r15)
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "repost/%s/delete_repost/"
            r5.A0K(r1, r2)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            X.1OC r2 = X.DbU.A0S(r5, r2, r1)
            androidx.fragment.app.FragmentActivity r14 = r0.A05
            X.4gf r1 = r0.A0M
            X.ELE r13 = new X.ELE
            r18 = r3
            r19 = r4
            r20 = r4
            r17 = r1
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r2.A00 = r13
            X.07i r1 = r0.A07
            X.1ES.A00(r14, r1, r2)
            goto L_0x0017
        L_0x025f:
            androidx.fragment.app.Fragment r13 = r0.A04
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.1Xy r1 = r2.A0C
            com.instagram.user.model.User r1 = r1.B9t()
            if (r1 == 0) goto L_0x1179
            java.lang.String r3 = r1.getId()
            java.lang.String r1 = r2.A2n()
            if (r1 == 0) goto L_0x1174
            X.1NY r5 = X.AnonymousClass7TG.A0a(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "groups/%s/unpin_media/%s/"
            r5.A0K(r1, r2)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            X.1OC r2 = X.DbU.A0S(r5, r2, r1)
            r16 = 2131975968(0x7f135f20, float:1.9589043E38)
            r17 = 2131238939(0x7f08201b, float:1.809417E38)
            r18 = 2131975964(0x7f135f1c, float:1.9589035E38)
            r19 = 2131975965(0x7f135f1d, float:1.9589037E38)
            r1 = 10
            X.Iw3 r14 = new X.Iw3
            r14.<init>(r3, r4, r1)
            X.Isc r15 = X.C58481Isc.A00
            X.H4u r1 = X.I0I.A00(r13, r14, r15, r16, r17, r18, r19)
            r2.A00 = r1
            goto L_0x06f0
        L_0x02a9:
            X.57U r1 = r0.A0I
            if (r1 == 0) goto L_0x02cc
            int r2 = r1.BXA()
            r1 = 3
            if (r2 < r1) goto L_0x02cc
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131969470(0x7f1345be, float:1.9575864E38)
            r5.A09(r1)
            r1 = 2131963222(0x7f132d56, float:1.9563191E38)
            r5.A08(r1)
            r2 = 2131956481(0x7f131301, float:1.9549519E38)
            r1 = 17
            goto L_0x0311
        L_0x02cc:
            A06(r0)
            goto L_0x0017
        L_0x02d1:
            androidx.fragment.app.Fragment r3 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            java.lang.String r1 = r1.A2n()
            if (r1 == 0) goto L_0x117e
            X.1OC r2 = X.C56334Hwl.A01(r3, r2, r1)
            goto L_0x06f0
        L_0x02e3:
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.F3s r4 = X.C49061Eof.A00(r5)
            X.EWT r2 = X.EWT.PIN_POST_FLOW
            r1 = 0
            r4.A02(r2, r1)
            X.57U r1 = r0.A0I
            if (r1 == 0) goto L_0x0017
            int r2 = r1.BXA()
            r1 = 3
            if (r2 < r1) goto L_0x0316
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131969470(0x7f1345be, float:1.9575864E38)
            r5.A09(r1)
            r1 = 2131969469(0x7f1345bd, float:1.9575862E38)
            r5.A08(r1)
            r2 = 2131956481(0x7f131301, float:1.9549519E38)
            r1 = 18
        L_0x0311:
            X.C56719I8z.A01(r5, r0, r1, r2)
            goto L_0x10d6
        L_0x0316:
            androidx.fragment.app.Fragment r2 = r0.A04
            X.1Xj r1 = r0.A0E
            java.lang.String r1 = r1.A2n()
            if (r1 == 0) goto L_0x1183
            X.1OC r2 = X.C56334Hwl.A00(r2, r5, r1)
            goto L_0x06f0
        L_0x0326:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r2 = r1.requireContext()
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.1Xj r1 = r0.A0E
            java.lang.String r5 = X.C231122qu.A07(r3, r1)
            java.lang.String r6 = X.C231122qu.A0F(r3, r1)
            java.lang.String r7 = "FEED"
            r4 = 0
            X.I3C.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0017
        L_0x0340:
            androidx.fragment.app.Fragment r2 = r0.A04
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.4DU r5 = r0.A0F
            X.1Xj r4 = r0.A0E
            int r1 = r0.A02
            java.lang.String r7 = java.lang.String.valueOf(r1)
            X.3W1 r1 = r0.A0G
            int r1 = r1.A0W
            java.lang.String r8 = java.lang.String.valueOf(r1)
            X.3kK r1 = r0.A0L
            java.lang.String r9 = r1.getSessionId()
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.C56624I5c.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0017
        L_0x0363:
            X.1Xj r5 = r0.A0E
            boolean r1 = r5.A5G()
            if (r1 == 0) goto L_0x037b
            r3 = 2131964941(0x7f13340d, float:1.9566678E38)
        L_0x036e:
            com.instagram.common.session.UserSession r2 = r0.A0A
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r1 = r1.requireContext()
            X.C56305HwI.A00(r1, r2, r5, r3, r4)
            goto L_0x0017
        L_0x037b:
            boolean r1 = r5.CeS()
            r3 = 2131964940(0x7f13340c, float:1.9566676E38)
            if (r1 == 0) goto L_0x036e
            r3 = 2131964936(0x7f133408, float:1.9566668E38)
            goto L_0x036e
        L_0x0388:
            X.1Xj r5 = r0.A0E
            boolean r1 = r5.A5G()
            if (r1 == 0) goto L_0x03a0
            r4 = 2131964939(0x7f13340b, float:1.9566674E38)
        L_0x0393:
            com.instagram.common.session.UserSession r2 = r0.A0A
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r1 = r1.requireContext()
            X.C56305HwI.A00(r1, r2, r5, r4, r3)
            goto L_0x0017
        L_0x03a0:
            boolean r1 = r5.CeS()
            r4 = 2131964938(0x7f13340a, float:1.9566672E38)
            if (r1 == 0) goto L_0x0393
            r4 = 2131964935(0x7f133407, float:1.9566666E38)
            goto L_0x0393
        L_0x03ad:
            r4 = 2131956500(0x7f131314, float:1.9549557E38)
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            X.8ab r5 = X.DbS.A0X(r2)
            r1 = 2131956501(0x7f131315, float:1.954956E38)
            r5.A09(r1)
            r5.A08(r4)
            r1 = 2131972077(0x7f134fed, float:1.9581151E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 22
            X.I8z r2 = X.C56719I8z.A00(r0, r1)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r5.A0Y(r2, r1, r4, r3)
            r5.A0r(r3)
            r2 = 2131960996(0x7f1324a4, float:1.9558676E38)
            X.I8k r1 = X.C56704I8k.A00
            goto L_0x0b43
        L_0x03db:
            boolean r1 = X.C318996ps.A01()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            X.8ab r5 = X.DbS.A0X(r2)
            X.C51967G9n.A0v()
            r1 = 2131956494(0x7f13130e, float:1.9549545E38)
            r5.A09(r1)
            X.C51967G9n.A0v()
            r1 = 2131956495(0x7f13130f, float:1.9549547E38)
            r5.A08(r1)
            r1 = 2131972077(0x7f134fed, float:1.9581151E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 23
            X.I8z r2 = X.C56719I8z.A00(r0, r1)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r5.A0Y(r2, r1, r4, r3)
            r5.A0r(r3)
            r2 = 2131960996(0x7f1324a4, float:1.9558676E38)
            X.I8l r1 = X.C56705I8l.A00
            goto L_0x0b43
        L_0x0415:
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r6 = r0.A0A
            androidx.fragment.app.Fragment r5 = r0.A04
            X.1Xj r2 = r0.A0E
            java.lang.String r8 = r2.A2n()
            java.util.List r1 = X.C51965G9l.A0w(r2)
            r10 = 1
            if (r1 == 0) goto L_0x0459
            boolean r9 = X.AnonymousClass7TE.A1b(r1)
        L_0x042c:
            boolean r1 = X.AnonymousClass3WS.A0C(r2)
            if (r1 != 0) goto L_0x0439
            boolean r1 = X.AnonymousClass3WS.A0D(r2)
            if (r1 != 0) goto L_0x0439
            r10 = 0
        L_0x0439:
            X.3WR r2 = r2.CEL()
            java.util.Locale r1 = X.AnonymousClass1Q2.A03()
            java.lang.String r1 = r1.getLanguage()
            X.0qQ.A07(r1)
            boolean r11 = r2.A09(r1)
            r1 = 4
            X.I9B r4 = new X.I9B
            r4.<init>(r0, r1)
            java.lang.String r7 = "video_overflow_menu"
            X.C49937FFq.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0017
        L_0x0459:
            r9 = 0
            goto L_0x042c
        L_0x045b:
            com.instagram.common.session.UserSession r13 = r0.A0A
            X.1Xj r5 = r0.A0E
            X.2R8.A02(r13, r5)
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            androidx.fragment.app.Fragment r6 = r0.A04
            java.lang.String r15 = r5.A2n()
            java.util.List r1 = X.C51965G9l.A0w(r5)
            if (r1 == 0) goto L_0x0500
            boolean r18 = X.AnonymousClass7TE.A1b(r1)
        L_0x0474:
            boolean r1 = X.AnonymousClass3WS.A0C(r5)
            if (r1 != 0) goto L_0x0482
            boolean r1 = X.AnonymousClass3WS.A0D(r5)
            r19 = 0
            if (r1 == 0) goto L_0x0484
        L_0x0482:
            r19 = 1
        L_0x0484:
            X.3WR r5 = r5.CEL()
            java.util.Locale r1 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r1.getLanguage()
            X.0qQ.A07(r1)
            boolean r20 = r5.A09(r1)
            r1 = 3
            X.I9B r5 = new X.I9B
            r5.<init>(r0, r1)
            java.lang.String r14 = "video_overflow_menu"
            boolean r1 = X.AnonymousClass3WP.A05(r13)
            r7 = 0
            if (r1 == 0) goto L_0x04f7
            X.E2R r4 = X.C48763Ejm.A00(r4)
        L_0x04aa:
            boolean r1 = X.AnonymousClass3WS.A04(r13)
            if (r1 != 0) goto L_0x04b6
            boolean r1 = X.AnonymousClass3WS.A02(r13)
            if (r1 == 0) goto L_0x04b7
        L_0x04b6:
            r7 = 1
        L_0x04b7:
            X.7Pr r3 = X.DbS.A0W(r13)
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131954758(0x7f130c46, float:1.9546024E38)
            if (r7 == 0) goto L_0x04c7
            r1 = 2131954760(0x7f130c48, float:1.9546028E38)
        L_0x04c7:
            java.lang.String r1 = r2.getString(r1)
            r3.A0d = r1
            X.7Pu r3 = r3.A00()
            r2 = 0
            r1 = 56
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.FCT.A01(r2, r13, r14, r1, r2)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r3.A02(r1, r4)
            X.37D r2 = X.DbT.A0i(r1)
            if (r2 == 0) goto L_0x0017
            X.IZx r1 = new X.IZx
            r1.<init>(r5)
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0H = r1
            goto L_0x0017
        L_0x04f7:
            r16 = r4
            r17 = r3
            X.ES1 r4 = X.C48762Ejl.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x04aa
        L_0x0500:
            r18 = 0
            goto L_0x0474
        L_0x0504:
            X.1Xj r5 = r0.A0E
            X.1sy r1 = r0.A0H
            boolean r1 = X.1sx.A0O(r5, r1)
            if (r1 == 0) goto L_0x0527
            java.lang.String r4 = "FeedAds"
        L_0x0510:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            com.instagram.common.session.UserSession r2 = r0.A0A
            com.instagram.user.model.User r1 = r5.A2A(r2)
            if (r1 == 0) goto L_0x1188
            java.lang.String r1 = r1.getId()
            X.I3C.A01(r3, r2, r1, r4)
            goto L_0x0017
        L_0x0527:
            java.lang.String r4 = "Feed"
            goto L_0x0510
        L_0x052a:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r5 = r1.requireContext()
            X.I7R r1 = r0.A0C
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            X.1Xj r1 = r1.A06
            java.lang.String r2 = r1.A2n()
            if (r2 == 0) goto L_0x118d
            java.lang.String r1 = "media_id"
            r3.put(r1, r2)
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.8dD r6 = new X.8dD
            r6.<init>(r1)
            java.lang.String r7 = "com.instagram.feed.suggested_comments.debug_tool_bottomsheet"
            r10 = 0
            r8 = 0
            r9 = r3
            X.8dn r2 = X.C359638dF.A00(r5, r6, r7, r8, r9, r10)
            X.OsJ r1 = new X.OsJ
            r1.<init>(r0, r4)
            goto L_0x0bdf
        L_0x055b:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.6Yo r5 = X.DbS.A0M(r2, r1)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.1Xj r1 = r0.A0E
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x1192
            android.os.Bundle r3 = X.C51971G9r.A0N(r1)
            X.Ubr r4 = new X.Ubr
            r4.<init>()
            goto L_0x0c20
        L_0x057d:
            r1 = 13
            X.KH1 r7 = new X.KH1
            r7.<init>((java.lang.Object) r0, (int) r1)
            X.6ST r3 = r0.A0J
            androidx.fragment.app.Fragment r2 = r0.A04
            r1 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r1 = r2.getString(r1)
            r3.A00(r1)
            X.AnonymousClass0fN.A00(r3)
            androidx.fragment.app.FragmentActivity r6 = r0.A05
            X.07i r5 = r0.A07
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.3W1 r1 = r0.A0G
            X.MB0 r3 = new X.MB0
            r3.<init>(r6, r4, r2, r1)
            r2 = 477(0x1dd, float:6.68E-43)
            X.5g0 r1 = new X.5g0
            r1.<init>(r3, r2)
            r1.A00 = r7
            X.1ES.A00(r6, r5, r1)
            goto L_0x0017
        L_0x05b2:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.6Yo r5 = X.DbS.A0M(r2, r1)
            X.1Xj r1 = r0.A0E
            java.lang.String r2 = r1.A30()
            if (r2 == 0) goto L_0x1197
            instagram.features.stories.fragment.ReelResharesViewerFragment r4 = new instagram.features.stories.fragment.ReelResharesViewerFragment
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r1 = 2471(0x9a7, float:3.463E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putString(r1, r2)
            goto L_0x0c20
        L_0x05da:
            X.1Xj r3 = r0.A0E
            r0.A08(r3)
            androidx.fragment.app.Fragment r1 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.3W1 r5 = r0.A0G
            X.4DU r4 = r0.A0F
            java.lang.String r6 = "feed_action_sheet"
            X.C46395DeI.A0U(r1, r2, r3, r4, r5, r6)
            goto L_0x0017
        L_0x05ee:
            X.1Xj r1 = r0.A0E
            X.1Xy r1 = r1.A0C
            com.instagram.model.hashtag.Hashtag r4 = r1.B6n()
            if (r4 == 0) goto L_0x0017
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            r2 = 2131975858(0x7f135eb2, float:1.958882E38)
            java.lang.String r1 = r4.getName()
            java.lang.String r1 = X.DbW.A0h(r3, r1, r2)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r1)
            X.8ab r5 = X.DbS.A0X(r3)
            X.FH6.A0B(r1)
            r5.A0q(r1)
            r2 = 2131975854(0x7f135eae, float:1.9588812E38)
            r1 = 24
            X.C56719I8z.A01(r5, r0, r1, r2)
            X.I8m r1 = X.C56706I8m.A00
            r5.A0C(r1)
            com.instagram.common.typedurl.ImageUrl r2 = r4.Bh3()
            if (r2 == 0) goto L_0x10dc
            boolean r1 = X.C253833rU.A02(r2)
            if (r1 != 0) goto L_0x10dc
            X.4DU r1 = r0.A0F
            r5.A0n(r2, r1)
            goto L_0x10dc
        L_0x0633:
            X.EWV r20 = X.EWV.A0N
            goto L_0x0638
        L_0x0636:
            X.EWV r20 = X.EWV.A0H
        L_0x0638:
            androidx.fragment.app.FragmentActivity r13 = r0.A05
            X.0hq r14 = r0.A06
            X.07i r15 = r0.A07
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r3 = r0.A0E
            X.3W1 r2 = r0.A0G
            X.4DU r1 = r0.A0F
            java.lang.String r22 = "feed_action_sheet"
            r21 = 0
            r23 = r21
            r24 = r21
            r17 = r3
            r18 = r1
            r19 = r2
            r16 = r4
            X.C46395DeI.A0F(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0017
        L_0x065b:
            X.1Xj r1 = r0.A0E
            com.instagram.common.session.UserSession r6 = r0.A0A
            com.instagram.user.model.User r5 = r1.A2A(r6)
            if (r5 == 0) goto L_0x119c
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            android.content.Context r4 = X.DbT.A05(r1)
            boolean r1 = r5.A25()
            r3 = r1 ^ 1
            X.4Cl r2 = r5.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2.EW3(r1)
            r5.A0d(r6)
            java.lang.String r2 = r5.getId()
            if (r3 == 0) goto L_0x069f
            r1 = 317(0x13d, float:4.44E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
        L_0x0689:
            X.1OC r3 = X.C49171Eqc.A00(r6, r2, r1)
            r2 = 18
            X.EDb r1 = new X.EDb
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A00 = r1
            X.1ET r1 = X.1ES.A01()
            r1.schedule(r3)
            goto L_0x0017
        L_0x069f:
            r1 = 4140(0x102c, float:5.801E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x0689
        L_0x06a6:
            androidx.fragment.app.Fragment r5 = r0.A04
            boolean r4 = r5 instanceof X.C266514Zg
            if (r4 == 0) goto L_0x06fd
            r1 = 719(0x2cf, float:1.008E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r5, r3)
            r2 = r5
            X.4Zg r2 = (X.C266514Zg) r2
            com.instagram.model.hashtag.Hashtag r1 = r2.BCW()
            if (r1 == 0) goto L_0x06fd
            X.0qQ.A0C(r5, r3)
            com.instagram.model.hashtag.Hashtag r5 = r2.BCW()
        L_0x06c5:
            if (r5 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x06f5
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r2 = X.DbS.A0Y(r1)
            r1 = 2131975452(0x7f135d1c, float:1.9587997E38)
            r2.A09(r1)
            r1 = 2131975453(0x7f135d1d, float:1.9587999E38)
            r2.A08(r1)
            r2.A06()
            X.DbT.A1V(r2)
        L_0x06e1:
            X.1Xj r4 = r0.A0E
            int r3 = r0.A02
            X.4DU r2 = r0.A0F
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.C18683Vwh.A01(r2, r1, r4, r5, r3)
            X.1OC r2 = X.C55026Hax.A00(r1, r4, r5)
        L_0x06f0:
            X.1ES.A03(r2)
            goto L_0x0017
        L_0x06f5:
            X.JOb r2 = r0.A0K
            X.3WA r1 = X.AnonymousClass3WA.UNRELATED_HASHTAG
            r2.DJA(r1)
            goto L_0x06e1
        L_0x06fd:
            X.1Xj r1 = r0.A0E
            X.1Xy r1 = r1.A0C
            com.instagram.model.hashtag.Hashtag r5 = r1.B6n()
            goto L_0x06c5
        L_0x0706:
            X.32k r3 = r0.A0D
            X.1Xj r2 = r0.A0E
            com.instagram.api.schemas.MediaControlEventSourceEnum r1 = com.instagram.api.schemas.MediaControlEventSourceEnum.THREE_DOT_MENU
            r3.DYL(r1, r2)
            goto L_0x0017
        L_0x0711:
            X.I0Z r5 = X.I0Z.A00
            androidx.fragment.app.FragmentActivity r4 = r0.A05
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.07i r1 = r0.A07
            r5.A00(r4, r1, r3, r2)
            goto L_0x0017
        L_0x0720:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131972038(0x7f134fc6, float:1.9581072E38)
            r5.A09(r1)
            X.1Xj r1 = r0.A0E
            boolean r2 = r1.A4W()
            r1 = 2131972104(0x7f135008, float:1.9581206E38)
            if (r2 == 0) goto L_0x073a
            r1 = 2131972106(0x7f13500a, float:1.958121E38)
        L_0x073a:
            r5.A08(r1)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 21
            X.I8z r1 = X.C56719I8z.A00(r0, r1)
            r5.A0K(r1, r2)
            X.I8j r1 = X.C56703I8j.A00
            r5.A0C(r1)
            goto L_0x10dc
        L_0x0750:
            androidx.fragment.app.FragmentActivity r7 = r0.A05
            com.instagram.common.session.UserSession r8 = r0.A0A
            X.2EG r9 = X.2EG.A0C
            java.lang.String r10 = "https://help.instagram.com/996109757881097"
            X.SUL r6 = new X.SUL
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            X.4DU r5 = r0.A0F
            goto L_0x07b8
        L_0x0761:
            androidx.fragment.app.FragmentActivity r5 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r3 = r0.A0E
            X.4DU r1 = r0.A0F
            java.lang.String r2 = r1.getModuleName()
            java.lang.Class<X.IHg> r1 = X.C56911IHg.class
            X.C49946FGa.A05(r5, r4, r3, r1, r2)
            goto L_0x0017
        L_0x0774:
            com.instagram.common.session.UserSession r15 = r0.A0A
            X.4DU r5 = r0.A0F
            X.1Xj r8 = r0.A0E
            X.4jb r7 = new X.4jb
            r7.<init>(r15, r8)
            int r1 = r0.A01
            r7.A00 = r1
            int r6 = r0.A02
            r1 = 529(0x211, float:7.41E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r3 = "about"
            X.C60510iO.A00(r15)
            boolean r1 = X.AnonymousClass3WX.A00(r8, r5)
            if (r1 == 0) goto L_0x07a6
            X.3sc r2 = X.C233822wX.A01(r7, r8, r5, r2)
            r2.A6z = r3
            r1 = -1
            if (r6 == r1) goto L_0x07a2
            r2.A09(r6)
        L_0x07a2:
            r1 = 0
            X.C233822wX.A0C(r15, r2, r8, r5, r1)
        L_0x07a6:
            androidx.fragment.app.FragmentActivity r14 = r0.A05
            X.2EG r16 = X.2EG.A0X
            r1 = 156(0x9c, float:2.19E-43)
            java.lang.String r17 = X.AnonymousClass000.A00(r1)
            X.SUL r6 = new X.SUL
            r18 = r4
            r13 = r6
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x07b8:
            X.DbW.A1J(r5, r6)
            goto L_0x0017
        L_0x07bd:
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.VwK r2 = X.VA1.A00(r3)
            r1 = 5148(0x141c, float:7.214E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A01(r1)
            X.1Xj r1 = r0.A0E
            java.lang.String r2 = r1.A2q()
            if (r2 == 0) goto L_0x0017
            androidx.fragment.app.Fragment r1 = r0.A04
            X.6Yo r5 = X.DbW.A0H(r1, r3)
            X.F3W r1 = X.C51971G9r.A0k(r2)
            X.32F r4 = r1.A01()
            goto L_0x0c23
        L_0x07e4:
            androidx.fragment.app.Fragment r4 = r0.A04
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.4DU r1 = r0.A0F
            java.lang.String r2 = r1.getModuleName()
            X.1Xj r1 = r0.A0E
            X.C48899Elz.A00(r4, r3, r1, r2)
            goto L_0x0017
        L_0x07f5:
            androidx.fragment.app.Fragment r2 = r0.A04
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x0017
            X.I7R r1 = r0.A0C
            X.2Q9 r3 = r1.A00
            if (r3 == 0) goto L_0x080f
            X.0xx r6 = X.G9t.A0t(r2)
            r2 = 0
            r1 = 10
        L_0x0808:
            X.MH0 r5 = new X.MH0
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r0, (X.AnonymousClass4D7) r2, (int) r1)
            goto L_0x0e0b
        L_0x080f:
            X.1Xj r7 = r0.A0E
            com.instagram.common.session.UserSession r6 = r0.A0A
            boolean r1 = X.C52345GOp.A0C(r6, r7)
            if (r1 == 0) goto L_0x0017
            X.4DU r5 = r0.A0F
            X.3W1 r1 = r0.A0G
            java.lang.Integer r8 = X.C51968G9o.A0s(r1)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            boolean r1 = r7.A5p()
            if (r1 == 0) goto L_0x0832
            X.28D r4 = X.28D.A3l
        L_0x082d:
            X.C250563lf.A0U(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0017
        L_0x0832:
            boolean r1 = r7.A5U()
            if (r1 == 0) goto L_0x083b
            X.28D r4 = X.28D.A2p
            goto L_0x082d
        L_0x083b:
            X.28D r4 = X.28D.A1r
            goto L_0x082d
        L_0x083e:
            com.instagram.common.session.UserSession r8 = r0.A0A
            androidx.fragment.app.FragmentActivity r4 = r0.A05
            androidx.fragment.app.Fragment r5 = r0.A04
            X.1Xj r9 = r0.A0E
            X.28D r6 = X.28D.A1D
            r7 = 0
            r10 = r7
            r11 = r3
            X.C55274Hf3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0017
        L_0x0850:
            androidx.fragment.app.FragmentActivity r5 = r0.A05
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r5, r1)
            r1 = 2131956749(0x7f13140d, float:1.9550062E38)
            r4.A01(r1)
            r3 = 2131956747(0x7f13140b, float:1.9550058E38)
            r2 = 66
            X.ICx r1 = new X.ICx
            r1.<init>(r0, r2)
            r4.A04(r1, r3)
            r3 = 2131956750(0x7f13140e, float:1.9550065E38)
            r2 = 67
            X.ICx r1 = new X.ICx
            r1.<init>(r0, r2)
            r4.A04(r1, r3)
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.ICr r1 = X.C56794ICr.A00
            r4.A02(r1, r2)
            X.C51969G9p.A11(r5, r4)
            goto L_0x0017
        L_0x0886:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r5 = r1.requireContext()
            X.1Xj r3 = r0.A0E
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.4DU r1 = r0.A0F
            java.lang.String r1 = r1.getModuleName()
            X.LTW.A03(r5, r2, r3, r1, r4)
            goto L_0x0017
        L_0x089b:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r5 = r1.requireContext()
            X.1Xj r4 = r0.A0E
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.4DU r1 = r0.A0F
            java.lang.String r1 = r1.getModuleName()
            X.LTW.A03(r5, r2, r4, r1, r3)
            goto L_0x0017
        L_0x08b0:
            androidx.fragment.app.FragmentActivity r4 = r0.A05
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.3W1 r1 = r0.A0G
            X.C56304HwH.A01(r4, r3, r2, r1)
            goto L_0x0017
        L_0x08bd:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131956497(0x7f131311, float:1.9549551E38)
            r5.A09(r1)
            r1 = 2131957613(0x7f13176d, float:1.9551815E38)
            r5.A08(r1)
            r2 = 2131957568(0x7f131740, float:1.9551724E38)
            r1 = 20
            X.C56719I8z.A01(r5, r0, r1, r2)
            r5.A0r(r3)
            r2 = 2131958478(0x7f131ace, float:1.955357E38)
            X.I8i r1 = X.C56702I8i.A00
            goto L_0x0b43
        L_0x08e1:
            X.1Xj r7 = r0.A0E
            boolean r1 = r7.A4z()
            if (r1 == 0) goto L_0x0921
            java.util.List r1 = r7.A3j()
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x08f5:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0928
            java.lang.Object r9 = r10.next()
            X.536 r9 = (X.AnonymousClass536) r9
            com.instagram.user.model.User r8 = r9.ByI()
            java.lang.Boolean r1 = r9.Bbh()
            r5 = 0
            boolean r2 = X.AnonymousClass7TG.A1X(r1)
            java.lang.Boolean r1 = r9.CYy()
            if (r1 == 0) goto L_0x0918
            boolean r5 = r1.booleanValue()
        L_0x0918:
            com.instagram.pendingmedia.model.BrandedContentTag r1 = new com.instagram.pendingmedia.model.BrandedContentTag
            r1.<init>(r8, r2, r5)
            r6.add(r1)
            goto L_0x08f5
        L_0x0921:
            java.util.List r6 = java.util.Collections.emptyList()
            X.0qQ.A07(r6)
        L_0x0928:
            boolean r1 = r7.A4z()
            r2 = 0
            if (r1 == 0) goto L_0x096e
            X.1Xy r1 = r7.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r14 = r1.Aho()
        L_0x0935:
            X.1Xy r1 = r7.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r1 = r1.BQ3()
            if (r1 == 0) goto L_0x096c
            X.1Xy r1 = r7.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r13 = r1.BQ3()
        L_0x0943:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            com.instagram.common.session.UserSession r15 = r0.A0A
            X.6Yo r5 = X.DbS.A0M(r1, r15)
            boolean r23 = r7.A5l()
            java.lang.String r16 = r7.getId()
            java.lang.String r17 = "feed"
            r19 = r4
            r20 = r4
            r21 = r3
            r22 = r3
            r18 = r6
            androidx.fragment.app.Fragment r1 = X.LLA.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A0B(r2, r1)
            goto L_0x0c26
        L_0x096c:
            r13 = r2
            goto L_0x0943
        L_0x096e:
            r14 = r2
            goto L_0x0935
        L_0x0970:
            X.1Xj r7 = r0.A0E
            boolean r1 = r7.A4Z()
            if (r1 == 0) goto L_0x098c
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131975823(0x7f135e8f, float:1.958875E38)
            r5.A09(r1)
            r1 = 2131954744(0x7f130c38, float:1.9545996E38)
            r5.A08(r1)
            goto L_0x10d9
        L_0x098c:
            com.instagram.common.session.UserSession r6 = r0.A0A
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            X.3W1 r1 = r0.A0G
            int r10 = r1.getPosition()
            r8 = 0
            r9 = r8
            r11 = r3
            android.os.Bundle r4 = X.C63502KyD.A00(r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.Fragment r3 = r0.A04
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r1 = 253(0xfd, float:3.55E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.DbS.A0b(r2, r4, r6, r5, r1)
            X.DbT.A1L(r3, r1)
            goto L_0x0017
        L_0x09b2:
            X.1Xj r6 = r0.A0E
            boolean r1 = r6.A4Z()
            if (r1 == 0) goto L_0x09c6
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            r2 = 2131954744(0x7f130c38, float:1.9545996E38)
            java.lang.String r1 = "cannot_edit_promoted_post"
            X.C59689JTv.A01(r3, r1, r2, r4)
            goto L_0x0017
        L_0x09c6:
            X.1Xy r1 = r6.A0C
            java.lang.String r1 = r1.getBoostedBySponsor()
            r7 = 0
            if (r1 == 0) goto L_0x09e6
            androidx.fragment.app.FragmentActivity r4 = r0.A05
            com.instagram.common.session.UserSession r3 = r0.A0A
            r1 = 2131954741(0x7f130c35, float:1.954599E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r1)
            r1 = 2131954742(0x7f130c36, float:1.9545992E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r1)
            X.C49946FGa.A04(r4, r7, r3, r2, r1)
            goto L_0x0017
        L_0x09e6:
            boolean r1 = r6.A5V()
            if (r1 != 0) goto L_0x0a2f
            boolean r1 = r6.A5Y()
            if (r1 != 0) goto L_0x0a2f
            boolean r1 = r6.A5g()
            if (r1 == 0) goto L_0x0a2a
            boolean r1 = r6.A4h()
            if (r1 != 0) goto L_0x0a2a
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131961471(0x7f13267f, float:1.955964E38)
            r5.A09(r1)
            r1 = 2131961470(0x7f13267e, float:1.9559638E38)
            r5.A08(r1)
            r4 = 2131961458(0x7f132672, float:1.9559613E38)
            r1 = 15
            X.I8z r2 = X.C56719I8z.A00(r0, r1)
            X.8ae r1 = X.C358278ae.DEFAULT
            r5.A0Q(r2, r1, r4)
            r2 = 2131965836(0x7f13378c, float:1.9568493E38)
            X.I8J r1 = r0.A00(r6)
            r5.A0G(r1, r2)
            goto L_0x10d6
        L_0x0a2a:
            A05(r0)
            goto L_0x0017
        L_0x0a2f:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.6Yo r5 = X.DbS.A0M(r2, r1)
            X.1YO r1 = X.1YO.A00
            X.0qQ.A0A(r1)
            java.lang.String r6 = r6.getId()
            if (r6 == 0) goto L_0x11a1
            X.KSq r4 = new X.KSq
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = X.AnonymousClass7TG.A0j()
            r1 = 1448(0x5a8, float:2.029E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putString(r1, r2)
            r1 = 1447(0x5a7, float:2.028E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.putString(r1, r6)
            r4.setArguments(r3)
            r5.A0B(r7, r4)
            goto L_0x0c26
        L_0x0a6d:
            X.8je r2 = X.C363378jd.A08
            com.instagram.common.session.UserSession r5 = r0.A0A
            com.facebook.common.callercontext.CallerContext r1 = r0.A08
            boolean r1 = r2.A04(r1, r5)
            X.0Tu r6 = X.0Tu.A05
            if (r1 != 0) goto L_0x0a9b
            r1 = 36321576350524963(0x810a48000e2623, double:3.0332493670961316E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 != 0) goto L_0x0abe
            r1 = 36326618641348479(0x810ede0002377f, double:3.0364381321165986E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 == 0) goto L_0x0abe
            X.EXN r7 = X.EXN.A0M
            java.lang.Integer r16 = X.AnonymousClass05K.A05
            X.818 r14 = X.AnonymousClass818.IG_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK
            java.lang.String r17 = "FEED"
            goto L_0x0cb9
        L_0x0a9b:
            r1 = 36322873429731976(0x810b7600002a88, double:3.0340696452095654E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 == 0) goto L_0x0abe
            r1 = 7
            X.J6H r4 = new X.J6H
            r4.<init>(r0, r1)
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r3 = r1.getContext()
            X.IkF r2 = new X.IkF
            r2.<init>(r4)
            X.1Xj r1 = r0.A0E
            X.C64373Lap.A00(r3, r5, r1, r2)
            goto L_0x0017
        L_0x0abe:
            X.1Xj r1 = r0.A0E
            com.instagram.model.sharelater.ShareLaterMedia r3 = new com.instagram.model.sharelater.ShareLaterMedia
            r3.<init>(r1)
            X.AnonymousClass36R.A01()
            com.instagram.creation.fragment.ShareLaterFragment r4 = new com.instagram.creation.fragment.ShareLaterFragment
            r4.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r1 = 479(0x1df, float:6.71E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r3)
            r4.setArguments(r2)
            androidx.fragment.app.Fragment r1 = r0.A04
            X.6Yo r5 = X.DbW.A0H(r1, r5)
            goto L_0x0c23
        L_0x0ae5:
            X.1Xj r3 = r0.A0E
            X.UyC r2 = r3.A1Z()
            X.UyC r1 = X.C16616UyC.PENDING
            if (r2 == r1) goto L_0x0b2c
            X.UyC r2 = r3.A1Z()
            X.UyC r1 = X.C16616UyC.BOOSTED
            if (r2 == r1) goto L_0x0b2c
            X.UyC r2 = r3.A1Z()
            X.UyC r1 = X.C16616UyC.BOOSTED_ELIGIBLE
            if (r2 == r1) goto L_0x0b2c
            boolean r1 = r3.A4g()
            if (r1 == 0) goto L_0x0b27
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131953154(0x7f130602, float:1.954277E38)
            r5.A09(r1)
            r1 = 2131953153(0x7f130601, float:1.9542769E38)
            r5.A08(r1)
            r3 = 2131953143(0x7f1305f7, float:1.9542749E38)
            r1 = 14
            X.I8z r2 = X.C56719I8z.A00(r0, r1)
            X.8ae r1 = X.C358278ae.DEFAULT
            r5.A0Q(r2, r1, r3)
            goto L_0x10d9
        L_0x0b27:
            A02(r0)
            goto L_0x0017
        L_0x0b2c:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131975826(0x7f135e92, float:1.9588755E38)
            r5.A09(r1)
            r1 = 2131975827(0x7f135e93, float:1.9588757E38)
            r5.A08(r1)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            X.I8h r1 = X.C56701I8h.A00
        L_0x0b43:
            r5.A0H(r1, r2)
            goto L_0x10dc
        L_0x0b48:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131956499(0x7f131313, float:1.9549555E38)
            r5.A09(r1)
            r1 = 2131956498(0x7f131312, float:1.9549553E38)
            r5.A08(r1)
            r2 = 2131972296(0x7f1350c8, float:1.9581596E38)
            r1 = 19
            X.I8z r1 = X.C56719I8z.A00(r0, r1)
            r5.A0J(r1, r2)
            goto L_0x0b85
        L_0x0b67:
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131956487(0x7f131307, float:1.9549531E38)
            r5.A09(r1)
            r1 = 2131956486(0x7f131306, float:1.954953E38)
            r5.A08(r1)
            r2 = 2131963287(0x7f132d97, float:1.9563323E38)
            r1 = 16
            X.I8z r1 = X.C56719I8z.A00(r0, r1)
            r5.A0K(r1, r2)
        L_0x0b85:
            r5.A0r(r3)
            r5.A0s(r3)
            goto L_0x10d9
        L_0x0b8d:
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            X.C56654I6j.A02(r3, r2, r1)
            goto L_0x0017
        L_0x0b98:
            X.1Xj r1 = r0.A0E
            java.lang.String r3 = r1.A2n()
            if (r3 == 0) goto L_0x0017
            androidx.fragment.app.Fragment r1 = r0.A04
            X.0xx r6 = X.AnonymousClass07a.A00(r1)
            r2 = 0
            r1 = 42
            X.MFW r5 = new X.MFW
            r5.<init>(r0, r3, r2, r1)
            goto L_0x0e0b
        L_0x0bb0:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r5 = r1.requireContext()
            X.I7R r1 = r0.A0C
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            X.1Xj r1 = r1.A06
            java.lang.String r2 = r1.A2n()
            if (r2 == 0) goto L_0x11a6
            java.lang.String r1 = "media_id"
            r4.put(r1, r2)
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.8dD r6 = new X.8dD
            r6.<init>(r1)
            java.lang.String r7 = "com.instagram.feed.injection.quick_injection_bottomsheet"
            r10 = 0
            r8 = 0
            r9 = r4
            X.8dn r2 = X.C359638dF.A00(r5, r6, r7, r8, r9, r10)
            X.OsJ r1 = new X.OsJ
            r1.<init>(r0, r3)
        L_0x0bdf:
            r2.A9V(r1)
            goto L_0x0017
        L_0x0be4:
            androidx.fragment.app.Fragment r1 = r0.A04
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            com.instagram.common.session.UserSession r6 = r0.A0A
            X.6Yo r5 = X.DbS.A0M(r1, r6)
            X.1Xj r1 = r0.A0E
            java.lang.String r3 = r1.getId()
            if (r3 == 0) goto L_0x11ab
            X.3kK r1 = r0.A0L
            java.lang.String r4 = r1.getSessionId()
            int r2 = r0.A02
            java.lang.String r1 = "media_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "position"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = X.Py2.A00()
            android.os.Bundle r3 = X.DbY.A0C(r1, r4, r3, r2)
            X.AnonymousClass0Dg.A00(r3, r6)
            X.H0h r4 = new X.H0h
            r4.<init>()
        L_0x0c20:
            r4.setArguments(r3)
        L_0x0c23:
            r5.A0D(r4)
        L_0x0c26:
            r5.A04()
            goto L_0x0017
        L_0x0c2b:
            X.Hzq r6 = r0.A0B
            X.1Xj r14 = r0.A0E
            X.3W1 r5 = r0.A0G
            int r8 = r0.A02
            androidx.fragment.app.Fragment r2 = r0.A04
            r1 = 2131963366(0x7f132de6, float:1.9563483E38)
            java.lang.String r3 = X.DbU.A0m(r2, r1)
            X.Uz2 r2 = X.C16666Uz2.HIDE_AD_BUTTON
            X.3WA r21 = X.AnonymousClass3WA.MAIN_FEED_AD_HIDE
            r1 = 0
            java.lang.String r19 = "hide_button"
            com.instagram.common.session.UserSession r13 = r6.A01
            X.4DU r15 = r6.A02
            int r7 = r5.A03
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            r18 = r1
            r20 = r7
            r16 = r1
            X.C233822wX.A0Q(r13, r14, r15, r16, r17, r18, r19, r20)
            android.app.Activity r7 = r6.A00
            java.lang.String r20 = X.C231122qu.A07(r13, r14)
            if (r20 == 0) goto L_0x11b0
            X.TpH r18 = X.C14068TpH.FEED
            X.UzD r19 = X.C16677UzD.AD
            r16 = r15
            r17 = r13
            r15 = r7
            X.OcF r7 = X.ORV.A01(r15, r16, r17, r18, r19, r20)
            r7.A0A = r3
            r7.A02 = r2
            com.instagram.user.model.User r2 = r14.A2A(r13)
            r7.A01 = r2
            X.HH4 r2 = new X.HH4
            r19 = r2
            r20 = r4
            r22 = r6
            r23 = r14
            r24 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            r7.A03 = r2
            X.C71093OcF.A00(r1, r7)
            goto L_0x0017
        L_0x0c8b:
            androidx.fragment.app.Fragment r14 = r0.A04
            boolean r1 = r14 instanceof X.AnonymousClass4DH
            if (r1 == 0) goto L_0x0017
            X.1Yh r13 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.4DU r1 = r0.A0F
            java.lang.String r20 = r1.getModuleName()
            r15 = 0
            r16 = r15
            r21 = r15
            r22 = r3
            r17 = r1
            r18 = r4
            r19 = r2
            r13.A07(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0017
        L_0x0cb1:
            X.EXN r7 = X.EXN.A0J
            java.lang.Integer r16 = X.AnonymousClass05K.A0G
            X.818 r14 = X.AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK
            java.lang.String r17 = "REELS"
        L_0x0cb9:
            X.LgQ r6 = new X.LgQ
            r13 = r6
            r15 = r0
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A00 = r6
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r5)
            java.lang.Class<X.Jy0> r1 = X.C61149Jy0.class
            r2.A01(r6, r1)
            X.IXg r3 = new X.IXg
            r3.<init>(r4)
            X.EZv r2 = X.C48153EZv.A05
            androidx.fragment.app.Fragment r1 = r0.A04
            r2.A04(r1, r5, r3, r7)
            goto L_0x0017
        L_0x0cdd:
            X.1Xj r1 = r0.A0E
            java.util.List r8 = X.C51966G9m.A1I(r1)
            X.28D r1 = X.28D.A0j
            com.instagram.api.schemas.ACRType r7 = com.instagram.api.schemas.ACRType.FEED_CAROUSEL_HISTORICAL
            com.instagram.common.session.UserSession r6 = r0.A0A
            X.8ZP r2 = X.AnonymousClass8ZO.A00(r6)
            r2.A00(r1, r7)
            if (r8 == 0) goto L_0x0d91
            X.Hrt r1 = X.C250563lf.A0C(r1)
            android.os.Bundle r5 = r1.A00()
            X.0qQ.A0B(r7, r4)
            java.lang.String r2 = r7.A00
            r1 = 55
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.putString(r1, r2)
            java.util.Iterator r7 = r8.iterator()
        L_0x0d0c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0d20
            java.lang.Object r2 = r7.next()
            X.1Xj r2 = (X.1Xj) r2
            X.1E8 r1 = X.1E7.A00(r6)
            r1.A01(r2, r3, r4)
            goto L_0x0d0c
        L_0x0d20:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x0d28:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0d36
            java.lang.String r1 = X.C51971G9r.A0v(r2)
            r3.add(r1)
            goto L_0x0d28
        L_0x0d36:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r3)
            r1 = 209(0xd1, float:2.93E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r5.putStringArrayList(r1, r2)
            X.50r r2 = X.C2801950r.CLIPS
            r1 = 19
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.putSerializable(r1, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r2 = "clips_camera"
            androidx.fragment.app.FragmentActivity r1 = r0.A05     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            X.6W8 r5 = X.AnonymousClass6W8.A02(r1, r5, r6, r3, r2)     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            r4 = 2130771974(0x7f010006, float:1.7147053E38)
            r3 = 2130772120(0x7f010098, float:1.714735E38)
            r2 = 2130772119(0x7f010097, float:1.7147347E38)
            r1 = 2130771975(0x7f010007, float:1.7147055E38)
            int[] r1 = new int[]{r4, r3, r2, r1}     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            r5.A0J = r1     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            androidx.fragment.app.Fragment r2 = r0.A04     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            r1 = 19
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            X.0qQ.A0C(r2, r1)     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            r1 = 9587(0x2573, float:1.3434E-41)
            r5.A0D(r2, r1)     // Catch:{ TransactionTooLargeException -> 0x0d7c }
            goto L_0x0017
        L_0x0d7c:
            r3 = 0
            java.lang.String r2 = "CAROUSEL_TO_REELS_ACTION_SHEET"
            java.lang.String r1 = "MediaOptionsOverflowHelper:navigateToCamera: Failed to pass the media list into camera due to TransactionTooLarge for %s"
            java.lang.String r2 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r2)
            X.0qQ.A07(r2)
            X.0sm r1 = X.0Yt.A0E()
            X.0kD.A0I(r2, r3, r1)
            goto L_0x0017
        L_0x0d91:
            java.lang.String r1 = "null_media_list"
            r2.A02(r1)
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            java.lang.String r1 = "sound_sync_media_list_null_error"
            X.C59689JTv.A0B(r2, r1)
            goto L_0x0017
        L_0x0d9f:
            androidx.fragment.app.Fragment r5 = r0.A04
            X.0qQ.A0C(r5, r1)
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.common.session.UserSession r8 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.1sQ r6 = X.C51966G9m.A0n(r2)
            X.4DU r7 = r0.A0F
            X.3W1 r1 = r0.A0G
            int r10 = r1.getPosition()
            X.0qQ.A0B(r5, r4)
            r9 = r2
            X.C56370HxO.A01(r5, r6, r7, r8, r9, r10)
            goto L_0x0017
        L_0x0dbf:
            androidx.fragment.app.Fragment r5 = r0.A04
            X.0qQ.A0C(r5, r1)
            X.4DH r5 = (X.AnonymousClass4DH) r5
            com.instagram.common.session.UserSession r8 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.1sQ r6 = X.C51966G9m.A0n(r2)
            X.4DU r7 = r0.A0F
            X.3W1 r1 = r0.A0G
            int r10 = r1.getPosition()
            X.0qQ.A0B(r5, r4)
            r9 = r2
            X.C56370HxO.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0017
        L_0x0ddf:
            androidx.fragment.app.Fragment r1 = r0.A04
            X.07Z r1 = r1.getViewLifecycleOwner()
            X.57N r4 = r0.A0Q
            if (r4 == 0) goto L_0x11b5
            X.1Xj r3 = r0.A0E
            X.0xx r6 = X.AnonymousClass07a.A00(r1)
            r2 = 0
            r1 = 48
            goto L_0x0e06
        L_0x0df3:
            androidx.fragment.app.Fragment r1 = r0.A04
            X.07Z r1 = r1.getViewLifecycleOwner()
            X.57N r4 = r0.A0Q
            if (r4 == 0) goto L_0x11ba
            X.1Xj r3 = r0.A0E
            X.0xx r6 = X.AnonymousClass07a.A00(r1)
            r2 = 0
            r1 = 47
        L_0x0e06:
            X.MGe r5 = new X.MGe
            r5.<init>((java.lang.Object) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
        L_0x0e0b:
            X.AnonymousClass7TE.A1Z(r5, r6)
            goto L_0x0017
        L_0x0e10:
            androidx.fragment.app.Fragment r3 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            X.GLX.A01(r3, r2, r1)
            goto L_0x0017
        L_0x0e1b:
            androidx.fragment.app.Fragment r3 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            X.GLX.A00(r3, r2, r1)
            goto L_0x0017
        L_0x0e26:
            X.324 r5 = r0.A0S
            X.1Xj r4 = r0.A0E
            X.3W1 r3 = r0.A0G
            int r2 = r3.getPosition()
            X.JQg r1 = r0.A0T
            r5.DgX(r4, r3, r1, r2)
            goto L_0x0017
        L_0x0e37:
            com.instagram.common.session.UserSession r1 = r0.A0A
            X.7kd r2 = X.C340057kd.A00(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.1Xj r5 = r0.A0E
            r2.A04(r5, r1)
            X.324 r4 = r0.A0S
            X.3W1 r3 = r0.A0G
            int r2 = r3.getPosition()
            X.JQg r1 = r0.A0T
            r4.DgX(r5, r3, r1, r2)
            goto L_0x0017
        L_0x0e53:
            X.33h r4 = r0.A0R
            X.1Xj r3 = r0.A0E
            X.3W1 r2 = r0.A0G
            java.lang.String r1 = "three_dot_menu"
            r4.Eul(r3, r2, r1)
            goto L_0x0017
        L_0x0e60:
            X.325 r15 = r0.A0U
            X.1Xj r1 = r0.A0E
            java.util.LinkedHashMap r1 = X.C254423sS.A07(r1)
            java.util.Iterator r10 = X.AnonymousClass7TF.A0s(r1)
        L_0x0e6c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0017
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r16 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x0e88:
            boolean r1 = r3.hasNext()
            r7 = 0
            if (r1 == 0) goto L_0x0ea8
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.DTv r1 = (X.C46292DTv) r1
            X.Pwf r1 = r1.Bbg()
            if (r1 == 0) goto L_0x0ea0
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r7 = r1.BzM()
        L_0x0ea0:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.PENDING
            if (r7 != r1) goto L_0x0e88
            r4.add(r2)
            goto L_0x0e88
        L_0x0ea8:
            java.util.Iterator r9 = r4.iterator()
        L_0x0eac:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0e6c
            java.lang.Object r14 = r9.next()
            X.DTv r14 = (X.C46292DTv) r14
            androidx.fragment.app.Fragment r1 = r15.A00
            android.content.Context r6 = r1.requireContext()
            com.instagram.common.session.UserSession r8 = r15.A03
            X.07i r4 = r15.A01
            X.Pwf r1 = r14.Bbg()
            if (r1 == 0) goto L_0x0ef7
            java.lang.Long r1 = r1.BEY()
        L_0x0ecc:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r2 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.CANCELED
            r18 = 46
            X.PqV r13 = new X.PqV
            r17 = r5
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.String) r17, (int) r18)
            r22 = 17
            X.IoE r1 = new X.IoE
            r18 = r14
            r19 = r15
            r20 = r16
            r21 = r5
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            X.AnonymousClass7TG.A1Q(r4, r3)
            X.1OC r1 = X.C17059VGh.A00(r8, r2, r3, r1, r13)
            X.1ES.A00(r6, r4, r1)
            goto L_0x0eac
        L_0x0ef7:
            r1 = r7
            goto L_0x0ecc
        L_0x0ef9:
            X.325 r8 = r0.A0U
            X.1Xj r7 = r0.A0E
            com.instagram.common.session.UserSession r1 = r8.A03
            java.lang.String r2 = r1.A06
            java.lang.String r1 = X.C51973G9u.A0j(r1, r7)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0f7f
            androidx.fragment.app.Fragment r5 = r8.A00
            android.content.Context r11 = r5.requireContext()
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r9 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            X.1Xj r10 = X.C254423sS.A01(r7, r9)
            if (r10 == 0) goto L_0x0017
            java.util.ArrayList r1 = X.C254423sS.A05(r10)
            java.util.Iterator r6 = r1.iterator()
        L_0x0f21:
            boolean r2 = r6.hasNext()
            r1 = 0
            if (r2 == 0) goto L_0x0f7d
            java.lang.Object r3 = r6.next()
            r2 = r3
            X.DTv r2 = (X.C46292DTv) r2
            X.Pwf r2 = r2.Bbg()
            if (r2 == 0) goto L_0x0f21
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r2 = r2.BzM()
            if (r2 != r9) goto L_0x0f21
        L_0x0f3b:
            X.DTv r3 = (X.C46292DTv) r3
            if (r3 == 0) goto L_0x0f7b
            com.instagram.user.model.ProductDetailsProductItemDictIntf r2 = r3.Bfu()
            if (r2 == 0) goto L_0x0f7b
            com.instagram.user.model.User r9 = r2.BRo()
        L_0x0f49:
            X.8ab r5 = X.DbW.A0U(r5)
            r2 = 2131962242(0x7f132982, float:1.9561204E38)
            r5.A09(r2)
            X.1iA r6 = r10.BR7()
            X.1iA r3 = X.1iA.A0Q
            r2 = 2131962266(0x7f13299a, float:1.9561252E38)
            if (r6 != r3) goto L_0x0f61
            r2 = 2131962240(0x7f132980, float:1.95612E38)
        L_0x0f61:
            if (r9 == 0) goto L_0x0f69
            X.4Cl r1 = r9.A03
            java.lang.String r1 = r1.getUsername()
        L_0x0f69:
            X.DbY.A0w(r11, r5, r1, r2)
            r9 = 2131971974(0x7f134f86, float:1.9580942E38)
            X.I8H r2 = new X.I8H
            r2.<init>(r4, r10, r7, r8)
        L_0x0f74:
            X.8ae r1 = X.C358278ae.RED
            r5.A0P(r2, r1, r9)
            goto L_0x10dc
        L_0x0f7b:
            r9 = r1
            goto L_0x0f49
        L_0x0f7d:
            r3 = r1
            goto L_0x0f3b
        L_0x0f7f:
            androidx.fragment.app.Fragment r1 = r8.A00
            android.content.Context r6 = r1.requireContext()
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            X.1Xj r2 = X.C254423sS.A01(r7, r1)
            if (r2 == 0) goto L_0x0017
            X.8ab r5 = X.DbS.A0Y(r6)
            r1 = 2131962244(0x7f132984, float:1.9561208E38)
            r5.A09(r1)
            X.1iA r4 = r2.BR7()
            X.1iA r2 = X.1iA.A0Q
            r1 = 2131962262(0x7f132996, float:1.9561244E38)
            if (r4 != r2) goto L_0x0fa5
            r1 = 2131962236(0x7f13297c, float:1.9561191E38)
        L_0x0fa5:
            X.DbU.A17(r6, r5, r1)
            r9 = 2131971974(0x7f134f86, float:1.9580942E38)
            X.I8H r2 = new X.I8H
            r2.<init>(r3, r6, r7, r8)
            goto L_0x0f74
        L_0x0fb1:
            androidx.fragment.app.FragmentActivity r4 = r0.A05
            com.instagram.common.session.UserSession r3 = r0.A0A
            X.1Xj r2 = r0.A0E
            X.IMh r1 = new X.IMh
            r1.<init>(r0)
            X.HWR.A00(r4, r1, r3, r2)
            goto L_0x0017
        L_0x0fc1:
            X.325 r3 = r0.A0U
            X.1Xj r2 = r0.A0E
            X.IXi r1 = new X.IXi
            r1.<init>(r0)
            r3.A03(r2, r1, r5)
            goto L_0x0017
        L_0x0fcf:
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            X.1Xj r1 = r0.A0E
            X.C56301HwE.A00(r2, r1)
            goto L_0x0017
        L_0x0fd8:
            X.33h r3 = r0.A0R
            X.1Xj r2 = r0.A0E
            X.3W1 r1 = r0.A0G
            r3.EuH(r2, r1)
            goto L_0x0017
        L_0x0fe3:
            X.33h r3 = r0.A0R
            X.1Xj r2 = r0.A0E
            X.3W1 r1 = r0.A0G
            r3.EuJ(r2, r1)
            goto L_0x0017
        L_0x0fee:
            X.1a0 r2 = X.C46447Df9.A03()
            androidx.fragment.app.Fragment r3 = r0.A04
            com.instagram.common.session.UserSession r8 = r0.A0A
            X.07i r4 = r0.A07
            X.1Xj r1 = r0.A0E
            X.1Xj r9 = r1.A1e(r8)
            X.4DU r5 = r0.A0F
            r1 = 6
            X.H50 r6 = new X.H50
            r6.<init>(r0, r1)
            r7 = 0
            r2.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0017
        L_0x100c:
            X.3WA r5 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_CONNECTED
            goto L_0x1011
        L_0x100f:
            X.3WA r5 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS
        L_0x1011:
            r14 = 0
            X.3W1 r6 = r0.A0G
            java.lang.String r4 = "sfplt_in_menu"
            r6.A1V = r4
            com.instagram.common.session.UserSession r15 = r0.A0A
            X.4DU r13 = r0.A0F
            X.1Xj r3 = r0.A0E
            X.3kK r1 = r0.A0L
            java.lang.String r19 = r1.getSessionId()
            r20 = 0
            boolean r1 = r13 instanceof X.C232682uF
            if (r1 == 0) goto L_0x1035
            r1 = r13
            X.2uF r1 = (X.C232682uF) r1
            X.0jB r1 = r1.E4l(r3)
            X.0xF r14 = r1.A00()
        L_0x1035:
            int r2 = r0.A02
            boolean r1 = r6.A2a
            java.lang.String r22 = X.DbT.A0x(r3)
            r21 = r20
            r17 = r6
            r18 = r4
            r23 = r2
            r24 = r1
            r16 = r3
            X.I7O.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.JOb r1 = r0.A0K
            r1.DJA(r5)
            goto L_0x0017
        L_0x1053:
            r0.A0A(r4)
            goto L_0x0017
        L_0x1058:
            r0.A0A(r3)
            goto L_0x0017
        L_0x105d:
            X.OcF r2 = r0.A0V
            r1 = 0
            X.C71093OcF.A00(r1, r2)
            goto L_0x0017
        L_0x1065:
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            com.instagram.common.session.UserSession r4 = r0.A0A
            X.1Xj r5 = r0.A0E
            X.07i r3 = r0.A07
            X.4DU r1 = r0.A0F
            java.lang.String r6 = r1.getModuleName()
            X.GOp r1 = X.C52345GOp.A00
            r1.A0H(r2, r3, r4, r5, r6)
            goto L_0x0017
        L_0x107a:
            A03(r0)
            goto L_0x0017
        L_0x107f:
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            X.C56304HwH.A00(r3, r2, r1)
            goto L_0x0017
        L_0x108a:
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r3 = r1.requireContext()
            com.instagram.common.session.UserSession r2 = r0.A0A
            X.1Xj r1 = r0.A0E
            X.AnonymousClass3YV.A02(r3, r2, r1)
            goto L_0x0017
        L_0x1099:
            androidx.fragment.app.FragmentActivity r7 = r0.A05
            com.instagram.common.session.UserSession r10 = r0.A0A
            androidx.fragment.app.Fragment r2 = r0.A04
            X.1Xj r11 = r0.A0E
            X.4gf r1 = r0.A0M
            X.ELE r13 = new X.ELE
            r14 = r7
            r15 = r10
            r16 = r11
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.facebook.common.callercontext.CallerContext r1 = X.C56910IHf.A00
            X.8ab r5 = X.DbS.A0Y(r7)
            r1 = 2131963209(0x7f132d49, float:1.9563165E38)
            r5.A09(r1)
            r1 = 2131963208(0x7f132d48, float:1.9563163E38)
            r5.A08(r1)
            r1 = 2131957568(0x7f131740, float:1.9551724E38)
            X.0gy r8 = X.AnonymousClass07i.A00(r2)
            X.I8M r6 = new X.I8M
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A0K(r6, r1)
        L_0x10d6:
            r5.A0r(r3)
        L_0x10d9:
            r5.A05()
        L_0x10dc:
            X.DbT.A1V(r5)
            goto L_0x0017
        L_0x10e1:
            androidx.fragment.app.FragmentActivity r13 = r0.A05
            com.instagram.common.session.UserSession r6 = r0.A0A
            androidx.fragment.app.Fragment r15 = r0.A04
            X.1Xj r5 = r0.A0E
            X.4gf r2 = r0.A0M
            X.ELE r16 = new X.ELE
            r17 = r13
            r18 = r6
            r19 = r5
            r20 = r2
            r21 = r4
            r22 = r4
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r21 = 0
            X.ELE r17 = new X.ELE
            r18 = r13
            r19 = r6
            r20 = r5
            r23 = r3
            r24 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.ELE r18 = new X.ELE
            r22 = r18
            r23 = r13
            r24 = r6
            r25 = r5
            r27 = r4
            r28 = r4
            r29 = r4
            r26 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.ELB r1 = new X.ELB
            r1.<init>(r13, r6, r5)
            X.ELE r20 = new X.ELE
            r21 = r13
            r22 = r6
            r23 = r5
            r24 = r2
            r25 = r4
            r26 = r4
            r27 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            X.I8J r14 = r0.A00(r5)
            r19 = r1
            r21 = r6
            r22 = r5
            X.C56910IHf.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0017
        L_0x114b:
            r5 = 2131973459(0x7f135553, float:1.9583954E38)
            com.instagram.common.session.UserSession r3 = r0.A0A
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r2 = r1.requireContext()
            X.1Xj r1 = r0.A0E
            X.C56305HwI.A01(r2, r3, r1, r5, r4)
            goto L_0x0017
        L_0x115d:
            r5 = 2131973458(0x7f135552, float:1.9583952E38)
            com.instagram.common.session.UserSession r4 = r0.A0A
            androidx.fragment.app.Fragment r1 = r0.A04
            android.content.Context r2 = r1.requireContext()
            X.1Xj r1 = r0.A0E
            X.C56305HwI.A01(r2, r4, r1, r5, r3)
            goto L_0x0017
        L_0x116f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1174:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1179:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x117e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1183:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1188:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x118d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1192:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1197:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x119c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x11ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56911IHg.A0B(X.HNR):void");
    }

    public static final void A01(AnonymousClass818 r4, C56911IHg iHg, C61149Jy0 jy0, Integer num) {
        Integer num2 = jy0.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2 && r4 == AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
                        iHg.A09(num, new C58161InR(iHg, 19), false, false);
                    }
                } else if (r4 == AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
                    iHg.A09(num, new C58161InR(iHg, 18), true, false);
                } else if (r4 == AnonymousClass818.IG_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
                    A07(iHg, false);
                }
            } else if (r4 == AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
                iHg.A09(num, new C58161InR(iHg, 17), true, true);
            } else if (r4 == AnonymousClass818.IG_FEED_OVERFLOW_MENU_POST_ACCOUNT_LINK) {
                UserSession userSession = iHg.A0A;
                LJr.A00(userSession).A01(userSession, "upsell", true);
                A07(iHg, true);
            }
        }
    }

    public static final void A02(C56911IHg iHg) {
        1Xj r3 = iHg.A0E;
        boolean A5G = r3.A5G();
        UserSession userSession = iHg.A0A;
        if (A5G) {
            AnonymousClass738.A07(iHg.A05, userSession, r3);
            return;
        }
        AnonymousClass738.A06(iHg.A05, (1P0) null, userSession, r3, 1sw.A04, iHg.A0M);
    }

    public static final void A03(C56911IHg iHg) {
        1Xj r6 = iHg.A0E;
        iHg.A08(r6);
        FragmentActivity fragmentActivity = iHg.A05;
        0hq r2 = iHg.A06;
        AnonymousClass3W1 r8 = iHg.A0G;
        AnonymousClass4DU r7 = iHg.A0F;
        C46395DeI.A0C(fragmentActivity, r2, iHg.A07, new FT3(fragmentActivity, (View) null, 1, false), iHg.A0A, r6, r7, r8, true, AnonymousClass05K.A00, (Runnable) null, "feed_action_sheet", "copy_link", false);
    }

    public static final void A04(C56911IHg iHg) {
        UserSession userSession = iHg.A0A;
        AnonymousClass4DU r5 = iHg.A0F;
        C358148aR.A01(new C358148aR(r5, userSession), "overflow_menu_create_sticker_tapped");
        FragmentActivity fragmentActivity = iHg.A05;
        Fragment fragment = iHg.A04;
        Context requireContext = fragment.requireContext();
        1Xj r7 = iHg.A0E;
        C56266Hva.A01(requireContext, fragmentActivity, iHg.A06, fragment, iHg.A07, r5, userSession, r7);
    }

    public static final void A05(C56911IHg iHg) {
        0Aj A0e = AnonymousClass7TE.A0e(iHg.A0O, "profile_grid_edit_post_clicked");
        if (A0e.isSampled()) {
            C51969G9p.A1A(A0e, iHg.A0F);
            A0e.Cgf();
        }
        C309516Yo A0M2 = DbS.A0M(iHg.A04.requireActivity(), iHg.A0A);
        LGR A012 = AnonymousClass36R.A01();
        1Xj r0 = iHg.A0E;
        String id = r0.getId();
        if (id != null) {
            A0M2.A0D(A012.A02(id, r0.BR7().A00, iHg.A01, iHg.A02, iHg.A0G.A2V));
            A0M2.A04();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A06(C56911IHg iHg) {
        Fragment fragment = iHg.A04;
        UserSession userSession = iHg.A0A;
        1Xj r2 = iHg.A0E;
        User B9t = r2.A0C.B9t();
        if (B9t != null) {
            String id = B9t.getId();
            String A2n = r2.A2n();
            if (A2n != null) {
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0K("groups/%s/pin_media/%s/", new Object[]{id, A2n});
                1OC A0S2 = DbU.A0S(A0a, 1XP.class, 1XY.class);
                A0S2.A00 = I0I.A00(fragment, new C58694Iw3(id, userSession, 9), C58480Isb.A00, 2131969491, R.drawable.instagram_pin_pano_outline_24, 2131969468, 2131969471);
                1ES.A03(A0S2);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A07(C56911IHg iHg, boolean z) {
        1Xj r1 = iHg.A0E;
        String A0n = C51972G9s.A0n();
        KAS kas = new KAS(iHg, A0n, 1, z);
        ShareLaterMedia shareLaterMedia = new ShareLaterMedia(r1);
        shareLaterMedia.A07 = true;
        r1.A49(AnonymousClass3YP.SHARING);
        1OC A002 = C63413KwZ.A00(iHg.A0A, shareLaterMedia, A0n, "likes_sheet");
        A002.A00 = kas;
        iHg.A04.schedule(A002);
    }

    private final void A09(Integer num, 0sL r7, boolean z, boolean z2) {
        String str;
        C363378jd A002 = C363388je.A00(this.A0A);
        CallerContext callerContext = this.A08;
        switch (num.intValue()) {
            case 13:
                str = "feed_share_later";
                break;
            case 14:
                str = "feed_upsell_after_feed_posted";
                break;
            case 15:
                str = "ig_tv";
                break;
            case 16:
                str = "legacy_backfill";
                break;
            case 17:
                str = "likes_sheet";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = C66579MXk.A00(362);
                break;
            case 19:
                str = "reels";
                break;
            case 20:
                str = "reels_in_feed_overflow_menu";
                break;
            case 21:
                str = "reels_overflow_menu";
                break;
            case 22:
                str = AnonymousClass000.A00(1748);
                break;
            default:
                str = AnonymousClass000.A00(759);
                break;
        }
        A002.A01(callerContext, new C57156IQu(r7, 0, z, z2), str);
    }

    private final void A0A(boolean z) {
        User A11 = C51966G9m.A11(this.A0E);
        if (A11 != null) {
            C2355930l r2 = this.A0N;
            C228602lw r4 = new C228602lw(this.A05, this.A07, (Integer) null);
            AnonymousClass4DU r3 = this.A0F;
            r2.A01(r3, r4, (C49564Exz) null, A11, z);
            C297555rw A002 = C297545rv.A00(this.A0A);
            String moduleName = r3.getModuleName();
            User user = A11;
            if (z) {
                A002.A00(user, moduleName, (String) null, (String) null, "feed_overflow_menu");
            } else {
                A002.A01(user, moduleName, (String) null, (String) null, "feed_overflow_menu");
            }
        }
    }

    public C56911IHg(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, FragmentActivity fragmentActivity, 0hq r6, AnonymousClass07i r7, C227282ix r8, C2355930l r9, 0wc r10, UserSession userSession, C2356130n r12, AnonymousClass57N r13, C56519Hzq hzq, I7R i7r, C2360932k r16, 1Xj r17, AnonymousClass4DU r18, C2363233h r19, AnonymousClass3W1 r20, 1sy r21, AnonymousClass57U r22, AnonymousClass324 r23, C59612JQg jQg, AnonymousClass325 r25, AnonymousClass6ST r26, C59555JOb jOb, C249763kK r28, C270394gf r29, C71093OcF ocF, int i, int i2) {
        this.A04 = fragment;
        this.A05 = fragmentActivity;
        this.A06 = r6;
        this.A0Q = r13;
        this.A07 = r7;
        this.A0F = r18;
        this.A0E = r17;
        this.A0G = r20;
        this.A0H = r21;
        this.A02 = i;
        this.A01 = i2;
        this.A0L = r28;
        this.A0C = i7r;
        this.A0A = userSession;
        this.A0P = r12;
        this.A0D = r16;
        this.A0R = r19;
        this.A0S = r23;
        this.A0T = jQg;
        this.A0I = r22;
        this.A0U = r25;
        this.A0B = hzq;
        this.A0V = ocF;
        this.A0J = r26;
        this.A0O = r10;
        this.A0N = r9;
        this.A0K = jOb;
        this.A03 = onDismissListener;
        this.A0M = r29;
        this.A09 = r8;
        ((AnonymousClass4DJ) fragment).registerLifecycleListener(new IO7(this, 0));
    }

    private final I8J A00(1Xj r7) {
        String A2w = r7.A2w();
        if (A2w == null) {
            return null;
        }
        UserSession userSession = this.A0A;
        String A0q = C51972G9s.A0q(userSession, r7);
        String A2n = r7.A2n();
        if (A2n != null) {
            LTV.A04(this.A04.requireActivity(), userSession, A2w, (String) null, A0q, A2n);
            return new I8J(this, A2w, A0q, A2n);
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A08(1Xj r5) {
        if (AnonymousClass3VO.A08(r5)) {
            UserSession userSession = this.A0A;
            if (182.A06(0Tu.A05, userSession, 36317771008579072L)) {
                2cc A002 = C71342cb.A00(userSession);
                String A2n = r5.A2n();
                if (A2n != null) {
                    synchronized (A002.A0L) {
                        A002._lastClickedExternalSharedFeedIds.add(A2n);
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
