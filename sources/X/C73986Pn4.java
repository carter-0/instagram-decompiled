package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pn4  reason: case insensitive filesystem */
public final class C73986Pn4 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TransportPayload A02;
    public final /* synthetic */ AnonymousClass2Ep A03;
    public final /* synthetic */ C74551Pwk A04;
    public final /* synthetic */ 1OS A05;
    public final /* synthetic */ C66638Ma7 A06;
    public final /* synthetic */ IGFOAMessagingSendToSentLogger A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ 0rm A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ byte[] A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73986Pn4(TransportPayload transportPayload, AnonymousClass2Ep r3, C74551Pwk pwk, 1OS r5, C66638Ma7 ma7, IGFOAMessagingSendToSentLogger iGFOAMessagingSendToSentLogger, Long l, String str, List list, 0rm r11, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A06 = ma7;
        this.A0B = r11;
        this.A07 = iGFOAMessagingSendToSentLogger;
        this.A05 = r5;
        this.A0F = z;
        this.A0C = z2;
        this.A09 = str;
        this.A0D = z3;
        this.A0A = list;
        this.A08 = l;
        this.A0H = bArr;
        this.A0G = z4;
        this.A0E = z5;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r3;
        this.A04 = pwk;
        this.A02 = transportPayload;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass68L A0I;
        MailboxFutureImpl A0J;
        MailboxCallback opM;
        NAY nay = (NAY) obj;
        0qQ.A0B(nay, 0);
        C66638Ma7 ma7 = this.A06;
        OO1 oo1 = ma7.A03;
        0rm r7 = this.A0B;
        oo1.A03((List) null, 2010, (String) r7.A00);
        IGFOAMessagingSendToSentLogger iGFOAMessagingSendToSentLogger = this.A07;
        if (iGFOAMessagingSendToSentLogger != null) {
            iGFOAMessagingSendToSentLogger.onLogMsysApiMainContextInvoked();
        }
        1OS r6 = this.A05;
        PlatformLogger.platformEventStructuredLoggerS2SEventMsysApiMainContextInvoked(r6.A05);
        PlatformLogger.platformEventStructuredLoggerInstamadilloAddIsVanishModeAnnotationWithAliasId(r6.A05, "is_vanish_mode", this.A0F);
        PlatformLogger.platformEventStructuredLoggerInstamadilloAddIsDisappearingModeAnnotationWithAliasId(r6.A05, "is_disappearing_mode", this.A0C);
        C70833ONf oNf = ma7.A02;
        String str = this.A09;
        oNf.A02(str);
        0fh.A01("SendArmadilloExpressPayload-sendViaMEM", 319097164);
        Integer num = null;
        if (this.A0D) {
            List list = this.A0A;
            if (list != null) {
                Long A0r = C66581MXm.A0r(ma7.A00, AnonymousClass0t1.A01);
                if (A0r != null) {
                    ArrayList A0T = 00k.A0T(A0r, list);
                    long longValue = this.A08.longValue();
                    byte[] bArr = this.A0H;
                    boolean z = this.A0G;
                    boolean z2 = this.A0E;
                    int i = this.A01;
                    if (iGFOAMessagingSendToSentLogger != null) {
                        num = iGFOAMessagingSendToSentLogger.getInstanceKey();
                    }
                    C71685Op4 op4 = new C71685Op4(this.A02, this.A03, this.A04, r6, ma7, r7, 0);
                    A0I = C66581MXm.A0I(nay);
                    A0J = C66581MXm.A0J(A0I, op4);
                    String str2 = str;
                    opM = new C71701OpL(nay, A0J, num, str2, A0T, bArr, i, longValue, z, z2);
                } else {
                    throw AnonymousClass7TE.A0z("Viewer EIMU is empty for a group send.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Recipient EIMUs are empty for a group send.");
            }
        } else {
            long longValue2 = this.A08.longValue();
            byte[] bArr2 = this.A0H;
            boolean z3 = this.A0G;
            boolean z4 = this.A0E;
            int i2 = this.A00;
            int i3 = this.A01;
            if (iGFOAMessagingSendToSentLogger != null) {
                num = iGFOAMessagingSendToSentLogger.getInstanceKey();
            }
            C71685Op4 op42 = new C71685Op4(this.A02, this.A03, this.A04, r6, ma7, r7, 1);
            A0I = C66581MXm.A0I(nay);
            A0J = C66581MXm.A0J(A0I, op42);
            String str3 = str;
            byte[] bArr3 = bArr2;
            opM = new C71702OpM(nay, A0J, num, str3, bArr3, i2, i3, longValue2, z3, z4);
        }
        C66582MXn.A1E(A0I, opM, A0J);
        0qQ.A0A(A0J);
        0fh.A00(1521325755);
        UserSession userSession = ma7.A00;
        if (182.A06(0Tu.A05, userSession, 36329088248200999L) && C65261be.A00 != null) {
            0nY.A00().ATE(new NRH(userSession));
        }
        return C60340gF.A00;
    }
}
