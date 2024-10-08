package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class H57 extends C14097Tpp {
    public final /* synthetic */ C231702s8 A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C228392lb A03;
    public final /* synthetic */ C229332nD A04;
    public final /* synthetic */ C229182my A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H57(C231702s8 r1, AnonymousClass0iw r2, C307786Rm r3, C276544tV r4, UserSession userSession, C228392lb r6, C229332nD r7, C229182my r8) {
        super(r3, r4);
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = r7;
        this.A05 = r8;
        this.A00 = r1;
        this.A03 = r6;
    }

    public final View A0J(Context context) {
        UserSession userSession = this.A02;
        return AnonymousClass4CB.A00(context, (ViewGroup) null, this.A00, this.A01, userSession, this.A03, this.A04, this.A05);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r14, C276544tV r15, Object obj) {
        C55447Hhr hhr = (C55447Hhr) C307476Qg.A06(r14, r15);
        if (hhr != null) {
            Context context = r14.A00;
            UserSession userSession = this.A02;
            AnonymousClass3Y6 r6 = hhr.A00;
            C229332nD r9 = this.A04;
            C292795jX A012 = this.A03.A01(r6);
            C231702s8 r3 = this.A00;
            AnonymousClass4CB.A01(context, AnonymousClass7TF.A0D(), r3, this.A01, userSession, r6, A012, (AnonymousClass2xS) null, r9, C292805jY.A04, (C254133rz) view.getTag());
            return null;
        }
        throw new RuntimeException("No Clips In Feed Unit controller found");
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
