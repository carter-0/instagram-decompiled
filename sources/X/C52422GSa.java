package X;

/* renamed from: X.GSa  reason: case insensitive filesystem */
public abstract class C52422GSa {
    public static final void A00(C303876Bd r1, String str, String str2) {
        if (str2.length() > 0) {
            r1.A01("androidx.compose.foundation.text.inlineContent", str);
            r1.A09(str2);
            r1.A03();
            return;
        }
        throw AnonymousClass7TE.A0w("alternateText can't be an empty string.");
    }
}
