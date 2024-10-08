package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.litho.ComponentTree;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;

/* renamed from: X.IkA  reason: case insensitive filesystem */
public final /* synthetic */ class C58017IkA implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C251263mp A02;
    public final /* synthetic */ ComponentTree A03;
    public final /* synthetic */ 2T4 A04;

    public /* synthetic */ C58017IkA(C251263mp r1, ComponentTree componentTree, 2T4 r3, int i, int i2) {
        this.A03 = componentTree;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A04 = r3;
    }

    public final Object invoke(Object obj) {
        ComponentTree componentTree = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        C251263mp r4 = this.A02;
        2T4 r3 = this.A04;
        Map map = (Map) obj;
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "RenderInFlight");
        map.put("version", Integer.valueOf(i));
        map.put("source", C392969vg.A00(i2));
        map.put("Root", r4.A0J());
        map.put(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(r3.A0C));
        map.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(r3.A09));
        map.put("withoutSizeSpec", Boolean.valueOf(componentTree.A0V.A02.A01.A0I));
        return C60340gF.A00;
    }
}
