package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.process.asyncinit.AsyncColdStart$onApplicationInited$1$callback$1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MXu  reason: case insensitive filesystem */
public abstract class C66588MXu {
    public static boolean A00;
    public static boolean A01;
    public static final ConditionVariable A02 = new ConditionVariable(false);
    public static final List A03 = AnonymousClass7TE.A1C();
    public static final List A04 = AnonymousClass7TE.A1C();
    public static volatile C62320sa A05;

    public static final Bundle A00(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("async_app_init_recreate")) {
            return bundle;
        }
        return null;
    }

    public static final void A01() {
        A00 = true;
        AnonymousClass11V.A00 = true;
        11W.A05 = true;
        11Z.A00 = 11Y.A00;
    }

    public static final void A02() {
        A01 = true;
    }

    public static final void A04(Context context) {
        0qQ.A0B(context, 0);
        ConditionVariable conditionVariable = A02;
        synchronized (conditionVariable) {
            C62320sa r1 = A05;
            A05 = null;
            if (r1 == null || !(context instanceof Application)) {
                List<C62320sa> list = A04;
                for (C62320sa invoke : list) {
                    invoke.invoke();
                }
                list.clear();
            } else {
                r1.invoke();
                ((Application) context).registerActivityLifecycleCallbacks(new AsyncColdStart$onApplicationInited$1$callback$1(context));
            }
            11Z.A00 = null;
            conditionVariable.open();
            AnonymousClass7TF.A0D().post(new 2Wl(context));
        }
    }

    public static final void A03() {
        ConditionVariable conditionVariable = A02;
        long j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        if (!conditionVariable.block(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
            if (!conditionVariable.block(15000)) {
                j = 20000;
                conditionVariable.block();
            }
            AnonymousClass0YC.A00.markerGenerateWithAnnotations(25107982, 113, j, TimeUnit.MILLISECONDS, (Map) null);
        }
    }

    public static final void A05(C62320sa r3) {
        ConditionVariable conditionVariable = A02;
        synchronized (conditionVariable) {
            if (conditionVariable.block(-1)) {
                r3.invoke();
            } else {
                A04.add(r3);
            }
        }
    }

    public static final void A06(0sP r2) {
        List list = A03;
        synchronized (list) {
            list.add(r2);
        }
    }

    public static final boolean A07() {
        return A01;
    }

    public static final boolean A08() {
        return A02.block(-1);
    }

    public static final boolean A09() {
        return A00;
    }
}
