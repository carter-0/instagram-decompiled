package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.LnH  reason: case insensitive filesystem */
public final class C65095LnH implements MVk {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ C64711Lgk A01;

    public final void DhE() {
    }

    public final void DsO() {
    }

    public final void DsR(int i) {
    }

    public final boolean EsN(int i) {
        return true;
    }

    public C65095LnH(RecyclerView recyclerView, C64711Lgk lgk) {
        this.A01 = lgk;
        this.A00 = recyclerView;
    }

    public final void Cu4() {
        this.A01.A0P.A0F(new AnonymousClass9IF());
    }

    public final void DrT(int i) {
        C64711Lgk lgk = this.A01;
        lgk.A0H.A04();
        JTT.A1L(lgk.A0Q, true);
        lgk.A0M.A04(i / 2);
    }

    public final void DrV(int i) {
        AnonymousClass8RH r1;
        List BrX;
        C279454yf r0;
        int i2 = i / 2;
        C64711Lgk lgk = this.A01;
        C3511387s r12 = lgk.A0O;
        if (r12.A04 != null) {
            if (!(lgk.A0M.A03.get(i2) instanceof KMK)) {
                C270564gw r02 = r12.A04;
                if (!(r02 == null || (BrX = r02.BrX()) == null || (r0 = (C279454yf) 00k.A0O(BrX, i2)) == null || !AnonymousClass8YL.A03(r0))) {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass8RF r2 = lgk.A0Q;
        AnonymousClass8RH A0E = r2.A0E();
        if (A0E instanceof AnonymousClass8RG) {
            if (((AnonymousClass8RG) A0E).A00) {
                return;
            }
        } else if (!(A0E instanceof KM2)) {
            if (A0E instanceof AnonymousClass8RW) {
                r1 = new AnonymousClass8RW(i2);
            } else if (!(A0E instanceof AnonymousClass8RX)) {
                r1 = new AnonymousClass8RG(false);
            } else {
                return;
            }
            r2.A0G(r1);
            return;
        }
        r2.A0G(new KM2(i2, false));
        27p.A01(lgk.A0F).A0U();
    }

    public final void Dtq(int i) {
        C380589Yt r2;
        C249703kE A0W = this.A00.A0W(i);
        if (A0W != null) {
            C64711Lgk lgk = this.A01;
            if ((A0W instanceof C380589Yt) && (r2 = (C380589Yt) A0W) != null && r2.A03) {
                27r A012 = 27p.A01(lgk.A0F);
                if (A012.A0J() != null) {
                    27r.A09(C59725JVj.POST_CAPTURE, A012, "TIMELINE_TRANSITION_ADD", A012.A04.A0W);
                }
                lgk.A0Q.A0G(new AnonymousClass8RX(i));
            }
        }
    }
}
