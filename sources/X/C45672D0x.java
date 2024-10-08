package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.D0x  reason: case insensitive filesystem */
public abstract class C45672D0x {
    public static C45425Cw5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45425Cw5 cw5 = new C45425Cw5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1A(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    cw5.A08 = A0l;
                } else if ("broadcast".equals(A17)) {
                    cw5.A01 = C45893D9w.parseFromJson(r4);
                } else if (C41845B3m.A1E(A17)) {
                    cw5.A07 = AnonymousClass7TG.A0l(r4);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    cw5.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("igtv_post_id".equals(A17)) {
                    cw5.A05 = AnonymousClass7TG.A0l(r4);
                } else if (TraceFieldType.BroadcastId.equals(A17)) {
                    cw5.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("cta_button_name".equals(A17)) {
                    cw5.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("igtv_post_cover_frame_url".equals(A17)) {
                    cw5.A00 = 16h.A00(r4);
                } else if ("broadcaster".equals(A17)) {
                    cw5.A02 = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            return cw5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C45425Cw5 cw5) {
        r2.A0c();
        r2.A0R("text", cw5.A08);
        if (cw5.A01 != null) {
            r2.A0q("broadcast");
            C45893D9w.A00(r2, cw5.A01);
        }
        C41846B3n.A10(r2, cw5.A07);
        String str = cw5.A06;
        if (str != null) {
            r2.A0R(DialogModule.KEY_MESSAGE, str);
        }
        String str2 = cw5.A05;
        if (str2 != null) {
            r2.A0R("igtv_post_id", str2);
        }
        String str3 = cw5.A03;
        if (str3 != null) {
            r2.A0R(TraceFieldType.BroadcastId, str3);
        }
        String str4 = cw5.A04;
        if (str4 != null) {
            r2.A0R("cta_button_name", str4);
        }
        if (cw5.A00 != null) {
            r2.A0q("igtv_post_cover_frame_url");
            16h.A01(r2, cw5.A00);
        }
        if (cw5.A02 != null) {
            r2.A0q("broadcaster");
            User user = cw5.A02;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        r2.A0Z();
    }
}
