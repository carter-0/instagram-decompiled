package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzj  reason: case insensitive filesystem */
public final class C54114Gzj extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BioSummaryFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04 = "creators_genai_bio_summary";

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C54114Gzj() {
        0eO r2 = 0eO.A02;
        this.A01 = C51804G2n.A01(this, "creator_ai_creator_igid", r2, 8);
        this.A00 = AnonymousClass1YB.A00(C58706IwF.A01(this, 40));
        C58706IwF A012 = C58706IwF.A01(this, 44);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, C58706IwF.A01(C58706IwF.A01(this, 41), 42));
        this.A03 = DbS.A0I(C58706IwF.A01(A002, 43), A012, new C73664Phd(0, A002, (Object) null), DbS.A0z(C52994Ggl.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1192009803);
        C54114Gzj.super.onCreate(bundle);
        C52994Ggl ggl = (C52994Ggl) this.A03.getValue();
        if (ggl.A00 == null) {
            C58102ImO.A02(ggl, C318116oQ.A00(ggl), 46);
        }
        AnonymousClass0fD.A09(-1689119003, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-8638139);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 5), -2067645133);
        AnonymousClass0fD.A09(-1450475945, A022);
        return A0H;
    }
}
