package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Locale;

public final class WBL implements View.OnFocusChangeListener, B21, AnonymousClass8Z3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public EditText A08;
    public TextView A09;
    public TextView A0A;
    public C71662eb A0B;
    public AvatarView A0C;
    public C16306UsZ A0D;
    public User A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public int[] A0J = new int[2];
    public final Context A0K;
    public final View A0L;
    public final ViewStub A0M;
    public final AnonymousClass87F A0N;
    public final C354538Mk A0O;
    public final AnonymousClass80U A0P;
    public final AnonymousClass8MF A0Q;

    public final void DzC(int i, int i2) {
    }

    private void A00() {
        if (this.A07 != null) {
            C315596kB.A08(new View[]{this.A0L, this.A06}, false);
            C16306UsZ usZ = this.A0D;
            usZ.getClass();
            usZ.A01("");
            EditText editText = this.A08;
            editText.getClass();
            editText.clearFocus();
        }
    }

    public final void DCS(Object obj) {
        if (this.A07 == null) {
            View inflate = this.A0M.inflate();
            this.A06 = inflate;
            inflate.getClass();
            View requireViewById = inflate.requireViewById(R.id.sticker_view);
            this.A07 = requireViewById;
            AnonymousClass87F r0 = this.A0N;
            r0.A03(requireViewById);
            r0.A03.A04 = true;
            this.A0C = (AvatarView) this.A07.findViewById(R.id.fundraiser_sticker_avatar);
            View requireViewById2 = this.A07.requireViewById(R.id.fundraiser_sticker_card);
            this.A05 = requireViewById2;
            C13989Tnp.A0M(requireViewById2).setOrientation(GradientDrawable.Orientation.TL_BR);
            EditText A0E2 = DbU.A0E(this.A07, R.id.fundraiser_sticker_title);
            this.A08 = A0E2;
            A0E2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            C306466Mg.A00(this.A08);
            this.A08.setOnFocusChangeListener(this);
            this.A0D = new C16306UsZ(this.A08);
            this.A0A = AnonymousClass7TE.A0d(this.A07, R.id.fundraiser_sticker_subtitle);
            this.A0B = DbY.A0T(this.A07, R.id.fundraiser_sticker_donate_button_divider_stub);
            this.A09 = AnonymousClass7TE.A0d(this.A07, R.id.fundraiser_sticker_donate_button);
            View view = this.A06;
            view.getClass();
            ImageView A0F2 = DbU.A0F(view, R.id.fundraiser_sticker_color_button);
            AnonymousClass3NG A0W = C13989Tnp.A0W(A0F2);
            A0W.A02(A0F2, this.A07);
            C15848UjY.A00(A0W, this, 17);
        }
        C315596kB.A09(new View[]{this.A0L, this.A06}, false);
        AnonymousClass87F r1 = this.A0N;
        r1.A02(r1.A01);
        obj.getClass();
        AnonymousClass8YF r5 = ((AnonymousClass8TP) obj).A00.A00;
        User user = r5.A02;
        user.getClass();
        this.A0E = user;
        String str = r5.A09;
        str.getClass();
        this.A0I = str;
        String str2 = r5.A06;
        if (str2 == null) {
            str2 = "";
        }
        this.A0H = str2;
        this.A0F = r5.A03;
        AvatarView avatarView = this.A0C;
        avatarView.getClass();
        avatarView.setAvatarUser(this.A0E);
        AvatarView avatarView2 = this.A0C;
        Context context = this.A0K;
        avatarView2.setAvatarSecondaryStrokeWidth(C13989Tnp.A0A(context));
        this.A0C.setAvatarSecondaryStrokeColor(context.getColor(R.color.chat_sticker_button_divider_color));
        this.A0G = DbW.A0h(context, this.A0E.B8Q(), 2131962835).toUpperCase(Locale.getDefault());
        C16306UsZ usZ = this.A0D;
        usZ.getClass();
        usZ.A00(this.A0G);
        C16306UsZ usZ2 = this.A0D;
        String str3 = r5.A0C;
        if (TextUtils.isEmpty(str3)) {
            str3 = this.A0G;
        }
        usZ2.A01(str3);
        EditText editText = this.A08;
        editText.getClass();
        editText.setSelection(C13988Tno.A0C(this.A08));
        String username = this.A0E.getUsername();
        String A0h = DbW.A0h(context, username, 2131962853);
        TextView textView = this.A0A;
        textView.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0h);
        AnonymousClass7AV.A03(spannableStringBuilder, new CharacterStyle(), username);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        this.A0A.post(new C20009WjU(this));
        String str4 = r5.A0A;
        int[] iArr = C19475WaN.A02;
        C14272Tsv A012 = C14276Tsz.A01(C14272Tsv.SOLID_LIGHT_GREY, Integer.valueOf(0nH.A0C(str4, iArr[0])), Integer.valueOf(0nH.A0C(r5.A05, iArr[1])));
        A012.getClass();
        ArrayList arrayList = C17164VKt.A01;
        int indexOf = arrayList.indexOf(A012);
        this.A00 = indexOf;
        if (indexOf == -1) {
            this.A00 = 0;
            A012 = (C14272Tsv) arrayList.get(0);
        }
        A01(this, A012);
        EditText editText2 = this.A08;
        editText2.getClass();
        C16306UsZ usZ3 = this.A0D;
        usZ3.getClass();
        editText2.addTextChangedListener(usZ3);
        C354538Mk r12 = this.A0O;
        C317876nz r02 = C317876nz.A1T;
        r12.DnE("fundraiser_sticker_bundle_id");
    }

    public final void DDW() {
        AnonymousClass8MF r3 = this.A0Q;
        EditText editText = this.A08;
        editText.getClass();
        String trim = AnonymousClass7TF.A0f(editText).trim();
        if (TextUtils.isEmpty(trim)) {
            trim = this.A0G;
        }
        int[] iArr = C19475WaN.A03;
        String str = "";
        AnonymousClass4Hy r11 = new AnonymousClass8YF(C18710Vyf.A00(), (User) null, (String) null, "", "", (String) null, (String) null, "", "", "", "", str, "", 0).A01;
        User user = this.A0E;
        trim.getClass();
        String A0G2 = 0nH.A0G(this.A03);
        0qQ.A0B(A0G2, 0);
        String A0F2 = 0nH.A0F(this.A0J[0]);
        String A0F3 = 0nH.A0F(this.A0J[1]);
        String A0F4 = 0nH.A0F(this.A04);
        String A0F5 = 0nH.A0F(this.A01);
        String str2 = this.A0I;
        str2.getClass();
        String str3 = this.A0H;
        r3.Dn8(new C19475WaN(C39574A0q.A00(r11, user, this.A0F, A0F5, A0F3, str3, (String) null, str, str2, A0F2, A0G2, trim, A0F4, this.A02)), (String) null);
        EditText editText2 = this.A08;
        editText2.getClass();
        editText2.removeTextChangedListener(this.A0D);
        A00();
        C354538Mk r1 = this.A0O;
        C317876nz r0 = C317876nz.A1T;
        r1.Dn9("fundraiser_sticker_bundle_id");
    }

    public final void DMp() {
        this.A0P.E3H(new Object());
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass87F r0 = this.A0N;
        if (z) {
            r0.A00();
            C63183Ksq.A00(view);
            return;
        }
        r0.A01();
        0qQ.A0B(view, 0);
        0nA.A0N(view);
        A00();
    }

    public WBL(View view, AnonymousClass3E6 r4, C354538Mk r5, AnonymousClass80U r6, AnonymousClass8MF r7) {
        Context context = view.getContext();
        this.A0K = context;
        this.A0N = new AnonymousClass87F(context, r4, this);
        this.A0Q = r7;
        this.A0P = r6;
        this.A0L = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0M = DbU.A0D(view, R.id.fundraiser_sticker_editor_stub);
        this.A0O = r5;
    }

    public static void A01(WBL wbl, C14272Tsv tsv) {
        C71662eb r1;
        int i;
        wbl.A0J = C14276Tsz.A02(tsv);
        View view = wbl.A05;
        view.getClass();
        C13989Tnp.A0M(view).setColors(wbl.A0J);
        if (tsv == C19475WaN.A01) {
            wbl.A04 = -16777216;
            wbl.A03 = -6710887;
            wbl.A01 = -13068304;
            r1 = wbl.A0B;
            r1.getClass();
            i = 0;
        } else {
            wbl.A04 = -1;
            wbl.A03 = -855638017;
            wbl.A01 = C14276Tsz.A00(tsv);
            r1 = wbl.A0B;
            r1.getClass();
            i = 8;
        }
        r1.A03(i);
        EditText editText = wbl.A08;
        editText.getClass();
        editText.setTextColor(wbl.A04);
        TextView textView = wbl.A0A;
        textView.getClass();
        textView.setTextColor(wbl.A03);
        TextView textView2 = wbl.A09;
        textView2.getClass();
        textView2.setTextColor(wbl.A01);
    }
}
