package X;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior;

public final class PMP implements C74361Ptb {
    public int A00;
    public C70514O9n A01;
    public final int A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final BottomSheetBehavior A07;
    public final AnonymousClass0eM A08 = C73900Plb.A00(this, 20);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C73900Plb.A00(this, 22);
    public final UserSession A0B;

    public PMP(View view, UserSession userSession) {
        this.A05 = view;
        this.A0B = userSession;
        View findViewById = view.findViewById(R.id.call_participant_grid_container);
        this.A06 = findViewById;
        this.A09 = C73900Plb.A00(this, 21);
        Context A0S = AnonymousClass7TE.A0S(view);
        double A082 = (double) 0nA.A08(A0S);
        double d = 0.8d * A082;
        this.A02 = (int) (A082 - d);
        View findViewById2 = view.findViewById(R.id.call_bottom_sheet);
        this.A03 = findViewById2;
        findViewById2.setVisibility(0);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById2);
        this.A07 = A012;
        A012.A0P = true;
        0nA.A0V(findViewById2, (int) d);
        View findViewById3 = findViewById2.findViewById(R.id.bottom_sheet_drag_handle);
        this.A04 = findViewById3;
        findViewById3.setBackgroundResource(R.drawable.igds_bottom_sheet_background);
        03v.A0B(findViewById3, new U7D(2));
        DbU.A12(A0S, findViewById3, 2131954078);
        if (findViewById != null) {
            this.A00 = A0S.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
            2dP layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof 2dP) {
                CoordinatorLayout.Behavior behavior = layoutParams.A0A;
                if (behavior instanceof BottomSheetScaleBehavior) {
                    ((BottomSheetScaleBehavior) behavior).A00 = this.A00;
                } else {
                    throw AnonymousClass7TE.A0w("The view is not associated with BottomSheetScaleBehavior");
                }
            } else {
                throw AnonymousClass7TE.A0w("The view is not a child of CoordinatorLayout");
            }
        }
        A012.A0a(new C68392NEz(this));
    }

    private final void A00(float f) {
        View findViewById = this.A05.findViewById(R.id.bottom_sheet_container);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C66583MXo.A0D(AnonymousClass7TE.A0c(this.A0A).animate().translationY(f)).start();
        }
    }

    public final void A01(boolean z) {
        02M r0;
        int A072;
        int i;
        View view = this.A05;
        Context A0S = AnonymousClass7TE.A0S(view);
        float A082 = (float) 0nA.A08(A0S);
        float A052 = (float) 0nA.A05(A0S);
        double d = ((double) (A082 / A052)) * 0.8d;
        04k A002 = C586203k.A00(view);
        if (A002 != null) {
            r0 = A002.A00.A03();
            A072 = r0.A00;
        } else {
            r0 = null;
            A072 = 0nA.A07(A0S);
        }
        if (!z) {
            i = (int) ((1.0d - d) * ((double) A052));
        } else if (r0 != null) {
            i = r0.A03;
        } else {
            i = 0;
        }
        View findViewById = view.findViewById(R.id.bottom_sheet_container);
        if (findViewById != null) {
            if (findViewById.getPaddingBottom() != A072) {
                0nA.A0X(findViewById, A072);
            }
            if (0nA.A0C(findViewById) != i) {
                0nA.A0e(findViewById, i);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        C68287N9a n9a = (C68287N9a) pry;
        0qQ.A0B(n9a, 0);
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        int i = 4;
        if (n9a.A01) {
            i = 3;
        }
        bottomSheetBehavior.A0W(i);
        float f = n9a.A00;
        if (f == 0.0f) {
            this.A03.setTranslationY(0.0f);
            A00(0.0f);
            return;
        }
        C66583MXo.A0D(this.A03.animate().translationY(f)).start();
        A00(f);
    }
}
