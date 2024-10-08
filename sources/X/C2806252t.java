package X;

import android.content.Context;
import androidx.cardview.widget.CardView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.52t  reason: invalid class name and case insensitive filesystem */
public final class C2806252t implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CardView A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ User A03;

    public C2806252t(Context context, CardView cardView, IgImageView igImageView, User user) {
        this.A01 = cardView;
        this.A03 = user;
        this.A02 = igImageView;
        this.A00 = context;
    }

    public final void run() {
        CardView cardView = this.A01;
        cardView.setPivotX(((float) cardView.getWidth()) / 2.0f);
        cardView.setPivotY((float) cardView.getHeight());
        C2806352u.A00(this.A00, cardView, this.A02, this.A03.B6o());
    }
}
