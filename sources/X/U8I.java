package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class U8I extends AnonymousClass9YH {
    public final N4R A00;
    public final UserSession A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U8I(Bundle bundle, AnonymousClass0g9 r3, N4R n4r, List list) {
        super(bundle, r3);
        0qQ.A0B(list, 3);
        this.A02 = list;
        this.A00 = n4r;
        this.A01 = DbS.A0U(bundle);
    }

    public final 2YL A02(C319836rJ r5, Class cls, String str) {
        0qQ.A0B(r5, 2);
        return new U8V(r5, this.A00, this.A01, this.A02);
    }
}
