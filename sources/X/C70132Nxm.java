package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;

/* renamed from: X.Nxm  reason: case insensitive filesystem */
public abstract class C70132Nxm {
    /* JADX WARNING: type inference failed for: r4v2, types: [X.OUr, java.lang.Object] */
    public static final AnonymousClass5HJ A00(UserSession userSession, C70723OHs oHs) {
        AnonymousClass5HN r8;
        int i;
        UserSession userSession2 = userSession;
        C70807OMc oMc = new C70807OMc(userSession2);
        OUr oUr = OUr.A00;
        OUr oUr2 = oUr;
        if (oUr == null) {
            ? obj = new Object();
            OUr.A00 = obj;
            oUr2 = obj;
        }
        C70723OHs oHs2 = oHs;
        int i2 = oHs2.A01.A00;
        String valueOf = String.valueOf(oHs2.A00.A00);
        String valueOf2 = String.valueOf(oHs2.A04);
        String valueOf3 = String.valueOf(oHs2.A05);
        AnonymousClass5HN[] values = AnonymousClass5HN.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r8 = null;
                break;
            }
            r8 = values[i3];
            if (r8.A00 == i2) {
                break;
            }
            i3++;
        }
        String A00 = O1U.A00(r8);
        AnonymousClass5HN[] values2 = AnonymousClass5HN.values();
        int length2 = values2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                i = -1;
                break;
            }
            AnonymousClass5HN r82 = values2[i4];
            if (r82.A00 == i2) {
                O1T o1t = O1T.$redex_init_class;
                i = r82.ordinal();
                break;
            }
            i4++;
        }
        String str = "direct_v2_delete_item";
        if (i == 1 || i == 4) {
            str = "direct_v2_message";
        } else if (!(i == 2 || i == 3)) {
            str = "";
        }
        String str2 = oHs2.A02;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", PublicKeyCredentialControllerUtility.JSON_KEY_ID, valueOf, "x", str2);
        0qQ.A07(formatStrLocaleSafe);
        String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s_%s", valueOf, str2, String.valueOf((long) i2), valueOf2);
        0qQ.A07(formatStrLocaleSafe2);
        AnonymousClass5HJ A002 = oMc.A00((SimpleImageUrl) null, (String) null, valueOf3, str, A00, userSession2.A06, formatStrLocaleSafe, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, formatStrLocaleSafe2, str2, valueOf2, valueOf, (List) null, true);
        A002.A1U = oHs2.A07;
        A002.A1S = oUr2.A00(002.A0H(str2, '_', i2));
        return A002;
    }
}
