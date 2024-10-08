package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2xA  reason: invalid class name and case insensitive filesystem */
public final class C234142xA implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234142xA(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        2EG r20;
        String str;
        1Xj r0;
        1Xj r02;
        List A3Z;
        1Xj r03;
        int A03 = AnonymousClass0fD.A03(494115502);
        C240333Km r10 = (C240333Km) obj;
        int A032 = AnonymousClass0fD.A03(415274961);
        0qQ.A0B(r10, 0);
        C238863Ds r6 = C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON;
        Integer num = null;
        String str2 = null;
        1Xj r5 = r10.A01;
        if (r5.A5D()) {
            AnonymousClass3W1 r12 = r10.A02;
            num = Integer.valueOf(r12.A03);
            C234042wt r4 = this.A00;
            Integer num2 = r12.A1A;
            if (r5.A4e()) {
                int i = r12.A03;
                int i2 = i - 1;
                if (num2 == null || i != 0) {
                    List Alu = r5.A0C.Alu();
                    String str3 = null;
                    if (Alu == null || (r02 = (1Xj) 00k.A0O(Alu, 0)) == null || (A3Z = r02.A3Z()) == null || (r03 = (1Xj) 00k.A0O(A3Z, 0)) == null) {
                        str = null;
                    } else {
                        str = r03.A2n();
                    }
                    List Alu2 = r5.A0C.Alu();
                    if (!(Alu2 == null || (r0 = (1Xj) 00k.A0O(Alu2, 1)) == null)) {
                        str3 = r0.A2n();
                    }
                    if (str == null || !str.equals(str3)) {
                        i2 = r12.A03 + 3;
                    }
                } else {
                    i2 = num2.intValue();
                    str2 = r5.A37(num2);
                }
                num = Integer.valueOf(i2);
                C238833Dp.A00(r4.A0B).A06(r10.A00, C238863Ds.ATTACHMENT, i2);
            }
        }
        C234042wt r11 = this.A00;
        UserSession userSession = r11.A0B;
        C238833Dp.A00(userSession).A09(r10.A00, new C238873Dt(num, r6, (String) null, str2), new String[0], 1);
        C2360132b r16 = new C2360132b(userSession, r11.A0S, r11.A01, r11.A02, r11.A03);
        Fragment fragment = r11.A07;
        AnonymousClass3W1 r1 = r10.A02;
        if (r10.A03) {
            r20 = 2EG.A0A;
        } else {
            r20 = 2EG.A0B;
        }
        r16.A00((MotionEvent) null, (View) null, fragment, r5, r1, r20, (String) null);
        AnonymousClass0fD.A0A(-533276030, A032);
        AnonymousClass0fD.A0A(-2044973833, A03);
    }
}
