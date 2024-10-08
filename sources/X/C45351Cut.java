package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Cut  reason: case insensitive filesystem */
public final class C45351Cut {
    public final ImmutableList A00;
    public final C45302Cu6 A01;
    public final String A02;

    public C45351Cut(C45382CvO cvO) {
        this.A02 = cvO.A01;
        List list = cvO.A03;
        0qQ.A07(list);
        this.A01 = new C45302Cu6((C45296Ctz) 00k.A0O(list, 0));
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (C45381CvN cvN : cvO.A02) {
            0qQ.A0A(cvN);
            builder.add(new C45386CvS(cvN));
        }
        this.A00 = builder.build();
    }
}
