package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.TransparentModalActivity;

public final class FLI implements View.OnClickListener {
    public final /* synthetic */ C66633Ma2 A00;

    public FLI(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2032659671);
        C66633Ma2 ma2 = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("camera_entry_point", 28D.A2J);
        AnonymousClass4DH r2 = ma2.A1J;
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(r2.requireActivity(), A0a, ma2.A0p(), TransparentModalActivity.class, "quick_snap_camera");
        A02.A07();
        DbU.A1K(r2, A02);
        AnonymousClass0fD.A0C(-1144084296, A05);
    }
}
