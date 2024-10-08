package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.NIi  reason: case insensitive filesystem */
public final class C68445NIi extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectVisualTimelineFragment";
    public View A00;
    public View A01;
    public OW6 A02;
    public AnonymousClass2Ep A03;
    public OW9 A04;
    public final String A05 = "camera_fragment_tag";
    public final String A06 = "viewer_fragment_tag";
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final long A08 = 200;

    public final String getModuleName() {
        return "direct_visual_timeline";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Window A0G = DbV.A0G(this);
        0qQ.A07(A0G);
        C61290mR.A05(A0G);
        this.A01 = AnonymousClass7TE.A0b(view2, R.id.child_viewer_fragment_holder);
        this.A00 = AnonymousClass7TE.A0b(view2, R.id.child_camera_fragment_holder);
        Context requireContext = requireContext();
        C70482O8h o8h = new C70482O8h(this);
        C70747OJt oJt = new C70747OJt(this);
        C70747OJt oJt2 = oJt;
        OW9 ow9 = new OW9(requireContext, o8h, oJt2, new C70483O8i(this), new C70748OJu(this));
        this.A04 = ow9;
        View A0b = AnonymousClass7TE.A0b(view2, R.id.visual_timeline_container);
        ow9.A01 = A0b;
        String str = "timelineContainer";
        RecyclerView A0F = DbZ.A0F(A0b, R.id.clips_timeline_recycler_view);
        ow9.A02 = A0F;
        if (A0F != null) {
            A0F.setAdapter(ow9.A08);
            RecyclerView recyclerView = ow9.A02;
            if (recyclerView != null) {
                Context context = ow9.A07;
                DbV.A1A(context, recyclerView);
                RecyclerView recyclerView2 = ow9.A02;
                if (recyclerView2 != null) {
                    recyclerView2.A11(new C67823MvR(context));
                    View view3 = ow9.A01;
                    if (view3 != null) {
                        View findViewById = view3.findViewById(R.id.direct_visual_timeline_play_indicator);
                        ow9.A00 = findViewById;
                        RecyclerView recyclerView3 = ow9.A02;
                        if (recyclerView3 != null) {
                            if (findViewById == null) {
                                str = "playIndicator";
                            } else {
                                C70748OJu oJu = ow9.A0C;
                                C70484O8j o8j = ow9.A0D;
                                ow9.A03 = new C72970PRd(context, findViewById, recyclerView3, ow9.A09, ow9.A0A, oJu, o8j);
                                OW6 ow6 = this.A02;
                                if (ow6 == null) {
                                    A00(this);
                                    OW9 ow92 = this.A04;
                                    if (ow92 != null) {
                                        ow92.A02(0sn.A00);
                                        return;
                                    }
                                } else {
                                    ArrayList A1C = AnonymousClass7TE.A1C();
                                    List list = ow6.A03;
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        C68167N3h A012 = ow6.A01(i);
                                        if (A012 != null) {
                                            A1C.add(A012);
                                        }
                                    }
                                    OW9 ow93 = this.A04;
                                    if (ow93 != null) {
                                        ow93.A02(A1C);
                                        Bundle bundle2 = requireArguments().getBundle("DirectVisualTimelineFragment.VISUAL_VIEWER_ARGS");
                                        if (list.size() > 0 && bundle2 != null) {
                                            OW9 ow94 = this.A04;
                                            if (ow94 != null) {
                                                ow94.A01();
                                                Fragment r4 = new AnonymousClass4DH();
                                                AnonymousClass0Dg.A00(bundle2, DbT.A0X(this.A07));
                                                r4.setArguments(bundle2);
                                                OW9 ow95 = this.A04;
                                                if (ow95 != null) {
                                                    C72970PRd pRd = ow95.A03;
                                                    if (pRd == null) {
                                                        str = "directVisualTimelineScrollController";
                                                    } else {
                                                        r4.A02 = pRd;
                                                        0s1 A0C = DbW.A0C(this);
                                                        A0C.A0C(r4, this.A06, R.id.child_viewer_fragment_holder);
                                                        A0C.A00();
                                                        return;
                                                    }
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                0qQ.A0F("timelineController");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F("timelineRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C68445NIi nIi) {
        28D r3 = 28D.A2H;
        AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(nIi.A07)).A07(r3, true);
        A01(nIi);
        View view = nIi.A00;
        String str = "childCameraFragmentHolder";
        if (view != null) {
            Fragment A0R = nIi.getChildFragmentManager().A0R(nIi.A05);
            if (A0R == null || !A0R.isAdded()) {
                0nA.A0p(view, new C73322Pah(view, r3, nIi));
            }
            View view2 = nIi.A00;
            if (view2 != null) {
                if (view2.getVisibility() != 0) {
                    OW9 ow9 = nIi.A04;
                    if (ow9 == null) {
                        str = "timelineController";
                    } else {
                        C72970PRd pRd = ow9.A03;
                        if (pRd == null) {
                            str = "directVisualTimelineScrollController";
                        } else {
                            ListIterator A18 = C51968G9o.A18(pRd.A03);
                            while (true) {
                                if (!A18.hasPrevious()) {
                                    break;
                                } else if (A18.previous() instanceof NPI) {
                                    int nextIndex = A18.nextIndex();
                                    if (nextIndex != -1) {
                                        AnonymousClass52S r1 = pRd.A08;
                                        r1.A00 = nextIndex;
                                        C252553pI r0 = pRd.A09.A0D;
                                        if (r0 != null) {
                                            r0.A0t(r1);
                                        }
                                    }
                                }
                            }
                            pRd.A01 = -1;
                            pRd.A00 = 0.0f;
                            View view3 = nIi.A00;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                View view4 = nIi.A00;
                                if (view4 != null) {
                                    view4.setAlpha(0.0f);
                                    View view5 = nIi.A00;
                                    if (view5 != null) {
                                        DbY.A0G(view5).setDuration(nIi.A08).start();
                                        View view6 = nIi.A01;
                                        if (view6 == null) {
                                            str = "childViewerFragmentHolder";
                                        } else {
                                            view6.setVisibility(8);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public static final void A01(C68445NIi nIi) {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        C68463NJb A0R = nIi.getChildFragmentManager().A0R(nIi.A06);
        if (A0R != null && A0R.isResumed() && (directVisualMessageViewerController = A0R.A01) != null) {
            directVisualMessageViewerController.A0W("seek");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0073, code lost:
        if (r7 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -488489999(0xffffffffe2e23bf1, float:-2.0866417E21)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C68445NIi.super.onCreate(r12)
            X.0eM r4 = r11.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.2Dm r8 = X.1bJ.A00(r0)
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            com.instagram.model.direct.DirectThreadKey r3 = (com.instagram.model.direct.DirectThreadKey) r3
            java.lang.String r0 = "DirectVisualTimelineFragment.VISUAL_VIEWER_ARGS"
            android.os.Bundle r5 = r1.getBundle(r0)
            r0 = 0
            if (r3 == 0) goto L_0x0079
            r1 = r8
            X.2Dr r1 = (X.2Dr) r1
            X.3U9 r7 = X.2Dr.A03(r1, r3)
        L_0x0030:
            if (r5 == 0) goto L_0x0073
            r1 = 0
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY"
            boolean r10 = r5.getBoolean(r0, r1)
            java.lang.String r0 = "DirectVisualMessageViewerFragment.REPLAY_SESSION_ID"
            java.lang.String r9 = r5.getString(r0)
            r0 = 440(0x1b8, float:6.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r5.getString(r0)
            r0 = 924(0x39c, float:1.295E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getString(r0)
            if (r7 == 0) goto L_0x0075
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r5 = r11.requireActivity()
            if (r9 == 0) goto L_0x007b
            X.OLj r4 = new X.OLj
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.OW6 r0 = r4.A00(r3, r1, r0)
        L_0x0068:
            r11.A03 = r7
            r11.A02 = r0
        L_0x006c:
            r0 = 406421047(0x18397e37, float:2.3974412E-24)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0073:
            if (r7 != 0) goto L_0x0068
        L_0x0075:
            X.DbT.A1K(r11)
            goto L_0x006c
        L_0x0079:
            r7 = r0
            goto L_0x0030
        L_0x007b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1102097826(0x41b0ada2, float:22.084782)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68445NIi.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1262886633);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_visual_timeline, viewGroup, false);
        AnonymousClass0fD.A09(403972711, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-339295351);
        super.onResume();
        Window A0G = DbV.A0G(this);
        0qQ.A07(A0G);
        2db.A07(DbV.A0G(this).getDecorView(), A0G, false);
        C317756nm.A05(requireActivity(), AnonymousClass7TE.A0l(this.A07), true);
        AnonymousClass0fD.A09(-1927015607, A022);
    }
}
