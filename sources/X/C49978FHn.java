package X;

import android.content.DialogInterface;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FHn  reason: case insensitive filesystem */
public final /* synthetic */ class C49978FHn implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C49978FHn(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        userDetailFragment.A2c.postDelayed(new C51259FrE(userDetailFragment), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }
}
