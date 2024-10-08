package X;

import android.content.SharedPreferences;

/* renamed from: X.WHx  reason: case insensitive filesystem */
public final class C19045WHx implements AnonymousClass2Kv {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public C19045WHx(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }

    public final void invoke(AnonymousClass3JD r7) {
        if (this.A00 != 0) {
            C52673Gal gal = (C52673Gal) this.A02;
            String str = this.A03;
            long j = this.A01;
            0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "ctd_automated_responses_gql_mutation_success");
            if (A0e.isSampled()) {
                C13990Tnq.A11(A0e, gal, str, j);
                A0e.Cgf();
                return;
            }
            return;
        }
        String str2 = this.A03;
        int i = (int) this.A01;
        SharedPreferences.Editor edit = ((MZy) this.A02).A00.getSharedPreferences("token_ack_prefs", 0).edit();
        edit.putInt(str2, i);
        edit.apply();
    }
}
