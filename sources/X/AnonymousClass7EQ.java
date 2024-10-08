package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EQ  reason: invalid class name */
public final class AnonymousClass7EQ implements C328007Db {
    public final C333107Xr A00;
    public final UserSession A01;
    public final C71662eb A02;

    public final void A01(NYV nyv) {
        C71662eb r0 = this.A02;
        r0.A03(0);
        ImageView imageView = (ImageView) r0.A01();
        imageView.setBackgroundColor(nyv.A00);
        imageView.setImageTintList(ColorStateList.valueOf(nyv.A01));
        imageView.setOnTouchListener(new C71432OkX(this, nyv));
    }

    public final void A00() {
        C71662eb r4 = this.A02;
        r4.A03(8);
        if (!182.A06(0Tu.A05, this.A01, 36324677316849895L) || r4.A00 != null) {
            r4.A01().setOnClickListener((View.OnClickListener) null);
        }
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A02;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EQ(UserSession userSession, C71662eb r2, C333107Xr r3) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = userSession;
    }
}
