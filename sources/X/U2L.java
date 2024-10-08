package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.style.DynamicDrawableSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class U2L extends DynamicDrawableSpan {
    public float A00;
    public final Bitmap A01;
    public final List A02 = new ArrayList();
    public final int A03;
    public final C17820VgZ A04;

    public U2L(Layout layout, C17820VgZ vgZ, CharSequence charSequence, float f, int i) {
        AnonymousClass7TF.A1D(layout, 1, vgZ);
        this.A03 = i;
        this.A04 = vgZ;
        this.A00 = f;
        StaticLayout staticLayout = new StaticLayout(charSequence, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_NORMAL, layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, (int) staticLayout.getLineWidth(0)), Math.max(1, staticLayout.getHeight()), Bitmap.Config.ARGB_8888);
        staticLayout.draw(new Canvas(createBitmap));
        this.A01 = createBitmap;
    }

    public final Drawable getDrawable() {
        return null;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        LinkedHashMap linkedHashMap;
        Path path;
        UKQ ukq;
        UKQ ukq2;
        UKQ ukq3;
        int i6;
        RectF rectF;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        AnonymousClass7TF.A1F(canvas2, 0, paint2);
        for (C18495Vsq vsq : this.A02) {
            float f2 = this.A00;
            C17820VgZ vgZ = this.A04;
            0qQ.A0B(vgZ, 10);
            Map map = vsq.A05;
            Map map2 = map;
            Number number = (Number) C51968G9o.A10(map, i);
            if (number != null) {
                int intValue = number.intValue();
                UL3 A002 = vgZ.A00(intValue);
                if (A002 == null) {
                    A002 = new UL3((C54026GyB) null, (C54025GyA) null);
                }
                UL3 A003 = vgZ.A00(intValue - 1);
                if (A003 == null) {
                    A003 = new UL3((C54026GyB) null, (C54025GyA) null);
                }
                if (intValue <= 0 || !A002.A00(A003, f2)) {
                    while (number.intValue() < map2.size() - 1) {
                        UL3 A004 = vgZ.A00(number.intValue() + 1);
                        if (A004 == null) {
                            A004 = new UL3((C54026GyB) null, (C54025GyA) null);
                        }
                        if (!A002.A00(A004, f2)) {
                            break;
                        }
                        number = Integer.valueOf(number.intValue() + 1);
                    }
                    int intValue2 = number.intValue();
                    List list = vsq.A04;
                    if (intValue == intValue2) {
                        List A1I = AnonymousClass7TE.A1I(list.get(intValue));
                        linkedHashMap = new LinkedHashMap();
                        for (Object next : A1I) {
                            ((List) JTS.A0h(Integer.valueOf(((UKQ) next).A03), linkedHashMap)).add(next);
                        }
                    } else {
                        List subList = list.subList(intValue, intValue2 + 1);
                        linkedHashMap = new LinkedHashMap();
                        for (Object next2 : subList) {
                            ((List) JTS.A0h(Integer.valueOf(((UKQ) next2).A03), linkedHashMap)).add(next2);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = 00k.A0Z(linkedHashMap.keySet()).iterator();
                    while (it.hasNext()) {
                        int A0F = AnonymousClass7TG.A0F(it);
                        0sn r1 = (List) C51968G9o.A0z(linkedHashMap, A0F);
                        if (r1 == null) {
                            r1 = 0sn.A00;
                        }
                        UKR ukr = (UKR) 00k.A0O(vsq.A03, A0F);
                        if (ukr != null) {
                            int i7 = ukr.A05;
                            Number number2 = (Number) C51968G9o.A10(map2, i7);
                            if (!(number2 == null || (ukq = (UKQ) list.get(number2.intValue())) == null || (ukq2 = (UKQ) 00k.A0J(r1)) == null || (ukq3 = (UKQ) 00k.A0L(r1)) == null)) {
                                int i8 = ukq2.A04;
                                int i9 = i8;
                                if (i8 != i7 || C13988Tno.A06(ukq3.A02, ukr.A04) > 1) {
                                    CharSequence charSequence2 = charSequence;
                                    if (i7 < i9) {
                                        i6 = C18495Vsq.A00(paint2, vsq, charSequence2, ukq.A01, ukq2.A01 - 1);
                                    } else {
                                        i6 = 0;
                                    }
                                    float f3 = ukr.A01 + ((float) i6);
                                    rectF = new RectF(f3 - vsq.A01, ukr.A03, ((float) C18495Vsq.A00(paint2, vsq, charSequence2, ukq2.A01, ukq3.A01)) + f3 + vsq.A00, ukr.A00);
                                } else {
                                    rectF = new RectF(ukr.A01 - vsq.A01, ukr.A03, ukr.A02 + vsq.A00, ukr.A00);
                                }
                                arrayList.add(rectF);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        path = new Path();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            RectF rectF2 = (RectF) it2.next();
                            C13988Tno.A1T(arrayList2, rectF2.right, rectF2.top);
                            C13988Tno.A1T(arrayList2, rectF2.right, rectF2.bottom);
                            C13988Tno.A1T(arrayList3, rectF2.left, rectF2.top);
                            C13988Tno.A1T(arrayList3, rectF2.left, rectF2.bottom);
                        }
                        path = new Path();
                        path.moveTo(((PointF) arrayList3.get(0)).x, ((PointF) arrayList3.get(0)).y);
                        int size = arrayList3.size();
                        for (int i10 = 1; i10 < size; i10++) {
                            path.lineTo(((PointF) arrayList3.get(i10)).x, ((PointF) arrayList3.get(i10)).y);
                        }
                        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                            path.lineTo(((PointF) arrayList2.get(size2)).x, ((PointF) arrayList2.get(size2)).y);
                        }
                        path.close();
                    }
                    UL3 A005 = vgZ.A00(intValue);
                    if (A005 != null) {
                        canvas2.save();
                        C54025GyA gyA = A005.A01;
                        if (gyA != null) {
                            PointF A006 = gyA.A00(f2);
                            canvas2.translate(A006.x, A006.y);
                        }
                        C54026GyB gyB = A005.A00;
                        if (gyB != null) {
                            vsq.A02.setAlpha(AnonymousClass7TE.A06(gyB.A00(f2), 255.0f));
                        }
                        canvas2.drawPath(path, vsq.A02);
                        canvas2.restore();
                    } else {
                        canvas2.drawPath(path, vsq.A02);
                    }
                }
            }
        }
        UL3 A007 = this.A04.A00(this.A03);
        float f4 = f;
        int i11 = i3;
        if (A007 != null) {
            canvas2.save();
            C54025GyA gyA2 = A007.A01;
            if (gyA2 != null) {
                PointF A008 = gyA2.A00(this.A00);
                canvas2.translate(A008.x, A008.y);
            }
            C54026GyB gyB2 = A007.A00;
            if (gyB2 != null) {
                paint2.setAlpha(AnonymousClass7TE.A06(Float.valueOf(gyB2.A00(this.A00)).floatValue(), 255.0f));
            }
            canvas2.drawBitmap(this.A01, f4, (float) i11, paint2);
            canvas2.restore();
            paint2.setAlpha(255);
            return;
        }
        canvas2.drawBitmap(this.A01, f4, (float) i11, paint2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.A01.getWidth();
    }
}
