package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.9i3  reason: invalid class name and case insensitive filesystem */
public final class C384889i3 extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "VideoInPogCaptureFragment";
    public AnonymousClass80Q A00;
    public AnonymousClass80C A01;
    public final C41837B2s A02 = new WUP(this, 7);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C73928Pm8(this, 48));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(1010);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass7TF.A17(this, new C41169ApT(view, (ViewGroup) view.findViewById(R.id.video_note_in_pog_capture_fragment_container), this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A04.getValue();
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A00;
        if (r0 != null) {
            return r0.A06();
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-147935981);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_video_pog_in_note_creation_capture, viewGroup, false);
        AnonymousClass80C r0 = new AnonymousClass80C();
        registerLifecycleListener(r0);
        this.A01 = r0;
        0qQ.A0A(inflate);
        AnonymousClass0fD.A09(-1424305873, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1638373614);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        AnonymousClass80C r0 = this.A01;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A01 = null;
        AnonymousClass0fD.A09(-1049366461, A022);
    }
}
