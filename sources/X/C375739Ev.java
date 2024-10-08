package X;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.9Ev  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C375739Ev implements Runnable {
    public final /* synthetic */ C375659En A00;
    public final /* synthetic */ C375679Ep A01;
    public final /* synthetic */ AnonymousClass385 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;

    public /* synthetic */ C375739Ev(C375659En r1, C375679Ep r2, AnonymousClass385 r3, String str, C62320sa r5) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }

    public final void run() {
        Throwable th;
        String str;
        Throwable illegalStateException;
        AnonymousClass385 r8 = this.A02;
        String str2 = this.A03;
        C375679Ep r7 = this.A01;
        C62320sa r3 = this.A04;
        C375659En r6 = this.A00;
        0qQ.A0B(r7, 2);
        0qQ.A0B(r3, 3);
        WorkDatabase workDatabase = r8.A04;
        C2377438z A05 = workDatabase.A05();
        ArrayList CGj = A05.CGj(str2);
        if (CGj.size() > 1) {
            str = "Can't apply UPDATE policy to the chains of work.";
        } else {
            AnonymousClass9FR r1 = (AnonymousClass9FR) 00k.A0J(CGj);
            if (r1 != null) {
                String str3 = r1.A01;
                AnonymousClass3DG CGi = A05.CGi(str3);
                if (CGi == null) {
                    illegalStateException = new IllegalStateException(002.A11("WorkSpec with ", str3, ", that matches a name \"", str2, "\", wasn't found"));
                    r7.A00(new C375729Eu(illegalStateException));
                } else if (!CGi.A02()) {
                    str = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.";
                } else if (r1.A00 == C2379139t.CANCELLED) {
                    A05.AOP(str3);
                } else {
                    AnonymousClass3DG r4 = r6.A00;
                    C2379139t r48 = r4.A0E;
                    String str4 = r4.A0I;
                    String str5 = r4.A0H;
                    C255323tw r12 = r4.A0C;
                    C255323tw r11 = r4.A0D;
                    long j = r4.A05;
                    long j2 = r4.A06;
                    long j3 = r4.A04;
                    C255343ty r9 = r4.A0B;
                    int i = r4.A02;
                    Integer num = r4.A0F;
                    long j4 = r4.A03;
                    long j5 = r4.A07;
                    long j6 = r4.A08;
                    long j7 = r4.A0A;
                    boolean z = r4.A0J;
                    Integer num2 = r4.A0G;
                    int i2 = r4.A01;
                    int i3 = r4.A0K;
                    long j8 = r4.A09;
                    int i4 = r4.A00;
                    0qQ.A0B(str3, 0);
                    0qQ.A0B(str5, 3);
                    0qQ.A0B(r12, 4);
                    0qQ.A0B(r11, 5);
                    0qQ.A0B(r9, 9);
                    boolean z2 = z;
                    AnonymousClass3DG r14 = new AnonymousClass3DG(r9, r12, r11, r48, num, num2, str3, str4, str5, i, i2, i3, i4, r4.A0L, j, j2, j3, j4, j5, j6, j7, j8, z2);
                    try {
                        AnonymousClass39K r92 = r8.A03;
                        0qQ.A07(r92);
                        0qQ.A07(r8.A02);
                        List<AnonymousClass39P> list = r8.A07;
                        0qQ.A07(list);
                        Set set = r6.A01;
                        String str6 = r14.A0M;
                        AnonymousClass3DG CGi2 = workDatabase.A05().CGi(str6);
                        if (CGi2 != null) {
                            if (!CGi2.A0E.A00()) {
                                if (!(CGi2.A02() ^ r14.A02())) {
                                    boolean A052 = r92.A05(str6);
                                    if (!A052) {
                                        for (AnonymousClass39P AG6 : list) {
                                            AG6.AG6(str6);
                                        }
                                    }
                                    workDatabase.runInTransaction((Runnable) new AnonymousClass9FZ(workDatabase, CGi2, r14, str6, list, set, A052));
                                    if (!A052) {
                                        C255313tv.A00(workDatabase, list);
                                    }
                                } else {
                                    C41678AyV ayV = C41678AyV.A00;
                                    th = new UnsupportedOperationException(002.A11("Can't update ", (String) ayV.invoke(CGi2), " Worker to ", (String) ayV.invoke(r14), " Worker. Update operation must preserve worker's type."));
                                }
                            }
                            r7.A00(C375689Eq.A01);
                            return;
                        }
                        th = new IllegalArgumentException(002.A0g("Worker with ", str6, C273654mx.A00(433)));
                        throw th;
                    } catch (Throwable th2) {
                        r7.A00(new C375729Eu(th2));
                        return;
                    }
                }
            }
            r3.invoke();
            return;
        }
        illegalStateException = new UnsupportedOperationException(str);
        r7.A00(new C375729Eu(illegalStateException));
    }
}
