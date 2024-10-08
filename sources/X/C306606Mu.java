package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6Mu  reason: invalid class name and case insensitive filesystem */
public final class C306606Mu {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public final ViewStub A04;

    public C306606Mu(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A04 = viewStub;
    }

    public final void A00() {
        ImageView imageView;
        TextView textView;
        if (this.A00 == null) {
            View inflate = this.A04.inflate();
            this.A00 = inflate;
            TextView textView2 = null;
            if (inflate != null) {
                imageView = (ImageView) inflate.findViewById(R.id.simple_action_icon);
            } else {
                imageView = null;
            }
            this.A01 = imageView;
            View view = this.A00;
            if (view != null) {
                textView = (TextView) view.findViewById(R.id.simple_action_title);
            } else {
                textView = null;
            }
            this.A03 = textView;
            View view2 = this.A00;
            if (view2 != null) {
                textView2 = (TextView) view2.findViewById(R.id.simple_action_subtitle);
            }
            this.A02 = textView2;
        }
    }
}
