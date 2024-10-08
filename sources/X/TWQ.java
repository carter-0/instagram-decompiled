package X;

import android.app.Activity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

public final class TWQ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C8955RIu rIu;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                String str2 = this.A05;
                String str3 = this.A04;
                boolean z = this.A06;
                return ((C7273Q1x) this.A03).A00((Q2X) this.A02, (Q1l) this.A01, str2, str3, z);
            case 4:
                C254783t2 r6 = (C254783t2) obj2;
                0qQ.A0B(r6, 0);
                String str4 = this.A04;
                F7B.A01((Activity) this.A01, (AnonymousClass4DH) this.A02, (UserSession) this.A03, r6, str4, this.A05, this.A06);
                return C60340gF.A00;
            default:
                1Ln r62 = (1Ln) obj2;
                0bb r2 = new 0bb();
                LoggingContext loggingContext = (LoggingContext) this.A03;
                C51971G9r.A1B(r2, loggingContext);
                List<C298525tb> list = (List) this.A01;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C298525tb r4 : list) {
                    switch (DbU.A02(r4, 0)) {
                        case 6:
                            rIu = C8955RIu.CONTACT_INFORMATION;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            rIu = C8955RIu.INCENTIVES;
                            break;
                        case 13:
                            rIu = C8955RIu.ITEM_LIST;
                            break;
                        case 19:
                            rIu = C8955RIu.PAYMENT_METHOD;
                            break;
                        case 20:
                            rIu = C8955RIu.PAYMENT_RECEIVER;
                            break;
                        case 21:
                            rIu = C8955RIu.PAY_BUTTON;
                            break;
                        case 24:
                            rIu = C8955RIu.PRICE_TABLE;
                            break;
                        case 25:
                            rIu = C8955RIu.PROMO_CODE;
                            break;
                        case 28:
                            rIu = C8955RIu.SHIPPING_ADDRESS;
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                            rIu = C8955RIu.SHIPPING_OPTIONS;
                            break;
                        case 33:
                            rIu = C8955RIu.TERMS;
                            break;
                        default:
                            throw C51973G9u.A0g(r4, "Invalid component type: ", AnonymousClass7TE.A1A());
                    }
                    A0r.add(rIu);
                }
                r2.A07(C273654mx.A00(134), A0r);
                r2.A03("is_prewarm", Boolean.valueOf(this.A06));
                String str5 = this.A04;
                int A0F = JTR.A0F(str5);
                if (A0F == -2086110754) {
                    if (str5.equals("PRE_FETCH")) {
                        str = "pre_fetch";
                    }
                    throw AnonymousClass7TF.A0W("Invalid component fetch type: ", str5);
                } else if (A0F != -482433343) {
                    if (A0F == 1804446588 && str5.equals("REGULAR")) {
                        str = "regular";
                    }
                    throw AnonymousClass7TF.A0W("Invalid component fetch type: ", str5);
                } else {
                    if (str5.equals("PRE_WARM")) {
                        str = "pre_warm";
                    }
                    throw AnonymousClass7TF.A0W("Invalid component fetch type: ", str5);
                }
                r2.A06("fetch_type", str);
                C66582MXn.A1B(r2, loggingContext);
                Pxg.A1J(r62, r2, this.A05);
                C51969G9p.A1G(r62, this.A02);
                return r62;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWQ(Object obj, Object obj2, Object obj3, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = str2;
        this.A06 = z;
    }
}
