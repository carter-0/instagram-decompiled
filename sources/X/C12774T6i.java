package X;

import com.facebook.location.platform.api.Location;
import java.nio.ByteBuffer;

/* renamed from: X.T6i  reason: case insensitive filesystem */
public final class C12774T6i implements C13846TiM, C13750TgM {
    public int A00;
    public C13750TgM A01;
    public 1QS A02;
    public boolean A03;
    public boolean A04;
    public final 1QS A05;
    public final 1QU A06;
    public final C13667Teb A07;
    public final C13846TiM A08;
    public final AnonymousClass0vF A09;

    public C12774T6i(1QS r2, 1QU r3, C13667Teb teb, C13846TiM tiM, AnonymousClass0vF r6) {
        0qQ.A0B(teb, 1);
        this.A07 = teb;
        this.A05 = r2;
        this.A08 = tiM;
        this.A06 = r3;
        this.A09 = r6;
    }

    public final void DCl(C8838RCa rCa) {
        0qQ.A0B(rCa, 0);
        this.A04 = false;
        this.A08.DCl(rCa);
    }

    public final void E0P() {
        this.A04 = false;
        this.A08.E0P();
        if (this.A06.A09 == 1CE.A02) {
            1QS r2 = this.A05;
            r2.A00("X-Tigon-Is-Retry");
            r2.A01("X-Tigon-Is-Retry", "True");
        }
    }

    public final void AGl(int i, boolean z) {
        C13750TgM tgM = this.A01;
        if (tgM != null) {
            tgM.AGl(i, z);
        }
    }

    public final void Deg() {
        if (!this.A03) {
            this.A08.Deg();
            this.A03 = true;
        }
    }

    public final void Df9(2ZD r4) {
        int i = r4.A01;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 <= 10 && (i == 301 || i == 302 || i == 303 || i == 307)) {
            try {
                1QS r2 = this.A05;
                1Fn A002 = r4.A00(Location.TAG);
                if (A002 != null) {
                    this.A02 = C11410SSi.A01((1Qb) null, r2, A002);
                    this.A04 = true;
                    return;
                }
                throw JTO.A0u("Redirect required, but Location header missing from response");
            } catch (Throwable th) {
                0wb.A07("LigerRedirect", th);
            }
        }
        this.A08.Df9(r4);
    }

    public final void cancel() {
        C13750TgM tgM = this.A01;
        if (tgM != null) {
            tgM.cancel();
        }
    }

    public final void onBody(ByteBuffer byteBuffer) {
        if (!this.A04) {
            this.A08.onBody(byteBuffer);
        }
    }

    public final void onEOM() {
        if (this.A04) {
            1QS r3 = this.A02;
            if (r3 != null) {
                this.A04 = false;
                this.A01 = this.A07.ExU(r3, this.A06, this, this.A09);
                return;
            }
            throw AnonymousClass7TE.A0z("mRedirectRequest should not be null if mPendingRedirect is true.  onResponse() should be call before onEOM()");
        }
        this.A08.onEOM();
    }

    public final void onFirstByteFlushed(long j) {
        this.A08.onFirstByteFlushed(j);
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        this.A08.onHeaderBytesReceived(j, j2);
    }

    public final void onLastByteAcked(long j, long j2) {
        this.A08.onLastByteAcked(j, j2);
    }
}
