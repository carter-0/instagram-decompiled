package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2mx  reason: invalid class name and case insensitive filesystem */
public final class C229172mx implements 2ej {
    public final C71692eh A00;
    public final List A01 = new ArrayList();

    public final void A7c(AnonymousClass2eo r2) {
        this.A01.add(r2);
    }

    public final AnonymousClass2eo AX9(int i) {
        Object obj;
        List list = this.A01;
        int size = list.size();
        List list2 = this.A00.A01;
        int size2 = list2.size();
        if (size + size2 > i) {
            if (i < size) {
                obj = list.get(i);
            } else {
                obj = list2.get(i - size);
            }
            return (AnonymousClass2eo) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index ");
        sb.append(i);
        sb.append(AnonymousClass000.A00(3406));
        sb.append(size);
        sb.append(size2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public final void clear() {
        this.A01.clear();
    }

    public final Iterator iterator() {
        return new C41290ArW(this);
    }

    public final int size() {
        return this.A01.size() + this.A00.A01.size();
    }

    public C229172mx(C71692eh r2) {
        this.A00 = r2;
    }
}
