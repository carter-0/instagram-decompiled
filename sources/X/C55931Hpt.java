package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Hpt  reason: case insensitive filesystem */
public final class C55931Hpt {
    public final ImmutableList A00;
    public final String A01;

    public C55931Hpt(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShowreelNativeEventActions{mEvent='");
        A1A.append(this.A01);
        A1A.append('\'');
        A1A.append(", mDocumentActions=");
        A1A.append(this.A00);
        return C51967G9n.A0r(A1A, '}');
    }
}
