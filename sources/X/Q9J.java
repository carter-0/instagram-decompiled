package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class Q9J extends FrameLayout {
    public ImageView A00 = DbS.A0G(this, R.id.icon);
    public LinearLayout A01 = Pxe.A0M(this, R.id.container);
    public TextView A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q9J(Context context, String str) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(str, 2);
        this.A03 = str;
        addView(LayoutInflater.from(context).inflate(R.layout.ecp_incentive_tag, this, false));
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.text);
        this.A02 = A0d;
        String str2 = "textView";
        if (A0d != null) {
            A0d.setText(this.A03);
            TextView textView = this.A02;
            if (textView != null) {
                SPB A0A = AnonymousClass2E0.A0A();
                Context context2 = getContext();
                0qQ.A07(context2);
                textView.setTextColor(A0A.A03(context2, 66));
                ImageView imageView = this.A00;
                str2 = "iconView";
                if (imageView != null) {
                    C9659Red.A00((Context) null, imageView, RH3.A0d);
                    ImageView imageView2 = this.A00;
                    if (imageView2 != null) {
                        SPB A0A2 = AnonymousClass2E0.A0A();
                        0qQ.A07(context2);
                        imageView2.setColorFilter(A0A2.A03(context2, 66));
                        LinearLayout linearLayout = this.A01;
                        if (linearLayout == null) {
                            str2 = "container";
                        } else {
                            Drawable background = linearLayout.getBackground();
                            0qQ.A0C(background, C273654mx.A00(0));
                            AnonymousClass2E0.A0A();
                            ((GradientDrawable) background).setColor(context2.getColor(R.color.igds_separator));
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getText() {
        return this.A03;
    }
}
