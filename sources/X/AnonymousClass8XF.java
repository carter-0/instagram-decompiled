package X;

import android.content.Context;
import kotlin.Deprecated;

@Deprecated(message = "This class has been deprecated, to access the width and height use the TargetViewSizeProvider\n directly.")
/* renamed from: X.8XF  reason: invalid class name */
public abstract class AnonymousClass8XF {
    public static final int A01(Context context) {
        0qQ.A0B(context, 0);
        if (C226122ff.A03()) {
            return C226132fh.A01(context).getWidth();
        }
        0kD.A07(002.A0R("TargetViewSizeUtil", "#getScreenWidth"), AnonymousClass000.A00(126), (Throwable) null);
        return 0nA.A09(context);
    }

    public static final int A00(Context context) {
        if (C226122ff.A03()) {
            return C226132fh.A01(context).getHeight();
        }
        0kD.A07(002.A0R("TargetViewSizeUtil", "#getScreenHeight"), AnonymousClass000.A00(126), (Throwable) null);
        return 0nA.A08(context);
    }
}
