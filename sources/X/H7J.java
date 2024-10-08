package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.LinkedList;
import java.util.Queue;

public final class H7J extends C232222tE {
    public final int A00 = 8388661;
    public final AnonymousClass0iw A01;
    public final XBv A02;
    public final C14327Tu5 A03;
    public final C320576sb A04;
    public final Queue A05 = new LinkedList();

    /* JADX WARNING: type inference failed for: r1v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        HAY hay = (HAY) r8;
        HAO hao = (HAO) r9;
        AnonymousClass7TF.A1H(hay, hao);
        this.A03.A00(this.A02, hay, hay.A01, hao.A00, false);
        C63260Ku5.A00(hao, hay, this.A04, this.A05, this.A00);
        AnonymousClass0iw r2 = this.A01;
        0qQ.A0B(r2, 0);
        User user = hay.A02;
        if (user != null) {
            IgImageView igImageView = hao.A01;
            DbU.A1S(r2, igImageView, user);
            igImageView.setVisibility(0);
            return;
        }
        hao.A01.setVisibility(8);
    }

    public final Class modelClass() {
        return HAY.class;
    }

    public H7J(AnonymousClass0iw r2, XBv xBv, C14327Tu5 tu5, C320576sb r5) {
        this.A01 = r2;
        this.A03 = tu5;
        this.A04 = r5;
        this.A02 = xBv;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new HAO(C51973G9u.A0B(layoutInflater, viewGroup, R.layout.selectable_grid_item));
    }
}
