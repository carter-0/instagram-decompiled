package com.instagram.debug.devoptions.metadata.viewmodel;

import X.0Yg;
import X.0sL;
import X.AnonymousClass3U9;
import X.C60340gF;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;

public final class ThreadMetadataOverrideViewModel$fetch$1 extends 0Yg implements 0sL {
    public static final ThreadMetadataOverrideViewModel$fetch$1 INSTANCE = new ThreadMetadataOverrideViewModel$fetch$1();

    public ThreadMetadataOverrideViewModel$fetch$1() {
        super(2);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void invoke(com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride r7, X.AnonymousClass3U9 r8) {
        /*
            r6 = this;
            X.AnonymousClass7TG.A1N(r7, r8)
            java.lang.Object r1 = r7.value
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r1, r0)
            int r5 = X.AnonymousClass7TE.A0M(r1)
            X.0eM r0 = r8.A05
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0059
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0030
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0028:
            if (r0 >= r2) goto L_0x0031
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0028
        L_0x0030:
            r2 = 0
        L_0x0031:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r8.A01     // Catch:{ all -> 0x004c }
            X.3Te r0 = r0.A0s     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0040
            r0.A02 = r5     // Catch:{ all -> 0x004c }
        L_0x0040:
            if (r3 >= r2) goto L_0x0048
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0040
        L_0x0048:
            r1.unlock()
            return
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            if (r3 >= r2) goto L_0x0055
            r4.lock()
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0055:
            r1.unlock()
            throw r0
        L_0x0059:
            X.3S9 r1 = r8.A01
            monitor-enter(r1)
            X.3Te r0 = r1.A0s     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0062
            r0.A02 = r5     // Catch:{ all -> 0x0064 }
        L_0x0062:
            monitor-exit(r1)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel$fetch$1.invoke(com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride, X.3U9):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ThreadMetadataOverride) obj, (AnonymousClass3U9) obj2);
        return C60340gF.A00;
    }
}
