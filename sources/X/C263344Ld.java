package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.4Ld  reason: invalid class name and case insensitive filesystem */
public final class C263344Ld implements View.OnClickListener {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ AnonymousClass3W1 A01;
    public final /* synthetic */ C232722uK A02;

    public C263344Ld(FrameLayout frameLayout, AnonymousClass3W1 r2, C232722uK r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = frameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-495543566);
        C232722uK r4 = this.A02;
        r4.A0S(C232722uK.A00(r4), this.A01, -3);
        FrameLayout frameLayout = this.A00;
        Context context = r4.A0H;
        int i = 2131963761;
        if (r4.A0X()) {
            i = 2131963762;
        }
        frameLayout.setContentDescription(context.getString(i));
        AnonymousClass0fD.A0C(-236348929, A05);
    }
}
