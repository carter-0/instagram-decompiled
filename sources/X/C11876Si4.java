package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Si4  reason: case insensitive filesystem */
public final class C11876Si4 implements C13691Tf9 {
    public static final C9212RTp A05 = new Object();
    public static final C10175Rnq A06 = new C10175Rnq();
    public final Context A00;
    public final C9212RTp A01;
    public final C10175Rnq A02;
    public final C10367Rr4 A03;
    public final List A04;

    public C11876Si4(Context context, C13813Thg thg, ST0 st0, List list) {
        C10175Rnq rnq = A06;
        C9212RTp rTp = A05;
        this.A00 = context.getApplicationContext();
        this.A04 = list;
        this.A01 = rTp;
        this.A03 = new C10367Rr4(thg, st0);
        this.A02 = rnq;
    }

    /* JADX WARNING: type inference failed for: r0v59, types: [java.lang.Object, X.Ryo] */
    /* JADX WARNING: type inference failed for: r1v50, types: [java.lang.Object, X.Ryo] */
    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        Queue queue;
        C11374SQj sQj;
        byte[] bArr;
        Throwable th;
        Bitmap.Config config;
        int i3;
        Bitmap.Config config2;
        int A002;
        int[] iArr;
        int A003;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C10175Rnq rnq = this.A02;
        synchronized (rnq) {
            queue = rnq.A00;
            sQj = (C11374SQj) queue.poll();
            if (sQj == null) {
                sQj = new C11374SQj();
            }
            sQj.A02 = null;
            bArr = sQj.A03;
            Arrays.fill(bArr, (byte) 0);
            sQj.A01 = new C10829Ryp();
            sQj.A00 = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            sQj.A02 = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            sQj.A02.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            SystemClock.elapsedRealtimeNanos();
            if (sQj.A02 != null) {
                C10829Ryp ryp = sQj.A01;
                if (ryp.A05 == 0) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    int i4 = 0;
                    do {
                        A1A.append((char) C11374SQj.A00(sQj));
                        i4++;
                    } while (i4 < 6);
                    if (!A1A.toString().startsWith("GIF")) {
                        ryp = sQj.A01;
                        ryp.A05 = 1;
                    } else {
                        sQj.A01.A06 = sQj.A02.getShort();
                        sQj.A01.A04 = sQj.A02.getShort();
                        int A004 = C11374SQj.A00(sQj);
                        C10829Ryp ryp2 = sQj.A01;
                        ryp2.A08 = AnonymousClass7TF.A1P(A004 & 128);
                        ryp2.A03 = (int) Math.pow(2.0d, (double) ((A004 & 7) + 1));
                        ryp2.A01 = C11374SQj.A00(sQj);
                        C11374SQj.A00(sQj);
                        ryp = sQj.A01;
                        if (ryp.A08 && ryp.A05 == 0) {
                            ryp.A09 = C11374SQj.A02(sQj, ryp.A03);
                            ryp = sQj.A01;
                            ryp.A00 = ryp.A09[ryp.A01];
                        }
                    }
                    if (ryp.A05 == 0) {
                        while (sQj.A01.A05 == 0) {
                            int A005 = C11374SQj.A00(sQj);
                            if (A005 == 33) {
                                int A006 = C11374SQj.A00(sQj);
                                if (A006 != 1) {
                                    if (A006 != 249) {
                                        if (A006 != 254 && A006 == 255) {
                                            C11374SQj.A01(sQj);
                                            StringBuilder A1A2 = AnonymousClass7TE.A1A();
                                            int i5 = 0;
                                            do {
                                                A1A2.append((char) bArr[i5]);
                                                i5++;
                                            } while (i5 < 11);
                                            if (A1A2.toString().equals("NETSCAPE2.0")) {
                                                while (true) {
                                                    C11374SQj.A01(sQj);
                                                    if (sQj.A00 > 0) {
                                                        if (sQj.A01.A05 != 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        sQj.A01.A07 = new Object();
                                        C11374SQj.A00(sQj);
                                        int A007 = C11374SQj.A00(sQj);
                                        C10828Ryo ryo = sQj.A01.A07;
                                        int i6 = (A007 & 28) >> 2;
                                        ryo.A02 = i6;
                                        boolean z = true;
                                        if (i6 == 0) {
                                            ryo.A02 = 1;
                                        }
                                        if ((A007 & 1) == 0) {
                                            z = false;
                                        }
                                        ryo.A09 = z;
                                        short s = sQj.A02.getShort();
                                        if (s < 2) {
                                            s = 10;
                                        }
                                        C10828Ryo ryo2 = sQj.A01.A07;
                                        ryo2.A01 = s * 10;
                                        ryo2.A07 = C11374SQj.A00(sQj);
                                        C11374SQj.A00(sQj);
                                    }
                                }
                                do {
                                    A002 = C11374SQj.A00(sQj);
                                    sQj.A02.position(Math.min(sQj.A02.position() + A002, sQj.A02.limit()));
                                } while (A002 > 0);
                            } else if (A005 != 44) {
                                if (A005 == 59) {
                                    break;
                                }
                                sQj.A01.A05 = 1;
                            } else {
                                C10829Ryp ryp3 = sQj.A01;
                                C10828Ryo ryo3 = ryp3.A07;
                                C10828Ryo ryo4 = ryo3;
                                if (ryo3 == null) {
                                    ? obj2 = new Object();
                                    ryp3.A07 = obj2;
                                    ryo4 = obj2;
                                }
                                ryo4.A05 = sQj.A02.getShort();
                                sQj.A01.A07.A06 = sQj.A02.getShort();
                                sQj.A01.A07.A04 = sQj.A02.getShort();
                                sQj.A01.A07.A03 = sQj.A02.getShort();
                                int A008 = C11374SQj.A00(sQj);
                                boolean z2 = false;
                                boolean A1P = AnonymousClass7TF.A1P(A008 & 128);
                                int pow = (int) Math.pow(2.0d, (double) ((A008 & 7) + 1));
                                C10828Ryo ryo5 = sQj.A01.A07;
                                if ((A008 & 64) != 0) {
                                    z2 = true;
                                }
                                ryo5.A08 = z2;
                                if (A1P) {
                                    iArr = C11374SQj.A02(sQj, pow);
                                } else {
                                    iArr = null;
                                }
                                ryo5.A0A = iArr;
                                sQj.A01.A07.A00 = sQj.A02.position();
                                C11374SQj.A00(sQj);
                                do {
                                    A003 = C11374SQj.A00(sQj);
                                    sQj.A02.position(Math.min(sQj.A02.position() + A003, sQj.A02.limit()));
                                } while (A003 > 0);
                                C10829Ryp ryp4 = sQj.A01;
                                if (ryp4.A05 == 0) {
                                    ryp4.A02++;
                                    ryp4.A0A.add(ryp4.A07);
                                }
                            }
                        }
                        ryp = sQj.A01;
                        if (ryp.A02 < 0) {
                            ryp.A05 = 1;
                        }
                    }
                }
                C11910Sij sij = null;
                if (ryp.A02 > 0 && ryp.A05 == 0) {
                    if (shi.A00(C10060Rlx.A00) == C8875RDr.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int i7 = i2;
                    int i8 = i;
                    int min = Math.min(ryp.A04 / i2, ryp.A06 / i);
                    if (min == 0) {
                        i3 = 0;
                    } else {
                        i3 = Integer.highestOneBit(min);
                    }
                    int max = Math.max(1, i3);
                    Log.isLoggable("BufferGifDecoder", 2);
                    C11264SHy sHy = new C11264SHy(ryp, this.A03, byteBuffer, max);
                    Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                    if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
                        sHy.A05 = config;
                        sHy.A02 = (sHy.A02 + 1) % sHy.A07.A02;
                        Bitmap A012 = sHy.A01();
                        if (A012 != null) {
                            sij = new C11910Sij(new Q6Z(new Q6X(new C11271SIi(A012, SUv.A00(this.A00), sHy, (C11880SiD) C11880SiD.A00, i8, i7))));
                        }
                    } else {
                        StringBuilder A1A3 = AnonymousClass7TE.A1A();
                        A1A3.append("Unsupported format: ");
                        A1A3.append(config);
                        A1A3.append(", must be one of ");
                        A1A3.append(config3);
                        th = C51973G9u.A0g(config2, " or ", A1A3);
                    }
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                synchronized (rnq) {
                    sQj.A02 = null;
                    sQj.A01 = null;
                    queue.offer(sQj);
                }
                return sij;
            }
            th = AnonymousClass7TE.A0z("You must call setData() before parseHeader()");
            throw th;
        } catch (Throwable th2) {
            synchronized (rnq) {
                sQj.A02 = null;
                sQj.A01 = null;
                queue.offer(sQj);
                throw th2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (AnonymousClass7TE.A1a(shi.A00(C10060Rlx.A01)) || SKE.A02(byteBuffer, this.A04) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }
}
