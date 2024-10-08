package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

public final class GVT extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, AnonymousClass4DS, C321686ua, C320316sB {
    public static final String __redex_internal_original_name = "AudioPageFragment";
    public long A00;
    public View A01;
    public C54689HOu A02;
    public AnonymousClass8ZN A03;
    public C54191H2l A04;
    public C60112Jft A05;
    public AudioPageMetadata A06;
    public C320506sU A07;
    public C331157Pu A08;
    public Dc2 A09;
    public AudioType A0A;
    public MusicAssetModel A0B;
    public JS8 A0C;
    public HM8 A0D;
    public GVX A0E;
    public C53012Gh3 A0F;
    public C53087GiL A0G;
    public IO9 A0H;
    public IOB A0I;
    public C53044Ghc A0J;
    public IO8 A0K;
    public C52980GgX A0L;
    public I4J A0M;
    public C320516sV A0N;
    public Long A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public 1Ng A0d;
    public ImageUrl A0e;
    public AnonymousClass2uE A0f;
    public C249763kK A0g;
    public Boolean A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m;
    public final int A0n = 30000;
    public final AnonymousClass0eM A0o = C227642jf.A02(this);
    public final 1wn A0p = new IO4((Object) this, 18);

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    public final void D46(C267324bN r12, int i) {
        String str;
        DTA Anl;
        String str2;
        0qQ.A0B(r12, 0);
        UserSession A0l2 = AnonymousClass7TE.A0l(this.A0o);
        1Xj r7 = r12.A02;
        if (r7 != null) {
            String str3 = this.A0T;
            C320506sU r8 = this.A07;
            ClipChainType clipChainType = null;
            if (r8 == null) {
                str2 = "pivotPageSessionProvider";
            } else {
                C52086GEg.A0Y(this, A0l2, r7, r8, str3, i);
                C53044Ghc ghc = this.A0J;
                if (ghc == null) {
                    str2 = "audioPageViewModel";
                } else {
                    String str4 = this.A0P;
                    if (str4 == null) {
                        str2 = "assetId";
                    } else {
                        AudioType audioType = this.A0A;
                        if (audioType == null) {
                            audioType = AudioType.ORIGINAL_AUDIO;
                        }
                        String id = r12.getId();
                        1Xj r0 = r12.A02;
                        if (!(r0 == null || (Anl = r0.A0C.Anl()) == null)) {
                            clipChainType = Anl.Ans();
                        }
                        GVR gvr = (GVR) ghc.A04.A02();
                        if (gvr != null) {
                            str = gvr.A09;
                        } else {
                            str = null;
                        }
                        AnonymousClass7TE.A1Z(new C58087Ilq(ghc, audioType, clipChainType, id, str, str4, (AnonymousClass4D7) null, 1), C318116oQ.A00(ghc));
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ void DyE() {
    }

    public final void configureActionBar(2da r14) {
        OriginalAudioSubtype originalAudioSubtype;
        1ro r0;
        C67051rn r02;
        int i;
        ID2 id2;
        0qQ.A0B(r14, 0);
        boolean z = false;
        if (this.A08 == null || !this.A0c) {
            Context requireContext = requireContext();
            r14.setTitle(requireContext.getString(2131953291));
            if (this.A08 != null) {
                r14.Etr(true);
            } else {
                r14.Eu4(true);
            }
            GVX gvx = this.A0E;
            if (gvx != null) {
                AnonymousClass0eM r2 = this.A0o;
                C46498Dg1 A002 = C46498Dg1.A00(requireContext, r2);
                boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(r2, 0), 36324621481554108L);
                String str = gvx.A03;
                C2606046i r8 = null;
                if (str != null) {
                    boolean A0K2 = 0qQ.A0K(DbX.A0l(AnonymousClass0t1.A01, r2).getId(), str);
                    if (A0K2 || gvx.A06 == null) {
                        if (gvx.A05 != null && gvx.A08) {
                            A002.A04(new ID2(gvx, this, 64), 2131972149);
                        }
                        if (A0K2) {
                            C2606046i r03 = gvx.A01;
                            if (r03 != null) {
                                originalAudioSubtype = r03.Ads();
                            } else {
                                originalAudioSubtype = null;
                            }
                            if (!(originalAudioSubtype != OriginalAudioSubtype.A04 || (r0 = gvx.A00) == null || (r02 = r0.A00) == null)) {
                                i = 2131967824;
                                if (r02.getShouldAllowRestore()) {
                                    id2 = new ID2(gvx, this, 65);
                                }
                            }
                        }
                    } else {
                        i = 2131972204;
                        id2 = new ID2(gvx, this, 63);
                    }
                    A002.A04(id2, i);
                }
                A002.A04(new ID2(gvx, this, 66), 2131971570);
                if (AnonymousClass30D.A0A(AnonymousClass7TE.A0l(r2)) && this.A0B != null) {
                    ID1.A02(A002, this, 69, 2131973136);
                }
                if (C14290TtO.A00(AnonymousClass7TE.A0l(r2))) {
                    A002.A04(new ID2(gvx, this, 67), 2131971010);
                }
                if (!A002.A09.isEmpty()) {
                    AnonymousClass3JR A0K3 = DbS.A0K();
                    A0K3.A06 = R.drawable.instagram_more_vertical_pano_outline_24;
                    A0K3.A05 = 2131966173;
                    A0K3.A0G = new ID2(68, (Object) A002, (Object) this);
                    this.A01 = C51970G9q.A0P(A0K3, r14);
                }
                IO9 io9 = this.A0H;
                if (io9 != null) {
                    C53044Ghc ghc = this.A0J;
                    if (ghc != null) {
                        2Fk r1 = ghc.A05;
                        C53315Gm1 gm1 = (C53315Gm1) r1.A02();
                        if (gm1 != null) {
                            r8 = gm1.A02;
                        }
                        C53315Gm1 gm12 = (C53315Gm1) r1.A02();
                        if ((gm12 == null || !gm12.A07) && r8 != null && r8.Ce0()) {
                            OriginalAudioSubtype Ads = r8.Ads();
                            if (AnonymousClass3ZJ.A08(Ads, io9.A0R) || Ads == OriginalAudioSubtype.A05 || Ads == OriginalAudioSubtype.A04) {
                                AnonymousClass3JR A0K4 = DbS.A0K();
                                A0K4.A06 = R.drawable.ufi_save_icon;
                                A0K4.A05 = 2131972505;
                                A0K4.A0G = ID1.A00(this, 70);
                                View A8p = r14.A8p(new AnonymousClass3Jb(A0K4));
                                C53044Ghc ghc2 = this.A0J;
                                if (ghc2 != null) {
                                    C53315Gm1 gm13 = (C53315Gm1) ghc2.A05.A02();
                                    if (gm13 != null && gm13.A04) {
                                        z = true;
                                    }
                                    A8p.setSelected(z);
                                }
                            }
                        }
                        if (A062) {
                            AnonymousClass3JR A0K5 = DbS.A0K();
                            A0K5.A06 = R.drawable.instagram_arrow_up_right_pano_outline_24;
                            A0K5.A05 = 2131975524;
                            A0K5.A0G = C56801ICy.A00(this, 0);
                            View A8p2 = r14.A8p(new AnonymousClass3Jb(A0K5));
                            IO9 io92 = this.A0H;
                            if (io92 != null) {
                                io92.A01(A8p2);
                                if (gvx.A01 != null && !AnonymousClass4AJ.A0C(AnonymousClass7TE.A0l(r2))) {
                                    A002.A04(new ID2(gvx, this, 69), 2131973446);
                                    return;
                                }
                                return;
                            }
                        } else if (gvx.A01 != null && !AnonymousClass4AJ.A0C(AnonymousClass7TE.A0l(r2))) {
                            AnonymousClass3JR A0K6 = DbS.A0K();
                            A0K6.A06 = R.drawable.instagram_direct_pano_outline_24;
                            A0K6.A05 = 2131973446;
                            A0K6.A0G = new ID2(gvx, this, 70);
                            r14.A8p(new AnonymousClass3Jb(A0K6));
                            return;
                        } else {
                            return;
                        }
                    }
                    0qQ.A0F("audioPageViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("audioPageMetadataController");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        r14.Etr(false);
        this.A0c = false;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "audio_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C331157Pu A002;
        String str;
        Context requireContext;
        int i3;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        AudioPageMetadata audioPageMetadata = this.A06;
        if (audioPageMetadata == null) {
            str = "audioPageMetadata";
        } else {
            if (AnonymousClass7TF.A1V(audioPageMetadata.A0C)) {
                if (i != 1361) {
                    return;
                }
            } else if (i == 9587) {
                if (i2 == 9683) {
                    FG7.A01(requireContext(), AnonymousClass7TE.A0l(this.A0o));
                    return;
                }
                return;
            } else if (i == 9689) {
                if (i2 == 9689) {
                    requireActivity().setResult(9689);
                    DbT.A1K(this);
                    return;
                }
                return;
            } else if (i == 1355) {
                if (i2 == 1357) {
                    requireContext = requireContext();
                    i3 = 2131973138;
                } else if (i2 == 1359) {
                    requireContext = requireContext();
                    i3 = 2131972082;
                } else {
                    return;
                }
                C59689JTv.A07(requireContext, i3);
                return;
            } else if (i != 1361) {
                return;
            }
            C331157Pu r0 = this.A08;
            if (r0 != null) {
                r0.A08();
            } else {
                AnonymousClass37D A0i2 = DbX.A0i(this);
                if (!(A0i2 == null || (A002 = C48943Emh.A00(A0i2)) == null)) {
                    A002.A07();
                }
            }
            JS8 js8 = this.A0C;
            if (js8 == null) {
                str = "saveSongToStreamingAppViewModel";
            } else {
                FragmentActivity requireActivity = requireActivity();
                C53042Gha gha = (C53042Gha) js8;
                HDY hdy = (HDY) gha.A04.getValue();
                UserSession userSession = gha.A03;
                C74382Ptx ptx = gha.A02;
                0qQ.A0B(ptx, 4);
                AnonymousClass7TE.A1Z(new C59703JUk((Activity) requireActivity, intent2, hdy, ptx, userSession, (AnonymousClass4D7) null, i4), hdy.A01);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("args_audio_model");
        if (parcelable != null) {
            AudioPageMetadata audioPageMetadata = (AudioPageMetadata) parcelable;
            C71662eb A0S2 = DbY.A0S(view, R.id.restricted_banner);
            1Ng r2 = this.A0d;
            if (r2 == null) {
                str = "igEventBus";
            } else {
                r2.A01(this.A0p, C57069INj.class);
                C53044Ghc ghc = this.A0J;
                str = "audioPageViewModel";
                if (ghc != null) {
                    ghc.A07.A06(getViewLifecycleOwner(), new IHI(2, audioPageMetadata, A0S2, this));
                    C53044Ghc ghc2 = this.A0J;
                    if (ghc2 != null) {
                        ghc2.A05.A06(getViewLifecycleOwner(), new IHJ(audioPageMetadata, this, 1));
                        C53044Ghc ghc3 = this.A0J;
                        if (ghc3 != null) {
                            ghc3.A04.A06(getViewLifecycleOwner(), new IHJ(audioPageMetadata, this, 2));
                            C53044Ghc ghc4 = this.A0J;
                            if (ghc4 != null) {
                                ghc4.A06.A06(getViewLifecycleOwner(), new IHJ(audioPageMetadata, this, 3));
                                C53012Gh3 gh3 = this.A0F;
                                if (gh3 == null) {
                                    str = "audioPageAudioFiltersViewModel";
                                } else {
                                    gh3.A00.A06(getViewLifecycleOwner(), new IHH(this, 2));
                                    C53044Ghc ghc5 = this.A0J;
                                    if (ghc5 != null) {
                                        DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 28), ghc5.A0I);
                                        C53044Ghc ghc6 = this.A0J;
                                        if (ghc6 != null) {
                                            DbZ.A1C(this, C58103ImP.A01(this, (AnonymousClass4D7) null, 29), ghc6.A0J);
                                            C60112Jft jft = this.A05;
                                            if (jft == null) {
                                                str = "renameOriginalAudioViewModel";
                                            } else {
                                                jft.A00.A06(getViewLifecycleOwner(), new IHH(this, 3));
                                                IgFragmentActivity requireActivity = requireActivity();
                                                AudioPageMetadata audioPageMetadata2 = this.A06;
                                                if (audioPageMetadata2 == null) {
                                                    str = "audioPageMetadata";
                                                } else if (audioPageMetadata2.A0C != null && (requireActivity instanceof IgFragmentActivity)) {
                                                    requireActivity.registerOnActivityResultListener(new IO7(this, 2));
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(GVT gvt) {
        BaseFragmentActivity baseFragmentActivity;
        if (gvt.A08 != null) {
            2dZ.A0t.A04(gvt).A0T();
            return;
        }
        Activity rootActivity = gvt.getRootActivity();
        if ((rootActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) rootActivity) != null) {
            baseFragmentActivity.A0Z();
        }
    }

    public static final void A01(GVT gvt, boolean z) {
        View view = gvt.mView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.requireViewById(R.id.metadata_bar).getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            ((C298055sn) layoutParams).A00 = z ? 1 : 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3T() {
        /*
            r27 = this;
            r5 = r27
            X.6sV r0 = r5.A0N
            java.lang.String r22 = "clipsGridAdapter"
            if (r0 == 0) goto L_0x0092
            java.util.List r0 = r0.A01()
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            X.6sp r0 = (X.C320716sp) r0
            X.4bN r0 = r0.A03
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x0056
            X.0eM r0 = r5.A0o
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r21 = X.GKS.A04(r0, r1)
        L_0x0025:
            X.6sV r0 = r5.A0N
            if (r0 == 0) goto L_0x0092
            java.util.List r0 = r0.A01()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0036:
            boolean r0 = r3.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.6sp r0 = (X.C320716sp) r0
            X.4bN r0 = r0.A03
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0036
            X.1Xy r0 = r0.A0C
            X.DTA r0 = r0.Anl()
            if (r0 == 0) goto L_0x0036
            r6.add(r1)
            goto L_0x0036
        L_0x0056:
            r21 = 0
            goto L_0x0025
        L_0x0059:
            r3 = 10
            int r0 = X.0Yv.A1E(r6, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.6sp r0 = (X.C320716sp) r0
            X.4bN r0 = r0.A03
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x008a
            X.1Xy r0 = r0.A0C
            X.DTA r0 = r0.Anl()
            if (r0 == 0) goto L_0x008a
            X.BE4 r0 = r0.F1O()
        L_0x0086:
            r7.add(r0)
            goto L_0x0068
        L_0x008a:
            r0 = 0
            goto L_0x0086
        L_0x008c:
            X.H2l r0 = r5.A04
            if (r0 != 0) goto L_0x009a
            java.lang.String r22 = "clipsAudioPagePerfLogger"
        L_0x0092:
            X.0qQ.A0F(r22)
        L_0x0095:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009a:
            r0.D3T()
            boolean r0 = r5.A0m
            if (r0 != 0) goto L_0x030e
            r5.A0m = r2
            X.Ghc r0 = r5.A0J
            if (r0 != 0) goto L_0x00aa
            java.lang.String r22 = "audioPageViewModel"
            goto L_0x0092
        L_0x00aa:
            X.2Fk r0 = r0.A07
            java.lang.Object r6 = r0.A02()
            X.GVW r6 = (X.GVW) r6
            if (r6 == 0) goto L_0x022b
            X.46i r0 = r6.A03
            if (r0 == 0) goto L_0x022b
            com.instagram.api.schemas.OriginalAudioSubtype r13 = r0.Ads()
        L_0x00bc:
            X.0eM r0 = r5.A0o
            r26 = r0
            java.lang.Object r2 = r26.getValue()
            X.0lg r2 = (X.0lg) r2
            long r0 = r5.A00
            r24 = r0
            java.lang.String r14 = r5.A0T
            java.lang.String r12 = r5.A0S
            java.lang.String r9 = r5.A0X
            if (r6 == 0) goto L_0x0228
            X.46i r0 = r6.A03
            if (r0 == 0) goto L_0x0228
            com.instagram.music.common.model.AudioType r0 = r0.Adv()
        L_0x00da:
            X.HOL r20 = X.C55059HbU.A00(r0)
            if (r13 == 0) goto L_0x0225
            java.lang.String r11 = X.C55060HbV.A00(r13)
        L_0x00e4:
            X.HOu r0 = r5.A02
            java.lang.String r19 = "actionSource"
            if (r0 == 0) goto L_0x031c
            if (r6 == 0) goto L_0x021f
            java.util.List r1 = r6.A06
            if (r1 == 0) goto L_0x021f
            int r10 = r1.size()
        L_0x00f4:
            X.Gms r8 = r6.A00
        L_0x00f6:
            X.6sU r1 = r5.A07
            java.lang.String r22 = "pivotPageSessionProvider"
            if (r1 == 0) goto L_0x0092
            boolean r15 = r5.A0l
            r23 = r15
            java.lang.Object r15 = r26.getValue()
            com.instagram.common.session.UserSession r15 = (com.instagram.common.session.UserSession) r15
            boolean r18 = X.AnonymousClass3ZJ.A08(r13, r15)
            r17 = 0
            X.0qQ.A0B(r2, r4)
            X.0wc r15 = X.AnonymousClass0kN.A01(r5, r2)
            java.lang.String r13 = "instagram_organic_audio_page_impression"
            X.0kJ r2 = r15.A00
            X.0Aj r2 = r15.A00(r2, r13)
            boolean r13 = r2.isSampled()
            if (r13 == 0) goto L_0x0243
            java.lang.String r15 = "audio_page"
            java.lang.String r13 = "containermodule"
            r2.AAJ(r13, r15)
            java.lang.Long r15 = java.lang.Long.valueOf(r24)
            java.lang.String r13 = "container_id"
            r2.A9F(r13, r15)
            r16 = 0
            if (r12 == 0) goto L_0x021b
            java.lang.Long r15 = X.00y.A0n(r3, r12)
        L_0x0139:
            java.lang.String r13 = "media_author_id"
            r2.A9F(r13, r15)
            if (r14 == 0) goto L_0x0217
            java.lang.Long r14 = X.00y.A0n(r3, r14)
        L_0x0144:
            java.lang.String r13 = "media_id"
            r2.A9F(r13, r14)
            java.lang.String r13 = "action_source"
            r2.A8M(r0, r13)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r13 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r13)
            java.lang.String r13 = "audio_type"
            r0 = r20
            r2.A8M(r0, r13)
            java.lang.String r0 = "audio_sub_type"
            r2.AAJ(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            java.lang.String r0 = "audio_mix_flag"
            r2.A7p(r0, r11)
            if (r12 == 0) goto L_0x0213
            java.lang.Long r11 = X.00y.A0n(r3, r12)
        L_0x0174:
            java.lang.String r0 = "audio_owner_id"
            r2.A9F(r0, r11)
            X.8ZN r11 = r1.A02
            java.lang.String r0 = "pivot_page_entry_point"
            r2.A8M(r11, r0)
            java.lang.String r1 = r1.getSessionId()
            java.lang.String r0 = "pivot_page_session_id"
            r2.AAJ(r0, r1)
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "initial_page_size"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "artist_pinning_flag"
            r2.A7p(r0, r1)
            if (r8 == 0) goto L_0x01c0
            X.Gk6 r10 = new X.Gk6
            r10.<init>()
            int r0 = r8.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "clips_count"
            r10.A05(r0, r1)
            int r0 = r8.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "photos_count"
            r10.A05(r0, r1)
            java.lang.String r0 = "media_count"
            r2.AAK(r10, r0)
        L_0x01c0:
            if (r9 == 0) goto L_0x01c7
            java.lang.String r0 = "media_tap_token"
            r2.AAJ(r0, r9)
        L_0x01c7:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0230
            int r0 = X.0Yv.A1E(r7, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r10 = r7.iterator()
        L_0x01dc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r9 = r10.next()
            X.BE4 r9 = (X.BE4) r9
            if (r9 == 0) goto L_0x0210
            X.Gk7 r7 = new X.Gk7
            r7.<init>()
            com.instagram.api.schemas.ClipChainType r0 = r9.A01
            java.lang.String r1 = r0.A00
            r0 = 611(0x263, float:8.56E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A06(r0, r1)
            int r0 = r9.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2793(0xae9, float:3.914E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A05(r0, r1)
        L_0x020c:
            r8.add(r7)
            goto L_0x01dc
        L_0x0210:
            r7 = r16
            goto L_0x020c
        L_0x0213:
            r11 = r16
            goto L_0x0174
        L_0x0217:
            r14 = r16
            goto L_0x0144
        L_0x021b:
            r15 = r16
            goto L_0x0139
        L_0x021f:
            r10 = 0
            if (r6 != 0) goto L_0x00f4
            r8 = 0
            goto L_0x00f6
        L_0x0225:
            r11 = 0
            goto L_0x00e4
        L_0x0228:
            r0 = 0
            goto L_0x00da
        L_0x022b:
            r13 = 0
            goto L_0x00bc
        L_0x022e:
            r16 = r8
        L_0x0230:
            java.lang.String r1 = "clip_chain_metadata"
            r0 = r16
            r2.AAe(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            java.lang.String r0 = "filter_type_flag"
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x0243:
            java.lang.Object r13 = r26.getValue()
            X.0lg r13 = (X.0lg) r13
            long r1 = r5.A00
            java.lang.String r12 = r5.A0T
            java.lang.String r9 = r5.A0S
            java.lang.String r7 = r5.A0X
            if (r6 == 0) goto L_0x0319
            X.46i r0 = r6.A03
            if (r0 == 0) goto L_0x0319
            com.instagram.music.common.model.AudioType r0 = r0.Adv()
        L_0x025b:
            X.HOL r10 = X.C55059HbU.A00(r0)
            if (r6 == 0) goto L_0x0316
            X.46i r0 = r6.A03
            if (r0 == 0) goto L_0x0316
            com.instagram.api.schemas.OriginalAudioSubtype r0 = r0.Ads()
            if (r0 == 0) goto L_0x0316
            java.lang.String r8 = X.C55060HbV.A00(r0)
        L_0x026f:
            X.HOu r11 = r5.A02
            if (r11 == 0) goto L_0x031c
            if (r6 == 0) goto L_0x027d
            java.util.List r0 = r6.A06
            if (r0 == 0) goto L_0x027d
            int r4 = r0.size()
        L_0x027d:
            X.6sU r6 = r5.A07
            if (r6 == 0) goto L_0x0092
            r0 = r17
            X.0qQ.A0B(r13, r0)
            X.0wc r13 = X.AnonymousClass0kN.A01(r5, r13)
            java.lang.String r5 = "instagram_organic_audio_clips_grid_impression"
            X.0kJ r0 = r13.A00
            X.0Aj r5 = r13.A00(r0, r5)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x030e
            java.lang.String r13 = "audio_page"
            java.lang.String r0 = "containermodule"
            r5.AAJ(r0, r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "container_id"
            r5.A9F(r0, r1)
            r2 = 0
            if (r9 != 0) goto L_0x0311
            r1 = r2
        L_0x02ac:
            java.lang.String r0 = "media_author_id"
            r5.AAE(r1, r0)
            if (r12 == 0) goto L_0x030f
            java.lang.Long r1 = X.00y.A0n(r3, r12)
        L_0x02b7:
            java.lang.String r0 = "media_id"
            r5.A9F(r0, r1)
            java.lang.String r0 = "action_source"
            r5.A8M(r11, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r5.AAJ(r0, r1)
            java.lang.String r0 = "audio_type"
            r5.A8M(r10, r0)
            java.lang.String r0 = "audio_sub_type"
            r5.AAJ(r0, r8)
            if (r9 == 0) goto L_0x02dc
            X.4Ny r2 = X.C263944Ny.A00(r9)
        L_0x02dc:
            java.lang.String r0 = "audio_owner_id"
            r5.AAE(r2, r0)
            X.8ZN r1 = r6.A02
            java.lang.String r0 = "pivot_page_entry_point"
            r5.A8M(r1, r0)
            java.lang.String r1 = r6.getSessionId()
            java.lang.String r0 = "pivot_page_session_id"
            r5.AAJ(r0, r1)
            long r0 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "initial_page_size"
            r5.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            java.lang.String r0 = "artist_pinned_flag"
            r5.A7p(r0, r1)
            if (r7 == 0) goto L_0x030b
            java.lang.String r0 = "media_tap_token"
            r5.AAJ(r0, r7)
        L_0x030b:
            r5.Cgf()
        L_0x030e:
            return
        L_0x030f:
            r1 = r2
            goto L_0x02b7
        L_0x0311:
            X.4Ny r1 = X.C263944Ny.A00(r9)
            goto L_0x02ac
        L_0x0316:
            r8 = 0
            goto L_0x026f
        L_0x0319:
            r0 = 0
            goto L_0x025b
        L_0x031c:
            X.0qQ.A0F(r19)
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVT.D3T():void");
    }

    public final void D3U() {
        C54191H2l h2l = this.A04;
        if (h2l == null) {
            0qQ.A0F("clipsAudioPagePerfLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            h2l.D3U();
        }
    }

    public final void D3V() {
        C54191H2l h2l = this.A04;
        if (h2l == null) {
            0qQ.A0F("clipsAudioPagePerfLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            h2l.D3V();
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0o);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        View view = this.mView;
        if (view == null) {
            return true;
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.title);
        RectF rectF = 0nA.A01;
        0qQ.A0B(A0G2, 0);
        Rect A0W2 = AnonymousClass7TE.A0W();
        A0G2.getGlobalVisibleRect(A0W2);
        float f = (float) A0W2.top;
        RectF A0Y2 = AnonymousClass7TE.A0Y();
        0nA.A0L(A0Y2, A0G2);
        if (f < A0Y2.top) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r6, int i) {
        1Xj r0;
        AnonymousClass2uE r1;
        AnonymousClass7TG.A1T(r6, view, motionEvent);
        if (!(this.A03 == AnonymousClass8ZN.STORY_VIEWER_BOTTOM_SHEET || (r0 = r6.A02) == null || C51966G9m.A11(r0) == null || r6.A01 == C295365o2.PREVIEW || (r1 = this.A0f) == null)) {
            1Xj r02 = r6.A02;
            if (r02 != null) {
                r1.Dsa(motionEvent, view, r02, i);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.5nB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.5nB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.5nB} */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.H2l, X.6uZ, X.MYU] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e2, code lost:
        if (r0.A03 == X.AnonymousClass8ZN.STORY_VIEWER_BOTTOM_SHEET) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0322, code lost:
        if (X.182.A06(r5, r4, 36320382349156733L) == false) goto L_0x0324;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r52) {
        /*
            r51 = this;
            r0 = 1143302812(0x44256a9c, float:661.6658)
            int r21 = X.AnonymousClass0fD.A02(r0)
            r0 = r51
            r1 = r52
            X.GVT.super.onCreate(r1)
            android.os.Bundle r5 = r0.requireArguments()
            X.0eM r1 = r0.A0o
            r50 = r1
            X.1Ng r1 = X.DbX.A0R(r50)
            r0.A0d = r1
            r1 = 890(0x37a, float:1.247E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3 = 0
            boolean r1 = r5.getBoolean(r1, r3)
            r0.A0b = r1
            X.1L1 r1 = X.1L2.A00()
            r0.A0g = r1
            java.lang.String r1 = "args_audio_model"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            java.lang.String r24 = "Required value was null."
            if (r1 == 0) goto L_0x0585
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = (com.instagram.clips.model.metadata.AudioPageMetadata) r1
            r0.A06 = r1
            java.lang.String r23 = "audioPageMetadata"
            r22 = 0
            if (r1 == 0) goto L_0x0357
            java.lang.String r1 = r1.A0H
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
        L_0x004b:
            r0.A0R = r1
            java.lang.String r1 = "args_preloaded_effect_id"
            java.lang.String r1 = r5.getString(r1)
            r0.A0j = r1
            java.lang.String r1 = "args_preloaded_effect_attribution_user_id"
            java.lang.String r1 = r5.getString(r1)
            r0.A0i = r1
            java.lang.String r2 = "args_preloaded_effect_supported"
            boolean r1 = r5.containsKey(r2)
            if (r1 == 0) goto L_0x006b
            java.lang.Boolean r1 = X.DbU.A0g(r5, r2)
            r0.A0h = r1
        L_0x006b:
            java.lang.String r1 = "args_preloaded_effect_name"
            java.lang.String r1 = r5.getString(r1)
            r0.A0k = r1
            java.lang.String r1 = "args_preloaded_effect_thumbnail_url"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r0.A0e = r1
            r1 = 234(0xea, float:3.28E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            java.io.Serializable r1 = r5.getSerializable(r1)
            X.8ZN r1 = (X.AnonymousClass8ZN) r1
            r0.A03 = r1
            r1 = 811(0x32b, float:1.136E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.io.Serializable r1 = r5.getSerializable(r1)
            X.HM8 r1 = (X.HM8) r1
            r0.A0D = r1
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r4 = X.C320236s2.A01(r5, r1)
            X.8ZN r2 = r0.A03
            X.6sU r1 = new X.6sU
            r1.<init>(r2, r4)
            r0.A07 = r1
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r0.A06
            if (r2 == 0) goto L_0x0357
            java.lang.String r1 = r2.A00
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = r2.A0C
            if (r1 != 0) goto L_0x00c7
            java.lang.String r0 = "Asset ID has to exist as either a deeplink asset ID or regular asset ID"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r1 = 209167884(0xc77a60c, float:1.9078156E-31)
        L_0x00c1:
            r0 = r21
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        L_0x00c7:
            r0.A0P = r1
            r1 = 2630(0xa46, float:3.685E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.io.Serializable r1 = r5.getSerializable(r1)
            X.HOu r1 = (X.C54689HOu) r1
            if (r1 != 0) goto L_0x00d9
            X.HOu r1 = X.C54689HOu.A04
        L_0x00d9:
            r0.A02 = r1
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r0.A06
            if (r2 == 0) goto L_0x0357
            r1 = 0
            java.lang.String r2 = r2.A0B     // Catch:{ NumberFormatException -> 0x00e8 }
            if (r2 == 0) goto L_0x00e8
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r2)     // Catch:{ NumberFormatException -> 0x00e8 }
        L_0x00e8:
            r0.A0O = r1
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r0.A06
            if (r1 == 0) goto L_0x0357
            java.lang.String r2 = r1.A0D
            r0.A0Q = r2
            if (r2 == 0) goto L_0x011a
            java.lang.String r1 = "_"
            java.util.List r2 = X.DbW.A0o(r2, r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.Object[] r1 = r2.toArray(r1)
            int r2 = r1.length
            r1 = 2
            if (r2 < r1) goto L_0x011a
            java.lang.String r1 = r0.A0Q
            if (r1 == 0) goto L_0x0136
            java.lang.String r1 = X.C51965G9l.A0u(r1)
        L_0x010c:
            r0.A0T = r1
            java.lang.String r2 = r0.A0Q
            if (r2 == 0) goto L_0x0133
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            java.lang.String r1 = X.1Xv.A04(r2)
        L_0x0118:
            r0.A0S = r1
        L_0x011a:
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r0.A06
            if (r2 == 0) goto L_0x0357
            java.lang.String r1 = r2.A0M
            r0.A0X = r1
            java.lang.String r1 = r2.A0I
            r0.A0U = r1
            java.lang.String r1 = r2.A0J
            r0.A0V = r1
            java.lang.String r1 = r2.A0K
            r0.A0W = r1
            java.lang.String r5 = r2.A09
            if (r5 == 0) goto L_0x014d
            goto L_0x0139
        L_0x0133:
            r1 = r22
            goto L_0x0118
        L_0x0136:
            r1 = r22
            goto L_0x010c
        L_0x0139:
            long r1 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x013e }
            goto L_0x014f
        L_0x013e:
            X.0wb r4 = X.0wb.A01
            java.lang.String r2 = "Unable to format Id "
            java.lang.String r1 = " as long."
            java.lang.String r2 = X.002.A0g(r2, r5, r1)
            java.lang.String r1 = "AudioPageFragment#maybeGetLongId()"
            r4.Ew0(r1, r2)
        L_0x014d:
            r1 = -1
        L_0x014f:
            r0.A00 = r1
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r50)
            r20 = 1
            r1 = r20
            X.0qQ.A0B(r4, r1)
            r2 = 31795876(0x1e52aa4, float:8.41825E-38)
            java.lang.String r1 = "audio_page"
            X.H2l r6 = new X.H2l
            r6.<init>(r4, r1, r2)
            r0.A04 = r6
            android.content.Context r7 = r0.requireContext()
            X.0lg r1 = X.DbT.A0X(r50)
            X.2cc r8 = X.C71342cb.A00(r1)
            r1 = r50
            X.0lg r4 = X.AnonymousClass7TF.A0L(r1, r3)
            X.0Tu r5 = X.0Tu.A05
            r1 = 36321133967975559(0x8109e100002487, double:3.032969602590557E-306)
            boolean r11 = X.182.A06(r5, r4, r1)
            r9 = r22
            r10 = r0
            r6.A0P(r7, r8, r9, r10, r11)
            com.instagram.clips.model.metadata.AudioPageMetadata r6 = r0.A06
            if (r6 == 0) goto L_0x0357
            java.lang.String r2 = r6.A0C
            boolean r1 = X.AnonymousClass7TF.A1V(r2)
            java.lang.String r19 = "assetId"
            java.lang.String r18 = "clipsAudioPagePerfLogger"
            if (r1 == 0) goto L_0x0556
            X.H2l r4 = r0.A04
            if (r4 == 0) goto L_0x0577
            r4.A0U(r2)
        L_0x01a2:
            com.instagram.api.schemas.MusicPageTabType r28 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            java.lang.String r2 = r28.toString()
            if (r2 == 0) goto L_0x01b2
            int r1 = r2.length()
            if (r1 == 0) goto L_0x01b2
            r4.A01 = r2
        L_0x01b2:
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            java.lang.String r10 = r0.A0R
            java.lang.String r8 = "gridKey"
            if (r10 == 0) goto L_0x0551
            java.lang.String r7 = r0.A0P
            if (r7 == 0) goto L_0x0569
            androidx.fragment.app.FragmentActivity r26 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r50)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0gy r27 = X.AnonymousClass07i.A00(r1)
            X.H2l r4 = r0.A04
            if (r4 == 0) goto L_0x0577
            java.lang.String r2 = r0.A0Q
            r1 = 3
            X.0qQ.A0B(r6, r1)
            X.H6r r1 = new X.H6r
            r25 = r1
            r29 = r4
            r30 = r6
            r31 = r10
            r32 = r7
            r33 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            X.2YN r4 = new X.2YN
            r4.<init>(r1, r9)
            java.lang.String r2 = r0.A0R
            if (r2 == 0) goto L_0x0551
            java.lang.Class<X.Ghc> r1 = X.C53044Ghc.class
            X.2YL r1 = r4.A01(r1, r2)
            X.Ghc r1 = (X.C53044Ghc) r1
            r0.A0J = r1
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.2YN r2 = new X.2YN
            r2.<init>(r1)
            java.lang.Class<X.Jft> r1 = X.C60112Jft.class
            X.2YL r1 = r2.A00(r1)
            X.Jft r1 = (X.C60112Jft) r1
            r0.A05 = r1
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.2YN r2 = new X.2YN
            r2.<init>(r1)
            java.lang.Class<X.GgX> r1 = X.C52980GgX.class
            X.2YL r1 = r2.A00(r1)
            X.GgX r1 = (X.C52980GgX) r1
            r0.A0L = r1
            androidx.fragment.app.FragmentActivity r8 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0gy r7 = X.AnonymousClass07i.A00(r1)
            java.lang.Object r6 = r50.getValue()
            android.content.Context r4 = r0.requireContext()
            r1 = r20
            X.0qQ.A0B(r6, r1)
            r2 = 2
            X.KDp r1 = new X.KDp
            r1.<init>(r2, r4, r7, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r8)
            java.lang.Class<X.Gh3> r1 = X.C53012Gh3.class
            X.2YL r1 = r2.A00(r1)
            X.Gh3 r1 = (X.C53012Gh3) r1
            r0.A0F = r1
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r50)
            X.H5W r1 = new X.H5W
            r1.<init>(r2)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r4)
            java.lang.Class<X.Gha> r1 = X.C53042Gha.class
            X.2YL r1 = r2.A00(r1)
            X.JS8 r1 = (X.JS8) r1
            r0.A0C = r1
            X.Ghc r8 = r0.A0J
            java.lang.String r15 = "audioPageViewModel"
            if (r8 == 0) goto L_0x054c
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r0.A06
            if (r1 == 0) goto L_0x0357
            java.lang.String r7 = r0.A0T
            java.lang.String r4 = r1.A0C
            if (r4 == 0) goto L_0x0534
            com.instagram.music.common.model.AudioType r10 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            java.lang.String r2 = r1.A0E
            com.instagram.clips.audio.model.AudioPageAssetModel r1 = new com.instagram.clips.audio.model.AudioPageAssetModel
            r9 = r1
            r11 = r4
            r12 = r22
            r13 = r2
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x028d:
            r8.A03(r1)
            X.Ghc r7 = r0.A0J
            if (r7 == 0) goto L_0x054c
            com.instagram.common.session.UserSession r6 = r7.A0A
            X.0Tu r4 = X.0Tu.A06
            r1 = 36328401052777801(0x81107d00023d49, double:3.0375653362816966E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x02ad
            r2 = 27
            X.In7 r1 = new X.In7
            r1.<init>(r7, r2)
            X.C44633CiB.A00(r1, r6)
        L_0x02ad:
            X.2el r47 = X.2el.A00()
            com.instagram.common.session.UserSession r46 = X.AnonymousClass7TE.A0l(r50)
            java.lang.String r2 = r0.A0T
            X.6sU r1 = r0.A07
            java.lang.String r17 = "pivotPageSessionProvider"
            if (r1 == 0) goto L_0x052f
            X.6sT r30 = new X.6sT
            r45 = r1
            r48 = r0
            r49 = r2
            r44 = r30
            r44.<init>(r45, r46, r47, r48, r49)
            android.content.Context r26 = r0.requireContext()
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r50)
            r1 = r50
            X.0lg r4 = X.AnonymousClass7TF.A0L(r1, r3)
            r1 = 36314270610229751(0x8103a3000009f7, double:3.0286291875155846E-306)
            boolean r36 = X.182.A06(r5, r4, r1)
            r4 = 1058013184(0x3f100000, float:0.5625)
            X.6sS r2 = new X.6sS
            r1 = r20
            r2.<init>(r4, r3, r1)
            X.6sV r1 = new X.6sV
            r25 = r1
            r27 = r0
            r28 = r2
            r29 = r0
            r31 = r0
            r33 = r14
            r34 = r14
            r35 = r14
            r37 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0.A0N = r1
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r50)
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r0.A06
            if (r1 == 0) goto L_0x0357
            boolean r1 = r1.A0R
            X.0qQ.A0B(r4, r3)
            if (r1 == 0) goto L_0x0324
            boolean r1 = X.AnonymousClass8IK.A02(r4)
            if (r1 == 0) goto L_0x0324
            r1 = 36320382349156733(0x8109320007217d, double:3.0324942758230054E-306)
            boolean r2 = X.182.A06(r5, r4, r1)
            r1 = 1
            if (r2 != 0) goto L_0x0325
        L_0x0324:
            r1 = 0
        L_0x0325:
            r0.A0l = r1
            r1 = r50
            X.0lg r4 = X.AnonymousClass7TF.A0L(r1, r3)
            r1 = 36320382349222270(0x8109320008217e, double:3.032494275864451E-306)
            boolean r1 = X.182.A06(r5, r4, r1)
            r0.A0Y = r1
            com.instagram.clips.model.metadata.AudioPageMetadata r1 = r0.A06
            if (r1 == 0) goto L_0x0357
            com.instagram.music.common.config.MusicAttributionConfig r1 = r1.A04
            if (r1 == 0) goto L_0x052c
            int r11 = r1.A00
        L_0x0342:
            X.2jd r4 = new X.2jd
            r4.<init>()
            X.Ghc r10 = r0.A0J
            if (r10 == 0) goto L_0x054c
            X.JS8 r9 = r0.A0C
            java.lang.String r16 = "saveSongToStreamingAppViewModel"
            if (r9 == 0) goto L_0x0527
            X.Gh3 r8 = r0.A0F
            if (r8 != 0) goto L_0x035f
            java.lang.String r23 = "audioPageAudioFiltersViewModel"
        L_0x0357:
            X.0qQ.A0F(r23)
        L_0x035a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x035f:
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r50)
            X.8ZN r1 = r0.A03
            r26 = r1
            X.HOu r1 = r0.A02
            if (r1 != 0) goto L_0x036e
            java.lang.String r23 = "actionSource"
            goto L_0x0357
        L_0x036e:
            java.lang.String r7 = r0.A0P
            if (r7 == 0) goto L_0x0569
            com.instagram.clips.model.metadata.AudioPageMetadata r12 = r0.A06
            if (r12 == 0) goto L_0x0357
            java.lang.String r6 = r12.A0E
            if (r6 != 0) goto L_0x037b
            r6 = r7
        L_0x037b:
            long r1 = r0.A00
            r48 = r1
            java.lang.String r1 = r0.A0T
            r39 = r1
            java.lang.String r1 = r0.A0S
            r40 = r1
            java.lang.String r1 = r0.A0X
            r41 = r1
            X.6sU r13 = r0.A07
            if (r13 == 0) goto L_0x052f
            X.H2l r2 = r0.A04
            if (r2 == 0) goto L_0x0577
            com.instagram.api.schemas.AudioFilterType r1 = r12.A01
            r27 = r1
            boolean r1 = r0.A0l
            r45 = r1
            boolean r1 = r0.A0Y
            r14 = r1
            X.HM8 r12 = r0.A0D
            X.IO9 r1 = new X.IO9
            r25 = r1
            r28 = r2
            r29 = r13
            r32 = r9
            r33 = r12
            r34 = r8
            r35 = r0
            r36 = r10
            r37 = r7
            r38 = r6
            r42 = r11
            r43 = r48
            r46 = r14
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46)
            r4.A0E(r1)
            r0.A0H = r1
            X.Ghc r12 = r0.A0J
            if (r12 == 0) goto L_0x054c
            com.instagram.common.session.UserSession r29 = X.AnonymousClass7TE.A0l(r50)
            long r1 = r0.A00
            java.lang.String r11 = r0.A0T
            java.lang.String r10 = r0.A0S
            java.lang.String r9 = r0.A0U
            com.instagram.clips.model.metadata.AudioPageMetadata r6 = r0.A06
            if (r6 == 0) goto L_0x0357
            boolean r6 = r6.A0Q
            if (r6 != 0) goto L_0x03e4
            X.8ZN r7 = r0.A03
            X.8ZN r6 = X.AnonymousClass8ZN.STORY_VIEWER_BOTTOM_SHEET
            r37 = 0
            if (r7 != r6) goto L_0x03e6
        L_0x03e4:
            r37 = 1
        L_0x03e6:
            X.6sU r8 = r0.A07
            if (r8 == 0) goto L_0x052f
            X.H2l r7 = r0.A04
            if (r7 == 0) goto L_0x0577
            X.IOB r6 = new X.IOB
            r25 = r6
            r26 = r0
            r27 = r7
            r28 = r8
            r30 = r0
            r31 = r12
            r32 = r11
            r33 = r10
            r34 = r9
            r35 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
            r4.A0E(r6)
            r0.A0I = r6
            X.Ghc r6 = r0.A0J
            if (r6 == 0) goto L_0x054c
            X.6sV r2 = r0.A0N
            java.lang.String r8 = "clipsGridAdapter"
            if (r2 == 0) goto L_0x0551
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r50)
            X.GiL r1 = new X.GiL
            r12 = r47
            r13 = r6
            r14 = r2
            r9 = r1
            r10 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r4.A0E(r1)
            r0.A0G = r1
            X.Ghc r14 = r0.A0J
            if (r14 == 0) goto L_0x054c
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r50)
            boolean r1 = r0.A0b
            r47 = r1
            java.lang.String r13 = r0.A0P
            if (r13 == 0) goto L_0x0569
            long r1 = r0.A00
            X.8ZN r15 = r0.A03
            java.lang.String r6 = r0.A0T
            r36 = r6
            java.lang.String r6 = r0.A0S
            r37 = r6
            java.lang.String r6 = r0.A0X
            r38 = r6
            java.lang.String r6 = r0.A0U
            r39 = r6
            com.instagram.clips.model.metadata.AudioPageMetadata r7 = r0.A06
            if (r7 == 0) goto L_0x0357
            java.lang.String r6 = r7.A0A
            r27 = r6
            java.lang.String r6 = r7.A0F
            r26 = r6
            java.lang.String r6 = r0.A0j
            r25 = r6
            java.lang.String r6 = r0.A0i
            r23 = r6
            java.lang.Boolean r12 = r0.A0h
            java.lang.String r11 = r0.A0k
            r19 = r8
            com.instagram.common.typedurl.ImageUrl r10 = r0.A0e
            X.6sU r9 = r0.A07
            if (r9 == 0) goto L_0x052f
            X.H2l r8 = r0.A04
            if (r8 == 0) goto L_0x0577
            X.HM8 r7 = r0.A0D
            X.IO8 r6 = new X.IO8
            r28 = r8
            r29 = r9
            r31 = r10
            r32 = r7
            r33 = r14
            r34 = r12
            r35 = r13
            r40 = r27
            r41 = r26
            r42 = r25
            r43 = r23
            r44 = r11
            r45 = r1
            r25 = r6
            r26 = r15
            r27 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47)
            r4.A0E(r6)
            r0.A0K = r6
            X.0hq r1 = r0.mFragmentManager
            if (r1 == 0) goto L_0x04e7
            androidx.fragment.app.FragmentActivity r25 = r0.requireActivity()
            X.0hq r9 = r0.mFragmentManager
            if (r9 == 0) goto L_0x057c
            com.instagram.common.session.UserSession r28 = X.AnonymousClass7TE.A0l(r50)
            X.3kK r8 = r0.A0g
            X.6sV r7 = r0.A0N
            if (r7 == 0) goto L_0x0569
            X.0lg r6 = X.DbT.A0X(r50)
            r1 = 2342154728613348070(0x20810151000002e6, double:4.058564633567689E-152)
            boolean r34 = X.182.A06(r5, r6, r1)
            X.2uE r2 = new X.2uE
            r24 = r2
            r26 = r0
            r27 = r9
            r29 = r22
            r30 = r0
            r31 = r7
            r32 = r8
            r33 = r20
            r35 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.IOB r1 = r0.A0I
            if (r1 != 0) goto L_0x04e0
            java.lang.String r23 = "audioPageMusicPlayerController"
            goto L_0x0357
        L_0x04e0:
            r2.A0B = r1
            r4.A0E(r2)
            r0.A0f = r2
        L_0x04e7:
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r50)
            android.content.res.Resources r2 = X.DbV.A05(r0)
            X.0qQ.A07(r2)
            X.I4J r1 = new X.I4J
            r1.<init>(r5, r2, r3)
            r0.A0M = r1
            r0.registerLifecycleListenerSet(r4)
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r1 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x051e
            X.37D r1 = X.DbX.A0i(r0)
            if (r1 == 0) goto L_0x0510
            X.7Pu r22 = X.C48943Emh.A00(r1)
        L_0x0510:
            r1 = r22
            r0.A08 = r1
            X.JS8 r1 = r0.A0C
            if (r1 == 0) goto L_0x0527
            X.Gha r1 = (X.C53042Gha) r1
            r0 = r22
            r1.A00 = r0
        L_0x051e:
            r1 = -1652361337(0xffffffff9d82f787, float:-3.466665E-21)
            r0 = r21
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0527:
            X.0qQ.A0F(r16)
            goto L_0x035a
        L_0x052c:
            r11 = 0
            goto L_0x0342
        L_0x052f:
            X.0qQ.A0F(r17)
            goto L_0x035a
        L_0x0534:
            com.instagram.music.common.model.AudioType r6 = r1.A05
            if (r6 == 0) goto L_0x0593
            java.lang.String r4 = r1.A00
            if (r4 == 0) goto L_0x058e
            java.lang.String r2 = r1.A0E
            com.instagram.clips.audio.model.AudioPageAssetModel r1 = new com.instagram.clips.audio.model.AudioPageAssetModel
            r9 = r1
            r10 = r6
            r11 = r4
            r12 = r7
            r13 = r2
            r14 = r22
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x028d
        L_0x054c:
            X.0qQ.A0F(r15)
            goto L_0x035a
        L_0x0551:
            X.0qQ.A0F(r8)
            goto L_0x035a
        L_0x0556:
            com.instagram.music.common.model.AudioType r2 = r6.A05
            com.instagram.music.common.model.AudioType r1 = com.instagram.music.common.model.AudioType.ORIGINAL_AUDIO
            X.H2l r4 = r0.A04
            if (r2 != r1) goto L_0x056e
            if (r4 == 0) goto L_0x0577
            java.lang.String r1 = r0.A0P
            if (r1 == 0) goto L_0x0569
            r4.A0U(r1)
            goto L_0x01a2
        L_0x0569:
            X.0qQ.A0F(r19)
            goto L_0x035a
        L_0x056e:
            if (r4 == 0) goto L_0x0577
            java.lang.String r1 = r6.A0B
            r4.A0U(r1)
            goto L_0x01a2
        L_0x0577:
            X.0qQ.A0F(r18)
            goto L_0x035a
        L_0x057c:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r24)
            r1 = 2090277696(0x7c971b40, float:6.276716E36)
            goto L_0x00c1
        L_0x0585:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r24)
            r1 = 140961384(0x866e668, float:6.948395E-34)
            goto L_0x00c1
        L_0x058e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r24)
            throw r0
        L_0x0593:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVT.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1180115522);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass0eM r6 = this.A0o;
        boolean A062 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(r6, 0), 36323856977243718L);
        int i = R.layout.layout_clips_pivot_page_fragment;
        if (A062) {
            i = R.layout.layout_audio_page_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        0xY AR4 = GLB.A00(MusicPageTabType.CLIPS, AnonymousClass7TE.A0l(r6)).A02.AR4();
        AR4.E5c("LAST_OPENED_AUDIO_PAGE_TIMESTAMP_KEY", System.currentTimeMillis());
        AR4.apply();
        AnonymousClass0fD.A09(97662576, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(604368412);
        super.onDestroyView();
        1Ng r2 = this.A0d;
        if (r2 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A02(this.A0p, C57069INj.class);
        AnonymousClass0fD.A09(-1868997875, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1455082904);
        super.onResume();
        if (this.A0Z) {
            C53044Ghc ghc = this.A0J;
            if (ghc == null) {
                0qQ.A0F("audioPageViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass7TF.A1O(ghc.A0P, true);
            Object value = ghc.A0C.A09.getValue();
            if (value != null) {
                ((C320416sL) value).A01();
                this.A0Z = false;
            } else {
                throw AnonymousClass7TE.A0z("Called fetch without initializing fetcher");
            }
        }
        AnonymousClass0fD.A09(-2001751804, A022);
    }
}
