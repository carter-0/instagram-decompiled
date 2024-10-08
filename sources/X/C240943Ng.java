package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Ng  reason: invalid class name and case insensitive filesystem */
public abstract class C240943Ng {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r1, com.instagram.common.ui.widget.imageview.CircularImageView r2) {
        /*
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L_0x0016
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            boolean r0 = r0 instanceof X.AnonymousClass61R
            if (r0 != 0) goto L_0x0020
        L_0x0016:
            r0 = 2131886092(0x7f12000c, float:1.9406753E38)
            X.61R r0 = X.C303756Aq.A00(r1, r0)
            r2.setImageDrawable(r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240943Ng.A00(android.content.Context, com.instagram.common.ui.widget.imageview.CircularImageView):void");
    }

    public static final boolean A02(UserSession userSession, User user) {
        0qQ.A0B(user, 0);
        0qQ.A0B(userSession, 1);
        BirthdayVisibilityForViewer Afu = user.A03.Afu();
        if (Afu == null || Afu.ordinal() != 3) {
            return false;
        }
        return 182.A06(0Tu.A05, userSession, 36319510470335943L);
    }

    public static final void A01(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof AnonymousClass61R) {
                AnonymousClass61R r1 = (AnonymousClass61R) drawable;
                if (!r1.isPlaying()) {
                    r1.E2p();
                }
            }
            if (drawable instanceof C226462gr) {
                C226472gs r2 = (C226472gs) drawable;
                if (!r2.isPlaying()) {
                    r2.E2p();
                }
            }
        }
    }
}
