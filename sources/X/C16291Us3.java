package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Us3  reason: case insensitive filesystem */
public final class C16291Us3 extends C262934Go {
    public final int A00;
    public final Object A01;

    public C16291Us3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9d() {
        switch (this.A00) {
            case 0:
                C19319WUb wUb = (C19319WUb) this.A01;
                UserSession userSession = wUb.A0K;
                if (C375489Dt.A00(userSession)) {
                    if (wUb.A0L.BJ4(userSession, wUb.A0F)) {
                        AnonymousClass87F r1 = (AnonymousClass87F) wUb.A0S.getValue();
                        r1.A02(r1.A01);
                        IgTextView igTextView = wUb.A07;
                        if (igTextView != null) {
                            igTextView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    String str = wUb.A0D;
                    if (!(str == null || str.length() == 0)) {
                        return;
                    }
                }
                AnonymousClass8MF r0 = wUb.A0N;
                r0.Dn7();
                r0.D9o();
                return;
            case 1:
                ((C19319WUb) this.A01).A0M.E3H(new Object());
                return;
            default:
                C14177TrG trG = (C14177TrG) this.A01;
                trG.A00 = null;
                X9G x9g = trG.A0B;
                x9g.DbA();
                if (trG.A03) {
                    trG.A03 = false;
                    trG.A02(trG.A01);
                    return;
                } else if (trG.A04) {
                    trG.A04 = false;
                    trG.A03(trG.A01);
                    return;
                } else if (trG.A02) {
                    trG.A02 = false;
                    C331157Pu r12 = trG.A00;
                    if (r12 != null) {
                        trG.A02 = true;
                        r12.A0L((C332277Ui) null);
                        return;
                    }
                    x9g.EKs();
                    return;
                } else if (trG.A05) {
                    trG.A05 = false;
                    trG.A01(trG.A01);
                    return;
                } else {
                    return;
                }
        }
    }
}
