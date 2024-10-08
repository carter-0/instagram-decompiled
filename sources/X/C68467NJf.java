package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.api.schemas.TrackData;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NJf  reason: case insensitive filesystem */
public final class C68467NJf extends AnonymousClass4DH implements AnonymousClass4DR, C273414mX {
    public static final String __redex_internal_original_name = "NoteQuickReplySheetFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public CardView A06;
    public CardView A07;
    public TrackData A08;
    public IgLinearLayout A09;
    public IgLinearLayout A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public IgTextView A0G;
    public IgTextView A0H;
    public IgTextView A0I;
    public C252063oV A0J;
    public C252063oV A0K;
    public C252063oV A0L;
    public C252063oV A0M;
    public CircularProgressImageView A0N;
    public C71036OZy A0O;
    public C74499Pvt A0P;
    public C71126OdL A0Q;
    public QuickReplySheetContent A0R;
    public C67324Mm0 A0S;
    public C234502xy A0T;
    public AnonymousClass9XK A0U;
    public ReelAvatarWithBadgeView A0V;
    public AnonymousClass37D A0W;
    public GradientSpinnerAvatarView A0X;
    public SpinnerImageView A0Y;
    public Long A0Z;
    public boolean A0a;
    public boolean A0b;
    public int A0c;
    public NotesRepository A0d;
    public AnonymousClass32A A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final AnonymousClass0eM A0i;
    public final AnonymousClass0eM A0j = C227642jf.A02(this);
    public final AnonymousClass0eM A0k;
    public final C50296FXb A0l;
    public final 2el A0m;

    public final void Cyf() {
    }

