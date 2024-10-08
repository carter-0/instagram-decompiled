package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public final class K70 extends AnonymousClass4DH implements AnonymousClass4DU, MU3, MXU, MU2 {
    public static final String __redex_internal_original_name = "MusicBrowserHomeFragment";
    public ComposeView A00;
    public C3515589i A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public MusicProduct A04;
    public C234462xu A05;
    public C60379JkY A06;
    public LFN A07;
    public C66447MSb A08;
    public boolean A09;
    public View A0A;
    public LinearLayoutManager A0B;
    public RecyclerView A0C;
    public C59725JVj A0D;
    public C252063oV A0E;
    public C252063oV A0F;
    public C64161LRc A0G;
    public C234502xy A0H;
    public AnonymousClass80X A0I;
    public String A0J;
    public String A0K;
    public final String A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q = DbS.A0I(MMS.A00(this, 38), MMS.A00(this, 36), MMW.A00((Object) null, this, 45), DbS.A0z(C60329JjY.class));
    public final AnonymousClass0eM A0R;

    public final void D1I(C65493LuH luH) {
        String str;
        0qQ.A0B(luH, 0);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
            String A002 = JTT.A0b(this.A0P).A00();
            String title = luH.A00.getTitle();
            String str2 = this.A0J;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                C59725JVj jVj = this.A0D;
                if (jVj == null) {
                    str = "surfaceType";
                } else {
                    C64161LRc.A01(jVj, A0l, A002, title, str2);
                    A00(C64181LSn.A03("category", luH.A00.getId(), luH.A00.getTitle()));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DXR(C66569MWx mWx, String str, int i) {
    }

    public final void DXs(MusicSearchPlaylist musicSearchPlaylist) {
        String str;
        0qQ.A0B(musicSearchPlaylist, 0);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
            String A002 = JTT.A0b(this.A0P).A00();
            String A0b = JTQ.A0b(musicSearchPlaylist);
            String str2 = this.A0J;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                C59725JVj jVj = this.A0D;
                if (jVj == null) {
                    str = "surfaceType";
                } else {
                    C64161LRc.A01(jVj, A0l, A002, A0b, str2);
                    A00(MusicBrowseCategory.A08.A04(musicSearchPlaylist));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dhc(MusicSearchArtist musicSearchArtist, int i) {
    }

    public final void Dhd(MusicSearchArtist musicSearchArtist, int i) {
    }

    public final void Dhl(String str) {
    }

    public final void Dm9(AudioPageMetadata audioPageMetadata, C66569MWx mWx, MusicSearchPlaylist musicSearchPlaylist, String str, String str2, int i) {
        C64161LRc lRc = this.A0G;
        if (lRc == null) {
            0qQ.A0F("musicLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0eM r1 = this.A0R;
        lRc.A05(AnonymousClass7TE.A0l(r1), mWx, JTP.A0s(musicSearchPlaylist), JTQ.A0b(musicSearchPlaylist), i);
        Bundle A022 = C250563lf.A02((C54689HOu) null, AnonymousClass8ZN.CAMERA_AUDIO_BROWSER_ARTIST_SPOTLIGHT, audioPageMetadata, str2);
        A022.putBoolean(AnonymousClass000.A00(890), true);
        Dba.A0K(requireActivity(), A022, DbT.A0X(r1), ModalActivity.class, "audio_page").A0D(this, 9688);
    }

    public final void DmA(AnonymousClass0iw r10, C66569MWx mWx, MusicSearchPlaylist musicSearchPlaylist, int i) {
        String str;
        0qQ.A0B(r10, 1);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
            String A0s = JTP.A0s(musicSearchPlaylist);
            String A0b = JTQ.A0b(musicSearchPlaylist);
            String moduleName = r10.getModuleName();
            String str2 = this.A0J;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A04;
                if (musicProduct == null) {
                    str = "musicProduct";
                } else {
                    C59725JVj jVj = this.A0D;
                    if (jVj == null) {
                        str = "surfaceType";
                    } else {
                        C64161LRc.A00(jVj, musicProduct, A0l, mWx, A0s, A0b, moduleName, str2, i);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DnN(C66569MWx mWx, String str, int i) {
    }

    public final void Dt5(C66569MWx mWx, Integer num, String str, String str2) {
        String str3;
        String str4;
        String str5 = str2;
        0qQ.A0B(str5, 2);
        C64161LRc lRc = this.A0G;
        if (lRc == null) {
            str4 = "musicLogger";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
            AnonymousClass0eM r3 = this.A0P;
            C60330JjZ jjZ = (C60330JjZ) r3.getValue();
            if (C60330JjZ.A00((C62550Khg) jjZ.A0B.getValue(), jjZ) instanceof KVO) {
                str3 = "full_list";
            } else {
                str3 = "preview";
            }
            MusicBrowseCategory A0b = JTT.A0b(r3);
            String str6 = this.A0J;
            if (str6 == null) {
                str4 = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A04;
                if (musicProduct == null) {
                    str4 = "musicProduct";
                } else {
                    C59725JVj jVj = this.A0D;
                    if (jVj == null) {
                        str4 = "surfaceType";
                    } else {
                        C66569MWx mWx2 = mWx;
                        String str7 = str;
                        lRc.A03(this.A01, (C371088xY) null, jVj, musicProduct, A0l, mWx2, A0b, num, str7, str5, str3, (String) null, str6, this.A0L, this.A0K);
                        C66447MSb mSb = this.A08;
                        if (mSb != null) {
                            mSb.Dt4(mWx2, JTT.A0b(r3), str7);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.K70, X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.tab_list_compose_view);
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(GTZ.A00);
            composeView.setContent(AnonymousClass5PI.A03(new C59345JFx(this, 28), -285425891));
        }
        this.A0C = DbZ.A0F(view, R.id.content_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        this.A0B = linearLayoutManager;
        RecyclerView recyclerView = this.A0C;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.A0C;
        if (recyclerView2 != null) {
            C60379JkY jkY = this.A06;
            if (jkY == null) {
                str = "adapter";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView2.setAdapter(jkY);
        }
        RecyclerView recyclerView3 = this.A0C;
        if (recyclerView3 != null) {
            C65319LrI lrI = new C65319LrI(this, 7);
            C3251771i r1 = C3251771i.A0G;
            LinearLayoutManager linearLayoutManager2 = this.A0B;
            if (linearLayoutManager2 == null) {
                str = "layoutManager";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            JTQ.A0y(linearLayoutManager2, recyclerView3, lrI, r1);
        }
        this.A0A = view.findViewById(R.id.loading_state);
        this.A0F = DbU.A0Y(view, R.id.error_state);
        this.A0E = DbU.A0Y(view, R.id.empty_state);
        A01(this, C62514Kh4.UNINITIALIZED);
        AnonymousClass0eM r2 = this.A0P;
        JTS.A10(this, MGW.A01(this, (AnonymousClass4D7) null, 27), ((C60330JjZ) r2.getValue()).A08);
        JTS.A10(this, MGW.A01(this, (AnonymousClass4D7) null, 28), ((C60330JjZ) r2.getValue()).A07);
        JTS.A10(this, MGW.A01(this, (AnonymousClass4D7) null, 29), ((C60329JjY) this.A0Q.getValue()).A07);
    }

    private final void A00(MusicBrowseCategory musicBrowseCategory) {
        String str;
        UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
        MusicProduct musicProduct = this.A04;
        if (musicProduct == null) {
            str = "musicProduct";
        } else {
            ImmutableList immutableList = this.A03;
            if (immutableList == null) {
                str = "ineligibleAudioTypes";
            } else {
                String str2 = this.A0J;
                if (str2 == null) {
                    str = "browseSessionId";
                } else {
                    AnonymousClass80X r13 = this.A0I;
                    if (r13 == null) {
                        str = "captureState";
                    } else {
                        C59725JVj jVj = this.A0D;
                        if (jVj == null) {
                            str = "surfaceType";
                        } else {
                            C3515589i r4 = this.A01;
                            ImmutableList immutableList2 = this.A02;
                            if (immutableList2 == null) {
                                str = "attachedTracks";
                            } else {
                                C61423K6w A002 = C63352KvZ.A00(r4, jVj, immutableList, immutableList2, musicProduct, A0l, (MusicAttributionConfig) null, musicBrowseCategory, (MusicOverlaySearchTab) null, r13, str2, (String) null, "full_list", (Map) null, 0, false, this.A09);
                                C66447MSb mSb = this.A08;
                                if (mSb != null) {
                                    A002.A05 = mSb;
                                    C234462xu r0 = this.A05;
                                    if (r0 != null) {
                                        A002.A03 = r0;
                                    }
                                    C63353Kva.A00(this, A002, false);
                                    return;
                                }
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r5 == X.C62514Kh4.A05) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.K70 r4, X.C62514Kh4 r5) {
        /*
            android.view.View r2 = r4.A0A
            r3 = 8
            if (r2 == 0) goto L_0x0014
            X.Kh4 r0 = X.C62514Kh4.UNINITIALIZED
            if (r5 == r0) goto L_0x0010
            X.Kh4 r1 = X.C62514Kh4.LOADING
            r0 = 8
            if (r5 != r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r2.setVisibility(r0)
        L_0x0014:
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0C
            if (r2 == 0) goto L_0x0021
            X.Kh4 r1 = X.C62514Kh4.LOADED
            r0 = 4
            if (r5 != r1) goto L_0x001e
            r0 = 0
        L_0x001e:
            r2.setVisibility(r0)
        L_0x0021:
            X.3oV r2 = r4.A0F
            if (r2 == 0) goto L_0x002f
            X.Kh4 r1 = X.C62514Kh4.FAILED
            r0 = 8
            if (r5 != r1) goto L_0x002c
            r0 = 0
        L_0x002c:
            r2.setVisibility(r0)
        L_0x002f:
            X.3oV r1 = r4.A0E
            if (r1 == 0) goto L_0x003b
            X.Kh4 r0 = X.C62514Kh4.EMPTY
            if (r5 != r0) goto L_0x0038
            r3 = 0
        L_0x0038:
            r1.setVisibility(r3)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K70.A01(X.K70, X.Kh4):void");
    }

    public final void DHj(JV7 jv7) {
        A00(C64181LSn.A03("genres", jv7.A01, jv7.A02));
    }

    public final void DSI(JV7 jv7) {
        A00(C64181LSn.A03("moods", jv7.A01, jv7.A02));
    }

    public final void DXt(MusicSearchPlaylist musicSearchPlaylist) {
        A00(MusicBrowseCategory.A08.A04(musicSearchPlaylist));
    }

    public final void Dt1(C66569MWx mWx, C63863L9s l9s) {
        String str;
        C64161LRc lRc = this.A0G;
        if (lRc == null) {
            str = "musicLogger";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0R);
            MusicBrowseCategory A0b = JTT.A0b(this.A0P);
            String str2 = this.A0J;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A04;
                if (musicProduct == null) {
                    str = "musicProduct";
                } else {
                    String str3 = this.A0L;
                    C59725JVj jVj = this.A0D;
                    if (jVj == null) {
                        str = "surfaceType";
                    } else {
                        lRc.A04(this.A01, jVj, musicProduct, A0l, mWx, A0b, l9s, str2, str3, this.A0K);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EHe(C66569MWx mWx, String str) {
        if (mWx != null) {
            ((C60329JjY) this.A0Q.getValue()).A01(mWx, MLD.A00, MLE.A00, true);
        }
    }

    public final void EHh(C66569MWx mWx, String str) {
        if (mWx != null) {
            ((C60329JjY) this.A0Q.getValue()).A01(mWx, MLD.A00, MLE.A00, false);
        }
    }

    public final String getModuleName() {
        return this.A0L;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0R);
    }

    public final boolean isScrolledToBottom() {
        LinearLayoutManager linearLayoutManager = this.A0B;
        if (linearLayoutManager == null || !C2808154f.A02(linearLayoutManager)) {
            return false;
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        View A0X;
        LinearLayoutManager linearLayoutManager = this.A0B;
        if (!(linearLayoutManager == null || (A0X = linearLayoutManager.A0X(0)) == null)) {
            int A1a = linearLayoutManager.A1a();
            Rect A0W = AnonymousClass7TE.A0W();
            A0X.getLocalVisibleRect(A0W);
            if (!(A1a == 0 && A0W.top == 0)) {
                return false;
            }
        }
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        if (i == 9688) {
            C64161LRc lRc = this.A0G;
            if (i2 == 9689) {
                if (lRc != null) {
                    C66569MWx mWx = lRc.A00;
                    if (mWx != null) {
                        MusicBrowseCategory A0b = JTT.A0b(this.A0P);
                        C64161LRc lRc2 = this.A0G;
                        if (lRc2 != null) {
                            C63863L9s l9s = lRc2.A01;
                            if (l9s == null || (str = l9s.A04) == null) {
                                str = A0b.A04;
                                if (l9s == null) {
                                    str2 = A0b.A06;
                                    if (str2 == null || str2.length() == 0) {
                                        str2 = "unknown";
                                    }
                                    Dt5(mWx, (Integer) null, str, str2);
                                    return;
                                }
                            }
                            str2 = l9s.A05;
                            Dt5(mWx, (Integer) null, str, str2);
                            return;
                        }
                    } else {
                        0kD.A05("spotlight_banner_selection", "MusicBrowserHomeFragment state has been reaped on Audio Page track confirmed", (Throwable) null);
                        C59689JTv.A01(requireContext(), "music_browser_use_audio_error", 2131967751, 1);
                        return;
                    }
                }
            } else if (lRc != null) {
                if (lRc.A00 == null) {
                    0kD.A05("spotlight_banner_selection", "MusicBrowserHomeFragment state has been reaped on Audio Page back navigation", (Throwable) null);
                    return;
                }
                return;
            }
            0qQ.A0F("musicLogger");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public K70() {
        MMS A002 = MMS.A00(this, 35);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMS.A00(MMS.A00(this, 41), 42));
        this.A0P = DbS.A0I(MMS.A00(A003, 43), A002, MMW.A00((Object) null, A003, 48), DbS.A0z(C60330JjZ.class));
        this.A0O = DbS.A0I(MMS.A00(this, 39), MMS.A00(this, 34), MMW.A00((Object) null, this, 46), DbS.A0z(ClipsCreationViewModel.class));
        this.A0N = DbS.A0I(MMS.A00(this, 40), MMS.A00(this, 33), MMW.A00((Object) null, this, 47), DbS.A0z(C3507185x.class));
        this.A0M = DbS.A0I(MMS.A00(this, 37), MMS.A00(this, 32), MMW.A00((Object) null, this, 44), DbS.A0z(C60090JfW.class));
        this.A0L = "music_browser_home_fragment";
        this.A0R = C227642jf.A02(this);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.K70, X.07Z, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        C3515589i r2;
        String str;
        int A022 = AnonymousClass0fD.A02(1978343353);
        K70.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("music_product");
        0qQ.A0C(serializable, AnonymousClass000.A00(718));
        this.A04 = (MusicProduct) serializable;
        this.A03 = ImmutableList.copyOf((Collection) C320236s2.A02(requireArguments, AudioTrackType.class, "ineligible_audio_types"));
        Serializable serializable2 = requireArguments.getSerializable("music_browser_entry_point");
        if (serializable2 instanceof C3515589i) {
            r2 = (C3515589i) serializable2;
        } else {
            r2 = null;
        }
        this.A01 = r2;
        this.A02 = ImmutableList.copyOf((Collection) C320236s2.A02(requireArguments, MusicModelEffectPair.class, "attached_tracks"));
        this.A09 = requireArguments.getBoolean("should_use_light_mode", false);
        this.A0J = JTP.A0m(requireArguments, "browse_session_id");
        Serializable serializable3 = requireArguments.getSerializable("surface_type");
        0qQ.A0C(serializable3, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
        this.A0D = (C59725JVj) serializable3;
        this.A0K = requireArguments.getString("media_id");
        Serializable serializable4 = requireArguments.getSerializable("capture_state");
        0qQ.A0C(serializable4, AnonymousClass000.A00(335));
        this.A0I = (AnonymousClass80X) serializable4;
        Context requireContext = requireContext();
        AnonymousClass0eM r22 = this.A0R;
        UserSession A0l = AnonymousClass7TE.A0l(r22);
        this.A0H = C234472xv.A00(requireContext, A0l, this, this.A05, __redex_internal_original_name, C234472xv.A02(A0l));
        UserSession A0l2 = AnonymousClass7TE.A0l(r22);
        C3515589i r7 = this.A01;
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            str = "attachedTracks";
        } else {
            C234502xy r11 = this.A0H;
            if (r11 == null) {
                str = "musicPlayer";
            } else {
                this.A07 = new LFN(r7, immutableList, A0l2, (ClipsCreationViewModel) this.A0O.getValue(), r11);
                this.A0G = new C64161LRc();
                JTS.A10(this, MGW.A01(this, (AnonymousClass4D7) null, 26), ((C60090JfW) this.A0M.getValue()).A02);
                Context requireContext2 = requireContext();
                UserSession A0l3 = AnonymousClass7TE.A0l(r22);
                AnonymousClass0eM r1 = this.A0P;
                C60330JjZ jjZ = (C60330JjZ) r1.getValue();
                MusicBrowseCategory A0b = JTT.A0b(r1);
                MusicProduct musicProduct = this.A04;
                if (musicProduct == null) {
                    str = "musicProduct";
                } else {
                    C60329JjY jjY = (C60329JjY) this.A0Q.getValue();
                    LFN lfn = this.A07;
                    if (lfn == null) {
                        str = "musicTrackStateDelegate";
                    } else {
                        C60379JkY jkY = new C60379JkY(requireContext2, this, musicProduct, this, A0l3, A0b, this, lfn, jjY, jjZ, this.A09);
                        this.A06 = jkY;
                        jkY.setHasStableIds(true);
                        AnonymousClass0fD.A09(-651483605, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(291867402);
        0qQ.A0B(layoutInflater, 0);
        if (this.A09) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_browser_home, viewGroup, false);
        AnonymousClass0fD.A09(669481676, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(904440767);
        this.A00 = null;
        this.A0A = null;
        this.A0C = null;
        this.A0F = null;
        this.A0E = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1996598390, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (!z2 && z) {
            C60330JjZ jjZ = (C60330JjZ) this.A0P.getValue();
            C60330JjZ.A00((C62550Khg) jjZ.A0B.getValue(), jjZ).A02();
        }
    }

    public final /* bridge */ /* synthetic */ MU2 Edi(C234462xu r1) {
        this.A05 = r1;
        return this;
    }

    public final /* bridge */ /* synthetic */ MU2 Ep4(C66447MSb mSb) {
        this.A08 = mSb;
        return this;
    }
}
