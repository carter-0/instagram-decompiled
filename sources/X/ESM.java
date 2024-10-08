package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

public final class ESM extends C47518E6c implements AnonymousClass4DS, CallerContextable {
    public static final String __redex_internal_original_name = "LinkedAccountsFragment";
    public int A00;
    public C46478Dfh A01;
    public G7M A02;
    public C363528js A03;
    public boolean A04;
    public final CallerContext A05 = CallerContext.A01(__redex_internal_original_name);
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final 1wn A07 = FXZ.A00(this, 63);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131962892);
    }

    public final String getModuleName() {
        return "sharing_settings";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (r8.A07(X.DbW.A0S(r2, 0)) != false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A06(X.ESM r16) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r4 = r16
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x013a
            kotlin.enums.EnumEntries r0 = X.C48153EZv.A03
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0135
            X.0eM r2 = r4.A06
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r2)
            r1 = 1
            X.0qQ.A0B(r11, r1)
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builder()
            X.EZv[] r9 = X.C48153EZv.values()
            int r8 = r9.length
            r7 = 0
        L_0x0028:
            if (r7 >= r8) goto L_0x0042
            r6 = r9[r7]
            java.lang.String r5 = r6.A02
            java.lang.String r0 = "whatsapp"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = X.C48749EjY.A00(r11)
            if (r0 == 0) goto L_0x003f
        L_0x003c:
            r10.add(r6)
        L_0x003f:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0042:
            com.google.common.collect.ImmutableList r0 = X.DbZ.A0K(r10)
            X.3kO r10 = r0.iterator()
            X.0qQ.A07(r10)
        L_0x004d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r5 = r10.next()
            X.EZv r5 = (X.C48153EZv) r5
            if (r5 == 0) goto L_0x0113
            int[] r6 = X.C49298Esh.A00
            int r0 = r5.ordinal()
            r0 = r6[r0]
            if (r0 == r1) goto L_0x008a
            r6 = 2
            if (r0 != r6) goto L_0x0113
            int r14 = r5.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r13 = r5.A02(r0)
            int r15 = r5.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r16 = r5.A07(r0)
            X.FP7 r12 = new X.FP7
            r12.<init>((X.C48153EZv) r5, (X.ESM) r4, (int) r6)
            X.OGU r11 = new X.OGU
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0086:
            r3.add(r11)
            goto L_0x004d
        L_0x008a:
            X.EZv r8 = X.C48153EZv.A05
            r7 = 0
            if (r5 != r8) goto L_0x0107
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r2, r7)
            boolean r0 = r5.A07(r0)
            if (r0 == 0) goto L_0x0107
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r2)
            boolean r0 = r0.A1N()
            if (r0 != 0) goto L_0x00bd
            X.Dfh r0 = r4.A01
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d7
        L_0x00b3:
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r2)
            boolean r0 = r0.CPm()
            if (r0 == 0) goto L_0x00d7
        L_0x00bd:
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r2)
            boolean r0 = r0.CPm()
            if (r0 == 0) goto L_0x00d7
            int r6 = r5.A01
            int r5 = r5.A00
            r0 = 9
            X.FP4 r0 = X.FP4.A00(r4, r0)
            X.OFg r11 = new X.OFg
            r11.<init>(r0, r6, r5, r7)
            goto L_0x0086
        L_0x00d7:
            int r14 = r5.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r13 = r5.A02(r0)
            int r15 = r5.A00
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r2)
            boolean r0 = r0.CPm()
            if (r0 != 0) goto L_0x00f9
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r2, r7)
            boolean r0 = r8.A07(r0)
            r16 = 0
            if (r0 == 0) goto L_0x00fb
        L_0x00f9:
            r16 = 1
        L_0x00fb:
            r0 = 10
            X.FP4 r12 = X.FP4.A00(r4, r0)
            X.OGV r11 = new X.OGV
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0086
        L_0x0107:
            X.0lg r0 = X.DbT.A0X(r2)
            boolean r0 = X.C46508DgB.A00(r0)
            if (r0 == 0) goto L_0x0116
            goto L_0x004d
        L_0x0113:
            X.0qQ.A0A(r5)
        L_0x0116:
            int r9 = r5.A01
            int r8 = r5.A00
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r7 = r5.A07(r6)
            X.FP7 r6 = new X.FP7
            r6.<init>((X.C48153EZv) r5, (X.ESM) r4, (int) r1)
            X.OFg r0 = new X.OFg
            r0.<init>(r6, r9, r8, r7)
            r3.add(r0)
            goto L_0x004d
        L_0x0135:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x013a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESM.A06(X.ESM):java.util.ArrayList");
    }

    public static final void A07(ESM esm, boolean z) {
        FragmentActivity requireActivity = esm.requireActivity();
        C269474fB r5 = C269474fB.A00;
        C268194cw r4 = new C268194cw(r5);
        r4.A0E("entrypoint", "ig_cross_posting_settings");
        AnonymousClass0eM r6 = esm.A06;
        r4.A0E("account_id", DbU.A0u(r6));
        r4.A0E("newly_linked", String.valueOf(z));
        r4.A0C("platform", 1);
        C268194cw r2 = new C268194cw(r5);
        r2.A0E("entrypoint", "ig_cross_posting_settings");
        r2.A0E("deeplink_destination", "cross_posting_skip_profiles_screen");
        r2.A0B(r4, "deeplink_params");
        C20581Wuz wuz = new C20581Wuz(DbX.A0L(r2, r5), 3);
        if (!esm.A04) {
            esm.A04 = true;
            Window window = requireActivity.getWindow();
            C48916EmG.A00().A00(requireActivity, window, true, true);
            C229382nI A032 = C229382nI.A03(esm, DbT.A0X(r6), (2el) null);
            C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, DbT.A0X(r6), "com.bloks.www.fxcal.settings.async", wuz);
            E85.A00(A022, A032, window, esm, 12);
            esm.A00 = esm.scheduleAndGetLoaderId(A022);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1858894094);
        super.onCreate(bundle);
        this.A02 = new C65627Lx4(this, 3);
        C363528js r1 = this.A03;
        if (r1 == null) {
            r1 = new C363528js(AnonymousClass7TE.A0l(this.A06));
            this.A03 = r1;
        }
        String A002 = AnonymousClass000.A00(2557);
        r1.A06(A002, false);
        AnonymousClass0eM r3 = this.A06;
        C363378jd A003 = C363388je.A00(AnonymousClass7TE.A0l(r3));
        CallerContext callerContext = this.A05;
        0qQ.A06(callerContext);
        A003.A01(callerContext, (C363658k8) null, A002);
        DbX.A0R(r3).A01(this.A07, C376029Gg.class);
        AnonymousClass0fD.A09(670378823, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1526637368);
        super.onDestroyView();
        if (this.A04) {
            stopLoader(this.A00);
            this.A04 = false;
            Window A0G = DbV.A0G(this);
            if (A0G != null) {
                C48916EmG.A00().A01(A0G);
            }
        }
        AnonymousClass0fD.A09(-1532174352, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1136405093);
        ESM.super.onPause();
        DbX.A0R(this.A06).A02(this.A07, C376029Gg.class);
        AnonymousClass0fD.A09(-1090428883, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-752304063);
        super.onResume();
        AnonymousClass0eM r3 = this.A06;
        DbX.A0R(r3).A01(this.A07, C376029Gg.class);
        DbV.A0O(AnonymousClass7TE.A0l(r3)).AUs(new AnonymousClass9JK(CallerContext.A00(ESM.class), "ig_android_ig_business_asset_ig_to_fb_crossposting", "ig_to_fb_crossposting", "crossposting", "loading"), AnonymousClass9F1.A00, new C50205FTl(this, 1));
        setItems(A06(this));
        AnonymousClass0fD.A09(1162239188, A022);
    }
}
