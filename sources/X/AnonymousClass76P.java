package X;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

/* renamed from: X.76P  reason: invalid class name */
public final class AnonymousClass76P implements Runnable {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final /* synthetic */ AnonymousClass76O A02;

    public AnonymousClass76P(AnonymousClass76O r3) {
        this.A02 = r3;
    }

    public final void run() {
        C67065Mhg mhg;
        AnonymousClass76O r5 = this.A02;
        C3271779s r8 = r5.A01;
        if (r8 != null && r8.A01 < r8.A02.size()) {
            int min = Math.min(r8.A02.size(), r8.A01 + r8.A00);
            r8.A01 = min;
            SpannableStringBuilder append = new SpannableStringBuilder().append(00k.A0P(" ", "", "", r8.A02.subList(0, min), (0sP) null));
            if (r8.A01 < r8.A02.size()) {
                int size = r8.A02.size();
                int i = r8.A01;
                String A0P = 00k.A0P(" ", "", "", r8.A02.subList(i, Math.min(size, i + 15)), (0sP) null);
                SpannableStringBuilder append2 = append.append(" ");
                0qQ.A07(append2);
                int i2 = 0;
                if (((Boolean) r8.A04.A04.getValue()).booleanValue()) {
                    i2 = -3355444;
                }
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
                int length = append2.length();
                append2.append(A0P);
                append2.setSpan(foregroundColorSpan, length, append2.length(), 17);
            }
            AnonymousClass76O r2 = r8.A04;
            if (r2.A02 && (mhg = r2.A00) != null) {
                0qQ.A0A(append);
                mhg.A01(append, false);
            }
            0sP r0 = r2.A05;
            0qQ.A0A(append);
            r0.invoke(append);
        }
        C3271779s r02 = r5.A01;
        boolean z = true;
        if (r02 == null || r02.A01 >= r02.A02.size()) {
            z = false;
        }
        this.A00 = z;
        if (z) {
            this.A01.postDelayed(this, 100);
        }
    }
}
