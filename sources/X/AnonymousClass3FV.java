package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: X.3FV  reason: invalid class name */
public final class AnonymousClass3FV {
    public static final AnonymousClass3FV A00 = new Object();
    public static final Set A01 = new HashSet();

    public static final long A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        ArrayList A04 = C280074zx.A00.A04(userSession);
        int size = A04.size() - 1;
        if (A04.isEmpty()) {
            return 0;
        }
        return ((Number) A04.get(size)).longValue();
    }

    public static final ArrayList A04(boolean z, boolean z2) {
        int[] A0C = A0C(true, z, z2);
        ArrayList arrayList = new ArrayList(7);
        int i = 0;
        do {
            arrayList.add(Double.valueOf((double) A0C[i]));
            i++;
        } while (i < 7);
        return 00k.A0U(arrayList);
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        HashMap hashMap = new HashMap();
        C269474fB r4 = C269474fB.A00;
        C268194cw r3 = new C268194cw(r4);
        r3.A0D(AnonymousClass000.A00(806), 1G0.A00());
        C268194cw r1 = new C268194cw(r4);
        r1.A0B(r3, AnonymousClass000.A00(187));
        hashMap.put("params", r1.toString());
        AnonymousClass3M3 A02 = C49891FBs.A02(new IgBloksScreenConfig((0lg) userSession), C46649DiU.A04("com.bloks.www.yp.familycenter.time_limit_extension_request", hashMap));
        if (fragmentActivity != null) {
            C309516Yo r12 = new C309516Yo(fragmentActivity, userSession);
            r12.A08();
            r12.A0C = "extension_request_fragment";
            r12.A0D(A02);
            r12.A0A = AnonymousClass000.A00(3172);
            r12.A04();
            0qQ.A0B(A02, 0);
            A01.add(A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0.booleanValue() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            X.16q r0 = r0.C31()
            r4 = 1
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.CR7()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342168755976549569(0x20810e13000034c1, double:4.070458647654732E-152)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0033
            if (r3 != 0) goto L_0x0033
            return r4
        L_0x0033:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FV.A07(com.instagram.common.session.UserSession):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0.booleanValue() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            X.16q r0 = r0.C31()
            r4 = 1
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.CR7()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342168755976549569(0x20810e13000034c1, double:4.070458647654732E-152)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FV.A08(com.instagram.common.session.UserSession):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0.booleanValue() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            X.16q r0 = r0.C31()
            r4 = 1
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.CaJ()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342168755976549569(0x20810e13000034c1, double:4.070458647654732E-152)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FV.A09(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A0A(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 2342168755976549569L);
    }

    public static final boolean A0B(UserSession userSession) {
        Boolean Cco;
        0qQ.A0B(userSession, 0);
        AnonymousClass16q C31 = 0eE.A00(userSession).A00().A03.C31();
        if (C31 == null || C31.Cco() == null || (Cco = C31.Cco()) == null || !Cco.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final int[] A0C(boolean z, boolean z2, boolean z3) {
        long j;
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        int offset = timeZone.getOffset(instance.getTimeInMillis());
        if (z3) {
            j = (long) (TimeZone.getTimeZone("America/Los_Angeles").getOffset(instance.getTimeInMillis()) - offset);
        } else {
            j = (long) offset;
        }
        long j2 = j / 1000;
        if (z2) {
            try {
                AnonymousClass2ML r8 = (AnonymousClass2ML) 2MJ.A01.A00.get();
                if (r8 != null) {
                    synchronized (r8) {
                        timeInAppControllerWrapper = r8.A00;
                    }
                    if (timeInAppControllerWrapper != null) {
                        iArr2 = timeInAppControllerWrapper.getDailyTimeInAppUtc(0, j2);
                    } else {
                        iArr2 = new int[0];
                    }
                } else {
                    iArr2 = new int[0];
                }
            } catch (Throwable unused) {
                0wb.A03("TimeInApp", "Failed to fetch DailyTimeInApp");
            }
        } else {
            iArr2 = 2MJ.A01.A03(0);
        }
        if (z) {
            int i = 1;
            while (true) {
                int length = iArr2.length;
                if (i > length || i > 7) {
                    break;
                }
                iArr[7 - i] = iArr2[length - i];
                i++;
            }
        }
        return iArr;
    }

    public static final long A00() {
        try {
            int[] A03 = 2MJ.A01.A03(A01());
            0qQ.A07(A03);
            int length = A03.length;
            if (length != 0) {
                return (long) A03[length - 1];
            }
            return 0;
        } catch (Throwable unused) {
            0wb.A03("TimeInApp", "Failed to fetch daily usage");
            return 0;
        }
    }

    public static final String A03() {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        try {
            AnonymousClass2ML r1 = (AnonymousClass2ML) 2MJ.A01.A00.get();
            if (r1 == null) {
                return "unknown_state";
            }
            synchronized (r1) {
                timeInAppControllerWrapper = r1.A00;
            }
            if (timeInAppControllerWrapper != null) {
                return timeInAppControllerWrapper.getCurrentState();
            }
            return "no_state";
        } catch (Throwable unused) {
            return "exception";
        }
    }

    public static final void A05() {
        for (Fragment fragment : A01) {
            if (fragment.isVisible()) {
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    activity.finish();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public static final long A01() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() / 1000;
    }
}
