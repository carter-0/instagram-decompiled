package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;

/* renamed from: X.M9i  reason: case insensitive filesystem */
public final class C66049M9i implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ AnonymousClass6V5 A02;
    public final /* synthetic */ User A03;

    public C66049M9i(Drawable drawable, C255773uh r2, AnonymousClass6V5 r3, User user) {
        this.A00 = drawable;
        this.A03 = user;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        User user;
        if (this.A00 != null && (user = this.A03) != null) {
            C64113LOb lOb = this.A01.A0E;
            lOb.getClass();
            AnonymousClass0eM r1 = this.A02.A04;
            lOb.A00(new SuperlativeMentionSticker(FCP.A00((IgImageView) r1.getValue()), user, AnonymousClass7TE.A0c(r1).getRotation(), 1.0f, 12));
        }
    }
}
