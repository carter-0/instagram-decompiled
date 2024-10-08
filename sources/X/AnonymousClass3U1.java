package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.3U1  reason: invalid class name */
public abstract class AnonymousClass3U1 {
    public abstract void A01(int i);

    public void A02(Typeface typeface) {
        AnonymousClass3U0 r4 = (AnonymousClass3U0) this;
        int i = r4.A00;
        if (i != -1) {
            boolean z = false;
            if ((r4.A01 & 2) != 0) {
                z = true;
            }
            typeface = Typeface.create(typeface, i, z);
        }
        C242413Ty r3 = r4.A02;
        WeakReference weakReference = r4.A03;
        if (r3.A0A) {
            r3.A02 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = r3.A01;
                if (isAttachedToWindow) {
                    textView.post(new C20315WpA(typeface, textView, r3, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public final void A00(int i) {
        new Handler(Looper.getMainLooper()).post(new AnonymousClass3U4(this, i));
    }

    public final void A03(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new C20117Wld(typeface, this));
    }
}
