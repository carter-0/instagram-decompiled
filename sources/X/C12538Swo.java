package X;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.Swo  reason: case insensitive filesystem */
public final class C12538Swo implements C251073mW {
    public static final HashSet A08 = AnonymousClass7TE.A1F();
    public AnonymousClass5HZ A00;
    public long A01;
    public boolean A02;
    public final 29x A03;
    public final C11282SJa A04;
    public final File A05;
    public final HashMap A06;
    public final Random A07;

    public final synchronized void A06() {
        AnonymousClass5HZ r0 = this.A00;
        if (r0 != null) {
            throw r0;
        }
    }

    public final synchronized NavigableSet A98(29y r3, String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        str.getClass();
        HashMap hashMap = this.A06;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = AnonymousClass7TE.A1C();
            hashMap.put(str, arrayList);
        }
        arrayList.add(r3);
        return AjR(str);
    }

    public final void A9E(String str) {
    }

    public final synchronized void ABz(C10462Rsd rsd, String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        A06();
        C11282SJa sJa = this.A04;
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
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                C11282SJa sJa = this.A04;
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
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        return this.A01;
    }

    public final synchronized long AjN(long j, String str, long j2) {
        long j3;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        S7Y A002 = C11282SJa.A00(this.A04, str);
        if (A002 != null) {
            j3 = A002.A00(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    public final synchronized NavigableSet AjR(String str) {
        TreeSet treeSet;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A04, str);
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
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A04, str);
        if (A002 != null) {
            swq = A002.A00;
        } else {
            swq = C12540Swq.A02;
        }
        return swq;
    }

    public final synchronized Set BKC() {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        return C66580MXl.A12(this.A04.A03.keySet());
    }

    public final boolean CPu(String str, long j, long j2) {
        return false;
    }

    public final boolean CWd(String str) {
        return true;
    }

    public final synchronized void ECd(2R9 r5) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        C11282SJa sJa = this.A04;
        S7Y A002 = C11282SJa.A00(sJa, r5.A06);
        A002.getClass();
        A002.A02(r5.A04);
        sJa.A04(A002.A02);
        notifyAll();
    }

    public final synchronized void EDy(29y r3, String str) {
        if (!this.A02) {
            HashMap hashMap = this.A06;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                arrayList.remove(r3);
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
        }
    }

    public final synchronized void EEX(String str) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        for (2R9 A012 : AjR(str)) {
            A01(A012);
        }
    }

    public final synchronized void EEe(2R9 r2) {
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        A01(r2);
    }

    public final synchronized File Ewy(String str, long j, long j2) {
        File A012;
        synchronized (this) {
            C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
            A06();
            String str2 = str;
            S7Y A002 = C11282SJa.A00(this.A04, str2);
            A002.getClass();
            long j3 = j;
            long j4 = j2;
            C256703wD.A04(A002.A03(j3, j4));
            File file = this.A05;
            if (!file.exists()) {
                A04(file);
                A00();
            }
            this.A03.DmT(this, str2, j3, j4);
            File A0s = JTO.A0s(file, Integer.toString(this.A07.nextInt(10)));
            if (!A0s.exists()) {
                A04(A0s);
            }
            A012 = Qoa.A01(A0s, A002.A01, j3, System.currentTimeMillis());
        }
        return A012;
    }

    public final synchronized 2R9 ExQ(Integer num, String str, long j, long j2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final synchronized void release() {
        if (!this.A02) {
            this.A06.clear();
            A00();
            try {
                this.A04.A03();
                A05(this.A05);
            } catch (IOException e) {
                2AG.A05("SimpleCache", "Storing index file failed", e);
                A05(this.A05);
            } catch (Throwable th) {
                A05(this.A05);
                this.A02 = true;
                throw th;
            }
            this.A02 = true;
        }
    }

    @Deprecated
    public C12538Swo(29x r5, File file) {
        boolean add;
        C11282SJa sJa = new C11282SJa(file);
        synchronized (C12538Swo.class) {
            add = A08.add(file.getAbsoluteFile());
        }
        if (add) {
            this.A05 = file;
            this.A03 = r5;
            this.A04 = sJa;
            this.A06 = AnonymousClass7TE.A1E();
            this.A07 = new Random();
            ConditionVariable conditionVariable = new ConditionVariable();
            new TR8(conditionVariable, this).start();
            conditionVariable.block();
            return;
        }
        throw C66582MXn.A0k(file, "Another SimpleCache instance uses the folder: ", AnonymousClass7TE.A1A());
    }

    private void A01(2R9 r8) {
        C11282SJa sJa = this.A04;
        String str = r8.A06;
        S7Y A002 = C11282SJa.A00(sJa, str);
        if (A002 != null && A002.A04.remove(r8)) {
            File file = r8.A05;
            if (file != null) {
                file.delete();
            }
            this.A01 -= r8.A03;
            sJa.A04(A002.A02);
            AbstractList abstractList = (AbstractList) this.A06.get(str);
            if (abstractList != null) {
                int size = abstractList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((29y) abstractList.get(size)).Dls(this, r8);
                }
            }
            this.A03.Dls(this, r8);
        }
    }

    public static void A02(C12538Swo swo, File file, File[] fileArr, boolean z) {
        if (fileArr != null && (r6 = fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        A02(swo, file2, file2.listFiles(), false);
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                Qoa A002 = Qoa.A00(swo.A04, file2, -1);
                if (A002 != null) {
                    swo.A03(A002);
                } else {
                    file2.delete();
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    private void A03(Qoa qoa) {
        C11282SJa sJa = this.A04;
        String str = qoa.A06;
        sJa.A01(str).A04.add(qoa);
        this.A01 += qoa.A03;
        AbstractList abstractList = (AbstractList) this.A06.get(str);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((29y) abstractList.get(size)).Dlr(this, qoa);
            }
        }
        this.A03.Dlr(this, qoa);
    }

    public static synchronized void A05(File file) {
        synchronized (C12538Swo.class) {
            A08.remove(file.getAbsoluteFile());
        }
    }

    public final synchronized boolean CPr(String str, long j, long j2) {
        boolean z;
        z = true;
        C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
        S7Y A002 = C11282SJa.A00(this.A04, str);
        if (A002 == null || A002.A00(0, j2) < j2) {
            z = false;
        }
        return z;
    }

    public final synchronized 2R9 ExR(Integer num, String str, long j, long j2) {
        Qoa A012;
        synchronized (this) {
            C256703wD.A04(AnonymousClass7TF.A1Q(this.A02 ? 1 : 0));
            A06();
            C11282SJa sJa = this.A04;
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
                ArrayList arrayList = (ArrayList) this.A06.get(str3);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((29y) arrayList.get(size)).Dlt(this, qoa, A012);
                    }
                }
                this.A03.Dlt(this, qoa, A012);
            } else if (!sJa.A01(str2).A04(j3, A012.A03)) {
                A012 = null;
            }
        }
        return A012;
    }

    private void A00() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (S7Y s7y : Collections.unmodifiableCollection(this.A04.A03.values())) {
            Iterator it = s7y.A04.iterator();
            while (it.hasNext()) {
                2R9 r5 = (2R9) it.next();
                if (r5.A05.length() != r5.A03) {
                    A1C.add(r5);
                }
            }
        }
        for (int i = 0; i < A1C.size(); i++) {
            A01((2R9) A1C.get(i));
        }
    }

    public static void A04(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String A0m = AnonymousClass7TG.A0m(file, "Failed to create cache directory: ", AnonymousClass7TE.A1A());
            2AG.A03("SimpleCache", A0m);
            throw new IOException(A0m);
        }
    }
}
