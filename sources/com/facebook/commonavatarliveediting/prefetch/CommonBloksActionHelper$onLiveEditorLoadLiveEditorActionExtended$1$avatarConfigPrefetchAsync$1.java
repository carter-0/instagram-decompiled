package com.facebook.commonavatarliveediting.prefetch;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C18073Vl1;
import X.C60340gF;
import X.WF8;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1", f = "CommonBloksActionHelper.kt", i = {}, l = {447}, m = "invokeSuspend", n = {}, s = {})
public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ WF8 A01;
    public final /* synthetic */ C18073Vl1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1(WF8 wf8, C18073Vl1 vl1, String str, Map map, AnonymousClass4D7 r6, boolean z, boolean z2) {
        super(2, r6);
        this.A04 = map;
        this.A01 = wf8;
        this.A03 = str;
        this.A02 = vl1;
        this.A06 = z;
        this.A05 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Map map = this.A04;
        return new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1(this.A01, this.A02, this.A03, map, r10, this.A06, this.A05);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1Hj r2 = X.1Hj.A02
            r7 = r10
            int r1 = r10.A00
            r0 = 1
            if (r1 == 0) goto L_0x0014
            X.0eS.A00(r11)
        L_0x000b:
            boolean r0 = X.AnonymousClass7TE.A1a(r11)
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0014:
            X.0eS.A00(r11)
            java.util.Map r6 = r10.A04
            if (r6 == 0) goto L_0x002e
            X.WF8 r3 = r10.A01
            java.lang.String r5 = r10.A03
            X.Vl1 r4 = r10.A02
            boolean r8 = r10.A06
            boolean r9 = r10.A05
            r10.A00 = r0
            java.lang.Object r11 = r3.A00(r4, r5, r6, r7, r8, r9)
            if (r11 != r2) goto L_0x000b
            return r2
        L_0x002e:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
