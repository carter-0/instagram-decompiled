package com.instagram.feed.media.flashmedia;

import X.0fA;
import X.0qQ;
import X.0wj;
import X.1V8;
import X.1V9;
import X.1VA;
import X.1VC;
import X.AnonymousClass1VF;
import X.AnonymousClass93H;
import X.AnonymousClass93I;
import X.AnonymousClass93J;
import X.C60960kU;
import X.C61410nE;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.persistence.MediaDatabase;
import com.instagram.feed.media.flashmedia.persistence.MediaDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;

public final class FlashMediaLocalDataSource {
    public final 0fA A00;
    public final UserSession A01;
    public final C61410nE A02;
    public final AnonymousClass93J A03;

    public /* synthetic */ FlashMediaLocalDataSource(UserSession userSession) {
        AnonymousClass93J r2;
        AnonymousClass93H r5 = MediaDatabase.A00;
        Class<MediaDatabase> cls = MediaDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r5));
                    1VC.A00(A002, 272551949, 424218535, false);
                    A002.A03(new AnonymousClass1VF[]{AnonymousClass93I.A00});
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        MediaDatabase_Impl mediaDatabase_Impl = (MediaDatabase_Impl) ((MediaDatabase) igRoomDatabase);
        if (mediaDatabase_Impl.A00 != null) {
            r2 = mediaDatabase_Impl.A00;
        } else {
            synchronized (mediaDatabase_Impl) {
                if (mediaDatabase_Impl.A00 == null) {
                    mediaDatabase_Impl.A00 = new AnonymousClass93J(mediaDatabase_Impl);
                }
                r2 = mediaDatabase_Impl.A00;
            }
        }
        C61410nE r1 = C61410nE.A00;
        0qQ.A0B(r2, 2);
        0qQ.A0B(r1, 3);
        this.A01 = userSession;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = 0wj.A01;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass93C r19, java.util.Collection r20, X.AnonymousClass4D7 r21, long r22) {
        /*
            r18 = this;
            r5 = 11
            r6 = r21
            boolean r0 = X.C66137MDp.A02(r5, r6)
            r2 = r18
            if (r0 == 0) goto L_0x002a
            r3 = r6
            X.MDp r3 = (X.C66137MDp) r3
            int r4 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x002a
            int r4 = r4 - r1
            r3.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r5) goto L_0x0036
            java.lang.Object r0 = r3.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r0
            goto L_0x0030
        L_0x002a:
            X.MDp r3 = new X.MDp
            r3.<init>(r2, r6, r5)
            goto L_0x001a
        L_0x0030:
            X.0eS.A00(r4)     // Catch:{ SQLException -> 0x0034 }
            goto L_0x00ac
        L_0x0034:
            r3 = move-exception
            goto L_0x009b
        L_0x0036:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003e:
            X.0eS.A00(r4)
            X.93J r13 = r2.A03     // Catch:{ SQLException -> 0x0099 }
            r0 = r19
            java.lang.String r8 = r0.A01     // Catch:{ SQLException -> 0x0099 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ SQLException -> 0x0099 }
            r0 = 10
            r4 = r20
            int r0 = X.0Yv.A1E(r4, r0)     // Catch:{ SQLException -> 0x0099 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLException -> 0x0099 }
            r15.<init>(r0)     // Catch:{ SQLException -> 0x0099 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SQLException -> 0x0099 }
        L_0x005c:
            boolean r0 = r4.hasNext()     // Catch:{ SQLException -> 0x0099 }
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r4.next()     // Catch:{ SQLException -> 0x0099 }
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ SQLException -> 0x0099 }
            java.lang.String r7 = r0.A30()     // Catch:{ SQLException -> 0x0099 }
            if (r7 == 0) goto L_0x007c
            byte[] r9 = X.1Xv.A0A(r0)     // Catch:{ SQLException -> 0x0099 }
            r10 = 0
            X.5xR r6 = new X.5xR     // Catch:{ SQLException -> 0x0099 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ SQLException -> 0x0099 }
            r15.add(r6)     // Catch:{ SQLException -> 0x0099 }
            goto L_0x005c
        L_0x007c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLException -> 0x0099 }
            r0.<init>(r1)     // Catch:{ SQLException -> 0x0099 }
            throw r0     // Catch:{ SQLException -> 0x0099 }
        L_0x0084:
            r3.A01 = r2     // Catch:{ SQLException -> 0x0099 }
            r3.A00 = r5     // Catch:{ SQLException -> 0x0099 }
            X.3oI r0 = r13.A01     // Catch:{ SQLException -> 0x0099 }
            X.9Qr r12 = new X.9Qr     // Catch:{ SQLException -> 0x0099 }
            r16 = r22
            r14 = r8
            r12.<init>(r13, r14, r15, r16)     // Catch:{ SQLException -> 0x0099 }
            java.lang.Object r0 = X.AnonymousClass1t4.A00(r0, r3, r12)     // Catch:{ SQLException -> 0x0099 }
            if (r0 != r1) goto L_0x00ac
            return r1
        L_0x0099:
            r3 = move-exception
            r0 = r2
        L_0x009b:
            java.lang.String r2 = "replaceAll"
            X.0fA r1 = r0.A00
            r0 = 817892378(0x30c00c1a, float:1.3973278E-9)
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.ERJ(r3)
            r0.report()
        L_0x00ac:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A00(X.93C, java.util.Collection, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass93C r19, java.util.Collection r20, X.AnonymousClass4D7 r21, long r22, boolean r24) {
        /*
            r18 = this;
            r5 = 38
            r6 = r21
            boolean r0 = X.AnonymousClass9JX.A00(r5, r6)
            r3 = r18
            if (r0 == 0) goto L_0x002a
            r4 = r6
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r5) goto L_0x0038
            java.lang.Object r0 = r4.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r0
            goto L_0x0030
        L_0x002a:
            X.9JX r4 = new X.9JX
            r4.<init>(r3, r6, r5)
            goto L_0x001a
        L_0x0030:
            X.0eS.A00(r1)     // Catch:{ SQLException -> 0x0035 }
            goto L_0x011f
        L_0x0035:
            r4 = move-exception
            goto L_0x010e
        L_0x0038:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0040:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r9 = r3.A01
            X.0Tu r6 = X.0Tu.A06
            r0 = 36331089702306697(0x8112ef00024389, double:3.039265649070093E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            r8 = r20
            if (r0 == 0) goto L_0x00af
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a4
            if (r24 == 0) goto L_0x0081
            r0 = 36331089702830992(0x8112ef000a4390, double:3.0392656494016593E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x0081
            X.3uP r7 = X.C255593uO.A00(r9)
            java.lang.Object r0 = X.00k.A09(r8)
            X.1Xj r0 = (X.1Xj) r0
            X.3WR r6 = r0.CEL()
            java.lang.String r1 = "FlashMediaLocalDataSource"
            X.3vO r0 = new X.3vO
            r0.<init>(r6, r1)
            r7.A01(r0)
        L_0x0081:
            X.93L r10 = X.AnonymousClass93K.A00(r9)
            java.lang.Object r9 = X.00k.A09(r8)
            X.1Xj r9 = (X.1Xj) r9
            java.lang.String r7 = "writeMostRecentReelsCacheItem"
            r0 = 0
            X.0qQ.A0B(r9, r0)
            com.facebook.stash.core.Stash r6 = r10.A00     // Catch:{ FileNotFoundException | IOException -> 0x009f }
            java.lang.String r1 = "most_recent_reels_cache_item"
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i     // Catch:{ FileNotFoundException | IOException -> 0x009f }
            byte[] r0 = X.1Xv.A0A(r9)     // Catch:{ FileNotFoundException | IOException -> 0x009f }
            r6.write(r1, r0)     // Catch:{ FileNotFoundException | IOException -> 0x009f }
            goto L_0x00af
        L_0x009f:
            r0 = move-exception
            X.AnonymousClass93L.A00(r10, r7, r0)
            goto L_0x00af
        L_0x00a4:
            X.93L r0 = X.AnonymousClass93K.A00(r9)
            com.facebook.stash.core.Stash r1 = r0.A00
            java.lang.String r0 = "most_recent_reels_cache_item"
            r1.remove(r0)
        L_0x00af:
            X.93J r7 = r3.A03     // Catch:{ SQLException -> 0x010c }
            r0 = r19
            java.lang.String r13 = r0.A01     // Catch:{ SQLException -> 0x010c }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ SQLException -> 0x010c }
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)     // Catch:{ SQLException -> 0x010c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ SQLException -> 0x010c }
            r6.<init>(r0)     // Catch:{ SQLException -> 0x010c }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLException -> 0x010c }
        L_0x00c8:
            r16 = r9
            boolean r0 = r8.hasNext()     // Catch:{ SQLException -> 0x010c }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r8.next()     // Catch:{ SQLException -> 0x010c }
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ SQLException -> 0x010c }
            java.lang.String r12 = r0.A30()     // Catch:{ SQLException -> 0x010c }
            if (r12 == 0) goto L_0x00ed
            byte[] r14 = X.1Xv.A0A(r0)     // Catch:{ SQLException -> 0x010c }
            r0 = -1
            long r9 = r9 + r0
            r15 = 0
            X.5xR r11 = new X.5xR     // Catch:{ SQLException -> 0x010c }
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ SQLException -> 0x010c }
            r6.add(r11)     // Catch:{ SQLException -> 0x010c }
            goto L_0x00c8
        L_0x00ed:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLException -> 0x010c }
            r0.<init>(r1)     // Catch:{ SQLException -> 0x010c }
            throw r0     // Catch:{ SQLException -> 0x010c }
        L_0x00f5:
            r4.A01 = r3     // Catch:{ SQLException -> 0x010c }
            r4.A00 = r5     // Catch:{ SQLException -> 0x010c }
            X.3oI r1 = r7.A01     // Catch:{ SQLException -> 0x010c }
            X.9Qr r0 = new X.9Qr     // Catch:{ SQLException -> 0x010c }
            r10 = r22
            r8 = r13
            r9 = r6
            r6 = r0
            r6.<init>(r7, r8, r9, r10)     // Catch:{ SQLException -> 0x010c }
            java.lang.Object r0 = X.AnonymousClass1t4.A00(r1, r4, r0)     // Catch:{ SQLException -> 0x010c }
            if (r0 != r2) goto L_0x011f
            return r2
        L_0x010c:
            r4 = move-exception
            r0 = r3
        L_0x010e:
            java.lang.String r2 = "replaceAllMaintainOrder"
            X.0fA r1 = r0.A00
            r0 = 817892378(0x30c00c1a, float:1.3973278E-9)
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.ERJ(r4)
            r0.report()
        L_0x011f:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A01(X.93C, java.util.Collection, X.4D7, long, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass93C r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 12
            boolean r0 = X.C66137MDp.A02(r3, r12)
            if (r0 == 0) goto L_0x00a0
            r5 = r12
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 != r9) goto L_0x00a7
            java.lang.Object r5 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r5
            X.0eS.A00(r1)
        L_0x0028:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0033:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r4.next()
            X.5xR r0 = (X.C300575xR) r0
            com.instagram.common.session.UserSession r1 = r5.A01     // Catch:{ IOException -> 0x0051 }
            byte[] r0 = r0.A04     // Catch:{ IOException -> 0x0051 }
            X.9IV r1 = X.C266884aV.A00(r1, r0)     // Catch:{ IOException -> 0x0051 }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x0051 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ IOException -> 0x0051 }
            if (r0 != 0) goto L_0x0050
            java.lang.Object r0 = r1.A01     // Catch:{ IOException -> 0x0051 }
            goto L_0x0064
        L_0x0050:
            throw r0     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            X.0fA r2 = r5.A00
            r1 = 817892378(0x30c00c1a, float:1.3973278E-9)
            java.lang.String r0 = "retrieveAllByType"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.ERJ(r3)
            r0.report()
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0033
            r6.add(r0)
            goto L_0x0033
        L_0x006a:
            X.0eS.A00(r1)
            X.93J r7 = r10.A03
            java.lang.String r8 = r11.A01
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r11.A00
            long r1 = r1 - r3
            r5.A01 = r10
            r5.A00 = r9
            java.lang.String r4 = "\n    SELECT *\n    FROM medias\n    WHERE type = ?\n      AND stored_time > ?"
            r3 = 2
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r4, r3)
            r0.ADh(r9, r8)
            r0.ADa(r3, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r7.A01
            X.AsL r1 = new X.AsL
            r1.<init>(r0, r7)
            r0 = 0
            java.lang.Object r1 = X.1wR.A00(r3, r2, r1, r5, r0)
            if (r1 == r6) goto L_0x00af
            r5 = r10
            goto L_0x0028
        L_0x00a0:
            X.MDp r5 = new X.MDp
            r5.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00a7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00af:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A02(X.93C, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass93C r11, X.AnonymousClass4D7 r12, long r13) {
        /*
            r10 = this;
            r3 = 39
            boolean r0 = X.AnonymousClass9JX.A00(r3, r12)
            if (r0 == 0) goto L_0x00a4
            r5 = r12
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a4
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r9 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 != r9) goto L_0x00ab
            java.lang.Object r5 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = (com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource) r5
            X.0eS.A00(r1)
        L_0x0028:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x0033:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r4.next()
            X.5xR r0 = (X.C300575xR) r0
            com.instagram.common.session.UserSession r1 = r5.A01     // Catch:{ IOException -> 0x0051 }
            byte[] r0 = r0.A04     // Catch:{ IOException -> 0x0051 }
            X.9IV r1 = X.C266884aV.A00(r1, r0)     // Catch:{ IOException -> 0x0051 }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x0051 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ IOException -> 0x0051 }
            if (r0 != 0) goto L_0x0050
            java.lang.Object r0 = r1.A01     // Catch:{ IOException -> 0x0051 }
            goto L_0x0064
        L_0x0050:
            throw r0     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            X.0fA r2 = r5.A00
            r1 = 817892378(0x30c00c1a, float:1.3973278E-9)
            java.lang.String r0 = "retrieveSomeByType"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.ERJ(r3)
            r0.report()
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0033
            r6.add(r0)
            goto L_0x0033
        L_0x006a:
            X.0eS.A00(r1)
            X.93J r7 = r10.A03
            java.lang.String r8 = r11.A01
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r11.A00
            long r1 = r1 - r3
            r5.A01 = r10
            r5.A00 = r9
            java.lang.String r4 = "\n    SELECT *\n    FROM medias\n    WHERE type = ?\n      AND stored_time > ?\n    LIMIT ?"
            r3 = 3
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r4 = X.1Wa.A00(r4, r3)
            r4.ADh(r9, r8)
            r0 = 2
            r4.ADa(r0, r1)
            r4.ADa(r3, r13)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r7.A01
            X.AsI r1 = new X.AsI
            r1.<init>(r4, r7)
            r0 = 0
            java.lang.Object r1 = X.1wR.A00(r3, r2, r1, r5, r0)
            if (r1 == r6) goto L_0x00b3
            r5 = r10
            goto L_0x0028
        L_0x00a4:
            X.9JX r5 = new X.9JX
            r5.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00ab:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource.A03(X.93C, X.4D7, long):java.lang.Object");
    }
}
