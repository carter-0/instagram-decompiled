package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FHt  reason: case insensitive filesystem */
public final class C49984FHt implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass325 A00;

    public C49984FHt(AnonymousClass325 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C249713kF r5 = C249713kF.A00;
        AnonymousClass325 r4 = this.A00;
        FragmentActivity requireActivity = r4.A00.requireActivity();
        UserSession userSession = r4.A03;
        r5.A18(requireActivity, userSession, userSession.A06, r4.A02.getModuleName());
    }
}
