package X;

import com.instagram.avatars.coinflip.ProfileCoinFlipView;

/* renamed from: X.6tv  reason: invalid class name and case insensitive filesystem */
public final class C321316tv implements C252203oj {
    public final /* synthetic */ C321266tq A00;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public C321316tv(C321266tq r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r9) {
        float f;
        if (r9 != null) {
            f = (float) r9.A09.A00;
        } else {
            f = 1.0f;
        }
        ProfileCoinFlipView profileCoinFlipView = this.A00.A0C;
        float f2 = profileCoinFlipView.A00;
        float f3 = 1.0f - 0.0f;
        float f4 = (0.9f * f2) - f2;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 0.0f) / f3;
        }
        float f6 = (f5 * f4) + f2;
        profileCoinFlipView.setScaleX(Math.signum(profileCoinFlipView.getScaleX()) * f6);
        profileCoinFlipView.setScaleY(f6);
    }
}
