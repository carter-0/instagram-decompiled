package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

public final class FSI implements AnonymousClass2Kv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1vn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;

    public FSI(Context context, 1vn r2, String str, String str2, 0sP r5, 0sP r6) {
        this.A05 = r5;
        this.A04 = r6;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void invoke(AnonymousClass3JD r11) {
        0sP r0;
        C250663lr A0U;
        C250663lr A032;
        ImmutableList A06;
        C250663lr r3;
        C250663lr A033;
        C250663lr optionalTreeField;
        String A07;
        C61057Jvv jvv = null;
        if (r11 == null || (A0U = C41845B3m.A0U(r11)) == null || (A032 = A0U.A03(BnX.class, AnonymousClass000.A00(4277), 1103989981)) == null || (A06 = A032.A06(BnW.class, "edges", -1466994003)) == null || (r3 = (C250663lr) 00k.A0J(A06)) == null || (A033 = r3.A03(BnV.class, "node", 1470725096)) == null || (optionalTreeField = A033.getOptionalTreeField(1, "content", BnU.class, 1552357277)) == null || (A07 = optionalTreeField.A07(AnonymousClass000.A00(3731))) == null) {
            r0 = this.A04;
        } else {
            jvv = new C61057Jvv(A07, Integer.valueOf(R.drawable.instagram_users_pano_outline_24));
            String str = this.A03;
            String str2 = this.A02;
            1vn r6 = this.A01;
            0sP r9 = this.A04;
            Context context = this.A00;
            jvv.A00 = 2131969310;
            jvv.A02 = true;
            jvv.A01 = new C50472FcK(context, jvv, r6, str, str2, r9);
            r0 = this.A05;
        }
        r0.invoke(jvv);
    }
}
