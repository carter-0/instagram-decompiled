package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.NKl  reason: case insensitive filesystem */
public final class C68492NKl extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BroadcastChannelActivityFeedV2Fragment";
    public final Set A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73656PhV(this, 37));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final O6I A05;
    public final O6J A06;

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        int i = 2131959308;
        if (DbX.A07(this.A01) == 0) {
            i = 2131959307;
        }
        r6.Eom(i);
        r6.Eu4(true);
        AnonymousClass0eM r1 = this.A03;
        if (AnonymousClass7K4.A00(AnonymousClass7TE.A0l(r1))) {
            if (182.A06(0Tu.A05, DbT.A0X(r1), 36319407393611066L)) {
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A0C = 2131959306;
                A0K.A0P = true;
                A0K.A02 = JTP.A02(getContext(), requireContext(), R.attr.igds_color_creation_tools_blue);
                DbX.A19(new FPI((Object) this, 42), A0K, r6);
            }
        }
    }

    public final String getModuleName() {
        return "direct_broadcast_chats_activity_feed";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r5 = this.A04;
        AnonymousClass0Ud r2 = ((BroadcastChannelActivityFeedV2ViewModel) r5.getValue()).A08;
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 4), C48263Ebi.A00(07U.A05, getViewLifecycleOwner().getLifecycle(), r2));
        ((BroadcastChannelActivityFeedV2ViewModel) r5.getValue()).A01();
        JTQ.A0y(getRecyclerView().A0D, getRecyclerView(), new C72693PFx(this, 0), C3251771i.A0A);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new C68591NOn(this, this.A06), new C68573NNu(this.A05), new Object(), new C66610MYw(((BroadcastChannelActivityFeedV2ViewModel) this.A04.getValue()).A05, R.layout.direct_empty_view)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 23));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C68492NKl() {
        C73656PhV phV = new C73656PhV(this, 43);
        AnonymousClass0eM A0g = Dba.A0g(new C73656PhV(this, 40), 0eO.A02, 41);
        this.A04 = DbS.A0I(new C73656PhV(A0g, 42), phV, C73915Plq.A00(A0g, (Object) null, 18), DbS.A0z(BroadcastChannelActivityFeedV2ViewModel.class));
        this.A02 = AnonymousClass1YB.A00(new C73656PhV(this, 39));
        this.A06 = new O6J(this);
        this.A00 = DbS.A0y();
        this.A05 = new O6I(this);
        this.A03 = C227642jf.A02(this);
    }

    public final void onResume() {
        AnonymousClass3U9 C60;
        int A022 = AnonymousClass0fD.A02(-1642150674);
        super.onResume();
        BroadcastChannelActivityFeedV2ViewModel broadcastChannelActivityFeedV2ViewModel = (BroadcastChannelActivityFeedV2ViewModel) this.A04.getValue();
        if (broadcastChannelActivityFeedV2ViewModel.A06.getValue() == C62509Kgz.SUCCESS) {
            05G r4 = broadcastChannelActivityFeedV2ViewModel.A07;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : (Iterable) r4.getValue()) {
                C232262tL r2 = (C232262tL) next;
                if ((r2 instanceof N63) && ((C60 = broadcastChannelActivityFeedV2ViewModel.A04.C60(((N63) r2).A06)) == null || !C60.COP())) {
                    A1C.add(next);
                }
            }
            boolean A1b = AnonymousClass7TE.A1b(A1C);
            List list = A1C;
            if (!A1b) {
                list = AnonymousClass7TE.A1I(new C61153Jy5(AnonymousClass7TF.A0d(broadcastChannelActivityFeedV2ViewModel.A02, 2131958676)));
            }
            r4.Epw(list);
        }
        AnonymousClass0fD.A09(-1596632729, A022);
    }
}
