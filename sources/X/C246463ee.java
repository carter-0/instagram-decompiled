package X;

import com.facebook.litho.ComponentTree;
import java.util.Map;

/* renamed from: X.3ee  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C246463ee implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ComponentTree A02;
    public final /* synthetic */ 2T4 A03;

    public /* synthetic */ C246463ee(ComponentTree componentTree, 2T4 r2, int i, int i2) {
        this.A02 = componentTree;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object invoke(Object obj) {
        String str;
        int i;
        ComponentTree componentTree = this.A02;
        2T4 r6 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        Map map = (Map) obj;
        C251263mp r0 = componentTree.A03;
        if (r0 != null) {
            str = r0.A0J();
        } else {
            str = "";
        }
        map.put("root", str);
        map.put("breadcrumb", componentTree.A0E);
        boolean z = true;
        boolean z2 = false;
        if (r6 != null) {
            z2 = true;
        }
        map.put(Pxd.A00(753), Boolean.valueOf(z2));
        map.put("size_specs_match", true);
        map.put("id_match", true);
        if (r6 != null) {
            C251263mp r02 = componentTree.A03;
            if (r02 != null) {
                i = r02.A00;
            } else {
                i = -1;
            }
            int i4 = r6.A0H.A01.A00;
            boolean A022 = r6.A02(i2, i3);
            if (i4 == i || i == -1) {
                z = false;
            }
            if (!A022) {
                map.put("size_specs_match", false);
                long j = r6.A0D;
                map.put("current_width_spec", Integer.valueOf(C245063cG.A01(j)));
                map.put("current_height_spec", Integer.valueOf(C245063cG.A00(j)));
                map.put(Pxd.A00(700), 002.A0u("w: ", AnonymousClass2VQ.A02(C245063cG.A01(j)), ", h: ", AnonymousClass2VQ.A02(C245063cG.A00(j))));
                map.put("widthSpec", Integer.valueOf(i2));
                map.put("heightSpec", Integer.valueOf(i3));
                map.put(Pxd.A00(884), 002.A0u("w: ", AnonymousClass2VQ.A02(i2), ", h: ", AnonymousClass2VQ.A02(i3)));
            }
            if (!z) {
                map.put("id_match", false);
                map.put("root_id", Integer.valueOf(i));
                map.put(Pxd.A00(699), Integer.valueOf(i4));
            }
        }
        return C60340gF.A00;
    }
}
