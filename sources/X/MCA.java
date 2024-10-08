package X;

public final class MCA implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public MCA(0sL r1, AnonymousClass0r6 r2, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = r2;
            this.A02 = r1;
        } else {
            this.A02 = r2;
            this.A01 = r1;
        }
    }

    public static MCA A00(Object obj, Object obj2, int i) {
        return new MCA(i, obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01bc, code lost:
        r2 = new X.MCl(r0, (java.lang.Object) r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01dd, code lost:
        r0 = X.0zv.A00(r8, r4, new X.C66194MHk(r2, r3, r1), r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r0 = X.0zv.A00(r8, r2, new X.C66194MHk(r5, r4, r3), r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        return X.JTP.A0l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0350, code lost:
        r2 = new X.MCn(r0, r1, (java.lang.Object) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0369, code lost:
        r2 = new X.MCn(r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0376, code lost:
        r2 = new X.MCn(r0, (java.lang.Object) r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x037b, code lost:
        r0 = r3.collect(r2, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(X.02o r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x036f;
                case 1: goto L_0x0360;
                case 2: goto L_0x0356;
                case 3: goto L_0x0349;
                case 4: goto L_0x0340;
                case 5: goto L_0x0337;
                case 6: goto L_0x032e;
                case 7: goto L_0x0325;
                case 8: goto L_0x031c;
                case 9: goto L_0x0313;
                case 10: goto L_0x030a;
                case 11: goto L_0x0301;
                case 12: goto L_0x02f8;
                case 13: goto L_0x02ef;
                case 14: goto L_0x02e5;
                case 15: goto L_0x02db;
                case 16: goto L_0x02cd;
                case 17: goto L_0x02c3;
                case 18: goto L_0x02b9;
                case 19: goto L_0x02af;
                case 20: goto L_0x02a5;
                case 21: goto L_0x029b;
                case 22: goto L_0x0291;
                case 23: goto L_0x0285;
                case 24: goto L_0x0279;
                case 25: goto L_0x026f;
                case 26: goto L_0x0265;
                case 27: goto L_0x025b;
                case 28: goto L_0x0251;
                case 29: goto L_0x0247;
                case 30: goto L_0x023d;
                case 31: goto L_0x0233;
                case 32: goto L_0x0229;
                case 33: goto L_0x021f;
                case 34: goto L_0x0215;
                case 35: goto L_0x0204;
                case 36: goto L_0x01fa;
                case 37: goto L_0x01e8;
                case 38: goto L_0x01cd;
                case 39: goto L_0x01c3;
                case 40: goto L_0x01b5;
                case 41: goto L_0x01ad;
                case 42: goto L_0x01a5;
                case 43: goto L_0x019d;
                case 44: goto L_0x018b;
                case 45: goto L_0x0179;
                case 46: goto L_0x0167;
                case 47: goto L_0x0156;
                case 48: goto L_0x0144;
                case 49: goto L_0x0132;
                case 50: goto L_0x0129;
                case 51: goto L_0x0117;
                case 52: goto L_0x010d;
                case 53: goto L_0x0103;
                case 54: goto L_0x00f9;
                case 55: goto L_0x00e8;
                case 56: goto L_0x00de;
                case 57: goto L_0x00d4;
                case 58: goto L_0x00c2;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x0094;
                case 62: goto L_0x008a;
                case 63: goto L_0x0080;
                case 64: goto L_0x0076;
                case 65: goto L_0x0065;
                case 66: goto L_0x0056;
                case 67: goto L_0x0045;
                case 68: goto L_0x0034;
                case 69: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 18
            X.MMF r2 = new X.MMF
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 40
        L_0x0015:
            X.MHk r0 = new X.MHk
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r3)
            java.lang.Object r0 = X.0zv.A00(r8, r2, r0, r7, r1)
        L_0x001e:
            java.lang.Object r0 = X.JTP.A0l(r0)
            return r0
        L_0x0023:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 17
            X.MMF r2 = new X.MMF
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 39
            goto L_0x0015
        L_0x0034:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 16
            X.MMF r2 = new X.MMF
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 38
            goto L_0x0015
        L_0x0045:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 15
            X.MMF r2 = new X.MMF
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 37
            goto L_0x0015
        L_0x0056:
            java.lang.Object r3 = r6.A02
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A01
            r0 = 33
            X.MCl r2 = new X.MCl
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r7)
            goto L_0x037b
        L_0x0065:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 19
            X.WxU r2 = new X.WxU
            r2.<init>((java.lang.Object) r1, (int) r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 35
            goto L_0x0015
        L_0x0076:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 32
            goto L_0x01bc
        L_0x0080:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 26
            goto L_0x01bc
        L_0x008a:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 25
            goto L_0x01bc
        L_0x0094:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 24
            goto L_0x01bc
        L_0x009e:
            java.lang.Object r5 = r6.A01
            X.0r6[] r5 = (X.AnonymousClass0r6[]) r5
            r0 = 11
            X.Pm5 r4 = new X.Pm5
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A02
            r2 = 0
            r1 = 33
            goto L_0x01dd
        L_0x00b0:
            java.lang.Object r5 = r6.A01
            X.0r6[] r5 = (X.AnonymousClass0r6[]) r5
            r0 = 10
            X.Pm5 r4 = new X.Pm5
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A02
            r2 = 0
            r1 = 32
            goto L_0x01dd
        L_0x00c2:
            java.lang.Object r5 = r6.A01
            X.0r6[] r5 = (X.AnonymousClass0r6[]) r5
            r0 = 9
            X.Pm5 r4 = new X.Pm5
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A02
            r2 = 0
            r1 = 31
            goto L_0x01dd
        L_0x00d4:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 16
            goto L_0x01bc
        L_0x00de:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 15
            goto L_0x01bc
        L_0x00e8:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 0
            X.WxN r2 = new X.WxN
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 29
            goto L_0x0015
        L_0x00f9:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 14
            goto L_0x01bc
        L_0x0103:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 13
            goto L_0x01bc
        L_0x010d:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 12
            goto L_0x01bc
        L_0x0117:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 31
            X.Ing r2 = new X.Ing
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 28
            goto L_0x0015
        L_0x0129:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 7
            goto L_0x01bc
        L_0x0132:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 16
            X.Ing r2 = new X.Ing
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 27
            goto L_0x0015
        L_0x0144:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 8
            X.Ing r2 = new X.Ing
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 26
            goto L_0x0015
        L_0x0156:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 7
            X.Ing r2 = new X.Ing
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 25
            goto L_0x0015
        L_0x0167:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 36
            X.G2h r2 = new X.G2h
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 24
            goto L_0x0015
        L_0x0179:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 30
            X.G2h r2 = new X.G2h
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 23
            goto L_0x0015
        L_0x018b:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 49
            X.Ivk r2 = new X.Ivk
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 20
            goto L_0x0015
        L_0x019d:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 3
            goto L_0x01bc
        L_0x01a5:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 2
            goto L_0x01bc
        L_0x01ad:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 1
            goto L_0x01bc
        L_0x01b5:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 0
        L_0x01bc:
            X.MCl r2 = new X.MCl
            r2.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r1)
            goto L_0x037b
        L_0x01c3:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 61
            goto L_0x0376
        L_0x01cd:
            java.lang.Object r5 = r6.A01
            X.0r6[] r5 = (X.AnonymousClass0r6[]) r5
            r0 = 49
            X.Pm8 r4 = new X.Pm8
            r4.<init>(r5, r0)
            java.lang.Object r3 = r6.A02
            r2 = 0
            r1 = 17
        L_0x01dd:
            X.MHk r0 = new X.MHk
            r0.<init>((X.AnonymousClass4D7) r2, (java.lang.Object) r3, (int) r1)
            java.lang.Object r0 = X.0zv.A00(r8, r4, r0, r7, r5)
            goto L_0x001e
        L_0x01e8:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 17
            X.Ay7 r2 = new X.Ay7
            r2.<init>(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 15
            goto L_0x0015
        L_0x01fa:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 59
            goto L_0x0376
        L_0x0204:
            java.lang.Object r1 = r6.A01
            X.0r6[] r1 = (X.AnonymousClass0r6[]) r1
            r0 = 29
            X.MMQ r2 = X.MMQ.A00(r1, r0)
            java.lang.Object r5 = r6.A02
            r4 = 0
            r3 = 14
            goto L_0x0015
        L_0x0215:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 53
            goto L_0x0376
        L_0x021f:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 52
            goto L_0x0376
        L_0x0229:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 50
            goto L_0x0376
        L_0x0233:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 49
            goto L_0x0376
        L_0x023d:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 48
            goto L_0x0376
        L_0x0247:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 47
            goto L_0x0376
        L_0x0251:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 46
            goto L_0x0376
        L_0x025b:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 45
            goto L_0x0376
        L_0x0265:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 44
            goto L_0x0376
        L_0x026f:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 43
            goto L_0x0376
        L_0x0279:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            X.0sL r1 = (X.0sL) r1
            r0 = 39
            goto L_0x0369
        L_0x0285:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            X.0sL r1 = (X.0sL) r1
            r0 = 38
            goto L_0x0369
        L_0x0291:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 37
            goto L_0x0376
        L_0x029b:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 36
            goto L_0x0376
        L_0x02a5:
            java.lang.Object r3 = r6.A02
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A01
            r0 = 28
            goto L_0x0350
        L_0x02af:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 27
            goto L_0x0376
        L_0x02b9:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 26
            goto L_0x0376
        L_0x02c3:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 24
            goto L_0x0376
        L_0x02cd:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 1
            X.Av1 r2 = new X.Av1
            r2.<init>(r0, r1, r7)
            goto L_0x037b
        L_0x02db:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 23
            goto L_0x0376
        L_0x02e5:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 22
            goto L_0x0376
        L_0x02ef:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 21
            goto L_0x0376
        L_0x02f8:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 19
            goto L_0x0376
        L_0x0301:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 18
            goto L_0x0376
        L_0x030a:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 17
            goto L_0x0376
        L_0x0313:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 15
            goto L_0x0376
        L_0x031c:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 14
            goto L_0x0376
        L_0x0325:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 13
            goto L_0x0376
        L_0x032e:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 12
            goto L_0x0376
        L_0x0337:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 10
            goto L_0x0376
        L_0x0340:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 8
            goto L_0x0376
        L_0x0349:
            java.lang.Object r3 = r6.A02
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A01
            r0 = 7
        L_0x0350:
            X.MCn r2 = new X.MCn
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r7)
            goto L_0x037b
        L_0x0356:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            X.0sL r1 = (X.0sL) r1
            r0 = 6
            goto L_0x0369
        L_0x0360:
            java.lang.Object r3 = r6.A02
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 5
        L_0x0369:
            X.MCn r2 = new X.MCn
            r2.<init>((X.0sL) r1, (X.02o) r7, (int) r0)
            goto L_0x037b
        L_0x036f:
            java.lang.Object r3 = r6.A01
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            java.lang.Object r1 = r6.A02
            r0 = 0
        L_0x0376:
            X.MCn r2 = new X.MCn
            r2.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r1)
        L_0x037b:
            java.lang.Object r0 = r3.collect(r2, r8)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCA.collect(X.02o, X.4D7):java.lang.Object");
    }

    public MCA(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
