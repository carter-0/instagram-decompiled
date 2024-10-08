package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class K8J extends MYR implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "IgLiveQuestionBaseFragment";
    public LinearLayout A00;
    public TextView A01;
    public TextView A02;
    public C313886hJ A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public Collection getDefinitions() {
        C313666go r6;
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A07);
        if (this instanceof C62263Kcx) {
            r6 = C313666go.VIEWER;
        } else {
            r6 = C313666go.BROADCASTER;
        }
        return JTT.A0s(new C15794Uid(requireContext, this, A0l, r6, this), new KG8(C66365MOw.A00));
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.question_sheet_empty_container);
        0qQ.A0B(linearLayout, 0);
        this.A00 = linearLayout;
        TextView A0G = DbU.A0G(view, R.id.question_sheet_empty_title);
        0qQ.A0B(A0G, 0);
        this.A02 = A0G;
        TextView A0G2 = DbU.A0G(view, R.id.question_sheet_empty_description);
        0qQ.A0B(A0G2, 0);
        this.A01 = A0G2;
        getRecyclerView().setOverScrollMode(1);
        C313886hJ r0 = this.A03;
        if (r0 != null) {
            DbV.A1F(getViewLifecycleOwner(), r0.A02, new MPC(this, 20), 69);
        }
        C313886hJ r1 = this.A03;
        if (r1 != null) {
            String str = this.A04;
            if (str != null) {
                r1.A05(str, true);
            } else {
                0qQ.A0F("broadcastId");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.2tL, java.lang.Object] */
    public final List A0C() {
        Context requireContext;
        int i;
        if (this instanceof C62263Kcx) {
            C62263Kcx kcx = (C62263Kcx) this;
            Context requireContext2 = kcx.requireContext();
            String str = kcx.A04;
            if (str != null) {
                return 0sr.A1P(new C232262tL[]{new C64813LiY("QUESTION_SHEET_DESCRIPTION_TITLE", (String) null, DbW.A0h(requireContext2, str, 2131965305)), new Object()});
            }
            0qQ.A0F("broadcaster");
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = null;
        if (this.A06) {
            requireContext = requireContext();
            i = 2131965312;
        } else {
            boolean z = this.A05;
            requireContext = requireContext();
            if (z) {
                i = 2131965303;
            } else {
                str2 = requireContext.getString(2131965306);
                requireContext = requireContext();
                i = 2131965304;
            }
        }
        String string = requireContext.getString(i);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C64813LiY.A00("QUESTION_SHEET_DESCRIPTION_TITLE", str2, string, A1C);
        return A1C;
    }

    public void A0D() {
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            A0B(0sn.A00);
            return;
        }
        0qQ.A0F("emptyStateContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0E(long j) {
        C358248ab A0U;
        int i;
        C318136oS A002;
        AnonymousClass4D7 r7;
        int i2;
        long j2 = j;
        if (this instanceof C62263Kcx) {
            C313886hJ r5 = this.A03;
            if (r5 != null) {
                String str = this.A04;
                if (str != null) {
                    LGC lgc = (LGC) r5.A08.A08.get(Long.valueOf(j));
                    if (lgc != null && lgc.A06 == C391379sn.UNANSWERED) {
                        boolean z = lgc.A09;
                        long j3 = lgc.A01;
                        if (z) {
                            C313886hJ.A01(r5, -1, j3, false);
                            A002 = C318116oQ.A00(r5);
                            r7 = null;
                            i2 = 31;
                        } else {
                            C313886hJ.A01(r5, 1, j3, true);
                            A002 = C318116oQ.A00(r5);
                            r7 = null;
                            i2 = 30;
                        }
                        AnonymousClass7TE.A1Z(new C66173MGk(lgc, r5, str, r7, i2), A002);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            if (this.A06) {
                A0U = DbW.A0U(this);
                i = 2131965312;
            } else if (this.A05) {
                A0U = DbW.A0U(this);
                i = 2131965303;
            } else {
                C313886hJ r4 = this.A03;
                if (r4 != null) {
                    String str2 = this.A04;
                    if (str2 != null) {
                        AnonymousClass2Fj r3 = r4.A03;
                        LGC lgc2 = (LGC) r3.A02();
                        if (lgc2 == null || lgc2.A01 != j) {
                            Object obj = r4.A08.A08.get(Long.valueOf(j));
                            if (obj != null) {
                                r3.A0B(obj);
                            } else {
                                0wb.A03("IgLiveQuestionsViewModel", 002.A0Q("Attempt to update a question that doesn't exist: ", j));
                            }
                            AnonymousClass7TE.A1Z(new MEV(r4, str2, (AnonymousClass4D7) null, 3, j2), C318116oQ.A00(r4));
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            A0U.A08(i);
            Dba.A1L(A0U);
            return;
        }
        0qQ.A0F("broadcastId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MPC(this, 19));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r14 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r10.A06 != X.C391379sn.UNANSWERED) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (X.0qQ.A0K(X.DbX.A0l(X.AnonymousClass0t1.A01, r4.A07), r10.A04) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.K8J r31, java.util.List r32, int r33) {
        /*
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r32)
            java.util.Iterator r15 = r32.iterator()
        L_0x0008:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r10 = r15.next()
            X.LGC r10 = (X.LGC) r10
            X.Uz5 r1 = X.C16669Uz5.LIVE
            X.Uz5 r0 = r10.A05
            r4 = r31
            if (r1 != r0) goto L_0x002d
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r4.A07
            com.instagram.user.model.User r1 = X.DbX.A0l(r1, r0)
            com.instagram.user.model.User r0 = r10.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            r14 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            long r1 = r10.A01
            java.lang.String r13 = r10.A08
            com.instagram.common.typedurl.ImageUrl r9 = r10.A03
            com.instagram.user.model.User r8 = r10.A04
            int r7 = r10.A00
            r5 = r33
            if (r33 == 0) goto L_0x00a1
            X.9sn r3 = r10.A06
            X.9sn r0 = X.C391379sn.UNANSWERED
            if (r3 != r0) goto L_0x00a1
            float r6 = (float) r7
            float r0 = (float) r5
            float r6 = r6 / r0
        L_0x0045:
            boolean r0 = r4 instanceof X.C62263Kcx
            if (r0 == 0) goto L_0x009e
            X.6go r12 = X.C313666go.VIEWER
        L_0x004b:
            X.6go r5 = X.C313666go.BROADCASTER
            if (r12 == r5) goto L_0x0053
            r26 = 0
            if (r14 == 0) goto L_0x0055
        L_0x0053:
            r26 = 1
        L_0x0055:
            if (r12 == r5) goto L_0x009b
            X.9sn r3 = r10.A06
            X.9sn r0 = X.C391379sn.UNANSWERED
            if (r3 == r0) goto L_0x0061
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x009b
        L_0x0061:
            r27 = 1
        L_0x0063:
            boolean r4 = r10.A09
            if (r12 == r5) goto L_0x006f
            X.9sn r3 = r10.A06
            X.9sn r0 = X.C391379sn.UNANSWERED
            r29 = 1
            if (r3 == r0) goto L_0x0071
        L_0x006f:
            r29 = 0
        L_0x0071:
            if (r12 == r5) goto L_0x0077
            r30 = 0
            if (r14 != 0) goto L_0x0079
        L_0x0077:
            r30 = 1
        L_0x0079:
            X.9sn r3 = r10.A06
            X.Jvq r5 = r10.A02
            X.WSh r0 = new X.WSh
            r24 = r1
            r28 = r4
            r21 = r13
            r22 = r6
            r23 = r7
            r18 = r9
            r19 = r8
            r20 = r3
            r16 = r0
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
            r11.add(r0)
            goto L_0x0008
        L_0x009b:
            r27 = 0
            goto L_0x0063
        L_0x009e:
            X.6go r12 = X.C313666go.BROADCASTER
            goto L_0x004b
        L_0x00a1:
            r6 = 0
            goto L_0x0045
        L_0x00a3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8J.A00(X.K8J, java.util.List, int):java.util.List");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToBottom() {
        return !getRecyclerView().canScrollVertically(1);
    }

    public final boolean isScrolledToTop() {
        return !JTP.A1Y(getRecyclerView());
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1174673413);
        K8J.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("IgLiveQuestionListFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID", "0");
        0qQ.A0B(string, 0);
        this.A04 = string;
        this.A05 = requireArguments.getBoolean("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_IS_BADGES_ENABLED", false);
        this.A06 = requireArguments.getBoolean("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_IS_DONATIONS_ENABLED", false);
        AnonymousClass0fD.A09(1299322917, A022);
    }
}
