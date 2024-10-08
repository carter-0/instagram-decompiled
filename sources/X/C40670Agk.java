package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Agk  reason: case insensitive filesystem */
public final class C40670Agk implements B2J {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C352188Cb A03;
    public final /* synthetic */ AnonymousClass82f A04;
    public final /* synthetic */ InteractiveDrawableContainer A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;

    public C40670Agk(Context context, View view, UserSession userSession, C352188Cb r4, AnonymousClass82f r5, InteractiveDrawableContainer interactiveDrawableContainer, C62320sa r7, 0sP r8) {
        this.A00 = context;
        this.A04 = r5;
        this.A02 = userSession;
        this.A01 = view;
        this.A06 = r7;
        this.A05 = interactiveDrawableContainer;
        this.A03 = r4;
        this.A07 = r8;
    }

    public final void DH7(boolean z) {
        C294975nL A0C;
        Context context = this.A00;
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_media_background);
        int color = context.getColor(R.color.fds_transparent);
        AnonymousClass82f r0 = this.A04;
        UserSession userSession = this.A02;
        if (z) {
            r0.A04 = true;
            r0.A08.A0B(true);
            1Av A002 = 1Au.A00(userSession);
            A002.A69.Epx(A002, true, 1Av.A8a[485]);
            C294975nL A012 = C294975nL.A01(this.A01, 1);
            A012.A0G();
            A012.A01 = color;
            A012.A02 = A032;
            A012.A0A = true;
            A0C = A012.A0C(200);
            A0C.A05 = new IZR(A032, 0, this.A07);
        } else {
            r0.A04 = false;
            r0.A08.A0B(false);
            1Av A003 = 1Au.A00(userSession);
            A003.A69.Epx(A003, false, 1Av.A8a[485]);
            this.A06.invoke();
            C294975nL A013 = C294975nL.A01(this.A01, 1);
            A013.A0G();
            A013.A01 = A032;
            A013.A02 = color;
            A013.A0A = true;
            A0C = A013.A0C(200);
        }
        A0C.A0H();
        InteractiveDrawableContainer interactiveDrawableContainer = this.A05;
        interactiveDrawableContainer.setHapticFeedbackEnabled(true);
        interactiveDrawableContainer.performHapticFeedback(1);
        this.A03.A01.setVisibility(8);
    }

    public final void Dgr(float f) {
        int i = (f > 0.8f ? 1 : (f == 0.8f ? 0 : -1));
        C352188Cb r0 = this.A03;
        int i2 = 8;
        if (i >= 0) {
            i2 = 0;
        }
        r0.A01.setVisibility(i2);
    }
}
