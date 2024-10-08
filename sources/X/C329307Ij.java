package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: X.7Ij  reason: invalid class name and case insensitive filesystem */
public final class C329307Ij implements C329317Ik, C329327Il, C329337Im, C329347In, C329357Io, C329367Ip, C329377Iq {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public DataSetObserver A03;
    public Adapter A04;
    public RecyclerView A05;
    public C355598Qp A06;
    public AnonymousClass7OF A07;
    public C328757Gc A08;
    public C328887Gq A09;
    public C331337Qp A0A;
    public Integer A0B;
    public String A0C = "";
    public boolean A0D;
    public boolean A0E = false;
    public ViewGroup A0F;
    public final int A0G;
    public final TextWatcher A0H;
    public final View A0I;
    @Deprecated
    public final View A0J;
    public final UserSession A0K;
    public final UserSession A0L;
    public final ColorFilterAlphaImageView A0M;
    public final ColorFilterAlphaImageView A0N;
    public final ColorFilterAlphaImageView A0O;
    public final AnonymousClass7J4 A0P;
    public final C329247Id A0Q;
    public final ComposerAutoCompleteTextView A0R;
    public final ComposerAutoCompleteTextView A0S;
    public final /* synthetic */ C329417Iu A0T;
    public final /* synthetic */ C329457Iy A0U;
    public final /* synthetic */ C329457Iy A0V;
    public final /* synthetic */ C329437Iw A0W;
    public final /* synthetic */ AnonymousClass7J3 A0X;
    public final /* synthetic */ C329427Iv A0Y;

