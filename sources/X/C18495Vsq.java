package X;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.text.Layout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vsq  reason: case insensitive filesystem */
public final class C18495Vsq {
    public final float A00;
    public final float A01;
    public final Paint A02;
    public final List A03;
    public final List A04;
    public final Map A05;

    public C18495Vsq(Layout layout, List list, float f, float f2, float f3, float f4, float f5, int i) {
        0sn<UKQ> arrayList;
        Layout layout2 = layout;
        0qQ.A0B(layout2, 1);
        this.A01 = f;
        this.A00 = f2;
        layout2.getText().toString();
        ArrayList arrayList2 = new ArrayList();
        int lineCount = layout2.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            int lineStart = layout2.getLineStart(i2);
            int lineEnd = layout2.getLineEnd(i2);
            arrayList2.add(new UKR(layout2.getLineLeft(i2), layout2.getLineRight(i2), lineStart, ((float) layout2.getLineTop(i2)) - f3, lineEnd, ((float) layout2.getLineBottom(i2)) + f4));
        }
        float f6 = f5;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            UKR ukr = (UKR) 00k.A0I(arrayList2);
            int size = arrayList2.size();
            for (int i3 = 1; i3 < size; i3++) {
                UKR ukr2 = (UKR) arrayList2.get(i3);
                float f7 = ukr.A01;
                float f8 = ukr2.A01;
                float f9 = ukr.A02;
                float f10 = ukr2.A02;
                if (AnonymousClass7TE.A00(f8, f7) < f5) {
                    f7 = Math.min(ukr.A01, ukr2.A01);
                    f8 = f7;
                }
                if (AnonymousClass7TE.A00(ukr2.A02, ukr.A02) < f5) {
                    f9 = Math.max(ukr.A02, ukr2.A02);
                    f10 = f9;
                }
                int i4 = ukr.A04;
                float f11 = f7;
                arrayList3.add(new UKR(f11, f9, ukr.A05, ukr.A03, i4, ukr.A00));
                int i5 = ukr2.A05;
                int i6 = ukr2.A04;
                ukr = new UKR(f8, f10, i5, ukr2.A03, i6, ukr2.A00);
            }
            arrayList3.add(ukr);
            arrayList2 = arrayList3;
        }
        this.A03 = arrayList2;
        List list2 = list;
        C15048ULb uLb = (C15048ULb) 00k.A0J(list2);
        if (uLb == null) {
            arrayList = 0sn.A00;
        } else {
            arrayList = new ArrayList<>();
            int i7 = uLb.A02;
            int i8 = uLb.A01;
            int i9 = uLb.A03;
            int i10 = uLb.A00;
            int size2 = list2.size();
            for (int i11 = 1; i11 < size2; i11++) {
                C15048ULb uLb2 = (C15048ULb) list2.get(i11);
                if (uLb2.A00 == i10) {
                    i9 += uLb2.A03;
                    i8 = uLb2.A01;
                } else {
                    arrayList.add(new UKQ(i7, i8, layout2.getLineForOffset(i7), i9, i10, 1));
                    i7 = uLb2.A02;
                    i8 = uLb2.A01;
                    i9 = uLb2.A03;
                    i10 = uLb2.A00;
                }
            }
            arrayList.add(new UKQ(i7, i8, layout2.getLineForOffset(i7), i9, i10, 1));
        }
        this.A04 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UKQ ukq : arrayList) {
            C66580MXl.A1T(Integer.valueOf(ukq.A04), linkedHashMap, ukq.A01);
        }
        this.A05 = linkedHashMap;
        Paint paint = new Paint(1);
        this.A02 = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setPathEffect(new CornerPathEffect(f6));
    }

    public static final int A00(Paint paint, C18495Vsq vsq, CharSequence charSequence, int i, int i2) {
        int i3;
        if (charSequence == null) {
            return 0;
        }
        int i4 = i2 + 1;
        int i5 = 0;
        while (i < i4) {
            List list = vsq.A04;
            i5 += ((UKQ) list.get(i)).A05;
            int i6 = i + 1;
            if (i6 < list.size() && ((UKQ) list.get(i6)).A03 == ((UKQ) list.get(i)).A03) {
                if (charSequence.length() <= ((UKQ) list.get(i)).A02 || charSequence.length() <= ((UKQ) list.get(i6)).A04) {
                    i3 = 0;
                } else {
                    i3 = AnonymousClass1GB.A01(paint.measureText(charSequence, ((UKQ) list.get(i)).A02, ((UKQ) list.get(i6)).A04));
                }
                i5 += i3;
            }
            i = i6;
        }
        return i5;
    }
}
