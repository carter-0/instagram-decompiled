package X;

import java.util.PriorityQueue;

/* renamed from: X.5fJ  reason: invalid class name and case insensitive filesystem */
public final class C290435fJ {
    public final PriorityQueue A00 = new PriorityQueue(10, C18466VsG.A03);

    public final synchronized C18466VsG A00(long j) {
        PriorityQueue priorityQueue;
        C18466VsG vsG;
        while (true) {
            priorityQueue = this.A00;
            if (priorityQueue.isEmpty()) {
                break;
            }
            C18466VsG vsG2 = (C18466VsG) priorityQueue.peek();
            if (vsG2.A01.A07[vsG2.A00].A00 >= j - 100000) {
                break;
            }
            priorityQueue.poll();
        }
        if (!priorityQueue.isEmpty()) {
            C18466VsG vsG3 = (C18466VsG) priorityQueue.peek();
            if (Math.abs(vsG3.A01.A07[vsG3.A00].A00 - j) <= 100000) {
                vsG = (C18466VsG) priorityQueue.poll();
            }
        }
        vsG = null;
        return vsG;
    }

    public final synchronized void A01(C18466VsG vsG) {
        PriorityQueue priorityQueue = this.A00;
        if (priorityQueue.size() < 200) {
            priorityQueue.add(vsG);
        }
    }
}
