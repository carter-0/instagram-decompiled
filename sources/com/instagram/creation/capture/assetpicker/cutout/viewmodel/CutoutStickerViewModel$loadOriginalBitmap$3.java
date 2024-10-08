package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.00k;
import X.05G;
import X.0eS;
import X.0sL;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8N2;
import X.AnonymousClass8N5;
import X.AnonymousClass9ZE;
import X.C21289XSu;
import X.C22014Xr7;
import X.C252733pa;
import X.C391749ta;
import X.C51966G9m;
import X.C56445Hyd;
import X.C59673JTe;
import X.C60340gF;
import X.C60733JqQ;
import X.C61029JvT;
import X.C63959LFj;
import X.JTO;
import X.JTT;
import X.JTU;
import X.XHB;
import X.XHD;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3", f = "CutoutStickerViewModel.kt", i = {0, 0, 0}, l = {150}, m = "invokeSuspend", n = {"this_$iv", "name$iv", "start$iv$iv"}, s = {"L$0", "L$1", "J$0"})
public final class CutoutStickerViewModel$loadOriginalBitmap$3 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final /* synthetic */ Bitmap A07;
    public final /* synthetic */ AnonymousClass8N2 A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$loadOriginalBitmap$3(Bitmap bitmap, AnonymousClass8N2 r3, AnonymousClass4D7 r4, boolean z) {
        super(2, r4);
        this.A08 = r3;
        this.A07 = bitmap;
        this.A09 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new CutoutStickerViewModel$loadOriginalBitmap$3(this.A07, this.A08, r6, this.A09);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$loadOriginalBitmap$3, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        AnonymousClass8N2 r10;
        String str;
        Bitmap bitmap;
        boolean z;
        long currentTimeMillis;
        AnonymousClass8N2 r6;
        Object value;
        Object value2;
        StringBuilder A0n;
        float[] fArr;
        Object value3;
        AnonymousClass8N5 r5;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Integer num;
        boolean z2;
        boolean z3;
        Object value4;
        Object value5;
        AnonymousClass8N5 r2;
        Integer num2;
        Bitmap bitmap4;
        float[] fArr2;
        boolean z4;
        boolean z5;
        Object value6;
        AnonymousClass8N5 r22;
        Integer num3;
        Bitmap bitmap5;
        float[] fArr3;
        Bitmap bitmap6;
        boolean z6;
        boolean z7;
        C60733JqQ jqQ;
        List<PointF> list;
        Object value7;
        AnonymousClass8N5 r23;
        C61029JvT jvT;
        Bitmap bitmap7;
        Bitmap bitmap8;
        float[] fArr4;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        if (this.A00 != 0) {
            currentTimeMillis = this.A01;
            z = this.A06;
            bitmap = (Bitmap) this.A05;
            r10 = (AnonymousClass8N2) this.A04;
            str = (String) this.A03;
            r6 = (AnonymousClass8N2) this.A02;
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            r10 = this.A08;
            str = "Auto segmentation";
            bitmap = this.A07;
            z = this.A09;
            currentTimeMillis = System.currentTimeMillis();
            C252733pa r4 = (C252733pa) r10.A0F.getValue();
            this.A02 = r10;
            this.A03 = str;
            this.A04 = r10;
            this.A05 = bitmap;
            this.A06 = z;
            this.A01 = currentTimeMillis;
            this.A00 = 1;
            obj2 = 1Eo.A00(this, r4.A01.ArX(), new C59673JTe(bitmap, r4, (AnonymousClass4D7) null, 3, z));
            if (obj2 == obj3) {
                return obj3;
            }
            r6 = r10;
        }
        C391749ta r14 = (C391749ta) obj2;
        if (r14 instanceof AnonymousClass9ZE) {
            if (z) {
                C21289XSu xSu = (C21289XSu) 00k.A0O(((AnonymousClass9ZE) r14).A00, 2);
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (xSu instanceof XHD) {
                    Rect rect = ((XHD) xSu).A00;
                    if (rect != null) {
                        A1C.add(new C63959LFj(AnonymousClass05K.A0C, new float[]{((float) rect.left) / JTO.A02(bitmap), ((float) rect.top) / JTO.A01(bitmap)}));
                        A1C.add(new C63959LFj(AnonymousClass05K.A0N, new float[]{((float) rect.right) / JTO.A02(bitmap), ((float) rect.bottom) / JTO.A01(bitmap)}));
                    }
                } else if ((xSu instanceof XHB) && (list = ((XHB) xSu).A00) != null) {
                    for (PointF pointF : list) {
                        A1C.add(new C63959LFj(AnonymousClass05K.A00, new float[]{pointF.x / JTO.A02(bitmap), pointF.y / JTO.A01(bitmap)}));
                    }
                }
                05G r12 = r10.A0H;
                do {
                    value7 = r12.getValue();
                    r23 = (AnonymousClass8N5) value7;
                    C61029JvT jvT2 = r23.A03;
                    if (jvT2 != null) {
                        jvT = C61029JvT.A00(jvT2.A05, jvT2.A04, A1C, jvT2.A02, jvT2.A01);
                    } else {
                        jvT = null;
                    }
                    bitmap7 = r23.A02;
                    bitmap8 = r23.A00;
                    fArr4 = r23.A08;
                } while (!r12.AIY(value7, new AnonymousClass8N5(bitmap7, bitmap8, r23.A01, jvT, r23.A04, r23.A05, fArr4, r23.A07, r23.A06)));
            }
            Object A0O = 00k.A0O(((AnonymousClass9ZE) r14).A00, 1);
            if (!(A0O instanceof C60733JqQ) || (jqQ = (C60733JqQ) A0O) == null) {
                fArr = null;
            } else {
                fArr = jqQ.A00;
            }
            05G r42 = r10.A0H;
            do {
                value3 = r42.getValue();
                r5 = (AnonymousClass8N5) value3;
                bitmap2 = r5.A00;
                bitmap3 = r5.A01;
                num = r5.A05;
                z2 = r5.A07;
                z3 = r5.A06;
            } while (!r42.AIY(value3, new AnonymousClass8N5(r5.A02, bitmap2, bitmap3, r5.A03, r5.A04, num, fArr, z2, z3)));
            int i = C56445Hyd.A00;
            if (!(fArr == null || bitmap == null)) {
                int A032 = JTT.A03(bitmap);
                int length = fArr.length;
                if (length == A032) {
                    Bitmap A012 = C22014Xr7.A01(fArr, bitmap.getWidth(), bitmap.getHeight());
                    do {
                        value5 = r42.getValue();
                        r2 = (AnonymousClass8N5) value5;
                        num2 = AnonymousClass05K.A01;
                        bitmap4 = r2.A02;
                        fArr2 = r2.A08;
                        z4 = r2.A07;
                        z5 = r2.A06;
                    } while (!r42.AIY(value5, new AnonymousClass8N5(bitmap4, bitmap, A012, r2.A03, r2.A04, num2, fArr2, z4, z5)));
                } else if (JTT.A03(bitmap) == length) {
                    Bitmap A022 = C22014Xr7.A00.A02(bitmap, fArr);
                    do {
                        value6 = r42.getValue();
                        r22 = (AnonymousClass8N5) value6;
                        num3 = AnonymousClass05K.A01;
                        bitmap5 = r22.A02;
                        fArr3 = r22.A08;
                        bitmap6 = r22.A01;
                        z6 = r22.A07;
                        z7 = r22.A06;
                    } while (!r42.AIY(value6, new AnonymousClass8N5(bitmap5, A022, bitmap6, r22.A03, r22.A04, num3, fArr3, z6, z7)));
                }
            }
            do {
                value4 = r42.getValue();
            } while (!JTU.A1W((AnonymousClass8N5) value4, AnonymousClass05K.A0C, value4, r42));
        } else {
            05G r7 = r10.A0H;
            do {
                value = r7.getValue();
            } while (!JTU.A1W((AnonymousClass8N5) value, AnonymousClass05K.A0C, value, r7));
        }
        long A072 = C51966G9m.A07(currentTimeMillis);
        05G r62 = r6.A07;
        do {
            value2 = r62.getValue();
            A0n = AnonymousClass7TF.A0n((String) value2);
            A0n.append(10);
            A0n.append(str);
            A0n.append(" took ");
            A0n.append(A072);
        } while (!r62.AIY(value2, AnonymousClass7TF.A0l("ms", A0n)));
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$loadOriginalBitmap$3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