    public final String getModuleName() {
        return "note_quick_reply_sheet";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C68467NJf.super.onAttach(context);
        IgFragmentActivity activity = getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        activity.registerOnActivityResultListener(this.A0l);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        C69985NvP nvP = (C69985NvP) C67755MuA.A01(this.A0k);
        if (nvP instanceof C68770NWf) {
            IgTextView igTextView = this.A0F;
            if (igTextView == null) {
                0qQ.A0F("noteReplyContextText");
                throw AnonymousClass00P.createAndThrow();
            }
            igTextView.setText(A00(requireContext(), this, (C68770NWf) nvP));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0a) {
            view.setBackground(new ColorDrawable(AnonymousClass7TF.A03(getThemedContext(), R.attr.igds_color_elevated_background)));
            0nA.A0c(view, DbV.A05(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
        }
        07U r10 = 07U.A04;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(view2, viewLifecycleOwner, r10, this, (AnonymousClass4D7) null, 34), AnonymousClass07a.A00(viewLifecycleOwner));
        C72381P3u p3u = new C72381P3u(this);
        C72383P3w p3w = new C72383P3w(this);
        2el r4 = this.A0m;
        Dba.A0z(view, r4, this);
        AnonymousClass0eM r7 = this.A0h;
        C2354830a A002 = AnonymousClass30Y.A00(Long.valueOf(AnonymousClass7TE.A0R(r7.getValue())), C60340gF.A00, String.valueOf(AnonymousClass7TE.A0R(r7.getValue())));
        A002.A00(new C68682NSo(p3w));
        A002.A00(new C72262OzX(p3u));
        C51967G9n.A0z(view, A002, r4);
    }

    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r7.A0j), 36329165556825950L) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (X.AnonymousClass4AJ.A07(X.AnonymousClass7TE.A0l(r7.A0j)) == false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A00(android.content.Context r17, X.C68467NJf r18, X.C68770NWf r19) {
        /*
            r7 = r18
            android.content.res.Resources r0 = X.DbV.A05(r7)
            android.content.res.Configuration r10 = r0.getConfiguration()
            r6 = r19
            java.lang.String r5 = r6.A09
            boolean r0 = X.00l.A0W(r5)
            r4 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0019
            java.lang.String r5 = r6.A0G
        L_0x0019:
            X.N3C r0 = r6.A07
            if (r0 == 0) goto L_0x0234
            com.instagram.user.model.User r3 = r0.A04
            if (r3 == 0) goto L_0x002e
            X.0eM r0 = r7.A0j
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.AnonymousClass4AJ.A07(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            java.lang.String r0 = r6.A0E
            if (r0 == 0) goto L_0x0048
            X.0eM r0 = r7.A0j
            X.0lg r9 = X.DbY.A0R(r0)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329165556825950(0x81112f00003f5e, double:3.038048811720157E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r16 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0048:
            r16 = 0
        L_0x004a:
            java.lang.String r8 = ""
            r11 = r8
            X.0eM r0 = r7.A0h
            java.lang.Object r0 = r0.getValue()
            long r14 = X.AnonymousClass7TE.A0R(r0)
            r12 = 0
            r9 = 32
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x01e9
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x01e9
            X.0eM r0 = r7.A0j
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.AnonymousClass4AJ.A02(r0)
            if (r0 == 0) goto L_0x01e9
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131968607(0x7f13425f, float:1.9574113E38)
        L_0x0076:
            java.lang.String r8 = X.AnonymousClass7TF.A0e(r1, r5, r0)
        L_0x007a:
            java.lang.String r12 = X.002.A0R(r11, r8)
            com.instagram.direct.inbox.notes.reply.QuickReplySheetContent r0 = r7.A0R
            if (r0 == 0) goto L_0x01d3
            r13 = 2131968616(0x7f134268, float:1.9574132E38)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r0 = r6.A0F
            r10 = 0
        L_0x008a:
            r11[r10] = r0
            java.lang.String r0 = r7.getString(r13, r11)
            java.lang.String r13 = X.002.A0R(r12, r0)
            boolean r11 = r6.A0K
            if (r11 == 0) goto L_0x00b1
            X.0eM r0 = r7.A0j
            X.0lg r12 = X.AnonymousClass7TF.A0L(r0, r10)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329491974340764(0x81117b0000409c, double:3.038255239470903E-306)
            boolean r0 = X.182.A06(r8, r12, r0)
            if (r0 == 0) goto L_0x00b1
            r0 = 42
            java.lang.String r13 = X.002.A0C(r13, r0)
        L_0x00b1:
            boolean r12 = A06(r7, r6, r2)
            if (r12 == 0) goto L_0x00d5
            java.lang.String r1 = X.002.A0C(r13, r9)
            r0 = 2131968613(0x7f134265, float:1.9574126E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.String r1 = X.002.A0C(r0, r9)
            r0 = 2131968617(0x7f134269, float:1.9574134E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r13 = X.002.A0R(r1, r0)
        L_0x00d5:
            android.text.SpannableStringBuilder r8 = X.DbS.A0C(r13)
            r9 = r17
            int r1 = X.C51968G9o.A04(r9)
            X.Ngp r0 = new X.Ngp
            r0.<init>(r7, r6, r1, r12)
            int r13 = X.DbX.A05(r5)
            r5 = 18
            r8.setSpan(r0, r10, r13, r5)
            int r0 = X.DbV.A01(r9)
            android.text.style.ForegroundColorSpan r1 = X.C66580MXl.A0E(r0)
            java.lang.String r0 = r8.toString()
            int r0 = X.DbX.A05(r0)
            r8.setSpan(r1, r13, r0, r5)
            if (r16 == 0) goto L_0x0122
            r14 = 2131972166(0x7f135046, float:1.9581332E38)
            java.lang.String r0 = X.DbU.A0m(r7, r14)
            int r13 = X.00l.A08(r8, r0, r10, r10)
            int r0 = X.C51968G9o.A04(r9)
            X.Ngt r1 = new X.Ngt
            r1.<init>((android.content.Context) r9, (X.C68467NJf) r7, (int) r0)
            java.lang.String r0 = r7.getString(r14)
            int r0 = X.DbX.A05(r0)
            int r0 = r0 + r13
            r8.setSpan(r1, r13, r0, r5)
        L_0x0122:
            if (r2 == 0) goto L_0x0173
            java.lang.String r0 = r3.B8Q()
            int r2 = X.00l.A08(r8, r0, r10, r10)
            int r0 = X.C51968G9o.A04(r9)
            X.Ngt r1 = new X.Ngt
            r1.<init>((X.C68467NJf) r7, (com.instagram.user.model.User) r3, (int) r0)
            java.lang.String r0 = r3.B8Q()
            int r0 = X.DbX.A05(r0)
            int r0 = r0 + r2
            r8.setSpan(r1, r2, r0, r5)
            r1 = 2131238719(0x7f081f3f, float:1.8093725E38)
            int r0 = X.2Yu.A0B(r9)
            int r0 = r9.getColor(r0)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3JT.A05(r9, r1, r0)
            int r2 = X.DbZ.A02(r7)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r3.setBounds(r10, r10, r2, r2)
            X.46l r1 = new X.46l
            r1.<init>(r3)
            r1.A01 = r0
            java.lang.String r0 = " "
            r8.insert(r10, r0)
            r0 = 34
            r8.setSpan(r1, r10, r4, r0)
        L_0x0173:
            if (r12 == 0) goto L_0x0195
            r3 = 2131968617(0x7f134269, float:1.9574134E38)
            java.lang.String r0 = X.DbU.A0m(r7, r3)
            int r2 = X.00l.A08(r8, r0, r10, r10)
            int r0 = X.C51968G9o.A04(r9)
            X.Ngt r1 = new X.Ngt
            r1.<init>((X.C68467NJf) r7, (X.C68770NWf) r6, (int) r0)
            java.lang.String r0 = r7.getString(r3)
            int r0 = X.DbX.A05(r0)
            int r0 = r0 + r2
            r8.setSpan(r1, r2, r0, r5)
        L_0x0195:
            if (r11 == 0) goto L_0x01d2
            X.0eM r0 = r7.A0j
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329491974340764(0x81117b0000409c, double:3.038255239470903E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = "*"
            int r4 = X.00l.A08(r8, r0, r10, r10)
            android.graphics.drawable.LayerDrawable r3 = X.C346697vb.A00(r9)
            int r2 = X.DbZ.A02(r7)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r3.setBounds(r10, r10, r2, r2)
            X.46l r1 = new X.46l
            r1.<init>(r3)
            r1.A00 = r0
            int r0 = r4 + 1
            r8.setSpan(r1, r4, r0, r5)
        L_0x01d2:
            return r8
        L_0x01d3:
            r10 = 0
            r13 = 2131968616(0x7f134268, float:1.9574132E38)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r0 = r6.A0F
            long r0 = java.lang.Long.parseLong(r0)
            android.content.Context r8 = r7.requireContext()
            java.lang.String r0 = X.C66889MeU.A05(r8, r0)
            goto L_0x008a
        L_0x01e9:
            int r1 = r10.screenWidthDp
            int r0 = r10.screenHeightDp
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1051595899(0x3eae147b, float:0.34)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x007a
            if (r2 == 0) goto L_0x0219
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()
            android.content.res.Resources r8 = X.DbV.A05(r7)
            r1 = 2131968610(0x7f134262, float:1.957412E38)
            java.lang.String r0 = r3.B8Q()
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
        L_0x020c:
            java.lang.String r0 = r8.getString(r1, r0)
            r10.append(r0)
            java.lang.String r8 = X.C51967G9n.A0r(r10, r9)
            goto L_0x007a
        L_0x0219:
            if (r16 == 0) goto L_0x0224
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131973470(0x7f13555e, float:1.9583977E38)
            goto L_0x0076
        L_0x0224:
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()
            android.content.res.Resources r8 = X.DbV.A05(r7)
            r1 = 2131968609(0x7f134261, float:1.9574117E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            goto L_0x020c
        L_0x0234:
            r3 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68467NJf.A00(android.content.Context, X.NJf, X.NWf):android.text.SpannableStringBuilder");
    }

    public static final void A01(C68467NJf nJf) {
        String str;
        Bundle bundle;
        if (nJf.A0c != 257) {
            Bundle bundle2 = nJf.mArguments;
            if ((bundle2 == null || bundle2.getBoolean("can_reply") || (bundle = nJf.mArguments) == null || !bundle.getBoolean("pending_admin_approval")) && (C67755MuA.A01(nJf.A0k) instanceof C68770NWf)) {
                C71126OdL odL = nJf.A0Q;
                if (odL == null) {
                    str = "notesReplyComposerBarController";
                } else {
                    IgEditText igEditText = odL.A04;
                    if (igEditText != null) {
                        str = "replyMessage";
                        igEditText.requestFocus();
                        IgEditText igEditText2 = odL.A04;
                        if (igEditText2 != null) {
                            0nA.A0S(igEditText2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static final void A02(C68467NJf nJf) {
        String str;
        SpinnerImageView spinnerImageView = nJf.A0Y;
        if (spinnerImageView == null) {
            str = "loadingIndicator";
        } else {
            DbS.A1T(spinnerImageView);
            IgLinearLayout igLinearLayout = nJf.A09;
            if (igLinearLayout == null) {
                str = "replyContentView";
            } else {
                igLinearLayout.setVisibility(8);
                A03(nJf);
                C71126OdL odL = nJf.A0Q;
                if (odL == null) {
                    str = "notesReplyComposerBarController";
                } else {
                    FrameLayout frameLayout = odL.A01;
                    if (frameLayout == null) {
                        str = "replyComposerContainer";
                    } else {
                        frameLayout.setVisibility(8);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C68467NJf nJf) {
        C68770NWf nWf;
        boolean z;
        N3C n3c;
        Boolean bool;
        Object A012 = C67755MuA.A01(nJf.A0k);
        if (A012 instanceof C68770NWf) {
            nWf = (C68770NWf) A012;
        } else {
            nWf = null;
        }
        int i = 0;
        if (nWf == null || (n3c = nWf.A07) == null || (bool = n3c.A06) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        View view = nJf.A00;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static final void A04(C68467NJf nJf, C68770NWf nWf) {
        String str;
        CardView cardView = nJf.A06;
        if (cardView == null) {
            str = "avatarVideoViewContainer";
        } else {
            cardView.setVisibility(8);
            C252063oV r0 = nJf.A0J;
            if (r0 == null) {
                str = "avatarSimpleVideoLayout";
            } else {
                r0.setVisibility(8);
                ReelAvatarWithBadgeView reelAvatarWithBadgeView = nJf.A0V;
                if (reelAvatarWithBadgeView != null) {
                    reelAvatarWithBadgeView.setVisibility(0);
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = nJf.A0X;
                    if (gradientSpinnerAvatarView == null) {
                        str = "gradientSpinnerAvatarView";
                    } else {
                        gradientSpinnerAvatarView.setVisibility(8);
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = nJf.A0V;
                        if (reelAvatarWithBadgeView2 != null) {
                            reelAvatarWithBadgeView2.setSingleAvatarUrlAndVisibility(nWf.A04, nJf);
                            if (nWf.A05 == null) {
                                AnonymousClass0eM r5 = nJf.A0j;
                                0lg A0X2 = DbT.A0X(r5);
                                0Tu A0J2 = DbS.A0J(A0X2, 0);
                                if (!182.A06(A0J2, A0X2, 36320305039286491L) && !182.A06(A0J2, AnonymousClass7TF.A0L(r5, 0), 36324587121684652L)) {
                                    return;
                                }
                            }
                            ReelAvatarWithBadgeView reelAvatarWithBadgeView3 = nJf.A0V;
                            if (reelAvatarWithBadgeView3 != null) {
                                C71408Ok7.A00(reelAvatarWithBadgeView3, 16, nJf, nWf);
                                return;
                            }
                        }
                    }
                }
                0qQ.A0F("avatarView");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A06(C68467NJf nJf, C68770NWf nWf, boolean z) {
        if (!z && !(nWf.A07 == null && nWf.A03 == null && (nWf.A0B == null || nWf.A02 != null || nWf.A05 != null || nWf.A01 != null))) {
            AnonymousClass0eM r8 = nJf.A0j;
            0lg A0X2 = DbT.A0X(r8);
            0Tu A0J2 = DbS.A0J(A0X2, 0);
            if (182.A06(A0J2, A0X2, 36329384600158290L)) {
                1Av A0h2 = DbX.A0h(r8);
                0lg A0L2 = AnonymousClass7TF.A0L(r8, 0);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long minutes = timeUnit.toMinutes(182.A01(A0J2, A0L2, 36610859576924328L));
                long hours = timeUnit.toHours(182.A01(A0J2, AnonymousClass7TF.A0L(r8, 0), 36610859576989865L));
                if (System.currentTimeMillis() - DbW.A06(A0h2.A01, "notes_try_it_last_seen_timestamp_ms") <= TimeUnit.MINUTES.toMillis(minutes) || !1Av.A08(A0h2, "notes_last_created_timestamp_ms", hours)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void Cyc() {
        C74499Pvt pvt = this.A0P;
        if (pvt != null) {
            pvt.Cyg();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0j);
    }

    public final boolean onBackPressed() {
        return false;
    }

    public C68467NJf() {
        C73924Pm4 A012 = C73924Pm4.A01(this, 34);
        C73924Pm4 A013 = C73924Pm4.A01(this, 31);
        0eO r5 = 0eO.A02;
        AnonymousClass0eM A002 = C73924Pm4.A00(A013, r5, 32);
        this.A0k = DbS.A0I(C73924Pm4.A01(A002, 33), A012, new C73916Plr(24, (Object) null, A002), DbS.A0z(C67755MuA.class));
        this.A0h = C51804G2n.A01(this, "arg_note_id", r5, 25);
        this.A0i = AnonymousClass0eN.A00(r5, new C51678Fye(this));
        this.A0g = AnonymousClass0eN.A00(r5, new C73673Phm(AnonymousClass7TE.A0u(), this, "arg_is_friend_map_note", 9));
        this.A0f = AnonymousClass0eN.A00(r5, new C73673Phm((Object) null, this, "arg_note_consumption_module", 10));
        this.A0c = -1;
        this.A0m = 2el.A00();
        this.A0l = new C50296FXb(this, 2);
    }

    public static final void A05(C68467NJf nJf, boolean z) {
        int i;
        Drawable drawable;
        C310356ar r4;
        int i2;
        Context context = nJf.getContext();
        if (context != null) {
            if (z) {
                View view = nJf.A00;
                if (view != null) {
                    TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.add_to_spotify_button_text);
                    if (A0d2 != null) {
                        A0d2.setText(2131968553);
                    }
                    ImageView A0G2 = DbS.A0G(view, R.id.add_to_spotify_button_icon);
                    if (A0G2 != null) {
                        A0G2.setImageResource(R.drawable.instagram_check_pano_filled_16);
                    }
                    AnonymousClass0fU.A00(C71392Ojr.A00, view);
                }
                i = 2131968552;
                drawable = context.getDrawable(R.drawable.spotify_ig_connection_refresh_illo_spotify_toast);
                if (drawable != null) {
                    r4 = C310356ar.SQUARE;
                }
                r4 = C310356ar.A05;
            } else {
                i = 2131968551;
                drawable = null;
                r4 = C310356ar.A05;
            }
            View view2 = nJf.mView;
            if (view2 != null) {
                int height = view2.getHeight();
                Context requireContext = nJf.requireContext();
                boolean A042 = C61670oa.A04();
                int i3 = R.dimen.abc_action_bar_elevation_material;
                if (A042) {
                    i3 = R.dimen.abc_control_corner_material;
                }
                i2 = height + C51972G9s.A08(requireContext) + AnonymousClass7TF.A02(requireContext, i3) + 2Yu.A0G(requireContext, R.attr.bottomSheetDragHandlerBottomPadding);
            } else {
                i2 = 0;
            }
            C310336ap A0a2 = DbS.A0a();
            DbS.A19(context, A0a2, i);
            A0a2.A0B = r4;
            A0a2.A0K = false;
            A0a2.A04 = drawable;
            A0a2.A02 = i2;
            A0a2.A0R = true;
            Dc2 A002 = A0a2.A00();
            IgLinearLayout igLinearLayout = nJf.A0A;
            if (igLinearLayout == null) {
                0qQ.A0F("rootView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                igLinearLayout.post(new C73087PVu(A002));
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A0c = i;
        if (i != 256) {
            if (i != 257) {
                return;
            }
        } else if (i2 == -1) {
            AnonymousClass7TF.A0D().postDelayed(new C73086PVt(requireContext()), 750);
        } else if (i2 == 0) {
            A01(this);
            return;
        } else {
            return;
        }
        DbX.A1J(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-44275574);
        C68467NJf.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0j;
        this.A0d = AnonymousClass43C.A00(AnonymousClass7TE.A0l(r3));
        AnonymousClass32A r1 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r3), new AnonymousClass328(this));
        this.A0e = r1;
        r1.A0C = AnonymousClass7TF.A0b();
        C66582MXn.A0S(r3).A0F(C69474NmI.DWELL);
        AnonymousClass0fD.A09(-1497201120, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1153173404);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.notes_quick_reply_sheet, viewGroup, false);
        this.A0A = (IgLinearLayout) inflate.findViewById(R.id.note_quick_reply_sheet_root_view);
        this.A09 = (IgLinearLayout) inflate.findViewById(R.id.note_quick_reply_sheet_content_view);
        this.A0Y = (SpinnerImageView) inflate.findViewById(R.id.loading_indicator);
        this.A0V = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.note_quick_reply_avatar);
        this.A0X = (GradientSpinnerAvatarView) inflate.findViewById(R.id.note_quick_reply_gradient_spinner_avatar);
        this.A06 = (CardView) inflate.findViewById(R.id.note_quick_reply_video_preview_container);
        this.A0K = DbU.A0Y(inflate, R.id.notes_video_view_stub);
        this.A0L = DbU.A0Y(inflate, R.id.note_quick_reply_gif_pog);
        this.A0M = DbU.A0Y(inflate, R.id.note_quick_reply_gif_square);
        this.A0J = DbU.A0Y(inflate, R.id.notes_video_player_layout_stub);
        Context A0S2 = AnonymousClass7TE.A0S(inflate);
        Bundle bundle2 = this.mArguments;
        BaseFragmentActivity activity = getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        BaseFragmentActivity baseFragmentActivity = activity;
        UserSession A0l2 = AnonymousClass7TE.A0l(this.A0j);
        long A0R2 = AnonymousClass7TE.A0R(this.A0h.getValue());
        boolean A1Z = AnonymousClass7TF.A1Z(this.A0g);
        C74499Pvt pvt = this.A0P;
        IgLinearLayout igLinearLayout = this.A0A;
        if (igLinearLayout == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        C71126OdL odL = new C71126OdL(A0S2, bundle2, baseFragmentActivity, this, A0l2, igLinearLayout, pvt, (C67755MuA) this.A0k.getValue(), this.A0T, DbS.A0t(this.A0f), A0R2, A1Z, false);
        this.A0Q = odL;
        odL.A05();
        AnonymousClass0fD.A09(1474391675, A022);
        return inflate;
    }

    public final void onDestroy() {
        C71036OZy oZy;
        int A022 = AnonymousClass0fD.A02(-1998370886);
        super.onDestroy();
        if (182.A06(0Tu.A05, DbT.A0X(this.A0j), 36330754695316232L) && (oZy = this.A0O) != null) {
            C234502xy r0 = oZy.A00;
            if (r0 != null) {
                r0.release();
            }
            oZy.A00 = null;
        }
        this.A0O = null;
        C71126OdL odL = this.A0Q;
        if (odL != null) {
            odL.A08 = null;
        }
        AnonymousClass0fD.A09(-1726133819, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-113869602);
        this.A0m.A04(this.mView);
        C67324Mm0 mm0 = this.A0S;
        if (mm0 != null) {
            mm0.A02(002.A0R("note_quick_reply_sheet", " onDestroyView"));
        }
        if (182.A06(0Tu.A05, DbY.A0R(this.A0j), 36326451137558284L)) {
            C234502xy r0 = this.A0T;
            if (r0 != null) {
                r0.release();
            }
            this.A0T = null;
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(948390753, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(-2096976908);
        C68467NJf.super.onDetach();
        IgFragmentActivity activity = getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        activity.unregisterOnActivityResultListener(this.A0l);
        AnonymousClass0fD.A09(-490120400, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1284715001);
        C68467NJf.super.onPause();
        C234502xy r0 = this.A0T;
        if (r0 != null) {
            r0.pause();
        }
        C67324Mm0 mm0 = this.A0S;
        if (mm0 != null) {
            C67324Mm0.A00(mm0, "note_quick_reply_sheet", " onPause");
        }
        AnonymousClass0fD.A09(913928366, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2131775435);
        super.onResume();
        A01(this);
        C67324Mm0 mm0 = this.A0S;
        if (mm0 != null) {
            String A0R2 = 002.A0R("note_quick_reply_sheet", " onResume");
            0qQ.A0B(A0R2, 0);
            C14044Tol tol = mm0.A00;
            if (tol != null) {
                tol.A0C(A0R2, false);
            }
        }
        AnonymousClass0fD.A09(1781154316, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-401877345);
        C68467NJf.super.onStop();
        AnonymousClass0fD.A09(-1286240237, A022);
    }
}
