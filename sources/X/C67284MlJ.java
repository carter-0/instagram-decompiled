package X;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MlJ  reason: case insensitive filesystem */
public final class C67284MlJ implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "DirectInboxPlayPileButtonHolder";
    public Context A00;
    public View A01;
    public View A02;
    public View A03;
    public final ViewStub A04;

    public C67284MlJ(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A04 = viewStub;
    }

    public final String getModuleName() {
        return "direct_inbox_play_pile_button_holder";
    }

    public static final void A00(ImageUrl imageUrl, ImageUrl imageUrl2, C67284MlJ mlJ, boolean z) {
        AnonymousClass7TF.A16(mlJ.A01);
        View view = mlJ.A02;
        if (view != null) {
            IgImageView A0b = DbX.A0b(view, R.id.media);
            if (imageUrl != null) {
                A0b.setUrl(imageUrl, mlJ);
            }
            if (!z) {
                C66581MXm.A19(mlJ.A03);
            } else if (imageUrl2 != null) {
                View view2 = mlJ.A03;
                if (view2 != null) {
                    IgImageView A0b2 = DbX.A0b(view2, R.id.secondary_media);
                    A0b2.setUrl(imageUrl2, mlJ);
                    if (Build.VERSION.SDK_INT >= 31) {
                        A0b2.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP));
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
