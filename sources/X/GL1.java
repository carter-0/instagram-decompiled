package X;

import java.util.List;
import java.util.Map;

public final class GL1 extends AnonymousClass0T0 {
    public JQN A00;
    public Integer A01;
    public boolean A02 = false;
    public boolean A03;
    public final JMF A04;
    public final List A05;
    public final Map A06;

    public GL1(JMF jmf, Integer num, Map map) {
        0qQ.A0B(jmf, 1);
        this.A04 = jmf;
        this.A06 = map;
        this.A01 = num;
        this.A03 = false;
        this.A05 = 00k.A0a(map.keySet());
        this.A00 = new C52055GDb();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GL1) {
                GL1 gl1 = (GL1) obj;
                if (!(0qQ.A0K(this.A04, gl1.A04) && 0qQ.A0K(this.A06, gl1.A06) && this.A02 == gl1.A02 && this.A01 == gl1.A01 && this.A03 == gl1.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A06, AnonymousClass7TE.A0K(this.A04)));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "SKIP_DELAY";
                break;
            case 2:
                str = "SKIP_ALL";
                break;
            default:
                str = "NORMAL";
                break;
        }
        return DbS.A06(this.A03, C51971G9r.A0F(str, intValue, A09));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TimelineTask(id=");
        A1A.append(this.A04);
        A1A.append(", dependencyMap=");
        A1A.append(this.A06);
        A1A.append(AnonymousClass000.A00(842));
        A1A.append(this.A02);
        A1A.append(", executionMode=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "SKIP_DELAY";
                    break;
                case 2:
                    str = "SKIP_ALL";
                    break;
                default:
                    str = "NORMAL";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", isCompleted=");
        return G9t.A1C(A1A, this.A03);
    }
}
