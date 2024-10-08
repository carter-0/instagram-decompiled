package com.instagram.ar.core.discovery.minigallery.services;

import X.0Df;
import X.0JN;
import X.0qQ;
import X.0rr;
import X.10q;
import X.2IS;
import X.2IV;
import X.A3T;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass0K0;
import X.AnonymousClass4D7;
import X.AnonymousClass849;
import X.AnonymousClass9KG;
import X.AnonymousClass9KL;
import X.AnonymousClass9bU;
import X.C239113Fa;
import X.C239123Fb;
import X.C278474ww;
import X.C297815sO;
import X.C338727iQ;
import X.C343637qX;
import X.C349197zk;
import X.C376879Jr;
import X.C376949Jy;
import X.C376959Jz;
import X.C384779hs;
import X.C41499Aux;
import X.C61860pz;
import X.C62170rn;
import X.C62180ro;
import X.C66105MBo;
import X.Dbg;
import X.JVD;
import X.L3J;
import X.MGZ;
import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

public final class MiniGalleryService {
    public String A00 = "";
    public final MiniGalleryCategoriesService A01;
    public final EffectCollectionService A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r10, X.C359218cI r11, java.lang.String r12, java.util.ArrayList r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r9 = r12
            r2 = r13
            r5 = 39
            r6 = r15
            boolean r0 = X.C66144MDw.A02(r5, r15)
            if (r0 == 0) goto L_0x00d3
            r4 = r6
            X.MDw r4 = (X.C66144MDw) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d3
            int r3 = r3 - r1
            r4.A00 = r3
        L_0x0019:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r15 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r15) goto L_0x00ed
            java.lang.Object r2 = r4.A01
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            X.0eS.A00(r1)
        L_0x002b:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00da
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r3 = r1.A00
            X.9Tj r3 = (X.C379319Tj) r3
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A00
            if (r0 == 0) goto L_0x0073
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            java.util.List r0 = r3.A04
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
        L_0x0048:
            java.util.ArrayList r0 = X.00k.A0S(r2, r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto L_0x005a
            r4.add(r1)
            goto L_0x005a
        L_0x0073:
            java.util.List r0 = r3.A04
            goto L_0x0048
        L_0x0076:
            X.0eS.A00(r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.addAll(r14)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r13.iterator()
        L_0x008a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r5 = r8.next()
            r1 = r5
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            java.lang.String r0 = r1.A0K
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r1.A0K
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x008a
            r6.add(r5)
            goto L_0x008a
        L_0x00ab:
            com.instagram.ar.core.effectcollection.EffectCollectionService r1 = r10.A02
            if (r9 != 0) goto L_0x00b7
            java.lang.Object r9 = X.018.A13(r12)
            if (r9 == 0) goto L_0x00f5
            java.lang.String r9 = (java.lang.String) r9
        L_0x00b7:
            r10 = 0
            X.0qQ.A0B(r9, r15)
            r0 = 3
            r8 = r11
            X.0qQ.A0B(r11, r0)
            r13 = 2
            X.9Rs r7 = new X.9Rs
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            r4.A01 = r2
            r4.A00 = r15
            java.lang.Object r1 = r1.A09(r7, r4)
            if (r1 != r3) goto L_0x002b
            return r3
        L_0x00d3:
            X.MDw r4 = new X.MDw
            r4.<init>(r10, r15, r5)
            goto L_0x0019
        L_0x00da:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ea
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e4:
            r2.clear()
            r2.addAll(r4)
        L_0x00ea:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ed:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.8cI, java.lang.String, java.util.ArrayList, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C359218cI r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r11 = this;
            r3 = 5
            boolean r0 = X.ME4.A03(r3, r14)
            if (r0 == 0) goto L_0x0049
            r8 = r14
            X.ME4 r8 = (X.ME4) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r8.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r1) goto L_0x005d
            X.0eS.A00(r3)
        L_0x0023:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0051
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002e:
            X.0eS.A00(r3)
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = r11.A02
            r6 = 0
            r5 = r13
            X.0qQ.A0B(r13, r1)
            r0 = 2
            r4 = r12
            X.0qQ.A0B(r12, r0)
            r8.A00 = r1
            r9 = 2
            r7 = r6
            java.lang.Object r3 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x0049:
            r0 = 42
            X.ME4 r8 = new X.ME4
            r8.<init>(r11, r14, r3, r0)
            goto L_0x0015
        L_0x0051:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0057
            r2 = 0
            return r2
        L_0x0057:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x005d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A04(X.8cI, java.lang.String, X.4D7):java.lang.Object");
    }

    public final C62180ro A05(AnonymousClass849 r12, boolean z, boolean z2) {
        long j;
        AnonymousClass849 r7 = r12;
        0qQ.A0B(r12, 0);
        if (z) {
            j = 0;
        } else {
            j = 3;
        }
        MiniGalleryCategoriesService miniGalleryCategoriesService = this.A01;
        C338727iQ r4 = new C338727iQ(r12);
        return new C62180ro(new C376949Jy(r4, (AnonymousClass4D7) null, 1), new C61860pz(new C376959Jz((Object) r4, (AnonymousClass4D7) null, 8, 42), 10q.A02(new AnonymousClass9KL(miniGalleryCategoriesService, r12, (AnonymousClass4D7) null, 0), 10q.A02(new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(miniGalleryCategoriesService, r12, (AnonymousClass4D7) null, z2), new C62170rn(new C376879Jr(r4, (AnonymousClass4D7) null, 6), new AnonymousClass05E(new AnonymousClass9KG(miniGalleryCategoriesService, r7, (AnonymousClass4D7) null, j)))))));
    }

    public static final C41499Aux A00(MiniGalleryService miniGalleryService, AnonymousClass849 r12, String str, String str2, String str3) {
        Integer num;
        String str4;
        0rr r15;
        UserSession userSession = miniGalleryService.A03;
        switch (r12.ordinal()) {
            case 0:
                num = AnonymousClass05K.A00;
                break;
            case 1:
                num = AnonymousClass05K.A0u;
                break;
            case 2:
                num = AnonymousClass05K.A0C;
                break;
            case 3:
                num = AnonymousClass05K.A0N;
                break;
            case 4:
                num = AnonymousClass05K.A0Y;
                break;
            case 5:
                num = AnonymousClass05K.A0j;
                break;
            case 6:
                num = AnonymousClass05K.A15;
                break;
            default:
                throw new RuntimeException();
        }
        0qQ.A0B(num, 1);
        String str5 = str;
        0qQ.A0B(str, 2);
        String str6 = str2;
        0qQ.A0B(str2, 3);
        String str7 = str3;
        if (!(!0JN.A01().A0A())) {
            r15 = new 0rr(new C297815sO(C384779hs.A00));
        } else {
            L3J l3j = new L3J(userSession);
            A3T a3t = new A3T(num);
            2IV A012 = C278474ww.A01(userSession);
            AnonymousClass0K0 r1 = GraphQlCallInput.A02;
            String A002 = Dbg.A00();
            0Df A022 = r1.A02();
            0Df.A00(A022, str5, A002);
            2IS r7 = new 2IS();
            r7.A04("query", str6);
            switch (a3t.A00.intValue()) {
                case 0:
                    str4 = "INSTAGRAM__STORIES__PRECAPTURE__SEARCH_V2";
                    break;
                case 1:
                    str4 = "INSTAGRAM__STORIES__POSTCAPTURE__SEARCH";
                    break;
                case 2:
                    str4 = "INSTAGRAM__LIVE__PRECAPTURE__SEARCH_V2";
                    break;
                case 3:
                    str4 = "INSTAGRAM__REELS__PRECAPTURE__SEARCH_V2";
                    break;
                case 4:
                    str4 = "INSTAGRAM__REELS__POSTCAPTURE__SEARCH_V2";
                    break;
                case 5:
                    str4 = "INSTAGRAM__DIRECT__RTC__SEARCH_V2";
                    break;
                case 6:
                    str4 = "INSTAGRAM__DIRECT__PRECAPTURE__SEARCH_V2";
                    break;
                default:
                    str4 = "INSTAGRAM__DIRECT__POSTCAPTURE__SEARCH_V2";
                    break;
            }
            r7.A04("surface", str4);
            r7.A00(A012, "device_capabilities");
            r7.A03("preview_width", 240);
            r7.A03("preview_height", 240);
            r7.A00.A02().A0E(A022, "context");
            r7.A04("cursor", str3);
            ImmutableList of = ImmutableList.of("TAR_BROTLI", "ZIP");
            0qQ.A07(of);
            r7.A05("supported_compression_types", of);
            r7.A03("page_size", 24);
            r7.A01("formatted_media_count_enabled");
            C239113Fa r0 = new C239113Fa(r7, AnonymousClass9bU.class, "CommonAREffectSearchQuery", false);
            C239123Fb r2 = new C239123Fb(userSession);
            r2.A08(r0);
            r2.A03 = AnonymousClass05K.A00;
            r2.A05 = null;
            r2.A04 = -1L;
            r15 = new C61860pz(new MGZ((Object) l3j, (AnonymousClass4D7) null, 6, 42), new C66105MBo(new C62170rn(new JVD(l3j, (AnonymousClass4D7) null, 13), C349197zk.A00(new MGZ(a3t, (AnonymousClass4D7) null, 5), new C343637qX(new C376879Jr(9, (AnonymousClass4D7) null), r2.A06().A04(744, 3))))));
        }
        return new C41499Aux(miniGalleryService, r12, str6, str7, r15);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C63871LAa r12, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r13, X.C346197ul r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 8
            boolean r0 = X.C376709Ja.A00(r3, r15)
            r6 = r13
            if (r0 == 0) goto L_0x002d
            r11 = r15
            X.9Ja r11 = (X.C376709Ja) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r11.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r11.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r2) goto L_0x0093
            if (r0 == r5) goto L_0x0093
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            X.9Ja r11 = new X.9Ja
            r11.<init>(r13, r15, r3)
            goto L_0x0017
        L_0x0033:
            X.0eS.A00(r1)
            java.lang.Object r1 = r14.A00
            X.9Ih r1 = (X.C376519Ih) r1
            java.lang.Object r0 = r1.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.List r10 = r12.A05
            if (r10 == 0) goto L_0x0073
            java.lang.Object r0 = r1.A01
            X.8cI r0 = (X.C359218cI) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r12.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r8 = r12.A03
            X.849 r0 = r12.A00
            X.84A r1 = r0.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "EFFECT_BY_ID"
            X.8cI r7 = new X.8cI
            r7.<init>(r1, r0)
            r11.A01 = r14
            r11.A02 = r9
            r11.A00 = r2
            java.lang.Object r0 = A02(r6, r7, r8, r9, r10, r11)
        L_0x0070:
            if (r0 != r4) goto L_0x009e
            return r4
        L_0x0073:
            java.lang.String r3 = r12.A03
            if (r3 == 0) goto L_0x009e
            X.849 r1 = r12.A00
            X.8cI r0 = X.C359218cI.A0M
            X.84A r2 = r1.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "EFFECT_BY_ID"
            X.8cI r0 = new X.8cI
            r0.<init>(r2, r1)
            r11.A01 = r14
            r11.A02 = r9
            r11.A00 = r5
            java.lang.Object r0 = A03(r13, r0, r3, r9, r11)
            goto L_0x0070
        L_0x0093:
            java.lang.Object r9 = r11.A02
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r14 = r11.A01
            X.7ul r14 = (X.C346197ul) r14
            X.0eS.A00(r1)
        L_0x009e:
            boolean r2 = r14.A02
            java.lang.String r1 = r14.A01
            X.L5q r0 = new X.L5q
            r0.<init>(r1, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A01(X.LAa, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.7ul, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r11, X.C359218cI r12, java.lang.String r13, java.util.ArrayList r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 38
            r4 = r15
            boolean r0 = X.C66144MDw.A02(r3, r15)
            if (r0 == 0) goto L_0x0084
            r10 = r4
            X.MDw r10 = (X.C66144MDw) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r10.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x008a
            java.lang.Object r14 = r10.A01
            java.util.AbstractList r14 = (java.util.AbstractList) r14
            X.0eS.A00(r1)
        L_0x002a:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003a
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            r14.add(r2, r0)
        L_0x0037:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x003a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0044:
            X.0eS.A00(r1)
            boolean r0 = r14 instanceof java.util.Collection
            r7 = r13
            if (r0 == 0) goto L_0x006b
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x006b
        L_0x0052:
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r11.A02
            r8 = 0
            X.0qQ.A0B(r13, r4)
            r0 = 2
            r6 = r12
            X.0qQ.A0B(r12, r0)
            r10.A01 = r14
            r10.A00 = r4
            r11 = 2
            r9 = r8
            java.lang.Object r1 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r3) goto L_0x002a
            return r3
        L_0x006b:
            java.util.Iterator r1 = r14.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x006f
            goto L_0x0037
        L_0x0084:
            X.MDw r10 = new X.MDw
            r10.<init>(r11, r15, r3)
            goto L_0x0017
        L_0x008a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.8cI, java.lang.String, java.util.ArrayList, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryService(Context context, EffectCollectionService effectCollectionService, UserSession userSession) {
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        MiniGalleryCategoriesService miniGalleryCategoriesService = new MiniGalleryCategoriesService(applicationContext, userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(effectCollectionService, 3);
        this.A03 = userSession;
        this.A02 = effectCollectionService;
        this.A01 = miniGalleryCategoriesService;
    }
}
