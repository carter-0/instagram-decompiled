package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4pB  reason: invalid class name and case insensitive filesystem */
public final class C274844pB extends C274854pC {
    public static C274844pB A0F;
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public long A03 = -1;
    public long A04 = -1;
    public long A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Thread A09;
    public List A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public final C275174pi A0D;
    public final short[] A0E;

    public C274844pB(C275174pi r4) {
        Integer num = AnonymousClass05K.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = r4;
    }

    public final String A07() {
        if (this.A0A) {
            return "nativePollOnce";
        }
        Class cls = this.A07;
        if (cls != null) {
            return cls.getName();
        }
        Class cls2 = this.A09;
        if (cls2 == null) {
            return "unknown";
        }
        String A0b = 002.A0b(cls2.getName(), "/", this.A00);
        Class cls3 = this.A08;
        if (cls3 != null) {
            return 002.A0g(A0b, "/", cls3.getName());
        }
        return A0b;
    }

    public final void A08() {
        int i = this.A01 - 1;
        this.A01 = i;
        if (i <= 0) {
            A03();
            this.A04 = -1;
            this.A03 = -1;
            this.A00 = 0;
            this.A02 = 0;
            this.A01 = 0;
            this.A05 = -1;
            this.A09 = null;
            this.A0B = false;
            this.A0C = false;
            Integer num = AnonymousClass05K.A00;
            this.A06 = num;
            this.A07 = num;
            List list = this.A0A;
            if (list != null) {
                list.clear();
            }
            this.A08 = num;
            C275174pi r3 = this.A0D;
            if (r3 != null) {
                AtomicInteger atomicInteger = r3.A02;
                if (atomicInteger.get() < C275174pi.A03) {
                    LinkedList linkedList = r3.A01;
                    synchronized (linkedList) {
                        linkedList.addLast(this);
                        atomicInteger.set(linkedList.size());
                    }
                }
            }
        }
    }

    public final void A09(Integer num) {
        Integer num2;
        Integer num3;
        Integer num4 = AnonymousClass05K.A0N;
        if (num != num4 && num != (num2 = AnonymousClass05K.A0C) && num != (num3 = AnonymousClass05K.A0Y)) {
            Integer num5 = this.A08;
            if (num5 == num4 || num5 == num2 || num5 == num3) {
                A08();
            }
        } else if (this.A08 == AnonymousClass05K.A00) {
            this.A01++;
        }
        this.A08 = num;
    }

    public C274844pB() {
        Integer num = AnonymousClass05K.A00;
        this.A06 = num;
        this.A07 = num;
        this.A01 = 0;
        this.A0E = new short[3];
        this.A08 = num;
        this.A0D = null;
    }
}
