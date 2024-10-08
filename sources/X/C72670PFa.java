package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.PFa  reason: case insensitive filesystem */
public final class C72670PFa implements C74485Pvf {
    public final /* synthetic */ C3263576k A00;
    public final /* synthetic */ C69445Nlp A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;

    public C72670PFa(C3263576k r1, C69445Nlp nlp, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = nlp;
    }

    public final void D84() {
        DbU.A1R(0xI.A00(this.A02, "direct_blocked_composer_delete_chat"), this.A03);
    }

    public final void DNF() {
        UserSession userSession = this.A03;
        C3265677h.A0A(this.A00, this.A01, this.A02, userSession, "leave");
    }

    public final void Dka() {
        UserSession userSession = this.A03;
        AnonymousClass0iw r0 = this.A02;
        C3263576k r3 = this.A00;
        C69445Nlp nlp = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "direct_group_block_warning_dialog_impression");
        A0e.A8M(r3, "source");
        A0e.A8M(nlp, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0e.Cgf();
    }

    public final void Dn4() {
        UserSession userSession = this.A03;
        C3265677h.A0A(this.A00, this.A01, this.A02, userSession, "stay");
    }

    public final void onCancel() {
        UserSession userSession = this.A03;
        C3265677h.A0A(this.A00, this.A01, this.A02, userSession, "cancel");
    }
}
