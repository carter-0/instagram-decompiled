package X;

import android.content.Context;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import java.io.IOException;

/* renamed from: X.5yr  reason: invalid class name and case insensitive filesystem */
public abstract class C301285yr {
    public static volatile boolean A00;
    public static volatile boolean A01;

    public static final void A00(Context context, String str, C62320sa r3, C62320sa r4, 0sP r5) {
        try {
            r3.invoke();
            0dV.A06(context.getApplicationContext(), 0);
            0dV.A0C(str);
            r4.invoke();
        } catch (SoLoaderDSONotFoundError | IOException | Exception | UnsatisfiedLinkError e) {
            r5.invoke(e);
        }
    }
}
