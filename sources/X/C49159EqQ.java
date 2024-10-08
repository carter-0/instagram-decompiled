package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EqQ  reason: case insensitive filesystem */
public abstract class C49159EqQ {
    public static void A00(Context context, C49604EzN ezN, EyP eyP) {
        ViewGroup viewGroup = ezN.A00;
        viewGroup.setVisibility(0);
        ezN.A02.A02();
        eyP.A01.getClass();
        TextView textView = ezN.A01;
        textView.getClass();
        textView.setText(eyP.A02);
        FP7.A00(viewGroup, 9, eyP, ezN);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(AnonymousClass7TF.A03(context, R.attr.backgroundColorSecondary)));
        viewGroup.setBackground(stateListDrawable);
    }
}
