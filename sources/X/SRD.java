package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.widget.listcell.ListCell;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class SRD {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r1 != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C13930TlY r3) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = r3.C1d()
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = r3.AZd()
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r3.C1d()
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.String r0 = r3.C1e()
            if (r0 == 0) goto L_0x0042
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = r3.C1e()
            r2.append(r0)
            r2.append(r1)
        L_0x0042:
            java.lang.String r0 = r3.AZd()
            r2.append(r0)
            java.lang.String r0 = r3.AZf()
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0055:
            java.lang.String r0 = r3.CHc()
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0061:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0066:
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = r3.AZf()
            if (r0 == 0) goto L_0x0078
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            java.lang.String r1 = " "
            if (r0 != 0) goto L_0x0087
            r2.append(r1)
            java.lang.String r0 = r3.AZf()
            r2.append(r0)
        L_0x0087:
            java.lang.String r0 = r3.CHc()
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0061
            r2.append(r1)
            java.lang.String r0 = r3.CHc()
            r2.append(r0)
            goto L_0x0061
        L_0x009e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRD.A01(X.TlY):java.lang.String");
    }

    public static final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem, ListCell listCell, String str, String str2) {
        Integer num;
        Context context;
        int i;
        boolean z;
        String str3;
        boolean z2 = true;
        int intValue = baseSelectionCheckoutItem.Bs1().intValue();
        ListCell listCell2 = listCell;
        String str4 = str;
        String str5 = str2;
        if (intValue == 3) {
            num = AnonymousClass05K.A02;
            context = listCell.getContext();
            i = 2131961413;
        } else if (intValue != 2) {
            num = AnonymousClass05K.A01;
            context = listCell.getContext();
            i = 2131961277;
        } else {
            num = AnonymousClass05K.A02;
            str3 = null;
            z = false;
            C18674VwX.A02(listCell2, num, str3, str4, str5, z2, z);
        }
        str3 = context.getString(i);
        z2 = false;
        z = false;
        C18674VwX.A02(listCell2, num, str3, str4, str5, z2, z);
    }

    public final SpannableStringBuilder A03(Context context, Date date, Date date2, Locale locale, boolean z) {
        String format;
        int length;
        Date date3 = date2;
        Date date4 = date;
        if (date == null && date2 == null) {
            return null;
        }
        Locale locale2 = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale2);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, 1);
        Date date5 = date4;
        if (date == null) {
            date5 = date3;
        }
        Calendar instance3 = Calendar.getInstance();
        instance3.setTime(date5);
        Context context2 = context;
        SpannableStringBuilder A0C = DbS.A0C(Pxg.A0v(002.A0C(context2.getString(2131961247), ' '), locale2, new Object[0], 0));
        int length2 = A0C.length();
        0qQ.A0A(instance);
        if (!(instance.get(1) == instance3.get(1) && instance.get(2) == instance3.get(2) && instance.get(5) == instance3.get(5)) && !instance.after(instance3)) {
            if (instance3.after(instance) && instance2.get(1) == instance3.get(1) && instance2.get(2) == instance3.get(2) && instance2.get(5) == instance3.get(5)) {
                format = String.format(locale2, DbY.A0c(context2, simpleDateFormat.format(date5), 2131961244), Arrays.copyOf(new Object[0], 0));
            } else if (date == null || date2 == null) {
                format = simpleDateFormat.format(date5);
                A0C.append(format);
                length = A0C.length();
            } else {
                format = String.format("%1s - %2s", Pxf.A1X(simpleDateFormat.format(date4), simpleDateFormat.format(date3), 2));
            }
            0qQ.A07(format);
            A0C.append(format);
            length = A0C.length();
        } else {
            A0C.append(Pxg.A0v(DbY.A0c(context2, simpleDateFormat.format(date5), 2131961245), locale2, new Object[0], 0));
            length = A0C.length();
            if (instance3.after(instance)) {
                A0C.append(002.A0R(", ", Pxg.A0v(DbY.A0c(context2, Integer.valueOf(instance3.get(11) - instance.get(11)), 2131961246), locale2, new Object[0], 0)));
                length++;
            }
        }
        if (!z) {
            return A0C;
        }
        A0C.setSpan(new StyleSpan(1), length2, length, 33);
        return A0C;
    }

    public static final String A00(Context context, CurrencyAmount currencyAmount) {
        String A00;
        if (currencyAmount != null) {
            String str = currencyAmount.A01;
            if (!(str.length() <= 0 || 012.A0q(str) == null || Float.parseFloat(str) == 0.0f || (A00 = SGX.A00.A00(currencyAmount.A00, new BigDecimal(str))) == null)) {
                return A00;
            }
        }
        return AnonymousClass7TE.A16(context, 2131961402);
    }

    public final String A04(Context context, CurrencyAmount currencyAmount, String str, Date date, Date date2, Locale locale) {
        int i;
        Object[] objArr;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale);
        if (date != null) {
            if (date2 != null) {
                i = 2131961258;
                objArr = new Object[]{simpleDateFormat.format(date), simpleDateFormat.format(date2), A00(context, currencyAmount)};
            }
            i = 2131961259;
            if ((date == null || (r1 = simpleDateFormat.format(date)) == null) && (date2 == null || (r1 = simpleDateFormat.format(date2)) == null)) {
                String str2 = "";
            }
            objArr = new Object[]{str2, A00(context, currencyAmount)};
        } else {
            if (date2 == null) {
                return Pxg.A0v("%1s • %2s", locale, new Object[]{str, A00(context, currencyAmount)}, 2);
            }
            i = 2131961259;
            String str22 = "";
            objArr = new Object[]{str22, A00(context, currencyAmount)};
        }
        String string = context.getString(i, objArr);
        0qQ.A0A(string);
        return string;
    }
}
