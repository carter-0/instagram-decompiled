package X;

import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract class Q14 {
    public static final C13101TLk A06 = new C13101TLk(false);
    public static final C13101TLk A07 = new C13101TLk(true);
    public long A00 = Long.MAX_VALUE;
    public final long A01;
    public final C7334Q4k A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Queue A04 = new PriorityQueue(16, A07);
    public final Set A05;

    public final void A00() {
        for (RRJ rrj : this.A05) {
            String str = rrj.A01;
            A02(str);
            A03(str);
        }
    }

    public final void A01(long j) {
        boolean z;
        long j2 = j;
        if (j < this.A00) {
            Queue queue = this.A04;
            queue.clear();
            queue.addAll(this.A03);
        }
        while (true) {
            Queue queue2 = this.A04;
            if (queue2.isEmpty()) {
                break;
            }
            C266724aF r0 = ((RRJ) queue2.peek()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            if (this.A01 + j < r0.A03(timeUnit)) {
                break;
            }
            RRJ rrj = (RRJ) queue2.poll();
            if (j < rrj.A00.A02(timeUnit)) {
                Set set = this.A05;
                if (!set.contains(rrj)) {
                    set.add(rrj);
                    String str = rrj.A01;
                    if (!(this instanceof C7962QeA) && (this instanceof Qe9)) {
                        STM stm = ((Qe9) this).A00;
                        int parseInt = Integer.parseInt(str);
                        MediaComposition mediaComposition = stm.A08.A08;
                        if (mediaComposition != null) {
                            Map map = stm.A0L;
                            Integer valueOf = Integer.valueOf(parseInt);
                            if (!map.containsKey(valueOf)) {
                                C13725Tfv tfv = stm.A0G;
                                C266794aM A042 = mediaComposition.A04(C266714aE.AUDIO, parseInt);
                                A042.getClass();
                                Iterator A16 = Pxg.A16(A042.A04);
                                while (true) {
                                    if (!A16.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    C266754aI r1 = (C266754aI) A16.next();
                                    if (!r1.A01(false)) {
                                        try {
                                            File file = r1.A04;
                                            file.getClass();
                                            C7232Q0d AU7 = tfv.AU7(Uri.fromFile(file));
                                            if (AU7 == null || AU7.A0K) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                z = true;
                                JTP.A1R(valueOf, map, z);
                            }
                            if (!AnonymousClass7TE.A1a(map.get(valueOf))) {
                            }
                        }
                        C51967G9n.A1O(stm.A0M.submit(new C13147TNf(parseInt, 0, stm, mediaComposition)), stm.A0K, parseInt);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Set<RRJ> set2 = this.A05;
        for (RRJ rrj2 : set2) {
            C266724aF r14 = rrj2.A00;
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            if (!r14.A06(timeUnit2, j2, this.A02.A0H())) {
                if (rrj2.A02) {
                    arrayList3.add(rrj2);
                }
            } else if (!rrj2.A02) {
                arrayList.add(rrj2);
            }
            long j3 = this.A01;
            if (j - j3 > r14.A02(timeUnit2) || j3 + j < r14.A03(timeUnit2)) {
                arrayList2.add(rrj2);
            }
        }
        C13101TLk tLk = A06;
        Collections.sort(arrayList3, tLk);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            RRJ rrj3 = (RRJ) it.next();
            rrj3.A02 = false;
            A02(rrj3.A01);
        }
        Collections.sort(arrayList, A07);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RRJ rrj4 = (RRJ) it2.next();
            rrj4.A02 = true;
            String str2 = rrj4.A01;
            if (this instanceof C7962QeA) {
                C7962QeA qeA = (C7962QeA) this;
                if (qeA.A00 != 0) {
                    ((C13595TdN) qeA.A02).DQu(Integer.parseInt(str2));
                } else {
                    C10569RuO ruO = (C10569RuO) Pxe.A0r(str2, (Map) qeA.A02);
                    Integer num = ruO.A02;
                    MediaEffect mediaEffect = ruO.A01;
                    int intValue = num.intValue();
                    C13852TiV tiV = ((STM) qeA.A01).A0F.A01;
                    if (intValue == -1) {
                        tiV.addEffect(mediaEffect);
                    } else {
                        tiV.addEffect(num, mediaEffect);
                    }
                }
            } else if (this instanceof Qe9) {
                C10794RyG ryG = ((Qe9) this).A00.A0F;
                ryG.A01.enableTrack(Integer.parseInt(str2));
            } else {
                C7963QeB qeB = (C7963QeB) this;
                C10572RuR ruR = (C10572RuR) Pxe.A0r(str2, qeB.A02);
                qeB.A01.DQ1(ruR.A02, ruR.A01);
            }
        }
        Collections.sort(arrayList2, tLk);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            A03(((RRJ) it3.next()).A01);
        }
        set2.removeAll(arrayList2);
        this.A00 = j2;
    }

    public final void A02(String str) {
        if (this instanceof C7963QeB) {
            C7963QeB qeB = (C7963QeB) this;
            C10572RuR ruR = (C10572RuR) Pxe.A0r(str, qeB.A02);
            qeB.A00.DQ0(ruR.A02, ruR.A01);
        } else if (this instanceof C7962QeA) {
            C7962QeA qeA = (C7962QeA) this;
            if (qeA.A00 != 0) {
                ((C13594TdM) qeA.A01).DQt(Integer.parseInt(str));
                return;
            }
            C10569RuO ruO = (C10569RuO) Pxe.A0r(str, (Map) qeA.A02);
            Integer num = ruO.A02;
            MediaEffect mediaEffect = ruO.A01;
            int intValue = num.intValue();
            C13852TiV tiV = ((STM) qeA.A01).A0F.A01;
            if (intValue == -1) {
                tiV.removeEffect(mediaEffect);
            } else {
                tiV.removeEffect(num, mediaEffect);
            }
        } else {
            C10794RyG ryG = ((Qe9) this).A00.A0F;
            ryG.A01.disableTrack(Integer.parseInt(str));
        }
    }

    public final void A03(String str) {
        if (!(this instanceof C7962QeA) && (this instanceof Qe9)) {
            STM stm = ((Qe9) this).A00;
            Object remove = stm.A0K.remove(Integer.valueOf(Integer.parseInt(str)));
            if (remove != null) {
                stm.A0J.add(stm.A0M.submit(new C13158TNq(2, stm, remove)));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.RRJ] */
    public Q14(C7334Q4k q4k, Map map, long j) {
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            List list = this.A03;
            String A13 = DbT.A13(A1J);
            ? obj = new Object();
            obj.A01 = A13;
            obj.A00 = (C266724aF) A1J.getValue();
            list.add(obj);
        }
        this.A01 = TimeUnit.MILLISECONDS.toMicros(j);
        this.A05 = AnonymousClass7TE.A1F();
        this.A02 = q4k;
    }
}
