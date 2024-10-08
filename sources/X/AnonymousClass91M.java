package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.91M  reason: invalid class name */
public abstract class AnonymousClass91M {
    public static final TextPaint A00 = new TextPaint();
    public static final Pattern A01 = Pattern.compile("@(\\w|\\.){1,30}");
    public static final int[] A02 = {-759742, -726206};

    public static final SpannedString A02(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        Resources resources = context.getResources();
        String string = resources.getString(2131966138);
        0qQ.A07(string);
        if (C346897vw.A01(userSession)) {
            String lowerCase = string.toLowerCase(AnonymousClass1Q2.A02());
            0qQ.A07(lowerCase);
            return AJB.A01(resources, lowerCase, new int[]{context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange))}, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        } else if (!AnonymousClass7TF.A0R(0Tu.A05, userSession, 36323028048554742L).booleanValue()) {
            return AJB.A02(resources, string, new int[]{context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange)), context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange))}, -1, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        } else {
            return AJB.A02(resources, string, new int[]{context.getColor(R.color.pink_6), context.getColor(R.color.pink_6)}, context.getColor(R.color.pink_0), resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        }
    }

    public static final C347017w8 A04(Context context, UserSession userSession, C387369m6 r26) {
        String lowerCase;
        C387369m6 r13 = r26;
        String str = r13.A04;
        User user = r13.A03;
        int i = r13.A01;
        ArrayList arrayList = new ArrayList();
        UserSession userSession2 = userSession;
        Iterator it = new C41536Ave(userSession2).entrySet().iterator();
        while (true) {
            Context context2 = context;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AnonymousClass6MW r7 = (AnonymousClass6MW) entry.getKey();
                C369508us r6 = new C369508us(context2, user, (String) entry.getValue(), i);
                0qQ.A0B(r7, 4);
                Resources resources = context2.getResources();
                0qQ.A07(resources);
                boolean A0O = 03t.A0O(r7, new AnonymousClass6MW[]{AnonymousClass6MW.A06, AnonymousClass6MW.A0B, AnonymousClass6MW.A0A});
                int i2 = R.dimen.clips_template_landing_page_template_preview_clip_index_text_size;
                if (A0O) {
                    i2 = R.dimen.avatar_search_sticker_tray_text_size;
                }
                C394219xj r0 = C394219xj.$redex_init_class;
                int color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_creation_tools_orange));
                boolean z = r7.A02;
                int i3 = R.dimen.abc_edit_text_inset_bottom_material;
                if (z) {
                    i3 = R.dimen.abc_edit_text_inset_top_material;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i3);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                0qQ.A0B(str, 0);
                Locale A022 = AnonymousClass1Q2.A02();
                if (z) {
                    lowerCase = str.toUpperCase(A022);
                } else {
                    lowerCase = str.toLowerCase(A022);
                }
                0qQ.A07(lowerCase);
                r6.A0L(new SpannableStringBuilder(lowerCase));
                int dimensionPixelSize3 = resources.getDimensionPixelSize(i2);
                r6.A0I(AnonymousClass0qo.A00(context2).A02(r7.A01));
                AJB.A0B(r6, (float) dimensionPixelSize3, (float) dimensionPixelSize2, (float) dimensionPixelSize);
                Spannable spannable = r6.A0F;
                0qQ.A07(spannable);
                Resources resources2 = resources;
                Spannable spannable2 = spannable;
                Context context3 = context2;
                C394229xk.A00(context3, resources2, spannable2, r7, color, dimensionPixelSize2, dimensionPixelSize);
                arrayList.add(r6);
            } else {
                C347017w8 r02 = new C347017w8(context2, userSession2, arrayList);
                r02.A03 = r13;
                return r02;
            }
        }
    }

    public static final CharSequence A05(int i, CharSequence charSequence) {
        int i2 = i;
        while (-1 < i2 && charSequence.charAt(i2) != ' ' && charSequence.charAt(i2) != 10) {
            if (charSequence.charAt(i2) == '@') {
                return charSequence.subSequence(i2 + 1, i + 1);
            }
            i2--;
        }
        return null;
    }

    public static final void A06(EditText editText, int i, int i2) {
        float f;
        EditText editText2 = editText;
        0qQ.A0B(editText, 0);
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            TextPaint textPaint = A00;
            textPaint.set(editText.getPaint());
            int i3 = 2;
            int i4 = (int) (((float) i) * 2.0f);
            int floor = ((int) Math.floor((double) (((float) (i4 - 2)) / 2.0f))) + 2;
            while (true) {
                f = ((float) floor) / 2.0f;
                if (i3 >= floor) {
                    break;
                }
                String obj = editText2.getText().toString();
                textPaint.setTextSize(f);
                int i5 = i2;
                if (((float) i5) <= textPaint.measureText(obj) || new StaticLayout(obj, textPaint, i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).getLineCount() != 1) {
                    i4 = floor;
                } else {
                    i3 = floor;
                }
                floor = ((int) Math.floor((double) (((float) (i4 - i3)) / 2.0f))) + i3;
            }
        } else {
            f = (float) i;
        }
        editText2.setTextSize(0, f);
    }

    public static final C347017w8 A03(Context context, UserSession userSession, C387369m6 r20) {
        C387369m6 r4 = r20;
        String str = r4.A04;
        float f = r4.A00;
        User user = r4.A03;
        Context context2 = context;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        int i = r4.A01;
        ArrayList arrayList = new ArrayList();
        0Tu r11 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (AnonymousClass7TF.A0R(r11, userSession2, 36323028048554742L).booleanValue()) {
            Context context3 = context2;
            C387159ll r13 = new C387159ll(context3, user, AnonymousClass05K.A00, "mention_sticker_valentines", i);
            float f2 = (float) dimensionPixelSize;
            AJB.A05(context3, userSession2, r13, f, f2, f2);
            r13.A0L(A00(context2, str));
            arrayList.add(r13);
        }
        C369508us r12 = new C369508us(context2, user, "mention_sticker_gradient", i);
        float f3 = (float) dimensionPixelSize;
        float f4 = f3;
        AJB.A05(context2, userSession2, r12, f, f3, f4);
        r12.A0L(A01(context2, str));
        arrayList.add(r12);
        C369508us r132 = new C369508us(context2, user, "mention_sticker_subtle", i);
        AJB.A05(context2, userSession2, r132, f, f4, f4);
        Resources resources = context2.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        AJB.A04(context2, spannableStringBuilder, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        r132.A0L(spannableStringBuilder);
        arrayList.add(r132);
        C369508us r15 = new C369508us(context2, user, "mention_sticker_rainbow", i);
        float f5 = f4;
        AJB.A05(context2, userSession2, r15, f, f5, f4);
        Resources resources2 = context2.getResources();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        0qQ.A0A(resources2);
        AJB.A0A(resources2, spannableStringBuilder2, AnonymousClass5BH.A01, resources2.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        r15.A0L(spannableStringBuilder2);
        arrayList.add(r15);
        C369508us r14 = new C369508us(context2, user, "mention_sticker_hero", i);
        AJB.A05(context2, userSession2, r14, f, f4, f5);
        Resources resources3 = context2.getResources();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
        0qQ.A0A(resources3);
        AJB.A03(context2, resources3, spannableStringBuilder3, resources3.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
        r14.A0L(spannableStringBuilder3);
        arrayList.add(r14);
        if (AnonymousClass7TF.A0R(r11, userSession2, 36323028048554742L).booleanValue()) {
            Context context4 = context2;
            C387159ll r112 = new C387159ll(context4, user, AnonymousClass05K.A01, "mention_sticker_anti_valentines", i);
            AJB.A05(context4, userSession2, r112, f, f4, f5);
            Resources resources4 = context2.getResources();
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str);
            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            0qQ.A0A(resources4);
            AJB.A09(resources4, spannableStringBuilder4, dimensionPixelSize2, context2.getColor(R.color.igds_prism_black), context2.getColor(R.color.design_dark_default_color_on_background));
            r112.A0L(spannableStringBuilder4);
            arrayList.add(r112);
        }
        C347017w8 r0 = new C347017w8(context2, userSession2, arrayList);
        r0.A03 = r4;
        return r0;
    }

    public static final SpannableStringBuilder A00(Context context, String str) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        0qQ.A0A(resources);
        AJB.A09(resources, spannableStringBuilder, dimensionPixelSize, context.getColor(R.color.pink_0), context.getColor(R.color.pink_6));
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A01(Context context, String str) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        0qQ.A0A(resources);
        AJB.A09(resources, spannableStringBuilder, dimensionPixelSize, -1, context.getColor(2Yu.A0H(context, R.attr.igds_color_creation_tools_orange)));
        return spannableStringBuilder;
    }
}
