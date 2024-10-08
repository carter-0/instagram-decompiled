package X;

import android.view.ViewGroup;

/* renamed from: X.2dQ  reason: invalid class name and case insensitive filesystem */
public final class C71492dQ extends ViewGroup.MarginLayoutParams {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = -1.0f;
    public float A03 = 0.5f;
    public float A04 = -1.0f;
    public float A05 = 1.0f;
    public float A06 = 1.0f;
    public float A07;
    public float A08 = 0.5f;
    public float A09 = 0.5f;
    public float A0A = -1.0f;
    public int A0B = 0;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = 0;
    public int A0J = 1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0P = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0Q = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0R = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0S = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0T = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0U = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0V = -1;
    public int A0W = -1;
    public int A0X = 0;
    public int A0Y = -1;
    public int A0Z = -1;
    public int A0a = 0;
    public int A0b = 0;
    public int A0c = 0;
    public int A0d = 0;
    public int A0e = 0;
    public int A0f = 0;
    public int A0g = -1;
    public int A0h = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0i = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0j;
    public int A0k;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = -1;
    public int A0o = -1;
    public int A0p = -1;
    public int A0q = -1;
    public int A0r = -1;
    public int A0s = -1;
    public int A0t = -1;
    public int A0u = -1;
    public int A0v = 0;
    public int A0w = 0;
    public 2d3 A0x = new 2d3();
    public String A0y = null;
    public String A0z = null;
    public boolean A10 = false;
    public boolean A11 = false;
    public boolean A12 = true;
    public boolean A13 = true;
    public boolean A14 = true;
    public boolean A15 = false;
    public boolean A16 = false;
    public boolean A17 = false;
    public boolean A18 = true;
    public boolean A19 = true;

