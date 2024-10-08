package X;

import java.util.NoSuchElementException;

/* renamed from: X.9gb  reason: invalid class name and case insensitive filesystem */
public abstract class C383999gb extends C249803kO {
    public Object A00;

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final Object next() {
        C367948rp BW9;
        C367948rp r0;
        Object obj = this.A00;
        if (obj != null) {
            if (this instanceof C383989ga) {
                BW9 = ((C367948rp) obj).BWA();
                r0 = ((C383989ga) this).A00.A00;
            } else {
                BW9 = ((C367948rp) obj).BW9();
                r0 = ((C383979gZ) this).A00.A00;
            }
            if (BW9 == r0) {
                BW9 = null;
            }
            this.A00 = BW9;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
