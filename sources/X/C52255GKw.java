package X;

import android.content.res.Resources;

/* renamed from: X.GKw  reason: case insensitive filesystem */
public final class C52255GKw extends C266444Yx {
    public final CharSequence A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52255GKw) && 0qQ.A0K(this.A00, ((C52255GKw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringLiteral(text=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public C52255GKw(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public final CharSequence A01(Resources resources) {
        return this.A00;
    }
}
