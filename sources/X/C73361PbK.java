package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.PbK  reason: case insensitive filesystem */
public final class C73361PbK implements Runnable {
    public final /* synthetic */ C70620ODr A00;
    public final /* synthetic */ C3259274s A01;
    public final /* synthetic */ DirectMessageIdentifier A02;
    public final /* synthetic */ Exception A03;

    public C73361PbK(C70620ODr oDr, C3259274s r2, DirectMessageIdentifier directMessageIdentifier, Exception exc) {
        this.A01 = r2;
        this.A02 = directMessageIdentifier;
        this.A00 = oDr;
        this.A03 = exc;
    }

    public final void run() {
        C3259274s r5 = this.A01;
        DirectMessageIdentifier directMessageIdentifier = this.A02;
        r5.FJr(new N4D(AnonymousClass05K.A0C), directMessageIdentifier);
        C70620ODr oDr = this.A00;
        Exception exc = this.A03;
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown error.";
        }
        oDr.A01.A02(directMessageIdentifier);
        AnonymousClass7GP r8 = oDr.A00.A05;
        long A0P = AnonymousClass7TE.A0P((long) oDr.A02.A00);
        0Aj A0e = AnonymousClass7TE.A0e(r8.A00, "audio_clips_transcription_failure");
        if (A0e.isSampled()) {
            C66583MXo.A12(A0e, A0P);
            A0e.AAJ("error_message", message);
            A0e.Cgf();
        }
        AnonymousClass930 r52 = r5.A00;
        if (r52 != null) {
            int hashCode = directMessageIdentifier.hashCode();
            String message2 = exc.getMessage();
            if (message2 != null) {
                r52.A00.markerAnnotate(331815788, hashCode, Pxd.A00(60), message2);
            }
            r52.A00.markerEnd(331815788, hashCode, 3);
        }
    }
}
