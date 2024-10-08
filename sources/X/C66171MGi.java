package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MGi  reason: case insensitive filesystem */
public final class C66171MGi extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66171MGi(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGi, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGi, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.MGi, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a0, code lost:
        r3 = new X.C66171MGi(r1, r2, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return new X.C66171MGi(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ba, code lost:
        r3 = new X.C66171MGi(r2, r1, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01bf, code lost:
        r3.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c1, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d4, code lost:
        return new X.C66171MGi(r2, r1, r11, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            r7 = r11
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x001c;
                case 2: goto L_0x0024;
                case 3: goto L_0x002c;
                case 4: goto L_0x0034;
                case 5: goto L_0x003c;
                case 6: goto L_0x0044;
                case 7: goto L_0x004c;
                case 8: goto L_0x0054;
                case 9: goto L_0x005d;
                case 10: goto L_0x0066;
                case 11: goto L_0x006f;
                case 12: goto L_0x0078;
                case 13: goto L_0x0081;
                case 14: goto L_0x008a;
                case 15: goto L_0x0094;
                case 16: goto L_0x009e;
                case 17: goto L_0x00a8;
                case 18: goto L_0x00b2;
                case 19: goto L_0x00bc;
                case 20: goto L_0x00c6;
                case 21: goto L_0x00d0;
                case 22: goto L_0x0170;
                case 23: goto L_0x0177;
                case 24: goto L_0x017e;
                case 25: goto L_0x00da;
                case 26: goto L_0x00e4;
                case 27: goto L_0x0185;
                case 28: goto L_0x00ee;
                case 29: goto L_0x00f8;
                case 30: goto L_0x018c;
                case 31: goto L_0x0193;
                case 32: goto L_0x0102;
                case 33: goto L_0x019a;
                case 34: goto L_0x01a6;
                case 35: goto L_0x010c;
                case 36: goto L_0x0116;
                case 37: goto L_0x0120;
                case 38: goto L_0x012a;
                case 39: goto L_0x0134;
                case 40: goto L_0x013e;
                case 41: goto L_0x01ad;
                case 42: goto L_0x01b4;
                case 43: goto L_0x0148;
                case 44: goto L_0x0152;
                case 45: goto L_0x015c;
                case 46: goto L_0x01c2;
                case 47: goto L_0x01c9;
                case 48: goto L_0x0166;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            java.lang.Object r4 = r9.A01
            r8 = 49
        L_0x000e:
            X.MGi r3 = new X.MGi
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0014:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 0
            goto L_0x000e
        L_0x001c:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 1
            goto L_0x000e
        L_0x0024:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 2
            goto L_0x000e
        L_0x002c:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 3
            goto L_0x000e
        L_0x0034:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 4
            goto L_0x000e
        L_0x003c:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 5
            goto L_0x000e
        L_0x0044:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 6
            goto L_0x000e
        L_0x004c:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 7
            goto L_0x000e
        L_0x0054:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 8
            goto L_0x000e
        L_0x005d:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 9
            goto L_0x000e
        L_0x0066:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 10
            goto L_0x000e
        L_0x006f:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 11
            goto L_0x000e
        L_0x0078:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 12
            goto L_0x000e
        L_0x0081:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 13
            goto L_0x000e
        L_0x008a:
            java.lang.Object r6 = r9.A04
            java.lang.Object r5 = r9.A03
            java.lang.Object r4 = r9.A01
            r8 = 14
            goto L_0x000e
        L_0x0094:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 15
            goto L_0x000e
        L_0x009e:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 16
            goto L_0x000e
        L_0x00a8:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 17
            goto L_0x000e
        L_0x00b2:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 18
            goto L_0x000e
        L_0x00bc:
            java.lang.Object r6 = r9.A04
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            r8 = 19
            goto L_0x000e
        L_0x00c6:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 20
            goto L_0x000e
        L_0x00d0:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 21
            goto L_0x000e
        L_0x00da:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 25
            goto L_0x000e
        L_0x00e4:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 26
            goto L_0x000e
        L_0x00ee:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 28
            goto L_0x000e
        L_0x00f8:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 29
            goto L_0x000e
        L_0x0102:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 32
            goto L_0x000e
        L_0x010c:
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            java.lang.Object r4 = r9.A01
            r8 = 35
            goto L_0x000e
        L_0x0116:
            java.lang.Object r4 = r9.A01
            java.lang.Object r6 = r9.A04
            java.lang.Object r5 = r9.A03
            r8 = 36
            goto L_0x000e
        L_0x0120:
            java.lang.Object r6 = r9.A04
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            r8 = 37
            goto L_0x000e
        L_0x012a:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 38
            goto L_0x000e
        L_0x0134:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 39
            goto L_0x000e
        L_0x013e:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 40
            goto L_0x000e
        L_0x0148:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 43
            goto L_0x000e
        L_0x0152:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 44
            goto L_0x000e
        L_0x015c:
            java.lang.Object r4 = r9.A01
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            r8 = 45
            goto L_0x000e
        L_0x0166:
            java.lang.Object r5 = r9.A03
            java.lang.Object r6 = r9.A04
            java.lang.Object r4 = r9.A01
            r8 = 48
            goto L_0x000e
        L_0x0170:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 22
            goto L_0x01ba
        L_0x0177:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 23
            goto L_0x01ba
        L_0x017e:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 24
            goto L_0x01ba
        L_0x0185:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 27
            goto L_0x01ba
        L_0x018c:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A04
            r0 = 30
            goto L_0x01a0
        L_0x0193:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 31
            goto L_0x01ba
        L_0x019a:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A04
            r0 = 33
        L_0x01a0:
            X.MGi r3 = new X.MGi
            r3.<init>(r1, r2, r11, r0)
            goto L_0x01bf
        L_0x01a6:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 34
            goto L_0x01ba
        L_0x01ad:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 41
            goto L_0x01ba
        L_0x01b4:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 42
        L_0x01ba:
            X.MGi r3 = new X.MGi
            r3.<init>(r2, r1, r11, r0)
        L_0x01bf:
            r3.A01 = r10
            return r3
        L_0x01c2:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 46
            goto L_0x01cf
        L_0x01c9:
            java.lang.Object r2 = r9.A04
            java.lang.Object r1 = r9.A03
            r0 = 47
        L_0x01cf:
            X.MGi r3 = new X.MGi
            r3.<init>(r2, r1, r11, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66171MGi.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MGi, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05f4, code lost:
        r5 = new X.C58104ImQ(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0634, code lost:
        r5 = new X.MGY(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x073b, code lost:
        r5 = new X.C66165MGc(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0755, code lost:
        r5 = new X.MGX(r2, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x075a, code lost:
        r12.A00 = r3;
        r1 = X.AnonymousClass3DM.A00(r6, r7, r12, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0760, code lost:
        if (r1 != r0) goto L_0x07b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0762, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0763, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07ad, code lost:
        r5.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07b2, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r5 = (X.C47485E4p) r12.A03;
        r4 = ((X.C239793Ih) r2).A00;
        r2 = X.C290635fd.A01(X.AnonymousClass7TE.A0l(r5.A08), (X.2Cn) null);
        r2.A00 = new X.EHN(r4, 2);
        X.1ES.A05(r2, 1967622104, 2, false, false);
        r1 = r5.requireActivity();
        r1.setResult(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r1 = X.DbT.A0E(r12.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f6, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b3, code lost:
        r5 = new X.C73568Pfp(r2, r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r19
            r2 = r20
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0741;
                case 1: goto L_0x0727;
                case 2: goto L_0x0712;
                case 3: goto L_0x06fd;
                case 4: goto L_0x06e8;
                case 5: goto L_0x06d3;
                case 6: goto L_0x06be;
                case 7: goto L_0x06a9;
                case 8: goto L_0x0693;
                case 9: goto L_0x067d;
                case 10: goto L_0x0667;
                case 11: goto L_0x0651;
                case 12: goto L_0x063b;
                case 13: goto L_0x0620;
                case 14: goto L_0x05fb;
                case 15: goto L_0x05e0;
                case 16: goto L_0x05cb;
                case 17: goto L_0x05b6;
                case 18: goto L_0x05a1;
                case 19: goto L_0x0767;
                case 20: goto L_0x058c;
                case 21: goto L_0x0577;
                case 22: goto L_0x054b;
                case 23: goto L_0x051a;
                case 24: goto L_0x04e9;
                case 25: goto L_0x04d3;
                case 26: goto L_0x04bd;
                case 27: goto L_0x048b;
                case 28: goto L_0x0475;
                case 29: goto L_0x045f;
                case 30: goto L_0x0435;
                case 31: goto L_0x03f9;
                case 32: goto L_0x03e3;
                case 33: goto L_0x03b9;
                case 34: goto L_0x0365;
                case 35: goto L_0x032c;
                case 36: goto L_0x02b0;
                case 37: goto L_0x025a;
                case 38: goto L_0x0244;
                case 39: goto L_0x022e;
                case 40: goto L_0x0218;
                case 41: goto L_0x01e5;
                case 42: goto L_0x01ba;
                case 43: goto L_0x01a0;
                case 44: goto L_0x018c;
                case 45: goto L_0x016b;
                case 46: goto L_0x0132;
                case 47: goto L_0x00fb;
                case 48: goto L_0x006d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0022
            X.0eS.A00(r2)
        L_0x0013:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0022:
            X.0eS.A00(r2)
            java.lang.Object r4 = r12.A03
            X.E4p r4 = (X.C47485E4p) r4
            X.FAN r1 = r4.A07
            java.util.Set r1 = r1.A03
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r1)
            java.lang.Object r11 = r12.A01
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r12.A04
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r2 = r1.iterator()
        L_0x003d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0047
            A01(r2, r11, r10)
            goto L_0x003d
        L_0x0047:
            android.os.Bundle r2 = r4.requireArguments()
            r1 = 3988(0xf94, float:5.588E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r7 = r2.getString(r1)
            if (r7 != 0) goto L_0x0059
            java.lang.String r7 = ""
        L_0x0059:
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r5 = com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A00
            X.0eM r1 = r4.A08
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r8 = 0
            java.lang.String r9 = r4.A04
            r12.A00 = r3
            java.lang.Object r2 = r5.A06(r6, r7, r8, r9, r10, r11, r12)
            if (r2 != r0) goto L_0x0013
            return r0
        L_0x006d:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0086
            X.0eS.A00(r2)
        L_0x0077:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0086:
            X.0eS.A00(r2)
            java.lang.Object r4 = r12.A03
            X.E4p r4 = (X.C47485E4p) r4
            X.FAN r1 = r4.A07
            java.util.Set r1 = r1.A03
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r1)
            java.lang.Object r11 = r12.A01
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r12.A04
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r2 = r1.iterator()
        L_0x00a1:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00ab
            A01(r2, r11, r10)
            goto L_0x00a1
        L_0x00ab:
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r5 = com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A00
            X.0eM r1 = r4.A08
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r7 = 0
            java.lang.String r8 = r4.A04
            r12.A00 = r3
            r1 = 3987(0xf93, float:5.587E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r1)
            java.lang.Object r2 = r5.A05(r6, r7, r8, r9, r10, r11, r12)
            if (r2 != r0) goto L_0x0077
            return r0
        L_0x00c5:
            java.lang.Object r5 = r12.A03
            X.E4p r5 = (X.C47485E4p) r5
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r4 = r2.A00
            X.0eM r0 = r5.A08
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            r3 = 2
            X.5g0 r2 = X.C290635fd.A01(r1, r0)
            X.EHN r0 = new X.EHN
            r0.<init>(r4, r3)
            r2.A00 = r0
            r1 = 1967622104(0x754787d8, float:2.5293514E32)
            r0 = 0
            X.1ES.A05(r2, r1, r3, r0, r0)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = -1
            r1.setResult(r0)
            goto L_0x00f6
        L_0x00f0:
            java.lang.Object r0 = r12.A03
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
        L_0x00f6:
            r1.finish()
            goto L_0x07b0
        L_0x00fb:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x0111
            java.lang.Object r5 = r12.A01
            X.05G r5 = (X.05G) r5
            X.0eS.A00(r2)
        L_0x0109:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = X.0jo.A1G(r2)
            goto L_0x07ad
        L_0x0111:
            X.0eS.A00(r2)
            java.lang.Object r4 = r12.A04
            X.Mts r4 = (X.C67739Mts) r4
            X.05G r5 = r4.A07
            java.lang.Object r3 = r12.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r1 = 24
            X.Mq4 r2 = new X.Mq4
            r2.<init>(r4, r1)
            r12.A01 = r5
            r12.A00 = r6
            java.lang.String r1 = "DAILY_PROMPT"
            java.lang.Object r2 = com.instagram.direct.request.DirectThreadApi.A0J(r3, r1, r12, r2)
            if (r2 != r0) goto L_0x0109
            return r0
        L_0x0132:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x014a
            java.lang.Object r5 = r12.A01
            X.Mts r5 = (X.C67739Mts) r5
            X.0eS.A00(r2)
        L_0x0140:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = X.0jo.A1G(r2)
            r5.A02 = r0
            goto L_0x07b0
        L_0x014a:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A04
            X.Mts r5 = (X.C67739Mts) r5
            java.util.List r4 = r5.A02
            java.lang.Object r3 = r12.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r1 = 23
            X.Mq4 r2 = new X.Mq4
            r2.<init>(r4, r1)
            r12.A01 = r5
            r12.A00 = r6
            java.lang.String r1 = "CHALLENGES"
            java.lang.Object r2 = com.instagram.direct.request.DirectThreadApi.A0J(r3, r1, r12, r2)
            if (r2 != r0) goto L_0x0140
            return r0
        L_0x016b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r7 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r6 = A00(r2, r12)
            java.lang.Object r5 = r12.A03
            X.07U r5 = (X.07U) r5
            r4 = 0
            java.lang.Object r3 = r12.A04
            r2 = 9
            X.Pfn r1 = new X.Pfn
            r1.<init>(r3, r4, r2)
            r12.A00 = r7
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r5, r6, r12, r1)
            goto L_0x0760
        L_0x018c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 5
            goto L_0x01b3
        L_0x01a0:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 4
        L_0x01b3:
            X.Pfp r5 = new X.Pfp
            r5.<init>(r2, r4, r1)
            goto L_0x075a
        L_0x01ba:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 != 0) goto L_0x0763
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A01
            java.lang.Object r1 = r12.A04
            X.OyT r1 = (X.C72203OyT) r1
            X.0Ud r3 = r1.A0P
            X.0Ud r2 = r1.A0T
            r1 = 20
            X.0pm r4 = X.C66193MHj.A01(r3, r2, r1)
            java.lang.Object r3 = r12.A03
            r2 = 60
            X.MCn r1 = new X.MCn
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r3)
            r12.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r12)
            goto L_0x0760
        L_0x01e5:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r8 = 1
            if (r1 != 0) goto L_0x0763
            X.0eS.A00(r2)
            java.lang.Object r9 = r12.A01
            java.lang.Object r1 = r12.A04
            X.OyT r1 = (X.C72203OyT) r1
            X.0Ud r7 = r1.A0P
            X.0Ud r6 = r1.A0T
            X.0Ud r5 = r1.A0S
            X.0Ud r4 = r1.A0R
            r3 = 0
            r2 = 0
            X.MI0 r1 = new X.MI0
            r1.<init>(r2, r3)
            X.0pq r4 = X.AnonymousClass10H.A01(r1, r7, r6, r5, r4)
            java.lang.Object r3 = r12.A03
            r2 = 3
            X.PeM r1 = new X.PeM
            r1.<init>(r2, r9, r3)
            r12.A00 = r8
            java.lang.Object r1 = r4.collect(r1, r12)
            goto L_0x0760
        L_0x0218:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 39
            goto L_0x0634
        L_0x022e:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 36
            goto L_0x0634
        L_0x0244:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 34
            goto L_0x0634
        L_0x025a:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r4 = 1
            if (r1 != 0) goto L_0x0763
            X.0eS.A00(r2)
            java.lang.Object r8 = r12.A04
            X.HDZ r8 = (X.HDZ) r8
            com.instagram.common.session.UserSession r1 = r8.A00
            r9 = 0
            X.1NY r3 = X.AnonymousClass7TG.A0b(r1)
            java.lang.String r1 = "direct_v2/get_pinned_channels/"
            r3.A0A(r1)
            java.lang.Object r6 = r12.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r2 = r6.getId()
            java.lang.String r1 = "user_id"
            r3.A9m(r1, r2)
            java.lang.Class<X.CDz> r2 = X.C43807CDz.class
            java.lang.Class<X.CzI> r1 = X.C45606CzI.class
            X.1OC r2 = X.DbU.A0S(r3, r2, r1)
            r1 = 347343619(0x14b40b03, float:1.8179699E-26)
            X.032 r1 = r2.A03(r1)
            java.lang.Object r7 = r12.A03
            r10 = 16
            X.MGj r5 = new X.MGj
            r5.<init>(r6, r7, r8, r9, r10)
            X.0pz r3 = X.JUM.A04(r5, r1)
            r2 = 27
            X.MFz r1 = new X.MFz
            r1.<init>(r7, r9, r2)
            X.0pz r1 = X.JUM.A03(r1, r3)
            r12.A00 = r4
            java.lang.Object r1 = X.AnonymousClass11O.A01(r12, r1)
            goto L_0x0760
        L_0x02b0:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x02fa
            X.0eS.A00(r2)
        L_0x02ba:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r1 = r12.A04
            X.L6Y r1 = (X.L6Y) r1
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02f1
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r2 = r2.A00
            X.77b r2 = (X.C3265177b) r2
            java.util.List r0 = r2.A00
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x02e0
            X.05G r1 = r1.A01
            java.util.List r0 = r2.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            r1.Epw(r0)
        L_0x02e0:
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x02e4:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x07b0
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x07b0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02f1:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02e4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02fa:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r1 = r12.A04
            X.L6Y r1 = (X.L6Y) r1
            java.lang.String r4 = r1.A00
            java.lang.Object r2 = r12.A03
            com.instagram.model.direct.messageid.MessageIdentifier r2 = (com.instagram.model.direct.messageid.MessageIdentifier) r2
            java.lang.String r1 = r2.A01
            java.util.List r3 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r1 = r2.A00()
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            r1 = 0
            X.1OC r4 = com.instagram.direct.request.DirectThreadApi.A0E(r5, r4, r1, r3, r2)
            r12.A00 = r6
            r3 = 756350823(0x2d14ff67, float:8.469537E-12)
            r2 = 2
            r1 = 0
            java.lang.Object r2 = r4.A02(r12, r3, r2, r1)
            if (r2 != r0) goto L_0x02ba
            return r0
        L_0x032c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0354
            X.0eS.A00(r2)
        L_0x0336:
            java.lang.Object r1 = r12.A03
            X.05G r1 = (X.05G) r1
            X.LqB r0 = X.LqB.A00
            r1.Epw(r0)
            java.lang.Object r0 = r12.A04
            X.L6X r0 = (X.L6X) r0
            java.util.Map r1 = r0.A02
            java.lang.Object r0 = r12.A01
            java.lang.Object r0 = r1.remove(r0)
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x07b0
            r0.EwR()
            goto L_0x07b0
        L_0x0354:
            X.0eS.A00(r2)
            int r1 = X.Dc5.A00()
            long r1 = (long) r1
            r12.A00 = r3
            java.lang.Object r1 = X.C241603Pv.A01(r12, r1)
            if (r1 != r0) goto L_0x0336
            return r0
        L_0x0365:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 != 0) goto L_0x0763
            X.0eS.A00(r2)
            java.lang.Object r7 = r12.A04
            X.K6q r7 = (X.C61419K6q) r7
            X.0eM r1 = r7.A07
            java.lang.Object r2 = r1.getValue()
            X.JjH r2 = (X.C60314JjH) r2
            X.OLz r4 = r2.A09
            java.lang.String r1 = r4.A0C
            if (r1 == 0) goto L_0x03b4
            X.L6Y r3 = new X.L6Y
            r3.<init>(r1)
            com.instagram.common.session.UserSession r14 = r2.A07
            X.6oS r2 = X.C318116oQ.A00(r2)
            java.lang.String r1 = r4.A09
            com.instagram.model.direct.messageid.MessageIdentifier r15 = new com.instagram.model.direct.messageid.MessageIdentifier
            r15.<init>(r1, r1)
            r5 = 0
            r18 = 36
            X.MGi r13 = new X.MGi
            r16 = r3
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r13, r2)
            X.0Ud r4 = r3.A02
            java.lang.Object r3 = r12.A03
            r2 = 5
            X.MfO r1 = new X.MfO
            r1.<init>(r7, r3, r5, r2)
            r12.A00 = r6
            java.lang.Object r1 = X.AnonymousClass11O.A00(r12, r1, r4)
            goto L_0x0760
        L_0x03b4:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x03b9:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x03c8
            X.0eS.A00(r2)
        L_0x03c3:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x03c8:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A03
            X.6i1 r5 = (X.C314326i1) r5
            X.05G r4 = r5.A02
            java.lang.Object r3 = r12.A04
            r2 = 58
            X.MCn r1 = new X.MCn
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r3)
            r12.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r12)
            if (r1 != r0) goto L_0x03c3
            return r0
        L_0x03e3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 32
            goto L_0x05f4
        L_0x03f9:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r9 = 1
            if (r1 == 0) goto L_0x0404
            X.0eS.A00(r2)
        L_0x0403:
            return r2
        L_0x0404:
            X.0eS.A00(r2)
            java.lang.Object r8 = r12.A01
            X.4Cq r8 = (X.C262224Cq) r8
            r7 = 0
            java.lang.Object r6 = r12.A04
            java.lang.Object r5 = r12.A03
            r2 = 22
            X.MGY r1 = new X.MGY
            r1.<init>(r6, r5, r7, r2)
            X.19B r4 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r4, r1, r8)
            r2 = 23
            X.MGY r1 = new X.MGY
            r1.<init>(r6, r5, r7, r2)
            X.2Q8 r1 = X.1Eo.A02(r4, r1, r8)
            X.2Q9[] r1 = new X.AnonymousClass2Q9[]{r3, r1}
            r12.A00 = r9
            java.lang.Object r2 = X.AnonymousClass42T.A02(r12, r1)
            if (r2 != r0) goto L_0x0403
            return r0
        L_0x0435:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x0444
            X.0eS.A00(r2)
        L_0x043f:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0444:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A03
            X.6i1 r5 = (X.C314326i1) r5
            X.05G r4 = r5.A02
            java.lang.Object r3 = r12.A04
            r2 = 57
            X.MCn r1 = new X.MCn
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r3)
            r12.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r12)
            if (r1 != r0) goto L_0x043f
            return r0
        L_0x045f:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 26
            goto L_0x05f4
        L_0x0475:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 25
            goto L_0x05f4
        L_0x048b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x049a
            X.0eS.A00(r2)
        L_0x0495:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x049a:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A04
            X.H07 r5 = (X.H07) r5
            X.0eM r1 = r5.A0B
            java.lang.Object r1 = r1.getValue()
            X.Gh1 r1 = (X.C53010Gh1) r1
            X.0Ud r4 = r1.A02
            java.lang.Object r3 = r12.A03
            r2 = 16
            X.IkW r1 = new X.IkW
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r5)
            r12.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r12)
            if (r1 != r0) goto L_0x0495
            return r0
        L_0x04bd:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 18
            goto L_0x0634
        L_0x04d3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 16
            goto L_0x0634
        L_0x04e9:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r6 = 1
            if (r1 == 0) goto L_0x04f8
            X.0eS.A00(r2)
        L_0x04f3:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x04f8:
            X.0eS.A00(r2)
            java.lang.Object r5 = r12.A04
            X.NgS r5 = (X.C69179NgS) r5
            X.0eM r1 = r5.A06
            java.lang.Object r1 = r1.getValue()
            X.Mtm r1 = (X.C67733Mtm) r1
            X.0Ud r4 = r1.A06
            java.lang.Object r3 = r12.A03
            r2 = 2
            X.PeM r1 = new X.PeM
            r1.<init>(r2, r3, r5)
            r12.A00 = r6
            java.lang.Object r1 = r4.collect(r1, r12)
            if (r1 != r0) goto L_0x04f3
            return r0
        L_0x051a:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r4 = 1
            if (r1 == 0) goto L_0x0529
            X.0eS.A00(r2)
        L_0x0524:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0529:
            X.0eS.A00(r2)
            java.lang.Object r1 = r12.A04
            X.K4q r1 = (X.C61372K4q) r1
            X.0eM r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.Jhi r1 = (X.C60225Jhi) r1
            X.0Ud r3 = r1.A01
            java.lang.Object r2 = r12.A03
            r1 = 45
            X.MCi r1 = X.MCi.A00(r2, r1)
            r12.A00 = r4
            java.lang.Object r1 = r3.collect(r1, r12)
            if (r1 != r0) goto L_0x0524
            return r0
        L_0x054b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r5 = 1
            if (r1 == 0) goto L_0x055a
            X.0eS.A00(r2)
        L_0x0555:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x055a:
            X.0eS.A00(r2)
            java.lang.Object r4 = r12.A04
            X.7Rx r4 = (X.C331677Rx) r4
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r1 = X.C331677Rx.A00(r4)
            X.0Ud r3 = r1.uiState
            java.lang.Object r2 = r12.A03
            X.PeM r1 = new X.PeM
            r1.<init>(r5, r2, r4)
            r12.A00 = r5
            java.lang.Object r1 = r3.collect(r1, r12)
            if (r1 != r0) goto L_0x0555
            return r0
        L_0x0577:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 19
            goto L_0x05f4
        L_0x058c:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 13
            goto L_0x05f4
        L_0x05a1:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 12
            goto L_0x05f4
        L_0x05b6:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 10
            goto L_0x05f4
        L_0x05cb:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 9
            goto L_0x05f4
        L_0x05e0:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 8
        L_0x05f4:
            X.ImQ r5 = new X.ImQ
            r5.<init>(r2, r4, r1)
            goto L_0x075a
        L_0x05fb:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r5 = 1
            if (r1 != 0) goto L_0x0763
            X.0eS.A00(r2)
            java.lang.Object r1 = r12.A04
            X.GhM r1 = (X.C53031GhM) r1
            X.0V2 r4 = r1.A04
            java.lang.Object r3 = r12.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r12.A01
            java.util.List r2 = (java.util.List) r2
            X.KPp r1 = new X.KPp
            r1.<init>(r3, r2)
            r12.A00 = r5
            java.lang.Object r1 = r4.emit(r1, r12)
            goto L_0x0760
        L_0x0620:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 14
        L_0x0634:
            X.MGY r5 = new X.MGY
            r5.<init>(r2, r4, r1)
            goto L_0x075a
        L_0x063b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 36
            goto L_0x073b
        L_0x0651:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 47
            goto L_0x0755
        L_0x0667:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 35
            goto L_0x073b
        L_0x067d:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 34
            goto L_0x073b
        L_0x0693:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 33
            goto L_0x073b
        L_0x06a9:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 32
            goto L_0x073b
        L_0x06be:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 31
            goto L_0x073b
        L_0x06d3:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 30
            goto L_0x073b
        L_0x06e8:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 29
            goto L_0x073b
        L_0x06fd:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 28
            goto L_0x073b
        L_0x0712:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 27
            goto L_0x073b
        L_0x0727:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 26
        L_0x073b:
            X.MGc r5 = new X.MGc
            r5.<init>(r2, r4, r1)
            goto L_0x075a
        L_0x0741:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 != 0) goto L_0x0763
            X.07V r7 = A00(r2, r12)
            java.lang.Object r6 = r12.A03
            X.07U r6 = (X.07U) r6
            r4 = 0
            java.lang.Object r2 = r12.A04
            r1 = 46
        L_0x0755:
            X.MGX r5 = new X.MGX
            r5.<init>(r2, r4, r1)
        L_0x075a:
            r12.A00 = r3
            java.lang.Object r1 = X.AnonymousClass3DM.A00(r6, r7, r12, r5)
        L_0x0760:
            if (r1 != r0) goto L_0x07b0
            return r0
        L_0x0763:
            X.0eS.A00(r2)
            goto L_0x07b0
        L_0x0767:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r7 = 1
            if (r1 == 0) goto L_0x07b8
            X.0eS.A00(r2)
        L_0x0771:
            boolean r8 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r6 = r12.A04
            X.H2N r6 = (X.H2N) r6
            X.05G r5 = r6.A02
        L_0x077b:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JV5 r0 = (X.JV5) r0
            java.lang.Object r3 = r0.A03
            X.4Yx r3 = (X.C266444Yx) r3
            java.lang.Object r2 = r0.A00
            X.4Yx r2 = (X.C266444Yx) r2
            r1 = 0
            X.AnonymousClass7TF.A1B(r3, r7, r2)
            X.JV5 r0 = new X.JV5
            r0.<init>((X.C266444Yx) r3, (X.C266444Yx) r2, (boolean) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x077b
            if (r8 == 0) goto L_0x07b3
            X.05G r1 = r6.A03
            java.lang.Object r0 = r12.A01
            r1.Epw(r0)
            X.05G r1 = r6.A04
            java.lang.Object r0 = r12.A03
            r1.Epw(r0)
            X.05G r5 = r6.A01
            X.I18 r0 = X.I18.A00
        L_0x07ad:
            r5.Epw(r0)
        L_0x07b0:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x07b3:
            X.05G r5 = r6.A01
            X.I1A r0 = X.I1A.A00
            goto L_0x07ad
        L_0x07b8:
            X.0eS.A00(r2)
            java.lang.Object r6 = r12.A04
            X.H2N r6 = (X.H2N) r6
            X.05G r5 = r6.A02
        L_0x07c1:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.JV5 r1 = (X.JV5) r1
            java.lang.Object r3 = r1.A03
            X.4Yx r3 = (X.C266444Yx) r3
            java.lang.Object r2 = r1.A00
            X.4Yx r2 = (X.C266444Yx) r2
            X.AnonymousClass7TF.A1B(r3, r7, r2)
            X.JV5 r1 = new X.JV5
            r1.<init>((X.C266444Yx) r3, (X.C266444Yx) r2, (boolean) r7)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x07c1
            com.instagram.creator.agent.settings.audience.AudienceRepository r2 = r6.A00
            java.lang.Object r1 = r12.A01
            X.JZA r1 = (X.JZA) r1
            r12.A00 = r7
            java.lang.Object r2 = r2.A00(r1, r12)
            if (r2 != r0) goto L_0x0771
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66171MGi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static AnonymousClass07V A00(Object obj, C66171MGi mGi) {
        0eS.A00(obj);
        return ((AnonymousClass07Z) mGi.A01).getLifecycle();
    }

    public static void A01(Iterator it, List list, List list2) {
        String str;
        DirectShareTarget directShareTarget = ((C47159Dra) it.next()).A07;
        if (directShareTarget.A08() != null) {
            String A08 = directShareTarget.A08();
            if (A08 != null) {
                list.add(A08);
            }
        } else if (((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).A0B != null && (str = ((PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0)).A0B) != null) {
            list2.add(str);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66171MGi) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66171MGi(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }
}
