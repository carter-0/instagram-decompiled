package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.AqL  reason: case insensitive filesystem */
public final class C41223AqL implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgdsButton A02;
    public final /* synthetic */ AnonymousClass8D7 A03;

    public C41223AqL(Context context, View view, IgdsButton igdsButton, AnonymousClass8D7 r4) {
        this.A02 = igdsButton;
        this.A01 = view;
        this.A00 = context;
        this.A03 = r4;
    }

    public final void run() {
        IgdsButton igdsButton = this.A02;
        View view = this.A01;
        float x = (igdsButton.getX() + ((float) (igdsButton.getWidth() / 2))) / AnonymousClass7TE.A02(view);
        float y = (igdsButton.getY() + ((float) (igdsButton.getHeight() / 2))) / AnonymousClass7TE.A03(view);
        this.A03.A02 = new UNW((Boolean) null, Float.valueOf((AnonymousClass7TE.A03(igdsButton) + (this.A00.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f)) / AnonymousClass7TE.A03(view)), Float.valueOf(x), Float.valueOf(y), Float.valueOf(AnonymousClass7TE.A03(igdsButton) / AnonymousClass7TE.A03(view)), Float.valueOf(AnonymousClass7TE.A02(igdsButton) / AnonymousClass7TE.A02(view)), (Float) null, (String) null, (String) null);
    }
}
