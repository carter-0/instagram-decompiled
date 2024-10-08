package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2wU  reason: invalid class name and case insensitive filesystem */
public final class C233802wU implements C233782wS {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final int A03;
    public final Context A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dwr(java.util.Collection r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r13.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4EB r0 = (X.AnonymousClass4EB) r0
            X.1Xg r0 = r0.A01
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.A4f()
            if (r0 != r5) goto L_0x000d
            r3.add(r1)
            goto L_0x000d
        L_0x002f:
            java.util.Iterator r3 = r3.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r3.next()
            X.4EB r0 = (X.AnonymousClass4EB) r0
            X.1Xg r0 = r0.A01
            X.1Xn r0 = r0.A05
            X.1Xj r2 = X.1Xi.A02(r0)
            if (r2 == 0) goto L_0x008b
            com.instagram.common.session.UserSession r8 = r12.A01
            android.content.Context r7 = r12.A04
            X.6UO r11 = X.AnonymousClass6UO.FEED_SINGLE_MEDIA_FORMAT
            X.1Xy r0 = r2.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x0083
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r10 = r0.BwB()
            if (r10 == 0) goto L_0x0077
            java.lang.String r1 = X.C231122qu.A07(r8, r2)
            java.lang.String r0 = X.C231122qu.A0F(r8, r2)
            X.6Q6 r9 = new X.6Q6
            r9.<init>(r1, r0)
            X.0nO r0 = X.0nY.A00()
            X.H8L r6 = new X.H8L
            r6.<init>(r7, r8, r9, r10, r11)
            r0.ATE(r6)
            goto L_0x0033
        L_0x0077:
            r0 = 1239(0x4d7, float:1.736E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0083:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0093:
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x0142
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00d5
            java.util.Iterator r2 = r13.iterator()
        L_0x00a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r2.next()
            X.4EB r0 = (X.AnonymousClass4EB) r0
            X.1Xg r0 = r0.A01
            X.1Xn r0 = r0.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x00a1
            boolean r0 = r1.A5D()
            if (r0 != 0) goto L_0x00a1
            X.1Xy r0 = r1.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x00a1
            android.content.Context r4 = r12.A04
            int r3 = r12.A03
            boolean r2 = r12.A07
            X.XQr r1 = X.C21246XQr.FEED_SPONSORED_CONTENT_SHOWREEL
            X.Xa9 r0 = new X.Xa9
            r0.<init>(r2, r3)
            X.XmL.A00(r4, r1, r0)
        L_0x00d5:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0142
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0142
            java.util.Iterator r3 = r13.iterator()
        L_0x00e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r3.next()
            X.4EB r0 = (X.AnonymousClass4EB) r0
            X.1Xg r0 = r0.A01
            X.1Xn r0 = r0.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r1.A5D()
            if (r0 != r5) goto L_0x00e3
            X.1Xy r0 = r1.A0C
            java.util.List r1 = r0.Alu()
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0112
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0112
            goto L_0x00e3
        L_0x0112:
            java.util.Iterator r2 = r1.iterator()
        L_0x0116:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            X.1Xy r0 = r1.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 != 0) goto L_0x0132
            X.1Xy r0 = r1.A0C
            X.DUQ r0 = r0.CCM()
            if (r0 == 0) goto L_0x0116
        L_0x0132:
            android.content.Context r4 = r12.A04
            int r3 = r12.A03
            boolean r2 = r12.A07
            X.XQr r1 = X.C21246XQr.FEED_SPONSORED_CONTENT_SHOWREEL
            X.Xa9 r0 = new X.Xa9
            r0.<init>(r2, r3)
            X.XmL.A00(r4, r1, r0)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233802wU.Dwr(java.util.Collection, int):void");
    }

    public final void D1r() {
        if (this.A05) {
            C21246XQr xQr = C21246XQr.FEED_SPONSORED_CONTENT_SHOWREEL;
            Map map = XmL.A00;
            XnB xnB = (XnB) map.get(xQr);
            if (xnB != null) {
                xnB.A03.clear();
                xnB.A00 = true;
            }
            map.remove(xQr);
            XnB xnB2 = (XnB) map.get(xQr);
            if (xnB2 != null) {
                xnB2.A03.clear();
                xnB2.A00 = true;
            }
            map.remove(xQr);
        }
        if (this.A02) {
            AnonymousClass6OH.A01(this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
        1Xj A022;
        List Alu;
        Object obj2;
        DUQ CCM;
        String Bm0;
        Integer Blx;
        AnonymousClass4EB r5 = (AnonymousClass4EB) obj;
        0qQ.A0B(r5, 0);
        if (this.A02 && (A022 = 1Xi.A02(r5.A01.A05)) != null && A022.A5D() && (Alu = A022.A0C.Alu()) != null) {
            Iterator it = Alu.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                DUQ CCM2 = ((1Xj) obj2).A0C.CCM();
                if (CCM2 != null && (Blx = CCM2.Blx()) != null && Blx.intValue() == 1) {
                    break;
                }
            }
            1Xj r1 = (1Xj) obj2;
            if (r1 != null && (CCM = r1.A0C.CCM()) != null && (Bm0 = CCM.Bm0()) != null) {
                AnonymousClass6OH.A00(this.A01).A01(Bm0, this.A00.getModuleName(), CCM.Ace());
            }
        }
    }

    public C233802wU(Context context, AnonymousClass0iw r2, UserSession userSession, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = context;
        this.A01 = userSession;
        this.A00 = r2;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = i;
        this.A07 = z3;
        this.A02 = z4;
    }
}
