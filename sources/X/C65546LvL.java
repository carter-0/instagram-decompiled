package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import java.util.List;

/* renamed from: X.LvL  reason: case insensitive filesystem */
public final class C65546LvL implements AnonymousClass2Zd {
    public final int A00;
    public final Object A01;

    public C65546LvL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFp(AnonymousClass3Q2 r6) {
        C61100JxB jxB;
        Integer num;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r6, 0);
                ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A01;
                AnonymousClass7TE.A1Z(new C51648Fy7(profileCardViewModel, r6, (AnonymousClass4D7) null, 38), C318116oQ.A00(profileCardViewModel));
                profileCardViewModel.A0G.A01.A06.A0K(this);
                return;
            case 1:
                0qQ.A0B(r6, 0);
                if (r6.A0E() == ShareType.WONDER_WALL) {
                    1Ng A002 = AnonymousClass1Nd.A00(((C63824L8f) this.A01).A00);
                    1Xj r2 = r6.A1C;
                    if (r6.A1f != r6.A6J) {
                        r2 = null;
                    }
                    A002.A00(new C64674Lg0(r2, r6.A3t));
                    return;
                }
                return;
            default:
                0qQ.A0B(r6, 0);
                K57 k57 = (K57) this.A01;
                if (r6.A1f == AnonymousClass3QD.CONFIGURED && (jxB = r6.A0v) != null && (num = jxB.A00) != null && num.intValue() > 0) {
                    C53081GiF giF = k57.A02;
                    if (giF == null) {
                        0qQ.A0F("clipsDraftsAdapter");
                        throw AnonymousClass00P.createAndThrow();
                    } else if ((giF instanceof HJZ) && C319116q4.A00.A0A(AnonymousClass7TE.A0l(k57.A0I))) {
                        K57.A03(k57, (List) null);
                        C60133JgE jgE = (C60133JgE) k57.A0H.getValue();
                        MG7.A01(jgE, C318116oQ.A00(jgE), 12);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void DQx(AnonymousClass3Q2 r6) {
        if (this.A00 == 0) {
            0qQ.A0B(r6, 0);
            2YL r4 = (2YL) this.A01;
            AnonymousClass7TE.A1Z(new MHL((Object) r4, (Object) r6, (AnonymousClass4D7) null, 21), C318116oQ.A00(r4));
        }
    }
}
