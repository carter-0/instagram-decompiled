package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ESG extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "VisibilityOffInstagramFragment";
    public 1vn A00;
    public Dc2 A01;
    public PR9 A02;
    public PR9 A03;
    public User A04;
    public Boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131976693);
    }

    public final int getBottomPadding() {
        return 0;
    }

    public final String getModuleName() {
        return "visibility_off_instagram";
    }

    public final int getTopPadding() {
        return 0;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        User user = this.A04;
        if (user == null) {
            0qQ.A0F("currentUser");
            throw AnonymousClass00P.createAndThrow();
        } else if (user.A0N() == AnonymousClass05K.A01) {
            this.A06 = true;
            AnonymousClass0eM r5 = this.A09;
            1NY A0b = AnonymousClass7TG.A0b(AnonymousClass7TF.A0L(r5, 0));
            A0b.A02();
            A0b.A0A("api/v1/accounts/get_embeds_opt_out/");
            1OC A0R = DbT.A0R((15p) null, A0b, C47304DuX.class, F4J.class, false);
            0qQ.A0C(A0R, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetEmbedsOptOutResponse>>");
            C47696EDf.A00(this, A0R, 38);
            if (182.A06(0Tu.A05, DbT.A0X(r5), 36314077336897932L)) {
                this.A08 = true;
                User A0l = DbX.A0l(AnonymousClass0t1.A01, r5);
                1vn r2 = this.A00;
                if (r2 != null) {
                    2IS A042 = C41845B3m.A04();
                    FS6.A00(new FSG(6, A0l, this), new PandoGraphQLRequest(DbU.A0J(A042, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0l.getId()), "IGSeoIndexingOptOut", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BqK.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__XDTUserDict", AnonymousClass7TE.A1C()), r2, this, 14);
                }
            }
        }
    }

    public static final List A06(ESG esg) {
        if (esg.A06 || esg.A08) {
            return AnonymousClass7TE.A1I(new Object());
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        User user = esg.A04;
        if (user != null) {
            if (user.A0N() == AnonymousClass05K.A01) {
                Boolean bool = esg.A05;
                if (bool != null) {
                    PR9 A0f = DbS.A0f(new FQO(esg, 30), 2131961586, !bool.equals(AnonymousClass7TE.A0v()));
                    esg.A02 = A0f;
                    A1C.add(A0f);
                    C47518E6c.A03(DbT.A09(SQU.A01(esg.requireActivity(), "https://help.instagram.com/620154495870484?ref=igapp")), esg, DbU.A0m(esg, 2131964884), A1C, 2131961585);
                }
                User user2 = esg.A04;
                if (user2 != null) {
                    if (user2.A03.CSJ() != null) {
                        if (182.A06(0Tu.A05, DbT.A0X(esg.A09), 36314077336897932L)) {
                            DbV.A1W(A1C, true);
                            User user3 = esg.A04;
                            if (user3 != null) {
                                PR9 A0f2 = DbS.A0f(new FQO(esg, 31), 2131973121, AnonymousClass7TF.A1Y(user3.A03.CSJ(), true));
                                esg.A03 = A0f2;
                                A1C.add(A0f2);
                                C47518E6c.A03(DbT.A09(SQU.A01(esg.requireActivity(), "https://help.instagram.com/147542625391305?ref=igapp")), esg, DbU.A0m(esg, 2131964884), A1C, 2131973120);
                            }
                        }
                    }
                }
            }
            return A1C;
        }
        0qQ.A0F("currentUser");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public static final void A07(ESG esg) {
        Context context = esg.getContext();
        if (context != null) {
            Dc2 dc2 = esg.A01;
            if (dc2 != null) {
                DbX.A1R(dc2);
                esg.A01 = null;
            }
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "visibility_off_instagram_settings_error";
            int i = 2131968398;
            if (C61970qY.A0F(context)) {
                i = 2131974093;
            }
            DbS.A1E(esg, A0X, i);
            Dc2 A002 = A0X.A00();
            DbX.A1S(A002);
            esg.A01 = A002;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1055493724);
        super.onCreate(bundle);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r1 = this.A09;
        this.A04 = DbX.A0l(r0, r1);
        this.A00 = Dba.A0G(r1);
        setAdapter(new C62134Kal(requireContext(), DbT.A0X(r1), this));
        AnonymousClass0fD.A09(375525656, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-626828626);
        super.onDestroyView();
        Dc2 dc2 = this.A01;
        if (dc2 != null) {
            DbX.A1R(dc2);
            this.A01 = null;
        }
        AnonymousClass0fD.A09(1886891674, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2067644697);
        super.onResume();
        setItems(A06(this));
        AnonymousClass0fD.A09(-699447465, A022);
    }
}
