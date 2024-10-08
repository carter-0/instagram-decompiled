package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class S3Q {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C11242SHc A03;
    public final String A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final 0sL A07;
    public final boolean A08;
    public final boolean A09;

    public final void A00(String str, boolean z) {
        SRr.A04(this.A02, new C12806T7t(this, str, z), str, true, z);
    }

    public S3Q(Context context, FragmentActivity fragmentActivity, UserSession userSession, C11242SHc sHc, String str, C62320sa r7, C62320sa r8, 0sL r9, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(userSession, str);
        0qQ.A0B(sHc, 5);
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = sHc;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
    }
}
