package X;

import android.media.MediaCodec;

/* renamed from: X.Qny  reason: case insensitive filesystem */
public class C8318Qny extends C261794Ay {
    public final 2Km A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8318Qny(2Km r3, Throwable th) {
        super(002.A0R("Decoder failed: ", r3 != null ? r3.A03 : null), th);
        this.A00 = r3;
        if (th instanceof MediaCodec.CodecException) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
    }
}
