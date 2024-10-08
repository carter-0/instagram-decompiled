package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K47 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiImproveResponseOptionsFragment";
    public C63855L9k A00;
    public String A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MMM(this, 43));
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "ai_improve_response_options_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A02);
        String str = this.A01;
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "thread_view_edit_ai_menu_shown", str));
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(495306963);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 45), 1257004442);
        AnonymousClass0fD.A09(2041758815, A022);
        return A0H;
    }
}
