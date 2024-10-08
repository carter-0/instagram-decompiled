package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FvH  reason: case insensitive filesystem */
public final class C51509FvH implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C234222xL A02;
    public final /* synthetic */ String A03;

    public C51509FvH(Activity activity, View view, C234222xL r3, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = str;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A03);
            A0f.A03(view);
            A0f.A02();
            A0f.A07(C283255Gu.A06);
            A0f.A0B = false;
            A0f.A04 = this.A02;
            DbU.A1T(A0f);
        }
    }
}
