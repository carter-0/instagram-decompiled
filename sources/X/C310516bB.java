package X;

import android.app.Dialog;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6bB  reason: invalid class name and case insensitive filesystem */
public final class C310516bB {
    public 28D A00;
    public MusicPickReelTag A01;
    public MusicPickStickerModel A02;
    public String A03;
    public boolean A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C310536bD A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final 1NW A0A;
    public final Runnable A0B;
    public final C62320sa A0C;

    public C310516bB(FragmentActivity fragmentActivity, UserSession userSession, C62320sa r6) {
        0qQ.A0B(userSession, 2);
        this.A05 = fragmentActivity;
        this.A06 = userSession;
        this.A0C = r6;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.A0A = new 1NW(myLooper);
            this.A0B = new C310526bC(this);
            this.A08 = AnonymousClass1YB.A00(new C377269Le(this, 26));
            this.A09 = AnonymousClass0eN.A00(0eO.A02, new C377269Le(this, 27));
            this.A07 = new C310536bD(this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(28D r11, MusicPickReelTag musicPickReelTag, MusicPickStickerModel musicPickStickerModel) {
        String str;
        0qQ.A0B(musicPickStickerModel, 0);
        this.A03 = null;
        this.A02 = musicPickStickerModel;
        this.A01 = musicPickReelTag;
        this.A00 = r11;
        this.A04 = false;
        AnonymousClass0fN.A00((Dialog) this.A09.getValue());
        this.A0A.postDelayed(this.A0B, TimeUnit.SECONDS.toMillis(30));
        MusicPickStickerModel musicPickStickerModel2 = this.A02;
        if (musicPickStickerModel2 == null) {
            0qQ.A0F("musicPickStickerModel");
            throw AnonymousClass00P.createAndThrow();
        }
        ImageInfo imageInfo = musicPickStickerModel2.A00.A03.A01;
        if (imageInfo != null) {
            FragmentActivity fragmentActivity = this.A05;
            ExtendedImageUrl A052 = 1iI.A05(imageInfo, AnonymousClass05K.A01, Math.min(AnonymousClass0nB.A01(fragmentActivity), 1080));
            if (!(A052 == null || (str = A052.A0A) == null)) {
                C290815g0 A032 = C59730JVo.A03(fragmentActivity, this.A06, new C11211SFl(str, "music_pick_share", false, false, false));
                A032.A00 = this.A07;
                1ES.A06(A032, 622413651, false);
                return;
            }
        }
        A00(this);
    }

    public static final void A00(C310516bB r1) {
        ((Dialog) r1.A09.getValue()).dismiss();
        if (!r1.A04) {
            r1.A04 = true;
            r1.A03 = null;
        }
        C62320sa r0 = r1.A0C;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
