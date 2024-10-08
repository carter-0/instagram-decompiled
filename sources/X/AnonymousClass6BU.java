package X;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.6BU  reason: invalid class name */
public abstract class AnonymousClass6BU {
    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(C285595Rx.A00(j)), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, C286155Ud r4, int i, int i2) {
        if (r4 != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(r4, 10));
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                arrayList.add(((C291785hs) it.next()).A00);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void A02(Spannable spannable, C268024cd r6, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A01 = AnonymousClass5Z5.A01(j);
        if (A01 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(AnonymousClass1GB.A01(r6.F05(j)), false);
        } else if (A01 == 8589934592L) {
            relativeSizeSpan = new RelativeSizeSpan(AnonymousClass5Z5.A00(j));
        } else {
            return;
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
