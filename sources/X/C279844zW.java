package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.persistence.NotesRoomDb;
import com.instagram.direct.inbox.notes.persistence.NotesRoomDb_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4zW  reason: invalid class name and case insensitive filesystem */
public final class C279844zW {
    public final UserSession A00;
    public final C279934zi A01;
    public final List A02;
    public final Map A03;
    public final ConcurrentHashMap A04;
    public final NotesRoomDb A05;

    public static final void A00(C279844zW r3) {
        try {
            C279934zi r0 = r3.A01;
            C251983oI r32 = r0.A01;
            r32.assertNotSuspendingTransaction();
            1Vg r2 = r0.A02;
            AnonymousClass1WV acquire = r2.acquire();
            try {
                r32.beginTransaction();
                acquire.ATQ();
                r32.setTransactionSuccessful();
                r32.endTransaction();
                r2.release(acquire);
            } catch (Throwable th) {
                r2.release(acquire);
                throw th;
            }
        } catch (Exception e) {
            0f9 AEf = 0wj.A01.AEf("deleteAll failed", 275919982);
            AEf.ERJ(e);
            AEf.report();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        X.1zE.A00(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r20) {
        /*
            r19 = this;
            r7 = r19
            A00(r7)
            java.util.concurrent.ConcurrentHashMap r6 = r7.A04
            r6.clear()
            X.4zi r5 = r7.A01     // Catch:{ Exception -> 0x00dd }
            java.util.List r1 = X.00k.A0X(r20)     // Catch:{ Exception -> 0x00dd }
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)     // Catch:{ Exception -> 0x00dd }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00dd }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00dd }
            r15 = 0
            java.util.Iterator r11 = r1.iterator()     // Catch:{ Exception -> 0x00dd }
        L_0x0020:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r9 = r11.next()     // Catch:{ Exception -> 0x00dd }
            int r10 = r15 + 1
            if (r15 >= 0) goto L_0x0033
            X.0sr.A1T()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00b4
        L_0x0033:
            java.util.List r0 = r7.A02     // Catch:{ Exception -> 0x00dd }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x00dd }
        L_0x0039:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x00dd }
            r8 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Object r8 = r3.next()     // Catch:{ Exception -> 0x00dd }
            r2 = r8
            X.4zY r2 = (X.AnonymousClass4zY) r2     // Catch:{ Exception -> 0x00dd }
            java.lang.Class r1 = r9.getClass()     // Catch:{ Exception -> 0x00dd }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.Class r0 = r2.A00     // Catch:{ Exception -> 0x00dd }
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x0039
        L_0x0057:
            boolean r0 = r8 instanceof X.AnonymousClass4zY     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x0097
            X.4zY r8 = (X.AnonymousClass4zY) r8     // Catch:{ Exception -> 0x00dd }
            if (r8 == 0) goto L_0x0097
            java.lang.String r1 = r8.A01(r9)     // Catch:{ Exception -> 0x00dd }
            r2 = 58
            boolean r0 = r8 instanceof X.C279854zX     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x006b
            r3 = 0
            goto L_0x006c
        L_0x006b:
            r3 = 1
        L_0x006c:
            java.lang.String r1 = X.002.A0G(r1, r2, r3)     // Catch:{ Exception -> 0x00dd }
            X.9IM r0 = new X.9IM     // Catch:{ Exception -> 0x00dd }
            r0.<init>((int) r15, (java.lang.Object) r9)     // Catch:{ Exception -> 0x00dd }
            r6.put(r1, r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r8.A01(r9)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r13 = X.002.A0G(r0, r2, r3)     // Catch:{ Exception -> 0x00dd }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00dd }
            r2.<init>()     // Catch:{ Exception -> 0x00dd }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00dd }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ Exception -> 0x00dd }
            X.17W r1 = r0.A0A(r1)     // Catch:{ Exception -> 0x00dd }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x00b9 }
            r8.A02(r1, r9)     // Catch:{ all -> 0x00b9 }
            goto L_0x0099
        L_0x0097:
            r12 = 0
            goto L_0x00ae
        L_0x0099:
            r1.close()     // Catch:{ Exception -> 0x00dd }
            byte[] r14 = r2.toByteArray()     // Catch:{ Exception -> 0x00dd }
            X.0qQ.A07(r14)     // Catch:{ Exception -> 0x00dd }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00dd }
            X.9bs r12 = new X.9bs     // Catch:{ Exception -> 0x00dd }
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00dd }
        L_0x00ae:
            r4.add(r12)     // Catch:{ Exception -> 0x00dd }
            r15 = r10
            goto L_0x0020
        L_0x00b4:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00dc
        L_0x00b9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00bb:
            java.util.List r2 = X.00k.A0X(r4)     // Catch:{ Exception -> 0x00dd }
            X.3oI r1 = r5.A01     // Catch:{ Exception -> 0x00dd }
            r1.assertNotSuspendingTransaction()     // Catch:{ Exception -> 0x00dd }
            r1.beginTransaction()     // Catch:{ Exception -> 0x00dd }
            X.1Vf r0 = r5.A00     // Catch:{ all -> 0x00d3 }
            r0.insert(r2)     // Catch:{ all -> 0x00d3 }
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x00d3 }
            r1.endTransaction()     // Catch:{ Exception -> 0x00dd }
            return
        L_0x00d3:
            r2 = move-exception
            r1.endTransaction()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dc
        L_0x00d8:
            r2 = move-exception
            X.1zE.A00(r1, r0)     // Catch:{ Exception -> 0x00dd }
        L_0x00dc:
            throw r2     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            r3 = move-exception
            java.lang.String r2 = "refreshStore failed"
            X.0wj r1 = X.0wj.A01
            r0 = 275919982(0x1072346e, float:4.7766475E-29)
            X.0f9 r0 = r1.AEf(r2, r0)
            r0.ERJ(r3)
            r0.report()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279844zW.A01(java.util.List):void");
    }

    public C279844zW(UserSession userSession, List list) {
        C279934zi r0;
        int i;
        this.A00 = userSession;
        this.A02 = list;
        C279914zf r5 = NotesRoomDb.A00;
        Class<NotesRoomDb> cls = NotesRoomDb.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r5));
                    1VC.A00(A002, 398401248, 1176005792, true);
                    A002.A01();
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        NotesRoomDb notesRoomDb = (NotesRoomDb) igRoomDatabase;
        this.A05 = notesRoomDb;
        NotesRoomDb_Impl notesRoomDb_Impl = (NotesRoomDb_Impl) notesRoomDb;
        if (notesRoomDb_Impl.A00 != null) {
            r0 = notesRoomDb_Impl.A00;
        } else {
            synchronized (notesRoomDb_Impl) {
                if (notesRoomDb_Impl.A00 == null) {
                    notesRoomDb_Impl.A00 = new C279934zi(notesRoomDb_Impl);
                }
                r0 = notesRoomDb_Impl.A00;
            }
        }
        this.A01 = r0;
        int A0L = 0se.A0L(0Yv.A1E(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (Object next : list) {
            if (((AnonymousClass4zY) next) instanceof C279854zX) {
                i = 0;
            } else {
                i = 1;
            }
            linkedHashMap.put(Integer.valueOf(i), next);
        }
        this.A03 = linkedHashMap;
        this.A04 = new ConcurrentHashMap();
    }
}
