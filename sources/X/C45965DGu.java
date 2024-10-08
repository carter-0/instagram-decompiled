package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.DGu  reason: case insensitive filesystem */
public final class C45965DGu implements MXB {
    public final /* synthetic */ C42537BeI A00;
    public final /* synthetic */ boolean A01;

    public C45965DGu(C42537BeI beI, boolean z) {
        this.A00 = beI;
        this.A01 = z;
    }

    public final C62623Kiu AXt() {
        if (this.A01) {
            return C62623Kiu.PRIVATE;
        }
        return C62623Kiu.PUBLIC;
    }

    public final String getId() {
        return this.A00.A05(C42536BeH.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A08("fbid_v2");
    }

    public final String getProfilePicUrl() {
        return this.A00.A05(C42536BeH.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A09("profile_pic_url");
    }

    public final String getUsername() {
        return this.A00.A05(C42536BeH.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A0A(AnonymousClass9PN.A00());
    }
}
