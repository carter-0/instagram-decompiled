package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.EGp  reason: case insensitive filesystem */
public final class C47778EGp extends C232232tF {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Dn7, X.3kE, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.auto_follow_back_system_setting_item_row, false);
        0qQ.A0B(A09, 1);
        ? r1 = new C249703kE(A09);
        r1.A00 = DbX.A0J(A09, R.id.icon);
        r1.A02 = AnonymousClass7TG.A0R(A09, R.id.title);
        r1.A01 = AnonymousClass7TG.A0R(A09, R.id.body);
        r1.A03 = (IgdsSwitch) AnonymousClass7TF.A0F(A09, R.id.switch_button);
        A09.setTag(r1);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C47242DtT dtT = (C47242DtT) r4;
        C46891Dn7 dn7 = (C46891Dn7) r5;
        AnonymousClass7TG.A1N(dtT, dn7);
        ImageView imageView = dn7.A00;
        DbU.A13(imageView.getContext(), imageView, dtT.A00);
        dn7.A02.setText(dtT.A03);
        dn7.A01.setText(dtT.A02);
        IgdsSwitch igdsSwitch = dn7.A03;
        igdsSwitch.setChecked(false);
        FQO.A00(igdsSwitch, dtT, 11);
    }

    public final Class modelClass() {
        return C47242DtT.class;
    }
}
