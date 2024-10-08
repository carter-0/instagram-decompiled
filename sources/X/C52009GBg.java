package X;

import android.os.Handler;
import com.instagram.model.people.PeopleTag;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.GBg  reason: case insensitive filesystem */
public abstract class C52009GBg implements JSx, JRO, XBx {
    public boolean A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final C62320sa A04 = new C58676Ivl(this, 29);

    public abstract int A0A();

    public abstract int A0B(C267324bN r1);

    public abstract int A0C(1Xj r1);

    public final C61042Jvg A0D() {
        C61042Jvg jvg;
        C51983GAg gAg = (C51983GAg) this;
        if (gAg instanceof C52354GOy) {
            C52354GOy gOy = (C52354GOy) gAg;
            ReentrantReadWriteLock.ReadLock A08 = A08(gOy);
            try {
                return gOy.A01;
            } finally {
                A08.unlock();
            }
        } else if (!(gAg instanceof C52347GOr)) {
            return gAg.A01;
        } else {
            synchronized (gAg) {
                jvg = gAg.A01;
            }
            return jvg;
        }
    }

    public abstract C267324bN A0E(int i);

    public abstract C267324bN A0F(int i);

    /* renamed from: A0G */
    public C296995qz B9o(C267324bN r4) {
        0qQ.A0B(r4, 0);
        return new C296995qz(A0B(r4), 0);
    }

    public abstract List A0I();

    public abstract List A0J(int i, int i2);

    public abstract List A0K(C295365o2 r1);

    public abstract void A0N();

    public abstract void A0O(int i, List list);

    public abstract void A0Q(C267324bN r1, int i);

    public abstract void A0R(C267324bN r1, C267324bN r2);

    public abstract void A0S(C267324bN r1, PeopleTag peopleTag);

    public abstract void A0T(C267324bN r1, boolean z);

    public abstract void A0U(String str, int i);

    public abstract void A0V(List list);

    public abstract void A0W(List list);

    public abstract void A0X(boolean z);

    public final boolean A0Y() {
        boolean isEmpty;
        C51983GAg gAg = (C51983GAg) this;
        if (gAg instanceof C52354GOy) {
            C52354GOy gOy = (C52354GOy) gAg;
            ReentrantReadWriteLock.ReadLock A08 = A08(gOy);
            try {
                return gOy.A03.isEmpty();
            } finally {
                A08.unlock();
            }
        } else if (!(gAg instanceof C52347GOr)) {
            return gAg.A03.isEmpty();
        } else {
            synchronized (gAg) {
                isEmpty = gAg.A03.isEmpty();
            }
            return isEmpty;
        }
    }

    public abstract boolean A0Z();

    public abstract boolean A0a(C267324bN r1);

    public abstract boolean A0b(C267324bN r1, int i);

    public void Eab(AnonymousClass07Z r3, C66626MZn mZn) {
        0qQ.A0B(mZn, 0);
        this.A02.add(new C52010GBh(mZn, this));
    }

    public static ReentrantReadWriteLock.ReadLock A08(C52354GOy gOy) {
        ReentrantReadWriteLock.ReadLock readLock = gOy.A00.readLock();
        readLock.lock();
        return readLock;
    }

    public final Iterator A0H() {
        Iterator A07;
        if (this instanceof C52354GOy) {
            C52354GOy gOy = (C52354GOy) this;
            ReentrantReadWriteLock.ReadLock A08 = A08(gOy);
            try {
                return A07(gOy);
            } finally {
                A08.unlock();
            }
        } else if (!(this instanceof C52347GOr)) {
            return A07(this);
        } else {
            synchronized (this) {
                A07 = A07(this);
            }
            return A07;
        }
    }

    public void A0L() {
        this.A02.clear();
    }

    public final void A0M() {
        if (!this.A00) {
            this.A04.invoke();
        } else if (!this.A01) {
            this.A01 = true;
            this.A03.post(new C57772IgD(this.A04));
        }
    }

    public final void A0P(C267324bN r5, int i) {
        if (i >= 0) {
            C58735Iwi iwi = new C58735Iwi(i, 26, r5);
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (-1 < size) {
                    iwi.invoke(list.get(size));
                } else {
                    return;
                }
            }
        }
    }

    public static Iterator A07(C52009GBg gBg) {
        return gBg.A0I().iterator();
    }

    public static ReentrantReadWriteLock.WriteLock A09(ReentrantReadWriteLock reentrantReadWriteLock) {
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        return writeLock;
    }
}
