package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.common.ui.base.IgButton;

/* renamed from: X.IjP  reason: case insensitive filesystem */
public final class C57970IjP implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ IgButton A03;
    public final /* synthetic */ AnonymousClass6PN A04;

    public C57970IjP(View view, IgButton igButton, AnonymousClass6PN r3, long j, long j2) {
        this.A03 = igButton;
        this.A04 = r3;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = view;
    }

    public final void run() {
        Rect A0W = AnonymousClass7TE.A0W();
        IgButton igButton = this.A03;
        igButton.getHitRect(A0W);
        int i = A0W.left;
        AnonymousClass6PN r3 = this.A04;
        Context A0S = AnonymousClass7TE.A0S(r3.A00());
        float f = (float) ((int) this.A01);
        A0W.left = i - ((int) (AnonymousClass7TF.A0E(A0S).density * f));
        A0W.right += (int) (f * AnonymousClass7TF.A0E(AnonymousClass7TE.A0S(r3.A00())).density);
        int i2 = A0W.bottom;
        Context A0S2 = AnonymousClass7TE.A0S(r3.A00());
        A0W.bottom = i2 + ((int) (((float) ((int) this.A00)) * AnonymousClass7TF.A0E(A0S2).density));
        this.A02.setTouchDelegate(new TouchDelegate(A0W, igButton));
    }
}
