package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.H0b  reason: case insensitive filesystem */
public final class C54132H0b extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "WallPostPreviewFragment";
    public C331157Pu A00;
    public View A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C58704IwD.A01(this, 49));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 29), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C53385GnH gnH, C54132H0b h0b) {
        ((2dZ) h0b.A02.getValue()).setTitle(C55191Hdh.A00(h0b.requireContext(), (WallText) gnH.A03));
        View view = h0b.A01;
        if (view != null) {
            view.setVisibility(DbW.A01(gnH.A07 ? 1 : 0));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C54132H0b() {
        C58686Ivv A002 = C58686Ivv.A00(this, 1);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C58686Ivv.A00(C58686Ivv.A00(this, 2), 3));
        this.A03 = DbS.A0I(C58686Ivv.A00(A003, 4), A002, C58687Ivw.A00((Object) null, A003, 4), DbS.A0z(C53048Ghg.class));
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_more_horizontal_pano_filled_24;
        A0K.A05 = 2131966723;
        A0K.A0G = ID1.A00(this, 60);
        this.A01 = C51970G9q.A0P(A0K, r3);
        A00((C53385GnH) ((C53048Ghg) this.A03.getValue()).A0B.getValue(), this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(347176410);
        ComposeView A0H = DbV.A0H(this, C59346JFy.A00(this, 30), -2143427436);
        AnonymousClass0fD.A09(683863924, A022);
        return A0H;
    }
}
