package X;

import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.Slm  reason: case insensitive filesystem */
public final class C12059Slm implements C13706TfQ {
    public Pair A00;
    public final /* synthetic */ C12309SrC A01;
    public final /* synthetic */ ByteBuffer A02;

    public C12059Slm(C12309SrC srC, ByteBuffer byteBuffer) {
        this.A01 = srC;
        this.A02 = byteBuffer;
        this.A00 = Pxf.A0K(byteBuffer, -1);
    }

    public final void DVg(ByteBuffer byteBuffer, int i, long j) {
        C12309SrC srC = this.A01;
        srC.A06 = true;
        srC.A05 = byteBuffer;
    }

    public final Pair EHX() {
        this.A02.clear();
        return this.A00;
    }
}
