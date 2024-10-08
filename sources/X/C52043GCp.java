package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GCp  reason: case insensitive filesystem */
public final class C52043GCp extends C52050GCw implements AnonymousClass32U {
    public C238133Ar A00;
    public final int A01;
    public final Activity A02;
    public final C227762js A03;
    public final GDX A04;
    public final C52044GCq A05;
    public final List A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.GDX] */
    public C52043GCp(Activity activity, Context context, UserSession userSession, List list, boolean z, boolean z2) {
        Float f;
        View view;
        float f2;
        0Tu r4;
        long j;
        C51972G9s.A1D(userSession, list);
        this.A02 = activity;
        this.A07 = z2;
        boolean z3 = false;
        if (list.containsAll(0sr.A1P(new GJY[]{GJY.A08, GJY.A09}))) {
            if ((!C52274GLq.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36318518333282522L)) && (!GM2.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36320128945823793L))) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        ViewGroup viewGroup = null;
        if (z3) {
            if (C52274GLq.A00(userSession).booleanValue()) {
                r4 = 0Tu.A05;
                if (182.A06(r4, userSession, 36318518333282522L)) {
                    j = 37162943263211774L;
                    f2 = ((float) (AnonymousClass0nB.A00(context) - context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama))) * C51965G9l.A00(r4, userSession, j);
                    f = Float.valueOf(f2);
                }
            }
            if (GM2.A00(userSession).booleanValue()) {
                r4 = 0Tu.A05;
                if (182.A06(r4, userSession, 36320128945823793L)) {
                    j = 37164553875816782L;
                    f2 = ((float) (AnonymousClass0nB.A00(context) - context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama))) * C51965G9l.A00(r4, userSession, j);
                    f = Float.valueOf(f2);
                }
            }
            f2 = 0.0f;
            f = Float.valueOf(f2);
        } else {
            f = null;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A03 = C227752jr.A00(context, f, true);
        this.A01 = AnonymousClass3D4.A00(context);
        this.A05 = new C52044GCq(z);
        2dZ A002 = 2dY.A00(activity);
        if (A002 != null) {
            2dZ.A0F(A002);
            view = A002.A0U.getView();
        } else {
            view = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        2dZ A003 = 2dY.A00(activity);
        this.A06 = C51967G9n.A0s(new ViewGroup[]{viewGroup2, A003 != null ? A003.A0Q : viewGroup});
        this.A04 = new Object();
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DhU(Integer num) {
        ViewPager2 viewPager2;
        C227762js r3 = this.A03;
        C52012GBj gBj = this.A02;
        boolean z = false;
        if (!(gBj == null || (viewPager2 = gBj.A00) == null || !viewPager2.A06.A06.A07)) {
            z = true;
        }
        r3.A0B = !z;
    }

    public final void onDestroyView() {
        C238133Ar r0 = this.A00;
        if (r0 != null) {
            r0.AHq();
        }
        this.A00 = null;
    }
}
