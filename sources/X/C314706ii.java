package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.6ii  reason: invalid class name and case insensitive filesystem */
public final class C314706ii {
    public boolean A00;
    public final float A01;
    public final float A02;
    public final Context A03;
    public final View A04;
    public final FragmentActivity A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final AnonymousClass3BQ A08;
    public final C273384mU A09;
    public final C313056fm A0A;
    public final C309536Yq A0B;
    public final ReelAvatarWithBadgeView A0C;
    public final C314696ih A0D;
    public final C71392co A0E = C71392co.A04(50.0d, 8.0d);

    public C314706ii(Context context, View view, FragmentActivity fragmentActivity, AnonymousClass0iw r8, UserSession userSession, AnonymousClass3BQ r10, C273384mU r11, C313056fm r12, C309536Yq r13, ReelAvatarWithBadgeView reelAvatarWithBadgeView, C314696ih r15, float f, float f2, boolean z) {
        0qQ.A0B(userSession, 4);
        0qQ.A0B(r12, 5);
        0qQ.A0B(reelAvatarWithBadgeView, 7);
        0qQ.A0B(r13, 9);
        0qQ.A0B(r10, 14);
        this.A00 = z;
        this.A05 = fragmentActivity;
        this.A03 = context;
        this.A07 = userSession;
        this.A0A = r12;
        this.A0D = r15;
        this.A0C = reelAvatarWithBadgeView;
        this.A04 = view;
        this.A0B = r13;
        this.A02 = f;
        this.A01 = f2;
        this.A09 = r11;
        this.A06 = r8;
        this.A08 = r10;
    }

    public static final void A00(C250973mM r6, AnonymousClass6UX r7, C317396nC r8, C314706ii r9, float f, float f2) {
        r9.A09.EHd();
        r8.A02(r9.A0E, 0.0f, 0.0f, f, f2);
        if (r6 != null) {
            r7.A05(r6.A0H, r6.A08(r9.A07));
        }
    }
}
