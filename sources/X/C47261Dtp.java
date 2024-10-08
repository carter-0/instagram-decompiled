package X;

/* renamed from: X.Dtp  reason: case insensitive filesystem */
public final class C47261Dtp extends AnonymousClass0T0 implements JPS {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;

    public C47261Dtp(C53324GmA gmA) {
        this.A01 = gmA;
        this.A02 = 0mp.A06("item_key_suggested_user_%s", new Object[]{DbU.A0q(gmA.A01)});
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C47261Dtp) || ((C47261Dtp) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        switch (this.A00) {
            case 1:
                return "item_key_follow_requests_view_all_cta";
            case 2:
                return "item_key_megaphone";
            default:
                return this.A02;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C47261Dtp) obj).A01)) {
            return false;
        }
        return true;
    }

    public final String getContentType() {
        switch (this.A00) {
            case 0:
                return "content_type_follow_request";
            case 1:
                return "content_type_follow_requests_view_all_cta";
            case 2:
                return "content_type_megaphone";
            default:
                return "content_type_suggested_user";
        }
    }

    public final int hashCode() {
        Object obj;
        if (1 - this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A01;
            if (obj == null) {
                return 0;
            }
        }
        return obj.hashCode();
    }

    public C47261Dtp(C53329GmF gmF) {
        this.A01 = gmF;
        this.A02 = 0mp.A06("item_key_follow_request_%s", new Object[]{gmF.A01.getId()});
    }

    public C47261Dtp(AnonymousClass4UC r2) {
        this.A01 = r2;
        this.A02 = "item_key_megaphone";
    }

    public C47261Dtp(Integer num) {
        this.A01 = num;
        this.A02 = "item_key_follow_requests_view_all_cta";
    }
}
