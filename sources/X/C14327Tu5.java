package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Tu5  reason: case insensitive filesystem */
public final class C14327Tu5 {
    public final XBt A00;
    public final X41 A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: type inference failed for: r13v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgImageButton, java.lang.Object] */
    public final void A00(XBv xBv, C296935qt r28, 1Xj r29, IgImageButton igImageButton, boolean z) {
        String id;
        ? r13 = igImageButton;
        0qQ.A0B(r13, 2);
        XBv xBv2 = xBv;
        0qQ.A0B(xBv2, 3);
        C296935qt r5 = r28;
        C296905qq r1 = r5.A02;
        C296995qz B9n = this.A00.B9n(r5);
        1Xj r10 = r29;
        if (!(r29 == null || (id = r10.getId()) == null)) {
            r13.setTransitionName(id);
        }
        this.A01.ECL(r13, B9n, r1, r5, false);
        UserSession userSession = this.A03;
        boolean A022 = C321536uL.A02(userSession);
        1se A002 = 1sd.A00(userSession);
        0qQ.A0A(r10);
        if (A002.A05(r10)) {
            OSK.A00(new WBG(23, r10, xBv2), this.A02, r10, r13, B9n.A01, B9n.A00, false, A022);
            return;
        }
        WBF wbf = new WBF(5, (Object) r5, (Object) B9n, (Object) xBv2, (Object) r10);
        C18900WBt wBt = new C18900WBt(4, r10, B9n, xBv2);
        C14328Tu6 tu6 = new C14328Tu6(xBv2, r5);
        boolean z2 = !this.A04;
        if (r10.CeS()) {
            z2 = true;
        }
        int i = B9n.A01;
        int i2 = B9n.A00;
        C321466uD.A02(wbf, wBt, this.A02, userSession, r10, tu6, (AnonymousClass726) null, r13, (String) null, (String) null, r1.A00, i, i2, 0, z2, this.A05, z, false, false);
        if (xBv2.BVc()) {
            r13.addOnAttachStateChangeListener(new I9x(1, xBv2, r13, r10));
            xBv2.DK3(r10);
        }
    }

    public C14327Tu5(AnonymousClass0iw r1, UserSession userSession, XBt xBt, X41 x41, boolean z, boolean z2) {
        AnonymousClass7TG.A1Q(x41, userSession);
        this.A02 = r1;
        this.A01 = x41;
        this.A03 = userSession;
        this.A00 = xBt;
        this.A05 = z;
        this.A04 = z2;
    }
}
