package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FpD  reason: case insensitive filesystem */
public final class C51141FpD implements 1aV {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass2Ep A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C51141FpD(AnonymousClass0iw r1, C307786Rm r2, 1a8 r3, UserSession userSession, AnonymousClass2Ep r5, String str, List list) {
        this.A04 = r5;
        this.A03 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A06 = list;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass2Ep r3 = this.A04;
        if (r3.BJy().A00 != null) {
            UserSession userSession = this.A03;
            C49742F4h.A01(this.A01.A00, this.A00, userSession, r3, this.A05, this.A06);
            this.A02.A01();
        }
    }
}
