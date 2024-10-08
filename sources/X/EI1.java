package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

public final class EI1 extends 0ng {
    public final /* synthetic */ EM4 A00;
    public final /* synthetic */ C47695EDe A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI1(EM4 em4, C47695EDe eDe) {
        super(706);
        this.A01 = eDe;
        this.A00 = em4;
    }

    public final void run() {
        ImmutableList copyOf;
        1Q0 r0;
        int intValue;
        EM4 em4 = this.A00;
        User user = em4.A00;
        user.A03.Ek2(em4.A08);
        DbY.A1P(user);
        Integer num = AnonymousClass05K.A0j;
        C47695EDe eDe = this.A01;
        Integer num2 = eDe.A09;
        if (!num.equals(num2)) {
            if ((eDe instanceof EMH) || (intValue = num2.intValue()) == 1) {
                r0 = 1Q0.A0w;
            } else if (intValue != 2) {
                r0 = 1Q0.A0u;
            } else {
                r0 = 1Q0.A0x;
            }
            eDe.A02(user, r0);
        }
        if (em4.A07 != null) {
            0tS A002 = 0tS.A00();
            0s0 r4 = A002.A2S;
            AnonymousClass0YZ[] r8 = 0tS.A4G;
            if (AnonymousClass7TG.A1a(A002, r4, r8, 186)) {
                0tS A003 = 0tS.A00();
                AnonymousClass7TF.A1J(A003, A003.A2T, r8, 187, true);
            }
        }
        AnonymousClass0aP r6 = eDe.A05;
        Activity activity = eDe.A01;
        activity.getClass();
        String str = em4.A07;
        UserSession A02 = C46413Dea.A02(activity, eDe.A04, r6, user, str, false);
        27y A004 = 27u.A00(A02);
        CallerContext.A01("LoginCallbacks");
        A004.A00((C363768kJ) null);
        2Lv.A00(A02).A02(CallerContext.A01("LoginCallbacks"), (C363768kJ) null, "ig_login_util");
        Long l = em4.A02;
        C324556zW A005 = C324546zV.A00(A02);
        if (l != null) {
            String l2 = Long.toString(l.longValue());
            0xY AR4 = A005.A00.AR4();
            AR4.E5g("account_delegate_ig_id", l2);
            AR4.apply();
            0qQ.A0B(l2, 1);
            AnonymousClass0BO.A00(A02).A02.A09(user, l2);
        } else {
            0xY AR42 = A005.A00.AR4();
            AR42.E5g("account_delegate_ig_id", (String) null);
            AR42.apply();
            AnonymousClass0BO.A00(A02).A02.A06(user);
        }
        List list = em4.A0B;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        if (!AnonymousClass4KJ.A00(copyOf)) {
            AnonymousClass3EO.A00(A02).A05(copyOf);
        }
        EWC ewc = eDe.A0D;
        if (ewc == EWC.NONCE || ewc == EWC.LOCALAUTH) {
            Context applicationContext = activity.getApplicationContext();
            String str2 = em4.A06;
            if (str2 == null || !str2.contains("one_click_login")) {
                if (C319606qt.A01(A02).A0K(em4.A00.getId())) {
                    C319606qt.A01(A02).A0G(em4.A00.getId());
                }
                boolean A0J = C319606qt.A01(A02).A0J(A02.A06);
                C319606qt A012 = C319606qt.A01(A02);
                String id = em4.A00.getId();
                A012.A08(applicationContext, DbS.A0O("aymh"), A02, Boolean.valueOf(A0J), false, AnonymousClass05K.A0C, id, true);
            }
        }
        activity.runOnUiThread(new C51513FvL(A02, em4, this, user));
        if (!TextUtils.isEmpty(em4.A09)) {
            FFR.A02().A02(user.getId(), em4.A09);
        }
    }
}
