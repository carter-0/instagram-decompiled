package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Ap8  reason: case insensitive filesystem */
public final /* synthetic */ class C41148Ap8 implements Runnable {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C3497781s A02;

    public /* synthetic */ C41148Ap8(Resources resources, View view, C3497781s r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = resources;
    }

    public final void run() {
        C3497781s r2 = this.A02;
        View view = this.A01;
        Resources resources = this.A00;
        int i = -((view.getMeasuredHeight() / 2) + AnonymousClass7TE.A0D(resources));
        AnonymousClass5Gt r22 = new AnonymousClass5Gt(r2.A0H, new PI1(resources.getString(2131955429), resources.getString(2131955430)));
        r22.A04(view, 0, i, true);
        r22.A02();
        r22.A01 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        r22.A00().A06();
    }
}
