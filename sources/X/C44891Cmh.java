package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44891Cmh {
    public static Map A00(C239603Hc r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AYU() != null) {
            A1H.put("action_text", r4.AYU());
        }
        C257593xe AgG = r4.AgG();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AgG != null) {
            A1H.put("bloks_data", AgG.A00());
        }
        if (r4.Aro() != null) {
            A1H.put(AnonymousClass000.A00(1231), r4.Aro());
        }
        if (r4.B9V() != null) {
            A1H.put("global_position", r4.B9V());
        }
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), A1H);
        }
        if (r4.BJN() != null) {
            C67241sS BJN = r4.BJN();
            if (BJN != null) {
                treeUpdaterJNI = BJN.FHC();
            }
            A1H.put("item_client_gap_rules", treeUpdaterJNI);
        }
        if (r4.BLm() != null) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            A1H.put("layout", C41845B3m.A0T("", 0Yt.A0E()));
        }
        if (r4.getMessage() != null) {
            A1H.put(DialogModule.KEY_MESSAGE, r4.getMessage());
        }
        if (r4.getTitle() != null) {
            C41845B3m.A12(r4.getTitle(), A1H);
        }
        if (r4.C9L() != null) {
            A1H.put("tracking_token", r4.C9L());
        }
        if (r4.CEl() != null) {
            A1H.put("view_state_item_type", r4.CEl());
        }
        return 0Yt.A0B(A1H);
    }
}
