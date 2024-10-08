package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class MJK extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C355608Qq A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ 0sP A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJK(Activity activity, Context context, C355608Qq r4, UserSession userSession, 0sP r6, float f, float f2) {
        super(0);
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = activity;
        this.A01 = f;
        this.A00 = f2;
        this.A04 = r4;
        this.A06 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A03;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        UserSession userSession = this.A05;
        A002.A01(new C61648KFy(this.A02, context, this.A04, userSession, this.A06, this.A01, this.A00));
        A002.A09 = true;
        return A002.A00();
    }
}
