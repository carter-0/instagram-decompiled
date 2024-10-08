package com.instagram.appreciation.gifting;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61071Jw9;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1", f = "AppreciationGiftingBottomSheetFragment.kt", i = {0, 0, 0, 0}, l = {655}, m = "invokeSuspend", n = {"logger", "viewName", "bugReporter", "errorSnackBarEvent"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ C61071Jw9 A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ List A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(C61071Jw9 jw9, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, AnonymousClass4D7 r13, int i, int i2) {
        super(2, r13);
        this.A08 = userSession;
        this.A0G = str;
        this.A0D = str2;
        this.A09 = str3;
        this.A0B = str4;
        this.A0E = str5;
        this.A0A = str6;
        this.A0C = str7;
        this.A06 = i;
        this.A07 = jw9;
        this.A05 = i2;
        this.A0H = list;
        this.A0F = str8;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r17) {
        UserSession userSession = this.A08;
        String str = this.A0G;
        String str2 = this.A0D;
        String str3 = this.A09;
        String str4 = this.A0B;
        String str5 = this.A0E;
        String str6 = this.A0A;
        String str7 = this.A0C;
        int i = this.A06;
        C61071Jw9 jw9 = this.A07;
        int i2 = this.A05;
        return new AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(jw9, userSession, str, str2, str3, str4, str5, str6, str7, this.A0F, this.A0H, r17, i, i2);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Kqc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r20
            X.1Hj r6 = X.1Hj.A02
            r0 = r19
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r3 = r0.A04
            X.3GP r3 = (X.AnonymousClass3GP) r3
            java.lang.Object r10 = r0.A03
            X.2BJ r10 = (X.2BJ) r10
            java.lang.Object r2 = r0.A02
            X.Khq r2 = (X.C62560Khq) r2
            java.lang.Object r1 = r0.A01
            X.LPB r1 = (X.LPB) r1
            X.0eS.A00(r5)
        L_0x001e:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r4 = r5 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x005a
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            boolean r4 = X.AnonymousClass7TE.A1a(r4)
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = r0.A0A
            java.lang.String r3 = r0.A0F
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r3)
            int r3 = r0.A06
            X.JTS.A0w(r6, r4, r3)
            X.1xC r5 = X.1xC.A01
            X.Jw9 r4 = r0.A07
            java.lang.Object r3 = r4.A04
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.3GP r3 = X.C63038KqT.A00(r3, r6)
            r5.A00(r3)
            java.lang.Object r3 = r4.A01
            X.N4E r3 = (X.N4E) r3
            java.lang.String r4 = r3.A05
            int r3 = r0.A05
            java.util.List r0 = r0.A0H
            r1.A03(r2, r4, r0, r3)
        L_0x0057:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x005a:
            boolean r4 = r5 instanceof X.C297815sO
            if (r4 == 0) goto L_0x0135
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r11 = r5.A00
            java.lang.String r11 = (java.lang.String) r11
            com.instagram.common.session.UserSession r4 = r0.A08
            java.lang.String r12 = r4.A06
            java.lang.String r13 = r0.A09
            java.lang.String r14 = r0.A0G
            java.lang.String r15 = r0.A0E
            java.lang.String r6 = r0.A0D
            X.Jw9 r4 = r0.A07
            java.lang.Object r4 = r4.A01
            X.N4E r4 = (X.N4E) r4
            java.lang.String r5 = r4.A05
            int r4 = r0.A05
            r16 = r6
            r17 = r5
            r18 = r4
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = r0.A0H
            java.lang.String r9 = "spending_gift_network_failure"
            r6 = r1
            r7 = r2
            r8 = r5
            r10 = r11
            goto L_0x00b5
        L_0x008c:
            com.instagram.common.session.UserSession r4 = r0.A08
            java.lang.String r12 = r4.A06
            java.lang.String r13 = r0.A09
            java.lang.String r14 = r0.A0G
            java.lang.String r15 = r0.A0E
            java.lang.String r6 = r0.A0D
            X.Jw9 r4 = r0.A07
            java.lang.Object r4 = r4.A01
            X.N4E r4 = (X.N4E) r4
            java.lang.String r5 = r4.A05
            int r4 = r0.A05
            java.lang.String r11 = "Result is success but the server return false"
            r16 = r6
            r17 = r5
            r18 = r4
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = r0.A0H
            r10 = 0
            java.lang.String r9 = "spending_gift_result_failure"
            r6 = r1
            r7 = r2
            r8 = r5
        L_0x00b5:
            r11 = r0
            r12 = r4
            r6.A01(r7, r8, r9, r10, r11, r12)
            X.1xC r0 = X.1xC.A01
            r0.A00(r3)
            goto L_0x0057
        L_0x00c0:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r4 = r0.A08
            java.lang.String r9 = r0.A0G
            java.lang.String r13 = r0.A0D
            java.lang.String r2 = r0.A09
            java.lang.String r1 = r0.A0B
            com.instagram.appreciation.analytics.LoggingFanData r3 = new com.instagram.appreciation.analytics.LoggingFanData
            r3.<init>(r9, r13, r2, r1)
            java.lang.String r1 = "appreciation_gifting"
            X.0xG r2 = X.DbS.A0O(r1)
            X.LPB r1 = new X.LPB
            r1.<init>(r3, r2, r4)
            X.Khq r2 = X.C62560Khq.Send
            X.1Z0 r3 = X.AnonymousClass2BF.A00()
            X.2BJ r10 = r3.A00(r4)
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r5 = new com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource
            r5.<init>(r4)
            X.Kqc r4 = new X.Kqc
            r4.<init>()
            java.lang.String r3 = r0.A0E
            com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository r7 = new com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository
            r7.<init>(r5, r4, r9, r3)
            java.lang.String r4 = r0.A0A
            java.lang.String r3 = r0.A0C
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r3)
            int r3 = r0.A06
            X.JTS.A0w(r5, r4, r3)
            X.Jw9 r4 = r0.A07
            java.lang.Object r3 = r4.A04
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.3GP r3 = X.C63038KqT.A00(r3, r5)
            java.lang.Object r4 = r4.A01
            X.N4E r4 = (X.N4E) r4
            java.lang.String r12 = r4.A05
            int r5 = r0.A05
            java.util.List r4 = r0.A0H
            r1.A02(r2, r12, r4, r5)
            r0.A01 = r1
            r0.A02 = r2
            r0.A03 = r10
            r0.A04 = r3
            r0.A00 = r8
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r11 = r7.A00
            java.lang.String r14 = r7.A02
            java.lang.String r15 = r7.A03
            r16 = r0
            java.lang.Object r5 = r11.A00(r12, r13, r14, r15, r16)
            if (r5 != r6) goto L_0x001e
            return r6
        L_0x0135:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
