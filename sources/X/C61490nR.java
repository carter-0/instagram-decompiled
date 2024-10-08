package X;

import org.tukaani.xz.lz.LZEncoder;

/* renamed from: X.0nR  reason: invalid class name and case insensitive filesystem */
public final class C61490nR extends LZEncoder {
    public int A00 = -1;
    public int A01;
    public final int A02;
    public final int A03;
    public final 0nG A04;
    public final C63230zK A05;
    public final int[] A06;

    public C61490nR(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        int i6 = i + 1;
        this.A02 = i6;
        this.A01 = i6;
        this.A04 = new 0nG(i);
        this.A06 = new int[(i6 * 2)];
        this.A05 = new C63230zK(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0nR.A00():int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private int A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0nR.A00():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61490nR.A00():int");
    }

    private void A01(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.A03;
        int i6 = this.A00;
        int i7 = i6 << 1;
        int i8 = i7 + 1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.A01 - i2;
            int i12 = i5 - 1;
            if (i5 == 0 || i11 >= (i3 = this.A02)) {
                int[] iArr = this.A06;
                iArr[i8] = 0;
                iArr[i7] = 0;
            } else {
                int i13 = i6 - i11;
                if (i11 <= i6) {
                    i3 = 0;
                }
                int i14 = (i13 + i3) << 1;
                int min = Math.min(i9, i10);
                byte[] bArr = this.A08;
                int i15 = this.A02;
                int i16 = i15 + min;
                if (bArr[i16 - i11] == bArr[i16]) {
                    do {
                        min++;
                        if (min == i) {
                            int[] iArr2 = this.A06;
                            iArr2[i7] = iArr2[i14];
                            iArr2[i8] = iArr2[i14 + 1];
                            return;
                        }
                        i4 = i15 + min;
                    } while (bArr[i4 - i11] == bArr[i4]);
                }
                int i17 = i15 + min;
                byte b = bArr[i17 - i11] & 255;
                byte b2 = bArr[i17] & 255;
                int[] iArr3 = this.A06;
                if (b < b2) {
                    iArr3[i7] = i2;
                    i7 = i14 + 1;
                    i2 = iArr3[i7];
                    i10 = min;
                } else {
                    iArr3[i8] = i2;
                    i2 = iArr3[i14];
                    i8 = i14;
                    i9 = min;
                }
                i5 = i12;
            }
        }
        int[] iArr4 = this.A06;
        iArr4[i8] = 0;
        iArr4[i7] = 0;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0nR.A05():X.0zK, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.C63230zK A05() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0nR.A05():X.0zK, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61490nR.A05():X.0zK");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0nR.A06(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A06(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0nR.A06(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61490nR.A06(int):void");
    }
}
