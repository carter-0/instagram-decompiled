package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.4BY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4BY implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass4BY(Context context, UserSession userSession, List list, List list2, List list3, List list4, int i, boolean z) {
        this.A01 = context;
        this.A02 = userSession;
        this.A07 = z;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = list3;
        this.A06 = list4;
    }

    public final Object invoke() {
        Context context = this.A01;
        UserSession userSession = this.A02;
        boolean z = this.A07;
        int i = this.A00;
        List list = this.A03;
        List list2 = this.A04;
        List list3 = this.A05;
        List list4 = this.A06;
        Charset charset = 1bO.A0w;
        2He A002 = 2Hd.A00(userSession);
        AnonymousClass4UY r9 = new AnonymousClass4UY();
        0qQ.A0B(userSession, 1);
        return new 1bO(context, userSession, userSession, A002, new AnonymousClass432(AnonymousClass0kN.A01(new 0xG("ig_direct_realtime"), userSession)), r9, list, list2, list3, list4, AnonymousClass0eN.A01(new AnonymousClass4UZ(userSession)), AnonymousClass0eN.A01(new C265484Ua(userSession)), AnonymousClass0eN.A01(new C265494Ub()), AnonymousClass0eN.A01(new AnonymousClass434(userSession)), AnonymousClass0eN.A01(new C262014Bu()), AnonymousClass0eN.A01(new C261924Bl()), AnonymousClass0eN.A01(new C261934Bm()), i, z);
    }
}
