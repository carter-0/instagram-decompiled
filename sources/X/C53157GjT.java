package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.GjT  reason: case insensitive filesystem */
public final class C53157GjT extends C249703kE implements AnonymousClass2xU {
    public View A00;
    public 1Xj A01;
    public C2363233h A02;
    public AnonymousClass3W1 A03;
    public boolean A04;
    public final int A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final ImageView A0D;
    public final TextView A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final ArrayList A0J = AnonymousClass7TE.A1C();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53157GjT(View view, int i) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = i;
        this.A08 = AnonymousClass7TF.A0G(view, R.id.tombstone_reasons);
        this.A0A = AnonymousClass7TF.A0G(view, R.id.tombstone_survey);
        this.A0H = AnonymousClass7TG.A0R(view, R.id.tombstone_title);
        this.A0B = AnonymousClass7TF.A0G(view, R.id.tombstone_thanks);
        this.A0D = DbX.A0J(view, R.id.tombstone_header_image);
        this.A0F = AnonymousClass7TG.A0R(view, R.id.tombstone_header_text);
        this.A0E = AnonymousClass7TG.A0R(view, R.id.tombstone_feedback_text);
        this.A0I = AnonymousClass7TG.A0R(view, R.id.tombstone_undo);
        this.A0G = AnonymousClass7TG.A0R(view, R.id.tombstone_show_post);
        this.A06 = AnonymousClass7TF.A0G(view, R.id.tombstone_dismiss_button);
        this.A0C = AnonymousClass7TF.A0G(view, R.id.undo_divider);
        this.A09 = AnonymousClass7TF.A0G(view, R.id.show_post_divider);
        this.A07 = AnonymousClass7TF.A0G(view, R.id.tombstone_frame);
    }

    public final void DQp(AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r3, 0);
        if (i == 6 && r3.A1y) {
            this.A0F.setText(2131975460);
            this.A0E.setText(2131975457);
            if (this.A05 == 0) {
                C56310HwN.A01(this, 8);
            }
        }
    }

    public final void A00() {
        View view = this.A08;
        view.setAlpha(1.0f);
        this.A0B.setVisibility(8);
        view.setVisibility(0);
    }

    public final void A02(int i) {
        View view = this.A0A;
        String A002 = AnonymousClass000.A00(5);
        0qQ.A0C(view, A002);
        ViewGroup viewGroup = (ViewGroup) view;
        ArrayList arrayList = this.A0J;
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            viewGroup.removeView((View) AnonymousClass7TF.A0a(A1G));
        }
        arrayList.clear();
        for (int i2 = 0; i2 < i; i2++) {
            0qQ.A0C(view, A002);
            View A0C2 = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_feed_tombstone_reason);
            AnonymousClass7TG.A0R(A0C2, R.id.survey_tombstone_reason_text).getPaint().setFakeBoldText(true);
            viewGroup.addView(A0C2);
            arrayList.add(A0C2);
        }
    }

    public final void A01() {
        C56310HwN.A00(this);
        String str = C2363633l.A02;
        this.A08.setVisibility(8);
        if (0qQ.A0K(str, "v2") || 0qQ.A0K(str, "v3")) {
            this.A0B.setVisibility(8);
        } else {
            this.A0B.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r9 == com.instagram.api.schemas.UndoStyle.A06) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r12.length() == 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View.OnClickListener r8, com.instagram.api.schemas.UndoStyle r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            X.AnonymousClass7TG.A1P(r10, r9)
            r7.A00()
            android.view.View r1 = r7.A00
            if (r1 != 0) goto L_0x0017
            android.view.View r1 = r7.A08
            r0 = 2131442967(0x7f0b3d17, float:1.8507989E38)
            android.view.View r1 = X.DbY.A0F(r1, r0)
            r7.A00 = r1
            if (r1 == 0) goto L_0x00b4
        L_0x0017:
            r0 = 2131442960(0x7f0b3d10, float:1.8507975E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            r3 = 0
            if (r12 == 0) goto L_0x0028
            int r2 = r12.length()
            r0 = 0
            if (r2 != 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r4 = 8
            if (r0 != 0) goto L_0x00cd
            r5.setVisibility(r3)
            r5.setText(r12)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r5.setTextAppearance(r0)
        L_0x0039:
            r0 = 2131442957(0x7f0b3d0d, float:1.8507969E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            if (r11 == 0) goto L_0x00c9
            int r0 = r11.length()
            if (r0 == 0) goto L_0x00c9
            r0 = 63
            android.text.Spanned r0 = android.text.Html.fromHtml(r11, r0)
            r2.setText(r0)
            r2.setVisibility(r3)
        L_0x0054:
            r0 = 2131442959(0x7f0b3d0f, float:1.8507973E38)
            android.widget.ImageView r6 = X.DbX.A0J(r1, r0)
            X.0qQ.A0B(r6, r3)
            int r5 = r10.intValue()
            switch(r5) {
                case 1: goto L_0x00bd;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c5;
                default: goto L_0x0065;
            }
        L_0x0065:
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
        L_0x0068:
            android.content.Context r2 = r6.getContext()
            r6.setVisibility(r3)
            X.DbU.A13(r2, r6, r0)
            switch(r5) {
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b5;
                default: goto L_0x0075;
            }
        L_0x0075:
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
        L_0x0078:
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbX.A12(r2, r6, r0)
        L_0x0083:
            r0 = 2131442975(0x7f0b3d1f, float:1.8508005E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131442976(0x7f0b3d20, float:1.8508007E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            X.AnonymousClass0fU.A00(r8, r5)
            X.AnonymousClass0fU.A00(r8, r2)
            com.instagram.api.schemas.UndoStyle r0 = com.instagram.api.schemas.UndoStyle.A05
            if (r9 == r0) goto L_0x00a1
            com.instagram.api.schemas.UndoStyle r1 = com.instagram.api.schemas.UndoStyle.A06
            r0 = 8
            if (r9 != r1) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r5.setVisibility(r0)
            com.instagram.api.schemas.UndoStyle r0 = com.instagram.api.schemas.UndoStyle.A07
            if (r9 != r0) goto L_0x00aa
            r4 = 0
        L_0x00aa:
            r2.setVisibility(r4)
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L_0x00b4
            r0.setVisibility(r3)
        L_0x00b4:
            return
        L_0x00b5:
            r6.clearColorFilter()
            goto L_0x0083
        L_0x00b9:
            r0 = 2130970128(0x7f040610, float:1.7548957E38)
            goto L_0x0078
        L_0x00bd:
            r0 = 2131239924(0x7f0823f4, float:1.8096169E38)
            goto L_0x0068
        L_0x00c1:
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            goto L_0x0068
        L_0x00c5:
            r6.setVisibility(r4)
            goto L_0x0083
        L_0x00c9:
            r2.setVisibility(r4)
            goto L_0x0054
        L_0x00cd:
            r5.setVisibility(r4)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53157GjT.A03(android.view.View$OnClickListener, com.instagram.api.schemas.UndoStyle, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
