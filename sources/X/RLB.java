package X;

import android.media.MediaCodec;

public abstract class RLB extends IllegalStateException {
    public RLB(MediaCodec.CodecException codecException, String str) {
        super(0mp.A06("Code: %s, Recoverable %s, Transient :%s, Diagnostics %s, Explanation: %s", new Object[]{Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient()), codecException.getDiagnosticInfo(), str}), codecException);
    }
}
