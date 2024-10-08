package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.SSl  reason: case insensitive filesystem */
public abstract class C11413SSl {
    public static final Set A00 = C51967G9n.A0t(new String[]{"IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION"}, 0);
    public static final Set A01 = C51967G9n.A0t(new String[]{"IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "IAB_AUTOFILL_BINDING_UPDATER", "UNKNOWN"}, 0);

    public static final String A00(W3CCardDetail w3CCardDetail) {
        0qQ.A0B(w3CCardDetail, 0);
        if (!w3CCardDetail.A05 && C66580MXl.A06(w3CCardDetail.A02) == 0) {
            return "UNBOUND_CARD";
        }
        if (DbY.A1Z(0Tu.A06, C11431STx.A00(), 36310430914773097L) || !A04(w3CCardDetail)) {
            return MessageAvailabilityResponseId$Companion.AVAILABLE;
        }
        return "FILTERED_BY_TRUSTED_DEVICE_EXPERIMENT";
    }

    public static final ArrayList A01(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W3CCardDetail w3CCardDetail = (W3CCardDetail) it.next();
            if (!w3CCardDetail.A05 && C66580MXl.A06(w3CCardDetail.A02) == 0) {
                CardDetails cardDetails = w3CCardDetail.A00;
                0qQ.A07(cardDetails);
                A0q.add(cardDetails);
            }
        }
        return A0q;
    }

    public static final LinkedHashSet A02(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CardDetails cardDetails = ((W3CCardDetail) it.next()).A00;
            0qQ.A07(cardDetails);
            A0q.add(cardDetails);
        }
        LinkedHashSet A0y = DbS.A0y();
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            String str = ((CardDetails) it2.next()).A08;
            if (str != null) {
                A0y.add(str);
            }
        }
        return A0y;
    }

    public static final List A03(List list, boolean z) {
        ArrayList arrayList;
        0qQ.A0B(list, 0);
        if (!z) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((W3CCardDetail) it.next()).A00);
            }
        } else {
            ArrayList<W3CCardDetail> A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                JTR.A1P(A00((W3CCardDetail) next), MessageAvailabilityResponseId$Companion.AVAILABLE, next, A1C);
            }
            arrayList = AnonymousClass7TF.A0p(A1C);
            for (W3CCardDetail w3CCardDetail : A1C) {
                arrayList.add(w3CCardDetail.A00);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r5 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r7.length() == 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.fbpay.w3c.W3CCardDetail r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r8 = r9.A04
            java.lang.String r7 = r9.A03
            r9 = 0
            if (r8 == 0) goto L_0x0011
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r6 = r0 ^ 1
            if (r7 == 0) goto L_0x001d
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r5 = r0 ^ 1
            if (r6 != 0) goto L_0x0025
            r4 = 0
            if (r5 == 0) goto L_0x0026
        L_0x0025:
            r4 = 1
        L_0x0026:
            java.lang.String r3 = "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN"
            if (r8 == 0) goto L_0x0030
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x0038
        L_0x0030:
            if (r7 == 0) goto L_0x006d
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x006d
        L_0x0038:
            r2 = 1
        L_0x0039:
            if (r6 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x006b
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x004b
            java.util.Set r0 = A00
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x006b
        L_0x004b:
            r1 = 1
        L_0x004c:
            if (r5 == 0) goto L_0x005e
            if (r7 == 0) goto L_0x0069
            boolean r0 = r7.equals(r3)
            if (r0 != 0) goto L_0x005e
            java.util.Set r0 = A00
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0069
        L_0x005e:
            r0 = 1
        L_0x005f:
            if (r4 == 0) goto L_0x0068
            if (r2 == 0) goto L_0x0068
            if (r1 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
            r9 = 1
        L_0x0068:
            return r9
        L_0x0069:
            r0 = 0
            goto L_0x005f
        L_0x006b:
            r1 = 0
            goto L_0x004c
        L_0x006d:
            r2 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11413SSl.A04(com.fbpay.w3c.W3CCardDetail):boolean");
    }
}
