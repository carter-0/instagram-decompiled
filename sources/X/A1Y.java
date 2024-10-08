package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashSet;

public abstract class A1Y {
    public static final CameraConfiguration A00(C391389so r4) {
        C358088aL r1;
        C279284yO r0 = AnonymousClass9QA.A00;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        switch (r4.ordinal()) {
            case 0:
                break;
            case 1:
                r1 = C358088aL.A0C;
                break;
            case 2:
                r0 = AnonymousClass80L.A00;
                break;
            case 3:
                r0 = C363138jC.A00;
                break;
            case 4:
                r1 = C358088aL.A0B;
                break;
            case 5:
                r1 = C358088aL.A0M;
                break;
            case 6:
                r0 = C3493980f.A00;
                break;
            case 10:
                r1 = C358088aL.A0w;
                break;
            case 11:
                r0 = AnonymousClass80N.A00;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r1 = C358088aL.A0T;
                break;
            default:
                0wb.A03("CameraTarget", AnonymousClass7TG.A0m(r4, "no available CameraConfiguration for CameraTarget: ", AnonymousClass7TE.A1A()));
                break;
        }
        linkedHashSet.add(r1);
        return new CameraConfiguration(r0, 00k.A0k(linkedHashSet));
    }
}
