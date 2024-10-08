package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.IOException;

/* renamed from: X.9lO  reason: invalid class name and case insensitive filesystem */
public final class C386929lO extends 0ng {
    public final /* synthetic */ C21986Xoh A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass888 A02;
    public final /* synthetic */ C353148Gl A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386929lO(C21986Xoh xoh, UserSession userSession, AnonymousClass888 r6, C353148Gl r7, boolean z) {
        super(79, 4, false, false);
        this.A00 = xoh;
        this.A01 = userSession;
        this.A02 = r6;
        this.A04 = z;
        this.A03 = r7;
    }

    public final void run() {
        C61072JwA jwA;
        BackgroundGradientColors A022;
        C21986Xoh xoh = this.A00;
        AnonymousClass888 r6 = this.A02;
        boolean z = this.A04;
        try {
            XZ9 xz9 = C21986Xoh.A0S;
            String str = (String) xoh.A01(xz9);
            if (str != null) {
                int A002 = AIF.A00(str);
                if (z || !AnonymousClass888.A00(r6, "video_recording")) {
                    Object A012 = xoh.A01(xz9);
                    if (A012 != null) {
                        A022 = C39908AIz.A02(AnonymousClass7TE.A0t((String) A012));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    A022 = new BackgroundGradientColors(-16711936, -65281);
                }
                jwA = new C61072JwA(A002, 7, (Object) 0oY.A01(A022, xoh.A00(C21986Xoh.A0M).intValue()));
                11Z.A02(new C41141Ap1(jwA, xoh, this.A03));
                return;
            }
            throw new IOException("null file path");
        } catch (IOException e) {
            0kD.A07("CameraControllerVideoCaptureAsyncProcessor", "performAsyncWork - failed to extract media duration", e);
            jwA = new C61072JwA(-1, 7, (Object) null);
        }
    }
}
