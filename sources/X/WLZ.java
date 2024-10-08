package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;

public final class WLZ implements C20891X2x {
    public final VU9 A00;

    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        V33 v33 = (V33) obj;
        if (v33 instanceof C15212UVp) {
            UserFlowLogger userFlowLogger = this.A00.A00;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(866984261);
            userFlowLogger.flowStart(generateNewFlowId, new UserFlowConfig(AnonymousClass000.A00(1061), false));
            x2s.APd(new C15221UVy((C15212UVp) v33, new VQ6(generateNewFlowId)));
        } else if (v33 instanceof UVV) {
            UVV uvv = (UVV) v33;
            VU9 vu9 = this.A00;
            VQ6 vq6 = uvv.A01;
            String str = uvv.A02;
            C18026Vk4 vk4 = uvv.A00;
            if (vk4 == null || vk4.A00.isEmpty()) {
                vu9.A00.flowMarkPoint(vq6.A00, str);
                return;
            }
            PointEditor markPointWithEditor = vu9.A00.markPointWithEditor(vq6.A00, str);
            Iterator it = vk4.A00().iterator();
            while (it.hasNext()) {
                V3O v3o = (V3O) it.next();
                Object obj2 = v3o.A00;
                if (obj2 != null) {
                    markPointWithEditor.addPointData((String) obj2, DbX.A0t(v3o.A01));
                }
            }
            markPointWithEditor.markerEditingCompleted();
        } else if (v33 instanceof UVW) {
            UVW uvw = (UVW) v33;
            boolean z = uvw.A02;
            VU9 vu92 = this.A00;
            VQ6 vq62 = uvw.A00;
            if (z) {
                vu92.A00.flowEndSuccess(vq62.A00);
                return;
            }
            vu92.A00.flowEndFail(vq62.A00, uvw.A01, (String) null);
        }
    }

    public WLZ(VU9 vu9) {
        this.A00 = vu9;
    }
}
