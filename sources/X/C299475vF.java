package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.5vF  reason: invalid class name and case insensitive filesystem */
public abstract class C299475vF {
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.9IG] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.GpK] */
    /* JADX WARNING: type inference failed for: r1v11, types: [X.9IG] */
    /* JADX WARNING: type inference failed for: r4v10, types: [X.6BZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018e A[Catch:{ all -> 0x019c, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass62O A01(android.content.Context r23, X.AnonymousClass0iw r24, X.AnonymousClass62P r25) {
        /*
            r6 = 0
            r0 = 3
            r4 = r25
            X.0qQ.A0B(r4, r0)
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0017
            r1 = 1031284930(0x3d7828c2, float:0.060585745)
            java.lang.String r0 = "TifuPostHelper.createPreparedRows"
            X.0fS.A01(r0, r1)
        L_0x0017:
            java.lang.Object r0 = X.00k.A0J(r4)     // Catch:{ all -> 0x01bb }
            X.5vQ r0 = (X.C299575vQ) r0     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0199
            X.5vJ r0 = r0.Be5()     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = r0.A03     // Catch:{ all -> 0x01bb }
        L_0x0025:
            r0 = 2131953622(0x7f1307d6, float:1.954372E38)
            r7 = r23
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x01bb }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x01bb }
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.2Yu.A0F(r7, r0)     // Catch:{ all -> 0x01bb }
            long r2 = (long) r0     // Catch:{ all -> 0x01bb }
            r0 = 32
            long r2 = r2 << r0
            long r0 = X.AnonymousClass5RW.A01     // Catch:{ all -> 0x01bb }
            r9 = 10
            int r0 = X.0Yv.A1E(r4, r9)     // Catch:{ all -> 0x01bb }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x01bb }
            r8.<init>(r0)     // Catch:{ all -> 0x01bb }
            java.util.Iterator r15 = r4.iterator()     // Catch:{ all -> 0x01bb }
        L_0x004d:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r10 = r15.next()     // Catch:{ all -> 0x01bb }
            X.5vQ r10 = (X.C299575vQ) r10     // Catch:{ all -> 0x01bb }
            X.0qQ.A0B(r10, r9)     // Catch:{ all -> 0x01bb }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x006a
            r1 = 185617365(0xb104bd5, float:2.779044E-32)
            java.lang.String r0 = "FeedPostRowPreparer.onPrepareFeedItemRow"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x01bb }
        L_0x006a:
            boolean r0 = r10 instanceof X.C299565vP     // Catch:{ all -> 0x019c }
            r1 = 0
            if (r0 == 0) goto L_0x00a5
            X.5vP r10 = (X.C299565vP) r10     // Catch:{ all -> 0x019c }
            com.instagram.common.typedurl.ImageUrl r12 = r10.A06     // Catch:{ all -> 0x019c }
            if (r12 == 0) goto L_0x008d
            X.1NK r4 = X.1NK.A00()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r24.getModuleName()     // Catch:{ all -> 0x019c }
            X.1OO r4 = r4.A0J(r12, r0)     // Catch:{ all -> 0x019c }
            r0 = 1
            r4.A0F = r0     // Catch:{ all -> 0x019c }
            r4.A0J = r0     // Catch:{ all -> 0x019c }
            X.2iF r0 = r4.A00()     // Catch:{ all -> 0x019c }
            r0.E5t()     // Catch:{ all -> 0x019c }
        L_0x008d:
            X.6BY r11 = new X.6BY     // Catch:{ all -> 0x019c }
            r11.<init>(r12)     // Catch:{ all -> 0x019c }
            java.lang.Double r0 = r10.A08     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x009e
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x019c }
            java.lang.String r1 = X.1G0.A04(r7, r0)     // Catch:{ all -> 0x019c }
        L_0x009e:
            X.6BZ r4 = new X.6BZ     // Catch:{ all -> 0x019c }
            r4.<init>(r11, r1)     // Catch:{ all -> 0x019c }
            goto L_0x0187
        L_0x00a5:
            boolean r0 = r10 instanceof X.C299605vT     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x00ed
            X.5vT r10 = (X.C299605vT) r10     // Catch:{ all -> 0x019c }
            X.5vJ r0 = r10.A01     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x019c }
            X.5vK r1 = r10.A02     // Catch:{ all -> 0x019c }
            X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x019c }
            X.0qQ.A0B(r1, r6)     // Catch:{ all -> 0x019c }
            boolean r0 = X.AnonymousClass9JJ.A00(r6, r1)     // Catch:{ all -> 0x019c }
            r10 = 0
            if (r0 == 0) goto L_0x00e0
            X.9JJ r1 = (X.AnonymousClass9JJ) r1     // Catch:{ all -> 0x019c }
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r10 = r1.A04     // Catch:{ all -> 0x019c }
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10     // Catch:{ all -> 0x019c }
            if (r10 == 0) goto L_0x00e0
            X.1NK r1 = X.1NK.A00()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r24.getModuleName()     // Catch:{ all -> 0x019c }
            X.1OO r1 = r1.A0J(r10, r0)     // Catch:{ all -> 0x019c }
            r0 = 1
            r1.A0F = r0     // Catch:{ all -> 0x019c }
            r1.A0J = r0     // Catch:{ all -> 0x019c }
            X.2iF r0 = r1.A00()     // Catch:{ all -> 0x019c }
            r0.E5t()     // Catch:{ all -> 0x019c }
        L_0x00e0:
            X.6BY r4 = new X.6BY     // Catch:{ all -> 0x019c }
            r4.<init>(r10)     // Catch:{ all -> 0x019c }
            r0 = 2
            X.9IG r1 = new X.9IG     // Catch:{ all -> 0x019c }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x019c }
            goto L_0x0188
        L_0x00ed:
            boolean r0 = r10 instanceof X.C303856Bb     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x0168
            X.6Bb r10 = (X.C303856Bb) r10     // Catch:{ all -> 0x019c }
            X.5vJ r0 = r10.A01     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x019c }
            boolean r14 = X.0qQ.A0K(r0, r5)     // Catch:{ all -> 0x019c }
            X.62P r11 = r10.A03     // Catch:{ all -> 0x019c }
            int r0 = X.0Yv.A1E(r11, r9)     // Catch:{ all -> 0x019c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x019c }
            r10.<init>(r0)     // Catch:{ all -> 0x019c }
            java.util.Iterator r13 = r11.iterator()     // Catch:{ all -> 0x019c }
        L_0x010a:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x015e
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x019c }
            X.5vK r12 = (X.C299515vK) r12     // Catch:{ all -> 0x019c }
            if (r14 == 0) goto L_0x0129
            java.lang.String r1 = r12.getId()     // Catch:{ all -> 0x019c }
            java.lang.Object r0 = X.00k.A0I(r11)     // Catch:{ all -> 0x019c }
            X.5vK r0 = (X.C299515vK) r0     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x019c }
            X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x019c }
        L_0x0129:
            X.0qQ.A0B(r12, r6)     // Catch:{ all -> 0x019c }
            boolean r0 = X.AnonymousClass9JJ.A00(r6, r12)     // Catch:{ all -> 0x019c }
            r4 = 0
            if (r0 == 0) goto L_0x0155
            X.9JJ r12 = (X.AnonymousClass9JJ) r12     // Catch:{ all -> 0x019c }
            if (r12 == 0) goto L_0x0155
            java.lang.Object r4 = r12.A04     // Catch:{ all -> 0x019c }
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4     // Catch:{ all -> 0x019c }
            if (r4 == 0) goto L_0x0155
            X.1NK r1 = X.1NK.A00()     // Catch:{ all -> 0x019c }
            java.lang.String r0 = r24.getModuleName()     // Catch:{ all -> 0x019c }
            X.1OO r1 = r1.A0J(r4, r0)     // Catch:{ all -> 0x019c }
            r0 = 1
            r1.A0F = r0     // Catch:{ all -> 0x019c }
            r1.A0J = r0     // Catch:{ all -> 0x019c }
            X.2iF r0 = r1.A00()     // Catch:{ all -> 0x019c }
            r0.E5t()     // Catch:{ all -> 0x019c }
        L_0x0155:
            X.6BY r0 = new X.6BY     // Catch:{ all -> 0x019c }
            r0.<init>(r4)     // Catch:{ all -> 0x019c }
            r10.add(r0)     // Catch:{ all -> 0x019c }
            goto L_0x010a
        L_0x015e:
            X.62O r0 = X.AnonymousClass62Q.A03(r10)     // Catch:{ all -> 0x019c }
            X.GpK r4 = new X.GpK     // Catch:{ all -> 0x019c }
            r4.<init>(r0)     // Catch:{ all -> 0x019c }
            goto L_0x0187
        L_0x0168:
            boolean r0 = r10 instanceof X.C299595vS     // Catch:{ all -> 0x019c }
            if (r0 == 0) goto L_0x0188
            X.5vS r10 = (X.C299595vS) r10     // Catch:{ all -> 0x019c }
            java.lang.String r4 = r10.A07     // Catch:{ all -> 0x019c }
            X.5vk r1 = r10.A06     // Catch:{ all -> 0x019c }
            boolean r0 = r10.A0A     // Catch:{ all -> 0x019c }
            r19 = r1
            r20 = r4
            r21 = r2
            r23 = r0
            r18 = r7
            X.5Tq r0 = X.C303866Bc.A00(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x019c }
            X.9IG r4 = new X.9IG     // Catch:{ all -> 0x019c }
            r4.<init>(r0, r6)     // Catch:{ all -> 0x019c }
        L_0x0187:
            r1 = r4
        L_0x0188:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0194
            r0 = 867712261(0x33b83d05, float:8.579267E-8)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01bb }
        L_0x0194:
            r8.add(r1)     // Catch:{ all -> 0x01bb }
            goto L_0x004d
        L_0x0199:
            r5 = 0
            goto L_0x0025
        L_0x019c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x01a9
            r0 = -1347161006(0xffffffffafb3f452, float:-3.273351E-10)
            X.0fS.A00(r0)     // Catch:{ all -> 0x01bb }
        L_0x01a9:
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01aa:
            X.62O r1 = X.AnonymousClass62Q.A03(r8)     // Catch:{ all -> 0x01bb }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x01ba
            r0 = 845710530(0x326884c2, float:1.3534363E-8)
            X.0fS.A00(r0)
        L_0x01ba:
            return r1
        L_0x01bb:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x01c8
            r0 = 726352414(0x2b4b421e, float:7.2211844E-13)
            X.0fS.A00(r0)
        L_0x01c8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299475vF.A01(android.content.Context, X.0iw, X.62P):X.62O");
    }

    public static final AnonymousClass62O A00(Context context, AnonymousClass0iw r29, UserSession userSession, Double d, Integer num, 0sn r33, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass00P th;
        AnonymousClass62P r26;
        if (Systrace.A0E(1)) {
            0fS.A01("TifuPostHelper.convertToPosts", -480504020);
        }
        if (r33 == null) {
            try {
                r33 = 0sn.A00;
            } catch (Throwable th2) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-121834202);
                }
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : r33) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                th = AnonymousClass00P.createAndThrow();
            } else {
                1Xj r11 = (1Xj) next;
                String id = r11.getId();
                if (id != null) {
                    if (Systrace.A0E(1)) {
                        0fS.A01("TifuPostHelper.toFeedPostRows", -1220890539);
                    }
                    UserSession userSession2 = userSession;
                    AnonymousClass62P A00 = C299485vG.A00.A00(userSession2, r11, d, num, i, true, false, true, z2, z3, z, z4, z5, z6);
                    if (Systrace.A0E(1)) {
                        0fS.A00(1944882357);
                    }
                    if (182.A06(0Tu.A05, userSession2, 36326339468867290L)) {
                        r26 = A01(context, r29, A00);
                    } else {
                        r26 = AnonymousClass62M.A01;
                    }
                    arrayList.add(new AnonymousClass9J3(r11.A0C.C7C(), r11, id, A00, r26, 1sd.A00(userSession2).A05(r11)));
                }
                i = i2;
            }
            throw th;
        }
        AnonymousClass62O A03 = AnonymousClass62Q.A03(arrayList);
        if (Systrace.A0E(1)) {
            0fS.A00(1422039293);
        }
        return A03;
    }
}
