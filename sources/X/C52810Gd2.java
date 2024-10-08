package X;

import android.os.CountDownTimer;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Gd2  reason: case insensitive filesystem */
public final class C52810Gd2 extends CountDownTimer {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52810Gd2(C284945Oz r3, long j) {
        super(j, 1000);
        this.A01 = r3;
    }

    public final void onFinish() {
        C241293Oq r1;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C64144LQg lQg = (C64144LQg) this.A01;
                if (lQg.A05) {
                    C65074Lmu.A00(lQg.A07, AnonymousClass05K.A0j);
                    return;
                }
                return;
            case 2:
                C68738NUy nUy = (C68738NUy) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = nUy.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = nUy.A01;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryActionText(nUy.getString(2131961690));
                    return;
                }
                return;
            default:
                I4M i4m = (I4M) this.A01;
                i4m.A07 = true;
                if (i4m.A06 && (r1 = i4m.A00) != null && !r1.CCd().A29() && i4m.A09) {
                    I4M.A01(r1, i4m);
                    return;
                }
                return;
        }
    }

    public final void onTick(long j) {
        switch (this.A00) {
            case 0:
                ((C284945Oz) this.A01).Epw(1G0.A02(j));
                return;
            case 2:
                long A0P = AnonymousClass7TE.A0P((long) ((int) j));
                C68738NUy nUy = (C68738NUy) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = nUy.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryActionText(DbV.A0z(nUy, String.valueOf(A0P), 2131961691));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52810Gd2(C64144LQg lQg, long j, long j2) {
        super(j, j2);
        this.A01 = lQg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52810Gd2(C68738NUy nUy) {
        super(31000, 1000);
        this.A01 = nUy;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52810Gd2(I4M i4m) {
        super(7000, 7000);
        this.A01 = i4m;
    }
}
