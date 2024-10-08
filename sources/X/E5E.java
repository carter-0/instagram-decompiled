package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;
import java.util.List;

public final class E5E extends AnonymousClass4DH implements C252293os {
    public static final String __redex_internal_original_name = "ChannelCreationNuxFragment";
    public C15330Uaf A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass4DS A07 = FTU.A00;

    public final /* synthetic */ void DVx(int i, int i2) {
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final String getModuleName() {
        return "channel_creation_nux_carousel_container_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2dY.A01(FPI.A00(this, 45), DbX.A0I(view, R.id.direct_channel_action_bar)).A0X(this.A07);
        BaseFragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        requireActivity.A0a();
        TextView A0G = DbU.A0G(view, R.id.nux_get_started_button);
        A0G.setText(2131955052);
        FPI.A01(A0G, 44, this);
        List list = (List) ((C61072JwA) ((C46728DkH) this.A06.getValue()).A08.getValue()).A02;
        0qQ.A0B(list, 0);
        C15330Uaf uaf = new C15330Uaf();
        uaf.A04 = list;
        this.A00 = uaf;
        uaf.A02 = this;
        uaf.setArguments(requireArguments());
        0s1 A0C = DbW.A0C(this);
        C15330Uaf uaf2 = this.A00;
        if (uaf2 == null) {
            0qQ.A0F("slideFragment");
            throw AnonymousClass00P.createAndThrow();
        }
        A0C.A0A(uaf2, R.id.fragment_container);
        A0C.A00();
        C313756gx A0R = DbZ.A0R(this.A03);
        int A072 = DbX.A07(this.A02);
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) this.A05.getValue();
        0qQ.A0B(channelCreationSource, 1);
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            DbW.A17(A0J, A0R);
            DbV.A1M(A0J, "creator_nux_sheet_rendered");
            A0J.A0p("channel_item");
            Dbc.A0j(A0J, A0R, C313756gx.A00(channelCreationSource), A1E, A072);
        }
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void Dpz(int i, int i2) {
        Object value;
        List list;
        05G r4 = ((C46728DkH) this.A06.getValue()).A07;
        do {
            value = r4.getValue();
            list = (List) ((C61072JwA) value).A02;
            0qQ.A0B(list, 0);
        } while (!r4.AIY(value, new C61072JwA(list, i2, 10)));
        C313756gx A0R = DbZ.A0R(this.A03);
        int A072 = DbX.A07(this.A02);
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("carousel_id", String.valueOf(i2));
            DbW.A17(A0J, A0R);
            A0J.A0l("carousel_nux_screen_viewed");
            A0J.A0k("swipe");
            A0J.A0p("carousel_nux");
            Dbc.A0j(A0J, A0R, "broadcast_chat_creator_nux", A1E, A072);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public E5E() {
        C46570DhC dhC = new C46570DhC(this, 18);
        C46570DhC dhC2 = new C46570DhC(this, 15);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C46570DhC(dhC2, 16));
        this.A06 = DbS.A0I(new C46570DhC(A002, 17), dhC, new C73915Plq(22, A002, (Object) null), DbS.A0z(C46728DkH.class));
        this.A02 = C51804G2n.A01(this, "interest_based_channel_implicit_audience_type", r3, 18);
        this.A05 = C51804G2n.A01(this, "social_channel_creation_source", r3, 19);
        this.A01 = C51804G2n.A01(this, "direct_channel_creation_flow_extra_args", r3, 20);
        this.A03 = AnonymousClass0eN.A00(r3, new C46570DhC(this, 14));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(486126407);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_channels_nux_carousel_container, false);
        AnonymousClass0fD.A09(-1900866116, A022);
        return A0D;
    }
}
