package X;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* renamed from: X.SQi  reason: case insensitive filesystem */
public final class C11373SQi {
    public C10559RuD A00;
    public final Context A01;
    public final TelephonyManager A02;

    public static SubscriptionInfo A00(C11373SQi sQi, int i) {
        SubscriptionManager from;
        Context context = sQi.A01;
        if (context.checkCallingOrSelfPermission(AnonymousClass000.A00(130)) != 0 || (from = SubscriptionManager.from(context)) == null) {
            return null;
        }
        return from.getActiveSubscriptionInfoForSimSlotIndex(i);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.RuD, java.lang.Object] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10559RuD A01(X.C11373SQi r9) {
        /*
            X.RuD r5 = r9.A00
            if (r5 != 0) goto L_0x006a
            android.content.Context r8 = r9.A01
            r6 = 1
            X.0qQ.A0B(r8, r6)
            X.RuD r5 = new X.RuD
            r5.<init>()
            r4 = 0
            java.lang.String r0 = "android.telephony.MultiSimTelephonyManager"
            java.lang.Class r7 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.reflect.Constructor[] r0 = r7.getConstructors()
            X.0sC r3 = X.0pe.A00(r0)
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r2 = r3.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r1 = r0.length
            r0 = 2
            if (r1 != r0) goto L_0x001e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{  }
            java.lang.Object r3 = r2.newInstance(r0)     // Catch:{  }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}     // Catch:{  }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{  }
            java.lang.String r1 = "getSubscriberInfo"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{  }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r1, r0)     // Catch:{  }
            r1.setAccessible(r6)     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{  }
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch:{  }
            r5.A00 = r0     // Catch:{  }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{  }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{  }
            r5.A01 = r0     // Catch:{  }
            r4 = 1
        L_0x0066:
            r5.A02 = r4
            r9.A00 = r5
        L_0x006a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11373SQi.A01(X.SQi):X.RuD");
    }

    public static boolean A02(String str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }

    public C11373SQi(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A02 = (TelephonyManager) applicationContext.getSystemService("phone");
    }
}
