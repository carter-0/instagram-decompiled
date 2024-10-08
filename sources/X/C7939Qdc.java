package X;

import android.os.ConditionVariable;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.Qdc  reason: case insensitive filesystem */
public final class C7939Qdc extends C251093mY implements C251073mW {
    public static final HashSet A0E = AnonymousClass7TE.A1F();
    public AnonymousClass5HZ A00;
    public boolean A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06 = 0;
    public final 29x A07;
    public final C11282SJa A08;
    public final File A09;
    public final Object A0A = Pxe.A0p();
    public final ArrayList A0B;
    public final HashMap A0C;
    public final Random A0D;

    public final synchronized long A06(String str) {
        S7Y A002;
        A002 = C11282SJa.A00(this.A08, str);
        A002.getClass();
        return C9692RfA.A00(A002.A00);
    }

    public final synchronized String A07() {
        StringBuilder A1A;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        A1A = AnonymousClass7TE.A1A();
        for (S7Y s7y : Collections.unmodifiableCollection(this.A08.A03.values())) {
            Iterator it = s7y.A04.iterator();
            while (it.hasNext()) {
                2R9 r5 = (2R9) it.next();
                A1A.append("lockDurationMs:");
                A1A.append(elapsedRealtime - r5.A01);
                A1A.append(",");
                A1A.append("waitCount:");
                A1A.append(r5.A00);
                A1A.append(",");
                A1A.append("key:");
                A1A.append(r5.A06);
                A1A.append("\r\n");
            }
        }
        return A1A.toString();
    }

    public final synchronized void A09(29x r2) {
        this.A0B.add(r2);
    }

    public final synchronized void A0B(String str, long j) {
    }

    public final synchronized void A0D() {
        AnonymousClass5HZ r0 = this.A00;
        if (r0 != null) {
            throw r0;
        }
    }

    public final synchronized NavigableSet A98(29y r3, String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        str.getClass();
        HashMap hashMap = this.A0C;
        List A1B = Pxe.A1B(str, hashMap);
        if (A1B == null) {
            A1B = AnonymousClass7TE.A1C();
            hashMap.put(str, A1B);
        }
        A1B.add(r3);
        return AjR(str);
    }

    public final synchronized void A9E(String str) {
    }

