package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Pd8  reason: case insensitive filesystem */
public final class C73466Pd8 implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C73466Pd8(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new C67210Mk6((UserSession) this.A02, ((C67089Mi7) this.A01).A0E);
            case 1:
                return new T69((Context) this.A01, (0lg) this.A02);
            default:
                ((UserDetailFragment) this.A01).A1I.DbJ((AnonymousClass4UE) this.A02);
                return null;
        }
    }
}
