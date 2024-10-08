package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.87d  reason: invalid class name and case insensitive filesystem */
public final class C3509887d {
    public AnonymousClass87G A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final AnonymousClass07i A05;
    public final UserSession A06;
    public final C3509787c A07;

    public static AnonymousClass87G A00(C3509887d r12) {
        AnonymousClass87I r4 = AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT;
        Context context = r12.A04;
        String string = context.getString(2131971114);
        ShapeDrawable A032 = I7E.A03(2Yu.A0F(context, R.attr.igds_color_elevated_background_dark));
        int A0H = 2Yu.A0H(context, R.attr.igds_color_primary_button_icon);
        Paint paint = AnonymousClass3JT.A00;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A032, AnonymousClass3JT.A05(context, R.drawable.instagram_add_users_pano_outline_24, context.getColor(A0H))});
        int A012 = AnonymousClass1GB.A01(0nA.A04(context, 22));
        layerDrawable.setLayerInset(1, A012, A012, A012, A012);
        return new AnonymousClass87G(new AnonymousClass8YE(layerDrawable, r4, string));
    }

    public static AnonymousClass87G A01(C3509887d r4) {
        AnonymousClass87I r3 = AnonymousClass87I.QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE;
        Context context = r4.A04;
        AnonymousClass8YE r1 = new AnonymousClass8YE(C346697vb.A00(context), r3, context.getString(2131971116));
        r1.A01 = C63112Krf.A00(r4.A06);
        return new AnonymousClass87G(r1);
    }

    private void A02(boolean z) {
        Integer num;
        UserSession userSession = this.A06;
        if (!AnonymousClass39U.A03(userSession)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A01(this));
            this.A01 = arrayList;
            this.A07.D8d(arrayList);
            return;
        }
        Context context = this.A04;
        AnonymousClass07i r3 = this.A05;
        if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        0qQ.A0B(userSession, 0);
        1Fc r8 = new 1Fc();
        r8.A05("timezone_offset", String.valueOf(1G0.A00()));
        1NY r6 = new 1NY(userSession, -2);
        List singletonList = Collections.singletonList("quick_snap");
        0qQ.A07(singletonList);
        r6.A05();
        r6.A02();
        String A002 = C273654mx.A00(1464);
        r6.A0A(A002);
        r6.A0Q(CDI.class, C45608CzK.class);
        r6.A9m("list_types", 0mh.A00(singletonList));
        r6.A0A = r8.A01(A002);
        r6.A07 = num;
        if (num == AnonymousClass05K.A0C) {
            r6.A01 = 604800000;
        }
        1OC A0M = r6.A0M();
        A0M.A00 = new C385399is(this);
        1ES.A00(context, r3, A0M);
    }

    public final AnonymousClass87G A03() {
        return new AnonymousClass87G(new AnonymousClass8YE(this.A04.getDrawable(R.drawable.canvas_type_mode_icon), AnonymousClass87I.TYPE, ""));
    }

    public final List A04(boolean z) {
        if (z != this.A03) {
            this.A01 = null;
            this.A03 = z;
        }
        if (this.A01 == null) {
            ArrayList arrayList = new ArrayList();
            this.A01 = arrayList;
            if (z) {
                boolean A032 = AnonymousClass39U.A03(this.A06);
                List list = this.A01;
                if (A032) {
                    ArrayList arrayList2 = new ArrayList(2);
                    arrayList2.add(A00(this));
                    arrayList2.add(A01(this));
                    list.addAll(arrayList2);
                    AnonymousClass87G r1 = this.A00;
                    if (r1 != null) {
                        this.A01.add(r1);
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(A01(this));
                    list.addAll(arrayList3);
                }
            } else {
                arrayList.add(A03());
            }
            if (this.A03) {
                A02(false);
            } else {
                Context context = this.A04;
                AnonymousClass07i r2 = this.A05;
                1OC A002 = C394349xw.A00(this.A06, AnonymousClass05K.A0C);
                A002.A00 = new C385259ie(this);
                1ES.A00(context, r2, A002);
            }
        }
        this.A02 = false;
        if (this.A03) {
            A02(true);
        } else {
            Context context2 = this.A04;
            AnonymousClass07i r22 = this.A05;
            1OC A003 = C394349xw.A00(this.A06, AnonymousClass05K.A01);
            A003.A00 = new C385389ir(this);
            1ES.A00(context2, r22, A003);
        }
        return this.A01;
    }

    public C3509887d(Context context, AnonymousClass07i r2, AnonymousClass87G r3, UserSession userSession, C3509787c r5, boolean z) {
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = r5;
        this.A05 = r2;
        this.A00 = r3;
        this.A03 = z;
    }
}
