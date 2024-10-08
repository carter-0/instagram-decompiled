package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import java.util.ArrayList;
import java.util.List;

public abstract class JYP {
    public static final void A00(ImageView imageView, ImageUrl imageUrl) {
        0qQ.A0B(imageView, 0);
        Drawable drawable = imageView.getDrawable();
        0qQ.A0C(drawable, AnonymousClass000.A00(334));
        GIH gih = (GIH) drawable;
        0qQ.A0B(gih, 0);
        gih.A04(imageUrl);
    }

    public static final void A03(GIH gih, List list) {
        0qQ.A0B(gih, 0);
        if (list.size() == 1) {
            gih.A04((ImageUrl) list.get(0));
        } else {
            gih.A05(list);
        }
    }

    public static final void A04(GIH gih, List list) {
        0qQ.A0B(gih, 0);
        ArrayList A0U = 00k.A0U(00k.A0X(list));
        if (!A0U.isEmpty()) {
            int size = A0U.size();
            if (size == 2) {
                A0U.addAll(00k.A0Y(A0U));
            } else if (size == 3) {
                A0U.add(A0U.get(0));
            }
            A03(gih, A0U);
        }
    }

    public static final void A01(UserSession userSession, MusicAssetModel musicAssetModel, GIH gih) {
        DbY.A1S(gih, userSession);
        if (musicAssetModel == null) {
            return;
        }
        if (musicAssetModel.A01 != OriginalAudioSubtype.A06) {
            gih.A04(musicAssetModel.A03);
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (OriginalPartsAttributionModel originalPartsAttributionModel : musicAssetModel.A0K) {
            A1C.add(originalPartsAttributionModel.A00);
        }
        if (182.A06(0Tu.A06, userSession, 36321395961177412L)) {
            A04(gih, A1C);
        } else {
            A03(gih, A1C);
        }
    }

    public static final void A02(ImageUrl imageUrl, IgImageView igImageView, AnonymousClass0iw r4) {
        BitmapDrawable bitmapDrawable;
        DbY.A1S(igImageView, r4);
        boolean A02 = C253833rU.A02(imageUrl);
        Context context = igImageView.getContext();
        if (A02) {
            Drawable drawable = context.getDrawable(R.drawable.default_album_art_icon);
            Bitmap bitmap = null;
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                bitmap = bitmapDrawable.getBitmap();
            }
            igImageView.setImageBitmap(bitmap);
            return;
        }
        igImageView.setPlaceHolderColor(context.getColor(R.color.cds_white_a20));
        igImageView.A0E = new C64860LjM(igImageView, 4);
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, r4);
        }
    }
}
