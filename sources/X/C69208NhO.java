package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.NhO  reason: case insensitive filesystem */
public final class C69208NhO extends C243843aC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C69208NhO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(user, 0);
                C67182Mje mje = (C67182Mje) this.A02;
                mje.A02.A00.A02 = -1;
                if (user.B6o() == FollowStatus.A05 || user.B6o() == FollowStatus.A07) {
                    str = "create";
                } else {
                    str = "destroy";
                }
                C230012om A012 = mje.A01();
                if (A012 != null) {
                    AnonymousClass6KM A002 = C67182Mje.A00((C67334MmA) this.A01, mje.A00.getModuleName());
                    A002.A0A = str;
                    A002.A06 = 1aC.A06(user.B6o());
                    A012.A08(new AnonymousClass6KN(A002));
                    return;
                }
                return;
            case 1:
                AnonymousClass7TG.A1N(user, followStatus);
                C67811MvF mvF = (C67811MvF) this.A02;
                C229992ok r2 = mvF.A03;
                AnonymousClass3UH r0 = mvF.A01;
                int i = r0.A01;
                AnonymousClass3UL r3 = (AnonymousClass3UL) this.A01;
                int A013 = r0.A01(r3);
                AnonymousClass3UH r02 = mvF.A01;
                r2.DpI(r3, r02.A0C, "profile", r02.getId(), r02.A0I, i, A013);
                r2.Ckk(mvF.A01);
                return;
            default:
                0qQ.A0B(user, 0);
                C67810MvE mvE = (C67810MvE) this.A02;
                FollowStatus A0i = DbV.A0i(mvE.A03, user);
                int bindingAdapterPosition = ((C249703kE) this.A01).getBindingAdapterPosition();
                if (A0i == FollowStatus.A05 || A0i == FollowStatus.A07) {
                    str2 = "follow";
                } else {
                    str2 = C273654mx.A00(1004);
                }
                mvE.A00(bindingAdapterPosition, str2);
                return;
        }
    }
}
