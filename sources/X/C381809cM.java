package X;

/* renamed from: X.9cM  reason: invalid class name and case insensitive filesystem */
public final class C381809cM extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C381809cM(String str, String str2, String str3, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381809cM)) {
            return false;
        }
        C381809cM r3 = (C381809cM) obj;
        if (r3.A00 != 0 || !0qQ.A0K(this.A04, r3.A04) || this.A01 != r3.A01 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        return AnonymousClass7TF.A08(this.A02, (AnonymousClass7TE.A0O(this.A04) + this.A01) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (i != 0) {
            A1A.append("RemixPivotPageArguments(mediaId=");
            A1A.append(this.A02);
            A1A.append(", mediaTapToken=");
            A1A.append(this.A03);
            A1A.append(", tappedMediaPosition=");
            A1A.append(this.A01);
            A1A.append(", tappedMediaId=");
            str = this.A04;
        } else {
            A1A.append("SFXAudio(localFilePath=");
            A1A.append(this.A04);
            A1A.append(", durationMs=");
            A1A.append(this.A01);
            A1A.append(", audioAssetId=");
            A1A.append(this.A02);
            A1A.append(AnonymousClass000.A00(2005));
            str = this.A03;
        }
        A1A.append(str);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C381809cM(String str, String str2, String str3, int i) {
        AnonymousClass7TG.A0w(1, str, str2, str3);
        this.A04 = str;
        this.A01 = i;
        this.A02 = str2;
        this.A03 = str3;
    }
}
