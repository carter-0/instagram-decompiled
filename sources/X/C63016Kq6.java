package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kq6  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63016Kq6 {
    public static Map A00(GenAIToolInfoDictIntf genAIToolInfoDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (genAIToolInfoDictIntf.getBackgroundColor() != null) {
            A1H.put("background_color", genAIToolInfoDictIntf.getBackgroundColor());
        }
        if (genAIToolInfoDictIntf.Aqe() != null) {
            A1H.put("content_id", genAIToolInfoDictIntf.Aqe());
        }
        if (genAIToolInfoDictIntf.Bhm() != null) {
            A1H.put("prompt", genAIToolInfoDictIntf.Bhm());
        }
        if (genAIToolInfoDictIntf.Bk7() != null) {
            A1H.put("recipe_caption", genAIToolInfoDictIntf.Bk7());
        }
        if (genAIToolInfoDictIntf.BnF() != null) {
            A1H.put(TraceFieldType.RequestID, genAIToolInfoDictIntf.BnF());
        }
        if (genAIToolInfoDictIntf.Bnp() != null) {
            A1H.put("response_id", genAIToolInfoDictIntf.Bnp());
        }
        if (genAIToolInfoDictIntf.Bzk() != null) {
            A1H.put("sticker_style_str", genAIToolInfoDictIntf.Bzk());
        }
        if (genAIToolInfoDictIntf.C8A() != null) {
            CameraTool C8A = genAIToolInfoDictIntf.C8A();
            0qQ.A0B(C8A, 0);
            A1H.put("tool_type", C8A.A00);
        }
        if (genAIToolInfoDictIntf.C8V() != null) {
            A1H.put("topic", genAIToolInfoDictIntf.C8V());
        }
        return 0Yt.A0B(A1H);
    }
}
