package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5SX  reason: invalid class name */
public final class AnonymousClass5SX {
    public AnonymousClass5SX A00;
    public boolean A01;
    public final int A02;
    public final C267794cD A03;
    public final AnonymousClass5R6 A04;
    public final AnonymousClass5SV A05;
    public final boolean A06;

    private final void A02(List list) {
        0sn arrayList;
        if (this.A01) {
            arrayList = 0sn.A00;
        } else {
            arrayList = new ArrayList();
            A00(this.A04, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass5SX r1 = (AnonymousClass5SX) arrayList.get(i);
            if (r1.A06 && r1.A05.A01) {
                list.add(r1);
            } else if (!r1.A05.A00) {
                r1.A02(list);
            }
        }
    }

    private final void A01(AnonymousClass5SV r11) {
        0sn arrayList;
        if (!this.A05.A00) {
            if (this.A01) {
                arrayList = 0sn.A00;
            } else {
                arrayList = new ArrayList();
                A00(this.A04, arrayList);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass5SX r6 = (AnonymousClass5SX) arrayList.get(i);
                if (!r6.A06 || !r6.A05.A01) {
                    for (Map.Entry entry : r6.A05.A02.entrySet()) {
                        C285635Sb r4 = (C285635Sb) entry.getKey();
                        Object value = entry.getValue();
                        Map map = r11.A02;
                        Object obj = map.get(r4);
                        0qQ.A0C(r4, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = r4.A02.invoke(obj, value);
                        if (invoke != null) {
                            map.put(r4, invoke);
                        }
                    }
                    r6.A01(r11);
                }
            }
        }
    }

    public final C268054cg A05() {
        if (this.A01) {
            AnonymousClass5SX A07 = A07();
            if (A07 != null) {
                return A07.A05();
            }
            return null;
        }
        C267804cE A012 = C290085ej.A01(this.A04);
        if (A012 == null) {
            A012 = this.A03;
        }
        return AnonymousClass5WH.A04(A012, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A05.A01 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5SV A06() {
        /*
            r4 = this;
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x000b
            X.5SV r0 = r4.A05
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.5SV r3 = r4.A05
            if (r0 == 0) goto L_0x0028
            X.5SV r2 = new X.5SV
            r2.<init>()
            boolean r0 = r3.A01
            r2.A01 = r0
            boolean r0 = r3.A00
            r2.A00 = r0
            java.util.Map r1 = r2.A02
            java.util.Map r0 = r3.A02
            r1.putAll(r0)
            r3 = r2
            r4.A01(r2)
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SX.A06():X.5SV");
    }

    public final AnonymousClass5SX A07() {
        AnonymousClass5R6 r0;
        AnonymousClass5SX r02 = this.A00;
        if (r02 != null) {
            return r02;
        }
        boolean z = this.A06;
        if ((!z || (r0 = C290085ej.A00(this.A04, C58912Izb.A00)) == null) && (r0 = C290085ej.A00(this.A04, C290075ei.A00)) == null) {
            return null;
        }
        return C290085ej.A02(r0, z);
    }

    public final List A08(boolean z, boolean z2) {
        List list;
        String str;
        if (z || !this.A05.A00) {
            if (this.A06 && this.A05.A01) {
                ArrayList arrayList = new ArrayList();
                A02(arrayList);
                return arrayList;
            } else if (!this.A01) {
                ArrayList arrayList2 = new ArrayList();
                A00(this.A04, arrayList2);
                if (!z2) {
                    return arrayList2;
                }
                AnonymousClass5SV r6 = this.A05;
                Object A002 = C285765So.A00(r6, AnonymousClass5SZ.A0M);
                if (A002 != null && r6.A01 && (!arrayList2.isEmpty())) {
                    C377189Kw r0 = new C377189Kw(A002, 11);
                    AnonymousClass5SV r8 = new AnonymousClass5SV();
                    r8.A01 = false;
                    r8.A00 = false;
                    r0.invoke(r8);
                    AnonymousClass5SX r02 = new AnonymousClass5SX(new AnonymousClass6FT(r0), new AnonymousClass5R6(true, this.A02 + 1000000000), r8, false);
                    r02.A01 = true;
                    r02.A00 = this;
                    arrayList2.add(r02);
                }
                C285635Sb r1 = AnonymousClass5SZ.A02;
                if (!r6.A02.containsKey(r1) || !(!arrayList2.isEmpty()) || !r6.A01 || (list = (List) C285765So.A00(r6, r1)) == null || (str = (String) 00k.A0J(list)) == null) {
                    return arrayList2;
                }
                C377589Mk r03 = new C377589Mk(str, 1);
                AnonymousClass5SV r5 = new AnonymousClass5SV();
                r5.A01 = false;
                r5.A00 = false;
                r03.invoke(r5);
                AnonymousClass5SX r04 = new AnonymousClass5SX(new AnonymousClass6FT(r03), new AnonymousClass5R6(true, this.A02 + 2000000000), r5, false);
                r04.A01 = true;
                r04.A00 = this;
                arrayList2.add(0, r04);
                return arrayList2;
            }
        }
        return 0sn.A00;
    }

    public AnonymousClass5SX(C267794cD r2, AnonymousClass5R6 r3, AnonymousClass5SV r4, boolean z) {
        this.A03 = r2;
        this.A06 = z;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r3.A01;
    }

    private final void A00(AnonymousClass5R6 r6, List list) {
        C285045Pl A09 = r6.A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A09.A02;
            do {
                AnonymousClass5R6 r1 = (AnonymousClass5R6) objArr[i2];
                if (r1.A0A != null && !r1.A0L) {
                    if ((r1.A0W.A02.A00 & 8) != 0) {
                        list.add(C290085ej.A02(r1, this.A06));
                    } else {
                        A00(r1, list);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final AnonymousClass5VN A03() {
        C268054cg A052 = A05();
        if (A052 == null || !A052.COx()) {
            return AnonymousClass5VN.A04;
        }
        return C289425dZ.A02(A052).CgV(A052, true);
    }

    public final AnonymousClass5VN A04() {
        C268054cg A052 = A05();
        if (A052 == null || !A052.COx()) {
            return AnonymousClass5VN.A04;
        }
        return C289425dZ.A01(A052);
    }
}
