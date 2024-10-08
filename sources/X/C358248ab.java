package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.8ab  reason: invalid class name and case insensitive filesystem */
public final class C358248ab {
    public static final AnonymousClass0iw A0d = new 0xG("dialog_builder_module");
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public View A02;
    public C226462gr A03;
    public 0lg A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public DialogInterface.OnCancelListener A0A;
    public DialogInterface.OnClickListener A0B;
    public DialogInterface.OnClickListener A0C;
    public DialogInterface.OnClickListener A0D;
    public DialogInterface.OnDismissListener A0E;
    public DialogInterface.OnShowListener A0F;
    public CharSequence A0G;
    public Integer A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public CharSequence[] A0N;
    public final int A0O;
    public final Dialog A0P;
    public final Context A0Q;
    public final Handler A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewGroup A0V;
    public final ViewStub A0W;
    public final FrameLayout A0X;
    public final ListView A0Y;
    public final IgdsHeadline A0Z;
    public final TextView A0a;
    public final TextView A0b;
    public final TextView A0c;

    @Deprecated(message = "See constructor that passes in an activity instead.")
    public C358248ab(Context context, int i) {
        View view;
        this.A0Q = context;
        this.A0L = "";
        Integer num = AnonymousClass05K.A00;
        this.A0I = num;
        this.A0H = num;
        this.A0P = new Dialog(context, i);
        try {
            view = LayoutInflater.from(context).inflate(R.layout.igds_dialog_layout, (ViewGroup) null, false);
            this.A02 = view;
        } catch (InflateException e) {
            2Yn.A03(this.A0Q, e);
            this.A0Q.getTheme().applyStyle(2Yn.A00(), true);
            view = LayoutInflater.from(this.A0Q).inflate(R.layout.igds_dialog_layout, (ViewGroup) null, false);
            this.A02 = view;
        }
        this.A0P.setContentView(view);
        IgdsHeadline igdsHeadline = (IgdsHeadline) this.A02.requireViewById(R.id.panorama_dialog_headline);
        this.A0Z = igdsHeadline;
        igdsHeadline.setFocusable(false);
        this.A0V = (ViewGroup) this.A02.requireViewById(R.id.dialog_custom_header_view);
        this.A0X = (FrameLayout) this.A02.requireViewById(R.id.dialog_custom_subtitle_view);
        this.A0W = (ViewStub) this.A02.requireViewById(R.id.dialog_image_holder);
        this.A0U = this.A02.requireViewById(R.id.primary_button_row);
        this.A0S = this.A02.requireViewById(R.id.auxiliary_button_row);
        this.A0T = this.A02.requireViewById(R.id.negative_button_row);
        this.A0c = (TextView) this.A02.requireViewById(R.id.primary_button);
        this.A0a = (TextView) this.A02.requireViewById(R.id.auxiliary_button);
        this.A0b = (TextView) this.A02.requireViewById(R.id.negative_button);
        ListView listView = (ListView) this.A02.requireViewById(16908298);
        this.A0Y = listView;
        this.A0R = new Handler();
        listView.setVisibility(8);
        listView.setBackground((Drawable) null);
        listView.setLayoutDirection(3);
        this.A0O = 2Yu.A0G(this.A0Q, R.attr.dialogCornerRadius);
        A0g((DialogInterface.OnShowListener) null);
    }

    public static final void A01(IgImageView igImageView, C358248ab r5, int i, int i2, int i3) {
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = 0.0f;
        if (f > 0.0f) {
            f3 = f2 / f;
        }
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        int dimensionPixelSize = r5.A0Q.getResources().getDimensionPixelSize(i3);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = AnonymousClass1GB.A01(((float) dimensionPixelSize) * f3);
        igImageView.setLayoutParams(layoutParams);
    }

    public final void A03() {
        A0G((DialogInterface.OnClickListener) null, 2131954722);
    }

    public final void A04() {
        A0s(true);
    }

    public final void A05() {
        A0H((DialogInterface.OnClickListener) null, 2131954722);
    }

