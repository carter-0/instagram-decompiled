package X;

import android.os.Bundle;
import java.util.Set;

public final class A7Y {
    public final int A00;
    public final Bundle A01;
    public final CharSequence A02;
    public final String A03;
    public final Set A04;
    public final boolean A05;
    public final CharSequence[] A06;

    public A7Y(Bundle bundle, CharSequence charSequence, String str, Set set, CharSequence[] charSequenceArr, int i, boolean z) {
        this.A03 = str;
        this.A02 = charSequence;
        this.A06 = charSequenceArr;
        this.A05 = z;
        this.A00 = i;
        this.A01 = bundle;
        this.A04 = set;
        if (i == 2 && !z) {
            throw AnonymousClass7TE.A0w("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
