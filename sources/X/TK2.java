package X;

import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import java.util.ArrayList;

public final class TK2 implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactShoppingPickerModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;

    public TK2(IgReactShoppingPickerModule igReactShoppingPickerModule, String str, ArrayList arrayList, double d) {
        this.A01 = igReactShoppingPickerModule;
        this.A02 = str;
        this.A03 = arrayList;
        this.A00 = d;
    }

    public final void run() {
        IgReactShoppingPickerModule igReactShoppingPickerModule = this.A01;
        C9858RiX.A00(Pxe.A0T(igReactShoppingPickerModule).A00(), igReactShoppingPickerModule.mSession, (C262944Gp) null, new T8M(this, 0), this.A02, this.A03, (int) this.A00);
    }
}
