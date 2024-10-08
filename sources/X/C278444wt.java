package X;

import android.widget.SeekBar;
import com.instagram.common.session.UserSession;

/* renamed from: X.4wt  reason: invalid class name and case insensitive filesystem */
public final class C278444wt extends 0Yg implements 0sP {
    public final /* synthetic */ AnonymousClass9IB A00;
    public final /* synthetic */ AnonymousClass9IP A01;
    public final /* synthetic */ C244463bE A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C246953fX A04;
    public final /* synthetic */ C278414wq A05;
    public final /* synthetic */ AnonymousClass4Js A06;
    public final /* synthetic */ C246993fb A07;
    public final /* synthetic */ C231502rm A08;
    public final /* synthetic */ AnonymousClass9NR A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C278444wt(AnonymousClass9IB r2, AnonymousClass9IP r3, C244463bE r4, 1Xj r5, C246953fX r6, C278414wq r7, AnonymousClass4Js r8, C246993fb r9, C231502rm r10, AnonymousClass9NR r11, C62320sa r12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A02 = r4;
        this.A05 = r7;
        this.A07 = r9;
        this.A0E = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A06 = r8;
        this.A01 = r3;
        this.A09 = r11;
        this.A0D = z4;
        this.A04 = r6;
        this.A00 = r2;
        this.A0F = z5;
        this.A0A = r12;
        this.A08 = r10;
        this.A03 = r5;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        2WE r13 = (2WE) obj;
        0qQ.A0B(r13, 0);
        C244463bE r1 = this.A02;
        C278414wq r9 = this.A05;
        UserSession userSession = r9.A01;
        r1.A00 = C231492rl.A00(userSession).A0O;
        C246953fX r8 = this.A04;
        AnonymousClass9IB r6 = this.A00;
        boolean z = this.A0F;
        C62320sa r11 = this.A0A;
        C231502rm r10 = this.A08;
        1Xj r7 = this.A03;
        try {
            r13.A00 = 00R.A03("image_and_video", 127);
            AnonymousClass4DU r0 = r9.A03;
            if (r9.A0A) {
                i = Float.valueOf(r9.A04.A00);
            } else {
                i = 0;
            }
            C59168J8y j8y = new C59168J8y(r6, r7, r8, r9, r10, r11, z);
            r13.A02(j8y, new Object[]{userSession, r0, r8, r6, i, Boolean.valueOf(r9.A09)});
            r13.A00 = null;
            C246773fD r5 = C278414wq.A0E;
            C246993fb r4 = this.A07;
            C246613et r62 = r9.A04;
            AnonymousClass3W1 r15 = r62.A0E;
            C247013fd.A07(r13, r4, r5, r15, new C58135In1(r9));
            C247013fd.A00(C243803a8.A00(r1), r13, r62, new C58136In2(r9), this.A0E);
            C247013fd.A08(r13, r9.A08, new GAE(r9));
            boolean z2 = this.A0B;
            boolean z3 = this.A0C;
            C246613et r18 = r62;
            C247013fd.A05(r13, r9.A02, r18, new GAF(r9), z2, z3);
            C247013fd.A06(r13, r62, r9.A06, new GAG(r9));
            C245853da r52 = r62.A0F;
            AnonymousClass4Js r42 = this.A06;
            C247013fd.A03(this.A01, r13, r18, r42, r52, new C58137In3(r9));
            C246483eg r72 = r62.A0C;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = r9.A00;
            C58138In4 in4 = new C58138In4(r9);
            0qQ.A0B(onSeekBarChangeListener, 2);
            r13.A02(new AnonymousClass9MG(16, r72, onSeekBarChangeListener, in4), new Object[]{r72, onSeekBarChangeListener});
            AnonymousClass9NR r3 = this.A09;
            boolean z4 = this.A0D;
            String moduleName = r0.getModuleName();
            C247013fd.A04(r13, userSession, r15, r9.A07, r3, moduleName, new C58139In5(r9), z4);
            return C60340gF.A00;
        } catch (Throwable th) {
            r13.A00 = null;
            throw th;
        }
    }
}
