package com.instagram.friendmap.data;

import X.0eS;
import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4A5;
import X.AnonymousClass4A6;
import X.AnonymousClass4D7;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$friendMapUiReadyFlow$1", f = "FriendMapRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FriendMapRepository$friendMapUiReadyFlow$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;

    public FriendMapRepository$friendMapUiReadyFlow$1(AnonymousClass4D7 r2) {
        super(4, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        FriendMapRepository$friendMapUiReadyFlow$1 friendMapRepository$friendMapUiReadyFlow$1 = new FriendMapRepository$friendMapUiReadyFlow$1((AnonymousClass4D7) obj4);
        friendMapRepository$friendMapUiReadyFlow$1.A00 = obj;
        friendMapRepository$friendMapUiReadyFlow$1.A01 = obj2;
        friendMapRepository$friendMapUiReadyFlow$1.A02 = booleanValue;
        return friendMapRepository$friendMapUiReadyFlow$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        AnonymousClass4A6 r1 = (AnonymousClass4A6) this.A01;
        boolean z = this.A02;
        boolean z2 = true;
        if (!(!((List) this.A00).isEmpty()) || r1.A04 == AnonymousClass4A5.UNSET || !z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
