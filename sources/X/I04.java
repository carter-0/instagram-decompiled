package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class I04 {
    public int A00 = -1;
    public LVB A01;
    public List A02 = AnonymousClass7TE.A1C();
    public Map A03 = AnonymousClass7TE.A1H();
    public Map A04 = AnonymousClass7TE.A1H();
    public final Context A05;
    public final UserSession A06;

    public static final void A00(I04 i04) {
        TextureView textureView;
        LVB lvb;
        LVB lvb2 = i04.A01;
        if (lvb2 != null) {
            lvb2.A00();
        }
        i04.A01 = null;
        C55687Hlk hlk = (C55687Hlk) 00k.A0O(i04.A02, i04.A00);
        if (hlk != null && (textureView = hlk.A00) != null) {
            i04.A01 = new LVB(i04.A05, textureView, i04.A06, new C55570Hjq(i04), AnonymousClass000.A00(758));
            MediaComposition mediaComposition = (MediaComposition) C51968G9o.A10(i04.A04, i04.A00);
            Number number = (Number) C51968G9o.A10(i04.A03, i04.A00);
            if (mediaComposition != null && number != null && (lvb = i04.A01) != null) {
                long longValue = number.longValue();
                lvb.A02.A06 = new INS(lvb, longValue);
                lvb.A01(mediaComposition);
            }
        }
    }

    public I04(Context context, UserSession userSession) {
        this.A05 = context;
        this.A06 = userSession;
    }
}
