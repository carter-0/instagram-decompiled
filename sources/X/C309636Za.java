package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Za  reason: invalid class name and case insensitive filesystem */
public final class C309636Za implements C309646Zb {
    public 27S A00;
    public UserSession A01;
    public C314026hX A02;
    public AnonymousClass6ST A03;
    public final C273384mU A04;
    public final WeakReference A05;
    public final AnonymousClass4DU A06;
    public final C317116mk A07;

    public final void DKs(C270194gL r10) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            if (this.A01 != null) {
                02m.A0p.markerStart(39133251);
                1Xv r0 = 1Xj.A0h;
                String str = r10.A0e;
                str.getClass();
                String A062 = 1Xv.A06(str);
                this.A04.EHY("insights_bottom_sheet_shown");
                UserSession userSession = this.A01;
                if (userSession != null) {
                    boolean booleanValue = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36313372962195364L)).booleanValue();
                    HashMap hashMap = new HashMap();
                    if (booleanValue) {
                        hashMap.put("target_id", A062);
                        hashMap.put("origin", "live_archive");
                        C46649DiU A042 = C46649DiU.A04("com.instagram.insights.media_refresh.live.core", hashMap);
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession2);
                            igBloksScreenConfig.A0U = fragment.requireContext().getResources().getString(2131965240);
                            A042.A0D(activity, igBloksScreenConfig);
                            return;
                        }
                    } else {
                        hashMap.put("media_id", A062);
                        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "live_archive");
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            new F29(userSession3).A00(fragment, activity, hashMap, false);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DP2(float f, float f2) {
        this.A07.DP2(0.0f, 0.0f);
    }

    public final boolean Dq1(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(motionEvent2, 1);
        return this.A07.Dq1(motionEvent, motionEvent2, f, f2);
    }

    public final void DvB(boolean z) {
        this.A07.DvB(false);
    }

    public static final void A00(C309636Za r1) {
        AnonymousClass6ST r12 = r1.A03;
        if (r12 != null) {
            if (r12.isShowing()) {
                r12.dismiss();
            }
            r12.A00("");
        }
    }

    private final void A01(String str) {
        Context context;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            AnonymousClass6ST r1 = this.A03;
            if (r1 == null) {
                r1 = new AnonymousClass6ST(context, true);
                this.A03 = r1;
            }
            if (r1.isShowing()) {
                r1.dismiss();
            }
            r1.A00(str);
            AnonymousClass0fN.A00(r1);
        }
    }

    public final void D8A(C270194gL r5) {
        boolean z;
        UserSession userSession = this.A01;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass4DU r3 = this.A06;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_live_archive_delete_click");
        A002.A9F("a_pk", Long.valueOf(Long.parseLong(r5.A03().getId())));
        String str = r5.A0e;
        str.getClass();
        A002.AAJ("m_pk", str);
        String str2 = r5.A0X;
        str2.getClass();
        A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
        C278134wK r0 = r5.A07;
        if (r0 != null) {
            A002.A9F("archive_id", Long.valueOf(Long.parseLong(r0.A00)));
            C278134wK r02 = r5.A07;
            if (r02 != null) {
                z = r02.A01;
            } else {
                z = false;
            }
            A002.A7p("can_share_to_igtv", Boolean.valueOf(z));
            A002.A9F("published_time", Long.valueOf(r5.A01()));
            A002.AAJ("container_module", r3.getModuleName());
            A002.Cgf();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void D8B(C270194gL r7) {
        Context context;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            boolean z2 = false;
            if (r7.A07 != null) {
                z2 = true;
            }
            if (z2) {
                String string = context.getString(2131965145);
                0qQ.A07(string);
                A01(string);
                UserSession userSession = this.A01;
                if (userSession != null) {
                    C278134wK r0 = r7.A07;
                    if (r0 != null) {
                        String str = r0.A00;
                        1NY r2 = new 1NY(userSession, -2);
                        r2.A04();
                        r2.A0A("archive/live/delete/");
                        r2.A9m("archive_id", str);
                        r2.A0Q(1XP.class, 1XY.class);
                        1OC A0M = r2.A0M();
                        A0M.A00 = new C47662EBw(context, r7, this);
                        1ES.A03(A0M);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                AnonymousClass4DU r3 = this.A06;
                0wc A012 = AnonymousClass0kN.A01(r3, userSession2);
                0Aj A002 = A012.A00(A012.A00, "ig_live_archive_delete_confirm");
                A002.A9F("a_pk", Long.valueOf(Long.parseLong(r7.A03().getId())));
                String str2 = r7.A0e;
                str2.getClass();
                A002.AAJ("m_pk", str2);
                String str3 = r7.A0X;
                str3.getClass();
                A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str3)));
                C278134wK r02 = r7.A07;
                if (r02 != null) {
                    A002.A9F("archive_id", Long.valueOf(Long.parseLong(r02.A00)));
                    C278134wK r03 = r7.A07;
                    if (r03 != null) {
                        z = r03.A01;
                    } else {
                        z = false;
                    }
                    A002.A7p("can_share_to_igtv", Boolean.valueOf(z));
                    A002.A9F("published_time", Long.valueOf(r7.A01()));
                    A002.AAJ("container_module", r3.getModuleName());
                    A002.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DA9(float f) {
        this.A07.DA9(f);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.KH9, X.11X] */
    public final void DAD(C270194gL r5) {
        Context context;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            String string = context.getString(2131961020);
            0qQ.A07(string);
            A01(string);
            1ES.A03(new KH9(context, r5, this));
            UserSession userSession = this.A01;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass4DU r3 = this.A06;
            0wc A012 = AnonymousClass0kN.A01(r3, userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_live_archive_download_click");
            A002.A9F("a_pk", Long.valueOf(Long.parseLong(r5.A03().getId())));
            String str = r5.A0e;
            str.getClass();
            A002.AAJ("m_pk", str);
            String str2 = r5.A0X;
            str2.getClass();
            A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
            C278134wK r0 = r5.A07;
            if (r0 != null) {
                A002.A9F("archive_id", Long.valueOf(Long.parseLong(r0.A00)));
                C278134wK r02 = r5.A07;
                if (r02 != null) {
                    z = r02.A01;
                } else {
                    z = false;
                }
                A002.A7p("can_share_to_igtv", Boolean.valueOf(z));
                A002.A9F("published_time", Long.valueOf(r5.A01()));
                A002.AAJ("container_module", r3.getModuleName());
                A002.Cgf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r0.A00 != r4.A1E.CMG(r7.A0H)) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DNo(X.C255773uh r6, X.C250973mM r7, X.C305736Ji r8, boolean r9) {
        /*
            r5 = this;
            X.4mU r3 = r5.A04
            r4 = r3
            instagram.features.stories.fragment.ReelViewerFragment r4 = (instagram.features.stories.fragment.ReelViewerFragment) r4
            X.3mM r0 = r4.A0a
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0027
            X.6hX r0 = r5.A02
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "reelChromeAnimationManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001b:
            int r2 = r0.A00
            com.instagram.model.reels.Reel r1 = r7.A0H
            X.4gh r0 = r4.A1E
            int r0 = r0.CMG(r1)
            if (r2 == r0) goto L_0x002c
        L_0x0027:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.ERT(r0)
        L_0x002c:
            X.3mM r0 = r4.A0a
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0036
            if (r9 == 0) goto L_0x0039
        L_0x0036:
            r3.D7R(r6, r8)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309636Za.DNo(X.3uh, X.3mM, X.6Ji, boolean):void");
    }

    public final boolean DPM(float f, float f2) {
        Context context;
        String str;
        AnonymousClass6Z5 r2 = (AnonymousClass6Z5) this.A07;
        Fragment fragment = (Fragment) r2.A1A.get();
        if (fragment == null || (context = fragment.getContext()) == null) {
            return false;
        }
        boolean A022 = 0mk.A02(context);
        C314416iE r0 = r2.A0q;
        if (r0 == null) {
            str = "backAffordanceHelper";
        } else {
            r0.A00(false);
            C311626cz r6 = r2.A0O;
            str = "reelScrubberController";
            if (r6 != null) {
                if (!r6.A03) {
                    return false;
                }
                if (A022) {
                    f = -f;
                }
                float f3 = f - r6.A00;
                r6.A00 = f;
                ReelViewerFragment reelViewerFragment = r6.A04.A00;
                C313426gQ r1 = reelViewerFragment.mVideoPlayer;
                int i = ((C313416gP) r1).A03;
                int currentPositionMs = r1.getCurrentPositionMs();
                C309966aD r02 = reelViewerFragment.A10;
                r02.getClass();
                float BrB = (float) r02.BrB();
                float f4 = (float) i;
                float f5 = (((float) currentPositionMs) / f4) * BrB;
                float max = Math.max(-f5, Math.min(BrB - f5, r6.A01 + f3));
                r6.A01 = max;
                int min = Math.min(i, Math.max(0, currentPositionMs + ((int) ((max / BrB) * f4))));
                r6.A02 = min;
                C309966aD r03 = r6.A05.A00.A10;
                r03.getClass();
                r03.DiM(min, i);
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DhE() {
        C314416iE r1 = ((AnonymousClass6Z5) this.A07).A0q;
        if (r1 == null) {
            0qQ.A0F("backAffordanceHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A00(false);
        }
    }

    public final void Djl(C270194gL r19) {
        FragmentActivity activity;
        C270194gL r0;
        boolean z;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A04;
            C250973mM r02 = reelViewerFragment.A0a;
            if (r02 != null) {
                r0 = r02.A0H.A0H;
            } else {
                r0 = null;
            }
            C270194gL r1 = r19;
            if (r1.equals(r0)) {
                C278134wK r03 = r1.A07;
                if (r03 == null || r03.A01) {
                    int i = ((C313416gP) reelViewerFragment.mVideoPlayer).A03;
                    if (i < 60000) {
                        LKI.A00(activity);
                    } else {
                        1YO r7 = 1YO.A00;
                        0qQ.A0A(r7);
                        UserSession userSession = this.A01;
                        if (userSession != null) {
                            String valueOf = String.valueOf(System.nanoTime());
                            String str = r1.A0X;
                            str.getClass();
                            long j = (long) i;
                            List A002 = C63328KvB.A00(r1);
                            AnonymousClass3NV r3 = r1.A0A;
                            if (r3 == null) {
                                r3 = AnonymousClass3NV.A08;
                            }
                            boolean z2 = false;
                            if (r3 == AnonymousClass3NV.A0A) {
                                z2 = true;
                            }
                            r7.A00(activity, userSession, (ExistingStandaloneFundraiserForFeedModel) null, valueOf, str, A002, j, false, z2);
                            UserSession userSession2 = this.A01;
                            if (userSession2 != null) {
                                1Ng A003 = AnonymousClass1Nd.A00(userSession2);
                                Class<C64671Lfx> cls = C64671Lfx.class;
                                27S r32 = this.A00;
                                if (r32 != null) {
                                    UserSession userSession3 = this.A01;
                                    if (userSession3 != null) {
                                        AnonymousClass1Nd.A00(userSession3).A02(r32, cls);
                                    }
                                }
                                C50294FWz fWz = new C50294FWz(r1, this);
                                this.A00 = fWz;
                                A003.A01(fWz, cls);
                            }
                        }
                        0qQ.A0F("userSession");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    C358248ab r33 = new C358248ab((Activity) activity);
                    r33.A09(2131965154);
                    r33.A08(2131965153);
                    r33.A06();
                    AnonymousClass0fN.A00(r33.A02());
                }
            }
            UserSession userSession4 = this.A01;
            if (userSession4 != null) {
                AnonymousClass4DU r5 = this.A06;
                0wc A012 = AnonymousClass0kN.A01(r5, userSession4);
                0Aj A004 = A012.A00(A012.A00, "ig_live_archive_share_click");
                A004.A9F("a_pk", Long.valueOf(Long.parseLong(r1.A03().getId())));
                String str2 = r1.A0e;
                str2.getClass();
                A004.AAJ("m_pk", str2);
                String str3 = r1.A0X;
                str3.getClass();
                A004.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str3)));
                C278134wK r04 = r1.A07;
                if (r04 != null) {
                    A004.A9F("archive_id", Long.valueOf(Long.parseLong(r04.A00)));
                    C278134wK r05 = r1.A07;
                    if (r05 != null) {
                        z = r05.A01;
                    } else {
                        z = false;
                    }
                    A004.A7p("can_share_to_igtv", Boolean.valueOf(z));
                    A004.A9F("published_time", Long.valueOf(r1.A01()));
                    A004.AAJ("container_module", r5.getModuleName());
                    A004.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean Dps(float f, float f2) {
        return this.A07.Dps(f, f2);
    }

    public final boolean Dpu() {
        return this.A07.Dpu();
    }

    public final boolean Dpw() {
        return this.A07.Dpw();
    }

    public final void Dqb(float f, float f2) {
        this.A07.Dqb(f, f2);
    }

    public C309636Za(AnonymousClass4DU r1, C273384mU r2, C317116mk r3, WeakReference weakReference) {
        this.A05 = weakReference;
        this.A07 = r3;
        this.A04 = r2;
        this.A06 = r1;
    }
}
