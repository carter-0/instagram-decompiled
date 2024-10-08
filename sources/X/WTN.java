package X;

import android.graphics.ColorFilter;
import android.net.Uri;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.video.live.mvvm.view.likes.customviews.MixedReactionsView;
import java.io.IOException;

public final class WTN implements C240963Ni {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WTN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DEN() {
        switch (this.A00) {
            case 1:
                C51969G9p.A1M(this.A01);
                ((FZW) this.A02).A04.setVisibility(0);
                return;
            case 2:
                C20877X2e x2e = (C20877X2e) this.A02;
                View view = (View) this.A01;
                x2e.APe(new UTL(new IOException("Failed to load for unknown reasons").getMessage(), (String) null, view.getId(), 1, 0, 0));
                x2e.APe(new UTL((String) null, (String) null, view.getId(), 3, 0, 0));
                return;
            case 5:
                0sP r1 = ((MixedReactionsView) this.A02).A00;
                String str = ((C63819L8a) this.A01).A03;
                if (str == null) {
                    str = "";
                }
                r1.invoke(str);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Ujc, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void DO4(C240983Nk r12) {
        String obj;
        int i;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r12, 0);
                int i2 = r12.A00;
                if (i2 != 0 && (i = r12.A01) != 0) {
                    C358248ab.A01((IgImageView) this.A01, (C358248ab) this.A02, i2, i, R.dimen.ad_not_delivering_thumbnail_height);
                    return;
                }
                return;
            case 1:
                ((View) this.A01).setVisibility(0);
                ((FZW) this.A02).A04.setVisibility(8);
                return;
            case 2:
                ? r1 = (C15852Ujc) this.A01;
                Uri uri = r1.A00;
                if (uri == null) {
                    obj = null;
                } else {
                    obj = uri.toString();
                }
                int i3 = r12.A01;
                int i4 = r12.A00;
                C20877X2e x2e = (C20877X2e) this.A02;
                x2e.APe(new UTL((String) null, obj, r1.getId(), 2, i3, i4));
                x2e.APe(new UTL((String) null, (String) null, r1.getId(), 3, 0, 0));
                return;
            case 3:
                0qQ.A0B(r12, 0);
                ((C19276WSj) this.A02).A01.A09.invoke(this.A01, r12);
                return;
            case 4:
                ColorFilter colorFilter = (ColorFilter) this.A02;
                if (colorFilter != null) {
                    StackedAvatarView stackedAvatarView = (StackedAvatarView) this.A01;
                    if (stackedAvatarView.A02.getDrawable() != null) {
                        AnonymousClass7TG.A10(colorFilter, stackedAvatarView.A02.getDrawable());
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
