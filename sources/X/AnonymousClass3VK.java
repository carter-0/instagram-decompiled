package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VK  reason: invalid class name */
public final class AnonymousClass3VK implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();

    public final Integer A01(AnonymousClass0iw r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass3VM A002 = A00(r2);
        if (A002 != null) {
            return A002.A01;
        }
        return null;
    }

    public final Integer A02(AnonymousClass0iw r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass3VM A002 = A00(r2);
        if (A002 != null) {
            return A002.A02;
        }
        return null;
    }

    public final List A03(AnonymousClass0iw r4) {
        AnonymousClass3VM r0;
        0qQ.A0B(r4, 0);
        AnonymousClass3VL A002 = C271924jo.A00(r4);
        if (A002 == null || (r0 = (AnonymousClass3VM) this.A00.get(A002)) == null) {
            return 0sn.A00;
        }
        List list = r0.A04;
        return 00k.A0a(list.subList(r0.A00, list.size()));
    }

    public final List A04(AnonymousClass0iw r5, List list) {
        List<C52567GXs> list2;
        0qQ.A0B(r5, 0);
        AnonymousClass3VL A002 = C271924jo.A00(r5);
        if (A002 != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (list != null) {
                builder.addAll(list);
            }
            AnonymousClass3VM r0 = (AnonymousClass3VM) this.A00.get(A002);
            if (r0 != null) {
                List list3 = r0.A04;
                list2 = 00k.A0a(list3.subList(r0.A00, list3.size()));
            } else {
                list2 = 0sn.A00;
            }
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C52567GXs gXs : list2) {
                arrayList.add(C56321HwY.A00(gXs.A04));
            }
            builder.addAll(arrayList);
            ImmutableList build = builder.build();
            0qQ.A07(build);
            return build;
        } else if (list == null) {
            return 0sn.A00;
        } else {
            return list;
        }
    }

    public final void A07(C52567GXs gXs) {
        AnonymousClass3VL r3 = gXs.A00;
        Map map = this.A00;
        AnonymousClass3VM r0 = (AnonymousClass3VM) map.get(r3);
        if (r0 == null) {
            r0 = new AnonymousClass3VM(r3);
            map.put(r3, r0);
        }
        List list = r0.A04;
        String str = r0.A03;
        Integer num = gXs.A04;
        Integer num2 = gXs.A03;
        String str2 = gXs.A06;
        Integer num3 = gXs.A01;
        Integer num4 = gXs.A05;
        Integer num5 = gXs.A02;
        0qQ.A0B(r3, 0);
        0qQ.A0B(num, 1);
        list.add(new C52567GXs(r3, num, num2, num3, num4, num5, str, str2));
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    private final AnonymousClass3VM A00(AnonymousClass0iw r4) {
        AnonymousClass3VL A002 = C271924jo.A00(r4);
        if (A002 == null) {
            return null;
        }
        Map map = this.A00;
        AnonymousClass3VM r0 = (AnonymousClass3VM) map.get(A002);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3VM r02 = new AnonymousClass3VM(A002);
        map.put(A002, r02);
        return r02;
    }

    public final void A05(AnonymousClass0iw r2, Integer num) {
        AnonymousClass3VM A002 = A00(r2);
        if (A002 != null) {
            A002.A01 = num;
        }
    }

    public final void A06(AnonymousClass0iw r2, Integer num) {
        AnonymousClass3VM A002 = A00(r2);
        if (A002 != null) {
            A002.A02 = num;
        }
    }
}
