package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class ANU implements View.OnClickListener {
    public final /* synthetic */ C380419Yc A00;
    public final /* synthetic */ C349097za A01;

    public ANU(C380419Yc r1, C349097za r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1439572672);
        C349097za r1 = this.A01;
        int layoutPosition = this.A00.getLayoutPosition();
        C349067zX r5 = r1.A00;
        LinearLayoutManager linearLayoutManager = r5.A05;
        View A1D = linearLayoutManager.A1D(layoutPosition);
        if (A1D != null) {
            int[] A09 = r5.A06.A09(A1D, linearLayoutManager);
            r5.A03 = true;
            C349067zX.A01(r5, layoutPosition, true, true);
            r5.A07.A0u(A09[0], A09[1]);
        }
        AnonymousClass0fD.A0C(293295106, A05);
    }
}
