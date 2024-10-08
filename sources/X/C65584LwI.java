package X;

import android.app.Activity;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.LwI  reason: case insensitive filesystem */
public final class C65584LwI implements C66455MSj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C316026kz A01;
    public final /* synthetic */ AnonymousClass6Z0 A02;
    public final /* synthetic */ String A03;

    public C65584LwI(Activity activity, C316026kz r2, AnonymousClass6Z0 r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = str;
    }

    public final void DUs() {
        AnonymousClass6Z0 r1 = this.A02;
        r1.A0U.EHd();
        View C18 = this.A01.C18();
        if (C18 != null) {
            Activity activity = this.A00;
            String str = this.A03;
            C314496iM r4 = r1.A08;
            if (r4 != null) {
                DisplayMetrics displayMetrics = C18.getResources().getDisplayMetrics();
                RectF rectF = 0nA.A01;
                r4.A02(activity, new AnonymousClass9UE(C18, 0, (int) TypedValue.applyDimension(1, -26.0f, displayMetrics), true), str, true);
            }
        }
    }
}
