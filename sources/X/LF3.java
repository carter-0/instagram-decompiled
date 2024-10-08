package X;

import com.facebook.ffmpeg.FFMpegBadDataException;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.IOException;

public final class LF3 {
    public final UserSession A00;
    public final C62848KnO A01;
    public final AnonymousClass7IH A02;

    public final LJ9 A00(Medium medium, MW0 mw0, String str) {
        Object kVx;
        String str2;
        0qQ.A0B(medium, 1);
        UserSession userSession = this.A00;
        1YO r1 = 1YO.A00;
        0qQ.A0A(r1);
        C62848KnO knO = this.A01;
        ShareType shareType = ShareType.IGTV;
        AnonymousClass7IH r7 = this.A02;
        AnonymousClass7TG.A1Q(r1, knO);
        0qQ.A0B(r7, 7);
        C59796JYp A002 = C59796JYp.A00(medium, 0);
        if (!ABQ.A00(A002, r7, 0, 900500, true)) {
            long j = A002.A03;
            if (j == -1) {
                str2 = "Illegal argument";
            } else if (j == -2) {
                str2 = "Runtime exception";
            } else if (j == -3) {
                str2 = 002.A0R("Unsupported video file mime type: ", A002.A06);
            } else if (0 > j || j > Long.MAX_VALUE) {
                str2 = "Unknown Error";
            } else {
                str2 = 002.A0Q("Duration is ", j);
            }
            kVx = new C62022KVw(str2);
        } else {
            try {
                medium.A07 = Q0X.A01(AnonymousClass7TE.A0t(C59796JYp.A00(medium, 0).A07));
            } catch (FFMpegBadDataException | IOException | RuntimeException unused) {
            }
            float f = 0.5625f;
            if (C63396KwH.A00(medium)) {
                f = 1.7778f;
            }
            AnonymousClass3Q2 A003 = JZ1.A00(str, 0);
            JZ1.A03(userSession, A003, A002, f);
            A003.A3J = medium.A0O;
            A003.A1k = shareType;
            A003.A5x = C63396KwH.A00(medium);
            kVx = new C62023KVx(A003);
        }
        if (kVx instanceof C62023KVx) {
            return new KTX(medium, mw0, ((C62023KVx) kVx).A00, false);
        }
        if (kVx instanceof C62022KVw) {
            return new KTW(((C62022KVw) kVx).A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    public final LJ9 A01(Medium medium, MW0 mw0, boolean z) {
        float A002;
        Object kVx;
        String str;
        UserSession userSession = this.A00;
        1YO r1 = 1YO.A00;
        0qQ.A0A(r1);
        C62848KnO knO = this.A01;
        ShareType shareType = ShareType.IGTV;
        AnonymousClass7IH r8 = this.A02;
        boolean A1Y = C51970G9q.A1Y(r1);
        AnonymousClass7TF.A1E(knO, 3, r8);
        C59796JYp A003 = C59796JYp.A00(medium, A1Y ? 1 : 0);
        if (!ABQ.A00(A003, r8, 0, 900500, true)) {
            long j = A003.A03;
            if (j == -1) {
                str = "Illegal argument";
            } else if (j == -2) {
                str = "Runtime exception";
            } else if (j == -3) {
                str = 002.A0R("Unsupported video file mime type: ", A003.A06);
            } else if (0 > j || j > Long.MAX_VALUE) {
                str = "Unknown Error";
            } else {
                str = 002.A0Q("Duration is ", j);
            }
            kVx = new C62022KVw(str);
        } else {
            try {
                medium.A07 = Q0X.A01(AnonymousClass7TE.A0t(C59796JYp.A00(medium, A1Y).A07));
            } catch (FFMpegBadDataException | IOException | RuntimeException unused) {
            }
            if (z) {
                A002 = 1.0f;
            } else {
                int i = medium.A07;
                if (i == 3 || i == 1) {
                    A002 = 1.0f / medium.A00();
                } else {
                    A002 = medium.A00();
                }
            }
            C229632nm.A02(A002, 0.5625f, 1.91f);
            AnonymousClass3Q2 A004 = JZ1.A00((String) null, A1Y);
            JZ1.A03(userSession, A004, A003, A002);
            A004.A3J = medium.A0O;
            A004.A1k = shareType;
            A004.A5x = C63396KwH.A00(medium);
            kVx = new C62023KVx(A004);
        }
        if (kVx instanceof C62023KVx) {
            return new KTX(medium, mw0, ((C62023KVx) kVx).A00, A1Y);
        } else if (kVx instanceof C62022KVw) {
            return new KTW(((C62022KVw) kVx).A00);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public LF3(UserSession userSession, C62848KnO knO, AnonymousClass7IH r3) {
        this.A00 = userSession;
        this.A01 = knO;
        this.A02 = r3;
    }
}
