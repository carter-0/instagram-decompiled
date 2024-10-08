package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.GzU  reason: case insensitive filesystem */
public final class C54099GzU extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsUserDetailRightPanelFragment";
    public LithoView A00;
    public final String A01 = "producer_user_name";
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = C58679Ivo.A00(this, 1);

    public final String getModuleName() {
        return AnonymousClass000.A00(2813);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.GzU, androidx.fragment.app.Fragment] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-704259402);
        AnonymousClass3X6 r1 = new AnonymousClass3X6(new 2V1(requireContext()));
        r1.A07 = AnonymousClass7TE.A0u();
        r1.A03 = new AnonymousClass3X8(this);
        ComponentTree A002 = r1.A00();
        this.A00 = C51974G9v.A08(this, A002);
        A002.A0M(new C53641Gru(DbS.A0t(this.A03)));
        LithoView lithoView = this.A00;
        AnonymousClass0fD.A09(698939405, A022);
        return lithoView;
    }
}
