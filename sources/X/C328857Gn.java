package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Gn  reason: invalid class name and case insensitive filesystem */
public final class C328857Gn extends 0Yg implements C62320sa {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ 0wc A01;
    public final /* synthetic */ C332237Ue A02;
    public final /* synthetic */ AnonymousClass7SM A03;
    public final /* synthetic */ AnonymousClass9H6 A04;
    public final /* synthetic */ C254923tH A05;
    public final /* synthetic */ AnonymousClass4DU A06;
    public final /* synthetic */ AnonymousClass0eK A07;
    public final /* synthetic */ AnonymousClass0eM A08;
    public final /* synthetic */ AnonymousClass0eM A09;
    public final /* synthetic */ C62320sa A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328857Gn(AnonymousClass4DH r2, 0wc r3, C332237Ue r4, AnonymousClass7SM r5, AnonymousClass9H6 r6, C254923tH r7, AnonymousClass4DU r8, AnonymousClass0eK r9, AnonymousClass0eM r10, AnonymousClass0eM r11, C62320sa r12) {
        super(0);
        this.A04 = r6;
        this.A06 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
        this.A03 = r5;
        this.A02 = r4;
        this.A09 = r10;
        this.A08 = r11;
        this.A07 = r9;
        this.A0A = r12;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A04.A01;
        AnonymousClass4DU r10 = this.A06;
        0wc r2 = this.A01;
        AnonymousClass4DH r1 = this.A00;
        C254923tH r9 = this.A05;
        AnonymousClass7SM r5 = this.A03;
        AnonymousClass0eM r0 = this.A09;
        Object value = r0.getValue();
        0qQ.A07(value);
        Object value2 = r0.getValue();
        0qQ.A07(value2);
        return new C72508P8r(r1, r2, userSession, (C332467Vd) this.A02.A0l.getValue(), r5, (C332817Wm) value, (AnonymousClass7Y8) this.A08.getValue(), (C333057Xm) value2, r9, r10, new TTD(this.A07), this.A0A);
    }
}
