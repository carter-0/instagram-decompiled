package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7Fw  reason: invalid class name and case insensitive filesystem */
public final class C328717Fw extends AnonymousClass7FV implements AnonymousClass7FW {
    public final DirectMessageIdentifier A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C328717Fw(DirectMessageIdentifier directMessageIdentifier, List list) {
        super((AnonymousClass7FU) list.get(0));
        String str;
        AnonymousClass9JN r0;
        this.A00 = directMessageIdentifier;
        this.A05 = list;
        List list2 = ((N8G) list.get(0)).A00.A0b;
        if (list2 == null || (r0 = (AnonymousClass9JN) 00k.A0O(list2, 0)) == null) {
            str = null;
        } else {
            str = r0.A06;
        }
        this.A04 = str;
        this.A02 = ((N8G) list.get(0)).A01;
        this.A03 = ((N8G) list.get(0)).A02;
        this.A01 = ((N8G) list.get(0)).A00.A08.A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328717Fw) {
                C328717Fw r5 = (C328717Fw) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A05.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
