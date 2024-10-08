package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Mh  reason: invalid class name and case insensitive filesystem */
public final class C377559Mh extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377559Mh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A09 = obj2;
        this.A08 = obj3;
        this.A02 = obj4;
        this.A06 = obj5;
        this.A01 = obj6;
        this.A07 = obj7;
        this.A04 = obj8;
        this.A05 = obj9;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            2V5 r6 = (2V5) this.A04;
            2V5 r7 = (2V5) this.A05;
            2V5 r8 = (2V5) this.A01;
            GA2 ga2 = new GA2(r6, r7, r8, 2);
            C247543gW r4 = new C247543gW((AnonymousClass3Y5) this.A06, r6, r7, r8, (2V5) this.A07, (2V5) this.A08, (2V5) this.A03, (2Wa) this.A02);
            C247313g8 r2 = (C247313g8) this.A09;
            AnonymousClass3W1 r0 = r2.A00;
            r0.A0T(ga2);
            r0.A0X(r4);
            return new C245943dj(new C58695Iw4(7, (Object) ga2, (Object) r2, (Object) r4));
        }
        UserSession userSession = ((AnonymousClass9H6) this.A09).A01;
        Handler handler = (Handler) this.A08;
        C332157Tw r1 = (C332157Tw) this.A02;
        C3258674m r12 = new C3258674m((C62320sa) this.A04);
        C41396AtI atI = new C41396AtI((Object) r1, 9);
        return new C72501P8k(handler, (AnonymousClass4DH) this.A03, userSession, r1.A0D, r1.A0I, new C41491Aup((C62320sa) this.A05), (AnonymousClass7SE) this.A06, r1.A0P, (AnonymousClass0eK) this.A01, (AnonymousClass0eK) this.A07, r12, atI);
    }
}
