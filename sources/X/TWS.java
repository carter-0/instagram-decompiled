package X;

import android.util.SparseArray;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;

public final class TWS extends 0Yg implements 0sP {
    public final /* synthetic */ SparseArray A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ SparseArray A02;
    public final /* synthetic */ SNY A03;
    public final /* synthetic */ LoggingContext A04;
    public final /* synthetic */ OtcInput A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWS(SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, SNY sny, LoggingContext loggingContext, OtcInput otcInput, String str, String str2) {
        super(1);
        this.A03 = sny;
        this.A04 = loggingContext;
        this.A05 = otcInput;
        this.A07 = str;
        this.A01 = sparseArray;
        this.A02 = sparseArray2;
        this.A00 = sparseArray3;
        this.A06 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:251:0x048a, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0490, code lost:
        if (r0 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0496, code lost:
        if (r0 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x049c, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r39) {
        /*
            r38 = this;
            r14 = r39
            X.SUj r14 = (X.SUj) r14
            r4 = 0
            X.0qQ.A0B(r14, r4)
            boolean r0 = X.SUj.A0U(r14)
            if (r0 != 0) goto L_0x03d1
            java.lang.Object r0 = r14.A01
            X.QXI r0 = (X.QXI) r0
            r3 = 0
            if (r0 == 0) goto L_0x0488
            X.QXk r1 = r0.A0E()
            if (r1 == 0) goto L_0x0488
            X.QXE r1 = r1.A0E()
            if (r1 == 0) goto L_0x0488
            X.QXg r23 = r1.A0E()
        L_0x0025:
            X.QXk r1 = r0.A0E()
            if (r1 == 0) goto L_0x048e
            X.QRV r5 = r1.A0I()
            if (r5 == 0) goto L_0x048e
            java.lang.Class<X.QXc> r2 = X.C7791QXc.class
            r1 = -507874568(0xffffffffe1ba72f8, float:-4.2992235E20)
            X.3lr r22 = r5.A01(r2, r1)
        L_0x003a:
            X.QXk r1 = r0.A0E()
            if (r1 == 0) goto L_0x0494
            X.QXF r1 = r1.A0F()
            if (r1 == 0) goto L_0x0494
            X.QXN r21 = r1.A0E()
        L_0x004a:
            X.QXk r1 = r0.A0E()
            if (r1 == 0) goto L_0x049a
            X.QXH r1 = r1.A0H()
            if (r1 == 0) goto L_0x049a
            X.QXb r20 = r1.A0E()
        L_0x005a:
            X.QXk r1 = r0.A0E()
            if (r1 == 0) goto L_0x04a0
            X.QXG r1 = r1.A0G()
            if (r1 == 0) goto L_0x04a0
            X.QXW r19 = r1.A0E()
        L_0x006a:
            if (r22 == 0) goto L_0x0079
            X.HNF r6 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 2
            java.lang.String r2 = "error_step"
            r1 = r22
            java.lang.Enum r2 = r1.getOptionalEnumField(r5, r2, r6)
            if (r2 != 0) goto L_0x009d
        L_0x0079:
            if (r21 == 0) goto L_0x0083
            java.lang.Enum r2 = X.Pxj.A0f(r21)
            X.HNF r2 = (X.HNF) r2
            if (r2 != 0) goto L_0x009d
        L_0x0083:
            if (r20 == 0) goto L_0x008d
            java.lang.Enum r2 = X.Pxj.A0f(r20)
            X.HNF r2 = (X.HNF) r2
            if (r2 != 0) goto L_0x009d
        L_0x008d:
            if (r19 == 0) goto L_0x0095
            java.lang.Enum r2 = X.Pxj.A0f(r19)
            if (r2 != 0) goto L_0x009d
        L_0x0095:
            if (r23 == 0) goto L_0x0484
            java.lang.Enum r2 = X.Pxj.A0f(r23)
            if (r2 == 0) goto L_0x0484
        L_0x009d:
            X.HNF r1 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r2 == r1) goto L_0x0484
            java.lang.Throwable r1 = r14.A02
            X.SUj r33 = X.SUj.A0A(r3, r1)
            X.0qQ.A0A(r33)
        L_0x00aa:
            r2 = r38
            X.SNY r1 = r2.A03
            com.facebookpay.logging.LoggingContext r5 = r2.A04
            r26 = r5
            if (r0 == 0) goto L_0x0480
            X.QXk r18 = r0.A0E()
        L_0x00b8:
            r5 = 1
            com.facebookpay.otc.models.OtcInput r15 = r2.A05
            if (r15 == 0) goto L_0x047c
            X.SEB r27 = X.C11300SKk.A01(r15)
        L_0x00c1:
            r16 = 0
            java.lang.String r17 = ""
            if (r18 == 0) goto L_0x0351
            X.QRV r8 = r18.A0I()
            if (r8 == 0) goto L_0x014f
            java.lang.Class<X.QXc> r7 = X.C7791QXc.class
            r6 = -507874568(0xffffffffe1ba72f8, float:-4.2992235E20)
            X.3lr r10 = r8.A01(r7, r6)
            X.QXc r10 = (X.C7791QXc) r10
            if (r10 == 0) goto L_0x014f
            X.SUU r24 = X.C9962RkH.A00
            X.HNF r9 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r8 = 2
            java.lang.String r7 = "error_step"
            java.lang.Enum r6 = r10.getOptionalEnumField(r8, r7, r9)
            if (r6 == 0) goto L_0x0476
            if (r6 == r9) goto L_0x0476
            X.QVK r6 = r10.A0E()
            if (r6 == 0) goto L_0x0473
            X.QVG r11 = X.Pxj.A0S(r6)
            if (r11 == 0) goto L_0x0473
            java.lang.String r6 = "error_code"
            int r12 = r11.getCoercedIntField(r4, r6)
        L_0x00fb:
            X.QVK r6 = r10.A0E()
            if (r6 == 0) goto L_0x010f
            X.QVG r11 = X.Pxj.A0S(r6)
            if (r11 == 0) goto L_0x010f
            java.lang.String r6 = "error_title"
            java.lang.String r11 = r11.A0B(r6)
            if (r11 != 0) goto L_0x0111
        L_0x010f:
            r11 = r17
        L_0x0111:
            X.QVK r6 = r10.A0E()
            if (r6 == 0) goto L_0x0125
            X.QVG r6 = X.Pxj.A0S(r6)
            if (r6 == 0) goto L_0x0125
            java.lang.String r13 = "error_description"
            java.lang.String r6 = r6.A0C(r13)
            if (r6 != 0) goto L_0x0127
        L_0x0125:
            r6 = r17
        L_0x0127:
            X.TQk r6 = X.C9677Rev.A00(r11, r6, r12)
            X.SUj r28 = X.SUj.A0A(r3, r6)
        L_0x012f:
            X.0qQ.A0A(r28)
            java.lang.String r6 = "shipping_address"
            X.QIu r6 = X.SNY.A00(r6)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Enum r6 = r10.getOptionalEnumField(r8, r7, r9)
            X.HNF r6 = (X.HNF) r6
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r6
            r32 = r4
            r24.A0F(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x014f:
            X.QXE r6 = r18.A0E()
            if (r6 == 0) goto L_0x01ce
            X.QXg r10 = r6.A0E()
            if (r10 == 0) goto L_0x01ce
            X.SUU r24 = X.C9962RkH.A00
            X.HNF r9 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "error_step"
            java.lang.Enum r6 = r10.getOptionalEnumField(r5, r8, r9)
            if (r6 == 0) goto L_0x046d
            if (r6 == r9) goto L_0x046d
            X.QXL r6 = r10.A0F()
            if (r6 == 0) goto L_0x046a
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x046a
            java.lang.String r6 = "error_code"
            int r12 = r7.getCoercedIntField(r4, r6)
        L_0x017b:
            X.QXL r6 = r10.A0F()
            if (r6 == 0) goto L_0x018f
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x018f
            java.lang.String r6 = "error_title"
            java.lang.String r11 = r7.A0B(r6)
            if (r11 != 0) goto L_0x0191
        L_0x018f:
            r11 = r17
        L_0x0191:
            X.QXL r6 = r10.A0F()
            if (r6 == 0) goto L_0x01a5
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x01a5
            java.lang.String r6 = "error_description"
            java.lang.String r6 = r7.A0C(r6)
            if (r6 != 0) goto L_0x01a7
        L_0x01a5:
            r6 = r17
        L_0x01a7:
            X.TQk r6 = X.C9677Rev.A00(r11, r6, r12)
            X.SUj r28 = X.SUj.A0A(r3, r6)
        L_0x01af:
            X.0qQ.A0A(r28)
            java.lang.String r6 = "credentials"
            X.QIu r6 = X.SNY.A00(r6)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Enum r6 = r10.getOptionalEnumField(r5, r8, r9)
            X.HNF r6 = (X.HNF) r6
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r6
            r32 = r4
            r24.A0F(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01ce:
            X.QXG r6 = r18.A0G()
            if (r6 == 0) goto L_0x024e
            X.QXW r10 = r6.A0E()
            if (r10 == 0) goto L_0x024e
            X.SUU r24 = X.C9962RkH.A00
            X.HNF r9 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "error_step"
            java.lang.Enum r6 = r10.getOptionalEnumField(r5, r8, r9)
            if (r6 == 0) goto L_0x0464
            if (r6 == r9) goto L_0x0464
            X.QUi r6 = r10.A0E()
            if (r6 == 0) goto L_0x0461
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x0461
            java.lang.String r6 = "error_code"
            int r12 = r7.getCoercedIntField(r4, r6)
        L_0x01fa:
            X.QUi r6 = r10.A0E()
            if (r6 == 0) goto L_0x020e
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x020e
            java.lang.String r6 = "error_title"
            java.lang.String r11 = r7.A0B(r6)
            if (r11 != 0) goto L_0x0210
        L_0x020e:
            r11 = r17
        L_0x0210:
            X.QUi r6 = r10.A0E()
            if (r6 == 0) goto L_0x0224
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x0224
            java.lang.String r6 = "error_description"
            java.lang.String r6 = r7.A0C(r6)
            if (r6 != 0) goto L_0x0226
        L_0x0224:
            r6 = r17
        L_0x0226:
            X.TQk r6 = X.C9677Rev.A00(r11, r6, r12)
            X.SUj r28 = X.SUj.A0A(r3, r6)
        L_0x022e:
            X.0qQ.A0A(r28)
            java.lang.String r6 = "name"
            X.QIu r6 = X.SNY.A00(r6)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Enum r6 = r10.getOptionalEnumField(r5, r8, r9)
            X.HNF r6 = (X.HNF) r6
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r6
            r32 = r4
            r24.A0F(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x024e:
            X.QXF r6 = r18.A0F()
            if (r6 == 0) goto L_0x02cd
            X.QXN r10 = r6.A0E()
            if (r10 == 0) goto L_0x02cd
            X.SUU r24 = X.C9962RkH.A00
            java.lang.Enum r7 = X.Pxj.A0f(r10)
            X.HNF r7 = (X.HNF) r7
            if (r7 == 0) goto L_0x045b
            X.HNF r6 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r7 == r6) goto L_0x045b
            X.QSH r6 = r10.A0E()
            if (r6 == 0) goto L_0x0458
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x0458
            java.lang.String r6 = "error_code"
            int r8 = r7.getCoercedIntField(r4, r6)
        L_0x027a:
            X.QSH r6 = r10.A0E()
            if (r6 == 0) goto L_0x028e
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x028e
            java.lang.String r6 = "error_title"
            java.lang.String r7 = r7.A0B(r6)
            if (r7 != 0) goto L_0x0290
        L_0x028e:
            r7 = r17
        L_0x0290:
            X.QSH r6 = r10.A0E()
            if (r6 == 0) goto L_0x02a4
            X.QVG r9 = X.Pxj.A0S(r6)
            if (r9 == 0) goto L_0x02a4
            java.lang.String r6 = "error_description"
            java.lang.String r6 = r9.A0C(r6)
            if (r6 != 0) goto L_0x02a6
        L_0x02a4:
            r6 = r17
        L_0x02a6:
            X.TQk r6 = X.C9677Rev.A00(r7, r6, r8)
            X.SUj r28 = X.SUj.A0A(r3, r6)
        L_0x02ae:
            X.0qQ.A0A(r28)
            java.lang.String r6 = "email"
            X.QIu r6 = X.SNY.A00(r6)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Enum r6 = X.Pxj.A0f(r10)
            X.HNF r6 = (X.HNF) r6
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r6
            r32 = r4
            r24.A0F(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x02cd:
            X.QXH r6 = r18.A0H()
            if (r6 == 0) goto L_0x0351
            X.QXb r9 = r6.A0E()
            if (r9 == 0) goto L_0x0351
            X.SUU r24 = X.C9962RkH.A00
            java.lang.Enum r7 = X.Pxj.A0f(r9)
            X.HNF r7 = (X.HNF) r7
            if (r7 == 0) goto L_0x0452
            X.HNF r6 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r7 == r6) goto L_0x0452
            X.QVE r6 = r9.A0E()
            if (r6 == 0) goto L_0x02f9
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x02f9
            java.lang.String r6 = "error_code"
            int r16 = r7.getCoercedIntField(r4, r6)
        L_0x02f9:
            X.QVE r6 = r9.A0E()
            if (r6 == 0) goto L_0x030d
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x030d
            java.lang.String r6 = "error_title"
            java.lang.String r8 = r7.A0B(r6)
            if (r8 != 0) goto L_0x030f
        L_0x030d:
            r8 = r17
        L_0x030f:
            X.QVE r6 = r9.A0E()
            if (r6 == 0) goto L_0x0325
            X.QVG r7 = X.Pxj.A0S(r6)
            if (r7 == 0) goto L_0x0325
            java.lang.String r6 = "error_description"
            java.lang.String r6 = r7.A0C(r6)
            if (r6 == 0) goto L_0x0325
            r17 = r6
        L_0x0325:
            r7 = r17
            r6 = r16
            X.TQk r6 = X.C9677Rev.A00(r8, r7, r6)
            X.SUj r28 = X.SUj.A0A(r3, r6)
        L_0x0331:
            X.0qQ.A0A(r28)
            java.lang.String r6 = "phone"
            X.QIu r6 = X.SNY.A00(r6)
            java.util.List r31 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Enum r6 = X.Pxj.A0f(r9)
            X.HNF r6 = (X.HNF) r6
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r6
            r32 = r4
            r24.A0F(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0351:
            boolean r6 = X.SUj.A0V(r14)
            if (r6 == 0) goto L_0x0401
            java.lang.String r0 = r2.A07
            X.SJ1 r6 = new X.SJ1
            r6.<init>(r15, r0)
            android.util.SparseArray r7 = r2.A01
            if (r7 == 0) goto L_0x0389
            java.lang.String r8 = r2.A06
            if (r23 == 0) goto L_0x04a4
            X.QXK r9 = r23.A0E()
            if (r9 == 0) goto L_0x04a4
            X.XRm r3 = X.C21267XRm.A09
            java.lang.String r0 = "credential_type"
            java.lang.Enum r3 = r9.getOptionalEnumField(r5, r0, r3)
            if (r3 == 0) goto L_0x04a4
            X.XRm r0 = X.C21267XRm.A08
            if (r3 != r0) goto L_0x03d8
            X.0eM r0 = r1.A03
            java.lang.Object r3 = r0.getValue()
            X.Stc r3 = (X.Stc) r3
            X.SUj r0 = X.SUj.A09(r23)
            r3.A0B(r6, r0, r8)
        L_0x0389:
            android.util.SparseArray r0 = r2.A02
            if (r0 == 0) goto L_0x039e
            X.0eM r0 = r1.A04
            java.lang.Object r5 = r0.getValue()
            X.Stb r5 = (X.Stb) r5
            X.SUj r3 = X.SUj.A09(r22)
            java.lang.String r0 = "CREATE"
            r5.A05(r6, r3, r0, r4)
        L_0x039e:
            android.util.SparseArray r0 = r2.A00
            if (r0 == 0) goto L_0x03cf
            if (r19 == 0) goto L_0x03b1
            X.0eM r0 = r1.A01
            X.Std r2 = X.Pxh.A0S(r0)
            X.SUj r0 = X.SUj.A09(r19)
            r2.A0B(r6, r0)
        L_0x03b1:
            if (r21 == 0) goto L_0x03c0
            X.0eM r0 = r1.A01
            X.Std r2 = X.Pxh.A0S(r0)
            X.SUj r0 = X.SUj.A09(r21)
            r2.A0A(r6, r0)
        L_0x03c0:
            if (r20 == 0) goto L_0x03cf
            X.0eM r0 = r1.A01
            X.Std r1 = X.Pxh.A0S(r0)
            X.SUj r0 = X.SUj.A09(r20)
            r1.A0C(r6, r0)
        L_0x03cf:
            r14 = r33
        L_0x03d1:
            X.ScU r0 = X.C11569ScU.A00
            X.SUj r0 = X.SUj.A03(r0, r14)
            return r0
        L_0x03d8:
            if (r15 == 0) goto L_0x03f1
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.Stc r0 = (X.Stc) r0
            X.2gB r5 = X.Pxi.A0G(r6, r0)
            X.SUj r3 = X.Pxe.A0W(r5)
            if (r3 == 0) goto L_0x03f1
            X.Scj r0 = X.C11584Scj.A00
            X.SUj.A0E(r0, r5, r3)
        L_0x03f1:
            X.0eM r0 = r1.A03
            java.lang.Object r3 = r0.getValue()
            X.Stc r3 = (X.Stc) r3
            X.SUj r0 = X.SUj.A09(r23)
            r3.A08(r7, r6, r0)
            goto L_0x0389
        L_0x0401:
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x03cf
            if (r0 == 0) goto L_0x040f
            X.QXk r0 = r0.A0E()
            if (r0 != 0) goto L_0x03cf
        L_0x040f:
            X.SUU r29 = X.C9962RkH.A00
            java.lang.String r0 = "shipping_address"
            X.QIu r6 = X.SNY.A00(r0)
            java.lang.String r0 = "credentials"
            X.QIu r5 = X.SNY.A00(r0)
            java.lang.String r0 = "name"
            X.QIu r2 = X.SNY.A00(r0)
            java.lang.String r0 = "email"
            X.QIu r1 = X.SNY.A00(r0)
            java.lang.String r0 = "phone"
            X.QIu r0 = X.SNY.A00(r0)
            X.QIu[] r0 = new X.C7551QIu[]{r6, r5, r2, r1, r0}
            java.util.List r36 = X.0sr.A1P(r0)
            X.HNF r30 = X.HNF.VALIDATION
            if (r15 == 0) goto L_0x0442
            X.SEB r3 = X.C11300SKk.A01(r15)
        L_0x0442:
            java.lang.String r34 = "CREATE"
            java.lang.String r35 = "nux_checkout"
            r31 = r26
            r32 = r3
            r37 = r4
            r29.A0F(r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x03cf
        L_0x0452:
            X.SUj r28 = X.SUj.A09(r9)
            goto L_0x0331
        L_0x0458:
            r8 = 0
            goto L_0x027a
        L_0x045b:
            X.SUj r28 = X.SUj.A09(r10)
            goto L_0x02ae
        L_0x0461:
            r12 = 0
            goto L_0x01fa
        L_0x0464:
            X.SUj r28 = X.SUj.A09(r10)
            goto L_0x022e
        L_0x046a:
            r12 = 0
            goto L_0x017b
        L_0x046d:
            X.SUj r28 = X.SUj.A09(r10)
            goto L_0x01af
        L_0x0473:
            r12 = 0
            goto L_0x00fb
        L_0x0476:
            X.SUj r28 = X.SUj.A09(r10)
            goto L_0x012f
        L_0x047c:
            r27 = r3
            goto L_0x00c1
        L_0x0480:
            r18 = r3
            goto L_0x00b8
        L_0x0484:
            r33 = r14
            goto L_0x00aa
        L_0x0488:
            r23 = r3
            if (r0 == 0) goto L_0x048e
            goto L_0x0025
        L_0x048e:
            r22 = r3
            if (r0 == 0) goto L_0x0494
            goto L_0x003a
        L_0x0494:
            r21 = r3
            if (r0 == 0) goto L_0x049a
            goto L_0x004a
        L_0x049a:
            r20 = r3
            if (r0 == 0) goto L_0x04a0
            goto L_0x005a
        L_0x04a0:
            r19 = r3
            goto L_0x006a
        L_0x04a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWS.invoke(java.lang.Object):java.lang.Object");
    }
}
