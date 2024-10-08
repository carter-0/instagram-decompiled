package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7eg  reason: invalid class name and case insensitive filesystem */
public final class C336477eg extends C251343mx {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final 0sP A02;
    public final int A03;
    public final List A04;

    public C336477eg(AnonymousClass0iw r2, UserSession userSession, List list, 0sP r5, int i) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r2, 3);
        0qQ.A0B(r5, 5);
        this.A04 = list;
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = i;
        this.A02 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        AnonymousClass3Y5 r8 = r22;
        0qQ.A0B(r8, 0);
        List<String> list = this.A04;
        ArrayList arrayList = new ArrayList();
        for (String A05 : list) {
            C317486nL A052 = C317486nL.A04.A05(this.A01, A05);
            if (A052 != null) {
                arrayList.add(A052);
            }
        }
        List<C317486nL> A0W = 00k.A0W(arrayList);
        int intValue = ((Number) AnonymousClass3Zw.A00(r8, new C377119Kp(r8, 45), new Object[0])).intValue();
        int min = Math.min(this.A03 / intValue, 8);
        if (A0W.size() > min) {
            A0W = A0W.subList(0, min - 1);
        }
        if (!(!A0W.isEmpty())) {
            return null;
        }
        C243583Zi r12 = C243583Zi.SPACE_EVENLY;
        AnonymousClass3XV r0 = 2WX.A02;
        2V1 r4 = r8.A05;
        Context context = r4.A0C;
        int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_background));
        Integer num = AnonymousClass05K.A00;
        2WX r9 = new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JS(num, new ColorDrawable(color), 4)), new AnonymousClass9JQ(num, 100.0f, 0)), new AnonymousClass9JR(AnonymousClass05K.A15, 0, Double.doubleToRawLongBits(6.0d)));
        2Wb r7 = new 2Wb(r4, new ArrayList());
        for (C317486nL r42 : A0W) {
            String str = r42.A02;
            UserSession userSession = this.A01;
            C336487eh r15 = new C336487eh(this.A00, userSession, r42, this.A02, intValue);
            AnonymousClass56V.A01(r15, str);
            r7.A00(r15);
        }
        return C243563Zg.A0H(r7, r8, r9, (C243573Zh) null, (C243573Zh) null, r12, (C244343b2) null, false);
    }
}
