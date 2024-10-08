package X;

import android.media.MediaCodec;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.RdW  reason: case insensitive filesystem */
public abstract class C9592RdW {
    public static final String A00(Throwable th) {
        StringBuilder sb;
        String message;
        Throwable th2 = new Throwable(th);
        C391719tX r2 = null;
        boolean z = false;
        while (th != null && !th.equals(th2)) {
            if ((th instanceof IOException) && (message = th.getMessage()) != null && 00l.A0d(message, "No space left on device", false)) {
                return "NoSpaceLeftOnDevice";
            }
            if ((th instanceof FileNotFoundException) || (th instanceof C62689Kkp)) {
                sb = AnonymousClass7TE.A1A();
                sb.append("FileNotFoundException(");
                sb.append(C59906JbV.A05(th));
            } else if (th instanceof C7960Qe1) {
                return "CodecNotSupportedException";
            } else {
                if (th instanceof C7961Qe2) {
                    return "MediaCodecConfigureException";
                }
                if (!(th instanceof C13496TbN)) {
                    if (th instanceof V24) {
                        return "ImageTextureNullPointerException";
                    }
                    if (th instanceof TQ9) {
                        return "TranscodeOutputSurfaceException";
                    }
                    if (th instanceof TQA) {
                        return "RendererTimeoutRuntimeException";
                    }
                    if (th instanceof RL2) {
                        return "VideoRenderResultException";
                    }
                    if (th instanceof TQC) {
                        return "ValidationException";
                    }
                    if (th instanceof C345117sx) {
                        sb = AnonymousClass7TE.A1A();
                        sb.append("GlException(");
                        sb.append(((C345117sx) th).A00);
                    } else if (th instanceof InterruptedException) {
                        return "InterruptedException";
                    } else {
                        if (!(th instanceof MediaCodec.CodecException)) {
                            if ((th instanceof C8961RJa) || (th instanceof C391719tX)) {
                                r2 = th;
                            }
                            th = th.getCause();
                            if (z) {
                                if (th2 != null) {
                                    th2 = th2.getCause();
                                } else {
                                    th2 = null;
                                }
                            }
                            z = !z;
                        }
                    }
                }
                return "MediaCodecException";
            }
            return C51967G9n.A0r(sb, ')');
        }
        if (r2 instanceof C391719tX) {
            return 002.A0I("OneCameraException(", ')', r2.A01);
        }
        if (r2 instanceof Qe3) {
            return "MediaDemuxerException";
        }
        if (r2 instanceof Qe4) {
            return "NoTrackException";
        }
        if (r2 instanceof Qe5) {
            return "NoVideoTrackException";
        }
        if (r2 instanceof C8961RJa) {
            return "VideoTranscoderException";
        }
        return "UnknownException";
    }
}
