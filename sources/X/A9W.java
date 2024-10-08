package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

public final class A9W {
    public int A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06;
    public final ConstrainedEditText A07;
    public final Runnable A08 = new C40853AkN(this);
    public final boolean A09;
    public final int A0A;

    public final void A00(Integer num, boolean z) {
        ImageView imageView;
        Context context;
        int i;
        if (this.A09 && this.A01 != num) {
            this.A01 = num;
            int intValue = num.intValue();
            if (intValue != 0) {
                imageView = this.A06;
                if (intValue != 1) {
                    imageView.setImageResource(R.drawable.instagram_text_bg_frost_filled_44);
                    context = imageView.getContext();
                    i = 2131975104;
                } else {
                    imageView.setImageResource(R.drawable.instagram_text_bg_filled_44);
                    context = imageView.getContext();
                    i = 2131975106;
                }
            } else {
                imageView = this.A06;
                imageView.setImageResource(R.drawable.instagram_text_bg_outline_44);
                context = imageView.getContext();
                i = 2131975105;
            }
            imageView.setContentDescription(context.getString(i));
            A01(z);
            Integer num2 = this.A01;
            Integer num3 = AnonymousClass05K.A00;
            ConstrainedEditText constrainedEditText = this.A07;
            if (num2 == num3) {
                constrainedEditText.setShadowLayer(this.A04, 0.0f, this.A03, this.A05);
                return;
            }
            constrainedEditText.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            C306486Mi.A00(constrainedEditText, this.A02, true);
        }
    }

    public final void A01(boolean z) {
        boolean z2;
        int i;
        int A082;
        if (this.A09) {
            ConstrainedEditText constrainedEditText = this.A07;
            Editable text = constrainedEditText.getText();
            if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text.toString().trim())) {
                int i2 = this.A00;
                Integer num = this.A01;
                Integer num2 = AnonymousClass05K.A0C;
                if (num == num2 && i2 == -1) {
                    i2 = this.A0A;
                }
                0qQ.A0B(num, 3);
                float textSize = constrainedEditText.getTextSize();
                float f = textSize * 0.3f;
                float f2 = textSize * 0.2f;
                float f3 = textSize / 4.0f;
                constrainedEditText.onPreDraw();
                Editable text2 = constrainedEditText.getText();
                Layout layout = constrainedEditText.getLayout();
                if (text2 != null && layout != null) {
                    Class<AnonymousClass6MO> cls = AnonymousClass6MO.class;
                    if (!z) {
                        AnonymousClass6MO[] r11 = (AnonymousClass6MO[]) C263324Kh.A06(text2, cls);
                        int length = r11.length;
                        int i3 = 0;
                        z2 = false;
                        i = 0;
                        while (i3 < length) {
                            AnonymousClass6MO r0 = r11[i3];
                            i = r0.A00;
                            text2.removeSpan(r0);
                            i3++;
                            z2 = true;
                        }
                    } else {
                        C263324Kh.A05(text2, cls);
                        z2 = false;
                        i = 0;
                    }
                    if (num != AnonymousClass05K.A00) {
                        if (!z2) {
                            if (num == num2) {
                                i = 0nH.A03(i2);
                            } else {
                                i = i2;
                            }
                        }
                        AnonymousClass6MO r4 = new AnonymousClass6MO(C306496Mj.A02(layout, f, f2, f2, f3, 1.0f), f3, i);
                        text2.setSpan(r4, 0, text2.length(), 18);
                        if (z) {
                            C263324Kh.A05(text2, C358848bZ.class);
                            if (num == AnonymousClass05K.A01 && (A082 = 0nH.A08(i, 1.0f)) != -1) {
                                text2.setSpan(new C358848bZ(AnonymousClass7TE.A0S(constrainedEditText), new TextColors(TextShadow.A03, A082)), 0, text2.length(), 18);
                            }
                        }
                        Object tag = constrainedEditText.getTag(R.id.text_background_predraw_listener_tag);
                        ViewTreeObserver viewTreeObserver = constrainedEditText.getViewTreeObserver();
                        if (tag != null) {
                            viewTreeObserver.removeOnPreDrawListener((AnonymousClass6MO) tag);
                        }
                        viewTreeObserver.addOnPreDrawListener(r4);
                        constrainedEditText.setTag(R.id.text_background_predraw_listener_tag, r4);
                    }
                }
            }
        }
    }

    public A9W(ImageView imageView, ConstrainedEditText constrainedEditText, float f, float f2, float f3, int i, int i2) {
        this.A07 = constrainedEditText;
        this.A06 = imageView;
        this.A0A = i;
        this.A05 = i2;
        this.A04 = f;
        this.A03 = f2;
        this.A02 = f3;
        boolean A1V = AnonymousClass7TF.A1V(imageView);
        this.A09 = A1V;
        if (A1V) {
            C386359kT.A01(AnonymousClass7TE.A0m(imageView), this, 28);
        }
    }
}
