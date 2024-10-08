package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ANk  reason: case insensitive filesystem */
public final class C40004ANk implements View.OnClickListener {
    public final /* synthetic */ 2Er A00;
    public final /* synthetic */ C39758A7y A01;

    public C40004ANk(2Er r1, C39758A7y a7y) {
        this.A01 = a7y;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C67101MiL nbt;
        int A05 = AnonymousClass0fD.A05(-1854271828);
        AnonymousClass9H5 r0 = this.A01.A07;
        2Er r1 = this.A00;
        Fragment fragment = r0.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        FragmentActivity requireActivity2 = fragment.requireActivity();
        UserSession userSession = r0.A02;
        if (!C71118OdC.A03(requireActivity2, requireActivity, r0.A01, userSession, (2EM) null, r1.C66(), false)) {
            if (r1.BJz() instanceof DirectThreadKey) {
                FragmentActivity requireActivity3 = fragment.requireActivity();
                AnonymousClass7TG.A1N(requireActivity3, userSession);
                nbt = new C67100MiK(requireActivity3, userSession);
            } else {
                nbt = new C68966Nbt(fragment.requireActivity(), userSession);
            }
            nbt.A03(r1.BJz(), AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A0C(-135752241, A05);
    }
}
