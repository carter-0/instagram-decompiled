package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HqS  reason: case insensitive filesystem */
public final class C55961HqS {
    public int A00 = 0;
    public C55430Hha A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final ArrayList A03 = AnonymousClass7TE.A1C();

    public final C55859Hog A00() {
        ArrayList arrayList = this.A03;
        int i = this.A00;
        this.A00 = i + 1;
        C55859Hog hog = (C55859Hog) 00k.A0O(arrayList, i);
        if (hog != null) {
            return hog;
        }
        C55859Hog hog2 = new C55859Hog(Integer.valueOf(this.A00));
        arrayList.add(hog2);
        return hog2;
    }
}
