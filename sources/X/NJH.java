package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import java.io.Serializable;
import java.util.Map;

public final class NJH extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectChallengesNuxFragment";
    public C74314Psq A00;
    public C69309NjA A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C67570Mq4(this, 30));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.direct_challenges_nux_header_title);
        int i = 2131954933;
        if (this.A02) {
            i = 2131954918;
        }
        DbU.A1G(A0G, this, i);
        TextView A0G2 = DbU.A0G(view, R.id.direct_challenges_nux_subtitle);
        int i2 = 2131954931;
        if (this.A02) {
            i2 = 2131954915;
        }
        DbU.A1G(A0G2, this, i2);
        boolean A002 = AnonymousClass3HA.A00(requireContext());
        ImageView A0F = DbU.A0F(view, R.id.direct_challenges_nux_header_image);
        int i3 = R.drawable.channels_challenge_nux_light;
        if (A002) {
            i3 = R.drawable.channels_challenge_nux_dark;
        }
        A0F.setImageResource(i3);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.direct_challenges_nux_disclosure);
        if (this.A02) {
            String A0m = DbU.A0m(this, 2131954917);
            String A0z = DbV.A0z(this, A0m, 2131954916);
            0qQ.A07(A0z);
            int A042 = Dbb.A04(this);
            AnonymousClass7AV.A07(new C68503NKw(new 04x(16, A0m), AnonymousClass05K.A01, this, A0m, A042, 1), A0R, A0m, A0z);
        } else {
            DbU.A1G(A0R, this, 2131954932);
        }
        ((C3021461u) view.requireViewById(R.id.direct_challenges_nux_cta_button)).setPrimaryActionOnClickListener(C71401Ok0.A00(this, 18));
        if (this.A01 == C69309NjA.THREAD) {
            Bundle requireArguments = requireArguments();
            C72202OyR.A03((C69493Nmb) null, C66580MXl.A0T(this.A03), DbV.A0o(requireArguments, "direct_thread_audience_type"), requireArguments.getString(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY), requireArguments.getString("direct_thread_key_v2"), "challenge_creator_nux_sheet_rendered", "impression", "thread_view", "thread_view", (Map) null);
            return;
        }
        C72202OyR A0T = C66580MXl.A0T(this.A03);
        C69309NjA njA = this.A01;
        if (njA == null || njA.ordinal() != 1) {
            str = "challenge_button";
        } else {
            str = "get_started_button";
        }
        C72202OyR.A03((C69493Nmb) null, A0T, 0, (String) null, (String) null, "challenge_creator_nux_sheet_rendered", "tap", str, "thread_view", (Map) null);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        C69309NjA njA;
        int A022 = AnonymousClass0fD.A02(-1708937212);
        NJH.super.onCreate(bundle);
        this.A02 = requireArguments().getBoolean("arg_is_creator");
        Serializable serializable = requireArguments().getSerializable("prompts_entry_point");
        if (serializable instanceof C69309NjA) {
            njA = (C69309NjA) serializable;
        } else {
            njA = null;
        }
        this.A01 = njA;
        AnonymousClass0fD.A09(636538393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1690773600);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_challenges_bottom_sheet_nux, false);
        AnonymousClass0fD.A09(-128663287, A022);
        return A0D;
    }
}
