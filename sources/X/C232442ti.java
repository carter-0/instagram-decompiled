package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.2ti  reason: invalid class name and case insensitive filesystem */
public final class C232442ti extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C230582pr A03;
    public final C249763kK A04;
    public final C230662pz A05;

    public C232442ti(Context context, AnonymousClass0iw r3, UserSession userSession, C230582pr r5, C249763kK r6, C230662pz r7) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(context, 4);
        0qQ.A0B(r6, 5);
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = context;
        this.A04 = r6;
        this.A02 = userSession;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C275544qW r6;
        Drawable A022;
        IgImageView igImageView;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(71695949);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj3, 2);
        C57281IVq iVq = (C57281IVq) obj3;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.afi.ui.AfiRepetitionViewBinder.Holder");
        C55851HoY hoY = (C55851HoY) tag;
        C54033GyI gyI = new C54033GyI(this.A01, this.A02, iVq, this.A04.getSessionId());
        C230582pr r11 = this.A03;
        C230602pt r8 = r11.A02;
        r8.A00 = gyI;
        C230612pu r62 = r11.A05;
        r62.A00 = gyI;
        View view3 = hoY.A00;
        0qQ.A0B(iVq, 1);
        Object obj4 = new Object();
        String A002 = C230582pr.A00(iVq);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r02 = new C2354830a(iVq, obj4, A002);
        r02.A00(r8);
        r02.A00(r62);
        r11.A00.A05(view3, r02.A01());
        Context context = this.A00;
        C230662pz r3 = this.A05;
        0qQ.A0B(context, 0);
        0qQ.A0B(r3, 3);
        C269894fr r1 = iVq.A01;
        List Bip = r1.Bip();
        if (Bip != null) {
            r6 = (C275544qW) 00k.A0J(Bip);
        } else {
            r6 = null;
        }
        String Ay0 = r1.Ay0();
        C275524qU CBM = r1.CBM();
        if (r6 != null && Ay0 != null && CBM != null && r6.Abw().size() == 2 && r6.getText().length() > 0 && ((C275524qU) r6.Abw().get(0)).getText().length() > 0 && ((C275524qU) r6.Abw().get(1)).getText().length() > 0 && Ay0.length() > 0) {
            IgImageView igImageView2 = hoY.A03;
            ConstraintLayout constraintLayout = hoY.A01;
            if (!C61670oa.A07()) {
                igImageView2.setImageTintList(ColorStateList.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_elevated_highlight_background))));
                Drawable drawable = context.getDrawable(R.drawable.rounded_afi_background);
                RectF rectF = 0nA.A01;
                0qQ.A0B(constraintLayout, 0);
                constraintLayout.setBackground(drawable);
            }
            hoY.A02.setText(r6.getText());
            String id = iVq.getId();
            if (!(I3y.A00 == REPETITION_UI_TYPE.LIGHTWEIGHT || (A022 = C14091Tpi.A02(context, Ay0)) == null || (igImageView = hoY.A04) == null)) {
                igImageView.setImageDrawable(A022);
                AnonymousClass0fU.A00(new IBT(gyI, r3, id), igImageView);
            }
            C230662pz r17 = r3;
            I3y.A00(context, gyI, (C275524qU) r6.Abw().get(0), CBM, hoY.A05, r17, iVq.getId(), "see_less");
            I3y.A00(context, gyI, (C275524qU) r6.Abw().get(1), CBM, hoY.A06, r17, iVq.getId(), "see_more");
        }
        AnonymousClass0fD.A0A(221549087, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        C57281IVq iVq = (C57281IVq) obj;
        0qQ.A0B(iVq, 1);
        REPETITION_UI_TYPE Blk = iVq.A01.Blk();
        if (Blk == null || Blk.ordinal() != 1) {
            if (r3 != null) {
                r3.A7U(0);
            }
        } else if (r3 != null) {
            r3.A7U(1);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        REPETITION_UI_TYPE repetition_ui_type;
        int A032 = AnonymousClass0fD.A03(1751299823);
        0qQ.A0B(viewGroup, 1);
        if (i == 1) {
            repetition_ui_type = REPETITION_UI_TYPE.LIGHTWEIGHT;
        } else {
            repetition_ui_type = REPETITION_UI_TYPE.MEDIUM;
        }
        Context context = viewGroup.getContext();
        I3y.A00 = repetition_ui_type;
        REPETITION_UI_TYPE repetition_ui_type2 = REPETITION_UI_TYPE.LIGHTWEIGHT;
        int i2 = R.layout.afi_repetition_medium_view;
        if (repetition_ui_type == repetition_ui_type2) {
            i2 = R.layout.afi_repetition_lightweight_view;
        }
        View inflate = LayoutInflater.from(context).inflate(i2, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C55851HoY(inflate));
        AnonymousClass0fD.A0A(-1533685544, A032);
        return inflate;
    }
}
