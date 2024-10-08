package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KGa  reason: case insensitive filesystem */
public final class C61650KGa extends C232232tF {
    public final float A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60528Jmz(DbT.A0D(layoutInflater, viewGroup, R.layout.ab_test_media_thumbnail_preview_item_layout, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C321546uM r0;
        C64792LiC liC = (C64792LiC) r8;
        C60528Jmz jmz = (C60528Jmz) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, liC, jmz);
        AnonymousClass0iw r1 = this.A01;
        0qQ.A0B(r1, A1U ? 1 : 0);
        ImageUrl imageUrl = liC.A02;
        IgABTestMultiImageButton igABTestMultiImageButton = jmz.A00;
        if (imageUrl != null) {
            igABTestMultiImageButton.setUrl(imageUrl, r1);
            C16528UwY uwY = liC.A01;
            if (uwY != null) {
                int ordinal = uwY.ordinal();
                if (ordinal == 3) {
                    r0 = C321546uM.A0N;
                } else if (ordinal == 9) {
                    r0 = C321546uM.A08;
                }
                igABTestMultiImageButton.setIcon(r0);
                igABTestMultiImageButton.setMediaOverlay((C321556uN) null);
                igABTestMultiImageButton.setAlphabet(String.valueOf((char) (liC.A00 + 65)));
                igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
                igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(A1U);
                igABTestMultiImageButton.setSelected(-1);
            }
            igABTestMultiImageButton.A0H();
            igABTestMultiImageButton.setMediaOverlay((C321556uN) null);
            igABTestMultiImageButton.setAlphabet(String.valueOf((char) (liC.A00 + 65)));
            igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
            igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(A1U);
            igABTestMultiImageButton.setSelected(-1);
        } else {
            igABTestMultiImageButton.A09();
            igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
            igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(false);
        }
        igABTestMultiImageButton.setNumberedCheckBoxEnabled(false);
    }

    public final Class modelClass() {
        return C64792LiC.class;
    }

    public C61650KGa(AnonymousClass0iw r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
