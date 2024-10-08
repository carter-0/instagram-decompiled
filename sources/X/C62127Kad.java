package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Kad  reason: case insensitive filesystem */
public final class C62127Kad extends C62939Kor {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C60401Jku A04;
    public Integer A05;
    public List A06 = Collections.emptyList();
    public final 1P0 A07 = new C61500KAf(this, 32);
    public final UserSession A08;
    public final L2L A09 = new L2L();
    public final ReelMoreOptionsFragment A0A;
    public final String A0B;

    public static void A00(C62127Kad kad) {
        C60401Jku jku = kad.A04;
        if (!jku.A01.isEmpty()) {
            String str = ((L3R) jku.A01.get(jku.A00)).A01;
            ReelMoreOptionsFragment reelMoreOptionsFragment = kad.A0A;
            AnonymousClass8CB r0 = new AnonymousClass8CB(reelMoreOptionsFragment.A03);
            r0.A0A = str;
            reelMoreOptionsFragment.A03 = r0.A01();
            ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment);
        }
    }

    public static void A01(C62127Kad kad, Integer num, boolean z) {
        Boolean bool;
        kad.A05 = num;
        ReelMoreOptionsFragment reelMoreOptionsFragment = kad.A0A;
        Integer num2 = AnonymousClass05K.A0N;
        if (num2.equals(reelMoreOptionsFragment.A0C) && ((bool = reelMoreOptionsFragment.A0B) == null || z != bool.booleanValue())) {
            reelMoreOptionsFragment.A0B = Boolean.valueOf(z);
            PR7 pr7 = reelMoreOptionsFragment.A08;
            pr7.getClass();
            ReelMoreOptionsFragment.A08(reelMoreOptionsFragment.A0Z, reelMoreOptionsFragment.A0Y, pr7, reelMoreOptionsFragment, true);
            if (reelMoreOptionsFragment.getScrollingViewProxy().CWN() || !reelMoreOptionsFragment.getRecyclerView().A1E()) {
                ReelMoreOptionsFragment.A0C(reelMoreOptionsFragment, num2);
            } else {
                reelMoreOptionsFragment.getRecyclerView().post(new C65937M5a(reelMoreOptionsFragment));
            }
        }
        boolean equals = AnonymousClass05K.A00.equals(num);
        int i = 0;
        View view = kad.A02;
        if (equals) {
            view.setVisibility(0);
            kad.A03.setVisibility(8);
            kad.A01.setVisibility(8);
            kad.A00.setVisibility(8);
            return;
        }
        view.setVisibility(8);
        kad.A03.setVisibility(DbW.A01(z ? 1 : 0));
        View view2 = kad.A01;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        view2.setVisibility(i2);
        View view3 = kad.A00;
        if (z) {
            i = 8;
        }
        view3.setVisibility(i);
    }

    public C62127Kad(UserSession userSession, ReelMoreOptionsFragment reelMoreOptionsFragment, String str) {
        this.A08 = userSession;
        this.A0B = str;
        this.A0A = reelMoreOptionsFragment;
    }
}
