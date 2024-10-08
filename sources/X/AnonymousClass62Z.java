package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.62Z  reason: invalid class name */
public final class AnonymousClass62Z implements C291845hy {
    public final C286025Tq A00;
    public final List A01;
    public final List A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public AnonymousClass62Z(C286025Tq r32, AnonymousClass5Z4 r33, C286305Uu r34, C268024cd r35, List list) {
        String str;
        C286025Tq r9 = r32;
        this.A00 = r9;
        this.A02 = list;
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9L8(this, 37));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9L8(this, 36));
        AnonymousClass5Z4 r30 = r33;
        AnonymousClass5ZC r8 = r30.A00;
        C286025Tq r0 = C3021962a.A00;
        String str2 = r9.A00;
        int length = str2.length();
        0sn r12 = r9.A02;
        r12 = r12 == null ? 0sn.A00 : r12;
        ArrayList arrayList = new ArrayList();
        int size = r12.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C3022062b r02 = (C3022062b) r12.get(i);
            AnonymousClass5ZC r1 = (AnonymousClass5ZC) r02.A02;
            int i3 = r02.A01;
            int i4 = r02.A00;
            if (i3 != i2) {
                arrayList.add(new C3022062b(r8, i2, i3));
            }
            arrayList.add(new C3022062b(r8.A00(r1), i3, i4));
            i++;
            i2 = i4;
        }
        if (i2 != length) {
            arrayList.add(new C3022062b(r8, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C3022062b(r8, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C3022062b r122 = (C3022062b) arrayList.get(i5);
            int i6 = r122.A01;
            int i7 = r122.A00;
            if (i6 != i7) {
                str = str2.substring(i6, i7);
                0qQ.A07(str);
            } else {
                str = "";
            }
            C286025Tq r11 = new C286025Tq(str, C3021962a.A00(r9, i6, i7), (List) null, (List) null);
            AnonymousClass5ZC r123 = (AnonymousClass5ZC) r122.A02;
            if (r123.A03 == Integer.MIN_VALUE) {
                int i8 = r8.A03;
                r123 = new AnonymousClass5ZC(r123.A05, r123.A06, r123.A07, r123.A02, i8, r123.A01, r123.A00, r123.A04);
            }
            String str3 = r11.A00;
            AnonymousClass5Z4 r03 = new AnonymousClass5Z4(r8.A00(r123), r30.A02);
            0sn r13 = r11.A03;
            r13 = r13 == null ? 0sn.A00 : r13;
            List list2 = this.A02;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Object obj = list2.get(i9);
                C3022062b r04 = (C3022062b) obj;
                if (C3021962a.A02(i6, i7, r04.A01, r04.A00)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            for (int i10 = 0; i10 < size4; i10++) {
                C3022062b r14 = (C3022062b) arrayList3.get(i10);
                if (i6 > r14.A01 || r14.A00 > i7) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList4.add(new C3022062b(r14.A02, r14.A01 - i6, r14.A00 - i6));
            }
            arrayList2.add(new C3022162c(new C291835hx(r03, r34, r35, str3, r13, arrayList4), i6, i7));
        }
        this.A01 = arrayList2;
    }

    public final boolean BC8() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C3022162c) list.get(i)).A02.BC8()) {
                return true;
            }
        }
        return false;
    }

    public final float BP9() {
        return ((Number) this.A03.getValue()).floatValue();
    }

    public final float BT7() {
        return ((Number) this.A04.getValue()).floatValue();
    }
}
