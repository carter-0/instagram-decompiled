package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.text.BreakIterator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;

public abstract class FGO {
    public static void A03(Context context, SpannableStringBuilder spannableStringBuilder, C283155Gi r8, boolean z) {
        String str = r8.A04.A0n;
        if (TextUtils.isEmpty(str) && z && (str = r8.A08) == null) {
            Double A05 = r8.A05();
            if (A05 != null) {
                str = 1G0.A0B(context.getResources(), A05.doubleValue(), false);
                r8.A08 = str;
            } else {
                return;
            }
        }
        if (str != null) {
            spannableStringBuilder.append(" ").append(str);
            String obj = spannableStringBuilder.toString();
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(obj);
            int last = characterInstance.last();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(DbV.A01(context));
            String A0R = 002.A0R(" ", str);
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(A0R);
            spannableStringBuilder.setSpan(foregroundColorSpan, last - characterInstance2.last(), last, 33);
        }
    }

    public static SpannableStringBuilder A00(Context context, UserSession userSession, C51959G9f g9f, JS9 js9, C47171Drm drm, C283155Gi r19, int i) {
        int i2;
        G5y g5y;
        Context context2 = context;
        JS9 js92 = js9;
        C283155Gi r12 = r19;
        C51569FwJ fwJ = new C51569FwJ(context2, g9f, js92, r12, i);
        boolean z = false;
        if (js92 != JS9.A01) {
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UserSession userSession2 = userSession;
        if (!TextUtils.isEmpty(r12.A04.A0j)) {
            String str = r12.A04.A0j;
            str.getClass();
            if (AnonymousClass7TE.A1a(drm.A00.invoke())) {
                g5y = C50581Feq.A00;
            } else {
                g5y = C50580Fep.A00;
            }
            g5y.E4T(spannableStringBuilder, str, new C73469PdB(1, context2, fwJ));
            A02(context2, spannableStringBuilder, userSession2, r12, fwJ, z);
            A03(context2, spannableStringBuilder, r12, true);
        } else {
            if (!TextUtils.isEmpty(r12.A04.A0o)) {
                spannableStringBuilder.append(r12.A04.A0o);
                A02(context2, spannableStringBuilder, userSession2, r12, fwJ, z);
                A03(context2, spannableStringBuilder, r12, true);
                List<C47156DrX> list = r12.A04.A0w;
                if (list != null) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(R.attr.textColorBoldLink, typedValue, true);
                    int i3 = typedValue.data;
                    for (C47156DrX drX : list) {
                        ELP elp = new ELP(drX, r12, (Function) fwJ, i3);
                        int i4 = drX.A01;
                        if (i4 < 0 || (i2 = drX.A00) >= spannableStringBuilder.length()) {
                            0wb.A07("NewsfeedStoryUtil.addLink()", new IndexOutOfBoundsException(002.A0p("length: ", ", start: ", C273654mx.A00(443), spannableStringBuilder.length(), i4, drX.A00)));
                        } else {
                            spannableStringBuilder.setSpan(elp, i4, i2, 33);
                        }
                    }
                }
            }
            return spannableStringBuilder;
        }
        Matcher matcher = C253063q9.A01().matcher(spannableStringBuilder.toString());
        while (matcher.find()) {
            Dbb.A0r(spannableStringBuilder, new ELO(matcher.group(1), fwJ, 0), matcher);
        }
        Matcher A09 = 0mp.A09(spannableStringBuilder.toString());
        while (A09.find()) {
            Dbb.A0r(spannableStringBuilder, new ELO(A09.group(1), fwJ, 1), A09);
        }
        return spannableStringBuilder;
    }

    public static String A01(Context context, C47171Drm drm, C283155Gi r7) {
        G5y g5y;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(r7.A04.A0j)) {
            String str = r7.A04.A0j;
            if (!TextUtils.isEmpty(str)) {
                if (AnonymousClass7TE.A1a(drm.A00.invoke())) {
                    g5y = C50581Feq.A00;
                } else {
                    g5y = C50580Fep.A00;
                }
                g5y.E4T(spannableStringBuilder, str, new TPI(6));
            }
            A03(context, spannableStringBuilder, r7, false);
        } else if (!TextUtils.isEmpty(r7.A04.A0o)) {
            spannableStringBuilder.append(r7.A04.A0o);
        }
        String str2 = r7.A0B;
        if (str2 == null) {
            Double A05 = r7.A05();
            if (A05 != null) {
                str2 = 1G0.A03(context, A05.doubleValue());
                r7.A0B = str2;
            }
            return spannableStringBuilder.toString();
        }
        if (str2 != null) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(str2);
        }
        return spannableStringBuilder.toString();
    }

    public static void A02(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C283155Gi r8, Function function, boolean z) {
        if ((z || !182.A06(0Tu.A05, userSession, 36327658023369314L)) && spannableStringBuilder.length() > 100 && !r8.A03.A02) {
            int i = 100;
            if (spannableStringBuilder.length() > 101 && C337107fh.A02(spannableStringBuilder.subSequence(99, 101).toString())) {
                i = 101;
            }
            spannableStringBuilder.delete(i, spannableStringBuilder.length());
            String string = context.getString(2131954762);
            spannableStringBuilder.append(string);
            spannableStringBuilder.setSpan(new ELO(string, function, DbV.A01(context), 2), i + 2, i + string.length(), 33);
        }
    }

    public static void A04(Context context, View view, View view2, TextView textView, UserSession userSession, C51959G9f g9f, C47171Drm drm, C283155Gi r16, int i) {
        U23 u23;
        Context context2 = context;
        C283155Gi r8 = r16;
        textView.setText(A00(context2, userSession, g9f, JS9.A01, drm, r8, i));
        if (!(view instanceof ConstraintLayout)) {
            0wb.A03("NewsfeedStoryUtil", "View container is not constraint layout.");
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int lineCount = textView.getLineCount();
            if (lineCount == 0) {
                textView.getViewTreeObserver().addOnPreDrawListener(new C50123FPn(view2, textView, constraintLayout));
            } else {
                A05(view2, textView, constraintLayout, lineCount);
            }
        }
        textView.setContentDescription(A01(context2, drm, r8));
        textView.setTag(R.id.tag_span_touch_key, view);
        Object systemService = context2.getSystemService("accessibility");
        systemService.getClass();
        if (((AccessibilityManager) systemService).isEnabled()) {
            u23 = null;
        } else {
            u23 = U23.A00;
        }
        textView.setMovementMethod(u23);
    }

    public static void A05(View view, TextView textView, ConstraintLayout constraintLayout, int i) {
        C71492dQ r2 = (C71492dQ) textView.getLayoutParams();
        C270354gb r3 = new C270354gb();
        r3.A0I(constraintLayout);
        if (i == 1 || textView.getLineCount() == 1) {
            if (r2.A0u != view.getId() || r2.A0F != view.getId()) {
                0nA.A0c(textView, 0);
                r3.A0I(constraintLayout);
                r3.A0E(textView.getId(), 4, view.getId(), 4, view.getPaddingTop());
                r3.A0E(textView.getId(), 3, view.getId(), 3, view.getPaddingBottom());
                r3.A0G(constraintLayout);
            } else {
                return;
            }
        } else if (r2.A0u != constraintLayout.getId() || r2.A0G != -1) {
            0nA.A0c(textView, textView.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding));
            r3.A0C(textView.getId(), 3, constraintLayout.getId(), 3);
            r3.A09(textView.getId(), 4);
        } else {
            return;
        }
        r3.A0G(constraintLayout);
    }
}
