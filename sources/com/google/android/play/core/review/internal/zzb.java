package com.google.android.play.core.review.internal;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zzb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-98202493, AnonymousClass0fD.A03(1002777552));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r0 = -171269680(0xfffffffff5caa1d0, float:-5.1373336E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r11, r12, r13, r14)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 689531107(0x291968e3, float:3.40638E-14)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r1
        L_0x001a:
            X.Pxf.A14(r10, r12)
        L_0x001d:
            r7 = r10
            com.google.android.play.core.review.internal.zzg r7 = (com.google.android.play.core.review.internal.zzg) r7
            r0 = 1049212340(0x3e89b5b4, float:0.2689644)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 2
            if (r11 != r0) goto L_0x0077
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = X.Pxh.A0L(r12, r0)
            android.os.BaseBundle r8 = (android.os.BaseBundle) r8
            int r0 = r12.dataAvail()
            if (r0 > 0) goto L_0x00cc
            com.google.android.play.core.review.zzh r7 = (com.google.android.play.core.review.zzh) r7
            r0 = 1177152271(0x4629eb0f, float:10874.765)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = -976474058(0xffffffffc5cc3036, float:-6534.0264)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.SEa r0 = r7.A02
            X.SOS r2 = r0.A00
            if (r2 == 0) goto L_0x0088
            X.8nD r1 = r7.A00
            java.lang.Object r9 = r2.A07
            monitor-enter(r9)
            java.util.Set r0 = r2.A0A     // Catch:{ all -> 0x00c9 }
            r0.remove(r1)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.A0B     // Catch:{ all -> 0x00c6 }
            int r0 = r1.get()     // Catch:{ all -> 0x00c6 }
            if (r0 <= 0) goto L_0x0075
            int r0 = r1.decrementAndGet()     // Catch:{ all -> 0x00c6 }
            if (r0 <= 0) goto L_0x0075
            X.SGg r2 = r2.A06     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            java.lang.Object[] r0 = X.Pxe.A1b()     // Catch:{ all -> 0x00c6 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c6 }
            goto L_0x0088
        L_0x0075:
            monitor-exit(r9)     // Catch:{ all -> 0x00c6 }
            goto L_0x007c
        L_0x0077:
            r1 = 0
            r0 = 128280352(0x7a56720, float:2.4887052E-34)
            goto L_0x00be
        L_0x007c:
            X.Qxx r1 = new X.Qxx
            r1.<init>(r2)
            android.os.Handler r0 = r2.A01()
            r0.post(r1)
        L_0x0088:
            X.SGg r2 = r7.A01
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "onGetLaunchReviewFlowInfo"
            r2.A01(r0, r1)
            r0 = -263498752(0xfffffffff04b5400, float:-2.5170803E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r3 = r8.get(r0)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            java.lang.String r0 = "is_review_no_op"
            boolean r2 = r8.getBoolean(r0)
            X.8nD r0 = r7.A00
            com.google.android.play.core.review.zza r1 = new com.google.android.play.core.review.zza
            r1.<init>(r3, r2)
            X.9GD r0 = r0.A00
            r0.A0F(r1)
            r0 = 39133478(0x2552126, float:1.5658282E-37)
            X.AnonymousClass0fD.A0A(r0, r6)
            r1 = 1
            r0 = -23023183(0xfffffffffea0b1b1, float:-1.0679955E38)
        L_0x00be:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1923544143(0x72a6f44f, float:6.6137424E30)
            goto L_0x0016
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c6 }
            throw r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            throw r0
        L_0x00cc:
            android.os.BadParcelableException r0 = X.Pxg.A0M(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.review.internal.zzb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
