package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

public final class LRS {
    public static final C62052KYa A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C62052KYa) userSession.A01(C62052KYa.class, new C20699WxV(userSession, 10));
    }

    public final void A03(Activity activity, Fragment fragment, AnonymousClass818 r16, AnonymousClass819 r17, UserSession userSession, C66461MSp mSp, String str, String str2) {
        A02(activity, fragment, r16, r17, userSession, (LA0) null, mSp, (C66462MSq) null, (LBI) null, str, str2, false);
    }

    public final void A04(Activity activity, Fragment fragment, AnonymousClass819 r16, UserSession userSession, C66461MSp mSp) {
        A02(activity, fragment, AnonymousClass818.IG_INTERNAL_SETTINGS, r16, userSession, (LA0) null, mSp, (C66462MSq) null, (LBI) null, "", "", false);
    }

    public static final void A01(Context context, Integer num, int i) {
        int i2;
        switch (num.intValue()) {
            case 0:
                i2 = 2131975919;
                break;
            case 1:
                i2 = 2131975920;
                break;
            case 2:
                i2 = 2131975921;
                break;
            case 3:
                i2 = 2131975905;
                break;
            case 4:
                i2 = 2131975922;
                break;
            default:
                i2 = 2131975903;
                break;
        }
        int i3 = 6000;
        if (num == AnonymousClass05K.A00) {
            i3 = 3000;
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, i2);
        A0a.A01 = i3;
        A0a.A02 = i;
        if (context instanceof C249463jp) {
            ((C249463jp) context).Bx5().A0A(A0a.A00());
        } else {
            Dbb.A1Q(A0a);
        }
    }

    public final void A02(Activity activity, Fragment fragment, AnonymousClass818 r9, AnonymousClass819 r10, UserSession userSession, LA0 la0, C66461MSp mSp, C66462MSq mSq, LBI lbi, String str, String str2, boolean z) {
        Context context;
        C51972G9s.A1C(userSession, mSp);
        String str3 = str;
        0qQ.A0B(str3, 6);
        C62052KYa A00 = A00(userSession);
        CallerContext callerContext = C62052KYa.A02;
        A00.A01 = la0;
        A00.A07 = mSq;
        A00.A00 = r9;
        A00.A08 = lbi;
        A00.A09 = str3;
        A00.A0A = str2;
        boolean z2 = z;
        A00.A0C = z2;
        A00.A06 = mSp;
        if (r10 == null) {
            C63901LBh lBh = KYc.A02;
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = null;
            }
            r10 = lBh.A00(context, r9, userSession, z2);
        }
        A00.A00 = r10;
        C49887FBn A002 = C49797F7i.A00(userSession);
        A002.A02((ComponentActivity) activity, (Integer) null, r9.toString(), A00.A00.toString());
        A00.A04 = A002;
        if (fragment != null) {
            A002.A01(fragment);
        }
        A00.A05(activity);
    }
}
