package X;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

public final class LWO implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LWO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 0:
                KXg kXg = (KXg) this.A02;
                DbS.A1a(kXg, AnonymousClass7TF.A0f((EditText) this.A01), kXg.A0B, KXg.A0D, 0);
                KXg.A07(kXg);
                return;
            case 1:
                KXf kXf = (KXf) this.A02;
                kXf.A03 = DbV.A12(AnonymousClass7TF.A0f((EditText) this.A01));
                KXf.A06(kXf);
                return;
            default:
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        if (2 - this.A00 == 0) {
            0qQ.A0B(charSequence, 0);
            LO9 lo9 = (LO9) this.A02;
            K6D k6d = lo9.A02;
            String obj = charSequence.toString();
            0qQ.A0B(obj, 0);
            C60952JuA juA = k6d.A03;
            if (juA == null) {
                str = "viewState";
            } else {
                UpcomingEvent upcomingEvent = juA.A01;
                C62569Khz khz = juA.A00;
                Date date = juA.A04;
                Date date2 = juA.A03;
                boolean z = juA.A05;
                boolean z2 = juA.A06;
                AnonymousClass7TG.A1O(khz, obj);
                k6d.A03 = new C60952JuA(khz, upcomingEvent, obj, date, date2, z, z2);
                LBP lbp = k6d.A02;
                if (lbp == null) {
                    str = "viewHolder";
                } else {
                    K6D.A00(lbp.A0D, k6d);
                    LBP lbp2 = lo9.A03;
                    View view = (View) this.A01;
                    int length = charSequence.length();
                    ImageView imageView = lbp2.A07;
                    if (length == 0) {
                        imageView.setImageDrawable((Drawable) null);
                        return;
                    }
                    DbU.A13(view.getContext(), imageView, R.drawable.instagram_x_pano_outline_12);
                    LY7.A00(imageView, 56, view, lo9);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
