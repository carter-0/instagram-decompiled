package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Wnu  reason: case insensitive filesystem */
public final class C20255Wnu implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3D5 A01;

    public C20255Wnu(View view, AnonymousClass3D5 r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        AnonymousClass3D5 r4 = this.A01;
        ViewGroup viewGroup = r4.A06;
        View view = this.A00;
        if (viewGroup.indexOfChild(view) < 0) {
            view.setClickable(true);
            view.setVisibility(0);
            viewGroup.addView(view);
            r4.A02 = view;
            DbX.A1D(view, R.id.open_older_posts, 0);
        }
    }
}
