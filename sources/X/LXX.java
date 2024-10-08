package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LXX implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ String A03;

    public LXX(Context context, UserSession userSession, 1Xj r3, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void onClick(View view) {
        1OC A07;
        int i;
        int A05 = AnonymousClass0fD.A05(538894305);
        Context context = this.A00;
        UserSession userSession = this.A01;
        1Xj r1 = this.A02;
        String str = this.A03;
        C41566AwY awY = new C41566AwY(42, r1, userSession);
        J6O j6o = new J6O(context, 2);
        Integer A022 = C319116q4.A02(userSession, false);
        if (A022 == AnonymousClass05K.A00) {
            2IS A04 = C41845B3m.A04();
            DbW.A18(JTU.A0A(str), A04, "input");
            A07 = JTS.A0S(A04, userSession, C60835Js4.class, "ContentSchedulingPublishMutation", true).A05();
            i = 6;
        } else {
            Integer num = AnonymousClass05K.A01;
            if (A022 == num) {
                2IS A042 = C41845B3m.A04();
                DbW.A18(JTU.A0A(str), A042, "input");
                A07 = JTS.A0S(A042, userSession, C60834Js3.class, "ContentSchedulingPublishGenPopLinkedMutation", true).A07(num);
                i = 7;
            } else {
                j6o.invoke("Scheduling not enabled");
                C59689JTv.A07(context, 2131956694);
                AnonymousClass0fD.A0C(-1926869728, A05);
            }
        }
        A07.A00 = new C15625Ufr(i, context, j6o, awY);
        1ES.A03(A07);
        C59689JTv.A07(context, 2131956694);
        AnonymousClass0fD.A0C(-1926869728, A05);
    }
}
