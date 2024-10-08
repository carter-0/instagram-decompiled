package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.LnO  reason: case insensitive filesystem */
public final class C65101LnO implements C3515489h {
    public final int A00;
    public final Object A01;

    public C65101LnO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void Cxu() {
    }

    public final /* synthetic */ void DT4() {
    }

    public final /* synthetic */ void DT5() {
    }

    public final void DT6() {
        ImageUrl imageUrl;
        String str;
        if (this.A00 != 0) {
            C40401AbY abY = (C40401AbY) this.A01;
            AudioOverlayTrack audioOverlayTrack = abY.A01;
            if (audioOverlayTrack != null) {
                C40401AbY.A00(abY, audioOverlayTrack, false);
                return;
            }
            return;
        }
        C65050LmU lmU = (C65050LmU) this.A01;
        MusicAssetModel musicAssetModel = lmU.A00;
        if (musicAssetModel != null) {
            C3506785t A02 = lmU.A08.A02();
            MusicDataSource musicDataSource = musicAssetModel.A05;
            if (musicDataSource != null) {
                if (!musicDataSource.equals(A02.BUq())) {
                    A02.Edj(musicDataSource, false);
                    A02.Edo(musicAssetModel.A05());
                    A02.Edn(15000);
                }
                if (!A02.isPlaying()) {
                    A02.E2p();
                }
            }
            int A03 = Dbb.A03(AnonymousClass7TG.A0Q(lmU.A0L), R.id.music_pick_album_selector);
            View A06 = AnonymousClass7TH.A06(lmU.A0D);
            boolean z = false;
            A06.setVisibility(0);
            Context A0S = AnonymousClass7TE.A0S(A06);
            MusicAssetModel musicAssetModel2 = lmU.A00;
            String str2 = null;
            if (musicAssetModel2 != null) {
                imageUrl = musicAssetModel2.A02;
            } else {
                imageUrl = null;
            }
            if (musicAssetModel2 != null && musicAssetModel2.A0U && AnonymousClass30D.A0C(lmU.A07)) {
                z = true;
            }
            A06.setBackground(new HCF(A0S, imageUrl, z));
            ImageView A0Z = JTR.A0Z(lmU.A0Q);
            AnonymousClass6KL r0 = lmU.A0A;
            r0.A05 = true;
            r0.invalidateSelf();
            A0Z.setImageDrawable(r0);
            ImageView A0Z2 = JTR.A0Z(lmU.A0R);
            Context A0S2 = AnonymousClass7TE.A0S(A0Z2);
            MusicAssetModel musicAssetModel3 = lmU.A00;
            if (musicAssetModel3 != null) {
                str = musicAssetModel3.A0I;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            A0Z2.setImageDrawable(AER.A02(A0S2, str, R.dimen.music_pick_author_container_size, R.color.igds_icon_on_color, R.dimen.account_discovery_bottom_gap));
            ImageView A0Z3 = JTR.A0Z(lmU.A0H);
            Context A0S3 = AnonymousClass7TE.A0S(A0Z3);
            MusicAssetModel musicAssetModel4 = lmU.A00;
            if (musicAssetModel4 != null) {
                str2 = musicAssetModel4.A0D;
            }
            if (str2 == null) {
                str2 = "";
            }
            A0Z3.setImageDrawable(AER.A02(A0S3, str2, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.account_discovery_bottom_gap));
            ImageView A0Z4 = JTR.A0Z(lmU.A0O);
            0nA.A0n(A0Z4, JTR.A0U(A0Z4), R.dimen.abc_button_padding_horizontal_material);
            Context A0S4 = AnonymousClass7TE.A0S(A0Z4);
            Drawable drawable = A0S4.getDrawable(R.drawable.instagram_x_pano_outline_24);
            if (drawable != null) {
                drawable.setTint(AnonymousClass7TF.A03(A0S4, R.attr.igds_color_text_on_white));
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            AnonymousClass7TE.A1N(A0S4, paint, 2Yu.A05(A0S4));
            AnonymousClass7TE.A1Q(paint);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
            int A012 = AnonymousClass1GB.A01(0nA.A04(A0S4, A03));
            layerDrawable.setLayerInset(1, A012, A012, A012, A012);
            A0Z4.setImageDrawable(layerDrawable);
            LY0.A00(A0Z4, 55, lmU);
            MusicPickStickerModel musicPickStickerModel = lmU.A02;
            if (musicPickStickerModel == null) {
                0qQ.A0F("model");
                throw AnonymousClass00P.createAndThrow();
            }
            String str3 = musicPickStickerModel.A02;
            if (!(str3 == null || str3.length() == 0)) {
                lmU.A09.D9o();
            }
            C65050LmU.A01(lmU, (Boolean) null);
        }
    }

    public final /* synthetic */ void Djx() {
    }

    public final /* synthetic */ void DT7(C66569MWx mWx) {
    }
}
