package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;

/* renamed from: X.NgR  reason: case insensitive filesystem */
public final class C69178NgR extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentEmbodimentThreadDetailFragment";
    public final AnonymousClass0eM A00 = DbW.A0p(this, 3);
    public final AnonymousClass0eM A01 = DbW.A0p(this, 4);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C73711PiY.A00);

    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        0qQ.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        String string = requireArguments().getString("bot_id");
        if (string != null) {
            boolean A1X = AnonymousClass7TG.A1X(((AnonymousClass7ZW) this.A00.getValue()).A00(string));
            PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new C71460Ol1(string, this, 0), DbX.A07(this.A03), A1X);
            pr9.A03 = R.drawable.instagram_user_circle_pano_outline_24;
            setItems(AnonymousClass7TE.A1I(pr9));
        }
    }

    public final String getModuleName() {
        return "ai_agent_embodiment_thread_detail_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(DbX.A07(this.A03));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1510553517);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(1545579654, A022);
    }
}
