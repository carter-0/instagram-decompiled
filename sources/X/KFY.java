package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class KFY extends C232222tE {
    public final Activity A00;
    public final C63645L1h A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        C60617JoQ joQ = new C60617JoQ(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_monetization_container, false));
        joQ.A02.A07 = new C65369LsA(this, 37);
        DbT.A1H(joQ.A00);
        return joQ;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C64806LiR liR = (C64806LiR) r8;
        C60617JoQ joQ = (C60617JoQ) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, liR, joQ);
        TextView textView = joQ.A01;
        textView.setText(liR.A02);
        joQ.A00.setText(liR.A01);
        boolean z = liR.A03;
        IgdsSwitch igdsSwitch = joQ.A02;
        if (z) {
            igdsSwitch.setVisibility(0);
            igdsSwitch.setChecked(liR.A04);
        } else {
            igdsSwitch.setVisibility(8);
        }
        if (liR.A06) {
            UserSession userSession = liR.A00;
            AnonymousClass5Gt A0V = DbZ.A0V(this.A00, 2131964002);
            A0V.A03(textView);
            A0V.A02();
            A0V.A00 = 30000;
            A0V.A0F = A1U;
            textView.postDelayed(new M94(userSession, A0V.A00(), this), 1000);
        }
        if (liR.A05) {
            UserSession userSession2 = liR.A00;
            AnonymousClass5Gt A0V2 = DbZ.A0V(this.A00, 2131964046);
            A0V2.A03(igdsSwitch);
            A0V2.A02();
            A0V2.A0F = A1U;
            igdsSwitch.post(new M93(userSession2, A0V2.A00(), this));
        }
    }

    public final Class modelClass() {
        return C64806LiR.class;
    }

    public KFY(Activity activity, C63645L1h l1h) {
        this.A00 = activity;
        this.A01 = l1h;
    }
}
