package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6if  reason: invalid class name and case insensitive filesystem */
public final class C314676if implements AnonymousClass0eK {
    public Object A00;
    public final List A01 = new ArrayList();
    public final AnonymousClass0eK A02;
    public volatile boolean A03;

    public final Object get() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    this.A00 = this.A02.get();
                    this.A03 = true;
                    List<C314656id> list = this.A01;
                    for (C314656id D78 : list) {
                        D78.D78();
                    }
                    list.clear();
                }
            }
        }
        Object obj = this.A00;
        0qQ.A0A(obj);
        return obj;
    }

    public C314676if(AnonymousClass0eK r2) {
        this.A02 = r2;
    }
}
