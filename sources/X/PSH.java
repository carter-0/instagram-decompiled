package X;

import android.graphics.drawable.shapes.RectShape;
import android.widget.ImageView;
import com.instagram.feed.widget.IgProgressImageView;

public final class PSH implements 1aV {
    public final /* synthetic */ C66819MdB A00;
    public final /* synthetic */ IgProgressImageView A01;

    public PSH(C66819MdB mdB, IgProgressImageView igProgressImageView) {
        this.A01 = igProgressImageView;
        this.A00 = mdB;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C70603ODa oDa = (C70603ODa) obj;
        AnonymousClass77D r1 = new AnonymousClass77D(new RectShape(), AnonymousClass77E.A00);
        r1.A00 = oDa.A01;
        r1.A02 = false;
        AnonymousClass77D.A00(r1);
        IgProgressImageView igProgressImageView = this.A01;
        igProgressImageView.setBitmapAndImageRenderer(oDa.A02, r1);
        C66819MdB mdB = this.A00;
        mdB.DQn(PA7.A00);
        mdB.Ddt();
        igProgressImageView.setAspectRatio(oDa.A00);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
