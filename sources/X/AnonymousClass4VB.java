package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4VB  reason: invalid class name */
public final class AnonymousClass4VB {
    public Long A00;
    public String A01;
    public String A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();

    public AnonymousClass4VB(String str, String str2, long j) {
        0qQ.A0B(str2, 2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass4VB r5 = (AnonymousClass4VB) obj;
            if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public AnonymousClass4VB() {
    }
}
