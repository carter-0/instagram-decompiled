package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.Gzc  reason: case insensitive filesystem */
public final class C54107Gzc extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsLeadAdLoadingFragment";
    public LithoView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "clips_lead_ad_loading";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.Gzc, androidx.fragment.app.Fragment] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-229103297);
        AnonymousClass3X6 r1 = new AnonymousClass3X6(new 2V1(requireContext()));
        r1.A07 = AnonymousClass7TE.A0u();
        r1.A03 = new AnonymousClass3X8(this);
        ComponentTree A002 = r1.A00();
        this.A00 = C51974G9v.A08(this, A002);
        A002.A0M(new C251343mx());
        LithoView lithoView = this.A00;
        AnonymousClass0fD.A09(-1415636892, A02);
        return lithoView;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1279387580);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(282938675, A02);
    }
}
