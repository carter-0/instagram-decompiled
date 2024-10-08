package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.user.model.User;

/* renamed from: X.Fu6  reason: case insensitive filesystem */
public final class C51436Fu6 implements Runnable {
    public final /* synthetic */ E7E A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;

    public C51436Fu6(E7E e7e, User user, String str) {
        this.A00 = e7e;
        this.A02 = str;
        this.A01 = user;
    }

    public final void run() {
        Boolean BAx;
        E7E e7e = this.A00;
        DbT.A1J(e7e);
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            User user = this.A01;
            if (!user.A1d() && (BAx = user.A03.BAx()) != null && BAx.booleanValue()) {
                2IS A04 = C41845B3m.A04();
                DbW.A18(C41845B3m.A03(GraphQlCallInput.A02, str, "user_inputted_phone_number"), A04, "input");
                C239113Fa r3 = new C239113Fa(A04, C47114Dqq.class, "IGSendWhatsappLinkCreationVerification", false);
                C363088j4.A00(e7e.getSession()).ATL(new C19026WHc(0), new FS7(), r3);
            }
        }
    }
}
