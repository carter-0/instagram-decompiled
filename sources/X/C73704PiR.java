package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.PiR  reason: case insensitive filesystem */
public final class C73704PiR extends 0Yg implements C62320sa {
    public static final C73704PiR A00 = new C73704PiR();

    public C73704PiR() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        DisplayMetrics displayMetrics;
        Resources system = Resources.getSystem();
        if (system == null || (displayMetrics = system.getDisplayMetrics()) == null) {
            i = 0;
        } else {
            i = displayMetrics.densityDpi;
        }
        return Integer.valueOf(i);
    }
}
