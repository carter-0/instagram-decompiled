package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fvt  reason: case insensitive filesystem */
public final class C51547Fvt implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C226262fy A03;
    public final /* synthetic */ 1Av A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public C51547Fvt(Activity activity, View view, UserSession userSession, C226262fy r4, 1Av r5, Integer num, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A06 = str;
        this.A03 = r4;
        this.A02 = userSession;
        this.A05 = num;
        this.A04 = r5;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A06);
            A0f.A03(view);
            A0f.A06(this.A03);
            A0f.A07(C283255Gu.A07);
            A0f.A0B = false;
            A0f.A0A = true;
            A0f.A04 = new C47897ELr(0, this.A05, this.A04);
            A0f.A00().A07(this.A02);
        }
    }
}
