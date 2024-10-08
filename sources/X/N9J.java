package X;

import com.instagram.model.rtc.RtcCallKey;

public final class N9J extends AnonymousClass0T0 implements C74269Prx {
    public final RtcCallKey A00;
    public final Integer A01;
    public final Integer A02;

    public N9J(RtcCallKey rtcCallKey, Integer num, Integer num2) {
        0qQ.A0B(num2, 3);
        this.A00 = rtcCallKey;
        this.A01 = num;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9J) {
                N9J n9j = (N9J) obj;
                if (!(0qQ.A0K(this.A00, n9j.A00) && this.A01 == n9j.A01 && this.A02 == n9j.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        Integer num = this.A01;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        Integer num = this.A01;
        return AnonymousClass7TG.A0B(num, O2N.A00(num), A0C) + OR0.A00(this.A02);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallStateModel(callKey=");
        A1A.append(this.A00);
        A1A.append(", callState=");
        Integer num = this.A01;
        if (num != null) {
            str = O2N.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", callType=");
        return C51975G9x.A0i(OR0.A01(this.A02), A1A);
    }
}
