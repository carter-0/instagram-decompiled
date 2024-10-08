package com.instagram.comments.mvvm.data.network;

import X.0eS;
import X.0sL;
import X.0sP;
import X.1ES;
import X.1GP;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C239083Et;
import X.C252683pV;
import X.C333817aC;
import X.C334267az;
import X.C377119Kp;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1", f = "MediaParentCommentNetworkFetcher.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
public final class MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C333817aC A02;
    public final /* synthetic */ 1GP A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1(C333817aC r2, 1GP r3, UserSession userSession, String str, String str2, AnonymousClass4D7 r7, 0sP r8, boolean z) {
        super(2, r7);
        this.A03 = r3;
        this.A07 = r8;
        this.A02 = r2;
        this.A04 = userSession;
        this.A08 = z;
        this.A05 = str;
        this.A06 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        1GP r2 = this.A03;
        0sP r7 = this.A07;
        ? mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1 = new MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1(this.A02, r2, this.A04, this.A05, this.A06, r11, r7, this.A08);
        mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1.A01 = obj;
        return mediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt$suspendAndFetchStream$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C252683pV r11 = (C252683pV) this.A01;
            1GP r2 = this.A03;
            0sP r10 = this.A07;
            r2.A02(new C334267az(this.A02, this.A04, this.A05, this.A06, r10, r11, this.A08));
            1ES.A05(r2, 722993640, 1, true, false);
            C377119Kp r0 = new C377119Kp(r2, 29);
            this.A00 = 1;
            if (C239083Et.A00(this, r0, r11) == r3) {
                return r3;
            }
        }
        return C60340gF.A00;
    }
}
