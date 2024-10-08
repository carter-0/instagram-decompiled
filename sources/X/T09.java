package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class T09 implements C635813i {
    public final /* synthetic */ 1Fc A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public T09(1Fc r1, UserSession userSession, String str) {
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        1Fc r2 = new 1Fc();
        r2.A05("upload_id", this.A02);
        r2.A05("use_fbuploader", "true");
        Boolean Cc7 = AnonymousClass0t1.A01.A01(this.A01).A03.Cc7();
        if (Cc7 == null || !Cc7.booleanValue()) {
            str = "False";
        } else {
            str = "True";
        }
        r2.A05("remove_birthday_selfie", str);
        r2.A04(this.A00, (Set) null);
        return r2;
    }
}
