package X;

import android.graphics.Bitmap;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;

/* renamed from: X.M0n  reason: case insensitive filesystem */
public final class C65821M0n implements C13824Thu {
    public final List A00;
    public final long A01;
    public final List A02;

    public final boolean Cqr() {
        return true;
    }

    public final void DKn(long j) {
    }

    public final int A00(long j) {
        long j2 = j + this.A01;
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (Math.abs(AnonymousClass7TE.A0R(list.get(i)) - j2) < StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                return i;
            }
        }
        return -1;
    }

    public C65821M0n(List list, long j) {
        this.A02 = list;
        this.A01 = j;
        this.A00 = 0sr.A1M(new Bitmap[list.size()]);
    }

    public final void CyD(long j, int i, Bitmap bitmap) {
        int A002 = A00(j);
        if (A002 != -1) {
            this.A00.set(A002, bitmap);
        }
    }

    public final boolean ErY(int i, long j) {
        int A002 = A00(j);
        if (A002 == -1 || this.A00.get(A002) != null) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Long AVQ(List list) {
        return null;
    }
}
