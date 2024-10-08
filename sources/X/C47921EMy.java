package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;

/* renamed from: X.EMy  reason: case insensitive filesystem */
public final class C47921EMy extends E4Z {
    public static final String __redex_internal_original_name = "CreatorRevshareAdsAboutFragment";
    public final AnonymousClass0eM A00 = C51791G2a.A00(this, 23);

    public final void configureActionBar(2da r4) {
        int i;
        0qQ.A0B(r4, 0);
        super.configureActionBar(r4);
        if (Dba.A00(this.A00) == 2) {
            i = 2131963590;
        } else {
            i = 2131963635;
            if (C49785F6t.A01(AnonymousClass7TE.A0l(this.A02))) {
                i = 2131963695;
            }
        }
        r4.Eom(i);
        DbX.A1A(new FPD(this, 40), DbX.A0M(), r4);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A00;
        if (Dba.A00(r3) == 2) {
            C49003Enf.A00((Drawable) null, (View.OnClickListener) null, view2, this, DbU.A0m(this, 2131963589), getString(2131963588), (String) null, 0sn.A00);
        } else {
            AnonymousClass0eM r1 = this.A02;
            int i = 2131963634;
            if (C49785F6t.A01(AnonymousClass7TE.A0l(r1))) {
                i = 2131963694;
            }
            int i2 = 2131963633;
            if (C49785F6t.A01(AnonymousClass7TE.A0l(r1))) {
                i2 = 2131963693;
            }
            C49003Enf.A00((Drawable) null, new FPD(this, 41), view2, this, DbU.A0m(this, i), getString(i2), getString(2131963586), 0sn.A00);
        }
        Dr0 dr0 = (Dr0) A03().A02.A02();
        if (!(dr0 == null || (str = dr0.A03) == null)) {
            E4Z.A00(view, str);
        }
        if (r3.getValue() == IGRevShareProductType.REELS_OVERLAY_ADS) {
            ((C3021461u) view.requireViewById(R.id.bottom_button_layout)).setPrimaryAction(DbU.A0m(this, 2131963586), new FPD(this, 42));
            C3021461u r32 = (C3021461u) view.findViewById(R.id.bottom_button_layout);
            if (r32 != null) {
                r32.setSecondaryAction(getString(2131963587), new FPD(this, 43));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(419035067);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_revshare_ads_about_ads, false);
        AnonymousClass0fD.A09(1686694211, A02);
        return A0D;
    }
}
