package com.instagram.creation.capture.quickcapture.util.phototovideo.saver;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C352218Cl;
import X.C354148Kv;
import X.C364758lx;
import X.C58237Iof;
import X.C60340gF;
import X.MV5;
import android.graphics.Bitmap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1", f = "PhotoToVideoSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhotoToVideoSaver$savePhoto$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ FilterChain A02;
    public final /* synthetic */ C364758lx A03;
    public final /* synthetic */ MV5 A04;
    public final /* synthetic */ C354148Kv A05;
    public final /* synthetic */ C352218Cl A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoToVideoSaver$savePhoto$1(Bitmap bitmap, Bitmap bitmap2, FilterChain filterChain, C364758lx r5, MV5 mv5, C354148Kv r7, C352218Cl r8, AnonymousClass4D7 r9, boolean z, boolean z2, boolean z3) {
        super(2, r9);
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = bitmap;
        this.A01 = bitmap2;
        this.A03 = r5;
        this.A02 = filterChain;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A04 = mv5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        C354148Kv r6 = this.A05;
        C352218Cl r7 = this.A06;
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = this.A01;
        C364758lx r4 = this.A03;
        return new PhotoToVideoSaver$savePhoto$1(bitmap, bitmap2, this.A02, r4, this.A04, r6, r7, r14, this.A09, this.A08, this.A07);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhotoToVideoSaver$savePhoto$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C354148Kv r5 = this.A05;
        C352218Cl r6 = this.A06;
        Bitmap bitmap = this.A00;
        Bitmap bitmap2 = this.A01;
        C364758lx r4 = this.A03;
        FilterChain filterChain = this.A02;
        boolean z = this.A09;
        boolean z2 = this.A08;
        boolean z3 = this.A07;
        r5.A03.A01(this.A04, r6.A0h, new C58237Iof(bitmap, bitmap2, filterChain, r4, r5, r6, (String) null, 0, z, z2, z3), z2, !z2);
        return C60340gF.A00;
    }
}
