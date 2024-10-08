package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.FRk  reason: case insensitive filesystem */
public final class C50152FRk implements 2Kw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0rm A07;
    public final /* synthetic */ boolean A08;

    public C50152FRk(Context context, UserSession userSession, Integer num, String str, String str2, 0sP r6, 0rm r7, int i, boolean z) {
        this.A07 = r7;
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = num;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = r6;
        this.A08 = z;
    }

    public final void invoke(Throwable th) {
        String A0w;
        0rm r7 = this.A07;
        Context context = this.A01;
        UserSession userSession = this.A02;
        int i = this.A00;
        Integer num = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        boolean A1Z = DbW.A1Z(num);
        String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131966292);
        String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131966291);
        String A0d3 = AnonymousClass7TF.A0d(context.getResources(), 2131966296);
        String A0d4 = AnonymousClass7TF.A0d(context.getResources(), 2131966294);
        String A0d5 = AnonymousClass7TF.A0d(context.getResources(), 2131966295);
        if (num == AnonymousClass05K.A0C) {
            A0w = 002.A0g(context.getResources().getString(2131966288, new Object[]{A0d3, A0d4, A0d5}), "\n\n", AnonymousClass7TF.A0e(context.getResources(), A0d, 2131966289));
        } else {
            A0w = DbV.A0w(context.getResources(), A0d, A0d2, 2131966290);
        }
        SpannableStringBuilder A0C = DbS.A0C(A0w);
        AnonymousClass7AV.A04(A0C, new C48041ESg(context, userSession, AnonymousClass7TF.A03(context, i), A1Z ? 1 : 0), A0d3);
        AnonymousClass7AV.A04(A0C, new C48041ESg(context, userSession, AnonymousClass7TF.A03(context, i), 2), A0d4);
        AnonymousClass7AV.A04(A0C, new C48041ESg(context, userSession, AnonymousClass7TF.A03(context, i), 3), A0d5);
        Context context2 = context;
        AnonymousClass7AV.A04(A0C, new C48039ESe(context2, userSession, num, str, str2, AnonymousClass7TF.A03(context, i), A1Z ? 1 : 0), A0d);
        UserSession userSession2 = userSession;
        Integer num2 = num;
        String str3 = str;
        Context context3 = context;
        AnonymousClass7AV.A04(A0C, new C48039ESe(context3, userSession2, num2, str3, str2, AnonymousClass7TF.A03(context, i), 2), A0d2);
        r7.A00 = A0C;
        this.A06.invoke(A0C);
        if (this.A08) {
            C48801EkP.A00(userSession);
        }
    }
}
