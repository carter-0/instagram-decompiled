package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.H3u  reason: case insensitive filesystem */
public final class C54225H3u extends 2Ru {
    public final AnonymousClass0eM A00;
    public final C15560Ueo A01;
    public final C15523UeC A02;
    public final C19611Wca A03;
    public final AnonymousClass71T A04;
    public final AnonymousClass32Q A05;
    public final C229122ms A06;
    public final C231762sK A07;

    public C54225H3u(Context context, UserSession userSession, AnonymousClass4DU r9, AnonymousClass32J r10, C19611Wca wca, AnonymousClass32Q r12, C229122ms r13) {
        C51974G9v.A0d(2, userSession, r12, r13, wca);
        this.A05 = r12;
        this.A06 = r13;
        this.A03 = wca;
        AnonymousClass71T r5 = new AnonymousClass71T(context);
        this.A04 = r5;
        C231762sK r4 = new C231762sK(context);
        this.A07 = r4;
        C15560Ueo ueo = new C15560Ueo(r9, userSession, (C267644bx) null, r10);
        this.A01 = ueo;
        C15523UeC ueC = new C15523UeC(userSession, r9);
        this.A02 = ueC;
        this.A00 = AnonymousClass0eN.A01(new C20613Wvu(18, userSession, r9));
        init(new C231642s0[]{r5, r4, ueo, ueC});
    }

    public final void A01(List list) {
        AnonymousClass0eM r2 = this.A00;
        IWI iwi = (IWI) r2.getValue();
        iwi.A04.clear();
        iwi.A05.clear();
        C228382la r0 = iwi.A00;
        if (r0 != null) {
            r0.DMW();
        }
        ((IWI) r2.getValue()).A03(list);
        ((IWI) r2.getValue()).A02();
        A00();
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(((IWI) this.A00.getValue()).A01.size());
    }

    public final void A00() {
        clear();
        if (!isEmpty()) {
            for (Object next : ((IWI) this.A00.getValue()).A01) {
                if (next instanceof 1Xj) {
                    addModel(next, new VZV(0, 0, 0, C243233Xy.A00((1Xj) next), true), this.A01);
                }
            }
        } else {
            C19611Wca wca = this.A03;
            addModel(wca.Afm(), wca.A00, this.A04);
        }
        C229122ms r1 = this.A06;
        if (r1.CKB() || r1.CT5()) {
            addModel(r1, this.A07);
        }
        notifyDataSetChangedSmart();
    }
}
