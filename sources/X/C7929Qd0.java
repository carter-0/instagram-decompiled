package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.ui.SCImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Qd0  reason: case insensitive filesystem */
public final class C7929Qd0 extends C7919Qcq implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgSelfieReviewFragment";
    public View A00;
    public Button A01;
    public TextView A02;
    public TextView A03;
    public 0hq A04;
    public SCImageView A05;
    public UserSession A06;
    public IgFrameLayout A07;
    public T6A A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E = "";
    public String A0F;
    public String A0G = "";
    public List A0H;
    public boolean A0I;
    public View A0J;
    public Button A0K;
    public C7936QdH A0L;
    public 0lg A0M;
    public String A0N;
    public boolean A0O;

    public static final void A01(C7929Qd0 qd0) {
        C7929Qd0 qd02 = qd0;
        WeakReference weakReference = qd0.A00;
        if (weakReference != null) {
            C13446TaZ taZ = (C13446TaZ) weakReference.get();
            if (qd0.A0I) {
                UserSession userSession = qd0.A06;
                if (userSession != null) {
                    STD.A04(qd02, userSession, qd0.A09, "av_fbap", "submit_video_selfie", qd0.A0D);
                    UserSession userSession2 = qd02.A06;
                    if (userSession2 != null) {
                        Pxi.A1F(AnonymousClass1Nd.A00(userSession2), C9757RgF.A00(qd02.A0N), "fbap", false);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            if (taZ != null) {
                Activity activity = (Activity) taZ;
                activity.setResult(1003, (Intent) null);
                activity.finish();
            }
        }
    }

    public final String getModuleName() {
        return "selfie_review";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        Button button = (Button) SKW.A00(view, R.id.btn_submit);
        C11408SSf.A05(button);
        this.A0K = button;
        if (button != null) {
            C11497SbK.A01(button, 56, this);
        }
        Button button2 = (Button) SKW.A00(view, R.id.btn_retake);
        this.A01 = button2;
        0qQ.A0A(button2);
        C11497SbK.A01(button2, 57, this);
        this.A03 = SKW.A02(view, R.id.tv_title);
        this.A02 = SKW.A02(view, R.id.tv_subtitle);
        this.A00 = SKW.A00(view, R.id.privacy_disclaimer_layout);
        Context context = view.getContext();
        TextView textView = this.A03;
        if (textView != null) {
            0qQ.A0A(context);
            C11408SSf.A04(context, textView, R.attr.sc_primary_text);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            0qQ.A0A(context);
            C11408SSf.A04(context, textView2, R.attr.sc_secondary_text);
        }
        TextView textView3 = this.A03;
        if (textView3 != null) {
            0qQ.A07(context);
            textView3.setTextSize(0, C11408SSf.A00(context, R.attr.selfie_title_size));
        }
        TextView textView4 = this.A02;
        if (textView4 != null) {
            0qQ.A07(context);
            textView4.setTextSize(0, C11408SSf.A00(context, R.attr.selfie_subtitle_size));
        }
        View A002 = SKW.A00(view, R.id.divider);
        0qQ.A07(context);
        Pxf.A1B(A002, C11408SSf.A01(context, R.attr.sc_divider));
        TextView A022 = SKW.A02(view, R.id.tv_privacy_disclaimer);
        A022.setText(2131972641);
        C11408SSf.A04(context, A022, R.attr.sc_secondary_text);
        SCImageView sCImageView = (SCImageView) SKW.A00(view, R.id.iv_image);
        this.A05 = sCImageView;
        C13857Tic tic = this.A00;
        if (!(tic == null || sCImageView == null)) {
            sCImageView.setImageDrawable(tic.BoH(context));
        }
        if (this.A0I) {
            SCImageView sCImageView2 = (SCImageView) SKW.A00(view, R.id.iv_image);
            DbU.A13(context, sCImageView2, R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
            this.A05 = sCImageView2;
            View view2 = this.A00;
            0qQ.A0A(view2);
            view2.setVisibility(8);
            Button button3 = this.A01;
            0qQ.A0A(button3);
            button3.setVisibility(8);
            TextView textView5 = this.A03;
            if (textView5 != null) {
                textView5.setTextSize(0, C11408SSf.A00(context, R.attr.selfie_title_size_age_verification));
            }
            TextView textView6 = this.A03;
            if (textView6 != null) {
                DbU.A1G(textView6, this, 2131972652);
            }
            TextView textView7 = this.A02;
            if (textView7 != null) {
                DbU.A1G(textView7, this, 2131972648);
            }
            View A003 = SKW.A00(view, R.id.space_3);
            ViewGroup.LayoutParams layoutParams = A003.getLayoutParams();
            String A004 = AnonymousClass000.A00(6);
            0qQ.A0C(layoutParams, A004);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 2.0f;
            A003.setLayoutParams(layoutParams2);
            TextView A023 = SKW.A02(view, R.id.reinforce_deletion_text);
            ViewGroup.LayoutParams layoutParams3 = A023.getLayoutParams();
            0qQ.A0C(layoutParams3, A004);
            A023.setLayoutParams(layoutParams3);
            C11408SSf.A04(context, A023, R.attr.sc_secondary_text);
            A023.setTextSize(0, C11408SSf.A00(context, R.attr.selfie_subtitle_size));
            A023.setVisibility(0);
            TextView textView8 = this.A02;
            if (textView8 != null) {
                DbU.A1G(textView8, this, 2131972649);
            }
        }
        if (this.A0O) {
            this.A0J = view;
            this.A07 = (IgFrameLayout) SKW.A00(view, R.id.sc_action_sheet_container);
            this.A0H = AnonymousClass7TE.A1C();
            C7936QdH qdH = new C7936QdH(requireActivity());
            qdH.setTitleText(DbU.A0m(this, 2131972646));
            qdH.setSubtitleText(DbU.A0m(this, 2131972645));
            this.A0L = qdH;
            SKW.A00(view, R.id.sc_action_bar).setVisibility(0);
            C11499SbM.A01(SKW.A00(view, R.id.action_bar_button_back), 15, view, this);
            C11499SbM.A01(SKW.A00(view, R.id.action_bar_button_cancel), 16, view, this);
        }
        T6A t6a = this.A08;
        if (t6a != null) {
            t6a.A00(RDG.A04, RDI.A05, this.A0B);
        }
        if (this.A0I) {
            UserSession userSession = this.A06;
            if (userSession != null) {
                STD.A06(this, userSession, this.A09, "av_fbap", "submit_video_selfie", this.A0D);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A00(View.OnClickListener onClickListener, C7929Qd0 qd0) {
        FragmentActivity requireActivity = qd0.requireActivity();
        View view = qd0.A0J;
        if (!(view instanceof ViewGroup)) {
            A01(qd0);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        List list = qd0.A0H;
        if (list != null) {
            list.clear();
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.setVisibility(8);
                    List list2 = qd0.A0H;
                    if (list2 != null) {
                        list2.add(childAt);
                    }
                }
            }
        }
        C7936QdH qdH = qd0.A0L;
        if (qdH != null) {
            qdH.setupDestructiveButton(DbU.A0m(qd0, 2131972644), onClickListener);
            Q9N q9n = new Q9N(requireActivity, qdH, C11408SSf.A01(requireActivity, R.attr.sc_popover_shadow), false);
            qdH.setupCancelButton(DbU.A0m(qd0, 2131972643), new C11497SbK(q9n, 58));
            IgFrameLayout igFrameLayout = qd0.A07;
            if (igFrameLayout != null) {
                igFrameLayout.addView(q9n);
            }
            q9n.A00 = new C11497SbK(qd0, 59);
            IgFrameLayout igFrameLayout2 = qd0.A07;
            if (igFrameLayout2 != null) {
                igFrameLayout2.setVisibility(0);
            }
            q9n.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a0, code lost:
        if (r6.A0I != false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 515866350(0x1ebf7eee, float:2.0275409E-20)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C7929Qd0.super.onCreate(r7)
            android.os.Bundle r2 = r6.requireArguments()
            X.08y r0 = X.09i.A0A
            X.0wW r5 = r0.A04(r2)
            r6.A0M = r5
            boolean r1 = r5 instanceof com.instagram.common.session.UserSession
            r0 = 0
            if (r1 == 0) goto L_0x00c3
            r1 = r5
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
        L_0x001e:
            r6.A06 = r1
            java.lang.String r1 = "challenge_id"
            java.lang.String r1 = r2.getString(r1)
            r6.A0A = r1
            java.lang.String r4 = "ig_user_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r2.getString(r4, r1)
            r6.A0E = r1
            java.lang.String r1 = "entity_id"
            java.lang.String r1 = r2.getString(r1)
            r6.A0C = r1
            java.lang.String r1 = "selfie_evidence"
            android.os.Parcelable r4 = r2.getParcelable(r1)
            boolean r1 = r4 instanceof com.facebook.smartcapture.capture.SelfieEvidence
            if (r1 == 0) goto L_0x005d
            com.facebook.smartcapture.capture.SelfieEvidence r4 = (com.facebook.smartcapture.capture.SelfieEvidence) r4
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x00c6
            r6.A0G = r1
            java.lang.String r1 = r4.A06
            if (r1 != 0) goto L_0x00c1
            com.google.common.collect.ImmutableList r1 = r4.A00
            if (r1 == 0) goto L_0x005b
            java.lang.Object r0 = X.00k.A0I(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x005b:
            r6.A0F = r0
        L_0x005d:
            X.0hq r0 = r6.getChildFragmentManager()
            r6.A04 = r0
            X.T6A r0 = new X.T6A
            r0.<init>(r5)
            r6.A08 = r0
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r0 = r2.getString(r0)
            r6.A0B = r0
            java.lang.String r0 = "av_session_id"
            java.lang.String r0 = r2.getString(r0)
            r6.A09 = r0
            java.lang.String r0 = "flow_id"
            java.lang.String r0 = r2.getString(r0)
            r6.A0D = r0
            java.lang.String r0 = "product_surface"
            java.lang.String r0 = r2.getString(r0)
            r6.A0N = r0
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = "ig_age_verification"
            boolean r0 = r0.equals(r1)
            r6.A0I = r0
            java.lang.String r0 = "is_cancel_confirmation_action_sheet_enabled"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L_0x00a2
            boolean r1 = r6.A0I
            r0 = 0
            if (r1 == 0) goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            r6.A0O = r0
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x00ba
            X.00N r2 = r1.getOnBackPressedDispatcher()
            r1 = 2
            X.QAH r0 = new X.QAH
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.A03(r0)
        L_0x00ba:
            r0 = -1642030042(0xffffffff9e209c26, float:-8.50262E-21)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00c1:
            r0 = r1
            goto L_0x005b
        L_0x00c3:
            r1 = r0
            goto L_0x001e
        L_0x00c6:
            java.lang.String r0 = "No video captured"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -2140513005(0xffffffff806a5d13, float:-9.767951E-39)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7929Qd0.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-455920316);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ig_selfie_review_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1447472321, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1432422475);
        this.A0K = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
        this.A0J = null;
        this.A0H = null;
        this.A0L = null;
        C7929Qd0.super.onDestroyView();
        AnonymousClass0fD.A09(940446505, A022);
    }
}
