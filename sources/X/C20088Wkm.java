package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Wkm  reason: case insensitive filesystem */
public final class C20088Wkm implements Runnable {
    public final /* synthetic */ AnonymousClass3D5 A00;

    public C20088Wkm(AnonymousClass3D5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        boolean z;
        AnonymousClass3D5 r3 = this.A00;
        View view = r3.A02;
        if (view != null) {
            r3.A06.removeView(view);
            View view2 = r3.A02;
            0qQ.A0B(view2, 0);
            View findViewById = view2.findViewById(R.id.open_older_posts);
            AnonymousClass4ZI r0 = ((AnonymousClass2rI) r3.A07).A04;
            if (r0 != null) {
                z = r0.A02();
            } else {
                z = false;
            }
            if (findViewById != null && z) {
                findViewById.setVisibility(4);
            }
            r3.A02 = null;
        }
    }
}
