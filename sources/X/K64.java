package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class K64 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C66499MUd {
    public static final String __redex_internal_original_name = "AiSettingsFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = MMA.A00(this, 20);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new MMA(this, 27), new MMA(this, 28), MMV.A00((Object) null, this, 43), JTT.A0v());
    public final String A04 = "preference_audience_upsell_shown";
    public final String A05 = "ai_settings_fragment";

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        if (r1 != 8) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r1 == X.C62629Kj0.A02) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CwS(java.lang.String r31) {
        /*
            r30 = this;
            r9 = 0
            r3 = r30
            X.0eM r0 = r3.A01
            X.LTH r0 = X.JTO.A0T(r0)
            java.lang.String r2 = X.C60315JjI.A01(r3)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "settings_main_screen_audience_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
        L_0x0023:
            X.0eM r0 = r3.A03
            X.JjI r0 = X.JTO.A0S(r0)
            com.instagram.aistudio.editor.AiSettingsRepository r7 = r0.A00
            X.05G r0 = r7.A0A
            r8 = r31
            r0.Epw(r8)
            X.0Ud r2 = r7.A0Y
            java.lang.Object r0 = X.JTR.A0z(r8, r2)
            X.Kix r0 = (X.C62626Kix) r0
            if (r0 == 0) goto L_0x004c
            int r1 = r0.ordinal()
            r29 = 1
            r0 = 7
            if (r1 == r0) goto L_0x004e
            r0 = 2
            if (r1 == r0) goto L_0x004e
            r0 = 8
            if (r1 == r0) goto L_0x004e
        L_0x004c:
            r29 = 0
        L_0x004e:
            java.lang.Object r1 = X.JTR.A0z(r8, r2)
            r10 = 0
            if (r1 == 0) goto L_0x0105
            X.Jvz r0 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r7)
            if (r0 == 0) goto L_0x0105
            java.util.List r3 = r0.A0E
            if (r3 == 0) goto L_0x0105
            X.Kix r0 = X.C62626Kix.PUBLIC
            if (r1 != r0) goto L_0x008c
            X.05G r2 = r7.A0G
            X.Jvz r0 = X.JTP.A0M(r2)
            if (r0 == 0) goto L_0x0080
            X.Kj0 r0 = r0.A02
            if (r0 == 0) goto L_0x0080
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x00da
            r0 = 6
            if (r1 == r0) goto L_0x00da
            r0 = 7
            if (r1 == r0) goto L_0x00da
            r0 = 8
            if (r1 == r0) goto L_0x00da
        L_0x0080:
            X.Jvz r0 = X.JTP.A0M(r2)
            if (r0 == 0) goto L_0x00d8
            X.Kj0 r1 = r0.A02
        L_0x0088:
            X.Kj0 r0 = X.C62629Kj0.IN_REVIEW
            if (r1 != r0) goto L_0x00da
        L_0x008c:
            X.05G r2 = r7.A08
        L_0x008e:
            java.lang.Object r1 = r2.getValue()
            r11 = r1
            X.Jvz r11 = (X.C61061Jvz) r11
            if (r11 == 0) goto L_0x00d6
            X.0Ud r0 = r7.A0Z
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r27 = 7962623(0x797fff, float:1.1158011E-38)
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r0
            r21 = r10
            r22 = r10
            r23 = r3
            r24 = r10
            r25 = r10
            r26 = r10
            r28 = r9
            X.Jvz r0 = X.C61061Jvz.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x00c2:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x008e
            r17 = 247(0xf7, float:3.46E-43)
            r11 = r10
            r12 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r9 = r7
            r13 = r8
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00d6:
            r0 = r10
            goto L_0x00c2
        L_0x00d8:
            r1 = 0
            goto L_0x0088
        L_0x00da:
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x00e2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r5.next()
            X.Jvt r0 = (X.C61055Jvt) r0
            java.lang.String r4 = r0.A01
            java.lang.String r3 = r0.A02
            java.lang.Object r2 = r0.A00
            X.Kif r2 = (X.C62608Kif) r2
            r1 = 1
            X.AnonymousClass7TF.A1B(r4, r9, r2)
            X.Jvt r0 = new X.Jvt
            r0.<init>((X.C62608Kif) r2, (java.lang.String) r4, (java.lang.String) r3, (boolean) r1)
            r6.add(r0)
            goto L_0x00e2
        L_0x0103:
            r3 = r6
            goto L_0x008c
        L_0x0105:
            r3 = r10
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K64.CwS(java.lang.String):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A012 = C320236s2.A01(requireArguments(), "persona_id");
        AnonymousClass0eM r2 = this.A01;
        1Ln A022 = LTH.A02(r2);
        if (DbT.A1Y(A022)) {
            A022.A0j(JTU.A0W(A022, "settings_main_screen_shown", A012));
            A022.Cgf();
        }
        if (LST.A03(AnonymousClass7TE.A0l(this.A02))) {
            1Ln A023 = LTH.A02(r2);
            if (DbT.A1Y(A023)) {
                A023.A0l("settings_main_screen_field_regeneration_icon_rendered");
                A023.Cgf();
            }
        }
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHH(r3, this, viewLifecycleOwner, (AnonymousClass4D7) null, 0), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final C60315JjI A00(K64 k64) {
        return JTO.A0S(k64.A03);
    }

    public final void D4E() {
        AiSettingsRepository aiSettingsRepository = JTO.A0S(this.A03).A00;
        JTP.A1W(aiSettingsRepository.A0H, C63112Krf.A00(aiSettingsRepository.A02));
    }

    public final void DkV(boolean z) {
        1Ln A022 = LTH.A02(this.A01);
        if (DbT.A1Y(A022)) {
            A022.A0l("settings_main_screen_show_on_profile_clicked");
            A022.Cgf();
        }
        AiSettingsRepository aiSettingsRepository = JTO.A0S(this.A03).A00;
        Object value = aiSettingsRepository.A0X.getValue();
        if (value != null) {
            C61061Jvz jvz = (C61061Jvz) value;
            boolean z2 = z;
            if (jvz.A0L != z) {
                aiSettingsRepository.A08.Epw(C61061Jvz.A00((C61073JwB) null, jvz, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 8257535, false, z2));
                AiSettingsRepository.A07(aiSettingsRepository, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 255);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        String str;
        String str2;
        boolean z;
        AnonymousClass0eM r2 = this.A01;
        LTH A0T = JTO.A0T(r2);
        AnonymousClass0eM r4 = this.A03;
        boolean A0D = JTO.A0S(r4).A00.A0D();
        AiSettingsRepository aiSettingsRepository = JTO.A0S(r4).A00;
        C61061Jvz A002 = AiSettingsRepository.A00(aiSettingsRepository);
        String str3 = null;
        if (A002 != null) {
            str = A002.A09;
        } else {
            str = null;
        }
        C61061Jvz A0M = JTP.A0M(aiSettingsRepository.A0G);
        if (A0M != null) {
            str3 = A0M.A09;
        }
        boolean A1a = C51966G9m.A1a(str, str3);
        boolean A0D2 = JTO.A0S(r4).A00.A0D();
        C61061Jvz A003 = AiSettingsRepository.A00(JTO.A0S(r4).A00);
        if (A003 == null || (str2 = A003.A08) == null) {
            str2 = "";
        }
        String A012 = C60315JjI.A01(this);
        1Ln A013 = LTH.A01(A0T, str2, 3);
        if (DbT.A1Y(A013)) {
            A013.A0l("settings_main_screen_back_clicked");
            A013.A0x(0Yt.A06(AnonymousClass7TH.A0h("selected_audience", str2, AnonymousClass7TE.A1L("is_description_changed", String.valueOf(A0D)), AnonymousClass7TE.A1L("is_tagline_changed", String.valueOf(A1a)), AnonymousClass7TE.A1L("is_name_changed", String.valueOf(A0D2)))));
            A013.A0j(DbZ.A0d(A012));
            A013.Cgf();
        }
        1Av A0h = DbX.A0h(this.A02);
        C61061Jvz A004 = AiSettingsRepository.A00(JTO.A0S(r4).A00);
        if (A004 != null) {
            z = A004.A0K;
        } else {
            z = false;
        }
        if (z) {
            LTH A0T2 = JTO.A0T(r2);
            String A014 = C60315JjI.A01(this);
            1Ln A005 = LTH.A00(A0T2);
            if (DbT.A1Y(A005)) {
                A005.A0j(JTU.A0W(A005, "settings_main_screen_exit_confirmation_dialog_shown", A014));
                A005.Cgf();
            }
            C63005Kpv.A00(requireContext(), new MMA(this, 22), new MMA(this, 23), 2131952805, 2131952804);
        } else {
            String str4 = this.A04;
            0qQ.A0B(str4, 0);
            if (!A0h.A01.getBoolean(str4, false)) {
                A0h.A13(str4, true);
                C61014JvE jvE = (C61014JvE) JTO.A0S(r4).A0J.getValue();
                if (JTO.A19(JTO.A0S(r4).A0B).get(jvE.A08) == C62626Kix.ONLY_ME) {
                    Context requireContext = requireContext();
                    MMV A006 = MMV.A00(jvE, this, 39);
                    MMA mma = new MMA(this, 21);
                    C358248ab A0N = JTU.A0N(requireContext, 2131952794, 2131952793);
                    LV3.A01(A0N, A006, 1, 2131952792);
                    A0N.A0G(LV3.A00(mma, 2), 2131968513);
                    DbT.A1V(A0N);
                    return true;
                }
            } else {
                AiSettingsRepository.A03(this);
                JTO.A0S(r4).A06();
                return false;
            }
        }
        return true;
    }

    public final void configureActionBar(2da r6) {
        boolean A1T = JTU.A1T(r6);
        r6.Eom(2131952813);
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A02, A1T ? 1 : 0), 36324076021034747L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_insights_pano_outline_24;
            A0K.A05 = 2131952807;
            DbX.A19(new LYC((Object) this, 10), A0K, r6);
            r6.ARb(A1T, !((C61014JvE) JTO.A0S(this.A03).A0J.getValue()).A0J);
        }
        this.A00 = r6;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("theme_id")) != null) {
            JTO.A0S(this.A03).A00.A0W.Epw(stringExtra);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K64] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2135300969);
        K64.super.onCreate(bundle);
        String A012 = C320236s2.A01(requireArguments(), "persona_id");
        C60315JjI A0S = JTO.A0S(this.A03);
        0qQ.A0B(A012, 0);
        AiSettingsRepository aiSettingsRepository = A0S.A00;
        JTR.A1W(aiSettingsRepository.A0R);
        AnonymousClass7TE.A1Z(new C66174MGl((Object) aiSettingsRepository, A012, (AnonymousClass4D7) null, 2), aiSettingsRepository.A01);
        MHA.A03(this, DbW.A0E(this), 7);
        AnonymousClass0fD.A09(-996683705, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2143007801);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A04(new C59111J6t(this, 1), 941438878, true));
        AnonymousClass0fD.A09(439986733, A022);
        return A002;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1288754306);
        super.onDestroy();
        AiSettingsRepository.A03(this);
        AnonymousClass0fD.A09(899408530, A022);
    }
}
