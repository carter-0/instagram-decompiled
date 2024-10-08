package com.instagram.wonderwall.ui.compose.components;

import X.07U;
import X.0eS;
import X.0nV;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass07V;
import X.AnonymousClass12T;
import X.AnonymousClass1Ek;
import X.AnonymousClass3DM;
import X.AnonymousClass4D7;
import X.AnonymousClass4DN;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C51971G9r;
import X.C54326H7x;
import X.C55955HqJ;
import X.C55956HqK;
import X.C58704IwD;
import X.C60340gF;
import X.C66187MGy;
import X.DbX;
import X.IOE;
import X.MGC;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wonderwall.ui.compose.components.WallVideoAttachmentKt$MediumVideoPlayer$1$1", f = "WallVideoAttachment.kt", i = {}, l = {151, 167}, m = "invokeSuspend", n = {}, s = {})
public final class WallVideoAttachmentKt$MediumVideoPlayer$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ C284945Oz A02;
    public final /* synthetic */ AnonymousClass07V A03;
    public final /* synthetic */ C55955HqJ A04;
    public final /* synthetic */ C55956HqK A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WallVideoAttachmentKt$MediumVideoPlayer$1$1(C284945Oz r2, AnonymousClass07V r3, C55955HqJ hqJ, C55956HqK hqK, String str, AnonymousClass4D7 r7, 0sP r8, boolean z) {
        super(2, r7);
        this.A04 = hqJ;
        this.A06 = str;
        this.A08 = z;
        this.A03 = r3;
        this.A02 = r2;
        this.A07 = r8;
        this.A05 = hqK;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.wonderwall.ui.compose.components.WallVideoAttachmentKt$MediumVideoPlayer$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        C55955HqJ hqJ = this.A04;
        String str = this.A06;
        boolean z = this.A08;
        AnonymousClass07V r2 = this.A03;
        return new WallVideoAttachmentKt$MediumVideoPlayer$1$1(this.A02, r2, hqJ, this.A05, str, r11, this.A07, z);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.wonderwall.ui.compose.components.WallVideoAttachmentKt$MediumVideoPlayer$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C284945Oz r0;
        1Hj r7 = 1Hj.A02;
        int i = this.A00;
        if (i == 0) {
            0eS.A00(obj);
            C55955HqJ hqJ = this.A04;
            String str = this.A06;
            boolean z = this.A08;
            0qQ.A0B(str, 0);
            hqJ.A01.setVideoPath(str, new C54326H7x(hqJ, z));
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            r0 = this.A02;
            0nV A0c = DbX.A0c(AnonymousClass12T.A00);
            C66187MGy mGy = new C66187MGy(mediaMetadataRetriever, str, (AnonymousClass4D7) null, 37);
            this.A01 = r0;
            this.A00 = 1;
            obj = 1Eo.A00(this, A0c, mGy);
            if (obj == r7) {
                return r7;
            }
        } else if (i != 1) {
            try {
                0eS.A00(obj);
                C55955HqJ hqJ2 = this.A04;
                hqJ2.A00();
                hqJ2.volumeKeyListener = null;
                return C60340gF.A00;
            } catch (Throwable th) {
                C55955HqJ hqJ3 = this.A04;
                hqJ3.A00();
                hqJ3.volumeKeyListener = null;
                throw th;
            }
        } else {
            r0 = (C284945Oz) this.A01;
            0eS.A00(obj);
        }
        r0.Epw(obj);
        if (C51971G9r.A1W(this.A02)) {
            C55955HqJ hqJ4 = this.A04;
            C58704IwD A012 = C58704IwD.A01(this.A07, 2);
            hqJ4.volumeKeyListener = null;
            Context context = hqJ4.A01.getContext();
            if (context instanceof AnonymousClass4DN) {
                IOE ioe = new IOE(hqJ4, A012);
                ((AnonymousClass4DN) context).getVolumeKeyPressController().A00(ioe);
                hqJ4.volumeKeyListener = ioe;
            }
        }
        AnonymousClass07V r5 = this.A03;
        07U r4 = 07U.A04;
        MGC mgc = new MGC((Object) this.A05, (Object) this.A04, (AnonymousClass4D7) null, 18);
        this.A01 = null;
        this.A00 = 2;
        if (AnonymousClass3DM.A00(r4, r5, this, mgc) == r7) {
            return r7;
        }
        C55955HqJ hqJ22 = this.A04;
        hqJ22.A00();
        hqJ22.volumeKeyListener = null;
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WallVideoAttachmentKt$MediumVideoPlayer$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
