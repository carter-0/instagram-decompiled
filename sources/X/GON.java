package X;

import android.animation.Animator;
import android.hardware.Sensor;
import com.instagram.common.session.UserSession;

public final class GON extends 0Yg implements C62320sa {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ Animator A02;
    public final /* synthetic */ AnonymousClass3Y5 A03;
    public final /* synthetic */ 2V5 A04;
    public final /* synthetic */ 2V5 A05;
    public final /* synthetic */ 2V5 A06;
    public final /* synthetic */ 2V5 A07;
    public final /* synthetic */ 2V5 A08;
    public final /* synthetic */ 2V5 A09;
    public final /* synthetic */ 2V5 A0A;
    public final /* synthetic */ 2V5 A0B;
    public final /* synthetic */ GOK A0C;
    public final /* synthetic */ 0rm A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GON(Animator animator, Animator animator2, Animator animator3, AnonymousClass3Y5 r5, 2V5 r6, 2V5 r7, 2V5 r8, 2V5 r9, 2V5 r10, 2V5 r11, 2V5 r12, 2V5 r13, GOK gok, 0rm r15, boolean z) {
        super(0);
        this.A0E = z;
        this.A03 = r5;
        this.A0C = gok;
        this.A05 = r6;
        this.A04 = r7;
        this.A07 = r8;
        this.A06 = r9;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A0B = r13;
        this.A0D = r15;
        this.A00 = animator;
        this.A01 = animator2;
        this.A02 = animator3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C22035XuJ xuJ;
        if (this.A0E) {
            xuJ = new C22035XuJ(C51967G9n.A09(this.A03));
        } else {
            xuJ = null;
        }
        GOK gok = this.A0C;
        UserSession userSession = gok.A04;
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        float A012 = (float) 182.A01(A0H, userSession, 36609244669220693L);
        float A013 = (float) 182.A01(A0H, userSession, 36609244669286230L);
        float A014 = (float) 182.A01(A0H, userSession, 36609244669417304L);
        float A015 = (float) 182.A01(A0H, userSession, 36609244669482841L);
        float A002 = C51965G9l.A00(A0H, userSession, 37172194622964280L);
        float A003 = C51965G9l.A00(A0H, userSession, 37172194623029817L);
        if (xuJ != null) {
            2V5 r12 = this.A05;
            2V5 r13 = this.A04;
            2V5 r14 = this.A07;
            2V5 r15 = this.A06;
            2V5 r5 = this.A08;
            2V5 r4 = this.A09;
            2V5 r16 = r5;
            C21458XbN xbN = new C21458XbN(r12, r13, r14, r15, r16, r4, this.A0A, this.A0B, gok, A014, A003, A012, A013, A002, A015);
            Sensor sensor = xuJ.A02;
            if (sensor != null) {
                xuJ.A00 = xbN;
                C60240fb.A01(sensor, xuJ, xuJ.A03, 1);
            }
        }
        0rm r52 = this.A0D;
        Animator animator = this.A00;
        return C51965G9l.A0V(new C58223IoR(2, xuJ, this.A01, r52, this.A02, animator, gok));
    }
}
