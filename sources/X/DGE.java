package X;

public final class DGE implements 1vR {
    public final String A00;
    public final String A01;

    public DGE(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final String clientDocIdForQuery(String str) {
        0qQ.A0B(str, 0);
        return null;
    }

    public final String persistIdForQuery(String str) {
        String str2 = this.A00;
        if (str2 == null || !0qQ.A0K(this.A01, str)) {
            return null;
        }
        return str2;
    }

    public final String schemaForQuery(String str) {
        return null;
    }
}
