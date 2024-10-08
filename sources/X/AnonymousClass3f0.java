package X;

import android.content.res.Resources;
import com.instagram.android.R;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;
import org.webrtc.CameraCapturer;

/* renamed from: X.3f0  reason: invalid class name */
public abstract class AnonymousClass3f0 {
    public static final String A00(Resources resources, int i) {
        0qQ.A0B(resources, 0);
        String quantityString = resources.getQuantityString(R.plurals.number_of_likes, i, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format((long) i)});
        0qQ.A07(quantityString);
        return quantityString;
    }

    public static final String A01(Resources resources, Integer num) {
        int intValue;
        0qQ.A0B(resources, 0);
        if (num == null || (intValue = num.intValue()) < 0) {
            throw new UnsupportedOperationException(AnonymousClass000.A00(420));
        }
        String quantityString = resources.getQuantityString(R.plurals.number_of_views, intValue, new Object[]{C253673rC.A04(resources, num, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)});
        0qQ.A0A(quantityString);
        return quantityString;
    }

    public static final String A02(Resources resources, Integer num) {
        int intValue;
        String quantityString;
        0qQ.A0B(resources, 0);
        if (num == null || (intValue = num.intValue()) < 0) {
            throw new UnsupportedOperationException(AnonymousClass000.A00(420));
        }
        if (intValue == 0) {
            quantityString = resources.getString(2131968411);
        } else {
            quantityString = resources.getQuantityString(R.plurals.number_of_plays, intValue, new Object[]{NumberFormat.getInstance().format(num)});
        }
        0qQ.A0A(quantityString);
        return quantityString;
    }

    public static final String A03(Resources resources, Integer num, int i) {
        int intValue;
        String quantityString;
        0qQ.A0B(resources, 1);
        if (num == null || (intValue = num.intValue()) < 0) {
            throw new UnsupportedOperationException(AnonymousClass000.A00(420));
        }
        if (intValue == 0) {
            quantityString = resources.getString(i);
        } else {
            quantityString = resources.getQuantityString(R.plurals.number_of_views, intValue, new Object[]{NumberFormat.getInstance().format(num)});
        }
        0qQ.A0A(quantityString);
        return quantityString;
    }

    public static final boolean A04(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        Collection A0C = C229632nm.A0C(0, length);
        if (!(A0C instanceof Collection) || !A0C.isEmpty()) {
            0sh it = A0C.iterator();
            while (it.hasNext()) {
                if (!Character.isDigit(str.charAt(it.A00()))) {
                    return false;
                }
            }
        }
        return true;
    }
}
