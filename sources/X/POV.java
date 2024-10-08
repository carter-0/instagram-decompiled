package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class POV implements C74578PxR {
    public static final C67769MuT A0D = new C67769MuT(4);
    public OK5 A00;
    public C68295N9i A01;
    public C68295N9i A02;
    public C67790Muu A03;
    public Boolean A04;
    public Integer A05;
    public List A06 = 0sn.A00;
    public boolean A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final OZx A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    public POV(ViewGroup viewGroup, AnonymousClass0iw r4, UserSession userSession, OZx oZx) {
        0qQ.A0B(oZx, 4);
        this.A08 = r4;
        this.A09 = userSession;
        this.A0A = oZx;
        this.A03 = new C67790Muu(r4, userSession, this, oZx);
        this.A0C = AnonymousClass1YB.A00(new C58691Iw0(3, viewGroup, this));
        this.A0B = C73906Plh.A00(viewGroup, 19);
    }

    public static final C74578PxR A00(POV pov, Integer num) {
        C249703kE r1;
        if (num == null) {
            return null;
        }
        RecyclerView recyclerView = pov.A03.A00;
        if (recyclerView != null) {
            r1 = recyclerView.A0W(num.intValue());
        } else {
            r1 = null;
        }
        if (!(r1 instanceof C74578PxR)) {
            return null;
        }
        return (C74578PxR) r1;
    }

    public final void E2w(C74438Put put, Boolean bool, Integer num) {
    }

    public final void ECY() {
    }

    public final void Ee6() {
        this.A07 = true;
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        int i;
        int i2;
        List list;
        List list2;
        C68295N9i n9i = (C68295N9i) pry;
        0qQ.A0B(n9i, 0);
        AnonymousClass0eM r5 = this.A0C;
        r5.getValue();
        if (((ViewPager2) r5.getValue()).A04.A0A == null) {
            this.A03 = new C67790Muu(this.A08, this.A09, this, this.A0A);
            ((ViewPager2) r5.getValue()).setAdapter(this.A03);
        }
        C68295N9i n9i2 = this.A01;
        this.A02 = n9i2;
        this.A01 = n9i;
        List list3 = n9i.A0K;
        if (list3 != null) {
            if (n9i2 == null || (list2 = n9i2.A0K) == null) {
                i = 0;
            } else {
                i = list2.size();
            }
            C68295N9i n9i3 = this.A01;
            if (n9i3 == null || (list = n9i3.A0K) == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            if (i < i2) {
                this.A03.submitList(list3);
                this.A06 = list3;
                return;
            }
            C68295N9i A042 = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i, (AnonymousClass3TO) null, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -1, 1535, false, false, false, false, false, false, false, false);
            this.A04 = Boolean.valueOf(A042.A0Q);
            boolean z = this.A07;
            Integer num = this.A05;
            if (z) {
                if (num != null) {
                    int intValue = num.intValue() + 1;
                    if (intValue < list3.size()) {
                        list3.set(intValue, A042);
                        this.A03.notifyItemChanged(intValue);
                        ((ViewPager2) r5.getValue()).A03(intValue, true);
                        return;
                    }
                    this.A07 = false;
                }
            } else if (num != null) {
                int intValue2 = num.intValue();
                list3.set(intValue2, A042);
                this.A03.notifyItemChanged(intValue2);
            }
        } else {
            this.A05 = 0;
            List A1I = AnonymousClass7TE.A1I(n9i);
            this.A06 = A1I;
            this.A03.submitList(A1I);
            this.A04 = Boolean.valueOf(n9i.A0Q);
        }
    }

    public final C72981PRo Am2() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            return A002.Am2();
        }
        return null;
    }

    public final C72981PRo CEF() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            return A002.CEF();
        }
        return null;
    }

    public final void CMK() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.CMK();
        }
    }

    public final void CML() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.CML();
        }
    }

    public final void E29() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.E29();
        }
    }

    public final void ECV() {
        AnonymousClass0eM r1 = this.A0C;
        if (r1.CVQ()) {
            ((ViewPager2) r1.getValue()).setAdapter((2Rw) null);
        }
    }

    public final void EJA() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.EJA();
        }
    }

    public final void EKK(float f) {
        if (f != 1.0f) {
            AnonymousClass0eM r3 = this.A0C;
            AnonymousClass7TE.A0c(r3).setPivotX(AnonymousClass7TE.A02(AnonymousClass7TE.A0c(r3)) / 2.0f);
            AnonymousClass7TE.A0c(r3).setPivotY(C66582MXn.A00(this.A0B));
        }
        AnonymousClass0eM r1 = this.A0C;
        AnonymousClass7TE.A0c(r1).setScaleX(f);
        AnonymousClass7TE.A0c(r1).setScaleY(f);
    }

    public final void ETb(int i) {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.ETb(i);
        }
    }

    public final void Eux() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.Eux();
        }
    }

    public final void EyO(String str) {
        C74578PxR A002;
        Integer num = this.A05;
        if (num != null && (A002 = A00(this, num)) != null) {
            A002.EyO(str);
        }
    }

    public final void FHE() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.FHE();
        }
    }

    public final void FM2() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.FM2();
        }
    }

    public final void onDestroy() {
        C74578PxR A002 = A00(this, this.A05);
        if (A002 != null) {
            A002.onDestroy();
        }
    }

    public final void EqX(OK5 ok5) {
        this.A00 = ok5;
    }
}
