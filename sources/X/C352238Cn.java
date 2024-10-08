package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.8Cn  reason: invalid class name and case insensitive filesystem */
public final class C352238Cn {
    public final ConstraintLayout A00;
    public final AnonymousClass4DH A01;
    public final ReboundHorizontalScrollView A02;
    public final C352208Cj A03;
    public final C352248Co A04;
    public final C352248Co A05;
    public final C352258Cp A06;

    public C352238Cn(View view, AnonymousClass4DH r7, C352208Cj r8) {
        this.A01 = r7;
        this.A03 = r8;
        View requireViewById = view.requireViewById(R.id.immersive_photo_controls_stub);
        requireViewById = requireViewById instanceof ViewStub ? ((ViewStub) requireViewById).inflate() : requireViewById;
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) requireViewById;
        this.A00 = constraintLayout;
        View requireViewById2 = constraintLayout.requireViewById(R.id.immersive_photo_toggle);
        0qQ.A07(requireViewById2);
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) requireViewById2;
        this.A02 = reboundHorizontalScrollView;
        Context context = view.getContext();
        0qQ.A07(context);
        C352248Co r2 = new C352248Co(context, R.drawable.instagram_circle_block_pano_outline_16);
        this.A04 = r2;
        C352248Co r1 = new C352248Co(context, R.drawable.instagram_cube_pano_outline_16);
        this.A05 = r1;
        C352258Cp r0 = new C352258Cp(this);
        this.A06 = r0;
        reboundHorizontalScrollView.addView(r2);
        reboundHorizontalScrollView.addView(r1);
        reboundHorizontalScrollView.A0A(r0);
        reboundHorizontalScrollView.A08(((Boolean) r8.A0C.getValue()).booleanValue() ? 1 : 0);
        reboundHorizontalScrollView.onRestoreInstanceState(reboundHorizontalScrollView.onSaveInstanceState());
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r7.getViewLifecycleOwner());
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376889Js(this, (AnonymousClass4D7) null, 36), A002);
    }
}
