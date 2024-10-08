package X;

import com.instagram.avatars.coinflip.ProfileCoinFlipView;

/* renamed from: X.FsP  reason: case insensitive filesystem */
public final class C51331FsP implements Runnable {
    public final /* synthetic */ C321266tq A00;
    public final /* synthetic */ ProfileCoinFlipView A01;

    public C51331FsP(C321266tq r1, ProfileCoinFlipView profileCoinFlipView) {
        this.A00 = r1;
        this.A01 = profileCoinFlipView;
    }

    public final void run() {
        C321266tq r4 = this.A00;
        r4.A05(false, true);
        ProfileCoinFlipView profileCoinFlipView = this.A01;
        profileCoinFlipView.postDelayed(new C51164Fpa(r4), 3500);
        profileCoinFlipView.postDelayed(new C51165Fpb(r4), 3400);
    }
}
