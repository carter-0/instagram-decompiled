package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WBv  reason: case insensitive filesystem */
public final class C18902WBv implements View.OnTouchListener {
    public final AnonymousClass4JZ A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C56008HrG A02;
    public final /* synthetic */ VZU A03;
    public final /* synthetic */ AnonymousClass4JX A04;
    public final /* synthetic */ AnonymousClass3W1 A05;

    public C18902WBv(1Xj r8, C56008HrG hrG, VZU vzu, AnonymousClass4JX r11, AnonymousClass3W1 r12) {
        this.A03 = vzu;
        this.A04 = r11;
        this.A02 = hrG;
        this.A01 = r8;
        this.A05 = r12;
        Context context = vzu.A01;
        this.A00 = new AnonymousClass4JZ(context, r8, r11, hrG.A09, r12, 0);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.DF8(motionEvent);
    }
}
