package X;

import com.instagram.user.model.User;
import java.util.List;

public final class MI0 extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MI0(int i, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj5;
        if (this.A04 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        MI0 mi0 = new MI0(i, r7);
        mi0.A00 = obj;
        mi0.A01 = obj2;
        mi0.A02 = obj3;
        mi0.A03 = obj4;
        return mi0.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        0eS.A00(obj);
        Object obj2 = this.A00;
        if (i == 0) {
            return new C70650OEx((C69302Nj3) obj2, (C69294Niu) this.A01, (C69295Niv) this.A02, (C69295Niv) this.A03);
        }
        User user = (User) this.A01;
        return new C61070Jw8((EVM) this.A02, user, (String) this.A03, (List) obj2);
    }
}
