package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import com.instagram.model.direct.DirectThreadKey;

public final class P3J implements C74454Pv9 {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ C74455PvA A01;
    public final /* synthetic */ C66633Ma2 A02;
    public final /* synthetic */ AnonymousClass2Ep A03;

    public final void DQk(C68167N3h n3h, C68167N3h n3h2) {
    }

    public P3J(RectF rectF, C74455PvA pvA, C66633Ma2 ma2, AnonymousClass2Ep r4) {
        this.A03 = r4;
        this.A00 = rectF;
        this.A01 = pvA;
        this.A02 = ma2;
    }

    public final void DQ2() {
        C66633Ma2 ma2 = this.A02;
        Context context = ma2.A1J.getContext();
        if (context != null) {
            C310336ap A0X = DbV.A0X();
            A0X.A06();
            DbS.A19(context, A0X, 2131960007);
            DbY.A1N(A0X);
        }
        ma2.A0y();
    }

    public final void DQX() {
        DirectThreadKey directThreadKey;
        AnonymousClass2Ep r3 = this.A03;
        RectF rectF = this.A00;
        C74455PvA pvA = this.A01;
        C66633Ma2 ma2 = this.A02;
        C238143As r0 = ma2.A0n;
        if (r0 != null) {
            int B6L = r0.B6L();
            C238143As r02 = ma2.A0n;
            if (r02 != null) {
                int BLQ = r02.BLQ();
                if (B6L >= 0 && BLQ >= 0) {
                    while (B6L < BLQ) {
                        Object A04 = ((C67080Mhv) ma2.A1c.getValue()).A00.A04(B6L);
                        if (!(A04 instanceof C66702Mb9) || (directThreadKey = ((C66702Mb9) A04).A0I) == null || !0qQ.A0K(r3.C6C(), directThreadKey.A00)) {
                            B6L++;
                        } else {
                            C70615ODm oDm = ma2.A0a;
                            if (oDm != null) {
                                oDm.A01.DOd();
                                oDm.A00.removeCallbacks(oDm.A02);
                            }
                            ma2.A0a = null;
                            C66580MXl.A1S(ma2.A1U, r3.C6C());
                            C66580MXl.A1S(ma2.A1W, r3.C6C());
                            Pair pair = ma2.A07;
                            if (pair != null && pair.second == pvA) {
                                pvA.DQc();
                                ((C67095MiF) ma2.A1t.getValue()).A00(rectF, r3.BJy(), false);
                                ((C74548Pwh) ma2.A2v.getValue()).AAR(r3.C6C());
                                return;
                            }
                            return;
                        }
                    }
                }
                ma2.A0y();
                return;
            }
        }
        0qQ.A0F("inboxViewProxy");
        throw AnonymousClass00P.createAndThrow();
    }
}
