package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.UEp  reason: case insensitive filesystem */
public final class C14910UEp extends C249703kE implements XC0 {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public ImageUrl A03;
    public AnonymousClass3NL A04;
    public Reel A05;
    public final C338507i4 A06;
    public final AnonymousClass3NM A07;

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A00);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A00);
    }

    public final void CLk() {
        this.A00.setVisibility(4);
    }

    public final void Ev3() {
        this.A00.setVisibility(0);
    }

    public C14910UEp(View view, int i, int i2) {
        super(view);
        this.A02 = DbU.A0G(view, R.id.text_view);
        this.A00 = DbU.A0F(view, R.id.image_view);
        this.A01 = DbU.A0F(view, R.id.loading_spinner);
        Context context = view.getContext();
        C338507i4 r1 = new C338507i4(context);
        this.A06 = r1;
        r1.A00(0nA.A00(context, 2.0f));
        r1.A05(AnonymousClass7TE.A09(context));
        r1.A02(Paint.Cap.ROUND);
        this.A01.setImageDrawable(r1);
        C66580MXl.A1C(view, i);
        C66580MXl.A1B(view, i);
        C66580MXl.A1B(this.A00, i2);
        C66580MXl.A1C(this.A00, i2);
        AnonymousClass3NG r12 = new AnonymousClass3NG(view);
        r12.A02 = 0.85f;
        r12.A07 = true;
        r12.A0C = true;
        r12.A04 = new C64850LjC(this, 0);
        this.A07 = r12.A00();
    }
}
