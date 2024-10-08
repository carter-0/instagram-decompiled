package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

public final class KI1 extends IgImageView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C63909LBs A04;
    public final UserSession A05;
    public final AtomicBoolean A06 = JTQ.A0k();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.KI1, android.widget.ImageView] */
    public KI1(UserSession userSession, Context context) {
        super(context, (AttributeSet) null);
        this.A05 = userSession;
        this.A04 = new C63909LBs(context);
        setImageResource(R.drawable.instagram_wave_pano_outline_24);
    }
}
