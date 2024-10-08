package X;

import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: X.TMa  reason: case insensitive filesystem */
public final class C13116TMa implements Iterator {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Object A03;
    public List A04;
    public Queue A05;
    public boolean A06;
    public final /* synthetic */ TS7 A07;

    public C13116TMa(TS7 ts7) {
        this.A07 = ts7;
        this.A00 = ts7.A00;
    }

    private void A00(int i) {
        if (this.A02 < i) {
            if (this.A04 != null) {
                loop0:
                while (true) {
                    TS7 ts7 = this.A07;
                    if (i >= ts7.size()) {
                        break;
                    }
                    List list = this.A04;
                    Object A002 = TS7.A00(ts7, i);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() == A002) {
                            it.remove();
                            i++;
                        }
                    }
                    break loop0;
                }
            }
            this.A02 = i;
        }
    }

    public final boolean hasNext() {
        Queue queue;
        TS7 ts7 = this.A07;
        if (ts7.A00 == this.A00) {
            A00(this.A01 + 1);
            if (this.A02 < ts7.size() || ((queue = this.A05) != null && !queue.isEmpty())) {
                return true;
            }
            return false;
        }
        throw new ConcurrentModificationException();
    }

    public final Object next() {
        TS7 ts7 = this.A07;
        if (ts7.A00 == this.A00) {
            A00(this.A01 + 1);
            int i = this.A02;
            int size = ts7.size();
            if (i < size) {
                this.A01 = i;
                this.A06 = true;
                return TS7.A00(ts7, i);
            }
            Queue queue = this.A05;
            if (queue != null) {
                this.A01 = size;
                Object poll = queue.poll();
                this.A03 = poll;
                if (poll != null) {
                    this.A06 = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        boolean z;
        List list;
        Pxh.A1T(this.A06);
        TS7 ts7 = this.A07;
        int i = ts7.A00;
        int i2 = this.A00;
        if (i == i2) {
            this.A06 = false;
            this.A00 = i2 + 1;
            int i3 = this.A01;
            if (i3 < ts7.size()) {
                C10474Rsp removeAt = ts7.removeAt(i3);
                if (removeAt != null) {
                    if (this.A05 == null || (list = this.A04) == null) {
                        this.A05 = new ArrayDeque();
                        list = DbS.A0v(3);
                        this.A04 = list;
                    }
                    Object obj = removeAt.A01;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() == obj) {
                                it.remove();
                                break;
                            }
                        } else {
                            this.A05.add(obj);
                            break;
                        }
                    }
                    Queue queue = this.A05;
                    Object obj2 = removeAt.A00;
                    Iterator it2 = queue.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next() == obj2) {
                                it2.remove();
                                break;
                            }
                        } else {
                            this.A04.add(obj2);
                            break;
                        }
                    }
                }
                this.A01--;
                this.A02--;
                return;
            }
            Object obj3 = this.A03;
            obj3.getClass();
            int i4 = 0;
            while (true) {
                if (i4 >= ts7.A01) {
                    z = false;
                    break;
                } else if (ts7.A02[i4] == obj3) {
                    ts7.removeAt(i4);
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            17k.A0F(z);
            this.A03 = null;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
