package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.smartcapture.ui.SCImageView;

public final class QAA extends ScrollView {
    public TextView A00;
    public TextView A01;
    public SCImageView A02;

    public void set(C10681RwK rwK) {
        String str;
        0qQ.A0B(rwK, 0);
        int i = rwK.A01;
        int i2 = rwK.A00;
        Drawable drawable = rwK.A03;
        TextView textView = this.A01;
        if (textView == null) {
            str = "titleView";
        } else {
            textView.setText(i);
            TextView textView2 = this.A00;
            if (textView2 == null) {
                str = "subtitleView";
            } else {
                textView2.setText(i2);
                str = "imageView";
                if (drawable != null) {
                    SCImageView sCImageView = this.A02;
                    if (sCImageView != null) {
                        sCImageView.setLayerType(0, (Paint) null);
                        SCImageView sCImageView2 = this.A02;
                        if (sCImageView2 != null) {
                            sCImageView2.setImageAlpha(255);
                            SCImageView sCImageView3 = this.A02;
                            if (sCImageView3 != null) {
                                sCImageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                                SCImageView sCImageView4 = this.A02;
                                if (sCImageView4 != null) {
                                    sCImageView4.setImageDrawable(drawable);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
