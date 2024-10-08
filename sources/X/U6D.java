package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.facebook.fbreact.views.slider.ReactSliderManager;

public final class U6D extends AppCompatSeekBar {
    public double A00 = 0.0d;
    public double A01 = 0.0d;
    public double A02 = 0.0d;
    public double A03 = 0.0d;
    public double A04 = 0.0d;

    public U6D(Context context) {
        super(context, (AttributeSet) null, ReactSliderManager.STYLE);
    }

    private void A00() {
        if (this.A03 == 0.0d) {
            this.A04 = (this.A00 - this.A01) / 128.0d;
        }
        setMax(getTotalSteps());
        double d = this.A02;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * ((double) getTotalSteps())));
    }

    private double getStepValue() {
        double d = this.A03;
        if (d <= 0.0d) {
            return this.A04;
        }
        return d;
    }

    private int getTotalSteps() {
        return JTP.A01(this.A00 - this.A01, getStepValue());
    }

    public void setMaxValue(double d) {
        this.A00 = d;
        A00();
    }

    public void setMinValue(double d) {
        this.A01 = d;
        A00();
    }

    public void setStep(double d) {
        this.A03 = d;
        A00();
    }

    public void setValue(double d) {
        this.A02 = d;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * ((double) getTotalSteps())));
    }

    public final double A01(int i) {
        if (i == getMax()) {
            return this.A00;
        }
        return (((double) i) * getStepValue()) + this.A01;
    }
}
