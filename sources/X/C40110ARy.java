package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ARy  reason: case insensitive filesystem */
public final class C40110ARy implements AnonymousClass82N, C41801B1g {
    public final List A00 = AnonymousClass7TE.A1C();

    public final void CLT() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A01, this.A00, AnonymousClass7TF.A0x("serviceType", 38));
    }

    public final void Eqm(AnonymousClass82O r7, List list, List list2, List list3) {
        0qQ.A0B(r7, 0);
        AnonymousClass7TH.A0f(this.A00, new 0eP[]{AnonymousClass7TF.A0x("serviceType", 38), AnonymousClass7TH.A0J(AnonymousClass05K.A00), AnonymousClass7TF.A0x("autoInstructionType", r7.ordinal()), AnonymousClass7TE.A1L(IgReactMediaPickerNativeModule.WIDTH, list2), AnonymousClass7TE.A1L(IgReactMediaPickerNativeModule.HEIGHT, list3)});
    }

    public final void Eud(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass7TH.A0c("token", str, this.A00, AnonymousClass7TF.A0x("serviceType", 38), AnonymousClass7TH.A0J(AnonymousClass05K.A0C));
    }

    public final void Eue(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass7TH.A0c("text", str, this.A00, AnonymousClass7TF.A0x("serviceType", 38), AnonymousClass7TH.A0J(AnonymousClass05K.A0N));
    }

    public final List EzQ(Bundle bundle) {
        List list = this.A00;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }
}
