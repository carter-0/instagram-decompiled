package X;

import android.app.Activity;
import android.graphics.Paint;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.86t  reason: invalid class name and case insensitive filesystem */
public final class C3508886t extends AnonymousClass4HF {
    public ReboundViewPager A00;
    public AnonymousClass876 A01;
    public AnonymousClass871 A02;
    public C229402nK A03;
    public boolean A04;
    public boolean A05;
    public int A06 = -1;
    public boolean A07;
    public final boolean A08;
    public final View A09;
    public final UserSession A0A;
    public final boolean A0B;

    public C3508886t(View view, UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(view, 2);
        this.A0A = userSession;
        this.A09 = view;
        this.A0B = z2;
        this.A08 = C3508986u.A00(z);
    }

    public final void DhK(AnonymousClass3TF r8, float f, float f2) {
        AnonymousClass876 r1;
        0qQ.A0B(r8, 2);
        if (r8 == AnonymousClass3TF.IDLE && Math.abs(f - f2) <= 0.01f) {
            int rint = (int) ((float) Math.rint((double) f));
            AnonymousClass876 r0 = this.A01;
            if (r0 != null && r0.A07(rint) && (r1 = this.A01) != null && r1.A01 != rint) {
                r1.A05((String) null, rint, false, false, false);
            }
        }
    }

    public final void DhS(AnonymousClass3TF r7, AnonymousClass3TF r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        AnonymousClass3TF r0 = AnonymousClass3TF.IDLE;
        if (r7 == r0) {
            AnonymousClass871 r02 = this.A02;
            if (r02 != null) {
                r02.Ciw();
            }
            this.A04 = false;
            ReboundViewPager reboundViewPager = this.A00;
            if (reboundViewPager != null) {
                for (int childCount = reboundViewPager.getChildCount(); -1 < childCount; childCount--) {
                    View childAt = reboundViewPager.getChildAt(childCount);
                    if (childAt != null) {
                        childAt.setLayerType(0, (Paint) null);
                    }
                }
            }
            C229402nK r03 = this.A03;
            if (r03 != null) {
                r03.A02(true);
            }
        } else if (r8 == r0) {
            ReboundViewPager reboundViewPager2 = this.A00;
            if (reboundViewPager2 != null) {
                int i = 1;
                if (this.A08) {
                    i = 2;
                }
                for (int childCount2 = reboundViewPager2.getChildCount(); -1 < childCount2; childCount2--) {
                    View childAt2 = reboundViewPager2.getChildAt(childCount2);
                    if (childAt2 != null) {
                        childAt2.setLayerType(i, (Paint) null);
                    }
                }
            }
            C229402nK r04 = this.A03;
            if (r04 != null) {
                r04.A02(false);
            }
        }
    }

    public final void Dwb(int i, float f) {
        this.A07 = true;
    }

    public final void A00(String str) {
        Activity activity = (Activity) 0mE.A00(this.A09.getContext(), Activity.class);
        if (activity != null) {
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A03 = new C229402nK(activity, new 0xG(str), this.A0A, 23603667);
        }
    }

    public final void DVx(int i, int i2) {
        if (i != this.A06) {
            this.A06 = i;
            if (this.A05 && !this.A04) {
                AnonymousClass2S0.A01.A05(10);
            }
            AnonymousClass876 r0 = this.A01;
            if (r0 != null) {
                r0.A04(i);
            }
        }
    }

    public final void DW9(int i, int i2, boolean z) {
        AnonymousClass876 r1 = this.A01;
        if (r1 != null) {
            int i3 = i;
            if (!this.A0B) {
                r1.A03(i);
            } else if (!z) {
                r1.A05((String) null, i3, false, this.A07, false);
            }
        }
    }
}
