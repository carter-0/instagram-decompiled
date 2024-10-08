package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

public final class PGO implements C247813gx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C68167N3h A01;
    public final /* synthetic */ OW6 A02;
    public final /* synthetic */ PJO A03;
    public final /* synthetic */ boolean A04;

    public PGO(C68167N3h n3h, OW6 ow6, PJO pjo, int i, boolean z) {
        this.A04 = z;
        this.A03 = pjo;
        this.A02 = ow6;
        this.A00 = i;
        this.A01 = n3h;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r7) {
        0qQ.A0B(r7, 0);
        if (r7.A02 == null) {
            PJO pjo = this.A03;
            C68167N3h n3h = this.A01;
            if (!AnonymousClass7TF.A1W(n3h.A0B, 1iA.A0a)) {
                C59689JTv.A01(pjo.A00.A0e, "failed_to_load_photo_toast", 2131961945, 0);
            }
            DirectVisualMessageViewerController directVisualMessageViewerController = pjo.A00;
            C66819MdB mdB = directVisualMessageViewerController.A0D;
            if (mdB != null) {
                mdB.Ddu();
            }
            String A0A = C66647MaG.A0A(directVisualMessageViewerController.A0x);
            UserSession userSession = directVisualMessageViewerController.A0m;
            AnonymousClass4DH r0 = directVisualMessageViewerController.A0f;
            if (A0A != null) {
                String A012 = n3h.A01();
                String str = n3h.A0I;
                C51972G9s.A1D(A012, str);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "photo_cant_load");
                A0e.AAJ("m_pk", str);
                A0e.AAJ("item_id", A012);
                C66580MXl.A1J(A0e, A0A);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (!this.A04) {
            PJO pjo2 = this.A03;
            DirectVisualMessageViewerController.A07(this.A01, this.A02, pjo2.A00, this.A00);
        }
    }
}
