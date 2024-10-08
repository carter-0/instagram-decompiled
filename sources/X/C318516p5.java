package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import java.util.List;

/* renamed from: X.6p5  reason: invalid class name and case insensitive filesystem */
public final class C318516p5 extends AnonymousClass370 {
    public AvatarCoinFlipBackgroundOptionResponse A00;
    public C318586pC A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;

    /* renamed from: A00 */
    public final C318586pC FH3() {
        C318586pC r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
    }
}
