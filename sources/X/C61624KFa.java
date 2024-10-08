package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KFa  reason: case insensitive filesystem */
public final class C61624KFa extends C232222tE {
    public final Activity A00;
    public final UserSession A01;

    public C61624KFa(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60638Jol(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_sharing_arrow_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C64805LiP liP = (C64805LiP) r8;
        C60638Jol jol = (C60638Jol) r9;
        int i = 0;
        boolean A1U = AnonymousClass7TF.A1U(0, liP, jol);
        jol.A03.setText(liP.A04);
        TextView textView = jol.A02;
        textView.setText(liP.A03);
        TextView textView2 = jol.A01;
        CharSequence charSequence = liP.A02;
        textView2.setText(charSequence);
        if (charSequence == null) {
            i = 8;
        }
        textView2.setVisibility(i);
        int width = textView.getWidth();
        2D6 A002 = 2D5.A00(this.A01);
        if (width > 0 && liP.A05) {
            0xa r2 = A002.A04;
            if (!DbT.A1a(r2, "PREFERENCE_IG_TO_FB_WASLIVE_HAS_SHOWN_CROSS_POST_TO_FACEBOOK")) {
                DbX.A1V(r2, "PREFERENCE_IG_TO_FB_WASLIVE_HAS_SHOWN_CROSS_POST_TO_FACEBOOK", A1U);
                int i2 = liP.A00;
                AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131976793);
                A0V.A04(textView, (width - i2) / 2, -i2, A1U);
                A0V.A02();
                A0V.A0F = A1U;
                textView.post(new C65995M7g(A0V.A00(), this));
            }
        }
        AnonymousClass0fU.A00(liP.A01, jol.A00);
    }

    public final Class modelClass() {
        return C64805LiP.class;
    }
}
