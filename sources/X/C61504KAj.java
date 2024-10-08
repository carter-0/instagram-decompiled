package X;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.KAj  reason: case insensitive filesystem */
public final class C61504KAj extends 19W {
    public int A00;
    public long A01;
    public final 1QS A02;
    public final 1QU A03;

    public final void onFailed(1QS r10, IOException iOException) {
        AnonymousClass7TG.A1N(r10, iOException);
        long uptimeMillis = SystemClock.uptimeMillis();
        iOException.getMessage();
        C262224Cq r0 = C64551Qq.A02;
        AnonymousClass7TE.A1Z(new C52359GPe(iOException, r10, this, (AnonymousClass4D7) null, 6, uptimeMillis), r0);
    }

    public final void onSucceeded(1QS r9) {
        0qQ.A0B(r9, 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass7TE.A1Z(new MGF(r9, this, (AnonymousClass4D7) null, 13, uptimeMillis), C64551Qq.A02);
    }

    public C61504KAj(1QS r1, 1QU r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public final void onNewData(1QS r5, 1QU r6, ByteBuffer byteBuffer) {
        AnonymousClass7TG.A1T(r5, r6, byteBuffer);
        this.A01 += (long) (byteBuffer.remaining() - byteBuffer.arrayOffset());
    }

    public final void onResponseStarted(1QS r2, 1QU r3, 2ZD r4) {
        AnonymousClass7TG.A1T(r2, r3, r4);
        this.A00 = r4.A01;
    }
}
