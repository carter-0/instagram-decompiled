package X;

import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rp.omnigrid.marlogrid.MarloGridNative;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;

/* renamed from: X.Pgf  reason: case insensitive filesystem */
public final /* synthetic */ class C73604Pgf extends 03J implements 0sP {
    public static final C73604Pgf A00 = new C73604Pgf();

    public C73604Pgf() {
        super(1, C69559No3.class, "computeMarloGridLayout", "computeMarloGridLayout(Lcom/facebook/rtc/views/omnigrid/GridLayoutInput;)Lcom/facebook/rtc/views/omnigrid/GridLayoutOutput;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
        0qQ.A0B(gridLayoutInput, 0);
        C69720Nqg nqg = MarloGridNative.Companion;
        GridLayoutOutputBuilder gridLayoutOutputBuilder = new GridLayoutOutputBuilder(gridLayoutInput);
        MarloGridNative.jni_computeMarloGridLayout(gridLayoutInput, gridLayoutOutputBuilder);
        return gridLayoutOutputBuilder.build();
    }
}
