package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9Yy  reason: invalid class name and case insensitive filesystem */
public final class C380639Yy extends C249703kE implements XC0 {
    public final View A00;
    public final IgImageView A01;
    public final C262094Cc A02 = new AnonymousClass19G((C262204Co) null);

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A00);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A00);
    }

    public final void CLk() {
        this.A00.setVisibility(8);
    }

    public final void Ev3() {
        this.A00.setVisibility(0);
    }

    public C380639Yy(View view) {
        super(view);
        this.A00 = view;
        this.A01 = AnonymousClass7TF.A0F(view, R.id.memory_item_thumbnail);
    }
}
