package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

public final class MG1 extends AnonymousClass1Ek implements 0sL {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG1(IgSignalsTtncEstimator igSignalsTtncEstimator, AnonymousClass4D7 r3, long j) {
        super(2, r3);
        this.A02 = 3;
        this.A01 = igSignalsTtncEstimator;
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MG1] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MG1] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.MG1] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = new X.MG1(r1, r6, r0);
        r3.A00 = X.AnonymousClass7TE.A0R(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = new X.MG1(r6, r0, r1);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x001c;
                case 2: goto L_0x0014;
                case 3: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            r0 = 4
        L_0x0008:
            X.MG1 r3 = new X.MG1
            r3.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r6, (int) r0)
            long r0 = X.AnonymousClass7TE.A0R(r5)
            r3.A00 = r0
            return r3
        L_0x0014:
            java.lang.Object r1 = r4.A01
            r0 = 2
            goto L_0x0008
        L_0x0018:
            long r1 = r4.A00
            r0 = 0
            goto L_0x001f
        L_0x001c:
            long r1 = r4.A00
            r0 = 1
        L_0x001f:
            X.MG1 r3 = new X.MG1
            r3.<init>((X.AnonymousClass4D7) r6, (int) r0, (long) r1)
            r3.A01 = r5
            return r3
        L_0x0027:
            java.lang.Object r2 = r4.A01
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r2 = (com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r2
            long r0 = r4.A00
            X.MG1 r3 = new X.MG1
            r3.<init>((com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r2, (X.AnonymousClass4D7) r6, (long) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MG1.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 A1M;
        switch (this.A02) {
            case 0:
            case 1:
            case 3:
                A1M = AnonymousClass7TE.A1M(obj2, obj, this);
                break;
            default:
                A1M = create(Long.valueOf(AnonymousClass7TE.A0R(obj)), (AnonymousClass4D7) obj2);
                break;
        }
        return ((MG1) A1M).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        C47169Drk drk;
        switch (this.A02) {
            case 2:
                0eS.A00(obj);
                long j = this.A00;
                C60288Jik jik = (C60288Jik) this.A01;
                05G r2 = jik.A02;
                do {
                    value = r2.getValue();
                    drk = (C47169Drk) value;
                } while (!r2.AIY(value, new C47169Drk(drk.A01, drk.A02, j, drk.A05, drk.A04, drk.A03, drk.A07)));
                jik.A01();
                break;
            case 3:
                0eS.A00(obj);
                IgSignalsTtncEstimator igSignalsTtncEstimator = (IgSignalsTtncEstimator) this.A01;
                long j2 = this.A00;
                LSL lsl = igSignalsTtncEstimator.A01;
                if (lsl != null) {
                    long j3 = j2 - lsl.A07.A04;
                    C61929KSa kSa = lsl.A08;
                    if (kSa != null) {
                        KSS.A02(kSa.A0R, j3);
                        if (!igSignalsTtncEstimator.A0H) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (kSa.A01 == null) {
                                kSa.A01 = LT2.A02(kSa, currentTimeMillis);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                0eS.A00(obj);
                long j4 = ((C313816h4) this.A01).A01.A01 - this.A00;
                return new C61046Jvk(1G0.A02(j4), 18, Dba.A1U((j4 > 30000 ? 1 : (j4 == 30000 ? 0 : -1))));
            default:
                0eS.A00(obj);
                long j5 = this.A00;
                ScrollingLogic scrollingLogic = ((AnonymousClass6IW) ((AnonymousClass6IX) this.A01)).A00;
                ScrollingLogic.A00(scrollingLogic.A04, scrollingLogic, 1, j5);
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG1(AnonymousClass4D7 r2, int i, long j) {
        super(2, r2);
        this.A02 = i;
        this.A00 = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MG1(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A02 = i;
        this.A01 = obj;
    }
}
