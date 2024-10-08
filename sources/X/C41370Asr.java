package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Rational;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.Asr  reason: case insensitive filesystem */
public final class C41370Asr implements Callable, MV7 {
    public final Context A00;
    public final Bitmap A01;
    public final UserSession A02;
    public final C41818B1y A03;
    public final L83 A04;
    public final FilterGroupModel A05;
    public final C352218Cl A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final /* synthetic */ void Ddi() {
    }

    public final void Ddl(List list) {
        C41149Ap9 ap9;
        0qQ.A0B(list, 0);
        boolean z = false;
        if (list.isEmpty()) {
            ap9 = new C41149Ap9(this, (String) null, false);
        } else {
            LEA lea = (LEA) list.get(0);
            if (lea.A07 == AnonymousClass05K.A00) {
                z = true;
            }
            ap9 = new C41149Ap9(this, lea.A08, z);
        }
        11Z.A02(ap9);
    }

    public final /* synthetic */ void Ddn() {
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.AR4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0089, code lost:
        if (X.C3495280s.A02(r8) == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r30 = this;
            r12 = r30
            com.instagram.common.session.UserSession r8 = r12.A02
            java.lang.String r0 = "Required value was null."
            if (r8 == 0) goto L_0x00ca
            android.graphics.Bitmap r2 = r12.A01
            if (r2 == 0) goto L_0x002e
            int r0 = r2.getWidth()
            float r3 = (float) r0
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            r1 = 1
            java.io.File r0 = X.AnonymousClass45F.A00()
            X.AEI.A02(r2, r0, r1)
            X.0qQ.A07(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r12.A05
            java.lang.String r2 = r0.getAbsolutePath()
            r4 = 0
            r5 = r4
            r6 = r4
            X.C364978mK.A04(r1, r2, r3, r4, r5, r6)
        L_0x002e:
            X.8Cl r0 = r12.A06
            android.content.Context r6 = r12.A00
            X.8m2 r15 = X.C364788m0.A00(r6, r0)
            int r4 = r0.A07
            int r5 = r0.A09
            int r3 = r0.A06
            android.graphics.Rect r21 = r0.A00()
            X.L83 r11 = r12.A04
            r20 = 1
            int r1 = r11.A01
            float r2 = (float) r1
            int r1 = r11.A00
            float r1 = (float) r1
            float r2 = r2 / r1
            r22 = r2
            r23 = r5
            r24 = r3
            r25 = r4
            r26 = r20
            com.instagram.creation.base.CropInfo r9 = X.C364818m3.A00(r21, r22, r23, r24, r25, r26)
            X.AR4 r13 = new X.AR4
            r13.<init>()
            r10 = 0
            r1 = 0
            X.7qz r23 = new X.7qz
            r23.<init>()
            r2 = 991(0x3df, float:1.389E-42)
            java.lang.String r26 = X.AnonymousClass000.A00(r2)
            r21 = r6
            r22 = r13
            r24 = r8
            r25 = r10
            r27 = r10
            r28 = r1
            r29 = r1
            X.7rU r7 = X.C39823AAu.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r15.Cdi()
            if (r2 == 0) goto L_0x008b
            boolean r2 = X.C3495280s.A02(r8)
            r26 = 1
            if (r2 != 0) goto L_0x008d
        L_0x008b:
            r26 = 0
        L_0x008d:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r14 = r12.A05
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            boolean r2 = r12.A08
            if (r2 == 0) goto L_0x00c7
            X.KgB r2 = X.C62461KgB.GALLERY
        L_0x0097:
            X.KgB[] r17 = new X.C62461KgB[]{r2}
            int r3 = r0.A01
            boolean r2 = r0.A13
            boolean r0 = r12.A07
            X.LER r5 = new X.LER
            r21 = r1
            r22 = r2
            r23 = r20
            r24 = r1
            r25 = r0
            r27 = r1
            r18 = r4
            r19 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r5.A00()
            if (r0 != 0) goto L_0x00c4
            X.Ap9 r0 = new X.Ap9
            r0.<init>(r12, r10, r1)
            X.11Z.A02(r0)
        L_0x00c4:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c7:
            X.KgB r2 = X.C62461KgB.UPLOAD
            goto L_0x0097
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41370Asr.call():java.lang.Object");
    }

    public C41370Asr(Context context, Bitmap bitmap, UserSession userSession, C41818B1y b1y, L83 l83, FilterGroupModel filterGroupModel, C352218Cl r8, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = r8;
        this.A01 = bitmap;
        this.A04 = l83;
        this.A08 = z;
        this.A03 = b1y;
        this.A09 = z2;
        this.A07 = z3;
        this.A05 = filterGroupModel.E1g();
    }

    public final void Dgg(Map map) {
        String str;
        boolean z = false;
        if (map.isEmpty()) {
            str = null;
        } else {
            LEA lea = (LEA) AnonymousClass7TF.A0v(map).next();
            str = lea.A08;
            if (this.A09) {
                if (this.A02 != null) {
                    C352218Cl r6 = this.A06;
                    int i = AnonymousClass8VQ.A03;
                    try {
                        C227922kK r5 = new C227922kK(str);
                        Float f = r6.A0O;
                        if (f != null) {
                            r5.A0P("FNumber", String.valueOf(f));
                        }
                        Long l = r6.A0W;
                        if (l != null) {
                            r5.A0P("ExposureTime", String.valueOf(Float.valueOf(((float) l.longValue()) / 1.0E9f)));
                        }
                        long j = r6.A0B;
                        if (j <= 0) {
                            j = r6.A0A;
                        }
                        if (j > 0) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                            long j2 = r6.A0B;
                            if (j2 <= 0) {
                                j2 = r6.A0A;
                            }
                            r5.A0P("DateTime", String.valueOf(simpleDateFormat.format(Long.valueOf(j2))));
                        }
                        Integer num = r6.A0T;
                        if (num != null) {
                            r5.A0P("PhotographicSensitivity", String.valueOf(num));
                        }
                        Float f2 = r6.A0P;
                        if (f2 != null) {
                            r5.A0P("FocalLength", new Rational(AnonymousClass7TE.A05(f2.floatValue(), 100.0f), 100).toString());
                        }
                        Integer num2 = r6.A0Q;
                        if (num2 != null) {
                            r5.A0P("WhiteBalance", String.valueOf(num2));
                        }
                        List list = r6.A0p;
                        if (list != null && AnonymousClass7TE.A1b(list)) {
                            SGV.A00.A00(r5);
                        }
                        String A052 = r6.A05();
                        if (A052 != null) {
                            r5.A0P("UserComment", 0mp.A06("%s%s", new Object[]{"eId:", A052}));
                        }
                        r5.A0O();
                    } catch (IOException e) {
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "error setting exif metadata";
                        }
                        0kD.A01("GalleryMetadataUtil", localizedMessage);
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                C63395KwG.A00(this.A00, str, "image");
            }
            if (lea.A07 == AnonymousClass05K.A00) {
                z = true;
            }
        }
        11Z.A02(new C41150ApA(this, str, z));
    }
}
