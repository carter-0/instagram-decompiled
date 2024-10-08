package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.text.NumberFormat;

public final class U5b extends RelativeLayout {
    public Paint A00;
    public Paint A01;
    public TextView A02;
    public TextView A03;
    public int A04;
    public VY0 A05;

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getBarFullWidthPx()), (float) getPositionLineY(), this.A00);
        canvas2.drawLine((float) getLeftBound(), (float) getPositionLineY(), (float) (getLeftBound() + getResultBarEndPositionX()), (float) getPositionLineY(), this.A01);
    }

    private final int getPositionLineY() {
        return this.A03.getBottom() + getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
    }

    private final int getResponders() {
        VY0 vy0 = this.A05;
        if (vy0 != null) {
            return vy0.A00;
        }
        return 0;
    }

    public final void setAnswer(VY0 vy0) {
        String str;
        this.A05 = vy0;
        TextView textView = this.A03;
        if (vy0 == null || (str = vy0.A01) == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setTotalQuestionResponders(int i) {
        this.A04 = i;
        TextView textView = this.A02;
        textView.setText(getPercentageRounded());
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(329));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(8, this.A03.getId());
        textView.setLayoutParams(layoutParams2);
    }

    private final int getBarFullWidthPx() {
        return getWidth() - (getLeftBound() * 2);
    }

    private final int getLeftBound() {
        return getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
    }

    private final String getPercentageRounded() {
        String format = NumberFormat.getPercentInstance().format((double) (((float) getResponders()) / ((float) this.A04)));
        0qQ.A07(format);
        return format;
    }

    private final int getResultBarEndPositionX() {
        return JTO.A04(((float) getBarFullWidthPx()) * ((float) getResponders()), (float) this.A04);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-144233644);
        super.onSizeChanged(i, i2, i3, i4);
        setMinimumHeight(i2 + AnonymousClass7TE.A0E(getResources()));
        AnonymousClass0fD.A0D(1542421653, A06);
    }
}
