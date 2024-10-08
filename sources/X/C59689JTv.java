package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

/* renamed from: X.JTv  reason: case insensitive filesystem */
public abstract class C59689JTv {
    public static Toast A00;
    public static WeakReference A01;

    public static final C60071Jf4 A02(Context context, CharSequence charSequence, String str, int i) {
        C60071Jf4 jf4 = null;
        if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            0KC.A0E(Pxd.A00(509), "The toast should be created on main thread");
        } else {
            if (!(context instanceof Activity)) {
                if (context != null) {
                    context = context.getApplicationContext();
                    if (context == null) {
                        return null;
                    }
                }
            }
            if (charSequence != null && A0H(context)) {
                if (str != null) {
                    1xC.A01.A00(new AnonymousClass3GQ(charSequence.toString(), str));
                    1Jk r5 = 1Jk.A08;
                    StringBuilder A0d = JTQ.A0d(charSequence);
                    A0d.append(':');
                    String A0l = AnonymousClass7TF.A0l(str, A0d);
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("toast: ");
                    A1A.append(charSequence);
                    A1A.append(", cat: ");
                    r5.A0L(A0l, AnonymousClass7TF.A0l(str, A1A), 1Jk.A00().A01);
                }
                jf4 = C60071Jf4.A01.A00(context, charSequence, i);
                if (Build.VERSION.SDK_INT < 30) {
                    jf4.setGravity(17, 0, 0);
                    return jf4;
                }
            }
        }
        return jf4;
    }

    public static final void A04(Context context) {
        A01(context, (String) null, 2131974093, 0);
    }

    public static final void A06(Context context, int i) {
        A01(context, (String) null, i, 1);
    }

    public static final void A07(Context context, int i) {
        A01(context, (String) null, i, 0);
    }

    public static final void A08(Context context, int i, int i2) {
        A01(context, (String) null, i, i2);
    }

    public static final void A09(Context context, CharSequence charSequence) {
        A03(context, charSequence, (String) null, 0);
    }

    public static final void A0F(Context context, String str, int i) {
        A01(context, str, i, 0);
    }

    public static final Toast A01(Context context, String str, int i, int i2) {
        if (context == null || !A0H(context)) {
            return null;
        }
        return A03(context, context.getString(i), str, i2);
    }

    public static final C60071Jf4 A03(Context context, CharSequence charSequence, String str, int i) {
        boolean z;
        Toast toast;
        UserSession userSession;
        C59679JTk jTk = C62916KoU.A00;
        if (jTk == null || (userSession = jTk.A00.A00) == null) {
            z = false;
        } else {
            z = DbY.A1Y(0Tu.A05, userSession, 36326017345992147L);
        }
        C60071Jf4 jf4 = null;
        Toast toast2 = A00;
        if (z) {
            if (toast2 != null) {
                toast2.cancel();
            }
            A00 = null;
            WeakReference weakReference = A01;
            if (!(weakReference == null || (toast = (Toast) weakReference.get()) == null)) {
                toast.cancel();
            }
        } else if (toast2 != null) {
            toast2.cancel();
        }
        C60071Jf4 A02 = A02(context, charSequence, str, i);
        if (A02 != null) {
            A02.show();
            jf4 = A02;
        }
        if (z) {
            A01 = C51965G9l.A0v(jf4);
            return jf4;
        }
        A00 = jf4;
        return jf4;
    }

    @Deprecated(message = "Please refrain from using this unless you are trying to display a toast beyond fragment/activity detach")
    public static final void A0G(CharSequence charSequence) {
        A09(C60960kU.A00, charSequence);
    }

    public static final boolean A0H(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            }
            return true;
        } else if (context != null) {
            return true;
        } else {
            return false;
        }
    }

    public static final Toast A00(Context context, CharSequence charSequence, String str, int i) {
        return A03(context, charSequence, str, i);
    }

    public static final void A05(Context context) {
        A07(context, 2131974093);
    }

    public static final void A0A(Context context, String str) {
        A01(context, str, 2131961740, 0);
    }

    public static final void A0B(Context context, String str) {
        A01(context, str, 2131974093, 0);
    }

    public static final void A0C(Context context, String str) {
        A01(context, str, 2131975944, 0);
    }

    public static final void A0D(Context context, String str) {
        A01(context, str, 2131972232, 0);
    }

    public static final void A0E(Context context, String str) {
        A01(context, str, 2131968258, 0);
    }
}
