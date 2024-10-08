package com.instagram.direct.search.repository;

import X.0eS;
import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C69068Ne7;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.search.repository.CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1", f = "CombinedProvidersSearchRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C69068Ne7 A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1(C69068Ne7 ne7, String str, AnonymousClass4D7 r4) {
        super(5, r4);
        this.A04 = ne7;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 = new CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1(this.A04, this.A05, (AnonymousClass4D7) obj5);
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A00 = obj;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A01 = obj2;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A02 = obj3;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A03 = obj4;
        return combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        List list = (List) this.A03;
        return C69068Ne7.A00(this.A04, this.A05, (List) this.A00, (List) this.A01, list, (Map) this.A02);
    }
}
