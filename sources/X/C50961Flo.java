package X;

import com.instagram.business.fragment.ConnectFBPageFragment;

/* renamed from: X.Flo  reason: case insensitive filesystem */
public final class C50961Flo implements G6P {
    public final int A00;
    public final Object A01;

    public C50961Flo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment.class.toString();
                return;
            case 1:
                return;
            default:
                E3F e3f = (E3F) this.A01;
                E99 e99 = e3f.A03;
                if (e99 == null) {
                    0qQ.A0F("accountAdapter");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    e99.A00(E3F.A01(e3f));
                    return;
                }
        }
    }
}
