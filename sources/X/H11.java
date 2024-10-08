package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

public final class H11 extends AnonymousClass4DH implements AnonymousClass4DR, C252213ok, AnonymousClass0z4 {
    public static final String __redex_internal_original_name = "MagicModFragment";
    public MagicModLaunchParams A00;
    public C362088hK A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final 00N A05 = new 00N(new C57721IfO(this));
    public final C284945Oz A06 = C51970G9q.A0S(0);
    public final AnonymousClass3E6 A07 = AnonymousClass3E4.A01(this, false, true);
    public final AnonymousClass0eM A08 = DbS.A0I(new C58678Ivn(this, 36), new C58678Ivn(this, 35), new C58717IwQ(8, (Object) null, this), DbS.A0z(C351818An.class));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A07.A9Y(this);
    }

    public static final void A00(H11 h11) {
        C351818An.A03((C351818An) h11.A08.getValue(), false);
        if (h11.A03) {
            DbT.A1K(h11);
        } else {
            A01(h11);
        }
    }

    public final void DMr(int i, boolean z) {
        C51967G9n.A15(this.A06, i);
    }

    public final String getModuleName() {
        C362088hK r0 = this.A01;
        if (r0 == null) {
            return "ig_stories_magic_mod_hub";
        }
        int ordinal = r0.ordinal();
        if (ordinal == 1) {
            return "ig_stories_magic_mod_restyle";
        }
        if (ordinal == 0) {
            return "ig_stories_magic_mod_backdrop";
        }
        if (ordinal == 2) {
            return "ig_stories_magic_mod_expander";
        }
        throw AnonymousClass7TE.A1K();
    }

    public final 00N getOnBackPressedDispatcher() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean onBackPressed() {
        if (182.A06(0Tu.A05, DbT.A0X(this.A09), 36325123992597114L)) {
            00N r1 = this.A05;
            boolean z = r1.A01;
            r1.A04();
            if (z || this.A03) {
                return true;
            }
            return false;
        }
        A00(this);
        return this.A03;
    }

    public static final void A01(H11 h11) {
        if (h11.getParentFragmentManager().A0M() > 0) {
            h11.getParentFragmentManager().A0y("MAGIC_MOD", 1);
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(597681864);
        H11.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getBoolean("is_gen_ai_try_on_mode");
            String string = bundle2.getString("camera_tool");
            if (string != null) {
                C362088hK A002 = AnonymousClass6XS.A00(C2807253k.A00(string));
                if (A002 != null) {
                    this.A01 = A002;
                    this.A00 = (MagicModLaunchParams) C320236s2.A00(bundle2, MagicModLaunchParams.class, "launch_params");
                    this.A02 = bundle2.getString("prompt");
                    this.A04 = !((C351818An) this.A08.getValue()).A08;
                    AnonymousClass0fD.A09(1807260385, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -109331968;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1518887300;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1407392311;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1472644291);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 8), -1754357739);
        AnonymousClass0fD.A09(752587376, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(943002941);
        super.onDestroy();
        this.A07.EEH(this);
        AnonymousClass0fD.A09(1693153715, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-20881521);
        H11.super.onPause();
        this.A07.onStop();
        AnonymousClass0fD.A09(-503367709, A022);
    }

    public final void onResume() {
        int i;
        int A022 = AnonymousClass0fD.A02(1990049774);
        super.onResume();
        if (this.A04) {
            if (this.A03) {
                DbT.A1K(this);
            } else {
                A01(this);
            }
            i = 834993619;
        } else {
            this.A07.DmJ(getActivity());
            i = -985768518;
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
