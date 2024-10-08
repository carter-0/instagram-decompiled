package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;

public final class U69 extends C3021161q implements C20938X5g {
    public final /* synthetic */ WDU A00;

    public final boolean Cqt() {
        return false;
    }

    public final boolean Cqu() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U69(Context context, WDU wdu) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.A00 = wdu;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new U6O(this, this, wdu));
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A04();
        }
        return true;
    }

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
