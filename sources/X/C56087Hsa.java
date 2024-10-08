package X;

/* renamed from: X.Hsa  reason: case insensitive filesystem */
public final class C56087Hsa {
    public final Integer A00;
    public final Integer A01;

    public C56087Hsa(Integer num, Integer num2) {
        0qQ.A0B(num2, 2);
        this.A00 = num;
        this.A01 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56087Hsa) {
                C56087Hsa hsa = (C56087Hsa) obj;
                if (!(this.A00 == hsa.A00 && this.A01 == hsa.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "COMPOSER_PLUS";
        } else {
            str = "COMPOSER";
        }
        int A0F = C51968G9o.A0F(str, intValue);
        int intValue2 = this.A01.intValue();
        if (intValue2 != 0) {
            str2 = "GROUP";
        } else {
            str2 = "ONE_TO_ONE";
        }
        return A0F + C51966G9m.A04(str2, intValue2);
    }

    public final String toString() {
        String str;
        String str2;
        if (this.A00.intValue() != 0) {
            str = "COMPOSER_PLUS";
        } else {
            str = "COMPOSER";
        }
        if (this.A01.intValue() != 0) {
            str2 = "GROUP";
        } else {
            str2 = "ONE_TO_ONE";
        }
        return 002.A0v("MetaAIPromptSheetLoggingParams(entryPoint=", str, ", threadType=", str2, ')');
    }
}
