package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: X.FFs  reason: case insensitive filesystem */
public final class C49939FFs {
    public final ActivityOptions A00;

    public static C49939FFs A01(Activity activity, AnonymousClass34S... r6) {
        int length = r6.length;
        Pair[] pairArr = new Pair[length];
        for (int i = 0; i < length; i++) {
            AnonymousClass34S r0 = r6[i];
            pairArr[i] = Pair.create(r0.A00, r0.A01);
        }
        return new C49939FFs(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static C49939FFs A00(Activity activity, View view) {
        return new C49939FFs(ActivityOptions.makeSceneTransitionAnimation(activity, view, AnonymousClass000.A00(5053)));
    }

    public final Bundle A02() {
        return this.A00.toBundle();
    }

    public C49939FFs(ActivityOptions activityOptions) {
        this.A00 = activityOptions;
    }

    public C49939FFs() {
    }
}
