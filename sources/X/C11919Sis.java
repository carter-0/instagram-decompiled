package X;

import android.graphics.Bitmap;
import java.util.Queue;

/* renamed from: X.Sis  reason: case insensitive filesystem */
public final class C11919Sis implements C13533Tc5 {
    public int A00;
    public Bitmap.Config A01;
    public final QH5 A02;

    public final void CsZ() {
        Queue queue = this.A02.A00;
        if (queue.size() < 20) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C11919Sis)) {
            return false;
        }
        C11919Sis sis = (C11919Sis) obj;
        if (this.A00 != sis.A00) {
            return false;
        }
        Bitmap.Config config = this.A01;
        Bitmap.Config config2 = sis.A01;
        if (config == null) {
            equals = DbW.A1a(config2);
        } else {
            equals = config.equals(config2);
        }
        if (equals) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + C51971G9r.A0E(this.A01);
    }

    public final String toString() {
        int i = this.A00;
        Bitmap.Config config = this.A01;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxh.A1P(A1A);
        A1A.append(i);
        A1A.append("](");
        return Pxg.A0q(config, A1A);
    }

    public C11919Sis(QH5 qh5) {
        this.A02 = qh5;
    }
}
