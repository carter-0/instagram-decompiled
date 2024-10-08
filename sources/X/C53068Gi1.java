package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Gi1  reason: case insensitive filesystem */
public final class C53068Gi1 extends 2Rw {
    public final UserSession A00;
    public final C67161MjJ A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r10, int i) {
        IgLinearLayout igLinearLayout;
        View.OnClickListener iCx;
        C53153GjP gjP = (C53153GjP) r10;
        0qQ.A0B(gjP, 0);
        C55830HoD hoD = (C55830HoD) this.A02.get(i);
        UserSession userSession = this.A00;
        C67161MjJ mjJ = this.A01;
        0qQ.A0B(hoD, 0);
        gjP.A00.setText(hoD.A02);
        gjP.A02.setImageResource(hoD.A00);
        IgImageView igImageView = gjP.A03;
        int i2 = hoD.A01;
        igImageView.setImageResource(i2);
        C58208IoC ioC = new C58208IoC(42, mjJ, gjP, hoD, userSession);
        View view = gjP.itemView;
        if (i2 == R.drawable.instagram_x_pano_filled_12) {
            view.setBackgroundResource(R.drawable.twinbox_filter_background_selected);
            igLinearLayout = gjP.A01;
            iCx = new C71395Oju(mjJ, 64);
        } else {
            view.setBackgroundResource(R.drawable.twinbox_filter_background);
            igLinearLayout = gjP.A01;
            iCx = new C56800ICx(ioC, 45);
        }
        AnonymousClass0fU.A00(iCx, igLinearLayout);
        C56800ICx.A00(gjP.itemView, 46, ioC);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53153GjP(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.twinbox_filter_item, false));
    }

    public C53068Gi1(UserSession userSession, C67161MjJ mjJ) {
        this.A00 = userSession;
        this.A01 = mjJ;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(791442142);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(360966750, A03);
        return size;
    }
}
