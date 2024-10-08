package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.T6g  reason: case insensitive filesystem */
public final class C12772T6g implements C13846TiM {
    public int A00;
    public C8838RCa A01;
    public boolean A02;
    public boolean A03;
    public final 1Qe A04;
    public final 1QS A05;
    public final S7W A06;

    public final void DCl(C8838RCa rCa) {
        short s;
        0qQ.A0B(rCa, 0);
        if (this.A01 == null) {
            1Qe r0 = this.A04;
            1QS r3 = this.A05;
            r0.A04(r3, rCa);
            this.A01 = rCa;
            S7W s7w = this.A06;
            s7w.A01(r3, "dispatch_new_data_count", this.A00);
            String message = rCa.getMessage();
            if (message != null) {
                if (message.equals("Request was canceled.")) {
                    s = 4;
                }
                s7w.A04(r3, TraceFieldType.FailureReason, message);
                s = 3;
            } else {
                message = "Null";
                s7w.A04(r3, TraceFieldType.FailureReason, message);
                s = 3;
            }
            s7w.A06(r3, s);
            return;
        }
        throw DbT.A0m();
    }

    public final void E0P() {
    }

    public final void Deg() {
        if (!this.A02) {
            this.A04.A02(this.A05);
            this.A02 = true;
            return;
        }
        throw DbT.A0m();
    }

    public final void Df9(2ZD r5) {
        boolean z = this.A02;
        String A002 = AnonymousClass000.A00(423);
        if (!z) {
            throw AnonymousClass7TE.A0z(A002);
        } else if (!this.A03) {
            1Qe r0 = this.A04;
            1QS r3 = this.A05;
            r0.A00(r5, r3);
            this.A03 = true;
            this.A06.A01(r3, TraceFieldType.StatusCode, r5.A01);
        } else {
            throw AnonymousClass7TE.A0z(A002);
        }
    }

    public final void onBody(ByteBuffer byteBuffer) {
        if (this.A03) {
            this.A04.A05(this.A05, byteBuffer);
            this.A00++;
            return;
        }
        throw DbT.A0m();
    }

    public final void onEOM() {
        if (this.A03) {
            1Qe r0 = this.A04;
            1QS r3 = this.A05;
            r0.A03(r3);
            S7W s7w = this.A06;
            s7w.A01(r3, "dispatch_new_data_count", this.A00);
            s7w.A06(r3, 2);
            return;
        }
        throw DbT.A0m();
    }

    public final void onFirstByteFlushed(long j) {
        S7W s7w = this.A06;
        1QS r3 = this.A05;
        s7w.A00(r3, "request_body_first_byte_flushed");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onFirstByteFlushed(r3, j);
            } else {
                return;
            }
        }
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        S7W s7w = this.A06;
        1QS r3 = this.A05;
        s7w.A00(r3, "response_headers_end");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onHeaderBytesReceived(r3, j, j2);
            } else {
                return;
            }
        }
    }

    public final void onLastByteAcked(long j, long j2) {
        S7W s7w = this.A06;
        1QS r3 = this.A05;
        s7w.A00(r3, "request_body_last_byte_acked");
        ArrayList arrayList = this.A04.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C262234Cr) arrayList.get(size)).onLastByteAcked(r3, j, j2);
            } else {
                return;
            }
        }
    }

    public C12772T6g(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, 1Qe r3, 1QS r4) {
        AnonymousClass7TG.A1Q(r3, lightweightQuickPerformanceLogger);
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = new S7W(lightweightQuickPerformanceLogger);
    }
}
