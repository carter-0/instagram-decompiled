package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Nvq  reason: case insensitive filesystem */
public abstract class C70012Nvq {
    /* JADX WARNING: type inference failed for: r1v12, types: [X.4wf, java.lang.Object] */
    public static final C68894NaW A00(Context context, UserSession userSession, OHO oho) {
        String str;
        String str2;
        Object obj;
        String str3;
        OHO oho2 = oho;
        String A00 = oho.A00.A00(context);
        Integer num = oho.A02;
        if (num == null || (str2 = oho.A04) == null || !C51971G9r.A1a(userSession, oho.A05)) {
            switch (oho.A01.intValue()) {
                case 0:
                    str = "disappearing_mode_on_client_admin_message";
                    break;
                case 1:
                    str = "disappearing_mode_off_client_admin_message";
                    break;
                case 2:
                    str = "disappearing_mode_duration_change_client_admin_message";
                    break;
                case 3:
                    str = "disappearing_mode_upgrade_from_vanish_mode_swipe_up";
                    break;
                case 4:
                    str = "disappearing_mode_upgrade_from_vanish_mode_update_app";
                    break;
                case 5:
                    str = "disappearing_mode_rollback";
                    break;
                default:
                    str = C273654mx.A00(673);
                    break;
            }
            return new C68894NaW((C74243PrX) null, (Integer) null, A00, str, (List) null, (List) null);
        }
        String A16 = AnonymousClass7TE.A16(context, num.intValue());
        boolean z = oho.A06;
        String A10 = C66580MXl.A10(A00, A16);
        int A05 = DbX.A05(A00) + " ".length();
        int length = A05 + A16.length();
        List list = null;
        if (z) {
            ? obj2 = new Object();
            obj2.A01 = A05;
            obj2.A00 = length;
            obj = obj2;
        } else {
            obj = null;
        }
        C278324wh r4 = new C278324wh(AnonymousClass05K.A00, "#999999", str2, A05, length, z);
        if (obj != null) {
            list = AnonymousClass7TE.A1I(obj);
        }
        switch (oho.A01.intValue()) {
            case 0:
                str3 = "disappearing_mode_on_client_admin_message";
                break;
            case 1:
                str3 = "disappearing_mode_off_client_admin_message";
                break;
            case 2:
                str3 = "disappearing_mode_duration_change_client_admin_message";
                break;
            case 3:
                str3 = "disappearing_mode_upgrade_from_vanish_mode_swipe_up";
                break;
            case 4:
                str3 = "disappearing_mode_upgrade_from_vanish_mode_update_app";
                break;
            case 5:
                str3 = "disappearing_mode_rollback";
                break;
            default:
                str3 = C273654mx.A00(673);
                break;
        }
        return new C68894NaW((C74243PrX) null, oho2.A03, A10, str3, list, AnonymousClass7TE.A1I(r4));
    }
}
