package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCm  reason: case insensitive filesystem */
public final class C52040GCm implements C2363233h {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C52029GCb A02;
    public final GBE A03;
    public final GD6 A04;
    public final JTB A05;
    public final C52016GBn A06;
    public final C52012GBj A07;

    public final void D9c(1Xj r1) {
    }

    public final void E0t(Integer num) {
        0qQ.A0B(num, 0);
        C56313HwQ.A01(this.A00, this.A01, num);
    }

    public final void E12(1Xj r1, C53157GjT gjT, AnonymousClass3W1 r3) {
    }

    public final void EuH(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void EuJ(1Xj r1, AnonymousClass3W1 r2) {
    }

    public final void Eul(1Xj r1, AnonymousClass3W1 r2, String str) {
    }

    public final void Ev8(1Xj r1, AnonymousClass3W1 r2, C16677UzD uzD, String str) {
    }

    public final void EvA(1Xj r1, C53157GjT gjT, AnonymousClass3W1 r3, C16677UzD uzD, String str) {
    }

    public final void FIU(DHK dhk, C57247IUi iUi) {
    }

    public final void FIV(C274594oe r1, AnonymousClass5O4 r2) {
    }

    public final void Cfd(1Xj r4, String str) {
        C56313HwQ.A00(this.A00, this.A01, r4, str, "reels");
    }

    public final void DkW(1Xj r4, AnonymousClass3W1 r5, String str, boolean z, boolean z2) {
        this.A05.D3o(C295375o3.A02(r4), str, z2);
        if (z) {
            C267324bN A022 = C295375o3.A02(r4);
            Integer num = this.A02.A03;
            if (num != null) {
                int intValue = num.intValue();
                this.A04.A0A.A0b(A022, intValue);
                this.A07.A0I(intValue, true);
                this.A06.A0D();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ds5(X.1UQ r8, X.1Xj r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0021
            r4 = r12
            if (r12 == 0) goto L_0x005c
            java.lang.String r0 = "dislike_media"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0025
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x000f:
            X.4bN r2 = X.C295375o3.A02(r9)
            X.GBE r1 = r7.A03
            if (r20 == 0) goto L_0x0022
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x0019:
            java.lang.String r6 = X.C54973Ha6.A00(r0)
            r5 = r13
            r1.A0M(r2, r3, r4, r5, r6)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0019
        L_0x0025:
            java.lang.String r0 = "dislike_audio"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x000f
        L_0x0030:
            java.lang.String r0 = "dislike_author"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x000f
        L_0x003b:
            java.lang.String r0 = "dislike_topic"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x000f
        L_0x0046:
            java.lang.String r0 = "uncomfortable"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0051
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x000f
        L_0x0051:
            java.lang.String r0 = "hide_all_specific_words"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x005c
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x000f
        L_0x005c:
            r3 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52040GCm.Ds5(X.1UQ, X.1Xj, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):void");
    }

    public C52040GCm(FragmentActivity fragmentActivity, UserSession userSession, C52029GCb gCb, GBE gbe, GD6 gd6, JTB jtb, C52016GBn gBn, C52012GBj gBj) {
        this.A02 = gCb;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = jtb;
        this.A07 = gBj;
        this.A06 = gBn;
        this.A04 = gd6;
        this.A03 = gbe;
    }
}
