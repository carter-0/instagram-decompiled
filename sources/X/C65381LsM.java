package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LsM  reason: case insensitive filesystem */
public final class C65381LsM implements C66516MUu {
    public Integer A00 = AnonymousClass05K.A00;
    public final UserSession A01;
    public final C64418LbZ A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final Integer A01() {
        Integer num = this.A00;
        if (num == AnonymousClass05K.A00) {
            if (((C10404Rrg) this.A03.getValue()).A00.A01(this.A02.CCQ()).length() == 0) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            this.A00 = num;
        }
        return num;
    }

    public C65381LsM(UserSession userSession, C64418LbZ lbZ) {
        AnonymousClass7TG.A1O(userSession, lbZ);
        this.A01 = userSession;
        this.A02 = lbZ;
        0eO r1 = 0eO.A02;
        this.A03 = MMJ.A00(this, r1, 22);
        this.A04 = MMJ.A00(this, r1, 23);
    }

    private final void A00() {
        Integer A012 = A01();
        Integer num = AnonymousClass05K.A0C;
        if (A012 != num) {
            if (!C3733194w.A00(this.A01).A01(AnonymousClass7TE.A1I(this.A02)).A02) {
                num = AnonymousClass05K.A01;
            }
            this.A00 = num;
        }
    }

    public final void Cg1() {
        A00();
    }

    public final boolean CoV() {
        return AnonymousClass7TF.A1W(A01(), AnonymousClass05K.A0C);
    }

    public final AnonymousClass40G EHa(List list) {
        A00();
        if (A01() == AnonymousClass05K.A0C) {
            return ((C258833zi) this.A04.getValue()).E3X((C258993zy) null, list);
        }
        throw new Exception("executorch predictor was not ready");
    }
}
