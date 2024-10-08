package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ft8  reason: case insensitive filesystem */
public final /* synthetic */ class C51376Ft8 implements Runnable {
    public final /* synthetic */ C46521DgO A00;
    public final /* synthetic */ C283155Gi A01;

    public /* synthetic */ C51376Ft8(C46521DgO dgO, C283155Gi r2) {
        this.A00 = dgO;
        this.A01 = r2;
    }

    public final void run() {
        C46521DgO dgO = this.A00;
        C283155Gi r2 = this.A01;
        if (r2.A07 == AnonymousClass05K.A01) {
            UserSession userSession = dgO.A03;
            String str = r2.A09;
            AnonymousClass7TG.A1N(userSession, str);
            AnonymousClass5GM A002 = AnonymousClass5GL.A00(userSession);
            1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C66187MGy(A002, str, (AnonymousClass4D7) null, 32), A002.A04);
        }
    }
}
