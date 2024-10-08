package X;

import java.util.Collections;
import org.json.JSONObject;

public final class IL9 implements C244333b1 {
    public final String A00;
    public final AnonymousClass4HI A01 = new IL7(this, 2);
    public final AnonymousClass0iw A02;
    public final 1Xj A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final AnonymousClass57r AWp() {
        return null;
    }

    public final C2814457q AWq() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4Lh, java.lang.Object] */
    public final AnonymousClass4Lh AWe() {
        boolean z;
        String str = this.A06;
        AnonymousClass0iw r3 = this.A02;
        1Xj r0 = this.A03;
        if (r0 != null) {
            z = r0.CcK();
        } else {
            z = false;
        }
        AnonymousClass4HI r02 = this.A01;
        ? obj = new Object();
        obj.A01 = str;
        obj.A02 = r3;
        obj.A06 = z;
        obj.A00 = r02;
        obj.A05 = Collections.emptySet();
        return obj;
    }

    public IL9(1Xj r3, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = str4;
        this.A03 = r3;
        this.A04 = str5;
        this.A02 = DbS.A0O(str);
    }

    public final String AWo() {
        JSONObject A11 = DbS.A11();
        A11.put("product_id", this.A06);
        A11.put("merchant_id", this.A05);
        1Xj r2 = this.A03;
        if (r2 != null) {
            String id = r2.getId();
            if (id != null) {
                A11.put("m_pk", id);
            }
            String C9L = r2.C9L();
            if (C9L != null) {
                A11.put("tracking_token", C9L);
            }
            A11.put(AnonymousClass000.A00(166), r2.CcK());
        }
        String str = this.A04;
        if (str != null) {
            A11.put(AnonymousClass000.A00(4576), str);
        }
        return DbT.A10(A11);
    }
}
