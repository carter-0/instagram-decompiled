package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Hsy  reason: case insensitive filesystem */
public final class C56111Hsy {
    public final Drawable A00;
    public final String A01;
    public final C62320sa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56111Hsy) {
                C56111Hsy hsy = (C56111Hsy) obj;
                if (!0qQ.A0K(this.A01, hsy.A01) || !0qQ.A0K(this.A00, hsy.A00) || !0qQ.A0K(this.A02, hsy.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C56111Hsy(Drawable drawable, String str, C62320sa r3) {
        this.A01 = str;
        this.A00 = drawable;
        this.A02 = r3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIListCellLabel(text=");
        A1A.append(this.A01);
        A1A.append(", inlineIcon=");
        A1A.append(this.A00);
        A1A.append(", onLabelClick=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
