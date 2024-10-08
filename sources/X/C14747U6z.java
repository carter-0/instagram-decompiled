package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.ui.EffectSlider;
import org.webrtc.CameraCapturer;

/* renamed from: X.U6z  reason: case insensitive filesystem */
public final class C14747U6z extends ConstraintLayout implements C41835B2q, X1Q {
    public X1P A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final ImageView A04;
    public final TextView A05 = DbW.A0B(this, R.id.slider_value_text);
    public final C358088aL A06;
    public final EffectSlider A07;
    public final Guideline A08;

    public C14747U6z(Context context, C358088aL r10) {
        super(context, (AttributeSet) null, 0);
        this.A06 = r10;
        EffectSlider effectSlider = (EffectSlider) AnonymousClass7TE.A0b(this, R.id.secondary_slider);
        this.A07 = effectSlider;
        ImageView imageView = (ImageView) AnonymousClass7TE.A0b(this, R.id.tool_icon);
        this.A04 = imageView;
        this.A08 = AnonymousClass7TE.A0b(this, R.id.guideline);
        Resources resources = getResources();
        this.A03 = resources.getDimensionPixelOffset(R.dimen.ad_not_delivering_thumbnail_height);
        this.A02 = resources.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_width);
        C66581MXm.A1B(LayoutInflater.from(context).inflate(R.layout.layout_secondary_slider_view, this, true), this.A03, this.A02);
        setClickable(true);
        if (r10 == C358088aL.A0u) {
            imageView.setVisibility(8);
            C270354gb A0C = JTQ.A0C(this);
            A0C.A09(R.id.slider_value_text, 4);
            C270354gb.A02(A0C, R.id.slider_value_text).A03.A0p = resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
            A0C.A0G(this);
            effectSlider.setSliderThickness(C16532Uwc.SLIM);
            effectSlider.setSliderVibrationAction(C16533Uwd.ON_ALL_VALUES);
            effectSlider.setSliderHandle(true);
        }
        effectSlider.A05 = true;
        effectSlider.A03 = this;
    }

    public final boolean AFg() {
        return true;
    }

    public final void DVQ(float f) {
    }

    public final void setSecondarySliderValues(C39637A3b a3b) {
        0qQ.A0B(a3b, 0);
        EffectSlider effectSlider = this.A07;
        effectSlider.A02 = 10;
        effectSlider.A01 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
        effectSlider.setSeekValue(a3b.A00);
    }

    private final void A00(C270354gb r3, int i, boolean z) {
        int i2;
        int id;
        if (z) {
            i2 = this.A08.getId();
        } else {
            i2 = 0;
        }
        r3.A0D(i, 1, i2, 1);
        if (z) {
            id = 0;
        } else {
            id = this.A08.getId();
        }
        r3.A0D(i, 2, id, 2);
    }

    public int getMenuHeight() {
        return this.A02;
    }

    public int getMenuWidth() {
        return this.A03;
    }

    public View getView() {
        return this;
    }

    public void setIsOnRightSide(boolean z) {
        this.A01 = z;
        C270354gb A0C = JTQ.A0C(this);
        A00(A0C, this.A07.getId(), !this.A01);
        A00(A0C, this.A04.getId(), this.A01);
        A00(A0C, this.A05.getId(), this.A01);
        A0C.A0G(this);
    }

    public final void setListener(X1P x1p) {
        this.A00 = x1p;
    }

    public final void setToolDrawable(Drawable drawable) {
        this.A04.setImageDrawable(drawable);
    }
}
