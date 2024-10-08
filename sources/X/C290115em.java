package X;

import android.graphics.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5em  reason: invalid class name and case insensitive filesystem */
public abstract class C290115em {
    public static final AnonymousClass5VN A00 = new AnonymousClass5VN(0.0f, 0.0f, 10.0f, 10.0f);

    public static final String A03(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final C3022462f A01(AnonymousClass5SV r3) {
        0sP r1;
        ArrayList arrayList = new ArrayList();
        C290145ep r12 = (C290145ep) C285765So.A00(r3, C290125en.A08);
        if (r12 == null || (r1 = r12.A01) == null || !((Boolean) r1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C3022462f) arrayList.get(0);
    }

    public static final C52849Gdi A02(C305026Gd r3, int i) {
        Object obj;
        Iterator it = r3.A01.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass5R6) ((Map.Entry) obj).getKey()).A01 == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (C52849Gdi) entry.getValue();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [X.5db, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A0A == null) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.graphics.Region r14, android.graphics.Region r15, X.0yC r16, X.AnonymousClass5SX r17, X.AnonymousClass5SX r18) {
        /*
            r5 = r18
            X.5R6 r4 = r5.A04
            X.5SI r0 = r4.A0U
            X.5SJ r0 = r0.A0J
            boolean r0 = r0.A0E
            r2 = 1
            if (r0 == 0) goto L_0x0012
            X.4co r0 = r4.A0A
            r3 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            r10 = r14
            boolean r0 = r14.isEmpty()
            r7 = r17
            if (r0 == 0) goto L_0x0022
            int r1 = r5.A02
            int r0 = r7.A02
            if (r1 != r0) goto L_0x0028
        L_0x0022:
            if (r3 == 0) goto L_0x0029
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            X.5SV r1 = r5.A05
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0129
            X.4cW r0 = X.C290085ej.A01(r4)
            if (r0 == 0) goto L_0x0129
        L_0x0035:
            X.4cE r0 = (X.C267804cE) r0
            X.4cD r0 = (X.C267794cD) r0
            X.4cD r3 = r0.A03
            X.5Sb r0 = X.C290125en.A0A
            java.lang.Object r0 = X.C285765So.A00(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0045
            r1 = 1
        L_0x0045:
            X.4cD r0 = r3.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0125
            r0 = 8
            X.4cg r4 = X.AnonymousClass5WH.A04(r3, r0)
            if (r1 != 0) goto L_0x00ac
            X.4ch r0 = X.C289425dZ.A02(r4)
            X.5VN r6 = r0.CgV(r4, r2)
        L_0x005b:
            float r0 = r6.A01
            int r11 = java.lang.Math.round(r0)
            float r0 = r6.A03
            int r12 = java.lang.Math.round(r0)
            float r0 = r6.A02
            int r13 = java.lang.Math.round(r0)
            float r0 = r6.A00
            int r14 = java.lang.Math.round(r0)
            r15.set(r11, r12, r13, r14)
            int r4 = r5.A02
            int r0 = r7.A02
            r8 = -1
            if (r4 != r0) goto L_0x007e
            r4 = -1
        L_0x007e:
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            boolean r0 = r15.op(r10, r0)
            r6 = r16
            if (r0 == 0) goto L_0x0139
            android.graphics.Rect r1 = r15.getBounds()
            X.5ex r0 = new X.5ex
            r0.<init>(r1, r5)
            r6.A08(r4, r0)
            r0 = 0
            java.util.List r3 = r5.A08(r0, r2)
            int r1 = r3.size()
            int r1 = r1 - r2
        L_0x009e:
            if (r8 >= r1) goto L_0x012d
            java.lang.Object r0 = r3.get(r1)
            X.5SX r0 = (X.AnonymousClass5SX) r0
            A04(r10, r15, r6, r7, r0)
            int r1 = r1 + -1
            goto L_0x009e
        L_0x00ac:
            X.4cD r0 = r4.A0X()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0125
            X.4ch r3 = X.C289425dZ.A02(r4)
            X.5db r6 = r4.A02
            if (r6 != 0) goto L_0x00cc
            r0 = 0
            X.5db r6 = new X.5db
            r6.<init>()
            r6.A01 = r0
            r6.A03 = r0
            r6.A02 = r0
            r6.A00 = r0
            r4.A02 = r6
        L_0x00cc:
            long r0 = r4.A0T()
            long r8 = r4.A0U(r0)
            float r0 = X.C288025bF.A02(r8)
            float r0 = -r0
            r6.A01 = r0
            float r0 = X.C288025bF.A00(r8)
            float r0 = -r0
            r6.A03 = r0
            int r0 = r4.A0H()
            float r1 = (float) r0
            float r0 = X.C288025bF.A02(r8)
            float r1 = r1 + r0
            r6.A02 = r1
            int r0 = r4.A0G()
            float r1 = (float) r0
            float r0 = X.C288025bF.A00(r8)
            float r1 = r1 + r0
            r6.A00 = r1
        L_0x00fa:
            if (r4 == r3) goto L_0x0116
            r0 = 0
            r4.A0h(r6, r0, r2)
            float r1 = r6.A01
            float r0 = r6.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0125
            float r1 = r6.A03
            float r0 = r6.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0125
            X.4cg r4 = r4.A07
            X.0qQ.A0A(r4)
            goto L_0x00fa
        L_0x0116:
            float r4 = r6.A01
            float r3 = r6.A03
            float r1 = r6.A02
            float r0 = r6.A00
            X.5VN r6 = new X.5VN
            r6.<init>(r4, r3, r1, r0)
            goto L_0x005b
        L_0x0125:
            X.5VN r6 = X.AnonymousClass5VN.A04
            goto L_0x005b
        L_0x0129:
            X.4cD r0 = r5.A03
            goto L_0x0035
        L_0x012d:
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x0028
            android.graphics.Region$Op r15 = android.graphics.Region.Op.DIFFERENCE
            r10.op(r11, r12, r13, r14, r15)
            return
        L_0x0139:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x017c
            X.5SX r1 = r5.A07()
            if (r1 == 0) goto L_0x0179
            X.5R6 r0 = r1.A04
            if (r0 == 0) goto L_0x0179
            X.5SI r0 = r0.A0U
            X.5SJ r0 = r0.A0J
            boolean r0 = r0.A0E
            if (r0 != r2) goto L_0x0179
            X.5VN r1 = r1.A03()
        L_0x0153:
            float r0 = r1.A01
            int r7 = java.lang.Math.round(r0)
            float r0 = r1.A03
            int r3 = java.lang.Math.round(r0)
            float r0 = r1.A02
            int r2 = java.lang.Math.round(r0)
            float r0 = r1.A00
            int r0 = java.lang.Math.round(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r7, r3, r2, r0)
        L_0x0170:
            X.5ex r0 = new X.5ex
            r0.<init>(r1, r5)
            r6.A08(r4, r0)
            return
        L_0x0179:
            X.5VN r1 = A00
            goto L_0x0153
        L_0x017c:
            if (r4 != r8) goto L_0x0028
            android.graphics.Rect r1 = r15.getBounds()
            goto L_0x0170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290115em.A04(android.graphics.Region, android.graphics.Region, X.0yC, X.5SX, X.5SX):void");
    }

    public static final boolean A05(AnonymousClass5SX r1) {
        AnonymousClass5SV r12 = r1.A05;
        if (r12.A01) {
            return true;
        }
        Set<C285635Sb> keySet = r12.A02.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        for (C285635Sb r0 : keySet) {
            if (r0.A00) {
                return true;
            }
        }
        return false;
    }

    public static final 0yC A00(AnonymousClass5SP r6) {
        AnonymousClass5SX A002 = r6.A00();
        0yC r0 = AnonymousClass01P.A00;
        0yC r5 = new 0yC(6);
        AnonymousClass5R6 r1 = A002.A04;
        if (r1.A0U.A0J.A0E && r1.A0A != null) {
            AnonymousClass5VN A03 = A002.A03();
            A04(new Region(Math.round(A03.A01), Math.round(A03.A03), Math.round(A03.A02), Math.round(A03.A00)), new Region(), r5, A002, A002);
        }
        return r5;
    }
}
