package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;

public final class H0T extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ReelsMidcardInjectToolSelectionFragment";
    public final String A00 = "InjectedMidcardFragment";
    public final AnonymousClass0eM A01 = DbS.A0I(new C58673Ivi(this, 28), new C58673Ivi(this, 24), C58690Ivz.A00((Object) null, this, 10), DbS.A0z(C357638Yz.class));
    public final AnonymousClass0eM A02 = C58673Ivi.A00(this, 25);
    public final AnonymousClass0eM A03 = C58673Ivi.A00(this, 26);
    public final AnonymousClass0eM A04 = C58673Ivi.A00(this, 27);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0b = AnonymousClass7TE.A0b(view, R.id.midcard_view);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MGL(viewLifecycleOwner, A0b, r4, this, (AnonymousClass4D7) null, 8), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public H0T() {
        C58673Ivi ivi = new C58673Ivi(this, 32);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58673Ivi(new C58673Ivi(this, 29), 30));
        this.A06 = DbS.A0I(new C58673Ivi(A002, 31), ivi, C58690Ivz.A00((Object) null, A002, 11), DbS.A0z(C53000Ggr.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1752721646);
        0qQ.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("midcard_type_args");
        } else {
            str = null;
        }
        Object obj = InstagramMidcardType.A01.get(str);
        if (obj == null) {
            obj = InstagramMidcardType.A0k;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("midcard_subtype_args");
        }
        ClipsMidCardSubtype A002 = HTW.A00(str2);
        2YL A0H = DbS.A0H(this.A06);
        AnonymousClass7TE.A1Z(new MHK(obj, (Object) A002, (Object) A0H, (AnonymousClass4D7) null, 49), C318116oQ.A00(A0H));
        View inflate = layoutInflater.inflate(R.layout.reels_injected_midcard_fragment, viewGroup, false);
        AnonymousClass0fD.A09(731470468, A022);
        return inflate;
    }

    public final void configureActionBar(2da r1) {
        Dbb.A1I(r1);
    }
}
