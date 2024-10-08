package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.DiZ  reason: case insensitive filesystem */
public final class C46654DiZ extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UpdateProfilePictureTabFragment";
    public ListView A00;
    public C252063oV A01;
    public C252063oV A02;
    public SpinnerImageView A03;
    public String A04;
    public String A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;

    public final String getModuleName() {
        return "edit_profile_picture_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("logging_surface_key")) == null) {
            throw AnonymousClass7TE.A0z("surface is required");
        }
        this.A05 = string;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (string2 = bundle3.getString("logging_mechanism_key")) == null) {
            throw AnonymousClass7TE.A0z("mechanism is required");
        }
        this.A04 = string2;
        this.A00 = (ListView) view.requireViewById(R.id.update_profile_options_list);
        this.A03 = (SpinnerImageView) view.requireViewById(R.id.update_profile_loading_spinner);
        this.A02 = DbU.A0Y(view, R.id.update_profile_no_avatar_view_stub);
        this.A01 = DbU.A0Y(view, R.id.update_profile_instant_avatar_view_stub);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r3, this, viewLifecycleOwner, (AnonymousClass4D7) null, 23);
        19B r1 = 19B.A00;
        1Eo.A05(r1, mhh, A002);
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r1, new MHH(r3, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 24), AnonymousClass07a.A00(viewLifecycleOwner2));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C46654DiZ() {
        C51801G2k A002 = C51801G2k.A00(this, 36);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51801G2k.A00(C51801G2k.A00(this, 33), 34));
        this.A08 = DbS.A0I(C51801G2k.A00(A003, 35), A002, new MMX(10, (Object) null, (Object) A003), DbS.A0z(C46794DlT.class));
        0Yh A0z = DbS.A0z(AnonymousClass2kB.class);
        this.A06 = DbS.A0I(C51801G2k.A00(this, 31), C51801G2k.A00(this, 32), new MMX(9, (Object) null, (Object) this), A0z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((AnonymousClass2kB) this.A06.getValue()).A00(new C47374Dwl(i, i2, intent));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1916985078);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_update_profile_picture_page, false);
        AnonymousClass0fD.A09(-589992426, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-760018559);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        AnonymousClass0fD.A09(1228701076, A022);
    }

    public static final void A00(C46654DiZ diZ) {
        DbZ.A15(diZ);
    }
}
