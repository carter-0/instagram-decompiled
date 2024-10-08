package X;

import android.widget.SeekBar;
import com.instagram.common.session.UserSession;

/* renamed from: X.IyI  reason: case insensitive filesystem */
public final class C58833IyI extends 0Yg implements 0sP {
    public final /* synthetic */ AnonymousClass9IB A00;
    public final /* synthetic */ AnonymousClass9IP A01;
    public final /* synthetic */ C244463bE A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C246953fX A04;
    public final /* synthetic */ C53991GxZ A05;
    public final /* synthetic */ AnonymousClass4Js A06;
    public final /* synthetic */ C246993fb A07;
    public final /* synthetic */ AnonymousClass9NR A08;
    public final /* synthetic */ C62320sa A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58833IyI(AnonymousClass9IB r2, AnonymousClass9IP r3, C244463bE r4, 1Xj r5, C246953fX r6, C53991GxZ gxZ, AnonymousClass4Js r8, C246993fb r9, AnonymousClass9NR r10, C62320sa r11, boolean z, boolean z2, boolean z3) {
        super(1);
        this.A07 = r9;
        this.A05 = gxZ;
        this.A02 = r4;
        this.A0B = z;
        this.A06 = r8;
        this.A01 = r3;
        this.A08 = r10;
        this.A0A = z2;
        this.A04 = r6;
        this.A00 = r2;
        this.A0C = z3;
        this.A09 = r11;
        this.A03 = r5;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        2WE r13 = (2WE) obj;
        0qQ.A0B(r13, 0);
        C53991GxZ gxZ = this.A05;
        C246953fX r11 = this.A04;
        AnonymousClass9IB r12 = this.A00;
        boolean z = this.A0C;
        C62320sa r6 = this.A09;
        1Xj r2 = this.A03;
        try {
            r13.A00 = 00R.A03("image_and_video", 127);
            UserSession userSession = gxZ.A01;
            AnonymousClass4DU r7 = gxZ.A02;
            if (gxZ.A07) {
                i = Float.valueOf(gxZ.A03.A00);
            } else {
                i = 0;
            }
            r13.A02(new J8W(1, gxZ, r11, r6, r2, z), new Object[]{userSession, r7, r11, r12, i});
            r13.A00 = null;
            C246773fD r22 = C53991GxZ.A0B;
            C246993fb r1 = this.A07;
            C246613et r62 = gxZ.A03;
            AnonymousClass3W1 r15 = r62.A0E;
            C247013fd.A07(r13, r1, r22, r15, new C58141In7(gxZ, 0));
            C247013fd.A00(C243803a8.A00(this.A02), r13, r62, new C58141In7(gxZ, 1), this.A0B);
            C247013fd.A08(r13, gxZ.A06, new C58141In7(gxZ, 2));
            C245853da r4 = r62.A0F;
            AnonymousClass4Js r3 = this.A06;
            C247013fd.A03(this.A01, r13, r62, r3, r4, new C58141In7(gxZ, 3));
            C246483eg r63 = r62.A0C;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = gxZ.A00;
            C58141In7 in7 = new C58141In7(gxZ, 4);
            0qQ.A0B(onSeekBarChangeListener, 2);
            r13.A02(new AnonymousClass9MG(16, r63, onSeekBarChangeListener, in7), new Object[]{r63, onSeekBarChangeListener});
            AnonymousClass9NR r42 = this.A08;
            boolean z2 = this.A0A;
            String moduleName = r7.getModuleName();
            C247013fd.A04(r13, userSession, r15, gxZ.A05, r42, moduleName, new C58141In7(gxZ, 5), z2);
            return C60340gF.A00;
        } catch (Throwable th) {
            r13.A00 = null;
            throw th;
        }
    }
}
