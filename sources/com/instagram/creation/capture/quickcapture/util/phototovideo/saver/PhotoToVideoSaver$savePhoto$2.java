package com.instagram.creation.capture.quickcapture.util.phototovideo.saver;

import X.0eS;
import X.0sL;
import X.1GK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C352218Cl;
import X.C354148Kv;
import X.C364758lx;
import X.C58237Iof;
import X.C60340gF;
import X.MV5;
import X.OX4;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$2", f = "PhotoToVideoSaver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhotoToVideoSaver$savePhoto$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ FilterChain A00;
    public final /* synthetic */ 1GK A01;
    public final /* synthetic */ C364758lx A02;
    public final /* synthetic */ MV5 A03;
    public final /* synthetic */ C354148Kv A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoToVideoSaver$savePhoto$2(FilterChain filterChain, 1GK r3, C364758lx r4, MV5 mv5, C354148Kv r6, C352218Cl r7, AnonymousClass4D7 r8, boolean z, boolean z2, boolean z3) {
        super(2, r8);
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r4;
        this.A00 = filterChain;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A03 = mv5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.capture.quickcapture.util.phototovideo.saver.PhotoToVideoSaver$savePhoto$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        1GK r2 = this.A01;
        C354148Kv r5 = this.A04;
        C352218Cl r6 = this.A05;
        C364758lx r3 = this.A02;
        return new PhotoToVideoSaver$savePhoto$2(this.A00, r2, r3, this.A03, r5, r6, r13, this.A08, this.A07, this.A06);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhotoToVideoSaver$savePhoto$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        1GK r0 = this.A01;
        String str = null;
        if (r0 != null) {
            try {
                File file = (File) OX4.A01(r0);
                if (file != null) {
                    str = file.getCanonicalPath();
                }
            } catch (Exception unused) {
            }
        }
        C354148Kv r6 = this.A04;
        C352218Cl r7 = this.A05;
        C364758lx r5 = this.A02;
        FilterChain filterChain = this.A00;
        boolean z = this.A08;
        boolean z2 = this.A07;
        boolean z3 = this.A06;
        r6.A03.A01(this.A03, r7.A0h, new C58237Iof((Object) null, (Object) null, filterChain, r5, r6, r7, str, 0, z, z2, z3), z2, !z2);
        return C60340gF.A00;
    }
}
