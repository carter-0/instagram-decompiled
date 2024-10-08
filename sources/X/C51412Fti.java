package X;

import androidx.fragment.app.Fragment;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;

/* renamed from: X.Fti  reason: case insensitive filesystem */
public final class C51412Fti implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C47649EBj A01;

    public C51412Fti(Fragment fragment, C47649EBj eBj) {
        this.A01 = eBj;
        this.A00 = fragment;
    }

    public final void run() {
        ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = this.A01.A01;
        C309516Yo A0G = Dbb.A0G(shortUrlReelLoadingFragment);
        A0G.A0E(this.A00);
        DbV.A1O(A0G);
        shortUrlReelLoadingFragment.requireActivity().A0Z();
    }
}
