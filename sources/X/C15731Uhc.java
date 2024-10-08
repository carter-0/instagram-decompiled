package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.List;

/* renamed from: X.Uhc  reason: case insensitive filesystem */
public final class C15731Uhc extends C266444Yx {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15731Uhc) {
                C15731Uhc uhc = (C15731Uhc) obj;
                if (!"".equals("") || !"".equals("") || !0qQ.A0K(this.A00, uhc.A00) || !0qQ.A0K(this.A01, uhc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final CharSequence A01(Resources resources) {
        List list = this.A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        00k.A0q(spannableStringBuilder, this.A00, "", "", list, new J6I(resources, 27));
        return spannableStringBuilder;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompoundString(prefix=");
        sb.append("");
        sb.append(", postfix=");
        sb.append("");
        sb.append(", separator=");
        sb.append(this.A00);
        sb.append(", strings=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public C15731Uhc(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
