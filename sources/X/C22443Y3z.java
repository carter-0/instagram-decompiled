package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Y3z  reason: case insensitive filesystem */
public final class C22443Y3z implements Iterator, AnonymousClass0s4 {
    public int A00;
    public Object A01 = AnonymousClass6G7.A00;
    public boolean A02;
    public int A03;
    public Object A04;
    public final C21085XDy A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.AbstractMap, X.XDx] */
    /* renamed from: A00 */
    public final C21086XDz next() {
        ? r2 = this.A05.A03;
        if (r2.A00 != this.A00) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            Object obj = this.A04;
            this.A01 = obj;
            this.A02 = true;
            this.A03++;
            Object obj2 = r2.get(obj);
            if (obj2 != null) {
                C21086XDz xDz = (C21086XDz) obj2;
                this.A04 = xDz.A00;
                return xDz;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Hash code of a key (");
            A1A.append(this.A04);
            throw new ConcurrentModificationException(AnonymousClass7TF.A0l(") has changed after it was added to the persistent map.", A1A));
        } else {
            throw new NoSuchElementException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, X.XDy] */
    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A03, this.A05.size());
    }

    public final void remove() {
        if (this.A02) {
            C21085XDy xDy = this.A05;
            C66580MXl.A1S(xDy, this.A01);
            this.A01 = null;
            this.A02 = false;
            this.A00 = xDy.A03.A00;
            this.A03--;
            return;
        }
        throw Pxe.A0i();
    }

    public C22443Y3z(Object obj, C21085XDy xDy) {
        this.A04 = obj;
        this.A05 = xDy;
        this.A00 = xDy.A03.A00;
    }
}
