package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4St  reason: invalid class name and case insensitive filesystem */
public abstract class C265154St implements C265164Su {
    public C264894Rs A00;
    public Looper A01;
    public Timeline A02;
    public final C265184Sw A03 = new C265184Sw();
    public final C265174Sv A04 = new C265174Sv();
    public final HashSet A05 = new HashSet(1);
    public final ArrayList A06 = new ArrayList(1);

    public void A0A() {
    }

    public void A0B() {
    }

    public abstract void A0D();

    public abstract void A0E(C250823m7 r1);

    public final C265174Sv A09(C264874Rq r7) {
        return new C265174Sv(r7, this.A04.A02, 0, 0);
    }

    public final void A0C(Timeline timeline) {
        this.A02 = timeline;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((C264954Ry) it.next()).Dlq(timeline, this);
        }
    }

    public final void APD(C264954Ry r3) {
        HashSet hashSet = this.A05;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(r3);
        if (z && hashSet.isEmpty()) {
            A0A();
        }
    }

    public final void ARI(C264954Ry r3) {
        this.A01.getClass();
        HashSet hashSet = this.A05;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(r3);
        if (isEmpty) {
            A0B();
        }
    }

    public /* synthetic */ Timeline BHA() {
        return null;
    }

    public /* synthetic */ boolean CcB() {
        return true;
    }

    public final void ECl(C264954Ry r2) {
        ArrayList arrayList = this.A06;
        arrayList.remove(r2);
        if (arrayList.isEmpty()) {
            this.A01 = null;
            this.A02 = null;
            this.A00 = null;
            this.A05.clear();
            A0D();
            return;
        }
        APD(r2);
    }

    public final void EDW(AnonymousClass4RT r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r1 = (AnonymousClass5EO) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }

    public final void EDd(AnonymousClass4P9 r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A04.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r1 = (AnonymousClass4T3) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4T3, java.lang.Object] */
    public final void A8P(Handler handler, AnonymousClass4P9 r4) {
        handler.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.A04.A02;
        ? obj = new Object();
        obj.A00 = handler;
        obj.A01 = r4;
        copyOnWriteArrayList.add(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == r2) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E4B(X.C264894Rs r4, X.C264954Ry r5, X.C250823m7 r6) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.A01
            if (r1 == 0) goto L_0x000b
            r0 = 0
            if (r1 != r2) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C256703wD.A03(r0)
            r3.A00 = r4
            com.google.android.exoplayer2.Timeline r1 = r3.A02
            java.util.ArrayList r0 = r3.A06
            r0.add(r5)
            android.os.Looper r0 = r3.A01
            if (r0 != 0) goto L_0x0027
            r3.A01 = r2
            java.util.HashSet r0 = r3.A05
            r0.add(r5)
            r3.A0E(r6)
        L_0x0026:
            return
        L_0x0027:
            if (r1 == 0) goto L_0x0026
            r3.ARI(r5)
            r5.Dlq(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265154St.E4B(X.4Rs, X.4Ry, X.3m7):void");
    }
}
