package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class FBS {
    public Fragment A00;
    public Fragment A01;
    public Fragment A02;
    public Fragment A03;
    public Fragment A04;
    public Fragment A05;
    public Fragment A06;
    public Fragment A07;
    public Fragment A08;
    public Fragment A09;
    public Fragment A0A;
    public Fragment A0B;
    public Fragment A0C;
    public F1I A0D;
    public PageSelectionOverrideData A0E;
    public String A0F;
    public final FragmentActivity A0G;
    public final G8D A0H;
    public final FRU A0I;
    public final EtT A0J;

    public static Bundle A00(FBS fbs) {
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, fbs.A0F);
        return bundle;
    }

    public final void A01(Fragment fragment, String str) {
        FragmentActivity fragmentActivity = this.A0G;
        if (!fragmentActivity.isDestroyed()) {
            this.A0D.A00(fragment, fragmentActivity, this.A0J, str, true);
        }
    }

    public FBS(FragmentActivity fragmentActivity, G8D g8d, F1I f1i, EtT etT) {
        this.A0H = g8d;
        this.A0G = fragmentActivity;
        this.A0J = etT;
        this.A0D = f1i;
        FRU A0C2 = Dba.A0C(g8d);
        this.A0I = A0C2;
        this.A0F = A0C2.A09;
    }
}
