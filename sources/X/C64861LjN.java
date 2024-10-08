package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LjN  reason: case insensitive filesystem */
public final class C64861LjN implements C240963Ni {
    public final /* synthetic */ float A00;
    public final /* synthetic */ IgImageView A01;
    public final /* synthetic */ C308596Uw A02;
    public final /* synthetic */ C308606Ux A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void DO4(C240983Nk r14) {
        Integer valueOf;
        int height;
        0qQ.A0B(r14, 0);
        C308606Ux r4 = this.A03;
        Bitmap bitmap = r14.A02;
        0qQ.A0A(bitmap);
        IgImageView igImageView = this.A01;
        if (AnonymousClass7TE.A03(igImageView) / AnonymousClass7TE.A02(igImageView) < JTO.A01(bitmap) / JTO.A02(bitmap)) {
            float A022 = AnonymousClass7TE.A02(igImageView) / JTO.A02(bitmap);
            valueOf = Integer.valueOf(igImageView.getWidth());
            height = (int) (JTO.A01(bitmap) * A022);
        } else {
            valueOf = Integer.valueOf((int) (JTO.A02(bitmap) * (AnonymousClass7TE.A03(igImageView) / JTO.A01(bitmap))));
            height = igImageView.getHeight();
        }
        Integer valueOf2 = Integer.valueOf(height);
        0qQ.A0A(bitmap);
        Bitmap A002 = 0fO.A00(bitmap, valueOf.intValue(), valueOf2.intValue(), false);
        0qQ.A07(A002);
        float f = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A05;
        Bitmap A0B = AnonymousClass7TF.A0B(igImageView.getWidth(), igImageView.getHeight());
        Canvas A0B2 = JTO.A0B(A0B);
        Paint A0C = JTO.A0C();
        A0C.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0C.setShader(new BitmapShader(A002, tileMode, tileMode));
        float f2 = 0.0f;
        if (z) {
            f2 = f;
        }
        if (!z2) {
            f = 0.0f;
        }
        float[] fArr = new float[8];
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f;
        C51975G9x.A1L(fArr, f);
        RectF rectF = new RectF(0.0f, 0.0f, AnonymousClass7TE.A02(igImageView), AnonymousClass7TE.A03(igImageView));
        Path A0C2 = C51965G9l.A0C();
        A0C2.addRoundRect(rectF, fArr, Path.Direction.CW);
        A0B2.drawPath(A0C2, A0C);
        igImageView.setImageBitmap(A0B);
        r4.A02.put(this.A04, A0B);
        this.A02.A01();
    }

    public C64861LjN(IgImageView igImageView, C308596Uw r2, C308606Ux r3, String str, float f, boolean z, boolean z2) {
        this.A03 = r3;
        this.A01 = igImageView;
        this.A00 = f;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str;
        this.A02 = r2;
    }

    public final void DEN() {
        this.A02.A00();
        C14164Tr2.A01("Load Round Image", "Fail}");
    }
}
