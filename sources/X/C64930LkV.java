package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import java.util.List;

/* renamed from: X.LkV  reason: case insensitive filesystem */
public final class C64930LkV implements B1J {
    public final /* synthetic */ C65164LoT A00;

    public C64930LkV(C65164LoT loT) {
        this.A00 = loT;
    }

    public final void DIo(float f) {
        FilterModel filterModel;
        GainmapFilter gainmapFilter;
        C65164LoT loT = this.A00;
        LDP ldp = loT.A0G;
        FilterChain filterChain = loT.A02;
        ldp.A00 = f;
        if (!(filterChain == null || (filterModel = (FilterModel) filterChain.A01.get(28)) == null || !(filterModel instanceof GainmapFilter) || (gainmapFilter = (GainmapFilter) filterModel) == null)) {
            gainmapFilter.A00(f);
        }
        C63694L3e l3e = loT.A04;
        if (l3e != null) {
            KB5 kb5 = l3e.A00;
            C64906Lk6 lk6 = l3e.A01;
            if (LHq.A01(kb5)) {
                kb5.A0R.EHc(lk6);
                return;
            }
            List list = kb5.A0E;
            int indexOf = list.indexOf(lk6);
            int max = Math.max(0, kb5.A01 - 1);
            int min = Math.min(C51966G9m.A06(list), kb5.A01 + 1);
            lk6.A00 = true;
            if (indexOf >= max && indexOf <= min) {
                lk6.Cn5();
                return;
            }
            return;
        }
        loT.EEp();
    }
}
