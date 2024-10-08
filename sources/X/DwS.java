package X;

import android.text.TextUtils;

public final class DwS extends 1XP {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final FAP A00() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.A04)) {
            return new FAP(this, this.A04, this.A05, true);
        }
        if (!TextUtils.isEmpty(this.A00)) {
            str = this.A00;
            str2 = this.A01;
        } else if (!TextUtils.isEmpty(this.A02)) {
            str = this.A02;
            str2 = this.A03;
        } else if (TextUtils.isEmpty(this.A06)) {
            return null;
        } else {
            str = this.A06;
            str2 = this.A07;
        }
        return new FAP(this, str, str2);
    }
}
