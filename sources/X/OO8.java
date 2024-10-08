package X;

import java.util.LinkedHashSet;

public final class OO8 {
    public long A00 = Long.MAX_VALUE;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;

    public final synchronized String A00(boolean z) {
        String str;
        LinkedHashSet A0y = DbS.A0y();
        if (!this.A05) {
            A0y.add("rendering");
        }
        if (!z && this.A01 < this.A00) {
            A0y.add("iris_sync");
        }
        if (z && !this.A03) {
            A0y.add("mem_offline_sync");
        }
        if (!z && !this.A04) {
            A0y.add("mqtt_connection");
        }
        if (z && !this.A02) {
            A0y.add("chatd_connection");
        }
        if (A0y.isEmpty()) {
            str = null;
        } else {
            str = 00k.A0P(", ", "[", "]", A0y, (0sP) null);
        }
        return str;
    }

    public final synchronized void A01(boolean z) {
        this.A03 = z;
    }

    public final synchronized void A02(boolean z) {
        this.A04 = z;
    }

    public final synchronized boolean A03(boolean z) {
        boolean z2;
        z2 = true;
        if (this.A05) {
            if (z) {
                if (this.A03 && this.A02) {
                }
            } else if (this.A01 >= this.A00 && this.A04) {
            }
        }
        z2 = false;
        return z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OO8) {
                OO8 oo8 = (OO8) obj;
                if (!(this.A05 == oo8.A05 && this.A00 == oo8.A00 && this.A01 == oo8.A01 && this.A03 == oo8.A03 && this.A04 == oo8.A04 && this.A02 == oo8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A01(this.A00, C51965G9l.A05(this.A05))))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FOAMessagingMarkerEndingCriteria(rendered=");
        A1A.append(this.A05);
        A1A.append(", irisLatestSeqId=");
        A1A.append(this.A00);
        A1A.append(", irisLocalSeqId=");
        A1A.append(this.A01);
        A1A.append(", memUpToDate=");
        A1A.append(this.A03);
        A1A.append(", mqttConnected=");
        A1A.append(this.A04);
        A1A.append(", chatdConnected=");
        return G9t.A1C(A1A, this.A02);
    }
}
