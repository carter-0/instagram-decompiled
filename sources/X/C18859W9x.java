package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.W9x  reason: case insensitive filesystem */
public final class C18859W9x implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C230062or A01;
    public final /* synthetic */ C17627VbJ A02;
    public final /* synthetic */ User A03;

    public C18859W9x(C230062or r1, C17627VbJ vbJ, User user, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A03 = user;
        this.A02 = vbJ;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1251877134);
        C230062or r6 = this.A01;
        int i = this.A00;
        User user = this.A03;
        String id = user.getId();
        DdQ.A00(r6.A01, r6.A02, id, i);
        AnonymousClass7TE.A1Z(new MH0((Object) user, (Object) r6, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(r6.A00));
        C17627VbJ vbJ = this.A02;
        vbJ.A01.setVisibility(8);
        vbJ.A06.setVisibility(0);
        AnonymousClass0fD.A0C(-1660211056, A05);
    }
}
