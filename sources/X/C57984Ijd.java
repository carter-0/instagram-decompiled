package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ijd  reason: case insensitive filesystem */
public final class C57984Ijd implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C249693kD A04;
    public final /* synthetic */ C317576nU A05;
    public final /* synthetic */ C317046md A06;

    public C57984Ijd(AnonymousClass0iw r1, UserSession userSession, ImageUrl imageUrl, C255783ui r4, C249693kD r5, C317576nU r6, C317046md r7) {
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = imageUrl;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        C317046md r4;
        int i;
        View view;
        C249693kD r3 = this.A04;
        1Xj BPf = r3.BPf();
        if (BPf == null || !BPf.A6F()) {
            r4 = this.A06;
            i = 8;
            r4.A07.setVisibility(8);
            r4.A05.setVisibility(8);
            view = r4.A02;
        } else {
            r4 = this.A06;
            ImageUrl imageUrl = this.A02;
            AnonymousClass0iw r6 = this.A00;
            View view2 = r4.A03;
            ViewGroup A012 = C3019160o.A01(view2);
            IgImageView igImageView = r4.A07;
            0nA.A0f(igImageView, A012.getWidth());
            0nA.A0V(igImageView, A012.getHeight());
            igImageView.setUrl(imageUrl, r6);
            igImageView.setAlpha(1.0f);
            i = 0;
            igImageView.setVisibility(0);
            C317576nU r8 = this.A05;
            ViewGroup A013 = C3019160o.A01(view2);
            Context context = A013.getContext();
            float A002 = AnonymousClass4EQ.A00(context);
            0qQ.A07(context);
            int A014 = (int) (A002 * ((float) AnonymousClass0nB.A01(context)));
            view = r4.A02;
            0nA.A0f(view, A014);
            View view3 = r4.A05;
            0nA.A0f(view3, A013.getWidth() - A014);
            0nA.A0V(view, A013.getHeight());
            0nA.A0V(view3, A013.getHeight());
            0nA.A0d(view3, A014);
            GestureDetector gestureDetector = new GestureDetector(view2.getContext(), new C380299Xl(1, r8, r4));
            view3.setOnTouchListener(new IDY(1, gestureDetector, r8, r4));
            view.setOnTouchListener(new IDY(2, gestureDetector, r8, r4));
            view3.setVisibility(0);
        }
        view.setVisibility(i);
        UserSession userSession = this.A01;
        C255783ui r62 = this.A03;
        ViewGroup A015 = C3019160o.A01(r4.A03);
        C306406Ma.A04(r4.A04, r62, r3.AcY(userSession), A015.getWidth(), A015.getHeight(), true);
    }
}
