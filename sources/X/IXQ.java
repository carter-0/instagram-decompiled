package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;

public final class IXQ implements MU9 {
    public final /* synthetic */ C16181Uq6 A00;
    public final /* synthetic */ C52963GgG A01;
    public final /* synthetic */ boolean A02;

    public IXQ(C16181Uq6 uq6, C52963GgG ggG, boolean z) {
        this.A01 = ggG;
        this.A02 = z;
        this.A00 = uq6;
    }

    public final void Dol(boolean z) {
        C52963GgG ggG = this.A01;
        if (ggG.A08 != HM8.CREATOR_INSPIRATION_HUB_AUDIO_TAB) {
            if (!182.A06(0Tu.A05, ggG.A06, 36325806892397812L)) {
                return;
            }
        }
        Context A05 = DbT.A05(ggG.A0D());
        boolean z2 = this.A02;
        C16181Uq6 uq6 = this.A00;
        ImageUrl imageUrl = uq6.A01;
        AudioType audioType = uq6.A02.A01;
        Dc2 dc2 = ggG.A00;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        Dc2 A012 = AnonymousClass3ZJ.A01(A05, ggG.A06, imageUrl, C58690Ivz.A00(audioType, ggG, 0), z2);
        ggG.A00 = A012;
        DbX.A1S(A012);
    }

    public final void DCu(Integer num, String str, boolean z) {
        AnonymousClass7TG.A1O(num, str);
        C55123HcW.A00(num, str, z);
        C52963GgG ggG = this.A01;
        AnonymousClass7TE.A1Z(new MGB(ggG, (AnonymousClass4D7) null, 22, z), C318116oQ.A00(ggG));
    }
}
