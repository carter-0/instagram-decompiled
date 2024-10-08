package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class NK8 extends AnonymousClass4DH implements C273494mf {
    public static final C71021OYw A03 = new Object();
    public static final String __redex_internal_original_name = "DisappearingMessagesBottomSheetNux";
    public OHH A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final String A02 = "direct_disappearing_messages_nux";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e2, code lost:
        if (r5 != false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            r21 = this;
            r0 = 1543455232(0x5bff4200, float:1.43697374E17)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r5 = 0
            r6 = r22
            X.0qQ.A0B(r6, r5)
            r4 = r21
            android.os.Bundle r8 = r4.requireArguments()
            java.lang.String r0 = "is_dm_e2ee_attribution_enabled"
            boolean r20 = r8.getBoolean(r0)
            java.lang.String r0 = "is_tlc_thread"
            boolean r11 = r8.getBoolean(r0)
            java.lang.String r0 = "thread_id_for_logging"
            java.lang.String r16 = r8.getString(r0)
            java.lang.String r2 = "dm_ephemeral_lifetime_ms_for_logging"
            r0 = -1
            long r9 = r8.getLong(r2, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1R(r2)
            r15 = 0
            r14 = r15
            if (r2 == 0) goto L_0x003c
            r14 = r7
        L_0x003c:
            java.lang.String r2 = "dm_after_viewed_ephemeral_lifetime_ms_for_logging"
            long r9 = r8.getLong(r2, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x004b
            r15 = r7
        L_0x004b:
            java.lang.String r0 = "dm_transport_type_for_logging"
            java.lang.String r17 = r8.getString(r0)
            java.lang.String r0 = "dm_is_after_viewed_mode"
            boolean r1 = r8.getBoolean(r0)
            X.0eM r2 = r4.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            if (r20 != 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            if (r1 != 0) goto L_0x017c
            X.Nk6 r7 = X.C69366Nk6.A09
        L_0x0065:
            long r0 = r7.A00
            java.lang.Integer r13 = r7.A02
            X.OHH r12 = new X.OHH
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)
            r4.A00 = r12
            java.lang.Integer r0 = r7.A01
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x0172;
                case 2: goto L_0x0177;
                default: goto L_0x007b;
            }
        L_0x007b:
            r0 = 2131625159(0x7f0e04c7, float:1.8877518E38)
        L_0x007e:
            r7 = r23
            android.view.View r6 = X.DbT.A0D(r6, r7, r0, r5)
            if (r1 == r5) goto L_0x00b8
            r0 = 1
            if (r1 == r0) goto L_0x00b1
            r0 = 2
            if (r1 != r0) goto L_0x0192
            r0 = 2131431969(0x7f0b1221, float:1.8485682E38)
            com.instagram.common.ui.base.IgTextView r7 = X.JTO.A0X(r6, r0)
            if (r7 == 0) goto L_0x00b1
            r5 = 2131960918(0x7f132456, float:1.9558518E38)
            r0 = 2131964897(0x7f1333e1, float:1.9566589E38)
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            r0 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r0 = r4.getString(r0)
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = X.DbV.A0z(r4, r2, r5)
            X.AnonymousClass7AV.A01(r1, r7, r2, r0)
        L_0x00b1:
            r0 = -2006918462(0xffffffff8860dac2, float:-6.7664697E-34)
            X.AnonymousClass0fD.A09(r0, r3)
            return r6
        L_0x00b8:
            if (r20 != 0) goto L_0x011e
            if (r11 != 0) goto L_0x011e
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "is_dm_7_day_enabled"
            boolean r7 = r1.getBoolean(r0)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "is_thread_eligible_open_dm_send"
            boolean r5 = r1.getBoolean(r0)
            X.0lg r4 = X.DbT.A0X(r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322890609928859(0x810b7a00052a9b, double:3.034080510035253E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x00e4
            r2 = 0
            if (r5 == 0) goto L_0x00e5
        L_0x00e4:
            r2 = 1
        L_0x00e5:
            android.content.Context r5 = r6.getContext()
            r0 = 2131431968(0x7f0b1220, float:1.848568E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r1 == 0) goto L_0x00fa
            if (r2 == 0) goto L_0x0115
            r0 = 2131960922(0x7f13245a, float:1.9558526E38)
        L_0x00f7:
            X.DbT.A18(r5, r1, r0)
        L_0x00fa:
            r0 = 2131431970(0x7f0b1222, float:1.8485684E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r1 == 0) goto L_0x00b1
            if (r2 == 0) goto L_0x010c
            r0 = 2131960913(0x7f132451, float:1.9558508E38)
        L_0x0108:
            X.DbT.A18(r5, r1, r0)
            goto L_0x00b1
        L_0x010c:
            r0 = 2131960911(0x7f13244f, float:1.9558504E38)
            if (r7 == 0) goto L_0x0108
            r0 = 2131960912(0x7f132450, float:1.9558506E38)
            goto L_0x0108
        L_0x0115:
            r0 = 2131960920(0x7f132458, float:1.9558522E38)
            if (r7 == 0) goto L_0x00f7
            r0 = 2131960921(0x7f132459, float:1.9558524E38)
            goto L_0x00f7
        L_0x011e:
            android.content.Context r5 = r6.getContext()
            r0 = 2131431968(0x7f0b1220, float:1.848568E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r1 == 0) goto L_0x0131
            r0 = 2131960923(0x7f13245b, float:1.9558528E38)
            X.DbT.A18(r5, r1, r0)
        L_0x0131:
            r0 = 2131431970(0x7f0b1222, float:1.8485684E38)
            com.instagram.common.ui.base.IgTextView r8 = X.JTO.A0X(r6, r0)
            if (r8 == 0) goto L_0x0156
            r7 = 2131960914(0x7f132452, float:1.955851E38)
            r0 = 2131964897(0x7f1333e1, float:1.9566589E38)
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            r0 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r0 = r4.getString(r0)
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = X.DbV.A0z(r4, r2, r7)
            X.AnonymousClass7AV.A01(r1, r8, r2, r0)
        L_0x0156:
            r0 = 2131431974(0x7f0b1226, float:1.8485692E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r1 == 0) goto L_0x0165
            r0 = 2131960926(0x7f13245e, float:1.9558534E38)
            X.DbT.A18(r5, r1, r0)
        L_0x0165:
            r0 = 2131431972(0x7f0b1224, float:1.8485688E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r1 == 0) goto L_0x00b1
            r0 = 2131960917(0x7f132455, float:1.9558516E38)
            goto L_0x0108
        L_0x0172:
            r0 = 2131625135(0x7f0e04af, float:1.887747E38)
            goto L_0x007e
        L_0x0177:
            r0 = 2131625160(0x7f0e04c8, float:1.887752E38)
            goto L_0x007e
        L_0x017c:
            X.Nk6 r7 = X.C69366Nk6.A05
            goto L_0x0065
        L_0x0180:
            long r9 = X.C71021OYw.A00(r0)
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x018e
            X.Nk6 r7 = X.C69366Nk6.A07
            goto L_0x0065
        L_0x018e:
            X.Nk6 r7 = X.C69366Nk6.A08
            goto L_0x0065
        L_0x0192:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = 2071084577(0x7b723e21, float:1.257796E36)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK8.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-621505048);
        super.onResume();
        OHH ohh = this.A00;
        if (ohh != null) {
            AnonymousClass0eM r6 = this.A01;
            long A002 = C71021OYw.A00(AnonymousClass7TE.A0l(r6));
            long j = ohh.A00;
            if (A002 < j) {
                DbX.A0h(r6).A0d(j);
                0lg A0X = DbT.A0X(r6);
                String str2 = ohh.A05;
                Long l = ohh.A02;
                Long l2 = ohh.A03;
                String str3 = ohh.A04;
                Integer num = ohh.A01;
                boolean z = ohh.A06;
                0qQ.A0B(A0X, 0);
                switch (num.intValue()) {
                    case 1:
                        str = "after_seen";
                        break;
                    case 2:
                        str = "upgrade_e2ee";
                        break;
                    default:
                        str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                        break;
                }
                boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
                C69452Nlw nlw = null;
                if (l2 == null || !C395049z7.A00(Boolean.valueOf(A1W), l2)) {
                    l2 = null;
                }
                0Aj A0H = C66582MXn.A0H(AnonymousClass0kN.A02(A0X), "direct_disappearing_messages_nux_impression", str2);
                A0H.A7p("e2ee_attribution_enabled", JTP.A0g(A0H, "nux_type", str, z));
                A0H.A9F("ephemeral_lifetime_ms", l);
                A0H.A9F("after_view_lifetime_ms", l2);
                if (str3 != null) {
                    nlw = C69882Ntk.A00(str3);
                }
                A0H.A8M(nlw, TraceFieldType.TransportType);
                A0H.Cgf();
            }
        }
        AnonymousClass0fD.A09(-370116033, A022);
    }
}
