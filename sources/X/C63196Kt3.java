package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Kt3  reason: case insensitive filesystem */
public abstract class C63196Kt3 {
    public static final String A00(Context context, UserSession userSession, Integer num) {
        String A0h;
        int i;
        switch (C51967G9n.A03(num, 2)) {
            case 2:
                i = 2131973537;
                break;
            case 3:
                i = 2131973545;
                break;
            case 4:
                i = 2131973542;
                break;
            case 5:
                i = 2131973538;
                break;
            case 6:
                i = 2131973544;
                break;
            case 7:
                i = 2131973547;
                break;
            case 8:
                i = 2131973546;
                break;
            case 9:
                i = 2131973543;
                break;
            case 10:
                i = 2131973541;
                break;
            case 11:
                i = 2131973548;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A0h = DbW.A0h(context, Integer.valueOf(DbS.A04(0Tu.A05, userSession, 36605576767673620L)), 2131973540);
                break;
            case 13:
                i = 2131973539;
                break;
            default:
                i = 2131973549;
                break;
        }
        A0h = context.getString(i);
        0qQ.A07(A0h);
        return A0h;
    }
}
