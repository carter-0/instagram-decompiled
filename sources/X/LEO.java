package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class LEO {
    public Context A00;
    public Fragment A01;
    public AnonymousClass0iw A02;
    public ImageUrl A03;
    public C363008it A04;
    public C66461MSp A05;
    public FBQ A06;
    public LBI A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B = 0sn.A00;
    public final Activity A0C;
    public final AnonymousClass818 A0D;
    public final UserSession A0E;

    public final LBK A00() {
        Activity activity = this.A0C;
        UserSession userSession = this.A0E;
        AnonymousClass818 r4 = this.A0D;
        C66461MSp mSp = this.A05;
        AnonymousClass0iw r5 = this.A02;
        C363008it r8 = this.A04;
        String str = this.A08;
        String str2 = this.A0A;
        return new LBK(activity, this.A00, this.A01, r4, r5, userSession, this.A03, r8, mSp, this.A06, this.A07, str, str2, this.A0B);
    }

    public LEO(Activity activity, AnonymousClass818 r3, UserSession userSession) {
        this.A0C = activity;
        this.A0E = userSession;
        this.A0D = r3;
    }
}
