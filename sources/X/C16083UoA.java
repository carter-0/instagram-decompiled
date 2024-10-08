package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.UoA  reason: case insensitive filesystem */
public final class C16083UoA extends AnonymousClass1GX implements C228252l5 {
    public final UserSession A00;
    public final 0sP A01;

    public C16083UoA(0sP r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void E5B(float f, float f2) {
        if (f2 >= ((float) 182.A01(0Tu.A06, this.A00, 36602377016513146L)) / 100.0f) {
            C51968G9o.A1O(this.A01, true);
        }
    }

    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        C249703kE r0;
        RecyclerView recyclerView;
        int A03 = AnonymousClass0fD.A03(937640975);
        0qQ.A0B(r7, 0);
        AnonymousClass0fD.A0A(-1689880693, AnonymousClass0fD.A03(-643933566));
        C231272rL AZK = r7.AZK();
        int i6 = 0;
        if (i3 < 0) {
            i6 = -1;
        } else {
            while (true) {
                ViewGroup CEd = r7.CEd();
                if (!(CEd instanceof RecyclerView) || (recyclerView = (RecyclerView) CEd) == null) {
                    r0 = null;
                } else {
                    r0 = recyclerView.A0W(i6);
                }
                if (r0 instanceof C67972Mxw) {
                    break;
                }
                int i7 = i6;
                i6++;
                if (i7 == i3) {
                    break;
                }
            }
            i6 = -1;
        }
        if (i > i6) {
            C51968G9o.A1O(this.A01, false);
        }
        AnonymousClass0fD.A0A(641039894, A03);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A0D = AnonymousClass7TG.A0D(r3, 1778397080);
        super.onScrollStateChanged(r3, i);
        AnonymousClass0fD.A0A(989929022, A0D);
    }
}
