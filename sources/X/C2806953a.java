package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.53a  reason: invalid class name and case insensitive filesystem */
public abstract class C2806953a {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A00(Drawable drawable, C376689Iy r16, UserSession userSession, C253993rl r18, AnonymousClass53Y r19, AnonymousClass3W1 r20, String str, int i) {
        C376689Iy r7 = r16;
        0qQ.A0B(r7, 2);
        AnonymousClass53Y r8 = r19;
        0qQ.A0B(r8, 3);
        String str2 = str;
        0qQ.A0B(str2, 7);
        C253993rl r0 = r18;
        C252063oV r4 = r0.A0N;
        ImageView imageView = (ImageView) r4.getView();
        r0.A0I.setVisibility(8);
        imageView.setOnClickListener((View.OnClickListener) null);
        r4.setVisibility(0);
        C244083ac.A05(imageView, C244063aa.PROFILE_IMAGE);
        imageView.setImageDrawable(drawable);
        AnonymousClass3W1 r9 = r20;
        AnonymousClass0fU.A00(new C244023aW(userSession, (String) null, new C377409Ls(34, r9, r7), new AnonymousClass9MM(i, 3, r7, r8, r9), true), imageView);
        imageView.setOnTouchListener(new C2807053b(r7, r8, str2));
    }
}
