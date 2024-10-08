package X;

import android.view.View;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.5jV  reason: invalid class name and case insensitive filesystem */
public final class C292775jV implements View.OnLongClickListener {
    public final /* synthetic */ C226062fZ A00;

    public C292775jV(C226062fZ r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        if (view instanceof C226242fw) {
            ((C226242fw) view).A09();
        }
        return InstagramMainActivity.A0T(this.A00.A08);
    }
}
