package X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44W  reason: invalid class name */
public final class AnonymousClass44W implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44W(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r5, AnonymousClass653 r6, List list, Map map, 0sL r9, 0sL r10, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r9, 5);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str == null || !0qQ.A0K(r6.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        try {
            C45212CsP parseFromJson = C44673Cir.parseFromJson(16P.A00(r6.A02));
            0qQ.A07(parseFromJson);
            if (r9.invoke(str, r5) == null) {
                return AnonymousClass6BO.A00;
            }
            2Dm r2 = this.A00;
            A5L a5l = parseFromJson.A00;
            r2.FKs(str, a5l.A01, a5l.A00);
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            return new AnonymousClass6BR(e, "invalid_direct_nicknames_payload", "Invalid DirectNicknameUpdate payload");
        }
    }
}
