package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.ArrayList;
import java.util.List;

public final class EO1 extends E3K implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OpalEditFragment";
    public C49636Ezt A00;
    public boolean A01;
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "opal_edit_fragment";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C49636Ezt ezt = this.A00;
        if (ezt != null) {
            ezt.A00.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C49636Ezt ezt = new C49636Ezt(requireContext(), AnonymousClass7TE.A0l(this.A00), new C50639Ffy(this));
        this.A00 = ezt;
        ezt.A00.DfL(bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 44), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void A08(boolean z) {
        DbU.A0L(this, 2dZ.A0t).A0Z(z);
        super.A08(z);
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A00);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        List list;
        Object value;
        C61084JwM jwM;
        Parcelable[] parcelableArrayExtra;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i4, i5, intent2);
        C49636Ezt ezt = this.A00;
        if (ezt != null) {
            ezt.A00.onActivityResult(i4, i5, intent2);
        }
        if (i4 == 68682 && i5 == -1) {
            if (intent != null) {
                i3 = intent2.getIntExtra("argument_opal_selected_audience_count", 0);
            } else {
                i3 = 0;
            }
            OpalProfileData opalProfileData = null;
            if (intent == null || (parcelableArrayExtra = intent2.getParcelableArrayExtra("argument_opal_selected_audience_facepile_list")) == null) {
                list = 0sn.A00;
            } else {
                ArrayList A0v = DbS.A0v(r5);
                for (Parcelable parcelable : parcelableArrayExtra) {
                    0qQ.A0C(parcelable, "null cannot be cast to non-null type com.instagram.opal.impl.data.OpalAudienceSelectorRepository.OpalAudience");
                    A0v.add(parcelable);
                }
                list = 00k.A0a(A0v);
            }
            AnonymousClass0eM r6 = this.A02;
            05G r5 = ((C46756Dkj) r6.getValue()).A04;
            do {
                value = r5.getValue();
                jwM = (C61084JwM) value;
            } while (!Dbb.A1X(jwM, OpalProfileData.A00((OpalProfileData) jwM.A01, (C62520KhB) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, i3, 5119, false, false), value, r5));
            Intent A09 = DbS.A09();
            OpalProfileData opalProfileData2 = (OpalProfileData) ((C61084JwM) ((C46756Dkj) r6.getValue()).A05.getValue()).A02;
            if (opalProfileData2 != null) {
                opalProfileData = OpalProfileData.A00(opalProfileData2, (C62520KhB) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, i3, 5119, false, false);
            }
            A09.putExtra("argument_update_profile_data", opalProfileData);
            requireActivity().setResult(-1, A09);
        }
    }

    public EO1() {
        C51794G2d g2d = new C51794G2d(this, 24);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51794G2d(new C51794G2d(this, 21), 22));
        this.A02 = DbS.A0I(new C51794G2d(A002, 23), g2d, new MJ7(42, (Object) null, A002), DbS.A0z(C46756Dkj.class));
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        A002.A02 = getString(2131968863);
        C59904JbT.A01(new FPD((Object) this, 32), r4, A002);
        r4.Eu5(new FPD((Object) this, 33), true);
        super.configureActionBar(r4);
    }

    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A022 = AnonymousClass0fD.A02(-1803083563);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable("argument_opal_data");
        } else {
            parcelable = null;
        }
        0eE r1 = AnonymousClass0t1.A01;
        AnonymousClass0eM r6 = this.A00;
        this.A01 = r1.A01(AnonymousClass7TE.A0l(r6)).A2F();
        if (parcelable != null) {
            2YL A0H = DbS.A0H(this.A02);
            AnonymousClass7TE.A1Z(new C51648Fy7(A0H, parcelable, (AnonymousClass4D7) null, 13), C318116oQ.A00(A0H));
        }
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r6), "surface_appear", "empty", "edit_opal", AnonymousClass7TE.A0l(r6).A06, (String) null);
        AnonymousClass0fD.A09(-1493488642, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1403967552);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new C59345JFx(this, 37), 500154201, true), true, false);
        AnonymousClass0fD.A09(336136630, A022);
        return A012;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1699070737);
        super.onDestroy();
        AnonymousClass0eM r1 = this.A00;
        C49049EoT.A00(this, AnonymousClass7TE.A0l(r1), "surface_disappear", "empty", "edit_opal", AnonymousClass7TE.A0l(r1).A06, (String) null);
        AnonymousClass0fD.A09(137355135, A022);
    }
}
