package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jW  reason: invalid class name and case insensitive filesystem */
public final class C315206jW implements C315036jF {
    public final Context A00;
    public final UserSession A01;

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return ((C316006kx) r3).A1e.A1f.getView();
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final void DsI(Context context, AnonymousClass0iw r9, UserSession userSession, C255773uh r11, C250973mM r12) {
        Context context2 = this.A00;
        UserSession userSession2 = this.A01;
        OYT.A00 = true;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%sSaveEffectNuxCount", userSession2.A06);
        0qQ.A07(formatStrLocaleSafe);
        SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences("SavedEffectPreferences", 0);
        0qQ.A07(sharedPreferences);
        OYT.A00(context2, userSession2, new 0tX(sharedPreferences, "SavedEffectPreferences").getInt(formatStrLocaleSafe, 0) + 1);
    }

    public C315206jW(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r6, C250973mM r7) {
        return new C47901ELv(context.getString(2131972579), 0nA.A09(context) / 2);
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        if (r7.A12() && (r9 instanceof C316006kx)) {
            Context context = this.A00;
            UserSession userSession2 = this.A01;
            if (!OYT.A00) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%sSaveEffectNuxCount", userSession2.A06);
                0qQ.A07(formatStrLocaleSafe);
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("SavedEffectPreferences", 0);
                0qQ.A07(sharedPreferences);
                if (new 0tX(sharedPreferences, "SavedEffectPreferences").getInt(formatStrLocaleSafe, 0) >= 3) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
