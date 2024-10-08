package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3yp  reason: invalid class name and case insensitive filesystem */
public final class C258323yp implements AnonymousClass2xU {
    public long A00;
    public long A01;
    public View.OnClickListener A02;
    public View A03;
    public IgLinearLayout A04;
    public C246543em A05 = C246543em.A07;
    public SlideInAndOutIconView A06;
    public C62320sa A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final View A0E;

    public C258323yp(Context context, View view, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(viewStub2, 2);
        0qQ.A0B(viewStub3, 3);
        this.A0D = viewStub;
        this.A0B = viewStub2;
        this.A0C = viewStub3;
        this.A0A = context;
        this.A0E = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r0 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        if (r0 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
        r2 = "button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009c, code lost:
        if (r0 == null) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r9, int r10) {
        /*
            r8 = this;
            r1 = 0
            r3 = r9
            X.0qQ.A0B(r9, r1)
            r0 = 17
            if (r10 == r0) goto L_0x00c1
            r0 = 18
            if (r10 == r0) goto L_0x0083
            r0 = 43
            if (r10 == r0) goto L_0x00a9
            r0 = 79
            if (r10 != r0) goto L_0x00d2
            r2 = 1
            r8.A09 = r2
            boolean r1 = r9.A1o
            X.3em r0 = r8.A05
            if (r1 == 0) goto L_0x0063
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0057
            r0 = 2
            if (r1 == r0) goto L_0x0040
            r0 = 3
            if (r1 != r0) goto L_0x00d2
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r8.A06
            java.lang.String r2 = "button"
            r0 = 0
            if (r1 == 0) goto L_0x0038
            r8.A04(r1, r0)
        L_0x0034:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r8.A06
            if (r0 != 0) goto L_0x00a1
        L_0x0038:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0040:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r3 = r8.A06
            java.lang.String r2 = "button"
            if (r3 == 0) goto L_0x0038
            android.content.Context r0 = r8.A0A
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131962348(0x7f1329ec, float:1.9561419E38)
            java.lang.String r0 = r1.getString(r0)
            r8.A04(r3, r0)
            goto L_0x0034
        L_0x0057:
            android.view.View r0 = r8.A03
            if (r0 == 0) goto L_0x0080
            r8.A02(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A04
            if (r0 != 0) goto L_0x00a1
            goto L_0x009e
        L_0x0063:
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0075
            r0 = 2
            if (r1 == r0) goto L_0x0070
            r0 = 3
            if (r1 == r0) goto L_0x0070
            return
        L_0x0070:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r8.A06
            if (r0 != 0) goto L_0x00a5
            goto L_0x0097
        L_0x0075:
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A04
            if (r0 == 0) goto L_0x009e
            r8.A01(r0)
            android.view.View r0 = r8.A03
            if (r0 != 0) goto L_0x00a5
        L_0x0080:
            java.lang.String r2 = "container"
            goto L_0x0038
        L_0x0083:
            X.3em r0 = r8.A05
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x009a
            r0 = 2
            if (r1 == r0) goto L_0x0093
            r0 = 3
            if (r1 == r0) goto L_0x0093
            return
        L_0x0093:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r8.A06
            if (r0 != 0) goto L_0x00bb
        L_0x0097:
            java.lang.String r2 = "button"
            goto L_0x0038
        L_0x009a:
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A04
            if (r0 != 0) goto L_0x00bb
        L_0x009e:
            java.lang.String r2 = "gradientView"
            goto L_0x0038
        L_0x00a1:
            r8.A02(r0)
            return
        L_0x00a5:
            r8.A01(r0)
            return
        L_0x00a9:
            r8.A08 = r1
            X.0eM r0 = X.C21977XoP.A03
            java.lang.Object r2 = r0.getValue()
            X.XoP r2 = (X.C21977XoP) r2
            long r4 = r8.A01
            long r6 = r8.A00
            r2.A01(r3, r4, r6)
            return
        L_0x00bb:
            android.view.View r0 = (android.view.View) r0
            A03(r0, r8)
            return
        L_0x00c1:
            boolean r0 = r9.A23
            if (r0 != 0) goto L_0x00d2
            r8.A09 = r1
            X.0eM r0 = X.C21977XoP.A03
            java.lang.Object r0 = r0.getValue()
            X.XoP r0 = (X.C21977XoP) r0
            r0.A00(r9)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258323yp.DQp(X.3W1, int):void");
    }

    private final void A01(View view) {
        if (this.A09) {
            0qQ.A0A(view.animate().alpha(0.0f).setDuration(400).setListener(new U09(view)));
        } else {
            view.setVisibility(8);
        }
    }

    private final void A02(View view) {
        if (this.A09) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            0qQ.A0A(view.animate().alpha(1.0f).setDuration(400).setListener(new C52773GcQ(view, this)));
            return;
        }
        view.setVisibility(0);
    }

    public static final void A03(View view, C258323yp r3) {
        if (!r3.A08) {
            Rect rect = new Rect();
            if (view.isShown() && view.getLocalVisibleRect(rect)) {
                C62320sa r0 = r3.A07;
                if (r0 != null) {
                    r0.invoke();
                    r3.A08 = true;
                    return;
                }
                0qQ.A0F("impression");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    private final void A04(SlideInAndOutIconView slideInAndOutIconView, String str) {
        Context context = this.A0A;
        slideInAndOutIconView.setIcon(context.getDrawable(R.drawable.instagram_expand_pano_outline_24));
        if (str != null) {
            slideInAndOutIconView.setText(str);
            slideInAndOutIconView.setTextCapitalization(false);
        }
        TitleTextView titleTextView = slideInAndOutIconView.A0C;
        int lineHeight = titleTextView.getLineHeight() + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(context.getDrawable(R.drawable.instagram_expand_pano_outline_24), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        slideInAndOutIconView.setIconColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_icon_on_media)));
        slideInAndOutIconView.setIconScale(0.5f);
    }

    public static final View A00(ViewStub viewStub, C258323yp r3) {
        View requireViewById;
        if (viewStub.getParent() != null) {
            requireViewById = viewStub.inflate();
        } else {
            requireViewById = r3.A0E.requireViewById(viewStub.getInflatedId());
        }
        0qQ.A07(requireViewById);
        return requireViewById;
    }
}
