package X;

import com.instagram.user.model.User;

/* renamed from: X.WvX  reason: case insensitive filesystem */
public final class C20594WvX extends 03J implements C62320sa {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20594WvX(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                case 2: goto L_0x0013;
                case 3: goto L_0x001b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.U91> r3 = X.U91.class
            r1 = 0
            java.lang.String r4 = "useShortenedReplyBarHint"
            java.lang.String r5 = "useShortenedReplyBarHint()V"
        L_0x000d:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.K7a> r3 = X.C61426K7a.class
            r1 = 0
            java.lang.String r4 = "onCloseFriendsButtonClicked"
            java.lang.String r5 = "onCloseFriendsButtonClicked()V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.K7a> r3 = X.C61426K7a.class
            r1 = 0
            java.lang.String r4 = "onDiscoverabilityClicked"
            java.lang.String r5 = "onDiscoverabilityClicked()V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20594WvX.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UOL uol;
        switch (this.A00) {
            case 0:
            case 2:
                C61426K7a.A01((C61426K7a) this.receiver);
                break;
            case 4:
                U91 u91 = (U91) this.receiver;
                Object value = u91.A0G.getValue();
                User user = null;
                if ((value instanceof UOL) && (uol = (UOL) value) != null) {
                    05G r4 = u91.A0E;
                    UOF A002 = U91.A00(u91);
                    if (A002 != null) {
                        user = C17103VHz.A00(A002);
                    }
                    C20852X1e A003 = W2B.A00(u91.A03, u91.A0A, user, (String) null, u91.A0B.A00(), true);
                    boolean z = uol.A02;
                    Integer num = uol.A01;
                    DbY.A1S(A003, num);
                    r4.Epw(new UOL(A003, num, z));
                    break;
                }
            default:
                C61426K7a.A02((C61426K7a) this.receiver);
                break;
        }
        return C60340gF.A00;
    }
}
