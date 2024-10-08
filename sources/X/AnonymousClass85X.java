package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.85X  reason: invalid class name */
public final class AnonymousClass85X implements AnonymousClass85Y, 27S {
    public static final List A0h = 0sr.A1P(new 28D[]{28D.A0a, 28D.A5X, 28D.A5Y, 28D.A5B, 28D.A43});
    public float A00;
    public int A01;
    public FrameLayout A02;
    public AnonymousClass87G A03;
    public C279284yO A04;
    public C279284yO A05;
    public AnonymousClass85Y A06;
    public AnonymousClass8IY A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final ViewGroup A0M;
    public final FrameLayout A0N;
    public final 2cs A0O;
    public final 2cs A0P;
    public final AnonymousClass4DH A0Q;
    public final UserSession A0R;
    public final C357638Yz A0S;
    public final C3505185a A0T;
    public final LegacyCameraDestinationScrollView A0U;
    public final AnonymousClass80D A0V;
    public final C3496481e A0W;
    public final AnonymousClass80U A0X;
    public final C314676if A0Y;
    public final Set A0Z = new 04u(0);
    public final 0sP A0a;
    public final 0sP A0b;
    public final ClipsAssetHubViewModel A0c;
    public final AnonymousClass85W A0d;
    public final C3504884v A0e;
    public final AnonymousClass85O A0f;
    public final boolean A0g;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01e9, code lost:
        if (r4.A3b != false) goto L_0x01eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass85X(X.C357638Yz r20, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r21, X.AnonymousClass80D r22, X.C3496481e r23, X.AnonymousClass85W r24, X.C3504884v r25, X.AnonymousClass85O r26, X.AnonymousClass80U r27) {
        /*
            r19 = this;
            r14 = 1
            r0 = 2
            r10 = r26
            X.0qQ.A0B(r10, r0)
            r0 = 3
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r13 = r19
            r13.<init>()
            r4 = r22
            r13.A0V = r4
            r13.A0f = r10
            r13.A0c = r1
            r2 = r27
            r13.A0X = r2
            r12 = r20
            r13.A0S = r12
            r11 = r25
            r13.A0e = r11
            r0 = r23
            r13.A0W = r0
            android.view.ViewGroup r9 = r4.A09
            X.0qQ.A07(r9)
            r13.A0M = r9
            r3 = 0
            r18 = 0
            X.04u r0 = new X.04u
            r0.<init>(r3)
            r13.A0Z = r0
            X.4DH r0 = r4.A0M
            r0.getClass()
            X.4DH r8 = r4.A0M
            X.0qQ.A07(r8)
            r13.A0Q = r8
            com.instagram.common.session.UserSession r7 = r4.A0S
            X.0qQ.A07(r7)
            r13.A0R = r7
            java.lang.Boolean r0 = r4.A21
            if (r0 == 0) goto L_0x01c6
            boolean r1 = r0.booleanValue()
        L_0x0056:
            r13.A0g = r1
            X.9QA r0 = X.AnonymousClass9QA.A00
            r13.A05 = r0
            X.85Z r1 = new X.85Z
            r1.<init>(r13)
            X.6id[] r0 = new X.C314656id[r3]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r13.A0Y = r0
            r0 = 28
            X.9LG r6 = new X.9LG
            r6.<init>(r13, r0)
            r13.A0b = r6
            r0 = 27
            X.9LG r5 = new X.9LG
            r5.<init>(r13, r0)
            r13.A0a = r5
            X.85a r0 = new X.85a
            r0.<init>()
            r13.A0T = r0
            X.85b r0 = new X.85b
            r0.<init>(r13)
            r2.A7w(r0)
            X.85c r0 = new X.85c
            r0.<init>(r13)
            r2.A7z(r0)
            X.80m r4 = r12.A08
            java.lang.Object r0 = r4.A00
            X.4yO r0 = (X.C279284yO) r0
            r13.A04 = r0
            r0 = r24
            r13.A0d = r0
            r0 = 2131429427(0x7f0b0833, float:1.8480526E38)
            android.view.View r3 = r9.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r3 = (com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView) r3
            r13.A0U = r3
            com.instagram.common.session.UserSession r0 = r13.A0R
            X.0Tu r2 = X.0Tu.A05
            r16 = 36327812642585308(0x810ff400073adc, double:3.0371932233066263E-306)
            r15 = r0
            r0 = r16
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 36329801211986254(0x8111c30000414e, double:3.038450802603111E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00ce
            X.APS r0 = new X.APS
            r0.<init>(r13)
            X.AnonymousClass03j.A00(r3, r0)
        L_0x00ce:
            r13.A08(r14)
            r3.setUserSession(r7)
            X.85f r1 = new X.85f
            r1.<init>(r13)
            com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView r0 = r3.A06
            r0.A0A(r1)
            X.2cp r0 = X.C61340me.A00()
            X.2cs r1 = r0.A02()
            r1.A06 = r14
            X.85g r0 = new X.85g
            r0.<init>(r13)
            r1.A0A(r0)
            r13.A0P = r1
            r0 = 2131432761(0x7f0b1539, float:1.8487289E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r13.A0N = r0
            X.2cp r0 = X.C61340me.A00()
            X.2cs r1 = r0.A02()
            r1.A06 = r14
            X.85h r0 = new X.85h
            r0.<init>(r13)
            r1.A0A(r0)
            r13.A0O = r1
            r0 = 36324230639398802(0x810cb200002f92, double:3.034927950067911E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0134
            r0 = 2131438046(0x7f0b29de, float:1.8498008E38)
            android.view.View r0 = r9.findViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x01c2
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L_0x0132:
            r13.A02 = r1
        L_0x0134:
            java.lang.Object r0 = r4.A00
            X.4yO r0 = (X.C279284yO) r0
            r13.A05 = r0
            X.85i r1 = new X.85i
            r1.<init>(r5)
            java.util.Set r0 = r12.A0G
            r0.add(r1)
            X.80m r0 = r12.A07
            r0.A01(r1)
            java.util.ArrayList r0 = A01(r13)
            A07(r13, r0)
            X.85i r0 = new X.85i
            r0.<init>(r6)
            r12.A0F(r0)
            java.lang.Object r0 = r4.A00
            X.4yO r0 = (X.C279284yO) r0
            A02(r0, r13)
            X.0Ud r3 = r10.A0E
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.CameraDestinationPickerController$7 r2 = new com.instagram.creation.capture.quickcapture.cameradestinationpicker.CameraDestinationPickerController$7
            r0 = r18
            r2.<init>(r13, r0)
            X.0pz r1 = new X.0pz
            r1.<init>(r2, r3)
            X.07Z r0 = r8.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            X.AnonymousClass11O.A03(r0, r1)
            X.0Ud r3 = r10.A0F
            r1 = 21
            X.9Js r2 = new X.9Js
            r0 = r18
            r2.<init>(r13, r0, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r2, r3)
            X.07Z r0 = r8.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            X.AnonymousClass11O.A03(r0, r1)
            if (r25 == 0) goto L_0x01c1
            X.05G r0 = r11.A0c
            X.19B r3 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 26
            X.9LG r1 = new X.9LG
            r1.<init>(r13, r0)
            X.85n r0 = new X.85n
            r0.<init>(r1)
            r2.A06(r8, r0)
            X.05G r0 = r11.A0Z
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r3, r0)
            r0 = 25
            X.9LG r1 = new X.9LG
            r1.<init>(r13, r0)
            X.85n r0 = new X.85n
            r0.<init>(r1)
            r2.A06(r8, r0)
        L_0x01c1:
            return
        L_0x01c2:
            r1 = r18
            goto L_0x0132
        L_0x01c6:
            boolean r0 = r4.A3k
            if (r0 != 0) goto L_0x01eb
            java.lang.String r1 = r4.A2q
            java.lang.String r0 = "story_selfie_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r4.A3m
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r4.A3E
            if (r0 != 0) goto L_0x01eb
            java.lang.Integer r1 = r4.A28
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x01eb
            X.82i r0 = r4.A18
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r4.A3b
            r1 = 0
            if (r0 == 0) goto L_0x0056
        L_0x01eb:
            r1 = 1
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.<init>(X.8Yz, com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.80D, X.81e, X.85W, X.84v, X.85O, X.80U):void");
    }

    public final void A0C() {
        this.A09 = false;
        2cs r3 = this.A0O;
        r3.A08(0.01d, true);
        r3.A06(1.0d);
        if (this.A0Q.isResumed()) {
            AnonymousClass85W r1 = this.A0d;
            AnonymousClass80R r5 = r1.A01;
            AnonymousClass4DH r2 = r5.A0J;
            0hq childFragmentManager = r2.getChildFragmentManager();
            if (AnonymousClass06S.A01(childFragmentManager) && childFragmentManager.A0P(R.id.feed_gallery_fragment_holder) == null) {
                Activity activity = r5.A09;
                UserSession userSession = r5.A0R;
                JWO jwo = new JWO(activity, r2, userSession);
                AnonymousClass80D r9 = r1.A00;
                MusicAttributionConfig musicAttributionConfig = r9.A1N;
                boolean z = r9.A3O;
                28D r11 = r5.A01;
                PendingRecipient pendingRecipient = r9.A1S;
                boolean z2 = r9.A3c;
                0qQ.A0B(userSession, 0);
                0qQ.A0B(r11, 4);
                Bundle bundle = new Bundle();
                AnonymousClass0Dg.A00(bundle, userSession);
                bundle.putBoolean("standalone_mode", false);
                bundle.putParcelable("ARG_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
                bundle.putBoolean("ARG_IS_EXCLUSIVE_BY_DEFAULT", z);
                bundle.putSerializable("ARG_CAMERA_ENTRY_POINT", r11);
                bundle.putParcelable("ARG_TARGET_GROUP_PROFILE", pendingRecipient);
                bundle.putBoolean("ARG_IS_QUIET_POSTING_FLOW", z2);
                AnonymousClass8ZV r22 = new AnonymousClass8ZV();
                r22.setArguments(bundle);
                r22.A09 = r9.A0i;
                r22.A04 = jwo;
                r22.A05 = new AnonymousClass9Q3(r1);
                r22.A0C = new AnonymousClass9Q2(r1);
                0s1 r12 = new 0s1(childFragmentManager);
                r12.A0D(r22, AnonymousClass8ZV.__redex_internal_original_name, R.id.feed_gallery_fragment_holder);
                r12.A00();
                r5.A07 = false;
                childFragmentManager.A0a();
            }
        }
    }

    public final /* synthetic */ void onPause() {
    }

    public static final ArrayList A01(AnonymousClass85X r1) {
        return new ArrayList((Collection) r1.A0S.A07.A00);
    }

    public static final void A02(C279284yO r9, AnonymousClass85X r10) {
        TextView textView;
        TextView textView2;
        if (!0qQ.A0K(r10.A04, r9)) {
            r10.A04 = r9;
            r10.A0A();
            r10.A0B();
            if (r10.A0F && (r9 instanceof C363138jC)) {
                JW1.A00(r10.A0R).A03(28D.A5B);
            }
        }
        int A002 = A00(r9, r10);
        if (A002 >= 0) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = r10.A0U;
            if (legacyCameraDestinationScrollView.getVisibility() == 0) {
                boolean A082 = 0oh.A08();
                ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
                int childCount = reboundHorizontalScrollView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = reboundHorizontalScrollView.getChildAt(i);
                    if (childAt instanceof IgTextView) {
                        textView2 = (TextView) childAt;
                        if (textView2 != null) {
                            textView2.setAlpha(0.5f);
                        }
                    } else {
                        textView2 = null;
                    }
                    if (A082) {
                        if (textView2 != null) {
                            textView2.setTypeface(0oh.A02(textView2.getContext()));
                        }
                    } else if (textView2 != null) {
                        textView2.setTypeface((Typeface) null, 0);
                    }
                }
                View childAt2 = reboundHorizontalScrollView.getChildAt(A002);
                if (childAt2 instanceof TextView) {
                    textView = (TextView) childAt2;
                    if (textView != null) {
                        textView.setAlpha(1.0f);
                    }
                } else {
                    textView = null;
                }
                if (A082) {
                    if (textView != null) {
                        textView.setTypeface(0oh.A00(textView.getContext()));
                    }
                } else if (textView != null) {
                    textView.setTypeface((Typeface) null, 1);
                }
                r10.A0T.A00 = textView;
            }
        }
        if (!r10.A0J) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView2 = r10.A0U;
            if (!legacyCameraDestinationScrollView2.isLaidOut()) {
                0nA.A0q(legacyCameraDestinationScrollView2, new C3506285l(r9, r10));
            } else {
                A03(r9, r10, true);
            }
        }
    }

    public static final void A04(AnonymousClass85X r6) {
        C279284yO r1 = (C279284yO) r6.A0S.A08.A00;
        if (!(r1 instanceof AnonymousClass9QA) ? !(r1 instanceof AnonymousClass80O) : r6.A0f.A03(r1)) {
            float f = r6.A00;
            if (f > 0.0f && f <= 1.0f) {
                r6.A08(false);
                return;
            }
        }
        r6.A08(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r5.A09() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r5.A00 != 0.0f) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass85X r5) {
        /*
            X.2cs r0 = r5.A0O
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            float r3 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x009c
            X.85Y r0 = r5.A06
            if (r0 == 0) goto L_0x0014
            r0.onPause()
        L_0x0014:
            com.instagram.common.session.UserSession r2 = r5.A0R
            X.81e r0 = r5.A0W
            X.80R r1 = r0.A00
            X.28D r0 = r1.A01
            boolean r0 = X.C3505485d.A01(r0, r2)
            r4 = 0
            if (r0 != 0) goto L_0x0037
            X.28D r1 = r1.A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = X.C3505585e.A00(r1, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0037
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x0047
        L_0x0037:
            X.4yO r1 = r5.A04
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0047
            float r0 = r5.A00
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
        L_0x0047:
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r0 = r5.A0U
            r0.setLabelBackgroundProgress(r3)
        L_0x004c:
            android.widget.FrameLayout r2 = r5.A0N
            r1 = 0
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0055:
            r2.setAlpha(r1)
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x005f
            r0 = 8
        L_0x005f:
            r2.setVisibility(r0)
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
            X.4DH r1 = r5.A0Q
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x008f
            X.0hq r2 = r1.getChildFragmentManager()
            X.0qQ.A07(r2)
            boolean r0 = X.AnonymousClass06S.A01(r2)
            if (r0 == 0) goto L_0x008f
            r0 = 2131432761(0x7f0b1539, float:1.8487289E38)
            androidx.fragment.app.Fragment r1 = r2.A0P(r0)
            if (r1 == 0) goto L_0x008f
            X.0s1 r0 = new X.0s1
            r0.<init>(r2)
            r0.A03(r1)
            r0.A00()
        L_0x008f:
            return
        L_0x0090:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x008f
            r0 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A05(r2, r0)
            return
        L_0x009c:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            X.80U r0 = r5.A0X
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x0014
            X.85Y r0 = r5.A06
            if (r0 == 0) goto L_0x0014
            r0.onResume()
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.A05(X.85X):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r1 == X.AnonymousClass87I.A0Y) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r0.A00.ordinal() == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r0 == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        if (r10.A0A == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
        if (r9 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0123, code lost:
        if (r7 == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A0R, 36327387440626064L) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass85X r10) {
        /*
            boolean r0 = r10.A0g
            r3 = 0
            if (r0 != 0) goto L_0x0032
            X.8Yz r5 = r10.A0S
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r5.A06()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0032
            r4 = 1
            r2 = 2
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r5.A0P()
            if (r0 == 0) goto L_0x003a
            com.instagram.common.session.UserSession r7 = r10.A0R
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327387440626064(0x810f9100043990, double:3.0369243238754496E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x003a
        L_0x0032:
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r1 = r10.A0U
            r0 = 8
            r1.setVisibility(r0)
        L_0x0039:
            return
        L_0x003a:
            X.87G r0 = r10.A03
            if (r0 == 0) goto L_0x0051
            X.87I r1 = r0.A04
            X.87I r0 = X.AnonymousClass87I.EMPTY
            if (r1 == r0) goto L_0x0051
            if (r1 != 0) goto L_0x0048
            X.87I r1 = X.AnonymousClass87I.EMPTY
        L_0x0048:
            X.87I r0 = X.AnonymousClass87I.TYPE
            if (r1 == r0) goto L_0x0051
            X.87I r0 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT
            r9 = 1
            if (r1 != r0) goto L_0x0052
        L_0x0051:
            r9 = 0
        L_0x0052:
            X.8IY r0 = r10.A07
            if (r0 == 0) goto L_0x005f
            X.8IW r0 = r0.A00
            int r0 = r0.ordinal()
            r7 = 1
            if (r0 != r3) goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            java.lang.Integer r1 = r10.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6 = 0
            if (r1 != r0) goto L_0x0068
            r6 = 1
        L_0x0068:
            float r0 = r10.A00
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0195
            X.80m r0 = r5.A08
            java.lang.Object r1 = r0.A00
            X.80N r0 = X.AnonymousClass80N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0187
            com.instagram.common.session.UserSession r1 = r10.A0R
            X.81e r0 = r10.A0W
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            boolean r0 = X.C3505485d.A01(r0, r1)
        L_0x0088:
            if (r0 != 0) goto L_0x0195
        L_0x008a:
            r1 = 1
        L_0x008b:
            boolean r0 = r10.A0D
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r10.A0H
            if (r0 != 0) goto L_0x00ae
            X.80U r0 = r10.A0X
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r10.A0K
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x00ae
            if (r7 != 0) goto L_0x00ae
            if (r6 != 0) goto L_0x00ae
            if (r1 != 0) goto L_0x00ae
            boolean r0 = r10.A0A
            r7 = 0
            if (r0 == 0) goto L_0x00af
        L_0x00ae:
            r7 = 1
        L_0x00af:
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r10.A0E
            if (r0 != 0) goto L_0x00bd
            if (r7 != 0) goto L_0x00bc
            r7 = 0
            if (r9 == 0) goto L_0x00bd
        L_0x00bc:
            r7 = 1
        L_0x00bd:
            X.8aL r0 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r5.A0V(r0)
            r6 = 0
            if (r0 == 0) goto L_0x00d1
            float r0 = r10.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            r7 = 1
        L_0x00d1:
            X.8IY r0 = r10.A07
            if (r0 == 0) goto L_0x00e5
            X.8IX r0 = r0.A01
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0184
            if (r1 == r4) goto L_0x0184
            r0 = 4
            if (r1 == r0) goto L_0x0184
            r0 = 3
            if (r1 == r0) goto L_0x0184
        L_0x00e5:
            X.80U r0 = r10.A0X
            X.80V r0 = r0.Atr()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0180;
                case 1: goto L_0x017d;
                case 2: goto L_0x017d;
                case 3: goto L_0x017d;
                case 4: goto L_0x0180;
                case 5: goto L_0x0180;
                case 6: goto L_0x0180;
                case 7: goto L_0x0180;
                case 8: goto L_0x0180;
                case 10: goto L_0x0180;
                case 11: goto L_0x0180;
                case 34: goto L_0x0180;
                case 47: goto L_0x0180;
                case 48: goto L_0x0180;
                case 50: goto L_0x0180;
                case 51: goto L_0x0180;
                case 52: goto L_0x0180;
                case 53: goto L_0x0180;
                case 54: goto L_0x0180;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            X.85O r1 = r10.A0f
            X.80m r5 = r5.A08
            java.lang.Object r0 = r5.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x016c
            int r0 = r10.A01
            if (r0 != 0) goto L_0x010f
            java.lang.Object r0 = r5.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x016c
        L_0x010f:
            float r0 = r10.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x016c
            r7 = 1
        L_0x0116:
            X.2cs r2 = r10.A0P
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A06(r0)
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r2 = r10.A0U
            r2.setEnabled(r3)
            r4 = 0
            if (r7 != 0) goto L_0x0169
        L_0x0125:
            com.instagram.common.session.UserSession r1 = r10.A0R
            X.81e r0 = r10.A0W
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            boolean r0 = X.C3505485d.A01(r0, r1)
            if (r0 == 0) goto L_0x0166
            java.lang.Object r0 = r5.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0166
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x0143
            float r0 = r10.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0169
        L_0x0143:
            r2.setVisibility(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x0039
            X.4yO r1 = r10.A04
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0039
            X.4yO r1 = r10.A04
            X.80J r0 = X.AnonymousClass80J.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0039
            float r0 = r10.A00
            r2.setLabelBackgroundProgress(r0)
            return
        L_0x0166:
            if (r4 == 0) goto L_0x0169
            goto L_0x0143
        L_0x0169:
            r3 = 8
            goto L_0x0143
        L_0x016c:
            if (r7 != 0) goto L_0x0116
            if (r2 == 0) goto L_0x0116
            X.2cs r2 = r10.A0P
            r0 = 0
            r2.A06(r0)
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r2 = r10.A0U
            r2.setEnabled(r4)
            goto L_0x0125
        L_0x017d:
            r2 = 1
            goto L_0x00f3
        L_0x0180:
            r2 = 0
            r7 = 1
            goto L_0x00f3
        L_0x0184:
            r7 = 1
            goto L_0x00e5
        L_0x0187:
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008a
            boolean r0 = r10.A09()
            goto L_0x0088
        L_0x0195:
            r1 = 0
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.A06(X.85X):void");
    }

    public static final void A07(AnonymousClass85X r11, List list) {
        Integer num;
        LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = r11.A0U;
        if (!0qQ.A0K(legacyCameraDestinationScrollView.A01, list)) {
            legacyCameraDestinationScrollView.A01 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C279284yO r1 = (C279284yO) it.next();
                linkedHashMap.put(Integer.valueOf(LegacyCameraDestinationScrollView.A00(r1)), r1);
            }
            int i = 0;
            01K r9 = new 01K(16);
            int[] iArr = AnonymousClass01R.A00;
            01Q r6 = new 01Q();
            0vr r0 = 01o.A01;
            C63090yB.A02(r6, 6);
            ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
            int childCount = reboundHorizontalScrollView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = reboundHorizontalScrollView.getChildAt(i2);
                if (!linkedHashMap.containsKey(Integer.valueOf(childAt.getId()))) {
                    r9.A02(i2);
                } else {
                    r6.A06(childAt.getId());
                }
            }
            int[] iArr2 = r9.A01;
            for (int i3 = r9.A00 - 1; -1 < i3; i3--) {
                reboundHorizontalScrollView.removeViewAt(iArr2[i3]);
            }
            Set entrySet = linkedHashMap.entrySet();
            0qQ.A07(entrySet);
            for (Object next : entrySet) {
                int i4 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                Map.Entry entry = (Map.Entry) next;
                0qQ.A0A(entry);
                Object key = entry.getKey();
                0qQ.A07(key);
                Number number = (Number) key;
                Object value = entry.getValue();
                0qQ.A07(value);
                C279284yO r12 = (C279284yO) value;
                View childAt2 = reboundHorizontalScrollView.getChildAt(i);
                if (childAt2 != null) {
                    num = Integer.valueOf(childAt2.getId());
                } else {
                    num = null;
                }
                if (!0qQ.A0K(num, number)) {
                    if (r6.A04(number.intValue())) {
                        reboundHorizontalScrollView.removeAllViews();
                        for (C279284yO A022 : legacyCameraDestinationScrollView.A01) {
                            reboundHorizontalScrollView.addView(legacyCameraDestinationScrollView.A02(A022));
                        }
                        return;
                    }
                    reboundHorizontalScrollView.addView(legacyCameraDestinationScrollView.A02(r12), i);
                }
                i = i4;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (X.C3505485d.A01(r4.A0W.A00.A01, r4.A0R) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (A09() != false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A08(boolean r5) {
        /*
            r4 = this;
            X.8Yz r0 = r4.A0S
            X.80m r0 = r0.A07
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x005b
        L_0x0012:
            r3 = 0
        L_0x0013:
            com.instagram.common.session.UserSession r2 = r4.A0R
            X.81e r0 = r4.A0W
            X.80R r0 = r0.A00
            X.28D r1 = r0.A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r1 = X.C3505585e.A00(r1, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x002e
            boolean r0 = r4.A09()
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r3 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x005a
        L_0x0033:
            boolean r0 = r4.A0L
            if (r5 == r0) goto L_0x005a
            com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView r2 = r4.A0U
            android.view.ViewGroup r0 = X.C3019160o.A01(r2)
            r0.removeView(r2)
            android.view.ViewGroup r1 = r4.A0M
            r0 = 2131438072(0x7f0b29f8, float:1.849806E38)
            if (r5 == 0) goto L_0x004a
            r0 = 2131433442(0x7f0b17e2, float:1.848867E38)
        L_0x004a:
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r2)
            float r0 = r4.A00
            r2.setLabelBackgroundProgress(r0)
            r4.A0L = r5
        L_0x005a:
            return
        L_0x005b:
            java.util.Iterator r2 = r1.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r2.next()
            X.80N r0 = X.AnonymousClass80N.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x005f
            X.80g r0 = X.C3494080g.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x005f
            com.instagram.common.session.UserSession r1 = r4.A0R
            X.81e r0 = r4.A0W
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            boolean r0 = X.C3505485d.A01(r0, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0013
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.A08(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (X.182.A06(r2, r7, 36321971486992249L) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (X.182.A06(r2, r5, 36326369533245167L) == false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A09() {
        /*
            r12 = this;
            X.8Yz r0 = r12.A0S
            X.80m r4 = r0.A08
            java.lang.Object r1 = r4.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008a
            X.81e r0 = r12.A0W
            X.80R r3 = r0.A00
            X.28D r1 = r3.A01
            X.28D r0 = X.28D.A0a
            if (r1 != r0) goto L_0x0032
            com.instagram.common.session.UserSession r5 = r12.A0R
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321971486795638(0x810aa400032776, double:3.0334992528647926E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0060
            r0 = 36326369533245167(0x810ea4000236ef, double:3.036280595148986E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0060
        L_0x0032:
            com.instagram.common.session.UserSession r7 = r12.A0R
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321971486599027(0x810aa400002773, double:3.033499252740455E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0060
            X.4DH r6 = r12.A0Q
            X.28D r5 = r3.A01
            java.lang.Object r8 = r4.A00
            X.4yO r8 = (X.C279284yO) r8
            X.80D r0 = r12.A0V
            boolean r11 = r0.A3R
            r9 = 0
            r10 = r9
            boolean r0 = X.AnonymousClass8X8.A00(r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0074
            r0 = 36321971486861175(0x810aa400042777, double:3.0334992529062384E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0060:
            r2 = 1
        L_0x0061:
            com.instagram.common.session.UserSession r1 = r12.A0R
            X.81e r0 = r12.A0W
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            boolean r1 = X.AnonymousClass8X9.A00(r0, r1)
            if (r2 != 0) goto L_0x0072
            r0 = 0
            if (r1 == 0) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            return r0
        L_0x0074:
            X.28D r1 = r3.A01
            java.util.List r0 = A0h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 36321971486992249(0x810aa400062779, double:3.03349925298913E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x008a
            goto L_0x0060
        L_0x008a:
            r2 = 0
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.A09():boolean");
    }

    public final void A0A() {
        if (!this.A0X.CZe() || !(this.A0S.A08.A00 instanceof C363138jC)) {
            2cs r5 = this.A0O;
            if (r5.A09.A00 <= 0.0d) {
                A05(this);
            } else if (r5.A01 != 0.0d) {
                r5.A06(0.0d);
            }
        } else {
            A0C();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A0R, 36324230639398802L) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r8 = this;
            X.80U r4 = r8.A0X
            boolean r0 = r4.CZe()
            if (r0 == 0) goto L_0x0102
            X.8Yz r0 = r8.A0S
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80J
            if (r0 == 0) goto L_0x0102
            com.instagram.common.session.UserSession r3 = r8.A0R
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324230639398802(0x810cb200002f92, double:3.034927950067911E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0102
            r0 = 1
            r8.A0G = r0
            X.85Y r0 = r8.A06
            if (r0 == 0) goto L_0x002b
            r0.onPause()
        L_0x002b:
            X.85W r0 = r8.A0d
            X.80R r0 = r0.A01
            X.4DH r1 = r0.A0J
            X.0hq r7 = r1.getChildFragmentManager()
            boolean r0 = X.AnonymousClass06S.A01(r7)
            if (r0 == 0) goto L_0x0076
            r6 = 2131438045(0x7f0b29dd, float:1.8498006E38)
            androidx.fragment.app.Fragment r0 = r7.A0P(r6)
            if (r0 != 0) goto L_0x0076
            android.os.Bundle r1 = r1.mArguments
            r5 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "arg_potato_media_id"
            java.lang.String r5 = r1.getString(r0, r5)
        L_0x004f:
            X.0s1 r3 = new X.0s1
            r3.<init>(r7)
            X.K4L r2 = new X.K4L
            r2.<init>()
            java.lang.String r1 = "arg_potato_media_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r5)
            X.0eP[] r0 = new X.0eP[]{r0}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r2.setArguments(r0)
            java.lang.String r0 = "PotatoPreCaptureFragment"
            r3.A0D(r2, r0, r6)
            r3.A00()
            r7.A0a()
        L_0x0076:
            com.instagram.common.session.UserSession r3 = r8.A0R
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324230639398802(0x810cb200002f92, double:3.034927950067911E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d1
            android.widget.FrameLayout r2 = r8.A02
            if (r2 != 0) goto L_0x00a3
            android.view.ViewGroup r1 = r8.A0M
            r0 = 2131438046(0x7f0b29de, float:1.8498008E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r2 = r0.inflate()
            boolean r0 = r2 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0100
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L_0x00a1:
            r8.A02 = r2
        L_0x00a3:
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0109
            if (r2 == 0) goto L_0x00ae
            r0 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A05(r2, r0)
        L_0x00ae:
            boolean r5 = r8.A0G
            if (r5 == 0) goto L_0x00d2
            X.85Y r0 = r8.A06
            if (r0 == 0) goto L_0x00b9
            r0.onPause()
        L_0x00b9:
            android.widget.FrameLayout r1 = r8.A02
            if (r1 == 0) goto L_0x00c5
            r0 = 0
            if (r5 == 0) goto L_0x00c2
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00c2:
            r1.setAlpha(r0)
        L_0x00c5:
            android.widget.FrameLayout r1 = r8.A02
            if (r1 == 0) goto L_0x00d1
            r0 = 8
            if (r5 == 0) goto L_0x00ce
            r0 = 0
        L_0x00ce:
            r1.setVisibility(r0)
        L_0x00d1:
            return
        L_0x00d2:
            boolean r0 = r4.CZe()
            if (r0 == 0) goto L_0x00f2
            X.8Yz r0 = r8.A0S
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80J
            if (r0 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r3 = r8.A0R
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324230639398802(0x810cb200002f92, double:3.034927950067911E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00f2
            goto L_0x00b9
        L_0x00f2:
            boolean r0 = r4.CZe()
            if (r0 == 0) goto L_0x00b9
            X.85Y r0 = r8.A06
            if (r0 == 0) goto L_0x00b9
            r0.onResume()
            goto L_0x00b9
        L_0x0100:
            r2 = 0
            goto L_0x00a1
        L_0x0102:
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0076
            r0 = 0
            r8.A0G = r0
        L_0x0109:
            X.4DH r1 = r8.A0Q
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x00ae
            X.0hq r2 = r1.getChildFragmentManager()
            X.0qQ.A07(r2)
            boolean r0 = X.AnonymousClass06S.A01(r2)
            if (r0 == 0) goto L_0x00ae
            r0 = 2131438045(0x7f0b29dd, float:1.8498006E38)
            androidx.fragment.app.Fragment r1 = r2.A0P(r0)
            if (r1 == 0) goto L_0x00ae
            X.0s1 r0 = new X.0s1
            r0.<init>(r2)
            r0.A03(r1)
            r0.A00()
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85X.A0B():void");
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        2cs r5 = this.A0O;
        if (r5.A01 != 0.0d) {
            r5.A06(0.0d);
        }
        this.A09 = true;
        return true;
    }

    public final void onResume() {
        if (this.A0O.A01 == 0.0d) {
            A05(this);
        } else {
            A0C();
        }
        A0B();
        this.A0K = false;
        A06(this);
        A04(this);
    }

    public static final int A00(C279284yO r4, AnonymousClass85X r5) {
        Iterator it = A01(r5).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getClass() == r4.getClass()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void A03(C279284yO r2, AnonymousClass85X r3, boolean z) {
        int A002 = A00(r2, r3);
        if (A002 != -1) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = r3.A0U.A06;
            if (A002 >= reboundHorizontalScrollView.getChildCount()) {
                return;
            }
            if (z) {
                reboundHorizontalScrollView.A09(A002, 0.0f);
            } else {
                reboundHorizontalScrollView.A08(A002);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(1682241315);
        AnonymousClass0fD.A0A(-690861536, AnonymousClass0fD.A03(-960084162));
        AnonymousClass0fD.A0A(-888328165, A032);
    }
}
