package com.instagram.fanclub.gifting;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1", f = "FanClubGiftingViewModel.kt", i = {1, 1}, l = {87, 91}, m = "invokeSuspend", n = {"destination$iv$iv", "it"}, s = {"L$6", "L$8"})
public final class FanClubGiftingViewModel$fetchGiftOptions$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ Context A0A;
    public final /* synthetic */ FragmentActivity A0B;
    public final /* synthetic */ FanClubGiftingViewModel A0C;
    public final /* synthetic */ User A0D;
    public final /* synthetic */ String A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FanClubGiftingViewModel$fetchGiftOptions$1(Context context, FragmentActivity fragmentActivity, FanClubGiftingViewModel fanClubGiftingViewModel, User user, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A0C = fanClubGiftingViewModel;
        this.A0D = user;
        this.A0B = fragmentActivity;
        this.A0A = context;
        this.A0E = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        FanClubGiftingViewModel fanClubGiftingViewModel = this.A0C;
        User user = this.A0D;
        return new FanClubGiftingViewModel$fetchGiftOptions$1(this.A0A, this.A0B, fanClubGiftingViewModel, user, this.A0E, r9);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0164, code lost:
        if (r7 != null) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r12 = r22
            X.1Hj r11 = X.1Hj.A02
            r13 = r21
            int r0 = r13.A00
            r10 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00ee
            if (r0 == r9) goto L_0x0104
            java.lang.Object r15 = r13.A09
            X.3lr r15 = (X.C250663lr) r15
            java.lang.Object r8 = r13.A08
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r13.A07
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r6 = r13.A06
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r6 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r6
            java.lang.Object r5 = r13.A05
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r13.A04
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.Object r3 = r13.A03
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r13.A02
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r13.A01
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r1 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r1
            X.0eS.A00(r12)
        L_0x0035:
            java.lang.String r12 = (java.lang.String) r12
            X.0qQ.A0A(r15)
            if (r12 == 0) goto L_0x00a3
            java.lang.String r0 = "sku"
            java.lang.String r20 = r15.A0A(r0)
            if (r20 == 0) goto L_0x00a3
            r19 = 0
            java.lang.String r14 = "id"
            r0 = r19
            java.lang.String r18 = r15.getOptionalStringField(r0, r14)
            if (r18 == 0) goto L_0x00a3
            X.XRG r16 = X.XRG.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 2697(0xa89, float:3.78E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            r0 = r16
            java.lang.Enum r14 = r15.getOptionalEnumField(r10, r14, r0)
            X.XRG r14 = (X.XRG) r14
            if (r14 == 0) goto L_0x00a3
            r0 = 2696(0xa88, float:3.778E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r17 = r15.getCoercedIntField(r9, r0)
            r0 = r19
            X.0qQ.A0B(r3, r0)
            r16 = 3
            int r15 = r14.ordinal()
            r0 = 6
            if (r15 == r0) goto L_0x00d9
            r0 = r16
            if (r15 == r0) goto L_0x00d5
            r0 = 5
            if (r15 == r0) goto L_0x00d1
            if (r15 == r9) goto L_0x00dd
            if (r15 == r10) goto L_0x00cd
            java.lang.String r14 = X.DbT.A10(r14)
            java.lang.String r0 = "FanClubGiftingDurationString: "
            X.0wb.A03(r0, r14)
            java.lang.String r16 = ""
        L_0x0090:
            X.JwB r14 = new X.JwB
            r15 = r20
            r0 = r18
            r14.<init>((com.instagram.user.model.User) r4, (java.lang.String) r15, (java.lang.String) r0, (java.lang.String) r5)
            X.JV7 r15 = new X.JV7
            r0 = r16
            r15.<init>((X.C61073JwB) r14, (java.lang.String) r12, (java.lang.String) r0)
            r7.add(r15)
        L_0x00a3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r15 = r8.next()
            X.Bjk r15 = (X.C42838Bjk) r15
            X.0qQ.A0A(r15)
            r13.A01 = r1
            r13.A02 = r2
            r13.A03 = r3
            r13.A04 = r4
            r13.A05 = r5
            r13.A06 = r6
            r13.A07 = r7
            r13.A08 = r8
            r13.A09 = r15
            r13.A00 = r10
            java.lang.Object r12 = com.instagram.fanclub.gifting.FanClubGiftingViewModel.A00(r2, r15, r1, r13)
            if (r12 != r11) goto L_0x0035
            return r11
        L_0x00cd:
            r15 = 2131820730(0x7f1100ba, float:1.9274183E38)
            goto L_0x00e0
        L_0x00d1:
            r15 = 2131820732(0x7f1100bc, float:1.9274187E38)
            goto L_0x00e0
        L_0x00d5:
            r15 = 2131820731(0x7f1100bb, float:1.9274185E38)
            goto L_0x00e0
        L_0x00d9:
            r15 = 2131820733(0x7f1100bd, float:1.927419E38)
            goto L_0x00e0
        L_0x00dd:
            r15 = 2131820729(0x7f1100b9, float:1.9274181E38)
        L_0x00e0:
            android.content.res.Resources r14 = r3.getResources()
            r0 = r17
            java.lang.String r16 = X.DbY.A0d(r14, r0, r15)
            X.0qQ.A07(r16)
            goto L_0x0090
        L_0x00ee:
            X.0eS.A00(r12)
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r0 = r13.A0C
            com.instagram.fanclub.gifting.FanClubGiftingApi r1 = r0.A02
            com.instagram.user.model.User r0 = r13.A0D
            java.lang.String r0 = r0.getId()
            r13.A00 = r9
            java.lang.Object r12 = r1.A00(r0, r13)
            if (r12 != r11) goto L_0x0107
            return r11
        L_0x0104:
            X.0eS.A00(r12)
        L_0x0107:
            X.3Ii r12 = (X.C239803Ii) r12
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r6 = r13.A0C
            androidx.fragment.app.FragmentActivity r2 = r13.A0B
            android.content.Context r3 = r13.A0A
            com.instagram.user.model.User r4 = r13.A0D
            java.lang.String r5 = r13.A0E
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0167
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r8 = r12.A00
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x0170
            java.lang.Class<X.Bjn> r7 = X.C42841Bjn.class
            r0 = 1972(0x7b4, float:2.763E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 337890953(0x1423ce89, float:8.270129E-27)
            X.3lr r8 = r8.A03(r7, r1, r0)
            if (r8 == 0) goto L_0x0170
            java.lang.Class<X.Bjm> r7 = X.C42840Bjm.class
            java.lang.String r1 = "fan_club"
            r0 = 1777828591(0x69f782ef, float:3.7402874E25)
            X.3lr r8 = r8.A03(r7, r1, r0)
            if (r8 == 0) goto L_0x0170
            java.lang.Class<X.Bjl> r7 = X.C42839Bjl.class
            java.lang.String r1 = "package"
            r0 = -1321716802(0xffffffffb13833be, float:-2.6804936E-9)
            X.3lr r8 = r8.A03(r7, r1, r0)
            if (r8 == 0) goto L_0x0170
            java.lang.Class<X.Bjk> r7 = X.C42838Bjk.class
            java.lang.String r1 = "gift_options"
            r0 = -1020766797(0xffffffffc32855b3, float:-168.33476)
            com.google.common.collect.ImmutableList r0 = r8.A06(r7, r1, r0)
            if (r0 == 0) goto L_0x0170
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
            r1 = r6
            goto L_0x00a3
        L_0x0162:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x0173
            goto L_0x0171
        L_0x0167:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0185
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0170:
            r1 = r6
        L_0x0171:
            X.0sn r7 = X.0sn.A00
        L_0x0173:
            r6.A00 = r7
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            X.05G r2 = r1.A05
            if (r0 == 0) goto L_0x0199
            X.EKV r1 = X.EKV.A00
        L_0x0181:
            X.3Ih r12 = X.Dba.A0S(r1, r2)
        L_0x0185:
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r1 = r13.A0C
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0196
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01a1
            X.05G r1 = r1.A05
            X.EKV r0 = X.EKV.A00
            r1.Epw(r0)
        L_0x0196:
            X.0gF r11 = X.C60340gF.A00
            return r11
        L_0x0199:
            java.util.List r0 = r1.A00
            X.EKU r1 = new X.EKU
            r1.<init>(r0, r9)
            goto L_0x0181
        L_0x01a1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FanClubGiftingViewModel$fetchGiftOptions$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
