package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class UYG extends C272124k8 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UYG(X5r x5r, UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = x5r;
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A002;
        int i;
        switch (this.A00) {
            case 0:
                A002 = A00(this, 224595091);
                i = -1186123883;
                break;
            case 1:
                A002 = A00(this, -1651366905);
                i = 1271437806;
                break;
            case 2:
                A002 = A00(this, -1293481487);
                i = -2138023896;
                break;
            case 3:
                A002 = A00(this, -647283204);
                i = 692571612;
                break;
            default:
                A002 = A00(this, -2015193086);
                i = -709955885;
                break;
        }
        AnonymousClass0fD.A0A(i, A002);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(410572476);
                int A032 = AnonymousClass0fD.A03(1341156221);
                ((X5r) this.A01).Dos((Bundle) null, new C17210VMo((UXF) obj));
                AnonymousClass0fD.A0A(-1709771025, A032);
                i = 998773851;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(2008629769);
                int A033 = AnonymousClass0fD.A03(400477840);
                ((X5r) this.A01).Dos((Bundle) null, WGJ.A00);
                AnonymousClass0fD.A0A(1272945176, A033);
                i = -219305004;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(570978140);
                int A034 = AnonymousClass0fD.A03(1999188996);
                ((X5r) this.A01).Dos((Bundle) null, WGK.A00);
                AnonymousClass0fD.A0A(-88275396, A034);
                i = -279487030;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(1129421505);
                C15250UXk uXk = (C15250UXk) obj;
                int A04 = DbX.A04(uXk, -2034645797);
                ((X5r) this.A01).Dos((Bundle) null, new C17211VMp(uXk));
                AnonymousClass0fD.A0A(-733408844, A04);
                i = 1066948068;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-547267432);
                C15239UWz uWz = (C15239UWz) obj;
                int A042 = DbX.A04(uWz, 1519694973);
                ((X5r) this.A01).Dos((Bundle) null, new C17212VMq(uWz));
                AnonymousClass0fD.A0A(2050569738, A042);
                i = -159141422;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public static int A00(UYG uyg, int i) {
        int A03 = AnonymousClass0fD.A03(i);
        ((X5r) uyg.A01).onFailure(new Throwable());
        return A03;
    }
}
