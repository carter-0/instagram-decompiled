package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.Iaz  reason: case insensitive filesystem */
public final class C57455Iaz implements C59614JQi {
    public IgImageView A00;
    public SimpleVideoLayout A01;

    public final IgImageView BGD() {
        IgImageView igImageView = this.A00;
        if (igImageView != null) {
            return igImageView;
        }
        0qQ.A0F("imagePlaceholder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SimpleVideoLayout CDv() {
        SimpleVideoLayout simpleVideoLayout = this.A01;
        if (simpleVideoLayout != null) {
            return simpleVideoLayout;
        }
        0qQ.A0F("videoContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CLR() {
        BGD().setVisibility(8);
    }

    public final void EuZ() {
        BGD().setVisibility(0);
    }
}
