package X;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Iterator;
import java.util.List;

public final class KMU extends LPJ {
    public List A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final LinearLayout A07;
    public final RecyclerView A08;
    public final UserSession A09;
    public final IgFrameLayout A0A;
    public final C64163LRe A0B;
    public final C62517Kh8 A0C;
    public final C60433JlQ A0D;
    public final LEG A0E;
    public final ClipsCreationViewModel A0F;
    public final AnonymousClass8RF A0G;
    public final C61805KMt A0H;
    public final C60108Jfo A0I;
    public final boolean A0J;
    public final ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 A0K;
    public final boolean A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (X.0mk.A02(r14) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0127, code lost:
        if (r37 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r37 != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KMU(android.content.Context r26, android.widget.LinearLayout r27, com.instagram.common.session.UserSession r28, X.C3511387s r29, X.AnonymousClass8RF r30, X.C61805KMt r31, X.C60108Jfo r32, int r33, int r34, boolean r35, boolean r36, boolean r37) {
        /*
            r25 = this;
            r2 = 1
            r11 = 7
            r0 = 8
            r6 = r27
            X.0qQ.A0B(r6, r0)
            r4 = r25
            r4.<init>()
            r15 = r28
            r4.A09 = r15
            r14 = r26
            r4.A06 = r14
            r10 = r33
            r4.A04 = r10
            r3 = r32
            r4.A0I = r3
            r0 = r31
            r4.A0H = r0
            r0 = r30
            r4.A0G = r0
            r4.A07 = r6
            r0 = r34
            r4.A05 = r0
            r9 = r35
            r4.A0L = r9
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0E
            r4.A0F = r0
            r0 = r29
            X.4gw r0 = r0.A04
            boolean r8 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = X.AnonymousClass30D.A08(r15)
            r4.A0J = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r14)
            r0 = 2131626339(0x7f0e0963, float:1.8879911E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r0, r5)
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgFrameLayout
            if (r0 == 0) goto L_0x012e
            com.instagram.common.ui.base.IgFrameLayout r1 = (com.instagram.common.ui.base.IgFrameLayout) r1
        L_0x0054:
            r4.A0A = r1
            if (r1 == 0) goto L_0x012b
            r0 = 2131430076(0x7f0b0abc, float:1.8481843E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r1, r0)
        L_0x005f:
            r4.A08 = r0
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            r7 = 10
            X.MMB r17 = X.MMB.A00(r4, r7)
            if (r8 != 0) goto L_0x0071
            r20 = 1
            if (r37 == 0) goto L_0x0077
        L_0x0071:
            r20 = 0
            if (r8 != 0) goto L_0x0123
            if (r37 != 0) goto L_0x0123
        L_0x0077:
            r21 = 1
        L_0x0079:
            boolean r7 = X.0mk.A02(r14)
            r22 = 1
            if (r7 != 0) goto L_0x0083
        L_0x0081:
            r22 = 0
        L_0x0083:
            boolean r12 = r3.A0l
            r8 = 64
            X.MIW r7 = new X.MIW
            r7.<init>(r3, r8)
            X.JlQ r13 = new X.JlQ
            r23 = r36
            r24 = r12
            r18 = r7
            r19 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0D = r13
            X.L0P r7 = new X.L0P
            r7.<init>(r4)
            X.LEG r8 = new X.LEG
            r8.<init>(r14, r7, r4, r10)
            r4.A0E = r8
            r4.A01 = r2
            if (r35 == 0) goto L_0x0120
            X.Kh8 r7 = X.C62517Kh8.VOICEOVER_TRACK
        L_0x00ad:
            r4.A0C = r7
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 r10 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1
            r10.<init>(r14, r4)
            r4.A0K = r10
            r7 = 11
            X.MMB r19 = X.MMB.A00(r4, r7)
            r7 = 12
            X.MMB r20 = X.MMB.A00(r4, r7)
            r7 = 65
            X.MIW r9 = new X.MIW
            r9.<init>(r4, r7)
            X.LRe r7 = new X.LRe
            r16 = r7
            r17 = r15
            r18 = r3
            r21 = r9
            r16.<init>(r17, r18, r19, r20, r21)
            r4.A0B = r7
            if (r0 == 0) goto L_0x011c
            if (r1 == 0) goto L_0x011c
            r0.setLayoutManager(r10)
            r0.setAdapter(r13)
            r0.setItemAnimator(r5)
            java.util.List r7 = r13.A01
            X.Jlj r5 = new X.Jlj
            r5.<init>(r7)
            r0.A11(r5)
            X.MMB r5 = X.MMB.A00(r4, r11)
            r4.A0K(r14, r3, r5)
            android.widget.FrameLayout r3 = r8.A04
            r1.addView(r3)
            r7 = 0
            X.LnG r5 = new X.LnG
            r5.<init>(r4, r7)
            X.LaF r3 = new X.LaF
            r3.<init>(r0, r5, r2, r2)
            android.view.GestureDetector r2 = r3.A02
            r2.setIsLongpressEnabled(r7)
            r0.A13(r3)
            X.LnJ r2 = new X.LnJ
            r2.<init>(r0, r4)
            r13.A00 = r2
            int r0 = r6.getChildCount()
            r6.addView(r1, r0)
        L_0x011c:
            r4.A0F()
            return
        L_0x0120:
            X.Kh8 r7 = X.C62517Kh8.AUDIO_TRACK
            goto L_0x00ad
        L_0x0123:
            r21 = 0
            if (r8 != 0) goto L_0x0081
            if (r37 != 0) goto L_0x0081
            goto L_0x0079
        L_0x012b:
            r0 = r5
            goto L_0x005f
        L_0x012e:
            r1 = r5
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMU.<init>(android.content.Context, android.widget.LinearLayout, com.instagram.common.session.UserSession, X.87s, X.8RF, X.KMt, X.Jfo, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r13.A03 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r2 < r14.size()) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(java.util.List r14) {
        /*
            r13 = this;
            r4 = 0
            androidx.recyclerview.widget.RecyclerView r8 = r13.A08
            r11 = 0
            if (r8 == 0) goto L_0x00f7
            X.3pI r0 = r8.A0D
            if (r0 == 0) goto L_0x00f7
            android.os.Parcelable r7 = r0.A1M()
        L_0x000e:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineAudioTrackController$scrollingLinearLayoutManager$1 r5 = r13.A0K
            int r2 = r5.A1a()
            r0 = -1
            r6 = 1
            if (r2 == r0) goto L_0x001f
            int r1 = r14.size()
            r0 = 1
            if (r2 >= r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r13.A03 = r0
            X.LSE r3 = X.LSE.A00
            android.content.Context r2 = r13.A06
            java.util.List r1 = r13.A00
            int r0 = r5.A1a()
            int r3 = r3.A02(r2, r14, r1, r0)
            X.Jfo r2 = r13.A0I
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x003d
            if (r3 == 0) goto L_0x003d
            boolean r0 = r13.A03
            r12 = 1
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r12 = 0
        L_0x003e:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r14)
            if (r12 == 0) goto L_0x0052
            X.018.A15(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            X.KMD r0 = new X.KMD
            r0.<init>(r1)
            r5.add(r0)
        L_0x0052:
            X.8RF r9 = r13.A0G
            X.8RH r10 = r9.A0E()
            boolean r0 = r10 instanceof X.C355708Ra
            if (r0 == 0) goto L_0x0084
            r0 = r10
            X.8RZ r0 = (X.AnonymousClass8RZ) r0
            int r1 = r0.A00()
            int r0 = r13.A05
            if (r1 != r0) goto L_0x0084
            X.KMt r0 = r13.A0H
            X.LTY r0 = r0.A01
            int r0 = X.JTS.A03(r0)
            int r0 = r0 * 2
            int r1 = r0 + 2
            if (r8 == 0) goto L_0x007d
            X.3kE r0 = r8.A0W(r1)
            if (r0 == 0) goto L_0x007d
            android.view.View r11 = r0.itemView
        L_0x007d:
            X.JlQ r0 = r13.A0D
            java.util.List r0 = r0.A01
            X.LSE.A01(r11, r5, r0, r1)
        L_0x0084:
            boolean r0 = r10 instanceof X.AnonymousClass8RY
            if (r0 == 0) goto L_0x00a2
            X.JlQ r9 = r13.A0D
            r9.A02(r5, r6)
        L_0x008d:
            if (r12 == 0) goto L_0x009e
            boolean r1 = r13.A0L
            int r0 = r13.A05
            if (r1 == 0) goto L_0x009f
            r2.A04 = r0
        L_0x0097:
            float r0 = (float) r3
            r13.A0G(r0)
            r9.A02(r14, r4)
        L_0x009e:
            return
        L_0x009f:
            r2.A00 = r0
            goto L_0x0097
        L_0x00a2:
            boolean r0 = r10 instanceof X.AnonymousClass8RZ
            if (r0 == 0) goto L_0x00d0
            X.8RH r0 = r9.A0E()
            boolean r0 = r0 instanceof X.C355708Ra
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x00d0
        L_0x00b2:
            X.KMt r0 = r13.A0H
            X.LTY r0 = r0.A01
            int r1 = X.JTR.A0E(r0)
            int r0 = r13.A05
            if (r1 != r0) goto L_0x00d0
            X.JlQ r9 = r13.A0D
            r9.A02(r5, r4)
            if (r8 == 0) goto L_0x008d
            X.3pI r0 = r8.A0D
            if (r0 == 0) goto L_0x00cc
            r0.A1P(r7)
        L_0x00cc:
            r8.scrollBy(r4, r4)
            goto L_0x008d
        L_0x00d0:
            X.JlQ r9 = r13.A0D
            if (r8 == 0) goto L_0x00e6
            boolean r0 = r8.A1E()
            if (r0 != r6) goto L_0x00e6
        L_0x00da:
            java.util.ArrayList r0 = X.00k.A0U(r5)
            r9.A01 = r0
            if (r6 != 0) goto L_0x00e8
            r9.notifyDataSetChanged()
            goto L_0x008d
        L_0x00e6:
            r6 = 0
            goto L_0x00da
        L_0x00e8:
            X.0eM r0 = r9.A05
            android.os.Handler r1 = X.JTO.A0E(r0)
            X.M34 r0 = new X.M34
            r0.<init>(r9)
            r1.post(r0)
            goto L_0x008d
        L_0x00f7:
            r7 = r11
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMU.A0Q(java.util.List):void");
    }

    public static void A00(KMU kmu) {
        RecyclerView recyclerView = kmu.A08;
        if (recyclerView != null) {
            LEG leg = kmu.A0E;
            leg.A08.smoothScrollBy(0, 0);
            recyclerView.A16(leg.A05);
        }
    }

    public static final void A01(KMU kmu) {
        C66473MTb mTb;
        RecyclerView recyclerView = kmu.A08;
        if (recyclerView != null && !recyclerView.A1E()) {
            int i = 0;
            for (Object next : kmu.A0D.A01) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                L40 l40 = (L40) next;
                if (l40 instanceof KMF) {
                    C61194Jyn jyn = ((KMF) l40).A04;
                    if (jyn.A0A == AnonymousClass05K.A0j) {
                        C60997Jut jut = jyn.A08;
                        if (jut != null) {
                            int i3 = kmu.A00;
                            int i4 = kmu.A04 / 2;
                            int i5 = 0;
                            if (i3 > i4) {
                                i5 = i3 - i4;
                            }
                            jut.A00 = i5;
                        }
                        C249703kE A0W = recyclerView.A0W(i);
                        if ((A0W instanceof C66473MTb) && (mTb = (C66473MTb) A0W) != null) {
                            int i6 = kmu.A00;
                            int i7 = kmu.A04 / 2;
                            int i8 = 0;
                            if (i6 > i7) {
                                i8 = i6 - i7;
                            }
                            mTb.FM0(i8);
                        }
                    }
                }
                i = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r2 >= r5.A0D.A01.size()) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.KMU r5) {
        /*
            X.LRe r4 = r5.A0B
            r4.A02()
            X.Jfo r0 = r5.A0I
            java.util.ArrayList r3 = r0.A0H()
            X.KMt r0 = r5.A0H
            X.LTY r0 = r0.A01
            int r0 = X.JTS.A03(r0)
            int r0 = r0 * 2
            int r2 = r0 + 2
            if (r2 < 0) goto L_0x0024
            X.JlQ r0 = r5.A0D
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            if (r2 < r1) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r1 = 0
            if (r0 == 0) goto L_0x0036
            X.JlQ r0 = r5.A0D
            X.KMF r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0036
            X.Jyn r0 = r0.A04
            java.util.List r1 = X.C61194Jyn.A02(r0)
        L_0x0036:
            r4.A04(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMU.A02(X.KMU):void");
    }

    public static final void A03(KMU kmu, int i) {
        C60997Jut jut;
        int i2;
        int i3;
        float f;
        KMU kmu2 = kmu;
        int i4 = i;
        C61805KMt kMt = kmu2.A0H;
        C61194Jyn A0F2 = kMt.A01.A0F();
        if (A0F2 != null && (jut = A0F2.A08) != null) {
            UserSession userSession = kmu2.A09;
            String str = jut.A08;
            0qQ.A0B(str, 1);
            ClipsCreationViewModel clipsCreationViewModel = kMt.A04;
            AudioOverlayTrack A032 = clipsCreationViewModel.A0K.A03(str);
            if (A032 != null) {
                C66338MNv mNv = C66338MNv.A00;
                0qQ.A0B(mNv, 3);
                MusicAssetModel musicAssetModel = A032.A08;
                if (musicAssetModel != null) {
                    i2 = musicAssetModel.A00;
                } else {
                    i2 = A032.A02;
                }
                int A072 = JTO.A07(clipsCreationViewModel);
                int i5 = A032.A01;
                int i6 = A032.A04;
                if (i5 == 0) {
                    i3 = A072 - i6;
                } else {
                    i3 = i5 - i6;
                }
                float f2 = (float) i3;
                AnonymousClass8IJ r8 = A032.A05;
                if (r8 != null) {
                    f = r8.A01;
                } else {
                    f = 1.0f;
                }
                int i7 = i2 - ((int) (f2 * f));
                if (i4 > i7) {
                    i4 = i7;
                }
                String str2 = A032.A0B;
                String str3 = A032.A0A;
                String str4 = A032.A0E;
                MusicBrowseCategory musicBrowseCategory = A032.A09;
                MusicAssetModel musicAssetModel2 = A032.A08;
                DownloadedTrack downloadedTrack = A032.A06;
                float f3 = A032.A00;
                String str5 = str2;
                AnonymousClass8IJ r11 = r8;
                DownloadedTrack downloadedTrack2 = downloadedTrack;
                InstagramAudioApplySource instagramAudioApplySource = A032.A07;
                AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack(r11, downloadedTrack2, instagramAudioApplySource, musicAssetModel2, musicBrowseCategory, str5, str3, str4, A032.A0C, f3, i4, i2 - i4, i6, i5);
                String str6 = A032.A0D;
                0qQ.A0B(str6, 0);
                audioOverlayTrack.A0D = str6;
                kMt.A0D.Epw(audioOverlayTrack);
                new C63924LDf(JTR.A0P(kMt), new C64543Ldk(kMt, audioOverlayTrack, A032, mNv), userSession, audioOverlayTrack).A00();
            }
        }
    }

    public static final void A04(KMU kmu, int i, int i2) {
        C60688JpZ jpZ;
        RecyclerView recyclerView = kmu.A08;
        C249703kE r1 = null;
        if (recyclerView != null) {
            r1 = recyclerView.A0W((JTS.A03(kmu.A0H.A01) * 2) + 2);
        }
        if ((r1 instanceof C61788KMc) && (jpZ = (C60688JpZ) r1) != null) {
            C60059Jea jea = jpZ.A01;
            jea.A0H = i;
            jea.A0G = i2;
        }
    }

    public static final void A05(KMU kmu, String str) {
        AnonymousClass8RH r0;
        C60997Jut jut;
        C61805KMt kMt = kmu.A0H;
        Iterator A1H = C51966G9m.A1H(kMt.A01.A0A.getValue());
        int i = 0;
        while (A1H.hasNext()) {
            Object next = A1H.next();
            int i2 = i + 1;
            if (i >= 0) {
                Iterator A1H2 = C51966G9m.A1H(next);
                int i3 = 0;
                while (A1H2.hasNext()) {
                    Object next2 = A1H2.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C61194Jyn jyn = (C61194Jyn) next2;
                        int ordinal = jyn.A09.ordinal();
                        String str2 = null;
                        if (ordinal == 6) {
                            str2 = jyn.A0B;
                        } else if (ordinal == 5 && (jut = jyn.A08) != null) {
                            str2 = jut.A08;
                        }
                        if (0qQ.A0K(str2, str)) {
                            kMt.A0J(i, i3);
                            Integer valueOf = Integer.valueOf(i);
                            Integer valueOf2 = Integer.valueOf(i3);
                            boolean z = kmu.A0L;
                            AnonymousClass8RF r3 = kmu.A0G;
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (z) {
                                r0 = new C355758Rg(intValue2, intValue);
                            } else {
                                r0 = new C355748Rf(intValue2, intValue);
                            }
                            r3.A0G(r0);
                            return;
                        }
                        i3 = i4;
                    }
                }
                i = i2;
            }
            0sr.A1T();
            throw AnonymousClass00P.createAndThrow();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0O(X.AnonymousClass8RH r16) {
        /*
            r15 = this;
            r2 = r16
            r5 = 0
            boolean r0 = r2 instanceof X.C355748Rf
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r2 instanceof X.AnonymousClass8RY
            if (r0 == 0) goto L_0x01ad
            X.8RY r2 = (X.AnonymousClass8RY) r2
            int r1 = r2.A01
            int r0 = r15.A05
            if (r1 != r0) goto L_0x01be
            r0 = 2
            int[] r4 = new int[r0]
            int r0 = r2.A00
            int r0 = r0 * 2
            int r2 = r0 + 2
            androidx.recyclerview.widget.RecyclerView r1 = r15.A08
            if (r1 == 0) goto L_0x0062
            X.3kE r0 = r1.A0W(r2)
            if (r0 == 0) goto L_0x002d
            android.view.View r0 = r0.itemView
            if (r0 == 0) goto L_0x002d
            r0.getLocationInWindow(r4)
        L_0x002d:
            X.3kE r0 = r1.A0W(r2)
            if (r0 == 0) goto L_0x0062
            android.view.View r0 = r0.itemView
            if (r0 == 0) goto L_0x0062
            int r0 = r0.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x003f:
            android.content.Context r0 = r15.A06
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            int r2 = r1.getDimensionPixelSize(r0)
            if (r3 == 0) goto L_0x0060
            int r8 = r15.A04
            int r1 = r3.intValue()
            r0 = r4[r5]
            int r1 = r1 + r0
            int r8 = r8 - r1
            int r8 = r8 + r2
        L_0x0059:
            X.LEG r3 = r15.A0E
            r11 = r4[r5]
            int r11 = r11 + r2
            monitor-enter(r3)
            goto L_0x0064
        L_0x0060:
            r8 = 0
            goto L_0x0059
        L_0x0062:
            r3 = 0
            goto L_0x003f
        L_0x0064:
            X.KMU r0 = r3.A07     // Catch:{ all -> 0x01aa }
            X.KMt r0 = r0.A0H     // Catch:{ all -> 0x01aa }
            X.LTY r0 = r0.A01     // Catch:{ all -> 0x01aa }
            X.Jyn r9 = r0.A0F()     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x01a8
            java.lang.Integer r1 = r9.A0A     // Catch:{ all -> 0x01aa }
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x01aa }
            if (r1 != r0) goto L_0x0193
            int r10 = r9.A05     // Catch:{ all -> 0x01aa }
            if (r10 < 0) goto L_0x0193
            X.Jdt r6 = r3.A09     // Catch:{ all -> 0x01aa }
            r0 = 0
            r1 = 1
            r6.A04 = r1     // Catch:{ all -> 0x01aa }
            X.Jut r7 = r9.A08     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0089
            java.util.List r1 = r7.A09     // Catch:{ all -> 0x01aa }
        L_0x0086:
            r6.A03 = r1     // Catch:{ all -> 0x01aa }
            goto L_0x008b
        L_0x0089:
            r1 = 0
            goto L_0x0086
        L_0x008b:
            if (r7 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r1 = 0
            goto L_0x0092
        L_0x0090:
            int r1 = r7.A04     // Catch:{ all -> 0x01aa }
        L_0x0092:
            r6.A01 = r1     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0098
            int r0 = r7.A02     // Catch:{ all -> 0x01aa }
        L_0x0098:
            r6.A02 = r0     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a2
        L_0x00a0:
            float r0 = r7.A01     // Catch:{ all -> 0x01aa }
        L_0x00a2:
            r6.A00 = r0     // Catch:{ all -> 0x01aa }
            r6.invalidate()     // Catch:{ all -> 0x01aa }
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()     // Catch:{ all -> 0x01aa }
            if (r1 == 0) goto L_0x0189
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch:{ all -> 0x01aa }
            X.LSI r14 = X.LSI.A05     // Catch:{ all -> 0x01aa }
            android.widget.FrameLayout r4 = r3.A04     // Catch:{ all -> 0x01aa }
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r4)     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x00c9
            java.util.List r0 = r7.A09     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x00c9
            int r12 = r0.size()     // Catch:{ all -> 0x01aa }
        L_0x00c1:
            float r0 = r7.A01     // Catch:{ all -> 0x01aa }
            java.lang.Float r13 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01aa }
        L_0x00c7:
            monitor-enter(r14)     // Catch:{ all -> 0x01aa }
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            if (r7 != 0) goto L_0x00c1
            r13 = 0
            goto L_0x00c7
        L_0x00ce:
            float r12 = (float) r12     // Catch:{ all -> 0x01aa }
            r0 = 1107296256(0x42000000, float:32.0)
            float r12 = r12 * r0
            if (r13 == 0) goto L_0x00d5
            goto L_0x00d8
        L_0x00d5:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00dc
        L_0x00d8:
            float r0 = r13.floatValue()     // Catch:{ all -> 0x0190 }
        L_0x00dc:
            float r12 = r12 / r0
            int r0 = (int) r12     // Catch:{ all -> 0x0190 }
            int r0 = X.C63117Krl.A00(r2, r0)     // Catch:{ all -> 0x0190 }
            monitor-exit(r14)     // Catch:{ all -> 0x01aa }
            r1.width = r0     // Catch:{ all -> 0x01aa }
            int r0 = X.JTT.A02(r2)     // Catch:{ all -> 0x01aa }
            r1.height = r0     // Catch:{ all -> 0x01aa }
            r1.setMarginStart(r11)     // Catch:{ all -> 0x01aa }
            r1.setMarginEnd(r8)     // Catch:{ all -> 0x01aa }
            r6.setLayoutParams(r1)     // Catch:{ all -> 0x01aa }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ all -> 0x01aa }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x01aa }
            int r12 = r0.widthPixels     // Catch:{ all -> 0x01aa }
            android.view.View r8 = r3.A03     // Catch:{ all -> 0x01aa }
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()     // Catch:{ all -> 0x01aa }
            if (r6 == 0) goto L_0x0182
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0126
            int r0 = r7.A02     // Catch:{ all -> 0x01aa }
        L_0x010c:
            int r0 = X.C63117Krl.A00(r2, r0)     // Catch:{ all -> 0x01aa }
            int r1 = r3.A02     // Catch:{ all -> 0x01aa }
            int r0 = r0 + r1
            r6.width = r0     // Catch:{ all -> 0x01aa }
            int r0 = r12 / 2
            int r11 = r11 - r0
            int r0 = X.C63117Krl.A00(r2, r10)     // Catch:{ all -> 0x01aa }
            int r11 = r11 - r0
            r6.setMarginStart(r11)     // Catch:{ all -> 0x01aa }
            r8.setLayoutParams(r6)     // Catch:{ all -> 0x01aa }
            int r9 = r9.A02     // Catch:{ all -> 0x01aa }
            goto L_0x0128
        L_0x0126:
            r0 = 0
            goto L_0x010c
        L_0x0128:
            boolean r8 = X.AnonymousClass7TF.A1R(r9)
            X.Jd0 r6 = r3.A0A     // Catch:{ all -> 0x01aa }
            int r1 = r1 / 2
            int r0 = X.C63117Krl.A00(r2, r10)     // Catch:{ all -> 0x01aa }
            int r0 = r0 + r1
            r6.A00 = r0     // Catch:{ all -> 0x01aa }
            if (r8 == 0) goto L_0x013e
            if (r7 == 0) goto L_0x013c
            goto L_0x0140
        L_0x013c:
            int r0 = -r9
            goto L_0x0142
        L_0x013e:
            r0 = 0
            goto L_0x0142
        L_0x0140:
            int r0 = r7.A02     // Catch:{ all -> 0x01aa }
        L_0x0142:
            int r0 = X.C63117Krl.A00(r2, r0)     // Catch:{ all -> 0x01aa }
            int r0 = r0 + r1
            r6.A01 = r0     // Catch:{ all -> 0x01aa }
            if (r8 != 0) goto L_0x0152
            if (r7 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r9 = 0
            goto L_0x0152
        L_0x0150:
            int r9 = r7.A02     // Catch:{ all -> 0x01aa }
        L_0x0152:
            int r0 = X.C63117Krl.A00(r2, r9)     // Catch:{ all -> 0x01aa }
            int r1 = r1 + r0
            r6.A02 = r1     // Catch:{ all -> 0x01aa }
            X.C59991Jd0.A00(r6)     // Catch:{ all -> 0x01aa }
            X.C59991Jd0.A00(r6)     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0164
            int r0 = r7.A04     // Catch:{ all -> 0x01aa }
            goto L_0x0165
        L_0x0164:
            r0 = 0
        L_0x0165:
            float r1 = (float) r0     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x016e
        L_0x016c:
            float r0 = r7.A01     // Catch:{ all -> 0x01aa }
        L_0x016e:
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch:{ all -> 0x01aa }
            int r2 = X.C63117Krl.A00(r2, r0)     // Catch:{ all -> 0x01aa }
            com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView r1 = r3.A08     // Catch:{ all -> 0x01aa }
            X.M6t r0 = new X.M6t     // Catch:{ all -> 0x01aa }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x01aa }
            r1.post(r0)     // Catch:{ all -> 0x01aa }
            r4.setVisibility(r5)     // Catch:{ all -> 0x01aa }
            goto L_0x01a8
        L_0x0182:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0192
        L_0x0189:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x01aa }
            goto L_0x0192
        L_0x0190:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01aa }
        L_0x0192:
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x0193:
            android.widget.FrameLayout r0 = r3.A04     // Catch:{ all -> 0x01aa }
            android.content.Context r2 = r0.getContext()     // Catch:{ all -> 0x01aa }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x01aa }
            r0 = 2131955836(0x7f13107c, float:1.954821E38)
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x01aa }
            r0 = 0
            X.C59689JTv.A02(r2, r1, r0, r5)     // Catch:{ all -> 0x01aa }
        L_0x01a8:
            monitor-exit(r3)
            return
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01ad:
            boolean r0 = r2 instanceof X.C355828Rn
            if (r0 != 0) goto L_0x01be
            boolean r0 = r2 instanceof X.C355798Rk
            if (r0 != 0) goto L_0x01be
        L_0x01b5:
            X.LEG r0 = r15.A0E
            android.widget.FrameLayout r1 = r0.A04
            r0 = 8
            r1.setVisibility(r0)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMU.A0O(X.8RH):void");
    }

    public final void A0P(Integer num, float f, float f2) {
        int i;
        int i2;
        KMF A002;
        int i3;
        C60997Jut jut;
        int A1a = this.A0K.A1a();
        float f3 = 0.0f;
        for (int i4 = 0; i4 < A1a; i4++) {
            C60433JlQ jlQ = this.A0D;
            Context context = this.A06;
            if (!(i4 == 0 || i4 == jlQ.getItemCount() - 1 || jlQ.A01.isEmpty())) {
                boolean z = false;
                if (i4 % 2 == 0) {
                    z = true;
                    KMF A003 = jlQ.A00(i4);
                    if (A003 != null) {
                        i2 = A003.A04.A05;
                    }
                    i2 = 0;
                } else {
                    if (!(i4 == 1 || (A002 = jlQ.A00(i4 - 1)) == null)) {
                        i2 = A002.A04.A02;
                    }
                    i2 = 0;
                }
                if (z) {
                    KMF A004 = jlQ.A00(i4);
                    if (A004 != null) {
                        i3 = A004.A04.A02;
                    }
                    i3 = 0;
                } else if (i4 == jlQ.A01.size() - 2) {
                    KMF A005 = jlQ.A00(i4 - 3);
                    if (!(A005 == null || (jut = A005.A04.A08) == null)) {
                        i3 = jut.A02;
                    }
                    i3 = 0;
                } else {
                    KMF A006 = jlQ.A00(i4 + 1);
                    if (A006 != null) {
                        i3 = A006.A04.A05;
                    }
                    i3 = 0;
                }
                i = i3 - i2;
                if (i >= 0) {
                    float f4 = (float) i;
                    f3 -= (float) (((int) (JTS.A01(context, f2) * f4)) - ((int) (JTS.A01(context, f) * f4)));
                }
            }
            i = 0;
            float f42 = (float) i;
            f3 -= (float) (((int) (JTS.A01(context, f2) * f42)) - ((int) (JTS.A01(context, f) * f42)));
        }
        if (num != null) {
            Context context2 = this.A06;
            float intValue = (float) num.intValue();
            f3 += (JTS.A01(context2, f2) * intValue) - (JTS.A01(context2, f) * intValue);
            this.A00 = (int) (JTS.A01(context2, f2) * intValue);
        }
        this.A0H.A0I(this.A05);
        A01(this);
        A0G(f3);
    }

    public final boolean A0R() {
        AnonymousClass8RH A0E2 = this.A0G.A0E();
        if ((A0E2 instanceof AnonymousClass8RU) || (A0E2 instanceof AnonymousClass8RW) || (A0E2 instanceof C355708Ra) || (A0E2 instanceof C355718Rb) || (A0E2 instanceof AnonymousClass8RY) || (A0E2 instanceof AnonymousClass8RV) || (A0E2 instanceof C355828Rn) || (A0E2 instanceof AnonymousClass8RX) || this.A02) {
            return false;
        }
        return true;
    }

    public static void A06(Iterator it, int i) {
        IgFrameLayout igFrameLayout;
        KMU kmu = (KMU) it.next();
        if (kmu.A0J && (igFrameLayout = kmu.A0A) != null) {
            igFrameLayout.setVisibility(i);
        }
    }

    public final void A0N() {
        int i;
        A00(this);
        LEG leg = this.A0E;
        synchronized (leg) {
            i = leg.A01;
        }
        this.A0H.A0O(i);
        synchronized (leg) {
            leg.A08.post(new C65982M6t(leg, leg.A01));
        }
        AnonymousClass8RF r3 = this.A0G;
        int i2 = -1;
        if (this.A0J) {
            i2 = 2;
        }
        r3.A0G(new C355748Rf(i2, 0));
    }
}
