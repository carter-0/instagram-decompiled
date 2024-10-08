package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;
import com.instagram.reels.store.ReelStore;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;

public final class E6J extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "GroupMentionQuickReplySheetFragment";
    public IgEditText A00;
    public IgTextView A01;
    public Reel A02;
    public GroupMentionQuickReplySheetContent A03;
    public User A04;
    public 17i A05;
    public String A06;
    public 1a8 A07;
    public IgTextView A08;
    public IgTextView A09;
    public C333537Zi A0A;
    public 2Dm A0B;
    public ReelAvatarWithBadgeView A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final C252213ok A0E = new FZH(this, 2);
    public final AnonymousClass3E6 A0F = AnonymousClass3E4.A01(this, false, false);

    public final void Cyc() {
    }

    public final void Cyf() {
    }

    public final String getModuleName() {
        return "ig_group_mention_user_list";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void onCreate(Bundle bundle) {
        GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent;
        User parcelable;
        int A022 = AnonymousClass0fD.A02(572940427);
        E6J.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (groupMentionQuickReplySheetContent = (GroupMentionQuickReplySheetContent) bundle2.getParcelable("content")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        this.A03 = groupMentionQuickReplySheetContent;
        Bundle bundle3 = this.mArguments;
        String str = null;
        if (bundle3 != null) {
            str = bundle3.getString(C273654mx.A00(154));
        }
        if (str == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (bundle3 == null || (parcelable = bundle3.getParcelable(C273654mx.A00(156))) == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            this.A04 = parcelable;
            String string = bundle3.getString(C273654mx.A00(155));
            if (string != null) {
                this.A06 = string;
                AnonymousClass0eM r1 = this.A0D;
                Reel A0M = ReelStore.A03(AnonymousClass7TE.A0l(r1)).A0M(str);
                if (A0M != null) {
                    this.A02 = A0M;
                    this.A0A = C333527Zh.A00(AnonymousClass7TE.A0l(r1));
                    this.A0B = 1bJ.A00(AnonymousClass7TE.A0l(r1));
                    this.A05 = 17h.A00(AnonymousClass7TE.A0l(r1));
                    this.A0F.A9Y(this.A0E);
                    this.A07 = 1a8.A00();
                    AnonymousClass0fD.A09(1662450657, A022);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-653388159);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.group_mention_quick_reply_sheet, viewGroup, false);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.group_mention_avatar);
        this.A0C = reelAvatarWithBadgeView;
        String str = "avatarView";
        if (reelAvatarWithBadgeView != null) {
            reelAvatarWithBadgeView.setVisibility(0);
            ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = this.A0C;
            if (reelAvatarWithBadgeView2 != null) {
                GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent = this.A03;
                String str2 = "content";
                if (groupMentionQuickReplySheetContent != null) {
                    reelAvatarWithBadgeView2.setSingleAvatarUrlAndVisibility(groupMentionQuickReplySheetContent.A00, this);
                    IgTextView findViewById = inflate.findViewById(R.id.username);
                    this.A09 = findViewById;
                    str = C46367Ddj.A00();
                    if (findViewById != null) {
                        Context context = inflate.getContext();
                        GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent2 = this.A03;
                        if (groupMentionQuickReplySheetContent2 != null) {
                            DbX.A13(context, findViewById, groupMentionQuickReplySheetContent2.A02, 2131963189);
                            IgTextView igTextView = this.A09;
                            if (igTextView != null) {
                                Drawable[] compoundDrawables = igTextView.getCompoundDrawables();
                                0qQ.A07(compoundDrawables);
                                for (Drawable colorFilter : 03t.A0I(compoundDrawables)) {
                                    colorFilter.setColorFilter(new PorterDuffColorFilter(context.getColor(2Yu.A0B(context)), PorterDuff.Mode.SRC_IN));
                                }
                                IgTextView igTextView2 = this.A09;
                                if (igTextView2 != null) {
                                    FP2.A00(igTextView2, 25, this);
                                    IgTextView findViewById2 = inflate.findViewById(R.id.quick_reply_subtext);
                                    this.A08 = findViewById2;
                                    if (findViewById2 == null) {
                                        str2 = "subtext";
                                    } else {
                                        findViewById2.setVisibility(0);
                                        this.A00 = (IgEditText) inflate.findViewById(R.id.message);
                                        this.A01 = inflate.findViewById(R.id.send_button);
                                        IgEditText igEditText = this.A00;
                                        if (igEditText == null) {
                                            str2 = "replyMessage";
                                        } else {
                                            FKk.A00(igEditText, this, 23);
                                            IgTextView igTextView3 = this.A01;
                                            if (igTextView3 == null) {
                                                str2 = "sendButton";
                                            } else {
                                                FP2.A00(igTextView3, 26, this);
                                                AnonymousClass0fD.A09(644048688, A022);
                                                return inflate;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-217274128);
        super.onDestroy();
        this.A0F.EEH(this.A0E);
        1a8 r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("uiSubscriber");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A01();
        AnonymousClass0fD.A09(-332297477, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(612668311);
        super.onResume();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            IgEditText igEditText2 = this.A00;
            if (igEditText2 != null) {
                0nA.A0R(igEditText2);
                AnonymousClass0fD.A09(429693298, A022);
                return;
            }
        }
        0qQ.A0F("replyMessage");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1151958051);
        E6J.super.onStart();
        IgEditText igEditText = this.A00;
        if (igEditText == null) {
            0qQ.A0F("replyMessage");
            throw AnonymousClass00P.createAndThrow();
        }
        igEditText.requestFocus();
        if (!igEditText.hasWindowFocus()) {
            igEditText.getViewTreeObserver().addOnWindowFocusChangeListener(new C71453Oks(igEditText, 2));
        } else if (igEditText.isFocused()) {
            0nA.A0Q(igEditText);
        }
        this.A0F.DmJ(getActivity());
        AnonymousClass0fD.A09(-2074985236, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1832041028);
        E6J.super.onStop();
        this.A0F.onStop();
        AnonymousClass0fD.A09(-60414553, A022);
    }
}
