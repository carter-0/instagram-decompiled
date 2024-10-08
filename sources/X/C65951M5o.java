package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Set;

/* renamed from: X.M5o  reason: case insensitive filesystem */
public final class C65951M5o implements Runnable {
    public final /* synthetic */ KAC A00;
    public final /* synthetic */ KB0 A01;

    public C65951M5o(KAC kac, KB0 kb0) {
        this.A01 = kb0;
        this.A00 = kac;
    }

    public final void run() {
        String str;
        KB0 kb0 = this.A01;
        C64184LSr lSr = kb0.A0A;
        String str2 = lSr.A01;
        if (str2.trim().isEmpty()) {
            str2 = kb0.A07.getResources().getString(2131963446);
        }
        C63830L8l l8l = lSr.A00;
        l8l.getClass();
        UserSession userSession = kb0.A0D;
        Ki3 ki3 = kb0.A0C;
        Set keySet = lSr.A05.keySet();
        C63830L8l l8l2 = lSr.A00;
        if (l8l2 == null) {
            str = null;
        } else {
            str = l8l2.A03;
        }
        String str3 = l8l.A04;
        ImageUrl imageUrl = l8l.A02;
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        C63830L8l l8l3 = lSr.A00;
        l8l3.getClass();
        1OC A002 = AnonymousClass738.A00(ki3, userSession, str2, str, str3, lSr.A02, C64184LSr.A02(l8l3), keySet, height, width, kb0.A03);
        A002.A00 = this.A00;
        1ES.A00(kb0.A07, kb0.A09, A002);
    }
}
