package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LFb  reason: case insensitive filesystem */
public final class C63955LFb {
    public int A00;
    public ConstrainedTextureView A01;
    public C64942Lkh A02;
    public C378369Pn A03;
    public Integer A04;
    public final Context A05;
    public final ViewGroup A06;
    public final UserSession A07;
    public final C3499682q A08;
    public final View A09;
    public final C378379Po A0A;
    public final FilterGroupModel A0B;

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.ADk] */
    public C63955LFb(Context context, View view, UserSession userSession, C3499682q r24, C378379Po r25, FilterGroupModel filterGroupModel) {
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        Context context2 = context;
        this.A05 = context2;
        this.A07 = userSession2;
        this.A0A = r25;
        FilterGroupModel filterGroupModel2 = filterGroupModel;
        this.A0B = filterGroupModel2;
        this.A08 = r24;
        View view2 = view;
        this.A09 = view2;
        ViewGroup A0I = DbX.A0I(view2, R.id.creation_image_container);
        this.A06 = A0I;
        ? obj = new Object();
        obj.A01(A0I.findViewById(R.id.play_button));
        obj.A01 = A0I.findViewById(R.id.seek_frame_indicator);
        this.A03 = new C378369Pn(context2, userSession2, obj, "feed", false, A1Y);
        A01((B28) null);
        if (filterGroupModel == null || !182.A06(0Tu.A05, userSession2, 36328564261404079L)) {
            AnonymousClass0fU.A00(this.A03, A00());
        } else {
            GridLinesView gridLinesView = (GridLinesView) AnonymousClass7TF.A0F(this.A06, R.id.straighten_grid_overlay_3);
            Context context3 = this.A05;
            gridLinesView.setInnerStrokeColor(context3.getColor(R.color.grey_5));
            UserSession userSession3 = this.A07;
            C3499682q r8 = this.A08;
            UserSession userSession4 = userSession3;
            C3499682q r16 = r8;
            C64942Lkh lkh = new C64942Lkh(context3.getResources(), userSession4, r16, this, 0.0f, JWN.A05(context3));
            this.A02 = lkh;
            C65230Lpa lpa = new C65230Lpa();
            String str = JWE.A03(r8).A0H;
            0qQ.A07(str);
            lkh.A0I = A1Y;
            lkh.A01 = A0I;
            lkh.A0A = filterGroupModel2;
            lkh.A08 = C395019z4.A00(filterGroupModel2, "AdjustController_prepareCropTransform()");
            lkh.A09 = lpa;
            lkh.A07 = null;
            lkh.A0D = str;
            C64942Lkh lkh2 = this.A02;
            if (lkh2 != null) {
                lkh2.A0B = 28K.A00(userSession3).A03(r8.E2M());
            }
            A0I.setOnTouchListener(new C64282LYi(5, this, gridLinesView));
        }
        ((C267834cI) 0mE.A01(context2, C267834cI.class)).EBv(new C65906M3v(this));
    }

    public final ConstrainedTextureView A00() {
        ConstrainedTextureView constrainedTextureView = this.A01;
        if (constrainedTextureView != null) {
            return constrainedTextureView;
        }
        0qQ.A0F("previewTextureView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(B28 b28) {
        if (this.A01 != null) {
            this.A06.removeView(A00());
        }
        FrameLayout.LayoutParams A0D = JTS.A0D();
        A0D.gravity = 17;
        C378379Po r3 = this.A0A;
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(this.A05);
        r3.A03 = constrainedTextureView;
        this.A01 = constrainedTextureView;
        this.A06.addView(A00(), 0, A0D);
        A00().setAspectRatio(JWE.A03(this.A08).A00);
        if (b28 == null) {
            b28 = this.A03;
        }
        r3.A06 = b28;
        A00().setSurfaceTextureListener(r3);
        if (this.A0B != null) {
            if (182.A06(0Tu.A05, this.A07, 36328564261404079L)) {
                return;
            }
        }
        AnonymousClass0fU.A00(this.A03, A00());
    }
}
