package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EW  reason: invalid class name */
public final class AnonymousClass7EW implements C328007Db {
    public final AnonymousClass7Y2 A00;
    public final UserSession A01;
    public final C252063oV A02;

    public final void A01(N8L n8l) {
        C252063oV r0 = this.A02;
        r0.setVisibility(0);
        ImageView imageView = (ImageView) r0.getView();
        imageView.setBackgroundColor(n8l.A00);
        imageView.setImageTintList(ColorStateList.valueOf(n8l.A01));
        AnonymousClass0fU.A00(new C39998ANe(this, n8l), imageView);
    }

    public final void A00() {
        C252063oV r4 = this.A02;
        r4.setVisibility(8);
        if (!182.A06(0Tu.A05, this.A01, 36324677316849895L) || r4.CVM()) {
            r4.getView().setOnClickListener((View.OnClickListener) null);
        }
    }

    public final View BJd() {
        return this.A02.getView();
    }

    public AnonymousClass7EW(UserSession userSession, C252063oV r2, AnonymousClass7Y2 r3) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = userSession;
    }
}
