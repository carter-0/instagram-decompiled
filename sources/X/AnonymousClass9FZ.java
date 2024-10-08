package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* renamed from: X.9FZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9FZ implements Runnable {
    public final /* synthetic */ WorkDatabase A00;
    public final /* synthetic */ AnonymousClass3DG A01;
    public final /* synthetic */ AnonymousClass3DG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass9FZ(WorkDatabase workDatabase, AnonymousClass3DG r2, AnonymousClass3DG r3, String str, List list, Set set, boolean z) {
        this.A00 = workDatabase;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = list;
        this.A03 = str;
        this.A05 = set;
        this.A06 = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        WorkDatabase workDatabase = this.A00;
        AnonymousClass3DG r7 = this.A01;
        AnonymousClass3DG r6 = this.A02;
        String str = this.A03;
        Set set = this.A05;
        boolean z = this.A06;
        C2377438z A052 = workDatabase.A05();
        AnonymousClass391 A062 = workDatabase.A06();
        C2379139t r49 = r7.A0E;
        int i = r7.A02;
        long j = r7.A07;
        int i2 = r7.A0K + 1;
        int i3 = r7.A01;
        long j2 = r7.A09;
        int i4 = r7.A00;
        String str2 = r6.A0M;
        String str3 = r6.A0I;
        String str4 = r6.A0H;
        C255323tw r8 = r6.A0C;
        C255323tw r72 = r6.A0D;
        long j3 = r6.A05;
        long j4 = r6.A06;
        long j5 = r6.A04;
        C255343ty r12 = r6.A0B;
        Integer num = r6.A0F;
        long j6 = r6.A03;
        long j7 = r6.A08;
        long j8 = r6.A0A;
        boolean z2 = r6.A0J;
        Integer num2 = r6.A0G;
        0qQ.A0B(str4, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r72, 5);
        0qQ.A0B(r12, 9);
        AnonymousClass3DG r14 = new AnonymousClass3DG(r12, r8, r72, r49, num, num2, str2, str3, str4, i, i3, i2, i4, r6.A0L, j3, j4, j5, j6, j, j7, j8, j2, z2);
        if (r6.A00 == 1) {
            r14.A09 = r6.A09;
            r14.A00++;
        }
        C238313Bj r0 = (C238313Bj) A052;
        C251983oI r1 = r0.A02;
        r1.assertNotSuspendingTransaction();
        r1.beginTransaction();
        try {
            r0.A00.A00(r14);
            r1.setTransactionSuccessful();
            r1.endTransaction();
            C282875Fc r02 = (C282875Fc) A062;
            C251983oI r73 = r02.A01;
            r73.assertNotSuspendingTransaction();
            1Vg r62 = r02.A02;
            AnonymousClass1WV acquire = r62.acquire();
            acquire.ADh(1, str);
            r73.beginTransaction();
            try {
                acquire.ATQ();
                r73.setTransactionSuccessful();
                r73.endTransaction();
                r62.release(acquire);
                A062.CNY(str, set);
                if (!z) {
                    A052.CmC(-1, str);
                    workDatabase.A04().AOP(str);
                }
            } catch (Throwable th) {
                r73.endTransaction();
                r62.release(acquire);
                throw th;
            }
        } catch (Throwable th2) {
            r1.endTransaction();
            throw th2;
        }
    }
}
