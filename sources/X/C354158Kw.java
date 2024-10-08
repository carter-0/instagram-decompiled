package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Kw  reason: invalid class name and case insensitive filesystem */
public final class C354158Kw {
    public C60734JqR A00;
    public C60735JqS A01;
    public boolean A02;
    public final UserSession A03;

    public C354158Kw(UserSession userSession) {
        AnonymousClass8CN r2;
        AnonymousClass8CQ r0;
        this.A03 = userSession;
        IgVoltronModelLoader A002 = IgVoltronModelLoader.Companion.A00(userSession);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36324591416717486L);
        this.A02 = A06;
        if (A06) {
            A002.fetchExecuTorchVoltronModule(AnonymousClass8CK.A00);
            A002.fetchSentencePieceVoltronModule(AnonymousClass8CL.A00);
            List singletonList = Collections.singletonList(C352658Eh.A00(AnonymousClass8Eg.COLOR_LM_ET));
            0qQ.A07(singletonList);
            C60734JqR jqR = new C60734JqR(new AnonymousClass8CO(userSession, singletonList));
            jqR.A00 = new AQ7(this);
            this.A00 = jqR;
            if (jqR.A02 == null || jqR.A01 == null || !jqR.A08()) {
                r2 = jqR.A04;
                r0 = new AQ3(jqR);
            } else {
                return;
            }
        } else {
            A002.fetchPytorchVoltronModule(AnonymousClass8CJ.A00);
            A002.fetchSentencePieceVoltronModule(AnonymousClass8CL.A00);
            List singletonList2 = Collections.singletonList(C352658Eh.A00(AnonymousClass8Eg.COLOR_LM));
            0qQ.A07(singletonList2);
            C60735JqS jqS = new C60735JqS(new AnonymousClass8CO(userSession, singletonList2));
            jqS.A00 = new AQ8(this);
            this.A01 = jqS;
            if (jqS.A02 == null || jqS.A01 == null || !jqS.A08()) {
                r2 = jqS.A04;
                r0 = new AQ4(jqS);
            } else {
                return;
            }
        }
        r2.AUy(r0, true);
    }
}
