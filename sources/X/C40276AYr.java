package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.AYr  reason: case insensitive filesystem */
public final class C40276AYr implements 1NU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ AnonymousClass8QN A04;
    public final /* synthetic */ C365798nh A05;

    public C40276AYr(RectF rectF, AnonymousClass8QN r2, C365798nh r3, int i, int i2, int i3) {
        this.A04 = r2;
        this.A01 = i;
        this.A05 = r3;
        this.A02 = i2;
        this.A03 = rectF;
        this.A00 = i3;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        Bitmap bitmap;
        Object A07 = ((1GK) obj).A07();
        A07.getClass();
        String obj2 = A07.toString();
        int i = this.A01;
        Bitmap A002 = C347917xa.A00(obj2, i);
        C365798nh r2 = this.A05;
        C352218Cl r0 = r2.A02;
        r0.getClass();
        Bitmap bitmap2 = r0.A0C;
        if (bitmap2 == null) {
            bitmap2 = C347917xa.A00(r0.A06(), i);
        }
        if (!(A002 == null || bitmap2 == null)) {
            int i2 = this.A02;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            RectF rectF = this.A03;
            canvas.drawBitmap(bitmap2, rect, rectF, (Paint) null);
            AnonymousClass8QN r3 = this.A04;
            28D r1 = r3.A0N.A0q;
            if ((r1 == 28D.A2Y || r1 == 28D.A0Z) && (bitmap = r2.A01) != null) {
                Bitmap A003 = 0fO.A00(bitmap, (int) (((float) i2) * 0.67f), (int) (((float) i) * 0.67f), false);
                canvas.drawBitmap(A003, (float) ((i2 - A003.getWidth()) / 2), (float) ((i - A003.getHeight()) / 2), (Paint) null);
            }
            canvas.drawBitmap(A002, new Rect(0, 0, A002.getWidth(), A002.getHeight()), rectF, (Paint) null);
            AnonymousClass8QZ r22 = r3.A0c;
            int i3 = this.A00;
            r22.A0R.AAH(createBitmap, i3);
            r22.A0S.notifyItemChanged(i3);
        }
        return null;
    }
}
