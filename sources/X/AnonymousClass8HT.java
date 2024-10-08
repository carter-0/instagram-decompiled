package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.8HT  reason: invalid class name */
public final class AnonymousClass8HT {
    public long A00 = 518927814;
    public long A01 = 518928411;
    public long A02 = 17315248;
    public final 29E A03;
    public final C357638Yz A04;

    public AnonymousClass8HT(29E r3, C357638Yz r4) {
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        this.A04 = r4;
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        this.A03.A0C(str, this.A00);
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        29E r3 = this.A03;
        r3.A09(this.A02, TraceFieldType.FailureReason, str);
        r3.A07(str, "", 17315248, this.A02);
    }

    public final void A00() {
        C279284yO r0;
        C357638Yz r02 = this.A04;
        if (r02 != null && (r0 = (C279284yO) r02.A08.A00) != null) {
            String str = r0.A02;
            29E r3 = this.A03;
            long A032 = r3.A03(518928411, 12000);
            this.A01 = A032;
            r3.A09(A032, "camera_destination", str);
        }
    }
}
