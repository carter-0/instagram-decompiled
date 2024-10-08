package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9pB  reason: invalid class name and case insensitive filesystem */
public final class C389279pB extends AnonymousClass2xK {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ 26t A01;

    public C389279pB(C52971GgO ggO, 26t r2) {
        this.A00 = ggO;
        this.A01 = r2;
    }

    public final void DsC(AnonymousClass5Gv r6) {
        C52971GgO ggO = this.A00;
        ggO.A03 = false;
        0xa r2 = this.A01.A00;
        AnonymousClass7TG.A1L(r2.AR4(), r2, "key_avatar_comments_tooltip_view_count", 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(ggO.A0C.A02), C66579MXk.A00(122));
        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "avatars_in_comments");
        A0e.Cgf();
    }
}
