package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class NOQ extends C232222tE {
    public final int A00;
    public final Context A01;
    public final O88 A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C71981OuD ouD = (C71981OuD) r7;
        C67948MxY mxY = (C67948MxY) r8;
        AnonymousClass7TG.A1N(ouD, mxY);
        Context context = this.A01;
        String str = ouD.A01;
        boolean z = ouD.A00;
        O88 o88 = this.A02;
        AnonymousClass7TF.A1D(context, 0, o88);
        mxY.A01.setText(str);
        if (z) {
            TextView textView = mxY.A00;
            textView.setVisibility(0);
            DbU.A12(context, textView, 2131957283);
            2eS.A01(textView);
            C71402Ok1.A00(textView, 3, o88);
            return;
        }
        mxY.A00.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A01;
        int i = this.A00;
        View A08 = DbU.A08(DbT.A0B(context), R.layout.emoji_section_header);
        0qQ.A0C(A08, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) A08;
        C66581MXm.A1B(constraintLayout, i, -2);
        return new C67948MxY(constraintLayout);
    }

    public final Class modelClass() {
        return C71981OuD.class;
    }

    public NOQ(Context context, O88 o88, int i) {
        this.A01 = context;
        this.A00 = i;
        this.A02 = o88;
    }
}
