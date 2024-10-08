package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9N3  reason: invalid class name */
public final class AnonymousClass9N3 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A08 = z;
        this.A07 = z2;
        this.A02 = obj5;
        this.A06 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            boolean z = this.A08;
            boolean z2 = this.A07;
            return new C252643pR(context, (FragmentActivity) this.A03, (UserSession) this.A05, ((AnonymousClass315) this.A02).BQE(), (C249763kK) this.A04, this.A06, z, z2);
        }
        AnonymousClass334 r3 = (AnonymousClass334) this.A05;
        AnonymousClass4DU r10 = r3.A04;
        AnonymousClass07Z r5 = r3.A00;
        AnonymousClass311 r2 = (AnonymousClass311) this.A02;
        C243033Xd BRM = r2.BRM();
        C242813Wa BQE = r2.BQE();
        AnonymousClass335 r13 = r3.A05;
        C232722uK r15 = ((AnonymousClass2xS) this.A03).A0G;
        AnonymousClass339 r14 = r3.A06;
        AnonymousClass3WV BRO = r2.BRO();
        C229382nI r6 = r3.A01;
        AnonymousClass4DV BqC = r2.BqC();
        Context context2 = (Context) this.A01;
        UserSession userSession = (UserSession) this.A04;
        boolean z3 = this.A08;
        boolean z4 = this.A07;
        return new C289685e2(context2, r5, r6, userSession, (C252613pO) r3.A0U.getValue(), BRO, r10, BQE, BRM, r13, r14, r15, BqC, this.A06, z3, z4);
    }
}
