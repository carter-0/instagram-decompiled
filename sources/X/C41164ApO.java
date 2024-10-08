package X;

import java.util.AbstractCollection;

/* renamed from: X.ApO  reason: case insensitive filesystem */
public final class C41164ApO implements Runnable {
    public final /* synthetic */ AnonymousClass7NM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;

    public C41164ApO(AnonymousClass7NM r1, String str, C62320sa r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void run() {
        AbstractCollection abstractCollection = (AbstractCollection) this.A00.A01.get(this.A01);
        if (abstractCollection != null) {
            abstractCollection.remove(this);
        }
        this.A02.invoke();
    }
}
