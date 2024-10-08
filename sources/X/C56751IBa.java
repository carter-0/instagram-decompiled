package X;

import android.view.View;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.IBa  reason: case insensitive filesystem */
public final class C56751IBa implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C317616nY A02;

    public C56751IBa(C255773uh r1, C255783ui r2, C317616nY r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        int A05 = AnonymousClass0fD.A05(505454863);
        C317616nY r5 = this.A02;
        C255783ui r0 = this.A01;
        MusicPickStickerModel A0D = r0.A0D();
        if (A0D != null) {
            float f = r0.A03;
            float f2 = r0.A04;
            int i2 = r0.A09;
            float f3 = r0.A02;
            float f4 = r0.A00;
            float f5 = r0.A01;
            C255773uh r1 = this.A00;
            MusicPickReelTag musicPickReelTag = new MusicPickReelTag(f, f2, f3, f4, f5, r1.A00(), i2);
            String str = r0.A1i;
            if (str != null) {
                r5.DSx(r1, musicPickReelTag, A0D, str);
                AnonymousClass0fD.A0C(2100067457, A05);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1815763161;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -2117981363;
        }
        AnonymousClass0fD.A0C(i, A05);
        throw illegalStateException;
    }
}
