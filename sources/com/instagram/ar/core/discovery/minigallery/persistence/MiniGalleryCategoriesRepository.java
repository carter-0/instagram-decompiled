package com.instagram.ar.core.discovery.minigallery.persistence;

import X.0qQ;
import X.1V8;
import X.1V9;
import X.1VA;
import X.1VC;
import X.AnonymousClass1VF;
import X.AnonymousClass86J;
import X.AnonymousClass86K;
import X.AnonymousClass86O;
import X.C60960kU;
import X.C61410nE;
import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase_Impl;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.concurrent.TimeUnit;

public final class MiniGalleryCategoriesRepository {
    public final long A00;
    public final AnonymousClass86O A01;
    public final C61410nE A02;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.9JY] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[LOOP:0: B:10:0x003a->B:12:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass849 r11, X.AnonymousClass4D7 r12, long r13) {
        /*
            r10 = this;
            r9 = 2
            boolean r0 = X.AnonymousClass9JY.A00(r9, r12)
            if (r0 == 0) goto L_0x0096
            r6 = r12
            X.9JY r6 = (X.AnonymousClass9JY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0096
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r8) goto L_0x009d
            long r13 = r6.A01
            java.lang.Object r7 = r6.A02
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r7 = (com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository) r7
            X.0eS.A00(r1)
        L_0x0029:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x003a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r6.next()
            X.7iY r1 = (X.C338797iY) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r4 = r1.A01
            java.lang.String r3 = r1.A02
            java.lang.String r0 = r1.A04
            X.849 r2 = X.AnonymousClass849.valueOf(r0)
            boolean r1 = r1.A05
            X.9JA r0 = new X.9JA
            r0.<init>((X.AnonymousClass849) r2, (java.lang.String) r4, (java.lang.String) r3, (boolean) r1)
            r5.add(r0)
            goto L_0x003a
        L_0x005f:
            X.0eS.A00(r1)
            X.86O r5 = r10.A01
            java.lang.String r4 = r11.name()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r13
            r6.A02 = r10
            r6.A01 = r13
            r6.A00 = r8
            java.lang.String r3 = "\n        SELECT * FROM mini_gallery_categories  \n        WHERE miniGallerySurface=? and syncedAt\n        AND syncedAt>=?\n  "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r3, r9)
            r0.ADh(r8, r4)
            r0.ADa(r9, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r5.A01
            X.7iS r1 = new X.7iS
            r1.<init>(r0, r5)
            r0 = 0
            java.lang.Object r1 = X.1wR.A00(r3, r2, r1, r6, r0)
            if (r1 == r7) goto L_0x00b2
            r7 = r10
            goto L_0x0029
        L_0x0096:
            X.9JY r6 = new X.9JY
            r6.<init>(r10, r12, r9)
            goto L_0x0015
        L_0x009d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            long r1 = r7.A00
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00ad:
            X.7iT r7 = new X.7iT
            r7.<init>(r0, r5)
        L_0x00b2:
            return r7
        L_0x00b3:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository.A00(X.849, X.4D7, long):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryCategoriesRepository(UserSession userSession) {
        AnonymousClass86O r2;
        AnonymousClass86J r5 = MiniGalleryDatabase.A00;
        Class<MiniGalleryDatabase> cls = MiniGalleryDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r5));
                    1VC.A00(A002, 797293936, 2023115286, false);
                    A002.A03(new AnonymousClass1VF[]{AnonymousClass86K.A00});
                    A002.A05 = true;
                    A002.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        MiniGalleryDatabase_Impl miniGalleryDatabase_Impl = (MiniGalleryDatabase_Impl) ((MiniGalleryDatabase) igRoomDatabase);
        if (miniGalleryDatabase_Impl.A00 != null) {
            r2 = miniGalleryDatabase_Impl.A00;
        } else {
            synchronized (miniGalleryDatabase_Impl) {
                if (miniGalleryDatabase_Impl.A00 == null) {
                    miniGalleryDatabase_Impl.A00 = new AnonymousClass86O(miniGalleryDatabase_Impl);
                }
                r2 = miniGalleryDatabase_Impl.A00;
            }
        }
        C61410nE r1 = C61410nE.A00;
        0qQ.A0B(r2, 2);
        0qQ.A0B(r1, 3);
        this.A01 = r2;
        this.A02 = r1;
        this.A00 = TimeUnit.DAYS.toMillis(90);
    }
}
