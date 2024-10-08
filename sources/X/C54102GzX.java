package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.GzX  reason: case insensitive filesystem */
public final class C54102GzX extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "KeywordResponsesFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final String A05 = "keyword_responses_fragment";

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C54102GzX() {
        0eO r2 = 0eO.A02;
        this.A01 = C51804G2n.A01(this, "creator_ai_creator_igid", r2, 5);
        this.A00 = C51804G2n.A01(this, "creator_ai_creator_fbid", r2, 6);
        this.A02 = C51804G2n.A01(this, "creator_ai_entry_point_extra", r2, 7);
        this.A04 = DbS.A0I(C58706IwF.A01(this, 36), C58706IwF.A01(this, 37), new C58689Ivy(47, this, (Object) null), DbS.A0z(C54186H2g.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1600405939);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 3), 1504161138);
        AnonymousClass0fD.A09(-1054711726, A022);
        return A0H;
    }
}
