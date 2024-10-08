package com.instagram.ar.core.effectcollection.persistence;

import X.0qQ;
import X.1V8;
import X.1V9;
import X.1VA;
import X.1VC;
import X.AnonymousClass1VF;
import X.C311776dH;
import X.C311786dI;
import X.C311976dc;
import X.C60960kU;
import X.C61410nE;
import android.content.Context;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase_Impl;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;

public final class RoomEffectCollectionRepository {
    public final C311976dc A00;
    public final C61410nE A01;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096 A[Catch:{ SQLiteException -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C346197ul r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r12 = this;
            r3 = 7
            boolean r0 = X.AnonymousClass9JU.A00(r3, r14)
            if (r0 == 0) goto L_0x0022
            r6 = r14
            X.9JU r6 = (X.AnonymousClass9JU) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r6.A01
            X.1Hj r7 = X.1Hj.A02
            int r1 = r6.A00
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r5) goto L_0x002a
            goto L_0x008f
        L_0x0022:
            r0 = 42
            X.9JU r6 = new X.9JU
            r6.<init>(r12, r14, r3, r0)
            goto L_0x0015
        L_0x002a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0032:
            X.0eS.A00(r0)
            X.6dc r8 = r12.A00     // Catch:{ SQLiteException -> 0x009b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x009b }
            r2 = 0
            X.0qQ.A0B(r13, r2)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.Object r11 = r13.A00     // Catch:{ SQLiteException -> 0x009b }
            X.9Ih r11 = (X.C376519Ih) r11     // Catch:{ SQLiteException -> 0x009b }
            java.lang.Object r9 = r11.A01     // Catch:{ SQLiteException -> 0x009b }
            X.8cI r9 = (X.C359218cI) r9     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r4 = r13.A01     // Catch:{ SQLiteException -> 0x009b }
            boolean r2 = r13.A02     // Catch:{ SQLiteException -> 0x009b }
            X.7ud r10 = X.C346187uk.A01(r9, r4, r0, r2)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.Object r4 = r11.A02     // Catch:{ SQLiteException -> 0x009b }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x009b }
            r2 = 10
            int r2 = X.0Yv.A1E(r4, r2)     // Catch:{ SQLiteException -> 0x009b }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x009b }
            r9.<init>(r2)     // Catch:{ SQLiteException -> 0x009b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SQLiteException -> 0x009b }
        L_0x0062:
            boolean r2 = r4.hasNext()     // Catch:{ SQLiteException -> 0x009b }
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r4.next()     // Catch:{ SQLiteException -> 0x009b }
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2     // Catch:{ SQLiteException -> 0x009b }
            X.7ug r2 = X.C346187uk.A00(r2, r0)     // Catch:{ SQLiteException -> 0x009b }
            r9.add(r2)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x0062
        L_0x0076:
            X.7uj r4 = new X.7uj     // Catch:{ SQLiteException -> 0x009b }
            r4.<init>(r10, r9)     // Catch:{ SQLiteException -> 0x009b }
            r2 = 0
            if (r15 == 0) goto L_0x007f
            r2 = 1
        L_0x007f:
            r6.A00 = r5     // Catch:{ SQLiteException -> 0x009b }
            X.3oI r1 = r8.A07     // Catch:{ SQLiteException -> 0x009b }
            X.7yy r0 = new X.7yy     // Catch:{ SQLiteException -> 0x009b }
            r0.<init>(r8, r4, r2)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.Object r0 = X.AnonymousClass1t4.A00(r1, r6, r0)     // Catch:{ SQLiteException -> 0x009b }
            if (r0 != r7) goto L_0x0092
            return r7
        L_0x008f:
            X.0eS.A00(r0)     // Catch:{ SQLiteException -> 0x009b }
        L_0x0092:
            X.7uj r0 = (X.C346177uj) r0     // Catch:{ SQLiteException -> 0x009b }
            if (r0 == 0) goto L_0x00a3
            X.7ul r3 = X.C346187uk.A03(r0)     // Catch:{ SQLiteException -> 0x009b }
            return r3
        L_0x009b:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting collection"
            X.0wb.A05(r1, r0, r5, r2)
        L_0x00a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A03(X.7ul, X.4D7, boolean):java.lang.Object");
    }

