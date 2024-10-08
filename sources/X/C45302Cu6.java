package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Cu6  reason: case insensitive filesystem */
public final class C45302Cu6 {
    public final ImmutableList A00;
    public final String A01;

    public C45302Cu6(C45296Ctz ctz) {
        String str;
        ImmutableList immutableList;
        if (ctz != null) {
            str = ctz.A00;
        } else {
            str = null;
        }
        this.A01 = str;
        if (ctz != null) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (C45348Cuq cuq : ctz.A01) {
                0qQ.A0A(cuq);
                builder.add(new C45350Cus(cuq));
            }
            immutableList = builder.build();
        } else {
            immutableList = ImmutableList.of();
        }
        this.A00 = immutableList;
    }
}
