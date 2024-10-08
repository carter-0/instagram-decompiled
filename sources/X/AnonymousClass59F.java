package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.59F  reason: invalid class name */
public final class AnonymousClass59F extends IgImageView {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public int A02 = -1;
    public int A03 = -1;
    public Drawable A04;
    public String A05 = "file://unknown";

    /* JADX WARNING: type inference failed for: r1v0, types: [X.59F, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass59F(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        setId(View.generateViewId());
        setVisibility(0);
    }

    public final void A0H(Float[] fArr, int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = fArr[0].floatValue();
        this.A01 = fArr[1].floatValue();
    }

    public final int getNewHeight() {
        return this.A02;
    }

    public final int getNewWidth() {
        return this.A03;
    }

    public final float getPositionX() {
        return this.A00;
    }

    public final float getPositionY() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A05;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.59F, android.view.View] */
    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2;
        String str;
        Drawable mutate;
        String str2;
        this.A04 = drawable;
        if (drawable != null) {
            if (drawable instanceof C244303ay) {
                ImageUrl imageUrl = ((C244303ay) drawable).A04;
                if (imageUrl != null) {
                    str2 = imageUrl.getUrl();
                } else {
                    str2 = null;
                }
                str = String.valueOf(str2);
            } else {
                Context context = getContext();
                0qQ.A07(context);
                Drawable mutate2 = C244273av.A00(context).mutate();
                0qQ.A07(mutate2);
                if (AnonymousClass5HU.A00(drawable, mutate2)) {
                    str = "file://verified_profile";
                } else {
                    Drawable drawable3 = context.getDrawable(R.drawable.play_icon);
                    if (drawable3 == null || (mutate = drawable3.mutate()) == null || !AnonymousClass5HU.A00(drawable, mutate)) {
                        Drawable drawable4 = context.getDrawable(R.drawable.instagram_app_whatsapp_pano_outline_24);
                        if (drawable4 != null) {
                            drawable2 = drawable4.mutate();
                        } else {
                            drawable2 = null;
                        }
                        int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text));
                        if (drawable2 != null) {
                            drawable2.setColorFilter(AnonymousClass37O.A00(color));
                        }
                        if (AnonymousClass5HU.A00(drawable, drawable2)) {
                            str = "file://whatsapp_icon";
                        } else {
                            str = "file://unknown";
                        }
                    } else {
                        str = "file://play_icon";
                    }
                }
            }
            this.A05 = str;
        }
    }
}
