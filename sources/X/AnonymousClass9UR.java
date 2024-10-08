package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9UR  reason: invalid class name */
public abstract class AnonymousClass9UR {
    public static final Pattern A00 = Pattern.compile("\\B@([a-zA-Z0-9\\_]+(\\.[a-zA-Z0-9\\_]+)*)");

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r2.A0O != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r2.A0O != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout.Alignment A00(X.C306386Ly r2, java.lang.Integer r3) {
        /*
            int[] r0 = X.A2M.A00
            int r1 = r3.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0016
            r0 = 1
            if (r1 == r0) goto L_0x002c
            r0 = 2
            if (r1 != r0) goto L_0x001d
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x001a
        L_0x0013:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L_0x0016:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x0013
        L_0x001a:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x001d:
            java.lang.String r1 = "Unknown alignment: "
            java.lang.String r0 = X.AnonymousClass9UV.A00(r3)
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x002c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UR.A00(X.6Ly, java.lang.Integer):android.text.Layout$Alignment");
    }

    public static void A03(Layout layout, Spannable spannable, Integer num, float f) {
        for (AnonymousClass6MP r3 : (AnonymousClass6MP[]) C263324Kh.A06(spannable, AnonymousClass6MP.class)) {
            r3.FLc(layout, num, f, spannable.getSpanStart(r3), spannable.getSpanEnd(r3));
        }
    }

    public static void A0A(C306386Ly r2) {
        Spannable spannable = r2.A0F;
        if (!TextUtils.isEmpty(spannable)) {
            String obj = spannable.toString();
            if (r2.A0O) {
                return;
            }
            if (0mk.A01() || 0mk.A03(obj)) {
                r2.A0O = true;
            }
        }
    }

    public static ArrayList A01(UserSession userSession, String str) {
        17i A002 = 17h.A00(userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Matcher matcher = A00.matcher(str);
        while (matcher.find()) {
            Object obj = A002.A02.get(matcher.group().substring(1));
            if (obj != null) {
                A1C.add(obj);
            }
        }
        return A1C;
    }

    public static void A02(Context context, EditText editText) {
        Editable text = editText.getText();
        0qQ.A0A(text);
        C358948bj.A03(text);
        editText.invalidate();
        C306486Mi.A00(editText, AnonymousClass7TE.A01(context.getResources(), R.dimen.abc_dialog_padding_material), true);
    }

    public static void A04(ViewGroup viewGroup, AnonymousClass91N r7, C360778f8 r8, ConstrainedEditText constrainedEditText, boolean z, boolean z2) {
        if (r8.A07().A0D) {
            0qQ.A0B(viewGroup, 0);
            if (AnonymousClass9US.A01()) {
                AnonymousClass91N.A00(viewGroup, r7, false, z, z2);
                r7.A00 = true;
            }
            UserSession userSession = r7.A03;
            if (z) {
                1Av A002 = 1Au.A00(userSession);
                if (!AnonymousClass7TG.A1a(A002, A002.A5L, 1Av.A8a, 57)) {
                    AnonymousClass91N.A00(viewGroup, r7, true, true, z2);
                }
            } else if (182.A06(0Tu.A05, userSession, 36320704471376663L)) {
                1Av A003 = 1Au.A00(userSession);
                if (!AnonymousClass7TG.A1a(A003, A003.A5M, 1Av.A8a, 58)) {
                    AnonymousClass91N.A00(viewGroup, r7, true, false, z2);
                }
            }
            AnonymousClass7TG.A1A(r7.A01, false);
            r7.A02(C358948bj.A05(constrainedEditText.getText()));
            return;
        }
        AnonymousClass7TE.A1U(r7.A01, false);
    }

    public static void A05(EditText editText, Object obj, String str, char c) {
        Object ukf;
        Editable text = editText.getText();
        int selectionEnd = editText.getSelectionEnd();
        for (int i = selectionEnd - 1; i >= 0; i--) {
            if (text.charAt(i) == c) {
                editText.clearComposingText();
                if (obj instanceof User) {
                    ukf = new AnonymousClass91O(editText.getResources(), (User) obj);
                } else if (obj instanceof Hashtag) {
                    ukf = new C15915Ukf(editText.getResources(), (Hashtag) obj);
                } else {
                    throw AnonymousClass7TE.A1B(C273654mx.A00(524));
                }
                int length = str.length() + i + 1;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                for (AnonymousClass91P removeSpan : (AnonymousClass91P[]) spannableStringBuilder.getSpans(i, selectionEnd, AnonymousClass91P.class)) {
                    spannableStringBuilder.removeSpan(removeSpan);
                }
                spannableStringBuilder.replace(i + 1, selectionEnd, 002.A0R(str, " "));
                spannableStringBuilder.setSpan(ukf, i, length, 33);
                editText.setText(spannableStringBuilder);
                editText.setSelection(Math.min(length + 1, editText.getText().length()));
                return;
            }
        }
    }

    public static void A06(C360778f8 r1, C314676if r2, boolean z) {
        if (r1.A07().A0C) {
            AnonymousClass7TG.A1A(((A9W) r2.get()).A06, z);
            ((A9W) r2.get()).A01(false);
        } else if (r2.A03) {
            AnonymousClass7TE.A1U(((A9W) r2.get()).A06, z);
        }
    }

    public static void A07(ConstrainedEditText constrainedEditText, C358868bb r4, C306386Ly r5, float f) {
        Context context = constrainedEditText.getContext();
        constrainedEditText.setTextSize(f);
        if (r5 != null) {
            Editable text = constrainedEditText.getText();
            r5.A0C(C39815AAm.A00(context, text, r4, r5, f), C39815AAm.A01(context, text, r4, r5, f));
        }
    }

    public static void A08(ConstrainedEditText constrainedEditText, C358868bb r5, C306386Ly r6, InteractiveDrawableContainer interactiveDrawableContainer, Integer num, Map map) {
        Context context = constrainedEditText.getContext();
        C358938bi r1 = r5.A06;
        int A002 = r1.A00(context);
        0qQ.A0B(context, 1);
        int A01 = (int) (((1.0f - r1.A03) * ((float) AnonymousClass8XF.A01(context))) / 2.0f);
        constrainedEditText.setPadding(A01, constrainedEditText.getPaddingTop(), A01, constrainedEditText.getPaddingBottom());
        if (r6 != null) {
            r6.A0E(A002);
            A09(constrainedEditText, r6, interactiveDrawableContainer, num, map);
        }
    }

    public static void A09(ConstrainedEditText constrainedEditText, C306386Ly r9, InteractiveDrawableContainer interactiveDrawableContainer, Integer num, Map map) {
        float f;
        float f2;
        A0B(r9, num);
        int activeDrawableId = interactiveDrawableContainer.getActiveDrawableId();
        if (activeDrawableId != -1) {
            C369458un A0N = interactiveDrawableContainer.A0N(activeDrawableId);
            PointF pointF = (PointF) map.get(r9);
            float f3 = 0.0f;
            if (pointF != null) {
                if (A0N == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    f = A0N.A01;
                    f2 = A0N.A02;
                }
                if (!(pointF.x == f && pointF.y == f2)) {
                    return;
                }
            }
            float A06 = (float) AnonymousClass7TF.A06(r9);
            float A05 = (float) AnonymousClass7TF.A05(r9);
            int[] iArr = A2M.A00;
            int intValue = num.intValue();
            if (intValue == 0) {
                f3 = ((float) (interactiveDrawableContainer.getLeft() + constrainedEditText.getPaddingLeft())) + (A06 / 2.0f);
            } else if (intValue == 1) {
                f3 = AnonymousClass7TE.A02(interactiveDrawableContainer) / 2.0f;
            } else if (intValue == 2) {
                f3 = ((float) (interactiveDrawableContainer.getRight() - constrainedEditText.getPaddingRight())) - (A06 / 2.0f);
            }
            AEV.A02(InteractiveDrawableContainer.A02(interactiveDrawableContainer, activeDrawableId), f3, A05);
            C369458un A0N2 = interactiveDrawableContainer.A0N(activeDrawableId);
            if (A0N2 != null) {
                map.put(r9, new PointF(A0N2.A01, A0N2.A02));
            } else {
                0kD.A01("TextToolControllerUtil", 002.A0O("null InteractiveDrawableTransform, drawableId: ", activeDrawableId));
            }
        }
    }

    public static void A0B(C306386Ly r3, Integer num) {
        A0A(r3);
        r3.A0K(A00(r3, num));
        if (!TextUtils.isEmpty(r3.A0F)) {
            for (AnonymousClass91Q r0 : (AnonymousClass91Q[]) C263324Kh.A06(r3.A0F, AnonymousClass91Q.class)) {
                r0.A00 = num;
            }
        }
    }
}
