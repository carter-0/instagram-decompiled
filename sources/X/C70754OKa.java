package X;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.OKa  reason: case insensitive filesystem */
public final class C70754OKa {
    public String A00;
    public List A01 = ImmutableList.of();

    public final SpannableStringBuilder A00() {
        Object styleSpan;
        SpannableStringBuilder A0C = DbS.A0C(this.A00);
        List<C70632OEd> list = this.A01;
        if (list != null && !list.isEmpty()) {
            for (C70632OEd oEd : list) {
                Integer num = oEd.A00.A00;
                if (num != null) {
                    int intValue = num.intValue();
                    int i = 1;
                    if (intValue != 1) {
                        i = 2;
                        if (intValue != 2) {
                            if (intValue == 3) {
                                styleSpan = new UnderlineSpan();
                            } else if (intValue == 4) {
                                styleSpan = new StrikethroughSpan();
                            }
                            int intValue2 = oEd.A02.intValue();
                            A0C.setSpan(styleSpan, intValue2, oEd.A01.intValue() + intValue2, 0);
                        }
                    }
                    styleSpan = new StyleSpan(i);
                    int intValue22 = oEd.A02.intValue();
                    A0C.setSpan(styleSpan, intValue22, oEd.A01.intValue() + intValue22, 0);
                }
                String str = oEd.A00.A01;
                if (str != null) {
                    int intValue3 = oEd.A02.intValue();
                    AnonymousClass7AV.A05(A0C, new C46678Dj7(0cp.A03(str)), A0C.subSequence(intValue3, oEd.A01.intValue() + intValue3).toString());
                }
            }
        }
        return A0C;
    }
}
