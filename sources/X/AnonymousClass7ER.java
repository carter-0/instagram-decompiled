package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.7ER  reason: invalid class name */
public final class AnonymousClass7ER implements C328007Db {
    public final C71662eb A00;

    public final void A00(AnonymousClass7AB r5) {
        int i;
        Integer num = r5.A00;
        C71662eb r0 = this.A00;
        if (num != null) {
            r0.A03(0);
            ImageView imageView = (ImageView) r0.A01();
            int intValue = num.intValue();
            if (intValue == 0) {
                i = R.drawable.instagram_lock_pano_outline_24;
            } else if (intValue == 1) {
                i = R.drawable.instagram_atom_pano_outline_24;
            } else {
                throw new RuntimeException();
            }
            imageView.setImageResource(i);
            return;
        }
        r0.A02();
    }

    public final View BJd() {
        View view;
        C71662eb r1 = this.A00;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7ER(C71662eb r1) {
        this.A00 = r1;
    }
}
