package X;

/* renamed from: X.Dtc  reason: case insensitive filesystem */
public final class C47251Dtc extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47251Dtc) {
                C47251Dtc dtc = (C47251Dtc) obj;
                if (!0qQ.A0K(this.A04, dtc.A04) || !0qQ.A0K(this.A02, dtc.A02) || !0qQ.A0K(this.A01, dtc.A01) || !0qQ.A0K(this.A03, dtc.A03) || !0qQ.A0K(this.A00, dtc.A00) || this.A05 != dtc.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A04))))));
    }

    public C47251Dtc(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A00 = str5;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SectionItemViewModel(threadTitle=");
        A1A.append(this.A04);
        A1A.append(", subtitle=");
        A1A.append(this.A02);
        A1A.append(C66579MXk.A00(46));
        A1A.append(this.A01);
        A1A.append(C66579MXk.A00(49));
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(427));
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(443));
        A1A.append(this.A05);
        return AnonymousClass7TG.A0p(A1A);
    }
}
