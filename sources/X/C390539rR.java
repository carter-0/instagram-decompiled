package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import java.io.File;
import java.util.Map;

/* renamed from: X.9rR  reason: invalid class name and case insensitive filesystem */
public final class C390539rR extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelShareProfileCardStickerFragment";
    public 28D A00;
    public MusicOverlayStickerModel A01;
    public File A02;
    public String A03;
    public String A04;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context requireContext = requireContext();
        RectF A0C = AnonymousClass7TF.A0C((float) AnonymousClass0nB.A01(requireContext), (float) AnonymousClass0nB.A00(requireContext));
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A002, this.A03, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        A002.A0B = this.A00;
        A002.A0O = this;
        A002.A06 = A0C;
        A002.A07 = A0C;
        A002.A3r = true;
        A002.A3v = false;
        A002.A33 = false;
        A002.A04 = 150;
        A002.A3H = true;
        A002.A3g = true;
        A002.A0y = AnonymousClass80E.ALL;
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("profileCardCacheKey");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A1f = new ProfileCardStickerModel(this.A01, str, this.A04);
        A002.A1R = this.A01;
        File file = this.A02;
        if (file != null) {
            A002.A0P = C282665Eg.A03(file, 1, 0);
            A002.A0w = null;
            A002.A3y = true;
        }
        return A002;
    }

    public final String getModuleName() {
        return "reel_share_profile_card_sticker_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int i;
        00N onBackPressedDispatcher;
        int A022 = AnonymousClass0fD.A02(1616692039);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = 28D.A3s;
            String string = bundle2.getString(AnonymousClass000.A00(2475));
            if (string != null) {
                this.A02 = AnonymousClass7TE.A0t(string);
            }
            this.A04 = bundle2.getString(AnonymousClass000.A00(2478));
            this.A01 = (MusicOverlayStickerModel) bundle2.getParcelable(AnonymousClass000.A00(2477));
            String string2 = bundle2.getString(AnonymousClass000.A00(2476));
            if (string2 == null) {
                FragmentActivity activity = getActivity();
                if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
                    onBackPressedDispatcher.A04();
                }
                i = -604593470;
            } else {
                this.A03 = string2;
                i = 450330317;
            }
            AnonymousClass0fD.A09(i, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1885237624, A022);
        throw A0y;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(105496438);
        super.onDestroy();
        FYZ fyz = (FYZ) AnonymousClass7TE.A0k(this).A01(FYZ.class, G2J.A00);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("profileCardCacheKey");
            throw AnonymousClass00P.createAndThrow();
        }
        Map map = fyz.A00;
        Bitmap bitmap = (Bitmap) map.get(str);
        if (bitmap != null) {
            map.put(str, (Object) null);
            bitmap.recycle();
        }
        AnonymousClass0fD.A09(1369694974, A022);
    }
}
