package X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Tsj  reason: case insensitive filesystem */
public final class C14261Tsj {
    public final int A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public final void A03(String str, Buffer buffer) {
        Map map = this.A01;
        if (map.containsKey(str)) {
            C14265Tsn tsn = (C14265Tsn) map.get(str);
            if (tsn != null) {
                int i = tsn.A00;
                GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, buffer);
                GLES20.glEnableVertexAttribArray(i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public C14261Tsj(int i) {
        Object obj;
        int i2 = i;
        this.A00 = i2;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[1];
        GLES20.glGetProgramiv(i2, 35718, iArr, 0);
        GLES20.glGetProgramiv(i2, 35719, iArr2, 0);
        int i3 = iArr2[0];
        i3 = i3 < 256 ? 256 : i3;
        iArr2[0] = i3;
        byte[] bArr = new byte[i3];
        HashMap hashMap = new HashMap();
        int i4 = iArr[0];
        for (int i5 = 0; i5 < i4; i5++) {
            GLES20.glGetActiveUniform(i2, i5, iArr2[0], iArr3, 0, iArr4, 0, iArr5, 0, bArr, 0);
            String str = new String(bArr, 0, iArr3[0], AnonymousClass15Q.A05);
            int glGetUniformLocation = GLES20.glGetUniformLocation(i2, str);
            int i6 = iArr5[0];
            if (i6 == 5124) {
                obj = new UmC(glGetUniformLocation);
            } else if (i6 == 5126) {
                obj = new C14278TtB(glGetUniformLocation);
            } else if (i6 == 35678) {
                obj = new C14266Tso(glGetUniformLocation);
            } else if (i6 == 35680) {
                obj = new UmG(glGetUniformLocation);
            } else if (i6 != 36198) {
                switch (i6) {
                    case 35664:
                        obj = new UmA(glGetUniformLocation);
                        break;
                    case 35665:
                        obj = new UmB(glGetUniformLocation);
                        break;
                    case 35666:
                        obj = new C14260Tsi(glGetUniformLocation);
                        break;
                    case 35667:
                        obj = new UmD(glGetUniformLocation);
                        break;
                    case 35668:
                        obj = new UmE(glGetUniformLocation);
                        break;
                    case 35669:
                        obj = new UmF(glGetUniformLocation);
                        break;
                    case 35670:
                        obj = new C14271Tsu(glGetUniformLocation);
                        break;
                    case 35671:
                        obj = new Um7(glGetUniformLocation);
                        break;
                    case 35672:
                        obj = new Um8(glGetUniformLocation);
                        break;
                    case 35673:
                        obj = new Um9(glGetUniformLocation);
                        break;
                    default:
                        switch (i6) {
                            case 35675:
                                obj = new C14265Tsn(glGetUniformLocation, 35675);
                                break;
                            case 35676:
                                obj = new C14265Tsn(glGetUniformLocation, 35676);
                                break;
                            default:
                                throw new IllegalStateException("Unrecognized type of uniform");
                        }
                }
            } else {
                obj = new Tt9(glGetUniformLocation);
            }
            hashMap.put(str, obj);
        }
        this.A03 = hashMap;
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[1];
        int[] iArr9 = new int[1];
        int[] iArr10 = new int[1];
        GLES20.glGetProgramiv(i2, 35721, iArr6, 0);
        GLES20.glGetProgramiv(i2, 35722, iArr7, 0);
        int i7 = iArr7[0];
        i7 = i7 < 256 ? 256 : i7;
        iArr7[0] = i7;
        byte[] bArr2 = new byte[i7];
        HashMap hashMap2 = new HashMap();
        int i8 = iArr6[0];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = i2;
            GLES20.glGetActiveAttrib(i10, i9, iArr7[0], iArr8, 0, iArr9, 0, iArr10, 0, bArr2, 0);
            String str2 = new String(bArr2, 0, iArr8[0], AnonymousClass15Q.A05);
            hashMap2.put(str2, new C14265Tsn(GLES20.glGetAttribLocation(i2, str2), iArr10[0]));
        }
        this.A01 = hashMap2;
        this.A02 = new HashMap();
    }

    public final void A00() {
        int i;
        int i2;
        int i3;
        IntBuffer intBuffer;
        int i4;
        IntBuffer intBuffer2;
        int i5;
        IntBuffer intBuffer3;
        int i6;
        IntBuffer intBuffer4;
        GLES20.glUseProgram(this.A00);
        Map map = this.A03;
        for (UmH umH : map.values()) {
            if (umH.A00) {
                if (umH instanceof C14271Tsu) {
                    C14271Tsu tsu = (C14271Tsu) umH;
                    i6 = tsu.A00;
                    intBuffer4 = tsu.A00;
                } else {
                    if (umH instanceof C14260Tsi) {
                        C14260Tsi tsi = (C14260Tsi) umH;
                        GLES20.glUniform4fv(tsi.A00, 1, tsi.A00);
                    } else if (umH instanceof Um6) {
                        Um6 um6 = (Um6) umH;
                        GLES20.glUniformMatrix4fv(um6.A00, 1, false, um6.A00);
                    } else if (umH instanceof C14278TtB) {
                        C14278TtB ttB = (C14278TtB) umH;
                        GLES20.glUniform1fv(ttB.A00, 1, ttB.A00);
                    } else if (umH instanceof UmC) {
                        UmC umC = (UmC) umH;
                        i6 = umC.A00;
                        intBuffer4 = umC.A00;
                    } else if (umH instanceof Tt9) {
                        Tt9 tt9 = (Tt9) umH;
                        i6 = tt9.A00;
                        intBuffer4 = tt9.A00;
                    } else if (umH instanceof UmG) {
                        UmG umG = (UmG) umH;
                        i6 = umG.A00;
                        intBuffer4 = umG.A00;
                    } else if (umH instanceof C14266Tso) {
                        C14266Tso tso = (C14266Tso) umH;
                        i6 = tso.A00;
                        intBuffer4 = tso.A00;
                    } else {
                        if (umH instanceof UmF) {
                            UmF umF = (UmF) umH;
                            i5 = umF.A00;
                            intBuffer3 = umF.A00;
                        } else {
                            if (umH instanceof UmE) {
                                UmE umE = (UmE) umH;
                                i4 = umE.A00;
                                intBuffer2 = umE.A00;
                            } else {
                                if (umH instanceof UmD) {
                                    UmD umD = (UmD) umH;
                                    i3 = umD.A00;
                                    intBuffer = umD.A00;
                                } else if (umH instanceof UmB) {
                                    UmB umB = (UmB) umH;
                                    GLES20.glUniform3fv(umB.A00, 1, umB.A00);
                                } else if (umH instanceof UmA) {
                                    UmA umA = (UmA) umH;
                                    GLES20.glUniform2fv(umA.A00, 1, umA.A00);
                                } else if (umH instanceof Um5) {
                                    GLES20.glUniformMatrix3fv(umH.A00, 1, false, (FloatBuffer) null);
                                } else if (umH instanceof Um9) {
                                    Um9 um9 = (Um9) umH;
                                    i5 = um9.A00;
                                    intBuffer3 = um9.A00;
                                } else if (umH instanceof Um8) {
                                    Um8 um8 = (Um8) umH;
                                    i4 = um8.A00;
                                    intBuffer2 = um8.A00;
                                } else {
                                    Um7 um7 = (Um7) umH;
                                    i3 = um7.A00;
                                    intBuffer = um7.A00;
                                }
                                GLES20.glUniform2iv(i3, 1, intBuffer);
                            }
                            GLES20.glUniform3iv(i4, 1, intBuffer2);
                        }
                        GLES20.glUniform4iv(i5, 1, intBuffer3);
                    }
                    umH.A00 = false;
                }
                GLES20.glUniform1iv(i6, 1, intBuffer4);
                umH.A00 = false;
            }
        }
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C14265Tsn tsn = (C14265Tsn) entry.getValue();
            if (tsn.A01 == 35678) {
                Map map2 = this.A02;
                if (!map2.containsKey(key)) {
                    continue;
                } else {
                    Object obj = map2.get(key);
                    if (obj != null) {
                        C14262Tsk tsk = (C14262Tsk) obj;
                        GLES20.glUniform1i(tsn.A00, i7);
                        GLES20.glActiveTexture(33984 + i7);
                        GLES20.glBindTexture(3553, tsk.A01);
                        if (tsk.A00.intValue() != 0) {
                            i = 9729;
                        } else {
                            i = 9728;
                        }
                        GLES20.glTexParameteri(3553, 10241, i);
                        if (tsk.A00.intValue() != 0) {
                            i2 = 9729;
                        } else {
                            i2 = 9728;
                        }
                        GLES20.glTexParameteri(3553, 10240, i2);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        i7++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
    }

    public final void A01(Integer num, String str) {
        C14262Tsk tsk;
        Map map = this.A02;
        if (map.containsKey(str) && (tsk = (C14262Tsk) map.get(str)) != null) {
            tsk.A00 = num;
        }
    }

    public final void A02(String str, int i) {
        this.A02.put(str, new C14262Tsk(this, AnonymousClass05K.A01, i));
    }
}
