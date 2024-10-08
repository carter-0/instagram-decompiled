package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.7EN  reason: invalid class name */
public final class AnonymousClass7EN implements C328007Db {
    public final C71662eb A00;
    public final C333107Xr A01;

    public final void A00(AnonymousClass76V r7) {
        View A012 = this.A00.A01();
        0qQ.A07(A012);
        AnonymousClass0fU.A00(new AnonymousClass76Y(this, r7), A012);
        ImageView imageView = (ImageView) A012.requireViewById(R.id.save_to_collection_shortcut_button);
        Context context = A012.getContext();
        int i = r7.A00;
        int i2 = R.drawable.instagram_save_pano_outline_16;
        if (i == 1) {
            i2 = R.drawable.instagram_save_pano_filled_16;
        }
        imageView.setImageDrawable(context.getDrawable(i2));
        int i3 = 8;
        if (!r7.A09) {
            i3 = 0;
        }
        A012.setVisibility(i3);
    }

    public final View BJd() {
        C71662eb r1 = this.A00;
        if (r1.A00 != null) {
            View A012 = r1.A01();
            0qQ.A0A(A012);
            return A012;
        }
        ViewStub viewStub = r1.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EN(C71662eb r1, C333107Xr r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
