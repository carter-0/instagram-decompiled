package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.UkY  reason: case insensitive filesystem */
public final class C15908UkY extends AnonymousClass5MM {
    public UOC A00;
    public int A01;
    public C306576Mr A02;
    public final int A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Context A07;
    public final Paint A08;
    public final Paint A09;
    public final Rect A0A = new Rect();
    public final TextPaint A0B;
    public final DisplayMetrics A0C;
    public final SparseArray A0D = new SparseArray();
    public final SparseArray A0E = new SparseArray();
    public final C18048VkW A0F = new C18048VkW();

    public C15908UkY(Context context, UOC uoc) {
        int A012;
        int intValue;
        this.A07 = context;
        DisplayMetrics A0E2 = AnonymousClass7TF.A0E(context);
        0qQ.A07(A0E2);
        this.A0C = A0E2;
        this.A03 = (int) (((double) A0E2.widthPixels) * 0.8d);
        float A002 = 0nA.A00(context, 27.0f);
        this.A02 = uoc.A03;
        this.A01 = uoc.A00;
        Integer num = uoc.A05;
        Integer num2 = uoc.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A012 = num.intValue();
        } else {
            A012 = C18789W1r.A01(this.A02, this.A01);
        }
        textPaint.setColor(A012);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A14));
        textPaint.setTextSize(A002);
        this.A0B = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = C18789W1r.A03(this.A02, this.A01)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A08 = paint;
        this.A05 = A002 / 2.1818182f;
        this.A04 = textPaint.measureText(" ") * 0.2f;
        Paint paint2 = new Paint();
        paint2.setColor(textPaint.getColor());
        this.A09 = paint2;
        this.A06 = Color.alpha(textPaint.getColor());
        this.A00 = uoc;
    }

    public final void A08(UOC uoc) {
        0qQ.A0B(uoc, 0);
        if (!0qQ.A0K(this.A00, uoc)) {
            this.A00 = uoc;
            A01();
        }
    }

    public final void A09(C306576Mr r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
        A00();
    }

    public final void draw(Canvas canvas) {
        Layout layout;
        String A0c;
        float f;
        int keyAt;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        canvas2.save();
        AnonymousClass7TG.A0z(canvas2, this);
        C18048VkW vkW = this.A0F;
        VVW A002 = vkW.A00();
        if (A002 != null) {
            int i = A002.A01;
            SparseArray sparseArray = (SparseArray) this.A0E.get(i);
            int size = sparseArray.size();
            int i2 = 0;
            while (i2 < size && i > (keyAt = sparseArray.keyAt(i2))) {
                Layout layout2 = (Layout) sparseArray.get(keyAt);
                canvas2.drawRect(new Rect(AnonymousClass6M0.A00(layout2), layout2.getLineTop(0), AnonymousClass6M0.A01(layout2), layout2.getLineBottom(layout2.getLineCount() - 1)), this.A08);
                layout2.draw(canvas2);
                canvas2.translate(0.0f, (float) layout2.getHeight());
                i2++;
            }
            int max = (int) (((float) Math.max(((C15092UOk) this.A00.A07.get(i)).A06.length() - 1, 0)) * A002.A00);
            SparseArray sparseArray2 = this.A0D;
            0eP r1 = (0eP) sparseArray2.get(i);
            Number number = null;
            if (r1 != null) {
                layout = (Layout) r1.A00;
            } else {
                layout = null;
            }
            0eP r12 = (0eP) sparseArray2.get(i);
            if (r12 != null) {
                number = (Number) r12.A01;
            }
            if (layout != null) {
                CharSequence text = layout.getText();
                0qQ.A07(text);
                int A092 = JTP.A09(number);
                int lineForOffset = layout.getLineForOffset(A092);
                for (int i3 = 0; i3 < lineForOffset; i3++) {
                    String A0c2 = C13988Tno.A0c(text, layout.getLineStart(i3), layout.getLineEnd(i3));
                    Rect rect = this.A0A;
                    float lineBounds = (float) layout.getLineBounds(i3, rect);
                    canvas2.drawRect(rect, this.A08);
                    canvas2.drawText(A0c2, (float) rect.left, lineBounds, this.A0B);
                }
                Rect rect2 = this.A0A;
                float lineBounds2 = (float) layout.getLineBounds(lineForOffset, rect2);
                if (!A002.A02) {
                    A0c = "";
                } else {
                    int lineStart = layout.getLineStart(lineForOffset);
                    int length = text.length();
                    int i4 = new int[]{A092 + max + 2, length}[0];
                    if (length < i4) {
                        i4 = length;
                    }
                    A0c = C13988Tno.A0c(text, lineStart, i4);
                }
                if (A0c.length() > 0) {
                    Rect rect3 = new Rect(rect2);
                    int i5 = rect2.left;
                    TextPaint textPaint = this.A0B;
                    rect3.right = i5 + ((int) textPaint.measureText(A0c));
                    canvas2.drawRect(rect3, this.A08);
                    canvas2.drawText(A0c, (float) rect2.left, lineBounds2, textPaint);
                }
                Paint paint = this.A09;
                float f2 = (float) this.A06;
                float f3 = (float) (vkW.A00 % IgNetworkConsentStorage.MAX_ENTRIES);
                if (f3 < 500.0f) {
                    f = f3 / 500.0f;
                } else {
                    f = (1000.0f - f3) / 500.0f;
                }
                C13988Tno.A0o(f2, f, paint);
                float measureText = ((float) rect2.left) + this.A0B.measureText(A0c) + this.A04;
                float f4 = measureText;
                canvas2.drawRect(f4, (float) rect2.top, measureText + this.A05, lineBounds2 + C51967G9n.A00((float) rect2.bottom, lineBounds2), paint);
            }
        }
        canvas2.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01();
    }

    private final void A00() {
        int i;
        TextPaint textPaint = this.A0B;
        textPaint.setColor(C18789W1r.A01(this.A02, this.A01));
        Paint paint = this.A08;
        Integer A032 = C18789W1r.A03(this.A02, this.A01);
        if (A032 != null) {
            i = A032.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A09.setColor(textPaint.getColor());
        invalidateSelf();
    }

    private final void A01() {
        this.A0F.A02(this.A00.A07);
        SparseArray sparseArray = this.A0E;
        sparseArray.clear();
        SparseArray sparseArray2 = this.A0D;
        sparseArray2.clear();
        int size = this.A00.A07.size();
        int i = (int) ((((float) this.A03) - this.A04) - this.A05);
        int intrinsicHeight = getIntrinsicHeight();
        HashMap hashMap = new HashMap();
        SparseArray sparseArray3 = new SparseArray();
        int i2 = intrinsicHeight;
        int i3 = 0;
        while (i3 < size) {
            StringBuilder sb = new StringBuilder(002.A0C(((C15092UOk) this.A00.A07.get(i3)).A06, ' '));
            int i4 = i3 + 1;
            hashMap.clear();
            C66581MXm.A1S(Integer.valueOf(i3), hashMap, 0);
            boolean z = false;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                String A0C2 = 002.A0C(((C15092UOk) this.A00.A07.get(i4)).A06, ' ');
                TextPaint textPaint = this.A0B;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sb);
                if (textPaint.measureText(AnonymousClass7TF.A0l(A0C2, sb2)) >= ((float) i)) {
                    i4--;
                    break;
                }
                C66581MXm.A1S(Integer.valueOf(i4), hashMap, sb.length() - 1);
                sb.append(A0C2);
                i4++;
                z = true;
            }
            if (z) {
                i3 = i4;
            }
            TextPaint textPaint2 = this.A0B;
            0qQ.A0B(textPaint2, 1);
            StaticLayout A002 = C18381Vqh.A00(C18381Vqh.A00, textPaint2, sb, -1, i);
            int height = A002.getHeight();
            sparseArray3.put(i3, A002);
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                int A0M = AnonymousClass7TE.A0M(A1J.getKey());
                sparseArray2.put(A0M, AnonymousClass7TF.A0x(A002, C66582MXn.A08(A1J)));
                sparseArray.put(A0M, sparseArray3.clone());
            }
            if (height <= i2) {
                i2 -= height;
            } else {
                sparseArray3.clear();
                i2 = intrinsicHeight;
            }
            i3++;
        }
    }

    public final int A04() {
        return this.A01;
    }

    public final UOC A05() {
        return this.A00;
    }

    public final C306576Mr A06() {
        return this.A02;
    }

    public final void A07(int i) {
        this.A01 = i;
        A00();
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final void EXC(int i, int i2) {
        this.A0F.A01(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        TextPaint textPaint = this.A0B;
        return ((int) (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top)) * 7;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        if (this.A02 != C306576Mr.DISABLED) {
            this.A08.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
