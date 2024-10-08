package X;

import com.instagram.common.session.UserSession;

public final class GXU implements AnonymousClass2wH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ GWW A01;
    public final /* synthetic */ GT0 A02;

    public GXU(UserSession userSession, GWW gww, GT0 gt0) {
        this.A00 = userSession;
        this.A01 = gww;
        this.A02 = gt0;
    }

    public final /* bridge */ /* synthetic */ void D8O(Object obj) {
        Integer num;
        C376509Ig r8 = (C376509Ig) obj;
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A00;
        Object A05 = C296885qo.A05(userSession, (C295795ov) null, (C295745oq) r8.A02, false);
        C233472vm r0 = (C233472vm) r8.A04;
        if (r0 != null) {
            int A09 = r0.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                GWW gww = this.A01;
                if (A09 <= gww.A01.A03.size()) {
                    if (A05 != null) {
                        String str = this.A02.A05;
                        if (str == null) {
                            str = "";
                        }
                        gww.A06(str, A05, A09);
                        return;
                    }
                    return;
                }
            }
        } else {
            num = null;
        }
        long A012 = 182.A01(0Tu.A05, userSession, 36597377675365157L);
        int size = this.A01.A01.A03.size();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Attempted to inject a fallback section out of bounds at target position: ");
        A1A.append(num);
        A1A.append(", current grid section size is ");
        A1A.append(size);
        0wb.A04("grid_acp", A1A.toString(), (int) A012);
    }
}
