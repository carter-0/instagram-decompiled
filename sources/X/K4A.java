package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K4A extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FeedDraftsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(MMQ.A00(this, 34));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(MMQ.A00(this, 35));
    public final AnonymousClass0eM A02 = DbS.A0I(MMQ.A00(this, 40), MMQ.A00(this, 36), C66291MMa.A00((Object) null, this, 41), DbS.A0z(C60095Jfb.class));
    public final AnonymousClass0eM A03 = DbS.A0I(MMQ.A00(this, 39), MMQ.A00(this, 37), C66291MMa.A00((Object) null, this, 40), DbS.A0z(JWZ.class));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(MMQ.A00(this, 38), MMQ.A00(this, 41), C66291MMa.A00((Object) null, this, 39), DbS.A0z(JWW.class));
    public final String A06 = "feed_drafts";

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1846400910);
        K4A.super.onCreate(bundle);
        ((C60095Jfb) this.A02.getValue()).A0E();
        AnonymousClass0fD.A09(-1011189188, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1537966524);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 37), -1500200581);
        AnonymousClass0fD.A09(-209789445, A022);
        return A0H;
    }
}
