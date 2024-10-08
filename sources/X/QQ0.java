package X;

import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import com.shopify.checkout.models.errors.UnrecoverableErrorPayload;
import com.shopify.checkout.models.errors.VaultedPaymentErrorPayload;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.InventoryErrorPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class QQ0 extends RR5 {
    public C10362Rqz A00;
    public SUF A01;
    public String A02;
    public String A03 = "";
    public 0sP A04;
    public boolean A05;
    public final long A06;
    public final C10642Rvb A07 = new C10642Rvb(this);
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final 0sP A0C;
    public final boolean A0D;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[EDGE_INSN: B:37:0x007c->B:28:0x007c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r10) {
        /*
            r9 = this;
            r1 = 0
            java.lang.String r6 = A00(r10)
            com.facebook.quicklog.QuickPerformanceLogger r0 = X.C11401SRw.A00
            java.lang.Integer r4 = r9.A08
            boolean r3 = X.AnonymousClass7TF.A1U(r1, r4, r6)
            java.lang.Integer r0 = X.C11401SRw.A01(r4)
            if (r0 == 0) goto L_0x002b
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.C11401SRw.A00
            if (r2 == 0) goto L_0x002b
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L_0x002b
            java.lang.String r0 = "place_order_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x002b:
            java.lang.Integer r0 = X.C11401SRw.A02(r4)
            if (r0 == 0) goto L_0x0049
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.C11401SRw.A00
            if (r2 == 0) goto L_0x0049
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L_0x0049
            java.lang.String r0 = "update_cart_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x0049:
            java.util.Iterator r2 = r10.iterator()
        L_0x004d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C19856Wgb
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1 instanceof com.shopify.checkout.models.errors.UnrecoverableErrorPayload
            if (r0 == 0) goto L_0x004d
        L_0x005f:
            java.lang.Integer r0 = X.C11401SRw.A00(r4)
            if (r0 == 0) goto L_0x007c
            com.facebook.quicklog.QuickPerformanceLogger r2 = X.C11401SRw.A00
            if (r2 == 0) goto L_0x007c
            int r1 = r0.intValue()
            boolean r0 = r2.isMarkerOn(r1)
            if (r0 != r3) goto L_0x007c
            java.lang.String r0 = "checkout_ttrc_error"
            r2.markerAnnotate(r1, r0, r6)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x007c:
            X.SUF r0 = r9.A01
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = r9.A0B
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = ""
        L_0x0086:
            java.lang.String r4 = r9.A0A
            long r2 = r9.A06
            java.lang.String r5 = r9.A03
            java.lang.String r7 = r9.A09
            java.lang.String r8 = r9.A02
            r0.A0E(r1, r2, r4, r5, r6, r7, r8)
        L_0x0093:
            X.Rqz r0 = r9.A00
            if (r0 == 0) goto L_0x00a3
            X.4tV r2 = r0.A01
            X.6Rm r1 = r0.A00
            X.TIF r0 = new X.TIF
            r0.<init>(r1, r2, r6)
            X.SB0.A00(r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QQ0.A02(java.util.List):void");
    }

    public QQ0(Integer num, String str, String str2, String str3, long j, boolean z) {
        this.A08 = num;
        this.A0B = str;
        this.A0A = str2;
        this.A06 = j;
        this.A09 = str3;
        this.A0D = z;
        TY5 ty5 = new TY5(this, 27);
        this.A0C = ty5;
        this.A04 = ty5;
    }

    public static final String A00(List list) {
        String str;
        C250873mC r1;
        C255473uB r0;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object next : list) {
            if (next instanceof DeliveryErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20545WtQ.A00;
            } else if (next instanceof InventoryErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20546WtR.A00;
            } else if (next instanceof CheckoutErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20540WtL.A00;
            } else if (next instanceof DefaultsErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20541WtM.A00;
            } else if (next instanceof UnrecoverableErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20543WtO.A00;
            } else if (next instanceof VaultedPaymentErrorPayload) {
                r1 = C250863mB.A03;
                r0 = C20544WtP.A00;
            } else if (next instanceof ParsableInternalErrorPayload) {
                r1 = C250863mB.A03;
                C255463uA[] r02 = ParsableInternalErrorPayload.A04;
                r0 = C20542WtN.A00;
            } else {
                str = "";
                A0r.add(str);
            }
            str = r1.A02(next, r0);
            A0r.add(str);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxh.A1P(A1A);
        int i = 0;
        Iterator it = A0r.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            if (i > 0) {
                A1A.append(",");
            }
            A1A.append(String.valueOf(next2));
            i = i2;
        }
        String A0l = AnonymousClass7TF.A0l("]", A1A);
        0qQ.A07(A0l);
        return DbV.A12(0rw.A0t(A0l));
    }
}
