package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Od  reason: invalid class name and case insensitive filesystem */
public final class C263994Od {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C263994Od r5 = (C263994Od) obj;
            if (this.A02 != r5.A02 || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = this.A00;
            String str2 = r5.A00;
            return str != null ? str.equals(str2) : str2 == null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaptionsState{availableTextLanguages=");
        sb.append(this.A01);
        sb.append(", selectedTextLanguage='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(AnonymousClass000.A00(2025));
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C263994Od(String str, List list, boolean z) {
        this.A01 = new ArrayList(list);
        this.A00 = str;
        this.A02 = z;
    }

    public C263994Od() {
        this((String) null, Collections.emptyList(), false);
    }
}
