package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.FGz  reason: case insensitive filesystem */
public final class C49966FGz {
    public static final C49966FGz A00 = new Object();

    public static final void A03(Context context, AnonymousClass0iw r9, UserSession userSession, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r9);
        FEU feu = new FEU(r9, userSession);
        Object obj = new Object();
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, 2131953349);
        A0a.A0L = A1Z;
        DbW.A0q(context, A0a, 2131953350);
        A0a.A0A = new FdC(userSession, feu, obj, str, A1Z ? 1 : 0);
        A0a.A01 = 5000;
        DbW.A0t(context.getResources(), A0a);
        Dbb.A1Q(A0a);
    }

    public static final boolean A05(UserSession userSession) {
        1AA A02;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass7TF.A0Q(userSession).A0N() == AnonymousClass05K.A0C && (A02 = 182.A02(userSession, 36328207779445827L)) != null && A02.Ah0(0Tu.A04, 36328207779445827L)) {
            return true;
        }
        return false;
    }

    public final void A07(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        A0Q.A03.EPI(Boolean.valueOf(z));
        17h.A00(userSession).A01(A0Q, true, false);
        if (z) {
            0xY AR4 = DbY.A0X(userSession, this).AR4();
            AR4.E5T("auto_follow_back_has_enabled_system_setting_before", true);
            AR4.apply();
        }
    }

    public final boolean A08(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass7TF.A0Q(userSession).A0N() == AnonymousClass05K.A0C && A05(userSession) && !A06(userSession, this) && !DbY.A0X(userSession, this).getBoolean("auto_follow_back_follow_prompt_dismissed", false)) {
            return true;
        }
        return false;
    }

    public final boolean A09(UserSession userSession, List list) {
        1AA A02;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass7TF.A0Q(userSession).A0N() != AnonymousClass05K.A0C || list.isEmpty()) {
            return false;
        }
        if ((!A05(userSession) || !A06(userSession, this)) && (A02 = 182.A02(userSession, 36328207779118143L)) != null && A02.Ah0(0Tu.A04, 36328207779118143L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.0r1, java.lang.Object] */
    public static final void A02(Context context, AnonymousClass0iw r9, UserSession userSession, User user, boolean z) {
        FEU feu = new FEU(r9, userSession);
        ? obj = new Object();
        C310336ap A0a = DbS.A0a();
        Context context2 = context;
        A0a.A0D = DbY.A0b(context2, user, 2131953337);
        A0a.A0L = true;
        DbW.A0q(context2, A0a, 2131953336);
        A0a.A0A = new FdF(context2, r9, userSession, feu, user, obj, z);
        int i = 5000;
        if (z) {
            i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        }
        A0a.A01 = i;
        DbW.A0t(context2.getResources(), A0a);
        Dbb.A1Q(A0a);
    }

    public static final int A00(UserSession userSession, C49966FGz fGz) {
        return DbT.A00(DbY.A0X(userSession, fGz), "auto_follow_back_profile_toast_impression_count");
    }

    public static final void A01(Activity activity, Context context, AnonymousClass0iw r22, UserSession userSession, G74 g74, List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            A0r.add(new AutoFollowBackBottomSheetData(A0k.Bh3(), A0k.getId(), A0k.getFullName(), A0k.getUsername()));
        }
        ArrayList A1D = AnonymousClass7TE.A1D(A0r);
        AnonymousClass0iw r4 = r22;
        UserSession userSession2 = userSession;
        FEU feu = new FEU(r4, userSession2);
        boolean A05 = A05(userSession2);
        Object obj = new Object();
        E7G e7g = new E7G();
        C331127Pr A0W = DbS.A0W(userSession2);
        G74 g742 = g74;
        A0W.A0U = new FmC(0, feu, obj, A1D, g742);
        int i = 2131953335;
        if (0qQ.A0K(r4.getModuleName(), "profile")) {
            i = 2131953344;
        }
        Context context2 = context;
        A0W.A0g = context2.getString(i);
        A0W.A1J = true;
        A0W.A0v = true;
        A0W.A0K = new FOP(3, feu, obj, g742, userSession2, e7g, A05);
        C331157Pu A002 = A0W.A00();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelableArrayList("auto_follow_back_list_data", A1D);
        A0a.putBoolean("auto_follow_back_system_setting_enabled", A05);
        e7g.setArguments(A0a);
        e7g.A00 = new F2D(context2, r4, A002);
        A002.A02(activity, e7g);
        int size = A1D.size();
        0Aj A003 = FEU.A00(feu);
        Dbb.A1A(C48138EZg.BOTTOMSHEET, A003);
        A003.A9F("num_requests", DbS.A0j(size));
        FEU.A01(A003, feu);
        if (A05) {
            0Aj A004 = FEU.A00(feu);
            Dbb.A1A(C48138EZg.SYSTEM_SETTING, A004);
            FEU.A01(A004, feu);
        }
    }

    public static final void A04(UserSession userSession, C49966FGz fGz) {
        0xY AR4 = DbY.A0X(userSession, fGz).AR4();
        AR4.E5Z("auto_follow_back_profile_toast_impression_count", A00(userSession, fGz) + 1);
        AR4.apply();
    }

    public static final boolean A06(UserSession userSession, C49966FGz fGz) {
        Boolean CP3 = DbV.A0k(userSession).CP3();
        if ((CP3 == null || !CP3.booleanValue()) && !DbT.A1a(DbY.A0X(userSession, fGz), "auto_follow_back_has_enabled_system_setting_before")) {
            return false;
        }
        return true;
    }
}
