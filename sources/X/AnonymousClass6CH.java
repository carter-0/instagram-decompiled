package X;

import androidx.compose.ui.Modifier;
import java.util.Map;

/* renamed from: X.6CH  reason: invalid class name */
public final class AnonymousClass6CH extends 0Yg implements 0sL {
    public final /* synthetic */ AnonymousClass6CG A00;
    public final /* synthetic */ AnonymousClass6CC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6CH(AnonymousClass6CG r2, AnonymousClass6CC r3, String str, boolean z) {
        super(2);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = z;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r9 = (C286575Wy) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-948156448, "com.instagram.compose.igds.components.button.IgdsButton.<anonymous> (IgdsButton.kt:95)");
            }
            AnonymousClass6CG r1 = this.A00;
            if (r1 instanceof AnonymousClass6CF) {
                r9.ExS(-584942203);
                AnonymousClass5ZZ.A03(r9, (Modifier) null, AnonymousClass5aQ.A01(r9).A01, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, this.A02, (0sP) null, 0, 0, 1, 2, 0, 390, 11258, this.A01.AJf(this.A03), 0, 0, false);
            } else if (r1 instanceof IPU) {
                r9.ExS(-584632978);
                String str = this.A02;
                if (0fL.A02()) {
                    0fL.A01(-2135119812, "com.instagram.compose.igds.components.button.IgdsButtonIcon.Chevron.annotatedString (IgdsButton.kt:356)");
                }
                C303876Bd r12 = new C303876Bd(16);
                r12.A09(str);
                C52422GSa.A00(r12, "placeholder-id", "[chevron]");
                C286025Tq A022 = r12.A02();
                if (0fL.A02()) {
                    0fL.A00(71018230);
                }
                AnonymousClass6CC r7 = this.A01;
                boolean z = this.A03;
                long AJf = r7.AJf(z);
                AnonymousClass5Z4 r122 = AnonymousClass5aQ.A01(r9).A01;
                if (0fL.A02()) {
                    0fL.A01(539825804, "com.instagram.compose.igds.components.button.IgdsButtonIcon.Chevron.inlineContent (IgdsButton.kt:363)");
                }
                long j = AnonymousClass5aQ.A01(r9).A00.A02.A01;
                Map A0M = 0se.A0M(new 0eP("placeholder-id", new C52376GQb(new GQa(j, j, 7), AnonymousClass5PI.A01(r9, new C59349JGb(r7, ((C268034ce) C286615Xc.A01(AnonymousClass5YA.A01, C286565Wx.A04((C286565Wx) r9))).Ezu(AnonymousClass5aQ.A01(r9).A00.A02.A01), z), -929232071))));
                if (0fL.A02()) {
                    0fL.A00(877601536);
                }
                AnonymousClass5ZZ.A02(r9, (Modifier) null, A022, r122, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, A0M, (0sP) null, 0, 0, 1, 2, 0, 54, 5114, AJf, 0, false);
            } else {
                r9.ExS(396771315);
                C286565Wx.A0I((C286565Wx) r9);
                throw new RuntimeException();
            }
            C286565Wx.A0L((C286565Wx) r9, false);
            if (0fL.A02()) {
                0fL.A00(-658635946);
            }
        } else {
            r9.Evl();
        }
        return C60340gF.A00;
    }
}
