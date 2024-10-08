package com.instagram.search.surface.repository;

import X.05G;
import X.0eS;
import X.0qQ;
import X.0sP;
import X.1Hj;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C14441TwP;
import X.C15051ULh;
import X.C17733Vd2;
import X.C18611Vv4;
import X.C20705Wxc;
import X.C239793Ih;
import X.C239803Ii;
import X.C297815sO;
import X.C51968G9o;
import X.C54072Gyv;
import X.C55853Hoa;
import X.C58798Ixj;
import X.C60340gF;
import X.C70826OMy;
import X.C71108Ocm;
import X.C74159Pq0;
import X.C74160Pq1;
import X.C74161Pq2;
import X.JTP;
import X.N3M;
import X.N4N;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.api.SerpApi;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.search.surface.repository.SerpRepository$fetchFeedPage$2", f = "SerpRepository.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
public final class SerpRepository$fetchFeedPage$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C17733Vd2 A02;
    public final /* synthetic */ C18611Vv4 A03;
    public final /* synthetic */ C71108Ocm A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerpRepository$fetchFeedPage$2(UserSession userSession, C17733Vd2 vd2, C18611Vv4 vv4, C71108Ocm ocm, AnonymousClass4D7 r6, boolean z) {
        super(1, r6);
        this.A04 = ocm;
        this.A02 = vd2;
        this.A03 = vv4;
        this.A01 = userSession;
        this.A05 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.search.surface.repository.SerpRepository$fetchFeedPage$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        C71108Ocm ocm = this.A04;
        return new SerpRepository$fetchFeedPage$2(this.A01, this.A02, this.A03, ocm, r8, this.A05);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SerpRepository$fetchFeedPage$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.search.surface.repository.SerpRepository$fetchFeedPage$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i;
        Integer num;
        Integer num2;
        String str;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            C71108Ocm ocm = this.A04;
            C17733Vd2 vd2 = this.A02;
            C71108Ocm.A03(ocm, vd2.A0D, vd2.A0C, C74159Pq0.A00);
            C18611Vv4 vv4 = this.A03;
            C14441TwP twP = (C14441TwP) C51968G9o.A10(vv4.A00, vd2.A04);
            if (twP != null) {
                twP.A01("SERP_PAGE_REQUEST_START", (String) null);
            }
            SerpApi serpApi = ocm.A03;
            this.A00 = 1;
            obj2 = serpApi.A00(vd2, this);
            if (obj2 == obj3) {
                return obj3;
            }
        }
        C239803Ii r1 = (C239803Ii) obj2;
        C71108Ocm ocm2 = this.A04;
        C17733Vd2 vd22 = this.A02;
        String str2 = vd22.A0D;
        String str3 = vd22.A0C;
        Object A002 = C71108Ocm.A00(ocm2, str2, str3);
        C18611Vv4 vv42 = this.A03;
        UserSession userSession = this.A01;
        boolean z = this.A05;
        try {
            if (r1 instanceof C297815sO) {
                C14441TwP twP2 = (C14441TwP) C51968G9o.A10(vv42.A00, vd22.A04);
                if (twP2 != null) {
                    twP2.A01("SERP_PAGE_REQUEST_COMPLETE", "query_fail");
                }
                C71108Ocm.A03(ocm2, str2, str3, new C20705Wxc(A002, 12));
            } else if (r1 instanceof C239793Ih) {
                C54072Gyv gyv = (C54072Gyv) ((C239793Ih) r1).A00;
                int i2 = vd22.A04;
                0qQ.A0B(gyv, 0);
                ConcurrentMap concurrentMap = vv42.A00;
                Integer valueOf = Integer.valueOf(i2);
                C14441TwP twP3 = (C14441TwP) concurrentMap.get(valueOf);
                if (twP3 != null) {
                    twP3.A01("SERP_PAGE_REQUEST_COMPLETE", "query_success");
                }
                int size = gyv.A09.size();
                C55853Hoa hoa = gyv.A02;
                boolean z2 = false;
                if (hoa != null) {
                    i = hoa.A05.size();
                } else {
                    i = 0;
                }
                C14441TwP twP4 = (C14441TwP) concurrentMap.get(valueOf);
                if (twP4 != null) {
                    twP4.A00("rank_token", gyv.BjE());
                    Integer valueOf2 = Integer.valueOf(size + i);
                    ConcurrentMap concurrentMap2 = twP4.A03;
                    concurrentMap2.put("fetched_results_count", valueOf2);
                    JTP.A1R("contains_entities", concurrentMap2, AnonymousClass7TF.A1R(size));
                    if (i > 0) {
                        z2 = true;
                    }
                    JTP.A1R("contains_media", concurrentMap2, z2);
                    C70826OMy oMy = gyv.A00;
                    if (oMy == null || oMy.A01() != (num2 = AnonymousClass05K.A01)) {
                        num2 = AnonymousClass05K.A00;
                    } else {
                        List list = oMy.A08;
                        if (list != null && !list.isEmpty()) {
                            num2 = AnonymousClass05K.A0C;
                        }
                    }
                    switch (num2.intValue()) {
                        case 0:
                            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            break;
                        case 1:
                            str = "AUDIO_WITHOUT_MEDIA";
                            break;
                        default:
                            str = "AUDIO_WITH_MEDIA";
                            break;
                    }
                    twP4.A00("hcm_type", str);
                }
                int i3 = 0;
                Object obj4 = A002;
                C71108Ocm.A03(ocm2, str2, str3, new C58798Ixj(5, obj4, ocm2, vd22, userSession, gyv, AnonymousClass7TF.A1P(z ? 1 : 0)));
                C15051ULh uLh = ((N4N) C71108Ocm.A00(ocm2, str2, str3)).A05;
                if (uLh != null) {
                    C20705Wxc wxc = new C20705Wxc(uLh, 13);
                    05G A012 = C71108Ocm.A01(ocm2, str2, str3);
                    A012.Epw(wxc.invoke(A012.getValue()));
                }
                N3M n3m = gyv.A01;
                if (n3m != null && AnonymousClass7TF.A1Y(n3m.A00, true) && (((num = n3m.A01) == null || num.intValue() != 2) && (num == null || num.intValue() != 3))) {
                    C71108Ocm.A03(ocm2, str2, str3, C74160Pq1.A00);
                }
                C55853Hoa hoa2 = gyv.A02;
                if (hoa2 != null) {
                    i3 = hoa2.A05.size();
                }
                if (i3 == 0) {
                    vv42.A02(i2);
                }
            } else {
                throw AnonymousClass7TE.A1K();
            }
            return C60340gF.A00;
        } catch (Throwable th) {
            C14441TwP twP5 = (C14441TwP) C51968G9o.A10(vv42.A00, vd22.A04);
            if (twP5 != null) {
                twP5.A01("SERP_PAGE_REQUEST_COMPLETE", "query_fail");
            }
            C71108Ocm.A03(ocm2, str2, str3, C74161Pq2.A00);
            throw th;
        }
    }
}
