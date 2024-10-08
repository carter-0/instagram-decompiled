package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.9Yw  reason: invalid class name and case insensitive filesystem */
public final class C380619Yw extends C249703kE implements C252203oj {
    public int A00;
    public ObjectAnimator A01;
    public AnonymousClass8AO A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final View A08;
    public final IgTextView A09;
    public final IgImageView A0A;
    public final C71662eb A0B;
    public final BubbleSpinner A0C;

    public final void A02(boolean z) {
        A00(this, z, false);
        this.A07.setSelected(false);
        this.A08.setVisibility(8);
        this.A0A.setColorFilter((ColorFilter) null);
        C71662eb r1 = this.A0B;
        if (r1.A00() != 8) {
            ((TextView) r1.A01()).setTextColor(-1);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public static void A00(C380619Yw r6, boolean z, boolean z2) {
        if (!r6.A05) {
            r6.A0A.setBackgroundResource(0);
            return;
        }
        IgImageView igImageView = r6.A0A;
        if (igImageView.getBackground() == null) {
            boolean z3 = r6.A04;
            int i = R.drawable.generic_effect_picker_background_color_state_list;
            if (z3) {
                i = R.drawable.square_text_format_picker_background_list;
            }
            igImageView.setBackgroundResource(i);
        }
        ObjectAnimator objectAnimator = r6.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        Drawable background = igImageView.getBackground();
        background.getClass();
        if (z2) {
            r6.A01 = C61210lx.A00(background, background.getAlpha(), (int) (f * 255.0f), 250);
        } else {
            background.setAlpha((int) (f * 255.0f));
        }
    }

    public final void A01(float f) {
        this.A0A.setRotation(f);
        C71662eb r2 = this.A0B;
        if (r2.A00() != 8) {
            r2.A01().setRotation(f);
        }
    }

    public final void DmC(2cs r5) {
        AnonymousClass8AO r3 = this.A02;
        if (r3 != null) {
            r3.CvH((float) r5.A01);
        }
    }

    public final void DmE(2cs r4) {
        float f = (float) r4.A09.A00;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        View view = this.A07;
        if (i < 0) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            return;
        }
        view.setVisibility(0);
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public C380619Yw(View view, boolean z, boolean z2, boolean z3) {
        super(view);
        Context context = view.getContext();
        this.A06 = context;
        this.A07 = view;
        this.A0A = this.itemView.requireViewById(z3 ? R.id.new_fonts_text_format_picker_icon : R.id.generic_effect_picker_icon);
        this.A09 = this.itemView.requireViewById(R.id.new_fonts_text_format_picker_icon_new_badge);
        BubbleSpinner bubbleSpinner = (BubbleSpinner) this.itemView.requireViewById(R.id.effect_loading_spinner);
        this.A0C = bubbleSpinner;
        this.A08 = this.itemView.requireViewById(R.id.selected_ring);
        this.A0B = new C71662eb((ViewStub) this.itemView.findViewById(R.id.generic_effect_picker_text_label_stub));
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
        bubbleSpinner.setBubbleRadius(0nA.A00(context, 1.2f));
        this.A00 = context.getColor(R.color.snap_picker_effect_icon_tint_color);
    }
}
