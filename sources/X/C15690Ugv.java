package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import com.instagram.user.model.Product;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Ugv  reason: case insensitive filesystem */
public final class C15690Ugv extends C252233om implements View.OnTouchListener {
    public static final List A0U = AnonymousClass7TE.A1I(C16499Uvv.SAVE);
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public 2cv A06;
    public ProductTile A07;
    public V44 A08;
    public Integer A09 = AnonymousClass05K.A00;
    public Runnable A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int[] A0F = new int[2];
    public final int A0G;
    public final int A0H;
    public final Activity A0I;
    public final Context A0J;
    public final AnonymousClass0iw A0K;
    public final UserSession A0L;
    public final C232942uh A0M;
    public final C19365WWg A0N = new C19365WWg();
    public final String A0O;
    public final AnonymousClass0eM A0P = C20693WxP.A00(this, 21);
    public final AnonymousClass0eM A0Q = C20693WxP.A00(this, 22);
    public final AnonymousClass0eM A0R = C20693WxP.A00(this, 23);
    public final AnonymousClass0eM A0S = C20693WxP.A00(this, 24);
    public final Resources A0T;

    public C15690Ugv(Activity activity, Context context, AnonymousClass0iw r6, UserSession userSession, String str) {
        DbW.A1N(userSession, 3, str);
        this.A0I = activity;
        this.A0J = context;
        this.A0L = userSession;
        this.A0K = r6;
        this.A0O = str;
        Resources resources = context.getResources();
        this.A0T = resources;
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0H = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        this.A0E = true;
        this.A0M = new C15967Ulj(this);
    }

    public static final boolean A03(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= ((float) i) || f >= ((float) (i + view.getWidth())) || f2 <= ((float) i2) || f2 >= ((float) (i2 + view.getHeight()))) {
            return false;
        }
        return true;
    }

    public final void onDestroyView() {
        this.A0B = null;
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            viewGroup.removeView(this.A04);
        }
        this.A05 = null;
        this.A06 = null;
        this.A04 = null;
        this.A08 = null;
        this.A07 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A0E = true;
        this.A0A = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A06 = C324286z2.A00(view);
        ViewGroup A032 = C232972uk.A03(this.A0I);
        this.A05 = A032;
        if (A032 != null) {
            A032.addView(this.A04, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final void A00(C15690Ugv ugv) {
        ((C232952ui) ugv.A0S.getValue()).A01();
        ((2cs) ugv.A0Q.getValue()).A04();
        ugv.A09 = AnonymousClass05K.A0C;
    }

    public static final void A01(C15690Ugv ugv) {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView;
        ProductTile productTile;
        Product product;
        V44 v44 = ugv.A08;
        if (v44 != null && (igBouncyUfiButtonImageView = v44.A05) != null && (productTile = ugv.A07) != null && (product = productTile.A07) != null) {
            boolean A032 = C323496xa.A00(ugv.A0L).A03(product);
            igBouncyUfiButtonImageView.setSelected(A032);
            Context context = igBouncyUfiButtonImageView.getContext();
            int i = 2131972587;
            if (A032) {
                i = 2131972049;
            }
            DbU.A12(context, igBouncyUfiButtonImageView, i);
        }
    }

    public static final void A02(C15690Ugv ugv, double d) {
        RoundedCornerConstraintLayout roundedCornerConstraintLayout;
        Integer num = ugv.A09;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
            V44 v44 = ugv.A08;
            if (v44 != null) {
                roundedCornerConstraintLayout = v44.A07;
            } else {
                roundedCornerConstraintLayout = null;
            }
            0qQ.A0C(roundedCornerConstraintLayout, AnonymousClass000.A00(0));
            float f = (float) d;
            float f2 = (0.19999999f * f) + 0.8f;
            roundedCornerConstraintLayout.setScaleX(f2);
            roundedCornerConstraintLayout.setScaleY(f2);
            View view = ugv.A04;
            if (view != null) {
                view.setAlpha(f);
                view.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.V44] */
    public final void D6z(View view) {
        Activity activity = this.A0I;
        0qQ.A0B(activity, 0);
        boolean z = 2Su.A03;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        0qQ.A07(layoutInflater);
        View A012 = 2Su.A01(layoutInflater, (ViewGroup.LayoutParams) null, (ViewGroup) null, R.layout.product_card_peek_preview, false, false);
        0qQ.A0B(A012, 1);
        ? obj = new Object();
        obj.A00 = (FrameLayout) AnonymousClass7TF.A0F(A012, R.id.peek_container);
        obj.A07 = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(A012, R.id.product_image_container);
        obj.A02 = DbX.A0J(A012, R.id.button_share);
        obj.A03 = DbX.A0J(A012, R.id.button_shop);
        obj.A05 = (IgBouncyUfiButtonImageView) AnonymousClass7TF.A0F(A012, R.id.button_save);
        obj.A01 = DbX.A0J(A012, R.id.button_options);
        obj.A04 = AnonymousClass7TG.A0R(A012, R.id.hold_indicator);
        C2355830k r2 = new C2355830k();
        r2.A04(new WeakReference(obj.A05));
        obj.A06 = r2;
        A012.setTag(obj);
        A012.setVisibility(8);
        Object tag = A012.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.widget.productcard.peek.ProductCardPeekViewBinder.Holder");
        this.A08 = (V44) tag;
        this.A04 = A012;
    }

    public final void onPause() {
        this.A09 = AnonymousClass05K.A00;
        2cv r1 = this.A06;
        if (r1 != null) {
            r1.CNi((View.OnTouchListener) null);
        }
        AnonymousClass7TH.A0R(this.A04);
        ((C232952ui) this.A0S.getValue()).A00();
    }

    public static final boolean A04(View view, C15690Ugv ugv, String str, float f, float f2) {
        TextView textView;
        if (view.getVisibility() != 0 || !A03(view, f, f2)) {
            return false;
        }
        V44 v44 = ugv.A08;
        if (!(v44 == null || (textView = v44.A04) == null)) {
            textView.setAlpha(0.0f);
            textView.bringToFront();
            textView.setText(str);
        }
        ugv.A02 = view;
        view.getLocationInWindow(ugv.A0F);
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        2cv r1;
        boolean A1Z = AnonymousClass7TG.A1Z(view, motionEvent);
        if ((motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == A1Z) && (r1 = this.A06) != null) {
            r1.CNi((View.OnTouchListener) null);
        }
        ((C232952ui) this.A0S.getValue()).onTouch(view, motionEvent);
        if (this.A09 == AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }
}
