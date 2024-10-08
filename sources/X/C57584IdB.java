package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;

/* renamed from: X.IdB  reason: case insensitive filesystem */
public final class C57584IdB implements JSK {
    public final Context A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = A00(R.style.igds_body_1);
    public final AnonymousClass0eM A04 = A00(R.style.igds_emphasized_body_1);
    public final AnonymousClass0eM A05 = A00(R.style.igds_emphasized_body_2);
    public final AnonymousClass0eM A06 = A00(R.style.control_option_title_text);
    public final AnonymousClass0eM A07 = A00(R.style.igds_emphasized_title);
    public final AnonymousClass0eM A08 = A00(R.style.igds_emphasized_title_bold);

    private final AnonymousClass0eM A00(int i) {
        return AnonymousClass0eN.A00(0eO.A02, new GL8(i, 42, this, (Object) null));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r5 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r5 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r0 = X.2Yu.A0H(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        return r2.getColor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int EIY(X.HNO r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            if (r5 == 0) goto L_0x0041
            X.0eM r0 = r3.A01
        L_0x0008:
            java.lang.Object r2 = r0.getValue()
            android.content.Context r2 = (android.content.Context) r2
            int r1 = r4.ordinal()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            switch(r1) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0078;
                case 2: goto L_0x0018;
                case 3: goto L_0x0070;
                case 4: goto L_0x0074;
                case 5: goto L_0x0049;
                case 6: goto L_0x0056;
                case 7: goto L_0x0074;
                case 8: goto L_0x0080;
                case 9: goto L_0x0018;
                case 10: goto L_0x0052;
                case 11: goto L_0x0018;
                case 12: goto L_0x006c;
                case 13: goto L_0x001e;
                case 14: goto L_0x004d;
                case 15: goto L_0x0044;
                case 16: goto L_0x0074;
                case 17: goto L_0x0060;
                case 18: goto L_0x0018;
                case 19: goto L_0x0068;
                case 20: goto L_0x006c;
                case 21: goto L_0x0068;
                case 22: goto L_0x0068;
                case 23: goto L_0x0018;
                case 24: goto L_0x0035;
                case 25: goto L_0x003b;
                case 26: goto L_0x0018;
                case 27: goto L_0x0018;
                case 28: goto L_0x0068;
                case 29: goto L_0x0018;
                case 30: goto L_0x0018;
                case 31: goto L_0x0018;
                case 32: goto L_0x0018;
                case 33: goto L_0x0018;
                case 34: goto L_0x0031;
                case 35: goto L_0x005c;
                case 36: goto L_0x0018;
                case 37: goto L_0x0031;
                case 38: goto L_0x0078;
                case 39: goto L_0x0064;
                case 40: goto L_0x0018;
                case 41: goto L_0x0018;
                case 42: goto L_0x0028;
                case 43: goto L_0x001f;
                case 44: goto L_0x0058;
                case 45: goto L_0x0052;
                case 46: goto L_0x0052;
                case 47: goto L_0x001e;
                case 48: goto L_0x0052;
                default: goto L_0x0018;
            }
        L_0x0018:
            X.JSK r0 = X.I41.A00
            int r0 = r0.EIY(r4, r5)
        L_0x001e:
            return r0
        L_0x001f:
            r0 = -460295(0xfffffffffff8f9f9, float:NaN)
            if (r5 != 0) goto L_0x001e
            r0 = -14605528(0xffffffffff212328, float:-2.1418825E38)
            return r0
        L_0x0028:
            r0 = -1306912230(0xffffffffb21a1a1a, float:-8.969915E-9)
            if (r5 != 0) goto L_0x001e
            r0 = -436207617(0xffffffffe5ffffff, float:-1.5111572E23)
            return r0
        L_0x0031:
            r0 = 1090519039(0x40ffffff, float:7.9999995)
            goto L_0x003d
        L_0x0035:
            r0 = -16738826(0xffffffffff0095f6, float:-1.7091983E38)
            if (r5 == 0) goto L_0x001e
            goto L_0x003f
        L_0x003b:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x003d:
            if (r5 != 0) goto L_0x001e
        L_0x003f:
            r0 = -1
            return r0
        L_0x0041:
            X.0eM r0 = r3.A02
            goto L_0x0008
        L_0x0044:
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            if (r5 != 0) goto L_0x007b
        L_0x0049:
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            goto L_0x007b
        L_0x004d:
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
            if (r5 != 0) goto L_0x007b
        L_0x0052:
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x007b
        L_0x0056:
            r0 = 0
            return r0
        L_0x0058:
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            goto L_0x007b
        L_0x005c:
            r0 = 2130970299(0x7f0406bb, float:1.7549304E38)
            goto L_0x007b
        L_0x0060:
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            goto L_0x007b
        L_0x0064:
            r0 = 2130970343(0x7f0406e7, float:1.7549393E38)
            goto L_0x007b
        L_0x0068:
            r0 = 2130970259(0x7f040693, float:1.7549223E38)
            goto L_0x007b
        L_0x006c:
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            goto L_0x007b
        L_0x0070:
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            goto L_0x007b
        L_0x0074:
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            goto L_0x007b
        L_0x0078:
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x007b:
            int r0 = X.2Yu.A0H(r2, r0)
            goto L_0x008c
        L_0x0080:
            X.0eM r0 = r3.A02
            java.lang.Object r2 = r0.getValue()
            android.content.Context r2 = (android.content.Context) r2
            int r0 = X.2Yu.A07(r2)
        L_0x008c:
            int r0 = r2.getColor(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57584IdB.EIY(X.HNO, boolean):int");
    }

    public final int EIZ(Integer num) {
        switch (C51967G9n.A03(num, 0)) {
            case 2:
            case 3:
            case 9:
                return 22;
            case 8:
                return 1;
            case 13:
                return 6;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 32:
                return 12;
            case 30:
                return 18;
            case 31:
                return 15;
            case 33:
                return 70;
            case 34:
            case 35:
                return 16;
            case 36:
                return 24;
            case 38:
                return 8;
            case 39:
                return 20;
            default:
                return I41.A00.EIZ(num);
        }
    }

    public final boolean EIa(Integer num) {
        if (C51967G9n.A03(num, 0) != 1) {
            return I41.A00.EIa(num);
        }
        return true;
    }

    public final float EId(HLQ hlq, boolean z) {
        int A022 = DbU.A02(hlq, 0);
        if (A022 != 0) {
            if (A022 != 1) {
                throw AnonymousClass7TE.A1K();
            } else if (!z) {
                return 0.17f;
            } else {
                return 0.2f;
            }
        } else if (!z) {
            return 0.04f;
        } else {
            return 0.05f;
        }
    }

    public C57584IdB(Context context) {
        this.A00 = context;
        0eO r1 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r1, C58708IwH.A01(this, 27));
        this.A02 = AnonymousClass0eN.A00(r1, C58708IwH.A01(this, 28));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        r4 = new X.C55432Hhc(1.29f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r8 = 0.0f;
        r4 = new X.C55432Hhc(1.29f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b0, code lost:
        r8 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bc, code lost:
        r4 = new X.C55432Hhc(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        return new X.C55796Hnc(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        r8 = -0.15f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C55796Hnc EIj(java.lang.Integer r10) {
        /*
            r9 = this;
            int r4 = r10.intValue()
            r3 = 1067450368(0x3fa00000, float:1.25)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 1068121457(0x3faa3d71, float:1.33)
            r0 = 1067785912(0x3fa51eb8, float:1.29)
            switch(r4) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0024;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0098;
                case 4: goto L_0x002f;
                case 5: goto L_0x003b;
                case 6: goto L_0x0048;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                case 9: goto L_0x0057;
                case 10: goto L_0x005e;
                case 11: goto L_0x00b2;
                case 12: goto L_0x0065;
                case 13: goto L_0x0072;
                case 14: goto L_0x007d;
                case 15: goto L_0x008c;
                case 16: goto L_0x0011;
                case 17: goto L_0x0011;
                case 18: goto L_0x0098;
                case 19: goto L_0x0098;
                case 20: goto L_0x008c;
                case 21: goto L_0x008c;
                case 22: goto L_0x002f;
                case 23: goto L_0x008c;
                case 24: goto L_0x00b2;
                case 25: goto L_0x003b;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.JSK r0 = X.I41.A00
            X.Hnc r3 = r0.EIj(r10)
            return r3
        L_0x0018:
            X.XSX r6 = X.XSX.SANS_SERIF
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.Hhc r4 = new X.Hhc
            r4.<init>(r2)
            r7 = 1096810496(0x41600000, float:14.0)
            goto L_0x0053
        L_0x0024:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1094713344(0x41400000, float:12.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r8 = -1105618534(0xffffffffbe19999a, float:-0.15)
            goto L_0x00bc
        L_0x002f:
            X.XSX r6 = X.XSX.SANS_SERIF
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.Hhc r4 = new X.Hhc
            r4.<init>(r3)
            r7 = 1098907648(0x41800000, float:16.0)
            goto L_0x00b0
        L_0x003b:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r8 = 0
            X.Hhc r4 = new X.Hhc
            r4.<init>(r1)
            goto L_0x00c1
        L_0x0048:
            X.XSX r6 = X.XSX.SANS_SERIF_MEDIUM
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            X.Hhc r4 = new X.Hhc
            r4.<init>(r1)
        L_0x0053:
            r8 = -1105618534(0xffffffffbe19999a, float:-0.15)
            goto L_0x00c1
        L_0x0057:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x009e
        L_0x005e:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x0092
        L_0x0065:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1099956224(0x41900000, float:18.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r8 = -1105618534(0xffffffffbe19999a, float:-0.15)
            r2 = 1066108191(0x3f8b851f, float:1.09)
            goto L_0x00bc
        L_0x0072:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1099956224(0x41900000, float:18.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r8 = 0
            r2 = 1066275963(0x3f8e147b, float:1.11)
            goto L_0x00bc
        L_0x007d:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r8 = -1105618534(0xffffffffbe19999a, float:-0.15)
            X.Hhc r4 = new X.Hhc
            r4.<init>(r3)
            goto L_0x00c1
        L_0x008c:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x0092:
            X.Hhc r4 = new X.Hhc
            r4.<init>(r0)
            goto L_0x00b0
        L_0x0098:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x009e:
            r8 = 0
            X.Hhc r4 = new X.Hhc
            r4.<init>(r0)
            goto L_0x00c1
        L_0x00a5:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1094713344(0x41400000, float:12.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.Hhc r4 = new X.Hhc
            r4.<init>(r1)
        L_0x00b0:
            r8 = 0
            goto L_0x00c1
        L_0x00b2:
            X.XSX r6 = X.XSX.SANS_SERIF
            r7 = 1102053376(0x41b00000, float:22.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r8 = 0
            r2 = 1067618140(0x3fa28f5c, float:1.27)
        L_0x00bc:
            X.Hhc r4 = new X.Hhc
            r4.<init>(r2)
        L_0x00c1:
            X.Hnc r3 = new X.Hnc
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57584IdB.EIj(java.lang.Integer):X.Hnc");
    }
}
