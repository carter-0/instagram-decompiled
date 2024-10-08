package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class U2V extends MetricAffectingSpan implements AnonymousClass6MP, AnonymousClass6MR {
    public static final C17759Vei A07 = new Object();
    public int A00;
    public int A01;
    public C306576Mr A02 = C306576Mr.DISABLED;
    public boolean A03 = true;
    public ArrayList A04;
    public final Context A05;
    public final Drawable A06;

    public U2V(Context context, ArrayList arrayList) {
        this.A05 = context;
        this.A04 = arrayList;
        this.A06 = context.getDrawable(R.drawable.meme_emphasis);
    }

    public final /* synthetic */ void AQG(Canvas canvas) {
    }

    public final void AQO(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(canvas, 1);
        if (this.A03) {
            this.A03 = false;
            Drawable drawable = this.A06;
            if (drawable != null) {
                AnonymousClass7TE.A1R(drawable, this.A00);
            }
            Iterator A1G = AnonymousClass7TE.A1G(this.A04);
            while (A1G.hasNext()) {
                Rect rect = (Rect) AnonymousClass7TF.A0a(A1G);
                canvas.save();
                canvas.rotate(1.0f, rect.exactCenterX(), rect.exactCenterY());
                if (drawable != null) {
                    drawable.setBounds(rect);
                    drawable.draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    public final void Eo9(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void FLc(Layout layout, Integer num, float f, int i, int i2) {
        0qQ.A0B(layout, 0);
        this.A04 = A07.A00(layout, f);
    }

    public final /* synthetic */ boolean onPreDraw() {
        this.A03 = true;
        return true;
    }

    public final void updateDrawState(TextPaint textPaint) {
    }

    public final void updateMeasureState(TextPaint textPaint) {
    }

    public final int BfU() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.WUl, java.lang.Object, X.X6W] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VYq, java.lang.Object] */
    public final X6W By4() {
        int i = this.A00;
        ArrayList arrayList = this.A04;
        C306576Mr r6 = this.A02;
        AnonymousClass7TG.A1Q(arrayList, r6);
        ? obj = new Object();
        obj.A00 = i;
        obj.A02 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            ArrayList arrayList2 = obj.A02;
            if (arrayList2 != null) {
                0qQ.A0B(rect, 1);
                ? obj2 = new Object();
                obj2.A01 = rect.left;
                obj2.A03 = rect.top;
                obj2.A02 = rect.right;
                obj2.A00 = rect.bottom;
                arrayList2.add(obj2);
            }
        }
        obj.A01 = r6;
        return obj;
    }

    public final /* synthetic */ Integer By7() {
        return AnonymousClass05K.A00;
    }

    public final C306576Mr C57() {
        return this.A02;
    }

    public final void ESD(int i, int i2) {
        this.A01 = i;
        if (this.A02 == C306576Mr.INVERTED) {
            i2 = i;
        }
        this.A00 = i2;
    }
}
