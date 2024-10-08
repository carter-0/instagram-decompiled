package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;

/* renamed from: X.OMc  reason: case insensitive filesystem */
public final class C70807OMc {
    public final AnonymousClass5ER A00;
    public final UserSession A01;
    public final AnonymousClass65Y A02;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5HJ] */
    public final AnonymousClass5HJ A00(SimpleImageUrl simpleImageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, boolean z) {
        0qQ.A0B(str2, 1);
        AnonymousClass5ER r3 = this.A00;
        ? obj = new Object();
        obj.A1O = true;
        obj.A03 = System.currentTimeMillis();
        obj.A1N = false;
        obj.A14 = null;
        obj.A0B = PushChannelType.A0D;
        obj.A07 = 2HA.A0c;
        obj.A00 = -1.0f;
        obj.A01 = 0;
        obj.A02 = 0;
        obj.A0Z = null;
        obj.A1T = false;
        obj.A1L = null;
        obj.A1M = false;
        obj.A0K = C51971G9r.A0m();
        obj.A05 = null;
        obj.A1I = str;
        obj.A0r = str2;
        obj.A0X = str3;
        obj.A0g = str6;
        obj.A0j = str5;
        obj.A1C = str7;
        obj.A12 = str8;
        obj.A11 = str4;
        obj.A0f = str9;
        obj.A08 = r3;
        obj.A1T = z;
        obj.A1L = list;
        obj.A0C = simpleImageUrl;
        obj.A1A = str10;
        obj.A1F = str11;
        return obj;
    }

    public /* synthetic */ C70807OMc(UserSession userSession) {
        AnonymousClass65Y r2 = new AnonymousClass65Y(C60960kU.A00);
        AnonymousClass5ER r1 = new AnonymousClass5ER(0, 0);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r2;
        this.A00 = r1;
    }

    public final AnonymousClass5HJ A01(String str, String str2, String str3) {
        String str4 = this.A01.A06;
        String str5 = str;
        if (str != null) {
            String str6 = str2;
            if (str2 != null) {
                return A00((SimpleImageUrl) null, (String) null, "", "direct_v2_delete_item", "direct_v2_text", str4, str3, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, str5, str6, (String) null, (String) null, (List) null, false);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
