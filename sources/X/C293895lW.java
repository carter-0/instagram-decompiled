package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5lW  reason: invalid class name and case insensitive filesystem */
public final class C293895lW implements C228232l0 {
    public final C296295pp A00;
    public final List A01 = new ArrayList();
    public final boolean A02;
    public final C296325ps A03;

    public final Map AUH(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.A03.ATx(C233162v9.COMMENT_BUTTON_CLICK, str));
        if (this.A02) {
            List list = this.A01;
            if (!list.isEmpty()) {
                linkedHashMap.put("feed_comment_button_tap_info", 00k.A0P(", ", "", "", list, (0sP) null));
                list.clear();
            }
        }
        return linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        C230472pg r0;
        String id;
        1Xj r5 = (1Xj) obj;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        if (r4 == C233162v9.COMMENT_BUTTON_CLICK) {
            AnonymousClass3KX r02 = AnonymousClass3KW.A00;
            if (AnonymousClass3KX.A00(r6)) {
                C296295pp r1 = this.A00;
                if (r5.CcK()) {
                    r0 = C230472pg.SPONSORED;
                } else {
                    r0 = C230472pg.ORGANIC;
                }
                r1.A00(r0, r4, r5, r6);
                if (this.A02 && (id = r5.getId()) != null && id.length() != 0) {
                    List list = this.A01;
                    String id2 = r5.getId();
                    if (id2 != null) {
                        list.add(id2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in GeneralRealtimeSignalProviderImpl: ");
        sb.append(r4);
        throw new IllegalArgumentException(sb.toString());
    }

    public C293895lW(C296325ps r2, C296295pp r3, boolean z) {
        this.A00 = r3;
        this.A03 = r2;
        this.A02 = z;
    }
}
