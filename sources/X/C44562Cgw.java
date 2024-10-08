package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cgw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44562Cgw {
    public static Map A00(C282195Cd r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Azw() != null) {
            A1H.put("editing_locked_message", r3.Azw());
        }
        if (r3.CRk() != null) {
            A1H.put("is_editing_locked", r3.CRk());
        }
        if (r3.BPE() != null) {
            A1H.put("max_num_addresses", r3.BPE());
        }
        if (r3.BPF() != null) {
            A1H.put("max_num_edits", r3.BPF());
        }
        if (r3.BWt() != null) {
            A1H.put("num_edits", r3.BWt());
        }
        return 0Yt.A0B(A1H);
    }
}
