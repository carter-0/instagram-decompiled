package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.7zT  reason: invalid class name and case insensitive filesystem */
public final class C349027zT {
    public C349047zV A00;
    public final boolean A01;

    public final void A02(Canvas canvas, C362938ik r14, 0sP r15, 0sP r16, int i, int i2, long j) {
        ALH B3D;
        A00(this, 0);
        C349047zV r0 = this.A00;
        if (r0 != null && (B3D = r0.B3D()) != null) {
            boolean z = this.A01;
            C39862ACi aCi = C39862ACi.A00;
            synchronized (aCi) {
            }
            if (r14 != null) {
                A01(this, r14, 0);
            }
            A95 a95 = B3D.A04;
            int i3 = i;
            int i4 = i2;
            a95.A04.addAndGet(((long) i3) * ((long) i4));
            a95.A05[0].A00.incrementAndGet();
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawARGB(0, 0, 0, 0);
            r16.invoke(canvas2);
            B3D.A05(createBitmap, 0, j);
            if (!z) {
                B3D.onDrawFrame((GL10) null);
            }
            Bitmap A02 = B3D.A02(0);
            if (A02 != null) {
                if (r15 != null) {
                    r15.invoke(A02);
                } else {
                    canvas.drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
                }
                B3D.A04(A02);
            }
            synchronized (aCi) {
            }
        }
    }

    public static final void A00(C349027zT r4, int i) {
        ALH alh;
        Integer valueOf;
        int i2;
        A7W a7w;
        C349047zV r0 = r4.A00;
        if (r0 != null) {
            alh = r0.B3D();
        } else {
            alh = null;
        }
        if (r4.A01) {
            i2 = 5;
            if (alh != null) {
                valueOf = Integer.valueOf(i);
            } else {
                return;
            }
        } else if (alh != null) {
            valueOf = Integer.valueOf(i);
            i2 = -1;
        } else {
            return;
        }
        Map map = alh.A05;
        if (map.containsKey(valueOf) && (a7w = (A7W) map.get(valueOf)) != null) {
            synchronized (a7w) {
                AtomicInteger atomicInteger = a7w.A02;
                int max = Math.max(i2, -1);
                atomicInteger.set(max);
                a7w.A03.set(max);
            }
        }
    }

    public static final void A01(C349027zT r4, C362938ik r5, Object obj) {
        ALH B3D;
        String str;
        List list;
        Integer num;
        Integer num2;
        String str2;
        C349047zV r0 = r4.A00;
        if (r0 != null && (B3D = r0.B3D()) != null) {
            AJ6 aj6 = B3D.A02;
            int ordinal = r5.A07.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    num = aj6.A07(obj);
                    num2 = AnonymousClass05K.A01;
                } else if (ordinal == 2) {
                    num = aj6.A07(obj);
                    num2 = AnonymousClass05K.A0C;
                } else if (ordinal == 3) {
                    num = aj6.A07(obj);
                    num2 = AnonymousClass05K.A0N;
                } else if (ordinal != 4) {
                    throw new RuntimeException();
                }
                if (num != num2) {
                    HashMap hashMap = new HashMap();
                    switch (num2.intValue()) {
                        case 1:
                            str2 = "text_neon";
                            break;
                        case 2:
                            str2 = "text_shimmer";
                            break;
                        default:
                            str2 = "text_pixel";
                            break;
                    }
                    aj6.A00.put(obj, AJ6.A02(aj6, str2, hashMap));
                }
            } else {
                if (aj6.A07(obj) != AnonymousClass05K.A00) {
                    aj6.A00.put(obj, AJ6.A02(aj6, "sparkle", new HashMap()));
                }
                C381609c2 r02 = r5.A08;
                if (r02 == null || (list = r02.A00) == null) {
                    list = 0sn.A00;
                }
                aj6.A08("sparkle_positions_and_alphas", obj, 00k.A0P(" ", "", "", list, (0sP) null));
            }
            aj6.A08("fontSize", obj, String.valueOf(r5.A00));
            aj6.A08("fontThickness", obj, String.valueOf(r5.A01));
            aj6.A08("textColor", obj, 0nH.A0E(r5.A05));
            aj6.A08("hasOutline", obj, String.valueOf(r5.A0A));
            List list2 = r5.A09;
            if (list2 != null) {
                str = 00k.A0P(" ", "", "", list2, (0sP) null);
            } else {
                str = "";
            }
            aj6.A08("timeOffsets", obj, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.182.A06(r3, r5, 36323139719146391L) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C349027zT(com.instagram.common.session.UserSession r5, android.content.Context r6, boolean r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.A01 = r7
            X.0Tu r3 = X.0Tu.A06
            r0 = 36323139718949780(0x810bb400132b94, double:3.034238047583165E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x001e
            r0 = 36323139719146391(0x810bb400162b97, double:3.034238047707503E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            r0 = 36323139718884243(0x810bb400122b93, double:3.0342380475417194E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x003f
            r0 = 36323139719080854(0x810bb400152b96, double:3.034238047666057E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x003f
            X.WUc r0 = new X.WUc
            r0.<init>(r6, r7, r2)
        L_0x003a:
            X.7zV r0 = (X.C349047zV) r0
            r4.A00 = r0
            return
        L_0x003f:
            X.7zU r0 = new X.7zU
            r0.<init>(r6, r7, r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349027zT.<init>(com.instagram.common.session.UserSession, android.content.Context, boolean):void");
    }
}
