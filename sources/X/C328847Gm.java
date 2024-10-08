package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Gm  reason: invalid class name and case insensitive filesystem */
public final class C328847Gm extends 0Yg implements C62320sa {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C332237Ue A02;
    public final /* synthetic */ C332157Tw A03;
    public final /* synthetic */ AnonymousClass7SM A04;
    public final /* synthetic */ AnonymousClass9H6 A05;
    public final /* synthetic */ AnonymousClass0eK A06;
    public final /* synthetic */ AnonymousClass0eK A07;
    public final /* synthetic */ AnonymousClass0eK A08;
    public final /* synthetic */ AnonymousClass0eM A09;
    public final /* synthetic */ AnonymousClass0eM A0A;
    public final /* synthetic */ AnonymousClass0eM A0B;
    public final /* synthetic */ AnonymousClass0eM A0C;
    public final /* synthetic */ AnonymousClass0eM A0D;
    public final /* synthetic */ AnonymousClass0eM A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328847Gm(AnonymousClass4DH r2, AnonymousClass0iw r3, C332237Ue r4, C332157Tw r5, AnonymousClass7SM r6, AnonymousClass9H6 r7, AnonymousClass0eK r8, AnonymousClass0eK r9, AnonymousClass0eK r10, AnonymousClass0eM r11, AnonymousClass0eM r12, AnonymousClass0eM r13, AnonymousClass0eM r14, AnonymousClass0eM r15, AnonymousClass0eM r16) {
        super(0);
        this.A05 = r7;
        this.A01 = r3;
        this.A0E = r11;
        this.A09 = r12;
        this.A02 = r4;
        this.A0C = r13;
        this.A0B = r14;
        this.A0A = r15;
        this.A0D = r16;
        this.A00 = r2;
        this.A04 = r6;
        this.A08 = r8;
        this.A07 = r9;
        this.A06 = r10;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9H6 r1 = this.A05;
        UserSession userSession = r1.A01;
        FragmentActivity A002 = AnonymousClass9H6.A00(r1);
        AnonymousClass0iw r24 = this.A01;
        AnonymousClass9L4 r3 = new AnonymousClass9L4(this.A08, 16);
        AnonymousClass9L4 r2 = new AnonymousClass9L4(this.A07, 17);
        AnonymousClass0eK r11 = this.A06;
        OVS ovs = new OVS(r24, userSession, r3, r2, new AnonymousClass9L4(r11, 18));
        AnonymousClass0eM r0 = this.A0E;
        Object value = r0.getValue();
        0qQ.A07(value);
        P9G p9g = (P9G) value;
        Object value2 = r0.getValue();
        0qQ.A07(value2);
        P9G p9g2 = (P9G) value2;
        Object value3 = r0.getValue();
        0qQ.A07(value3);
        Object value4 = r0.getValue();
        0qQ.A07(value4);
        Object value5 = r0.getValue();
        0qQ.A07(value5);
        Object value6 = r0.getValue();
        0qQ.A07(value6);
        Object value7 = r0.getValue();
        0qQ.A07(value7);
        Object value8 = r0.getValue();
        0qQ.A07(value8);
        AnonymousClass7VL A003 = this.A02.A00();
        Object value9 = r0.getValue();
        0qQ.A07(value9);
        Object value10 = r0.getValue();
        0qQ.A07(value10);
        Object value11 = r0.getValue();
        0qQ.A07(value11);
        Fragment fragment = this.A00;
        AnonymousClass9L4 r12 = new AnonymousClass9L4(r11, 19);
        AnonymousClass9L4 r13 = new AnonymousClass9L4(this.A03, 20);
        return new P9R(fragment, A002, r24, userSession, this.A04, (C72527P9k) this.A0D.getValue(), ovs, A003, (P9F) this.A09.getValue(), (P9G) value6, (P9G) value5, (P9G) value4, (P9G) value10, (P9G) value3, (C50400Fb8) this.A0C.getValue(), (P9G) value9, p9g2, p9g, (C40479Aco) this.A0B.getValue(), (C72528P9l) this.A0A.getValue(), (P9G) value7, (P9G) value8, (P9G) value11, r12, r13);
    }
}
