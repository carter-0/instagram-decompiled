package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;

/* renamed from: X.3mX  reason: invalid class name and case insensitive filesystem */
public final class C251083mX extends C251093mY {
    public Object A00 = new Object();
    public boolean A01;
    public int A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final File A07;
    public final HashMap A08;
    public final HashMap A09;
    public final Handler A0A;
    public final Random A0B;

    public final synchronized void A09(29x r2) {
        this.A02.add(r2);
    }

    public final synchronized NavigableSet A98(29y r3, String str) {
        Map map = this.A03;
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList();
            map.put(str, list);
        }
        list.add(r3);
        return AjR(str);
    }

    public final synchronized void A9E(String str) {
        this.A04.add(str);
    }

    public final synchronized void ABz(C10462Rsd rsd, String str) {
        throw new RuntimeException();
    }

    public final synchronized void AIT(File file, long j) {
        boolean z;
        String A0D;
        File file2 = file;
        2R9 r3 = null;
        Matcher matcher = C2608047c.A01.matcher(file.getName());
        if (!matcher.matches() || (A0D = Util.A0D(matcher.group(1))) == null) {
            z = false;
        } else {
            r3 = new 2R9(file2, A0D, Long.parseLong(matcher.group(2)), file.length(), Long.parseLong(matcher.group(3)), true);
            z = true;
        }
        C256703wD.A04(z);
        C256703wD.A04(this.A09.containsKey(r3.A06));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                A03(r3);
                notifyAll();
            }
        }
    }

    public final synchronized long AjK() {
        return this.A05;
    }

    public final synchronized long AjN(long j, String str, long j2) {
        throw new RuntimeException();
    }

    public final synchronized NavigableSet AjR(String str) {
        TreeSet treeSet;
        NavigableSet navigableSet = (NavigableSet) this.A01.get(str);
        if (navigableSet == null || navigableSet.isEmpty()) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet(navigableSet);
        }
        return treeSet;
    }

    public final synchronized C13465Tas Aqf(String str) {
        throw new RuntimeException();
    }

    public final synchronized Set BKC() {
        return new HashSet(this.A01.keySet());
    }

    public final synchronized void ECd(2R9 r3) {
        boolean z = false;
        if (r3 == this.A09.remove(r3.A06)) {
            z = true;
        }
        C256703wD.A04(z);
        notifyAll();
    }

    public final synchronized void EDy(29y r3, String str) {
        Map map = this.A03;
        List list = (List) map.get(str);
        if (list != null) {
            list.remove(r3);
            if (list.isEmpty()) {
                map.remove(str);
            }
        }
    }

    public final synchronized void EEX(String str) {
        for (2R9 EEe : AjR(str)) {
            EEe(EEe);
        }
    }

    public final synchronized void EEe(2R9 r12) {
        AbstractMap abstractMap = this.A01;
        String str = r12.A06;
        NavigableSet navigableSet = (NavigableSet) abstractMap.get(str);
        long j = this.A05;
        long j2 = r12.A03;
        this.A05 = j - j2;
        if (navigableSet == null || !navigableSet.remove(r12)) {
            this.A00.DCr("removeSpan failed", str, (int) r12.A04, (int) j2);
        }
        r12.A05.delete();
        if (navigableSet != null && navigableSet.isEmpty()) {
            abstractMap.remove(str);
            this.A04.remove(str);
            this.A08.remove(str);
        }
        A0A(r12);
    }

    public final synchronized File Ewy(String str, long j, long j2) {
        File file;
        C256703wD.A04(this.A09.containsKey(str));
        File file2 = this.A07;
        if (!file2.exists()) {
            A0D();
            file2.mkdirs();
        }
        29x r6 = this.A00;
        if (r6 != null) {
            r6.DmT(this, str, j, j2);
        }
        for (29x DmT : this.A02) {
            DmT.DmT(this, str, j, j2);
        }
        if (this.A04) {
            File file3 = new File(file2, Integer.toString(this.A0B.nextInt(this.A02)));
            if (!file3.exists()) {
                file3.mkdir();
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(j);
            sb.append(".");
            sb.append(currentTimeMillis);
            sb.append(".v2.exo");
            file = new File(file3, sb.toString());
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".");
            sb2.append(j);
            sb2.append(".");
            sb2.append(currentTimeMillis2);
            sb2.append(".v2.exo");
            file = new File(file2, sb2.toString());
        }
        return file;
    }

    public final synchronized 2R9 ExR(Integer num, String str, long j, long j2) {
        return A01(new 2R9((File) null, str, j, -1, -1, false), num);
    }

    public final synchronized void release() {
        throw new RuntimeException();
    }

    private 2R9 A00(2R9 r18) {
        2R9 r5 = r18;
        String str = r5.A06;
        long j = r5.A04;
        NavigableSet navigableSet = (NavigableSet) this.A01.get(str);
        if (navigableSet != null) {
            2R9 r7 = (2R9) navigableSet.floor(r5);
            if (r7 != null) {
                long j2 = r7.A04;
                if (j2 <= j && j < j2 + r7.A03) {
                    if (r7.A05.exists()) {
                        return r7;
                    }
                    A0D();
                    return A00(r5);
                }
            }
            2R9 r0 = (2R9) navigableSet.ceiling(r5);
            if (r0 != null) {
                return new 2R9((File) null, str, j, r0.A04 - j, -1, false);
            }
        }
        return new 2R9((File) null, str, j, -1, -1, false);
    }

    private synchronized 2R9 A01(2R9 r19, Integer num) {
        synchronized (this) {
            try {
                27d.A01("exo-startReadWriteNonBlocking");
                2R9 r1 = r19;
                2R9 A002 = A00(r1);
                if (A002.A07) {
                    AbstractMap abstractMap = this.A01;
                    String str = A002.A06;
                    NavigableSet navigableSet = (NavigableSet) abstractMap.get(str);
                    if (navigableSet == null || !navigableSet.remove(A002)) {
                        29x r8 = this.A00;
                        if (r8 != null) {
                            r8.DCr("startReadWriteNonBlocking", str, (int) A002.A04, (int) A002.A03);
                        }
                        for (29x DCr : this.A02) {
                            DCr.DCr("startReadWriteNonBlocking", str, (int) A002.A04, (int) A002.A03);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = A002.A05;
                    File parentFile = file.getParentFile();
                    long j = A002.A04;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".");
                    sb.append(j);
                    sb.append(".");
                    sb.append(currentTimeMillis);
                    sb.append(".v2.exo");
                    File file2 = new File(parentFile, sb.toString());
                    file.renameTo(file2);
                    2R9 r82 = new 2R9(file2, str, j, file2.length(), currentTimeMillis, true);
                    navigableSet.add(r82);
                    List list = (List) this.A03.get(str);
                    Integer num2 = num;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((29y) list.get(size)).Dlu(this, A002, r82, num2);
                        }
                    }
                    29x r0 = this.A00;
                    if (r0 != null) {
                        r0.Dlu(this, A002, r82, num2);
                    }
                    for (29y Dlu : this.A02) {
                        Dlu.Dlu(this, A002, r82, num2);
                    }
                    27d.A00();
                    return r82;
                }
                HashMap hashMap = this.A09;
                String str2 = r1.A06;
                if (!hashMap.containsKey(str2)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    A002.A01 = elapsedRealtime;
                    A002.A08 = elapsedRealtime;
                    hashMap.put(str2, A002);
                } else {
                    A002 = null;
                }
                27d.A00();
                return A002;
            } catch (Throwable th) {
                27d.A00();
                throw th;
            }
        }
    }

    private void A03(2R9 r6) {
        AbstractMap abstractMap = this.A01;
        String str = r6.A06;
        Set set = (Set) abstractMap.get(str);
        if (set == null) {
            set = new TreeSet();
            abstractMap.put(str, set);
        }
        set.add(r6);
        this.A05 += r6.A03;
        List list = (List) this.A03.get(str);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((29y) list.get(size)).Dlr(this, r6);
            }
        }
        29x r0 = this.A00;
        if (r0 != null) {
            r0.Dlr(this, r6);
        }
        for (29y Dlr : this.A02) {
            Dlr.Dlr(this, r6);
        }
    }

    public final void A0D() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((NavigableSet) ((Map.Entry) it.next()).getValue()).iterator();
            boolean z = true;
            while (it2.hasNext()) {
                2R9 r4 = (2R9) it2.next();
                if (!r4.A05.exists()) {
                    it2.remove();
                    if (r4.A07) {
                        this.A05 -= r4.A03;
                    }
                    A0A(r4);
                } else {
                    z = false;
                }
            }
            if (z) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean CPr(java.lang.String r16, long r17, long r19) {
        /*
            r15 = this;
            r8 = r17
            monitor-enter(r15)
            java.util.AbstractMap r0 = r15.A01     // Catch:{ all -> 0x005a }
            r7 = r16
            java.lang.Object r4 = r0.get(r7)     // Catch:{ all -> 0x005a }
            java.util.NavigableSet r4 = (java.util.NavigableSet) r4     // Catch:{ all -> 0x005a }
            r14 = 0
            if (r4 == 0) goto L_0x0058
            r10 = -1
            r6 = 0
            X.2R9 r5 = new X.2R9     // Catch:{ all -> 0x005a }
            r12 = r10
            r5.<init>(r6, r7, r8, r10, r12, r14)     // Catch:{ all -> 0x005a }
            java.lang.Object r5 = r4.floor(r5)     // Catch:{ all -> 0x005a }
            X.2R9 r5 = (X.2R9) r5     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0058
            long r0 = r5.A04     // Catch:{ all -> 0x005a }
            long r2 = r5.A03     // Catch:{ all -> 0x005a }
            long r0 = r0 + r2
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x0058
            long r8 = r17 + r19
            r7 = 1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0056
            java.util.NavigableSet r2 = r4.tailSet(r5, r14)     // Catch:{ all -> 0x005a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x005a }
        L_0x0039:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0058
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x005a }
            X.2R9 r5 = (X.2R9) r5     // Catch:{ all -> 0x005a }
            long r2 = r5.A04     // Catch:{ all -> 0x005a }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0058
            long r4 = r5.A03     // Catch:{ all -> 0x005a }
            long r2 = r2 + r4
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x005a }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0039
        L_0x0056:
            monitor-exit(r15)
            return r7
        L_0x0058:
            monitor-exit(r15)
            return r14
        L_0x005a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251083mX.CPr(java.lang.String, long, long):boolean");
    }

    public final boolean CPu(String str, long j, long j2) {
        if (!this.A06 || this.A01) {
            return CPr(str, j, j2);
        }
        return false;
    }

    public final boolean CWd(String str) {
        return this.A04.contains(str);
    }

    public final synchronized 2R9 ExQ(Integer num, String str, long j, long j2) {
        int i;
        synchronized (this) {
            0fh.A01("SimpleCache.startReadWrite", 237154934);
            try {
                2R9 r16 = new 2R9((File) null, str, j, -1, -1, false);
                long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean z = false;
                if (j2 == 0) {
                }
                while (true) {
                    Integer num2 = num;
                    2R9 A012 = A01(r16, num2);
                    if (A012 != null) {
                        0fh.A00(-1178141630);
                        return A012;
                    } else if (!this.A05 || !z) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        HashMap hashMap = this.A09;
                        String str2 = r16.A06;
                        if (hashMap.containsKey(str2)) {
                            long j3 = ((2R9) hashMap.get(str2)).A01;
                            if (j3 > 0) {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j3;
                                if (elapsedRealtime3 > j2) {
                                    Log.w("SimpleCache", 002.A0r("lock expired after ", "ms for span: ", str2, elapsedRealtime2));
                                    i = -868297321;
                                    break;
                                }
                                elapsedRealtime2 = j2 - elapsedRealtime3;
                            }
                        }
                        if (!z) {
                            if (elapsedRealtime2 <= 0) {
                                i = -1276384190;
                                break;
                            }
                        } else {
                            elapsedRealtime2 = 0;
                        }
                        wait(elapsedRealtime2);
                    } else {
                        HashMap hashMap2 = this.A09;
                        String str3 = r16.A06;
                        if (hashMap2.containsKey(str3)) {
                            2R9 r7 = (2R9) hashMap2.get(str3);
                            long j4 = this.A03;
                            if (j4 > 0 && num2 != AnonymousClass05K.A00 && r7.A08 > 0 && SystemClock.elapsedRealtime() - r7.A08 > j4) {
                                i = 1247417628;
                                break;
                            }
                            r7.A00++;
                        }
                        wait();
                        if (hashMap2.containsKey(str3)) {
                            ((2R9) hashMap2.get(str3)).A00--;
                        }
                    }
                }
                0fh.A00(i);
                return null;
            } finally {
                0fh.A00(1808147101);
            }
        }
    }

    public C251083mX(Handler handler, 29x r3, File file, ArrayList arrayList, int i, long j, boolean z, boolean z2, boolean z3) {
        super(r3, arrayList);
        try {
            27d.A01("VPS-SimpleCacheConstructor");
            this.A05 = z2;
            this.A07 = file;
            this.A09 = new HashMap();
            this.A08 = new HashMap();
            this.A0B = new Random();
            this.A04 = z3;
            this.A02 = i;
            this.A06 = z;
            this.A03 = j;
            this.A0A = handler;
            new AnonymousClass2OH(this).start();
        } finally {
            27d.A00();
        }
    }

    public static void A02(C251083mX r20, File file, boolean z) {
        int lastIndexOf;
        int lastIndexOf2;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        if (z || listFiles.length != 0) {
            for (File file2 : listFiles) {
                C251083mX r0 = r20;
                if (file2.getName().indexOf(46) == -1) {
                    A02(r0, file2, false);
                } else {
                    long length = file2.length();
                    String name = file2.getName();
                    int lastIndexOf3 = name.lastIndexOf(46);
                    if (!(lastIndexOf3 == -1 || (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) == -1 || (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) == -1)) {
                        String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
                        int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
                        if (lastIndexOf4 != -1) {
                            String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
                            String substring3 = name.substring(0, lastIndexOf4);
                            if (length == -1) {
                                length = file2.length();
                            }
                            if (length != 0) {
                                try {
                                    long parseLong = Long.parseLong(substring);
                                    long parseLong2 = Long.parseLong(substring2);
                                    if (length <= 0) {
                                        length = file2.length();
                                    }
                                    r0.A03(new 2R9(file2, substring3, parseLong2, length, parseLong, true));
                                } catch (NumberFormatException e) {
                                    Log.e("CacheSpan", 002.A0R("invalid filename: ", name), e);
                                }
                            }
                        }
                    }
                    file2.delete();
                }
            }
            return;
        }
        file.delete();
    }
}
