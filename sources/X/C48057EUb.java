package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.EUb  reason: case insensitive filesystem */
public final class C48057EUb extends C51086FoG {
    public final int A00;
    public final Object A01;

    public C48057EUb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cyb(boolean z) {
        switch (this.A00) {
            case 7:
                C68478NJv.A03((C68478NJv) this.A01).A03(true);
                return;
            case 9:
                ((C52031GCd) this.A01).A0A.Cud();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        X.C59689JTv.A0E(r1, X.AnonymousClass000.A00(764));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        X.C59689JTv.A0D(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void De7() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x000d;
                case 2: goto L_0x000d;
                case 3: goto L_0x0005;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x0028;
                case 7: goto L_0x0005;
                case 8: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r2.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "request_error"
            goto L_0x0024
        L_0x000d:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            goto L_0x0035
        L_0x0016:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 764(0x2fc, float:1.07E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0024:
            X.C59689JTv.A0D(r1, r0)
            return
        L_0x0028:
            java.lang.Object r0 = r2.A01
            X.FV7 r0 = (X.FV7) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A02
            goto L_0x0035
        L_0x002f:
            java.lang.Object r0 = r2.A01
            X.FAf r0 = (X.C49863FAf) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A02
        L_0x0035:
            r0 = 764(0x2fc, float:1.07E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A0E(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48057EUb.De7():void");
    }

    public final void Do1(String str) {
        switch (this.A00) {
            case 3:
                C49659F0q f0q = (C49659F0q) this.A01;
                Hashtag hashtag = f0q.A00;
                String str2 = f0q.A07;
                0xI A012 = 0xI.A01("report_hashtag", f0q.A04.getModuleName());
                A012.A0C(Pxd.A00(864), "hashtag_inappropriate");
                A012.A0C(C46326Dbu.A00(), str2);
                W0l.A03(A012, hashtag);
                C51930G7y g7y = f0q.A06;
                int B6M = g7y.B6M();
                int BLS = g7y.BLS();
                A012.A08(Integer.valueOf(B6M), "start_row");
                A012.A08(Integer.valueOf(BLS), "end_row");
                C16672Uz8 Auk = g7y.Auk();
                0qQ.A0A(Auk);
                C18766W0k.A02(A012, Auk, g7y.Aul());
                DbU.A1R(A012, f0q.A05);
                return;
            case 4:
                C59689JTv.A0F(DbT.A0E(this.A01), "report_submit_success", 2131975210);
                return;
            case 5:
                boolean equals = "ig_spam_v3".equals(str);
                C15383Ubh ubh = (C15383Ubh) this.A01;
                int i = -1;
                if (equals) {
                    i = 1;
                }
                C15383Ubh.A03(ubh, i);
                C46354Dcy.A02(C15383Ubh.A01(ubh)).A00 = true;
                return;
            case 6:
                C267694c3 r2 = ((FV7) this.A01).A0E;
                int i2 = -1;
                if ("ig_spam_v3".equals(str)) {
                    i2 = 1;
                }
                r2.DwS(i2);
                return;
            case 9:
                ((C52031GCd) this.A01).A0A.DVX(str);
                return;
            default:
                return;
        }
    }
}
