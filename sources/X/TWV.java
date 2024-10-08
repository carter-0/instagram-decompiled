package X;

import android.content.Context;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.Map;
import java.util.Set;

public final class TWV extends 0Yg implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C229392nJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Set A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sL A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWV(Context context, C229392nJ r3, String str, Map map, Set set, C62320sa r7, C62320sa r8, 0sP r9, 0sL r10) {
        super(1);
        this.A04 = set;
        this.A02 = str;
        this.A06 = r7;
        this.A08 = r10;
        this.A05 = r8;
        this.A03 = map;
        this.A00 = context;
        this.A01 = r3;
        this.A07 = r9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        2HJ r10 = (2HJ) obj;
        0qQ.A0B(r10, 0);
        C9122RPu.A00 = r10.A00();
        TYA tya = new TYA(22, (Object) this.A07, (Object) r10);
        C10628RvM rvM = new C10628RvM();
        Map map = rvM.A02;
        map.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "payments_autofill");
        BitSet bitSet = rvM.A00;
        bitSet.set(0);
        Set set = this.A04;
        if (!set.isEmpty()) {
            map.put("allowable_credentials", set);
        }
        map.put("credit_card_id", this.A02);
        map.put("prf_input_first", (Object) null);
        Q3B A012 = Q3B.A01(this.A06, rvM, 11);
        Map map2 = rvM.A01;
        map2.put("on_flow_success", A012);
        map2.put("on_flow_error", Q3B.A01(this.A08, rvM, 9));
        map2.put("on_flow_no_available_credentials", Q3B.A01(this.A05, rvM, 10));
        map2.put("on_entry_point_payments_autofill_success", Q3B.A01(tya, rvM, 8));
        Map map3 = this.A03;
        if (!map3.isEmpty()) {
            map.put("logging_params", map3);
        }
        Context context = this.A00;
        C229392nJ r3 = this.A01;
        T6n t6n = new T6n(0);
        if (bitSet.nextClearBit(0) >= 1) {
            FBO A002 = HX9.A00("com.bloks.www.bloks.caa.passkey.assertion.async");
            A002.A04 = C359608dC.A01(map);
            A002.A03 = map2;
            A002.A02 = t6n;
            A002.A01(context, r3);
            return C60340gF.A00;
        }
        throw DbU.A0i();
    }
}
