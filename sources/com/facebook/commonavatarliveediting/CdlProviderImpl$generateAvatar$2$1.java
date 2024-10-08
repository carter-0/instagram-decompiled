package com.facebook.commonavatarliveediting;

import X.0eS;
import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262224Cq;
import X.C60340gF;
import X.C64362Lae;
import X.C66314MMx;
import X.L7W;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1", f = "CdlProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CdlProviderImpl$generateAvatar$2$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ CdlProviderImpl A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ 0sL A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CdlProviderImpl$generateAvatar$2$1(CdlProviderImpl cdlProviderImpl, Boolean bool, Integer num, String str, String str2, Map map, AnonymousClass4D7 r8, 0sL r9) {
        super(2, r8);
        this.A01 = cdlProviderImpl;
        this.A05 = str;
        this.A06 = map;
        this.A02 = bool;
        this.A03 = num;
        this.A04 = str2;
        this.A07 = r9;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        ? cdlProviderImpl$generateAvatar$2$1 = new CdlProviderImpl$generateAvatar$2$1(this.A01, this.A02, this.A03, this.A05, this.A04, this.A06, r11, this.A07);
        cdlProviderImpl$generateAvatar$2$1.A00 = obj;
        return cdlProviderImpl$generateAvatar$2$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CdlProviderImpl$generateAvatar$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        0eS.A00(obj);
        C262224Cq r2 = (C262224Cq) this.A00;
        CdlProviderImpl cdlProviderImpl = this.A01;
        long now = cdlProviderImpl.A03.now();
        L7W l7w = cdlProviderImpl.A00;
        if (l7w == null) {
            return null;
        }
        String str = this.A05;
        Map map = this.A06;
        0sP mMx = new C66314MMx(cdlProviderImpl, str, this.A04, this.A07, r2, now);
        if (map != null) {
            z = map.containsKey("root");
        } else {
            z = false;
        }
        Boolean bool = this.A02;
        Integer num = this.A03;
        AnonymousClass7TG.A1N(str, map);
        l7w.A01.A01("generate_avatar_gltf_start", str, (String) null, map);
        GltfMemoryPointerWrapper gltfMemoryPointerWrapper = new GltfMemoryPointerWrapper();
        return Boolean.valueOf(l7w.A00.generateAvatar(str, map, gltfMemoryPointerWrapper, new C64362Lae(l7w, gltfMemoryPointerWrapper, str, map, mMx), z, bool, num));
    }
}