    public final synchronized void ABz(C10462Rsd rsd, String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        A0D();
        C11282SJa sJa = this.A08;
        S7Y A012 = sJa.A01(str);
        C12540Swq swq = A012.A00;
        C12540Swq A013 = swq.A01(rsd);
        A012.A00 = A013;
        if (!A013.equals(swq)) {
            ((C12539Swp) sJa.A00).A01 = true;
        }
        try {
            sJa.A03();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public final synchronized void AIT(File file, long j) {
        boolean z = true;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                C11282SJa sJa = this.A08;
                Qoa A002 = Qoa.A00(sJa, file, j);
                A002.getClass();
                S7Y A003 = C11282SJa.A00(sJa, A002.A06);
                A003.getClass();
                long j2 = A002.A04;
                long j3 = A002.A03;
                C256703wD.A04(A003.A03(j2, j3));
                long A004 = C9692RfA.A00(A003.A00);
                if (A004 != -1) {
                    if (j2 + j3 > A004) {
                        z = false;
                    }
                    C256703wD.A04(z);
                }
                A03(A002);
                try {
                    sJa.A03();
                    notifyAll();
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    public final synchronized long AjK() {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        return this.A06;
    }

    public final synchronized long AjN(long j, String str, long j2) {
        long j3;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        S7Y A002 = C11282SJa.A00(this.A08, str);
        if (A002 != null) {
            j3 = A002.A00(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    public final synchronized NavigableSet AjR(String str) {
        TreeSet treeSet;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A08, str);
        if (A002 != null) {
            TreeSet treeSet2 = A002.A04;
            if (!treeSet2.isEmpty()) {
                treeSet = new TreeSet(treeSet2);
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public final synchronized C13465Tas Aqf(String str) {
        C12540Swq swq;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A08, str);
        if (A002 != null) {
            swq = A002.A00;
        } else {
            swq = C12540Swq.A02;
        }
        return swq;
    }

    public final synchronized Set BKC() {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        return C66580MXl.A12(this.A08.A03.keySet());
    }

    public final synchronized boolean CPr(String str, long j, long j2) {
        boolean z;
        z = true;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A08, str);
        if (A002 == null || A002.A00(j, j2) < j2) {
            z = false;
        }
        return z;
    }

    public final boolean CWd(String str) {
        return true;
    }

    public final synchronized void ECd(2R9 r5) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        C11282SJa sJa = this.A08;
        S7Y A002 = C11282SJa.A00(sJa, r5.A06);
        A002.getClass();
        A002.A02(r5.A04);
        sJa.A04(A002.A02);
        notifyAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
        r1 = r2.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void EDy(X.29y r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A04     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            java.util.HashMap r1 = r2.A0C     // Catch:{ all -> 0x001b }
            java.util.List r0 = X.Pxe.A1B(r4, r1)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            r0.remove(r3)     // Catch:{ all -> 0x001b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            r1.remove(r4)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7939Qdc.EDy(X.29y, java.lang.String):void");
    }

    public final synchronized void EEX(String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        for (2R9 A022 : AjR(str)) {
            A02(A022);
        }
    }

    public final synchronized void EEe(2R9 r2) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
        A02(r2);
    }

    public final synchronized File Ewy(String str, long j, long j2) {
        File A012;
        synchronized (this) {
            C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
            A0D();
            String str2 = str;
            S7Y A002 = C11282SJa.A00(this.A08, str2);
            A002.getClass();
            long j3 = j;
            long j4 = j2;
            C256703wD.A04(A002.A03(j3, j4));
            File file = this.A09;
            if (!file.exists()) {
                A04(file);
                A00();
            }
            this.A07.DmT(this, str2, j3, j4);
            File A0s = JTO.A0s(file, Integer.toString(this.A0D.nextInt(10)));
            if (!A0s.exists()) {
                A04(A0s);
            }
            A012 = Qoa.A01(A0s, A002.A01, j3, System.currentTimeMillis());
        }
        return A012;
    }

    public final synchronized void release() {
        if (!this.A04) {
            this.A0C.clear();
            A00();
            try {
                this.A08.A03();
                A05(this.A09);
            } catch (IOException e) {
                0KC.A0F("SimpleCacheV2", "Storing index file failed", e);
                A05(this.A09);
            } catch (Throwable th) {
                A05(this.A09);
                this.A04 = true;
                throw th;
            }
            this.A04 = true;
        }
    }

    public static void A01(C7939Qdc qdc, File file, File[] fileArr, boolean z) {
        if (fileArr != null && (r6 = fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        A01(qdc, file2, file2.listFiles(), false);
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                Qoa A002 = Qoa.A00(qdc.A08, file2, -1);
                if (A002 != null) {
                    qdc.A03(A002);
                } else {
                    file2.delete();
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    private void A02(2R9 r7) {
        C11282SJa sJa = this.A08;
        S7Y A002 = C11282SJa.A00(sJa, r7.A06);
        if (A002 != null && A002.A04.remove(r7)) {
            File file = r7.A05;
            if (file != null) {
                file.delete();
            }
            this.A06 -= r7.A03;
            sJa.A04(A002.A02);
            A0A(r7);
        }
    }

    private void A03(Qoa qoa) {
        C11282SJa sJa = this.A08;
        String str = qoa.A06;
        sJa.A01(str).A04.add(qoa);
        this.A06 += qoa.A03;
        List A1B = Pxe.A1B(str, this.A0C);
        if (A1B != null) {
            int size = A1B.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((29y) A1B.get(size)).Dlr(this, qoa);
            }
        }
        this.A07.Dlr(this, qoa);
    }

    public static synchronized void A05(File file) {
        synchronized (C7939Qdc.class) {
            A0E.remove(file.getAbsoluteFile());
        }
    }

    public final void A08() {
        Object obj = this.A0A;
        synchronized (obj) {
            if (!this.A01) {
                obj.wait();
            }
        }
    }

    public final void A0A(2R9 r4) {
        List A1B = Pxe.A1B(r4.A06, this.A0C);
        if (A1B != null) {
            int size = A1B.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((29y) A1B.get(size)).Dls(this, r4);
            }
        }
        this.A07.Dls(this, r4);
    }

    public final boolean A0C() {
        return this.A01;
    }

    public final boolean CPu(String str, long j, long j2) {
        if (!this.A05 || this.A01) {
            return CPr(str, j, j2);
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized 2R9 ExQ(Integer num, String str, long j, long j2) {
        int i;
        synchronized (this) {
            0fh.A01("SimpleCacheV2.startReadWrite", 1923924612);
            try {
                C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
                A0D();
                long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean A1Q = AnonymousClass7TF.A1Q((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                while (true) {
                    Integer num2 = num;
                    String str2 = str;
                    long j3 = j;
                    2R9 ExR = ExR(num2, str2, j3, -1);
                    if (ExR != null) {
                        0fh.A00(1687021248);
                        return ExR;
                    } else if (!this.A03 || !A1Q) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        HashMap hashMap = this.A08.A03;
                        if (((S7Y) hashMap.get(str2)) != null) {
                            long j4 = ((S7Y) hashMap.get(str2)).A01(j3, -1).A01;
                            if (j4 > 0) {
                                long A0C2 = Pxe.A0C(j4);
                                if (A0C2 > j2) {
                                    0KC.A0D("SimpleCacheV2", 002.A0r("lock expired after ", "ms for span: ", str2, elapsedRealtime2));
                                    i = -173080962;
                                    break;
                                }
                                elapsedRealtime2 = j2 - A0C2;
                            }
                        }
                        if (!A1Q) {
                            if (elapsedRealtime2 <= 0) {
                                i = 639375512;
                                break;
                            }
                        } else {
                            elapsedRealtime2 = 0;
                        }
                        wait(elapsedRealtime2);
                    } else {
                        HashMap hashMap2 = this.A08.A03;
                        if (((S7Y) hashMap2.get(str2)) != null) {
                            Qoa A012 = ((S7Y) hashMap2.get(str2)).A01(j3, -1);
                            long j5 = this.A02;
                            if (j5 > 0 && num2 != AnonymousClass05K.A00 && A012.A08 > 0 && SystemClock.elapsedRealtime() - A012.A08 > j5) {
                                i = 999459697;
                                break;
                            }
                            A012.A00++;
                        }
                        wait();
                        if (((S7Y) hashMap2.get(str2)) != null) {
                            ((S7Y) hashMap2.get(str2)).A01(j3, -1).A00--;
                        }
                    }
                }
                0fh.A00(i);
                return null;
            } catch (Throwable th) {
                0fh.A00(-704966203);
                throw th;
            }
        }
    }

    public final synchronized 2R9 ExR(Integer num, String str, long j, long j2) {
        Qoa A012;
        synchronized (this) {
            C256703wD.A04(AnonymousClass7TF.A1Q(this.A04 ? 1 : 0));
            A0D();
            C11282SJa sJa = this.A08;
            HashMap hashMap = sJa.A03;
            String str2 = str;
            S7Y s7y = (S7Y) hashMap.get(str2);
            long j3 = j;
            long j4 = j2;
            if (s7y != null) {
                while (true) {
                    A012 = s7y.A01(j3, j4);
                    if (!A012.A07 || A012.A05.length() == A012.A03) {
                        break;
                    }
                    A00();
                }
            } else {
                A012 = new 2R9((File) null, str2, j3, j4, -9223372036854775807L);
            }
            Qoa qoa = A012;
            if (A012.A07) {
                long j5 = A012.A02;
                TreeSet treeSet = ((S7Y) hashMap.get(str2)).A04;
                C256703wD.A04(treeSet.remove(A012));
                File file = A012.A05;
                file.getClass();
                String str3 = A012.A06;
                A012 = new 2R9(file, str3, A012.A04, A012.A03, j5);
                treeSet.add(A012);
                List A1B = Pxe.A1B(str3, this.A0C);
                if (A1B != null) {
                    int size = A1B.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((29y) A1B.get(size)).Dlt(this, qoa, A012);
                    }
                }
                this.A07.Dlt(this, qoa, A012);
            } else if (!sJa.A01(str2).A04(j3, A012.A03)) {
                A012 = null;
            }
        }
        return A012;
    }

    public C7939Qdc(29x r3, C11282SJa sJa, File file, ArrayList arrayList, long j, boolean z, boolean z2) {
        super(r3, arrayList);
        try {
            27d.A01("VPS-SimpleCacheV2Constructor");
            this.A09 = file;
            this.A07 = r3;
            this.A08 = sJa;
            this.A0C = AnonymousClass7TE.A1E();
            this.A0D = new Random();
            this.A0B = arrayList;
            this.A05 = z;
            this.A03 = z2;
            this.A02 = j;
            ConditionVariable conditionVariable = new ConditionVariable();
            new TR7(conditionVariable, this).start();
            conditionVariable.block();
        } finally {
            27d.A00();
        }
    }

    private void A00() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (S7Y s7y : Collections.unmodifiableCollection(this.A08.A03.values())) {
            Iterator it = s7y.A04.iterator();
            while (it.hasNext()) {
                2R9 r5 = (2R9) it.next();
                if (r5.A05.length() != r5.A03) {
                    A1C.add(r5);
                }
            }
        }
        for (int i = 0; i < A1C.size(); i++) {
            A02((2R9) A1C.get(i));
        }
    }

    public static void A04(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String A0m = AnonymousClass7TG.A0m(file, "Failed to create cache directory: ", AnonymousClass7TE.A1A());
            0KC.A0C("SimpleCacheV2", A0m);
            throw new IOException(A0m);
        }
    }
}
