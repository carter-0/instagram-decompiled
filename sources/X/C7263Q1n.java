package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Q1n  reason: case insensitive filesystem */
public final class C7263Q1n {
    public final C61080JwI A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public C7263Q1n(C61080JwI jwI, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A00 = jwI;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShowreelNativeDocument{name='");
        A1A.append(this.A04);
        A1A.append("', document='");
        A1A.append(this.A03);
        A1A.append("', bitmaps=");
        A1A.append(this.A01);
        A1A.append(", states=");
        A1A.append(this.A02);
        A1A.append(", metadata=");
        return Pxg.A0p(this.A00, A1A);
    }
}
