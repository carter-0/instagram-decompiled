package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashMap;
import java.util.Map;

public final class ILB implements C59543JNp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ILB(AnonymousClass3OA r1, C53927GwX gwX, int i) {
        this.A00 = i;
        this.A02 = gwX;
        this.A01 = r1;
    }

    public static HashMap A00(ILB ilb) {
        HashMap hashMap = new HashMap();
        String str = ((AnonymousClass3OA) ilb.A01).A0f;
        if (str != null) {
            hashMap.put("host_media_pk", str);
        }
        return hashMap;
    }

    public final Map B3F() {
        String str;
        int i = this.A00;
        HashMap A002 = A00(this);
        switch (i) {
            case 0:
                str = "cta";
                break;
            case 1:
                str = "info";
                break;
            case 4:
                str = DialogModule.KEY_TITLE;
                break;
            case 5:
                str = "card";
                break;
            default:
                str = "thumbnail";
                break;
        }
        A002.put("tap_source", str);
        return A002;
    }
}
