package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FHs  reason: case insensitive filesystem */
public final class C49983FHs implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass325 A00;

    public C49983FHs(AnonymousClass325 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C249713kF r5 = C249713kF.A00;
        AnonymousClass325 r3 = this.A00;
        FragmentActivity requireActivity = r3.A00.requireActivity();
        UserSession userSession = r3.A03;
        String str = userSession.A06;
        String moduleName = r3.A02.getModuleName();
        C309516Yo A0M = DbS.A0M(requireActivity, userSession);
        ((C249723kG) r5).A00.A0T();
        Bundle A09 = DbY.A09(userSession);
        A09.putString("merchant_id", str);
        A09.putString("prior_module_name", moduleName);
        DbX.A18(A09, new C15346Uax(), A0M);
    }
}
