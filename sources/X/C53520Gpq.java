package X;

import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.Gpq  reason: case insensitive filesystem */
public final class C53520Gpq extends AnonymousClass0T0 implements MS9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C53520Gpq(C61084JwM jwM, AddChannelsRowChannelInfo addChannelsRowChannelInfo, int i) {
        this.A00 = i;
        this.A02 = addChannelsRowChannelInfo;
        this.A01 = jwM;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53520Gpq) || ((C53520Gpq) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final C61084JwM AYb() {
        return (C61084JwM) this.A01;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj)) {
            return false;
        }
        C53520Gpq gpq = (C53520Gpq) obj;
        if (!0qQ.A0K(this.A02, gpq.A02) || !0qQ.A0K(this.A01, gpq.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A02));
    }
}