    public final void A06() {
        A0I((DialogInterface.OnClickListener) null, 2131968772);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A07(int i) {
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        IgdsHeadline.A01(igdsHeadline, (Integer) null).setImageDrawable(igdsHeadline.getContext().getDrawable(i));
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    public final void A0A(int i, int i2) {
        Context context = this.A0Q;
        String string = context.getString(i);
        0qQ.A07(string);
        A0U((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, string, context.getString(i2), true);
    }

    public final void A0N(DialogInterface.OnClickListener onClickListener, View view, TextView textView, C358278ae r9, String str, String str2, int i, boolean z) {
        Context context;
        int A0H2;
        Context context2;
        int A0H3;
        0qQ.A0B(view, 0);
        0qQ.A0B(textView, 1);
        view.setVisibility(0);
        textView.setText(str);
        2eS.A04(textView, AnonymousClass05K.A01);
        if (str2 != null) {
            textView.setContentDescription(str2);
        }
        if (r9 == C358278ae.BLUE) {
            context2 = this.A0Q;
            A0H3 = 1QE.A01(context2);
        } else {
            if (r9 == C358278ae.BLUE_BOLD) {
                context = this.A0Q;
                A0H2 = 1QE.A01(context);
            } else if (r9 == C358278ae.RED) {
                context2 = this.A0Q;
                A0H3 = 2Yu.A0H(context2, R.attr.igds_color_error_or_destructive);
            } else {
                if (r9 == C358278ae.RED_BOLD) {
                    int i2 = R.attr.igds_color_error_or_destructive;
                    context = this.A0Q;
                    Object systemService = context.getSystemService("accessibility");
                    0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    if (2eO.A02((AccessibilityManager) systemService, true) && AnonymousClass1GD.A03()) {
                        i2 = R.attr.igds_color_gradient_pink;
                    }
                    A0H2 = 2Yu.A0H(context, i2);
                }
                AnonymousClass0fU.A00(new C358288af(onClickListener, this, i, z), view);
            }
            textView.setTextColor(context.getColor(A0H2));
            textView.setTypeface(textView.getTypeface(), 1);
            AnonymousClass0fU.A00(new C358288af(onClickListener, this, i, z), view);
        }
        textView.setTextColor(context2.getColor(A0H3));
        AnonymousClass0fU.A00(new C358288af(onClickListener, this, i, z), view);
    }

    public final void A0P(DialogInterface.OnClickListener onClickListener, C358278ae r9, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0U(onClickListener, r9, string, (String) null, true);
    }

    public final void A0R(DialogInterface.OnClickListener onClickListener, C358278ae r9, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0V(onClickListener, r9, string, (String) null, true);
    }

    public final void A0S(DialogInterface.OnClickListener onClickListener, C358278ae r9, int i, int i2) {
        Context context = this.A0Q;
        String string = context.getString(i);
        0qQ.A07(string);
        A0V(onClickListener, r9, string, context.getString(i2), true);
    }

    public final void A0T(DialogInterface.OnClickListener onClickListener, C358278ae r12, String str, String str2, boolean z) {
        String str3 = str;
        this.A0J = str;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        this.A0B = onClickListener;
        C358278ae r5 = r12;
        if (r12 == C358278ae.RED || r12 == C358278ae.RED_BOLD) {
            this.A0H = AnonymousClass05K.A01;
        }
        A0N(onClickListener2, this.A0S, this.A0a, r5, str3, str2, -1, z);
    }

    public final void A0U(DialogInterface.OnClickListener onClickListener, C358278ae r11, String str, String str2, boolean z) {
        0qQ.A0B(r11, 4);
        this.A0K = str;
        this.A0C = onClickListener;
        A0N(onClickListener, this.A0T, this.A0b, r11, str, str2, -2, z);
    }

    public final void A0V(DialogInterface.OnClickListener onClickListener, C358278ae r12, String str, String str2, boolean z) {
        String str3 = str;
        0qQ.A0B(str, 0);
        C358278ae r5 = r12;
        0qQ.A0B(r12, 4);
        this.A0L = str;
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        this.A0D = onClickListener;
        if (r12 == C358278ae.RED || r12 == C358278ae.RED_BOLD) {
            this.A0I = AnonymousClass05K.A01;
        }
        A0N(onClickListener2, this.A0U, this.A0c, r5, str3, str2, -1, z);
    }

    public final void A0W(DialogInterface.OnClickListener onClickListener, C358278ae r8, String str, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 3);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        A0T(onClickListener2, r8, str, (String) null, z);
    }

    public final void A0X(DialogInterface.OnClickListener onClickListener, C358278ae r8, String str, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 3);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        A0U(onClickListener2, r8, str, (String) null, z);
    }

    public final void A0Y(DialogInterface.OnClickListener onClickListener, C358278ae r8, String str, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 3);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        A0V(onClickListener2, r8, str, (String) null, z);
    }

