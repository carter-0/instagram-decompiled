package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

/* renamed from: X.50n  reason: invalid class name */
public abstract class AnonymousClass50n {
    public static String A00(Context context, UserSession userSession, List list) {
        return A02(context, AnonymousClass0t1.A01.A01(userSession), list);
    }

    public static String A03(DirectShareTarget directShareTarget, AnonymousClass170 r4) {
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        if ((!(r0 instanceof AnonymousClass9HR) || directShareTarget.A0T) && directShareTarget.A04 == null) {
            if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1 && directShareTarget.A0R) {
                PendingRecipient pendingRecipient = (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0);
                boolean z = pendingRecipient.A0H;
                if (z || pendingRecipient.A01 == 1) {
                    String str = pendingRecipient.A0A;
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                } else if (A09(pendingRecipient.A0A, pendingRecipient.A0K, z)) {
                    return pendingRecipient.A0A;
                }
                return pendingRecipient.A0C;
            } else if (directShareTarget.A0T()) {
                return A07(r4);
            }
        }
        String str2 = directShareTarget.A0I;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String A01(Context context, AnonymousClass170 r6) {
        String fullName = r6.getFullName();
        String username = r6.getUsername();
        int BIW = r6.BIW();
        boolean CPm = r6.CPm();
        boolean COa = r6.COa();
        if (BIW != 0) {
            if (BIW != 1) {
                return null;
            }
            return context.getString(2131961885);
        } else if (!A09(fullName, CPm, COa) || username.equals(fullName)) {
            return null;
        } else {
            return username;
        }
    }

    public static String A02(Context context, AnonymousClass170 r9, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            r9 = (AnonymousClass170) list.get(0);
            if (size != 1) {
                String A04 = A04(r9);
                String A042 = A04((AnonymousClass170) list.get(1));
                if (list.size() == 2) {
                    return context.getString(2131975305, new Object[]{A04, A042});
                }
                int size2 = list.size() - 2;
                return context.getResources().getQuantityString(R.plurals.thread_title_x_y_and_n_others, size2, new Object[]{A04, A042, NumberFormat.getInstance(AnonymousClass1Q2.A02()).format((long) size2)});
            }
        }
        return A04(r9);
    }

    public static String A04(AnonymousClass170 r3) {
        String fullName = r3.getFullName();
        if (fullName == null || (r3.BIW() != 1 && !A09(fullName, r3.CPm(), r3.COa()))) {
            return r3.getUsername();
        }
        return fullName;
    }

    public static String A05(AnonymousClass170 r3) {
        String fullName = r3.getFullName();
        if (fullName == null || r3.BIW() != 1) {
            return r3.getUsername();
        }
        return fullName;
    }

    public static String A06(AnonymousClass170 r6) {
        String fullName = r6.getFullName();
        String username = r6.getUsername();
        int BIW = r6.BIW();
        boolean CPm = r6.CPm();
        boolean COa = r6.COa();
        if (BIW != 0 || !A09(fullName, CPm, COa) || username.equals(fullName)) {
            return null;
        }
        return username;
    }

    public static String A07(AnonymousClass177 r5) {
        String fullName = r5.getFullName();
        String username = r5.getUsername();
        boolean CPm = r5.CPm();
        boolean COa = r5.COa();
        if (fullName == null || fullName.isEmpty() || !A09(fullName, CPm, COa)) {
            return username;
        }
        return fullName;
    }

    public static String A08(AnonymousClass177 r2) {
        if (r2.BIW() != 1 || r2.getShortName() == null) {
            return A07(r2);
        }
        return r2.getShortName();
    }

    public static boolean A09(String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str != null && str.length() > 30) {
            return false;
        }
        if (!z || z2) {
            return true;
        }
        return false;
    }
}
