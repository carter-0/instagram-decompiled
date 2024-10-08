package X;

import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;

/* renamed from: X.EBj  reason: case insensitive filesystem */
public final class C47649EBj extends 1P0 {
    public final String A00;
    public final /* synthetic */ ShortUrlReelLoadingFragment A01;

    public C47649EBj(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment, String str) {
        this.A01 = shortUrlReelLoadingFragment;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(397053986);
        DwT dwT = (DwT) obj;
        int A032 = AnonymousClass0fD.A03(168789099);
        if (dwT != null) {
            ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01;
            C46474Dfc A012 = C46548Dgp.A01(shortUrlReelLoadingFragment.getSession(), dwT.A04, "short_url_to_profile_and_launch_reel", "short_url_reel_loading_fragment");
            if (dwT.A08) {
                A012.A02 = new AutoLaunchReelParams(AnonymousClass05K.A00, dwT.A05, (String) null, (String) null, (String) null, false, true, false, false);
            }
            shortUrlReelLoadingFragment.A00.post(new C51412Fti(C46474Dfc.A00(shortUrlReelLoadingFragment.getSession(), C46447Df9.A02(), A012), this));
        }
        AnonymousClass0fD.A0A(-73599571, A032);
        AnonymousClass0fD.A0A(956623604, A03);
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(152095629);
        ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01;
        shortUrlReelLoadingFragment.mLoadingSpinner.setLoadingStatus(C255943uy.FAILED);
        FP4.A01(shortUrlReelLoadingFragment.mLoadingSpinner, 31, this);
        C59689JTv.A0C(shortUrlReelLoadingFragment.getActivity(), "unknown_error_occured");
        AnonymousClass0fD.A0A(220952966, A03);
    }
}
