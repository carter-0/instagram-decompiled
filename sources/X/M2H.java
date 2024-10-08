package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.creation.capture.ShutterButton;

public final /* synthetic */ class M2H implements Runnable {
    public final /* synthetic */ C59867Jal A00;

    public /* synthetic */ M2H(C59867Jal jal) {
        this.A00 = jal;
    }

    public final void run() {
        C59867Jal jal = this.A00;
        ShutterButton shutterButton = jal.A0d;
        if (shutterButton.isAttachedToWindow()) {
            Context context = jal.getContext();
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f((Activity) context, context.getString(2131976504));
            A0f.A03(shutterButton);
            A0f.A02();
            A0f.A07(C283255Gu.A06);
            AnonymousClass5Gv A002 = A0f.A00();
            jal.A07 = A002;
            A002.A07(jal.A0a);
        }
    }
}
