package X;

import android.content.Context;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.RUh  reason: case insensitive filesystem */
public abstract class C9230RUh {
    public static final void A00(Context context, Integer num, Map map, 0sP r12, 0sL r13, 0sL r14) {
        String str;
        0qQ.A0B(num, 1);
        C229382nI A00 = IGContextProvider.A00(context);
        if (A00 != null) {
            C10629RvN rvN = new C10629RvN();
            switch (num.intValue()) {
                case 0:
                    str = "bloks_shell_test";
                    break;
                case 1:
                    str = "payments_autofill";
                    break;
                default:
                    str = "encrypted_backups";
                    break;
            }
            Map map2 = rvN.A02;
            map2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            BitSet bitSet = rvN.A00;
            bitSet.set(0);
            map2.put("prf_input_first", (Object) null);
            Q3B A01 = Q3B.A01(r13, rvN, 14);
            Map map3 = rvN.A01;
            map3.put("on_flow_success", A01);
            map3.put("on_flow_error", Q3B.A01(r14, rvN, 13));
            map3.put("on_flow_cancel", Q3B.A01(r12, rvN, 12));
            if (!map.isEmpty()) {
                map2.put("logging_params", map);
            }
            T6n t6n = new T6n(1);
            if (bitSet.nextClearBit(0) >= 1) {
                FBO A002 = HX9.A00("com.bloks.www.bloks.caa.passkey.creation.async");
                A002.A04 = C359608dC.A01(map2);
                A002.A03 = map3;
                A002.A02 = t6n;
                A002.A01(context, A00);
                return;
            }
            throw DbU.A0i();
        }
    }
}
