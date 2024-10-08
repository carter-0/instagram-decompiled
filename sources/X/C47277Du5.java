package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Du5  reason: case insensitive filesystem */
public final class C47277Du5 extends C232922uf {
    public final /* synthetic */ C49686F1w A00;

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        float max = (float) Math.max(0.0d, r5.A09.A00);
        View view = this.A00.A00;
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        view.setScaleX(max);
        view.setScaleY(max);
    }

    public C47277Du5(C49686F1w f1w) {
        this.A00 = f1w;
    }

    public final void DmC(2cs r4) {
        this.A00.A00.setTag(R.id.view_bouncer, (Object) null);
    }
}
