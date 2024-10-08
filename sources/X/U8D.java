package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class U8D extends AnonymousClass9YH {
    public final Bundle A00;
    public final AnonymousClass0iw A01;

    public U8D(Bundle bundle, AnonymousClass0g9 r2, AnonymousClass0iw r3) {
        super(bundle, r2);
        this.A01 = r3;
        this.A00 = bundle;
    }

    public final 2YL A02(C319836rJ r5, Class cls, String str) {
        AnonymousClass7TG.A1O(cls, r5);
        UserSession A06 = 09i.A0A.A06(this.A00);
        AnonymousClass0iw r2 = this.A01;
        WYZ wyz = new WYZ(r2, A06);
        if (cls.isAssignableFrom(C16061Uno.class)) {
            return new C16061Uno(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16060Unn.class)) {
            return new C16060Unn(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C14778U8o.class)) {
            return new C14778U8o(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16045UnY.class)) {
            return new C16045UnY(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16036UnP.class)) {
            return new C16036UnP(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16054Unh.class)) {
            return new C16054Unh(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16049Unc.class)) {
            return new C16049Unc(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16058Unl.class)) {
            return new C16058Unl(r5, A06, wyz);
        }
        if (cls.isAssignableFrom(C16057Unk.class)) {
            return new C16057Unk(r5, r2, A06);
        }
        if (cls.isAssignableFrom(C16042UnV.class)) {
            return new C16042UnV(r5, A06);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("viewModel ");
        sb.append(cls);
        throw Pxg.A0d(" is not supported in LeadGenViewModelFactory", sb);
    }
}
