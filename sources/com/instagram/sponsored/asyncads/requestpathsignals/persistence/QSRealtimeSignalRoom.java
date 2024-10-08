package com.instagram.sponsored.asyncads.requestpathsignals.persistence;

import X.1VA;
import X.1VC;
import X.C65608Lwj;
import X.JTS;
import X.LS6;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalDatabase;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalDatabase_Impl;

public final class QSRealtimeSignalRoom {
    public final UserSession A00;
    public final LS6 A01;
    public final QSRealtimeSignalDatabase A02;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        if (r2 == r3) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.Collection r22, X.AnonymousClass4D7 r23, long r24) {
        /*
            r21 = this;
            r3 = 5
            r4 = r23
            boolean r0 = X.C66139MDr.A01(r3, r4)
            r5 = r21
            if (r0 == 0) goto L_0x010e
            r6 = r4
            X.MDr r6 = (X.C66139MDr) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0019:
            java.lang.Object r2 = r6.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r6.A00
            r0 = 1
            if (r1 == 0) goto L_0x00f3
            if (r1 != r0) goto L_0x012a
            X.0eS.A00(r2)
        L_0x0027:
            java.util.List r2 = (java.util.List) r2
            int r0 = X.JTT.A08(r2)
            java.util.LinkedHashMap r3 = X.DbS.A0x(r0)
            java.util.Iterator r12 = r2.iterator()
        L_0x0035:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r10 = r12.next()
            X.JuU r10 = (X.C60972JuU) r10
            java.lang.String r4 = r10.A07
            java.lang.String r6 = r10.A08
            X.2v9[] r5 = X.C233162v9.values()
            int r2 = r5.length
            r1 = 0
        L_0x004b:
            if (r1 >= r2) goto L_0x0123
            r9 = r5[r1]
            java.lang.String r0 = r9.A01
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x00ef
            X.4EC r8 = r10.A02
            java.lang.String r6 = r10.A09
            X.2pc[] r5 = X.C230432pc.values()
            int r2 = r5.length
            r1 = 0
        L_0x0061:
            if (r1 >= r2) goto L_0x011c
            r7 = r5[r1]
            java.lang.String r0 = r7.A00
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r11 = r10.A06
            X.2pg[] r5 = X.C230472pg.values()
            int r2 = r5.length
            r1 = 0
        L_0x0075:
            if (r1 >= r2) goto L_0x0115
            r6 = r5[r1]
            java.lang.String r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x00e8
            X.Ju6 r0 = r10.A01
            java.lang.String r14 = r0.A01
            java.lang.String r11 = ""
            if (r14 != 0) goto L_0x008a
            r14 = r11
        L_0x008a:
            java.lang.String r15 = r0.A03
            if (r15 != 0) goto L_0x008f
            r15 = r11
        L_0x008f:
            java.lang.String r5 = r0.A02
            if (r5 != 0) goto L_0x0094
            r5 = r11
        L_0x0094:
            java.lang.String r2 = r0.A05
            if (r2 != 0) goto L_0x0099
            r2 = r11
        L_0x0099:
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x009e
            r1 = r11
        L_0x009e:
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x00a3
            r0 = r11
        L_0x00a3:
            r17 = 2
            X.9JO r13 = new X.9JO
            r16 = r5
            r18 = r2
            r19 = r1
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.9J4 r14 = new X.9J4
            r15 = r13
            r16 = r6
            r17 = r8
            r18 = r9
            r19 = r7
            r20 = r4
            r14.<init>((X.AnonymousClass9JO) r15, (X.C230472pg) r16, (X.AnonymousClass4EC) r17, (X.C233162v9) r18, (X.C230432pc) r19, (java.lang.String) r20)
            byte[] r2 = r10.A0A
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            X.16F r0 = X.16P.A00(r0)
            com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData r1 = X.AnonymousClass4iS.parseFromJson(r0)
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r14.A04
            X.2v9 r0 = (X.C233162v9) r0
            X.3qu r1 = X.C254393sP.A00(r1, r0)
            X.9IV r0 = new X.9IV
            r0.<init>((X.AnonymousClass9J4) r14, (X.C253513qu) r1)
            r3.put(r4, r0)
            goto L_0x0035
        L_0x00e8:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x00eb:
            int r1 = r1 + 1
            goto L_0x0061
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x004b
        L_0x00f3:
            X.0eS.A00(r2)
            X.LS6 r2 = r5.A01
            r6.A01 = r5
            r6.A00 = r0
            X.3oI r1 = r2.A01
            X.MBW r0 = new X.MBW
            r7 = r22
            r4 = r24
            r0.<init>(r2, r7, r4)
            java.lang.Object r2 = X.AnonymousClass1t4.A00(r1, r6, r0)
            if (r2 != r3) goto L_0x0027
        L_0x010d:
            return r3
        L_0x010e:
            X.MDr r6 = new X.MDr
            r6.<init>(r5, r4, r3)
            goto L_0x0019
        L_0x0115:
            java.lang.String r0 = "Unrecognized value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x011c:
            java.lang.String r0 = "Unrecognized value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0123:
            java.lang.String r0 = "Unrecognized value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x012a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sponsored.asyncads.requestpathsignals.persistence.QSRealtimeSignalRoom.A00(java.util.Collection, X.4D7, long):java.lang.Object");
    }

    public QSRealtimeSignalRoom(UserSession userSession) {
        LS6 ls6;
        this.A00 = userSession;
        C65608Lwj lwj = QSRealtimeSignalDatabase.A00;
        Class<QSRealtimeSignalDatabase> cls = QSRealtimeSignalDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (lwj) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, lwj, cls);
                    1VC.A00(A0F, 1648458087, 1195563475, false);
                    igRoomDatabase = JTS.A0W(A0F, userSession, cls);
                }
            }
        }
        QSRealtimeSignalDatabase qSRealtimeSignalDatabase = (QSRealtimeSignalDatabase) igRoomDatabase;
        this.A02 = qSRealtimeSignalDatabase;
        QSRealtimeSignalDatabase_Impl qSRealtimeSignalDatabase_Impl = (QSRealtimeSignalDatabase_Impl) qSRealtimeSignalDatabase;
        if (qSRealtimeSignalDatabase_Impl.A00 != null) {
            ls6 = qSRealtimeSignalDatabase_Impl.A00;
        } else {
            synchronized (qSRealtimeSignalDatabase_Impl) {
                if (qSRealtimeSignalDatabase_Impl.A00 == null) {
                    qSRealtimeSignalDatabase_Impl.A00 = new LS6(qSRealtimeSignalDatabase_Impl);
                }
                ls6 = qSRealtimeSignalDatabase_Impl.A00;
            }
        }
        this.A01 = ls6;
    }
}