    public final void A00() {
        this.A15 = false;
        this.A14 = true;
        this.A18 = true;
        int i = this.width;
        if (i == -2 && this.A11) {
            this.A14 = false;
            if (this.A0b == 0) {
                this.A0b = 1;
            }
        }
        int i2 = this.height;
        if (i2 == -2 && this.A10) {
            this.A18 = false;
            if (this.A0a == 0) {
                this.A0a = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A14 = false;
            if (i == 0 && this.A0b == 1) {
                this.width = -2;
                this.A11 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A18 = false;
            if (i2 == 0 && this.A0a == 1) {
                this.height = -2;
                this.A10 = true;
            }
        }
        if (this.A02 != -1.0f || this.A0V != -1 || this.A0W != -1) {
            this.A15 = true;
            this.A14 = true;
            this.A18 = true;
            AnonymousClass3MQ r1 = this.A0x;
            if (!(r1 instanceof AnonymousClass3MQ)) {
                r1 = new AnonymousClass3MQ();
                this.A0x = r1;
            }
            r1.A0c(this.A0g);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r15) {
        /*
            r14 = this;
            int r2 = r14.leftMargin
            int r4 = r14.rightMargin
            r13 = 0
            r1 = 1
            super.resolveLayoutDirection(r15)
            int r0 = r14.getLayoutDirection()
            r5 = 0
            if (r1 != r0) goto L_0x0011
            r5 = 1
        L_0x0011:
            r3 = -1
            r14.A0n = r3
            r14.A0o = r3
            r14.A0l = r3
            r14.A0m = r3
            int r0 = r14.A0R
            r14.A0h = r0
            int r0 = r14.A0S
            r14.A0i = r0
            float r12 = r14.A03
            r14.A08 = r12
            int r10 = r14.A0V
            r14.A0j = r10
            int r9 = r14.A0W
            r14.A0k = r9
            float r8 = r14.A02
            r14.A07 = r8
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r14.A0r
            if (r5 == 0) goto L_0x00c5
            if (r6 == r3) goto L_0x00bd
            r14.A0n = r6
        L_0x003c:
            r13 = 1
        L_0x003d:
            int r7 = r14.A0N
            if (r7 == r3) goto L_0x0044
            r14.A0m = r7
            r13 = 1
        L_0x0044:
            int r5 = r14.A0M
            if (r5 == r3) goto L_0x004b
            r14.A0l = r5
            r13 = 1
        L_0x004b:
            int r0 = r14.A0T
            if (r0 == r11) goto L_0x0051
            r14.A0i = r0
        L_0x0051:
            int r0 = r14.A0Q
            if (r0 == r11) goto L_0x0057
            r14.A0h = r0
        L_0x0057:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x005f
            float r0 = r11 - r12
            r14.A08 = r0
        L_0x005f:
            boolean r0 = r14.A15
            if (r0 == 0) goto L_0x0078
            int r0 = r14.A0g
            if (r0 != r1) goto L_0x0078
            boolean r0 = r14.A12
            if (r0 == 0) goto L_0x0078
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            float r11 = r11 - r8
            r14.A07 = r11
            r14.A0j = r3
            r14.A0k = r3
        L_0x0078:
            if (r7 != r3) goto L_0x009e
            if (r5 != r3) goto L_0x009e
            int r0 = r14.A0s
            if (r0 != r3) goto L_0x009e
            if (r6 != r3) goto L_0x009e
            int r0 = r14.A0p
            if (r0 == r3) goto L_0x00a6
            r14.A0n = r0
        L_0x0088:
            int r0 = r14.rightMargin
            if (r0 > 0) goto L_0x0090
            if (r4 <= 0) goto L_0x0090
            r14.rightMargin = r4
        L_0x0090:
            int r0 = r14.A0Y
            if (r0 == r3) goto L_0x009f
            r14.A0l = r0
        L_0x0096:
            int r0 = r14.leftMargin
            if (r0 > 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r14.leftMargin = r2
        L_0x009e:
            return
        L_0x009f:
            int r0 = r14.A0Z
            if (r0 == r3) goto L_0x009e
            r14.A0m = r0
            goto L_0x0096
        L_0x00a6:
            int r0 = r14.A0q
            if (r0 == r3) goto L_0x0090
            r14.A0o = r0
            goto L_0x0088
        L_0x00ad:
            if (r10 == r3) goto L_0x00b6
            r14.A0k = r10
            r14.A0j = r3
        L_0x00b3:
            r14.A07 = r1
            goto L_0x0078
        L_0x00b6:
            if (r9 == r3) goto L_0x0078
            r14.A0j = r9
            r14.A0k = r3
            goto L_0x00b3
        L_0x00bd:
            int r0 = r14.A0s
            if (r0 == r3) goto L_0x003d
            r14.A0o = r0
            goto L_0x003c
        L_0x00c5:
            if (r6 == r3) goto L_0x00c9
            r14.A0m = r6
        L_0x00c9:
            int r0 = r14.A0s
            if (r0 == r3) goto L_0x00cf
            r14.A0l = r0
        L_0x00cf:
            int r7 = r14.A0N
            if (r7 == r3) goto L_0x00d5
            r14.A0n = r7
        L_0x00d5:
            int r5 = r14.A0M
            if (r5 == r3) goto L_0x00db
            r14.A0o = r5
        L_0x00db:
            int r0 = r14.A0T
            if (r0 == r11) goto L_0x00e1
            r14.A0h = r0
        L_0x00e1:
            int r0 = r14.A0Q
            if (r0 == r11) goto L_0x0078
            r14.A0i = r0
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71492dQ.resolveLayoutDirection(int):void");
    }

    public C71492dQ(C71492dQ r9) {
        super(r9);
        this.A0V = r9.A0V;
        this.A0W = r9.A0W;
        this.A02 = r9.A02;
        this.A12 = r9.A12;
        this.A0Y = r9.A0Y;
        this.A0Z = r9.A0Z;
        this.A0p = r9.A0p;
        this.A0q = r9.A0q;
        this.A0u = r9.A0u;
        this.A0t = r9.A0t;
        this.A0G = r9.A0G;
        this.A0F = r9.A0F;
        this.A0C = r9.A0C;
        this.A0E = r9.A0E;
        this.A0D = r9.A0D;
        this.A0H = r9.A0H;
        this.A0I = r9.A0I;
        this.A00 = r9.A00;
        this.A0r = r9.A0r;
        this.A0s = r9.A0s;
        this.A0N = r9.A0N;
        this.A0M = r9.A0M;
        this.A0R = r9.A0R;
        this.A0U = r9.A0U;
        this.A0S = r9.A0S;
        this.A0P = r9.A0P;
        this.A0T = r9.A0T;
        this.A0Q = r9.A0Q;
        this.A0O = r9.A0O;
        this.A0B = r9.A0B;
        this.A03 = r9.A03;
        this.A09 = r9.A09;
        this.A0z = r9.A0z;
        this.A01 = r9.A01;
        this.A0J = r9.A0J;
        this.A04 = r9.A04;
        this.A0A = r9.A0A;
        this.A0X = r9.A0X;
        this.A0v = r9.A0v;
        this.A11 = r9.A11;
        this.A10 = r9.A10;
        this.A0b = r9.A0b;
        this.A0a = r9.A0a;
        this.A0f = r9.A0f;
        this.A0d = r9.A0d;
        this.A0e = r9.A0e;
        this.A0c = r9.A0c;
        this.A06 = r9.A06;
        this.A05 = r9.A05;
        this.A0K = r9.A0K;
        this.A0L = r9.A0L;
        this.A0g = r9.A0g;
        this.A14 = r9.A14;
        this.A18 = r9.A18;
        this.A17 = r9.A17;
        this.A15 = r9.A15;
        this.A0l = r9.A0l;
        this.A0m = r9.A0m;
        this.A0n = r9.A0n;
        this.A0o = r9.A0o;
        this.A0h = r9.A0h;
        this.A0i = r9.A0i;
        this.A08 = r9.A08;
        this.A0y = r9.A0y;
        this.A0w = r9.A0w;
        this.A0x = r9.A0x;
        this.A19 = r9.A19;
        this.A13 = r9.A13;
    }

    public C71492dQ(int i, int i2) {
        super(i, i2);
    }
}
