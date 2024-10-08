package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.8xU  reason: invalid class name and case insensitive filesystem */
public final class C371048xU implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass87G A01;
    public final /* synthetic */ AnonymousClass877 A02;
    public final /* synthetic */ C370978xN A03;
    public final /* synthetic */ AnonymousClass8DT A04;

    public C371048xU(AnonymousClass87G r1, AnonymousClass877 r2, C370978xN r3, AnonymousClass8DT r4, int i) {
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1446648964);
        AnonymousClass8DT r2 = this.A04;
        if (0qQ.A0K(r2.A05, "video_call")) {
            UserSession userSession = r2.A03;
            0Tu r22 = 0Tu.A05;
            if (182.A06(r22, userSession, 36317569145378145L) && 182.A06(r22, userSession, 36317569145115999L)) {
                AnonymousClass2S0.A01.A05(5);
            }
        }
        ImageView imageView = this.A03.A06;
        if (imageView != null && imageView.getVisibility() == 0) {
            C294975nL.A05(new View[]{imageView}, true);
        }
        this.A02.DBg(this.A01, this.A00);
        AnonymousClass0fD.A0C(-1255725895, A05);
    }
}
