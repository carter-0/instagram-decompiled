package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A9w  reason: case insensitive filesystem */
public final class C39801A9w {
    public int A00;
    public C13815Thi A01;
    public final Context A02;
    public final C367508qr A03;
    public final C367508qr A04;
    public final UserSession A05;
    public final C67266Ml0 A06;
    public final C41799B1e A07;
    public final A91 A08;
    public final HashMap A09;

    public C39801A9w(Context context, C367508qr r8, C367508qr r9, UserSession userSession, A91 a91, C41799B1e b1e) {
        0qQ.A0B(r8, 4);
        this.A02 = context;
        this.A05 = userSession;
        this.A08 = a91;
        this.A04 = r8;
        this.A03 = r9;
        this.A07 = b1e;
        int i = r8.A01;
        int i2 = r9.A01;
        if (!(i == i2 && r8.A00 == r9.A00)) {
            String A0R = 002.A0R("VideoTextureProvider", "_output_size_does_not_match_render_size");
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("outputSize=");
            A1A.append(i);
            A1A.append('x');
            A1A.append(r8.A00);
            A1A.append(" outputRenderSize=");
            A1A.append(i2);
            A1A.append('x');
            A1A.append(r9.A00);
            A1A.append(' ');
            0wb.A03(A0R, A1A.toString());
        }
        this.A09 = AnonymousClass7TE.A1E();
        this.A06 = JYY.A00(userSession);
    }

    public final void A02(C282745Eo r27, C282765Eq r28) {
        0sn A1P;
        C282765Eq r4 = r28;
        0qQ.A0B(r4, 1);
        C282745Eo r6 = r27;
        Drawable A002 = this.A08.A00(r6);
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable");
        AnonymousClass9X8 r2 = (AnonymousClass9X8) A002;
        C41799B1e b1e = this.A07;
        C367508qr r7 = this.A04;
        this.A01 = b1e.ANG(r7, this.A03, r2, r4);
        if ("OMX.ittiam.video.decoder.avc,OMX.Exynos.AVC.Decoder".length() == 0) {
            A1P = 0sn.A00;
        } else {
            String[] strArr = (String[]) 00l.A0R("OMX.ittiam.video.decoder.avc,OMX.Exynos.AVC.Decoder", new String[]{","}, 0).toArray(new String[0]);
            A1P = 0sr.A1P(Arrays.copyOf(strArr, strArr.length));
        }
        Context context = this.A02;
        UserSession userSession = this.A05;
        C13815Thi thi = this.A01;
        if (thi == null) {
            0qQ.A0F("videoOutputSurface");
            throw AnonymousClass00P.createAndThrow();
        }
        C13824Thu thu = C7237Q0j.A0G;
        int i = r7.A01;
        int i2 = r7.A00;
        int i3 = i;
        this.A09.put(r6, new C39699A5p(new C7237Q0j(context, thi, userSession, this.A06, thu, AnonymousClass7TE.A0t(r2.A0B.A0X), A1P, i3, i2, 0, TimeUnit.MILLISECONDS.toMicros((long) r2.A08), true, false, false), r2.A09));
    }

    public final void A00() {
        Collection<C39699A5p> values = this.A09.values();
        0qQ.A07(values);
        for (C39699A5p a5p : values) {
            a5p.A01.A00();
        }
    }

    public final void A01(C282745Eo r10, long j) {
        C7237Q0j q0j;
        long j2;
        C39699A5p a5p = (C39699A5p) this.A09.get(r10);
        if (a5p != null) {
            if (this.A00 >= a5p.A00) {
                0wb.A03("VideoTextureProvider", "Video drawable frame count overdraw");
            }
            boolean z = false;
            while (true) {
                q0j = a5p.A01;
                Number number = (Number) q0j.A0C.peek();
                if (number != null) {
                    j2 = AnonymousClass7TE.A0P(number.longValue());
                } else {
                    j2 = Long.MIN_VALUE;
                }
                if (this.A00 == 0 || (j >= j2 && j2 >= 0)) {
                    long currentTimeMillis = System.currentTimeMillis() + 500;
                    z = false;
                    while (true) {
                        if (System.currentTimeMillis() >= currentTimeMillis) {
                            0wb.A03("VideoTextureProvider", "Video drawable dropped frame while rendering");
                            C13815Thi thi = q0j.A0A.A05;
                            thi.Elt(true);
                            thi.AQa(1000 * j);
                            break;
                        }
                        z = q0j.A02();
                        if (z) {
                            this.A00++;
                            break;
                        }
                    }
                }
            }
            if (!z) {
                C13815Thi thi2 = q0j.A0A.A05;
                thi2.Elt(false);
                thi2.AQa(j);
            }
        }
    }
}
