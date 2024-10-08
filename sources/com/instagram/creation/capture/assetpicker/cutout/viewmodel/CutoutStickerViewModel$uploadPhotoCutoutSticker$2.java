package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.0eQ;
import X.0eR;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.1ua;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8N2;
import X.C226132fh;
import X.C60340gF;
import X.C62688Kko;
import X.DbY;
import X.L6A;
import X.LSX;
import X.M8Z;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadPhotoCutoutSticker$2", f = "CutoutStickerViewModel.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
public final class CutoutStickerViewModel$uploadPhotoCutoutSticker$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ AnonymousClass8N2 A04;
    public final /* synthetic */ 1ua A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ WeakReference A09;
    public final /* synthetic */ WeakReference A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadPhotoCutoutSticker$2(Activity activity, Bitmap bitmap, AnonymousClass0iw r4, AnonymousClass8N2 r5, 1ua r6, Integer num, String str, String str2, WeakReference weakReference, WeakReference weakReference2, AnonymousClass4D7 r12) {
        super(2, r12);
        this.A04 = r5;
        this.A07 = str;
        this.A02 = bitmap;
        this.A08 = str2;
        this.A05 = r6;
        this.A0A = weakReference;
        this.A06 = num;
        this.A09 = weakReference2;
        this.A01 = activity;
        this.A03 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadPhotoCutoutSticker$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass8N2 r4 = this.A04;
        String str = this.A07;
        Bitmap bitmap = this.A02;
        String str2 = this.A08;
        1ua r5 = this.A05;
        WeakReference weakReference = this.A0A;
        return new CutoutStickerViewModel$uploadPhotoCutoutSticker$2(this.A01, bitmap, this.A03, r4, r5, this.A06, str, str2, weakReference, this.A09, r14);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadPhotoCutoutSticker$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object A002;
        WeakReference weakReference;
        C62688Kko kko;
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
            A002 = ((0eR) obj).A00;
        } else {
            0eS.A00(obj);
            String str = this.A07;
            Bitmap bitmap = this.A02;
            String str2 = this.A08;
            1ua r5 = this.A05;
            this.A00 = 1;
            A002 = ((CutoutStickerRepository) this.A04.A0F.getValue()).A00(bitmap, r5, str, str2, this);
            if (A002 == r2) {
                return r2;
            }
        }
        boolean z = A002 instanceof 0eQ;
        Integer num = null;
        if (!(!z) || z || A002 == null) {
            weakReference = this.A0A;
            Context context = (Context) weakReference.get();
            if (context != null) {
                int i = ((NineSixteenLayoutConfigImpl) C226132fh.A00(context, this.A04.A0E)).A0G;
                Resources A0A2 = AnonymousClass7TF.A0A(context);
                Throwable A003 = 0eR.A00(A002);
                if ((A003 instanceof C62688Kko) && (kko = (C62688Kko) A003) != null) {
                    num = kko.A00;
                }
                LSX.A02(context, A0A2, num, i);
            }
        } else {
            weakReference = this.A0A;
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                LSX.A03(context2, AnonymousClass7TE.A16(context2, 2131957329), (String) null, ((NineSixteenLayoutConfigImpl) C226132fh.A00(context2, this.A04.A0E)).A0G);
            }
        }
        if (this.A06 == AnonymousClass05K.A0C && this.A09.get() != null) {
            Activity activity = this.A01;
            AnonymousClass8N2 r0 = this.A04;
            AnonymousClass0iw r52 = this.A03;
            Bitmap bitmap2 = this.A02;
            L6A l6a = new L6A(activity, r0.A0E);
            DbY.A1S(r52, weakReference);
            if ((!l6a.A02.A1o()) && bitmap2 != null) {
                AnonymousClass7TF.A0D().postDelayed(new M8Z(bitmap2, r52, l6a), 500);
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$uploadPhotoCutoutSticker$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
