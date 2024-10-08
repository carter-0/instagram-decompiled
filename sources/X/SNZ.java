package X;

import android.content.Context;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.instagram.android.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public final class SNZ {
    public final int A00;
    public final ImmutableRangeMap A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final float[] A03;
    public final int[] A04;

    public /* synthetic */ SNZ(Context context) {
        Context context2 = context;
        this.A00 = context2.getColor(2Yu.A05(context2));
        float[] fArr = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
        this.A03 = fArr;
        int[] iArr = {AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_yellow), context2.getColor(R.color.activator_card_progress_bad), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_red), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_pink), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_purple), AnonymousClass7TF.A03(context2, R.attr.igds_color_gradient_yellow)};
        this.A04 = iArr;
        ImmutableRangeMap immutableRangeMap = ImmutableRangeMap.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Range A002 = A00(fArr, 0, 1);
        0eP A0x = AnonymousClass7TF.A0x(Integer.valueOf(iArr[0]), iArr[1]);
        17k.A0A(A002, "Range must not be empty, but was %s", !A002.lowerBound.equals(A002.upperBound));
        A1C.add(new ImmutableEntry(A002, A0x));
        A01(A00(fArr, 1, 2), AnonymousClass7TF.A0x(Integer.valueOf(iArr[1]), iArr[2]), A1C);
        A01(A00(fArr, 2, 3), AnonymousClass7TF.A0x(Integer.valueOf(iArr[2]), iArr[3]), A1C);
        A01(A00(fArr, 3, 4), AnonymousClass7TF.A0x(Integer.valueOf(iArr[3]), iArr[4]), A1C);
        A01(Range.A00(Float.valueOf(fArr[4]), Float.valueOf(fArr[5])), AnonymousClass7TF.A0x(Integer.valueOf(iArr[4]), iArr[5]), A1C);
        this.A01 = C9738Rfw.A00(A1C);
    }

    public static Range A00(float[] fArr, int i, int i2) {
        Float valueOf = Float.valueOf(fArr[i]);
        Float valueOf2 = Float.valueOf(fArr[i2]);
        Range range = Range.A00;
        valueOf.getClass();
        Cut cut = new Cut(valueOf);
        valueOf2.getClass();
        return new Range(cut, new Cut(valueOf2));
    }

    public static void A01(Range range, Object obj, AbstractCollection abstractCollection) {
        17k.A0A(range, "Range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
        abstractCollection.add(new ImmutableEntry(range, obj));
    }
}
