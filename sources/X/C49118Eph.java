package X;

import android.content.Context;
import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Eph  reason: case insensitive filesystem */
public abstract class C49118Eph {
    public static final void A00(Context context, View view, String str, boolean z) {
        0qQ.A0B(context, 2);
        if (!z || view == null) {
            if (str == null) {
                str = 02K.A01(context).getString(2131965058);
                0qQ.A07(str);
            }
            C59689JTv.A09(context, str);
            return;
        }
        IgTextView A0Z = DbX.A0Z(view, R.id.label);
        IgImageView A0b = DbX.A0b(view, R.id.button);
        A0Z.setText(2131956742);
        A0b.setImageResource(R.drawable.instagram_check_pano_outline_24);
        AnonymousClass7TF.A0D().postDelayed(new C51486Fuu(A0Z, A0b, str), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }
}
