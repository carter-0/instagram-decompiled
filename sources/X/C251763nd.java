package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Iterator;

/* renamed from: X.3nd  reason: invalid class name and case insensitive filesystem */
public final class C251763nd {
    public final Iterator A00;
    public final C251753nc A01;
    public final C66841qe A02;
    public final 1rB A03;
    public final SamplingPolicyConfig A04;
    public final Integer A05;

    public final void A00() {
        Iterator it = this.A00;
        if (it.hasNext()) {
            C251893nq r6 = (C251893nq) it.next();
            C251953nw r5 = new C251953nw(r6, this.A05);
            C66841qe r4 = this.A02;
            SamplingPolicyConfig samplingPolicyConfig = this.A04;
            r4.FMW(new C251963nx(r6, this.A01, this.A03, samplingPolicyConfig), r5);
            return;
        }
        throw new IllegalStateException("No more batches to upload");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.1rB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.1rB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.1rB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C251763nd(X.C251753nc r3, X.C66841qe r4, X.1rB r5, com.facebook.flexiblesampling.SamplingPolicyConfig r6, java.lang.Integer r7, java.util.Iterator r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r4
            r2.A05 = r7
            r2.A00 = r8
            r2.A01 = r3
            r2.A04 = r6
            if (r5 != 0) goto L_0x0014
            com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider r5 = new com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider
            r5.<init>()
        L_0x0014:
            r2.A03 = r5
            if (r8 == 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r1 = "mBatchPayloadIterator is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251763nd.<init>(X.3nc, X.1qe, X.1rB, com.facebook.flexiblesampling.SamplingPolicyConfig, java.lang.Integer, java.util.Iterator):void");
    }
}
