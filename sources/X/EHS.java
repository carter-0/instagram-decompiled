package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

public final class EHS extends 2Cn {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ G78 A03;
    public final /* synthetic */ C46634DiE A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public EHS(Fragment fragment, 0lg r2, ImageUrl imageUrl, G78 g78, C46634DiE diE, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A04 = diE;
        this.A01 = r2;
        this.A03 = g78;
    }

    public final void onFail(Exception exc) {
        this.A03.D5C(false, "Failure getting SmartLock instance");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity activity;
        1WP r11 = (1WP) obj;
        0qQ.A0B(r11, 0);
        Fragment fragment = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        ImageUrl imageUrl = this.A02;
        boolean z = this.A07;
        C46634DiE diE = this.A04;
        0lg r1 = this.A01;
        G78 g78 = this.A03;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            g78.D5C(false, "Activity or SmartLock plugin null");
        } else {
            r11.getSmartLockBroker(activity, new C50528Fdo(fragment, imageUrl, g78, diE, str, str2, z), r1);
        }
    }
}
