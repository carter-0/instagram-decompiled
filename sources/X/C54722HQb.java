package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HQb  reason: case insensitive filesystem */
public final class C54722HQb {
    public Context A00;
    public UserSession A01;
    public String A02;

    public final void A00(AnonymousClass0iw r11, 1P0 r12, 1Xj r13, Integer num) {
        int i;
        Integer num2 = num;
        int intValue = num.intValue();
        Context context = this.A00;
        if (intValue != 1) {
            i = 2131969442;
        } else {
            i = 2131969441;
        }
        String string = context.getString(i);
        1xC r3 = 1xC.A01;
        C310336ap A0W = DbV.A0W();
        A0W.A0D = string;
        A0W.A0L = true;
        A0W.A0D(this.A00.getString(2131969443));
        A0W.A03();
        A0W.A09 = r13.A1Q();
        A0W.A06();
        A0W.A0A(new C57268IVd(r11, r12, r13, this, num2));
        DbY.A1K(r3, A0W);
    }
}
