package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.Fue  reason: case insensitive filesystem */
public final class C51470Fue implements Runnable {
    public final /* synthetic */ C49652F0j A00;
    public final /* synthetic */ C49861FAb A01;
    public final /* synthetic */ User A02;

    public C51470Fue(C49652F0j f0j, C49861FAb fAb, User user) {
        this.A01 = fAb;
        this.A00 = f0j;
        this.A02 = user;
    }

    public final void run() {
        C49861FAb fAb = this.A01;
        ViewGroup viewGroup = fAb.A05;
        if (viewGroup != null) {
            IgImageView A0a = DbX.A0a(viewGroup, R.id.avatar_picture);
            ViewGroup viewGroup2 = fAb.A05;
            if (viewGroup2 != null) {
                TextView A0R = AnonymousClass7TG.A0R(viewGroup2, R.id.user_id);
                ViewGroup viewGroup3 = fAb.A05;
                if (viewGroup3 != null) {
                    TextView A0R2 = AnonymousClass7TG.A0R(viewGroup3, R.id.user_name);
                    C49652F0j f0j = this.A00;
                    A0a.setImageBitmap(f0j.A00);
                    A0a.setStrokeAlpha(A0a.A00);
                    Bitmap bitmap = f0j.A00;
                    User user = this.A02;
                    ImageUrl Bh3 = user.Bh3();
                    AnonymousClass0iw r1 = fAb.A08;
                    A0a.setImageDrawable(fAb.A00);
                    if (bitmap != null) {
                        A0a.setImageBitmap(bitmap);
                    } else {
                        A0a.setUrl(Bh3, r1);
                    }
                    DbU.A1H(A0R, user);
                    A0R2.setText(user.getFullName());
                    return;
                }
            }
        }
        0qQ.A0F("sceneRoot");
        throw AnonymousClass00P.createAndThrow();
    }
}
