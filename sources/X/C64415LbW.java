package X;

import android.net.Uri;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mcf.MsysError;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.List;

/* renamed from: X.LbW  reason: case insensitive filesystem */
public final class C64415LbW implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C64415LbW(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AnonymousClass4D7 r4;
        Object obj2;
        IGFOAMessagingSendToSentLogger A002;
        IGFOAMessagingSendToSentLogger A003;
        Throwable th;
        IGFOAMessagingSendToSentLogger A004;
        IGFOAMessagingSendToSentLogger A005;
        if (this.A00 != 0) {
            L3D l3d = (L3D) obj;
            0qQ.A0B(l3d, 0);
            MsysError msysError = l3d.A01;
            Uri uri = l3d.A00;
            AnonymousClass3Q2 r5 = ((LP8) this.A03).A0D;
            Integer num = r5.A2G;
            if (msysError != null || uri == null) {
                UserSession userSession = (UserSession) this.A02;
                C71122OdG.A03(userSession, (Integer) null, r5.A3p, (List) null, 1165);
                if (!(num == null || (A004 = AnonymousClass7G0.A00(userSession, num.intValue())) == null)) {
                    A004.onLogPIIRemovalFailed();
                }
                r4 = (AnonymousClass4D7) this.A01;
                if (r4 != null) {
                    AnonymousClass55S r2 = AnonymousClass55S.A0D;
                    if (msysError != null) {
                        th = msysError.getCause();
                    } else {
                        th = null;
                    }
                    obj2 = new C62011KVk(AnonymousClass55V.A01(r2, "PII Removal failed", (String) null, th));
                    r4.resumeWith(obj2);
                }
                return;
            }
            UserSession userSession2 = (UserSession) this.A02;
            C71122OdG.A03(userSession2, (Integer) null, r5.A3p, (List) null, 1164);
            if (!(num == null || (A005 = AnonymousClass7G0.A00(userSession2, num.intValue())) == null)) {
                A005.onLogPIIRemovalSuccess();
            }
            r5.A0i(uri.getPath());
            r4 = (AnonymousClass4D7) this.A01;
            if (r4 == null) {
                return;
            }
        } else {
            L3C l3c = (L3C) obj;
            0qQ.A0B(l3c, 0);
            MsysError msysError2 = l3c.A01;
            Uri uri2 = l3c.A00;
            AnonymousClass3Q2 r22 = ((LP8) this.A02).A0D;
            Integer num2 = r22.A2G;
            if (msysError2 != null || uri2 == null) {
                if (!(num2 == null || (A002 = AnonymousClass7G0.A00(((C65537Lv6) this.A03).A00, num2.intValue())) == null)) {
                    A002.onLogMediaScrutinyFailed();
                }
                r4 = (AnonymousClass4D7) this.A01;
                obj2 = C62012KVl.A00;
                r4.resumeWith(obj2);
            }
            if (!(num2 == null || (A003 = AnonymousClass7G0.A00(((C65537Lv6) this.A03).A00, num2.intValue())) == null)) {
                A003.onLogMediaScrutinySuccess();
            }
            r22.A1N.A0F = uri2.getPath();
            r4 = (AnonymousClass4D7) this.A01;
        }
        obj2 = C62013KVm.A00;
        r4.resumeWith(obj2);
    }
}
