package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E2o  reason: case insensitive filesystem */
public final class C47442E2o extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectDeleteThreadsEducationFragment";
    public final int A00 = 834871144;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, G2K.A00);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957545);
    }

    public final String getModuleName() {
        return "direct_delete_messages_education_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3021461u r1 = (C3021461u) AnonymousClass7TE.A0b(view, R.id.continue_button);
        r1.setPrimaryActionOnClickListener(FP4.A00(this, 7));
        r1.setSecondaryActionOnClickListener(FP4.A00(this, 8));
    }

    public static final 02m A00(C47442E2o e2o) {
        return (02m) AnonymousClass7TE.A14(e2o.A02);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.E2o, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2136631667);
        C47442E2o.super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().A06(new QAH((Object) this, 4), this);
        AnonymousClass0fD.A09(-284035899, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1632224175);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.delete_threads_education_fragment, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(inflate, R.id.delete_threads_education_title_textview);
        igdsHeadline.requestFocus();
        02m A002 = A00(this);
        int i = this.A00;
        A002.markerStart(i);
        FGX A023 = FGX.A02(requireContext(), true);
        FGX.A03(A023, igdsHeadline, FGX.A00(this, A023, FGX.A00(this, A023, DbV.A05(this).getString(2131955063), DbV.A05(this).getString(2131955062), R.drawable.instagram_media_pano_outline_24).getString(2131954719), DbV.A05(this).getString(2131954718), R.drawable.instagram_delete_pano_outline_24).getString(2131957564), DbV.A05(this).getString(2131957563), R.drawable.instagram_channels_pano_outline_24);
        A00(this).markerPoint(i, "nux_thread_impression");
        AnonymousClass0fD.A09(-1296867572, A022);
        return inflate;
    }
}
