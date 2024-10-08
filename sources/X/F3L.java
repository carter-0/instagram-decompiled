package X;

import java.util.List;

public final class F3L {
    public String A00;
    public String A01;
    public List A02;
    public List A03;

    public final String A00(int i) {
        List list = this.A02;
        if (list == null || list.size() <= i) {
            return "";
        }
        return ((C49480EwL) list.get(i)).A01;
    }

    public final String A01(int i) {
        List list = this.A03;
        if (list == null || list.size() <= i) {
            return "";
        }
        return ((C49480EwL) list.get(i)).A01;
    }
}
