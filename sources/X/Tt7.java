package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.FloatBuffer;
import java.util.Map;

public abstract class Tt7 {
    public boolean A00 = false;
    public int[] A01 = new int[1];
    public int[] A02 = new int[4];

    public final void A02(C14261Tsj tsj, X98 x98, C365358my r14, XBw xBw, C365358my[] r16) {
        C365358my r1;
        if (this instanceof Um2) {
            return;
        }
        if (this instanceof Tt8) {
            Tt8 tt8 = (Tt8) this;
            tsj.getClass();
            tsj.A01(AnonymousClass05K.A01, "image");
            float[] fArr = tt8.A09;
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            C14260Tsi tsi = tt8.A02;
            if (tsi != null) {
                float[] fArr2 = tt8.A07;
                tsi.A00(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            }
            C14260Tsi tsi2 = tt8.A04;
            if (tsi2 != null) {
                float[] fArr3 = tt8.A0A;
                tsi2.A00(fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
            }
            UmA umA = tt8.A01;
            if (umA != null) {
                float f = fArr[0];
                float f2 = fArr[1];
                FloatBuffer floatBuffer = umA.A00;
                floatBuffer.put(0, f);
                floatBuffer.put(1, f2);
                umA.A00 = true;
            }
            C14260Tsi tsi3 = tt8.A03;
            if (tsi3 != null) {
                float[] fArr4 = tt8.A08;
                tsi3.A00(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
            }
            Bitmap bitmap = tt8.A00;
            C14266Tso tso = tt8.A05;
            if (tso != null && bitmap != null) {
                BitmapFactory.Options options = AnonymousClass9S9.A00;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int A002 = AnonymousClass9S9.A00();
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                C365348mx r0 = null;
                if (!AnonymousClass9S9.A05(AnonymousClass000.A00(5021))) {
                    r0 = C365338mw.A01((C367428qj) null, A002, width, height);
                }
                r0.getClass();
                tt8.A06 = r0;
                tsj.A02("bitmapBackgroundSampler", r0.getTextureId());
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, tt8.A06.getTextureId());
                tso.A00.put(0, 1);
                tso.A00 = true;
            }
        } else if (this instanceof Um1) {
            Um1 um1 = (Um1) this;
            tsj.getClass();
            Integer num = AnonymousClass05K.A01;
            tsj.A01(num, "image");
            tsj.A01(num, "uColorLut");
            C14260Tsi tsi4 = um1.A0C;
            if (tsi4 != null) {
                float width2 = (float) r14.getWidth();
                float height2 = (float) r14.getHeight();
                tsi4.A00(width2, height2, 1.0f / width2, 1.0f / height2);
            }
            C14260Tsi tsi5 = um1.A0D;
            if (!(tsi5 == null || (r1 = r16[0]) == null)) {
                float width3 = (float) r1.getWidth();
                float height3 = (float) r1.getHeight();
                tsi5.A00(width3, height3, 1.0f / width3, 1.0f / height3);
            }
            C14278TtB ttB = um1.A07;
            if (ttB != null) {
                ttB.A00(um1.A02);
            }
            C14278TtB ttB2 = um1.A09;
            if (ttB2 != null) {
                ttB2.A00(0.0f);
            }
            C14260Tsi tsi6 = um1.A0B;
            if (tsi6 != null) {
                float[] fArr5 = um1.A0H;
                tsi6.A00(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
            }
            C14260Tsi tsi7 = um1.A0F;
            if (tsi7 != null) {
                float[] fArr6 = um1.A0J;
                tsi7.A00(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
            }
            C14278TtB ttB3 = um1.A06;
            if (ttB3 != null) {
                ttB3.A00(um1.A01);
            }
            C14278TtB ttB4 = um1.A08;
            if (ttB4 != null) {
                ttB4.A00(um1.A03);
            }
            C14278TtB ttB5 = um1.A05;
            if (ttB5 != null) {
                ttB5.A00(um1.A00);
            }
            C14260Tsi tsi8 = um1.A0E;
            if (tsi8 != null) {
                float[] fArr7 = um1.A0I;
                tsi8.A00(fArr7[0], fArr7[1], fArr7[2], fArr7[3]);
            }
            C14260Tsi tsi9 = um1.A0G;
            if (tsi9 != null) {
                float[] fArr8 = um1.A0K;
                tsi9.A00(fArr8[0], fArr8[1], fArr8[2], fArr8[3]);
            }
            C14278TtB ttB6 = um1.A0A;
            if (ttB6 != null) {
                ttB6.A00(((float) (System.currentTimeMillis() - um1.A04)) * 0.001f);
            }
        } else if (this instanceof Um3) {
            Um3 um3 = (Um3) this;
            x98.getClass();
            UmA umA2 = um3.A08;
            if (umA2 != null) {
                float width4 = (float) r14.getWidth();
                FloatBuffer floatBuffer2 = umA2.A00;
                floatBuffer2.put(0, width4);
                floatBuffer2.put(1, (float) r14.getHeight());
                umA2.A00 = true;
            }
            UmC umC = um3.A0D;
            if (umC != null) {
                umC.A00.put(0, 0);
                umC.A00 = true;
            }
            C14278TtB ttB7 = um3.A00;
            if (ttB7 != null) {
                ttB7.A00(0.0f);
            }
            C14278TtB ttB8 = um3.A04;
            if (ttB8 != null) {
                ttB8.A00(0.8f);
            }
            C14278TtB ttB9 = um3.A05;
            if (ttB9 != null) {
                ttB9.A00(0.025f);
            }
            UmB umB = um3.A09;
            if (umB != null) {
                FloatBuffer floatBuffer3 = umB.A00;
                floatBuffer3.put(0, 1.0f);
                floatBuffer3.put(1, 1.0f);
                floatBuffer3.put(2, 1.0f);
                umB.A00 = true;
            }
            C14278TtB ttB10 = um3.A03;
            if (ttB10 != null) {
                ttB10.A00(0.0f);
            }
            C14278TtB ttB11 = um3.A01;
            if (ttB11 != null) {
                ttB11.A00(0.1f);
            }
            C14278TtB ttB12 = um3.A02;
            if (ttB12 != null) {
                ttB12.A00(0.2f);
            }
            C14260Tsi tsi10 = um3.A0A;
            if (tsi10 != null) {
                tsi10.A00(1.0f, 1.0f, 1.0f, 1.0f);
            }
            C14260Tsi tsi11 = um3.A0B;
            if (tsi11 != null) {
                tsi11.A00(0.0f, 0.0f, 0.0f, 0.5f);
            }
            C14278TtB ttB13 = um3.A06;
            if (ttB13 != null) {
                ttB13.A00(0.0f);
            }
            C14278TtB ttB14 = um3.A07;
            if (ttB14 != null) {
                ttB14.A00(0.0f);
            }
            um3.A0J = r14;
            um3.A0K = xBw;
            double width5 = (double) r14.getWidth();
            double height4 = (double) r14.getHeight();
            int i = (int) (width5 * 0.125d);
            int i2 = (int) (height4 * 0.125d);
            um3.A0G = x98.CsV((int) (width5 * 0.25d), (int) (height4 * 0.25d));
            um3.A0H = x98.CsV(i, i2);
            um3.A0I = x98.CsV(i, i2);
        } else {
            Um4 um4 = (Um4) this;
            if (x98 != null) {
                um4.A0D = x98;
                UmA umA3 = um4.A06;
                if (umA3 != null) {
                    float width6 = (float) r14.getWidth();
                    FloatBuffer floatBuffer4 = umA3.A00;
                    floatBuffer4.put(0, width6);
                    floatBuffer4.put(1, (float) r14.getHeight());
                    umA3.A00 = true;
                }
                C14278TtB ttB15 = um4.A02;
                if (ttB15 != null) {
                    ttB15.A00(1.66f);
                }
                C14278TtB ttB16 = um4.A04;
                if (ttB16 != null) {
                    ttB16.A00(0.0f);
                }
                C14278TtB ttB17 = um4.A03;
                if (ttB17 != null) {
                    ttB17.A00(0.25f);
                }
                C14278TtB ttB18 = um4.A05;
                if (ttB18 != null) {
                    ttB18.A00(1.0f);
                }
                C14271Tsu tsu = um4.A01;
                if (tsu != null) {
                    tsu.A00(um4.A0G);
                }
                C14271Tsu tsu2 = um4.A00;
                if (tsu2 != null) {
                    tsu2.A00(false);
                }
                um4.A0E = r14;
                um4.A0F = xBw;
                um4.A0A = x98.CsV(xBw.Blp(), xBw.Blj());
                um4.A0B = x98.CsV(xBw.Blp() / 4, xBw.Blj() / 4);
                um4.A0C = x98.CsV(xBw.Blp() / 4, xBw.Blj() / 4);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static C14260Tsi A00(Object obj, Map map) {
        return (C14260Tsi) ((UmH) map.get(obj));
    }
}
