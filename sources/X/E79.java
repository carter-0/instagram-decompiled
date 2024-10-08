package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E79 extends C273374mT implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InauthenticActivityFragment";

    public final String getModuleName() {
        return "inauthentic_activity";
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 12 && i2 == -1) {
            DbT.A1K(this);
            C59689JTv.A07(getContext(), 2131954977);
        }
    }

    public final void configureActionBar(2da r2) {
        r2.Eom(2131964229);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-573060630);
        E79.super.onCreate(bundle);
        AnonymousClass0fD.A09(1710970849, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1582808076);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.challenge_inauthentic_activity_layout);
        TextView A0G = DbU.A0G(A0C, R.id.inauthentic_activity_paragraph);
        String string = getString(2131956462);
        ESx eSx = new ESx(Integer.valueOf(2Yu.A0F(requireContext(), R.attr.igds_color_link)), (Object) this, 6);
        SpannableStringBuilder A0E = DbY.A0E(this, string, 2131964230);
        AnonymousClass7AV.A05(A0E, eSx, string);
        DbT.A1H(A0G);
        A0G.setText(A0E);
        C3021461u r2 = (C3021461u) A0C.requireViewById(R.id.inauthentic_activity_bottom_buttons);
        r2.setPrimaryAction(DbV.A05(this).getString(2131954977), FP5.A00(this, 30));
        r2.setSecondaryAction(getString(2131965544), FP5.A00(this, 31));
        AnonymousClass0fD.A09(153059521, A02);
        return A0C;
    }
}
