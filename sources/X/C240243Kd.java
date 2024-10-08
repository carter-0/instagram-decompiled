package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.3Kd  reason: invalid class name and case insensitive filesystem */
public final class C240243Kd extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final AnonymousClass5OB A00;
    public final 1Xj A01;
    public final Integer A02;
    public final String A03;

    public C240243Kd(AnonymousClass5OB r2, 1Xj r3, Integer num, String str) {
        0qQ.A0B(num, 2);
        0qQ.A0B(str, 3);
        this.A01 = r3;
        this.A02 = num;
        this.A03 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240243Kd) {
                C240243Kd r5 = (C240243Kd) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02 || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else {
            str = "Caption";
        }
        int hashCode3 = (((hashCode2 + str.hashCode() + intValue) * 31) + this.A03.hashCode()) * 31;
        AnonymousClass5OB r1 = this.A00;
        if (r1 == null) {
            hashCode = 0;
        } else {
            hashCode = r1.hashCode();
        }
        return hashCode3 + hashCode;
    }
}
