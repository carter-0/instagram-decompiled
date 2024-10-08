package com.instagram.friendmap.data;

import X.00k;
import X.0eS;
import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4A6;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C67534MpT;
import X.C67535MpU;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$friendMapNotesEntryPointFlow$1", f = "FriendMapRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FriendMapRepository$friendMapNotesEntryPointFlow$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ FriendMapRepository A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FriendMapRepository$friendMapNotesEntryPointFlow$1(FriendMapRepository friendMapRepository, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A03 = friendMapRepository;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        FriendMapRepository$friendMapNotesEntryPointFlow$1 friendMapRepository$friendMapNotesEntryPointFlow$1 = new FriendMapRepository$friendMapNotesEntryPointFlow$1(this.A03, (AnonymousClass4D7) obj4);
        friendMapRepository$friendMapNotesEntryPointFlow$1.A00 = obj;
        friendMapRepository$friendMapNotesEntryPointFlow$1.A01 = obj2;
        friendMapRepository$friendMapNotesEntryPointFlow$1.A02 = obj3;
        return friendMapRepository$friendMapNotesEntryPointFlow$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        List list = (List) this.A00;
        return new C67534MpT(00k.A0g(list, new C67535MpU()), FriendMapRepository.A00(this.A03, (AnonymousClass4A6) this.A01, list), (String) this.A02);
    }
}
