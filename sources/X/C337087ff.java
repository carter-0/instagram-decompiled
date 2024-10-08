package X;

import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.7ff  reason: invalid class name and case insensitive filesystem */
public abstract class C337087ff {
    public static final StringBuilder A00 = new StringBuilder();

    public static final SimpleImageUrl A00(UserSession userSession, C317486nL r10, int i) {
        int i2;
        SimpleImageUrl simpleImageUrl;
        0qQ.A0B(userSession, 2);
        int i3 = r10.A00;
        if (i3 < 0) {
            i2 = -1;
        } else {
            i2 = i3 / 6;
        }
        if (i2 >= 0) {
            int i4 = i2 * 6;
            C336957fS r7 = C317486nL.A04;
            int min = Math.min(i4 + 6, r7.A07(userSession).length) - i4;
            if (min >= 0) {
                String[] strArr = new String[min];
                for (int i5 = 0; i5 < min; i5++) {
                    strArr[i5] = r7.A07(userSession)[i4 + i5].A02;
                }
                C239023El r2 = new C239023El(",");
                Iterator it = Arrays.asList(strArr).iterator();
                StringBuilder sb = new StringBuilder();
                r2.A03(sb, it);
                String obj = sb.toString();
                StringBuilder sb2 = A00;
                synchronized (sb2) {
                    sb2.setLength(0);
                    sb2.append("emoji-sprite-sheet:/");
                    sb2.append("emoji-sprite-sheet-api");
                    sb2.append(Build.VERSION.SDK_INT);
                    sb2.append("-");
                    sb2.append(obj.hashCode());
                    sb2.append("-dpi-");
                    sb2.append(i);
                    sb2.append("//");
                    sb2.append(6);
                    sb2.append("//");
                    sb2.append(obj);
                    simpleImageUrl = new SimpleImageUrl(sb2.toString());
                }
                return simpleImageUrl;
            }
        }
        return null;
    }
}
