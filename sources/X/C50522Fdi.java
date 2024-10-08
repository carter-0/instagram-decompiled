package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fdi  reason: case insensitive filesystem */
public final class C50522Fdi implements C13675Tek {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50522Fdi(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ void D5D(Object obj) {
        if (this.A00 != 0) {
            EMI.A01((UserSession) this.A02, (EMI) ((C50535Fdv) this.A01).A01, (User) this.A03);
            return;
        }
        ((EMD) this.A03).A05((UserSession) this.A02, (User) this.A01);
    }
}
