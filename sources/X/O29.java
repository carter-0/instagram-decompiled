package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.instagram.android.R;

public abstract class O29 {
    public static final void A00(Activity activity, Window window) {
        View decorView = window.getDecorView();
        0qQ.A07(decorView);
        decorView.setSystemUiVisibility(768);
        int color = activity.getColor(R.color.fds_transparent);
        AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        2db.A02(activity, color);
        2db.A06(activity, true);
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
    }
}
