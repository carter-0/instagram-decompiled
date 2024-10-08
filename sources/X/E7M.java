package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class E7M extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SubscribedAndRecommendedCreatorListFragment";
    public C273004lm A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final C49678F1k A03 = new C49678F1k(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131974602);
    }

    public final String getModuleName() {
        return "subscribed_creator_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(view, viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 42), AnonymousClass07a.A00(viewLifecycleOwner));
        getRecyclerView().A15(new C3251871j(getRecyclerView().A0D, new C50436Fbj(this, 2), C3251771i.A0A, false, false));
    }

    public static final void A01(E7M e7m, User user, Integer num) {
        String str;
        String id = user.getId();
        ArrayList<C47243DtU> A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) ((C46797DlY) e7m.A02.getValue()).A06.getValue()) {
            if (next instanceof C47243DtU) {
                A1C.add(next);
            }
        }
        int i = 0;
        for (C47243DtU dtU : A1C) {
            if (!0qQ.A0K(dtU.A02.getId(), id)) {
                i++;
            } else if (i >= 0) {
                C273004lm r0 = e7m.A00;
                if (r0 == null) {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
                String A002 = A00(user);
                String id2 = user.getId();
                long j = (long) i;
                0Aj A0e = AnonymousClass7TE.A0e(r0.A00, "fan_club_subscription_list_action");
                DbS.A1O(A0e, "subscriber_list");
                A0e.AAJ("origin", A002);
                if (num.intValue() != 0) {
                    str = "tap_subscribe";
                } else {
                    str = "tap_username";
                }
                DbS.A1J(A0e, str);
                DbY.A1G(A0e, id2);
                A0e.A9F("position", Long.valueOf(j));
                A0e.Cgf();
                return;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        AnonymousClass0eM r0 = this.A01;
        return 0sr.A1P(new C232232tF[]{new EHD(this, AnonymousClass7TE.A0l(r0), this.A03, 182.A06(0Tu.A05, DbY.A0R(r0), 36321610709542494L)), new Object(), new Object(), new C66610MYw((C46797DlY) this.A02.getValue(), R.layout.fan_club_empty_view)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3M.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E7M() {
        C51798G2h g2h = new C51798G2h(this, 8);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 5), 6));
        this.A02 = DbS.A0I(new C51798G2h(A002, 7), g2h, new C58187Inr(3, A002, (Object) null), DbS.A0z(C46797DlY.class));
    }

    public static final String A00(User user) {
        Integer num;
        if (user.A29()) {
            num = AnonymousClass05K.A08;
        } else {
            num = AnonymousClass05K.A09;
        }
        Set set = C49280EsP.A00;
        if (16 - num.intValue() != 0) {
            return "subscribed_list_in_follow_unconnected";
        }
        return "subscribed_list_in_follow_connected";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1159835317);
        E7M.super.onCreate(bundle);
        this.A00 = C272994ll.A00(AnonymousClass7TE.A0l(this.A01));
        AnonymousClass0fD.A09(163626943, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2104821865);
        super.onResume();
        AnonymousClass0eM r5 = this.A02;
        ((C46797DlY) r5.getValue()).CgO();
        C46797DlY dlY = (C46797DlY) r5.getValue();
        if (!dlY.A00) {
            dlY.A00 = true;
            AnonymousClass7TE.A1Z(new C66182MGt((Object) dlY, (AnonymousClass4D7) null, 41), C318116oQ.A00(dlY));
        }
        ((C46797DlY) r5.getValue()).A03.A08.FIA(C60340gF.A00);
        AnonymousClass0fD.A09(217731030, A022);
    }
}
