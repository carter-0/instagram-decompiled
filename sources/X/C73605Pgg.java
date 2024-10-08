package X;

import com.facebook.rp.omnigrid.arlogrid.ArloGridNative;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* renamed from: X.Pgg  reason: case insensitive filesystem */
public final /* synthetic */ class C73605Pgg extends 03J implements 0sP {
    public static final C73605Pgg A00 = new C73605Pgg();

    public C73605Pgg() {
        super(1, C69558No2.class, "computeArloGridLayout", "computeArloGridLayout(Lcom/facebook/rtc/views/omnigrid/GridLayoutInput;)Lcom/facebook/rtc/views/omnigrid/GridLayoutOutput;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
        0qQ.A0B(gridLayoutInput, 0);
        C69719Nqf nqf = ArloGridNative.Companion;
        GridLayoutOutputBuilder gridLayoutOutputBuilder = new GridLayoutOutputBuilder(gridLayoutInput);
        ArloGridNative.jni_computeArloGridLayout(gridLayoutInput, gridLayoutOutputBuilder);
        return gridLayoutOutputBuilder.build();
    }
}
