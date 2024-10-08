package X;

import com.facebook.litho.ComponentTree;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;

/* renamed from: X.5lO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C293815lO implements 0sP {
    public final /* synthetic */ ComponentTree A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C293815lO(ComponentTree componentTree, String str, boolean z) {
        this.A00 = componentTree;
        this.A01 = str;
        this.A02 = z;
    }

    public final Object invoke(Object obj) {
        String str;
        ComponentTree componentTree = this.A00;
        String str2 = this.A01;
        boolean z = this.A02;
        Map map = (Map) obj;
        C251263mp r0 = componentTree.A03;
        if (r0 != null) {
            str = r0.A0J();
        } else {
            str = "";
        }
        map.put("root", str);
        map.put("attribution", str2);
        map.put(BaseJavaModule.METHOD_TYPE_ASYNC, Boolean.valueOf(!z));
        map.put("stack", C11145SCa.A00());
        return C60340gF.A00;
    }
}
