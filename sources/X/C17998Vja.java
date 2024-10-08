package X;

import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.Vja  reason: case insensitive filesystem */
public final class C17998Vja {
    public final int A00;
    public final int A01;
    public final int A02;
    public final User A03;
    public final String A04;

    public C17998Vja(User user, String str, int i, int i2, int i3) {
        this.A03 = user;
        this.A04 = str;
        this.A02 = i3;
        this.A01 = i2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C17998Vja vja = (C17998Vja) obj;
            if (!2Ob.A00(this.A03, vja.A03) || !2Ob.A00(this.A04, vja.A04) || !2Ob.A00(Integer.valueOf(this.A02), Integer.valueOf(vja.A02)) || !2Ob.A00(Integer.valueOf(this.A01), Integer.valueOf(vja.A01)) || !2Ob.A00(Integer.valueOf(this.A00), Integer.valueOf(vja.A00))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
