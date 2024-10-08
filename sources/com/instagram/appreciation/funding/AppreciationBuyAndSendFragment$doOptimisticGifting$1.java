package com.instagram.appreciation.funding;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C59995Jd4;
import X.C60340gF;
import X.MRT;
import androidx.fragment.app.FragmentActivity;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appreciation.funding.AppreciationBuyAndSendFragment$doOptimisticGifting$1", f = "AppreciationBuyAndSendFragment.kt", i = {0, 0, 0, 0}, l = {365}, m = "invokeSuspend", n = {"logger", "viewName", "bugReporter", "errorSnackBarEvent"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class AppreciationBuyAndSendFragment$doOptimisticGifting$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ FragmentActivity A07;
    public final /* synthetic */ LoggingFanData A08;
    public final /* synthetic */ C59995Jd4 A09;
    public final /* synthetic */ MRT A0A;
    public final /* synthetic */ UserSession A0B;
    public final /* synthetic */ SimpleImageUrl A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ List A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppreciationBuyAndSendFragment$doOptimisticGifting$1(FragmentActivity fragmentActivity, LoggingFanData loggingFanData, C59995Jd4 jd4, MRT mrt, UserSession userSession, SimpleImageUrl simpleImageUrl, String str, String str2, String str3, String str4, String str5, List list, AnonymousClass4D7 r14, int i, int i2) {
        super(2, r14);
        this.A0B = userSession;
        this.A07 = fragmentActivity;
        this.A08 = loggingFanData;
        this.A0D = str;
        this.A0E = str2;
        this.A06 = i;
        this.A0C = simpleImageUrl;
        this.A0F = str3;
        this.A05 = i2;
        this.A0I = list;
        this.A0G = str4;
        this.A0H = str5;
        this.A0A = mrt;
        this.A09 = jd4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.appreciation.funding.AppreciationBuyAndSendFragment$doOptimisticGifting$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r18) {
        UserSession userSession = this.A0B;
        FragmentActivity fragmentActivity = this.A07;
        LoggingFanData loggingFanData = this.A08;
        String str = this.A0D;
        String str2 = this.A0E;
        int i = this.A06;
        SimpleImageUrl simpleImageUrl = this.A0C;
        String str3 = this.A0F;
        int i2 = this.A05;
        List list = this.A0I;
        String str4 = this.A0G;
        String str5 = this.A0H;
        return new AppreciationBuyAndSendFragment$doOptimisticGifting$1(fragmentActivity, loggingFanData, this.A09, this.A0A, userSession, simpleImageUrl, str, str2, str3, str4, str5, list, r18, i, i2);
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r20
            X.1Hj r7 = X.1Hj.A02
            r0 = r19
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x00b9
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
            boolean r4 = r5 instanceof X.C297815sO
            if (r4 == 0) goto L_0x0074
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r11 = r5.A00
            java.lang.String r11 = (java.lang.String) r11
            com.instagram.common.session.UserSession r4 = r0.A0B
            java.lang.String r12 = r4.A06
            com.instagram.appreciation.analytics.LoggingFanData r4 = r0.A08
            java.lang.String r13 = r4.A00
            java.lang.String r14 = r4.A03
            java.lang.String r15 = r0.A0G
            java.lang.String r6 = r4.A02
            java.lang.String r5 = r0.A0F
            int r4 = r0.A05
        L_0x003c:
            r16 = r6
            r17 = r5
            r18 = r4
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r6 = r0.A0I
            r12 = 0
            r8 = r1
            r9 = r2
            r10 = r5
            r13 = r6
            r14 = r4
            r8.A01(r9, r10, r11, r12, r13, r14)
            X.1xC r2 = X.1xC.A01
            r2.A00(r3)
        L_0x0055:
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r0.A07
            X.37D r6 = r3.A01(r2)
            if (r6 == 0) goto L_0x0071
            X.MRT r3 = r0.A0A
            X.Jd4 r2 = r0.A09
            X.Lz7 r0 = new X.Lz7
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r5
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            X.DbU.A1U(r0, r6, r6)
        L_0x0071:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0074:
            boolean r4 = r5 instanceof X.C239793Ih
            if (r4 == 0) goto L_0x012b
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            boolean r4 = X.AnonymousClass7TE.A1a(r4)
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = r0.A0D
            java.lang.String r3 = r0.A0H
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r3)
            int r3 = r0.A06
            X.JTS.A0w(r5, r4, r3)
            X.1xC r4 = X.1xC.A01
            com.instagram.common.typedurl.SimpleImageUrl r3 = r0.A0C
            X.3GP r3 = X.C63038KqT.A00(r3, r5)
            r4.A00(r3)
            java.lang.String r5 = r0.A0F
            int r4 = r0.A05
            java.util.List r3 = r0.A0I
            r1.A03(r2, r5, r3, r4)
            goto L_0x0055
        L_0x00a4:
            com.instagram.common.session.UserSession r4 = r0.A0B
            java.lang.String r12 = r4.A06
            com.instagram.appreciation.analytics.LoggingFanData r4 = r0.A08
            java.lang.String r13 = r4.A00
            java.lang.String r14 = r4.A03
            java.lang.String r15 = r0.A0G
            java.lang.String r6 = r4.A02
            java.lang.String r5 = r0.A0F
            int r4 = r0.A05
            java.lang.String r11 = "[buy-and-send] Result is success but the server return false"
            goto L_0x003c
        L_0x00b9:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r4 = r0.A0B
            androidx.fragment.app.FragmentActivity r1 = r0.A07
            com.instagram.appreciation.analytics.LoggingFanData r9 = r0.A08
            java.lang.String r15 = r9.A03
            X.LFO r5 = new X.LFO
            r5.<init>(r4, r1, r15)
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r3 = new com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource
            r3.<init>(r4)
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r1 = 28
            X.MMZ r2 = new X.MMZ
            r2.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3)
            java.lang.Class<X.Lin> r1 = X.C64827Lin.class
            java.lang.Object r6 = r4.A01(r1, r2)
            X.Lin r6 = (X.C64827Lin) r6
            java.lang.String r1 = "appreciation_buy_and_send"
            X.0xG r2 = X.DbS.A0O(r1)
            X.LPB r1 = new X.LPB
            r1.<init>(r9, r2, r4)
            X.Khq r2 = X.C62560Khq.BuyAndSend
            X.1Z0 r3 = X.AnonymousClass2BF.A00()
            X.2BJ r10 = r3.A00(r4)
            java.lang.String r5 = r0.A0D
            java.lang.String r3 = r0.A0E
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r3)
            int r3 = r0.A06
            X.JTS.A0w(r4, r5, r3)
            com.instagram.common.typedurl.SimpleImageUrl r3 = r0.A0C
            X.3GP r3 = X.C63038KqT.A00(r3, r4)
            java.lang.String r12 = r0.A0F
            int r5 = r0.A05
            java.util.List r4 = r0.A0I
            r1.A02(r2, r12, r4, r5)
            java.lang.String r13 = r9.A02
            java.lang.String r14 = r0.A0G
            r0.A01 = r1
            r0.A02 = r2
            r0.A03 = r10
            r0.A04 = r3
            r0.A00 = r8
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r11 = r6.A01
            r16 = r0
            java.lang.Object r5 = r11.A00(r12, r13, r14, r15, r16)
            if (r5 != r7) goto L_0x001e
            return r7
        L_0x012b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationBuyAndSendFragment$doOptimisticGifting$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationBuyAndSendFragment$doOptimisticGifting$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
