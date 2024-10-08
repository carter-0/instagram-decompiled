package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aqa  reason: case insensitive filesystem */
public final class C41238Aqa implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;
    public final /* synthetic */ C317066mf A04;

    public C41238Aqa(ViewGroup viewGroup, UserSession userSession, C255783ui r3, C249693kD r4, C317066mf r5) {
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = viewGroup;
        this.A03 = r4;
        this.A01 = userSession;
    }

    public final void run() {
        View view = this.A04.A00;
        C255783ui r3 = this.A02;
        ViewGroup viewGroup = this.A00;
        C306406Ma.A04(view, r3, this.A03.AcY(this.A01), viewGroup.getWidth(), viewGroup.getHeight(), true);
    }
}
