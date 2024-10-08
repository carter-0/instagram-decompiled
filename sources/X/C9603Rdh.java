package X;

import android.media.MediaCodec;

/* renamed from: X.Rdh  reason: case insensitive filesystem */
public abstract class C9603Rdh {
    public static void A00(String str, Throwable th) {
        while (th != null && th != th.getCause()) {
            if (th instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                0KC.A0L("FBMediaCompositionPlayer", "%s::%s::diagnosticInfo=%s::isRecoverable=%s::isTransient=%s", codecException, new Object[]{str, codecException.getMessage(), codecException.getDiagnosticInfo(), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient())});
            } else {
                0KC.A0L("FBMediaCompositionPlayer", "%s::%s", th, new Object[]{str, th.getMessage()});
            }
            th = th.getCause();
        }
    }
}
