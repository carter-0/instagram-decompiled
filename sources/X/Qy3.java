package X;

import java.util.Map;

public final class Qy3 extends C10005Rl0 {
    public final Integer A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10005Rl0) {
                Integer num = this.A00;
                Qy3 qy3 = (Qy3) ((C10005Rl0) obj);
                Integer num2 = qy3.A00;
                if (num != null ? num.equals(num2) : num2 == null) {
                    if (this.A01.equals(qy3.A01)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0C(this.A00) ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        Integer num = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        A1A.append(num);
        A1A.append(", splitInstallErrorCodeByModule=");
        return C66584MXp.A0a(valueOf, A1A);
    }

    public /* synthetic */ Qy3(Integer num, Map map) {
        this.A00 = num;
        this.A01 = map;
    }
}
