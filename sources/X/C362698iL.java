package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.8iL  reason: invalid class name and case insensitive filesystem */
public final class C362698iL {
    public AnonymousClass5Gv A00;
    public boolean A01;
    public final Activity A02;
    public final Activity A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final C362708iM A06;
    public final ViewGroup A07;
    public final C362688iK A08;

    public C362698iL(Activity activity, ViewGroup viewGroup, UserSession userSession, IgTextView igTextView, C357638Yz r7, C362688iK r8) {
        0qQ.A0B(r8, 3);
        0qQ.A0B(igTextView, 4);
        this.A02 = activity;
        this.A04 = userSession;
        this.A08 = r8;
        this.A05 = igTextView;
        this.A07 = viewGroup;
        this.A03 = activity;
        this.A06 = new C362708iM(userSession, (C279284yO) r7.A08.A00);
    }

    public final void A00() {
        AnonymousClass5Gv r0;
        AnonymousClass5Gv r02 = this.A00;
        if (r02 == null || !r02.A09()) {
            UserSession userSession = this.A04;
            List list = this.A06.A03;
            if (!(!list.isEmpty()) || 1Au.A00(userSession).A01.getInt("meta_gallery_tooltip_impression_count", 0) >= 1 || !182.A06(0Tu.A05, userSession, 36316662907015732L)) {
                r0 = null;
            } else {
                Activity activity = this.A02;
                IgTextView igTextView = this.A05;
                Resources resources = this.A03.getResources();
                0qQ.A07(resources);
                r0 = F5J.A00(activity, igTextView, userSession, C226262fy.BELOW_ANCHOR, F5J.A01(resources, list));
            }
            this.A00 = r0;
            if (r0 != null) {
                this.A07.postDelayed(new C41033AnH(this, r0), 500);
            }
        }
    }

    public final void A01() {
        C362898if r5 = new C362898if(this);
        C362708iM r4 = this.A06;
        r4.A03.clear();
        if (182.A06(0Tu.A05, r4.A00, 36316662907015732L)) {
            C362718iN r3 = r4.A02;
            C361588gT r2 = r3.A01;
            C362708iM.A00(r5, r4, (List) r2.A06.getValue());
            r3.A00 = new AnonymousClass9M5(0, r4, r5);
            r2.A03(AnonymousClass9PQ.A00(r4.A01));
        }
    }
}
