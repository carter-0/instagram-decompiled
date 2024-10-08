package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public final class ES4 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridFragment";
    public UserSession A00;
    public DevOptionsPreferenceAdapter A01;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_options";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public static void A06(ES4 es4, C46471DfZ dfZ) {
        HashMap A012 = C359608dC.A01(AnonymousClass7TE.A1E());
        IgBloksScreenConfig A0N = DbS.A0N(es4.A00);
        A0N.A0R = "com.bloks.www.bloks.demos.cds.nativebottomsheet";
        A0N.A0C = dfZ;
        C46649DiU diU = new C46649DiU(A012, Collections.emptyMap(), "com.bloks.www.bloks.demos.cds.nativebottomsheet");
        diU.A00 = 719983200;
        diU.A0F(es4.requireContext(), A0N);
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131957734);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(624325669);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(556345493, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DbV.A0F(this).setBackgroundColor(2Yu.A00(getContext()));
        Context context = getContext();
        ArrayList A1C = AnonymousClass7TE.A1C();
        C46448DfA.A02(A1C, 2131957750);
        C50989Fmc.A02(requireContext(), new FPE(13, (Object) this, (Object) C229382nI.A03(this, this.A00, (2el) null)), A1C, 2131957735);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 48), A1C, 2131957749);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 51), A1C, 2131957752);
        C46448DfA.A02(A1C, 2131957747);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 52), A1C, 2131957748);
        A1C.add(new C46448DfA((CharSequence) "Bloks Screen Query Examples"));
        C50989Fmc.A01(requireContext(), new FP6((Object) this, 53), "Simple Screen Query Example", A1C);
        C50989Fmc.A01(requireContext(), new FP6((Object) this, 54), "Prebundled Screen Query Example", A1C);
        C46448DfA.A02(A1C, 2131957746);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 55), A1C, 2131957744);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 45), A1C, 2131957742);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 46), A1C, 2131957743);
        C50989Fmc.A02(requireContext(), new FPE(12, (Object) this, (Object) context), A1C, 2131957745);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 47), A1C, 2131957741);
        C46448DfA.A02(A1C, 2131957739);
        C50989Fmc.A02(requireContext(), new FPE(14, (Object) this, (Object) context), A1C, 2131957740);
        C46448DfA.A02(A1C, 2131957736);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 49), A1C, 2131957737);
        C50989Fmc.A02(requireContext(), new FP6((Object) this, 50), A1C, 2131957738);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = new DevOptionsPreferenceAdapter(getActivity(), this.A00, this);
        this.A01 = devOptionsPreferenceAdapter;
        devOptionsPreferenceAdapter.setUnfilteredItems(A1C);
        getScrollingViewProxy().ENw(this.A01);
        this.A01.getFilter().filter((CharSequence) null);
    }
}
