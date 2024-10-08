package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6XR  reason: invalid class name */
public final class AnonymousClass6XR extends C308916We {
    public final Context A00;
    public final C362088hK A01;
    public final ReelHeaderAttributionType A02;
    public final C255773uh A03;
    public final C316276lO A04;
    public final C317126ml A05;

    public AnonymousClass6XR(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6, C317126ml r7) {
        super(r3, userSession, r5);
        CameraTool cameraTool;
        CreativeConfigIntf AsO;
        List B92;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        this.A00 = context;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        1Xj r0 = r5.A0b;
        if (r0 == null || (AsO = r0.A0C.AsO()) == null || (B92 = AsO.B92()) == null || (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) 00k.A0J(B92)) == null) {
            cameraTool = null;
        } else {
            cameraTool = genAIToolInfoDictIntf.C8A();
        }
        this.A01 = AnonymousClass6XS.A00(cameraTool);
        this.A02 = ReelHeaderAttributionType.MAGIC_MOD_ATTRIBUTION;
    }
}
