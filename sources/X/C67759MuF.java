package X;

import android.app.Activity;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MuF  reason: case insensitive filesystem */
public class C67759MuF extends 2YL {
    public C262204Co A00;
    public final Resources A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final UserSession A04;
    public final LP4 A05;
    public final DirectCardGalleryRepository A06;
    public final AnonymousClass9HC A07;
    public final AnonymousClass7L2 A08;
    public final DirectThreadKey A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new C73656PhV(this, 10));
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(new C73656PhV(this, 11));
    public final AnonymousClass0eM A0G;
    public final DirectThreadAnalyticsParams A0H;
    public final AnonymousClass72Q A0I;
    public final List A0J;
    public final List A0K;

    public C67759MuF(Resources resources, UserSession userSession, LP4 lp4, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass9HC r41, AnonymousClass7L2 r42, AnonymousClass72Q r43, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, List list2) {
        DirectThreadAnalyticsParams directThreadAnalyticsParams;
        05F A032;
        ArrayList arrayList;
        String str5;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Long l;
        C254873tC r0;
        LP4 lp42;
        Resources resources2 = resources;
        0qQ.A0B(resources2, 1);
        UserSession userSession2 = userSession;
        DirectThreadKey directThreadKey2 = directThreadKey;
        AnonymousClass7TF.A1C(userSession2, 2, directThreadKey2);
        String str6 = str4;
        DirectCardGalleryRepository directCardGalleryRepository2 = directCardGalleryRepository;
        String str7 = str2;
        C51973G9u.A0s(5, str7, str6, directCardGalleryRepository2);
        AnonymousClass72Q r7 = r43;
        0qQ.A0B(r7, 10);
        AnonymousClass9HC r9 = r41;
        AnonymousClass7L2 r8 = r42;
        DbW.A1P(r9, 11, r8);
        this.A01 = resources2;
        this.A04 = userSession2;
        this.A09 = directThreadKey2;
        this.A0C = str;
        this.A0A = str7;
        String str8 = str3;
        this.A0B = str8;
        this.A0D = str6;
        this.A06 = directCardGalleryRepository2;
        List list3 = list;
        this.A0K = list3;
        this.A0I = r7;
        this.A07 = r9;
        this.A08 = r8;
        List list4 = list2;
        this.A0J = list4;
        this.A05 = lp4;
        0t0 A012 = AnonymousClass0eN.A01(new C73656PhV(this, 14));
        this.A0G = A012;
        AnonymousClass2Ep r4 = (AnonymousClass2Ep) A012.getValue();
        if (r4 != null) {
            directThreadAnalyticsParams = C3263376i.A01(r4, false);
        } else {
            directThreadAnalyticsParams = null;
        }
        this.A0H = directThreadAnalyticsParams;
        A08();
        if (lp4 != null) {
            C66583MXo.A1O(this, C318116oQ.A00(this), 33);
        }
        C73521Pe6 pe6 = new C73521Pe6(new AnonymousClass0r6[]{directCardGalleryRepository2.A0U}, 2);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r82 = AnonymousClass10A.A01;
        05F A022 = 10b.A02(new N2P((String) null), A002, pe6, r82);
        19B r72 = 19B.A00;
        this.A02 = C226292g8.A00(r72, A022);
        AnonymousClass0Ud r35 = directCardGalleryRepository2.A0M;
        AnonymousClass0Ud r34 = directCardGalleryRepository2.A0I;
        AnonymousClass0Ud r33 = directCardGalleryRepository2.A0G;
        AnonymousClass0Ud r32 = directCardGalleryRepository2.A0P;
        AnonymousClass0Ud r20 = directCardGalleryRepository2.A0V;
        AnonymousClass0Ud r19 = directCardGalleryRepository2.A0R;
        AnonymousClass0Ud r18 = directCardGalleryRepository2.A0Q;
        AnonymousClass0Ud r17 = directCardGalleryRepository2.A0K;
        AnonymousClass0Ud r16 = directCardGalleryRepository2.A0T;
        AnonymousClass0Ud r6 = directCardGalleryRepository2.A0L;
        if (str3 == null || (lp42 = this.A05) == null) {
            A032 = 10b.A03(JTO.A1J());
        } else {
            A032 = lp42.A01(str8);
        }
        C73522Pe8 pe8 = new C73522Pe8(2, this, new AnonymousClass0r6[]{r35, r34, r33, r32, r20, r19, r18, r17, r16, r6, A032, directCardGalleryRepository2.A0H, directCardGalleryRepository2.A0S, directCardGalleryRepository2.A0W, directCardGalleryRepository2.A0N, directCardGalleryRepository2.A0O});
        C318136oS A003 = C318116oQ.A00(this);
        C254703su A052 = A05();
        List list5 = 0sn.A00;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list3);
            int i = 0;
            for (Object next : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                ImageUrl imageUrl = (ImageUrl) next;
                if (list2 != null) {
                    str5 = C51966G9m.A1G(list4, i);
                } else {
                    str5 = null;
                }
                if (A052 != null) {
                    ImmutableList A0H2 = A052.A0H();
                    if (A0H2 == null || (r0 = (C254873tC) 00k.A0O(A0H2, i)) == null) {
                        l = null;
                    } else {
                        l = Long.valueOf(r0.A0K);
                    }
                    C3263676m r02 = new C3263676m(userSession2, A052, String.valueOf(l));
                    if (r02.A05()) {
                        privacyMediaOverlayViewModel = r02.A04(resources2, false);
                        arrayList.add(new C68192N5h(imageUrl, privacyMediaOverlayViewModel, str5));
                        i = i2;
                    }
                }
                privacyMediaOverlayViewModel = null;
                arrayList.add(new C68192N5h(imageUrl, privacyMediaOverlayViewModel, str5));
                i = i2;
            }
        } else {
            arrayList = null;
        }
        this.A03 = C226292g8.A00(r72, 10b.A02(new N3R((GMQ) null, (C68193N5i) null, (C69285Nil) null, (User) null, (Boolean) null, (Boolean) null, false, (Boolean) null, (String) null, (String) null, AnonymousClass7TE.A1C(), list5, list5, list5, arrayList, 0, false, false), A003, pe8, r82));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A07() {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.NVE
            if (r0 == 0) goto L_0x0032
            r5 = r7
            X.NVE r5 = (X.NVE) r5
            monitor-enter(r6)
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r5.A06     // Catch:{ all -> 0x0063 }
            X.0Ud r0 = r0.A0T     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0066
            X.4Co r0 = r5.A00     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.CQL()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0066
        L_0x001f:
            X.6oS r3 = X.C318116oQ.A00(r5)     // Catch:{ all -> 0x0063 }
            r2 = 0
            r1 = 20
            X.MFW r0 = new X.MFW     // Catch:{ all -> 0x0063 }
            r0.<init>(r5, r4, r2, r1)     // Catch:{ all -> 0x0063 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0063 }
            r5.A00 = r0     // Catch:{ all -> 0x0063 }
            goto L_0x0066
        L_0x0032:
            boolean r0 = r7 instanceof X.NVG
            if (r0 == 0) goto L_0x0067
            r5 = r7
            X.NVG r5 = (X.NVG) r5
            monitor-enter(r6)
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r5.A06     // Catch:{ all -> 0x0063 }
            X.0Ud r0 = r0.A0T     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0066
            X.4Co r0 = r5.A00     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.CQL()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0066
        L_0x0050:
            X.6oS r3 = X.C318116oQ.A00(r5)     // Catch:{ all -> 0x0063 }
            r2 = 0
            r1 = 19
            X.MFW r0 = new X.MFW     // Catch:{ all -> 0x0063 }
            r0.<init>(r5, r4, r2, r1)     // Catch:{ all -> 0x0063 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0063 }
            r5.A00 = r0     // Catch:{ all -> 0x0063 }
            goto L_0x0066
        L_0x0063:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0066:
            monitor-exit(r6)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67759MuF.A07():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A08() {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.NVE
            if (r0 == 0) goto L_0x0023
            monitor-enter(r6)
            X.4Co r0 = r7.A00     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.CQL()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
        L_0x0010:
            X.6oS r3 = X.C318116oQ.A00(r7)     // Catch:{ all -> 0x0096 }
            r2 = 0
            r1 = 39
            X.MFR r0 = new X.MFR     // Catch:{ all -> 0x0096 }
            r0.<init>(r7, r2, r1)     // Catch:{ all -> 0x0096 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0096 }
            r7.A00 = r0     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0023:
            boolean r0 = r7 instanceof X.NVG
            if (r0 == 0) goto L_0x0045
            monitor-enter(r6)
            X.4Co r0 = r7.A00     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.CQL()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
        L_0x0032:
            X.6oS r3 = X.C318116oQ.A00(r7)     // Catch:{ all -> 0x0096 }
            r2 = 0
            r1 = 37
            X.MFR r0 = new X.MFR     // Catch:{ all -> 0x0096 }
            r0.<init>(r7, r2, r1)     // Catch:{ all -> 0x0096 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0096 }
            r7.A00 = r0     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0045:
            boolean r0 = r7 instanceof X.NVF
            if (r0 == 0) goto L_0x0077
            r5 = r7
            X.NVF r5 = (X.NVF) r5
            monitor-enter(r6)
            X.4Co r1 = r5.A00     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0057
            boolean r0 = r1.CQL()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
        L_0x0057:
            java.lang.String r4 = r5.A0B     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0094
            if (r1 == 0) goto L_0x0064
            X.05G r1 = r5.A02     // Catch:{ all -> 0x0096 }
            X.NVL r0 = X.NVL.A00     // Catch:{ all -> 0x0096 }
            r1.Epw(r0)     // Catch:{ all -> 0x0096 }
        L_0x0064:
            X.6oS r3 = X.C318116oQ.A00(r5)     // Catch:{ all -> 0x0096 }
            r2 = 0
            r1 = 18
            X.MFW r0 = new X.MFW     // Catch:{ all -> 0x0096 }
            r0.<init>(r5, r4, r2, r1)     // Catch:{ all -> 0x0096 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0096 }
            r5.A00 = r0     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0077:
            monitor-enter(r6)
            X.4Co r0 = r7.A00     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.CQL()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
        L_0x0082:
            X.6oS r3 = X.C318116oQ.A00(r7)     // Catch:{ all -> 0x0096 }
            r2 = 0
            r1 = 34
            X.MFR r0 = new X.MFR     // Catch:{ all -> 0x0096 }
            r0.<init>(r7, r2, r1)     // Catch:{ all -> 0x0096 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r3)     // Catch:{ all -> 0x0096 }
            r7.A00 = r0     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r6)
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67759MuF.A08():void");
    }

    public final synchronized void A09() {
        C262204Co r0 = this.A00;
        if (r0 == null || r0.CQL()) {
            this.A00 = C51966G9m.A1L(new MFR(this, (AnonymousClass4D7) null, 35), C318116oQ.A00(this));
        }
    }

    public final void A0A(Activity activity, AnonymousClass0iw r19, C14068TpH tpH, C16677UzD uzD, String str, String str2) {
        C242243Te r0;
        C242243Te r02;
        String str3;
        String str4;
        int i;
        String str5;
        C14068TpH tpH2 = tpH;
        0qQ.A0B(tpH2, 5);
        String str6 = str;
        if (str != null) {
            String str7 = str2;
            if (str2 != null) {
                String str8 = this.A09.A00;
                if (str8 != null) {
                    UserSession userSession = this.A04;
                    String str9 = this.A0D;
                    C71128OdR.A03(activity, r19, userSession, AnonymousClass79B.A01(str9), tpH2, uzD, str6, this.A0C, str7, str8);
                    String str10 = userSession.A06;
                    AnonymousClass0eM r4 = this.A0G;
                    int A072 = C66584MXp.A07(r4);
                    AnonymousClass2Ep r03 = (AnonymousClass2Ep) r4.getValue();
                    if (r03 != null) {
                        r0 = C66580MXl.A0b(r03);
                    } else {
                        r0 = null;
                    }
                    boolean A062 = C329997La.A06(r0, str10, A072);
                    int A073 = C66584MXp.A07(r4);
                    AnonymousClass2Ep r04 = (AnonymousClass2Ep) r4.getValue();
                    if (r04 != null) {
                        r02 = C66580MXl.A0b(r04);
                    } else {
                        r02 = null;
                    }
                    boolean A052 = C329997La.A05(r02, str10, A073);
                    if (AnonymousClass79B.A01(str9) == DirectPromptTypes.CHALLENGES) {
                        C72202OyR A0T = C66580MXl.A0T(this.A0E);
                        2Eq r05 = (2Eq) r4.getValue();
                        if (r05 != null) {
                            str3 = r05.C6C();
                        } else {
                            str3 = null;
                        }
                        2Eq r06 = (2Eq) r4.getValue();
                        if (r06 != null) {
                            str4 = r06.C6k();
                        } else {
                            str4 = null;
                        }
                        2Er r07 = (2Er) r4.getValue();
                        if (r07 != null) {
                            i = r07.AdN();
                        } else {
                            i = 0;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        if (A062) {
                            str5 = "MODERATOR";
                        } else if (A052) {
                            str5 = "COLLABORATOR";
                        } else {
                            str5 = "VIEWER";
                        }
                        C72202OyR.A03((C69493Nmb) null, A0T, valueOf, str3, str4, "challenge_submission_reported", "tap", "report_button", "challenge_view_submission_detail_sheet", DbY.A0p("submission_id", str6, AnonymousClass7TE.A1L("user_type", str5)));
                    }
                }
            }
        }
    }

    public final void A0B(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        String str3 = this.A09.A00;
        if (str3 != null) {
            AnonymousClass7TE.A1Z(new MFe((Object) this, str3, str2, (AnonymousClass4D7) null, 13), C318116oQ.A00(this));
        }
    }

    public final void A0C(String str, boolean z, boolean z2) {
        String str2;
        String str3 = str;
        if (!z2 || (str2 = this.A0B) == null) {
            AnonymousClass7TE.A1Z(new MEW(this, str3, (AnonymousClass4D7) null, 5, z), C318116oQ.A00(this));
            return;
        }
        LP4 lp4 = this.A05;
        if (lp4 != null) {
            lp4.A03(str2, str);
        }
    }

    public static N3R A00(C67759MuF muF) {
        return (N3R) muF.A03.A02();
    }

    public static AnonymousClass2Ep A01(C67759MuF muF) {
        return (AnonymousClass2Ep) muF.A0G.getValue();
    }

    public static void A02(AnonymousClass2Ep r1, Object obj, int i) {
        A03(r1, new C74184PqQ(obj, i));
    }

    public static final void A03(AnonymousClass2Ep r1, 0sP r2) {
        if (r1 != null) {
            r2.invoke(r1);
        } else {
            0wj.A00("DirectCardGalleryViewModel-thread is null", 20134884, false);
        }
    }

    public final C254703su A05() {
        return 2L2.A00(this.A04).BRz(this.A09, this.A0C);
    }

    public final void A06() {
        if (this instanceof NVE) {
            A02(A01(this), this, 19);
            return;
        }
        boolean z = this instanceof NVG;
        AnonymousClass2Ep A012 = A01(this);
        if (z) {
            A02(A012, this, 18);
        } else {
            A02(A012, this, 13);
        }
    }

    public final boolean A0D() {
        N3R A002;
        if (!(this instanceof NVG) || (A002 = A00(this)) == null) {
            return false;
        }
        return DbX.A1a(A002.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E() {
        /*
            r2 = this;
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r2.A06
            X.0Ud r0 = r0.A0T
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0013
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67759MuF.A0E():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0238, code lost:
        if (r1.A01() != true) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e2, code lost:
        if (r39 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0151, code lost:
        if (X.00k.A0u(r14, r5) != true) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0192, code lost:
        if (r1.A1c() != false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ab, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36324312244563941L) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c1, code lost:
        if (r1.A01() != true) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0222, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36324312244563941L) == false) goto L_0x0224;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.N3R A04(X.GMQ r59, X.C69285Nil r60, com.instagram.user.model.User r61, java.lang.Boolean r62, java.lang.Boolean r63, java.lang.Boolean r64, java.lang.Boolean r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.util.ArrayList r70, java.util.List r71, int r72, boolean r73) {
        /*
            r58 = this;
            r13 = 0
            r7 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r57 = r62
            r0 = r57
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0038
            X.0sn r20 = X.0sn.A00
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            r9 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            X.N3R r8 = new X.N3R
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r21 = r20
            r22 = r20
            r23 = r20
            r24 = r13
            r25 = r13
            r26 = r13
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r8
        L_0x0038:
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r18 = r71.iterator()
        L_0x0048:
            boolean r1 = r18.hasNext()
            r14 = r70
            r0 = r58
            r23 = r59
            r29 = r64
            r31 = r66
            r10 = r69
            if (r1 == 0) goto L_0x026e
            java.lang.Object r1 = r18.next()
            X.N3F r1 = (X.N3F) r1
            com.instagram.model.direct.DirectThreadKey r2 = r0.A09
            java.lang.String r8 = r2.A00
            com.instagram.common.session.UserSession r2 = r0.A04
            android.content.res.Resources r4 = r0.A01
            com.google.common.collect.ImmutableList r45 = X.OQ3.A00(r1)
            java.lang.String r5 = r1.A05
            java.lang.String r3 = r0.A0D
            r24 = r3
            java.lang.String r15 = r2.A06
            r43 = 0
            X.7L2 r3 = r0.A08
            X.7Kx r9 = r3.A04
            com.instagram.user.model.User r3 = r1.A02
            r25 = r3
            java.lang.String r3 = X.DbX.A0r(r25)
            boolean r56 = X.0qQ.A0K(r3, r15)
            X.9HC r6 = r0.A07
            java.lang.String r3 = r0.A0C
            X.2FW r49 = X.2FW.A1g
            X.0eM r12 = r0.A0G
            java.lang.Object r11 = r12.getValue()
            X.2Eq r11 = (X.2Eq) r11
            if (r11 == 0) goto L_0x0099
            r11.C6a()
        L_0x0099:
            java.lang.Integer r11 = r1.A04
            r17 = r11
            if (r11 == 0) goto L_0x0265
            java.lang.Long r50 = X.C51969G9p.A0r(r17)
        L_0x00a3:
            r44 = r4
            r46 = r2
            r47 = r6
            r48 = r9
            r51 = r5
            r52 = r24
            r53 = r8
            r54 = r15
            r55 = r3
            X.Nbe r36 = X.OQ3.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.N37 r6 = r1.A00
            if (r6 == 0) goto L_0x0261
            java.util.List r9 = r6.A08
            if (r9 == 0) goto L_0x0261
            boolean r9 = X.AnonymousClass7TE.A1b(r9)
            if (r9 != r7) goto L_0x0261
            X.1iA r11 = X.1iA.A0a
        L_0x00c9:
            X.1iA r9 = X.1iA.A0Q
            if (r11 != r9) goto L_0x025b
            X.3su r9 = r0.A05()
            if (r9 == 0) goto L_0x025b
            X.76m r11 = new X.76m
            r11.<init>(r2, r9, r5)
            boolean r16 = r11.A05()
            if (r16 == 0) goto L_0x0257
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r39 = r11.A04(r4, r13)
            if (r39 != 0) goto L_0x025d
        L_0x00e4:
            X.5yA r4 = new X.5yA
            r4.<init>(r2)
            java.lang.Object r11 = r12.getValue()
            X.2Eq r11 = (X.2Eq) r11
            if (r11 == 0) goto L_0x0254
            int r11 = r11.C6a()
        L_0x00f5:
            if (r8 == 0) goto L_0x025d
            if (r3 == 0) goto L_0x025d
            if (r5 == 0) goto L_0x025d
            boolean r11 = X.AnonymousClass48O.A05(r11)
            if (r11 == 0) goto L_0x025d
            java.lang.Integer r11 = r9.A0d(r5)
            r12 = -1
            if (r11 == 0) goto L_0x025d
            int r11 = r11.intValue()
            if (r11 != r12) goto L_0x025d
            X.3t0 r45 = X.C66580MXl.A0g(r8)
            boolean r51 = r9.A1S()
            r46 = 0
            com.instagram.common.session.UserSession r4 = r4.A01
            java.lang.String r4 = r4.A06
            boolean r4 = X.AnonymousClass7F3.A01(r9, r4)
            r50 = 1
            if (r4 == 0) goto L_0x0126
            r50 = 0
        L_0x0126:
            X.JuG r38 = new X.JuG
            r44 = r38
            r47 = r3
            r48 = r5
            r49 = r46
            r52 = r13
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52)
        L_0x0135:
            r35 = 0
            java.lang.String r9 = r0.A0A
            java.lang.Integer r3 = r1.A03
            if (r69 == 0) goto L_0x0145
            boolean r4 = r10.equals(r5)
            if (r4 != 0) goto L_0x0145
            r43 = 1
        L_0x0145:
            boolean r44 = X.C51972G9s.A1Z(r29)
            if (r70 == 0) goto L_0x0153
            boolean r4 = X.00k.A0u(r14, r5)
            r45 = 1
            if (r4 == r7) goto L_0x0155
        L_0x0153:
            r45 = 0
        L_0x0155:
            X.3su r4 = r0.A05()
            if (r4 == 0) goto L_0x0251
            boolean r4 = r4.A1c()
            if (r4 != 0) goto L_0x0251
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r4 = r0.A0H
        L_0x0163:
            X.NVH r8 = new X.NVH
            r32 = r8
            r33 = r23
            r34 = r1
            r37 = r4
            r40 = r3
            r41 = r9
            r42 = r15
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            if (r6 == 0) goto L_0x01f7
            X.3su r3 = r0.A05()
            if (r3 == 0) goto L_0x01f4
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.Integer r27 = r3.A0d(r1)
        L_0x0186:
            X.3su r1 = r0.A05()
            if (r1 == 0) goto L_0x0194
            boolean r1 = r1.A1c()
            r32 = 1
            if (r1 == 0) goto L_0x0196
        L_0x0194:
            r32 = 0
        L_0x0196:
            com.instagram.direct.prompts.DirectPromptTypes r3 = X.AnonymousClass79B.A01(r24)
            com.instagram.direct.prompts.DirectPromptTypes r1 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r3 != r1) goto L_0x01ad
            X.0Tu r1 = X.0Tu.A05
            r3 = 36324312244563941(0x810cc5000c2fe5, double:3.0349795575029424E-306)
            boolean r1 = X.182.A06(r1, r2, r3)
            r33 = 1
            if (r1 != 0) goto L_0x01af
        L_0x01ad:
            r33 = 0
        L_0x01af:
            java.lang.String r2 = r0.A0B
            X.N3R r1 = A00(r0)
            if (r1 == 0) goto L_0x01c3
            X.GMQ r1 = r1.A01
            if (r1 == 0) goto L_0x01c3
            boolean r1 = r1.A01()
            r34 = 1
            if (r1 == r7) goto L_0x01c5
        L_0x01c3:
            r34 = 0
        L_0x01c5:
            boolean r35 = r0.A0D()
            r24 = r6
            r26 = r17
            r28 = r5
            r29 = r9
            r30 = r2
            X.Oa5 r2 = X.C71127OdQ.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.72Q r1 = r0.A0I
            X.1Xj r0 = r2.A02()
            if (r0 == 0) goto L_0x0269
            com.instagram.common.gallery.Medium r1 = r1.A00(r0)
            r0 = r21
            r0.add(r1)
        L_0x01e8:
            r0 = r19
            r0.add(r2)
        L_0x01ed:
            r0 = r20
            r0.add(r8)
            goto L_0x0048
        L_0x01f4:
            r27 = 0
            goto L_0x0186
        L_0x01f7:
            X.5yB r1 = r1.A01
            if (r1 == 0) goto L_0x01ed
            X.3Q2 r3 = X.C66582MXn.A0g(r2, r1)
            if (r3 == 0) goto L_0x01ed
            java.lang.String r1 = r3.A33
            if (r1 == 0) goto L_0x01ed
            com.instagram.common.typedurl.SimpleImageUrl r22 = X.JTQ.A0G(r1)
            int r9 = r3.A0H
            int r6 = r3.A0G
            com.instagram.direct.prompts.DirectPromptTypes r3 = X.AnonymousClass79B.A01(r24)
            com.instagram.direct.prompts.DirectPromptTypes r1 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r3 != r1) goto L_0x0224
            X.0Tu r1 = X.0Tu.A05
            r3 = 36324312244563941(0x810cc5000c2fe5, double:3.0349795575029424E-306)
            boolean r1 = X.182.A06(r1, r2, r3)
            r29 = 1
            if (r1 != 0) goto L_0x0226
        L_0x0224:
            r29 = 0
        L_0x0226:
            java.lang.String r2 = r0.A0B
            X.N3R r1 = A00(r0)
            if (r1 == 0) goto L_0x023a
            X.GMQ r1 = r1.A01
            if (r1 == 0) goto L_0x023a
            boolean r1 = r1.A01()
            r30 = 1
            if (r1 == r7) goto L_0x023c
        L_0x023a:
            r30 = 0
        L_0x023c:
            boolean r31 = r0.A0D()
            r23 = r25
            r24 = r17
            r25 = r5
            r26 = r2
            r27 = r9
            r28 = r6
            X.Oa5 r2 = X.C71127OdQ.A03(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x01e8
        L_0x0251:
            r4 = 0
            goto L_0x0163
        L_0x0254:
            r11 = 0
            goto L_0x00f5
        L_0x0257:
            r39 = 0
            goto L_0x00e4
        L_0x025b:
            r39 = 0
        L_0x025d:
            r38 = 0
            goto L_0x0135
        L_0x0261:
            X.1iA r11 = X.1iA.A0Q
            goto L_0x00c9
        L_0x0265:
            r50 = 0
            goto L_0x00a3
        L_0x0269:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x026e:
            java.util.List r1 = r0.A0K
            if (r1 == 0) goto L_0x02de
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r9 = r1.iterator()
            r2 = 0
        L_0x027b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x02df
            java.lang.Object r5 = r9.next()
            int r8 = r2 + 1
            if (r2 >= 0) goto L_0x0291
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0291:
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            java.util.List r1 = r0.A0J
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r4 = X.00k.A0O(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
        L_0x029d:
            X.3su r7 = r0.A05()
            if (r7 == 0) goto L_0x02da
            com.instagram.common.session.UserSession r6 = r0.A04
            com.google.common.collect.ImmutableList r1 = r7.A0H()
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = X.00k.A0O(r1, r2)
            X.3tC r1 = (X.C254873tC) r1
            if (r1 == 0) goto L_0x02d8
            long r1 = r1.A0K
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x02b9:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.76m r2 = new X.76m
            r2.<init>(r6, r7, r1)
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x02da
            android.content.res.Resources r1 = r0.A01
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r2.A04(r1, r13)
        L_0x02ce:
            X.N5h r1 = new X.N5h
            r1.<init>(r5, r2, r4)
            r3.add(r1)
            r2 = r8
            goto L_0x027b
        L_0x02d8:
            r1 = 0
            goto L_0x02b9
        L_0x02da:
            r2 = 0
            goto L_0x02ce
        L_0x02dc:
            r4 = 0
            goto L_0x029d
        L_0x02de:
            r3 = 0
        L_0x02df:
            boolean r40 = X.AnonymousClass7TF.A1V(r10)
            r24 = 0
            X.N3R r8 = new X.N3R
            r39 = r73
            r25 = r60
            r38 = r72
            r26 = r61
            r28 = r63
            r30 = r65
            r32 = r67
            r22 = r8
            r33 = r14
            r34 = r21
            r35 = r20
            r36 = r19
            r37 = r3
            r27 = r57
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67759MuF.A04(X.GMQ, X.Nil, com.instagram.user.model.User, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.List, int, boolean):X.N3R");
    }
}
