package X;

import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9QK  reason: invalid class name */
public final class AnonymousClass9QK extends AnonymousClass4M2 implements C357848Zx {
    public AnonymousClass82X A00;
    public boolean A01;
    public int A02 = -1;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public final AnonymousClass9QJ A04;
    public final C234482xw A05;
    public final AnonymousClass4MM A06;

    public final void DCm(AnonymousClass4MN r2, String str, String str2, String str3) {
        0qQ.A0B(str3, 3);
        this.A05.A05(str3);
    }

    public final int E6k(String str, short[] sArr, int i) {
        0qQ.A0B(sArr, 1);
        int i2 = 0;
        if (this.A00 != null && this.A01) {
            int currentPosition = this.A06.getCurrentPosition();
            if (this.A02 != currentPosition) {
                this.A02 = currentPosition;
                AnonymousClass82X r0 = this.A00;
                if (r0 != null) {
                    r0.A04(currentPosition);
                }
            }
            while (i2 < i) {
                C40724Ahy ahy = (C40724Ahy) this.A03.poll();
                if (ahy == null) {
                    break;
                } else if (ahy.A00 >= currentPosition) {
                    byte[] bArr = ahy.A01;
                    int min = Math.min(bArr.length / 2, i - i2);
                    ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, i2, min);
                    i2 += min;
                }
            }
        }
        return i2;
    }

    public final void DTt(byte[] bArr, long j) {
        if (this.A01) {
            this.A03.add(new C40724Ahy(bArr, j));
        }
    }

    public final void DZ2(AnonymousClass4MN r2, long j) {
        this.A05.A03();
    }

    public final void Dxh(long j, String str) {
        this.A05.A00();
    }

    public final void DyS(long j) {
        this.A05.A02();
        UserSession userSession = this.A04.A00.A07;
        29H r4 = 27p.A01(userSession).A03;
        r4.A04 = r4.A0E.A02(17645025, r4.A04);
        29I r1 = 27p.A01(userSession).A02;
        AnonymousClass7TG.A1K(r1);
        29I.A00(r1, "backing_track_player_is_playing");
    }

    public AnonymousClass9QK(AnonymousClass9QJ r2, C234482xw r3, AnonymousClass4MM r4) {
        this.A06 = r4;
        this.A05 = r3;
        this.A04 = r2;
    }
}
