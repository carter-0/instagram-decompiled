package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Mqw  reason: case insensitive filesystem */
public final /* synthetic */ class C67624Mqw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;

    public /* synthetic */ C67624Mqw(Activity activity, int i) {
        this.A01 = activity;
        this.A00 = i;
    }

    public final void run() {
        Activity activity = this.A01;
        int i = this.A00;
        View findViewById = activity.findViewById(R.id.layout_container_center_right_coordinator_layout);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i);
        }
    }
}
