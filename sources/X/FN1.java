package X;

import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public final class FN1 implements View.OnClickListener {
    public final /* synthetic */ C331127Pr A00;
    public final /* synthetic */ BottomSheetFragment A01;

    public FN1(C331127Pr r1, BottomSheetFragment bottomSheetFragment) {
        this.A00 = r1;
        this.A01 = bottomSheetFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-385202641);
        View.OnClickListener onClickListener = this.A00.A0K;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        DbW.A1K(this.A01.A02);
        AnonymousClass0fD.A0C(1140320309, A05);
    }
}
