package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.IiZ  reason: case insensitive filesystem */
public final class C57918IiZ implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C316886mN A01;
    public final /* synthetic */ boolean A02;

    public C57918IiZ(ViewGroup viewGroup, C316886mN r2, boolean z) {
        this.A01 = r2;
        this.A00 = viewGroup;
        this.A02 = z;
    }

    public final void run() {
        C252063oV r6 = this.A01.A00;
        View view = r6.getView();
        ViewGroup viewGroup = this.A00;
        float A022 = (AnonymousClass7TE.A02(viewGroup) / 2.0f) - (AnonymousClass7TE.A02(r6.getView()) / 2.0f);
        int height = viewGroup.getHeight() - r6.getView().getHeight();
        Resources A05 = DbU.A05(viewGroup);
        boolean z = this.A02;
        int i = R.dimen.container_height;
        if (z) {
            i = R.dimen.abc_dialog_padding_material;
        }
        C306406Ma.A02(view, A022, (float) (height - A05.getDimensionPixelSize(i)), true);
    }
}
