package X;

import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.3yl  reason: invalid class name and case insensitive filesystem */
public final class C258283yl {
    public static final /* synthetic */ AnonymousClass0YZ[] A05;
    public C57411IaH A00;
    public final C71662eb A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C377219Kz(this, 29));
    public final 0w6 A03;
    public final 0w6 A04;

    static {
        Class<C258283yl> cls = C258283yl.class;
        A05 = new AnonymousClass0YZ[]{new 01B(cls, "thumbnail", "getThumbnail()Lcom/instagram/common/ui/widget/imageview/IgImageView;", 0), new 01B(cls, "dismissButton", "getDismissButton()Landroid/view/View;", 0)};
    }

    public C258283yl(ViewStub viewStub) {
        C71662eb r2 = new C71662eb(viewStub);
        this.A01 = r2;
        this.A04 = new C258293ym(r2, R.id.feed_preview_thumbnail);
        this.A03 = new C258293ym(r2, R.id.dismiss_button);
    }
}
