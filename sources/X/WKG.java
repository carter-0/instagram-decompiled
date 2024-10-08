package X;

import com.google.common.collect.ImmutableList;

public final class WKG implements C20841X0q {
    public final ImmutableList A00;
    public final String A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeAction{mType='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", mParameters=");
        return Pxg.A0p(this.A00, sb);
    }

    public WKG(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }
}
