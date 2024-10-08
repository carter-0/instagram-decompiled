package com.facebook.commonavatarliveediting;

import X.0eS;
import X.0sL;
import X.19E;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import X.C62699Kkz;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1$1$1", f = "CdlProviderImpl.kt", i = {}, l = {134, 136}, m = "invokeSuspend", n = {}, s = {})
public final class CdlProviderImpl$generateAvatar$2$1$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C62699Kkz A03;
    public final /* synthetic */ CdlProviderImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sL A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CdlProviderImpl$generateAvatar$2$1$1$1(C62699Kkz kkz, CdlProviderImpl cdlProviderImpl, String str, String str2, AnonymousClass4D7 r6, 0sL r7, long j) {
        super(2, r6);
        this.A04 = cdlProviderImpl;
        this.A02 = j;
        this.A06 = str;
        this.A03 = kkz;
        this.A05 = str2;
        this.A07 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        CdlProviderImpl cdlProviderImpl = this.A04;
        long j = this.A02;
        ? cdlProviderImpl$generateAvatar$2$1$1$1 = new CdlProviderImpl$generateAvatar$2$1$1$1(this.A03, cdlProviderImpl, this.A06, this.A05, r11, this.A07, j);
        cdlProviderImpl$generateAvatar$2$1$1$1.A01 = obj;
        return cdlProviderImpl$generateAvatar$2$1$1$1;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object A022;
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            if (19E.A07((C262224Cq) this.A01)) {
                CdlProviderImpl cdlProviderImpl = this.A04;
                long j = this.A02;
                String str = this.A06;
                C62699Kkz kkz = this.A03;
                String str2 = this.A05;
                0sL r9 = this.A07;
                this.A00 = 1;
                A022 = CdlProviderImpl.A00(kkz, cdlProviderImpl, str, str2, this, r9, j);
            } else {
                CdlProviderImpl cdlProviderImpl2 = this.A04;
                String str3 = this.A06;
                0sL r0 = this.A07;
                this.A00 = 2;
                A022 = CdlProviderImpl.A02(cdlProviderImpl2, str3, this, r0);
            }
            if (A022 == r3) {
                return r3;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CdlProviderImpl$generateAvatar$2$1$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