    public /* synthetic */ RoomEffectCollectionRepository(UserSession userSession) {
        C311976dc r2;
        C311776dH r22 = EffectCollectionDatabase.A00;
        Class<EffectCollectionDatabase> cls = EffectCollectionDatabase.class;
        UserSession userSession2 = userSession;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession2.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r22) {
                igRoomDatabase = (IgRoomDatabase) userSession2.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession2, r22));
                    1VC.A00(A002, 474693601, 141850174, false);
                    A002.A03(new AnonymousClass1VF[]{C311786dI.A08, C311786dI.A09, C311786dI.A0A, C311786dI.A0B, C311786dI.A0C, C311786dI.A0D, C311786dI.A0E, C311786dI.A0F, C311786dI.A0G, C311786dI.A00, C311786dI.A01, C311786dI.A02, C311786dI.A03, C311786dI.A04, C311786dI.A05, C311786dI.A06, C311786dI.A07});
                    A002.A05 = true;
                    A002.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession2.A04(cls, igRoomDatabase);
                }
            }
        }
        EffectCollectionDatabase_Impl effectCollectionDatabase_Impl = (EffectCollectionDatabase_Impl) ((EffectCollectionDatabase) igRoomDatabase);
        if (effectCollectionDatabase_Impl.A00 != null) {
            r2 = effectCollectionDatabase_Impl.A00;
        } else {
            synchronized (effectCollectionDatabase_Impl) {
                if (effectCollectionDatabase_Impl.A00 == null) {
                    effectCollectionDatabase_Impl.A00 = new C311976dc(effectCollectionDatabase_Impl);
                }
                r2 = effectCollectionDatabase_Impl.A00;
            }
        }
        C61410nE r1 = C61410nE.A00;
        0qQ.A0B(r2, 2);
        0qQ.A0B(r1, 3);
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C359218cI r10, com.instagram.camera.effect.models.CameraAREffect r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r3 = 13
            boolean r0 = X.ME4.A03(r3, r12)
            if (r0 == 0) goto L_0x0022
            r7 = r12
            X.ME4 r7 = (X.ME4) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A01
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r6) goto L_0x002e
            goto L_0x002a
        L_0x0022:
            r0 = 42
            X.ME4 r7 = new X.ME4
            r7.<init>(r9, r12, r3, r0)
            goto L_0x0016
        L_0x002a:
            X.0eS.A00(r1)     // Catch:{ SQLiteException -> 0x0059 }
            goto L_0x0061
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.0eS.A00(r1)
            long r1 = java.lang.System.currentTimeMillis()
            X.6dc r5 = r9.A00     // Catch:{ SQLiteException -> 0x0059 }
            X.7ug r4 = X.C346187uk.A00(r11, r1)     // Catch:{ SQLiteException -> 0x0059 }
            r3 = 0
            r0 = 0
            X.7ud r2 = X.C346187uk.A01(r10, r3, r1, r0)     // Catch:{ SQLiteException -> 0x0059 }
            r7.A00 = r6     // Catch:{ SQLiteException -> 0x0059 }
            X.3oI r1 = r5.A07     // Catch:{ SQLiteException -> 0x0059 }
            X.MBV r0 = new X.MBV     // Catch:{ SQLiteException -> 0x0059 }
            r0.<init>(r4, r5, r2)     // Catch:{ SQLiteException -> 0x0059 }
            java.lang.Object r0 = X.AnonymousClass1t4.A00(r1, r7, r0)     // Catch:{ SQLiteException -> 0x0059 }
            if (r0 != r8) goto L_0x0061
            return r8
        L_0x0059:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effect into collection"
            X.0wb.A05(r1, r0, r6, r2)
        L_0x0061:
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A00(X.8cI, com.instagram.camera.effect.models.CameraAREffect, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C359218cI r12, java.lang.Integer r13, X.AnonymousClass4D7 r14, long r15) {
        /*
            r11 = this;
            r4 = 9
            boolean r0 = X.AnonymousClass9JU.A00(r4, r14)
            if (r0 == 0) goto L_0x0056
            r2 = r14
            X.9JU r2 = (X.AnonymousClass9JU) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0056
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r1 = r2.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r5) goto L_0x0060
            X.0eS.A00(r1)
        L_0x0024:
            X.7uj r1 = (X.C346177uj) r1
            if (r1 == 0) goto L_0x005e
            X.7ul r4 = X.C346187uk.A03(r1)
            return r4
        L_0x002d:
            X.0eS.A00(r1)
            X.6dc r6 = r11.A00
            java.lang.String r3 = r12.A02
            java.lang.String r1 = r12.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 95
            java.lang.String r8 = X.002.A0T(r3, r1, r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r15
            r2.A00 = r5
            X.3oI r0 = r6.A07
            X.7ub r5 = new X.7ub
            r7 = r13
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r1 = X.AnonymousClass1t4.A00(r0, r2, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0056:
            r0 = 42
            X.9JU r2 = new X.9JU
            r2.<init>(r11, r14, r4, r0)
            goto L_0x0016
        L_0x005e:
            r4 = 0
            return r4
        L_0x0060:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A01(X.8cI, java.lang.Integer, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d0, code lost:
        if (r2 == r6) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C359218cI r11, java.util.List r12, X.AnonymousClass4D7 r13, long r14) {
        /*
            r10 = this;
            r3 = 12
            boolean r0 = X.AnonymousClass9JX.A00(r3, r13)
            if (r0 == 0) goto L_0x00d3
            r5 = r13
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d3
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 != r0) goto L_0x00da
            java.lang.Object r11 = r5.A01
            X.8cI r11 = (X.C359218cI) r11
            X.0eS.A00(r2)
        L_0x0028:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r1 = r2.next()
            X.7ug r1 = (X.C346147ug) r1
            if (r11 == 0) goto L_0x0051
            java.lang.String r0 = r11.A01
        L_0x0049:
            com.instagram.camera.effect.models.CameraAREffect r0 = X.C346187uk.A02(r1, r0)
            r6.add(r0)
            goto L_0x0039
        L_0x0051:
            r0 = 0
            goto L_0x0049
        L_0x0053:
            X.0eS.A00(r2)
            X.6dc r7 = r10.A00
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r14
            r5.A01 = r11
            r5.A00 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "\n"
            r8.append(r3)
            java.lang.String r0 = "    SELECT * FROM effects "
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = "    WHERE effectId IN("
            r8.append(r0)
            int r4 = r12.size()
            X.1wO.A00(r8, r4)
            java.lang.String r0 = ")"
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = "    AND syncedAt>="
            r8.append(r0)
            java.lang.String r0 = "?"
            r8.append(r0)
            r8.append(r3)
            java.lang.String r0 = "  "
            r8.append(r0)
            java.lang.String r3 = r8.toString()
            int r9 = r4 + 1
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r8 = X.1Wa.A00(r3, r9)
            java.util.Iterator r4 = r12.iterator()
            r3 = 1
        L_0x00aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            r8.ADh(r3, r0)
            int r3 = r3 + 1
            goto L_0x00aa
        L_0x00bc:
            r8.ADa(r9, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r7.A07
            X.9Rt r1 = new X.9Rt
            r1.<init>(r8, r7)
            r0 = 0
            java.lang.Object r2 = X.1wR.A00(r3, r2, r1, r5, r0)
            if (r2 != r6) goto L_0x0028
        L_0x00d2:
            return r6
        L_0x00d3:
            X.9JX r5 = new X.9JX
            r5.<init>(r10, r13, r3)
            goto L_0x0016
        L_0x00da:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A02(X.8cI, java.util.List, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 8
            boolean r0 = X.AnonymousClass9JU.A00(r3, r11)
            if (r0 == 0) goto L_0x0022
            r7 = r11
            X.9JU r7 = (X.AnonymousClass9JU) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r5) goto L_0x002e
            goto L_0x002a
        L_0x0022:
            r0 = 42
            X.9JU r7 = new X.9JU
            r7.<init>(r9, r11, r3, r0)
            goto L_0x0016
        L_0x002a:
            X.0eS.A00(r1)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x007b
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.0eS.A00(r1)
            X.6dc r8 = r9.A00     // Catch:{ SQLiteException -> 0x0072 }
            r0 = 10
            int r0 = X.0Yv.A1E(r10, r0)     // Catch:{ SQLiteException -> 0x0072 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0072 }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x0072 }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ SQLiteException -> 0x0072 }
        L_0x004a:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteException -> 0x0072 }
            if (r0 == 0) goto L_0x0062
            java.lang.Object r2 = r3.next()     // Catch:{ SQLiteException -> 0x0072 }
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2     // Catch:{ SQLiteException -> 0x0072 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0072 }
            X.7ug r0 = X.C346187uk.A00(r2, r0)     // Catch:{ SQLiteException -> 0x0072 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x0072 }
            goto L_0x004a
        L_0x0062:
            r7.A00 = r5     // Catch:{ SQLiteException -> 0x0072 }
            X.3oI r1 = r8.A07     // Catch:{ SQLiteException -> 0x0072 }
            X.7z2 r0 = new X.7z2     // Catch:{ SQLiteException -> 0x0072 }
            r0.<init>(r8, r4)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)     // Catch:{ SQLiteException -> 0x0072 }
            if (r0 != r6) goto L_0x007b
            return r6
        L_0x0072:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effects"
            X.0wb.A05(r1, r0, r5, r2)
            r5 = 0
        L_0x007b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A04(java.util.List, X.4D7):java.lang.Object");
    }
}
