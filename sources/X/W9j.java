package X;

import android.view.View;
import com.instagram.user.model.User;

public final class W9j implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C230062or A01;
    public final /* synthetic */ User A02;

    public W9j(C230062or r1, User user, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-830639424);
        C230062or r5 = this.A01;
        int i = this.A00;
        User user = this.A02;
        String id = user.getId();
        DdQ.A03(r5.A01, r5.A02, id, i);
        r5.A01(user.getId());
        AnonymousClass0fD.A0C(1221995619, A05);
    }
}
