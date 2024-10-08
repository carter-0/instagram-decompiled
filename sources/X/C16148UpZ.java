package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.UpZ  reason: case insensitive filesystem */
public final class C16148UpZ extends C299875vz implements C268714ds {
    public final int A00;
    public final C19470WaI A01;
    public final int A02;
    public final int A03;
    public final C14656U0c A04;
    public final C14303Ttd A05;
    public final C14657U0d A06;
    public final boolean A07;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A06.draw(canvas);
        this.A04.draw(canvas);
        if (this.A07) {
            this.A05.draw(canvas);
        }
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A04, this.A06, this.A05});
    }

    public final C2802350v BzV() {
        return this.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public C16148UpZ(Context context, C19470WaI waI, boolean z, boolean z2) {
        String str;
        this.A01 = waI;
        this.A07 = z;
        this.A00 = context.getResources().getDimensionPixelSize(z2 ? R.dimen.action_bar_plus_shadow_height : R.dimen.avatar_size_ridiculously_xxlarge);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z2 ? R.dimen.add_account_icon_circle_radius : R.dimen.asset_picker_redesign_sticker_height);
        this.A03 = context.getResources().getDimensionPixelSize(z2 ? R.dimen.audition_flow_footer_button_horizontal_padding : R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        this.A02 = AnonymousClass7TG.A03(context);
        C14656U0c u0c = new C14656U0c();
        u0c.setCallback(this);
        this.A04 = u0c;
        C14303Ttd ttd = new C14303Ttd((float) dimensionPixelSize);
        ttd.A00((waI == null || (str = waI.A00.A00) == null) ? "😍" : str);
        ttd.setCallback(this);
        this.A05 = ttd;
        C14657U0d u0d = new C14657U0d(context, z2);
        u0d.setCallback(this);
        this.A06 = u0d;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A00) / 2.0f;
        float f4 = f - f3;
        float f5 = f2 - f3;
        float f6 = f3 + f;
        float f7 = f3 + f2;
        C13988Tno.A0w(this.A04, f4, f5, f6, f7);
        C14303Ttd ttd = this.A05;
        ttd.setBounds((int) (f - (((float) ttd.getIntrinsicWidth()) / 2.0f)), (int) (f2 - (((float) ttd.getIntrinsicHeight()) / 2.0f)), (int) (f + (((float) ttd.getIntrinsicWidth()) / 2.0f)), (int) (f2 + (((float) ttd.getIntrinsicHeight()) / 2.0f)));
        C14657U0d u0d = this.A06;
        float f8 = (float) this.A03;
        float f9 = (float) this.A02;
        u0d.setBounds((int) ((f6 - f8) - f9), (int) ((f7 - f8) - f9), (int) (f6 - f9), (int) (f7 - f9));
    }
}
