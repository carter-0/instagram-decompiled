package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.4EN  reason: invalid class name */
public abstract class AnonymousClass4EN {
    public static final String A03(2aX r2) {
        0qQ.A0B(r2, 0);
        String obj = r2.A03.toString();
        if (0qQ.A0K(obj, 2aD.A0f.toString()) || 0qQ.A0K(obj, 2aD.A0N.toString())) {
            return "FOLLOW_REQUESTS";
        }
        if (0qQ.A0K(obj, 2aD.A0V.toString())) {
            return "MAIN";
        }
        if (0qQ.A0K(obj, 2aD.A0I.toString())) {
            return "DIRECT";
        }
        if (0qQ.A0K(obj, 2aD.A0D.toString())) {
            return "BRANDED_CONTENT";
        }
        if (0qQ.A0K(obj, 2aD.A0Q.toString())) {
            return "HOME";
        }
        if (0qQ.A0K(obj, 2aD.A0R.toString())) {
            return "HORIZONTAL_ACCOUNT_SWITCHER";
        }
        if (0qQ.A0K(obj, 2aD.A0b.toString())) {
            return "PROFILE";
        }
        if (0qQ.A0K(obj, 2aD.A0o.toString())) {
            return "USERTAGS";
        }
        if (0qQ.A0K(obj, 2aD.A0p.toString())) {
            return "VERTICAL_ACCOUNT_SWITCHER";
        }
        if (0qQ.A0K(obj, 2aD.A09.toString())) {
            return "ACTIVITY_FEED";
        }
        return "UNKNOWN";
    }

    public static final AnonymousClass4EO A00(2aX r8, Set set) {
        LinkedHashMap linkedHashMap;
        boolean z;
        0bb r4 = new 0bb();
        r4.A05("badge_count", Long.valueOf((long) (r8.A01 + r8.A00)));
        List list = r8.A04;
        if (list != null) {
            ArrayList<2aX> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((2aX) next).A01 > 0) {
                    arrayList.add(next);
                }
            }
            int A0L = 0se.A0L(0Yv.A1E(arrayList, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            linkedHashMap = new LinkedHashMap(A0L);
            for (2aX r7 : arrayList) {
                C71062aE r6 = r7.A03;
                String upperCase = r6.BOD().toUpperCase(Locale.ROOT);
                0qQ.A07(upperCase);
                0bb r2 = new 0bb();
                r2.A05("badge_value", Long.valueOf((long) r7.A01));
                if (set != null) {
                    z = true;
                    if (set.contains(r6.toString())) {
                        r2.A03("is_toast_displayed", Boolean.valueOf(z));
                        linkedHashMap.put(upperCase, r2);
                    }
                }
                z = false;
                r2.A03("is_toast_displayed", Boolean.valueOf(z));
                linkedHashMap.put(upperCase, r2);
            }
        } else {
            linkedHashMap = null;
        }
        r4.A08("category_values", linkedHashMap);
        return r4;
    }

    public static final String A01(C226252fx r1) {
        if (r1 == null) {
            return "UNKNOWN";
        }
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return "DOT_BADGE";
        }
        if (ordinal == 0) {
            return "NUMBERED";
        }
        if (ordinal == 4) {
            return "LIST_ITEM";
        }
        if (ordinal == 5) {
            return "OS_SYSTEM_CAPPED";
        }
        if (ordinal == 3) {
            return "TOAST";
        }
        return "UNKNOWN";
    }

    public static final String A02(AnonymousClass2g1 r1) {
        if (r1 == null) {
            return "UNKNOWN";
        }
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return "TOP_NAVIGATION_BAR";
        }
        if (ordinal == 0) {
            return "BOTTOM_NAVIGATION_BAR";
        }
        if (ordinal == 11) {
            return "APP_ICON";
        }
        if (ordinal == 10) {
            return "PINNED_ROWS";
        }
        if (ordinal == 9) {
            return "BOTTOM_SHEET";
        }
        return "UNKNOWN";
    }
}
