package X;

public final class PS9 implements 1aV {
    public final /* synthetic */ 0sJ A00;

    public PS9(0sJ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C301345z0 r9 = (C301345z0) obj;
        int A04 = C66580MXl.A04(r9);
        for (int i = 0; i < A04; i++) {
            String string = r9.mResultSet.getString(i, 0);
            if (string != null) {
                this.A00.invoke(string, Boolean.valueOf(r9.mResultSet.getBoolean(i, 1)), Boolean.valueOf(r9.mResultSet.getBoolean(i, 2)), Boolean.valueOf(r9.mResultSet.getBoolean(i, 3)));
            }
        }
    }
}
