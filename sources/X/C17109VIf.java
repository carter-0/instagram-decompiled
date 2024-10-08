package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.VIf  reason: case insensitive filesystem */
public abstract class C17109VIf {
    public static final void A00(17Z r3, C15036UKp uKp) {
        0qQ.A0B(uKp, 1);
        r3.A0c();
        r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uKp.A07);
        r3.A0R(Dbe.A01(), uKp.A09);
        String str = uKp.A06;
        if (str != null) {
            r3.A0R("full_name", str);
        }
        C53387GnJ gnJ = uKp.A00;
        if (gnJ != null) {
            r3.A0q(AnonymousClass000.A00(1407));
            r3.A0c();
            r3.A0P(IgReactMediaPickerNativeModule.HEIGHT, gnJ.A00);
            r3.A0R("url", gnJ.A02);
            r3.A0P(IgReactMediaPickerNativeModule.WIDTH, gnJ.A01);
            r3.A0Z();
        }
        String str2 = uKp.A08;
        if (str2 != null) {
            r3.A0R("profile_pic_url", str2);
        }
        Boolean bool = uKp.A04;
        if (bool != null) {
            r3.A0S("is_verified", bool.booleanValue());
        }
        Boolean bool2 = uKp.A03;
        if (bool2 != null) {
            r3.A0S("is_private", bool2.booleanValue());
        }
        String str3 = uKp.A05;
        if (str3 != null) {
            r3.A0R("charity_id", str3);
        }
        Boolean bool3 = uKp.A01;
        if (bool3 != null) {
            r3.A0S(AnonymousClass000.A00(3427), bool3.booleanValue());
        }
        Boolean bool4 = uKp.A02;
        if (bool4 != null) {
            r3.A0S(AnonymousClass000.A00(3435), bool4.booleanValue());
        }
        r3.A0Z();
    }
}
