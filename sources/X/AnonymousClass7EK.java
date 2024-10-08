package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7EK  reason: invalid class name */
public final class AnonymousClass7EK implements C328007Db {
    public final C71662eb A00;
    public final AnonymousClass7XC A01;

    public final void A00(C3265777i r6) {
        C71662eb r0 = this.A00;
        r0.A03(0);
        ImageView imageView = (ImageView) r0.A01();
        imageView.setBackgroundColor(r6.A01);
        imageView.setImageTintList(ColorStateList.valueOf(r6.A02));
        AnonymousClass0fU.A00(new AnonymousClass76X(this, r6, new DirectMessageIdentifier(r6.A03, r6.A04, (String) null)), imageView);
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A00;
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

    public AnonymousClass7EK(C71662eb r1, AnonymousClass7XC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
