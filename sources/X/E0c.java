package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E0c extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FacebookPlaysAndLikesFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C51796G2f(this, 43));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "facebook_plays_and_likes";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(60109244);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass0eM r1 = this.A00;
        boolean A4S = ((1Xj) r1.getValue()).A4S();
        View inflate = layoutInflater.inflate(R.layout.facebook_plays_and_likes_layout, viewGroup, false);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.text);
        C46342Dck dck = C46342Dck.A00;
        Resources A05 = DbV.A05(this);
        0qQ.A07(A05);
        A0R.setText(dck.A04(A05, "", ((1Xj) r1.getValue()).A0t(), ((1Xj) r1.getValue()).A0u(), A4S));
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.footer_text);
        boolean A4S2 = ((1Xj) r1.getValue()).A4S();
        String A0d = AnonymousClass7TF.A0d(DbV.A05(this), 2131973485);
        int i = 2131973486;
        if (A4S2) {
            i = 2131973487;
        }
        String A0e = AnonymousClass7TF.A0e(DbV.A05(this), A0d, i);
        0qQ.A07(A0e);
        C46678Dj7 dj7 = new C46678Dj7(DbT.A09(AnonymousClass000.A00(79)));
        SpannableStringBuilder A0C = DbS.A0C(A0e);
        AnonymousClass7AV.A03(A0C, dj7, A0d);
        A0R2.setMovementMethod(AnonymousClass6LK.A00);
        A0R2.setClickable(false);
        A0R2.setLongClickable(false);
        A0R2.setText(A0C);
        AnonymousClass0fD.A09(-702820132, A02);
        return inflate;
    }
}
