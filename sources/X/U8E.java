package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class U8E extends AnonymousClass9YH {
    public final Bundle A00;
    public final AnonymousClass0iw A01;

    public U8E(Bundle bundle, AnonymousClass0g9 r2, AnonymousClass0iw r3) {
        super(bundle, r2);
        this.A01 = r3;
        this.A00 = bundle;
    }

    public final 2YL A02(C319836rJ r5, Class cls, String str) {
        AnonymousClass7TG.A1O(cls, r5);
        UserSession A06 = 09i.A0A.A06(this.A00);
        AnonymousClass0iw r2 = this.A01;
        WYZ wyz = new WYZ(r2, A06);
        if (cls.isAssignableFrom(U8Z.class)) {
            return new U8Z(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14783U8t.class)) {
            return new C14783U8t(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14779U8p.class)) {
            return new C14779U8p(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14787U8y.class)) {
            return new C14787U8y(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(U8W.class)) {
            return new U8W(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(U8X.class)) {
            return new U8X(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14782U8s.class)) {
            return new C14782U8s(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14764U8a.class)) {
            return new C14764U8a(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14765U8b.class)) {
            return new C14765U8b(r5, r2, A06);
        }
        if (cls.isAssignableFrom(U8U.class)) {
            return new U8U(r5, A06);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("viewModel ");
        sb.append(cls);
        throw Pxg.A0d(" is not supported in LeadGenViewModelFactoryV2", sb);
    }
}
