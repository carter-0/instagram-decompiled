package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.instagram.user.model.User;

/* renamed from: X.IDn  reason: case insensitive filesystem */
public final class C56816IDn implements View.OnTouchListener {
    public final /* synthetic */ C308586Uv A00;
    public final /* synthetic */ User A01;

    public C56816IDn(C308586Uv r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public static void A00(Drawable drawable, C308586Uv r2, User user, AnonymousClass0eM r4) {
        ((ImageView) r4.getValue()).setImageDrawable(drawable);
        ((View) r4.getValue()).setOnTouchListener(new C56816IDn(r2, user));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        0sK r2 = this.A00.A04;
        if (r2 != null) {
            C51967G9n.A1M(this.A01, Integer.valueOf(rawX), r2, rawY);
        }
        view.performClick();
        return true;
    }
}
