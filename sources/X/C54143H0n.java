package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;

/* renamed from: X.H0n  reason: case insensitive filesystem */
public final class C54143H0n extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ContextualBackgroundFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final String A03;

    public final boolean onBackPressed() {
        A00(this, false);
        return true;
    }

    public static final void A00(C54143H0n h0n, boolean z) {
        C54626HLj hLj;
        ContextualBackgroundViewModel contextualBackgroundViewModel = (ContextualBackgroundViewModel) h0n.A02.getValue();
        C55934Hpx hpx = contextualBackgroundViewModel.A00;
        if (z) {
            hLj = C54626HLj.DONE;
        } else if (((C61050Jvo) contextualBackgroundViewModel.A0A.getValue()).A02 == AnonymousClass05K.A00) {
            hLj = C54626HLj.PRE_GEN;
        } else {
            hLj = C54626HLj.POST_GEN;
        }
        27r A012 = 27p.A01(hpx.A01);
        String str = hpx.A00.A00;
        int ordinal = hLj.ordinal();
        int i = 3;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                i = 1;
            }
        }
        A012.A1e(C358088aL.A05, str, i);
        ((C356988Vz) h0n.A00.getValue()).A00(C356928Vt.NONE);
    }

    public final void afterOnViewCreated() {
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHJ((Object) viewLifecycleOwner, (Object) 07U.A05, (Object) this, (AnonymousClass4D7) null, 43), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C54143H0n() {
        C66218MIz mIz = new C66218MIz(this, 49);
        C58678Ivn ivn = new C58678Ivn(this, 0);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C66218MIz(mIz, 45));
        this.A02 = DbS.A0I(new C66218MIz(A002, 46), ivn, new C66291MMa(49, (Object) null, A002), DbS.A0z(ContextualBackgroundViewModel.class));
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C66218MIz(new C66218MIz(this, 42), 47));
        0Yh A0z = DbS.A0z(C356988Vz.class);
        this.A00 = DbS.A0I(new C66218MIz(A003, 48), new C58717IwQ(1, A003, this), new C58717IwQ(0, (Object) null, A003), A0z);
        this.A03 = "contextualbackground_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1820998453);
        Parcelable parcelable = requireArguments().getParcelable("ORIGINAL_IMAGE_DATA_ARG");
        if (parcelable != null) {
            AnonymousClass0eM r6 = this.A02;
            ContextualBackgroundViewModel contextualBackgroundViewModel = (ContextualBackgroundViewModel) r6.getValue();
            if (!parcelable.equals(contextualBackgroundViewModel.A08.getValue())) {
                AnonymousClass7TE.A1Z(new MHN((Object) parcelable, (Object) contextualBackgroundViewModel, (AnonymousClass4D7) null, 20), C318116oQ.A00(contextualBackgroundViewModel));
            }
            ContextualBackgroundViewModel contextualBackgroundViewModel2 = (ContextualBackgroundViewModel) r6.getValue();
            C55934Hpx hpx = new C55934Hpx(contextualBackgroundViewModel2.A01);
            contextualBackgroundViewModel2.A00 = hpx;
            27p.A01(hpx.A01).A1f(C358088aL.A05, hpx.A00.A00, 1);
            C54143H0n.super.onCreate(bundle);
            AnonymousClass0fD.A09(1940927689, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1491030538, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-765927869);
        ComposeView A0H = DbV.A0H(this, new J73(8, this, requireArguments().getBoolean("IS_FOOTER_BELOW_MEDIA_ARG")), 265180763);
        AnonymousClass0fD.A09(-447686947, A022);
        return A0H;
    }
}
