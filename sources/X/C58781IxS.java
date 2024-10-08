package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxS  reason: case insensitive filesystem */
public final class C58781IxS extends 0Yg implements 0sP {
    public final /* synthetic */ 2Wb A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C53918GwO A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58781IxS(2Wb r2, AnonymousClass4DU r3, C53918GwO gwO, String str, String str2, String str3) {
        super(1);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = gwO;
        this.A03 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = this.A04;
        String str2 = this.A05;
        2V1 r4 = this.A00.A00;
        AnonymousClass4DU r6 = this.A01;
        UserSession userSession = this.A02.A00;
        String str3 = this.A03;
        0qQ.A0B(userSession, 4);
        Context context = r4.A0C;
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        0qQ.A07(context);
        C46498Dg1 dg1 = new C46498Dg1(context, userSession);
        dg1.A04(new ID3(8, (Object) r4, (Object) userSession), 2131964880);
        dg1.A04(new WA9(r4, userSession, r6, str, str2, 2), 2131973917);
        dg1.A04(new WA9(activity, userSession, r6, str3, str2, 3), 2131972174);
        dg1.A04(C56798ICv.A00, 2131954722);
        C51969G9p.A11(activity, dg1);
        return C60340gF.A00;
    }
}
