package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.58W  reason: invalid class name */
public final class AnonymousClass58W extends C251343mx {
    public final long A00;
    public final C62320sa A01;
    public final 2WX A02;
    public final UserSession A03;
    public final AnonymousClass3W1 A04;
    public final C247063fi A05;
    public final C62320sa A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass58W(2WX r2, UserSession userSession, AnonymousClass3W1 r4, C247063fi r5, String str, String str2, C62320sa r8, C62320sa r9, long j, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(str2, 10);
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = userSession;
        this.A08 = z;
        this.A00 = j;
        this.A06 = r8;
        this.A07 = z2;
        this.A01 = r9;
        this.A02 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        2WX r0;
        List list;
        AnonymousClass3Y5 r13 = r24;
        0qQ.A0B(r13, 0);
        AnonymousClass3W1 r8 = this.A04;
        2Wa A012 = C243753a2.A01(r13, r8, AnonymousClass58X.A00, 58, false);
        C243673Zt A002 = C243633Zp.A00(r13, AnonymousClass58Y.A00);
        2WX r10 = this.A02;
        boolean z = this.A08;
        2WX r1 = 2WX.A02;
        if (z) {
            r0 = new 2WX(new 2WX((2WX) null, new C244253at(AnonymousClass05K.A00, new AnonymousClass9MC(35, this, A002, A012), "media_tags_timer_setup")), new C244253at(AnonymousClass05K.A01, new C377259Ld(A002, 43), (String) null));
        } else {
            r0 = r1;
        }
        2WX A003 = r10.A00(r0);
        2Wb r12 = new 2Wb(r13.A05, new ArrayList());
        if (((Boolean) A012.A03).booleanValue()) {
            list = (List) this.A06.invoke();
        } else {
            list = 0sn.A00;
        }
        C247063fi r6 = this.A05;
        boolean z2 = this.A07;
        UserSession userSession = this.A03;
        if (z) {
            r1 = new 2WX((2WX) null, new C244253at(AnonymousClass05K.A00, new C377259Ld(this, 44), "media_tags"));
        }
        r12.A00(new AnonymousClass58Z(r1, userSession, r8, r6, list, z2));
        return C243563Zg.A0H(r12, r13, A003, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false);
    }
}
