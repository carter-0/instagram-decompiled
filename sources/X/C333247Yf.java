package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7Yf  reason: invalid class name and case insensitive filesystem */
public final class C333247Yf {
    public C3269178q A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C333267Yh A03;
    public final C332067Tn A04;
    public final C332157Tw A05;
    public final AnonymousClass7SM A06;
    public final C331747Sf A07;
    public final AnonymousClass7TP A08;
    public final AnonymousClass7S2 A09;
    public final C62320sa A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final C331627Rs A0D;

    public C333247Yf(C332067Tn r20, C332157Tw r21, AnonymousClass7SM r22, C331747Sf r23, AnonymousClass7TP r24, C62320sa r25, C62320sa r26, C62320sa r27, C62320sa r28) {
        C332067Tn r1 = r20;
        this.A04 = r1;
        this.A05 = r21;
        this.A08 = r24;
        this.A06 = r22;
        this.A07 = r23;
        this.A0A = r25;
        this.A0B = r27;
        this.A0C = r28;
        UserSession userSession = r1.A04;
        this.A02 = userSession;
        AnonymousClass4DH r0 = r1.A01;
        this.A01 = r0;
        C331627Rs r8 = new C331627Rs(new C333257Yg(r0), userSession, new C377109Ko(this, 13));
        this.A0D = r8;
        this.A03 = new C333267Yh(userSession, r8, new C317996oB(userSession), r26);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        UserSession userSession2 = this.A02;
        if (AnonymousClass9B8.A07(userSession2)) {
            AnonymousClass9B9.A00();
            AnonymousClass7TP r7 = this.A08;
            C333607Zp r9 = new C333607Zp(this);
            C377109Ko r10 = new C377109Ko(this, 14);
            C62320sa r11 = this.A0B;
            C377109Ko r12 = new C377109Ko(this, 15);
            C377109Ko r13 = new C377109Ko(this, 16);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r11, 4);
            arrayList2.add(new C331857Sq(r7, r8, r9, r10, r11, r12, r13));
            arrayList2.add(new C333387Yt(r8, new C333677Zw(this), new C377109Ko(this, 17)));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(this.A03);
        arrayList.add(new C333277Yi(r8));
        C333287Yj r3 = new C333287Yj(this);
        arrayList.add(new C333297Yk(userSession2, this.A06, new C227422jG(userSession2), r8, r3));
        C3027965h r6 = new C3027965h(r8, new C333307Yl(this), new C377109Ko(this, 18), new C377109Ko(this, 19));
        C333327Yn r5 = new C333327Yn(this);
        ImmutableList of = ImmutableList.of(r6, new C333347Yp(userSession2, new C333337Yo(this), r8, r5, new C377109Ko(this, 20)));
        0qQ.A07(of);
        arrayList.addAll(of);
        arrayList.add(new C333377Ys(userSession2, r8, this.A04.A09, new C333367Yr(this), new C377109Ko(this, 21)));
        0Tu r02 = 0Tu.A05;
        182.A06(r02, userSession2, 36329564988784825L);
        182.A06(r02, userSession2, 36329564988850362L);
        if (I5N.A03(userSession2)) {
            A5K a5k = new A5K(this, this.A0A);
            this.A00 = new C3269178q(r8, new C41553AwL(a5k), new JGX(a5k, 12));
        }
        C3269178q r03 = this.A00;
        if (r03 != null) {
            arrayList.add(r03);
        }
        this.A09 = new AnonymousClass7S2(arrayList);
    }
}
