package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SBb  reason: case insensitive filesystem */
public abstract class C11122SBb {
    public static final Pattern A00;

    public static final SpannedString A00(CharSequence charSequence, Locale locale, Object... objArr) {
        int i;
        String str;
        SpannableStringBuilder A0C = DbS.A0C(charSequence);
        int i2 = -1;
        int i3 = 0;
        while (i3 < A0C.length()) {
            Matcher matcher = A00.matcher(A0C);
            0qQ.A07(matcher);
            if (!matcher.find(i3)) {
                break;
            }
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            CharSequence charSequence2 = "%";
            if (!0qQ.A0K(group3, charSequence2)) {
                if (0qQ.A0K(group3, "n")) {
                    charSequence2 = "\n";
                } else {
                    if (0qQ.A0K(group, "")) {
                        i2++;
                    } else if (!0qQ.A0K(group, "<")) {
                        if (group != null) {
                            i = i2;
                            i2 = Integer.parseInt(C51967G9n.A0q(group, 0, group.length() - 1)) - 1;
                            str = objArr[i2];
                            if (!0qQ.A0K(group3, "s") || !(str instanceof Spanned)) {
                                StringBuilder A1A = AnonymousClass7TE.A1A();
                                A1A.append('%');
                                str = Pxg.A0v(Pxg.A0s(group2, group3, A1A), locale, new Object[]{str}, 1);
                            }
                            charSequence2 = str;
                            i2 = i;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    i = i2;
                    str = objArr[i2];
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append('%');
                    str = Pxg.A0v(Pxg.A0s(group2, group3, A1A2), locale, new Object[]{str}, 1);
                    charSequence2 = str;
                    i2 = i;
                }
            }
            A0C.replace(start, end, charSequence2);
            i3 = start + charSequence2.length();
        }
        return new SpannedString(A0C);
    }

    static {
        Pattern compile = Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");
        0qQ.A07(compile);
        A00 = compile;
    }
}
