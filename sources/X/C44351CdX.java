package X;

import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CdX  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44351CdX {
    public static Map A00(C301005yJ r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Abk() != null) {
            A1H.put("animation_payload", r4.Abk());
        }
        if (r4.Acl() != null) {
            A1H.put("assets", r4.Acl());
        }
        if (r4.Acn() != null) {
            List<C46285DTo> Acn = r4.Acn();
            ArrayList arrayList = null;
            if (Acn != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46285DTo dTo : Acn) {
                    if (dTo != null) {
                        arrayList.add(dTo.FHC());
                    }
                }
            }
            A1H.put("assets_info", arrayList);
        }
        if (r4.Ane() != null) {
            ShowreelNativeClientName Ane = r4.Ane();
            0qQ.A0B(Ane, 0);
            A1H.put("client_name", Ane.A00);
        }
        if (r4.AqT() != null) {
            A1H.put("content", r4.AqT());
        }
        if (r4.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, r4.BCu());
        }
        if (r4.BOF() != null) {
            A1H.put("logging_info", r4.BOF());
        }
        if (r4.C4b() != null) {
            A1H.put("template_name", r4.C4b());
        }
        if (r4.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, r4.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
