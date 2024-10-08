package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class UYt extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoCaptureFragment";
    public AnonymousClass80Q A00;
    public AnonymousClass80C A01;
    public final C41837B2s A02 = new WUP(this, 2);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C59917Jbg(this, 37));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final String A05 = "potato_capture_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C226112fe.A0B.A05(requireActivity(), new C20013WjY(this));
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-799549687);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.potato_capture_fragment, viewGroup, false);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A01 = r0;
        registerLifecycleListener(r0);
        0qQ.A0A(inflate);
        AnonymousClass0fD.A09(-1172752024, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1334522666);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        AnonymousClass80C r0 = this.A01;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A01 = null;
        AnonymousClass0fD.A09(1607014650, A022);
    }
}
