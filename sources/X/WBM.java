package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.ArrayList;

public final class WBM implements View.OnFocusChangeListener, B21, AnonymousClass8Z3, B20 {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public EditText A06;
    public C17826Vgf A07;
    public AvatarView A08;
    public C16306UsZ A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final ImageUrl A0G;
    public final AnonymousClass87F A0H;
    public final QuestionStickerType A0I = QuestionStickerType.TEXT;
    public final ArrayList A0J;
    public final ArrayList A0K;
    public final UserSession A0L;
    public final C354538Mk A0M;
    public final AnonymousClass80U A0N;
    public final AnonymousClass8MF A0O;

    public WBM(View view, UserSession userSession, AnonymousClass3E6 r14, C354538Mk r15, AnonymousClass80U r16, AnonymousClass8MF r17) {
        0qQ.A0B(r15, 6);
        this.A0L = userSession;
        this.A0N = r16;
        this.A0O = r17;
        this.A0M = r15;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A0D = A0S;
        this.A0H = new AnonymousClass87F(A0S, r14, this);
        this.A0G = DbX.A0X(userSession);
        this.A0E = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A0F = JTR.A0X(view, R.id.question_sticker_editor_stub);
        ArrayList A1L = 0sr.A1L(new Integer[]{DbV.A0n(A0S, R.color.design_dark_default_color_on_background), DbV.A0n(A0S, R.color.black), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_purple)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_blue))});
        this.A0K = A1L;
        this.A0J = 0sr.A1L(new String[]{JTQ.A0a(A0S, 2131976875), JTQ.A0a(A0S, 2131953830), JTQ.A0a(A0S, 2131969486), JTQ.A0a(A0S, 2131970978), JTQ.A0a(A0S, 2131969058), JTQ.A0a(A0S, 2131963128), JTQ.A0a(A0S, 2131953930)});
        this.A00 = AnonymousClass7TE.A0M(DbZ.A0g(A1L, 0));
    }

    private final void A01(C19477WaP waP) {
        Context context;
        C16306UsZ usZ;
        int i;
        EditText editText;
        if (waP == null) {
            this.A01 = 0;
            context = this.A0D;
            A00(this, C19477WaP.A00(context));
            C16306UsZ usZ2 = this.A09;
            if (usZ2 != null) {
                usZ2.A01(usZ2.A00);
            }
        } else {
            ArrayList arrayList = this.A0K;
            context = this.A0D;
            this.A01 = arrayList.indexOf(Integer.valueOf(waP.A03(context)));
            A00(this, waP.A03(context));
            String A052 = waP.A05();
            if (!(A052 == null || (usZ = this.A09) == null)) {
                usZ.A01(A052);
            }
        }
        C17826Vgf vgf = this.A07;
        if (vgf != null) {
            vgf.A00();
        }
        C16306UsZ usZ3 = this.A09;
        if (usZ3 != null) {
            usZ3.A00(AnonymousClass7TE.A16(context, 2131971056));
        }
        if (this.A0A || ((editText = this.A06) != null && editText.isFocused())) {
            i = 2131971052;
        } else {
            i = 2131971053;
        }
        String A0p = C51967G9n.A0p(context, i);
        C17826Vgf vgf2 = this.A07;
        if (vgf2 != null && vgf2.A02.CVM()) {
            TextView textView = vgf2.A01;
            if (textView != null) {
                textView.setText(A0p);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A00(this, this.A00);
        EditText editText2 = this.A06;
        if (editText2 != null) {
            JTR.A1F(editText2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.9jo, java.util.concurrent.Callable] */
    public final void DCS(Object obj) {
        View requireViewById;
        EditText editText;
        C17826Vgf vgf;
        ImageView A0F2;
        0qQ.A0B(obj, 0);
        AnonymousClass8TC r6 = (AnonymousClass8TC) obj;
        this.A0A = r6.A01;
        this.A0C = r6.A03;
        this.A0B = r6.A02;
        if (this.A05 == null) {
            AvatarView avatarView = null;
            ViewStub viewStub = this.A0F;
            0nA.A0g(viewStub, -1, -1);
            View A0H2 = JTP.A0H(viewStub, R.layout.question_sticker_multi_format_editor);
            C66580MXl.A1R(A0H2);
            ViewGroup viewGroup = (ViewGroup) A0H2;
            this.A05 = viewGroup;
            if (viewGroup != null) {
                View requireViewById2 = viewGroup.requireViewById(R.id.question_sticker_container);
                AnonymousClass87F r1 = this.A0H;
                0qQ.A0A(requireViewById2);
                r1.A03(requireViewById2);
                this.A03 = requireViewById2;
                View requireViewById3 = viewGroup.requireViewById(R.id.question_sticker_editor);
                this.A02 = requireViewById3.requireViewById(R.id.question_sticker_card);
                this.A04 = requireViewById3;
            }
            View view = this.A03;
            if (view != null) {
                0nA.A0t(view, new C385959jo(this, 2));
                View view2 = this.A04;
                if (view2 != null) {
                    avatarView = (AvatarView) view2.requireViewById(R.id.question_sticker_avatar);
                }
                this.A08 = avatarView;
                View view3 = this.A04;
                if (view3 != null) {
                    editText = DbU.A0E(view3, R.id.question_sticker_question);
                } else {
                    editText = null;
                }
                this.A06 = editText;
                if (editText != null) {
                    editText.setTypeface(AnonymousClass7TG.A0O(AnonymousClass7TE.A0S(editText)));
                    editText.setOnFocusChangeListener(this);
                    C16306UsZ usZ = new C16306UsZ(editText);
                    this.A09 = usZ;
                    editText.addTextChangedListener(usZ);
                }
                View view4 = this.A04;
                if (view4 != null) {
                    vgf = new C17826Vgf(view4);
                    vgf.A00();
                } else {
                    vgf = null;
                }
                this.A07 = vgf;
                View view5 = this.A04;
                if (view5 != null) {
                    DbU.A0G(view5, R.id.question_sticker_answer).setTypeface(AnonymousClass7TG.A0O(this.A0D));
                }
                ViewGroup viewGroup2 = this.A05;
                if (!(viewGroup2 == null || (A0F2 = DbU.A0F(viewGroup2, R.id.question_sticker_color_button)) == null)) {
                    AnonymousClass3NG A0W = C13989Tnp.A0W(A0F2);
                    A0W.A02(A0F2, this.A04);
                    C15848UjY.A00(A0W, this, 19);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        boolean z = this.A0A;
        AvatarView avatarView2 = this.A08;
        if (z) {
            AnonymousClass7TH.A0R(avatarView2);
        } else {
            if (avatarView2 != null) {
                avatarView2.setVisibility(0);
            }
            AvatarView avatarView3 = this.A08;
            if (avatarView3 != null) {
                avatarView3.setAvatarUrl(this.A0G);
            }
        }
        if (this.A0A) {
            EditText editText2 = this.A06;
            if (editText2 != null) {
                0nA.A0e(editText2, 0);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        ViewGroup viewGroup3 = this.A05;
        if (!(viewGroup3 == null || (requireViewById = viewGroup3.requireViewById(R.id.question_sticker_info_text)) == null)) {
            requireViewById.setVisibility(DbW.A01(this.A0A ? 1 : 0));
        }
        C294975nL.A07(new View[]{this.A0E, this.A05, this.A04}, false);
        AnonymousClass87F r12 = this.A0H;
        r12.A02(r12.A01);
        A01(r6.A00);
        this.A0M.DnE(C273654mx.A00(373));
    }

    public final /* synthetic */ void DzC(int i, int i2) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass87F r0 = this.A0H;
        if (z) {
            r0.A00();
            C63183Ksq.A00(view);
            return;
        }
        r0.A01();
        0nA.A0N(view);
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            C294975nL.A05(new View[]{this.A0E, viewGroup, this.A04}, false);
        }
    }

    public static final void A00(WBM wbm, int i) {
        Drawable drawable;
        int A082;
        wbm.A00 = i;
        View view = wbm.A02;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        String A002 = C273654mx.A00(0);
        0qQ.A0C(drawable, A002);
        ((GradientDrawable) drawable).setColor(i);
        AvatarView avatarView = wbm.A08;
        if (avatarView != null) {
            avatarView.setStrokeColor(i);
        }
        Context context = wbm.A0D;
        if (i != AnonymousClass7TF.A03(context, R.attr.igds_color_sticker_background)) {
            A082 = context.getColor(2Yu.A0A(context));
        } else {
            A082 = 0nH.A08(i, 1.0f);
        }
        int A012 = AnonymousClass6YG.A01(context, i);
        EditText editText = wbm.A06;
        if (editText != null) {
            editText.setTextColor(A082);
        }
        C17826Vgf vgf = wbm.A07;
        if (vgf != null) {
            int A003 = AnonymousClass6YG.A00(context, i);
            if (vgf.A02.CVM()) {
                View view2 = vgf.A00;
                if (view2 != null) {
                    Drawable background = view2.getBackground();
                    0qQ.A0C(background, A002);
                    ((GradientDrawable) background).setColor(A012);
                    TextView textView = vgf.A01;
                    if (textView != null) {
                        textView.setTextColor(A003);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final View Azx() {
        return this.A02;
    }

    public final Class Bza() {
        return C16150Upb.class;
    }

    public final void DDW() {
        Editable editable;
        int A082;
        AnonymousClass8MF r1 = this.A0O;
        EditText editText = this.A06;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String A12 = DbV.A12(String.valueOf(editable));
        if (A12 == null || A12.length() == 0) {
            C16306UsZ usZ = this.A09;
            if (usZ != null) {
                A12 = usZ.A00;
            } else {
                A12 = null;
            }
        }
        QuestionStickerType questionStickerType = this.A0I;
        Context context = this.A0D;
        C19477WaP.A00(context);
        C19477WaP.A01(context);
        ImageUrl imageUrl = this.A0G;
        EditText editText2 = this.A06;
        if (editText2 != null) {
            A082 = editText2.getCurrentTextColor();
        } else {
            int i = this.A00;
            if (i != AnonymousClass7TF.A03(context, R.attr.igds_color_sticker_background)) {
                A082 = context.getColor(2Yu.A0A(context));
            } else {
                A082 = 0nH.A08(i, 1.0f);
            }
        }
        r1.Dn8(new C19477WaP(imageUrl, questionStickerType, (String) null, A12, this.A00, A082, this.A0A, this.A0B, this.A0C), (String) null);
        A01((C19477WaP) null);
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            C294975nL.A05(new View[]{this.A0E, viewGroup, this.A04}, false);
        }
        this.A0M.Dn9(C273654mx.A00(373));
    }

    public final void DMp() {
        EditText editText = this.A06;
        if (editText != null) {
            editText.clearFocus();
        }
        this.A0N.E3H(new Object());
    }
}
