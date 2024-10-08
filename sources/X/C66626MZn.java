package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MZn  reason: case insensitive filesystem */
public final class C66626MZn {
    public boolean A00 = true;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C66627MZo A04 = new C66627MZo();
    public final C74356PtW A05;
    public final Class A06;

    public C66626MZn(Context context, AnonymousClass0iw r4, UserSession userSession, C74356PtW ptW, Class cls) {
        this.A06 = cls;
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r4;
        this.A05 = ptW;
    }

    public static final List A00(C66626MZn mZn, C74354PtU ptU, Object obj) {
        Object obj2 = obj;
        C296995qz B9o = ptU.B9o(obj);
        if (B9o.A01 < 0 || B9o.A00 < 0) {
            return null;
        }
        return mZn.A05.AMf(mZn.A01, mZn.A02, B9o, mZn.A03, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (r6.size() != r4.size()) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C74354PtU r11, X.C74355PtV r12, java.util.Iterator r13) {
        /*
            r10 = this;
            r7 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0q(r13, r7)
            X.2U8 r3 = X.2YX.A00(r13)
            r1 = 12
            X.G4S r0 = new X.G4S
            r0.<init>(r10, r1)
            X.3T1 r0 = X.C242173Sx.A09(r0, r3)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.3T3 r8 = new X.3T3
            r8.<init>(r0)
        L_0x0021:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r4 = r8.next()
            X.MZo r3 = r10.A04
            java.lang.String r0 = r12.BK3(r4)
            int r9 = r0.hashCode()
            X.5qz r1 = r11.B9o(r4)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.google.common.collect.HashBiMap r3 = r3.A00
            java.lang.Object r0 = r3.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x0051
            r6.add(r4)
            goto L_0x0021
        L_0x0051:
            java.lang.String r0 = r12.BK3(r4)
            int r0 = r0.hashCode()
            X.Tnb r1 = r3.A03
            if (r1 != 0) goto L_0x0064
            com.google.common.collect.HashBiMap$Inverse r1 = new com.google.common.collect.HashBiMap$Inverse
            r1.<init>(r3)
            r3.A03 = r1
        L_0x0064:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            X.5qz r0 = r11.B9o(r4)
            X.0qQ.A0B(r0, r7)
            r3.remove(r0)
            r5.add(r4)
            goto L_0x0021
        L_0x0079:
            X.MZo r0 = r10.A04
            com.google.common.collect.HashBiMap r4 = r0.A00
            int r0 = r4.size()
            if (r0 == 0) goto L_0x008e
            int r3 = r6.size()
            int r1 = r4.size()
            r0 = 0
            if (r3 == r1) goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            r10.A00 = r0
            if (r0 == 0) goto L_0x0099
            r4.clear()
            A01(r10, r11, r12, r6, r2)
        L_0x0099:
            A01(r10, r11, r12, r5, r2)
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x00b0
            com.instagram.common.session.UserSession r0 = r10.A03
            X.1y3 r1 = X.1y1.A00(r0)
            X.0iw r0 = r10.A02
            java.lang.String r0 = r0.getModuleName()
            r1.A06(r0, r2)
        L_0x00af:
            return
        L_0x00b0:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00af
            com.instagram.common.session.UserSession r0 = r10.A03
            X.1y3 r1 = X.1y1.A00(r0)
            X.0iw r0 = r10.A02
            java.lang.String r0 = r0.getModuleName()
            r1.A05(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66626MZn.A02(X.PtU, X.PtV, java.util.Iterator):void");
    }

    public static final void A01(C66626MZn mZn, C74354PtU ptU, C74355PtV ptV, List list, List list2) {
        List A002;
        for (Object next : list) {
            if (mZn.A06.isInstance(next) && (A002 = A00(mZn, ptU, next)) != null) {
                list2.addAll(A002);
                C66627MZo mZo = mZn.A04;
                C296995qz B9o = ptU.B9o(next);
                int hashCode = ptV.BK3(next).hashCode();
                0qQ.A0B(B9o, 0);
                mZo.A00.A0D(B9o, Integer.valueOf(hashCode), true);
            }
        }
    }

    public final void A03(C74354PtU ptU, Object obj) {
        List A002 = A00(this, ptU, obj);
        if (A002 != null) {
            1y1.A00(this.A03).A05(this.A02.getModuleName(), A002);
        }
        this.A00 = false;
    }
}
