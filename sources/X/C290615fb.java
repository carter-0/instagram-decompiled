package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5fb  reason: invalid class name and case insensitive filesystem */
public final class C290615fb implements C250853mA {
    public C290625fc A00;
    public final VpsEventCallback A01;

    public final void ASF(C256683wB r13) {
        C266164Xu r3;
        C256683wB r4;
        long j;
        int i;
        C257023wj r1;
        C290625fc r0 = this.A00;
        C257013wi r12 = r0.A00;
        if (r12 != null) {
            C256683wB r32 = r13;
            C291455hK.A00(r12, r0.A05, r32, r0.A07, -1, r0.A04, r0.A09, r0.A08, false, r0.A03);
            C257013wi r2 = r0.A00;
            if (r2 == null || (r4 = r2.A01) == null) {
                r3 = null;
            } else {
                String str = r4.A0N.A07;
                if (str == null || str.isEmpty()) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                Map map = r2.A07;
                if (!map.containsKey(str) || (r1 = (C257023wj) map.get(str)) == null) {
                    j = -1;
                    i = -1;
                } else {
                    j = r1.A02;
                    i = r1.A00;
                }
                HashMap hashMap = new HashMap();
                Map map2 = r0.A00.A07;
                String str2 = r4.A0N.A07;
                C257023wj r22 = (C257023wj) map2.get(str2);
                if (r22 != null) {
                    StringBuilder sb = new StringBuilder();
                    C257013wi.A00(r22, str2, sb);
                    sb.toString();
                }
                r0.A00.A01();
                r3 = new C266164Xu(r0.A00.A02(), hashMap, i, j);
            }
            r0.A01 = r3;
            r0.A00 = null;
        }
    }

    public final void A7k(C256963wd r2) {
        C257013wi r0 = this.A00.A00;
        if (r0 != null) {
            r0.A0I.add(r2);
        }
    }

    public final void A7l(AnonymousClass4U3 r2, String str) {
        C257013wi r0 = this.A00.A00;
        if (r0 != null) {
            r0.A03(r2, str);
        }
    }

    public final void A8a(String str, int i, long j, long j2, long j3, long j4) {
        C257013wi r0 = this.A00.A00;
        if (r0 != null) {
            r0.A04(str, i, j, j2, j3, j4);
        }
    }

    public final C290625fc AXf() {
        return this.A00;
    }

    public final void Ewd(C256683wB r24, C256683wB r25, C256683wB r26, String str, String str2, String str3, String str4, String str5, List list, C256683wB[] r33, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        C290625fc r0 = this.A00;
        C256683wB[] r11 = r33;
        List list2 = list;
        String str6 = str5;
        String str7 = str3;
        long j5 = j3;
        String str8 = str;
        long j6 = j2;
        C256683wB r3 = r25;
        long j7 = j;
        C256683wB r2 = r24;
        C256683wB r4 = r26;
        String str9 = str4;
        r0.A00 = new C257013wi(r2, r3, r4, str8, str7, str9, str6, r0.A02, list2, r11, f, i, j7, j6, j5, j4, z);
    }

    public C290615fb(VpsEventCallback vpsEventCallback, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        this.A01 = vpsEventCallback;
        this.A00 = new C290625fc(vpsEventCallback, str, str2, j, z, z2, z3);
    }
}
