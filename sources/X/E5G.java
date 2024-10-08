package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class E5G extends AnonymousClass4DH implements AnonymousClass8QW, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HighlightsGridFragment";
    public final C49385Eun A00 = new C49385Eun(this);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(C51800G2j.A00(this, 48));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C51800G2j.A00(this, 49));
    public final AnonymousClass0eM A03 = C51795G2e.A00(this, 0);
    public final AnonymousClass0eM A04 = C51795G2e.A00(this, 1);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void Dik() {
    }

    public final /* synthetic */ void Du4() {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963456);
    }

    public final String getModuleName() {
        return "highlights_grid";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View A0b = AnonymousClass7TE.A0b(view2, R.id.loading_spinner);
        RecyclerView A0F = DbZ.A0F(view2, R.id.highlights_recycler_view);
        A0F.setAdapter(((C49384Eum) this.A01.getValue()).A00);
        A0F.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        AnonymousClass3AQ r1 = new AnonymousClass3AQ();
        r1.A00 = false;
        A0F.setItemAnimator(r1);
        C328767Gd r11 = ((C60190Jh9) this.A06.getValue()).A01;
        Resources resources = view2.getResources();
        new AnonymousClass8QZ(requireContext(), (View) null, this, AnonymousClass7TE.A0l(this.A05), AnonymousClass7TE.A0b(view2, R.id.highlights_media_thumbnail_tray), (C355458Qb) null, r11, this, (C355468Qc) null, (AnonymousClass7SL) null, JYJ.A00, AnonymousClass8QY.A00, 0.5625f, 2131968361, 0, resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2, R.color.black_90_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
        07U r29 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r29, A0b, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final void Du1(C53401GnY gnY) {
        List<C47239DtQ> list = ((C60190Jh9) this.A06.getValue()).A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C47239DtQ dtQ : list) {
            A0r.add(dtQ.A02);
        }
        FCO.A02(requireContext(), new C50902Fkh(0, A0r, this), A0r);
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public E5G() {
        C51795G2e g2e = new C51795G2e(this, 5);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 2), 3));
        this.A06 = DbS.A0I(new C51795G2e(A002, 4), g2e, new MJ4(37, (Object) null, A002), DbS.A0z(C60190Jh9.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 || i == 10005) {
            DbT.A1J(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1656115553);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlights_grid_fragment, false);
        AnonymousClass0fD.A09(-1178169613, A022);
        return A0D;
    }
}
