package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VtG  reason: case insensitive filesystem */
public final class C18517VtG {
    public TextPaint A00;
    public VWZ A01;
    public C17447VWa A02;
    public List A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final List A09;
    public final List A0A;
    public final List A0B;

    public C18517VtG(Context context, SizeChart sizeChart) {
        Context context2 = context;
        this.A08 = context2;
        this.A07 = AnonymousClass7TG.A02(context2);
        this.A06 = context2.getResources().getDimensionPixelSize(R.dimen.auth_credential_title_text_size);
        this.A05 = AnonymousClass7TG.A02(context2);
        this.A04 = DbY.A01(context2);
        SizeChart sizeChart2 = sizeChart;
        this.A09 = C51966G9m.A1J(sizeChart2.A01);
        ArrayList arrayList = new ArrayList();
        Iterator A0o = DbY.A0o(sizeChart2.A02);
        while (A0o.hasNext()) {
            arrayList.add(((SizeChartRow) A0o.next()).A00);
        }
        this.A0B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        String str = sizeChart2.A00;
        Iterator A0o2 = DbY.A0o(sizeChart2.A02);
        while (A0o2.hasNext()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator A0o3 = DbY.A0o(((SizeChartRow) A0o2.next()).A01);
            while (A0o3.hasNext()) {
                SizeChartMeasurement sizeChartMeasurement = (SizeChartMeasurement) A0o3.next();
                String str2 = sizeChartMeasurement.A03;
                if (str2 == null) {
                    Integer num = sizeChartMeasurement.A01;
                    Integer num2 = sizeChartMeasurement.A00;
                    StringBuilder sb = new StringBuilder();
                    if (num == null) {
                        sb.append(num2);
                    } else if (num2 != null) {
                        sb.append(0mp.A06("%d - %d", new Object[]{num, num2}));
                    } else {
                        sb.append(num);
                    }
                    if (str != null) {
                        sb.append(" ");
                        sb.append(str);
                    }
                    str2 = sb.toString();
                }
                arrayList3.add(str2);
            }
            arrayList2.add(arrayList3);
        }
        this.A0A = arrayList2;
        TextPaint textPaint = new TextPaint();
        this.A00 = textPaint;
        C13988Tno.A0t(context2.getResources(), textPaint, R.dimen.abc_text_size_menu_header_material);
        AnonymousClass7TE.A1N(context2, this.A00, 2Yu.A07(context2));
        this.A00.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Context context3 = this.A08;
        int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.avatar_upsell_sheet_image_height);
        int A022 = AnonymousClass7TG.A02(context3);
        TextPaint textPaint2 = this.A00;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        0rN r12 = new 0rN(alignment, textPaint2, (String) null, 0.0f, 1.0f, dimensionPixelSize, false);
        List list = this.A0B;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            StaticLayout A002 = r12.A00(AnonymousClass7TE.A18(it));
            for (int i2 = 0; i2 < A002.getLineCount(); i2++) {
                i = Math.max(i, (int) A002.getLineWidth(i2));
            }
        }
        int i3 = i + (A022 * 2);
        int A092 = ((0nA.A09(context3) - i3) - (this.A05 * 2)) - 1;
        List list2 = this.A09;
        int size = list2.size();
        loop5:
        while (true) {
            if (size < 2) {
                size = Math.min(list2.size(), 2);
                break;
            }
            int i4 = size - 1;
            0rN r122 = new 0rN(alignment, this.A00, (String) null, 0.0f, 1.0f, (A092 - (this.A04 * i4)) / size, false);
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!A00(r122, AnonymousClass7TE.A18(it2))) {
                        break;
                    }
                } else {
                    int i5 = 0;
                    while (i5 < list.size() * list2.size()) {
                        if (A00(r122, (String) C13991Tnr.A0Z(this.A0A, i5 / list2.size(), i5 % list2.size()))) {
                            i5++;
                        }
                    }
                    break loop5;
                }
            }
            size = i4;
        }
        int i6 = (A092 - ((size - 1) * this.A04)) / size;
        TextPaint textPaint3 = this.A00;
        0rN r123 = new 0rN(alignment, textPaint3, (String) null, 0.0f, 1.0f, i3, false);
        0rN r20 = new 0rN(alignment, textPaint3, (String) null, 0.0f, 1.0f, i6, false);
        C17447VWa[] vWaArr = new C17447VWa[list.size()];
        Arrays.fill(vWaArr, new C17447VWa(this, 1));
        for (int i7 = 0; i7 < list.size(); i7++) {
            for (int i8 = 0; i8 < list2.size(); i8++) {
                int lineCount = r20.A00((CharSequence) C13991Tnr.A0Z(this.A0A, i7, i8)).getLineCount();
                if (lineCount > vWaArr[i7].A01) {
                    vWaArr[i7] = new C17447VWa(this, Math.min(lineCount, 2));
                }
            }
            int lineCount2 = r123.A00((CharSequence) list.get(i7)).getLineCount();
            if (lineCount2 > vWaArr[i7].A01) {
                vWaArr[i7] = new C17447VWa(this, Math.min(lineCount2, 2));
            }
        }
        this.A01 = new VWZ(vWaArr, DbU.A1b(list, list.size()), i3);
        0rN r11 = new 0rN(alignment, this.A00, (String) null, 0.0f, 1.0f, i6, false);
        C17447VWa vWa = new C17447VWa(this, 1);
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            int lineCount3 = r11.A00(AnonymousClass7TE.A18(it3)).getLineCount();
            if (lineCount3 > vWa.A01) {
                vWa = new C17447VWa(this, Math.min(lineCount3, 2));
            }
        }
        this.A02 = vWa;
        ArrayList arrayList4 = new ArrayList();
        int size2 = list2.size();
        int i9 = 0;
        while (i9 < size2) {
            int i10 = i9 + size;
            int min = Math.min(i10, size2);
            String[] strArr = new String[size];
            list2.subList(i9, min).toArray(strArr);
            VWX vwx = new VWX(vWa, strArr, i6);
            int size3 = list.size();
            int[] iArr = new int[2];
            iArr[1] = size;
            iArr[0] = size3;
            String[][] strArr2 = (String[][]) Array.newInstance(String.class, iArr);
            for (int i11 = 0; i11 < list.size(); i11++) {
                String[] strArr3 = new String[size];
                ((List) this.A0A.get(i11)).subList(i9, min).toArray(strArr3);
                strArr2[i11] = strArr3;
            }
            arrayList4.add(new VTX(vwx, new VWY(vWaArr, strArr2, i6)));
            i9 = i10;
        }
        this.A03 = arrayList4;
    }

    private boolean A00(0rN r7, String str) {
        if (this.A00.measureText(str) <= ((float) r7.A00)) {
            return true;
        }
        StaticLayout A002 = r7.A00(str);
        if (A002.getLineCount() <= 1) {
            return true;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        for (int i = 0; i < A002.getLineCount(); i++) {
            if (!wordInstance.isBoundary(A002.getLineStart(i))) {
                return false;
            }
        }
        if (A002.getLineCount() > 2) {
            return false;
        }
        return true;
    }
}
