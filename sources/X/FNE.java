package X;

import android.view.View;
import com.instagram.user.model.User;

public final class FNE implements View.OnClickListener {
    public final /* synthetic */ FAY A00;
    public final /* synthetic */ User A01;

    public FNE(FAY fay, User user) {
        this.A00 = fay;
        this.A01 = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1279296900);
        C49350EuE euE = this.A00.A05;
        String id = this.A01.getId();
        C2365134a r1 = euE.A00;
        C2365134a.A03(r1, id, r1.getModuleName());
        AnonymousClass0fD.A0C(-213083956, A05);
    }
}
