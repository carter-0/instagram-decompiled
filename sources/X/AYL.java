package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

public final class AYL implements AnonymousClass4DR, AnonymousClass8LV {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public C18737VzI A07;
    public AIV A08;
    public C369538uv A09;
    public C369548uw A0A;
    public C369528uu A0B;
    public C369558ux A0C;
    public KB3 A0D;
    public C62565Khv A0E;
    public C358868bb A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final View.OnClickListener A0J = new AOX((Object) this, 11);
    public final View A0K;
    public final View A0L;
    public final ViewStub A0M;
    public final ViewStub A0N;
    public final TextView A0O;
    public final AnonymousClass4DH A0P;
    public final UserSession A0Q;
    public final TargetViewSizeProvider A0R;
    public final AnonymousClass8BQ A0S;
    public final AnonymousClass88K A0T;
    public final A8W A0U;
    public final AE2 A0V;
    public final AD0 A0W;
    public final AnonymousClass80U A0X;
    public final AnonymousClass8ME A0Y;
    public final C314676if A0Z;
    public final FittingTextView A0a;
    public final EyedropperColorPickerTool A0b;
    public final View A0c;
    public final ViewStub A0d;
    public final AnonymousClass84H A0e;

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public static String A00(AYL ayl) {
        AIV aiv = ayl.A08;
        if (aiv != null) {
            Product product = aiv.A00;
            if (product != null) {
                return product.A0J;
            }
            List list = aiv.A04;
            if (list != null) {
                return ayl.A0L.getContext().getString(2131973779, AnonymousClass7TF.A1b(list.size()));
            }
            ProductCollection productCollection = aiv.A01;
            if (productCollection != null) {
                return productCollection.getTitle();
            }
            if (aiv.A03 != null) {
                return ayl.A0L.getContext().getString(2131976671);
            }
        }
        throw AnonymousClass7TE.A1B("Unsupported Shopping sticker type");
    }

    public static void A01(Drawable drawable, AYL ayl) {
        AES.A02(drawable, ayl.A0F);
        ImageView imageView = ayl.A05;
        imageView.getClass();
        imageView.setImageDrawable((Drawable) null);
    }

    public static void A02(AYL ayl) {
        ImageView imageView;
        Drawable drawable;
        AIV aiv = ayl.A08;
        aiv.getClass();
        if (aiv.A00 != null) {
            AIV aiv2 = ayl.A08;
            aiv2.getClass();
            Product product = aiv2.A00;
            product.getClass();
            C369528uu r3 = ayl.A0B;
            if (r3 == null) {
                r3 = (C369528uu) AnonymousClass7TE.A12(ayl.A0V.A01(ayl.A0L.getContext()));
                ayl.A0B = r3;
            }
            r3.A05(product, ayl.A0H, ayl.A00, A04(ayl));
            A01(ayl.A0B, ayl);
            imageView = ayl.A05;
            drawable = ayl.A0B;
        } else {
            AIV aiv3 = ayl.A08;
            aiv3.getClass();
            if (aiv3.A04 != null) {
                AIV aiv4 = ayl.A08;
                aiv4.getClass();
                List list = aiv4.A04;
                list.getClass();
                C369538uv r2 = ayl.A09;
                if (r2 == null) {
                    r2 = (C369538uv) AnonymousClass7TE.A12(ayl.A0V.A04(ayl.A0L.getContext(), list));
                    ayl.A09 = r2;
                }
                r2.A01(ayl.A0H, ayl.A00);
                A01(ayl.A09, ayl);
                imageView = ayl.A05;
                drawable = ayl.A09;
            } else {
                AIV aiv5 = ayl.A08;
                aiv5.getClass();
                if (aiv5.A01 != null) {
                    AIV aiv6 = ayl.A08;
                    aiv6.getClass();
                    ProductCollection productCollection = aiv6.A01;
                    productCollection.getClass();
                    ayl.A08.A00().getClass();
                    C369548uw r1 = ayl.A0A;
                    if (r1 == null) {
                        r1 = (C369548uw) AnonymousClass7TE.A12(ayl.A0V.A02(ayl.A0L.getContext(), productCollection));
                        ayl.A0A = r1;
                    }
                    r1.A00(ayl.A00);
                    A01(ayl.A0A, ayl);
                    imageView = ayl.A05;
                    drawable = ayl.A0A;
                } else {
                    AIV aiv7 = ayl.A08;
                    aiv7.getClass();
                    if (aiv7.A03 != null) {
                        AIV aiv8 = ayl.A08;
                        aiv8.getClass();
                        User user = aiv8.A03;
                        user.getClass();
                        C369558ux r22 = ayl.A0C;
                        if (r22 == null) {
                            r22 = (C369558ux) AnonymousClass7TE.A12(ayl.A0V.A03(ayl.A0L.getContext(), user));
                            ayl.A0C = r22;
                        }
                        r22.A00(ayl.A0H, ayl.A00);
                        A01(ayl.A0C, ayl);
                        imageView = ayl.A05;
                        drawable = ayl.A0C;
                    } else {
                        throw AnonymousClass7TE.A1B("Unsupported Shopping sticker type");
                    }
                }
            }
        }
        imageView.setImageDrawable(drawable);
    }

