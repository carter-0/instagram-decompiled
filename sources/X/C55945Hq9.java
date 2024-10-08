package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import java.util.Date;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.Hq9  reason: case insensitive filesystem */
public final class C55945Hq9 {
    public final Context A00;
    public final C61410nE A01;

    public C55945Hq9(Context context, C61410nE r3) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public final String A00(Integer num, Date date) {
        Context context;
        Object[] objArr;
        String str;
        String string;
        int A1U = AnonymousClass7TF.A1U(0, date, num);
        EnumMap enumMap = new EnumMap(C247743gq.class);
        1G0.A0G(new Date(System.currentTimeMillis()), date, enumMap);
        Map A0B = 0Yt.A0B(enumMap);
        int A07 = C51973G9u.A07(C247743gq.YEARS, A0B);
        int A072 = C51973G9u.A07(C247743gq.MONTHS, A0B);
        int A073 = C51973G9u.A07(C247743gq.DAYS, A0B);
        int A074 = C51973G9u.A07(C247743gq.HOURS, A0B);
        int A075 = C51973G9u.A07(C247743gq.MINUTES, A0B);
        int A076 = C51973G9u.A07(C247743gq.SECONDS, A0B);
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A01);
        if (A07 > 0 || A072 > 0 || A073 > 7) {
            context = this.A00;
            int i = 2131974183;
            if (A1W) {
                i = 2131961716;
            }
            objArr = new Object[A1U];
            str = C14240TsN.A04("MMM d", date.getTime());
            objArr[0] = str;
            string = context.getString(r5, objArr);
        } else if (A073 > 0) {
            Context context2 = this.A00;
            if (A073 == A1U) {
                int i2 = 2131974184;
                if (A1W) {
                    i2 = 2131961717;
                }
                string = context2.getString(i2);
            } else {
                Resources resources = context2.getResources();
                int i3 = R.plurals.starts_in_days;
                if (A1W) {
                    i3 = R.plurals.ends_in_days;
                }
                string = DbY.A0d(resources, A073, i3);
            }
        } else if (A074 > 0 || A075 > 0 || A076 > 0) {
            context = this.A00;
            int i4 = 2131974182;
            if (A1W) {
                i4 = 2131961715;
            }
            objArr = new Object[A1U];
            str = StringFormatUtil.formatStrLocaleSafe(C66579MXk.A00(44), Integer.valueOf(A074), Integer.valueOf(A075), Integer.valueOf(A076));
            objArr[0] = str;
            string = context.getString(i4, objArr);
        } else if (A1W) {
            return "";
        } else {
            return AnonymousClass7TE.A16(this.A00, 2131964531);
        }
        0qQ.A0A(string);
        return string;
    }
}
