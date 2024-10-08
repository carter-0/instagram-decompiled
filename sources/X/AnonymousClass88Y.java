package X;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.88Y  reason: invalid class name */
public final class AnonymousClass88Y implements AnonymousClass88Z {
    public AnonymousClass8BA A00;
    public CaptureRuleSystemState A01;
    public final Fragment A02;
    public final AnonymousClass89T A03;
    public final AnonymousClass89W A04;
    public final AnonymousClass0eM A05;
    public final UserSession A06;
    public final List A07 = 0sr.A1M(new C3512388c[]{C3512188a.A0Y, C3512188a.A0Z, C3512188a.A0i, C3512188a.A0M, C3512188a.A0f, C3512188a.A0J, C3512188a.A06, C3512188a.A0P, C3512188a.A0B, C3512188a.A0p, C3512188a.A0V, C3512188a.A0H, C3512188a.A0l, C3512188a.A0L, C3512188a.A09, C3512188a.A0I});
    public final Map A08;

    public AnonymousClass88Y(Fragment fragment, AnonymousClass0iw r62, UserSession userSession) {
        AnonymousClass89T r3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        Fragment fragment2 = fragment;
        0qQ.A0B(fragment2, 2);
        AnonymousClass0iw r2 = r62;
        0qQ.A0B(r2, 3);
        this.A06 = userSession2;
        this.A02 = fragment2;
        if (AnonymousClass89S.A00(userSession2).booleanValue()) {
            r3 = C347157wM.A00(userSession2);
        } else {
            r3 = null;
        }
        this.A03 = r3;
        this.A08 = new HashMap();
        this.A01 = new CaptureRuleSystemState((C318046oG) null, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, (Boolean) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A05 = AnonymousClass0eN.A01(new C377269Le(this, 49));
        this.A04 = new AnonymousClass89W(r2, userSession2);
    }

    private final void A01() {
        this.A01 = new CaptureRuleSystemState((C318046oG) null, AnonymousClass89U.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, (Boolean) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A03(this);
    }

    public final boolean Cb8(C3512388c r2) {
        0qQ.A0B(r2, 0);
        return r2.Cb9(this.A01);
    }

    public final void Dn6(Drawable drawable) {
        C389669q0 r1;
        PromptStickerModel promptStickerModel;
        C354798Nk r0;
        PromptStickerModel promptStickerModel2;
        C389669q0 r12;
        PromptStickerModel promptStickerModel3;
        C354798Nk r02;
        PromptStickerModel promptStickerModel4;
        PromptStickerModel promptStickerModel5;
        KWE kwe;
        PromptStickerModel promptStickerModel6;
        KWF kwf;
        PromptStickerModel promptStickerModel7;
        C347017w8 r03;
        boolean z = false;
        0qQ.A0B(drawable, 0);
        if (C271404in.A09(drawable) != null) {
            z = true;
        }
        if (z) {
            this.A01.A0T = true;
        } else if (C379169St.A00(drawable)) {
            this.A01.A0f = true;
        } else {
            boolean z2 = drawable instanceof C347017w8;
            if (z2) {
                C347017w8 r13 = (C347017w8) drawable;
                Drawable A042 = r13.A04();
                0qQ.A07(A042);
                if (A042 instanceof C369638v5) {
                    this.A01.A0H = true;
                } else if (r13.A04() instanceof C369568uy) {
                    this.A01.A0Z = true;
                } else if (r13.A04() instanceof C369788vK) {
                    A02(drawable, true);
                }
            }
            if ((drawable instanceof C389629pw) && !((C389629pw) drawable).A02) {
                this.A01.A0F = true;
            } else if (drawable instanceof C299335ux) {
                this.A01.A0j = true;
            } else if (!z2 || (r03 = (C347017w8) drawable) == null || !(r03.A04() instanceof C300635xX)) {
                Drawable drawable2 = drawable;
                if (z2) {
                    drawable2 = ((C347017w8) drawable2).A04();
                }
                if (drawable2 instanceof C389639px) {
                    this.A01.A0J = true;
                } else if (drawable instanceof C16150Upb) {
                    this.A01.A0c = true;
                } else if ((drawable instanceof KWF) && (kwf = (KWF) drawable) != null && (promptStickerModel7 = kwf.A04) != null && promptStickerModel7.A0B) {
                    this.A01.A0M = true;
                } else if (!(drawable instanceof KWE) || (kwe = (KWE) drawable) == null || (promptStickerModel6 = kwe.A03) == null || !promptStickerModel6.A0A) {
                    if (drawable instanceof C59812JZg) {
                        StoryPromptType storyPromptType = null;
                        C59812JZg jZg = (C59812JZg) drawable;
                        if (!(jZg == null || (promptStickerModel5 = jZg.A06) == null)) {
                            if (!promptStickerModel5.A0G()) {
                                storyPromptType = promptStickerModel5.A03();
                            }
                        }
                        if (storyPromptType != StoryPromptType.ELECTION) {
                            this.A01.A0b = true;
                        }
                    }
                    if (drawable instanceof C389539pn) {
                        this.A01.A09 = true;
                    } else {
                        boolean z3 = drawable instanceof C354798Nk;
                        if (!z3 || !((r02 = (C354798Nk) drawable) == null || (promptStickerModel4 = r02.A0B) == null || (!promptStickerModel4.A0G() && !promptStickerModel4.A0C))) {
                            if (z2) {
                                C347017w8 r14 = (C347017w8) drawable;
                                if (r14.A03 instanceof C387319m1) {
                                    this.A01.A02++;
                                } else if (r14.A04() instanceof U1S) {
                                    this.A01.A0E = true;
                                }
                            }
                            Drawable drawable3 = drawable;
                            if (z2) {
                                drawable3 = ((C347017w8) drawable3).A04();
                            }
                            if (drawable3 instanceof C389669q0) {
                                Drawable drawable4 = drawable;
                                if (z2) {
                                    drawable4 = ((C347017w8) drawable4).A04();
                                }
                                if (!(drawable4 instanceof C389669q0) || (r12 = (C389669q0) drawable4) == null || (promptStickerModel3 = r12.A04) == null || !promptStickerModel3.A0F()) {
                                    this.A01.A0R = true;
                                }
                            }
                            boolean z4 = true;
                            if (!z3 || (r0 = (C354798Nk) drawable) == null || (promptStickerModel2 = r0.A0B) == null || !promptStickerModel2.A0C) {
                                Drawable drawable5 = drawable;
                                if (z2) {
                                    drawable5 = ((C347017w8) drawable5).A04();
                                }
                                if ((drawable5 instanceof C389669q0) && (r1 = (C389669q0) drawable5) != null && (promptStickerModel = r1.A04) != null && promptStickerModel.A0F()) {
                                    this.A01.A07 = true;
                                } else if (AnonymousClass9Sv.A00(drawable)) {
                                    this.A01.A0G = true;
                                } else if ((drawable instanceof C389659pz) || (z2 && (((C347017w8) drawable).A04() instanceof C389649py))) {
                                    this.A01.A0W = true;
                                } else if (drawable instanceof C346987w5) {
                                    this.A01.A0e = true;
                                } else if (drawable instanceof C346997w6) {
                                    CaptureRuleSystemState captureRuleSystemState = this.A01;
                                    captureRuleSystemState.A0V = true;
                                    C346997w6 r7 = (C346997w6) drawable;
                                    if (r7 != null) {
                                        String str = r7.A01.A02;
                                        if (!(str == null || str.length() == 0)) {
                                            z4 = false;
                                        }
                                        captureRuleSystemState.A0U = z4;
                                    }
                                } else if (AnonymousClass9Sv.A02(drawable)) {
                                    this.A01.A01++;
                                }
                            } else {
                                this.A01.A0O = true;
                            }
                        } else {
                            this.A01.A0i = true;
                        }
                    }
                } else {
                    this.A01.A0N = true;
                }
            } else {
                this.A01.A0P = true;
            }
        }
        A03(this);
    }

    public final void DnD(Drawable drawable) {
        C354798Nk r0;
        PromptStickerModel promptStickerModel;
        PromptStickerModel promptStickerModel2;
        KWF kwf;
        PromptStickerModel promptStickerModel3;
        KWE kwe;
        PromptStickerModel promptStickerModel4;
        C347017w8 r02;
        0qQ.A0B(drawable, 0);
        if (C271404in.A09(drawable) != null) {
            CaptureRuleSystemState captureRuleSystemState = this.A01;
            captureRuleSystemState.A0T = false;
            captureRuleSystemState.A0p = false;
        } else if (C379169St.A00(drawable)) {
            this.A01.A0f = false;
        } else {
            boolean z = drawable instanceof C347017w8;
            if (z && (((C347017w8) drawable).A04() instanceof C369568uy)) {
                this.A01.A0Z = false;
            } else if (z && (((C347017w8) drawable).A04() instanceof C369788vK)) {
                A02(drawable, false);
            } else if ((drawable instanceof C389629pw) && !((C389629pw) drawable).A02) {
                this.A01.A0F = false;
            } else if (drawable instanceof C299335ux) {
                this.A01.A0j = false;
            } else if (!z || (r02 = (C347017w8) drawable) == null || !(r02.A04() instanceof C300635xX)) {
                Drawable drawable2 = drawable;
                if (z) {
                    drawable2 = ((C347017w8) drawable2).A04();
                }
                if (drawable2 instanceof C389639px) {
                    this.A01.A0J = false;
                } else if (drawable instanceof C16150Upb) {
                    this.A01.A0c = false;
                } else if ((drawable instanceof KWE) && (kwe = (KWE) drawable) != null && (promptStickerModel4 = kwe.A03) != null && promptStickerModel4.A0A) {
                    this.A01.A0N = false;
                } else if (!(drawable instanceof KWF) || (kwf = (KWF) drawable) == null || (promptStickerModel3 = kwf.A04) == null || !promptStickerModel3.A0B) {
                    if (drawable instanceof C59812JZg) {
                        StoryPromptType storyPromptType = null;
                        C59812JZg jZg = (C59812JZg) drawable;
                        if (!(jZg == null || (promptStickerModel2 = jZg.A06) == null)) {
                            if (!promptStickerModel2.A0G()) {
                                storyPromptType = promptStickerModel2.A03();
                            }
                        }
                        if (storyPromptType != StoryPromptType.ELECTION) {
                            this.A01.A0b = false;
                        }
                    }
                    if (drawable instanceof C389539pn) {
                        this.A01.A09 = false;
                    } else if (!(drawable instanceof C354798Nk) || !((r0 = (C354798Nk) drawable) == null || (promptStickerModel = r0.A0B) == null || !promptStickerModel.A0G())) {
                        if (z) {
                            C347017w8 r2 = (C347017w8) drawable;
                            if (r2.A03 instanceof C387319m1) {
                                CaptureRuleSystemState captureRuleSystemState2 = this.A01;
                                captureRuleSystemState2.A02--;
                            } else if (r2.A04() instanceof U1S) {
                                this.A01.A0E = false;
                            }
                        }
                        Drawable drawable3 = drawable;
                        if (z) {
                            drawable3 = ((C347017w8) drawable3).A04();
                        }
                        if (drawable3 instanceof C389669q0) {
                            this.A01.A0R = false;
                        } else if (AnonymousClass9Sv.A00(drawable)) {
                            this.A01.A0G = false;
                        } else if ((drawable instanceof C389659pz) || (z && (((C347017w8) drawable).A04() instanceof C389649py))) {
                            this.A01.A0W = false;
                        } else if (drawable instanceof C346987w5) {
                            this.A01.A0e = false;
                        } else if (drawable instanceof C346997w6) {
                            CaptureRuleSystemState captureRuleSystemState3 = this.A01;
                            captureRuleSystemState3.A0V = false;
                            captureRuleSystemState3.A0U = false;
                        } else if (AnonymousClass9Sv.A02(drawable)) {
                            CaptureRuleSystemState captureRuleSystemState4 = this.A01;
                            captureRuleSystemState4.A01--;
                        }
                    } else {
                        this.A01.A0i = false;
                    }
                } else {
                    this.A01.A0M = false;
                }
            } else {
                this.A01.A0P = false;
            }
        }
        A03(this);
    }

    private final void A00() {
        AnonymousClass89W r1;
        C367118qD r0;
        UserSession userSession = this.A06;
        if (!C347037wA.A04(userSession)) {
            r1 = this.A04;
            r0 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_DESTINATION_QUERY_SKIPPED_NOT_IG_BC_ONBOARDED;
        } else {
            boolean A062 = 182.A06(0Tu.A05, userSession, 36319162578967547L);
            r1 = this.A04;
            if (!A062) {
                r0 = C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_DESTINATION_QUERY_SKIPPED_NOT_PASSING_EXPERIMENT_GATING;
            } else {
                r1.A00(C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_DESTINATION_QUERY_FIRED_WITHOUT_SKIPCACHE);
                C377149Ks r02 = new C377149Ks(this, 22);
                C377149Ks r4 = new C377149Ks(this, 23);
                1vn A012 = 1vm.A01(userSession);
                2IS r6 = new 2IS();
                2IS r5 = new 2IS();
                r6.A04("igid", userSession.A06);
                AnonymousClass2IY r12 = PandoGraphQLRequest.Companion;
                1Ef freshCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "BrandedContentXPostingDestinationFBPageEligibilityQuery", r6.getParamsCopy(), r5.getParamsCopy(), C43661C4j.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__IGUser", new ArrayList()).setMaxToleratedCacheAgeMs(86400000).setFreshCacheAgeMs(0);
                A012.ATL(new ASe(r4), new DFJ(r02), freshCacheAgeMs);
                return;
            }
        }
        r1.A00(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(android.graphics.drawable.Drawable r6, boolean r7) {
        /*
            r5 = this;
            X.7w8 r6 = (X.C347017w8) r6
            android.graphics.drawable.Drawable r4 = r6.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MediaStickerDrawableIntf"
            X.0qQ.A0C(r4, r0)
            X.8vK r4 = (X.C369788vK) r4
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r3 = r5.A01
            r3.A0S = r7
            com.instagram.model.mediatype.ProductType r2 = r4.BgY()
            if (r2 == 0) goto L_0x0032
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x002f
            r0 = 13
            if (r1 != r0) goto L_0x0032
            r3.A0k = r7
        L_0x0024:
            X.1sw r1 = r4.BRP()
            X.1sw r0 = X.1sw.A04
            if (r1 != r0) goto L_0x002e
            r3.A08 = r7
        L_0x002e:
            return
        L_0x002f:
            r3.A0K = r7
            goto L_0x0024
        L_0x0032:
            r3.A0I = r7
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.UPCOMING_EVENT
            if (r2 != r0) goto L_0x0024
            r3.A0j = r7
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88Y.A02(android.graphics.drawable.Drawable, boolean):void");
    }

    public static final void A03(AnonymousClass88Y r14) {
        int A012;
        C3512388c r11;
        C347817xQ r5;
        if (AnonymousClass89S.A00(r14.A06).booleanValue()) {
            A012 = C347207wR.A01("story_v2");
            Set A002 = C394569yK.A00(r14.A01);
            AnonymousClass89T r0 = r14.A03;
            if (r0 != null) {
                r5 = (C347817xQ) r0.A07.getValue();
            } else {
                r5 = null;
            }
            if (r5 != null) {
                C347297wa r3 = C347297wa.IG;
                C347697xE r2 = C347697xE.STORY;
                List singletonList = Collections.singletonList(r2);
                0qQ.A07(singletonList);
                List singletonList2 = Collections.singletonList(r14.A01.A04);
                0qQ.A07(singletonList2);
                C39794A9p a9p = new C39794A9p(r3, singletonList, singletonList2);
                C347297wa r32 = C347297wa.FB;
                List singletonList3 = Collections.singletonList(r2);
                0qQ.A07(singletonList3);
                List singletonList4 = Collections.singletonList(r14.A01.A04);
                0qQ.A07(singletonList4);
                List A013 = AIL.A01(a9p, new C39794A9p(r32, singletonList3, singletonList4), r5, A002);
                AnonymousClass8BA r02 = r14.A00;
                if (r02 != null) {
                    r02.A0m(A013);
                }
            } else {
                0KC.A0C("CaptureRuleSystem", "(checkXpostContentCompatibility) config==null");
                AnonymousClass8BA r03 = r14.A00;
                if (r03 != null) {
                    r03.A0m((List) null);
                }
            }
        } else {
            A012 = C347207wR.A01("story_v0");
            for (C3512388c r6 : r14.A07) {
                List list = (List) r14.A08.get(r6);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        AnonymousClass8BA r22 = (AnonymousClass8BA) list.get(i);
                        boolean Cb8 = r14.Cb8(r6);
                        if (!(r22.A0w.A08.A00 instanceof AnonymousClass80O) && (r6 == (r11 = C3512188a.A0Y) || r6 == C3512188a.A05 || r6 == C3512188a.A0i || r6 == C3512188a.A0M || r6 == C3512188a.A0f || r6 == C3512188a.A06 || r6 == C3512188a.A0P || r6 == C3512188a.A0B || r6 == C3512188a.A0j || r6 == C3512188a.A0n || r6 == C3512188a.A0k || r6 == C3512188a.A0b)) {
                            UserSession userSession = r22.A0v;
                            C299935wF A003 = C363388je.A00(userSession).A00(AnonymousClass8BA.A29);
                            C363008it r8 = r22.A1q;
                            if (r8.A06()) {
                                AnonymousClass88Z r1 = r22.A1J;
                                r1.Cb8(r11);
                                if ((!r1.Cb8(C3512188a.A0M) && C363038ix.A01(userSession) && !C363388je.A03(A003)) || !r1.Cb8(C3512188a.A0f) || !r1.Cb8(C3512188a.A0P) || !r1.Cb8(C3512188a.A0B) || !AnonymousClass8BA.A0J(userSession, r1) || !r1.Cb8(C3512188a.A0k) || !r1.Cb8(C3512188a.A0b) || !r1.Cb8(C3512188a.A0j) || !AnonymousClass8BA.A0I(r22.A0u, userSession, r1)) {
                                    C59689JTv.A07(r22.A0o.getContext(), 2131956614);
                                }
                            }
                            r8.A01 = AnonymousClass8BA.A0L(r22);
                            C358118aO r04 = r8.A00;
                            if (r04 != null) {
                                r04.Dk9();
                            }
                        }
                        if (r6 == C3512188a.A0Y) {
                            boolean z = !Cb8;
                            C3506485o r12 = r22.A11;
                            if (r12.A03 != z) {
                                r12.A03 = z;
                                C3506485o.A00(r12, false);
                            }
                            C3506485o r13 = r22.A10;
                            if (r13 != null && z) {
                                r13.A00 = true;
                                C3506485o.A00(r13, true);
                            }
                        }
                    }
                }
            }
        }
        02m.A0p.markerEnd(383657104, A012, 2);
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        CaptureRuleSystemState captureRuleSystemState = (CaptureRuleSystemState) parcelable;
        if (captureRuleSystemState != null) {
            this.A01 = captureRuleSystemState;
            A03(this);
        }
    }

    public final void A9A(AnonymousClass8BA r3, C3512388c r4) {
        Map map = this.A08;
        List list = (List) map.get(r4);
        if (list == null) {
            list = new ArrayList();
            map.put(r4, list);
        }
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        return this.A01;
    }

    public final void Cvm() {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        captureRuleSystemState.A0T = true;
        captureRuleSystemState.A0p = true;
        A03(this);
    }

    public final void Cz2(List list) {
        int i;
        boolean z;
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z2 = false;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        captureRuleSystemState.A00 = i;
        CaptureRuleSystemState captureRuleSystemState2 = this.A01;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BrandedContentTag) it.next()).A03) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        captureRuleSystemState2.A0C = z;
        CaptureRuleSystemState captureRuleSystemState3 = this.A01;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    User A022 = 17h.A00(this.A06).A02(((BrandedContentTag) it2.next()).A01);
                    if (A022 != null) {
                        Boolean CcJ = A022.A03.CcJ();
                        if (CcJ != null) {
                            if (!CcJ.booleanValue()) {
                                break;
                            }
                        } else {
                            0KC.A0C("CaptureRuleSystem", "The sponsor User model is missing the is_sponsor_enabled_for_branded_content_crossposting_to_fb field, which will block crossposting to FB");
                            this.A04.A00(C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_CLIENT_ELIGIBILITY_SPONSOR_ENABLED_FIELD_MISSING);
                            break;
                        }
                    } else {
                        0KC.A0C("CaptureRuleSystem", "The sponsor User model is missing from UserCache, which will block crossposting to FB because we cannot check the sponsor's eligibility");
                        break;
                    }
                } else {
                    break;
                }
            }
            z2 = true;
        }
        captureRuleSystemState3.A0A = z2;
        A03(this);
    }

    public final void D6o(boolean z) {
        this.A01.A06 = z;
        A03(this);
    }

    public final void DLj(boolean z) {
        this.A01.A0r = z;
        A03(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (X.C63982LHa.A00(r4) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQD(com.instagram.api.schemas.BrandedContentGatingInfo r4) {
        /*
            r3 = this;
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r2 = r3.A01
            if (r4 == 0) goto L_0x0018
            boolean r0 = X.C63982LHa.A01(r4)
            if (r0 != 0) goto L_0x0011
            boolean r1 = X.C63982LHa.A00(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r2.A0B = r0
            A03(r3)
            return
        L_0x0018:
            r0 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88Y.DQD(com.instagram.api.schemas.BrandedContentGatingInfo):void");
    }

    public final void DSt() {
        this.A01.A0q = true;
        A03(this);
    }

    public final void DWz(boolean z) {
        this.A01.A0L = z;
        A03(this);
    }

    public final void DX0() {
        this.A01.A0Q = true;
        A03(this);
    }

    public final void DZs(ReelProductLink reelProductLink) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (reelProductLink != null) {
            z = true;
        }
        captureRuleSystemState.A0Y = z;
        A03(this);
    }

    public final void DaB(ProfileShopLink profileShopLink) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (profileShopLink != null) {
            z = true;
        }
        captureRuleSystemState.A0a = z;
        A03(this);
    }

    public final void Dc7(List list) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (list != null && (!list.isEmpty())) {
            z = true;
        }
        captureRuleSystemState.A0d = z;
        A03(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A06, 36323783963061771L) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dnt(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x000b:
            if (r8 == 0) goto L_0x001c
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323783963061771(0x810c4a00042e0b, double:3.034645470153751E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r4 = 1
        L_0x001d:
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r1 = r6.A01
            r0 = r4 ^ 1
            r1.A0g = r0
            A03(r6)
            return
        L_0x0027:
            java.util.Iterator r5 = r7.iterator()
        L_0x002b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r1 = r5.next()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = X.AnonymousClass9Sv.A01(r1)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r1 instanceof X.AnonymousClass9UM
            if (r0 != 0) goto L_0x002b
            boolean r0 = r1 instanceof X.AnonymousClass91c
            if (r0 != 0) goto L_0x002b
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x0055
            r0 = r1
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C369908vW
            if (r0 == 0) goto L_0x0055
            goto L_0x002b
        L_0x0055:
            boolean r0 = X.AnonymousClass9Sv.A02(r1)
            if (r0 != 0) goto L_0x002b
            X.0qQ.A0B(r1, r4)
            X.B3d r0 = X.C271404in.A09(r1)
            if (r0 == 0) goto L_0x001d
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323783962996234(0x810c4a00032e0a, double:3.0346454701123053E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001d
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88Y.Dnt(java.util.List, boolean):void");
    }

    public final void DrH() {
        this.A01.A0t = true;
        A03(this);
    }

    public final void EIp(C366588pL r2, Void voidR) {
        C262204Co r0;
        if (AnonymousClass89S.A00(this.A06).booleanValue() && (r0 = (C262204Co) this.A05.getValue()) != null) {
            r0.EwR();
        }
        this.A01 = r2.A00;
        A00();
        A03(this);
    }

    public final C366588pL EK0() {
        return new C366588pL(this.A01);
    }

    public final void DCL() {
        A00();
    }

    public final void DDQ() {
        A01();
    }

    public final void DRF() {
        A03(this);
    }

    public final void AHb(Void voidR) {
        A01();
    }

    public final void Er3(AnonymousClass8BA r1) {
        this.A00 = r1;
    }
}
