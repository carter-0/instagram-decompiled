package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public abstract class E0Q extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "WellbeingInterstitialFragment";
    public UserSession A00;

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-525325696);
        E0Q.super.onCreate(bundle);
        this.A00 = DbS.A0U(requireArguments());
        AnonymousClass0fD.A09(-413703869, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0m;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String A0m2;
        int A02 = AnonymousClass0fD.A02(-755773842);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.wellbeing_interstitial_layout);
        int A03 = Dbb.A03(A0C, R.id.wellbeing_interstitial_image);
        TextView A0G = DbU.A0G(A0C, R.id.wellbeing_interstitial_title);
        boolean z = this instanceof EKH;
        if (z) {
            A0m = getString(2131960645);
        } else {
            A0m = DbU.A0m(this, 2131960202);
        }
        A0G.setText(A0m);
        TextView A0G2 = DbU.A0G(A0C, R.id.wellbeing_interstitial_sub_title);
        if (TextUtils.isEmpty((CharSequence) null)) {
            i = 8;
        } else {
            A0G2.setText((CharSequence) null);
            i = 0;
        }
        A0G2.setVisibility(i);
        TextView A0G3 = DbU.A0G(A0C, R.id.wellbeing_interstitial_note);
        if (TextUtils.isEmpty((CharSequence) null)) {
            i2 = 8;
        } else {
            A0G3.setText((CharSequence) null);
            i2 = 0;
        }
        A0G3.setVisibility(i2);
        RecyclerView A0I = DbT.A0I(A0C, R.id.wellbeing_interstitial_list);
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z) {
            A1C.add(new C49543Exe(R.drawable.instagram_arrow_ccw_pano_outline_24, 2131960653, 2131960652));
            A1C.add(new C49543Exe(R.drawable.instagram_lock_pano_outline_24, 2131960647, 2131960646));
            i3 = R.drawable.instagram_shield_pano_outline_24;
            i4 = 2131960651;
            i5 = 2131960650;
        } else {
            A1C.add(new C49543Exe(R.drawable.instagram_arrow_ccw_pano_outline_24, 2131960649, 2131960648));
            A1C.add(new C49543Exe(R.drawable.instagram_lock_pano_outline_24, 2131960647, 2131960203));
            i3 = R.drawable.instagram_shield_pano_outline_24;
            i4 = 2131960651;
            i5 = 2131960204;
        }
        A1C.add(new C49543Exe(i3, i4, i5));
        A0I.setAdapter(new C46814Dlq(A1C));
        TextView A0G4 = DbU.A0G(A0C, R.id.wellbeing_interstitial_cta_btn);
        if (z) {
            A0m2 = getString(17039370);
        } else {
            A0m2 = DbU.A0m(this, 17039370);
        }
        A0G4.setText(A0m2);
        FP8.A01(A0G4, 57, this);
        DbT.A1F(A0C, R.id.wellbeing_interstitial_close, A03);
        AnonymousClass0fD.A09(2018840384, A02);
        return A0C;
    }
}