    public static boolean A03(AYL ayl) {
        Product product;
        String str;
        AIV aiv = ayl.A08;
        if (aiv == null || (product = aiv.A00) == null || (str = product.A0J) == null || C18268Voi.A01(str).size() <= 1) {
            return false;
        }
        return true;
    }

    public static boolean A04(AYL ayl) {
        AIV aiv;
        Product product;
        String str;
        String str2 = ayl.A0H;
        if (str2 == null || (aiv = ayl.A08) == null || (product = aiv.A00) == null || (str = product.A0J) == null || !(!str.equalsIgnoreCase(str2))) {
            return false;
        }
        return true;
    }

    public final void A05() {
        this.A0S.A02(false);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A0b;
        FittingTextView fittingTextView = this.A0a;
        TextView textView = this.A06;
        textView.getClass();
        C315596kB.A08(new View[]{eyedropperColorPickerTool, fittingTextView, textView, this.A0O}, false);
        AnonymousClass7TH.A0R(this.A04);
        ((C360778f8) this.A0Z.get()).A0A(false);
        View view = this.A0K;
        if (view != null) {
            view.setBackgroundColor(0);
            view.setOnTouchListener(new AP3(this, 2));
            View view2 = this.A02;
            if (view2 != null) {
                view2.setClickable(false);
            }
        }
    }

    public final void A06() {
        this.A0S.A03(false, false);
        View view = this.A0K;
        View view2 = this.A02;
        view2.getClass();
        View[] viewArr = {view, view2, this.A0b, this.A0a, this.A0O};
        C71392co r0 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, viewArr, false);
        ((C360778f8) this.A0Z.get()).A08();
        if (A03(this)) {
            TextView textView = this.A06;
            textView.getClass();
            C294975nL.A04((C295005nO) null, new View[]{textView}, false);
        }
        if (view != null) {
            view.setBackgroundColor(this.A0L.getContext().getColor(R.color.direct_light_mode_sticker_loading_end_color));
            view.setOnTouchListener(new AP3(this, 3));
            View view3 = this.A02;
            if (view3 != null) {
                view3.setClickable(true);
            }
        }
    }

    public final void DDs(int i) {
        this.A00 = i;
        A02(this);
        A06();
    }

    public final boolean onBackPressed() {
        if (!this.A0X.CQ0(AnonymousClass80V.SHOPPING_STICKER_EDIT_NAME) || this.A0I) {
            return false;
        }
        C18737VzI vzI = this.A07;
        vzI.getClass();
        int i = 0;
        while (true) {
            List list = vzI.A04;
            if (i < list.size()) {
                ((C17455VWi) list.get(i)).A00 = AnonymousClass7TE.A1a(vzI.A03.get(i));
                i++;
            } else {
                vzI.A01.removeAllViews();
                C18737VzI.A00(vzI);
                vzI.A02.A00(C18268Voi.A00(list));
                this.A0I = true;
                return false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.AD0] */
    public AYL(View view, AnonymousClass4DH r5, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8BQ r8, AnonymousClass88K r9, AnonymousClass8AL r10, C365798nh r11, AnonymousClass80U r12, AnonymousClass8ME r13, EyedropperColorPickerTool eyedropperColorPickerTool) {
        AfW afW = new AfW(this);
        this.A0e = afW;
        this.A0U = new A8W(this);
        this.A00 = -1;
        this.A0I = true;
        this.A0E = null;
        this.A0X = r12;
        ((AnonymousClass80T) r12).A01.A01(afW, AnonymousClass80V.SHOPPING_STICKER_COMPOSE);
        this.A0L = view;
        this.A0Y = r13;
        this.A0Q = userSession;
        this.A0a = (FittingTextView) view.requireViewById(R.id.done_button);
        this.A0K = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0M = (ViewStub) view.requireViewById(R.id.product_sticker_editor_stub);
        this.A0O = (TextView) view.requireViewById(R.id.product_sticker_editor_title);
        this.A0N = (ViewStub) view.requireViewById(R.id.product_sticker_tokenized_edit_stub);
        this.A0S = r8;
        r8.A01(AnonymousClass8BR.A05);
        this.A0b = eyedropperColorPickerTool;
        this.A0T = r9;
        this.A0V = new AE2(userSession, r11);
        this.A0P = r5;
        KB3 A0X2 = C249713kF.A00.A0X(userSession);
        this.A0D = A0X2;
        r5.registerLifecycleListener(A0X2);
        this.A01 = r10.A0J;
        this.A0W = new Object();
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.shopping_overlay_sticker_editor_stub);
        this.A0d = viewStub;
        View inflate = viewStub.inflate();
        this.A0c = inflate;
        this.A04 = (ImageView) inflate.findViewById(R.id.shopping_sticker_picker_button);
        this.A0R = targetViewSizeProvider;
        this.A0Z = C314666ie.A00(new C41393AtF(view, r10, this), new C314656id[0]);
    }

    public final void DDq() {
        A06();
    }

    public final void DDt() {
        A05();
    }
}
