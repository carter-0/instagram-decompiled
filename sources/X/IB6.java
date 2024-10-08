package X;

import android.view.View;
import com.instagram.user.model.User;

public final class IB6 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4H6 A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ User A02;

    public IB6(AnonymousClass4H6 r1, AnonymousClass4DU r2, User user) {
        this.A00 = r1;
        this.A02 = user;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-836605832);
        this.A00.D24(this.A02.getId(), this.A01.getModuleName());
        AnonymousClass0fD.A0C(749367693, A05);
    }
}
