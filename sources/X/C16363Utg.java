package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Utg  reason: case insensitive filesystem */
public final class C16363Utg extends C243843aC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C16363Utg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        X9V x9v;
        if (this.A00 != 0) {
            0qQ.A0B(user, 0);
            WSZ wsz = (WSZ) this.A03;
            ((0sP) this.A02).invoke(002.A0R(wsz.A01.getId(), C49201Er6.A00(wsz.A00)));
            if ((user.B6o() == FollowStatus.A05 || user.B6o() == FollowStatus.A07) && (x9v = (X9V) this.A01) != null) {
                x9v.DGW(user.getId());
            }
        } else if (((C249703kE) this.A02).getBindingAdapterPosition() != -1) {
            UAK uak = (UAK) this.A01;
            AnonymousClass2p0 r3 = uak.A02;
            r3.getClass();
            C17674Vc5 vc5 = (C17674Vc5) this.A03;
            int A002 = UAK.A00(uak, vc5);
            AnonymousClass3UH r0 = uak.A01;
            r0.getClass();
            int i = r0.A01;
            int i2 = uak.A00;
            AnonymousClass3UH r02 = uak.A01;
            r02.getClass();
            String str = r02.A0C;
            AnonymousClass3UH r03 = uak.A01;
            r03.getClass();
            r3.DLM(vc5, str, "preview", r03.getId(), A002, i, i2);
            FollowStatus A0N = AnonymousClass2f1.A00(uak.A07).A0N(user);
            if (A0N == FollowStatus.A05 || A0N == FollowStatus.A07) {
                uak.A0A.run();
            }
        }
    }
}
