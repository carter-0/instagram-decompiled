package X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UcX  reason: case insensitive filesystem */
public final class C15421UcX extends C15623Ufp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15421UcX(WGU wgu, C18761Vzw vzw, PromoteAudienceInfo promoteAudienceInfo) {
        this.A00 = 1;
        this.A02 = vzw;
        this.A01 = promoteAudienceInfo;
        this.A02 = "";
        this.A01 = C51968G9o.A0u();
        this.A00 = wgu;
    }

    public final void onFail(C268654dm r8) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1485735114);
                ((C18784W1k) this.A01).A02.A0L((C16678UzE) this.A02, "business_integrity_fetch", r8.A01());
                super.onFail(r8);
                i2 = 897885168;
                break;
            case 1:
                i = AnonymousClass0fD.A03(758224553);
                0qQ.A0B(r8, 0);
                C18761Vzw vzw = (C18761Vzw) this.A02;
                WGU.A00(vzw.A08.A0y).A0L(vzw.A05, "potential_people_reach_fetch", r8.A01());
                C18761Vzw.A00(vzw, 0, 0, false);
                C18761Vzw.A01(vzw, AudiencePotentialReachRating.A06);
                super.onFail(r8);
                i2 = -211449916;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-2061479898);
                0qQ.A0B(r8, 0);
                C17939ViU viU = (C17939ViU) this.A02;
                viU.A03.A0Y(C16678UzE.AUDIENCE_SELECTION.toString(), "delete_audience", r8.A01());
                ((View) this.A01).setEnabled(true);
                C59689JTv.A01(viU.A02, "boost_audience_delete_failure", 2131970183, 0);
                super.onFail(r8);
                i2 = -1214695969;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r8, 1422050776);
                UZW uzw = (UZW) this.A02;
                WGU wgu = uzw.A04;
                if (wgu != null) {
                    wgu.A0L(C16678UzE.INTERESTS_SELECTION, "interest_search_fetch", r8.A01());
                }
                List emptyList = Collections.emptyList();
                0qQ.A07(emptyList);
                UZW.A02(uzw, emptyList);
                super.onFail(r8);
                i2 = -1466203772;
                break;
            case 4:
                i = AnonymousClass7TG.A0D(r8, -2003177858);
                UZV uzv = (UZV) this.A02;
                C13990Tnq.A0M(uzv.A0D).A0L(C16678UzE.INTERESTS_SELECTION, "interest_search_fetch", r8.A01());
                List emptyList2 = Collections.emptyList();
                0qQ.A07(emptyList2);
                UZV.A02(uzv, emptyList2);
                super.onFail(r8);
                i2 = 218278905;
                break;
            case 5:
                i = AnonymousClass7TG.A0D(r8, -494957776);
                C13990Tnq.A0M(((C15284UZo) this.A02).A0D).A0L(C16678UzE.LOCATIONS_SELECTION, "regional_search_fetch", r8.A01());
                super.onFail(r8);
                i2 = 611508436;
                break;
            case 6:
                i = AnonymousClass7TG.A0D(r8, -1256518486);
                C13990Tnq.A0M(((UZ7) this.A02).A09).A0L(C16678UzE.LOCATIONS_SELECTION, "regional_search_fetch", r8.A01());
                super.onFail(r8);
                i2 = -275626144;
                break;
            default:
                i = AnonymousClass7TG.A0D(r8, -1447908370);
                WGU wgu2 = ((UZN) this.A02).A02;
                if (wgu2 != null) {
                    wgu2.A0L(C16678UzE.LOCATIONS_SELECTION, "local_search_fetch", r8.A01());
                    super.onFail(r8);
                    i2 = -1055637819;
                    break;
                } else {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1322569685);
                super.onStart();
                i2 = 1177441897;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1015489831);
                super.onStart();
                C18761Vzw vzw = (C18761Vzw) this.A02;
                C18761Vzw.A01(vzw, (AudiencePotentialReachRating) null);
                vzw.A03.setVisibility(8);
                vzw.A02.setVisibility(8);
                vzw.A01.setVisibility(0);
                i2 = -1977368993;
                break;
            default:
                C15421UcX.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.UXU, X.1XT] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, X.1XT, com.instagram.business.promote.model.PromoteAudiencePotentialReach] */
    /* JADX WARNING: type inference failed for: r8v4, types: [X.UX8, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.UX8, java.lang.Object, X.1XT] */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.lang.Object, X.1XT, X.UX9] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Object, X.1XT, X.UX9] */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.lang.Object, X.1XT, X.UX9] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(579143982);
                ? r8 = (UXU) obj;
                int A03 = AnonymousClass0fD.A03(-884674309);
                C18784W1k w1k = (C18784W1k) this.A01;
                w1k.A02.A0D((C16678UzE) this.A02, "business_integrity_fetch");
                if (!r8.A01) {
                    w1k.A03.A0u.A00 = r8.A00;
                }
                A03(r8);
                AnonymousClass0fD.A0A(-377000915, A03);
                i2 = 1132388616;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1016510474);
                ? r82 = (PromoteAudiencePotentialReach) obj;
                int A0D = AnonymousClass7TG.A0D(r82, -269934788);
                C18761Vzw vzw = (C18761Vzw) this.A02;
                WGU.A00(vzw.A08.A0y).A0D(vzw.A05, "potential_people_reach_fetch");
                PromoteAudiencePotentialReachStore promoteAudiencePotentialReachStore = vzw.A07;
                Object obj2 = this.A01;
                if (r82.A03 != AudiencePotentialReachRating.A06) {
                    promoteAudiencePotentialReachStore.A00.put(obj2, r82);
                }
                C18761Vzw.A00(vzw, r82.A01, r82.A02, W3x.A0R(r82));
                C18761Vzw.A01(vzw, r82.A03);
                A03(r82);
                AnonymousClass0fD.A0A(2082821401, A0D);
                i2 = -1668847063;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1893356326);
                1XP r83 = (1XP) obj;
                int A032 = AnonymousClass0fD.A03(-1583131557);
                0qQ.A0B(r83, 0);
                C17939ViU viU = (C17939ViU) this.A02;
                viU.A03.A0R(C16678UzE.AUDIENCE_SELECTION.toString(), "delete_audience");
                viU.A06.A0C(false);
                A03(r83);
                AnonymousClass0fD.A0A(-2032611082, A032);
                i2 = 423277567;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-2017293213);
                ? r84 = (UX8) obj;
                int A0D2 = AnonymousClass7TG.A0D(r84, 311829381);
                UZW uzw = (UZW) this.A02;
                WGU wgu = uzw.A04;
                if (wgu != null) {
                    wgu.A0D(C16678UzE.INTERESTS_SELECTION, "interest_search_fetch");
                }
                C17956Vin vin = uzw.A0G;
                String obj3 = this.A01.toString();
                ImmutableList A012 = C15623Ufp.A01(r84.A00);
                0qQ.A07(A012);
                vin.A01(obj3, A012);
                ImmutableList A013 = C15623Ufp.A01(r84.A00);
                0qQ.A07(A013);
                UZW.A02(uzw, A013);
                A03(r84);
                AnonymousClass0fD.A0A(-2001088573, A0D2);
                i2 = -1311229037;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1853875975);
                ? r85 = (UX8) obj;
                int A0D3 = AnonymousClass7TG.A0D(r85, -896953720);
                UZV uzv = (UZV) this.A02;
                C13990Tnq.A0M(uzv.A0D).A0D(C16678UzE.INTERESTS_SELECTION, "interest_search_fetch");
                C17956Vin vin2 = uzv.A0C;
                String obj4 = this.A01.toString();
                ImmutableList A014 = C15623Ufp.A01(r85.A00);
                0qQ.A07(A014);
                vin2.A01(obj4, A014);
                ImmutableList A015 = C15623Ufp.A01(r85.A00);
                0qQ.A07(A015);
                UZV.A02(uzv, A015);
                A03(r85);
                AnonymousClass0fD.A0A(-29439803, A0D3);
                i2 = -1255132596;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-315048260);
                ? r86 = (UX9) obj;
                int A0D4 = AnonymousClass7TG.A0D(r86, -1643293809);
                C15284UZo uZo = (C15284UZo) this.A02;
                C13990Tnq.A0M(uZo.A0D).A0D(C16678UzE.LOCATIONS_SELECTION, "regional_search_fetch");
                List list = r86.A00;
                if (list == null) {
                    list = new ArrayList();
                }
                uZo.A0B.A01(this.A01.toString(), new ArrayList(list));
                list.removeAll(((PromoteData) AnonymousClass7TE.A14(uZo.A0E)).A0o.A05);
                C15284UZo.A01(uZo, list);
                A03(r86);
                AnonymousClass0fD.A0A(-28054191, A0D4);
                i2 = -534702036;
                break;
            case 6:
                i = AnonymousClass0fD.A03(637557268);
                ? r87 = (UX9) obj;
                int A0D5 = AnonymousClass7TG.A0D(r87, 2124496716);
                UZ7 uz7 = (UZ7) this.A02;
                C13990Tnq.A0M(uz7.A09).A0D(C16678UzE.LOCATIONS_SELECTION, "regional_search_fetch");
                List list2 = r87.A00;
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                uz7.A07.A01(this.A01.toString(), new ArrayList(list2));
                list2.removeAll(((U92) uz7.A0B.getValue()).A0A().A05);
                UZ7.A00(uz7, list2);
                A03(r87);
                AnonymousClass0fD.A0A(-31220911, A0D5);
                i2 = -1629197287;
                break;
            default:
                i = AnonymousClass0fD.A03(1151977587);
                ? r88 = (UX9) obj;
                int A033 = AnonymousClass0fD.A03(-2020002468);
                0qQ.A0B(r88, 0);
                UZN uzn = (UZN) this.A02;
                WGU wgu2 = uzn.A02;
                if (wgu2 != null) {
                    wgu2.A0D(C16678UzE.LOCATIONS_SELECTION, "local_search_fetch");
                    List list3 = r88.A00;
                    if (list3 == null) {
                        list3 = new ArrayList();
                    }
                    uzn.A08.A01(this.A01.toString(), list3);
                    C14794U9o u9o = uzn.A04;
                    if (u9o != null) {
                        0qQ.A0B(list3, 0);
                        u9o.A00 = list3;
                        u9o.notifyDataSetChanged();
                        A03(r88);
                        AnonymousClass0fD.A0A(1188901038, A033);
                        i2 = 82635802;
                        break;
                    } else {
                        str = "addressTypeaheadAdapter";
                    }
                } else {
                    str = "logger";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15421UcX(WGU wgu, Object obj, Object obj2, String str, int i) {
        super(wgu, str);
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
