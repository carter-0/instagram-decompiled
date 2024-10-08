package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4FF  reason: invalid class name */
public final class AnonymousClass4FF implements AnonymousClass4FG {
    public final ArrayList A00 = new ArrayList();
    public final /* synthetic */ 2Vn A01;

    public AnonymousClass4FF(2Vn r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass4FF r15, X.C2811456b r16) {
        /*
            X.2Vn r9 = r15.A01
            java.util.Map r1 = r9.A0A
            r0 = r16
            java.lang.Object r14 = r1.remove(r0)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x019b
            int r13 = r14.size()
            r12 = 0
        L_0x0013:
            if (r12 >= r13) goto L_0x0165
            java.lang.Object r1 = r14.get(r12)
            X.56X r1 = (X.AnonymousClass56X) r1
            X.2VR r11 = r1.A00
            X.2Vp r10 = r9.A02
            java.util.Map r0 = r10.A02
            java.lang.Object r8 = r0.get(r11)
            X.4FK r8 = (X.AnonymousClass4FK) r8
            X.3du r7 = r1.A01
            int r0 = r8.A00
            r4 = 2
            r5 = 1
            r3 = 0
            if (r0 != r4) goto L_0x0031
            r3 = 1
        L_0x0031:
            java.lang.String r2 = "Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there."
            java.util.Map r0 = r8.A07
            java.lang.Object r1 = r0.get(r7)
            X.56W r1 = (X.AnonymousClass56W) r1
            if (r3 == 0) goto L_0x0094
            if (r1 == 0) goto L_0x0159
            int r0 = r1.A00
            int r0 = r0 - r5
            r1.A00 = r0
            int r0 = r8.A00
            if (r0 != r4) goto L_0x0151
            java.util.Map r0 = r8.A07
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r1.next()
            X.56W r0 = (X.AnonymousClass56W) r0
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0052
        L_0x0062:
            int r12 = r12 + 1
            goto L_0x0013
        L_0x0065:
            X.2VS r0 = r8.A02
            if (r0 == 0) goto L_0x00cd
            java.util.Map r0 = r8.A07
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0073:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r6 = r7.next()
            X.3du r6 = (X.C246053du) r6
            X.2VS r4 = r8.A02
            short r3 = r4.A00
            r2 = 0
        L_0x0084:
            if (r2 >= r3) goto L_0x0073
            int r1 = r4.A01(r2)
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r1]
            r6.EHt(r0)
            int r2 = r2 + 1
            goto L_0x0084
        L_0x0094:
            if (r1 == 0) goto L_0x015f
            int r0 = r1.A00
            int r0 = r0 - r5
            r1.A00 = r0
            if (r0 > 0) goto L_0x0062
            java.util.Map r0 = r8.A07
            r0.remove(r7)
            boolean r15 = r0.isEmpty()
            X.2VS r0 = r8.A02
            if (r0 == 0) goto L_0x00cb
            X.2VS r0 = r8.A03
            java.lang.Object r0 = r0.A02()
            X.2VT r0 = (X.AnonymousClass2VT) r0
            float r6 = r7.AWv(r0)
            X.2VS r4 = r8.A02
            short r3 = r4.A00
            r2 = 0
        L_0x00bb:
            if (r2 >= r3) goto L_0x00cb
            int r1 = r4.A01(r2)
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r1]
            r7.ENI(r0, r6)
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00cb:
            if (r15 == 0) goto L_0x0062
        L_0x00cd:
            X.2VS r0 = r8.A02
            if (r0 == 0) goto L_0x00d6
            X.2VS r0 = r8.A02
            X.2Vn.A05(r0, r9, r5)
        L_0x00d6:
            X.4FE r7 = r9.A06
            if (r7 == 0) goto L_0x00eb
            X.3dR r6 = r7.A00
            java.util.Map r0 = r6.A09
            java.lang.Object r1 = r0.remove(r11)
            X.2VS r1 = (X.2VS) r1
            if (r1 == 0) goto L_0x00f3
            X.3dQ r0 = r7.A01
            X.2VZ.A03(r1, r0)
        L_0x00eb:
            r10.A00(r11)
            X.2Vn.A07(r8)
            goto L_0x0062
        L_0x00f3:
            java.util.HashSet r0 = r6.A07
            boolean r0 = r0.remove(r11)
            if (r0 != 0) goto L_0x011e
            X.3dQ r0 = r7.A01
            java.lang.Object r0 = r0.A02
            X.3dR r0 = (X.C245763dR) r0
            java.lang.String r2 = r0.A06
            if (r2 == 0) goto L_0x011e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Ending animation for id "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " but it wasn't recorded as animating!"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r2, r0)
        L_0x011e:
            X.2T4 r0 = r6.A02
            if (r0 == 0) goto L_0x00eb
            r5 = 0
            X.0qQ.A0B(r11, r5)
            java.util.Map r0 = r0.A0Y
            java.lang.Object r4 = r0.get(r11)
            X.2VS r4 = (X.2VS) r4
            if (r4 == 0) goto L_0x00eb
            short r3 = r4.A00
            r2 = 0
        L_0x0133:
            if (r2 >= r3) goto L_0x00eb
            X.2T4 r15 = r6.A02
            int r1 = r4.A01(r2)
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r1]
            X.2VT r0 = (X.AnonymousClass2VT) r0
            long r0 = r0.A01
            int r15 = r15.A00(r0)
            X.3dQ r1 = r7.A01
            X.2T4 r0 = r6.A02
            X.2VZ.A02(r0, r1, r15, r5)
            int r2 = r2 + 1
            goto L_0x0133
        L_0x0151:
            java.lang.String r1 = "This should only be checked for disappearing animations"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L_0x015f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L_0x0165:
            X.01s r4 = r9.A01
            int r0 = r16.hashCode()
            java.lang.Object r2 = X.AnonymousClass01t.A00(r4, r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x019b
            X.3kJ r1 = r9.A07
            int r0 = r16.hashCode()
            r1.ASH(r2, r0)
            int r2 = r16.hashCode()
            int[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.01u.A00(r1, r0, r2)
            if (r3 < 0) goto L_0x019b
            java.lang.Object[] r2 = r4.A03
            r1 = r2[r3]
            java.lang.Object r0 = X.AnonymousClass01t.A00
            if (r1 == r0) goto L_0x019b
            r2[r3] = r0
            r0 = 1
            r4.A01 = r0
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4FF.A00(X.4FF, X.56b):void");
    }

    private void A01(C2811456b r7) {
        ArrayList arrayList = this.A00;
        r7.A0A(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass56Y r5 = (AnonymousClass56Y) arrayList.get(i);
            AnonymousClass4FK r0 = (AnonymousClass4FK) this.A01.A02.A02.get(r5.A01.A00);
            if (r0 != null) {
                AnonymousClass56W r1 = (AnonymousClass56W) r0.A07.get(r5.A01.A01);
                r1.A04 = Float.valueOf(r5.A00);
                r1.A02 = r7;
            }
        }
        arrayList.clear();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.HQR] */
    public final void DFb(C2811456b r5) {
        2Vn r2 = this.A01;
        List<AnonymousClass56X> list = (List) r2.A0A.get(r5);
        if (!(list == null || r2.A06 == null)) {
            for (AnonymousClass56X r0 : list) {
                2Sh r22 = (2Sh) r5.A00;
                if (r22 != null) {
                    C246053du r1 = r0.A01;
                    ? obj = new Object();
                    obj.A00 = r1;
                    r22.call(new Object[]{obj});
                }
            }
        }
        A00(this, r5);
    }

    public final boolean EtU(C2811456b r8) {
        AnonymousClass56W r0;
        Float f;
        ArrayList arrayList = this.A00;
        r8.A0A(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            AnonymousClass56Y r5 = (AnonymousClass56Y) arrayList.get(i);
            AnonymousClass4FK r02 = (AnonymousClass4FK) this.A01.A02.A02.get(r5.A01.A00);
            if (r02 == null || (r0 = (AnonymousClass56W) r02.A07.get(r5.A01.A01)) == null || !(!z || (f = r0.A03) == null || f.floatValue() == r5.A00)) {
                z = false;
            }
        }
        arrayList.clear();
        return z;
    }

    public final void E0R(C2811456b r5) {
        A01(r5);
        2Vn r3 = this.A01;
        String str = (String) AnonymousClass01t.A00(r3.A01, r5.hashCode());
        if (!TextUtils.isEmpty(str)) {
            r3.A07.ADF(str, r5.hashCode());
        }
    }

    public final void D0d(C2811456b r1) {
        A00(this, r1);
    }

    public final void Dgv(C2811456b r1) {
        A01(r1);
    }
}
