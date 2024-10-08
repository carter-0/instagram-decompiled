package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.VtC  reason: case insensitive filesystem */
public final class C18513VtC {
    public final UserSession A00;
    public final 1as A01;
    public final AnonymousClass7VU A02;
    public final 1Av A03;
    public final AnonymousClass6W7 A04;
    public final C17648Vbe A05;
    public final C17277VPe A06;
    public final C66832MdQ A07;
    public final C17102VHy A08;
    public final C18389Vqp A09;

    public C18513VtC(UserSession userSession, 1as r3, AnonymousClass7VU r4, C66832MdQ mdQ, 1Av r6, AnonymousClass6W7 r7, C17648Vbe vbe, C17102VHy vHy, C18389Vqp vqp, C17277VPe vPe) {
        DbW.A1N(vqp, 2, r4);
        0qQ.A0B(r7, 7);
        C51969G9p.A1N(r6, 9, mdQ);
        this.A00 = userSession;
        this.A09 = vqp;
        this.A01 = r3;
        this.A06 = vPe;
        this.A02 = r4;
        this.A08 = vHy;
        this.A04 = r7;
        this.A05 = vbe;
        this.A03 = r6;
        this.A07 = mdQ;
    }

    public static final void A00(DirectShareTarget directShareTarget, C255773uh r9, C18513VtC vtC, User user, String str, boolean z) {
        1Xj r2 = r9.A0b;
        if (r2 != null) {
            String id = user.getId();
            String str2 = r9.A0k;
            0qQ.A07(str2);
            AnonymousClass7TF.A1D(directShareTarget, 0, str);
            C68165N3f n3f = new C68165N3f(r2, directShareTarget, id, str2, str, "reel", z);
            Long BST = user.BST();
            if (BST != null) {
                n3f.A04 = BST;
            }
            vtC.A01.A0D(vtC.A00, n3f.A00(), "reel", "");
            return;
        }
        0wb.A03("StoriesMessageComposerRepository", "Message failed to send. Potential cause: no valid recipient found in ReelItem or Reel object.");
    }
}
