package X;

import com.instagram.user.model.User;

/* renamed from: X.WgD  reason: case insensitive filesystem */
public final class C19832WgD implements C20864X1q {
    public final long A00;
    public final long A01;
    public final User A02;
    public final C16669Uz5 A03;
    public final String A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SelectedQuestion{displayTimestampMs=");
        sb.append(this.A00);
        sb.append(C273654mx.A00(201));
        sb.append(this.A01);
        sb.append(", questionBody='");
        sb.append(this.A04);
        sb.append("', user='");
        User user = this.A02;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("', questionSource=");
        return Pxg.A0p(this.A03, sb);
    }

    public C19832WgD(User user, C16669Uz5 uz5, String str, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = str;
        this.A02 = user;
        this.A03 = uz5;
    }
}
