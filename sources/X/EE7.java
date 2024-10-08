package X;

import android.app.Activity;

public final class EE7 extends C252233om {
    public final Activity A00;

    public final void onDestroy() {
        Activity activity = this.A00;
        if (activity instanceof AnonymousClass2ZP) {
            0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) activity).Enj(0);
        }
    }

    public final void onResume() {
        Activity activity = this.A00;
        if (activity instanceof AnonymousClass2ZP) {
            0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((AnonymousClass2ZP) activity).Enj(8);
        }
    }

    public EE7(Activity activity) {
        this.A00 = activity;
    }
}
