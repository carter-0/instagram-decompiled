package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Arrays;

public final class OFS {
    public final C71929OtD A00;
    public final 1Ng A01;
    public final NMW A02;
    public final AnonymousClass343 A03;

    public OFS(Fragment fragment, UserSession userSession, ReboundViewPager reboundViewPager, NMW nmw, C67687MsP msP) {
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        this.A01 = A002;
        C71929OtD otD = new C71929OtD(2, this, nmw);
        this.A00 = otD;
        this.A02 = nmw;
        this.A03 = new AnonymousClass343((AnonymousClass340) new C14178TrI(msP, 2), (AnonymousClass342) new C57222ITj(fragment, reboundViewPager), Arrays.asList(new C2355130d[]{new C69019Ncw(reboundViewPager, nmw, msP)}));
        A002.A01(otD, C57071INl.class);
    }
}
