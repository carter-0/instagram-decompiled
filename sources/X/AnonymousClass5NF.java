package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5NF  reason: invalid class name */
public final class AnonymousClass5NF {
    public AnonymousClass5N7 A00 = new AnonymousClass5N6(new Random(), new int[0]);
    public boolean A01;
    public C250823m7 A02;
    public final AnonymousClass5NC A03;
    public final AnonymousClass4RR A04;
    public final AnonymousClass4S6 A05;
    public final HashMap A06;
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final List A08 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Set A0A;
    public final C264894Rs A0B;

    public static void A03(AnonymousClass5NF r7, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            List list = r7.A08;
            AnonymousClass5NQ r4 = (AnonymousClass5NQ) list.remove(i3);
            r7.A09.remove(r4.A03);
            int i4 = -r4.A02.A01.A02();
            for (int i5 = i3; i5 < list.size(); i5++) {
                ((AnonymousClass5NQ) list.get(i5)).A00 += i4;
            }
            r4.A01 = true;
            if (r7.A01) {
                A01(r4, r7);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.5EO, java.lang.Object] */
    private void A00(AnonymousClass5NQ r8) {
        AnonymousClass5EK r5 = r8.A02;
        C284585Nd r4 = new C284585Nd(this);
        C284595Ne r6 = new C284595Ne(r8, this);
        this.A06.put(r8, new C284605Nf(r6, r4, r5));
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        r5.A8P(new Handler(myLooper, (Handler.Callback) null), r6);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper2, (Handler.Callback) null);
        CopyOnWriteArrayList copyOnWriteArrayList = r5.A03.A02;
        ? obj = new Object();
        obj.A00 = handler;
        obj.A01 = r6;
        copyOnWriteArrayList.add(obj);
        r5.E4B(this.A0B, r4, this.A02);
    }

    public static void A01(AnonymousClass5NQ r3, AnonymousClass5NF r4) {
        if (r3.A01 && r3.A04.isEmpty()) {
            Object remove = r4.A06.remove(r3);
            remove.getClass();
            C284605Nf r2 = (C284605Nf) remove;
            C265164Su r1 = r2.A02;
            r1.ECl(r2.A01);
            C284595Ne r0 = r2.A00;
            r1.EDd(r0);
            r1.EDW(r0);
            r4.A0A.remove(r3);
        }
    }

    public static void A02(AnonymousClass5NF r3) {
        Iterator it = r3.A0A.iterator();
        while (it.hasNext()) {
            AnonymousClass5NQ r1 = (AnonymousClass5NQ) it.next();
            if (r1.A04.isEmpty()) {
                C284605Nf r0 = (C284605Nf) r3.A06.get(r1);
                if (r0 != null) {
                    r0.A02.APD(r0.A01);
                }
                it.remove();
            }
        }
    }

    public final Timeline A04() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass5NQ r0 = (AnonymousClass5NQ) list.get(i2);
            r0.A00 = i;
            i += r0.A02.A01.A02();
        }
        return new AnonymousClass4TA(this.A00, list);
    }

    public final void A06(C250823m7 r5) {
        C256703wD.A04(!this.A01);
        this.A02 = r5;
        int i = 0;
        while (true) {
            List list = this.A08;
            if (i < list.size()) {
                AnonymousClass5NQ r1 = (AnonymousClass5NQ) list.get(i);
                A00(r1);
                this.A0A.add(r1);
                i++;
            } else {
                this.A01 = true;
                return;
            }
        }
    }

    public AnonymousClass5NF(AnonymousClass5NC r4, AnonymousClass4RR r5, C264894Rs r6, AnonymousClass4S6 r7) {
        this.A0B = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A06 = new HashMap();
        this.A0A = new HashSet();
    }

    public final Timeline A05(AnonymousClass5N7 r7, List list, int i) {
        int i2;
        List list2;
        if (!list.isEmpty()) {
            this.A00 = r7;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                AnonymousClass5NQ r3 = (AnonymousClass5NQ) list.get(i3 - i);
                if (i3 > 0) {
                    AnonymousClass5NQ r1 = (AnonymousClass5NQ) this.A08.get(i3 - 1);
                    i2 = r1.A00 + r1.A02.A01.A02();
                } else {
                    i2 = 0;
                }
                r3.A00 = i2;
                r3.A01 = false;
                r3.A04.clear();
                int A022 = r3.A02.A01.A02();
                int i4 = i3;
                while (true) {
                    list2 = this.A08;
                    if (i4 >= list2.size()) {
                        break;
                    }
                    ((AnonymousClass5NQ) list2.get(i4)).A00 += A022;
                    i4++;
                }
                list2.add(i3, r3);
                this.A09.put(r3.A03, r3);
                if (this.A01) {
                    A00(r3);
                    if (this.A07.isEmpty()) {
                        this.A0A.add(r3);
                    } else {
                        C284605Nf r0 = (C284605Nf) this.A06.get(r3);
                        if (r0 != null) {
                            r0.A02.APD(r0.A01);
                        }
                    }
                }
            }
        }
        return A04();
    }
}
