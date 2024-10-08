package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.VkX  reason: case insensitive filesystem */
public final class C18049VkX {
    public final int A00;
    public final String A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;

    public final CharSequence A00(Context context, 0rN r10) {
        CharSequence charSequence = (CharSequence) this.A02.invoke(context);
        CharSequence charSequence2 = (CharSequence) this.A04.invoke(context);
        SpannableStringBuilder concat = TextUtils.concat(new CharSequence[]{charSequence, charSequence2});
        int lineCount = r10.A00(concat).getLineCount();
        int i = this.A00;
        if (lineCount > i) {
            SpannableStringBuilder append = new SpannableStringBuilder("…").append(charSequence2);
            0qQ.A07(append);
            StaticLayout A002 = r10.A00(charSequence);
            0qQ.A07(A002);
            concat = new SpannableStringBuilder(VH5.A00(A002, append, r10, charSequence, i)).append("…").append(charSequence2);
        }
        Object invoke = this.A03.invoke(context);
        if (invoke == null) {
            0qQ.A0A(concat);
            return concat;
        }
        0qQ.A0A(concat);
        if (!(concat instanceof Spannable)) {
            concat = new SpannableStringBuilder(concat);
        }
        Spannable spannable = (Spannable) concat;
        spannable.setSpan(invoke, 0, spannable.length(), 33);
        return spannable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18049VkX) {
            C18049VkX vkX = (C18049VkX) obj;
            if (this.A00 != vkX.A00 || !0qQ.A0K(this.A01, vkX.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr;
        String str = this.A01;
        if (str != null) {
            objArr = new Object[]{Integer.valueOf(this.A00), str};
        } else {
            objArr = new Object[]{this.A02, this.A04, this.A03, Integer.valueOf(this.A00)};
        }
        return Arrays.hashCode(objArr);
    }

    public C18049VkX(String str, 0sP r2, 0sP r3, 0sP r4, int i) {
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A00 = i;
        this.A01 = str;
    }
}
