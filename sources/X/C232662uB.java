package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
public final class C232662uB implements C232672uC {
    public C231642s0 A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ AnonymousClass2u9 A03;

    public C232662uB(AnonymousClass2u9 r1) {
        this.A03 = r1;
    }

    public final void A7U(int i) {
        A7V(i, this.A01, this.A02);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3BZ, java.lang.Object] */
    public final void A7V(int i, Object obj, Object obj2) {
        int size;
        int i2;
        AnonymousClass3BZ r2;
        C376479Id r6;
        AnonymousClass2u9 r5 = this.A03;
        C231642s0 r7 = this.A00;
        int i3 = r5.A01;
        List list = r5.A05;
        boolean z = true;
        if (i3 < list.size()) {
            AnonymousClass3BZ r22 = (AnonymousClass3BZ) list.get(r5.A01);
            r22.A02 = obj;
            r22.A03 = obj2;
            r22.A01 = r7;
            r22.A00 = i;
            r22.A04 = true;
            size = r5.A01;
            i2 = size + 1;
            r2 = r22;
        } else if (r5.A01 == list.size()) {
            ? obj3 = new Object();
            obj3.A02 = obj;
            obj3.A03 = obj2;
            obj3.A01 = r7;
            obj3.A00 = i;
            obj3.A04 = true;
            list.add(obj3);
            size = list.size() - 1;
            i2 = r5.A01 + 1;
            r2 = obj3;
        } else {
            throw new RuntimeException("Adding new view model on invalid position");
        }
        r5.A01 = i2;
        C232642u8 r10 = r5.A02;
        if (r10 != null) {
            int i4 = r2.A00;
            Object obj4 = r2.A02;
            Object obj5 = r2.A03;
            C231642s0 r23 = r2.A01;
            boolean z2 = false;
            if (r23 instanceof C231652s1) {
                C231592rv r62 = C231592rv.A02[i4];
                if ((r62.A01 || r62 == C231592rv.COMPOSE_MEDIA_UFI) && (obj4 instanceof 1Xj) && (obj5 instanceof AnonymousClass3W1)) {
                    if (r62 == C231592rv.LITHO_MEDIA_HEADER || r62 == C231592rv.LITHO_COALESCED_HEADER || r62 == C231592rv.COMPOSE_MEDIA_UFI) {
                        z2 = true;
                    }
                    r6 = new C376479Id((1Xj) obj4, (C231652s1) r23, (AnonymousClass3W1) obj5, i4);
                }
            } else {
                AnonymousClass2u0 r63 = r10.A00;
                Set set = AnonymousClass2u0.A05;
                if (!r63.A03 || !(r23 instanceof C232482tn)) {
                    if ((r23 instanceof C231782sN) && (obj4 instanceof C274594oe) && (obj5 instanceof AnonymousClass5O4)) {
                        r6 = new C376479Id((C231782sN) r23, (C274594oe) obj4, (AnonymousClass5O4) obj5, i4);
                    }
                } else if ((obj4 instanceof C270464gm) && (obj5 instanceof GY3)) {
                    r6 = new C376479Id((C232482tn) r23, (C270464gm) obj4, (GY3) obj5, i4);
                }
                z2 = true;
            }
            AnonymousClass2u0 r24 = r10.A00;
            Set set2 = AnonymousClass2u0.A05;
            C232632u7 r8 = r24.A02;
            int i5 = r8.A04;
            if (size <= i5) {
                r8.A0A.clear();
                r8.A0B.clear();
                r8.A04 = 0;
                i5 = 0;
            }
            if (r8.A0C && z2) {
                r8.A0B.put(Integer.valueOf(i5), new int[]{i5, size - i5});
                r8.A04 = size;
            }
            r8.A0A.put(Integer.valueOf(size), r6);
            int i6 = r8.A03;
            int i7 = r8.A05;
            if ((size <= i7 && i6 <= size) || size <= r8.A06 || i7 == -1) {
                r6.A01(AnonymousClass05K.A0N);
            }
        }
        Map map = r5.A07;
        if (!map.containsKey(obj)) {
            map.put(obj, new int[]{r5.A01 - 1, 0});
        }
        int[] iArr = (int[]) map.get(obj);
        iArr[1] = iArr[1] + 1;
        if (!r5.A03) {
            z = false;
        }
        r5.A03 = z;
    }
}
