package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4F8  reason: invalid class name */
public abstract class AnonymousClass4F8 {
    public static final void A00(Drawable drawable, int i, int i2) {
        0qQ.A0B(drawable, 0);
        Rect bounds = drawable.getBounds();
        0qQ.A07(bounds);
        int i3 = bounds.left;
        int i4 = bounds.top;
        drawable.setBounds(i3, i4, i3 + i, i4 + i2);
        if (drawable instanceof AnonymousClass2Un) {
            ((AnonymousClass2Un) drawable).A02(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r0 == 2) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r0 == 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r12.equals(r1.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r9.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r10.A04 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r9.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r3 = X.C246033ds.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = (java.lang.Object[]) r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r1 >= r2) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r3[r1] == r12) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        r8 = (java.lang.Object[]) r6.A01;
        r7 = r11.A02;
        r6 = r8.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r1 >= r6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r8[r1] == r7) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        if (r11.A02.equals(r6.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r1 = r2.A01;
        r0 = r1.A00.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C246023dr r9, X.2Vi r10, X.2VR r11, X.C246053du r12) {
        /*
            r5 = 1
            X.0qQ.A0B(r10, r5)
            r4 = 2
            boolean r0 = r10 instanceof X.2Vl
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.2Vl r10 = (X.2Vl) r10
            java.util.ArrayList r2 = r10.A00
            X.0qQ.A07(r2)
            int r1 = r2.size()
        L_0x0015:
            if (r3 >= r1) goto L_0x0055
            java.lang.Object r0 = r2.get(r3)
            X.0qQ.A07(r0)
            X.2Vi r0 = (X.2Vi) r0
            A01(r9, r0, r11, r12)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0026:
            boolean r0 = r10 instanceof X.AnonymousClass4F5
            if (r0 == 0) goto L_0x00a6
            X.4F5 r10 = (X.AnonymousClass4F5) r10
            X.4F4 r2 = r10.A02
            X.4F0 r6 = r2.A00
            java.lang.Integer r0 = r6.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x008a;
                case 2: goto L_0x0068;
                case 3: goto L_0x009b;
                case 4: goto L_0x0079;
                default: goto L_0x0039;
            }
        L_0x0039:
            X.4F1 r1 = r2.A01
            java.lang.Integer r0 = r1.A00
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x0056
            if (r0 == r3) goto L_0x0059
            java.lang.Object r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0055
        L_0x004d:
            r9.A01 = r5
            X.4F3 r0 = r10.A04
            if (r0 == 0) goto L_0x0055
            r9.A00 = r10
        L_0x0055:
            return
        L_0x0056:
            X.3du[] r3 = X.C246033ds.A06
            goto L_0x005d
        L_0x0059:
            java.lang.Object r3 = r1.A01
            java.lang.Object[] r3 = (java.lang.Object[]) r3
        L_0x005d:
            int r2 = r3.length
            r1 = 0
        L_0x005f:
            if (r1 >= r2) goto L_0x0055
            r0 = r3[r1]
            if (r0 == r12) goto L_0x004d
            int r1 = r1 + 1
            goto L_0x005f
        L_0x0068:
            java.lang.String r1 = r10.A01
            java.lang.String r0 = r11.A01
            if (r1 == r0) goto L_0x0079
            if (r1 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0055
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0079
            return
        L_0x0079:
            java.lang.Object r8 = r6.A01
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.String r7 = r11.A02
            int r6 = r8.length
            r1 = 0
        L_0x0081:
            if (r1 >= r6) goto L_0x0055
            r0 = r8[r1]
            if (r0 == r7) goto L_0x0039
            int r1 = r1 + 1
            goto L_0x0081
        L_0x008a:
            java.lang.String r1 = r10.A01
            java.lang.String r0 = r11.A01
            if (r1 == r0) goto L_0x009b
            if (r1 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0055
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            return
        L_0x009b:
            java.lang.String r1 = r11.A02
            java.lang.Object r0 = r6.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0039
        L_0x00a6:
            boolean r0 = r10 instanceof X.C262564Ez
            if (r0 == 0) goto L_0x00c6
            X.4Ez r10 = (X.C262564Ez) r10
            r10.A00()
            java.util.ArrayList r2 = r10.A06
            int r1 = r2.size()
        L_0x00b5:
            if (r3 >= r1) goto L_0x0055
            java.lang.Object r0 = r2.get(r3)
            X.0qQ.A07(r0)
            X.2Vi r0 = (X.2Vi) r0
            A01(r9, r0, r11, r12)
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled transition type: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4F8.A01(X.3dr, X.2Vi, X.2VR, X.3du):void");
    }

    public static final void A02(2Vi r2, String str) {
        0qQ.A0B(r2, 0);
        if (r2 instanceof AnonymousClass4F5) {
            ((AnonymousClass4F5) r2).A01 = str;
        } else if (r2 instanceof 2Vl) {
            ArrayList arrayList = ((2Vl) r2).A00;
            0qQ.A07(arrayList);
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj = arrayList.get(size);
                    0qQ.A07(obj);
                    A02((2Vi) obj, str);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        } else if (r2 instanceof C262564Ez) {
            C262564Ez r22 = (C262564Ez) r2;
            r22.A00();
            ArrayList arrayList2 = r22.A06;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    ((AnonymousClass4F5) arrayList2.get(size2)).A01 = str;
                    if (i2 >= 0) {
                        size2 = i2;
                    } else {
                        return;
                    }
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled transition type: ");
            sb.append(r2);
            throw new RuntimeException(sb.toString());
        }
    }

    public static final void A03(2Vi r1, List list) {
        0qQ.A0B(r1, 0);
        if (r1 instanceof C262564Ez) {
            C262564Ez r12 = (C262564Ez) r1;
            r12.A00();
            ArrayList arrayList = r12.A06;
            0qQ.A07(arrayList);
            list.addAll(arrayList);
            return;
        }
        list.add(r1);
    }
}
