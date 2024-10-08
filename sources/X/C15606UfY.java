package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.UfY  reason: case insensitive filesystem */
public final class C15606UfY extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 0r1 A02;

    public C15606UfY(1P0 r1, UserSession userSession, 0r1 r3) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1620715466);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(-1393865576, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1446004226);
        this.A00.onStart();
        AnonymousClass0fD.A0A(-2000267774, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(496087343);
        C270194gL r6 = (C270194gL) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -867738294);
        Reel A0G = 1OP.A05(this.A01).A0G(r6);
        0r1 r0 = this.A02;
        1P0 r2 = this.A00;
        C270194gL r1 = A0G.A0H;
        if (r1 != null && !r0.A00) {
            r2.onSuccess(r1);
        }
        AnonymousClass0fD.A0A(2001634518, A0D);
        AnonymousClass0fD.A0A(-1441352603, A03);
    }
}
