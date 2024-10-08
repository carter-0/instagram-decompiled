package X;

import android.os.Bundle;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

public final class U8J extends AnonymousClass9YH {
    public final C18784W1k A00;
    public final PromoteData A01;
    public final PromoteState A02;
    public final AnonymousClass0iw A03;

    public U8J(Bundle bundle, AnonymousClass0g9 r2, C18784W1k w1k, PromoteData promoteData, PromoteState promoteState, AnonymousClass0iw r6) {
        super(bundle, r2);
        this.A03 = r6;
        this.A01 = promoteData;
        this.A02 = promoteState;
        this.A00 = w1k;
    }

    public final 2YL A02(C319836rJ r5, Class cls, String str) {
        AnonymousClass7TG.A1O(cls, r5);
        PromoteData promoteData = this.A01;
        if (promoteData != null) {
            WYX wyx = new WYX(promoteData, this.A03);
            if (cls.isAssignableFrom(C16059Unm.class)) {
                return new C16059Unm(wyx, promoteData);
            }
            if (cls.isAssignableFrom(C16056Unj.class)) {
                return new C16056Unj(r5, wyx, promoteData);
            }
            if (cls.isAssignableFrom(C16046UnZ.class)) {
                return new C16046UnZ(r5, wyx, this.A00, promoteData);
            }
            if (cls.isAssignableFrom(C16050Und.class)) {
                return new C16050Und(r5, wyx, promoteData);
            }
            if (cls.isAssignableFrom(C16053Ung.class)) {
                return new C16053Ung(wyx, promoteData);
            }
            if (cls.isAssignableFrom(C16035UnO.class)) {
                return new C16035UnO(wyx, promoteData);
            }
            if (cls.isAssignableFrom(C16062Unp.class)) {
                return new C16062Unp(wyx, promoteData, this.A02);
            }
            if (cls.isAssignableFrom(U8Y.class)) {
                return new U8Y(r5, wyx, promoteData, this.A02);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("viewModel ");
            sb.append(cls);
            throw Pxg.A0d(" is not supported in PromoteViewModelFactory", sb);
        }
        throw new IllegalArgumentException("promoteData cannot be null");
    }
}
