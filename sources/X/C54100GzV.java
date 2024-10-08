package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.GzV  reason: case insensitive filesystem */
public final class C54100GzV extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FactsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "creator_ai_settings_facts_fragment";

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C54100GzV() {
        0eO r2 = 0eO.A02;
        this.A02 = C51975G9x.A0r(this, "creator_ai_add_fact_content_type", r2, 43);
        this.A00 = C51975G9x.A0r(this, "creator_ai_creator_fbid", r2, 44);
        this.A01 = C51975G9x.A0r(this, "creator_ai_entry_point_extra", r2, 45);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1289698627);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 45), -1569354502);
        AnonymousClass0fD.A09(1368611822, A022);
        return A0H;
    }
}
