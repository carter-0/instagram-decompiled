package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

public final class HK0 extends GFO {
    public final C59595JPp A00;
    public final JTB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HK0(Context context, C267324bN r3, C52058GDe gDe, JRO jro, AnonymousClass0iw r6, UserSession userSession, AnonymousClass3W1 r8, JTB jtb) {
        super(context, r3, gDe, jro, r6, userSession, r8);
        C51974G9v.A0d(3, userSession, r6, gDe, r8);
        AnonymousClass7TF.A1F(jro, 7, jtb);
        this.A01 = jtb;
        1Xj r0 = r3.A02;
        if (r0 != null) {
            C51967G9n.A1K(userSession, r0);
        }
        this.A00 = new C57622Idn(r3, userSession, (AnonymousClass4DU) r6);
    }

    public final void A0A(ReboundViewPager reboundViewPager) {
        1Xj A0u;
        super.A0A(reboundViewPager);
        if (reboundViewPager.getCurrentDataIndex() == 0) {
            C267324bN r2 = this.A0D;
            List list = r2.A0R;
            if (list == null || (A0u = C51966G9m.A0u(list, 0)) == null) {
                throw AnonymousClass7TE.A0y();
            } else if (A0u.BR7() == 1iA.A0a) {
                JRO jro = this.A0F;
                if (jro != null) {
                    jro.ER9(r2, 0);
                }
                this.A01.Dym();
            }
        }
    }

    public final void DVx(int i, int i2) {
        1Xj A0T;
        super.DVx(i, i2);
        C267324bN r3 = this.A0D;
        List list = r3.A0R;
        if (list == null || (A0T = DbZ.A0T(list, i)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        if (A0T.BR7() == 1iA.A0a) {
            JRO jro = this.A0F;
            if (jro != null) {
                jro.ER9(r3, Integer.valueOf(i));
            }
        } else {
            JRO jro2 = this.A0F;
            if (jro2 != null) {
                jro2.ER9(r3, (Integer) null);
            }
        }
        this.A01.Dym();
    }
}
