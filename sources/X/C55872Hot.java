package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Hot  reason: case insensitive filesystem */
public final class C55872Hot {
    public View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ViewStub A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;

    public C55872Hot(View view) {
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A08 = DbX.A0Z(view, R.id.add_channels_prompt);
        this.A04 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.add_channels_badge_stub);
        this.A03 = DbX.A0I(view, R.id.tagged_channel_container);
        this.A07 = DbX.A0Z(view, R.id.tagged_channel_title);
        this.A06 = DbX.A0Z(view, R.id.tagged_channel_subtitle);
        this.A05 = DbX.A0Y(view, R.id.add_channels_chevron);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.remove_tagged_channel_button);
    }
}
