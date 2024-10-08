package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.List;

/* renamed from: X.KFb  reason: case insensitive filesystem */
public final class C61625KFb extends C232222tE {
    public final Activity A00;
    public final UserSession A01;

    public C61625KFb(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60660Jp7(DbT.A0D(layoutInflater, viewGroup, R.layout.metadata_sharing_toggle_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        C47567E8f e8f;
        C64810LiV liV = (C64810LiV) r10;
        C60660Jp7 jp7 = (C60660Jp7) r11;
        int A1U = AnonymousClass7TF.A1U(0, liV, jp7);
        jp7.A04.setText(liV.A04);
        CharSequence charSequence = liV.A03;
        C358618bC r0 = null;
        TextView textView = jp7.A02;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        List list = liV.A06;
        TextView textView2 = jp7.A03;
        if (list != null) {
            if (!(textView2 == null || list.size() <= A1U || (e8f = liV.A01) == null)) {
                AnonymousClass7AV.A07(e8f, textView2, AnonymousClass7TE.A19(list, 0), AnonymousClass7TE.A19(list, A1U));
            }
            textView2.setVisibility(0);
        } else {
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
        }
        jp7.A01.setVisibility(8);
        IgdsSwitch igdsSwitch = jp7.A05;
        igdsSwitch.setVisibility(0);
        boolean z = liV.A08;
        igdsSwitch.setChecked(liV.A0A);
        if (z) {
            igdsSwitch.setClickable(false);
            AnonymousClass0fU.A00(liV.A00, jp7.A00);
        } else {
            if (liV.A07) {
                r0 = liV.A02;
            }
            igdsSwitch.A07 = r0;
        }
        View view = jp7.itemView;
        boolean z2 = liV.A07;
        view.setEnabled(z2);
        View view2 = jp7.itemView;
        float f = 0.5f;
        if (z2) {
            f = 1.0f;
        }
        view2.setAlpha(f);
    }

    public final Class modelClass() {
        return C64810LiV.class;
    }
}
