package com.instagram.ml.imagecrop.ig;

import X.0eS;
import X.0sL;
import X.1MF;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass84L;
import X.AnonymousClass84M;
import X.C3502784a;
import X.C370278w8;
import X.C370298wA;
import X.C60340gF;
import X.C62320sa;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ml.imagecrop.ig.IgSmartImageCropController$predictAsync$2", f = "IgSmartImageCropController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgSmartImageCropController$predictAsync$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass84L A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSmartImageCropController$predictAsync$2(AnonymousClass84L r2, String str, AnonymousClass4D7 r4, C62320sa r5, int i, int i2, int i3) {
        super(2, r4);
        this.A03 = r2;
        this.A02 = i;
        this.A00 = i2;
        this.A04 = str;
        this.A01 = i3;
        this.A05 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ml.imagecrop.ig.IgSmartImageCropController$predictAsync$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        AnonymousClass84L r1 = this.A03;
        int i = this.A02;
        int i2 = this.A00;
        return new IgSmartImageCropController$predictAsync$2(r1, this.A04, r10, this.A05, i, i2, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgSmartImageCropController$predictAsync$2) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        0eS.A00(obj);
        AnonymousClass84L r4 = this.A03;
        AnonymousClass84M r0 = r4.A01;
        int i2 = this.A02;
        r0.A00 = i2;
        int i3 = this.A00;
        float f = ((float) i2) / ((float) i3);
        int i4 = 224;
        if (i2 >= i3) {
            i4 = (int) (f * 224.0f);
            i = 224;
        } else {
            i = (int) (224.0f / f);
        }
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(i);
        String str = this.A04;
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        int i5 = this.A01;
        Bitmap A0F = 1MF.A0F(str, intValue, intValue2, i5);
        if (A0F != null) {
            C62320sa r6 = this.A05;
            C3502784a r1 = r4.A00;
            r1.A01 = new C370278w8(A0F, r4, str, r6, i2, i3, i5);
            r1.A00 = new C370298wA(A0F);
            r1.A00();
        }
        return C60340gF.A00;
    }
}
