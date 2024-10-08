package X;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.6i3  reason: invalid class name and case insensitive filesystem */
public final class C314346i3 {
    public C392059u8 A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final 02m A04;
    public final String A05;
    public final String A06;
    public final Set A07 = new LinkedHashSet();

    public C314346i3(02m r2, String str, int i) {
        0qQ.A0B(str, 2);
        0qQ.A0B(r2, 4);
        this.A06 = str;
        this.A03 = i;
        this.A04 = r2;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A05 = obj;
    }

    public static final void A00(C314346i3 r4) {
        if (r4.A02 && !r4.A01) {
            02m r3 = r4.A04;
            r3.markerAnnotate(129898941, "num_stickers_rendered", 0);
            r3.markerEnd(129898941, 3);
            r4.A01 = true;
        }
    }

    public final void A01(String str) {
        String str2;
        Set set = this.A07;
        if (!set.contains(str)) {
            set.add(str);
            if (set.size() == this.A03 && this.A02 && !this.A01) {
                02m r5 = this.A04;
                r5.markerAnnotate(129898941, "num_stickers_rendered", set.size());
                C392059u8 r2 = this.A00;
                if (r2 != null && (r2 instanceof C389469pg)) {
                    C389469pg r22 = (C389469pg) r2;
                    String str3 = r22.A00.A04;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = str4;
                    }
                    r5.markerAnnotate(129898941, "avatar_revision_id", str3);
                    C61294K1h k1h = r22.A00;
                    String str5 = k1h.A03;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    r5.markerAnnotate(129898941, "avatar_id", str5);
                    String str6 = k1h.A05;
                    if (str6 != null) {
                        str4 = str6;
                    }
                    r5.markerAnnotate(129898941, "avatar_style_id", str4);
                    if (k1h.A09) {
                        str2 = "CACHE";
                    } else {
                        str2 = "NETWORK";
                    }
                    r5.markerAnnotate(129898941, "source", str2);
                }
                r5.markerEnd(129898941, 2);
                this.A01 = true;
            }
        }
    }
}
