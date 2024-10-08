package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

public final class IE1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C255773uh A05;
    public final /* synthetic */ C255783ui A06;
    public final /* synthetic */ C309426Yf A07;
    public final /* synthetic */ C309686Zf A08;
    public final /* synthetic */ HDT A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public IE1(View view, UserSession userSession, C255773uh r3, C255783ui r4, C309426Yf r5, C309686Zf r6, HDT hdt, String str, String str2, String str3, int i, int i2, int i3) {
        this.A03 = view;
        this.A06 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A08 = r6;
        this.A09 = hdt;
        this.A04 = userSession;
        this.A05 = r3;
        this.A07 = r5;
        this.A02 = i3;
    }

    public final void onGlobalLayout() {
        View view = this.A03;
        C51971G9r.A0z(view, this);
        C255783ui r5 = this.A06;
        r5.A11 = AnonymousClass3WT.CTA;
        r5.A02 = AnonymousClass7TE.A02(view) / ((float) this.A00);
        r5.A00 = AnonymousClass7TE.A03(view) / ((float) this.A01);
        r5.A1R = this.A0A;
        r5.A1f = this.A0B;
        r5.A1N = this.A0C;
        C255773uh r4 = this.A05;
        C309426Yf r6 = this.A07;
        UserSession userSession = this.A04;
        HDT hdt = this.A09;
        C309686Zf r7 = this.A08;
        C57315IWy iWy = new C57315IWy(view, userSession, r4, r5, r6, r7, hdt, this.A02);
        view.setOnTouchListener(new C54038GyN(userSession, r7, iWy, AnonymousClass7TE.A1I(hdt), false));
    }
}
