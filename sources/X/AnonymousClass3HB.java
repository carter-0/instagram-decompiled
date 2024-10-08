package X;

import android.view.View;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.3HB  reason: invalid class name */
public final class AnonymousClass3HB implements View.OnLongClickListener {
    public final /* synthetic */ InstagramMainActivity A00;

    public AnonymousClass3HB(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    public final boolean onLongClick(View view) {
        C226242fw r1;
        InstagramMainActivity instagramMainActivity = this.A00;
        View view2 = ((2au) instagramMainActivity.A0k.getValue()).A01;
        if ((view2 instanceof C226242fw) && (r1 = (C226242fw) view2) != null) {
            r1.A09();
        }
        return InstagramMainActivity.A0T(instagramMainActivity);
    }
}
