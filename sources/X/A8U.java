package X;

import java.io.File;

public final class A8U {
    public final /* synthetic */ C15331Uag A00;

    public A8U(C15331Uag uag) {
        this.A00 = uag;
    }

    public final void A00() {
        C15331Uag uag = this.A00;
        File A01 = LIM.A01(AnonymousClass7TE.A0l(uag.A0M), ((C345597tm) C40161AUb.A00(uag.A01().A03.A09)).A00);
        C39749A7p A012 = uag.A01();
        AH4 ah4 = A012.A03;
        A8M a8m = A012.A01;
        0qQ.A0B(a8m, 1);
        if (ah4.A00 == 0) {
            a8m.A00(AnonymousClass7TE.A1B("Video recording is only supported in AR mode."));
        }
        ah4.A09.A07(new C40092AQx(a8m, ah4), A01);
        uag.A02().A02(C16612Uy8.VIDEO_CAPTURE_STARTED, "", (String) null);
    }
}
