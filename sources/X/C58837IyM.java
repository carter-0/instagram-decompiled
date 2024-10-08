package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IyM  reason: case insensitive filesystem */
public final class C58837IyM extends 0Yg implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C284945Oz A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ C270284gU A03;
    public final /* synthetic */ C299635va A04;
    public final /* synthetic */ C22332Xzh A05;
    public final /* synthetic */ C22330Xzf A06;
    public final /* synthetic */ C53334GmK A07;
    public final /* synthetic */ C53008Ggz A08;
    public final /* synthetic */ UserSession A09;
    public final /* synthetic */ AnonymousClass4DU A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ C62320sa A0D;
    public final /* synthetic */ 0sP A0E;
    public final /* synthetic */ 0rm A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58837IyM(Context context, C284945Oz r3, C284945Oz r4, C270284gU r5, C299635va r6, C22332Xzh xzh, C22330Xzf xzf, C53334GmK gmK, C53008Ggz ggz, UserSession userSession, AnonymousClass4DU r12, List list, C62320sa r14, C62320sa r15, 0sP r16, 0rm r17, boolean z, boolean z2) {
        super(1);
        this.A0F = r17;
        this.A07 = gmK;
        this.A03 = r5;
        this.A05 = xzh;
        this.A0B = list;
        this.A09 = userSession;
        this.A0D = r14;
        this.A0C = r15;
        this.A06 = xzf;
        this.A0A = r12;
        this.A04 = r6;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = ggz;
        this.A02 = r3;
        this.A01 = r4;
        this.A0E = r16;
        this.A00 = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32) {
        /*
            r31 = this;
            r10 = r32
            X.I11 r10 = (X.I11) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r11 = r31
            X.0rm r0 = r11.A0F
            java.lang.Object r9 = r0.A00
            X.62P r9 = (X.AnonymousClass62P) r9
            X.J1L r27 = X.J1L.A00
            X.J1M r28 = X.J1M.A00
            X.Xzh r0 = r11.A05
            r17 = r0
            java.util.List r0 = r11.A0B
            r16 = r0
            com.instagram.common.session.UserSession r15 = r11.A09
            X.0sa r14 = r11.A0D
            X.0sa r13 = r11.A0C
            X.GmK r8 = r11.A07
            X.Xzf r12 = r11.A06
            X.4DU r7 = r11.A0A
            X.5va r6 = r11.A04
            boolean r5 = r11.A0G
            boolean r4 = r11.A0H
            X.Ggz r3 = r11.A08
            X.5Oz r2 = r11.A02
            X.5Oz r1 = r11.A01
            X.JK5 r0 = new X.JK5
            r24 = r13
            r25 = r5
            r26 = r4
            r22 = r16
            r23 = r14
            r20 = r15
            r21 = r7
            r18 = r8
            r19 = r3
            r16 = r17
            r17 = r12
            r14 = r1
            r15 = r6
            r12 = r0
            r13 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = -1218138151(0xffffffffb764afd9, float:-1.3630802E-5)
            X.5PJ r29 = X.AnonymousClass5PI.A03(r0, r1)
            java.lang.String r26 = "post-rows"
            r25 = r10
            r30 = r9
            r25.A02(r26, r27, r28, r29, r30)
            java.lang.Integer r2 = r8.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x00ef
            r1 = -1772246058(0xffffffff965dabd6, float:-1.790646E-25)
            r0 = 32
            X.JJQ r0 = X.JJQ.A00(r8, r0)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r1)
            r0 = 940(0x3ac, float:1.317E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x007c:
            r10.A01(r0, r0, r0, r1)
        L_0x007f:
            boolean r0 = r8.A0g
            if (r0 == 0) goto L_0x00c0
            r4 = 1967063423(0x753f017f, float:2.4212867E32)
            X.0sP r2 = r11.A0E
            r1 = 5
            X.JGn r0 = new X.JGn
            r0.<init>(r1, r3, r8, r2)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r4)
            java.lang.String r0 = "hidden_replies_visibility_message_key"
        L_0x0094:
            r10.A01(r0, r0, r0, r1)
        L_0x0097:
            X.4gU r1 = r11.A03
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a7
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00bd
        L_0x00a7:
            java.lang.Object r1 = r1.getValue()
            r0 = 31
            X.JJQ r1 = X.JJQ.A00(r1, r0)
            r0 = 1394866226(0x5323f832, float:7.042437E11)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r1, r0)
            java.lang.String r0 = "over_scroll_item"
            r10.A01(r0, r0, r0, r1)
        L_0x00bd:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c0:
            boolean r0 = r8.A0h
            if (r0 == 0) goto L_0x00d4
            r1 = -1949777802(0xffffffff8bc8c076, float:-7.732678E-32)
            r0 = 34
            X.JJQ r0 = X.JJQ.A00(r8, r0)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r1)
            java.lang.String r0 = "reply_visibility_message_key"
            goto L_0x0094
        L_0x00d4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x0097
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0097
            r4 = 1940825783(0x73aea6b7, float:2.7674592E31)
            android.content.Context r2 = r11.A00
            r1 = 22
            X.JJU r0 = new X.JJU
            r0.<init>(r1, r2, r3)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r4)
            java.lang.String r0 = "app_review_prompt_key"
            goto L_0x0094
        L_0x00ef:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 != r0) goto L_0x007f
            r1 = -1016546163(0xffffffffc368bc8d, float:-232.73653)
            r0 = 33
            X.JJQ r0 = X.JJQ.A00(r3, r0)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r0, r1)
            java.lang.String r0 = "error_view"
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58837IyM.invoke(java.lang.Object):java.lang.Object");
    }
}
