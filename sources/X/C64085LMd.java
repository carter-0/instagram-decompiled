package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.LMd  reason: case insensitive filesystem */
public final class C64085LMd {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public C64085LMd(C348667yp r2) {
        0qQ.A0B(r2, 1);
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        this.A03 = emptyList;
        this.A01 = r2.getId();
        this.A02 = r2.getUri();
        this.A00 = r2.AjI();
        this.A03 = r2.C1p();
    }

    public C64085LMd() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        this.A03 = emptyList;
    }
}
