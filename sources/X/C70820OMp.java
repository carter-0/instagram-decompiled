package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.OMp  reason: case insensitive filesystem */
public final class C70820OMp {
    public C45398Cve A00;
    public DirectAnimatedMedia A01;
    public AnonymousClass53G A02;
    public Integer A03;
    public String A04;
    public String A05;

    public final DirectAnimatedMedia A00() {
        AnonymousClass53G r0;
        DirectAnimatedMedia directAnimatedMedia = this.A01;
        if (directAnimatedMedia != null || (r0 = this.A02) == null) {
            return directAnimatedMedia;
        }
        DirectAnimatedMedia A012 = AnonymousClass53I.A01(r0);
        this.A01 = A012;
        return A012;
    }

    public final Integer A01() {
        Integer num = this.A03;
        if (num != null) {
            return num;
        }
        String str = this.A04;
        if (str != null && !str.isEmpty() && str.equals("❤")) {
            return AnonymousClass05K.A01;
        }
        if (A00() != null) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }
}
