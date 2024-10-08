package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.List;

public final class W0K {
    public String A00;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final EditText A04;
    public final int[] A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final TransitionDrawable A0C;
    public final ImageView A0D;
    public final C15838UjO A0E;
    public final C15834UjK A0F;
    public final String A0G;
    public final int[] A0H;
    public final int[] A0I;

    public static void A00(W0K w0k) {
        boolean z = w0k.A01;
        View view = w0k.A03;
        if (z) {
            view.setBackground(w0k.A0B);
            w0k.A0D.setBackground(w0k.A0A);
            return;
        }
        view.setBackground(w0k.A0C);
        w0k.A0D.setBackground(w0k.A0E);
        A01(w0k, view.isSelected());
    }

    public static void A01(W0K w0k, boolean z) {
        C15838UjO ujO;
        Integer num;
        Integer num2;
        if (z) {
            boolean isSelected = w0k.A03.isSelected();
            ujO = w0k.A0E;
            if (!isSelected) {
                num2 = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A01;
                ujO.A01 = num;
                ujO.A02 = num;
                ujO.invalidateSelf();
            }
        } else {
            boolean A042 = w0k.A04();
            C15834UjK ujK = w0k.A0F;
            if (A042) {
                ujK.A08(w0k.A0H, w0k.A0I);
            } else {
                int[] iArr = w0k.A05;
                ujK.A08(iArr, iArr);
            }
            boolean isSelected2 = w0k.A03.isSelected();
            ujO = w0k.A0E;
            if (isSelected2) {
                num2 = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A00;
                ujO.A01 = num;
                ujO.A02 = num;
                ujO.invalidateSelf();
            }
        }
        Integer num3 = ujO.A01;
        if (num3 == null) {
            ujO.A01 = num2;
            ujO.A02 = num2;
        } else {
            if (num3 != num2) {
                ujO.A02 = num3;
                ujO.A01 = num2;
            }
            ujO.A03 = true;
            ujO.A00 = System.currentTimeMillis();
            ujO.invalidateSelf();
        }
        ujO.invalidateSelf();
        ujO.A03 = true;
        ujO.A00 = System.currentTimeMillis();
        ujO.invalidateSelf();
    }

    public final void A03(boolean z) {
        int i;
        int i2;
        View view = this.A03;
        if (!view.isSelected() && z) {
            this.A0C.startTransition(150);
        } else if (view.isSelected() && !z) {
            this.A0C.reverseTransition(150);
        } else if (!view.isSelected() && !z) {
            this.A0C.resetTransition();
        }
        EditText editText = this.A04;
        if (z) {
            i = this.A09;
        } else {
            i = this.A07;
        }
        editText.setTextColor(i);
        if (z) {
            i2 = this.A08;
        } else {
            i2 = this.A06;
        }
        editText.setHintTextColor(i2);
        A01(this, z);
        view.setSelected(z);
    }

    public final boolean A04() {
        return TextUtils.isEmpty(AnonymousClass7TF.A0f(this.A04).trim());
    }

    public W0K(View view, C21026XAf xAf, WBN wbn, int i) {
        int[] iArr = new int[2];
        this.A05 = iArr;
        Context context = view.getContext();
        this.A03 = view;
        this.A02 = i;
        this.A04 = DbU.A0E(view, R.id.quiz_sticker_answer_text);
        ImageView A0F2 = DbU.A0F(view, R.id.quiz_sticker_answer_icon);
        this.A0D = A0F2;
        this.A07 = context.getColor(R.color.countdown_sticker_title_text_color);
        int A092 = AnonymousClass7TE.A09(context);
        this.A09 = A092;
        this.A06 = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A08 = context.getColor(R.color.clips_segment_buttons_color_disabled);
        int color = context.getColor(R.color.direct_light_mode_glyph_color_tertiary);
        this.A0H = new int[]{color, color};
        int color2 = context.getColor(R.color.direct_dark_mode_composer_hint_text_color);
        this.A0I = new int[]{color2, color2};
        iArr[0] = -14277082;
        iArr[1] = -14277082;
        C15834UjK ujK = new C15834UjK(context, context.getResources().getStringArray(R.array.quiz_sticker_answer_row_options)[i]);
        this.A0F = ujK;
        TransitionDrawable transitionDrawable = (TransitionDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_row_background_refreshed);
        this.A0C = transitionDrawable;
        this.A0B = context.getDrawable(R.drawable.quiz_sticker_editor_answer_row_hint_background);
        this.A0A = context.getDrawable(R.drawable.quiz_sticker_editor_answer_icon_hint);
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        AnonymousClass7TE.A1R(drawable.mutate(), A092);
        C15838UjO ujO = new C15838UjO(ujK, drawable, 150);
        this.A0E = ujO;
        Integer num = AnonymousClass05K.A00;
        ujO.A01 = num;
        ujO.A02 = num;
        ujO.invalidateSelf();
        A0F2.setBackground(ujO);
        this.A0G = context.getString(2131971243);
        transitionDrawable.resetTransition();
        this.A03.setOnTouchListener(new C18899WBr(10, this, wbn));
        EditText editText = this.A04;
        editText.setOnFocusChangeListener(wbn);
        editText.setOnEditorActionListener(wbn);
        C16304UsX usX = new C16304UsX();
        C16302UsV usV = new C16302UsV(editText, 2);
        List list = usX.A00;
        list.add(usV);
        list.add(new C16305UsY(2, this, wbn));
        editText.addTextChangedListener(usX);
        A02(xAf);
        A03(false);
    }

    public final void A02(C21026XAf xAf) {
        boolean z;
        String str;
        if (xAf.CUj() != null) {
            z = xAf.CUj().booleanValue();
        } else {
            z = false;
        }
        this.A01 = z;
        EditText editText = this.A04;
        editText.setText(xAf.getText());
        if (xAf.BDf() != null) {
            str = xAf.BDf();
        } else {
            str = "";
        }
        this.A00 = str;
        if (this.A01) {
            str = this.A0G;
        }
        editText.setHint(str);
        this.A03.setSelected(false);
        A03(false);
        A00(this);
    }
}
