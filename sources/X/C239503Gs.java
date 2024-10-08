package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Gs  reason: invalid class name and case insensitive filesystem */
public final class C239503Gs implements C239513Gt {
    public static final C239503Gs A00 = new Object();
    public static final 02m A01 = 02m.A0p;

    public static final void A00(int i, int i2) {
        if (((long) i2) >= Math.max(1AW.A01(0Tu.A05, 18587110923636955L), 500)) {
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5T("notification_controller_cache_oversized", true);
            AR4.apply();
        }
        02m r3 = A01;
        r3.markerAnnotate(813576146, i, "has_over_sized_cache", AnonymousClass0xl.A00(C61170le.A00).A00.getBoolean("notification_controller_cache_oversized", false));
        r3.markerAnnotate(813576146, i, "in_memory_cache_size", i2);
        r3.markerEnd(813576146, i, 2);
    }

    public final void EwV(Integer num, String str, int i, boolean z) {
        String str2;
        0qQ.A0B(num, 3);
        02m r3 = A01;
        r3.markerStart(813576146, i);
        r3.markerAnnotate(813576146, i, "category", str);
        r3.markerAnnotate(813576146, i, "is_direct", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str));
        r3.markerAnnotate(813576146, i, "is_cold_start", true);
        if (num.intValue() != 0) {
            str2 = "V2";
        } else {
            str2 = "V1";
        }
        r3.markerAnnotate(813576146, i, "controller_version", str2);
    }

    public final void Ez0(Collection collection, int i) {
        0qQ.A0B(collection, 1);
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((List) it.next()).size();
        }
        A00(i, i2);
    }

    public final void AUY(int i, String str) {
        02m r2 = A01;
        if (str == null) {
            str = "";
        }
        r2.markerAnnotate(813576146, i, "fail_reason", str);
        r2.markerEnd(813576146, i, 3);
    }

    public final void Ez1(C62320sa r2, int i) {
        A00(i, ((Number) r2.invoke()).intValue());
    }
}
