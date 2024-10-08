package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import java.util.HashMap;

/* renamed from: X.Vnp  reason: case insensitive filesystem */
public abstract class C18225Vnp {
    public static final int A00(String str, int i) {
        StringBuilder sb;
        if (str == null || 00l.A0W(str)) {
            return i;
        }
        String A0g = 00p.A0g(str, "#", "", false);
        int length = A0g.length();
        if (length == 6) {
            sb = new StringBuilder();
            sb.append('#');
            sb.append(A0g);
        } else if (length != 8) {
            return i;
        } else {
            String A0q = C51967G9n.A0q(A0g, 0, 2);
            String A0q2 = C51967G9n.A0q(A0g, 2, 4);
            String A0q3 = C51967G9n.A0q(A0g, 4, 6);
            String A0q4 = C51967G9n.A0q(A0g, 6, 8);
            sb = new StringBuilder();
            sb.append('#');
            Pxg.A1P(A0q4, A0q, A0q2, sb);
            sb.append(A0q3);
        }
        return Color.parseColor(sb.toString());
    }

    public static final SpannableStringBuilder A01(Context context, C21032XAl xAl, C16496Uvs uvs) {
        Object obj;
        Object obj2;
        Object obj3;
        float f;
        Object obj4;
        C16542Uwn uwn;
        Drawable A0E;
        Object obj5;
        Integer num;
        int i;
        int i2;
        boolean A1X = DbW.A1X(xAl);
        Object obj6 = C17160VKm.A02.get(uvs);
        if (obj6 != null) {
            VYD vyd = (VYD) obj6;
            try {
                obj = C16841V7w.A00(xAl).get("text");
            } catch (Exception unused) {
                obj = null;
            }
            DbS.A1Y(obj);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((String) obj);
            try {
                obj2 = C16841V7w.A00(xAl).get("text_color");
            } catch (Exception unused2) {
                obj2 = null;
            }
            int A00 = A00((String) obj2, -1);
            try {
                obj3 = C16841V7w.A00(xAl).get("text_font_size");
            } catch (Exception unused3) {
                obj3 = null;
            }
            Number number = (Number) obj3;
            if (number != null) {
                f = number.floatValue();
            } else {
                f = (float) vyd.A01;
            }
            int applyDimension = (int) TypedValue.applyDimension(2, f, AnonymousClass7TF.A0E(context));
            int i3 = 0;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(applyDimension), A1X ? 1 : 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), A1X, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(A00), A1X, spannableStringBuilder.length(), 33);
            HashMap hashMap = C17160VKm.A01;
            Integer num2 = AnonymousClass05K.A01;
            try {
                obj4 = C16841V7w.A00(xAl).get("icon_type");
            } catch (Exception unused4) {
                obj4 = null;
            }
            int A0A = AnonymousClass7TG.A0A((Number) obj4);
            C16542Uwn[] values = C16542Uwn.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    uwn = null;
                    break;
                }
                uwn = values[i4];
                if (uwn.A00 == A0A) {
                    break;
                }
                i4++;
            }
            Number A0z = JTO.A0z(uwn, hashMap);
            if (!(A0z == null || (A0E = JTP.A0E(context, A0z)) == null)) {
                C51969G9p.A12(PorterDuff.Mode.SRC_IN, A0E, A00);
                int i5 = vyd.A02;
                int i6 = vyd.A03;
                int i7 = (int) (vyd.A00 * ((float) applyDimension));
                A0E.setBounds(i5, i6, i7, i7);
                try {
                    obj5 = C16841V7w.A00(xAl).get("icon_location");
                } catch (Exception unused5) {
                    obj5 = null;
                }
                Number number2 = (Number) obj5;
                Integer[] A002 = AnonymousClass05K.A00(2);
                int length2 = A002.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        num = null;
                        break;
                    }
                    num = A002[i8];
                    if (1 - num.intValue() != 0) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    if (number2 != null && i2 == number2.intValue()) {
                        break;
                    }
                    i8++;
                }
                int i9 = 1;
                if (num == num2) {
                    i3 = spannableStringBuilder.length();
                    i = spannableStringBuilder.length() + 1;
                    i9 = spannableStringBuilder.length() + 2;
                } else {
                    i = 0;
                }
                spannableStringBuilder.insert(i3, "  ");
                spannableStringBuilder.setSpan(new ImageSpan(A0E, 2), i, i9, 17);
            }
            return spannableStringBuilder;
        }
        throw AnonymousClass7TE.A0y();
    }
}
