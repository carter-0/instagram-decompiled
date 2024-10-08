package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* renamed from: X.Lns  reason: case insensitive filesystem */
public final class C65130Lns implements C74441Puw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ LPH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0rm A06;
    public final /* synthetic */ boolean A07;

    public final void D7r(Date date) {
    }

    public final void D9d() {
    }

    public C65130Lns(Context context, LPH lph, UserSession userSession, 1Xj r4, String str, 0rm r6, int i, boolean z) {
        this.A01 = context;
        this.A00 = i;
        this.A03 = userSession;
        this.A07 = z;
        this.A04 = r4;
        this.A05 = str;
        this.A02 = lph;
        this.A06 = r6;
    }

    public final void D9n(Date date) {
        int i;
        1OC A072;
        int i2;
        C331157Pu r1;
        if (date != null) {
            i = (int) AnonymousClass7TE.A0P(date.getTime());
        } else {
            i = 0;
        }
        if (((long) i) <= AnonymousClass7TE.A0P(new Date().getTime())) {
            C59689JTv.A04(this.A01);
        } else if (this.A00 != i) {
            Context context = this.A01;
            UserSession userSession = this.A03;
            boolean z = this.A07;
            1Xj r10 = this.A04;
            String str = this.A05;
            LPH lph = this.A02;
            MJE mje = new MJE(context, lph, userSession, r10, i, z);
            C59101J6j j6j = new C59101J6j(21, (Object) context, (Object) lph);
            Integer A022 = C319116q4.A02(userSession, false);
            if (A022 == AnonymousClass05K.A00) {
                2IS A042 = C41845B3m.A04();
                0Df A0A = JTU.A0A(str);
                0Df.A00(A0A, Integer.valueOf(i), "scheduled_publish_time");
                DbW.A18(A0A, A042, "input");
                A072 = JTS.A0S(A042, userSession, C60837Js6.class, "ContentSchedulingRescheduleMutation", true).A05();
                i2 = 8;
            } else {
                Integer num = AnonymousClass05K.A01;
                if (A022 == num) {
                    2IS A043 = C41845B3m.A04();
                    0Df A0A2 = JTU.A0A(str);
                    0Df.A00(A0A2, Integer.valueOf(i), "scheduled_publish_time");
                    DbW.A18(A0A2, A043, "input");
                    A072 = JTS.A0S(A043, userSession, C60836Js5.class, "ContentSchedulingRescheduleGenPopLinkedMutation", true).A07(num);
                    i2 = 9;
                } else {
                    j6j.invoke("Scheduling not enabled");
                }
            }
            A072.A00 = new C15625Ufr(i2, context, j6j, mje);
            1ES.A03(A072);
        }
        OVW ovw = (OVW) this.A06.A00;
        if (!(ovw == null || (r1 = ovw.A00) == null)) {
            r1.A0L((C332277Ui) null);
        }
        LPH lph2 = this.A02;
        Integer num2 = AnonymousClass05K.A0C;
        lph2.A08(num2, AnonymousClass05K.A00);
        lph2.A05(num2);
    }
}
