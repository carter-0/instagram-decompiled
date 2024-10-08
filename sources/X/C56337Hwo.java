package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hwo  reason: case insensitive filesystem */
public abstract class C56337Hwo {
    /* JADX WARNING: type inference failed for: r15v1, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r13, com.instagram.common.session.UserSession r14, com.instagram.common.typedurl.ImageUrl r15, com.instagram.model.reels.Reel r16, X.0sP r17) {
        /*
            r12 = 0
            r7 = r14
            r5 = r16
            java.util.List r4 = r5.A0O(r14)
            java.util.ArrayList r3 = X.DbV.A15(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r2.next()
            X.3uh r1 = (X.C255773uh) r1
            X.2O0 r0 = X.2O0.A00(r14)
            boolean r0 = r0.CaU(r5, r1)
            if (r0 != 0) goto L_0x0010
            X.0qQ.A0A(r1)
            r3.add(r1)
            goto L_0x0010
        L_0x002d:
            java.util.List r0 = A00(r4)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0039:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004b
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r2.add(r0)
            goto L_0x0039
        L_0x004b:
            java.util.List r0 = A00(r3)
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r5.add(r0)
            goto L_0x0057
        L_0x0069:
            int r0 = r5.size()
            r3 = 3
            if (r0 == r3) goto L_0x00b9
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            int r0 = r5.size()
            int r1 = 3 - r0
            int r0 = r2.size()
            if (r0 <= r1) goto L_0x0084
            java.util.List r2 = r2.subList(r12, r1)
        L_0x0084:
            java.util.Iterator r1 = r5.iterator()
        L_0x0088:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r1.next()
            r4.add(r0)
            goto L_0x0088
        L_0x0096:
            java.util.Iterator r2 = r2.iterator()
        L_0x009a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x009a
            r4.add(r1)
            goto L_0x009a
        L_0x00ae:
            int r0 = r4.size()
            if (r0 <= r3) goto L_0x00b8
            java.util.List r4 = r4.subList(r12, r3)
        L_0x00b8:
            r5 = r4
        L_0x00b9:
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r11 = r1.getDimensionPixelSize(r0)
            float r10 = (float) r11
            r0 = 1115684864(0x42800000, float:64.0)
            float r10 = r10 / r0
            X.IxV r6 = new X.IxV
            r8 = r15
            r9 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r4.addAll(r5)
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto L_0x00e3
            if (r15 == 0) goto L_0x0139
            r4.add(r15)
        L_0x00e3:
            X.0rk r15 = new X.0rk
            r15.<init>()
            r1 = 2
            r15.A00 = r1
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x0136
            r15.A00 = r3
            java.lang.String r5 = "THREE_FACES"
        L_0x00f5:
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00fe:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r3 = r4.next()
            int r2 = r12 + 1
            if (r12 >= 0) goto L_0x0114
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0114:
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            r13 = 14
            X.J6a r11 = new X.J6a
            r16 = r6
            r11.<init>((int) r12, (int) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16)
            X.1NK r1 = X.1NK.A00()
            java.lang.String r0 = "ROLL_CALL_FACEPILE"
            X.1OO r1 = r1.A0J(r3, r0)
            X.INN r0 = new X.INN
            r0.<init>(r5, r11, r10, r12)
            r1.A02(r0)
            r1.A01()
            r12 = r2
            goto L_0x00fe
        L_0x0136:
            java.lang.String r5 = "TWO_FACES"
            goto L_0x00f5
        L_0x0139:
            X.0wj r2 = X.0wj.A01
            r1 = 817896325(0x30c01b85, float:1.397766E-9)
            java.lang.String r0 = "Exception getting Candid cover image url"
            r2.AEf(r0, r1)
            goto L_0x00e3
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56337Hwo.A01(android.content.Context, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.model.reels.Reel, X.0sP):void");
    }

    public static final List A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = ((C255773uh) it.next()).A0i;
            if (user != null) {
                A1C.add(user);
            }
        }
        return 00k.A0d(00k.A0W(A1C), 3);
    }
}
