package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.E3x  reason: case insensitive filesystem */
public final class C47473E3x extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AllowedAdPlacementsSettingsFragment";
    public final AnonymousClass0eM A00 = C51791G2a.A00(this, 10);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131952915);
        r3.Eu5(new FPD((Object) this, 36), true);
    }

    public final String getModuleName() {
        return "allowed_ad_placements_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0F = AnonymousClass7TF.A0F(view, R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recycler_view);
        C68504NKx nKx = new C68504NKx(requireContext(), DbT.A0X(this.A01), this);
        DbY.A16(this, recyclerView);
        recyclerView.setAdapter(nKx);
        DbV.A1F(getViewLifecycleOwner(), ((C46781Dl9) this.A02.getValue()).A00, new C58768IxF(15, A0F, this, recyclerView, nKx), 33);
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 46), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        2YL A0H = DbS.A0H(this.A02);
        AnonymousClass7TE.A1Z(new MH3(A0H, (AnonymousClass4D7) null, 48), C318116oQ.A00(A0H));
        return true;
    }

    public C47473E3x() {
        C51791G2a g2a = new C51791G2a(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 11), 12));
        this.A02 = DbS.A0I(new C51791G2a(A002, 13), g2a, new MJ7(49, (Object) null, A002), DbS.A0z(C46781Dl9.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1452069730);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.allowed_ad_placements, false);
        AnonymousClass0fD.A09(-2020683034, A022);
        return A0D;
    }
}
