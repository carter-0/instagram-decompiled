package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class FAY {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C49350EuE A05;
    public final C10315RqD A06;
    public final Reel A07;

    public static final String A00(FAY fay) {
        Resources A0A = AnonymousClass7TF.A0A(fay.A00);
        Reel reel = fay.A07;
        1Ns r1 = reel.A0W;
        if (!(r1 instanceof AnonymousClass6YJ)) {
            return null;
        }
        0qQ.A0A(r1);
        String Art = r1.Art();
        if (Art == null || Art.length() == 0) {
            return null;
        }
        1Ns r0 = reel.A0W;
        0qQ.A0A(r0);
        return AnonymousClass7TF.A0e(A0A, r0.Art(), 2131967693);
    }

    public FAY(Context context, Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C49350EuE euE, C10315RqD rqD, Reel reel) {
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = r4;
        this.A01 = fragment;
        this.A07 = reel;
        this.A04 = userSession;
        this.A05 = euE;
        this.A06 = rqD;
    }
}
