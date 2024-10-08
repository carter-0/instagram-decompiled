package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6mX  reason: invalid class name and case insensitive filesystem */
public final class C316986mX {
    public 1wn A00;
    public 1wn A01;
    public 1wn A02;
    public 1wn A03;
    public boolean A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final UserSession A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 34));
    public final View A0B;

    public C316986mX(View view, ViewGroup viewGroup, ViewGroup viewGroup2, ViewStub viewStub, ViewStub viewStub2, UserSession userSession) {
        0qQ.A0B(view, 1);
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(viewGroup2, 3);
        0qQ.A0B(viewStub, 4);
        0qQ.A0B(viewStub2, 5);
        this.A0B = view;
        this.A06 = viewGroup;
        this.A05 = viewGroup2;
        this.A07 = userSession;
        this.A09 = 2b1.A01(viewStub, false, false);
        this.A08 = 2b1.A01(viewStub2, false, false);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(3);
    }

    public final void A02() {
        this.A04 = false;
        this.A0B.setVisibility(0);
        this.A09.setVisibility(8);
        this.A08.setVisibility(8);
        A00();
    }

    public final void A03(C255773uh r6, C317586nV r7, String str) {
        this.A04 = false;
        A00();
        DDf A002 = C65211bM.A00.A00();
        A002.A0t = str;
        A002.A0f = 1;
        C247733gp r4 = new C247733gp(A002.A02());
        r4.A06 = C252883pr.Success;
        r4.A02(r6.A0b);
        this.A01 = new C64693LgO(r4, r6, r7, this);
        this.A00 = new C64694LgP(r4, r6, r7, this);
        this.A03 = new C64691LgM(r6, r7, this);
        this.A02 = new AYE(r6, r7, this);
        1Ng A003 = AnonymousClass1Nd.A00(this.A07);
        Class<C240153Ju> cls = C240153Ju.class;
        1wn r0 = this.A01;
        if (r0 != null) {
            A003.A01(r0, cls);
            Class<C240163Jv> cls2 = C240163Jv.class;
            1wn r02 = this.A00;
            if (r02 != null) {
                A003.A01(r02, cls2);
                Class<C240303Kj> cls3 = C240303Kj.class;
                1wn r03 = this.A03;
                if (r03 != null) {
                    A003.A01(r03, cls3);
                    Class<C240323Kl> cls4 = C240323Kl.class;
                    1wn r04 = this.A02;
                    if (r04 != null) {
                        A003.A01(r04, cls4);
                        A01(r4, r6, this);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00() {
        1wn r2 = this.A01;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r2, C240153Ju.class);
        }
        1wn r22 = this.A00;
        if (r22 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r22, C240163Jv.class);
        }
        1wn r23 = this.A03;
        if (r23 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r23, C240303Kj.class);
        }
        1wn r24 = this.A02;
        if (r24 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r24, C240323Kl.class);
        }
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static final void A01(C247733gp r31, C255773uh r32, C316986mX r33) {
        String str;
        C316986mX r3 = r33;
        AnonymousClass0eM r1 = r3.A0A;
        Object value = r1.getValue();
        0qQ.A07(value);
        Context context = ((View) value).getContext();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        0qQ.A0A(context);
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        int color2 = context.getColor(R.color.debug_overlay_white_70_transparent);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        TextPaint textPaint = new TextPaint(1);
        textPaint.linkColor = color2;
        textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(color);
        0rN r13 = new 0rN(alignment, textPaint, (String) null, 0.0f, 1.0f, context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2), false);
        0MB A052 = 0MB.A05(r3.A07);
        0qQ.A07(A052);
        boolean z = r3.A04;
        1sy r132 = 1sy.A0Y;
        Integer valueOf = Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background));
        Integer valueOf2 = Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background));
        List<C255783ui> Bkd = r32.Bkd(AnonymousClass3WT.MENTION);
        ArrayList arrayList = null;
        if (Bkd != null) {
            arrayList = new ArrayList(0Yv.A1E(Bkd, 10));
            for (C255783ui r5 : Bkd) {
                User user = r5.A1B;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
        }
        C252933pw r9 = new C252933pw(r13, r31, (AnonymousClass3W1) null, r132, (AnonymousClass34A) null, (Integer) null, valueOf2, valueOf, 1, arrayList, z, false, false, false, false, z, false, true, true, true, false, false, false, false);
        Object value2 = r1.getValue();
        0qQ.A07(value2);
        ((TextView) value2).setText(C252923pv.A00(context, A052, r9, new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), true));
        Object value3 = r1.getValue();
        0qQ.A07(value3);
        ((TextView) value3).setMovementMethod(LinkMovementMethod.getInstance());
        Object value4 = r1.getValue();
        0qQ.A07(value4);
        ((TextView) value4).setHighlightColor(context.getColor(R.color.fds_transparent));
        Object value5 = r1.getValue();
        0qQ.A07(value5);
        ((TextView) value5).setSingleLine(!r3.A04);
        r3.A0B.setVisibility(8);
        r3.A09.setVisibility(0);
        r3.A08.setVisibility(0);
    }
}
