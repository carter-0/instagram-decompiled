package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.Fuf  reason: case insensitive filesystem */
public final class C51471Fuf implements Runnable {
    public final /* synthetic */ C49652F0j A00;
    public final /* synthetic */ C49861FAb A01;
    public final /* synthetic */ User A02;

    public C51471Fuf(C49652F0j f0j, C49861FAb fAb, User user) {
        this.A01 = fAb;
        this.A00 = f0j;
        this.A02 = user;
    }

    public final void run() {
        C49861FAb fAb = this.A01;
        ViewGroup viewGroup = fAb.A05;
        if (viewGroup != null) {
            IgImageView findViewById = viewGroup.findViewById(R.id.avatar_picture);
            if (findViewById != null) {
                IgImageView igImageView = findViewById;
                ViewGroup viewGroup2 = fAb.A05;
                if (viewGroup2 != null) {
                    IgImageView A0a = DbX.A0a(viewGroup2, R.id.small_avatar_picture);
                    ViewGroup viewGroup3 = fAb.A05;
                    if (viewGroup3 != null) {
                        TextView A0R = AnonymousClass7TG.A0R(viewGroup3, R.id.user_preview_id);
                        A0a.setStrokeAlpha(A0a.A00);
                        C49652F0j f0j = this.A00;
                        Bitmap bitmap = f0j.A00;
                        User user = this.A02;
                        ImageUrl Bh3 = user.Bh3();
                        AnonymousClass0iw r3 = fAb.A08;
                        igImageView.setImageDrawable(fAb.A00);
                        if (bitmap != null) {
                            igImageView.setImageBitmap(bitmap);
                        } else {
                            igImageView.setUrl(Bh3, r3);
                        }
                        Bitmap bitmap2 = f0j.A00;
                        ImageUrl Bh32 = user.Bh3();
                        A0a.setImageDrawable(fAb.A00);
                        if (bitmap2 != null) {
                            A0a.setImageBitmap(bitmap2);
                        } else {
                            A0a.setUrl(Bh32, r3);
                        }
                        DbU.A1H(A0R, user);
                        return;
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F("sceneRoot");
        throw AnonymousClass00P.createAndThrow();
    }
}
