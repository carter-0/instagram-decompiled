package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.K5e  reason: case insensitive filesystem */
public final class C61386K5e extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiKnowledgeFragment";
    public final AnonymousClass0eM A00 = MMM.A00(this, 48);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(new MMM(this, 49), new MMA(this, 0), MMV.A00((Object) null, this, 35), JTT.A0v());
    public final String A03 = "ai_knowledge_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A00);
        String A022 = C60315JjI.A02(this.A02);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_knowledge_screen_shown", A022));
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        LTH A0T = JTO.A0T(this.A00);
        String A022 = C60315JjI.A02(this.A02);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_knowledge_back_button_clicked", A022));
            A002.Cgf();
        }
        DbT.A1I(this);
        return true;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952776);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1942701114);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 46), -143949856);
        AnonymousClass0fD.A09(-77325105, A022);
        return A0H;
    }
}
