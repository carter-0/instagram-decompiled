package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.Ukb  reason: case insensitive filesystem */
public final class C15911Ukb extends AnonymousClass5MM {
    public UOC A00;
    public C306576Mr A01;
    public List A02;
    public int A03;
    public int A04;
    public List A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Paint A09;
    public final TextPaint A0A;
    public final C18048VkW A0B = new C18048VkW();
    public final C18439Vri A0C;
    public final C17339VRs A0D;

    public C15911Ukb(Context context, UOC uoc, C18439Vri vri) {
        int A012;
        int intValue;
        this.A08 = context;
        this.A0C = vri;
        this.A01 = uoc.A03;
        this.A04 = uoc.A00;
        Integer num = uoc.A05;
        Integer num2 = uoc.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A012 = num.intValue();
        } else {
            A012 = C18789W1r.A01(this.A01, this.A04);
        }
        textPaint.setColor(A012);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A0z));
        this.A0A = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = C18789W1r.A03(this.A01, this.A04)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A09 = paint;
        this.A0D = new C17339VRs(textPaint);
        this.A06 = (int) 0nA.A04(context, 340);
        this.A07 = (int) 0nA.A04(context, 300);
        this.A02 = new ArrayList();
        this.A05 = 0sn.A00;
        this.A03 = Color.alpha(textPaint.getColor());
        this.A00 = uoc;
        A01();
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
        this.A01 = r2;
        A03();
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        Canvas canvas2 = canvas;
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TG.A0z(canvas, this);
        VVW A002 = this.A0B.A00();
        if (A002 != null) {
            int i2 = A002.A01;
            List list = this.A02;
            int A1J = 0sr.A1J(Integer.valueOf(i2), list, list.size());
            if (A1J < 0) {
                A1J = ((-A1J) - 1) - 1;
            }
            Number number = (Number) 00k.A0O(this.A02, A1J + 1);
            if (number != null) {
                i = number.intValue();
            } else {
                i = this.A00.A07.size();
            }
            for (int A0I = C51971G9r.A0I(this.A02, A1J); A0I < i; A0I++) {
                if (A0I != i2) {
                    if (A0I > i2) {
                        break;
                    }
                    f = 1.0f;
                } else {
                    f = A002.A00;
                    if (f == 0.0f) {
                        break;
                    }
                }
                if (this.A01 != C306576Mr.DISABLED) {
                    C17906Vhx vhx = (C17906Vhx) this.A05.get(A0I);
                    Paint paint = this.A09;
                    0qQ.A0B(paint, 1);
                    paint.setAlpha((int) (((float) this.A03) * f));
                    canvas.save();
                    canvas.translate(vhx.A04, vhx.A05);
                    float f2 = vhx.A03;
                    canvas2.drawRect(0.0f, -f2, vhx.A02, vhx.A00 + f2, paint);
                    canvas.restore();
                }
                C17906Vhx vhx2 = (C17906Vhx) this.A05.get(A0I);
                TextPaint textPaint = this.A0A;
                0qQ.A0B(textPaint, 1);
                textPaint.setAlpha((int) (((float) this.A03) * f));
                textPaint.setTextSize(vhx2.A01);
                canvas.save();
                canvas.translate(vhx2.A04, vhx2.A05);
                canvas.drawText(vhx2.A06, 0.0f, vhx2.A00, textPaint);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A02();
    }

    private final void A01() {
        this.A0B.A02(this.A00.A07);
        this.A02 = new C17854Vh7(this.A0C, this.A00.A07).A00();
        A02();
    }

    private final void A02() {
        int size;
        0sn arrayList;
        String str;
        float A062 = (float) AnonymousClass7TF.A06(this);
        2HY A1R = 0sr.A1R(this.A02);
        ArrayList A0p = AnonymousClass7TF.A0p(A1R);
        0sh it = A1R.iterator();
        while (it.hasNext()) {
            int A002 = it.A00();
            int A0I = C51971G9r.A0I(this.A02, A002);
            Number number = (Number) 00k.A0O(this.A02, A002 + 1);
            if (number != null) {
                size = number.intValue();
            } else {
                size = this.A00.A07.size();
            }
            Context context = this.A08;
            C17339VRs vRs = this.A0D;
            List<C15092UOk> subList = this.A00.A07.subList(A0I, size);
            ArrayList A0p2 = AnonymousClass7TF.A0p(subList);
            for (C15092UOk uOk : subList) {
                String str2 = uOk.A06;
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                A0p2.add(Pxf.A0n(locale, str2));
            }
            AnonymousClass7TF.A1B(context, 0, vRs);
            float[] fArr = C17142VJr.A00;
            ArrayList arrayList2 = new ArrayList(5);
            int i = 0;
            do {
                float A032 = 0nA.A03(context, fArr[i]);
                TextPaint textPaint = vRs.A01;
                float textSize = textPaint.getTextSize();
                textPaint.setTextSize(A032);
                Rect rect = vRs.A00;
                textPaint.getTextBounds("A", 0, 1, rect);
                textPaint.setTextSize(textSize);
                arrayList2.add(new C17338VRr(A032, (float) rect.height()));
                i++;
            } while (i < 5);
            float A042 = 0nA.A04(context, 20);
            Random random = new Random((long) A0p2.hashCode());
            if (!A0p2.isEmpty()) {
                arrayList = new ArrayList();
                for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                    arrayList.clear();
                    float f = A042 / 2.0f;
                    float f2 = f;
                    String str3 = (String) 00k.A0I(A0p2);
                    int nextInt = 4 - random.nextInt(3);
                    while (true) {
                        if (nextInt > 0) {
                            if (A00(vRs, str3, arrayList2, nextInt) <= A062) {
                                break;
                            }
                            nextInt--;
                        } else {
                            nextInt = 0;
                            break;
                        }
                    }
                    Iterator it2 = A0p2.iterator();
                    int i2 = 0;
                    float f3 = 0.0f;
                    while (it2.hasNext()) {
                        i2++;
                        String str4 = (String) it2.next();
                        if (f3 == 0.0f && nextInt == 0) {
                            float A003 = A00(vRs, str4, arrayList2, nextInt);
                            if (A003 > A062) {
                                float f4 = A062 / A003;
                                arrayList.add(new C17906Vhx(str4, f4 * ((C17338VRr) arrayList2.get(0)).A01, f4 * ((C17338VRr) arrayList2.get(0)).A00, A062, f2, 0.0f, f));
                                f3 = A062;
                            }
                        }
                        if (f3 != 0.0f && f3 + A00(vRs, str4, arrayList2, nextInt) > A062) {
                            f += ((C17338VRr) arrayList2.get(nextInt)).A00 + f2;
                            int nextInt2 = random.nextInt(size2 + 1);
                            while (true) {
                                if (nextInt2 > 0) {
                                    if (nextInt2 != nextInt && A00(vRs, str4, arrayList2, nextInt2) <= A062) {
                                        break;
                                    }
                                    nextInt2--;
                                } else {
                                    nextInt2 = 0;
                                    break;
                                }
                            }
                            nextInt = nextInt2;
                            f3 = 0.0f;
                        }
                        if (str4.length() == 1 && f3 == 0.0f && (str = (String) 00k.A0O(A0p2, i2)) != null) {
                            String A10 = C66580MXl.A10(str4, str);
                            int nextInt3 = random.nextInt(size2 + 1);
                            while (true) {
                                if (nextInt3 > 0) {
                                    if (nextInt3 != nextInt && A00(vRs, A10, arrayList2, nextInt3) <= A062) {
                                        break;
                                    }
                                    nextInt3--;
                                } else {
                                    nextInt3 = 0;
                                    break;
                                }
                            }
                            nextInt = nextInt3;
                        }
                        arrayList.add(new C17906Vhx(str4, ((C17338VRr) arrayList2.get(nextInt)).A01, ((C17338VRr) arrayList2.get(nextInt)).A00, A00(vRs, 002.A0C(str4, ' '), arrayList2, nextInt), f2, f3, f));
                        f3 += A00(vRs, 002.A0C(str4, ' '), arrayList2, nextInt);
                    }
                    float f5 = f + ((C17338VRr) arrayList2.get(nextInt)).A00;
                    if (size2 == 0 || f5 <= A062) {
                        break;
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            A0p.add(arrayList);
        }
        this.A05 = 0Yv.A1F(A0p);
        invalidateSelf();
    }

    private final void A03() {
        int i;
        TextPaint textPaint = this.A0A;
        textPaint.setColor(C18789W1r.A01(this.A01, this.A04));
        Paint paint = this.A09;
        Integer A032 = C18789W1r.A03(this.A01, this.A04);
        if (A032 != null) {
            i = A032.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A03 = Color.alpha(textPaint.getColor());
        invalidateSelf();
    }

    public final int A04() {
        return this.A04;
    }

    public final UOC A05() {
        return this.A00;
    }

    public final C306576Mr A06() {
        return this.A01;
    }

    public final void A07(int i) {
        this.A04 = i;
        A03();
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return this.A00;
    }

    public final void EXC(int i, int i2) {
        this.A0B.A01(i);
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setAlpha(int i) {
        this.A03 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static float A00(C17339VRs vRs, String str, AbstractList abstractList, int i) {
        float f = ((C17338VRr) abstractList.get(i)).A01;
        TextPaint textPaint = vRs.A01;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(textSize);
        return measureText;
    }
}
