package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E9x  reason: case insensitive filesystem */
public final class C47611E9x extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47611E9x(UserSession userSession, C65634LxB lxB) {
        this.A00 = userSession;
        this.A01 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1428157294);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.HallPassRowViewBinder.Holder");
        C49583Eys eys = (C49583Eys) tag;
        C65634LxB lxB = this.A01;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.HallPassRowViewModel");
        FY1 fy1 = (FY1) obj;
        DbZ.A0t(1, eys, lxB, fy1);
        View view2 = eys.A00;
        Context context = view2.getContext();
        FP5.A01(view2, 53, lxB);
        IgSimpleImageView igSimpleImageView = eys.A01;
        igSimpleImageView.setImageResource(R.drawable.instagram_group_pano_filled_24);
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        int[] iArr = new int[5];
        C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        igSimpleImageView.setBackground(gradientDrawable);
        DbU.A14(context, igSimpleImageView, R.color.canvas_bottom_sheet_description_text_color);
        eys.A02.setText(2131963284);
        IgTextView igTextView = eys.A03;
        igTextView.setVisibility(0);
        igTextView.setText(DbY.A0d(context.getResources(), fy1.A00, R.plurals.hall_pass_count));
        AnonymousClass0fD.A0A(43488393, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1602202917);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_hall_pass, false);
        A0A.setTag(new C49583Eys(A0A));
        AnonymousClass0fD.A0A(715147379, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
