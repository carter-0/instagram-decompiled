package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vbn  reason: case insensitive filesystem */
public final class C17657Vbn {
    public ViewGroup A00;
    public IgImageView A01;
    public IgImageView A02;
    public IgImageView A03;
    public final ViewStub A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;

    public C17657Vbn(View view) {
        0qQ.A0B(view, 1);
        this.A07 = DbX.A0b(view, R.id.business_profile_pic);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.business_name);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.business_category);
        this.A04 = JTR.A0X(view, R.id.grid_image_container_stub);
    }
}
