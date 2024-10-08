package X;

import android.content.Context;
import android.widget.Toast;
import com.instagram.zero.main.IgZeroMain;

/* renamed from: X.3OC  reason: invalid class name */
public abstract class AnonymousClass3OC {
    public static OSR A00;

    public static final void A01(Context context) {
        if (A00 != null) {
            Toast.makeText(context, "Placeholder clicked", 0).show();
        }
    }

    public static final AnonymousClass0Ud A00() {
        IgZeroMain igZeroMain;
        OD7 od7;
        if (A00 == null || (igZeroMain = IgZeroMain.A08) == null || (od7 = igZeroMain.A02) == null) {
            return null;
        }
        return od7.A01;
    }

    public static final boolean A02() {
        IgZeroMain igZeroMain;
        Object obj;
        if (A00 != null && (igZeroMain = IgZeroMain.A08) != null && igZeroMain.A04 && igZeroMain.A05) {
            OD7 od7 = igZeroMain.A02;
            if (od7 != null) {
                obj = od7.A01.getValue();
            } else {
                obj = null;
            }
            if (obj != AnonymousClass3OD.FREE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A03() {
        boolean z;
        if (A00 == null) {
            return false;
        }
        IgZeroMain igZeroMain = IgZeroMain.A08;
        if (igZeroMain != null) {
            z = igZeroMain.A04;
        } else {
            z = false;
        }
        if (!z || igZeroMain == null || !igZeroMain.A05) {
            return false;
        }
        return true;
    }
}
