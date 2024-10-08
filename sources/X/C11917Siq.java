package X;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.Siq  reason: case insensitive filesystem */
public final class C11917Siq implements C13813Thg {
    public static final Bitmap.Config A08 = Bitmap.Config.ARGB_8888;
    public long A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final SOA A06;
    public final Set A07;

    private synchronized Bitmap A00(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int intValue;
        if (config != Bitmap.Config.HARDWARE) {
            SOA soa = this.A06;
            if (config != null) {
                config2 = config;
            } else {
                config2 = A08;
            }
            int A002 = C11424STg.A00(config2, i, i2);
            QH5 qh5 = soa.A01;
            C11919Sis A003 = qh5.A00(config2, A002);
            if (Bitmap.Config.RGBA_F16.equals(config2)) {
                configArr = SOA.A06;
            } else {
                int A082 = Pxe.A08(config2, C9909RjO.A00);
                if (A082 == 1) {
                    configArr = SOA.A05;
                } else if (A082 == 2) {
                    configArr = SOA.A07;
                } else if (A082 == 3) {
                    configArr = SOA.A04;
                } else if (A082 != 4) {
                    configArr = new Bitmap.Config[]{config2};
                } else {
                    configArr = SOA.A03;
                }
            }
            int length = configArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Bitmap.Config config3 = configArr[i3];
                Integer num = (Integer) Pxj.A0z(config3, soa.A02).ceilingKey(Integer.valueOf(A002));
                if (num == null || (intValue = num.intValue()) > A002 * 8) {
                    i3++;
                } else if (intValue != A002 || config3 == null || !config3.equals(config2)) {
                    Queue queue = qh5.A00;
                    if (queue.size() < 20) {
                        queue.offer(A003);
                    }
                    A003 = qh5.A00(config3, intValue);
                }
            }
            bitmap = (Bitmap) soa.A00.A01(A003);
            if (bitmap != null) {
                SOA.A00(bitmap, soa, Integer.valueOf(A003.A00));
                bitmap.reconfigure(i, i2, config2);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    C11424STg.A00(config, i, i2);
                }
                this.A03++;
            } else {
                this.A02++;
                this.A05 -= (long) C11424STg.A01(bitmap);
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                C11424STg.A00(config, i, i2);
            }
            Log.isLoggable("LruBitmapPool", 2);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Cannot create a mutable Bitmap with config: ");
            A1A.append(config);
            throw Pxg.A0d(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions", A1A);
        }
        return bitmap;
    }

    private synchronized void A01(long j) {
        while (true) {
            if (this.A05 <= j) {
                break;
            }
            SOA soa = this.A06;
            Bitmap bitmap = (Bitmap) soa.A00.A00();
            if (bitmap != null) {
                SOA.A00(bitmap, soa, Integer.valueOf(C11424STg.A01(bitmap)));
                this.A05 -= (long) C11424STg.A01(bitmap);
                this.A01++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    C11424STg.A01(bitmap);
                    bitmap.getConfig();
                }
                Log.isLoggable("LruBitmapPool", 2);
                bitmap.recycle();
            } else {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                }
                this.A05 = 0;
            }
        }
    }

    public final synchronized void E5H(Bitmap bitmap) {
        Throwable th;
        if (bitmap == null) {
            th = AnonymousClass7TE.A11("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable()) {
                SOA soa = this.A06;
                long j = this.A00;
                if (((long) C11424STg.A01(bitmap)) <= j && this.A07.contains(bitmap.getConfig())) {
                    int A012 = C11424STg.A01(bitmap);
                    C11919Sis A002 = soa.A01.A00(bitmap.getConfig(), C11424STg.A01(bitmap));
                    soa.A00.A02(A002, bitmap);
                    NavigableMap A0z = Pxj.A0z(bitmap.getConfig(), soa.A02);
                    Integer num = (Integer) C51968G9o.A10(A0z, A002.A00);
                    Integer valueOf = Integer.valueOf(A002.A00);
                    int i = 1;
                    if (num != null) {
                        i = 1 + num.intValue();
                    }
                    C66580MXl.A1T(valueOf, A0z, i);
                    this.A04++;
                    this.A05 += (long) A012;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        C11424STg.A01(bitmap);
                        bitmap.getConfig();
                    }
                    Log.isLoggable("LruBitmapPool", 2);
                    A01(j);
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                C11424STg.A01(bitmap);
                bitmap.getConfig();
                bitmap.isMutable();
                this.A07.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } else {
            th = AnonymousClass7TE.A0z("Cannot pool recycled bitmap");
        }
        throw th;
    }

    public C11917Siq(long j) {
        SOA soa = new SOA();
        HashSet A0s = Pxf.A0s(Bitmap.Config.values());
        A0s.add((Object) null);
        A0s.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(A0s);
        this.A00 = j;
        this.A06 = soa;
        this.A07 = unmodifiableSet;
    }

    public final void AHj() {
        Log.isLoggable("LruBitmapPool", 3);
        A01(0);
    }

    public final void FI3(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            AHj();
        } else if (i == 15) {
            A01(this.A00 / 2);
        }
    }

    public final Bitmap AWz(int i, int i2, Bitmap.Config config) {
        Bitmap A002 = A00(i, i2, config);
        if (A002 != null) {
            A002.eraseColor(0);
            return A002;
        }
        if (config == null) {
            config = A08;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final Bitmap AxL(int i, int i2, Bitmap.Config config) {
        Bitmap A002 = A00(i, i2, config);
        if (A002 != null) {
            return A002;
        }
        if (config == null) {
            config = A08;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