    public final void A0Z(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(charSequence, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        03v.A07(this.A0Z);
        Context context = this.A0Q;
        AnonymousClass7AV.A05(spannableStringBuilder, new C48045ESn(onClickListener, this, context.getColor(2Yu.A0H(context, R.attr.igds_color_link))), str);
        A0q(spannableStringBuilder);
    }

    public final void A0a(DialogInterface.OnClickListener onClickListener, String str) {
        0qQ.A0B(str, 0);
        A0W(onClickListener, C358278ae.DEFAULT, str, true);
    }

    public final void A0b(DialogInterface.OnClickListener onClickListener, String str) {
        0qQ.A0B(str, 0);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        A0U(onClickListener2, C358278ae.DEFAULT, str, (String) null, true);
    }

    public final void A0c(DialogInterface.OnClickListener onClickListener, String str) {
        0qQ.A0B(str, 0);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        A0V(onClickListener2, C358278ae.BLUE_BOLD, str, (String) null, true);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.widget.ListAdapter, X.NKx] */
    @Deprecated(message = "Dialogs with more than three options should consider using an ActionSheet instead.")
    public final void A0e(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        0qQ.A0B(charSequenceArr, 0);
        Context context = this.A0Q;
        ? nKx = new C68504NKx(context, this.A04, A0d);
        nKx.shouldCenterText = this.A06;
        this.A00 = onClickListener;
        ArrayList arrayList = new ArrayList();
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            String str = charSequenceArr[i];
            if (str == null) {
                str = "";
            }
            arrayList.add(new C50989Fmc(context, (View.OnClickListener) new C40013ANt(this, i), (CharSequence) str));
        }
        nKx.addDialogMenuItems(arrayList);
        ListView listView = this.A0Y;
        listView.setAdapter(nKx);
        listView.setVisibility(0);
        this.A0N = charSequenceArr;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0h(Bitmap bitmap, AnonymousClass0iw r4, ImageUrl imageUrl) {
        this.A08 = true;
        WTH wth = new WTH(this);
        if (bitmap != null) {
            this.A0Z.setImageBitmap(bitmap, wth);
        } else if (!C253833rU.A02(imageUrl)) {
            this.A0Z.setImageURL(imageUrl, r4, wth);
        }
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0i(Drawable drawable) {
        this.A08 = true;
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPromoDialog", imports = {}))
    public final void A0j(Drawable drawable) {
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        IgdsHeadline.A00(igdsHeadline).setImageDrawable(drawable);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    public final void A0k(View view) {
        ViewGroup viewGroup = this.A0V;
        viewGroup.setVisibility(0);
        viewGroup.addView(view);
    }

    @Deprecated(message = "")
    public final void A0l(Fragment fragment, 0lg r3) {
        0qQ.A0B(fragment, 1);
        this.A04 = r3;
        A0m((AnonymousClass4DJ) fragment);
    }

    public final void A0m(AnonymousClass4DJ r2) {
        0qQ.A0B(r2, 0);
        r2.registerLifecycleListener(new C385569jB(this));
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0n(ImageUrl imageUrl, AnonymousClass0iw r6) {
        0qQ.A0B(imageUrl, 0);
        this.A08 = true;
        IgdsHeadline igdsHeadline = this.A0Z;
        CircularImageView A012 = IgdsHeadline.A01(igdsHeadline, (Integer) null);
        if (r6 == null) {
            r6 = igdsHeadline;
        }
        A012.setUrl(imageUrl, r6);
        igdsHeadline.setVisibility(0);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0o(ImageUrl imageUrl, AnonymousClass0iw r6) {
        0qQ.A0B(r6, 1);
        this.A08 = true;
        IgImageView A002 = A00(this);
        ViewParent parent = A002.getParent();
        0qQ.A0C(parent, AnonymousClass000.A00(0));
        A002.A0I = new C64869LjV(this, ((View) parent).getWidth());
        A002.setUrl(imageUrl, r6);
        this.A09 = true;
    }

    @Deprecated(message = "Please don't use this method anymore. If you feel like you have a case where this is needed, please reach out to IGDS (oncall: ig_design_systems).", replaceWith = @ReplaceWith(expression = "com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog", imports = {}))
    public final void A0p(ImageUrl imageUrl, AnonymousClass0iw r4) {
        this.A08 = true;
        this.A0Z.setImageURL(imageUrl, r4, new WTI(this));
    }

    public final void A0s(boolean z) {
        this.A0M = true;
        this.A0P.setCanceledOnTouchOutside(z);
    }

    public static final IgImageView A00(C358248ab r2) {
        ViewStub viewStub = r2.A0W;
        viewStub.setLayoutResource(R.layout.dialog_image);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        viewStub.setLayoutParams(marginLayoutParams);
        IgImageView inflate = viewStub.inflate();
        0qQ.A0C(inflate, C273654mx.A00(10));
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r3 == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog A02() {
        /*
            r27 = this;
            r10 = r27
            android.content.Context r9 = r10.A0Q
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x001f
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x001f
            X.0wj r2 = X.0wj.A01
            r1 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r0 = "DialogBuilder - Activity is finishing"
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
        L_0x001f:
            android.widget.ListView r1 = r10.A0Y
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x003b
            android.widget.ListAdapter r2 = r1.getAdapter()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.menu.SimplePreferenceAdapter"
            X.0qQ.A0C(r2, r0)
            X.NKx r2 = (X.C68504NKx) r2
            boolean r0 = r10.A06
            r2.shouldCenterText = r0
            r0 = 1
            r2.roundDialogTopCorners = r0
            r2.roundDialogBottomCorners = r0
        L_0x003b:
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x005b
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r4 = X.0ob.A00(r0)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320330810925380(0x810926001c2144, double:3.03246168283797E-306)
            boolean r3 = X.182.A06(r0, r4, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x005b
            r2 = 1
            if (r3 != 0) goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x00e7
            if (r2 == 0) goto L_0x00e7
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r10.A0L
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0096
            java.lang.String r1 = r10.A0J
            if (r1 == 0) goto L_0x0096
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r1, r0)
            r10.A0L = r1
            android.content.DialogInterface$OnClickListener r0 = r10.A0B
            r10.A0D = r0
            java.lang.Integer r0 = r10.A0H
            r10.A0I = r0
            r0 = 0
            r10.A0J = r0
            r10.A0B = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A0H = r0
        L_0x0096:
            r0 = 1
            X.0qQ.A0B(r9, r0)
            java.lang.String r14 = r10.A05
            X.0qQ.A0A(r14)
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.CharSequence r0 = r10.A0G
            r16 = r0
            java.lang.String r15 = r10.A0L
            android.content.DialogInterface$OnClickListener r13 = r10.A0D
            java.lang.Integer r12 = r10.A0I
            X.0qQ.A0B(r15, r1)
            java.lang.String r11 = r10.A0J
            android.content.DialogInterface$OnClickListener r8 = r10.A0B
            java.lang.String r7 = r10.A0K
            android.content.DialogInterface$OnClickListener r6 = r10.A0C
            android.content.DialogInterface$OnCancelListener r5 = r10.A0A
            android.content.DialogInterface$OnDismissListener r4 = r10.A0E
            boolean r3 = r10.A0M
            java.lang.CharSequence[] r2 = r10.A0N
            android.content.DialogInterface$OnClickListener r1 = r10.A00
            android.content.DialogInterface$OnShowListener r10 = r10.A0F
            X.Dfy r0 = new X.Dfy
            r17 = r4
            r18 = r10
            r19 = r16
            r20 = r12
            r21 = r14
            r22 = r15
            r23 = r11
            r24 = r7
            r25 = r2
            r26 = r3
            r16 = r1
            r15 = r6
            r14 = r8
            r12 = r5
            r11 = r9
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.app.Dialog r3 = r0.A00
            return r3
        L_0x00e7:
            java.lang.String r3 = r10.A05
            if (r3 == 0) goto L_0x0102
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0102
            com.instagram.igds.components.headline.IgdsHeadline r2 = r10.A0Z
            X.8ah r0 = new X.8ah
            r0.<init>(r10)
            r2.setHeadline(r3, r0)
            r0 = 0
            r2.setVisibility(r0)
            r0 = 1
            r10.A09 = r0
        L_0x0102:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.view.View r6 = r10.A0U
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x0112
            r11.add(r6)
        L_0x0112:
            android.view.View r4 = r10.A0S
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x011d
            r11.add(r4)
        L_0x011d:
            android.view.View r5 = r10.A0T
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0128
            r11.add(r5)
        L_0x0128:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0190
            com.instagram.igds.components.headline.IgdsHeadline r0 = r10.A0Z
            int r0 = r0.getVisibility()
            r8 = 1
            int r2 = r11.size()
            if (r0 != 0) goto L_0x0172
            r0 = 2131231091(0x7f080173, float:1.8078253E38)
            if (r2 != r8) goto L_0x0143
            r0 = 2131231093(0x7f080175, float:1.8078257E38)
        L_0x0143:
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r0)
            r0 = 0
            java.lang.Object r0 = r11.get(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setBackground(r2)
            int r0 = r11.size()
            if (r0 <= r8) goto L_0x0190
            int r7 = r11.size()
            int r7 = r7 - r8
            r3 = 1
        L_0x015d:
            if (r3 >= r7) goto L_0x017b
            java.lang.Object r2 = r11.get(r3)
            android.view.View r2 = (android.view.View) r2
            r0 = 2131231091(0x7f080173, float:1.8078253E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r2.setBackground(r0)
            int r3 = r3 + 1
            goto L_0x015d
        L_0x0172:
            r0 = 2131231097(0x7f080179, float:1.8078265E38)
            if (r2 != r8) goto L_0x0143
            r0 = 2131231095(0x7f080177, float:1.8078261E38)
            goto L_0x0143
        L_0x017b:
            int r0 = r11.size()
            int r0 = r0 - r8
            java.lang.Object r2 = r11.get(r0)
            android.view.View r2 = (android.view.View) r2
            r0 = 2131231093(0x7f080175, float:1.8078257E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r2.setBackground(r0)
        L_0x0190:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x01f4
            android.view.View r2 = r10.A02
            r0 = 2131441820(0x7f0b389c, float:1.8505662E38)
            android.view.View r3 = r2.requireViewById(r0)
            X.0qQ.A07(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 2131237771(0x7f081b8b, float:1.8091802E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r3.setDividerDrawable(r0)
            com.instagram.igds.components.headline.IgdsHeadline r0 = r10.A0Z
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x01bd
            android.view.ViewStub r0 = r10.A0W
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01c0
        L_0x01bd:
            r3.setShowDividers(r2)
        L_0x01c0:
            int r0 = r6.getVisibility()
            if (r0 == 0) goto L_0x01d2
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x01d2
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x01db
        L_0x01d2:
            int r0 = r3.getShowDividers()
            r0 = r0 | 2
            r3.setShowDividers(r0)
        L_0x01db:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x01f4
            android.widget.ListAdapter r0 = r1.getAdapter()
            if (r0 == 0) goto L_0x01f4
            android.widget.ListAdapter r1 = r1.getAdapter()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.menu.SimplePreferenceAdapter"
            X.0qQ.A0C(r1, r0)
            X.NKx r1 = (X.C68504NKx) r1
            r1.areRowDividersEnabled = r2
        L_0x01f4:
            com.instagram.igds.components.headline.IgdsHeadline r0 = r10.A0Z
            r0.A0D()
            android.app.Dialog r3 = r10.A0P
            java.lang.String r0 = "."
            r3.setTitle(r0)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r1 = "DialogBuilder"
            java.lang.String r0 = "Creating Dialog"
            X.0KC.A0H(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358248ab.A02():android.app.Dialog");
    }

    public final void A08(int i) {
        A0q(this.A0Q.getString(i));
    }

    public final void A09(int i) {
        this.A05 = this.A0Q.getString(i);
    }

    public final void A0B(DialogInterface.OnCancelListener onCancelListener) {
        this.A0A = onCancelListener;
        this.A0P.setOnCancelListener(onCancelListener);
    }

    public final void A0D(DialogInterface.OnClickListener onClickListener) {
        A0P(onClickListener, C358278ae.DEFAULT, 2131954722);
    }

    public final void A0F(DialogInterface.OnClickListener onClickListener) {
        A0Q(onClickListener, C358278ae.RED_BOLD, 2131957531);
    }

    public final void A0G(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0a(onClickListener, string);
    }

    public final void A0H(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0b(onClickListener, string);
    }

    public final void A0I(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0c(onClickListener, string);
    }

    public final void A0J(DialogInterface.OnClickListener onClickListener, int i) {
        A0Q(onClickListener, C358278ae.BLUE_BOLD, i);
    }

    public final void A0K(DialogInterface.OnClickListener onClickListener, int i) {
        A0Q(onClickListener, C358278ae.RED_BOLD, i);
    }

    public final void A0L(DialogInterface.OnClickListener onClickListener, int i) {
        A0R(onClickListener, C358278ae.RED_BOLD, i);
    }

    public final void A0M(DialogInterface.OnClickListener onClickListener, int i, boolean z) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0W(onClickListener, C358278ae.DEFAULT, string, z);
    }

    public final void A0O(DialogInterface.OnClickListener onClickListener, C358278ae r4, int i) {
        String string = this.A0Q.getString(i);
        0qQ.A07(string);
        A0W(onClickListener, r4, string, true);
    }

    public final void A0d(DialogInterface.OnClickListener onClickListener, String str) {
        A0Y(onClickListener, C358278ae.DEFAULT, str, true);
    }

    public final void A0f(DialogInterface.OnDismissListener onDismissListener) {
        this.A0E = onDismissListener;
        this.A0P.setOnDismissListener(onDismissListener);
    }

    public final void A0g(DialogInterface.OnShowListener onShowListener) {
        this.A0F = onShowListener;
        this.A0P.setOnShowListener(new C358258ac(onShowListener, this));
    }

    public final void A0q(CharSequence charSequence) {
        if (charSequence != null) {
            this.A0G = charSequence;
            this.A0Z.setBody(charSequence);
        }
        this.A0Z.setVisibility(0);
        this.A09 = true;
    }

    public final void A0r(boolean z) {
        this.A0P.setCancelable(z);
    }

    public final void A0C(DialogInterface.OnClickListener onClickListener) {
        A0H(onClickListener, 2131954722);
    }

    public final void A0E(DialogInterface.OnClickListener onClickListener) {
        A0I(onClickListener, 2131968772);
    }

    @Deprecated(message = "")
    public final void A0Q(DialogInterface.OnClickListener onClickListener, C358278ae r2, int i) {
        A0R(onClickListener, r2, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C358248ab(Activity activity) {
        this(activity, R.style.IigDialog);
        if (activity != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "See constructor that passes in an activity instead.")
    public C358248ab(Context context) {
        this(context, C70542Rd.A03 ? R.style.IigDialog : R.style.IigDialogDeprecated);
        if (context != null) {
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
