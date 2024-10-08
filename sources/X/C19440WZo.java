package X;

import java.util.PriorityQueue;

/* renamed from: X.WZo  reason: case insensitive filesystem */
public final class C19440WZo implements C310696bT {
    public Integer A00 = AnonymousClass05K.A0N;
    public boolean A01;
    public final PriorityQueue A02 = new PriorityQueue(2, new C20381WqM((0sL) C20791Wz3.A00, 11));

    public final void DhT(Integer num) {
        0qQ.A0B(num, 0);
        DhV(this.A00, num);
        this.A00 = num;
    }

    public final void DhV(Integer num, Integer num2) {
        boolean A1U = AnonymousClass7TF.A1U(0, num, num2);
        Integer num3 = AnonymousClass05K.A01;
        if ((num == num3 && num2 == AnonymousClass05K.A0C) || num2 == AnonymousClass05K.A00) {
            this.A01 = A1U;
            C311166cF r0 = (C311166cF) this.A02.peek();
            if (r0 != null) {
                r0.A00 = A1U;
                r0.A04.postFrameCallback(r0.A03);
            }
        } else if (num2 == num3) {
            this.A01 = false;
            C311166cF r02 = (C311166cF) this.A02.peek();
            if (r02 != null) {
                r02.A00 = false;
            }
        }
    }

    public final boolean isEnabled() {
        return true;
    }

    public final void EBl(C311166cF r3) {
        PriorityQueue priorityQueue = this.A02;
        priorityQueue.add(r3);
        A00((C311166cF) priorityQueue.peek(), (C311166cF) priorityQueue.peek());
    }

    public final void FIz(C311166cF r3) {
        PriorityQueue priorityQueue = this.A02;
        priorityQueue.remove(r3);
        A00((C311166cF) priorityQueue.peek(), (C311166cF) priorityQueue.peek());
    }

    private final void A00(C311166cF r3, C311166cF r4) {
        if (!0qQ.A0K(r3, r4)) {
            if (r3 != null) {
                r3.A00 = false;
            }
            if (this.A01 && r4 != null) {
                r4.A00 = true;
                r4.A04.postFrameCallback(r4.A03);
            }
        }
    }
}
