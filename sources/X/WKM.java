package X;

import com.google.common.collect.ImmutableList;

public final class WKM implements C20842X0r {
    public final ImmutableList A00;
    public final String A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeDocumentAction{mType='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", mParameters=");
        return Pxg.A0p(this.A00, sb);
    }

    public WKM(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }
}
