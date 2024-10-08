package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.OzH  reason: case insensitive filesystem */
public final class C72249OzH implements C2365734g {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C316136lA A02;

    public C72249OzH(UserSession userSession, C255773uh r2, C316136lA r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void DKS(View view) {
        ImageView imageView;
        int i;
        0qQ.A0B(view, 0);
        C316136lA r3 = this.A02;
        r3.A0R = view;
        String str = this.A01.A0j;
        0qQ.A07(str);
        List A0H = 1Au.A00(this.A00).A0H();
        if (A0H == null) {
            A0H = AnonymousClass7TE.A1C();
        }
        boolean contains = A0H.contains(str);
        View findViewById = view.findViewById(R.id.whatsapp_share_icon);
        boolean z = findViewById instanceof IgSimpleImageView;
        if (contains) {
            if (z && (imageView = (ImageView) findViewById) != null) {
                i = R.drawable.instagram_app_whatsapp_filled_24;
            }
            r3.A0g = AnonymousClass7TE.A0d(view, R.id.whatsapp_share_label);
        }
        if (z && (imageView = (ImageView) findViewById) != null) {
            i = R.drawable.instagram_app_whatsapp_pano_outline_24;
        }
        r3.A0g = AnonymousClass7TE.A0d(view, R.id.whatsapp_share_label);
        imageView.setImageResource(i);
        r3.A0g = AnonymousClass7TE.A0d(view, R.id.whatsapp_share_label);
    }
}
