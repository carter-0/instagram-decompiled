package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.media.MediaPlayer;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2e5  reason: invalid class name */
public final class AnonymousClass2e5 {
    public float A00;
    public int A01;
    public SparseArray A02;
    public AnonymousClass2e6 A03;
    public C71562e7 A04;
    public Set A05;
    public boolean A06;
    public Paint A07;
    public PorterDuffXfermode A08;
    public PorterDuffXfermode A09;
    public PorterDuffXfermode A0A;
    public final Matrix A0B = new Matrix();
    public final RectF A0C;
    public final C71532dv A0D;
    public final AnonymousClass2e2 A0E;
    public final Map A0F;
    public final RectF[] A0G;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e5.A02(int):X.6BC, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.AnonymousClass6BC A02(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e5.A02(int):X.6BC, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2e5.A02(int):X.6BC");
    }

    public static void A00(2dy r7, AnonymousClass2e6 r8) {
        AnonymousClass6B8 r3 = r7.A0V;
        if (r3 != null) {
            AnonymousClass6AF r0 = r3.A08;
            if (r0 != null) {
                r8.A03 = Math.max(r8.A03, r0.A01.length);
            }
            AnonymousClass6B0 r02 = r3.A03;
            if (r02 != null) {
                r8.A03 = Math.max(r8.A03, ((AnonymousClass6AF[]) r02.A00)[0].A01.length);
            }
            AnonymousClass6AD r03 = r3.A01;
            if (r03 != null) {
                r8.A00 = Math.max(r8.A00, r03.A01.length);
            }
            AnonymousClass6B0 r04 = r3.A02;
            if (r04 != null) {
                r8.A00 = Math.max(r8.A00, ((AnonymousClass6AD[]) r04.A00)[0].A01.length);
            }
        }
        2dt r2 = r7.A0f;
        if (r2 != null) {
            r8.A01 = Math.max(r8.A01, r2.A02.length);
            r8.A02 = Math.max(r8.A02, r2.A03.length);
        }
        AnonymousClass6B0 r05 = r7.A0a;
        if (r05 != null) {
            for (2dt r22 : (2dt[]) r05.A00) {
                r8.A01 = Math.max(r8.A01, r22.A02.length);
                r8.A02 = Math.max(r8.A02, r22.A03.length);
            }
        }
        2dt r23 = r7.A0e;
        if (r23 != null) {
            r8.A01 = Math.max(r8.A01, r23.A02.length);
            r8.A02 = Math.max(r8.A02, r23.A03.length);
        }
        AnonymousClass6B0 r06 = r7.A0Y;
        if (r06 != null) {
            for (2dt r24 : (2dt[]) r06.A00) {
                r8.A01 = Math.max(r8.A01, r24.A02.length);
                r8.A02 = Math.max(r8.A02, r24.A03.length);
            }
        }
        2dy r07 = r7.A0W;
        if (r07 != null) {
            A00(r07, r8);
            return;
        }
        2dy[] r32 = r7.A0x;
        if (r32 != null) {
            for (2dy A002 : r32) {
                A00(A002, r8);
            }
        }
    }

    public final Paint A01(PorterDuff.Mode mode) {
        PorterDuffXfermode porterDuffXfermode;
        Paint paint = this.A07;
        if (paint == null) {
            paint = new Paint(1);
            this.A07 = paint;
        }
        if (mode == null) {
            paint.setXfermode((Xfermode) null);
        } else {
            int i = AnonymousClass6K3.A00[mode.ordinal()];
            if (i == 1) {
                porterDuffXfermode = this.A09;
                if (porterDuffXfermode == null) {
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                    this.A09 = porterDuffXfermode;
                }
            } else if (i == 2) {
                porterDuffXfermode = this.A0A;
                if (porterDuffXfermode == null) {
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                    this.A0A = porterDuffXfermode;
                }
            } else if (i == 3) {
                porterDuffXfermode = this.A08;
                if (porterDuffXfermode == null) {
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
                    this.A08 = porterDuffXfermode;
                }
            }
            this.A07.setXfermode(porterDuffXfermode);
        }
        return this.A07;
    }

    public final void A03(int i) {
        MediaPlayer mediaPlayer;
        this.A01 = i;
        Set<UKD> set = this.A05;
        if (set != null) {
            for (UKD ukd : set) {
                if (i == 2 && (mediaPlayer = ukd.A00) != null && mediaPlayer.isPlaying()) {
                    ukd.A00.pause();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2e6, java.lang.Object] */
    public AnonymousClass2e5(C71532dv r8) {
        HashMap hashMap;
        int i = 0;
        this.A01 = 0;
        this.A00 = 1.0f;
        this.A06 = false;
        this.A0D = r8;
        AnonymousClass2e2[] r6 = r8.A04;
        AnonymousClass2e2 r5 = r6[r8.A00];
        this.A0E = r5;
        ? obj = new Object();
        this.A03 = obj;
        for (AnonymousClass2e2 r0 : r6) {
            A00(r0.A02, obj);
        }
        this.A04 = new C71562e7();
        C71542dx r02 = r5.A03;
        this.A0C = new RectF(0.0f, 0.0f, r02.A01, r02.A00);
        this.A0G = new RectF[2];
        while (true) {
            RectF[] rectFArr = this.A0G;
            if (i >= 2) {
                break;
            }
            rectFArr[i] = new RectF();
            i++;
        }
        if (this.A0D.A02 != null) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        this.A0F = hashMap;
    }
}
