package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.reels.ReelType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OPu  reason: case insensitive filesystem */
public abstract class C70880OPu {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.7FJ, java.lang.Object] */
    public static AnonymousClass7FJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("media".equals(A17)) {
                    obj.A01 = 1Xj.A00(r4);
                } else if (C41845B3m.A1A(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("is_linked".equals(A17)) {
                    obj.A09 = r4.A0d();
                } else if ("is_moment".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0S(r4);
                } else if ("is_reel_persisted".equals(A17)) {
                    obj.A0A = r4.A0d();
                } else if ("reel_type".equals(A17)) {
                    obj.A02 = AnonymousClass3HS.A00(AnonymousClass7TG.A0l(r4));
                } else if ("story_share_type".equals(A17)) {
                    String A1P = r4.A1P();
                    Integer num = AnonymousClass05K.A01;
                    if (!"chat_sticker_initial".equals(A1P)) {
                        num = AnonymousClass05K.A00;
                    }
                    obj.A04 = num;
                } else if ("reel_id".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("reel_owner".equals(A17)) {
                    obj.A00 = C45616CzS.parseFromJson(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass7FJ r3) {
        String str;
        r2.A0c();
        if (r3.A01 != null) {
            r2.A0q("media");
            1Xj r1 = r3.A01;
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            1Xv.A07(r2, r1);
        }
        C41846B3n.A0z(r2, r3.A08);
        String str2 = r3.A06;
        if (str2 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str2);
        }
        String str3 = r3.A05;
        if (str3 != null) {
            r2.A0R(DialogModule.KEY_MESSAGE, str3);
        }
        r2.A0S("is_linked", r3.A09);
        Boolean bool = r3.A03;
        if (bool != null) {
            r2.A0S("is_moment", bool.booleanValue());
        }
        r2.A0S("is_reel_persisted", r3.A0A);
        ReelType reelType = r3.A02;
        if (reelType != null) {
            r2.A0R("reel_type", reelType.A00);
        }
        Integer num = r3.A04;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            } else {
                str = "chat_sticker_initial";
            }
            r2.A0R("story_share_type", str);
        }
        String str4 = r3.A07;
        if (str4 != null) {
            r2.A0R("reel_id", str4);
        }
        if (r3.A00 != null) {
            r2.A0q("reel_owner");
            C45616CzS.A00(r2, r3.A00);
        }
        r2.A0Z();
    }
}