    public final void A04(AnonymousClass7L0 r10, boolean z) {
        ImageView imageView;
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        AnonymousClass7J3 r2 = this.A0X;
        boolean A012 = AnonymousClass7J1.A00.A01(r2.A04);
        View view = (View) r2.A07.getValue();
        AnonymousClass7L0 r5 = r10;
        if (A012) {
            if ((view instanceof ColorFilterAlphaImageView) && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) view) != null) {
                colorFilterAlphaImageView.setImageDrawable(colorFilterAlphaImageView.getContext().getDrawable(R.drawable.instagram_camera_pano_outline_24));
                colorFilterAlphaImageView.A04(r10.A0C, r10.A0D);
            }
        } else if ((view instanceof ImageView) && (imageView = (ImageView) view) != null && imageView.getDrawable() != null) {
            AnonymousClass7BG.A01(r2.A03, imageView, r5, ((Number) r2.A0A.invoke()).intValue(), z, false);
        }
    }

    public final void A05(C3260875i r7) {
        C3260875i r4 = r7;
        Integer A032 = r7.A03();
        if (A032 != null) {
            int intValue = A032.intValue();
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0S;
            if (!OQY.A01(composerAutoCompleteTextView, intValue) || this.A0E) {
                composerAutoCompleteTextView.setSelection(0);
                OQY.A00(composerAutoCompleteTextView.getContext(), this.A0K, this.A0Q, composerAutoCompleteTextView, r4, A07());
                composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
            }
        }
    }

    public final void ADj(AnonymousClass7L0 r2) {
        this.A0P.ADj(r2);
    }

    public final View Ajg() {
        return this.A0T.Ajg();
    }

    public final ColorFilterAlphaImageView BZe() {
        return this.A0V.BZe();
    }

    public final void Cmd(Integer num, boolean z) {
        0qQ.A0B(num, 0);
        this.A0X.Cmd(num, true);
    }

    public final void Ejq(boolean z) {
        this.A0W.Ejq(z);
    }

    public final void Ejr(boolean z) {
        this.A0W.Ejr(z);
    }

    public final void ErS(AnonymousClass7JU r2, AnonymousClass7JT r3, 0sP r4, boolean z) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 1);
        this.A0P.ErS(r2, r3, r4, z);
    }

    public final void FLI(AnonymousClass7JT r2, 0sP r3, boolean z) {
        0qQ.A0B(r2, 0);
        this.A0P.FLI(r2, r3, z);
    }

    public final void FLT(boolean z, boolean z2) {
        this.A0W.FLT(z, z2);
    }

    public final void FLX(Boolean bool, String str, C62320sa r4, boolean z) {
        this.A0X.FLX(bool, str, r4, z);
    }

    public final void FLY(AnonymousClass7I3 r7, Boolean bool, String str, C62320sa r10, boolean z) {
        this.A0X.FLY(r7, bool, str, r10, z);
    }

    public final void FLZ(boolean z, C62320sa r4) {
        this.A0X.FLZ(false, r4);
    }

    public final void FLa(AnonymousClass9JF r2, C317966o8 r3, DirectStickerSuggestionsController directStickerSuggestionsController, C62320sa r5) {
        this.A0X.FLa(r2, r3, directStickerSuggestionsController, r5);
    }

    public final void FMQ(boolean z) {
        this.A0U.FMQ(z);
    }

    public final void FMR(AnonymousClass7JU r2, AnonymousClass7JT r3, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A0P.FMR(r2, r3, z);
    }

    public static void A00(C329307Ij r4, CharSequence charSequence) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r4.A0S;
        Resources resources = r4.A0R.getResources();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        int i = R.integer.composer_max_lines;
        if (isEmpty) {
            i = R.integer.direct_composer_hint_max_lines;
        }
        composerAutoCompleteTextView.setMaxLines(resources.getInteger(i));
    }

    public static boolean A01(C329307Ij r3) {
        UserSession userSession = r3.A0K;
        if (182.A06(0Tu.A05, userSession, 36328366693039391L) || 182.A06(0Tu.A06, userSession, 36328366693039391L)) {
            return true;
        }
        return false;
    }

    public final List A02() {
        C328757Gc r0 = this.A08;
        if (r0 == null) {
            return new ArrayList();
        }
        List list = r0.A00.A02;
        ArrayList<C388699oF> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof C388699oF) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C388699oF r02 : arrayList) {
            arrayList2.add(r02.A01);
        }
        return arrayList2;
    }

    public final void A03() {
        C355598Qp r1;
        C328757Gc r2 = this.A08;
        if (r2 != null && (r1 = this.A06) != null) {
            r2.A00(new ArrayList());
            r1.notifyDataSetChanged();
        }
    }

    public final void A06(String str) {
        if (str == null) {
            str = "";
        }
        C329427Iv r2 = this.A0Y;
        if (!0mp.A0G(r2.A00.trim(), str.trim())) {
            this.A0R.A02 = A01(this);
            r2.A00 = str;
            this.A0S.post(new C40881Akp(this));
        }
    }

    public final boolean A07() {
        2Rw r0;
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null || (r0 = recyclerView.A0A) == null || r0.getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final void ADc(0sL r2) {
        this.A0U.A02 = r2;
    }

    public final String AuW() {
        return this.A0Y.A00;
    }

    public final Editable Azu() {
        return this.A0Y.A01.getText();
    }

    public C329307Ij(Activity activity, View view, FrameLayout frameLayout, ListAdapter listAdapter, AnonymousClass0iw r37, UserSession userSession, C329077Hm r39, C329277Ig r40, C329287Ih r41, C329297Ii r42, C328757Gc r43, AnonymousClass7IM r44, AnonymousClass7IO r45, C328887Gq r46, C329247Id r47, C308476Uk r48, boolean z) {
        C329387Ir r2 = new C329387Ir(r40);
        C329397Is r1 = new C329397Is(r41);
        C329407It r7 = new C329407It(r42);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        View view2 = view;
        0qQ.A0B(view2, 3);
        FrameLayout frameLayout2 = frameLayout;
        0qQ.A0B(frameLayout2, 4);
        AnonymousClass7IM r12 = r44;
        0qQ.A0B(r12, 7);
        AnonymousClass7IO r14 = r45;
        0qQ.A0B(r14, 10);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) view2.findViewById(R.id.row_thread_composer_edittext);
        C329417Iu r10 = new C329417Iu(view2, userSession2);
        C329427Iv r8 = new C329427Iv(composerAutoCompleteTextView);
        C329247Id r5 = r47;
        Activity activity2 = activity;
        View view3 = view2;
        UserSession userSession3 = userSession2;
        AnonymousClass7IM r28 = r12;
        C329437Iw r23 = new C329437Iw(activity2, view3, userSession3, r8, r28, r5, r48, r7);
        C329457Iy r3 = new C329457Iy(view2, userSession2, r12, r14);
        View findViewById = view2.findViewById(R.id.composer_content_container);
        0qQ.A07(findViewById);
        AnonymousClass7J3 r142 = new AnonymousClass7J3(findViewById, view2, frameLayout2, userSession2, r10, r3, r12, r2, r1);
        AnonymousClass7J4 r232 = new AnonymousClass7J4(activity2, view3, userSession3, r10, r28);
        0qQ.A0B(composerAutoCompleteTextView, 13);
        this.A0U = r3;
        this.A0W = r23;
        this.A0Y = r8;
        this.A0X = r142;
        this.A0V = r3;
        this.A0T = r10;
        this.A0L = userSession2;
        this.A0R = composerAutoCompleteTextView;
        this.A0P = r232;
        Context context = view2.getContext();
        this.A0J = view2;
        this.A0K = userSession2;
        this.A0D = z;
        this.A0Q = r5;
        ListAdapter listAdapter2 = listAdapter;
        this.A04 = listAdapter2;
        this.A08 = r43;
        this.A09 = r46;
        this.A0C = context.getString(2131960524);
        View findViewById2 = view2.findViewById(R.id.row_thread_composer_textarea_container);
        findViewById2.getClass();
        this.A0I = findViewById2;
        View findViewById3 = view2.findViewById(R.id.row_thread_composer_edittext);
        findViewById3.getClass();
        ComposerAutoCompleteTextView composerAutoCompleteTextView2 = (ComposerAutoCompleteTextView) findViewById3;
        this.A0S = composerAutoCompleteTextView2;
        2eS.A04(composerAutoCompleteTextView2, AnonymousClass05K.A0Y);
        int integer = context.getResources().getInteger(R.integer.max_message_length);
        this.A0G = integer;
        composerAutoCompleteTextView2.setTextAppearance(R.style.InThreadComposerTextAreaRedesign);
        composerAutoCompleteTextView2.setTextSize(2, 16.0f);
        composerAutoCompleteTextView2.setMaxLines(context.getResources().getInteger(R.integer.direct_composer_hint_max_lines));
        composerAutoCompleteTextView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        C328887Gq r22 = this.A09;
        if (r22 != null) {
            composerAutoCompleteTextView2.A01(r22);
        }
        AnonymousClass7J5 r24 = new AnonymousClass7J5(this, r5);
        this.A0H = r24;
        composerAutoCompleteTextView2.addTextChangedListener(r24);
        Adapter adapter = this.A04;
        if (adapter != null) {
            AnonymousClass75Y r25 = new AnonymousClass75Y(adapter, this);
            this.A03 = r25;
            adapter.registerDataSetObserver(r25);
        }
        if (listAdapter2 instanceof AnonymousClass7H0) {
            C331337Qp r32 = new C331337Qp(userSession2);
            this.A0A = r32;
            r32.A01 = new AnonymousClass75Z(this);
            composerAutoCompleteTextView2.addTextChangedListener(r32);
        }
        if (listAdapter != null) {
            composerAutoCompleteTextView2.A04 = new C3260175b(listAdapter2, r5);
            composerAutoCompleteTextView2.setDropDownWidth(0nA.A09(context));
            composerAutoCompleteTextView2.setDropDownAnchor(AnonymousClass7S3.A00(userSession2) ? R.id.direct_thread_header : R.id.action_bar_wrapper);
            composerAutoCompleteTextView2.A02 = 1;
            composerAutoCompleteTextView2.setSupportedLinks(C294425mQ.ALL);
            composerAutoCompleteTextView2.setAdapter(listAdapter2);
            composerAutoCompleteTextView2.A01 = true;
            composerAutoCompleteTextView2.A02 = A01(this);
            C3260375d r33 = new C3260375d(this);
            C328887Gq r26 = this.A09;
            if (r26 != null) {
                r26.A02 = r33;
                C70822OMu oMu = r26.A01;
                if (oMu != null) {
                    oMu.A01 = r33;
                }
            }
            composerAutoCompleteTextView2.setOnItemClickListener(new C3260575f(r33));
            composerAutoCompleteTextView2.setOnTouchListener(new C3260675g(this));
        }
        View findViewById4 = view2.findViewById(R.id.row_thread_composer_button_gallery);
        findViewById4.getClass();
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) findViewById4;
        this.A0M = colorFilterAlphaImageView;
        AnonymousClass0fU.A00(new AnonymousClass7J6(this, r5), colorFilterAlphaImageView);
        View findViewById5 = view2.findViewById(R.id.row_thread_composer_voice);
        findViewById5.getClass();
        this.A0O = (ColorFilterAlphaImageView) findViewById5;
        View findViewById6 = view2.findViewById(R.id.row_thread_composer_button_sticker);
        findViewById6.getClass();
        this.A0N = (ColorFilterAlphaImageView) findViewById6;
        View findViewById7 = view2.findViewById(R.id.row_thread_composer_buttons_container);
        findViewById7.getClass();
        this.A0F = (ViewGroup) findViewById7;
        C328757Gc r4 = this.A08;
        if (r4 != null) {
            View view4 = this.A0J;
            Context context2 = view4.getContext();
            ViewStub viewStub = (ViewStub) view4.requireViewById(R.id.selected_media);
            if (viewStub != null) {
                this.A05 = (RecyclerView) viewStub.inflate();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2, 0, false);
                this.A06 = new C355598Qp(context2, this.A04, (C355568Qm) null, r37, this.A0K, r4.A00, (AnonymousClass8QZ) null, (C355448Qa) null, r39, Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material)), Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left)), new DIE(), 1.0f, context2.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin), context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left), false);
                this.A05.setLayoutManager(linearLayoutManager);
                this.A05.setAdapter(this.A06);
            }
        }
    }
}
