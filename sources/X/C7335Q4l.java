package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Q4l  reason: case insensitive filesystem */
public final class C7335Q4l {
    public long A00 = 0;
    public long A01 = 0;
    public MediaFormat A02 = null;
    public SJL A03;
    public C13860Tig A04;
    public C7329Q4f A05;
    public C11352SOl A06;
    public Q14 A07;
    public C13726Tfw A08;
    public C13855Tia A09;
    public File A0A;
    public ExecutorService A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C7255Q1d A0F;
    public final C13588TdG A0G;
    public final STP A0H;
    public final C7232Q0d A0I;
    public final C13725Tfv A0J;
    public final Q1J A0K;
    public final C13589TdH A0L;
    public final C13590TdI A0M;
    public final C13780Tgv A0N;
    public final C13804ThT A0O;
    public final C9608Rdm A0P;
    public final C10862RzN A0Q;
    public final C13598TdQ A0R;
    public final S30 A0S;
    public volatile boolean A0T;

    public static void A00(C7335Q4l q4l, boolean z) {
        if (z && q4l.A0T) {
            throw new CancellationException("Operation Cancelled");
        }
    }

    public final int A01() {
        C10862RzN rzN = this.A0Q;
        if (rzN.A0I) {
            return 0;
        }
        if (!rzN.A0M) {
            return 1;
        }
        long j = rzN.A02;
        if (j <= 0) {
            return 4;
        }
        try {
            C266714aE r2 = C266714aE.VIDEO;
            return (int) Math.ceil(((double) S9X.A00(this.A0E, this.A0J, r2, rzN)) / ((double) j));
        } catch (AnonymousClass4ZS | IOException unused) {
            return 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        r0 = X.182.A06(r7, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        r0 = X.182.A06(r9, r8, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7335Q4l(android.content.Context r11, X.C13724Tfu r12, X.C7255Q1d r13, X.C13588TdG r14, X.STP r15, X.C7232Q0d r16, X.C13725Tfv r17, X.C13589TdH r18, X.C13590TdI r19, X.C13780Tgv r20, X.C13804ThT r21, X.C10862RzN r22, X.C13598TdQ r23) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.A02 = r0
            r0 = 0
            r10.A01 = r0
            r10.A00 = r0
            r10.A0E = r11
            r5 = r17
            r10.A0J = r5
            r2 = r23
            r10.A0R = r2
            r7 = r22
            r10.A0Q = r7
            r10.A0H = r15
            r0 = r18
            r10.A0L = r0
            r0 = r21
            r10.A0O = r0
            r4 = r19
            r10.A0M = r4
            r3 = r20
            r10.A0N = r3
            r10.A0G = r14
            X.Ti9 r6 = r7.A07
            r1 = 1
            X.Qdv r0 = new X.Qdv
            r0.<init>(r6, r1)
            r10.A0K = r0
            r10.A0F = r13
            X.Rdm r0 = r7.A0A
            r10.A0P = r0
            X.Q4k r7 = r7.A0B
            boolean r6 = r7 instanceof X.C7967QeF
            if (r6 == 0) goto L_0x00b7
            r0 = r7
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316190464020539(0x8105620034103b, double:3.0298433107835097E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
        L_0x0054:
            r10.A0D = r0
            if (r6 == 0) goto L_0x007a
            X.QeF r7 = (X.C7967QeF) r7
            com.instagram.common.session.UserSession r7 = r7.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36316190464086076(0x8105620035103c, double:3.0298433108249555E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
        L_0x0067:
            r10.A0C = r0
            if (r12 != 0) goto L_0x006d
            X.Tfu r12 = X.C9935Rjo.A00
        L_0x006d:
            X.S30 r0 = X.S30.A00(r11, r5, r4, r3, r2)
            r0.A01 = r12
            r10.A0S = r0
            r0 = r16
            r10.A0I = r0
            return
        L_0x007a:
            boolean r0 = r7 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x00a3
            X.QeC r7 = (X.C7964QeC) r7
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x00b5;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.Object r0 = r7.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324179101691764(0x810ca6001d2f74, double:3.034895357414454E-306)
        L_0x0092:
            boolean r0 = X.182.A06(r7, r6, r0)
            goto L_0x0067
        L_0x0097:
            java.lang.Object r6 = r7.A01
            X.0lg r6 = (X.0lg) r6
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324179101560690(0x810ca6001b2f72, double:3.0348953573315626E-306)
            goto L_0x0092
        L_0x00a3:
            boolean r0 = r7 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x00ac
            X.QeD r7 = (X.C7965QeD) r7
            boolean r0 = r7.A05
            goto L_0x0067
        L_0x00ac:
            boolean r0 = r7 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x00b5
            X.QeE r7 = (X.C7966QeE) r7
            boolean r0 = r7.A06
            goto L_0x0067
        L_0x00b5:
            r0 = 0
            goto L_0x0067
        L_0x00b7:
            boolean r0 = r7 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x00e1
            r1 = r7
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00f7;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            java.lang.Object r0 = r1.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r8 = r0.A00
            X.0Tu r9 = X.0Tu.A05
            r0 = 36324179101691764(0x810ca6001d2f74, double:3.034895357414454E-306)
        L_0x00d0:
            boolean r0 = X.182.A06(r9, r8, r0)
            goto L_0x0054
        L_0x00d5:
            java.lang.Object r8 = r1.A01
            X.0lg r8 = (X.0lg) r8
            X.0Tu r9 = X.0Tu.A05
            r0 = 36324179101560690(0x810ca6001b2f72, double:3.0348953573315626E-306)
            goto L_0x00d0
        L_0x00e1:
            boolean r0 = r7 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x00ec
            r0 = r7
            X.QeD r0 = (X.C7965QeD) r0
            boolean r0 = r0.A05
            goto L_0x0054
        L_0x00ec:
            boolean r0 = r7 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x00f7
            r0 = r7
            X.QeE r0 = (X.C7966QeE) r0
            boolean r0 = r0.A06
            goto L_0x0054
        L_0x00f7:
            r0 = 0
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7335Q4l.<init>(android.content.Context, X.Tfu, X.Q1d, X.TdG, X.STP, X.Q0d, X.Tfv, X.TdH, X.TdI, X.Tgv, X.ThT, X.RzN, X.TdQ):void");
    }
}
