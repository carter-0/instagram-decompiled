package X;

import android.net.Uri;
import java.io.EOFException;

/* renamed from: X.4YK  reason: invalid class name */
public final class AnonymousClass4YK implements C265994Xd {
    public final byte[] A00 = new byte[4096];

    public final void AWP(C256683wB r1) {
    }

    public final void EJn(C266034Xh r1, int i, int i2, int i3, long j) {
    }

    public final void FMe(Uri uri) {
    }

    public final int EJl(C257123wt r4, int i, int i2, boolean z) {
        int read = r4.read(this.A00, 0, Math.min(4096, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final /* synthetic */ void EJh(AnonymousClass4XV r1, int i) {
        r1.A0H(i);
    }

    public final void EJi(AnonymousClass4XV r1, int i, int i2) {
        r1.A0H(i);
    }
}
