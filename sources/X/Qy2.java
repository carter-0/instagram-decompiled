package X;

import android.app.PendingIntent;
import java.util.List;

public final class Qy2 extends C10893Rzt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final PendingIntent A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10893Rzt) {
                Qy2 qy2 = (Qy2) ((C10893Rzt) obj);
                if (this.A00 == qy2.A00 && this.A01 == qy2.A01 && this.A02 == qy2.A02 && this.A03 == qy2.A03 && this.A04 == qy2.A04) {
                    List list = this.A06;
                    List list2 = qy2.A06;
                    if (list != null ? list.equals(list2) : list2 == null) {
                        List list3 = this.A07;
                        List list4 = qy2.A07;
                        if (list3 != null ? list3.equals(list4) : list4 == null) {
                            PendingIntent pendingIntent = this.A05;
                            PendingIntent pendingIntent2 = qy2.A05;
                            if (pendingIntent != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) {
                                List list5 = this.A08;
                                List list6 = qy2.A08;
                                if (list5 != null ? list5.equals(list6) : list6 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A02;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = j2 ^ (j2 >>> 32);
        int i2 = i * 1000003;
        return ((((((((((i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) j3)) * 1000003) ^ AnonymousClass7TG.A0C(this.A06)) * 1000003) ^ AnonymousClass7TG.A0C(this.A07)) * 1000003) ^ AnonymousClass7TG.A0C(this.A05)) * 1000003) ^ AnonymousClass7TE.A0L(this.A08);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        String valueOf = String.valueOf(this.A06);
        String valueOf2 = String.valueOf(this.A07);
        String valueOf3 = String.valueOf(this.A05);
        String valueOf4 = String.valueOf(this.A08);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SplitInstallSessionState{sessionId=");
        A1A.append(i);
        A1A.append(", status=");
        A1A.append(i2);
        A1A.append(", errorCode=");
        A1A.append(i3);
        A1A.append(", bytesDownloaded=");
        A1A.append(j);
        A1A.append(", totalBytesToDownload=");
        A1A.append(j2);
        A1A.append(", moduleNamesNullable=");
        A1A.append(valueOf);
        A1A.append(", languagesNullable=");
        A1A.append(valueOf2);
        A1A.append(", resolutionIntent=");
        A1A.append(valueOf3);
        A1A.append(", splitFileIntents=");
        return C66584MXp.A0a(valueOf4, A1A);
    }

    public Qy2(PendingIntent pendingIntent, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = pendingIntent;
        this.A08 = list3;
    }
}
