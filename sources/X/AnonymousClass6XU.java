package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6XU  reason: invalid class name */
public final class AnonymousClass6XU extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C255773uh A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final Integer A05;

    public AnonymousClass6XU(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6, C317126ml r7) {
        super(r3, userSession, r5);
        Integer num;
        CreativeConfigIntf AsO;
        List B92;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        CameraTool C8A;
        this.A00 = context;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = r5;
        1Xj r0 = r5.A0b;
        if (!(r0 == null || (AsO = r0.A0C.AsO()) == null || (B92 = AsO.B92()) == null || (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) 00k.A0J(B92)) == null || (C8A = genAIToolInfoDictIntf.C8A()) == null)) {
            switch (C8A.ordinal()) {
                case 3:
                    num = AnonymousClass05K.A0C;
                    break;
                case 65:
                case 70:
                    num = AnonymousClass05K.A01;
                    break;
                case 68:
                case 69:
                    num = AnonymousClass05K.A00;
                    break;
                case 91:
                    num = AnonymousClass05K.A0N;
                    break;
            }
        }
        num = null;
        this.A05 = num;
        this.A01 = ReelHeaderAttributionType.META_AI_ATTRIBUTION;
    }
}
