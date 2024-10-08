package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lL  reason: invalid class name and case insensitive filesystem */
public final class C316246lL {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass61R A09;
    public boolean A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final UserSession A0D;

    public C316246lL(ViewStub viewStub, ViewStub viewStub2, UserSession userSession) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(viewStub2, 2);
        this.A0D = userSession;
        this.A0C = viewStub;
        this.A0B = viewStub2;
    }

    public static final void A00(C316246lL r2, int i, int i2, int i3, int i4) {
        try {
            AnonymousClass61R r22 = r2.A09;
            if (r22 != null) {
                C305716Jg.A00(new 2dn(i, i2, i3, i4), r22.A01);
                r22.EL2(0.0f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            0wb.A03("ReelViewerCTAShuffleButtonViewBinder", 002.A0R("Exception during muting dice color: ", e.getMessage()));
        }
    }

    public final void A01() {
        Integer num;
        if (this.A04 == null) {
            View inflate = this.A0B.inflate();
            this.A04 = inflate;
            View requireViewById = inflate.requireViewById(R.id.cta_shuffle_button);
            this.A02 = requireViewById;
            0qQ.A07(requireViewById);
            View requireViewById2 = inflate.requireViewById(R.id.cta_shuffle_button_post_dwell);
            this.A03 = requireViewById2;
            0qQ.A07(requireViewById2);
            this.A05 = (ImageView) requireViewById.requireViewById(R.id.cta_shuffle_button_icon);
            this.A07 = (TextView) requireViewById.requireViewById(R.id.cta_shuffle_button_text);
            this.A06 = (ImageView) requireViewById2.requireViewById(R.id.cta_shuffle_button_icon);
            this.A08 = (TextView) requireViewById2.requireViewById(R.id.cta_shuffle_button_text);
            requireViewById2.setAlpha(0.0f);
            Integer num2 = null;
            Context context = inflate.getContext();
            if (context != null) {
                requireViewById.setBackgroundResource(R.drawable.story_cta_button_semi_transparent_background);
                TextView textView = this.A07;
                if (textView != null) {
                    textView.setTextColor(02K.A02(context, R.color.cta_button_white_text_pressed_color_states));
                }
                requireViewById2.setBackgroundResource(R.drawable.story_cta_button_white_background);
                TextView textView2 = this.A08;
                if (textView2 != null) {
                    textView2.setTextColor(02K.A02(context, R.color.cta_button_black_text_pressed_color_states));
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    num = Integer.valueOf(resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                } else {
                    num = null;
                }
                Resources resources2 = context.getResources();
                if (resources2 != null) {
                    num2 = Integer.valueOf(resources2.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                }
                if (num != null) {
                    int intValue = num.intValue();
                    0nA.A0Z(requireViewById, intValue);
                    0nA.A0Z(requireViewById2, intValue);
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    0nA.A0b(requireViewById, intValue2);
                    0nA.A0b(requireViewById2, intValue2);
                }
                Resources resources3 = context.getResources();
                if (resources3 != null) {
                    int dimensionPixelSize = resources3.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                    if (Integer.valueOf(dimensionPixelSize) != null) {
                        0nA.A0T(requireViewById, dimensionPixelSize);
                        0nA.A0T(requireViewById2, dimensionPixelSize);
                    }
                }
                this.A01 = context.getColor(R.color.design_dark_default_color_on_background);
                this.A00 = context.getColor(R.color.grey_9);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view = this.A04;
        if (view != null) {
            this.A09 = C303756Aq.A00(view.getContext(), R.raw.canvas_dice_animation);
        }
        AnonymousClass61R r1 = this.A09;
        if (r1 != null) {
            r1.AB9(true);
        }
    }

    public final void A02() {
        A00(this, Color.red(this.A01), Color.green(this.A01), Color.blue(this.A01), Color.alpha(this.A01));
    }
}
