package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Eeo  reason: case insensitive filesystem */
public abstract class C48455Eeo {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        UserMonetizationProductType userMonetizationProductType;
        Object A01 = r7.A01();
        String A0p = DbS.A0p(A01);
        String str = (String) A01;
        EWH ewh = (EWH) EWH.A01.get(str);
        if (ewh != null) {
            String A0k = DbW.A0k(r7, A0p);
            List list = r7.A00;
            String A0t = DbU.A0t(list, 2);
            String A0d = Dba.A0d(list);
            switch (ewh.ordinal()) {
                case 0:
                    userMonetizationProductType = UserMonetizationProductType.IGTV_REVSHARE;
                    break;
                case 1:
                case 2:
                    userMonetizationProductType = UserMonetizationProductType.USER_PAY;
                    break;
                case 3:
                    userMonetizationProductType = UserMonetizationProductType.AFFILIATE;
                    break;
                case 4:
                case 5:
                    userMonetizationProductType = UserMonetizationProductType.INCENTIVE_PLATFORM;
                    break;
                case 6:
                    userMonetizationProductType = UserMonetizationProductType.FAN_CLUB_CREATOR;
                    break;
                case 7:
                    userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR;
                    break;
                case 8:
                    userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND;
                    break;
                case 9:
                case 10:
                    userMonetizationProductType = UserMonetizationProductType.REELS_OVERLAY_ADS;
                    break;
                case 11:
                    userMonetizationProductType = UserMonetizationProductType.CONTENT_APPRECIATION;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    userMonetizationProductType = UserMonetizationProductType.INCENTIVE_PLATFORM_SPEAKER_ENGAGEMENT;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            EWG A00 = C49055EoZ.A00(A0k);
            return Dba.A0U(C48892Els.A00(userMonetizationProductType, A00, A0t, A0d), DbS.A0M(C308206Td.A04(r6), DbW.A0R(r6)));
        }
        throw AnonymousClass7TF.A0W(AnonymousClass000.A00(128), str);
    }
}
