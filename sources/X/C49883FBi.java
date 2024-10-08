package X;

import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FBi  reason: case insensitive filesystem */
public final class C49883FBi {
    public BusinessConversionFlowStatus A00;
    public Set A01 = AnonymousClass7TE.A1F();
    public Set A02 = AnonymousClass7TE.A1F();
    public final Map A03 = AnonymousClass7TE.A1H();

    public static int A00(C49883FBi fBi, int i) {
        C249803kO it = fBi.A00.A01.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            ConversionStep conversionStep = ((BusinessConversionStep) it.next()).A01;
            if (i2 >= i) {
                break;
            }
            if (!(conversionStep == ConversionStep.INTRO || conversionStep == ConversionStep.CREATE_PAGE)) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.business.activity.BusinessConversionActivity, android.app.Activity] */
    public final void A01() {
        for (EtO etO : this.A02) {
            etO.A00.setResult(-1);
        }
        this.A02 = AnonymousClass7TE.A1F();
        this.A01 = AnonymousClass7TE.A1F();
    }

    public final void A02() {
        BusinessConversionFlowStatus businessConversionFlowStatus = this.A00;
        0qQ.A0B(businessConversionFlowStatus, 0);
        BusinessConversionFlowStatus A012 = FG6.A01(businessConversionFlowStatus, C48092EVk.NEXT);
        if (A012 != null) {
            this.A00 = A012;
            if (A012.A00 != A012.A01.size()) {
                return;
            }
        }
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r0.A00 == r0.A01.size()) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r6) {
        /*
            r5 = this;
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r4 = r5.A00
            r3 = 0
            X.0qQ.A0B(r4, r3)
            X.EVk r0 = X.C48092EVk.SKIP
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.FG6.A01(r4, r0)
            if (r0 == 0) goto L_0x001a
            r5.A00 = r0
            int r1 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A01
            int r0 = r0.size()
            if (r1 != r0) goto L_0x001d
        L_0x001a:
            r5.A01()
        L_0x001d:
            java.util.Map r2 = r5.A03
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r5.A00
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x003e
            com.google.common.collect.ImmutableList r1 = r1.A01
            int r0 = r0 + -1
            java.lang.Object r0 = r1.get(r0)
        L_0x002d:
            r2.put(r0, r4)
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = r5.A00
            X.0qQ.A0B(r1, r3)
            int r0 = r1.A00
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r0 = X.FG6.A02(r1, r6, r0, r0)
            r5.A00 = r0
            return
        L_0x003e:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49883FBi.A03(java.util.List):void");
    }

    public C49883FBi(BusinessConversionFlowStatus businessConversionFlowStatus) {
        this.A00 = businessConversionFlowStatus;
    }
}
