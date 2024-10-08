package X;

import com.instagram.common.session.UserSession;

public abstract class ITE implements 1Xl, C232262tL {
    public final 1Xj A00;
    public final 1Xl A01;
    public final AnonymousClass3W1 A02;

    public final /* synthetic */ String ByO(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        return BPf().A2v();
    }

    public final /* synthetic */ boolean CUz() {
        return C56306HwJ.A00(this);
    }

    public final /* synthetic */ boolean CYg() {
        return C56306HwJ.A01(this);
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final /* synthetic */ boolean CcK() {
        return this.A00.CcK();
    }

    public final /* synthetic */ String getId() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public ITE(1Xl r2, AnonymousClass3W1 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r2.BPf();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
