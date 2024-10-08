package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class I7R {
    public AnonymousClass2Q9 A00;
    public final int A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;
    public final AnonymousClass57N A05;
    public final 1Xj A06;
    public final AnonymousClass4DU A07;
    public final AnonymousClass3W1 A08;
    public final 1sy A09;
    public final 0Pl A0A;
    public final C249763kK A0B;
    public final C71093OcF A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C58176Ing(this, 42));
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final void A00(MediaOptionStyle mediaOptionStyle, I7R i7r, HNR hnr, CharSequence charSequence, ArrayList arrayList) {
        0qQ.A0B(charSequence, 2);
        MediaOptionStyle mediaOptionStyle2 = MediaOptionStyle.A06;
        if (mediaOptionStyle != null) {
            mediaOptionStyle2 = mediaOptionStyle;
        }
        arrayList.add(new C55727HmO(mediaOptionStyle2, hnr, charSequence));
        i7r.A0C(hnr, AnonymousClass05K.A01);
    }

    public static final void A01(I7R i7r, HNR hnr, ArrayList arrayList, int i) {
        A00(MediaOptionStyle.A06, i7r, hnr, AnonymousClass7TE.A16(i7r.A02, i), arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (X.AnonymousClass3WS.A02(r3) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.I7R r5, java.util.ArrayList r6) {
        /*
            com.instagram.common.session.UserSession r3 = r5.A04
            X.1Xj r4 = r5.A06
            boolean r2 = r4.CeS()
            boolean r1 = r4.A51()
            java.lang.String r0 = X.C51973G9u.A0k(r4)
            if (r2 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            boolean r0 = X.2R8.A05(r3, r0)
            if (r0 == 0) goto L_0x002c
        L_0x001a:
            boolean r0 = X.2R8.A02(r3, r4)
            if (r0 != 0) goto L_0x0055
            boolean r0 = X.AnonymousClass3WS.A08(r3, r4)
            if (r0 != 0) goto L_0x002c
            boolean r0 = X.AnonymousClass3WS.A0A(r3, r4)
            if (r0 == 0) goto L_0x0055
        L_0x002c:
            r1 = 1
        L_0x002d:
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            X.HNR r1 = X.HNR.A2U
            r0 = 2131976523(0x7f13614b, float:1.9590169E38)
            A01(r5, r1, r6, r0)
            X.HNR r2 = X.HNR.A2T
            boolean r0 = X.AnonymousClass3WS.A04(r3)
            if (r0 != 0) goto L_0x004e
            boolean r1 = X.AnonymousClass3WS.A02(r3)
            r0 = 2131954758(0x7f130c46, float:1.9546024E38)
            if (r1 == 0) goto L_0x0051
        L_0x004e:
            r0 = 2131965824(0x7f133780, float:1.9568469E38)
        L_0x0051:
            A01(r5, r2, r6, r0)
        L_0x0054:
            return
        L_0x0055:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7R.A02(X.I7R, java.util.ArrayList):void");
    }

    public static final void A03(I7R i7r, ArrayList arrayList) {
        HNR hnr = HNR.A0Q;
        if (i7r.A0B(hnr)) {
            if (i7r.A06.A4g()) {
                hnr = HNR.A0P;
            }
            A01(i7r, hnr, arrayList, 2131956749);
        }
    }

    public static final void A04(I7R i7r, ArrayList arrayList) {
        HNR hnr = HNR.A1G;
        if (i7r.A0B(hnr) && C14290TtO.A00(i7r.A04)) {
            A01(i7r, hnr, arrayList, 2131971011);
        }
    }

    public static final void A05(I7R i7r, ArrayList arrayList) {
        if (!i7r.A06.A5Z()) {
            HNR hnr = HNR.A1n;
            if (i7r.A0B(hnr)) {
                A01(i7r, hnr, arrayList, 2131973529);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0027 A[EDGE_INSN: B:37:0x0027->B:12:0x0027 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.I7R r6, java.util.ArrayList r7) {
        /*
            X.1Xj r4 = r6.A06
            com.instagram.common.session.UserSession r3 = r6.A04
            boolean r0 = X.C52345GOp.A0C(r3, r4)
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A5p()
            if (r0 == 0) goto L_0x0074
            X.HNR r1 = X.HNR.A0J
            r0 = 2131971967(0x7f134f7f, float:1.9580928E38)
        L_0x0015:
            A01(r6, r1, r7, r0)
        L_0x0018:
            X.2Q9 r0 = r6.A00
            if (r0 != 0) goto L_0x0027
            boolean r0 = r7 instanceof java.util.Collection
            r5 = 1
            if (r0 == 0) goto L_0x0035
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0035
        L_0x0027:
            X.4DU r2 = r6.A07
            X.HOu r1 = X.C54689HOu.A09
            X.3W1 r0 = r6.A08
            int r0 = r0.getPosition()
            X.C52086GEg.A0Q(r1, r3, r4, r2, r0)
        L_0x0034:
            return
        L_0x0035:
            java.util.Iterator r2 = r7.iterator()
        L_0x0039:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r2.next()
            X.HmO r0 = (X.C55727HmO) r0
            X.HNR r1 = r0.A01
            X.HNR r0 = X.HNR.A1u
            if (r1 != r0) goto L_0x0039
            boolean r0 = r4.A5p()
            if (r0 == 0) goto L_0x0039
            X.1Xy r0 = r4.A0C
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x0039
            java.lang.Boolean r0 = r0.CWD()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r4.A2n()
            if (r2 == 0) goto L_0x008c
            androidx.fragment.app.Fragment r1 = r6.A03
            java.lang.String r0 = "feed_media_prefetch"
            X.2Q8 r0 = X.I66.A02(r1, r3, r2, r0)
            r6.A00 = r0
            goto L_0x0027
        L_0x0074:
            boolean r0 = r4.A5U()
            if (r0 == 0) goto L_0x0080
            X.HNR r1 = X.HNR.A0J
            r0 = 2131971971(0x7f134f83, float:1.9580936E38)
            goto L_0x0015
        L_0x0080:
            boolean r0 = r4.A5G()
            if (r0 == 0) goto L_0x0018
            X.HNR r1 = X.HNR.A0J
            r0 = 2131971961(0x7f134f79, float:1.9580916E38)
            goto L_0x0015
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7R.A06(X.I7R, java.util.ArrayList):void");
    }

    public static final void A07(I7R i7r, ArrayList arrayList) {
        C67161s9 BP1;
        C67161s9 A1N;
        C67161s9 A1N2;
        C267284bJ BZ6;
        1Xj r1 = i7r.A06;
        if (r1.A5y()) {
            if (!r1.A5p()) {
                if (r1.CeS()) {
                    if (!182.A06(0Tu.A05, i7r.A04, 36327529174284789L)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Context context = i7r.A02;
            UserSession userSession = i7r.A04;
            C394009xO.A00(context, userSession);
            A01(i7r, HNR.A1u, arrayList, 2131966730);
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C55727HmO) it.next()).A01 == HNR.A0J && ((r1.A5G() && (((A1N = r1.A1N()) != null && 0qQ.A0K(A1N.CWC(), true)) || ((A1N2 = r1.A1N()) != null && (BZ6 = A1N2.BZ6()) != null && 0qQ.A0K(BZ6.CWC(), true)))) || (r1.A5p() && (BP1 = r1.A0C.BP1()) != null && 0qQ.A0K(BP1.CWC(), true)))) {
                        String A2n = r1.A2n();
                        if (A2n != null) {
                            i7r.A00 = I66.A02(i7r.A03, userSession, A2n, "feed_media_prefetch");
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
    }

    public static final void A08(I7R i7r, ArrayList arrayList) {
        AnonymousClass9OT r2;
        UserSession userSession = i7r.A04;
        1Xj r1 = i7r.A06;
        if (JUL.A02(userSession, r1)) {
            String moduleName = i7r.A07.getModuleName();
            String A2n = r1.A2n();
            if (r1.A5G()) {
                r2 = AnonymousClass9OT.REEL;
            } else {
                r2 = AnonymousClass9OT.POST;
            }
            C250563lf.A0e(r2, r1.A1I(), userSession, (Boolean) null, moduleName, AnonymousClass000.A00(1389), A2n);
            A01(i7r, HNR.A0n, arrayList, 2131952630);
        }
    }

    public static final void A09(I7R i7r, ArrayList arrayList, boolean z) {
        if (z && i7r.A08.A28) {
            A01(i7r, HNR.A1Z, arrayList, 2131972204);
        }
    }

    public static final boolean A0A(I7R i7r) {
        if (i7r.A06.CcK()) {
            return false;
        }
        return DbY.A1Z(0Tu.A05, i7r.A04, 36312183256843202L);
    }

    private final boolean A0B(HNR hnr) {
        boolean z;
        1Xj r4 = this.A06;
        UserSession userSession = this.A04;
        User A2A = r4.A2A(userSession);
        if (A2A == null || !(A2A.A0N() == AnonymousClass05K.A01 || A2A.equals(DbT.A0j(userSession)) || hnr == HNR.A0Q || hnr == HNR.A0P || hnr == HNR.A1n || hnr == HNR.A1G)) {
            z = false;
        } else {
            z = true;
        }
        return C55172HdO.A00(userSession, r4, z);
    }

    public I7R(Context context, Fragment fragment, UserSession userSession, AnonymousClass57N r6, 1Xj r7, AnonymousClass4DU r8, AnonymousClass3W1 r9, 1sy r10, 0Pl r11, C249763kK r12, C71093OcF ocF, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = r7;
        this.A08 = r9;
        this.A09 = r10;
        this.A0A = r11;
        this.A0C = ocF;
        this.A0B = r12;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = fragment;
        this.A0E = z;
        this.A01 = i;
        this.A0H = z2;
        this.A0G = z3;
        this.A0F = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r2 = new X.0bb();
        r2.A06("media_id", r8.A06.getId());
        r2.A06("unavailable_reason", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        X.JZX.A00(r4, r3, r5, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r10.intValue() == 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        X.C22031Xty.A0E(r8.A07, r8.A04, r8.A06.getId(), "feed_action_sheet", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r2 = r8.A04;
        r1 = r8.A07;
        r0 = r8.A06;
        X.C22031Xty.A0G(r1, r2, r0.getId(), "feed_action_sheet", r5, X.DbT.A0x(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.HNR r9, java.lang.Integer r10) {
        /*
            r8 = this;
            int r1 = r9.ordinal()
            r0 = 58
            java.lang.String r7 = X.C273654mx.A00(r0)
            switch(r1) {
                case 18: goto L_0x0068;
                case 28: goto L_0x0095;
                case 44: goto L_0x0098;
                case 45: goto L_0x009b;
                case 46: goto L_0x0068;
                case 47: goto L_0x000e;
                case 49: goto L_0x001b;
                case 51: goto L_0x001b;
                case 52: goto L_0x0043;
                case 53: goto L_0x0043;
                case 57: goto L_0x00a2;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x000d
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.UNAVAILABLE
            X.JZZ r3 = X.JZZ.FEED
            goto L_0x004f
        L_0x001b:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 != r0) goto L_0x0038
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.SHARE_CLICK
        L_0x0025:
            X.JZZ r3 = X.JZZ.REELS
            X.Jqo r2 = new X.Jqo
            r2.<init>()
            X.1Xj r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            goto L_0x0064
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x000d
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.VIEW
            goto L_0x0025
        L_0x0043:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x000d
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_REEL_IN_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.UNAVAILABLE
            X.JZZ r3 = X.JZZ.REELS
        L_0x004f:
            X.Jqo r2 = new X.Jqo
            r2.<init>()
            X.1Xj r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            java.lang.String r0 = "unavailable_reason"
            r2.A06(r0, r7)
        L_0x0064:
            X.JZX.A00(r4, r3, r5, r2, r6)
            return
        L_0x0068:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 != r0) goto L_0x008a
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.SHARE_CLICK
        L_0x0072:
            X.JZZ r3 = X.JZZ.FEED
            X.Jqo r2 = new X.Jqo
            r2.<init>()
            X.1Xj r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            X.JZX.A00(r4, r3, r5, r2, r6)
        L_0x0087:
            java.lang.String r5 = "share"
            goto L_0x00a4
        L_0x008a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x0087
            com.instagram.common.session.UserSession r6 = r8.A04
            X.818 r5 = X.AnonymousClass818.IG_FEED_OVERFLOW_MENU
            X.JZY r4 = X.JZY.VIEW
            goto L_0x0072
        L_0x0095:
            java.lang.String r5 = "copy_link"
            goto L_0x00a4
        L_0x0098:
            java.lang.String r5 = "messenger"
            goto L_0x00a4
        L_0x009b:
            r0 = 181(0xb5, float:2.54E-43)
            java.lang.String r5 = X.C66579MXk.A00(r0)
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r5 = "system_share_sheet"
        L_0x00a4:
            int r1 = r10.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00bb
            com.instagram.common.session.UserSession r3 = r8.A04
            X.4DU r2 = r8.A07
            X.1Xj r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "feed_action_sheet"
            X.C22031Xty.A0E(r2, r3, r1, r0, r5)
            return
        L_0x00bb:
            com.instagram.common.session.UserSession r2 = r8.A04
            X.4DU r1 = r8.A07
            X.1Xj r0 = r8.A06
            java.lang.String r3 = r0.getId()
            java.lang.String r6 = X.DbT.A0x(r0)
            java.lang.String r4 = "feed_action_sheet"
            X.C22031Xty.A0G(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7R.A0C(X.HNR, java.lang.Integer):void");
    }
}
