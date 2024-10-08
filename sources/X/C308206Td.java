package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.6Td  reason: invalid class name and case insensitive filesystem */
public abstract class C308206Td {
    public static final Fragment A00(C307786Rm r1) {
        0qQ.A0B(r1, 0);
        return (Fragment) r1.A00(R.id.bloks_ig_fragment);
    }

    public static final FragmentActivity A03(C307786Rm r1) {
        0qQ.A0B(r1, 0);
        return (FragmentActivity) r1.A00(R.id.bloks_ig_fragment_activity);
    }

    public static final FragmentActivity A04(C307896Rx r1) {
        0qQ.A0B(r1, 0);
        return A03(A09(r1));
    }

    public static final AnonymousClass0iw A07(C307786Rm r1) {
        0qQ.A0B(r1, 0);
        return (AnonymousClass0iw) r1.A00(R.id.bloks_ig_analytics_module);
    }

    public static final AnonymousClass0iw A08(C307896Rx r1) {
        0qQ.A0B(r1, 0);
        return A07(A09(r1));
    }

    public static final C307786Rm A09(C307896Rx r1) {
        0qQ.A0B(r1, 0);
        C307786Rm r0 = r1.A03;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final 0lg A0A(C307786Rm r1) {
        0qQ.A0B(r1, 0);
        return (0lg) r1.A00(R.id.bloks_ig_session);
    }

    public static final 0lg A0B(C307896Rx r1) {
        0qQ.A0B(r1, 0);
        return A0A(A09(r1));
    }

    public static final 2el A0D(C307786Rm r2) {
        0qQ.A0B(r2, 0);
        return (2el) r2.A01.get(R.id.bloks_viewpoint_manager);
    }

    public static final Object A0E(C307896Rx r6, C277014uI r7, Object... objArr) {
        int i = 0;
        0qQ.A0B(r6, 0);
        if (r7 == null) {
            return null;
        }
        C308276Tl r5 = new C308276Tl();
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i++;
            r5.A03(objArr[i2], i3);
            i2++;
            i3 = i;
        }
        return C299275ur.A00(r6, new AnonymousClass6Tm(r5.A00), r7);
    }

    public static final String A0G(Object obj) {
        0qQ.A0B(obj, 0);
        if ((obj instanceof Number) || !(obj instanceof Boolean)) {
            return obj.toString();
        }
        if (((Boolean) obj).booleanValue()) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        return "0";
    }

    public static final HashMap A0H(Map map) {
        String A0G;
        0qQ.A0B(map, 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String A0G2 = A0G(key);
            if (value == null) {
                A0G = null;
            } else {
                A0G = A0G(value);
            }
            hashMap.put(A0G2, A0G);
        }
        return hashMap;
    }

    public static final void A0I(C307786Rm r1, C252243on r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass4DJ A00 = A00(r1);
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        A00.registerLifecycleListener(r2);
    }

    public static final void A0J(C307786Rm r1, C252243on r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass4DJ A00 = A00(r1);
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        A00.unregisterLifecycleListener(r2);
    }

    public static final Fragment A01(C307896Rx r0) {
        return A00(A09(r0));
    }

    public static final Fragment A02(C307896Rx r1) {
        return (Fragment) A09(r1).A01.get(R.id.bloks_ig_fragment);
    }

    public static final 0hq A05(C307896Rx r1) {
        return (0hq) A09(r1).A00(R.id.bloks_ig_fragment_manager);
    }

    public static final C229382nI A06(C307896Rx r0) {
        return (C229382nI) A09(r0).A02;
    }

    public static final AnonymousClass4D6 A0C(C307896Rx r1) {
        return (AnonymousClass4D6) A09(r1).A00(R.id.bloks_ig_scheduler);
    }

    @Deprecated(level = C16705V2i.WARNING, message = "Read your object from the environment directly", replaceWith = @ReplaceWith(expression = "environment.get(id)", imports = {}))
    public static final Object A0F(C307896Rx r1, Class cls, int i) {
        return cls.cast(((SparseArray) A09(r1).A00(R.id.bloks_ig_object_store_deprecated)).get(i));
    }

    public static final void A0K(C307896Rx r0, C252243on r1) {
        A0I(A09(r0), r1);
    }

    public static final void A0L(C307896Rx r0, C252243on r1) {
        A0J(A09(r0), r1);
    }
}
