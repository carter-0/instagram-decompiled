package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.User;

/* renamed from: X.R8m  reason: case insensitive filesystem */
public final class C8761R8m extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C8761R8m(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final void onFail(C268654dm r5) {
        int A032;
        int i;
        String str;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1860561516);
            if (Pxe.A0T((ReactContextBaseJavaModule) this.A01).A00() != null) {
                C13904TjR tjR = (C13904TjR) this.A02;
                Object A002 = r5.A00();
                if (A002 != null) {
                    str = ((AnonymousClass1XT) A002).getErrorMessage();
                } else {
                    str = "";
                }
                Pxi.A1K(IgReactCommentModerationModule.ERROR_SERVER_ERR, tjR, str);
            }
            i = -2034099791;
        } else {
            A032 = AnonymousClass0fD.A03(-590492301);
            i = -629195912;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        1Ln A06;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(417308666);
            int A033 = AnonymousClass0fD.A03(-1594372894);
            ReactContextBaseJavaModule reactContextBaseJavaModule = (ReactContextBaseJavaModule) this.A01;
            if (Pxe.A0T(reactContextBaseJavaModule).A00() != null) {
                User A012 = AnonymousClass0t1.A01.A01(DbS.A0U(DbU.A06(Pxe.A0T(reactContextBaseJavaModule).A00())));
                CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(this.A03);
                if (commentAudienceControlType == null) {
                    commentAudienceControlType = CommentAudienceControlType.UNRECOGNIZED;
                }
                A012.A03.EOU(commentAudienceControlType);
                ((C13904TjR) this.A02).resolve((Object) null);
            }
            AnonymousClass0fD.A0A(1184856457, A033);
            i = 1548383902;
        } else {
            A032 = AnonymousClass0fD.A03(448830635);
            int A034 = AnonymousClass0fD.A03(-2073001580);
            Object obj2 = ((AnonymousClass3JC) obj).A01;
            if (obj2 != null) {
                AnonymousClass3FZ r8 = (AnonymousClass3FZ) obj2;
                Class<QNh> cls = QNh.class;
                if (r8.A00(cls, "ig_iab_autofill_update_settings") != null && RGX.SUCCESS.equals(r8.A00(cls, "ig_iab_autofill_update_settings").A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RGX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE))) {
                    int optInt = r8.A00(cls, "ig_iab_autofill_update_settings").A00.optInt("count");
                    UserSession userSession = (UserSession) this.A01;
                    1Av A002 = 1Au.A00(userSession);
                    String str = "CONTACT_AUTOFILL";
                    if (this.A03.equals(str)) {
                        A002.A0U(optInt);
                        if (optInt >= RUW.A00(new 1yd(userSession))) {
                            A06 = 1Ln.A06((0wc) this.A02);
                            A06.A0k("USER_PERMANENT_OPTOUT");
                        }
                    } else {
                        A002.A1H(false);
                        A002.A0T(optInt);
                        if (optInt >= Pxg.A05(0Tu.A06, userSession, 36591905888927797L)) {
                            A06 = 1Ln.A06((0wc) this.A02);
                            A06.A0k("USER_PERMANENT_OPTOUT");
                            str = "PAYMENT_AUTOFILL";
                        }
                    }
                    A06.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                    A06.Cgf();
                }
            }
            AnonymousClass0fD.A0A(-1293729086, A034);
            i = 1196086257;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
