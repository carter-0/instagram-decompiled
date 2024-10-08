package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;

/* renamed from: X.HuJ  reason: case insensitive filesystem */
public abstract class C56190HuJ {
    public static final C55929Hpr A01(AnonymousClass3Y5 r11, String str, 0sP r13) {
        Object A00;
        Context A002 = C243803a8.A00(r11);
        AnonymousClass07Z r6 = (ComponentActivity) AnonymousClass3Zw.A00(r11, new TTN(A002, 25), new Object[]{A002});
        C55980Hql hql = (C55980Hql) AnonymousClass3Zw.A00(r11, new C73670Phj(str, r6, 0), new Object[]{str});
        2Wa A003 = C243643Zq.A00(r11, new TTN(hql, 27));
        C243773a4.A00(r11, new C58718IwR(49, (Object) hql, (Object) A003), new Object[]{hql});
        AnonymousClass3XT r1 = AnonymousClass3XQ.A00;
        0qQ.A0B(r1, 1);
        2VJ r0 = r11.Aqq().A07;
        if (r0 == null) {
            A00 = r1.Aw2();
        } else {
            A00 = r0.A00(r1);
        }
        AnonymousClass07Z r02 = (AnonymousClass07Z) A00;
        if (r02 == null) {
            r02 = r6;
        }
        AnonymousClass07V lifecycle = r02.getLifecycle();
        Object A004 = AnonymousClass3Zw.A00(r11, new TTN(hql, 26), new Object[]{hql});
        C243773a4.A00(r11, new TTP(1, lifecycle, A004), new Object[]{lifecycle, A004});
        Object A005 = AnonymousClass3Zw.A00(r11, C58263Ip6.A00, new Object[0]);
        0qQ.A07(A005);
        String str2 = (String) A005;
        C243773a4.A00(r11, new C58210IoE(r6, r13, hql, str2, 0), new Object[]{str2, hql});
        return new C55929Hpr(hql, ((C56054Hs3) A003.A03).A00);
    }

    public static final int A00(Activity activity, String str) {
        if (02K.A00(activity, str) == 0) {
            return 0;
        }
        if (C67004Mgc.A06(activity, str)) {
            return -1;
        }
        return -2;
    }
}
