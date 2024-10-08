package X;

import android.view.View;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Set;

/* renamed from: X.8PI  reason: invalid class name */
public final class AnonymousClass8PI extends AnonymousClass3NK {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8PI(C355048Oj r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        C351968Bd r0;
        AnonymousClass8BA r3 = this.A00.A0q.A00;
        05G r1 = r3.A1H.A02;
        switch (((C351968Bd) r1.getValue()).ordinal()) {
            case 0:
                r0 = C351968Bd.FIT;
                break;
            case 1:
                r0 = C351968Bd.SMART_CROP_FIT;
                break;
            case 2:
                r0 = C351968Bd.SMART_CROP_FREE_TRANSFORM_CACHED;
                break;
            case 3:
                r0 = C351968Bd.FILL;
                break;
            case 4:
                r0 = C351968Bd.SMART_CROP_FILL_FROM_FIT;
                break;
            case 5:
            case 6:
                r0 = C351968Bd.SMART_CROP_FILL_FROM_FREE_TRANSFORM;
                break;
            case 7:
            case 9:
                r0 = C351968Bd.SMART_TRACKING_FILL;
                break;
            case 8:
                r0 = C351968Bd.SMART_TRACKING_FIT;
                break;
            case 10:
                r0 = C351968Bd.SMART_TRACKING_PROCESSING_TOOLTIP;
                break;
            case 11:
                r0 = C351968Bd.SMART_TRACKING_PROCESSING;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r0 = C351968Bd.SMART_TRACKING_PROCESSING_INVALID;
                break;
            default:
                throw new RuntimeException();
        }
        r1.Epw(r0);
        Object value = r1.getValue();
        boolean z = false;
        if (value == C351968Bd.SMART_TRACKING_FILL) {
            z = true;
        }
        C357638Yz r2 = r3.A0w;
        Set set = (Set) r2.A09.A00;
        C358088aL r7 = C358088aL.A0r;
        if (z) {
            set.add(r7);
            27r A01 = 27p.A01(r3.A0v);
            A01.A0F.A0S(((C279284yO) r2.A08.A00).A00, (C371088xY) null, r7, (List) null, 0, 0);
        } else {
            set.remove(r7);
        }
        C357068Wi r12 = (C357068Wi) r3.A1v.get();
        if (r12 == null) {
            return true;
        }
        27p.A01(r12.A06).A27(true, r12.A0M.A0t());
        return true;
    }
}
