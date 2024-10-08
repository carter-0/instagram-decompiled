package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;

public final class Q9S extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A05;
    public ImageView A00;
    public ImageView A01;
    public final int A02 = 5;
    public final 0s0 A03 = new C13408TYs((Object) this, 50);
    public final 0s0 A04;

    public Q9S(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A04 = new C13407TYr(3, context, this);
        C66581MXm.A1A(this, -2);
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_icon, this, true);
        this.A00 = DbS.A0G(this, R.id.list_cell_left_add_on_icon);
        this.A01 = DbS.A0G(this, R.id.list_cell_left_add_on_icon_outline);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(AnonymousClass2E0.A0A().A02(this.A02), C71382cm.A0e);
        C11409SSh.A00(obtainStyledAttributes, this, 18, 2132017587);
        obtainStyledAttributes.recycle();
    }

    static {
        Class<Q9S> cls = Q9S.class;
        A05 = new AnonymousClass0YZ[]{Pxh.A0y(cls, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/facebookpay/widget/style/Icon;"), Pxh.A0y(cls, "imageThumbnailUrl", "getImageThumbnailUrl()Ljava/lang/String;")};
    }

    public final int getFbpayWidgetStyleType() {
        return this.A02;
    }

    public final RH3 getIcon() {
        return (RH3) Pxe.A0s(this, this.A03, A05, 0);
    }

    public final String getImageThumbnailUrl() {
        return DbV.A13(this, this.A04, A05, 1);
    }

    public final void setIcon(RH3 rh3) {
        DbS.A1a(this, rh3, this.A03, A05, 0);
    }

    public final void setImageThumbnailUrl(String str) {
        DbS.A1a(this, str, this.A04, A05, 1);
    }

    public final void setImageViewBackground(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A01;
            String str = "imageViewOutline";
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                Rect A0W = AnonymousClass7TE.A0W();
                if (drawable.getPadding(A0W)) {
                    ImageView imageView2 = this.A00;
                    if (imageView2 == null) {
                        str = "imageView";
                    } else {
                        imageView2.setPadding(A0W.left, A0W.top, A0W.right, A0W.bottom);
                    }
                }
                imageView.setVisibility(0);
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void setImageViewStyle(int i) {
        String str;
        ImageView imageView = this.A00;
        if (imageView == null) {
            str = "imageView";
        } else {
            C11409SSh.A05(imageView, i, false);
            ImageView imageView2 = this.A01;
            if (imageView2 == null) {
                str = "imageViewOutline";
            } else {
                C11409SSh.A05(imageView2, i, false);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
