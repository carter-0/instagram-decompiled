package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HbR  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55056HbR {
    public static Map A00(C257543xZ r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getText() != null) {
            A1H.put("text", r3.getText());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        if (r3.getUrl() != null) {
            A1H.put("url", r3.getUrl());
        }
        return 0Yt.A0B(A1H);
    }
}
