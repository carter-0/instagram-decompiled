package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.8XA  reason: invalid class name */
public final class AnonymousClass8XA {
    public C65075Lmv A00;
    public C362868ic A01;
    public C362048hG A02;
    public AnonymousClass8XW A03;
    public boolean A04;
    public C355608Qq A05;
    public AnonymousClass8XG A06;
    public boolean A07;
    public final Activity A08;
    public final View A09;
    public final ViewGroup A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass82W A0C;
    public final AnonymousClass72N A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final C357638Yz A0G;
    public final AnonymousClass8QN A0H;
    public final TargetViewSizeProvider A0I;
    public final C3506485o A0J;
    public final C352888Fl A0K;
    public final AnonymousClass8W6 A0L;
    public final C352538Dt A0M;
    public final C3499582p A0N;
    public final AnonymousClass80D A0O;
    public final C3496481e A0P;
    public final AnonymousClass8VZ A0Q;
    public final AnonymousClass8WK A0R;
    public final C356848Vl A0S;
    public final C3497481o A0T;
    public final C342897pL A0U;
    public final AnonymousClass8WO A0V;
    public final AnonymousClass85O A0W;
    public final AnonymousClass8WH A0X;
    public final AnonymousClass8E5 A0Y;
    public final AnonymousClass80U A0Z;
    public final C353508Hx A0a;
    public final ClipsCreationViewModel A0b;
    public final AnonymousClass88V A0c;
    public final C3511387s A0d;
    public final ClipsCreationDraftViewModel A0e;
    public final AnonymousClass8RD A0f;
    public final AnonymousClass8PZ A0g;
    public final C3495780x A0h;
    public final C351818An A0i;
    public final AnonymousClass0eM A0j;
    public final AnonymousClass0eM A0k;
    public final AnonymousClass0eM A0l;
    public final AnonymousClass0eM A0m;
    public final AnonymousClass0eM A0n;
    public final boolean A0o;
    public final ViewGroup A0p;
    public final AnonymousClass848 A0q;
    public final AnonymousClass84E A0r;
    public final AnonymousClass8S5 A0s;
    public final AnonymousClass8QA A0t;
    public final C355948Rz A0u;
    public final ClipsAssetHubViewModel A0v;
    public final AnonymousClass823 A0w;
    public final AnonymousClass8DD A0x;
    public final GalleryMemoriesViewModel A0y;
    public final C3502283u A0z;
    public final C355898Ru A10;
    public final C3496881i A11;
    public final C3502083s A12;
    public final C3497281m A13;
    public final StoryDraftsCreationViewModel A14;
    public final C352328Cx A15;
    public final C2801950r A16;
    public final AnonymousClass846 A17;
    public final AnonymousClass88F A18;
    public final AnonymousClass8L4 A19;
    public final DirectShareTarget A1A;
    public final DirectCameraViewModel A1B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6 == X.AnonymousClass80M.A00) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(com.instagram.common.gallery.Medium r18, X.C362058hH r19, boolean r20) {
        /*
            r17 = this;
            r12 = 0
            r5 = 1
            r2 = r17
            X.8Yz r0 = r2.A0G
            X.80m r4 = r0.A08
            java.lang.Object r6 = r4.A00
            X.9QA r1 = X.AnonymousClass9QA.A00
            r14 = r18
            if (r6 == r1) goto L_0x0015
            X.80M r0 = X.AnonymousClass80M.A00
            r3 = 0
            if (r6 != r0) goto L_0x0038
        L_0x0015:
            r3 = 1
            com.instagram.common.session.UserSession r6 = r2.A0F
            X.8nu r7 = X.C365918nt.A00(r6)
            X.81e r0 = r2.A0P
            X.80R r0 = r0.A00
            X.28D r8 = r0.A01
            java.lang.Object r9 = r4.A00
            X.4yO r9 = (X.C279284yO) r9
            java.util.List r11 = java.util.Collections.singletonList(r14)
            X.0qQ.A07(r11)
            X.27r r0 = X.27p.A01(r6)
            java.lang.String r10 = r0.A0R()
            r7.A00(r8, r9, r10, r11, r12)
        L_0x0038:
            X.8Vl r0 = r2.A0S
            X.8Vm r0 = r0.A00()
            int r0 = r0.A02
            if (r0 != r5) goto L_0x0052
            if (r3 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.8nu r2 = X.C365918nt.A00(r0)
            java.lang.String r1 = "system_cancelled"
            java.lang.String r0 = "Camera is fully hidden."
            r2.A02(r1, r0)
        L_0x0051:
            return
        L_0x0052:
            X.82p r0 = r2.A0N
            X.82o r0 = r0.A02
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r0.A08(r6)
            java.lang.Object r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x006b
            com.instagram.common.session.UserSession r0 = r2.A0F
            boolean r0 = X.C3505585e.A01(r0)
            if (r0 != 0) goto L_0x006e
        L_0x006b:
            r2.A0M(r12)
        L_0x006e:
            java.lang.String r1 = r14.A0X
            android.app.Activity r13 = r2.A08
            java.io.File r0 = r13.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            X.0qQ.A07(r0)
            boolean r0 = X.00p.A0k(r1, r0, r12)
            r5 = r19
            r4 = r20
            if (r0 == 0) goto L_0x0096
            if (r20 != 0) goto L_0x0096
            int r3 = r14.A0B
            int r1 = r14.A04
            X.8Cl r0 = new X.8Cl
            r0.<init>(r14, r3, r1)
            A04(r2, r5, r0, r4)
            return
        L_0x0096:
            android.content.ContentResolver r12 = r13.getContentResolver()
            X.0qQ.A07(r12)
            com.instagram.common.session.UserSession r15 = r2.A0F
            X.JYM r11 = new X.JYM
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 457(0x1c9, float:6.4E-43)
            X.5g0 r1 = new X.5g0
            r1.<init>(r11, r0)
            X.9UI r0 = new X.9UI
            r0.<init>(r2, r5, r4, r3)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.A0E(com.instagram.common.gallery.Medium, X.8hH, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (r1 == X.AnonymousClass80M.A00) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(com.instagram.common.gallery.Medium r13, X.C362058hH r14, boolean r15) {
        /*
            r12 = this;
            r11 = 0
            r5 = 1
            X.ADp r2 = X.C39891ADp.A00
            X.02m r0 = X.02m.A0p
            X.0qQ.A07(r0)
            r3 = 51249153(0x30e0001, float:4.1730054E-37)
            r0.markerStart(r3)
            java.lang.String r1 = "source"
            java.lang.String r0 = "gallery"
            r2.A01(r1, r0)
            int r2 = r13.A03
            java.lang.String r1 = "video_duration"
            X.02m r0 = X.02m.A0p
            X.0qQ.A07(r0)
            r0.markerAnnotate(r3, r1, r2)
            X.8Yz r0 = r12.A0G
            X.80m r2 = r0.A08
            java.lang.Object r1 = r2.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 == r0) goto L_0x0031
            X.80M r0 = X.AnonymousClass80M.A00
            r3 = 0
            if (r1 != r0) goto L_0x0054
        L_0x0031:
            r3 = 1
            com.instagram.common.session.UserSession r1 = r12.A0F
            X.8nu r6 = X.C365918nt.A00(r1)
            X.81e r0 = r12.A0P
            X.80R r0 = r0.A00
            X.28D r7 = r0.A01
            java.lang.Object r8 = r2.A00
            X.4yO r8 = (X.C279284yO) r8
            java.util.List r10 = java.util.Collections.singletonList(r13)
            X.0qQ.A07(r10)
            X.27r r0 = X.27p.A01(r1)
            java.lang.String r9 = r0.A0R()
            r6.A00(r7, r8, r9, r10, r11)
        L_0x0054:
            X.8Vl r0 = r12.A0S
            X.8Vm r0 = r0.A00()
            int r0 = r0.A02
            if (r0 != r5) goto L_0x006e
            if (r3 == 0) goto L_0x006d
            com.instagram.common.session.UserSession r0 = r12.A0F
            X.8nu r2 = X.C365918nt.A00(r0)
            java.lang.String r1 = "system_cancelled"
            java.lang.String r0 = "Camera is fully hidden."
            r2.A02(r1, r0)
        L_0x006d:
            return
        L_0x006e:
            X.82p r0 = r12.A0N
            X.82o r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A08(r0)
            boolean r0 = r14.CV4()
            if (r0 != 0) goto L_0x0088
            com.instagram.common.session.UserSession r0 = r12.A0F
            boolean r0 = X.C3505585e.A01(r0)
            if (r0 != 0) goto L_0x0088
            r12.A0M(r11)
        L_0x0088:
            r4 = 458(0x1ca, float:6.42E-43)
            android.app.Activity r2 = r12.A08
            com.instagram.common.session.UserSession r1 = r12.A0F
            X.JZ5 r0 = new X.JZ5
            r0.<init>(r2, r13, r1, r5)
            X.5g0 r1 = new X.5g0
            r1.<init>(r0, r4)
            X.9je r0 = new X.9je
            r0.<init>(r12, r14, r15, r3)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.A0F(com.instagram.common.gallery.Medium, X.8hH, boolean):void");
    }

    public final void A0H(C362058hH r5, C369988ve r6, C352218Cl r7) {
        if (this.A0S.A00().A02 != 1) {
            this.A0N.A02.A08(AnonymousClass05K.A01);
            r7.A12 = true;
            if (!0qQ.A0K(this.A0G.A08.A00, AnonymousClass9QA.A00) || !C3505585e.A01(this.A0F)) {
                A0M(false);
            }
            if (r6 != null) {
                A07(new C365798nh(r7), r6, r7.A0h);
            }
            A04(this, r5, r7, false);
        }
    }

    public final void A0I(C362058hH r5, C369988ve r6, C349307zv r7) {
        if (this.A0S.A00().A02 != 1) {
            this.A0N.A02.A08(AnonymousClass05K.A01);
            r7.A18 = true;
            if (!0qQ.A0K(this.A0G.A08.A00, AnonymousClass9QA.A00) || !C3505585e.A01(this.A0F)) {
                A0M(false);
            }
            if (r6 != null) {
                A07(new C365798nh(r7), r6, r7.A07());
            }
            A05(this, r5, r7, false);
        }
    }

    public final void A0J(C362058hH r8, List list) {
        A0K(r8, list, 0, false, false, false);
    }

    public final void A0K(C362058hH r35, List list, int i, boolean z, boolean z2, boolean z3) {
        C290815g0 r2;
        2Cn r0;
        C365798nh r1;
        List<GalleryItem> list2 = list;
        0qQ.A0B(list2, 1);
        if (this.A0S.A00().A02 != 1) {
            boolean z4 = z;
            if (list2.size() != 1 || z2) {
                C3494680m r22 = this.A0G.A08;
                Object obj = r22.A00;
                if (obj == AnonymousClass9QA.A00 || obj == AnonymousClass80M.A00) {
                    UserSession userSession = this.A0F;
                    C365928nu A002 = C365918nt.A00(userSession);
                    28D r13 = this.A0P.A00.A01;
                    C279284yO r14 = (C279284yO) r22.A00;
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
                    for (GalleryItem galleryItem : list2) {
                        arrayList.add(galleryItem.A00);
                    }
                    A002.A00(r13, r14, 27p.A01(userSession).A0R(), arrayList, false);
                }
                A0M(false);
                AnonymousClass8QN r5 = this.A0H;
                r5.A0Q.A02.A08(AnonymousClass05K.A01);
                r5.A00 = list2.size();
                TreeMap treeMap = new TreeMap();
                for (int i2 = 0; i2 < r5.A00; i2++) {
                    GalleryItem galleryItem2 = (GalleryItem) list2.get(i2);
                    int intValue = galleryItem2.A09.intValue();
                    if (intValue == 2 || intValue == 0) {
                        Medium medium = galleryItem2.A00;
                        medium.getClass();
                        boolean CeS = medium.CeS();
                        UserSession userSession2 = r5.A0G;
                        29f r15 = 27p.A01(userSession2).A0A;
                        C360948fP r21 = C360948fP.GALLERY;
                        int i3 = medium.A0B;
                        int i4 = medium.A04;
                        Long valueOf = Long.valueOf(medium.A01());
                        String str = medium.A0X;
                        Double valueOf2 = Double.valueOf(((double) medium.A03) / 1000.0d);
                        Boolean valueOf3 = Boolean.valueOf(z4);
                        long j = medium.A0C;
                        int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                        if (CeS) {
                            if (i5 <= 0) {
                                j = medium.A0D;
                            }
                            r15.A0W((C391579tJ) null, r21, true, valueOf3, valueOf2, valueOf, (Long) null, str, 2, i3, i4, j, false);
                            r2 = new C290815g0(new JZ5(r5.A0A, medium, userSession2, true), 462);
                            r0 = new C385829jb(r5, treeMap, i2);
                        } else {
                            if (i5 <= 0) {
                                j = medium.A0D;
                            }
                            r15.A0W((C391579tJ) null, r21, true, valueOf3, valueOf2, valueOf, (Long) null, str, 1, i3, i4, j, false);
                            Activity activity = r5.A0A;
                            r2 = new C290815g0(new JYM(activity.getContentResolver(), activity, medium, userSession2, AnonymousClass05K.A0C), 463);
                            r0 = new C385849jd(r5, treeMap, i2, z3);
                        }
                        r2.A00 = r0;
                        1ES.A03(r2);
                    } else {
                        if (intValue == 5) {
                            C352218Cl r02 = galleryItem2.A07;
                            r02.getClass();
                            r1 = new C365798nh(r02);
                        } else if (intValue == 6) {
                            C349307zv r03 = galleryItem2.A08;
                            r03.getClass();
                            r1 = new C365798nh(r03);
                        }
                        AnonymousClass8QN.A03(r5, r1, treeMap, i2);
                    }
                }
                r5.A01 = i;
                return;
            }
            GalleryItem galleryItem3 = (GalleryItem) list2.get(0);
            int intValue2 = galleryItem3.A09.intValue();
            C362058hH r6 = r35;
            if (intValue2 == 0) {
                Medium medium2 = galleryItem3.A00;
                if (medium2 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (medium2.A05()) {
                    A0E(medium2, r6, z4);
                } else {
                    A0F(medium2, r6, z4);
                }
            } else if (intValue2 == 5) {
                C352218Cl r04 = galleryItem3.A07;
                if (r04 != null) {
                    A0H(r6, (C369988ve) null, r04);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (intValue2 == 6) {
                C349307zv r05 = galleryItem3.A08;
                if (r05 != null) {
                    A0I(r6, (C369988ve) null, r05);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A0F, 36321765328365262L) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(java.util.List r18, boolean r19) {
        /*
            r17 = this;
            r10 = 0
            r3 = r17
            X.8Vl r0 = r3.A0S
            X.8Vm r0 = r0.A00()
            int r0 = r0.A02
            r9 = 1
            if (r0 != r9) goto L_0x001e
            com.instagram.common.session.UserSession r0 = r3.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29L r2 = r0.A0J
            X.50r r1 = r3.A16
            java.lang.String r0 = "Camera hidden"
            r2.A04(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            X.8hG r0 = r3.A02
            r6 = r18
            r7 = r19
            if (r0 == 0) goto L_0x0057
            X.8hV r0 = r0.A0v
            boolean r0 = r0.A00()
            if (r0 != r9) goto L_0x0057
            int r0 = r6.size()
            if (r0 <= r9) goto L_0x019b
            com.instagram.common.session.UserSession r4 = r3.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321765328365262(0x810a74000326ce, double:3.0333688774432894E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x019b
        L_0x0043:
            X.88V r1 = r3.A0c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A00 = r0
            X.AnonymousClass88V.A00(r1)
            X.05G r1 = r1.A0B
            X.88W r0 = new X.88W
            r0.<init>(r6)
            r1.Epw(r0)
            return
        L_0x0057:
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x00d6
            X.Ap6 r4 = new X.Ap6
            r4.<init>(r3, r6, r7)
            java.lang.Object r2 = r6.get(r10)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x018c
            int r5 = r2.A03
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x0184
            X.80U r0 = r3.A0Z
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r0 = r0.A02
            android.util.Pair r0 = r0.A00
            java.lang.Object r1 = r0.second
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.event.CaptureStateEvent.EnterPreCapture"
            X.0qQ.A0C(r1, r0)
            X.8VN r1 = (X.AnonymousClass8VN) r1
            X.8bo r1 = r1.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.model.PreCaptureTransitionSource.ReplaceClipPostCapture"
            X.0qQ.A0C(r1, r0)
            X.7iw r1 = (X.C339027iw) r1
            int r0 = r1.A01
            if (r5 >= r0) goto L_0x018c
            X.8hG r1 = r3.A02
            if (r1 == 0) goto L_0x001d
            r0 = 21
            X.MJ9 r5 = new X.MJ9
            r5.<init>(r0, r4, r3)
            r0 = 4
            X.GL3 r4 = new X.GL3
            r4.<init>(r0, r2, r3, r7)
            android.app.Activity r0 = r1.A0N
            X.8ab r2 = new X.8ab
            r2.<init>((android.app.Activity) r0)
            r0 = 2131962967(0x7f132c57, float:1.9562674E38)
            r2.A09(r0)
            r0 = 2131962966(0x7f132c56, float:1.9562672E38)
            r2.A08(r0)
            r1 = 2131956706(0x7f1313e2, float:1.9549975E38)
            X.AJt r0 = new X.AJt
            r0.<init>(r5)
            r2.A0K(r0, r1)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.AJu r0 = new X.AJu
            r0.<init>(r4)
            r2.A0G(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x00d6:
            java.util.Iterator r1 = r6.iterator()
        L_0x00da:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r1.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x00da
        L_0x00ec:
            X.8Hx r0 = r3.A0a
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.Bru()
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x0190
            int r0 = r6.size()
            if (r0 <= r9) goto L_0x0190
            X.87s r0 = r3.A0d
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x0190
            java.util.Iterator r4 = r6.iterator()
        L_0x0108:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r2 = r4.next()
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            boolean r1 = r2.CeS()
            r0 = 1
            if (r1 == 0) goto L_0x011c
            r0 = 2
        L_0x011c:
            A02(r2, r3, r0, r10, r7)
            goto L_0x0108
        L_0x0120:
            X.87s r0 = r3.A0d
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x00ec
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0b
            boolean r0 = r0.A0n()
            if (r0 != 0) goto L_0x00ec
            X.82p r0 = r3.A0N
            X.82o r0 = r0.A02
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x00ec
            X.80x r0 = r3.A0h
            r0.A00()
            X.8Hx r1 = r3.A0a
            java.lang.String r0 = r1.AoA()
            if (r0 == 0) goto L_0x00ec
            com.instagram.music.common.model.AudioOverlayTrack r0 = r1.Bru()
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x0150
            goto L_0x00ec
        L_0x0150:
            boolean r0 = r1.CKE()
            if (r0 != 0) goto L_0x00ec
            com.instagram.common.session.UserSession r5 = r3.A0F
            boolean r0 = X.AnonymousClass30D.A08(r5)
            if (r0 == 0) goto L_0x00ec
            int r0 = r6.size()
            if (r0 <= r9) goto L_0x00ec
            java.util.Iterator r4 = r6.iterator()
            r14 = 0
        L_0x0169:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r2 = r4.next()
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            int r0 = r2.A03
            int r14 = r14 + r0
            boolean r1 = r2.CeS()
            r0 = 1
            if (r1 == 0) goto L_0x0180
            r0 = 2
        L_0x0180:
            A02(r2, r3, r0, r10, r7)
            goto L_0x0169
        L_0x0184:
            java.lang.String r1 = "This shouldn't be called when not in replace flow"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018c:
            r4.run()
            return
        L_0x0190:
            X.88V r4 = r3.A0c
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = r3.A0v
            boolean r0 = r0.A02
            r8 = r10
            r9 = r0
            goto L_0x01a1
        L_0x019b:
            X.88V r4 = r3.A0c
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r8 = r10
            r9 = r10
        L_0x01a1:
            r4.A02(r5, r6, r7, r8, r9)
            return
        L_0x01a5:
            X.8A2 r11 = X.AnonymousClass8A1.A01(r5)
            X.81e r0 = r3.A0P
            X.80R r0 = r0.A00
            X.28D r12 = r0.A01
            java.lang.String r13 = "video"
            r15 = r9
            r16 = r10
            r11.A06(r12, r13, r14, r15, r16)
            X.88V r0 = r3.A0c
            r3 = 0
            r8 = 838(0x346, float:1.174E-42)
            X.88X r2 = new X.88X
            r4 = r3
            r5 = r3
            r7 = r3
            r11 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.2Fj r1 = r0.A06
            X.88W r0 = new X.88W
            r0.<init>(r2)
            r1.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.A0L(java.util.List, boolean):void");
    }

    private final C355608Qq A00() {
        C355608Qq r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A0F;
        Activity activity = this.A08;
        C355608Qq r02 = new C355608Qq(activity, userSession, AnonymousClass05K.A01, AnonymousClass8XE.A01(activity), AnonymousClass8XE.A00(activity), false);
        this.A05 = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.2jE] */
    public static final AnonymousClass8XW A01(AnonymousClass8XA r6) {
        AnonymousClass8XW r0 = r6.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass8XN r4 = new AnonymousClass8XN(AnonymousClass07i.A00(r6.A0B), r6.A00());
        UserSession userSession = r6.A0F;
        r4.A04 = userSession;
        r4.A07 = new AnonymousClass8XP(r6);
        if (!r6.A0o) {
            ? obj = new Object();
            r4.A09 = true;
            r4.A0B = true;
            r4.A0F = true;
            r4.A05 = new AnonymousClass8XR(r6.A08);
            r4.A06 = obj;
            r4.A0D = new Object().A00(userSession);
            r4.A08 = new AnonymousClass8XS(r6);
        }
        C357638Yz r1 = r6.A0G;
        if (r1.A06().A02) {
            r4.A03 = AnonymousClass8XO.PHOTO_ONLY;
        }
        C3494680m r3 = r1.A08;
        if ((r3.A00 instanceof AnonymousClass80O) && 182.A06(0Tu.A05, userSession, 36326116130043403L)) {
            r4.A02 = new C378559Qh();
        }
        if ((r3.A00 instanceof AnonymousClass9QA) && 182.A06(0Tu.A05, userSession, 36323831207636530L)) {
            r4.A02 = new AYG();
        }
        AnonymousClass8XW r02 = new AnonymousClass8XW(r6.A08, (2Cn) null, (AnonymousClass8XX) null, new AnonymousClass8XU(r4));
        r6.A03 = r02;
        return r02;
    }

    public static final void A02(Medium medium, AnonymousClass8XA r20, int i, boolean z, boolean z2) {
        AnonymousClass8XA r2 = r20;
        29f r9 = 27p.A01(r2.A0F).A0A;
        C360948fP r11 = C360948fP.GALLERY;
        Medium medium2 = medium;
        int i2 = medium2.A0B;
        int i3 = medium2.A04;
        Long valueOf = Long.valueOf(medium2.A01());
        String str = medium2.A0X;
        Double valueOf2 = Double.valueOf(((double) medium2.A03) / 1000.0d);
        C391579tJ Aje = r2.A0a.Aje();
        Boolean valueOf3 = Boolean.valueOf(z2);
        long j = medium2.A0C;
        if (j <= 0) {
            j = medium2.A0D;
        }
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        r9.A0W(Aje, r11, false, valueOf3, valueOf2, valueOf, (Long) null, str2, i, i4, i5, j, z);
    }

    public static final void A03(AnonymousClass8XA r9) {
        View view;
        r9.A0v.A01 = null;
        C65075Lmv lmv = r9.A00;
        if (lmv == null) {
            UserSession userSession = r9.A0F;
            AnonymousClass4DH r1 = r9.A0B;
            Context requireContext = r1.requireContext();
            FragmentActivity fragmentActivity = r9.A08;
            0qQ.A0C(fragmentActivity, AnonymousClass000.A00(22));
            0hq childFragmentManager = r1.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            r9.A00 = new C65075Lmv(requireContext, fragmentActivity, childFragmentManager, userSession, (AnonymousClass861) null, new MM9(r9, 13), false);
        } else {
            if (lmv.A00((ViewGroup) null).getParent() != null) {
                ViewGroup viewGroup = r9.A0A;
                C65075Lmv lmv2 = r9.A00;
                if (lmv2 != null) {
                    view = lmv2.A00((ViewGroup) null);
                } else {
                    view = null;
                }
                viewGroup.removeView(view);
            }
            C65075Lmv lmv3 = r9.A00;
            if (lmv3 != null) {
                lmv3.A02();
            }
        }
        C65075Lmv lmv4 = r9.A00;
        if (lmv4 != null) {
            r9.A0A.addView(lmv4.A00((ViewGroup) null));
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.07Z, X.4DH] */
    public static final void A04(AnonymousClass8XA r4, C362058hH r5, C352218Cl r6, boolean z) {
        AnonymousClass2g9.A00(19B.A00, new AnonymousClass9KF((Object) r6, (AnonymousClass4D7) null, (Object) r4.A0V, 25)).A06(r4.A0B, new C362858ib(new C41662AyE(r4, r5, r6, z)));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r7.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e9, code lost:
        X.2Og.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ec, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fd, code lost:
        if (r4 == X.AnonymousClass80M.A00) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass8XA r23, X.C362058hH r24, X.C349307zv r25, boolean r26) {
        /*
            r4 = r24
            boolean r0 = r4.CV4()
            r3 = r23
            r2 = r25
            if (r0 == 0) goto L_0x017c
            X.82W r0 = r3.A0C
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r8 = r0.A09
            r14 = 0
            if (r8 == 0) goto L_0x0178
            java.util.Map r1 = r8.A0Z
            java.lang.String r0 = "galleryPicker"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0178
            com.instagram.common.session.UserSession r0 = r3.A0F
            X.4Om r7 = X.C264044Oj.A00(r0)
            X.81e r0 = r3.A0P
            X.80R r0 = r0.A00
            X.28D r6 = r0.A01
            java.lang.String r5 = r8.A0K
            java.lang.String r1 = r8.A0M
            X.28t r0 = X.28t.A06
            r7.Chn(r6, r0, r5, r1)
            X.8PZ r3 = r3.A0g
            X.81m r0 = r3.A0J
            X.81t r0 = r0.A00()
            r0.CLK()
            X.8FA r0 = r3.A0H
            X.05G r0 = r0.A00
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)
            r0.Epw(r6)
            int r0 = r2.A07
            r13 = 1
            X.51M r0 = X.C39820AAr.A00(r2, r0, r13)
            r3.A07 = r0
            X.8Q2 r2 = r3.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.0qQ.A0B(r0, r14)
            r2.A02 = r0
            android.view.TextureView r0 = r3.A05
            if (r0 != 0) goto L_0x0091
            android.content.Context r0 = r3.A0B
            android.view.TextureView r1 = new android.view.TextureView
            r1.<init>(r0)
            r3.A05 = r1
            X.ALt r0 = new X.ALt
            r0.<init>(r3)
            r1.setSurfaceTextureListener(r0)
            android.view.TextureView r5 = r3.A05
            if (r5 == 0) goto L_0x008a
            r1 = -1
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r0.A0F = r14
            r0.A0u = r14
            r0.A0M = r14
            r0.A0s = r14
            r5.setLayoutParams(r0)
        L_0x008a:
            android.view.ViewGroup r1 = r3.A0C
            android.view.TextureView r0 = r3.A05
            r1.addView(r0, r14)
        L_0x0091:
            android.content.Context r5 = r3.A0B
            com.instagram.common.session.UserSession r7 = r3.A0F
            java.lang.String r0 = "green_screen"
            X.4MM r1 = new X.4MM
            r1.<init>(r5, r7, r0)
            r3.A08 = r1
            android.view.Surface r0 = r3.A04
            if (r0 == 0) goto L_0x00a5
            r1.setSurface(r0)
        L_0x00a5:
            android.view.ViewGroup r8 = r3.A0C     // Catch:{ IOException -> 0x0167 }
            r8.setVisibility(r14)     // Catch:{ IOException -> 0x0167 }
            X.5nL r7 = X.C294975nL.A01(r8, r13)     // Catch:{ IOException -> 0x0167 }
            r0 = 0
            X.5nL r7 = r7.A0C(r0)     // Catch:{ IOException -> 0x0167 }
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A0M(r1, r0)     // Catch:{ IOException -> 0x0167 }
            X.Ag0 r0 = new X.Ag0     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0167 }
            r7.A05 = r0     // Catch:{ IOException -> 0x0167 }
            r7.A0H()     // Catch:{ IOException -> 0x0167 }
            r3.A09 = r13     // Catch:{ IOException -> 0x0167 }
            X.51M r7 = r3.A07     // Catch:{ IOException -> 0x0167 }
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x015b
            int r0 = r7.A09     // Catch:{ IOException -> 0x0167 }
            r3.A01 = r0     // Catch:{ IOException -> 0x0167 }
            int r0 = r7.A08     // Catch:{ IOException -> 0x0167 }
            r3.A00 = r0     // Catch:{ IOException -> 0x0167 }
            X.51R r12 = r7.A0F     // Catch:{ IOException -> 0x0167 }
            java.lang.String r7 = r12.A0F     // Catch:{ IOException -> 0x0167 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0167 }
            java.lang.String r9 = r0.getPath()     // Catch:{ IOException -> 0x0167 }
            X.0qQ.A07(r9)     // Catch:{ IOException -> 0x0167 }
            int r10 = r12.A09     // Catch:{ IOException -> 0x0167 }
            int r11 = r12.A05     // Catch:{ IOException -> 0x0167 }
            int r7 = r12.A07     // Catch:{ IOException -> 0x0167 }
            if (r7 == 0) goto L_0x00f1
            r0 = 180(0xb4, float:2.52E-43)
            if (r7 == r0) goto L_0x00f1
            goto L_0x00f8
        L_0x00f1:
            r3.A03 = r10     // Catch:{ IOException -> 0x0167 }
            r7 = r10
            r3.A02 = r11     // Catch:{ IOException -> 0x0167 }
            r10 = r11
            goto L_0x00fd
        L_0x00f8:
            r3.A03 = r11     // Catch:{ IOException -> 0x0167 }
            r7 = r11
            r3.A02 = r10     // Catch:{ IOException -> 0x0167 }
        L_0x00fd:
            android.view.TextureView r0 = r3.A05     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0155
            X.AqD r0 = new X.AqD     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r3, r7, r10, r14)     // Catch:{ IOException -> 0x0167 }
            X.0nA.A0p(r8, r0)     // Catch:{ IOException -> 0x0167 }
            X.0bY r0 = r3.A0E     // Catch:{ IOException -> 0x0167 }
            android.net.Uri r9 = X.0cp.A01(r0, r9)     // Catch:{ IOException -> 0x0167 }
            if (r9 == 0) goto L_0x011c
            X.4MM r8 = r3.A08     // Catch:{ IOException -> 0x0167 }
            if (r8 == 0) goto L_0x011c
            r10 = 0
            java.lang.String r12 = "GreenScreenReviewController"
            r11 = r10
            r8.ETv(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0167 }
        L_0x011c:
            X.4MM r7 = r3.A08     // Catch:{ IOException -> 0x0167 }
            if (r7 == 0) goto L_0x0124
            r0 = 0
            r7.E3n(r0, r0)     // Catch:{ IOException -> 0x0167 }
        L_0x0124:
            X.4MM r7 = r3.A08     // Catch:{ IOException -> 0x0167 }
            if (r7 == 0) goto L_0x0134
            X.9qn r0 = new X.9qn     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0167 }
            r7.A0M = r0     // Catch:{ IOException -> 0x0167 }
            int r0 = r3.A01     // Catch:{ IOException -> 0x0167 }
            r7.seekTo(r0)     // Catch:{ IOException -> 0x0167 }
        L_0x0134:
            X.4MM r0 = r3.A08     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x013b
            r0.start()     // Catch:{ IOException -> 0x0167 }
        L_0x013b:
            X.51M r0 = r3.A07     // Catch:{ IOException -> 0x0167 }
            if (r0 == 0) goto L_0x0161
            X.51R r0 = r0.A0F     // Catch:{ IOException -> 0x0167 }
            r2.Eto(r0, r14, r13)     // Catch:{ IOException -> 0x0167 }
            X.8Q1 r2 = r3.A0L     // Catch:{ IOException -> 0x0167 }
            X.05G r1 = r2.A04     // Catch:{ IOException -> 0x0167 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ IOException -> 0x0167 }
            r1.Epw(r0)     // Catch:{ IOException -> 0x0167 }
            X.05G r0 = r2.A03     // Catch:{ IOException -> 0x0167 }
            r0.Epw(r6)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0178
        L_0x0155:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0166
        L_0x015b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0167 }
            goto L_0x0166
        L_0x0161:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0167 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0167 }
        L_0x0166:
            throw r0     // Catch:{ IOException -> 0x0167 }
        L_0x0167:
            r2 = move-exception
            java.lang.String r1 = "video_review_failed"
            r0 = 2131976507(0x7f13613b, float:1.9590136E38)
            X.C59689JTv.A01(r5, r1, r0, r14)
            java.lang.String r0 = "GreenScreenReviewController"
            X.0kD.A0C(r0, r1, r2)
            X.AnonymousClass8PZ.A00(r3, r14)
        L_0x0178:
            r4.EZk(r14)
            return
        L_0x017c:
            X.80D r9 = r3.A0O
            X.82i r4 = r9.A18
            if (r4 == 0) goto L_0x01f0
            java.lang.String r0 = r2.A0k
            r6 = 1
            X.0qQ.A0B(r0, r6)
            android.media.MediaExtractor r7 = new android.media.MediaExtractor
            r7.<init>()
            r7.setDataSource(r0)
            int r0 = X.Ahv.A00(r7)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01a5
            X.85o r1 = r3.A0J     // Catch:{ all -> 0x01e1 }
            r1.A00 = r6     // Catch:{ all -> 0x01e1 }
            X.C3506485o.A00(r1, r6)     // Catch:{ all -> 0x01e1 }
            r1.A0B = r6     // Catch:{ all -> 0x01e1 }
            r0 = 0
            X.C3506485o.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            goto L_0x024e
        L_0x01a5:
            if (r0 <= r6) goto L_0x024e
            X.8hG r0 = r3.A02     // Catch:{ all -> 0x01e1 }
            r5 = 0
            if (r0 == 0) goto L_0x01af
            r0.CLL(r5)     // Catch:{ all -> 0x01e1 }
        L_0x01af:
            android.app.Activity r4 = r3.A08     // Catch:{ all -> 0x01e1 }
            r1 = 2131961946(0x7f13285a, float:1.9560603E38)
            java.lang.String r0 = "failed_to_load_video"
            X.C59689JTv.A01(r4, r0, r1, r5)     // Catch:{ all -> 0x01e1 }
            X.8Yz r0 = r3.A0G     // Catch:{ all -> 0x01e1 }
            X.80m r6 = r0.A08     // Catch:{ all -> 0x01e1 }
            java.lang.Object r1 = r6.A00     // Catch:{ all -> 0x01e1 }
            X.4yO r1 = (X.C279284yO) r1     // Catch:{ all -> 0x01e1 }
            X.9QA r0 = X.AnonymousClass9QA.A00     // Catch:{ all -> 0x01e1 }
            if (r1 == r0) goto L_0x01c9
            X.80M r0 = X.AnonymousClass80M.A00     // Catch:{ all -> 0x01e1 }
            if (r1 != r0) goto L_0x01ed
        L_0x01c9:
            com.instagram.common.session.UserSession r0 = r3.A0F     // Catch:{ all -> 0x01e1 }
            X.8nu r5 = X.C365918nt.A00(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "More than one audio track found for imported video."
            java.lang.String r1 = "camera_destination "
            java.lang.Object r0 = r6.A00     // Catch:{ all -> 0x01e1 }
            X.4yO r0 = (X.C279284yO) r0     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x01e1 }
            r5.A03(r4, r0)     // Catch:{ all -> 0x01e1 }
            goto L_0x01ed
        L_0x01e1:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01e3 }
        L_0x01e3:
            r1 = move-exception
            r7.release()     // Catch:{ all -> 0x01e8 }
            throw r1
        L_0x01e8:
            r0 = move-exception
            X.2Og.A01(r2, r0)
            throw r1
        L_0x01ed:
            r7.release()
        L_0x01f0:
            X.8Yz r0 = r3.A0G
            X.80m r8 = r0.A08
            java.lang.Object r4 = r8.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r4 == r0) goto L_0x01ff
            X.80M r0 = X.AnonymousClass80M.A00
            r1 = 0
            if (r4 != r0) goto L_0x0200
        L_0x01ff:
            r1 = 1
        L_0x0200:
            boolean r0 = r9.A3M
            if (r0 == 0) goto L_0x0246
            if (r1 != 0) goto L_0x0246
            r1 = 0
            java.lang.String r0 = r2.A0k
            X.JYp r0 = X.C59796JYp.A01(r0, r1)
            X.0qQ.A07(r0)
            long r6 = r0.A03
            r4 = 15500(0x3c8c, double:7.658E-320)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0246
            X.0wj r4 = X.0wj.A01
            r1 = 817901047(0x30c02df7, float:1.3982903E-9)
            java.lang.String r0 = "Segment videos"
            X.0f9 r4 = r4.AEf(r0, r1)
            X.28D r0 = r9.A0B
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "entry_point"
            r4.ABQ(r0, r1)
            java.lang.Object r0 = r8.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "camera_destination"
            r4.ABQ(r0, r1)
            r4.report()
            r4 = 4
            r1 = 15000(0x3a98, float:2.102E-41)
            r0 = 5000(0x1388, float:7.006E-42)
            java.util.ArrayList r4 = X.C39820AAr.A01(r2, r4, r1, r0)
            goto L_0x0285
        L_0x0246:
            java.util.List r4 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r4)
            goto L_0x0285
        L_0x024e:
            r7.release()
            X.1Xj r7 = r4.A03
            boolean r0 = r7.A5p()
            r1 = 15000(0x3a98, float:2.102E-41)
            if (r0 != 0) goto L_0x0264
            long r4 = r7.A1B()
            int r0 = (int) r4
            int r1 = java.lang.Math.min(r0, r1)
        L_0x0264:
            float r4 = (float) r1
            int r1 = r2.A07
            boolean r0 = r7.A5p()
            float r1 = (float) r1
            if (r0 != 0) goto L_0x0272
            r0 = 1065078180(0x3f7bcda4, float:0.9836066)
            float r1 = r1 * r0
        L_0x0272:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0246
            boolean r0 = r7.A5p()
            if (r0 != 0) goto L_0x0280
            r0 = 1065078180(0x3f7bcda4, float:0.9836066)
            float r4 = r4 * r0
        L_0x0280:
            int r0 = (int) r4
            java.util.ArrayList r4 = X.C39820AAr.A01(r2, r6, r0, r6)
        L_0x0285:
            X.8E5 r0 = r3.A0Y
            X.8Zl r0 = r0.A00()
            r0.Cmf(r4)
            int r1 = r4.size()
            r0 = 1
            r5 = 0
            r7 = r26
            if (r1 != r0) goto L_0x02c0
            X.8WO r6 = r3.A0V
            java.lang.Object r4 = r4.get(r5)
            X.0qQ.A0B(r4, r5)
            r2 = 0
            r0 = 26
            X.9KF r1 = new X.9KF
            r1.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (java.lang.Object) r6, (int) r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r4 = X.AnonymousClass2g9.A00(r0, r1)
            X.4DH r2 = r3.A0B
            r0 = 2
            X.9Lo r1 = new X.9Lo
            r1.<init>(r0, r3, r7)
            X.8ib r0 = new X.8ib
            r0.<init>(r1)
            r4.A06(r2, r0)
            return
        L_0x02c0:
            com.instagram.common.session.UserSession r0 = r3.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29f r12 = r0.A0A
            r21 = 2
            X.8fP r14 = X.C360948fP.GALLERY
            int r9 = r2.A0K
            int r8 = r2.A08
            long r0 = r2.A00()
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            java.lang.String r6 = r2.A0k
            int r0 = r2.A07
            double r0 = (double) r0
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r10
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
            r19 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
            X.8Hx r0 = r3.A0a
            X.9tJ r13 = r0.Aje()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r7)
            long r0 = r2.A0M
            r10 = 0
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x0301
            long r0 = r2.A0L
        L_0x0301:
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r10
            r23 = r8
            r24 = r0
            r26 = r5
            r20 = r6
            r22 = r9
            r12.A0W(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            X.8VZ r1 = r3.A0Q
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A05(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.A05(X.8XA, X.8hH, X.7zv, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.07Z, X.4DH] */
    public static final void A06(AnonymousClass8XA r14, String str) {
        UserSession userSession = r14.A0F;
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r14.A0B);
        FragmentActivity fragmentActivity = r14.A08;
        0qQ.A0C(fragmentActivity, AnonymousClass000.A00(22));
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C62498Kgo kgo = C62498Kgo.LAUNCHED_FROM_CAMERA;
        Integer num = AnonymousClass05K.A0u;
        MM9 mm9 = new MM9(r14, 11);
        MM9 mm92 = new MM9(r14, 12);
        C41605AxJ axJ = C41605AxJ.A00;
        String str2 = r14.A0N.A02.A01.A0F;
        0qQ.A07(str2);
        boolean z = false;
        String str3 = str;
        if (str != null) {
            z = true;
        }
        LI3.A00(fragmentActivity2, userSession, kgo, (PromptStickerModel) null, num, str2, str3, (String) null, mm9, mm92, axJ, A002, true, z);
    }

    private final void A07(C365798nh r8, C369988ve r9, String str) {
        AnonymousClass8QA r1 = this.A0t;
        AnonymousClass34S A032 = r1.A03(r9.A04, r8, new AnonymousClass8BF(), (List) null, false);
        Object obj = A032.A00;
        if (obj != null) {
            r1.A0C((C366678pU) obj, str);
            C3499482o r12 = this.A0N.A02;
            String str2 = r9.A05;
            AnonymousClass82Y r13 = r12.A01;
            r13.A0E = str2;
            r13.A0G = r9.A07;
            Object obj2 = A032.A01;
            if (obj2 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (((Boolean) obj2).booleanValue()) {
                Activity activity = this.A08;
                Drawable drawable = activity.getDrawable(R.drawable.instagram_sticker_pano_filled_24);
                if (drawable != null) {
                    drawable.setColorFilter(activity.getColor(2Yu.A05(activity)), PorterDuff.Mode.SRC_IN);
                    C310336ap r2 = new C310336ap();
                    r2.A02 = -1;
                    r2.A0D = activity.getResources().getString(2131974413);
                    r2.A0N = true;
                    r2.A0I = activity.getResources().getString(2131974414);
                    r2.A04 = drawable;
                    r2.A02();
                    r2.A06();
                    1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                27p.A01(this.A0F).A1q(r9.A05);
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x016e, code lost:
        if (r7.A00 != 9) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C362048hG A08() {
        /*
            r58 = this;
            r1 = r58
            X.8hG r4 = r1.A02
            if (r4 == 0) goto L_0x002f
            r4.A0V()
            X.8ic r2 = r1.A01
            if (r2 == 0) goto L_0x0012
            X.2cs r0 = r2.A0E
            r0.A0A(r2)
        L_0x0012:
            android.app.Activity r0 = r1.A08
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass8FD.A00(r0)
            if (r0 == 0) goto L_0x002e
            X.81m r0 = r1.A13
            X.81t r2 = r0.A00()
            X.80D r0 = r1.A0O
            boolean r0 = r0.A3D
            r2.Ety(r0)
        L_0x002e:
            return r4
        L_0x002f:
            r1.A0A()
            X.0eM r4 = r1.A0m
            java.lang.Object r2 = r4.getValue()
            X.8XC r2 = (X.AnonymousClass8XC) r2
            X.4DH r0 = r1.A0B
            r57 = r0
            android.content.Context r0 = r57.requireContext()
            r2.A00(r0)
            X.07U r9 = X.07U.A05
            X.07Z r8 = r57.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r8)
            r0 = 0
            r11 = 24
            X.9KF r3 = new X.9KF
            r6 = r3
            r7 = r1
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            X.19B r2 = X.19B.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.1Eo.A03(r6, r2, r3, r5)
            android.view.ViewGroup r14 = r1.A0A
            r2 = 2131433471(0x7f0b17ff, float:1.8488729E38)
            android.view.View r11 = r14.requireViewById(r2)
            X.0qQ.A07(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            X.8Yz r10 = r1.A0G
            X.80U r15 = r1.A0Z
            r2 = r15
            X.80T r2 = (X.AnonymousClass80T) r2
            X.80W r3 = r2.A02
            com.instagram.common.session.UserSession r5 = r1.A0F
            X.0eM r2 = r1.A0k
            java.lang.Object r2 = r2.getValue()
            X.8h5 r2 = (X.C361948h5) r2
            X.8h6 r7 = new X.8h6
            r7.<init>(r5, r10, r2, r3)
            X.2YN r3 = new X.2YN
            r2 = r57
            r3.<init>(r7, r2)
            java.lang.Class<X.8h7> r2 = X.C361968h7.class
            X.2YL r3 = r3.A00(r2)
            X.8h7 r3 = (X.C361968h7) r3
            X.87s r12 = r1.A0d
            X.4gw r2 = r12.A04
            if (r2 == 0) goto L_0x00a4
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r3.A01 = r2
            r3.A03 = r6
            r3.A00 = r0
        L_0x00a4:
            X.8HT r27 = X.AnonymousClass8HS.A00(r5, r10)
            android.app.Activity r2 = r1.A08
            r56 = r2
            X.0iw r2 = r1.A0E
            r55 = r2
            java.lang.Object r4 = r4.getValue()
            X.8XC r4 = (X.AnonymousClass8XC) r4
            X.72N r13 = r1.A0D
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r2 = r1.A14
            X.8hA r30 = new X.8hA
            r16 = r30
            r17 = r56
            r18 = r11
            r19 = r57
            r20 = r13
            r21 = r55
            r22 = r5
            r23 = r10
            r24 = r1
            r25 = r2
            r26 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 9
            X.9Le r2 = new X.9Le
            r2.<init>(r1, r4)
            X.8hD r45 = new X.8hD
            r16 = r45
            r17 = r11
            r18 = r57
            r19 = r55
            r20 = r5
            r21 = r10
            r22 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.82p r2 = r1.A0N
            r29 = r2
            android.view.View r6 = r1.A09
            r2 = 2131433447(0x7f0b17e7, float:1.848868E38)
            android.view.View r9 = r6.requireViewById(r2)
            X.0qQ.A07(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r2 = 2131433444(0x7f0b17e4, float:1.8488674E38)
            android.view.View r8 = r6.requireViewById(r2)
            X.0qQ.A07(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.85O r2 = r1.A0W
            r35 = r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r1.A0b
            r37 = r2
            X.8An r2 = r1.A0i
            r26 = r2
            X.80D r2 = r1.A0O
            boolean r6 = r2.A3N
            r25 = r6
            X.9Qn r7 = r2.A13
            r6 = 1
            if (r7 == 0) goto L_0x02c6
            boolean r7 = r7.A0G
            if (r7 != r6) goto L_0x02c6
        L_0x0128:
            boolean r7 = r2.A3R
            r24 = r7
            com.instagram.api.schemas.GenAIToolInfoDict r7 = r2.A0I
            if (r7 == 0) goto L_0x0132
            com.instagram.api.schemas.CameraTool r0 = r7.A00
        L_0x0132:
            X.8hK r41 = X.AnonymousClass6XS.A00(r0)
            X.8Qq r23 = r1.A00()
            X.8L4 r0 = r1.A19
            r22 = r0
            X.8XG r31 = r1.A09()
            X.88V r0 = r1.A0c
            r21 = r0
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r0 = r1.A0y
            r20 = r0
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = r1.A0v
            r19 = r0
            X.0eM r0 = r1.A0j
            java.lang.Object r0 = r0.getValue()
            X.8gL r0 = (X.C361508gL) r0
            X.50r r7 = r1.A16
            r18 = r7
            boolean r51 = r2.A0I()
            java.lang.String r7 = r2.A2c
            r52 = 0
            if (r7 == 0) goto L_0x0166
            r52 = 1
        L_0x0166:
            com.instagram.model.direct.camera.DirectCameraViewModel r7 = r2.A1I
            if (r7 == 0) goto L_0x0170
            int r7 = r7.A00
            r53 = 1
            if (r7 == r4) goto L_0x0172
        L_0x0170:
            r53 = 0
        L_0x0172:
            java.lang.String r4 = r2.A2S
            r17 = r4
            boolean r4 = r2.A3l
            r16 = r4
            boolean r4 = r1.A0o
            if (r4 == 0) goto L_0x02c0
            r46 = 0
        L_0x0180:
            com.instagram.model.direct.DirectShareTarget r7 = r1.A1A
            X.8hG r4 = new X.8hG
            r28 = r19
            r32 = r1
            r33 = r3
            r34 = r20
            r36 = r15
            r38 = r21
            r39 = r12
            r40 = r18
            r42 = r26
            r43 = r22
            r44 = r7
            r47 = r17
            r48 = r25
            r49 = r6
            r50 = r24
            r54 = r16
            r16 = r4
            r17 = r56
            r18 = r11
            r19 = r8
            r20 = r9
            r21 = r57
            r22 = r55
            r24 = r5
            r25 = r10
            r26 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r1.A02 = r4
            X.2Fk r7 = r13.A01
            X.07Z r6 = r57.getViewLifecycleOwner()
            r0 = 4
            X.9Ks r3 = new X.9Ks
            r3.<init>(r1, r0)
            X.8ib r0 = new X.8ib
            r0.<init>(r3)
            r7.A06(r6, r0)
            X.81e r0 = r1.A0P
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            r4.A0c(r0)
            X.8Ru r8 = r1.A10
            r8.A06 = r4
            java.util.Set r0 = r8.A0T
            r0.add(r4)
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r1.A1B
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = r0.A06
        L_0x01e9:
            r4.A09 = r0
            X.C362048hG.A0G(r4)
            android.view.ViewGroup r0 = r1.A0p
            X.8ic r3 = new X.8ic
            r16 = r3
            r17 = r11
            r18 = r14
            r19 = r0
            r20 = r35
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            r7 = 7
            X.83u r10 = r1.A0z
            X.8Rz r9 = r1.A0u
            X.8Fl r6 = r1.A0K
            r0 = 30
            X.MMT r11 = new X.MMT
            r11.<init>(r5, r0)
            java.lang.Class<X.8id> r0 = X.C362878id.class
            java.lang.Object r5 = r5.A01(r0, r11)
            X.83u r5 = (X.C3502283u) r5
            X.83s r0 = r1.A12
            X.83u r22 = r0.B8t()
            r18 = r6
            r19 = r4
            r20 = r8
            r21 = r5
            r16 = r10
            r17 = r9
            X.83u[] r6 = new X.C3502283u[]{r16, r17, r18, r19, r20, r21, r22}
            r5 = 0
        L_0x022e:
            r0 = r6[r5]
            r3.A00(r0)
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x022e
            X.8DD r0 = r1.A0x
            if (r0 == 0) goto L_0x023e
            r3.A00(r0)
        L_0x023e:
            X.88F r0 = r1.A18
            if (r0 == 0) goto L_0x0245
            r3.A00(r0)
        L_0x0245:
            X.84E r0 = r1.A0r
            if (r0 == 0) goto L_0x024c
            r3.A00(r0)
        L_0x024c:
            X.823 r0 = r1.A0w
            if (r0 == 0) goto L_0x0259
            X.8Xk r0 = r0.A00()
            if (r0 == 0) goto L_0x0259
            r3.A00(r0)
        L_0x0259:
            r1.A01 = r3
            X.8S5 r0 = r1.A0s
            r0.A01 = r4
            r0.A00 = r3
            X.8VZ r0 = r1.A0Q
            r0.A01 = r3
            boolean r0 = r15.CZe()
            if (r0 == 0) goto L_0x026e
            r4.A0U()
        L_0x026e:
            r4.A0V()
            X.8ic r3 = r1.A01
            if (r3 == 0) goto L_0x02c9
            X.2cs r0 = r3.A0E
            r0.A0A(r3)
            android.content.Context r0 = r56.getApplicationContext()
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass8FD.A00(r0)
            if (r0 == 0) goto L_0x02af
            X.81m r0 = r1.A13
            X.81t r3 = r0.A00()
            boolean r0 = r2.A3D
            r3.Ety(r0)
        L_0x0292:
            X.8Vl r0 = r1.A0S
            X.8Vm r0 = r0.A00()
            int r0 = r0.A02
            r2 = 1
            if (r0 != r2) goto L_0x02a8
            r4.A0W()
        L_0x02a0:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x002e
            r4.onResume()
            return r4
        L_0x02a8:
            r4.A0B = r2
            X.7yD r0 = r4.A0a
            r0.A00 = r2
            goto L_0x02a0
        L_0x02af:
            X.4gw r0 = r12.A04
            if (r0 != 0) goto L_0x0292
            X.81m r0 = r1.A13
            X.81t r0 = r0.A00()
            r0.CLO()
            goto L_0x0292
        L_0x02bd:
            r0 = 0
            goto L_0x01e9
        L_0x02c0:
            X.8XW r46 = A01(r1)
            goto L_0x0180
        L_0x02c6:
            r6 = 0
            goto L_0x0128
        L_0x02c9:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.A08():X.8hG");
    }

    public final AnonymousClass8XG A09() {
        AnonymousClass8XG r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        Activity activity = this.A08;
        UserSession userSession = this.A0F;
        AnonymousClass8XD r8 = new AnonymousClass8XD(this);
        View requireViewById = this.A0p.requireViewById(R.id.dial_ar_effect_picker_left_side_button_container);
        0qQ.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        C3498081w B8r = this.A13.A00().B8r();
        if (B8r != null) {
            AnonymousClass8XG r12 = new AnonymousClass8XG(activity, this.A09, viewGroup, A00(), userSession, B8r, r8, this.A17);
            this.A06 = r12;
            return r12;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0A() {
        if (!this.A07) {
            AnonymousClass8XG A092 = A09();
            AnonymousClass8GF CrP = A092.A0A.CrP();
            CrP.A00 = new AnonymousClass8XL(A092);
            CrP.A01 = new AnonymousClass8XM(A092);
            CrP.A00();
            A01(this).A0A(1);
            this.A07 = true;
        }
    }

    public final void A0B() {
        this.A0Z.E3H(C356678Uu.A00);
        29Z r3 = 27p.A01(this.A0F).A0F;
        0wc r2 = r3.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
        if (A002.isSampled()) {
            A002.A8M(AnonymousClass80P.MUSIC, "tool_type");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_ENTITY_TAP");
            AnonymousClass283 r5 = r3.A04;
            String str = r5.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(C279294yP.STORY, "camera_destination");
            A002.A8M(r5.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A002.A8k("event_type", 2);
            A002.AAJ("module", 27x.A08.getModuleName());
            if (r5.A01 != 2) {
                i = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i));
            A002.A8M(C59725JVj.PRE_CAPTURE, "surface");
            A002.A7p("is_panavision", false);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAK(2AL.A07(r3.A00, r3.A03), "system_info");
            A002.Cgf();
        }
    }

    public final void A0C() {
        UserSession userSession = this.A0F;
        Bundle bundle = new Bundle();
        new AnonymousClass6W8(this.A0B.requireActivity(), bundle, userSession, ModalActivity.class, C66579MXk.A00(75)).A0C(this.A08);
        29Z r3 = 27p.A01(userSession).A0F;
        0wc r2 = r3.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
        if (A002.isSampled()) {
            A002.A8M(AnonymousClass80P.ADD_YOURS_TEMPLATES_DISCOVERY_SURFACE, "tool_type");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_ENTITY_TAP");
            AnonymousClass283 r5 = r3.A04;
            String str = r5.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8M(C279294yP.STORY, "camera_destination");
            A002.A8M(r5.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A002.A8k("event_type", 2);
            A002.AAJ("module", 27x.A08.getModuleName());
            if (r5.A01 != 2) {
                i = 1;
            }
            A002.A8k("camera_position", Integer.valueOf(i));
            A002.A8M(C59725JVj.PRE_CAPTURE, "surface");
            A002.A7p("is_panavision", false);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAK(2AL.A07(r3.A00, r3.A03), "system_info");
            A002.Cgf();
        }
    }

    public final void A0D() {
        if (this.A0S.A00().A02 != 1) {
            C352888Fl r1 = this.A0K;
            if (!r1.A0I) {
                r1.onResume();
                return;
            }
            return;
        }
        C352888Fl r12 = this.A0K;
        if (r12.A0I) {
            r12.onPause();
        }
    }

    public final void A0G(C358088aL r9) {
        C357638Yz r2 = this.A0G;
        r2.A0K(r9);
        A0N(true);
        27r A012 = 27p.A01(this.A0F);
        C279294yP r22 = ((C279284yO) r2.A08.A00).A00;
        C371088xY r3 = C371088xY.GALLERY_DESTINATION_BAR;
        A012.A0F.A0S(r22, r3, r9, (List) null, 0, 0);
    }

    public final void A0M(boolean z) {
        C362868ic r0 = this.A01;
        if (r0 != null) {
            r0.A01(z);
        }
        C340297l2 r02 = this.A0K.A06;
        if (r02 != null) {
            r02.A0C();
        }
        this.A0d.A0F();
        this.A0L.A0M.DHV();
        A0D();
    }

    public final void A0O(boolean z) {
        String str;
        C361948h5 r1 = (C361948h5) this.A0k.getValue();
        if (r1 != null) {
            r1.A00("show_gallery");
        }
        A08();
        C362868ic r0 = this.A01;
        if (r0 != null) {
            r0.A02(z);
            C362048hG r12 = this.A02;
            if (r12 != null) {
                DirectCameraViewModel directCameraViewModel = this.A1B;
                if (directCameraViewModel != null) {
                    str = directCameraViewModel.A06;
                } else {
                    str = null;
                }
                r12.A09 = str;
                C362048hG.A0G(r12);
            }
            C352888Fl r13 = this.A0K;
            if (r13.A0I) {
                r13.onPause();
            }
            C349247zp A002 = C349227zn.A00(this.A0F);
            String str2 = A002.A00;
            if (str2 != null) {
                A06(this, str2);
                A002.A00 = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0P(boolean z, boolean z2, boolean z3) {
        C362048hG r5 = this.A02;
        if (r5 != null) {
            r5.A0v.A00 = new AnonymousClass59G(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
            if (z2) {
                r5.A0Y();
                return;
            }
            if (182.A06(0Tu.A05, r5.A0c, 36328568556436913L)) {
                C362048hG.A0C(r5);
            }
        }
    }

    public final boolean A0Q() {
        C65075Lmv lmv = this.A00;
        if (lmv != null) {
            lmv.A01();
        }
        C65075Lmv lmv2 = this.A00;
        if (lmv2 != null) {
            lmv2.A07.A0x(AnonymousClass000.A00(145));
        }
        C65075Lmv lmv3 = this.A00;
        if (lmv3 == null) {
            return false;
        }
        View view = null;
        if (lmv3.A00((ViewGroup) null).getParent() == null) {
            return false;
        }
        ViewGroup viewGroup = this.A0A;
        C65075Lmv lmv4 = this.A00;
        if (lmv4 != null) {
            view = lmv4.A00((ViewGroup) null);
        }
        viewGroup.removeView(view);
        return true;
    }

    public final boolean A0R() {
        Object obj = ((AnonymousClass80T) this.A0Z).A02.A00.second;
        if (!(obj instanceof AnonymousClass8VN)) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.event.CaptureStateEvent.EnterPreCapture");
        return ((AnonymousClass8VN) obj).A01 instanceof C339027iw;
    }

    public final void A0N(boolean z) {
        A0M(z);
        Context applicationContext = this.A08.getApplicationContext();
        0qQ.A07(applicationContext);
        if (!AnonymousClass8FD.A00(applicationContext)) {
            C352888Fl r0 = this.A0K;
            r0.A17.A04(new C40333AaS(this));
        }
        C352888Fl r1 = this.A0K;
        if (!r1.A0I) {
            r1.onResume();
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8XA(android.app.Activity r28, android.view.View r29, android.view.ViewGroup r30, android.view.ViewGroup r31, X.AnonymousClass848 r32, X.AnonymousClass4DH r33, X.AnonymousClass82W r34, X.AnonymousClass84E r35, X.AnonymousClass72N r36, X.AnonymousClass0iw r37, com.instagram.common.session.UserSession r38, X.C357638Yz r39, X.AnonymousClass8S5 r40, X.AnonymousClass8QA r41, X.AnonymousClass8QN r42, X.C355948Rz r43, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r44, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r45, X.C3506485o r46, X.C352888Fl r47, X.AnonymousClass8W6 r48, X.C352538Dt r49, X.C3499582p r50, X.AnonymousClass823 r51, X.AnonymousClass80D r52, X.C3496481e r53, X.AnonymousClass8VZ r54, X.AnonymousClass8WK r55, X.C356848Vl r56, X.AnonymousClass8DD r57, X.C3497481o r58, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r59, X.AnonymousClass8WO r60, X.AnonymousClass85O r61, X.C355898Ru r62, X.C3496881i r63, X.AnonymousClass8WH r64, X.AnonymousClass8E5 r65, X.C3502083s r66, X.C3497281m r67, X.AnonymousClass80U r68, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r69, X.C353508Hx r70, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r71, X.AnonymousClass88V r72, X.C3511387s r73, X.C352328Cx r74, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r75, X.C2801950r r76, X.AnonymousClass846 r77, X.AnonymousClass8PZ r78, X.C3495780x r79, X.AnonymousClass88F r80, X.C351818An r81, X.AnonymousClass8L4 r82, com.instagram.model.direct.DirectShareTarget r83, com.instagram.model.direct.camera.DirectCameraViewModel r84) {
        /*
            r27 = this;
            r1 = 2
            r0 = r68
            X.0qQ.A0B(r0, r1)
            r1 = 3
            r15 = r48
            X.0qQ.A0B(r15, r1)
            r1 = 4
            r12 = r49
            X.0qQ.A0B(r12, r1)
            r1 = 5
            r9 = r63
            X.0qQ.A0B(r9, r1)
            r1 = 6
            r5 = r67
            X.0qQ.A0B(r5, r1)
            r2 = 8
            r23 = r50
            r1 = r23
            X.0qQ.A0B(r1, r2)
            r20 = 10
            r1 = 11
            r19 = 12
            r18 = 13
            r17 = 14
            r3 = 18
            r6 = r66
            X.0qQ.A0B(r6, r3)
            r4 = 19
            r24 = r47
            r3 = r24
            X.0qQ.A0B(r3, r4)
            r4 = 25
            r22 = r54
            r3 = r22
            X.0qQ.A0B(r3, r4)
            r4 = 26
            r21 = r56
            r3 = r21
            X.0qQ.A0B(r3, r4)
            r4 = 27
            r26 = r34
            r3 = r26
            X.0qQ.A0B(r3, r4)
            r3 = 28
            r7 = r65
            X.0qQ.A0B(r7, r3)
            r16 = 29
            r3 = 30
            r11 = r53
            X.0qQ.A0B(r11, r3)
            r3 = 31
            r10 = r58
            X.0qQ.A0B(r10, r3)
            r4 = 33
            r25 = r46
            r3 = r25
            X.0qQ.A0B(r3, r4)
            r3 = 39
            r4 = r70
            X.0qQ.A0B(r4, r3)
            r8 = 44
            r3 = r77
            X.0qQ.A0B(r3, r8)
            r13 = 47
            r8 = r64
            X.0qQ.A0B(r8, r13)
            r14 = r27
            r14.<init>()
            r13 = r38
            r14.A0F = r13
            r14.A0Z = r0
            r14.A0L = r15
            r14.A0M = r12
            r14.A11 = r9
            r14.A13 = r5
            r9 = r52
            r14.A0O = r9
            r0 = r23
            r14.A0N = r0
            r0 = r28
            r14.A08 = r0
            r0 = r30
            r14.A0A = r0
            r0 = r29
            r14.A09 = r0
            r0 = r31
            r14.A0p = r0
            r0 = r39
            r14.A0G = r0
            r0 = r62
            r14.A10 = r0
            r5 = r33
            r14.A0B = r5
            r0 = r37
            r14.A0E = r0
            r0 = r43
            r14.A0u = r0
            r14.A12 = r6
            r0 = r24
            r14.A0K = r0
            r0 = r51
            r14.A0w = r0
            r0 = r57
            r14.A0x = r0
            r0 = r80
            r14.A18 = r0
            r0 = r35
            r14.A0r = r0
            r0 = r40
            r14.A0s = r0
            r0 = r22
            r14.A0Q = r0
            r0 = r21
            r14.A0S = r0
            r0 = r26
            r14.A0C = r0
            r14.A0Y = r7
            r0 = r41
            r14.A0t = r0
            r14.A0P = r11
            r14.A0T = r10
            r0 = r78
            r14.A0g = r0
            r0 = r25
            r14.A0J = r0
            r0 = r42
            r14.A0H = r0
            r0 = r79
            r14.A0h = r0
            r0 = r72
            r14.A0c = r0
            r0 = r61
            r14.A0W = r0
            r0 = r69
            r14.A14 = r0
            r14.A0a = r4
            r0 = r32
            r14.A0q = r0
            r0 = r71
            r14.A0b = r0
            r0 = r75
            r14.A0e = r0
            r0 = r81
            r14.A0i = r0
            r14.A17 = r3
            r0 = r60
            r14.A0V = r0
            r0 = r82
            r14.A19 = r0
            r14.A0X = r8
            r0 = r44
            r14.A0I = r0
            r4 = r74
            r14.A15 = r4
            r0 = r36
            r14.A0D = r0
            r0 = r73
            r14.A0d = r0
            r0 = r84
            r14.A1B = r0
            r0 = r45
            r14.A0v = r0
            r0 = r59
            r14.A0y = r0
            r0 = r76
            r14.A16 = r0
            r0 = r55
            r14.A0R = r0
            r0 = r83
            r14.A1A = r0
            X.8RD r0 = new X.8RD
            r0.<init>(r5, r13)
            r14.A0f = r0
            X.B1Q r3 = r9.A0r
            r6 = 0
            if (r3 == 0) goto L_0x01f2
            X.7pL r0 = new X.7pL
            r0.<init>(r3)
        L_0x0173:
            r14.A0U = r0
            X.8XB r0 = new X.8XB
            r0.<init>(r14)
            r14.A0z = r0
            X.0eO r7 = X.0eO.A02
            X.9Le r0 = new X.9Le
            r0.<init>(r14, r2)
            X.0eM r0 = X.AnonymousClass0eN.A00(r7, r0)
            r14.A0j = r0
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321060954645554(0x8109d000112432, double:3.032923428666661E-306)
            boolean r0 = X.182.A06(r0, r13, r2)
            r14.A0o = r0
            X.9Le r2 = new X.9Le
            r0 = r20
            r2.<init>(r14, r0)
            X.0eM r0 = X.AnonymousClass0eN.A00(r7, r2)
            r14.A0k = r0
            X.0r6 r4 = r4.A01
            X.9Jz r3 = new X.9Jz
            r0 = r16
            r3.<init>(r14, r6, r0)
            X.0pz r2 = new X.0pz
            r2.<init>(r3, r4)
            X.0xx r0 = X.AnonymousClass07a.A00(r5)
            X.AnonymousClass11O.A03(r0, r2)
            X.9Le r0 = new X.9Le
            r0.<init>(r14, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A0l = r0
            X.9Le r2 = new X.9Le
            r0 = r17
            r2.<init>(r14, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r2)
            r14.A0n = r0
            X.9Le r7 = new X.9Le
            r0 = r18
            r7.<init>(r14, r0)
            java.lang.Class<X.8XC> r0 = X.AnonymousClass8XC.class
            X.0Yh r4 = new X.0Yh
            r4.<init>(r0)
            X.9Le r3 = new X.9Le
            r0 = r19
            r3.<init>(r5, r0)
            X.9Lu r2 = new X.9Lu
            r2.<init>(r1, r6, r5)
            X.2kA r0 = new X.2kA
            r0.<init>(r3, r7, r2, r4)
            r14.A0m = r0
            return
        L_0x01f2:
            r0 = r6
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XA.<init>(android.app.Activity, android.view.View, android.view.ViewGroup, android.view.ViewGroup, X.848, X.4DH, X.82W, X.84E, X.72N, X.0iw, com.instagram.common.session.UserSession, X.8Yz, X.8S5, X.8QA, X.8QN, X.8Rz, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.85o, X.8Fl, X.8W6, X.8Dt, X.82p, X.823, X.80D, X.81e, X.8VZ, X.8WK, X.8Vl, X.8DD, X.81o, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, X.8WO, X.85O, X.8Ru, X.81i, X.8WH, X.8E5, X.83s, X.81m, X.80U, com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel, X.8Hx, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.88V, X.87s, X.8Cx, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.50r, X.846, X.8PZ, X.80x, X.88F, X.8An, X.8L4, com.instagram.model.direct.DirectShareTarget, com.instagram.model.direct.camera.DirectCameraViewModel):void");
    }
}
