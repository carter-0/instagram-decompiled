package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.proxygen.utils.Preconditions;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: X.T6j  reason: case insensitive filesystem */
public final class C12775T6j implements C13846TiM, C13750TgM {
    public int A00 = 0;
    public 1QS A01;
    public C13750TgM A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public final 1QU A07;
    public final C13667Teb A08;
    public final C13846TiM A09;
    public final S7W A0A;
    public final AnonymousClass0vF A0B;

    public final void E0P() {
        Preconditions.checkState(false, "onWillRetry should never happen on a LigeRetryResponseCallbacks");
        throw AnonymousClass00P.createAndThrow();
    }

    private void A00(String str) {
        1QU r4 = this.A07;
        if (r4.A09 == 1CE.A02) {
            1QS r2 = this.A01;
            r2.A00("X-Tigon-Is-Retry");
            r2.A01("X-Tigon-Is-Retry", "True");
        }
        if (str != null) {
            this.A0A.A04(this.A01, "retry_reason", str);
        }
        this.A09.E0P();
        S7W s7w = this.A0A;
        1QS r22 = this.A01;
        s7w.A00(r22, 002.A0O("http_client_send_request_", this.A00));
        this.A02 = this.A08.ExU(r22, r4, this, this.A0B);
        this.A03 = true;
    }

    public final void AGl(int i, boolean z) {
        C13750TgM tgM = this.A02;
        if (tgM != null) {
            tgM.AGl(i, z);
        }
    }

    public final void DCl(C8838RCa rCa) {
        int i;
        String str;
        if (!this.A06 && this.A01.A0C) {
            if (SRB.A0m) {
                String message = rCa.getMessage();
                if (message != null) {
                    Iterator it = SRB.A0h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (message.contains(AnonymousClass7TE.A18(it))) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else if (C11410SSi.A05(rCa) && (i = this.A00 + 1) < SRB.A0X) {
                this.A00 = i;
                HTTPRequestError hTTPRequestError = rCa.A00;
                if (hTTPRequestError == null || (str = hTTPRequestError.mErrMsg) == null) {
                    str = null;
                }
                A00(str);
                return;
            }
        }
        if (!this.A04) {
            this.A0A.A01(this.A01, TraceFieldType.RetryCount, this.A00);
            this.A09.DCl(rCa);
            this.A04 = true;
        }
    }

    public final void Deg() {
        if (!this.A05) {
            this.A09.Deg();
            this.A05 = true;
        }
    }

    public final void Df9(2ZD r3) {
        int i;
        if (!this.A01.A0C || !SRB.A0l || r3.A01 != 408 || (i = this.A00 + 1) >= SRB.A0X) {
            this.A03 = false;
            this.A06 = true;
            this.A09.Df9(r3);
            return;
        }
        this.A00 = i;
        A00("Request failed with status code 408");
    }

    public final void cancel() {
        C13750TgM tgM = this.A02;
        if (tgM != null) {
            tgM.cancel();
        }
    }

    public final void onBody(ByteBuffer byteBuffer) {
        if (!this.A03) {
            this.A06 = true;
            this.A09.onBody(byteBuffer);
        }
    }

    public final void onEOM() {
        if (!this.A03) {
            this.A06 = true;
            this.A0A.A01(this.A01, TraceFieldType.RetryCount, this.A00);
            this.A09.onEOM();
        }
    }

    public final void onFirstByteFlushed(long j) {
        this.A09.onFirstByteFlushed(j);
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        this.A09.onHeaderBytesReceived(j, j2);
    }

    public final void onLastByteAcked(long j, long j2) {
        this.A09.onLastByteAcked(j, j2);
    }

    public C12775T6j(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, 1QS r3, 1QU r4, C13667Teb teb, C13846TiM tiM, AnonymousClass0vF r7) {
        this.A08 = teb;
        this.A01 = r3;
        this.A07 = r4;
        this.A09 = tiM;
        this.A0B = r7;
        this.A0A = new S7W(lightweightQuickPerformanceLogger);
    }
}
