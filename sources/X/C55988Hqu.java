package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hqu  reason: case insensitive filesystem */
public final class C55988Hqu {
    public LVB A00;
    public List A01 = AnonymousClass7TE.A1C();
    public Map A02 = AnonymousClass7TE.A1H();
    public final Context A03;
    public final UserSession A04;

    public final void A00(int i) {
        TextureView textureView;
        LVB lvb;
        LVB lvb2 = this.A00;
        if (lvb2 != null) {
            lvb2.A00 = false;
            lvb2.A02.A05();
        }
        LVB lvb3 = this.A00;
        if (lvb3 != null) {
            lvb3.A00();
        }
        this.A00 = null;
        C55687Hlk hlk = (C55687Hlk) 00k.A0O(this.A01, i);
        if (hlk != null && (textureView = hlk.A00) != null) {
            this.A00 = new LVB(this.A03, textureView, this.A04, (C55570Hjq) null, AnonymousClass000.A00(758));
            MediaComposition mediaComposition = (MediaComposition) C51968G9o.A10(this.A02, i);
            if (mediaComposition != null && (lvb = this.A00) != null) {
                lvb.A01(mediaComposition);
            }
        }
    }

    public C55988Hqu(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }
}
