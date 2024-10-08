package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.android.R;

/* renamed from: X.K4l  reason: case insensitive filesystem */
public final class C61367K4l extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiApprovedLandingPageFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 4), C66301MMk.A01(this, 5), MMV.A00((Object) null, this, 6), JTT.A0v());

    public final String getModuleName() {
        return "ai_approved_landing_page_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_x_pano_filled_24;
        r3.ErG(new AnonymousClass3Jb(A0K));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-349882773);
        C61367K4l.super.onCreate(bundle);
        String A012 = C320236s2.A01(requireArguments(), "persona_id");
        this.A00 = C320236s2.A01(requireArguments(), "bot_id");
        C60315JjI A0S = JTO.A0S(this.A02);
        0qQ.A0B(A012, 0);
        AiSettingsRepository aiSettingsRepository = A0S.A00;
        JTR.A1W(aiSettingsRepository.A0R);
        AnonymousClass7TE.A1Z(new C66174MGl((Object) aiSettingsRepository, A012, (AnonymousClass4D7) null, 2), aiSettingsRepository.A01);
        AnonymousClass0fD.A09(555990067, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(353533870);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 21), 944231104);
        AnonymousClass0fD.A09(712655582, A022);
        return A0H;
    }
}
