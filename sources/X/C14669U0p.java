package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.U0p  reason: case insensitive filesystem */
public final class C14669U0p extends Drawable {
    public float A00;
    public long A01;
    public long A02;
    public String A03 = "";
    public boolean A04;
    public boolean A05;
    public final float A06 = 0.4f;
    public final float A07 = 180.0f;
    public final float A08;
    public final long A09;
    public final Path A0A;
    public final RectF A0B;
    public final C14687U1m A0C;
    public final LinkedList A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        Paint paint;
        0qQ.A0B(canvas, 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.A01;
        if (j == 0) {
            j = uptimeMillis - 16;
            this.A01 = j;
        }
        long j2 = uptimeMillis - j;
        if (j2 > 60) {
            j2 = 60;
        }
        this.A01 = uptimeMillis;
        List<C17878VhV> list = this.A0G;
        ArrayList arrayList = null;
        for (C17878VhV vhV : list) {
            float f = ((float) j2) / 1000.0f;
            C18619VvC vvC = vhV.A03;
            vvC.A01(f);
            C18573VuP vuP = vhV.A04;
            vvC.A02(vuP, f);
            vhV.A00 += j2;
            if (vuP.A06 > ((float) getBounds().bottom) + (((float) vhV.A02.A00) * vuP.A03)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vhV);
            }
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
            this.A0D.addAll(arrayList);
        }
        long j3 = this.A02 - j2;
        this.A02 = j3;
        if (j3 <= 0 && AnonymousClass7TF.A06(this) > 0) {
            this.A02 = (this.A09 * 100) / ((long) AnonymousClass7TF.A06(this));
            C17878VhV vhV2 = (C17878VhV) this.A0D.poll();
            if (vhV2 == null) {
                List list2 = this.A0F;
                2SQ r2 = 2SP.A00;
                C17476VXd vXd = (C17476VXd) 00k.A0G(list2, r2);
                if (vXd.A03 == C16516UwL.Drawable) {
                    paint = new Paint(6);
                    C13988Tno.A0o(this.A06, 255.0f, paint);
                } else {
                    paint = (Paint) 00k.A0G(this.A0E, r2);
                }
                vhV2 = new C17878VhV(paint, vXd, 2SP.A01.A08(1000));
            }
            list.add(vhV2);
            C18573VuP vuP2 = vhV2.A04;
            float f2 = (float) getBounds().left;
            2SP r7 = 2SP.A01;
            vuP2.A05 = C13988Tno.A00((float) getBounds().right, f2, r7.A02());
            vuP2.A06 = ((float) getBounds().top) - (((float) vhV2.A02.A00) * vuP2.A03);
            vuP2.A02 = r7.A02() * 360.0f;
            float A002 = C13988Tno.A00(1.1f, 0.6f, r7.A02());
            vuP2.A03 = A002;
            vuP2.A04 = A002;
            C18619VvC vvC2 = vhV2.A03;
            vvC2.A09 = this.A08;
            float f3 = this.A07;
            vvC2.A04 = C13988Tno.A00(f3, -1.0f * f3, r7.A02());
        }
        if (this.A05) {
            Path path = this.A0A;
            path.rewind();
            RectF rectF = this.A0B;
            float f4 = this.A00;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
            this.A05 = false;
        }
        Path path2 = this.A0A;
        int save = canvas.save();
        canvas.clipPath(path2);
        try {
            for (C17878VhV A003 : list) {
                A003.A00(canvas);
            }
            canvas.restoreToCount(save);
            this.A0C.postDelayed(new C19957WiU(this), 33);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        Path path = this.A0A;
        path.rewind();
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A02 = 0;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C14669U0p(Context context) {
        0sn r2 = 0sn.A00;
        0qQ.A0B(r2, 2);
        ArrayList A012 = C18673VwW.A01(context);
        ArrayList A0r = AnonymousClass7TG.A0r(r2);
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            A0r.add(new C17476VXd(new VR2(C16808V6p.A00(AnonymousClass7TF.A0A(context), (Drawable) it.next(), 1), new int[]{0}), C16516UwL.Drawable));
        }
        this.A0F = 00k.A0S(A0r, A012);
        ArrayList arrayList = new ArrayList();
        this.A0G = arrayList;
        this.A0D = new LinkedList();
        this.A08 = (float) C18092VlM.A01(AnonymousClass7TF.A0A(context), 50.0f);
        this.A09 = AnonymousClass1GB.A02((double) (4000.0f / C13989Tnp.A03(context)));
        this.A0E = C18673VwW.A02((int) (0.4f * 255.0f));
        this.A0H = arrayList;
        this.A0C = new C14687U1m(this);
        this.A0A = new Path();
        this.A0B = new RectF();
    }

    public final void setAlpha(int i) {
        for (Paint A0o : this.A0E) {
            C13988Tno.A0o(this.A06, (float) i, A0o);
        }
    }
}
