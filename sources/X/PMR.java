package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

public final class PMR implements C74361Ptb {
    public OK5 A00;
    public C68295N9i A01;
    public Integer A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C252063oV A05;
    public final AnonymousClass0eM A06 = C73896PlX.A00(this, 48);
    public final AnonymousClass0eM A07 = C73896PlX.A00(this, 49);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C73906Plh.A00(this, 1);
    public final AnonymousClass0eM A0A = C73906Plh.A00(this, 2);
    public final AnonymousClass0eM A0B = C73906Plh.A00(this, 3);

    public PMR(View view, AnonymousClass0iw r7, UserSession userSession) {
        this.A03 = r7;
        this.A04 = userSession;
        this.A05 = 2b1.A01(view.findViewById(R.id.carousel_stub), false, false);
        this.A08 = C73906Plh.A00(view, 0);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.0rk] */
    /* renamed from: A03 */
    public final void ADN(C68295N9i n9i) {
        0qQ.A0B(n9i, 0);
        this.A01 = n9i;
        List list = n9i.A0J;
        int i = 0;
        if (list != null) {
            ((MediaFrameLayout) this.A0B.getValue()).A00 = n9i.A00;
            AnonymousClass0eM r1 = this.A0A;
            DbW.A1R(r1, 0);
            DbW.A1R(this.A09, 0);
            if (!n9i.A0R) {
                i = 8;
            }
            ViewGroup.MarginLayoutParams A0G = DbX.A0G(AnonymousClass7TE.A0c(r1));
            ? obj = new Object();
            obj.A00 = A0G.topMargin;
            obj.A00 = DbX.A07(this.A08);
            AnonymousClass7TE.A0c(r1).post(new C73336Pav(this, obj, i));
            ((C322136vJ) this.A06.getValue()).submitList(list);
            A01(this, n9i, true);
        } else if (this.A05.CVM()) {
            A02();
            ((C322136vJ) this.A06.getValue()).submitList(0sn.A00);
            DbW.A1R(this.A0A, 8);
        }
    }

    public static final C67924MxA A00(PMR pmr, int i) {
        C249703kE r0;
        RecyclerView recyclerView = ((C67791Muv) pmr.A06.getValue()).A00;
        if (recyclerView != null) {
            r0 = recyclerView.A0W(i);
        } else {
            r0 = null;
        }
        return (C67924MxA) r0;
    }

    public static final void A01(PMR pmr, C68295N9i n9i, boolean z) {
        List list = n9i.A0J;
        if (list != null) {
            int i = n9i.A03;
            AnonymousClass0eM r2 = pmr.A09;
            if (i != ((ViewPager2) r2.getValue()).A00) {
                View childAt = C66583MXo.A0C(r2).getChildAt(0);
                0qQ.A0C(childAt, C273654mx.A00(4));
                ((RecyclerView) childAt).A0l();
                ((ViewPager2) r2.getValue()).A03(i, z);
            }
            ((C255913uv) pmr.A07.getValue()).A01(i, list.size());
        }
    }

    public final void A02() {
        int itemCount = ((2Rw) this.A06.getValue()).getItemCount();
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                C67924MxA A002 = A00(this, i);
                if (A002 != null) {
                    A002.A00.A00();
                }
                if (i != itemCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
