package X;

import java.util.LinkedList;

/* renamed from: X.7mw  reason: invalid class name and case insensitive filesystem */
public final class C341467mw {
    public long A00;
    public final LinkedList A01 = new LinkedList();

    public final synchronized String A00() {
        String str;
        str = null;
        LinkedList<String> linkedList = this.A01;
        if (!linkedList.isEmpty()) {
            long j = this.A00;
            StringBuilder sb = new StringBuilder();
            for (String append : linkedList) {
                sb.append(append);
                sb.append(",");
            }
            sb.append(j);
            str = sb.toString();
            linkedList.clear();
            this.A00 = 0;
        }
        return str;
    }

    public final synchronized void A01(String str) {
        this.A00 = System.nanoTime();
        LinkedList linkedList = this.A01;
        linkedList.addLast(str);
        if (linkedList.size() > 40) {
            linkedList.removeFirst();
        }
    }
}
