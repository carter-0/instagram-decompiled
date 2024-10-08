package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.FuH  reason: case insensitive filesystem */
public final /* synthetic */ class C51447FuH implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ DirectShareSheetFragment A01;
    public final /* synthetic */ C48241EbM A02;

    public /* synthetic */ C51447FuH(View view, DirectShareSheetFragment directShareSheetFragment, C48241EbM ebM) {
        this.A01 = directShareSheetFragment;
        this.A02 = ebM;
        this.A00 = view;
    }

    public final void run() {
        DirectShareSheetFragment directShareSheetFragment = this.A01;
        C48241EbM ebM = this.A02;
        View view = this.A00;
        FragmentActivity activity = directShareSheetFragment.getActivity();
        if (activity != null) {
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, ebM.A00);
            A0e.A03(view);
            A0e.A06(ebM.A01);
            A0e.A07(C283255Gu.A07);
            A0e.A0B = ebM.A03;
            A0e.A0A = true;
            DbU.A1T(A0e);
        }
    }
}
