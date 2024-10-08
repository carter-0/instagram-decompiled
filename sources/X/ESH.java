package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public final class ESH extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BirthdayVisibilitySettingsFragment";
    public Dc2 A00;
    public C3726091o A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131953817);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = DbV.A05(this).getString(2131972502);
        DbX.A19(new FP9((Object) this, 54), A0K, r4);
    }

    public final String getModuleName() {
        return "birthday_visibility_settings_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A06(this);
    }

    public static final void A06(ESH esh) {
        esh.setItems(AnonymousClass7TE.A1I(new Object()));
        1NY A0M = DbZ.A0M(DbT.A0X(esh.A04));
        A0M.A02();
        A0M.A0A("api/v1/users/get_birthday_visibility_setting/");
        1OC A0S = DbU.A0S(A0M, C47295DuO.class, F47.class);
        0qQ.A0C(A0S, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C47696EDf.A00(esh, A0S, 33);
    }

    public static final void A07(ESH esh, String str) {
        0lg A0X = DbT.A0X(esh.A04);
        0qQ.A0B(str, 0);
        EWN ewn = (EWN) EWN.A03.get(str);
        if (ewn == null) {
            ewn = EWN.A07;
        }
        int i = ewn.A00;
        Integer valueOf = Integer.valueOf(i);
        0qQ.A0B(A0X, 0);
        1NY A05 = Dbc.A05(A0X);
        if (valueOf != null) {
            A05.A0C("visibility_status", i);
        }
        1OC A0T = DbT.A0T(A05, "surface", "caa");
        0qQ.A0C(A0T, C273654mx.A00(351));
        A0T.A00 = new C47690ECz(str, esh, 9);
        esh.schedule(A0T);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public static final void A08(ESH esh, C62320sa r5) {
        Context context = esh.getContext();
        if (context != null) {
            Dc2 dc2 = esh.A00;
            if (dc2 != null) {
                DbX.A1R(dc2);
                esh.A00 = null;
            }
            C72738PHs pHs = new C72738PHs(r5, 3);
            C310336ap A0X = DbV.A0X();
            int i = 2131968398;
            if (C61970qY.A0F(context)) {
                i = 2131974093;
            }
            DbS.A1E(esh, A0X, i);
            A0X.A01 = -1;
            A0X.A0G = DbU.A0m(esh, 2131972371);
            A0X.A0L = true;
            FdH.A00(A0X, pHs, 9);
            Dc2 A002 = A0X.A00();
            DbX.A1S(A002);
            esh.A00 = A002;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1617953945);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r2 = this.A04;
        setAdapter(new C62133Kak(requireContext, DbT.A0X(r2), this));
        this.A01 = new C3726091o(this, AnonymousClass7TE.A0l(r2));
        AnonymousClass0fD.A09(-486341655, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1519436624);
        super.onDestroyView();
        Dc2 dc2 = this.A00;
        if (dc2 != null) {
            DbX.A1R(dc2);
            this.A00 = null;
        }
        AnonymousClass0fD.A09(1970712618, A022);
    }
}
