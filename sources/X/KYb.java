package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class KYb extends K7Y {
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "CrosspostingUserMigrationBottomSheetFragment";
    public boolean A00;

    public final String getModuleName() {
        return AnonymousClass000.A00(1249);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r5 = 0
            X.0qQ.A0B(r15, r5)
            r0 = r16
            super.onViewCreated(r15, r0)
            boolean r1 = r14.A00
            r0 = 2131976098(0x7f135fa2, float:1.9589307E38)
            if (r1 == 0) goto L_0x0013
            r0 = 2131976100(0x7f135fa4, float:1.958931E38)
        L_0x0013:
            java.lang.String r11 = X.DbU.A0m(r14, r0)
            boolean r1 = r14.A00
            r0 = 2131976100(0x7f135fa4, float:1.958931E38)
            if (r1 == 0) goto L_0x0021
            r0 = 2131976098(0x7f135fa2, float:1.9589307E38)
        L_0x0021:
            java.lang.String r6 = X.DbU.A0m(r14, r0)
            r0 = 2131431046(0x7f0b0e86, float:1.848381E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r15, r0)
            android.content.Context r0 = r14.requireContext()
            if (r3 == 0) goto L_0x0043
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131972881(0x7f135311, float:1.9582782E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            X.K7Y.A01(r2, r3, r0, r1)
            r3.setVisibility(r5)
        L_0x0043:
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.8jd r1 = X.C363388je.A00(r0)
            java.lang.String r0 = "CrosspostingUserMigrationBottomSheetFragment"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.5wF r7 = r1.A00(r0)
            boolean r0 = X.C363388je.A02(r7)
            if (r0 == 0) goto L_0x00ee
            boolean r1 = A03(r14)
            r0 = 2131431044(0x7f0b0e84, float:1.8483806E38)
            if (r1 == 0) goto L_0x0067
            r0 = 2131431045(0x7f0b0e85, float:1.8483808E38)
        L_0x0067:
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r15, r0)
            boolean r1 = A03(r14)
            r0 = 2131431039(0x7f0b0e7f, float:1.8483796E38)
            if (r1 == 0) goto L_0x0077
            r0 = 2131431040(0x7f0b0e80, float:1.8483798E38)
        L_0x0077:
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r15, r0)
            android.content.Context r8 = r14.requireContext()
            if (r3 == 0) goto L_0x0094
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131972877(0x7f13530d, float:1.9582774E38)
            java.lang.String r0 = r7.A04
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0, r6}
            X.K7Y.A01(r2, r3, r0, r1)
            r3.setVisibility(r5)
        L_0x0094:
            com.instagram.common.session.UserSession r3 = r14.getSession()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330905018581837(0x8112c40000434d, double:3.03914885433883E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00bc
            if (r4 == 0) goto L_0x00bc
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131972875(0x7f13530b, float:1.958277E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            android.text.Spanned r0 = X.0bC.A00(r2, r0, r1)
        L_0x00b6:
            r4.setText(r0)
            r4.setVisibility(r5)
        L_0x00bc:
            r0 = 2131440845(0x7f0b34cd, float:1.8503685E38)
            android.view.View r2 = r15.findViewById(r0)
            r0 = 2131440844(0x7f0b34cc, float:1.8503683E38)
            android.view.View r1 = r15.findViewById(r0)
            if (r2 == 0) goto L_0x00d1
            r0 = 49
            X.C64273LXz.A00(r2, r0, r14)
        L_0x00d1:
            if (r1 == 0) goto L_0x00d8
            r0 = 50
            X.C64273LXz.A00(r1, r0, r14)
        L_0x00d8:
            X.8sM r1 = X.C368278sM.VIEW
            r0 = 0
            A02(r1, r14, r0)
            com.instagram.common.session.UserSession r1 = r14.getSession()
            int r0 = r14.A01
            X.FBn r0 = X.C49797F7i.A01(r1, r0)
            if (r0 == 0) goto L_0x00ed
            r0.A00()
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.String r13 = r7.A04
            boolean r1 = A03(r14)
            r0 = 2131431044(0x7f0b0e84, float:1.8483806E38)
            if (r1 == 0) goto L_0x00fc
            r0 = 2131431045(0x7f0b0e85, float:1.8483808E38)
        L_0x00fc:
            android.widget.TextView r10 = X.AnonymousClass7TE.A0d(r15, r0)
            boolean r1 = A03(r14)
            r0 = 2131431042(0x7f0b0e82, float:1.8483802E38)
            if (r1 == 0) goto L_0x010c
            r0 = 2131431043(0x7f0b0e83, float:1.8483804E38)
        L_0x010c:
            android.widget.TextView r9 = X.AnonymousClass7TE.A0d(r15, r0)
            boolean r1 = A03(r14)
            r0 = 2131431039(0x7f0b0e7f, float:1.8483796E38)
            if (r1 == 0) goto L_0x011c
            r0 = 2131431040(0x7f0b0e80, float:1.8483798E38)
        L_0x011c:
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r15, r0)
            android.content.Context r2 = r14.requireContext()
            r8 = 23
            r3 = 27
            if (r10 == 0) goto L_0x0148
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x0178
            android.content.res.Resources r12 = r2.getResources()
            r1 = 2131972879(0x7f13530f, float:1.9582778E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r13, r6}
            android.text.Spanned r0 = X.0bC.A00(r12, r0, r1)
        L_0x013f:
            X.0qQ.A0A(r0)
            X.DbZ.A14(r10, r0)
            r10.setVisibility(r5)
        L_0x0148:
            if (r9 == 0) goto L_0x0164
            com.instagram.common.session.UserSession r0 = r14.getSession()
            X.27y r0 = X.27u.A00(r0)
            boolean r1 = r0.A01()
            r0 = 2131975911(0x7f135ee7, float:1.9588928E38)
            if (r1 == 0) goto L_0x015e
            r0 = 2131975912(0x7f135ee8, float:1.958893E38)
        L_0x015e:
            X.DbU.A1G(r9, r14, r0)
            r9.setVisibility(r5)
        L_0x0164:
            if (r4 == 0) goto L_0x00bc
            X.819 r0 = r14.A0B()
            int r0 = r0.ordinal()
            java.lang.String r1 = "empty_audience"
            if (r0 == r3) goto L_0x0192
            if (r0 == r8) goto L_0x018b
            java.lang.String r0 = ""
            goto L_0x00b6
        L_0x0178:
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_name"
            A02(r1, r14, r0)
            r1 = 2131972876(0x7f13530c, float:1.9582772E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r6}
            java.lang.String r0 = r14.getString(r1, r0)
            goto L_0x013f
        L_0x018b:
            X.5w9 r0 = X.AnonymousClass5w8.A05
            java.lang.String r3 = X.K7Y.A00(r2, r14)
            goto L_0x019a
        L_0x0192:
            com.instagram.common.session.UserSession r0 = r14.getSession()
            java.lang.String r3 = X.C367158qH.A00(r2, r0, r7)
        L_0x019a:
            if (r3 == 0) goto L_0x01b8
            int r0 = r3.length()
            if (r0 == 0) goto L_0x01b8
            android.content.res.Resources r2 = r2.getResources()
            r1 = 2131972878(0x7f13530e, float:1.9582776E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r3}
            android.text.Spanned r0 = X.0bC.A00(r2, r0, r1)
        L_0x01b1:
            X.0qQ.A0A(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00b6
        L_0x01b8:
            X.8sM r0 = X.C368278sM.SUPPRESS
            A02(r0, r14, r1)
            r0 = 2131972871(0x7f135307, float:1.9582762E38)
            java.lang.String r0 = r14.getString(r0)
            goto L_0x01b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYb.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(C368278sM r7, KYb kYb, String str) {
        0xa r1;
        String str2;
        int A002;
        UserSession A0C = kYb.getSession();
        AnonymousClass818 r4 = kYb.A02;
        if (r4 != null) {
            AnonymousClass819 A0B = kYb.A0B();
            AnonymousClass81A A0O = JTO.A0O();
            A0O.A0A(Boolean.valueOf(kYb.A09));
            A0O.A09(AnonymousClass7TE.A0v());
            1Av A003 = 1Au.A00(kYb.getSession());
            int ordinal = kYb.A0B().ordinal();
            if (ordinal == 27) {
                r1 = A003.A01;
                str2 = "story_xpost_user_migration_upsell_second_wave_display_count";
                A002 = DbT.A00(r1, str2);
            } else if (ordinal != 23) {
                A002 = 0;
            } else {
                r1 = A003.A01;
                str2 = "feed_xpost_user_migration_upsell_second_wave_display_count";
                A002 = DbT.A00(r1, str2);
            }
            JTT.A1C(A0O, (long) A002);
            A0O.A06("ig_media_id", kYb.A07);
            JTQ.A19(A0O, "waterfall_id", kYb.A08, str);
            C368288sN.A00(r4, r7, A0B, A0O, A0C);
            return;
        }
        0qQ.A0F("entrypoint");
        throw AnonymousClass00P.createAndThrow();
    }

    public static boolean A03(K7Y k7y) {
        return C63430Kwq.A00(k7y.getSession()).booleanValue();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(383071403);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getBoolean("args_is_story_enabled", false);
        requireArguments.getBoolean("args_is_post_enabled", false);
        this.A09 = requireArguments.getBoolean("args_is_after_fbc", false);
        AnonymousClass819 valueOf = AnonymousClass819.valueOf(JTP.A0m(requireArguments, "args_upsell_variant"));
        0qQ.A0B(valueOf, 0);
        this.A03 = valueOf;
        UserSession A0C = getSession();
        KYZ kyz = (KYZ) A0C.A01(KYZ.class, new C20699WxV(A0C, 11));
        MUE mue = kyz.A05;
        if (mue == null) {
            mue = new C65640LxH(kyz);
            kyz.A05 = mue;
        }
        this.A05 = mue;
        JTU.A0k(requireArguments, this);
        AnonymousClass0fD.A09(997230072, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-182903013);
        0qQ.A0B(layoutInflater, 0);
        boolean A06 = 182.A06(0Tu.A05, getSession(), 36330905018581837L);
        int i = R.layout.fragment_crossposting_upsell_second_wave_bottom_sheet;
        if (A06) {
            i = R.layout.fragment_crossposting_upsell_second_wave_bottom_sheet_igds;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(-1230564493, A02);
        return inflate;
    }
}
