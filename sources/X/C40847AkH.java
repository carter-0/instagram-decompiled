package X;

import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.AkH  reason: case insensitive filesystem */
public final class C40847AkH implements Runnable {
    public final /* synthetic */ C359318cb A00;

    public C40847AkH(C359318cb r1) {
        this.A00 = r1;
    }

    public final void run() {
        C359318cb r4 = this.A00;
        IgdsMediaButton igdsMediaButton = r4.A0F;
        if (igdsMediaButton != null) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(r4.A0X, AnonymousClass7TE.A16(r4.A0S, 2131955431));
            A0f.A02();
            A0f.A03(igdsMediaButton);
            A0f.A07(C283255Gu.A07);
            A0f.A06 = new C40561Ae8(r4);
            A0f.A00().A07(r4.A0b);
        }
    }
}
