package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.6M3  reason: invalid class name */
public final class AnonymousClass6M3 {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public long A03 = 2000;
    public Typeface A04;
    public C321166tg A05;
    public Integer A06 = AnonymousClass05K.A01;
    public String A07;
    public boolean A08;
    public final Context A09;
    public final Drawable A0A;

    public AnonymousClass6M3(Context context, Drawable drawable, int i) {
        0qQ.A0B(drawable, 2);
        this.A09 = context;
        this.A0A = drawable;
        this.A04 = AnonymousClass0qo.A00(context).A02(0qm.A13);
        this.A00 = i;
    }

    public final AnonymousClass6M4 A00() {
        Context context = this.A09;
        Resources resources = context.getResources();
        if (this.A00 == -1) {
            this.A00 = AnonymousClass8XF.A01(context) - (resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) * 2);
        }
        if (this.A01 == -1) {
            this.A01 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        }
        if (this.A02 == -1) {
            this.A02 = resources.getDimensionPixelOffset(R.dimen.achievements_only_you_bottom_margin);
        }
        return new AnonymousClass6M4(this);
    }

    public final void A01(int i) {
        this.A07 = this.A09.getString(i);
    }

    public final void A02(int i) {
        this.A01 = this.A09.getResources().getDimensionPixelSize(i);
    }
}
