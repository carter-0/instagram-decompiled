package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WZM implements AnonymousClass2rX {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final WZN A03;
    public final C294255m9 A04;
    public final UserDetailFragment A05;
    public final C322206vQ A06;
    public final C15953UlV A07;
    public final List A08 = new ArrayList();
    public final boolean A09;

    public WZM(Context context, UserSession userSession, WZN wzn, C294255m9 r6, UserDetailFragment userDetailFragment, C322206vQ r8, AnonymousClass32Q r9, boolean z) {
        0qQ.A0B(r9, 9);
        this.A05 = userDetailFragment;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = wzn;
        this.A09 = z;
        this.A02 = userSession;
        this.A07 = new C15953UlV(1wY.A00(userSession), r9);
        this.A01 = context;
    }

    public static final void A00(WZM wzm) {
        for (AnonymousClass72A A002 : wzm.A08) {
            A002.A00();
        }
    }

    public final Iterator Eaa(C228382la r2) {
        return this.A07.Eaa(r2);
    }
}
