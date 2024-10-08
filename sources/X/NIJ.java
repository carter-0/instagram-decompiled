package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NIJ extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "InvitedToCollabNoteBottomSheetFragment";
    public C279864zZ A00;
    public IgTextView A01;
    public IgTextView A02;
    public NoteAvatarView A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "note_invited_to_collab_note_bottom_sheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        FragmentActivity activity;
        int i;
        Object[] objArr;
        String str3;
        List A18;
        int A022 = AnonymousClass0fD.A02(137851440);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_invited_to_collab_note_bottom_sheet, viewGroup, false);
        IgTextView A0X = JTO.A0X(inflate, R.id.bottom_sheet_note_chat_header_title);
        this.A01 = A0X;
        String str4 = null;
        if (A0X == null) {
            str2 = "headerTitle";
        } else {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C279864zZ r0 = this.A00;
                if (r0 != null) {
                    User user = r0.A0D;
                    String fullName = user.A03.getFullName();
                    if (fullName == null || (A18 = DbV.A18(fullName, " ")) == null || (str3 = AnonymousClass7TE.A19(A18, 0)) == null || str3.length() == 0) {
                        str3 = user.getUsername();
                    }
                    str = DbW.A0h(activity2, str3, 2131956240);
                }
                0qQ.A0F("noteItem");
                throw AnonymousClass00P.createAndThrow();
            }
            str = null;
            A0X.setText(str);
            AnonymousClass0eM r7 = this.A04;
            AnonymousClass4AM r11 = new AnonymousClass4AM(AnonymousClass7TE.A0l(r7));
            NoteAvatarView noteAvatarView = (NoteAvatarView) inflate.findViewById(R.id.pog_avatar_view);
            this.A03 = noteAvatarView;
            if (noteAvatarView != null) {
                noteAvatarView.A0F(AnonymousClass7TE.A0l(r7));
                NoteAvatarView noteAvatarView2 = this.A03;
                if (noteAvatarView2 != null) {
                    noteAvatarView2.getNoteBubbleView().setVisibility(0);
                    NoteAvatarView noteAvatarView3 = this.A03;
                    if (noteAvatarView3 != null) {
                        NoteBubbleView noteBubbleView = noteAvatarView3.getNoteBubbleView();
                        C279864zZ r02 = this.A00;
                        if (r02 != null) {
                            noteBubbleView.setText(r02.A0J, false, "", C73762PjN.A00);
                            NoteAvatarView noteAvatarView4 = this.A03;
                            if (noteAvatarView4 != null) {
                                NoteBubbleView.setContentLayout$default(noteAvatarView4.getNoteBubbleView(), 0, 1, (Object) null);
                                NoteAvatarView noteAvatarView5 = this.A03;
                                if (noteAvatarView5 != null) {
                                    ReelAvatarWithBadgeView reelAvatarWithBadgeView = noteAvatarView5.A0H;
                                    C279864zZ r03 = this.A00;
                                    if (r03 != null) {
                                        String id = r03.A0D.getId();
                                        C279864zZ r04 = this.A00;
                                        if (r04 != null) {
                                            ImageUrl E6y = r11.E6y(new AnonymousClass48P(r04.A0D.Bh3(), id));
                                            ImageUrl E6y2 = r11.E6y(new AnonymousClass48P(AnonymousClass69P.A05(AnonymousClass7TE.A0l(r7)).Bh3(), AnonymousClass69P.A05(AnonymousClass7TE.A0l(r7)).getId()));
                                            NoteAvatarView noteAvatarView6 = this.A03;
                                            if (noteAvatarView6 != null) {
                                                reelAvatarWithBadgeView.A03(this, E6y, E6y2, DbU.A05(noteAvatarView6).getDimensionPixelSize(R.dimen.action_button_min_width));
                                                NoteAvatarView noteAvatarView7 = this.A03;
                                                if (noteAvatarView7 != null) {
                                                    ViewGroup.MarginLayoutParams A0G = DbX.A0G(noteAvatarView7);
                                                    A0G.bottomMargin = DbS.A02(requireContext(), 10);
                                                    noteAvatarView7.setLayoutParams(A0G);
                                                    AnonymousClass7TE.A0b(inflate, R.id.pog_name).setVisibility(8);
                                                    IgTextView A0X2 = JTO.A0X(inflate, R.id.bottom_sheet_pog_name);
                                                    this.A02 = A0X2;
                                                    str2 = "noteInvitees";
                                                    if (A0X2 != null) {
                                                        ViewGroup.LayoutParams layoutParams = A0X2.getLayoutParams();
                                                        layoutParams.width = -2;
                                                        A0X2.setLayoutParams(layoutParams);
                                                        C279864zZ r1 = this.A00;
                                                        if (r1 != null) {
                                                            User user2 = r1.A0D;
                                                            AnonymousClass60J r3 = r1.A04;
                                                            ArrayList A1C = AnonymousClass7TE.A1C();
                                                            A1C.add(user2.B8Q());
                                                            if (r3 != null) {
                                                                List<BEK> list = r3.A00;
                                                                if (list != null) {
                                                                    for (BEK bek : list) {
                                                                        A1C.add(bek.A01.B8Q());
                                                                    }
                                                                }
                                                                List list2 = r3.A01;
                                                                if (list2 != null) {
                                                                    Iterator it = list2.iterator();
                                                                    while (it.hasNext()) {
                                                                        User A0k = DbT.A0k(it);
                                                                        if (!0qQ.A0K(A0k.getId(), DbU.A0u(r7))) {
                                                                            A1C.add(A0k.B8Q());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            IgTextView igTextView = this.A02;
                                                            if (igTextView != null) {
                                                                int size = A1C.size();
                                                                if (size != 0) {
                                                                    if (size != 1) {
                                                                        if (size != 2) {
                                                                            activity = getActivity();
                                                                            if (size != 3) {
                                                                                if (activity != null) {
                                                                                    i = 2131956243;
                                                                                    objArr = new Object[]{AnonymousClass7TE.A19(DbV.A18((String) A1C.get(0), " "), 0), AnonymousClass7TE.A19(DbV.A18((String) A1C.get(1), " "), 0), AnonymousClass7TE.A19(DbV.A18((String) A1C.get(2), " "), 0), A1C.get(3)};
                                                                                }
                                                                            } else if (activity != null) {
                                                                                i = 2131956244;
                                                                                objArr = new Object[]{AnonymousClass7TE.A19(DbV.A18((String) A1C.get(0), " "), 0), AnonymousClass7TE.A19(DbV.A18((String) A1C.get(1), " "), 0), A1C.get(2)};
                                                                            }
                                                                        } else {
                                                                            activity = getActivity();
                                                                            if (activity != null) {
                                                                                i = 2131956245;
                                                                                objArr = new Object[]{AnonymousClass7TE.A19(DbV.A18((String) A1C.get(0), " "), 0), A1C.get(1)};
                                                                            }
                                                                        }
                                                                        str4 = activity.getString(i, objArr);
                                                                    } else {
                                                                        C279864zZ r05 = this.A00;
                                                                        if (r05 != null) {
                                                                            str4 = r05.A0D.A0Q();
                                                                        }
                                                                    }
                                                                }
                                                                igTextView.setText(str4);
                                                                AnonymousClass0fD.A09(-626110731, A022);
                                                                return inflate;
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
                        0qQ.A0F("noteItem");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            0qQ.A0F("noteAvatar");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
