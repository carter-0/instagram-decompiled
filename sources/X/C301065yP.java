package X;

import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.5yP  reason: invalid class name and case insensitive filesystem */
public final class C301065yP implements 2IR {
    public final /* synthetic */ AnonymousClass638 A00;
    public final /* synthetic */ AnonymousClass6AU A01;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        AnonymousClass6AU r4 = this.A01;
        2I1 r3 = r4.A06;
        String message = th.getMessage();
        String str = "";
        if (message == null) {
            message = str;
        }
        r3.A06("login_result", message);
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = r4.A07;
        if (iGFOAMessagingReadyLogger != null) {
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            iGFOAMessagingReadyLogger.annotateLoginResult(str);
        }
        AnonymousClass6AQ r0 = r4.A05;
        r0.A01();
        String message3 = th.getMessage();
        if (message3 == null) {
            message3 = "login failure";
        }
        r0.A0C.accept(message3);
        0KC.A0O("RxAdvancedCryptoTransportV2", "Failure on getting login result: %s", new Object[]{th.getMessage()});
    }

    public C301065yP(AnonymousClass638 r1, AnonymousClass6AU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String obj2;
        C301055yO r7 = (C301055yO) obj;
        AnonymousClass6AU r4 = this.A01;
        2I1 r3 = r4.A06;
        String str2 = "";
        if (r7 == null || (str = r7.toString()) == null) {
            str = str2;
        }
        r3.A06("login_result", str);
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = r4.A07;
        if (iGFOAMessagingReadyLogger != null) {
            if (!(r7 == null || (obj2 = r7.toString()) == null)) {
                str2 = obj2;
            }
            iGFOAMessagingReadyLogger.annotateLoginResult(str2);
        }
        if (r7 == null) {
            AnonymousClass6AQ r0 = r4.A05;
            r0.A01();
            r0.A0C.accept("login result null");
        } else {
            AnonymousClass6AQ r5 = r4.A05;
            String obj3 = r7.toString();
            0qQ.A0B(obj3, 0);
            r5.A0C.accept(obj3);
            if (!r7.equals(C301055yO.A05)) {
                Integer num = r7.A00;
                if (num == AnonymousClass05K.A0Y || (num == AnonymousClass05K.A0j && r7.A01 == AnonymousClass05K.A00)) {
                    r5.A01 = 2;
                    2I1 r02 = r5.A0G;
                    if (r02 != null) {
                        r02.A02.markerPoint(r02.A01, r02.A00, "act_login_end");
                    }
                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger2 = r5.A0H;
                    if (iGFOAMessagingReadyLogger2 != null) {
                        iGFOAMessagingReadyLogger2.onLogActLoginEnd();
                    }
                    r5.A0D.accept(Integer.valueOf(r5.A01));
                    r5.A0A.set(true);
                } else {
                    r5.A01();
                }
            } else {
                return;
            }
        }
        r4.A02.accept(this.A00);
    }
}
