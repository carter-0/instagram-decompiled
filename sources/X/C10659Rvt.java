package X;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: X.Rvt  reason: case insensitive filesystem */
public final class C10659Rvt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    public C10659Rvt(ActivityManager activityManager, Context context, DisplayMetrics displayMetrics, float f) {
        this.A03 = context;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.A00 = i;
        float f2 = 0.4f;
        int A05 = AnonymousClass7TE.A05((float) (activityManager.getMemoryClass() * 1024 * 1024), activityManager.isLowRamDevice() ? 0.33f : f2);
        float f3 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int A052 = AnonymousClass7TE.A05(f, f3);
        int A053 = AnonymousClass7TE.A05(f3, 2.0f);
        int i2 = A05 - i;
        if (A053 + A052 <= i2) {
            this.A02 = A053;
        } else {
            float f4 = ((float) i2) / (f + 2.0f);
            this.A02 = AnonymousClass7TE.A05(2.0f, f4);
            A052 = AnonymousClass7TE.A05(f4, f);
        }
        this.A01 = A052;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(this.A03, (long) this.A02);
            Formatter.formatFileSize(this.A03, (long) this.A01);
            Formatter.formatFileSize(this.A03, (long) i);
            Formatter.formatFileSize(this.A03, (long) A05);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
