package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;

public final class NKP extends AnonymousClass4DH implements AnonymousClass7Q6 {
    public static final String __redex_internal_original_name = "ClipsInteractionReplyFragment";
    public IgEditText A00;
    public ClipsInteractionReplySheetContent A01;
    public 1E8 A02;
    public 17i A03;
    public C62320sa A04;
    public C62320sa A05;
    public C55991Hqx A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void DBs(Drawable drawable, View view, C317486nL r5) {
        0qQ.A0B(r5, 0);
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.append(r5.A02);
        }
    }

    public final String getModuleName() {
        return "clips_interaction_reply_sheet";
    }

    public static final void A01(NKP nkp) {
        C62320sa r0 = nkp.A04;
        if (r0 != null) {
            r0.invoke();
        }
        AnonymousClass0eM r6 = nkp.A07;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = nkp.A01;
        if (clipsInteractionReplySheetContent == null) {
            0qQ.A0F("content");
            throw AnonymousClass00P.createAndThrow();
        }
        Bundle A012 = C46447Df9.A03().A01.A01(AnonymousClass7TE.A0l(r6), C46548Dgp.A01(A0l, clipsInteractionReplySheetContent.A04, "clips_social_context_bubble_action_sheet", "clips_interaction_reply_sheet").A04());
        DbT.A1M(nkp, DbS.A0b(nkp.getActivity(), A012, DbT.A0X(r6), ModalActivity.class, "profile"));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    private final SpannableStringBuilder A00(Context context, SocialContextType socialContextType) {
        int i;
        int ordinal = socialContextType.ordinal();
        String A002 = AnonymousClass000.A00(2814);
        if (ordinal == 9) {
            ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = this.A01;
            if (clipsInteractionReplySheetContent != null) {
                boolean A0k = 00p.A0k(clipsInteractionReplySheetContent.A06, A002, false);
                i = 2131962341;
                if (A0k) {
                    i = 2131964946;
                }
            }
            0qQ.A0F("content");
            throw AnonymousClass00P.createAndThrow();
        } else if (ordinal == 3) {
            ClipsInteractionReplySheetContent clipsInteractionReplySheetContent2 = this.A01;
            if (clipsInteractionReplySheetContent2 != null) {
                boolean A0k2 = 00p.A0k(clipsInteractionReplySheetContent2.A06, A002, false);
                i = 2131962291;
                if (A0k2) {
                    i = 2131956406;
                }
            }
            0qQ.A0F("content");
            throw AnonymousClass00P.createAndThrow();
        } else if (ordinal == 7) {
            i = 2131962594;
        } else {
            throw AnonymousClass7TE.A0w("Invalid social context type");
        }
        Resources A052 = DbV.A05(this);
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent3 = this.A01;
        if (clipsInteractionReplySheetContent3 != null) {
            String A0e = AnonymousClass7TF.A0e(A052, clipsInteractionReplySheetContent3.A03, i);
            0qQ.A07(A0e);
            SpannableStringBuilder A0C = DbS.A0C(A0e);
            C243813a9 r1 = new C243813a9();
            ClipsInteractionReplySheetContent clipsInteractionReplySheetContent4 = this.A01;
            if (clipsInteractionReplySheetContent4 != null) {
                A0C.setSpan(r1, 0, DbX.A05(clipsInteractionReplySheetContent4.A03), 18);
                ForegroundColorSpan A0E = C66580MXl.A0E(DbV.A01(context));
                ClipsInteractionReplySheetContent clipsInteractionReplySheetContent5 = this.A01;
                if (clipsInteractionReplySheetContent5 != null) {
                    A0C.setSpan(A0E, DbX.A05(clipsInteractionReplySheetContent5.A03), DbX.A05(A0C.toString()), 18);
                    return A0C;
                }
            }
        }
        0qQ.A0F("content");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent;
        int A022 = AnonymousClass0fD.A02(-1207615792);
        NKP.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (clipsInteractionReplySheetContent = (ClipsInteractionReplySheetContent) bundle2.getParcelable("REPLY_CONTENT")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(2007953496, A022);
            throw A0y;
        }
        this.A01 = clipsInteractionReplySheetContent;
        AnonymousClass0eM r1 = this.A07;
        this.A03 = JTR.A0u(r1);
        this.A02 = 1E7.A00(AnonymousClass7TE.A0l(r1));
        this.A06 = new C55991Hqx(AnonymousClass7TE.A0l(r1), this);
        AnonymousClass0fD.A09(637977856, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SpannableStringBuilder spannableStringBuilder;
        User A2A;
        int A022 = AnonymousClass0fD.A02(950772085);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_interaction_reply_sheet, viewGroup, false);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) AnonymousClass7TF.A0F(inflate, R.id.interaction_reply_avatar);
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = this.A01;
        String str = "content";
        if (clipsInteractionReplySheetContent != null) {
            reelAvatarWithBadgeView.setSingleAvatarUrlAndVisibility(clipsInteractionReplySheetContent.A01, this);
            C71395Oju.A00(reelAvatarWithBadgeView, 47, this);
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.reply_context);
            ClipsInteractionReplySheetContent clipsInteractionReplySheetContent2 = this.A01;
            if (clipsInteractionReplySheetContent2 != null) {
                int ordinal = clipsInteractionReplySheetContent2.A00.ordinal();
                if (ordinal == 9 || ordinal == 3) {
                    Context A0S = AnonymousClass7TE.A0S(inflate);
                    ClipsInteractionReplySheetContent clipsInteractionReplySheetContent3 = this.A01;
                    if (clipsInteractionReplySheetContent3 != null) {
                        spannableStringBuilder = A00(A0S, clipsInteractionReplySheetContent3.A00);
                    }
                } else if (ordinal == 7) {
                    Context A0S2 = AnonymousClass7TE.A0S(inflate);
                    ClipsInteractionReplySheetContent clipsInteractionReplySheetContent4 = this.A01;
                    if (clipsInteractionReplySheetContent4 != null) {
                        SocialContextType socialContextType = clipsInteractionReplySheetContent4.A00;
                        1E8 r1 = this.A02;
                        if (r1 == null) {
                            str = "mediaCache";
                        } else {
                            1Xj A023 = r1.A02(clipsInteractionReplySheetContent4.A05);
                            if (A023 == null || (A2A = A023.A2A(AnonymousClass7TE.A0l(this.A07))) == null) {
                                spannableStringBuilder = A00(A0S2, socialContextType);
                            } else {
                                String B8Q = A2A.B8Q();
                                if (socialContextType.ordinal() == 7) {
                                    Resources A052 = DbV.A05(this);
                                    ClipsInteractionReplySheetContent clipsInteractionReplySheetContent5 = this.A01;
                                    if (clipsInteractionReplySheetContent5 != null) {
                                        String A0w = DbV.A0w(A052, clipsInteractionReplySheetContent5.A03, B8Q, 2131962595);
                                        0qQ.A07(A0w);
                                        spannableStringBuilder = DbS.A0C(A0w);
                                        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent6 = this.A01;
                                        if (clipsInteractionReplySheetContent6 != null) {
                                            int A053 = DbX.A05(clipsInteractionReplySheetContent6.A03);
                                            int length = B8Q.length();
                                            int A054 = DbX.A05(spannableStringBuilder.toString());
                                            spannableStringBuilder.setSpan(C66580MXl.A0E(C51968G9o.A04(A0S2)), 0, A053, 18);
                                            int i = A054 - length;
                                            spannableStringBuilder.setSpan(C66580MXl.A0E(DbV.A01(A0S2)), A053, i, 18);
                                            spannableStringBuilder.setSpan(C66580MXl.A0E(C51968G9o.A04(A0S2)), i, A054, 18);
                                        }
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0w("Invalid social context type");
                                }
                            }
                        }
                    }
                } else {
                    IllegalArgumentException A0w2 = AnonymousClass7TE.A0w("Invalid social context type");
                    AnonymousClass0fD.A09(-1855425912, A022);
                    throw A0w2;
                }
                A0R.setText(spannableStringBuilder);
                C71395Oju.A00(A0R, 48, this);
                View A0F = DbY.A0F(inflate, R.id.layout_reply_emoji_picker_stub);
                0qQ.A0A(A0F);
                C55801Hnh hnh = new C55801Hnh(A0F, AnonymousClass7TE.A0l(this.A07));
                hnh.A00.setVisibility(8);
                C55991Hqx hqx = this.A06;
                if (hqx == null) {
                    str = "emojiPickerController";
                } else {
                    hqx.A00(hnh, this);
                    ViewGroup A0I = DbX.A0I(inflate, R.id.row_thread_composer_send_button_container);
                    C71395Oju.A00(A0I, 46, this);
                    C308476Uk r5 = new C308476Uk(A0I);
                    r5.A00(1QE.A0B(requireContext(), (1QG) null).getDefaultColor(), false);
                    r5.A02.getDrawable().setTint(1QE.A0C(requireContext(), (1QG) null).getDefaultColor());
                    IgEditText igEditText = (IgEditText) inflate.requireViewById(R.id.reply_message);
                    this.A00 = igEditText;
                    if (igEditText != null) {
                        igEditText.requestFocus();
                    }
                    IgEditText igEditText2 = this.A00;
                    if (igEditText2 != null) {
                        igEditText2.addTextChangedListener(new C71274OhF(0, (Object) this, (Object) r5));
                    }
                    AnonymousClass0fD.A09(-1613628951, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1874704985);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(-415389867, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(319578320);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1175263848, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1819146639);
        super.onResume();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            0nA.A0R(igEditText);
        }
        AnonymousClass0fD.A09(-1687060867, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1537702151);
        NKP.super.onStart();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            if (!igEditText.hasWindowFocus()) {
                igEditText.getViewTreeObserver().addOnWindowFocusChangeListener(new C71453Oks(igEditText, 0));
            } else if (igEditText.isFocused()) {
                0nA.A0M(igEditText);
            }
        }
        AnonymousClass0fD.A09(-599424667, A022);
    }
}
