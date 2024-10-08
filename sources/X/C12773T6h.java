package X;

import java.nio.ByteBuffer;

/* renamed from: X.T6h  reason: case insensitive filesystem */
public final class C12773T6h implements C13846TiM, C13750TgM {
    public C13750TgM A00;
    public final C13846TiM A01;

    public final void DCl(C8838RCa rCa) {
        0qQ.A0B(rCa, 0);
        Pxe.A1G();
        this.A01.DCl(rCa);
    }

    public final void AGl(int i, boolean z) {
        C13750TgM tgM = this.A00;
        if (tgM != null) {
            tgM.AGl(i, z);
        }
    }

    public final void cancel() {
        C13750TgM tgM = this.A00;
        if (tgM != null) {
            this.A00 = null;
            tgM.cancel();
        }
    }

    public C12773T6h(C13846TiM tiM) {
        this.A01 = tiM;
    }

    public final void Deg() {
        Pxe.A1G();
        this.A01.Deg();
    }

    public final void Df9(2ZD r2) {
        Pxe.A1G();
        this.A01.Df9(r2);
    }

    public final void E0P() {
        Pxe.A1G();
        this.A01.E0P();
    }

    public final void onBody(ByteBuffer byteBuffer) {
        Pxe.A1G();
        this.A01.onBody(byteBuffer);
    }

    public final void onEOM() {
        Pxe.A1G();
        this.A01.onEOM();
    }

    public final void onFirstByteFlushed(long j) {
        Pxe.A1G();
        this.A01.onFirstByteFlushed(j);
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        Pxe.A1G();
        this.A01.onHeaderBytesReceived(j, j2);
    }

    public final void onLastByteAcked(long j, long j2) {
        Pxe.A1G();
        this.A01.onLastByteAcked(j, j2);
    }
}
