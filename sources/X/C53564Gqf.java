package X;

import com.instagram.clips.model.ClipsReplyBarData;

/* renamed from: X.Gqf  reason: case insensitive filesystem */
public final class C53564Gqf extends AnonymousClass0T0 implements JMZ {
    public final ClipsReplyBarData A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C53564Gqf(ClipsReplyBarData clipsReplyBarData, String str, String str2, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = clipsReplyBarData;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53564Gqf) {
                C53564Gqf gqf = (C53564Gqf) obj;
                if (!0qQ.A0K(this.A01, gqf.A01) || !0qQ.A0K(this.A02, gqf.A02) || !0qQ.A0K(this.A00, gqf.A00) || this.A03 != gqf.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))));
    }
}
