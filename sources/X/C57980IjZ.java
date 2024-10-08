package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.IjZ  reason: case insensitive filesystem */
public final class C57980IjZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C307236Pi A04;
    public final /* synthetic */ 0rh A05;

    public C57980IjZ(Context context, C307236Pi r2, 0rh r3, float f, float f2, float f3) {
        this.A01 = f;
        this.A04 = r2;
        this.A03 = context;
        this.A00 = f2;
        this.A02 = f3;
        this.A05 = r3;
    }

    public final void run() {
        float f = this.A01;
        C252063oV r4 = this.A04.A02.A02;
        float A022 = f - (AnonymousClass7TE.A02(r4.getView()) * 0.5f);
        Context context = this.A03;
        C306406Ma.A02(r4.getView(), A022, (this.A02 + this.A05.A00) - (((float) (context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material) + AnonymousClass7TH.A01(context))) * this.A00), false);
    }
}
