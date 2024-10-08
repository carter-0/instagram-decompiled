package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.9r6  reason: invalid class name and case insensitive filesystem */
public final class C390329r6 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelMusicPickStickerShareFragment";
    public 28D A00 = 28D.A46;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        28D r0 = this.A00;
        if (r0 == null) {
            r0 = 28D.A46;
        }
        AnonymousClass80D.A07(r0, this, A002);
        AnonymousClass80D.A01(A0M, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        MusicPickStickerModel musicPickStickerModel = (MusicPickStickerModel) requireArguments().getParcelable(C273654mx.A00(545));
        if (musicPickStickerModel != null) {
            A002.A3y = true;
        } else {
            musicPickStickerModel = new MusicPickStickerModel(AnonymousClass7TE.A1I(AnonymousClass7TF.A0Q(AnonymousClass7TE.A0k(this))));
        }
        A002.A1d = musicPickStickerModel;
        MusicPickReelTag musicPickReelTag = (MusicPickReelTag) requireArguments().getParcelable(C273654mx.A00(546));
        if (musicPickReelTag != null) {
            A002.A1L = musicPickReelTag;
        }
        String string = requireArguments().getString(C273654mx.A00(1475));
        if (string != null) {
            AnonymousClass80D.A0E(A002, (AnonymousClass802) null, string);
            A002.A3y = true;
            A002.A3U = false;
            A002.A3t = false;
            A002.A3Y = true;
        }
        return A002;
    }

    public final String getModuleName() {
        return "reel_music_pick_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(821403774);
        super.onCreate(bundle);
        28D serializable = requireArguments().getSerializable(C273654mx.A00(1474));
        if (serializable != null) {
            this.A00 = serializable;
        }
        AnonymousClass0fD.A09(-547384593, A02);
    }
}
