package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fkv  reason: case insensitive filesystem */
public abstract class C50916Fkv implements C337267fz {
    public final /* synthetic */ C46430Der A00;

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0233, code lost:
        if (r2 == X.C46443Df5.GROUP_FOLLOWING) goto L_0x0235;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1OC AMx(java.lang.String r29, java.lang.String r30) {
        /*
            r28 = this;
            r7 = 0
            r3 = r29
            X.0qQ.A0B(r3, r7)
            r2 = r28
            X.Der r1 = r2.A00
            X.Dew r0 = r1.A0J
            if (r0 != 0) goto L_0x0018
            java.lang.String r15 = "paginationHelper"
        L_0x0010:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            r0.A01 = r7
            r18 = r3
            boolean r0 = X.C46430Der.A0S(r1)
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A0b
            if (r0 != 0) goto L_0x0028
            java.lang.String r18 = ""
        L_0x0028:
            com.instagram.user.recommended.FollowListData r0 = r1.A0D
            if (r0 != 0) goto L_0x002f
            java.lang.String r15 = "followListData"
            goto L_0x0010
        L_0x002f:
            java.lang.String r4 = r0.A01
            boolean r0 = X.C46430Der.A0S(r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r1.A0O
            if (r0 == 0) goto L_0x003c
            r4 = r0
        L_0x003c:
            X.F05 r1 = r1.A0F
            if (r1 != 0) goto L_0x004c
            java.lang.String r15 = "followListFragmentQueryManager"
            goto L_0x0010
        L_0x0043:
            boolean r0 = r1.A0b
            if (r0 != 0) goto L_0x003c
            X.EVw r0 = r1.A0H
            java.lang.String r4 = r0.A00
            goto L_0x003c
        L_0x004c:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x007b
            X.7g1 r0 = r1.A03
        L_0x0052:
            X.9P5 r0 = r0.BiX(r3)
            java.lang.String r1 = r0.A03
            r8 = r2
            boolean r0 = r2 instanceof X.EUR
            if (r0 == 0) goto L_0x01ee
            X.EUR r8 = (X.EUR) r8
            r6 = 0
            java.lang.String r15 = "followListData"
            if (r1 == 0) goto L_0x00ef
            X.Der r2 = r8.A00
            X.F28 r10 = r2.A0G
            if (r10 == 0) goto L_0x01ea
            com.instagram.user.recommended.FollowListData r0 = r2.A0D
            if (r0 == 0) goto L_0x0010
            X.Df5 r0 = r0.A00
            java.lang.String r13 = r0.toString()
            X.Dex r0 = r2.A0E
            if (r0 != 0) goto L_0x007e
            java.lang.String r15 = "followListAdapter"
            goto L_0x0010
        L_0x007b:
            X.7g1 r0 = r1.A04
            goto L_0x0052
        L_0x007e:
            java.util.List r0 = r0.A0C
            int r11 = r0.size()
            X.EVw r12 = r2.A0H
            com.instagram.common.session.UserSession r3 = X.C46430Der.A03(r2)
            com.instagram.user.recommended.FollowListData r0 = r2.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A02
            boolean r9 = X.2R8.A05(r3, r0)
            int r5 = r2.A01
            int r0 = r5 + 1
            r2.A01 = r0
            X.AnonymousClass7TF.A1B(r13, r7, r12)
            int r14 = r10.A00
            if (r14 == 0) goto L_0x00b6
            java.lang.String r2 = "A new event started before the previous one ended. This should not happen."
            X.02m r3 = r10.A01
            r0 = 537(0x219, float:7.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r14, r0, r2)
            int r2 = r10.A00
            r0 = 4
            r3.markerEnd(r2, r0)
            r10.A00 = r7
        L_0x00b6:
            r0 = 224341858(0xd5f2f62, float:6.8774215E-31)
            r10.A00 = r0
            X.02m r3 = r10.A01
            r3.markerStart(r0)
            int r2 = r10.A00
            java.lang.String r0 = "follow_page_type"
            r3.markerAnnotate(r2, r0, r13)
            int r2 = r10.A00
            java.lang.String r0 = "current_list_size"
            r3.markerAnnotate(r2, r0, r11)
            int r11 = r10.A00
            java.lang.String r2 = r12.name()
            r0 = 1830(0x726, float:2.564E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r11, r0, r2)
            int r2 = r10.A00
            r0 = 2945(0xb81, float:4.127E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.markerAnnotate(r2, r0, r9)
            int r2 = r10.A00
            java.lang.String r0 = "page_count"
            r3.markerAnnotate(r2, r0, r5)
        L_0x00ef:
            X.Der r5 = r8.A00
            com.instagram.user.recommended.FollowListData r0 = r5.A0D
            if (r0 == 0) goto L_0x0010
            X.Df5 r3 = r0.A00
            int r2 = r3.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x016d
            r0 = 2
            if (r2 == r0) goto L_0x016d
            if (r2 == r7) goto L_0x0112
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Type not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0112:
            X.F2y r7 = X.C49302Esl.A00
            com.instagram.common.session.UserSession r8 = X.C46430Der.A03(r5)
            com.instagram.user.recommended.FollowListData r0 = r5.A0D
            r10 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.A02
            X.0eM r0 = r5.A0s
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            java.lang.Integer r9 = r0.B70()
            com.instagram.user.model.User r0 = r5.A0C
            if (r0 == 0) goto L_0x0137
            X.4Cl r0 = r0.A03
            java.lang.Integer r10 = r0.B6v()
        L_0x0137:
            com.instagram.user.recommended.FollowListData r0 = r5.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A03
            r11 = r18
            r12 = r1
            r13 = r2
            r14 = r0
            com.facebook.pando.PandoGraphQLRequest r8 = r7.A00(r8, r9, r10, r11, r12, r13, r14)
            X.F28 r7 = r5.A0G
            if (r7 == 0) goto L_0x01ea
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r5)
            long r2 = X.C322606w6.A00(r0)
            int r1 = r7.A00
            if (r1 == 0) goto L_0x0164
            X.02m r4 = r7.A01
            java.lang.String r0 = "request_created"
            r4.markerPoint(r1, r0)
            int r1 = r7.A00
            java.lang.String r0 = "cache_age_ms"
            r4.markerAnnotate(r1, r0, r2)
        L_0x0164:
            X.1vn r0 = r5.A06
            if (r0 == 0) goto L_0x01e6
            X.4dM r3 = r0.A03(r8)
            goto L_0x01d2
        L_0x016d:
            X.F2y r6 = X.C49302Esl.A00
            com.instagram.common.session.UserSession r7 = X.C46430Der.A03(r5)
            com.instagram.user.recommended.FollowListData r0 = r5.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.A02
            X.0eM r0 = r5.A0s
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            java.lang.Integer r8 = r0.B70()
            com.instagram.user.model.User r0 = r5.A0C
            if (r0 == 0) goto L_0x01e4
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B70()
            if (r0 == 0) goto L_0x01e4
            int r0 = r0.intValue()
        L_0x0197:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.instagram.user.recommended.FollowListData r0 = r5.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A03
            r10 = r18
            r11 = r4
            r12 = r1
            r13 = r2
            r14 = r0
            com.facebook.pando.PandoGraphQLRequest r7 = r6.A01(r7, r8, r9, r10, r11, r12, r13, r14)
            X.F28 r6 = r5.A0G
            if (r6 == 0) goto L_0x01ea
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r5)
            long r2 = X.C322606w6.A00(r0)
            int r1 = r6.A00
            if (r1 == 0) goto L_0x01c9
            X.02m r4 = r6.A01
            java.lang.String r0 = "request_created"
            r4.markerPoint(r1, r0)
            int r1 = r6.A00
            java.lang.String r0 = "cache_age_ms"
            r4.markerAnnotate(r1, r0, r2)
        L_0x01c9:
            X.1vn r0 = r5.A06
            if (r0 == 0) goto L_0x01e6
            X.4dM r3 = r0.A03(r7)
            r6 = 1
        L_0x01d2:
            X.FZ2 r2 = new X.FZ2
            r2.<init>(r5, r6)
            r1 = 1592315407(0x5ee8ce0f, float:8.3876811E18)
            r0 = 3
            X.3Fj r0 = r3.A01(r2, r1, r0)
            X.1OC r0 = X.AnonymousClass9D0.A00(r0)
            return r0
        L_0x01e4:
            r0 = -1
            goto L_0x0197
        L_0x01e6:
            java.lang.String r15 = "graphQLQueryExecutor"
            goto L_0x0010
        L_0x01ea:
            java.lang.String r15 = "tailLoadPerfLogger"
            goto L_0x0010
        L_0x01ee:
            X.EUS r8 = (X.EUS) r8
            X.Der r3 = r8.A00
            com.instagram.common.session.UserSession r16 = X.C46430Der.A03(r3)
            com.instagram.user.recommended.FollowListData r8 = r3.A0D
            java.lang.String r15 = "followListData"
            if (r8 == 0) goto L_0x0010
            X.Df5 r6 = r8.A00
            int r2 = r6.ordinal()
            r0 = 149(0x95, float:2.09E-43)
            java.lang.String r5 = X.C273654mx.A00(r0)
            java.lang.String r0 = "mutual_followers"
            r26 = 1
            switch(r2) {
                case 5: goto L_0x024a;
                case 6: goto L_0x0253;
                case 7: goto L_0x0253;
                case 8: goto L_0x0253;
                case 9: goto L_0x028d;
                default: goto L_0x020f;
            }
        L_0x020f:
            boolean r2 = r3.A0U
            if (r2 != 0) goto L_0x0215
            java.lang.String r0 = r6.A00
        L_0x0215:
            java.lang.String r2 = r8.A02
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r17 = X.0mp.A06(r5, r0)
        L_0x021f:
            com.instagram.user.recommended.FollowListData r0 = r3.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r6 = r0.A03
            boolean r5 = r3.A0S
            boolean r3 = r0.A04
            X.Df5 r2 = r0.A00
            X.Df5 r0 = X.C46443Df5.FOLLOWING
            if (r2 == r0) goto L_0x0235
            X.Df5 r0 = X.C46443Df5.GROUP_FOLLOWING
            r25 = 0
            if (r2 != r0) goto L_0x0237
        L_0x0235:
            r25 = 1
        L_0x0237:
            java.lang.String r19 = "follow_list_page"
            r20 = r1
            r21 = r6
            r22 = r4
            r23 = r5
            r24 = r3
            r27 = r7
            X.1OC r0 = X.FGQ.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L_0x024a:
            java.lang.String r0 = r8.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/unfollow_chaining/%s/"
            goto L_0x0295
        L_0x0253:
            java.lang.String r0 = r3.A0M
            if (r0 != 0) goto L_0x025a
            java.lang.String r17 = "friendships/smart_groups/"
            goto L_0x021f
        L_0x025a:
            com.instagram.common.session.UserSession r2 = X.C46430Der.A03(r3)
            com.instagram.user.recommended.FollowListData r0 = r3.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A02
            boolean r0 = X.2R8.A05(r2, r0)
            if (r0 == 0) goto L_0x027e
            java.lang.String r2 = r3.A0N
            java.lang.String r0 = r3.A0M
            if (r2 != 0) goto L_0x0277
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/smart_groups/%s/"
            goto L_0x0295
        L_0x0277:
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "friendships/smart_groups/%s/%s/"
            goto L_0x0295
        L_0x027e:
            com.instagram.user.recommended.FollowListData r0 = r3.A0D
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.A02
            java.lang.String r0 = r3.A0M
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "friendships/%s/smart_groups/%s/"
            goto L_0x0295
        L_0x028d:
            java.lang.String r0 = r8.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "friendships/unfollow_chaining_misinformation/%s/"
        L_0x0295:
            java.lang.String r17 = X.0mp.A06(r0, r2)
            goto L_0x021f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50916Fkv.AMx(java.lang.String, java.lang.String):X.1OC");
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r7, String str) {
        String str2;
        AnonymousClass1XT r1;
        String errorMessage;
        0qQ.A0B(r7, 1);
        C46430Der der = this.A00;
        F28 f28 = der.A0G;
        if (f28 == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = f28.A00;
            if (i != 0) {
                f28.A01.markerPoint(i, "request_failed");
                f28.A00(3);
            }
            C46434Dew dew = der.A0J;
            str2 = "paginationHelper";
            if (dew != null) {
                dew.A01 = true;
                der.A0e = false;
                if (AnonymousClass7TF.A1V(dew.A00)) {
                    C46435Dex dex = der.A0E;
                    if (dex == null) {
                        str2 = "followListAdapter";
                    } else {
                        0fE.A00(dex, 2041272882);
                    }
                }
                String A0j = DbZ.A0j(der);
                if (r7 instanceof C268674do) {
                    Object obj = ((C268674do) r7).A00;
                    if (!(!(obj instanceof AnonymousClass1XT) || (r1 = (AnonymousClass1XT) obj) == null || (errorMessage = r1.getErrorMessage()) == null || errorMessage.length() == 0)) {
                        A0j = errorMessage;
                    }
                }
                FragmentActivity activity = der.getActivity();
                if (activity == null || activity.isFinishing()) {
                    0wb.A03(AnonymousClass000.A00(873), AnonymousClass000.A00(1059));
                } else {
                    C59689JTv.A03(der.getActivity(), A0j, "UserList onRequestFail", 1);
                }
                C47291DuK duK = der.A0I;
                if (duK == null) {
                    str2 = "perfLogger";
                } else {
                    duK.A00.A07(A0j);
                    C2366634p A02 = C46430Der.A02(der);
                    if (A02 != null) {
                        A02.A07(A0j);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
        0qQ.A0B(str, 0);
        C46430Der der = this.A00;
        F28 f28 = der.A0G;
        if (f28 == null) {
            0qQ.A0F("tailLoadPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = f28.A00;
        if (i != 0) {
            f28.A01.markerPoint(i, "request_finished");
        }
        C46430Der.A0H(der, str);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public C50916Fkv(C46430Der der) {
        this.A00 = der;
    }

    public final AnonymousClass4D6 Bpf() {
        return this.A00;
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeH(String str) {
        String str2;
        AnonymousClass3AD r1;
        C46430Der der = this.A00;
        F28 f28 = der.A0G;
        if (f28 == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = f28.A00;
            if (i != 0) {
                f28.A01.markerPoint(i, "request_dropped");
                f28.A00(216);
            }
            if (C46430Der.A0S(der) && (r1 = der.A0A) != null) {
                r1.setIsLoading(false);
            }
            C47291DuK duK = der.A0I;
            if (duK == null) {
                str2 = "perfLogger";
            } else {
                duK.A00.A03();
                C2366634p A02 = C46430Der.A02(der);
                if (A02 != null) {
                    A02.A03();
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dem(String str) {
        String str2;
        C46430Der der = this.A00;
        F28 f28 = der.A0G;
        if (f28 == null) {
            str2 = "tailLoadPerfLogger";
        } else {
            int i = f28.A00;
            if (i != 0) {
                f28.A01.markerPoint(i, "request_start");
            }
            C47291DuK duK = der.A0I;
            if (duK == null) {
                str2 = "perfLogger";
            } else {
                duK.A00.A04();
                C2366634p A02 = C46430Der.A02(der);
                if (A02 != null) {
                    A02.A04();
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
