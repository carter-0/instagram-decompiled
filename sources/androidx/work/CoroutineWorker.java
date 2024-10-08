package androidx.work;

import X.0qQ;
import X.19B;
import X.19E;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass12W;
import X.AnonymousClass199;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass38M;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.C2379539x;
import X.C262204Co;
import X.C283015Ft;
import X.C283025Fu;
import X.C376889Js;
import X.MHP;
import X.T0V;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class CoroutineWorker extends C283015Ft {
    public final C2379539x A00;
    public final AnonymousClass4CZ A01;
    public final AnonymousClass19G A02 = new AnonymousClass19G((C262204Co) null);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.39y, X.39x, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        0qQ.A0B(context, 1);
        0qQ.A0B(workerParameters, 2);
        ? obj = new Object();
        this.A00 = obj;
        obj.addListener(new C283025Fu(this), ((AnonymousClass38M) this.mWorkerParams.A07).A01);
        this.A01 = AnonymousClass12W.A00;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.AnonymousClass4D7 r15) {
        /*
            r14 = this;
            r4 = r14
            com.instagram.security.attestation.keystore.worker.KeyAttestationWorker r4 = (com.instagram.security.attestation.keystore.worker.KeyAttestationWorker) r4
            r3 = 48
            boolean r0 = X.AnonymousClass9JX.A00(r3, r15)
            if (r0 == 0) goto L_0x00cd
            r11 = r15
            X.9JX r11 = (X.AnonymousClass9JX) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cd
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r11.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r11.A00
            r13 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r13) goto L_0x00d4
            java.lang.Object r6 = r11.A01
            X.0Ak r6 = (X.0Ak) r6
            X.0eS.A00(r1)
        L_0x002b:
            X.9IP r1 = (X.AnonymousClass9IP) r1
            X.0Aj r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0038
            r6.Cgf()
        L_0x0038:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x009f
            X.5G1 r2 = new X.5G1
            r2.<init>()
            return r2
        L_0x0042:
            X.0eS.A00(r1)
            X.08y r0 = X.09i.A0A     // Catch:{ IllegalStateException -> 0x00dc }
            com.instagram.common.session.UserSession r7 = r0.A08(r4)     // Catch:{ IllegalStateException -> 0x00dc }
            r5 = 0
            X.0kM r0 = new X.0kM
            r0.<init>(r7)
            X.0wc r3 = r0.A00()
            java.lang.String r1 = "ig_attest_keystore_background"
            X.0kJ r0 = r3.A00
            X.0Aj r1 = r3.A00(r0, r1)
            r0 = 190(0xbe, float:2.66E-43)
            X.1Ln r6 = new X.1Ln
            r6.<init>(r1, r0)
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342160565474170189(0x208106a00004154d, double:4.063513796417837E-152)
            boolean r0 = X.182.A06(r3, r7, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r1 = X.14i.A08()
            if (r0 == 0) goto L_0x00a5
            if (r1 != 0) goto L_0x00a5
            X.0Aj r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x009f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "requires_backgrounded"
            r6.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_backgrounded"
            r6.A0O(r0, r1)
            java.lang.String r1 = "app_not_backgrounded"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
            r6.Cgf()
        L_0x009f:
            X.5Fh r2 = new X.5Fh
            r2.<init>()
            return r2
        L_0x00a5:
            java.lang.String r0 = "requires_backgrounded"
            r6.A0O(r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "is_backgrounded"
            r6.A0O(r0, r1)
            android.content.Context r5 = r4.mAppContext
            X.0qQ.A07(r5)
            X.0nV r12 = r4.A00
            r8 = 0
            r11.A01 = r6
            r11.A00 = r13
            java.lang.String r9 = "AndroidKeyAttestationWorker"
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r1 = com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r2) goto L_0x002b
            return r2
        L_0x00cd:
            X.9JX r11 = new X.9JX
            r11.<init>(r4, r15, r3)
            goto L_0x0019
        L_0x00d4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00dc:
            X.5Fh r2 = new X.5Fh
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.A03(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.39x, java.lang.Object] */
    public final ListenableFuture getForegroundInfoAsync() {
        AnonymousClass19G r2 = new AnonymousClass19G((C262204Co) null);
        AnonymousClass19S A022 = 19E.A02(AnonymousClass199.A02(this.A01, r2));
        T0V t0v = new T0V(new Object(), r2);
        1Eo.A05(19B.A00, new MHP((Object) this, (Object) t0v, (AnonymousClass4D7) null, 31, 42), A022);
        return t0v;
    }

    public Object A04(AnonymousClass4D7 r3) {
        throw new IllegalStateException("Not implemented");
    }

    public final void onStopped() {
        this.A00.cancel(false);
    }

    public final ListenableFuture startWork() {
        AnonymousClass19S A022 = 19E.A02(AnonymousClass199.A02(this.A01, this.A02));
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 4);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
        return this.A00;
    }
}
