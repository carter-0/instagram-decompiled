package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass8N2;
import X.C58727Iwa;
import X.C60340gF;
import X.JTR;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadTrimmedVideo$1", f = "CutoutStickerViewModel.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
public final class CutoutStickerViewModel$uploadTrimmedVideo$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ AnonymousClass8N2 A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadTrimmedVideo$1(Medium medium, AnonymousClass8N2 r3, AnonymousClass4D7 r4, long j, long j2, boolean z) {
        super(2, r4);
        this.A04 = r3;
        this.A03 = medium;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadTrimmedVideo$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        return new CutoutStickerViewModel$uploadTrimmedVideo$1(this.A03, this.A04, r11, this.A02, this.A01, this.A05);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadTrimmedVideo$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r1 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass8N2 r2 = this.A04;
            CutoutStickerRepository cutoutStickerRepository = (CutoutStickerRepository) r2.A0F.getValue();
            Medium medium = this.A03;
            long j = this.A02;
            long j2 = this.A01;
            boolean z = this.A05;
            C58727Iwa iwa = new C58727Iwa(r2, 36);
            this.A00 = 1;
            if (JTR.A0y(r1, this, cutoutStickerRepository.A01.ArX(), new CutoutStickerRepository$uploadCutoutVideoSticker$2(medium, cutoutStickerRepository, (AnonymousClass4D7) null, iwa, j, j2, z)) == r1) {
                return r1;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerViewModel$uploadTrimmedVideo$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
