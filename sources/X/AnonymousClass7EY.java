package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7EY  reason: invalid class name */
public final class AnonymousClass7EY implements C328007Db {
    public final C252063oV A00;
    public final C333027Xj A01;

    public final void A00(N8I n8i) {
        C252063oV r0 = this.A00;
        r0.setVisibility(0);
        ImageView imageView = (ImageView) r0.getView();
        imageView.setVisibility(0);
        imageView.setBackgroundColor(n8i.A00);
        imageView.setImageTintList(ColorStateList.valueOf(n8i.A01));
        AnonymousClass0fU.A00(new C71311OiH(this, n8i), imageView);
    }

    public final View BJd() {
        return this.A00.getView();
    }

    public AnonymousClass7EY(C252063oV r1, C333027Xj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
