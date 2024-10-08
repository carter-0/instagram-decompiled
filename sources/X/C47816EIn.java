package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.EIn  reason: case insensitive filesystem */
public final class C47816EIn extends C46813Dlp implements G6V {
    public static long A0n = 1000;
    public static long A0o = 1000;
    public Integer A00 = AnonymousClass05K.A0C;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final G9Z A0B;
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final HashMap A0D = AnonymousClass7TE.A1E();
    public final LinkedHashSet A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final int A0U;
    public final AnonymousClass0iw A0V;
    public final 2el A0W;
    public final C51866G5d A0X;
    public final G77 A0Y;
    public final 2FW A0Z;
    public final C251033mS A0a;
    public final C250993mO A0b;
    public final 17i A0c;
    public final MTF A0d;
    public final String A0e;
    public final String A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A08(X.C47816EIn r3, com.instagram.model.direct.DirectShareTarget r4, int r5) {
        /*
            r0 = 6
            r2 = -1
            if (r5 == r0) goto L_0x0084
            r0 = 19
            if (r5 == r0) goto L_0x0071
            r0 = 30
            if (r5 == r0) goto L_0x005c
            r0 = 31
            if (r5 == r0) goto L_0x0055
            switch(r5) {
                case 11: goto L_0x008b;
                case 12: goto L_0x003c;
                case 13: goto L_0x0023;
                case 14: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            return r2
        L_0x0014:
            java.util.List r0 = r3.A0Q
            int r1 = r0.size()
            java.util.List r0 = r3.A0I
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0M
            goto L_0x0097
        L_0x0023:
            int r1 = A07(r3)
            java.util.List r0 = r3.A0P
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0G
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0K
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0H
            goto L_0x0097
        L_0x003c:
            int r1 = A07(r3)
            java.util.List r0 = r3.A0P
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0G
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0L
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0K
            goto L_0x0097
        L_0x0055:
            int r1 = A07(r3)
            java.util.List r0 = r3.A0P
            goto L_0x0097
        L_0x005c:
            java.util.List r0 = r3.A0Q
            int r1 = r0.size()
            java.util.List r0 = r3.A0I
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0M
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0F
            goto L_0x0097
        L_0x0071:
            int r1 = A07(r3)
            java.util.List r0 = r3.A0P
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0G
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0L
            goto L_0x0097
        L_0x0084:
            java.util.List r0 = r3.A0Q
            int r1 = r0.indexOf(r4)
            goto L_0x009c
        L_0x008b:
            int r1 = A07(r3)
            java.util.List r0 = r3.A0P
            int r1 = X.DbT.A01(r0, r1)
            java.util.List r0 = r3.A0G
        L_0x0097:
            int r0 = r0.indexOf(r4)
            int r1 = r1 + r0
        L_0x009c:
            if (r1 == r2) goto L_0x0013
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.A08(X.EIn, com.instagram.model.direct.DirectShareTarget, int):int");
    }

    public final int A0D(DirectShareTarget directShareTarget) {
        List list;
        0qQ.A0B(directShareTarget, 0);
        int A0E2 = A0E(directShareTarget);
        if (A0E2 == 6) {
            list = this.A0Q;
        } else if (A0E2 == 19) {
            return this.A0L.indexOf(directShareTarget) + this.A09;
        } else if (A0E2 == 30) {
            list = this.A0F;
        } else if (A0E2 != 31) {
            switch (A0E2) {
                case 11:
                    list = this.A0G;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    list = this.A0K;
                    break;
                case 13:
                    list = this.A0H;
                    break;
                case 14:
                    list = this.A0M;
                    break;
                default:
                    return -1;
            }
        } else {
            list = this.A0P;
        }
        return list.indexOf(directShareTarget);
    }

    public final void A0G(DirectShareTarget directShareTarget, int i) {
        A0J(directShareTarget, i, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r12 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0J(com.instagram.model.direct.DirectShareTarget r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            r0 = 0
            r7 = r14
            X.0qQ.A0B(r14, r0)
            java.util.LinkedHashSet r3 = r13.A0E
            boolean r0 = r3.contains(r14)
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r14.A0Q()
            if (r0 == 0) goto L_0x0088
            r3.clear()
            java.util.List r0 = r13.A0O
            r0.clear()
        L_0x001b:
            r5 = 1
        L_0x001c:
            boolean r0 = r3.contains(r14)
            r4 = 1
            if (r0 == 0) goto L_0x0083
            r3.remove(r14)
            r12 = 0
        L_0x0027:
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329908586168696(0x8111dc00004178, double:3.038518706468448E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r9 = r15
            if (r0 == 0) goto L_0x006a
            r0 = 2
            if (r15 != r0) goto L_0x004a
            if (r12 == 0) goto L_0x004a
            java.util.List r1 = r13.A0O
            boolean r0 = r1.contains(r14)
            if (r0 == 0) goto L_0x0047
            r1.remove(r14)
        L_0x0047:
            r1.add(r14)
        L_0x004a:
            X.G9Z r6 = r13.A0B
            java.util.List r8 = r13.A0F()
            r10 = r16
            r11 = r17
            r6.Dbq(r7, r8, r9, r10, r11, r12)
            r0 = 36328740355194432(0x8110cc00023e40, double:3.037779912496235E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ae
            if (r5 != 0) goto L_0x00ae
            r0 = r18
            r13.notifyItemChanged(r0)
            return r4
        L_0x006a:
            java.util.List r1 = r13.A0O
            boolean r0 = r1.contains(r14)
            if (r0 == 0) goto L_0x0076
            r1.remove(r14)
            goto L_0x004a
        L_0x0076:
            java.lang.String r0 = r13.A01
            if (r0 == 0) goto L_0x004a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004a
            if (r12 == 0) goto L_0x004a
            goto L_0x0047
        L_0x0083:
            r3.add(r14)
            r12 = 1
            goto L_0x0027
        L_0x0088:
            java.util.Iterator r2 = r3.iterator()
        L_0x008c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x008c
            if (r1 == 0) goto L_0x00ab
            r3.remove(r1)
            java.util.List r0 = r13.A0O
            r0.remove(r1)
            goto L_0x001b
        L_0x00ab:
            r5 = 0
            goto L_0x001c
        L_0x00ae:
            r13.notifyDataSetChanged()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.A0J(com.instagram.model.direct.DirectShareTarget, int, int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03b0, code lost:
        r2 = android.view.LayoutInflater.from(r3);
        r1 = X.DbW.A1T(r4, r5);
        r0 = com.instagram.android.R.layout.direct_share_sheet_grid_view_pog;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03bb, code lost:
        if (r1 == false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03bd, code lost:
        r0 = com.instagram.android.R.layout.direct_share_sheet_grid_view_larger_pog;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03c0, code lost:
        r7 = r2.inflate(r0, r9, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0180, code lost:
        r4.setTag(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0183, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01b7, code lost:
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c9, code lost:
        return new X.C47004Dow(X.DbT.A0D(X.DbV.A0D(r9), r9, com.instagram.android.R.layout.direct_share_privacy_warning, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01ca, code lost:
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01dc, code lost:
        return new X.C46938Dns(X.DbT.A0D(X.DbV.A0D(r9), r9, com.instagram.android.R.layout.title_row_with_action_button, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0307, code lost:
        if ((((androidx.recyclerview.widget.RecyclerView) r9).A0D instanceof androidx.recyclerview.widget.GridLayoutManager) != false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0333, code lost:
        if (r8.A0k != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0347, code lost:
        if ((((androidx.recyclerview.widget.RecyclerView) r9).A0D instanceof androidx.recyclerview.widget.GridLayoutManager) != false) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0349, code lost:
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r2 = r8.A01;
        r7 = X.DbV.A0D(r9).inflate(com.instagram.android.R.layout.selectable_user_row, r9, false);
        r0 = new X.F11(r7, r2, r3);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x035e, code lost:
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r3 = X.AnonymousClass7TE.A0S(r9);
        r5 = r8.A01;
        r4 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0371, code lost:
        if (X.182.A06(r4, r5, 36328740355063359L) == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0373, code lost:
        r0 = X.DbW.A1T(r4, r5);
        r2 = com.instagram.android.R.layout.direct_share_sheet_grid_view_pog;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x037a, code lost:
        if (r0 == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x037c, code lost:
        r2 = com.instagram.android.R.layout.direct_share_sheet_grid_view_larger_pog;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x037f, code lost:
        r1 = android.view.LayoutInflater.from(r3);
        X.0qQ.A07(r1);
        r7 = X.2Su.A00(r1, (android.view.ViewGroup.LayoutParams) null, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x038b, code lost:
        r2 = (android.widget.LinearLayout) X.AnonymousClass7TE.A0b(r7, com.instagram.android.R.id.grid_view_pog_text_view_container);
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x039f, code lost:
        if (X.182.A06(r4, r5, 36318234865506325L) == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03a1, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03a3, code lost:
        r2.setGravity(r0);
        X.C49752F5d.A01(r3, r2);
        r0 = new X.C49622Ezf(r7);
        r7 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            r6 = 0
            X.0qQ.A0B(r9, r6)
            r4 = -2
            r3 = -1
            if (r10 == 0) goto L_0x02be
            r0 = 1
            if (r10 == r0) goto L_0x02ab
            r0 = 2
            if (r10 == r0) goto L_0x02ec
            r0 = 3
            if (r10 == r0) goto L_0x0257
            r0 = 22
            if (r10 == r0) goto L_0x02ec
            r0 = 24
            if (r10 == r0) goto L_0x023a
            r0 = 27
            if (r10 == r0) goto L_0x01dd
            switch(r10) {
                case 5: goto L_0x01ca;
                case 6: goto L_0x02ec;
                case 7: goto L_0x01ca;
                case 8: goto L_0x01ca;
                case 9: goto L_0x01ca;
                case 10: goto L_0x02ec;
                case 11: goto L_0x02ec;
                case 12: goto L_0x02ec;
                case 13: goto L_0x01b7;
                case 14: goto L_0x02ec;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r10) {
                case 33: goto L_0x019a;
                case 34: goto L_0x01ca;
                case 35: goto L_0x02ec;
                case 36: goto L_0x01ca;
                case 37: goto L_0x02ec;
                case 38: goto L_0x01b7;
                case 39: goto L_0x01b7;
                case 40: goto L_0x015d;
                case 41: goto L_0x014a;
                case 42: goto L_0x002e;
                case 43: goto L_0x01ca;
                case 44: goto L_0x0336;
                case 45: goto L_0x01ca;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = 28
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r10)
            throw r0
        L_0x002e:
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            X.0qQ.A07(r1)
            r0 = 2131625106(0x7f0e0492, float:1.887741E38)
            android.view.View r4 = X.DbU.A09(r1, r9, r0, r6)
            X.Dpb r1 = new X.Dpb
            r1.<init>(r4)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A05
            if (r0 != 0) goto L_0x00dc
            android.view.ViewStub r0 = r1.A0G
            android.view.View r2 = r0.inflate()
            r0 = 24
            java.lang.String r3 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.A05 = r2
            X.0qQ.A0C(r2, r3)
            r0 = 2131431767(0x7f0b1157, float:1.8485273E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r2, r0)
            r1.A01 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433650(0x7f0b18b2, float:1.8489092E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.A02 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433651(0x7f0b18b3, float:1.8489094E38)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = X.DbU.A0X(r2, r0)
            r1.A09 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433649(0x7f0b18b1, float:1.848909E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.A03 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433653(0x7f0b18b5, float:1.8489098E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r2, r0)
            r1.A07 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433652(0x7f0b18b4, float:1.8489096E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r2, r0)
            r1.A0B = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131433654(0x7f0b18b6, float:1.84891E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = (com.instagram.direct.inbox.notes.ui.NoteBubbleView) r0
            r1.A0D = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131430719(0x7f0b0d3f, float:1.8483147E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r0
            r1.A0F = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A05
            X.0qQ.A0C(r2, r3)
            r0 = 2131430720(0x7f0b0d40, float:1.8483149E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r2, r0)
            r1.A0A = r0
        L_0x00dc:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A06
            if (r0 != 0) goto L_0x0180
            android.view.ViewStub r0 = r1.A0H
            android.view.View r2 = r0.inflate()
            r0 = 24
            java.lang.String r3 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r3)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.A06 = r2
            X.0qQ.A0C(r2, r3)
            r0 = 2131433650(0x7f0b18b2, float:1.8489092E38)
            android.view.View r0 = r2.requireViewById(r0)
            r1.A00 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A06
            X.0qQ.A0C(r2, r3)
            r0 = 2131433651(0x7f0b18b3, float:1.8489094E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
            r1.A0E = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A06
            X.0qQ.A0C(r2, r3)
            r0 = 2131433653(0x7f0b18b5, float:1.8489098E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r2, r0)
            r1.A08 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A06
            X.0qQ.A0C(r2, r3)
            r0 = 2131433649(0x7f0b18b1, float:1.848909E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.A04 = r0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.A06
            X.0qQ.A0C(r2, r3)
            r0 = 2131433652(0x7f0b18b4, float:1.8489096E38)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = X.DbT.A0b(r2, r0)
            android.content.Context r2 = r3.getContext()
            r0 = 2131238089(0x7f081cc9, float:1.8092447E38)
            android.graphics.drawable.Drawable r0 = X.0mk.A00(r2, r0)
            r3.setImageDrawable(r0)
            r1.A0C = r3
            goto L_0x0180
        L_0x014a:
            com.instagram.common.session.UserSession r2 = r8.A01
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131625112(0x7f0e0498, float:1.8877423E38)
            android.view.View r4 = X.DbU.A09(r1, r9, r0, r6)
            X.Doa r1 = new X.Doa
            r1.<init>(r4, r2)
            goto L_0x0180
        L_0x015d:
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0184
            android.content.Context r2 = r9.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            X.0qQ.A07(r1)
            r0 = 2131625107(0x7f0e0493, float:1.8877413E38)
            android.view.View r4 = X.DbU.A09(r1, r9, r0, r6)
            X.DpK r1 = new X.DpK
            r1.<init>(r4)
            X.0qQ.A07(r2)
            android.widget.LinearLayout r0 = r1.A02
            X.C49752F5d.A01(r2, r0)
        L_0x0180:
            r4.setTag(r1)
            return r1
        L_0x0184:
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            X.0qQ.A07(r1)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131629005(0x7f0e13cd, float:1.8885319E38)
            android.view.View r0 = X.DbT.A0D(r1, r9, r0, r6)
            X.Doq r1 = new X.Doq
            r1.<init>(r0)
            return r1
        L_0x019a:
            X.G9Z r2 = r8.A0B
            r0 = 1
            X.0qQ.A0B(r2, r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131629045(0x7f0e13f5, float:1.88854E38)
            android.view.View r0 = X.DbU.A09(r1, r9, r0, r6)
            X.Dob r1 = new X.Dob
            r1.<init>(r0, r2)
            r0.setTag(r1)
            r2.D9C()
            return r1
        L_0x01b7:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131625102(0x7f0e048e, float:1.8877402E38)
            android.view.View r0 = X.DbT.A0D(r1, r9, r0, r6)
            X.Dow r1 = new X.Dow
            r1.<init>(r0)
            return r1
        L_0x01ca:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131629679(0x7f0e166f, float:1.8886686E38)
            android.view.View r0 = X.DbT.A0D(r1, r9, r0, r6)
            X.Dns r1 = new X.Dns
            r1.<init>(r0)
            return r1
        L_0x01dd:
            boolean r0 = r8.A0R
            android.content.Context r3 = r9.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            if (r0 == 0) goto L_0x020f
            X.0qQ.A07(r1)
            r0 = 2131625105(0x7f0e0491, float:1.8877409E38)
            android.view.View r2 = r1.inflate(r0, r9, r6)
            r0 = 2131433649(0x7f0b18b1, float:1.848909E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r2, r0)
            X.0qQ.A07(r3)
            X.C49752F5d.A01(r3, r0)
            X.DoB r1 = new X.DoB
            r1.<init>(r2)
            r2.setTag(r1)
            com.instagram.common.ui.base.IgTextView r2 = r1.A01
            r0 = 4
            r2.setTextAlignment(r0)
            return r1
        L_0x020f:
            X.0qQ.A07(r1)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131629219(0x7f0e14a3, float:1.8885753E38)
            android.view.View r0 = X.DbT.A0D(r1, r9, r0, r6)
            X.DpC r1 = new X.DpC
            r1.<init>(r0)
            com.instagram.common.ui.base.IgTextView r2 = r1.A04
            X.0qQ.A0B(r2, r6)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r2.setTextAppearance(r0)
            X.DbY.A12(r2, r3)
            com.instagram.common.ui.base.IgTextView r2 = r1.A03
            X.0qQ.A0B(r2, r6)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r2.setTextAppearance(r0)
            return r1
        L_0x023a:
            android.content.Context r1 = r9.getContext()
            r0 = 0
            com.instagram.ui.widget.loadmore2.LoadMoreButton r2 = new com.instagram.ui.widget.loadmore2.LoadMoreButton
            r2.<init>(r1, r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r4)
            r2.setLayoutParams(r0)
            X.EWS r0 = X.EWS.LOADING
            r2.setState(r0)
            X.JmL r1 = new X.JmL
            r1.<init>(r2)
            return r1
        L_0x0257:
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0292
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0292
            r0 = r9
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3pI r0 = r0.A0D
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x0292
            android.content.Context r2 = r9.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            X.0qQ.A07(r1)
            r0 = 2131625105(0x7f0e0491, float:1.8877409E38)
            android.view.View r3 = r1.inflate(r0, r9, r6)
            r0 = 2131433649(0x7f0b18b1, float:1.848909E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r3, r0)
            X.0qQ.A07(r2)
            X.C49752F5d.A01(r2, r0)
            X.DpZ r1 = new X.DpZ
            r1.<init>(r3)
        L_0x028c:
            r3.setTag(r1)
            X.3kE r1 = (X.C249703kE) r1
            return r1
        L_0x0292:
            X.G9Z r4 = r8.A0B
            int r2 = r8.A00
            r0 = 1
            X.0qQ.A0B(r4, r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131629218(0x7f0e14a2, float:1.888575E38)
            android.view.View r3 = X.DbU.A09(r1, r9, r0, r6)
            X.Dpa r1 = new X.Dpa
            r1.<init>(r3, r4, r2)
            goto L_0x028c
        L_0x02ab:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131629204(0x7f0e1494, float:1.8885722E38)
            android.view.View r7 = X.DbT.A0C(r1, r9, r0)
            X.EyR r0 = new X.EyR
            r0.<init>(r7)
            goto L_0x0328
        L_0x02be:
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r9)
            r0 = 0
            r1 = 6
            com.instagram.igds.components.search.IgdsInlineSearchBox r7 = new com.instagram.igds.components.search.IgdsInlineSearchBox
            r7.<init>(r2, r0, r6)
            X.G77 r0 = r8.A0Y
            r7.A02 = r0
            r7.setImeOptions(r1)
            int r0 = r8.A0A
            if (r0 != 0) goto L_0x02e3
            r2 = 2131238590(0x7f081ebe, float:1.8093463E38)
            r1 = 2131959842(0x7f132022, float:1.9556336E38)
            r0 = 10
            X.FPI r0 = X.FPI.A00(r8, r0)
            r7.A06(r0, r2, r1)
        L_0x02e3:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r4)
            r7.setLayoutParams(r0)
            goto L_0x032b
        L_0x02ec:
            int r1 = r8.A0A
            if (r1 == 0) goto L_0x03cd
            r0 = 1
            if (r1 == r0) goto L_0x03c9
            r0 = 2
            if (r1 == r0) goto L_0x03c5
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
        L_0x02f8:
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0331
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0309
            r0 = r9
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3pI r0 = r0.A0D
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L_0x035e
        L_0x0309:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r2 = r9.getContext()
            boolean r0 = r8.A0l
            r1 = 2131625208(0x7f0e04f8, float:1.8877617E38)
            if (r0 == 0) goto L_0x0319
            r1 = 2131625209(0x7f0e04f9, float:1.887762E38)
        L_0x0319:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            android.view.View r7 = X.DbT.A0C(r0, r9, r1)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            X.DpR r0 = new X.DpR
            r0.<init>(r2, r7)
        L_0x0328:
            r7.setTag(r0)
        L_0x032b:
            X.Dmm r1 = new X.Dmm
            r1.<init>(r7)
            return r1
        L_0x0331:
            boolean r0 = r8.A0k
            if (r0 == 0) goto L_0x0349
            goto L_0x0309
        L_0x0336:
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0349
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0349
            r0 = r9
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3pI r0 = r0.A0D
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L_0x035e
        L_0x0349:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r2 = r8.A01
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            r0 = 2131629330(0x7f0e1512, float:1.8885978E38)
            android.view.View r7 = r1.inflate(r0, r9, r6)
            X.F11 r0 = new X.F11
            r0.<init>(r7, r2, r3)
            goto L_0x0328
        L_0x035e:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r9)
            com.instagram.common.session.UserSession r5 = r8.A01
            X.0Tu r4 = X.0Tu.A05
            r0 = 36328740355063359(0x8110cc00003e3f, double:3.037779912413344E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x03b0
            boolean r0 = X.DbW.A1T(r4, r5)
            r2 = 2131625109(0x7f0e0495, float:1.8877417E38)
            if (r0 == 0) goto L_0x037f
            r2 = 2131625108(0x7f0e0494, float:1.8877415E38)
        L_0x037f:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            X.0qQ.A07(r1)
            r0 = 0
            android.view.View r7 = X.2Su.A00(r1, r0, r9, r2)
        L_0x038b:
            r0 = 2131433656(0x7f0b18b8, float:1.8489104E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r7, r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0 = 36318234865506325(0x81073e00071815, double:3.031136198515265E-306)
            boolean r1 = X.182.A06(r4, r5, r0)
            r0 = 17
            if (r1 == 0) goto L_0x03a3
            r0 = 49
        L_0x03a3:
            r2.setGravity(r0)
            X.C49752F5d.A01(r3, r2)
            X.Ezf r0 = new X.Ezf
            r0.<init>(r7)
            goto L_0x0328
        L_0x03b0:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            boolean r1 = X.DbW.A1T(r4, r5)
            r0 = 2131625109(0x7f0e0495, float:1.8877417E38)
            if (r1 == 0) goto L_0x03c0
            r0 = 2131625108(0x7f0e0494, float:1.8877415E38)
        L_0x03c0:
            android.view.View r7 = r2.inflate(r0, r9, r6)
            goto L_0x038b
        L_0x03c5:
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x02f8
        L_0x03c9:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x02f8
        L_0x03cd:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x02f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    private final int A00() {
        List list;
        int i;
        if (this.A0T) {
            int A092 = A09(this.A0L, A03());
            list = this.A0K;
            i = A092 + (AnonymousClass7TE.A1b(list) ? 1 : 0);
        } else {
            int A052 = A05();
            list = this.A0P;
            i = A052 + (AnonymousClass7TE.A1b(list) ? 1 : 0);
        }
        return DbT.A01(list, i);
    }

    private final int A01() {
        List list;
        int i;
        if (this.A0T) {
            i = A00();
            list = this.A0G;
        } else {
            int A092 = A09(this.A0L, A03());
            list = this.A0K;
            i = A092 + (AnonymousClass7TE.A1b(list) ? 1 : 0);
        }
        return DbT.A01(list, i);
    }

    private final int A03() {
        int A002;
        List list;
        if (this.A0T) {
            int A052 = A05();
            list = this.A0P;
            A002 = A052 + (AnonymousClass7TE.A1b(list) ? 1 : 0);
        } else {
            A002 = A00();
            list = this.A0G;
        }
        return DbT.A01(list, A002);
    }

    public static int A06(Context context, ViewGroup.LayoutParams layoutParams) {
        int A042 = (int) 0nA.A04(context, 92);
        int A043 = (int) 0nA.A04(context, 80);
        layoutParams.width = A042;
        layoutParams.height = A042;
        return A043;
    }

    public static int A07(C47816EIn eIn) {
        return eIn.A0Q.size() + eIn.A0I.size() + eIn.A0M.size() + eIn.A0F.size();
    }

    public static final boolean A0C(C47816EIn eIn) {
        if (!eIn.A06) {
            return false;
        }
        String str = eIn.A01;
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public final int A0E(DirectShareTarget directShareTarget) {
        if (this.A0Q.contains(directShareTarget)) {
            return 6;
        }
        if (this.A0M.contains(directShareTarget)) {
            return 14;
        }
        if (this.A0G.contains(directShareTarget)) {
            return 11;
        }
        if (this.A0L.contains(directShareTarget)) {
            return 19;
        }
        if (this.A0K.contains(directShareTarget)) {
            return 12;
        }
        if (this.A0H.contains(directShareTarget)) {
            return 13;
        }
        if (this.A0F.contains(directShareTarget)) {
            return 30;
        }
        if (this.A0P.contains(directShareTarget)) {
            return 31;
        }
        return 0;
    }

    public final List A0F() {
        List unmodifiableList = Collections.unmodifiableList(AnonymousClass7TE.A1D(this.A0E));
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final void A0H(String str, boolean z, boolean z2) {
        if (this.A07 != z || this.A03 != z2 || !0qQ.A0K(this.A01, str)) {
            this.A07 = z;
            this.A03 = z2;
            this.A01 = str;
            notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A01, 36326468317493019L) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(java.util.List r11, java.util.List r12, java.util.List r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, boolean r18) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0019
            int r1 = r11.size()
            r0 = 6
            if (r1 > r0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r10.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326468317493019(0x810ebb0002371b, double:3.0363430667051E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10.A04 = r0
            r0 = r16
            if (r16 == 0) goto L_0x002c
            java.util.List r1 = r10.A0F
            r1.clear()
            java.util.ArrayList r0 = r10.A0A(r0)
            r1.addAll(r0)
        L_0x002c:
            if (r12 == 0) goto L_0x003a
            java.util.List r1 = r10.A0G
            r1.clear()
            java.util.ArrayList r0 = r10.A0A(r12)
            r1.addAll(r0)
        L_0x003a:
            r1 = r17
            if (r17 == 0) goto L_0x0046
            java.util.List r0 = r10.A0Q
            r0.clear()
            r0.addAll(r1)
        L_0x0046:
            if (r11 == 0) goto L_0x00d3
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r3 = r10.A0Q
            r3.clear()
            java.util.List r2 = r10.A0J
            r2.clear()
            java.util.List r6 = r10.A0P
            r6.clear()
            java.util.List r5 = r10.A0L
            r5.clear()
            if (r18 == 0) goto L_0x007d
            com.instagram.common.session.UserSession r8 = r10.A01
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329908586168696(0x8111dc00004178, double:3.038518706468448E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 != 0) goto L_0x007d
            java.util.LinkedHashSet r0 = r10.A0E
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            X.00v.A10(r0)
            r4.addAll(r0)
        L_0x007d:
            java.util.ArrayList r0 = r10.A0A(r11)
            r4.addAll(r0)
            java.util.List r1 = r10.A0F
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x011c
            boolean r0 = r1.isEmpty()
            r9 = 1
            r7 = r0 ^ 1
            java.util.List r0 = r10.A0G
            boolean r0 = r0.isEmpty()
            r8 = 0
            if (r0 != 0) goto L_0x011a
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x011a
        L_0x00a0:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0115
            if (r18 == 0) goto L_0x0115
            r1 = 6
        L_0x00a7:
            if (r7 == 0) goto L_0x0101
            int r0 = r10.A08
            if (r9 == 0) goto L_0x0105
            int r7 = java.lang.Math.min(r1, r0)
            int r0 = r10.A09
            int r1 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r4.subList(r8, r7)
            r3.addAll(r0)
            java.util.List r0 = r4.subList(r7, r1)
        L_0x00c2:
            r6.addAll(r0)
            int r0 = r4.size()
            java.util.List r0 = r4.subList(r1, r0)
        L_0x00cd:
            r5.addAll(r0)
        L_0x00d0:
            r2.addAll(r3)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e1
            java.util.List r1 = r10.A0K
            r1.clear()
            java.util.ArrayList r0 = r10.A0A(r13)
            r1.addAll(r0)
        L_0x00e1:
            if (r14 == 0) goto L_0x00ef
            java.util.List r1 = r10.A0M
            r1.clear()
            java.util.ArrayList r0 = r10.A0A(r14)
            r1.addAll(r0)
        L_0x00ef:
            if (r15 == 0) goto L_0x00fd
            java.util.List r1 = r10.A0H
            r1.clear()
            java.util.ArrayList r0 = r10.A0A(r15)
            r1.addAll(r0)
        L_0x00fd:
            r10.notifyDataSetChanged()
            return
        L_0x0101:
            if (r9 == 0) goto L_0x010f
            int r0 = r10.A09
        L_0x0105:
            int r1 = java.lang.Math.min(r1, r0)
            r6 = r3
            java.util.List r0 = r4.subList(r8, r1)
            goto L_0x00c2
        L_0x010f:
            r5 = r3
            java.util.List r0 = r4.subList(r8, r1)
            goto L_0x00cd
        L_0x0115:
            int r1 = r4.size()
            goto L_0x00a7
        L_0x011a:
            r9 = 0
            goto L_0x00a0
        L_0x011c:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x012e
            if (r18 == 0) goto L_0x012e
            int r0 = r4.size()
            r1 = 6
            if (r0 <= r1) goto L_0x012e
            r0 = 0
            java.util.List r4 = r4.subList(r0, r1)
        L_0x012e:
            r3.addAll(r4)
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.A0I(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public final void Dhj() {
        this.A0B.Dhj();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: X.FPI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v462, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v463, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v464, resolved type: X.FOW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.FOW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: android.view.ViewGroup$MarginLayoutParams} */
    /* JADX WARNING: type inference failed for: r0v161, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r0v261, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v284, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r4v41, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v59, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v346, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r9v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r9v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03a6, code lost:
        if (X.FGK.A00(r5) != X.EW5.RecipientListBubbleOnly) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0650, code lost:
        r10 = (X.C46938Dns) r10;
        r3 = 2131972277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x065b, code lost:
        X.0qQ.A0B(r10, 0);
        r10.A01.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0663, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x085a, code lost:
        if (r14 != null) goto L_0x085c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0be7, code lost:
        r0 = (r30 - r0) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0dcf, code lost:
        X.AnonymousClass0fU.A00(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x022a, code lost:
        if (X.FGK.A00(r3) != X.EW5.RecipientListBubbleOnly) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x076f  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x08b8  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0acf  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0af7  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0b0a  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0b6b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r29, int r30) {
        /*
            r28 = this;
            r10 = r29
            r13 = r30
            r11 = 0
            X.0qQ.A0B(r10, r11)
            android.view.View r4 = r10.itemView
            android.content.Context r3 = r4.getContext()
            int r5 = r10.mItemViewType
            r1 = r28
            if (r5 == 0) goto L_0x0f02
            r9 = 1
            if (r5 == r9) goto L_0x0bf9
            r14 = 2
            if (r5 == r14) goto L_0x0bc6
            r2 = 3
            r12 = 0
            if (r5 == r2) goto L_0x0994
            r0 = 24
            if (r5 == r0) goto L_0x0dd2
            r0 = 27
            if (r5 == r0) goto L_0x0664
            java.lang.String r16 = "Required value was null."
            switch(r5) {
                case 5: goto L_0x0650;
                case 6: goto L_0x0646;
                case 7: goto L_0x0640;
                case 8: goto L_0x0dd2;
                case 9: goto L_0x0633;
                case 10: goto L_0x0623;
                case 11: goto L_0x0bce;
                case 12: goto L_0x05cd;
                case 13: goto L_0x05d7;
                case 14: goto L_0x060b;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r5) {
                case 33: goto L_0x0589;
                case 34: goto L_0x0656;
                case 35: goto L_0x0bd9;
                case 36: goto L_0x0650;
                case 37: goto L_0x01d2;
                case 38: goto L_0x04ac;
                case 39: goto L_0x057f;
                case 40: goto L_0x01dc;
                case 41: goto L_0x0510;
                case 42: goto L_0x0c38;
                case 43: goto L_0x04e0;
                case 44: goto L_0x0039;
                case 45: goto L_0x0650;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = 28
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r5)
            throw r0
        L_0x0039:
            java.util.List r4 = r1.A0I
            int r3 = r1.A02()
            java.util.List r0 = r1.A0Q
            int r0 = X.DbT.A01(r0, r3)
            int r13 = r30 - r0
            int r0 = r13 + -1
            java.lang.Object r3 = r4.get(r0)
            X.Gn4 r3 = (X.C53374Gn4) r3
            android.view.View r0 = r10.itemView
            android.content.Context r6 = r0.getContext()
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r0 instanceof X.C49622Ezf
            if (r0 == 0) goto L_0x0163
            X.0qQ.A0A(r6)
            com.instagram.common.session.UserSession r4 = r1.A01
            android.view.View r0 = r10.itemView
            X.0qQ.A06(r0)
            X.Faz r7 = new X.Faz
            r7.<init>(r1)
            X.AnonymousClass7TF.A1B(r6, r11, r3)
            java.lang.Object r5 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.gridview.DirectShareSheetGridItemViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.Ezf r5 = (X.C49622Ezf) r5
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r5.A04
            boolean r14 = X.C53374Gn4.A00(r11, r3)
            if (r14 == 0) goto L_0x0156
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            if (r0 == 0) goto L_0x008e
            r1.setAvatarViewDrawable(r0)
        L_0x008e:
            r0 = 2131231736(0x7f0803f8, float:1.8079561E38)
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            r0 = 2131238804(0x7f081f94, float:1.8093897E38)
            android.graphics.drawable.Drawable r11 = r6.getDrawable(r0)
            if (r13 == 0) goto L_0x00f1
            if (r11 == 0) goto L_0x00f1
            r13.mutate()
            r11.mutate()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r13, r11}
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            r10.<init>(r0)
            r0 = 2131100230(0x7f060246, float:1.7812836E38)
            int r8 = r6.getColor(r0)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r6.getColor(r0)
            r13.setTint(r8)
            r11.setTint(r0)
            r0 = 4
            int r17 = X.DbS.A02(r6, r0)
            r0 = 12
            int r8 = X.DbS.A02(r6, r0)
            int r0 = X.DbS.A02(r6, r0)
            r10.setLayerSize(r9, r8, r0)
            r15 = r10
            r16 = r9
            r18 = r17
            r19 = r17
            r20 = r17
            r15.setLayerInset(r16, r17, r18, r19, r20)
            r1.setBottomBadgeDrawable(r10)
            r8 = -8
            float r0 = X.0nA.A04(r6, r8)
            r1.A01 = r0
            float r0 = X.0nA.A04(r6, r8)
            r1.A00 = r0
        L_0x00f1:
            int r0 = X.2Yu.A02(r6)
            int r0 = r6.getColor(r0)
            r1.setBackgroundRingColor(r0)
            r1.A05()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165566(0x7f07017e, float:1.7945353E38)
            float r8 = r1.getDimension(r0)
            com.instagram.common.ui.base.IgTextView r11 = r5.A01
            com.instagram.common.ui.base.IgTextView r10 = r5.A02
            r0 = 8
            r10.setVisibility(r0)
            X.DbS.A1C(r10)
            if (r14 == 0) goto L_0x014a
            java.lang.String r1 = r3.A03
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0122
            java.lang.String r1 = r3.A04
        L_0x0122:
            java.lang.String r0 = X.C49961FGt.A00(r10, r1, r8)
            r11.setText(r0)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36318234865571862(0x81073e00081816, double:3.0311361985567106E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x013c
            r11.setTypeface(r12, r9)
            r10.setTypeface(r12, r9)
        L_0x013c:
            android.view.View r5 = r5.A00
            X.FO6 r8 = new X.FO6
            r9 = r2
            r10 = r3
            r11 = r6
            r12 = r4
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0dcf
        L_0x014a:
            r1 = 2131972797(0x7f1352bd, float:1.9582612E38)
            android.content.Context r0 = X.02K.A01(r6)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r0, r1)
            goto L_0x0122
        L_0x0156:
            r0 = 2131239615(0x7f0822bf, float:1.8095542E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            if (r0 == 0) goto L_0x00f1
            r1.setAvatarViewDrawable(r0)
            goto L_0x00f1
        L_0x0163:
            android.view.View r2 = r10.itemView
            com.instagram.common.session.UserSession r6 = r1.A01
            X.FbQ r4 = new X.FbQ
            r4.<init>(r1)
            boolean r0 = X.C53374Gn4.A00(r11, r3)
            if (r0 == 0) goto L_0x0dd2
            java.lang.Object r5 = X.DbT.A0o(r2)
            X.F11 r5 = (X.F11) r5
            android.content.Context r7 = r2.getContext()
            android.widget.TextView r1 = r5.A06
            java.lang.String r0 = r3.A03
            r1.setText(r0)
            android.widget.TextView r1 = r5.A05
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r5.A0A
            r1.setGradientSpinnerVisible(r11)
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r1.setAvatarViewDrawable(r0)
            android.view.ViewGroup r0 = r5.A03
            r0.setBackground(r12)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            android.content.res.ColorStateList r0 = X.1QE.A0B(r7, r12)
            r2.setColor(r0)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r0 = r1.getDimension(r0)
            r2.setCornerRadius(r0)
            android.view.View r5 = r5.A01
            r0 = 2131437278(0x7f0b26de, float:1.849645E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x01c6
            r0.setBackground(r2)
        L_0x01c6:
            r9 = 5
            X.FO6 r8 = new X.FO6
            r10 = r6
            r11 = r7
            r12 = r4
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0dcf
        L_0x01d2:
            r4 = 31
            java.util.List r3 = r1.A0P
            int r0 = r1.A05()
            goto L_0x0be7
        L_0x01dc:
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof X.C47028DpK
            if (r0 == 0) goto L_0x0383
            X.DpK r10 = (X.C47028DpK) r10
            X.G9Z r0 = r1.A0B
            r17 = r0
            com.instagram.common.session.UserSession r3 = r1.A01
            X.1Xj r2 = r1.A02
            X.0iw r4 = r1.A0V
            X.0qQ.A0B(r10, r11)
            X.DbW.A1N(r0, r9, r4)
            android.view.ViewGroup r5 = r10.A00
            android.content.Context r1 = r5.getContext()
            r5.setClickable(r9)
            r5.setFocusable(r9)
            android.view.View r0 = r10.itemView
            X.2eS.A01(r0)
            com.instagram.common.ui.base.IgTextView r7 = r10.A03
            r15 = 4
            r7.setTextAlignment(r15)
            r6 = 2131960037(0x7f1320e5, float:1.9556731E38)
            X.DbT.A18(r1, r7, r6)
            android.view.View r0 = r10.itemView
            X.DbU.A12(r1, r0, r6)
            X.DbY.A12(r7, r1)
            boolean r0 = X.C249223jK.A02(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x022c
            X.EW5 r8 = X.FGK.A00(r3)
            X.EW5 r6 = X.EW5.RecipientListBubbleOnly
            r0 = 1
            if (r8 == r6) goto L_0x022d
        L_0x022c:
            r0 = 0
        L_0x022d:
            r14 = 8
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x02fc
            android.content.res.Resources r8 = r1.getResources()
            r0 = 2131238158(0x7f081d0e, float:1.8092587E38)
            android.graphics.drawable.Drawable r11 = X.AnonymousClass2dd.A00(r8, r0)
            X.0qQ.A07(r11)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 == 0) goto L_0x0258
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r10.A04
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r8 = X.AnonymousClass7TF.A03(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r8)
            r9.setBackground(r0)
        L_0x0258:
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r10.A04
            r9.setImageDrawable(r11)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r10.A07
            r12.setVisibility(r14)
        L_0x0262:
            X.DbY.A1L(r3, r12)
            int r0 = X.2Yu.A08(r1)
            r12.setCreationLayoutForShareSheetSuggestedGrid(r0)
            android.widget.LinearLayout r0 = r10.A02
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r10.A06
            X.F5X.A00(r0, r3, r12)
            X.0Tu r8 = X.0Tu.A05
            boolean r0 = X.DbW.A1T(r8, r3)
            if (r0 == 0) goto L_0x02c1
            android.widget.LinearLayout r14 = r10.A01
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x02c1
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x02c1
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x02c1
            android.view.ViewGroup$MarginLayoutParams r15 = X.DbW.A0A(r14, r6)
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.0qQ.A0C(r11, r0)
            android.view.ViewGroup$MarginLayoutParams r6 = X.DbW.A0A(r7, r0)
            int r0 = A06(r1, r15)
            r11.width = r0
            r11.height = r0
            r0 = 16
            X.C49750F5b.A01(r1, r15, r3, r0, r13)
            r14.setLayoutParams(r15)
            r9.setLayoutParams(r11)
            r0 = 10
            X.C49750F5b.A01(r1, r6, r3, r0, r13)
            r7.setLayoutParams(r6)
        L_0x02c1:
            X.F5X.A01(r7, r3, r12)
            r6 = 18
            r0 = r17
            X.FPI.A01(r5, r6, r0)
            if (r2 == 0) goto L_0x02fa
            java.lang.String r5 = r2.getId()
        L_0x02d1:
            java.lang.String r2 = "direct_share_sheet"
            java.lang.String r0 = "add_content_note"
            X.C22031Xty.A0E(r4, r3, r5, r2, r0)
            X.3gF r6 = X.C247323g9.A00(r3)
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0dd2
            r4 = 36320652937274106(0x810971005622fa, double:3.032665396838003E-306)
            boolean r0 = X.182.A06(r8, r3, r4)
            if (r0 == 0) goto L_0x0dd2
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r4 = r10.A08
            X.Fv5 r2 = new X.Fv5
            r2.<init>(r1, r3, r6, r10)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            return
        L_0x02fa:
            r5 = 0
            goto L_0x02d1
        L_0x02fc:
            if (r2 == 0) goto L_0x036e
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            if (r0 == 0) goto L_0x036e
            boolean r0 = X.C249223jK.A02(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x036e
            X.EW5 r8 = X.FGK.A00(r3)
            X.EW5 r0 = X.EW5.RecipientListMediaPreviewOnly
            if (r8 != r0) goto L_0x036e
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r10.A05
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            if (r0 == 0) goto L_0x037e
            r12.setUrl(r0, r4)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r9 = r10.A08
            android.view.ViewGroup$MarginLayoutParams r8 = X.DbW.A0A(r9, r6)
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x0361
            r0 = 56
            int r0 = X.DbS.A02(r1, r0)
            r8.width = r0
            r0 = 73
            int r0 = X.DbS.A02(r1, r0)
            r8.height = r0
        L_0x033b:
            r9.setLayoutParams(r8)
            r9.setVisibility(r11)
            r12.setVisibility(r11)
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r10.A04
            r9.setVisibility(r14)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r10.A07
            android.view.ViewGroup$MarginLayoutParams r8 = X.DbW.A0A(r12, r6)
            r0 = 12
            int r0 = X.DbS.A02(r1, r0)
            r8.topMargin = r0
            r12.setLayoutParams(r8)
            r0 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r12.setRotation(r0)
            goto L_0x0262
        L_0x0361:
            int r0 = X.DbS.A02(r1, r15)
            r8.topMargin = r0
            int r0 = X.DbS.A02(r1, r15)
            r8.bottomMargin = r0
            goto L_0x033b
        L_0x036e:
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r10.A04
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            X.DbU.A1S(r4, r9, r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r10.A07
            r12.setVisibility(r11)
            goto L_0x0262
        L_0x037e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0383:
            X.Doq r10 = (X.C46998Doq) r10
            X.G9Z r6 = r1.A0B
            com.instagram.common.session.UserSession r5 = r1.A01
            X.1Xj r2 = r1.A02
            X.0iw r4 = r1.A0V
            X.0qQ.A0B(r10, r11)
            X.0qQ.A0B(r6, r9)
            r12 = 4
            X.0qQ.A0B(r4, r12)
            boolean r0 = X.C249223jK.A02(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03a8
            X.EW5 r3 = X.FGK.A00(r5)
            X.EW5 r1 = X.EW5.RecipientListBubbleOnly
            r0 = 1
            if (r3 == r1) goto L_0x03a9
        L_0x03a8:
            r0 = 0
        L_0x03a9:
            r8 = 8
            if (r0 == 0) goto L_0x0420
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r10.A01
            android.content.res.Resources r1 = X.DbU.A05(r7)
            r0 = 2131238158(0x7f081d0e, float:1.8092587E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass2dd.A00(r1, r0)
            X.0qQ.A07(r3)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 == 0) goto L_0x03d8
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r10.A04
            android.content.Context r1 = r0.getContext()
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r1 = X.AnonymousClass7TF.A03(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r7.setBackground(r0)
        L_0x03d8:
            r7.setImageDrawable(r3)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r10.A03
            r0.setVisibility(r8)
        L_0x03e0:
            r0 = 1
        L_0x03e1:
            r3 = 0
            if (r0 != 0) goto L_0x040d
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r10.A01
            com.instagram.user.model.User r0 = X.DbT.A0j(r5)
            X.DbU.A1S(r4, r1, r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r10.A03
            r12.setVisibility(r11)
            boolean r9 = X.C249223jK.A04(r5)
            boolean r8 = X.C249223jK.A05(r5)
            X.0Tu r7 = X.DbS.A0J(r5, r11)
            r0 = 36330084679827900(0x811205000041bc, double:3.038630068807601E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r12.A0I(r9, r11, r8, r0)
            r12.setCreationLayoutForShareSheet(r11)
        L_0x040d:
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A00
            r0 = 15
            X.FPI.A01(r1, r0, r6)
            if (r2 == 0) goto L_0x041a
            java.lang.String r3 = r2.getId()
        L_0x041a:
            java.lang.String r1 = "direct_share_sheet"
            java.lang.String r0 = "add_content_note"
            goto L_0x0a57
        L_0x0420:
            if (r2 == 0) goto L_0x04a4
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            if (r0 == 0) goto L_0x04a4
            boolean r0 = X.C249223jK.A02(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04a4
            X.EW5 r1 = X.FGK.A00(r5)
            X.EW5 r0 = X.EW5.RecipientListMediaPreviewOnly
            if (r1 != r0) goto L_0x04a4
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r10.A02
            com.instagram.common.typedurl.ImageUrl r0 = r2.A1Q()
            if (r0 == 0) goto L_0x04a7
            r9.setUrl(r0, r4)
            boolean r0 = r2.CeS()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r7 = r10.A04
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            if (r0 == 0) goto L_0x0487
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r7)
            r0 = 38
            int r0 = X.DbS.A02(r1, r0)
            r3.width = r0
            r0 = 52
            int r0 = X.DbS.A02(r1, r0)
            r3.height = r0
        L_0x0463:
            r7.setLayoutParams(r3)
            r7.setVisibility(r11)
            r9.setVisibility(r11)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r10.A01
            r0.setVisibility(r8)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r3 = r10.A03
            r0 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r3.setRotation(r0)
            r3.setVisibility(r11)
            X.DbY.A1L(r5, r3)
            int r0 = X.2Yu.A08(r1)
            r3.setCreationLayoutForShareSheet(r0)
            goto L_0x03e0
        L_0x0487:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r3, r0)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.content.Context r1 = r7.getContext()
            X.0qQ.A07(r1)
            int r0 = X.DbS.A02(r1, r12)
            r3.topMargin = r0
            r0 = 12
            int r0 = X.DbS.A02(r1, r0)
            r3.bottomMargin = r0
            goto L_0x0463
        L_0x04a4:
            r0 = 0
            goto L_0x03e1
        L_0x04a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04ac:
            X.1Xj r2 = r1.A02
            if (r2 == 0) goto L_0x04d2
            com.instagram.common.session.UserSession r0 = r1.A01
            com.instagram.user.model.User r0 = r2.A2A(r0)
            if (r0 == 0) goto L_0x04db
            java.lang.String r4 = r0.getUsername()
        L_0x04bc:
            X.Dow r10 = (X.C47004Dow) r10
            X.2FW r2 = r1.A0Z
            r0 = 2131959290(0x7f131dfa, float:1.9555216E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131959289(0x7f131df9, float:1.9555214E38)
            java.lang.String r0 = X.DbW.A0h(r3, r4, r0)
            X.C48881Elh.A00(r10, r2, r4, r1, r0)
            return
        L_0x04d2:
            java.lang.String r4 = r1.A0e
            if (r4 != 0) goto L_0x04bc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04db:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x04e0:
            java.util.List r0 = r1.A0I
            int r2 = r0.size()
            java.util.List r0 = r1.A0N
            int r0 = r0.size()
            X.Dns r10 = (X.C46938Dns) r10
            r3 = 2131972278(0x7f1350b6, float:1.958156E38)
            if (r2 == r0) goto L_0x065b
            r0 = 9
            X.FPI r2 = X.FPI.A00(r1, r0)
            r1 = 2131972279(0x7f1350b7, float:1.9581561E38)
            X.0qQ.A0B(r10, r11)
            android.widget.TextView r0 = r10.A01
            r0.setText(r3)
            android.widget.TextView r0 = r10.A00
            r0.setVisibility(r11)
            r0.setText(r1)
            X.AnonymousClass0fU.A00(r2, r0)
            return
        L_0x0510:
            java.util.LinkedHashSet r2 = r1.A0E
            com.instagram.model.direct.DirectAddToSpotlightShareTarget r0 = com.instagram.model.direct.DirectAddToSpotlightShareTarget.A00
            boolean r8 = r2.contains(r0)
            X.Doa r10 = (X.C46982Doa) r10
            com.instagram.common.session.UserSession r3 = r1.A01
            X.0iw r7 = r1.A0V
            X.1Xj r6 = r1.A02
            r0 = 24
            X.MJ3 r5 = new X.MJ3
            r5.<init>(r13, r0, r1)
            X.AnonymousClass7TF.A1B(r10, r11, r7)
            android.view.View r2 = r10.A00
            android.content.Context r4 = r2.getContext()
            r2.setVisibility(r11)
            r0 = 13
            X.FPI.A01(r2, r0, r5)
            android.widget.ImageView r1 = r10.A01
            r0 = 2131238099(0x7f081cd3, float:1.8092467E38)
            if (r8 == 0) goto L_0x0542
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
        L_0x0542:
            X.DbU.A13(r4, r1, r0)
            if (r6 == 0) goto L_0x0579
            com.instagram.common.typedurl.ImageUrl r1 = r6.A1Q()
            if (r1 != 0) goto L_0x0553
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A1n(r4)
            if (r1 == 0) goto L_0x0579
        L_0x0553:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A02
            r0.setUrl(r3, r1, r7)
        L_0x0558:
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.DbW.A1T(r0, r3)
            if (r0 == 0) goto L_0x0dd2
            r0 = 16
            int r1 = X.DbS.A02(r4, r0)
            int r0 = X.C49750F5b.A00(r4, r3)
            int r13 = r30 % r0
            int r0 = r0 + -1
            if (r13 != r0) goto L_0x0573
            X.0nA.A0b(r2, r1)
        L_0x0573:
            if (r13 != 0) goto L_0x0dd2
            X.0nA.A0Z(r2, r1)
            return
        L_0x0579:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A02
            r0.A09()
            goto L_0x0558
        L_0x057f:
            X.Dow r10 = (X.C47004Dow) r10
            X.2FW r1 = r1.A0Z
            java.lang.String r0 = ""
            X.C48881Elh.A00(r10, r1, r0, r12, r12)
            return
        L_0x0589:
            X.Dob r10 = (X.C46983Dob) r10
            X.0qQ.A0B(r10, r11)
            android.view.View r0 = r10.itemView
            X.0qQ.A06(r0)
            r0.setClickable(r9)
            android.view.View r0 = r10.itemView
            X.0qQ.A06(r0)
            r0.setFocusable(r9)
            android.view.View r1 = r10.itemView
            X.0qQ.A06(r1)
            android.view.View$OnClickListener r0 = r10.A00
            X.AnonymousClass0fU.A00(r0, r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r10.A03
            android.content.Context r1 = r2.getContext()
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            X.DbU.A13(r1, r2, r0)
            com.instagram.common.ui.base.IgTextView r2 = r10.A02
            android.content.Context r1 = r2.getContext()
            r0 = 2131959167(0x7f131d7f, float:1.9554967E38)
            X.DbT.A18(r1, r2, r0)
            com.instagram.common.ui.base.IgTextView r2 = r10.A01
            android.content.Context r1 = r2.getContext()
            r0 = 2131959166(0x7f131d7e, float:1.9554965E38)
            X.DbT.A18(r1, r2, r0)
            return
        L_0x05cd:
            r4 = 13
            java.util.List r3 = r1.A0H
            int r0 = r1.A01()
            goto L_0x0bd6
        L_0x05d7:
            X.1Xj r4 = r1.A02
            if (r4 == 0) goto L_0x05fe
            X.1Xy r0 = r4.A0C
            com.instagram.user.model.User r3 = r0.B9t()
            com.instagram.common.session.UserSession r0 = r1.A01
            com.instagram.user.model.User r2 = r4.A2A(r0)
            boolean r0 = r4.A4j()
            if (r0 != 0) goto L_0x05ee
            r3 = r2
        L_0x05ee:
            if (r3 == 0) goto L_0x0606
            java.lang.String r2 = r3.getUsername()
        L_0x05f4:
            if (r2 == 0) goto L_0x0601
            X.Dow r10 = (X.C47004Dow) r10
            X.2FW r0 = r1.A0Z
            X.C48881Elh.A00(r10, r0, r2, r12, r12)
            return
        L_0x05fe:
            java.lang.String r2 = r1.A0e
            goto L_0x05f4
        L_0x0601:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0606:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x060b:
            r4 = 14
            java.util.List r2 = r1.A0M
            int r0 = r1.A04()
            int r0 = r30 - r0
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r2 = r10
            r3 = r0
            r5 = r13
            r6 = r9
            goto L_0x0bf5
        L_0x0623:
            r4 = 12
            java.util.List r3 = r1.A0K
            int r2 = r1.A03()
            java.util.List r0 = r1.A0L
            int r0 = A09(r0, r2)
            goto L_0x0be7
        L_0x0633:
            X.Dns r10 = (X.C46938Dns) r10
            boolean r0 = r1.A05
            r3 = 2131972274(0x7f1350b2, float:1.958155E38)
            if (r0 == 0) goto L_0x065b
            r3 = 2131972273(0x7f1350b1, float:1.9581549E38)
            goto L_0x065b
        L_0x0640:
            X.Dns r10 = (X.C46938Dns) r10
            r3 = 2131972275(0x7f1350b3, float:1.9581553E38)
            goto L_0x065b
        L_0x0646:
            r4 = 19
            java.util.List r3 = r1.A0L
            int r0 = r1.A03()
            goto L_0x0be7
        L_0x0650:
            X.Dns r10 = (X.C46938Dns) r10
            r3 = 2131972277(0x7f1350b5, float:1.9581557E38)
            goto L_0x065b
        L_0x0656:
            X.Dns r10 = (X.C46938Dns) r10
            r3 = 2131972272(0x7f1350b0, float:1.9581547E38)
        L_0x065b:
            X.0qQ.A0B(r10, r11)
            android.widget.TextView r0 = r10.A01
            r0.setText(r3)
            return
        L_0x0664:
            X.1Xj r8 = r1.A02
            if (r8 == 0) goto L_0x0dd2
            java.lang.Object r0 = r4.getTag()
            boolean r3 = r0 instanceof X.C46957DoB
            r0 = 38
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            if (r3 == 0) goto L_0x07dc
            X.DoB r10 = (X.C46957DoB) r10
            X.G9Z r15 = r1.A0B
            com.instagram.common.session.UserSession r7 = r1.A01
            X.0qQ.A0C(r8, r4)
            X.0iw r0 = r1.A0V
            r22 = r0
            X.0qQ.A0B(r10, r11)
            X.0qQ.A0B(r15, r9)
            X.DbW.A1N(r8, r2, r0)
            java.lang.Integer r6 = X.C246353eS.A02(r7)
            if (r6 == 0) goto L_0x0dd2
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r10.A02
            android.content.Context r4 = r5.getContext()
            r5.setClickable(r9)
            r5.setFocusable(r9)
            r5.setGradientSpinnerVisible(r11)
            r0 = 2131238292(0x7f081d94, float:1.8092859E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 == 0) goto L_0x06b7
            android.graphics.drawable.Drawable r1 = r2.mutate()
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            X.DbU.A10(r4, r1, r0)
            r5.A0D(r2)
        L_0x06b7:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2eS.A04(r5, r1)
            X.Dfd r18 = X.C246353eS.A01(r8)
            int r0 = r18.ordinal()
            if (r0 == r9) goto L_0x07c8
            if (r0 == r14) goto L_0x07c2
            if (r0 != r11) goto L_0x07d7
            com.instagram.common.ui.base.IgTextView r3 = r10.A01
            r0 = 2131973454(0x7f13554e, float:1.9583944E38)
            if (r6 != r1) goto L_0x07cd
            r0 = 2131973450(0x7f13554a, float:1.9583936E38)
            r3.setText(r0)
            X.8jd r2 = X.C363388je.A00(r7)
            java.lang.String r0 = "DirectGridViewShareOwnClipToFacebookItemDefinition"
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A01(r0)
            r0 = 759(0x2f7, float:1.064E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r1, r12, r0, r11)
        L_0x06ea:
            X.0Tu r2 = X.0Tu.A05
            r16 = 36318234865506325(0x81073e00071815, double:3.031136198515265E-306)
            r0 = r16
            boolean r16 = X.182.A06(r2, r7, r0)
            android.widget.LinearLayout r1 = r10.A00
            r0 = 17
            if (r16 == 0) goto L_0x07bd
            r0 = 49
            r1.setGravity(r0)
        L_0x0702:
            boolean r0 = X.DbW.A1T(r2, r7)
            if (r0 == 0) goto L_0x0738
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0738
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0738
            android.view.ViewGroup$MarginLayoutParams r10 = X.DbX.A0G(r5)
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0H(r3)
            X.0qQ.A0A(r4)
            int r0 = A06(r4, r10)
            r5.A0B(r0, r0)
            r0 = 16
            X.C49750F5b.A01(r4, r10, r7, r0, r13)
            r5.setLayoutParams(r10)
            X.C49750F5b.A01(r4, r1, r7, r0, r13)
            r3.setLayoutParams(r1)
        L_0x0738:
            r0 = 36318234865571862(0x81073e00081816, double:3.0311361985567106E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0746
            r3.setTypeface(r12, r9)
        L_0x0746:
            X.HPj r1 = X.C59724JVi.A00(r8)
            boolean r0 = r1 instanceof X.KYX
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x078f
            r5.setAlpha(r2)
            X.FOW r0 = new X.FOW
            r14 = r11
            r15 = r22
            r16 = r8
            r17 = r1
            r19 = r7
            r20 = r4
            r21 = r6
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0766:
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x0769:
            int r0 = r6.intValue()
            if (r0 == r9) goto L_0x078c
            if (r0 != r11) goto L_0x07d2
            java.lang.String r3 = "recommend_on_facebook"
        L_0x0773:
            java.lang.String r4 = r8.A2n()
            com.instagram.user.model.User r0 = r8.A2A(r7)
            java.lang.String r5 = X.DbX.A0r(r0)
            r0 = r18
            X.Dpx r0 = X.F5Y.A00(r0, r7, r1)
            r1 = r22
            r2 = r7
            X.C22031Xty.A06(r0, r1, r2, r3, r4, r5)
            return
        L_0x078c:
            java.lang.String r3 = "crosspost_to_facebook"
            goto L_0x0773
        L_0x078f:
            boolean r0 = r18.A00()
            if (r0 == 0) goto L_0x079c
            r5.setAlpha(r2)
            r5.setOnClickListener(r12)
            goto L_0x0769
        L_0x079c:
            X.IwA r2 = new X.IwA
            r20 = r14
            r21 = r8
            r23 = r6
            r24 = r18
            r25 = r1
            r26 = r15
            r27 = r7
            r19 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            r0 = 19
            X.FPI r0 = X.FPI.A00(r2, r0)
            goto L_0x0766
        L_0x07bd:
            r1.setGravity(r0)
            goto L_0x0702
        L_0x07c2:
            com.instagram.common.ui.base.IgTextView r3 = r10.A01
            r0 = 2131973452(0x7f13554c, float:1.958394E38)
            goto L_0x07cd
        L_0x07c8:
            com.instagram.common.ui.base.IgTextView r3 = r10.A01
            r0 = 2131973451(0x7f13554b, float:1.9583938E38)
        L_0x07cd:
            r3.setText(r0)
            goto L_0x06ea
        L_0x07d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07dc:
            X.DpC r10 = (X.C47020DpC) r10
            X.G9Z r0 = r1.A0B
            r16 = r0
            com.instagram.common.session.UserSession r3 = r1.A01
            X.0qQ.A0C(r8, r4)
            X.0iw r0 = r1.A0V
            r24 = r0
            X.0qQ.A0B(r10, r11)
            r0 = r16
            X.0qQ.A0B(r0, r9)
            r0 = r24
            X.AnonymousClass7TF.A1D(r8, r2, r0)
            java.lang.Integer r6 = X.C246353eS.A02(r3)
            if (r6 == 0) goto L_0x0dd2
            android.view.View r0 = r10.itemView
            android.content.Context r7 = r0.getContext()
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r13)
            X.Dfd r4 = X.C246353eS.A01(r8)
            int r0 = r4.ordinal()
            if (r0 == r9) goto L_0x097a
            if (r0 == r14) goto L_0x0974
            if (r0 != r11) goto L_0x098f
            com.instagram.common.ui.base.IgTextView r1 = r10.A04
            r0 = 2131973454(0x7f13554e, float:1.9583944E38)
            if (r6 != r13) goto L_0x097f
            r0 = 2131973450(0x7f13554a, float:1.9583936E38)
            r1.setText(r0)
            X.8jd r14 = X.C363388je.A00(r3)
            com.facebook.common.callercontext.CallerContext r1 = X.C47743EFd.A00
            r0 = 759(0x2f7, float:1.064E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5 = r12
            r14.A02(r1, r12, r0, r11)
            X.Ju9 r14 = X.C367288qV.A01(r1, r3)
            X.8jd r0 = X.C363388je.A00(r3)
            X.5wF r0 = r0.A00(r1)
            boolean r0 = X.C363388je.A02(r0)
            if (r0 == 0) goto L_0x096e
            X.0Tu r15 = X.0Tu.A05
            r0 = 36330703155118818(0x811295000042e2, double:3.039021195071978E-306)
            boolean r0 = X.182.A06(r15, r3, r0)
            if (r0 == 0) goto L_0x096e
            r0 = 2131973567(0x7f1355bf, float:1.9584173E38)
            java.lang.String r0 = r7.getString(r0)
            if (r14 == 0) goto L_0x086f
        L_0x085c:
            com.instagram.common.ui.base.IgTextView r5 = r10.A03
            r15 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.String r1 = r14.A04
            java.lang.String r0 = X.DbV.A0u(r7, r1, r0, r15)
            r5.setText(r0)
            r5.setVisibility(r11)
            java.lang.String r5 = r14.A05
        L_0x086f:
            X.HPj r1 = X.C59724JVi.A00(r8)
            boolean r0 = r1 instanceof X.KYX
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x08d6
            android.view.View r0 = r10.itemView
            r0.setAlpha(r15)
            com.instagram.common.ui.base.IgTextView r2 = r10.A03
            r2.setVisibility(r11)
            r0 = 2131973453(0x7f13554d, float:1.9583942E38)
            r2.setText(r0)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r10.A02
            r0 = 2131238465(0x7f081e41, float:1.809321E38)
            X.DbU.A13(r7, r2, r0)
            android.view.View r0 = r10.itemView
            r14 = 8
            X.FOW r15 = new X.FOW
            r16 = r9
            r17 = r24
            r18 = r8
            r19 = r1
            r20 = r4
            r21 = r3
            r22 = r7
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r15, r0)
        L_0x08ad:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r10.A06
            r0.setVisibility(r14)
        L_0x08b2:
            int r0 = r6.intValue()
            if (r0 == r9) goto L_0x08d3
            if (r0 != r11) goto L_0x0985
            java.lang.String r9 = "recommend_on_facebook"
        L_0x08bc:
            java.lang.String r10 = r8.A2n()
            com.instagram.user.model.User r0 = r8.A2A(r3)
            java.lang.String r11 = X.DbX.A0r(r0)
            X.Dpx r6 = X.FC1.A00(r4, r3, r1)
            r7 = r24
            r8 = r3
            X.C22031Xty.A06(r6, r7, r8, r9, r10, r11)
            return
        L_0x08d3:
            java.lang.String r9 = "crosspost_to_facebook"
            goto L_0x08bc
        L_0x08d6:
            r14 = 8
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x08f3
            android.view.View r0 = r10.itemView
            r0.setAlpha(r15)
            android.view.View r0 = r10.itemView
            r0.setOnClickListener(r12)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r10.A02
            r0.setVisibility(r14)
            android.view.ViewStub r0 = r10.A01
            r0.setVisibility(r14)
            goto L_0x08ad
        L_0x08f3:
            X.IwA r7 = new X.IwA
            r17 = r8
            r18 = r24
            r19 = r6
            r20 = r4
            r21 = r1
            r22 = r16
            r23 = r3
            r15 = r7
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r2 = X.C246353eS.A0A(r3, r6)
            android.view.ViewStub r0 = r10.A01
            if (r2 == 0) goto L_0x0965
            r0.setVisibility(r11)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r10.A02
            r0.setVisibility(r14)
            android.view.View r2 = r10.itemView
            X.0qQ.A06(r2)
            int r0 = r6.intValue()
            if (r0 == r9) goto L_0x0962
            if (r0 != r11) goto L_0x098a
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0928:
            X.LRd r12 = new X.LRd
            r12.<init>(r2, r3, r0)
            X.LMN r2 = X.LMN.A05
            X.FbP r0 = new X.FbP
            r0.<init>(r7)
            r12.A03(r2, r0)
        L_0x0937:
            if (r5 == 0) goto L_0x095f
            if (r6 != r13) goto L_0x095f
            X.Dfd r0 = X.C46475Dfd.UNSHARED
            if (r4 != r0) goto L_0x095f
            android.content.Context r12 = X.DbS.A07(r10)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r10.A06
            r0 = r24
            X.AnonymousClass3YO.A00(r12, r0, r2, r5)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r10.A05
        L_0x094c:
            r0.setVisibility(r14)
            android.view.View r2 = r10.itemView
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            android.view.View r2 = r10.itemView
            r0 = 20
            X.FPI.A01(r2, r0, r7)
            goto L_0x08b2
        L_0x095f:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r10.A06
            goto L_0x094c
        L_0x0962:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0928
        L_0x0965:
            r0.setVisibility(r14)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r10.A02
            r0.setVisibility(r11)
            goto L_0x0937
        L_0x096e:
            if (r14 == 0) goto L_0x086f
            java.lang.String r0 = r14.A02
            goto L_0x085c
        L_0x0974:
            com.instagram.common.ui.base.IgTextView r1 = r10.A04
            r0 = 2131973452(0x7f13554c, float:1.958394E38)
            goto L_0x097f
        L_0x097a:
            com.instagram.common.ui.base.IgTextView r1 = r10.A04
            r0 = 2131973451(0x7f13554b, float:1.9583938E38)
        L_0x097f:
            r1.setText(r0)
            r5 = r12
            goto L_0x086f
        L_0x0985:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x098a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x098f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0994:
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof X.C47039DpZ
            if (r0 == 0) goto L_0x0aaa
            android.view.View r6 = r10.itemView
            X.0qQ.A06(r6)
            com.instagram.common.session.UserSession r5 = r1.A01
            X.0iw r4 = r1.A0V
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x0aa7
            java.lang.String r3 = r0.getId()
        L_0x09ad:
            int r0 = r1.A00
            r17 = r0
            java.lang.Integer r7 = r1.A00
            boolean r0 = r1.A02
            r16 = r0
            X.DbW.A1N(r4, r14, r7)
            java.lang.Object r6 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.adapter.sharesheet.itemdefinition.DirectGridViewReshareToStoryItemDefinition.ViewHolder"
            X.0qQ.A0C(r6, r0)
            X.DpZ r6 = (X.C47039DpZ) r6
            if (r17 == 0) goto L_0x0a0c
            android.view.View r0 = r6.itemView
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r8 = r6.A04
            com.instagram.common.typedurl.ImageUrl r0 = X.DbX.A0X(r5)
            r8.A0F(r12, r4, r0)
            com.instagram.common.ui.base.IgTextView r15 = r6.A02
            r8 = 2131973599(0x7f1355df, float:1.9584238E38)
            r15.setText(r8)
            X.DbY.A12(r15, r14)
            android.view.View r0 = r6.itemView
            X.DbU.A12(r14, r0, r8)
            android.widget.LinearLayout r12 = r6.A01
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r6.A03
            X.F5X.A00(r12, r5, r10)
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0a09
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.DbW.A1T(r0, r5)
            if (r0 == 0) goto L_0x0a09
            android.view.ViewGroup$MarginLayoutParams r8 = X.DbX.A0H(r12)
            r0 = 16
            X.C49750F5b.A01(r14, r8, r5, r0, r13)
            r12.setLayoutParams(r8)
        L_0x0a09:
            X.F5X.A01(r15, r5, r10)
        L_0x0a0c:
            android.view.View r0 = r6.itemView
            r0.setClickable(r9)
            android.view.View r0 = r6.itemView
            r0.setFocusable(r9)
            android.view.View r8 = r6.itemView
            r0 = r17
            X.FPA.A00(r8, r1, r6, r0, r2)
            android.view.View r0 = r6.itemView
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r6.A04
            if (r7 != r0) goto L_0x0a5b
            r2.setGradientSpinnerVisible(r11)
        L_0x0a2d:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0a53
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.DbW.A1T(r0, r5)
            if (r0 == 0) goto L_0x0a53
            android.view.ViewGroup$MarginLayoutParams r6 = X.DbX.A0H(r2)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r2)
            int r0 = A06(r1, r6)
            r2.A0B(r0, r0)
            r0 = 6
            X.C49750F5b.A01(r1, r6, r5, r0, r13)
            r2.setLayoutParams(r6)
        L_0x0a53:
            java.lang.String r1 = "direct_share_sheet"
            java.lang.String r0 = "add_to_your_story"
        L_0x0a57:
            X.C22031Xty.A0E(r4, r5, r3, r1, r0)
            return
        L_0x0a5b:
            r2.setGradientSpinnerVisible(r9)
            com.instagram.reels.store.ReelStore r8 = X.1OP.A05(r5)
            java.lang.String r0 = r5.A06
            com.instagram.model.reels.Reel r8 = r8.A0M(r0)
            if (r8 == 0) goto L_0x0aa3
            boolean r0 = r8.A16(r5)
            if (r0 != 0) goto L_0x0aa3
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            if (r7 != r10) goto L_0x0a78
            r0 = 2132017476(0x7f140144, float:1.9673231E38)
        L_0x0a78:
            r2.setGradientColorRes(r0)
            r2.setGradientSpinnerActivated(r9)
            X.3ID r0 = r8.A0C(r5)
            if (r0 == 0) goto L_0x0a8b
            android.content.Context r0 = X.DbS.A07(r6)
            X.0qQ.A07(r0)
        L_0x0a8b:
            r0 = 39
            X.FPE.A01(r2, r0, r1, r6)
            if (r16 == 0) goto L_0x0a2d
            r1.A02 = r11
            r2.A08()
            android.view.View r0 = r6.A00
            X.F1w r1 = X.C48781Ek4.A00(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.A00(r0)
            goto L_0x0a2d
        L_0x0aa3:
            r2.setGradientSpinnerActivated(r11)
            goto L_0x0a8b
        L_0x0aa7:
            r3 = r12
            goto L_0x09ad
        L_0x0aaa:
            X.Dpa r10 = (X.C47040Dpa) r10
            com.instagram.common.session.UserSession r13 = r1.A01
            X.0iw r8 = r1.A0V
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x0ab8
            java.lang.String r12 = r0.getId()
        L_0x0ab8:
            int r0 = r1.A00
            java.lang.Integer r7 = r1.A00
            boolean r6 = r1.A0m
            boolean r5 = r1.A02
            X.0qQ.A0B(r10, r11)
            X.DbW.A1N(r8, r14, r7)
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r10.A06
            switch(r0) {
                case 1: goto L_0x0b73;
                case 2: goto L_0x0acb;
                case 3: goto L_0x0b77;
                case 4: goto L_0x0b7b;
                case 5: goto L_0x0acb;
                case 6: goto L_0x0b7f;
                case 7: goto L_0x0b83;
                case 8: goto L_0x0b83;
                case 9: goto L_0x0b83;
                case 10: goto L_0x0b87;
                case 11: goto L_0x0b8b;
                case 12: goto L_0x0b8f;
                case 13: goto L_0x0b93;
                case 14: goto L_0x0b97;
                case 15: goto L_0x0acb;
                case 16: goto L_0x0b9b;
                case 17: goto L_0x0acb;
                case 18: goto L_0x0b9f;
                case 19: goto L_0x0acb;
                case 20: goto L_0x0acb;
                case 21: goto L_0x0acb;
                case 22: goto L_0x0ba3;
                case 23: goto L_0x0ba7;
                case 24: goto L_0x0b6f;
                default: goto L_0x0acb;
            }
        L_0x0acb:
            android.widget.TextView r2 = r10.A04
            if (r6 == 0) goto L_0x0b6b
            r0 = 2131968830(0x7f13433e, float:1.9574566E38)
            r2.setText(r0)
            r0 = 0
        L_0x0ad6:
            r2.setVisibility(r0)
            android.view.View r0 = r10.itemView
            r0.setClickable(r9)
            android.view.View r0 = r10.itemView
            r0.setFocusable(r9)
            android.view.View r2 = r10.itemView
            android.view.View$OnClickListener r0 = r10.A01
            X.AnonymousClass0fU.A00(r0, r2)
            android.view.View r0 = r10.itemView
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r3)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = r10.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r7 != r0) goto L_0x0b0a
            r0 = 4
            r4.setVisibility(r0)
            X.3oV r1 = r10.A07
            r0 = 8
            r1.setVisibility(r0)
        L_0x0b02:
            java.lang.String r1 = "direct_share_sheet"
            java.lang.String r0 = "add_to_your_story"
            X.C22031Xty.A0E(r8, r13, r12, r1, r0)
            return
        L_0x0b0a:
            X.3oV r6 = r10.A07
            r6.setVisibility(r11)
            r4.setVisibility(r11)
            com.instagram.reels.store.ReelStore r2 = X.1OP.A05(r13)
            java.lang.String r0 = r13.A06
            com.instagram.model.reels.Reel r2 = r2.A0M(r0)
            if (r2 == 0) goto L_0x0b67
            boolean r0 = r2.A16(r13)
            if (r0 != 0) goto L_0x0b67
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            if (r7 != r3) goto L_0x0b2c
            r0 = 2132017476(0x7f140144, float:1.9673231E38)
        L_0x0b2c:
            r4.setGradientColors((int) r0)
            r4.A02()
            X.3ID r3 = r2.A0C(r13)
            android.content.Context r0 = X.DbS.A07(r10)
            if (r3 == 0) goto L_0x0b4f
            r6.setVisibility(r11)
            android.view.View r2 = r6.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.0qQ.A0A(r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C49100EpP.A00(r0, r3)
            r2.setUrl(r0, r8)
        L_0x0b4f:
            android.view.View$OnClickListener r0 = r10.A02
            X.AnonymousClass0fU.A00(r0, r14)
            if (r5 == 0) goto L_0x0b02
            r1.A02 = r11
            r4.A05()
            android.view.View r0 = r10.A03
            X.F1w r1 = X.C48781Ek4.A00(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.A00(r0)
            goto L_0x0b02
        L_0x0b67:
            r4.A04()
            goto L_0x0b4f
        L_0x0b6b:
            r0 = 8
            goto L_0x0ad6
        L_0x0b6f:
            r4 = 2131973444(0x7f135544, float:1.9583924E38)
            goto L_0x0baa
        L_0x0b73:
            r4 = 2131969664(0x7f134680, float:1.9576257E38)
            goto L_0x0baa
        L_0x0b77:
            r4 = 2131969666(0x7f134682, float:1.9576261E38)
            goto L_0x0baa
        L_0x0b7b:
            r4 = 2131973501(0x7f13557d, float:1.958404E38)
            goto L_0x0baa
        L_0x0b7f:
            r4 = 2131969665(0x7f134681, float:1.957626E38)
            goto L_0x0baa
        L_0x0b83:
            r4 = 2131973478(0x7f135566, float:1.9583993E38)
            goto L_0x0baa
        L_0x0b87:
            r4 = 2131973522(0x7f135592, float:1.9584082E38)
            goto L_0x0baa
        L_0x0b8b:
            r4 = 2131973499(0x7f13557b, float:1.9584036E38)
            goto L_0x0baa
        L_0x0b8f:
            r4 = 2131973500(0x7f13557c, float:1.9584038E38)
            goto L_0x0baa
        L_0x0b93:
            r4 = 2131973477(0x7f135565, float:1.958399E38)
            goto L_0x0baa
        L_0x0b97:
            r4 = 2131973475(0x7f135563, float:1.9583987E38)
            goto L_0x0baa
        L_0x0b9b:
            r4 = 2131973449(0x7f135549, float:1.9583934E38)
            goto L_0x0baa
        L_0x0b9f:
            r4 = 2131973481(0x7f135569, float:1.9584E38)
            goto L_0x0baa
        L_0x0ba3:
            r4 = 2131973457(0x7f135551, float:1.958395E38)
            goto L_0x0baa
        L_0x0ba7:
            r4 = 2131973448(0x7f135548, float:1.9583932E38)
        L_0x0baa:
            android.content.Context r3 = X.DbS.A07(r10)
            com.instagram.user.model.User r0 = X.DbT.A0j(r13)
            X.DbU.A1S(r8, r14, r0)
            android.widget.TextView r2 = r10.A05
            r2.setText(r4)
            int r0 = r10.A00
            r2.setTextColor(r0)
            android.view.View r0 = r10.itemView
            X.DbU.A12(r3, r0, r4)
            goto L_0x0acb
        L_0x0bc6:
            r4 = 6
            java.util.List r3 = r1.A0Q
            int r0 = r1.A02()
            goto L_0x0bd6
        L_0x0bce:
            r4 = 11
            java.util.List r3 = r1.A0G
            int r0 = r1.A00()
        L_0x0bd6:
            int r0 = r30 - r0
            goto L_0x0beb
        L_0x0bd9:
            r4 = 30
            java.util.List r3 = r1.A0F
            int r2 = r1.A04()
            java.util.List r0 = r1.A0M
            int r0 = A09(r0, r2)
        L_0x0be7:
            int r0 = r30 - r0
            int r0 = r0 + -1
        L_0x0beb:
            java.lang.Object r0 = r3.get(r0)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r2 = r10
            r3 = r0
            r5 = r13
            r6 = r11
        L_0x0bf5:
            r1.A0B(r2, r3, r4, r5, r6)
            return
        L_0x0bf9:
            boolean r0 = r1.A03
            r7 = r0 ^ 1
            java.lang.Object r4 = r4.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.search.SearchFooterViewBinder.Holder"
            X.0qQ.A0C(r4, r0)
            X.EyR r4 = (X.EyR) r4
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0c30
            r2 = 2131972817(0x7f1352d1, float:1.9582652E38)
            java.lang.String r0 = r1.A01
            java.lang.String r5 = X.DbW.A0h(r3, r0, r2)
        L_0x0c15:
            boolean r2 = r1.A03
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r2 == 0) goto L_0x0c1f
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
        L_0x0c1f:
            int r6 = X.AnonymousClass7TF.A03(r3, r0)
            r2 = r3
            r3 = r1
            X.C49163EqU.A00(r2, r3, r4, r5, r6, r7)
            if (r7 == 0) goto L_0x0dd2
            X.G9Z r0 = r1.A0B
            r0.Dhz()
            return
        L_0x0c30:
            r0 = 2131972868(0x7f135304, float:1.9582756E38)
            java.lang.String r5 = r3.getString(r0)
            goto L_0x0c15
        L_0x0c38:
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof X.C47041Dpb
            if (r0 == 0) goto L_0x0dd2
            r13 = r10
            X.Dpb r13 = (X.C47041Dpb) r13
            X.G9Z r8 = r1.A0B
            com.instagram.common.session.UserSession r7 = r1.A01
            X.1Xj r0 = r1.A02
            r19 = r0
            X.0iw r6 = r1.A0V
            android.view.View r0 = r10.itemView
            X.0qQ.A06(r0)
            int r0 = r1.A0U
            r18 = r0
            java.lang.Integer r10 = r1.A00
            boolean r0 = r1.A02
            r17 = r0
            X.0qQ.A0B(r13, r11)
            X.DbW.A1N(r8, r9, r6)
            r15 = 8
            X.0qQ.A0B(r10, r15)
            if (r19 == 0) goto L_0x0dbd
            boolean r0 = r19.A4U()
            if (r0 == 0) goto L_0x0d40
            android.view.ViewGroup r0 = r13.A01
            r2 = 0
            if (r0 == 0) goto L_0x0efa
            android.content.Context r5 = r0.getContext()
            r0.setClickable(r9)
        L_0x0c7b:
            android.view.ViewGroup r0 = r13.A01
            if (r0 == 0) goto L_0x0c82
            r0.setFocusable(r9)
        L_0x0c82:
            com.instagram.common.ui.base.IgFrameLayout r0 = r13.A0I
            r0.setVisibility(r11)
            android.view.View r0 = r13.itemView
            X.2eS.A01(r0)
            com.instagram.common.ui.base.IgTextView r0 = r13.A07
            r4 = 4
            if (r0 == 0) goto L_0x0c94
            r0.setTextAlignment(r4)
        L_0x0c94:
            com.instagram.common.ui.base.IgTextView r3 = r13.A07
            if (r3 == 0) goto L_0x0ca4
            if (r5 == 0) goto L_0x0ef7
            r0 = 2131960037(0x7f1320e5, float:1.9556731E38)
            java.lang.String r0 = r5.getString(r0)
        L_0x0ca1:
            r3.setText(r0)
        L_0x0ca4:
            android.view.View r3 = r13.itemView
            if (r5 == 0) goto L_0x0ef4
            r0 = 2131960037(0x7f1320e5, float:1.9556731E38)
            java.lang.String r0 = r5.getString(r0)
        L_0x0caf:
            r3.setContentDescription(r0)
            com.instagram.common.ui.base.IgTextView r0 = r13.A07
            if (r0 == 0) goto L_0x0cbb
            if (r5 == 0) goto L_0x0d40
            X.DbY.A12(r0, r5)
        L_0x0cbb:
            boolean r0 = X.C249223jK.A02(r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0e37
            X.EW5 r3 = X.FGK.A00(r7)
            X.EW5 r0 = X.EW5.RecipientListBubbleOnly
            if (r3 != r0) goto L_0x0e37
            if (r5 == 0) goto L_0x0d40
            android.content.res.Resources r2 = r5.getResources()
            if (r2 == 0) goto L_0x0d40
            r0 = 2131238158(0x7f081d0e, float:1.8092587E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass2dd.A00(r2, r0)
            X.0qQ.A07(r3)
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 == 0) goto L_0x0cf6
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r13.A09
            if (r4 == 0) goto L_0x0cf6
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r2 = X.AnonymousClass7TF.A03(r5, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r4.setBackground(r0)
        L_0x0cf6:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r13.A09
            if (r0 == 0) goto L_0x0cfd
            r0.setImageDrawable(r3)
        L_0x0cfd:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r13.A0D
            if (r0 == 0) goto L_0x0d04
            r0.setVisibility(r15)
        L_0x0d04:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r13.A0D
            if (r0 == 0) goto L_0x0d0b
            X.DbY.A1L(r7, r0)
        L_0x0d0b:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = r13.A0D
            if (r2 == 0) goto L_0x0d16
            int r0 = X.2Yu.A08(r5)
            r2.setCreationLayoutForShareSheetSuggestedGrid(r0)
        L_0x0d16:
            android.widget.LinearLayout r2 = r13.A03
            if (r2 == 0) goto L_0x0d40
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A0B
            if (r0 == 0) goto L_0x0d40
            X.F5X.A00(r2, r7, r0)
            com.instagram.common.ui.base.IgTextView r2 = r13.A07
            if (r2 == 0) goto L_0x0d40
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A0B
            if (r0 == 0) goto L_0x0d40
            X.F5X.A01(r2, r7, r0)
            android.view.ViewGroup r2 = r13.A01
            if (r2 == 0) goto L_0x0d35
            r0 = 16
            X.FPI.A01(r2, r0, r8)
        L_0x0d35:
            java.lang.String r3 = r19.getId()
            java.lang.String r2 = "direct_share_sheet"
            java.lang.String r0 = "add_content_note"
            X.C22031Xty.A0E(r6, r7, r3, r2, r0)
        L_0x0d40:
            r0 = r19
            boolean r0 = X.C48782Ek5.A00(r7, r0)
            if (r0 == 0) goto L_0x0dbd
            java.lang.String r3 = r19.getId()
            com.instagram.common.ui.base.IgFrameLayout r0 = r13.A0J
            r0.setVisibility(r11)
            if (r18 == 0) goto L_0x0d93
            android.view.View r0 = r13.itemView
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r13.A0E
            if (r2 == 0) goto L_0x0d64
            com.instagram.common.typedurl.ImageUrl r0 = X.DbX.A0X(r7)
            r2.A0F(r12, r6, r0)
        L_0x0d64:
            com.instagram.common.ui.base.IgTextView r2 = r13.A08
            if (r2 == 0) goto L_0x0d6e
            r0 = 2131973599(0x7f1355df, float:1.9584238E38)
            r2.setText(r0)
        L_0x0d6e:
            com.instagram.common.ui.base.IgTextView r0 = r13.A08
            if (r0 == 0) goto L_0x0d75
            X.DbY.A12(r0, r4)
        L_0x0d75:
            android.view.View r2 = r13.itemView
            r0 = 2131973599(0x7f1355df, float:1.9584238E38)
            X.DbU.A12(r4, r2, r0)
            android.widget.LinearLayout r2 = r13.A04
            if (r2 == 0) goto L_0x0d93
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A0C
            if (r0 == 0) goto L_0x0d93
            X.F5X.A00(r2, r7, r0)
            com.instagram.common.ui.base.IgTextView r2 = r13.A08
            if (r2 == 0) goto L_0x0d93
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A0C
            if (r0 == 0) goto L_0x0d93
            X.F5X.A01(r2, r7, r0)
        L_0x0d93:
            android.view.View r0 = r13.itemView
            r0.setClickable(r9)
            android.view.View r0 = r13.itemView
            r0.setFocusable(r9)
            android.view.View r2 = r13.itemView
            r0 = r18
            X.FPA.A00(r2, r1, r13, r0, r14)
            android.view.View r0 = r13.itemView
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r13.A0E
            if (r10 != r2) goto L_0x0dd3
            if (r0 == 0) goto L_0x0db6
            r0.setGradientSpinnerVisible(r11)
        L_0x0db6:
            java.lang.String r1 = "direct_share_sheet"
            java.lang.String r0 = "add_to_your_story"
            X.C22031Xty.A0E(r6, r7, r3, r1, r0)
        L_0x0dbd:
            com.instagram.common.ui.base.IgLinearLayout r5 = r13.A0K
            r5.setClickable(r9)
            com.instagram.common.ui.base.IgTextView r1 = r13.A0L
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r13.A0M
            X.F5X.A01(r1, r7, r0)
            r0 = 17
            X.FPI r8 = X.FPI.A00(r8, r0)
        L_0x0dcf:
            X.AnonymousClass0fU.A00(r8, r5)
        L_0x0dd2:
            return
        L_0x0dd3:
            if (r0 == 0) goto L_0x0dd8
            r0.setGradientSpinnerVisible(r9)
        L_0x0dd8:
            com.instagram.reels.store.ReelStore r2 = X.1OP.A05(r7)
            java.lang.String r0 = r7.A06
            com.instagram.model.reels.Reel r4 = r2.A0M(r0)
            if (r4 == 0) goto L_0x0e2f
            boolean r0 = r4.A16(r7)
            if (r0 != 0) goto L_0x0e2f
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r13.A0E
            if (r2 == 0) goto L_0x0df9
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            if (r10 != r5) goto L_0x0df6
            r0 = 2132017476(0x7f140144, float:1.9673231E38)
        L_0x0df6:
            r2.setGradientColorRes(r0)
        L_0x0df9:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r13.A0E
            if (r0 == 0) goto L_0x0e00
            r0.setGradientSpinnerActivated(r9)
        L_0x0e00:
            X.3ID r0 = r4.A0C(r7)
            if (r0 == 0) goto L_0x0e0d
            android.content.Context r0 = X.DbS.A07(r13)
            X.0qQ.A07(r0)
        L_0x0e0d:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r13.A0E
            if (r2 == 0) goto L_0x0e16
            r0 = 38
            X.FPE.A01(r2, r0, r1, r13)
        L_0x0e16:
            if (r17 == 0) goto L_0x0db6
            r1.A02 = r11
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r13.A0E
            if (r0 == 0) goto L_0x0e21
            r0.A08()
        L_0x0e21:
            android.view.View r0 = r13.A00
            if (r0 == 0) goto L_0x0dbd
            X.F1w r1 = X.C48781Ek4.A00(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.A00(r0)
            goto L_0x0db6
        L_0x0e2f:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r13.A0E
            if (r0 == 0) goto L_0x0e0d
            r0.setGradientSpinnerActivated(r11)
            goto L_0x0e0d
        L_0x0e37:
            com.instagram.common.typedurl.ImageUrl r0 = r19.A1Q()
            if (r0 == 0) goto L_0x0ee0
            boolean r0 = X.C249223jK.A02(r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0ee0
            X.EW5 r3 = X.FGK.A00(r7)
            X.EW5 r0 = X.EW5.RecipientListMediaPreviewOnly
            if (r3 != r0) goto L_0x0ee0
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r13.A0A
            if (r3 == 0) goto L_0x0e5a
            com.instagram.common.typedurl.ImageUrl r0 = r19.A1Q()
            if (r0 == 0) goto L_0x0efd
            r3.setUrl(r0, r6)
        L_0x0e5a:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r13.A0F
            if (r0 == 0) goto L_0x0ede
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
        L_0x0e62:
            java.lang.String r16 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0 = r16
            X.0qQ.A0C(r3, r0)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r0 = r19.CeS()
            if (r0 == 0) goto L_0x0ec8
            if (r5 == 0) goto L_0x0d40
            r0 = 56
            int r0 = X.DbS.A02(r5, r0)
            r3.width = r0
            r0 = 73
            int r0 = X.DbS.A02(r5, r0)
            r3.height = r0
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r13.A0F
            if (r0 == 0) goto L_0x0e8a
            r0.setLayoutParams(r3)
        L_0x0e8a:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r13.A0F
            if (r0 == 0) goto L_0x0e91
            r0.setVisibility(r11)
        L_0x0e91:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A0A
            if (r0 == 0) goto L_0x0e98
            r0.setVisibility(r11)
        L_0x0e98:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r13.A09
            if (r0 == 0) goto L_0x0e9f
            r0.setVisibility(r15)
        L_0x0e9f:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r13.A0D
            if (r0 == 0) goto L_0x0ea7
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0ea7:
            r0 = r16
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0 = 12
            int r0 = X.DbS.A02(r5, r0)
            r2.topMargin = r0
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r13.A0D
            if (r0 == 0) goto L_0x0ebd
            r0.setLayoutParams(r2)
        L_0x0ebd:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = r13.A0D
            if (r2 == 0) goto L_0x0d04
            r0 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r2.setRotation(r0)
            goto L_0x0d04
        L_0x0ec8:
            if (r5 == 0) goto L_0x0d40
            int r0 = X.DbS.A02(r5, r4)
            r3.topMargin = r0
            int r0 = X.DbS.A02(r5, r4)
            r3.bottomMargin = r0
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r13.A0F
            if (r0 == 0) goto L_0x0e8a
            r0.setLayoutParams(r3)
            goto L_0x0e8a
        L_0x0ede:
            r3 = r2
            goto L_0x0e62
        L_0x0ee0:
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r13.A09
            if (r2 == 0) goto L_0x0eeb
            com.instagram.user.model.User r0 = X.DbT.A0j(r7)
            X.DbU.A1S(r6, r2, r0)
        L_0x0eeb:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r13.A0D
            if (r0 == 0) goto L_0x0d04
            r0.setVisibility(r11)
            goto L_0x0d04
        L_0x0ef4:
            r0 = r2
            goto L_0x0caf
        L_0x0ef7:
            r0 = r2
            goto L_0x0ca1
        L_0x0efa:
            r5 = r2
            goto L_0x0c7b
        L_0x0efd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0f02:
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r4, r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r4 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r4
            int r0 = r1.A0A
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r4.setVisibilityOfCustomActionButton(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A02() {
        /*
            r5 = this;
            int r4 = super.getItemCount()
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x000f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            boolean r3 = r5.A0R
            if (r0 == 0) goto L_0x0040
            X.1Xj r2 = r5.A02
            if (r2 == 0) goto L_0x0040
            r1 = 0
            X.3de r0 = new X.3de
            r0.<init>(r2, r1)
            com.instagram.common.session.UserSession r2 = r5.A01
            boolean r0 = X.C245953dk.A00(r2, r0)
            if (r0 == 0) goto L_0x002e
            X.FGK r0 = X.FGK.A00
            boolean r0 = r0.A06(r2)
            if (r0 != 0) goto L_0x003e
        L_0x002e:
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.DbW.A1T(r0, r2)
            boolean r0 = r5.A06
            r0 = r0 ^ 1
            boolean r0 = X.FGK.A02(r2, r3, r1, r0)
            if (r0 == 0) goto L_0x0040
        L_0x003e:
            int r4 = r4 + 1
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.A02():int");
    }

    private final int A04() {
        return A09(this.A0I, DbT.A01(this.A0Q, A02()));
    }

    private final int A05() {
        return A09(this.A0F, A09(this.A0M, A04()));
    }

    public static int A09(List list, int i) {
        return i + (list.isEmpty() ^ true ? 1 : 0) + list.size();
    }

    private final ArrayList A0A(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (this.A0E.contains(next)) {
                if (!A1C.contains(next)) {
                    if (!182.A06(0Tu.A05, this.A01, 36329908586168696L)) {
                    }
                }
            }
            A1C.add(next);
        }
        return A1C;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(593665726);
        int A012 = DbT.A01(this.A0H, A01()) + (this.A07 ? 1 : 0) + (A0C(this) ? 1 : 0);
        AnonymousClass0fD.A0A(-904915133, A032);
        return A012;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r8 = (r8 - r0) - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long getItemId(int r8) {
        /*
            r7 = this;
            r0 = -1206138037(0xffffffffb81bcb4b, float:-3.714421E-5)
            int r3 = X.AnonymousClass0fD.A03(r0)
            int r1 = r7.getItemViewType(r8)
            if (r1 == 0) goto L_0x0092
            r0 = 1
            if (r1 == r0) goto L_0x0092
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 == r0) goto L_0x0092
            r0 = 24
            if (r1 == r0) goto L_0x0092
            r0 = 27
            if (r1 == r0) goto L_0x0092
            switch(r1) {
                case 5: goto L_0x0092;
                case 6: goto L_0x0049;
                case 7: goto L_0x0092;
                case 8: goto L_0x0092;
                case 9: goto L_0x0092;
                case 10: goto L_0x0050;
                case 11: goto L_0x0042;
                case 12: goto L_0x006b;
                case 13: goto L_0x0092;
                case 14: goto L_0x005d;
                default: goto L_0x0021;
            }
        L_0x0021:
            switch(r1) {
                case 33: goto L_0x0092;
                case 34: goto L_0x0092;
                case 35: goto L_0x0035;
                case 36: goto L_0x0092;
                case 37: goto L_0x0073;
                case 38: goto L_0x0092;
                case 39: goto L_0x0092;
                case 40: goto L_0x0092;
                case 41: goto L_0x0092;
                case 42: goto L_0x0092;
                case 43: goto L_0x0092;
                case 44: goto L_0x0094;
                case 45: goto L_0x0092;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 28
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r1 = X.DbW.A0b(r0, r1)
            r0 = 1314280758(0x4e565536, float:8.9897715E8)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0035:
            java.util.List r2 = r7.A0F
            int r1 = r7.A04()
            java.util.List r0 = r7.A0M
            int r0 = A09(r0, r1)
            goto L_0x0079
        L_0x0042:
            java.util.List r2 = r7.A0G
            int r0 = r7.A00()
            goto L_0x0071
        L_0x0049:
            java.util.List r2 = r7.A0L
            int r0 = r7.A03()
            goto L_0x0079
        L_0x0050:
            java.util.List r2 = r7.A0K
            int r1 = r7.A03()
            java.util.List r0 = r7.A0L
            int r0 = A09(r0, r1)
            goto L_0x0079
        L_0x005d:
            java.util.List r2 = r7.A0M
            int r0 = r7.A04()
            goto L_0x0079
        L_0x0064:
            java.util.List r2 = r7.A0Q
            int r0 = r7.A02()
            goto L_0x0071
        L_0x006b:
            java.util.List r2 = r7.A0H
            int r0 = r7.A01()
        L_0x0071:
            int r8 = r8 - r0
            goto L_0x007c
        L_0x0073:
            java.util.List r2 = r7.A0P
            int r0 = r7.A05()
        L_0x0079:
            int r8 = r8 - r0
            int r8 = r8 + -1
        L_0x007c:
            java.lang.Object r6 = X.DbX.A0n(r2, r8)
            java.util.HashMap r2 = r7.A0D
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00bf
            long r4 = A0o
            r0 = 1
            long r0 = r0 + r4
            A0o = r0
            goto L_0x00b8
        L_0x0092:
            long r1 = (long) r1
            goto L_0x00c3
        L_0x0094:
            java.util.List r2 = r7.A0I
            int r1 = r7.A02()
            java.util.List r0 = r7.A0Q
            int r0 = X.DbT.A01(r0, r1)
            int r8 = r8 - r0
            int r0 = r8 + -1
            java.lang.Object r6 = X.DbX.A0n(r2, r0)
            java.util.HashMap r2 = r7.A0C
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00bf
            long r4 = A0n
            r0 = 1
            long r0 = r0 + r4
            A0n = r0
        L_0x00b8:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.put(r6, r0)
        L_0x00bf:
            long r1 = r0.longValue()
        L_0x00c3:
            r0 = -496310114(0xffffffffe26ae89e, float:-1.083325E21)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.getItemId(int):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0187, code lost:
        if (r7 < A01()) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r7) {
        /*
            r6 = this;
            r0 = 1681903981(0x643fd16d, float:1.4153675E22)
            int r2 = X.AnonymousClass0fD.A03(r0)
            int r0 = super.getItemCount()
            if (r7 >= r0) goto L_0x0018
            int r5 = super.getItemViewType(r7)
            r0 = -2071273474(0xffffffff848adffe, float:-3.264935E-36)
        L_0x0014:
            X.AnonymousClass0fD.A0A(r0, r2)
            return r5
        L_0x0018:
            int r0 = r6.A02()
            r4 = 1
            if (r7 >= r0) goto L_0x0037
            com.instagram.common.session.UserSession r4 = r6.A01
            boolean r3 = r6.A0R
            boolean r1 = r6.A0i
            boolean r0 = r6.A0g
            r0 = r0 ^ 1
            boolean r0 = X.FGK.A02(r4, r3, r1, r0)
            r5 = 40
            if (r0 == 0) goto L_0x0033
            r5 = 42
        L_0x0033:
            r0 = 1017625201(0x3ca7ba71, float:0.020474644)
            goto L_0x0014
        L_0x0037:
            int r0 = r6.A02()
            if (r7 >= r0) goto L_0x0043
            r5 = 22
            r0 = 100799777(0x6021521, float:2.4465806E-35)
            goto L_0x0014
        L_0x0043:
            int r0 = r6.A04()
            if (r7 >= r0) goto L_0x009d
            int r0 = r6.A02()
            java.util.List r1 = r6.A0Q
            int r0 = X.DbT.A01(r1, r0)
            if (r7 >= r0) goto L_0x005a
            r5 = 2
            r0 = 1549119469(0x5c55afed, float:2.4059041E17)
            goto L_0x0014
        L_0x005a:
            java.util.List r0 = r6.A0I
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0081
            int r0 = r6.A02()
            int r0 = X.DbT.A01(r1, r0)
            if (r7 != r0) goto L_0x0081
            com.instagram.common.session.UserSession r4 = r6.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326468317361945(0x810ebb00003719, double:3.0363430666222084E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0081
            r5 = 43
            r0 = 2375439(0x243f0f, float:3.328699E-39)
            goto L_0x0014
        L_0x0081:
            int r0 = r6.A04()
            if (r7 >= r0) goto L_0x01d5
            com.instagram.common.session.UserSession r4 = r6.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326468317361945(0x810ebb00003719, double:3.0363430666222084E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x01d5
            r5 = 44
            r0 = -720388188(0xffffffffd50fbfa4, float:-9.8783283E12)
            goto L_0x0014
        L_0x009d:
            java.util.List r1 = r6.A0M
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b2
            int r0 = r6.A04()
            if (r7 != r0) goto L_0x00b2
            r5 = 13
            r0 = -1955223572(0xffffffff8b75a7ec, float:-4.7311614E-32)
            goto L_0x0014
        L_0x00b2:
            int r0 = r6.A04()
            int r0 = A09(r1, r0)
            if (r7 >= r0) goto L_0x00c3
            r5 = 14
            r0 = -1543954850(0xffffffffa3f91e5e, float:-2.7009495E-17)
            goto L_0x0014
        L_0x00c3:
            java.util.List r0 = r6.A0F
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00dc
            int r0 = r6.A04()
            int r0 = A09(r1, r0)
            if (r7 != r0) goto L_0x00dc
            r5 = 34
            r0 = 191399056(0xb688490, float:4.4781304E-32)
            goto L_0x0014
        L_0x00dc:
            int r0 = r6.A05()
            if (r7 >= r0) goto L_0x00e9
            r5 = 35
            r0 = 1836263144(0x6d7326e8, float:4.7032433E27)
            goto L_0x0014
        L_0x00e9:
            java.util.List r0 = r6.A0P
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fe
            int r0 = r6.A05()
            if (r7 != r0) goto L_0x00fe
            r5 = 36
            r0 = 1807341559(0x6bb9d7f7, float:4.493423E26)
            goto L_0x0014
        L_0x00fe:
            boolean r3 = r6.A0T
            if (r3 != 0) goto L_0x010f
            int r0 = r6.A00()
            if (r7 >= r0) goto L_0x010f
            r5 = 37
            r0 = -498200907(0xffffffffe24e0eb5, float:-9.5027226E20)
            goto L_0x0014
        L_0x010f:
            java.util.List r0 = r6.A0G
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0124
            int r0 = r6.A00()
            if (r7 != r0) goto L_0x0124
            r5 = 8
            r0 = 1248914831(0x4a70ed8f, float:3947363.8)
            goto L_0x0014
        L_0x0124:
            r5 = 11
            if (r3 != 0) goto L_0x0134
            int r0 = r6.A04()
            int r0 = r0 - r4
            if (r7 >= r0) goto L_0x0134
            r0 = 1137685835(0x43cfb54b, float:415.41635)
            goto L_0x0014
        L_0x0134:
            java.util.List r1 = r6.A0L
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0148
            int r0 = r6.A03()
            if (r7 != r0) goto L_0x0148
            r5 = 5
            r0 = -791847487(0xffffffffd0cd5dc1, float:-2.75637883E10)
            goto L_0x0014
        L_0x0148:
            int r0 = r6.A03()
            int r0 = A09(r1, r0)
            if (r7 >= r0) goto L_0x0158
            r5 = 6
            r0 = 2015714593(0x78255d21, float:1.3415904E34)
            goto L_0x0014
        L_0x0158:
            java.util.List r0 = r6.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0170
            int r0 = r6.A03()
            int r0 = A09(r1, r0)
            if (r7 != r0) goto L_0x0170
            r5 = 7
            r0 = -182280787(0xfffffffff5229dad, float:-2.0614017E32)
            goto L_0x0014
        L_0x0170:
            if (r3 == 0) goto L_0x0183
            int r0 = r6.A00()
            if (r7 < r0) goto L_0x0189
            int r0 = r6.A01()
            if (r7 >= r0) goto L_0x0190
            r0 = -1908784557(0xffffffff8e3a4253, float:-2.2958204E-30)
            goto L_0x0014
        L_0x0183:
            int r0 = r6.A01()
            if (r7 >= r0) goto L_0x0190
        L_0x0189:
            r5 = 10
            r0 = 695492420(0x29745f44, float:5.4261513E-14)
            goto L_0x0014
        L_0x0190:
            java.util.List r1 = r6.A0H
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a5
            int r0 = r6.A01()
            if (r7 != r0) goto L_0x01a5
            r5 = 9
            r0 = 1790417303(0x6ab79997, float:1.1097937E26)
            goto L_0x0014
        L_0x01a5:
            int r0 = r6.A01()
            int r0 = X.DbT.A01(r1, r0)
            if (r7 >= r0) goto L_0x01b6
            r5 = 12
            r0 = -548558203(0xffffffffdf4daa85, float:-1.4819804E19)
            goto L_0x0014
        L_0x01b6:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x01c1
            r0 = -394960072(0xffffffffe8756338, float:-4.6352402E24)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r4
        L_0x01c1:
            int r0 = r6.getItemCount()
            int r0 = r0 - r4
            if (r7 != r0) goto L_0x01d5
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x01d5
            r5 = 24
            r0 = 492524403(0x1d5b5373, float:2.902755E-21)
            goto L_0x0014
        L_0x01d5:
            java.lang.String r0 = "Unknown view type at position; "
            java.lang.IllegalStateException r1 = X.DbW.A0b(r0, r7)
            r0 = 2129376410(0x7eebb49a, float:1.5665316E38)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.getItemViewType(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0362, code lost:
        r16 = (r47 - r2) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0480, code lost:
        if (r6.A0E.contains(r9) != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04db, code lost:
        if (r9.A0M() == false) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04df, code lost:
        if (r31 != false) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04e5, code lost:
        if (r9.A0M() != false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04eb, code lost:
        if (r9.A01 != 47) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f3, code lost:
        if (r9.A0Q.size() != 1) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04f5, code lost:
        r4 = X.C49961FGt.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04fb, code lost:
        if ((r9 instanceof com.instagram.model.direct.DirectReplyToMediaAuthorShareTarget) == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04fd, code lost:
        r4 = X.DbW.A0h(r5, r4, 2131960214);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0504, code lost:
        r15 = X.00l.A0R(r4, new java.lang.String[]{" "}, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r1.A0b.A0A(r0, r1.A0a) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0510, code lost:
        if (r25 == false) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0512, code lost:
        r15 = X.DbV.A18(X.C49961FGt.A01(r9), ", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x051c, code lost:
        r3 = new java.lang.StringBuilder(X.DbU.A0t(r15, 0));
        r12 = r5.getResources().getDimension(com.instagram.android.R.dimen.featured_user_story_ring_size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0536, code lost:
        if (r9.A0K() != false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x053c, code lost:
        if (r9.A0V() != false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x053e, code lost:
        if (r33 == null) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0540, code lost:
        r12 = r12 - r5.getResources().getDimension(com.instagram.android.R.dimen.asset_picker_static_sticker_last_row_padding);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0552, code lost:
        if (r26 >= r15.size()) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0554, code lost:
        r4 = X.AnonymousClass7TE.A1A();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x055a, code lost:
        if (r25 == false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x055c, code lost:
        r4.append(r3);
        r4.append(", ");
        r4 = X.AnonymousClass7TF.A0l(X.DbU.A0t(r15, r26), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0578, code lost:
        if (r36.getPaint().measureText(r4) > r12) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x057a, code lost:
        if (r25 == false) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x057c, code lost:
        r4 = X.AnonymousClass7TF.A0n(", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0580, code lost:
        r3.append(X.AnonymousClass7TF.A0l(X.AnonymousClass7TE.A19(r15, r26), r4));
        r26 = r26 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0594, code lost:
        r4 = X.AnonymousClass7TE.A1A();
        r4.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x059e, code lost:
        r4.append(r3);
        r4.append(' ');
        r4 = X.AnonymousClass7TF.A0l(X.AnonymousClass7TE.A19(r15, r26), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05b1, code lost:
        r4 = X.AnonymousClass50n.A03(r9, X.DbT.A0j(r2));
        X.0qQ.A07(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06be, code lost:
        r27 = r15.subList(r26, r15.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06cc, code lost:
        if (X.AnonymousClass7TE.A1b(r27) == false) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06ce, code lost:
        r32 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06d0, code lost:
        r13.setVisibility(r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06d9, code lost:
        if (r27.size() != 1) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06db, code lost:
        r3 = X.C49961FGt.A00(r13, X.AnonymousClass7TE.A19(r27, 0), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06e5, code lost:
        r13.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06e8, code lost:
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06f5, code lost:
        if (X.182.A06(r14, r2, 36318234865571862L) == false) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06f7, code lost:
        r36.setTypeface((android.graphics.Typeface) null, 1);
        r13.setTypeface((android.graphics.Typeface) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06ff, code lost:
        r36.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0704, code lost:
        if (r31 != false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x070a, code lost:
        if (r9.A0M() == false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x070c, code lost:
        r3 = r13.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0710, code lost:
        if (r3 == null) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0712, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0717, code lost:
        if (X.00l.A0W(r3) == false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0719, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x071a, code lost:
        r3 = r5.getResources().getDimension(com.instagram.android.R.dimen.abc_control_corner_material);
        r4 = X.DbT.A10(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0729, code lost:
        if (r13 == false) goto L_0x072c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x072b, code lost:
        r12 = r12 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x072c, code lost:
        r4 = X.C49961FGt.A00(r36, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0732, code lost:
        if (r13 == false) goto L_0x073a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0734, code lost:
        r4 = X.002.A0C(r4, ',');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x073a, code lost:
        r36.setText(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0743, code lost:
        if (r9.A0K() != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0749, code lost:
        if (r9.A0V() != false) goto L_0x074d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x074b, code lost:
        if (r33 == null) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x074d, code lost:
        X.C49961FGt.A04(r5, r2, r21, r33, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0756, code lost:
        if (r8.A0E == false) goto L_0x0774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0758, code lost:
        r25 = r5.getColor(X.2Yu.A09(r5));
        X.C49961FGt.A04(r5, r2, r21, new X.DcN(r25, r25, 0, true, false), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0774, code lost:
        r4 = new android.text.SpannableStringBuilder();
        r12 = X.C49961FGt.A05(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x077d, code lost:
        if (r12 != false) goto L_0x0786;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x077f, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0784, code lost:
        if (r9.A0M() != false) goto L_0x0789;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0786, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0787, code lost:
        if (r12 != false) goto L_0x078f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x078d, code lost:
        if (r9.A0M() != false) goto L_0x079d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0793, code lost:
        if (r9.A01 != 47) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x079b, code lost:
        if (r9.A0Q.size() != 1) goto L_0x0a6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x079d, code lost:
        r3 = X.C49961FGt.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07a1, code lost:
        if (r13 == false) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07a3, code lost:
        r3 = X.C49961FGt.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07a7, code lost:
        r4.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07ae, code lost:
        if (r9.A0K() == false) goto L_0x0a51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07b2, code lost:
        if (r9.A0T != false) goto L_0x0a51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07b4, code lost:
        r4.append(" ");
        r3 = 2131959507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07bc, code lost:
        r4.append(r5.getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07c3, code lost:
        r3 = " ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07c5, code lost:
        if (r35 == false) goto L_0x0a49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07c7, code lost:
        r4.append(r3);
        r3 = 2131955092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07cd, code lost:
        r4.append(r5.getString(r3));
        r38.setContentDescription(r4.toString());
        r7.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
        r12 = r8.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x07e6, code lost:
        if (X.DbV.A1Y(r2) == false) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x07ea, code lost:
        if (r8.A02 <= 0) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07ec, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07f6, code lost:
        if (X.182.A06(r14, r2, 36316031546888049L) != false) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07f8, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x07f9, code lost:
        if (r35 == false) goto L_0x08ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07fb, code lost:
        if (r20 != false) goto L_0x08ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07fd, code lost:
        r4 = r5.getDrawable(com.instagram.android.R.drawable.empty_circle);
        r3 = r5.getDrawable(com.instagram.android.R.drawable.instagram_circle_check_pano_filled_24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x080b, code lost:
        if (r4 == null) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x080d, code lost:
        if (r3 == null) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x080f, code lost:
        r4.mutate();
        r3.mutate();
        r12 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r4, r3});
        r8 = X.AnonymousClass7TF.A03(r5, com.instagram.android.R.attr.igds_color_elevated_background);
        r4 = X.1QE.A0B(r5, (X.1QG) null).getDefaultColor();
        r12.getDrawable(0).setTint(r8);
        r12.getDrawable(1).setTint(r4);
        r26 = X.DbS.A02(r5, 2);
        r12.setLayerSize(1, X.DbS.A02(r5, 20), X.DbS.A02(r5, 20));
        r12.setLayerInset(1, r26, r26, r26, r26);
        r7.setBottomBadgeDrawable(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0861, code lost:
        if (r37.CVM() == false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d0, code lost:
        if (r0.A05() == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0867, code lost:
        if (X.C49961FGt.A06(r2) == false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0869, code lost:
        r4 = X.0nA.A04(r5, 11);
        X.DbS.A0Z(r37).A00 = r4;
        X.DbS.A0Z(r37).A01 = r4;
        X.DbS.A0Z(r37).setBottomBadgeDrawable(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0882, code lost:
        r7.setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0889, code lost:
        if (r37.CVM() == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x088f, code lost:
        if (X.C49961FGt.A06(r2) == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0891, code lost:
        X.DbS.A0Z(r37).setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0898, code lost:
        r7.setGradientSpinnerVisible(false);
        r4 = r21.A00;
        X.AnonymousClass0fU.A00(new X.FO4(r4, r22, r9, r16, 0), r4);
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x08b5, code lost:
        if (r20 == false) goto L_0x08ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x08b7, code lost:
        r3 = 0.3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08ba, code lost:
        r4.setAlpha(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x08bd, code lost:
        if (r20 == false) goto L_0x08c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08bf, code lost:
        X.FPE.A01(r4, 54, r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08c6, code lost:
        if (r48 == false) goto L_0x08fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x08c8, code lost:
        r4.setBackgroundColor(X.AnonymousClass7TF.A03(r5, com.instagram.android.R.attr.igds_color_secondary_background));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08d8, code lost:
        if ((r4.getLayoutParams() instanceof X.C320856t4) == false) goto L_0x0e2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x08de, code lost:
        if (X.DbW.A1T(r14, r2) == false) goto L_0x0e2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x08e0, code lost:
        r7 = r4.getLayoutParams();
        X.0qQ.A0C(r7, X.AnonymousClass000.A00(3647));
        r7 = (android.view.ViewGroup.MarginLayoutParams) r7;
        X.C49750F5b.A01(r5, r7, r2, 16, r18);
        r4.setLayoutParams(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fb, code lost:
        r4.setBackground((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x08ff, code lost:
        r4 = X.0nA.A04(r5, -6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0908, code lost:
        if (r8.A03() != false) goto L_0x0925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090c, code lost:
        if (r8.A0G == false) goto L_0x0925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x090e, code lost:
        r7.setBottomBadgeDrawable(r5.getDrawable(X.2Yu.A0H(r5, com.instagram.android.R.attr.quietModeIndicatorBadge)));
        r7.A00 = r4;
        r7.A01 = r4;
        r7.setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0925, code lost:
        if (r12 == false) goto L_0x0978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0927, code lost:
        r10 = X.DbY.A07(r5);
        r12 = X.DbS.A02(r5, 17);
        r7.setBottomBadgeDrawable(r10);
        r3 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0936, code lost:
        if (r3 == null) goto L_0x093b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0938, code lost:
        r3.setBounds(0, 0, r12, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x093b, code lost:
        r7.setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0942, code lost:
        if (r37.CVM() == false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0948, code lost:
        if (X.C49961FGt.A06(r2) == false) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x094a, code lost:
        r12 = X.0nA.A04(r5, 8);
        X.DbS.A0Z(r37).A00 = r12;
        X.DbS.A0Z(r37).A01 = r12;
        X.DbS.A0Z(r37).setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
        X.DbS.A0Z(r37).setBottomBadgeDrawable(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x096e, code lost:
        if (r8.A03() == false) goto L_0x0972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0970, code lost:
        if (r34 == null) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0972, code lost:
        r7.A00 = r4;
        r7.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0978, code lost:
        if (r13 == false) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x097a, code lost:
        r8 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x097e, code lost:
        if (61 > r8) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0989, code lost:
        if (X.182.A06(r14, r2, 36316031546822512L) == false) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x098b, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0995, code lost:
        if (X.182.A06(r14, r2, 36318234865309714L) != false) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0997, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x099a, code lost:
        if (r8 > 480) goto L_0x09b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x09a5, code lost:
        if (X.182.A06(r14, r2, 36316031546822512L) == false) goto L_0x09b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09a7, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x09b1, code lost:
        if (X.182.A06(r14, r2, 36318234865244177L) != false) goto L_0x09b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09b3, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x09b4, code lost:
        if (r13 == false) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x09b6, code lost:
        r10 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours((long) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x09be, code lost:
        if (r12 != false) goto L_0x09c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x09c0, code lost:
        if (r13 == false) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x09c2, code lost:
        r3 = 2131960123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x09c5, code lost:
        if (r12 != false) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x09c7, code lost:
        if (r13 == false) goto L_0x09ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x09c9, code lost:
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x09ca, code lost:
        r4 = X.DbZ.A0X(r5, r8, r3);
        r7.setPresenceBadgeDrawable(r4);
        r7.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09d8, code lost:
        if (r37.CVM() == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x09de, code lost:
        if (X.C49961FGt.A06(r2) == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x09e0, code lost:
        r8 = X.0nA.A04(r5, 11);
        X.DbS.A0Z(r37).A01 = r8;
        X.DbS.A0Z(r37).A00 = r8;
        X.DbS.A0Z(r37).setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
        X.DbS.A0Z(r37).setPresenceBadgeDrawable(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a02, code lost:
        r3 = 2131960124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a06, code lost:
        r7.setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
        r7.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
        r7.A01 = X.0nA.A04(r5, 2);
        r7.A00 = X.0nA.A04(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a1d, code lost:
        if (r37.CVM() == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        if (r29 <= 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0a23, code lost:
        if (X.C49961FGt.A06(r2) == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0a25, code lost:
        X.DbS.A0Z(r37).setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
        X.DbS.A0Z(r37).setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
        X.DbS.A0Z(r37).A01 = X.0nA.A04(r5, 2);
        X.DbS.A0Z(r37).A00 = X.0nA.A04(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0a49, code lost:
        r4.append(r3);
        r3 = 2131975845;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0a55, code lost:
        if (r9.A0V() == false) goto L_0x0a61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0a57, code lost:
        r4.append(" ");
        r3 = 2131976380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0a61, code lost:
        if (r33 == null) goto L_0x07c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0a63, code lost:
        r4.append(" ");
        r3 = 2131959041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a6d, code lost:
        r3 = X.AnonymousClass50n.A03(r9, X.DbT.A0j(r2));
        X.0qQ.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0a7e, code lost:
        if (r27.size() <= 1) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0a80, code lost:
        if (r25 == false) goto L_0x0acb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0a82, code lost:
        r26 = r27.iterator();
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0a8b, code lost:
        if (r26.hasNext() == false) goto L_0x0ac2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0a8d, code lost:
        r25 = r15 + 1;
        r14 = X.002.A0g(r14, X.AnonymousClass7TE.A18(r26), ", ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0a99, code lost:
        if (r14 == null) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0aa4, code lost:
        if (r14.length() <= 8) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0aac, code lost:
        if (r15 == (r27.size() - 1)) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0aae, code lost:
        r14 = X.002.A0b(X.00R.A03(r14, 8), "... +", X.DbT.A02(r27, r15) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0ac2, code lost:
        r3 = X.C49961FGt.A00(r13, r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0ac8, code lost:
        r15 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0acb, code lost:
        r14 = android.text.TextUtils.join(" ", r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0bfd, code lost:
        if (r4.CKn(r12) == false) goto L_0x0c77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        if (r4.A0A(r0, r3) == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0c74, code lost:
        if (r3 == false) goto L_0x0c77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0cc1, code lost:
        if (X.182.A06(r17, r2, 36318234865309714L) == false) goto L_0x0cc3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0cdc, code lost:
        if (X.182.A06(r17, r2, 36318234865244177L) == false) goto L_0x0cde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0ce0, code lost:
        if (r19 != false) goto L_0x0ce2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ce2, code lost:
        r5 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0ce9, code lost:
        if (r18 != false) goto L_0x0ced;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0ceb, code lost:
        if (r19 == false) goto L_0x0d01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0ced, code lost:
        r3 = 2131960123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0cf0, code lost:
        if (r18 != false) goto L_0x0cf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0cf2, code lost:
        if (r19 == false) goto L_0x0cf5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0cf4, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0cf5, code lost:
        r7.setPresenceBadgeDrawable(X.DbZ.A0X(r11, r6, r3));
        r7.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0d01, code lost:
        r3 = 2131960124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x024f, code lost:
        if (X.182.A06(r17, r2, 36318234865309714L) == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0266, code lost:
        if (X.182.A06(r17, r2, 36318234865244177L) == false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0269, code lost:
        if (r14 != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026b, code lost:
        r11 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0272, code lost:
        if (r12 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0274, code lost:
        if (r14 == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0276, code lost:
        r3 = 2131960123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0279, code lost:
        if (r12 != false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027b, code lost:
        if (r14 == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027d, code lost:
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027f, code lost:
        r4 = X.DbZ.A0X(r5, r29, r3);
        r12 = r10.A0C;
        r12.setPresenceBadgeDrawable(r4);
        r12.setBottomBadgeDrawable((android.graphics.drawable.Drawable) null);
        r3 = r10.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0293, code lost:
        if (r3.CVM() == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0295, code lost:
        r3 = X.DbS.A0Z(r3);
        r3.setPresenceBadgeDrawable(r4);
        r3.setPresenceBadgeDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a1, code lost:
        r3 = 2131960124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0B(X.C249703kE r44, com.instagram.model.direct.DirectShareTarget r45, int r46, int r47, boolean r48) {
        /*
            r43 = this;
            r0 = r45
            java.util.List r1 = X.DbT.A14(r0)
            boolean r2 = r1.isEmpty()
            r1 = r43
            if (r2 == 0) goto L_0x005f
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r2 = r0.A04
            if (r2 != 0) goto L_0x005f
            com.instagram.common.typedurl.ImageUrl r2 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r1.A01
            com.instagram.user.model.User r3 = r3.A01(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r2.<init>((com.instagram.user.model.User) r3)
            java.util.List r5 = X.AnonymousClass7TE.A1I(r2)
            X.3t2 r2 = X.DbS.A0c(r0)
            boolean r2 = r2 instanceof X.C254763t0
            if (r2 == 0) goto L_0x0385
            X.3t2 r4 = X.DbS.A0c(r0)
        L_0x0031:
            X.0qQ.A0A(r4)
            java.lang.String r19 = X.DbT.A0y(r0)
            r7 = 0
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r3 = r0.A05
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r2 = r0.A04
            r25 = 1
            r26 = 0
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r6 = r0
            r8 = r2
            r9 = r3
            r10 = r7
            r11 = r7
            r12 = r4
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x005f:
            r42 = r44
            android.content.Context r5 = X.DbS.A07(r42)
            r23 = r46
            r2 = r23
            int r22 = A08(r1, r0, r2)
            r3 = 6
            r18 = r47
            if (r2 == r3) goto L_0x0378
            r3 = 19
            if (r2 == r3) goto L_0x0368
            switch(r46) {
                case 11: goto L_0x037d;
                case 12: goto L_0x0353;
                case 13: goto L_0x034e;
                case 14: goto L_0x035e;
                default: goto L_0x0079;
            }
        L_0x0079:
            r16 = -1
        L_0x007b:
            boolean r8 = r1.A0j
            if (r8 == 0) goto L_0x008b
            X.3mO r3 = r1.A0b
            X.3mS r2 = r1.A0a
            boolean r2 = r3.A0A(r0, r2)
            r39 = 1
            if (r2 != 0) goto L_0x008d
        L_0x008b:
            r39 = 0
        L_0x008d:
            X.3mO r4 = r1.A0b
            X.3mS r3 = r1.A0a
            boolean r41 = r4.A0B(r0, r3)
            com.instagram.common.session.UserSession r2 = r1.A01
            X.0Tu r17 = X.0Tu.A05
            r6 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            r9 = r17
            boolean r10 = X.182.A06(r9, r2, r6)
            r6 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            boolean r6 = X.182.A06(r9, r2, r6)
            if (r6 == 0) goto L_0x0346
            r6 = 1440(0x5a0, float:2.018E-42)
        L_0x00b1:
            int r29 = r4.A07(r0, r3, r6)
            boolean r6 = r1.A0h
            if (r6 == 0) goto L_0x00d2
            boolean r6 = r0.A0S()
            if (r6 == 0) goto L_0x00d2
            java.lang.String r7 = r2.A06
            r6 = 0
            java.lang.Integer r7 = r0.A04(r7, r6)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r7 != r6) goto L_0x00d2
            java.lang.String r6 = r0.A05()
            r40 = 1
            if (r6 != 0) goto L_0x00d4
        L_0x00d2:
            r40 = 0
        L_0x00d4:
            r6 = r42
            android.view.View r6 = r6.itemView
            java.lang.Object r6 = r6.getTag()
            boolean r6 = r6 instanceof X.C47035DpR
            if (r6 == 0) goto L_0x0404
            X.0qQ.A0A(r5)
            r7 = 0
            r6 = 1
            X.0qQ.A0B(r5, r6)
            r28 = 2
            boolean r9 = X.DbV.A1Y(r2)
            if (r9 == 0) goto L_0x00f4
            r27 = 1
            if (r29 > 0) goto L_0x00f6
        L_0x00f4:
            r27 = 0
        L_0x00f6:
            X.OZA r9 = X.OZA.A00
            boolean r9 = r9.A01(r2, r0)
            if (r9 != 0) goto L_0x0108
            X.2Ep r9 = X.OZA.A00(r2, r0)
            boolean r9 = X.C308556Us.A0M(r2, r9)
            if (r9 == 0) goto L_0x0121
        L_0x0108:
            int r7 = X.2Yu.A09(r5)
            int r10 = r5.getColor(r7)
            int r7 = X.2Yu.A09(r5)
            int r11 = r5.getColor(r7)
            r12 = 0
            X.DcN r7 = new X.DcN
            r9 = r7
            r13 = r6
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0121:
            r9 = r42
            android.view.View r9 = r9.itemView
            java.lang.Object r10 = r9.getTag()
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.direct.ui.DirectRecipientRowViewBinder.Holder"
            X.0qQ.A0C(r10, r9)
            X.DpR r10 = (X.C47035DpR) r10
            X.0iw r11 = r1.A0V
            if (r8 == 0) goto L_0x013c
            boolean r8 = r4.A0A(r0, r3)
            r26 = 1
            if (r8 != 0) goto L_0x013e
        L_0x013c:
            r26 = 0
        L_0x013e:
            r8 = 10
            r4.A07(r0, r3, r8)
            X.FbU r25 = new X.FbU
            r4 = r25
            r3 = r18
            r4.<init>(r1, r3)
            X.O8G r3 = X.C70167NyL.A00(r2)
            X.0xa r4 = r3.A00
            java.lang.String r3 = "debug_overlay_enabled"
            r9 = 0
            r4.getBoolean(r3, r9)
            r24 = 6
            android.widget.FrameLayout r3 = r10.A03
            r38 = r3
            X.FOO r3 = new X.FOO
            r30 = r3
            r31 = r25
            r32 = r10
            r33 = r0
            r34 = r24
            r35 = r18
            r36 = r18
            r37 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r4 = r38
            X.AnonymousClass0fU.A00(r3, r4)
            X.0eE r12 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r12.A01(r2)
            java.lang.String r21 = X.AnonymousClass50n.A03(r0, r3)
            com.instagram.user.model.User r4 = r12.A01(r2)
            java.util.List r3 = X.DbT.A14(r0)
            r0.A0S()
            r8 = 0
            X.34S r13 = X.AnonymousClass3UE.A02(r8, r4, r8, r3)
            com.instagram.common.typedurl.ImageUrl r4 = X.OXB.A02(r2, r0)
            com.instagram.common.typedurl.ImageUrl r3 = X.OXB.A01(r2, r0)
            r6 = 8
            r18 = 0
            if (r4 == 0) goto L_0x02c1
            X.3oV r3 = r10.A0B
            X.DbZ.A1X(r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r10.A0C
            r3.setVisibility(r9)
            r3.A0F(r8, r11, r4)
        L_0x01ad:
            r19 = 480(0x1e0, double:2.37E-321)
            r14 = 1440(0x5a0, double:7.115E-321)
            r11 = 60
            r12 = 36317663634396591(0x8106b9000015af, double:3.030774949661306E-306)
            r3 = r17
            boolean r3 = X.182.A06(r3, r2, r12)
            if (r3 == 0) goto L_0x03db
            boolean r3 = r0.A0M()
            if (r3 != 0) goto L_0x0211
            if (r41 == 0) goto L_0x0211
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            r3 = 2130970900(0x7f040914, float:1.7550523E38)
            X.DbY.A0x(r5, r12, r3)
        L_0x01d0:
            r3 = r25
            boolean r14 = r3.CbW(r0)
            r13 = 8
            if (r7 == 0) goto L_0x03c8
            boolean r3 = X.C61670oa.A05()
            if (r3 != 0) goto L_0x03c8
            android.widget.LinearLayout r3 = r10.A06
            android.content.Context r3 = r3.getContext()
            X.Mhs r11 = new X.Mhs
            r11.<init>(r3)
            boolean r4 = r7.A03
            boolean r3 = r7.A04
            r11.A02 = r4
            r11.A03 = r3
            int r3 = r7.A00
            int r4 = r7.A02
            r11.A00 = r3
            r11.A01 = r4
            android.view.View r3 = r10.A00
            if (r14 != 0) goto L_0x0200
            r13 = 0
        L_0x0200:
            r3.setVisibility(r13)
            r3.setBackground(r11)
            r3 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r7 = r5.getDrawable(r3)
            if (r7 == 0) goto L_0x0d6a
            goto L_0x038c
        L_0x0211:
            if (r39 == 0) goto L_0x0236
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            r3 = 2130970844(0x7f0408dc, float:1.755041E38)
            X.DbY.A0x(r5, r12, r3)
            X.3oV r4 = r10.A0B
            boolean r11 = r4.CVM()
            if (r11 == 0) goto L_0x01d0
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r4 = X.DbS.A0Z(r4)
            int r3 = X.2Yu.A0H(r5, r3)
            android.graphics.drawable.Drawable r3 = r5.getDrawable(r3)
            r4.setBottomBadgeDrawable(r3)
            r4.setPresenceBadgeDrawable(r8)
            goto L_0x01d0
        L_0x0236:
            if (r27 == 0) goto L_0x02a5
            r3 = r29
            long r3 = (long) r3
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x0251
            r12 = r29
            if (r12 <= r11) goto L_0x0251
            r13 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            r12 = r17
            boolean r12 = X.182.A06(r12, r2, r13)
            r14 = 1
            if (r12 != 0) goto L_0x0252
        L_0x0251:
            r14 = 0
        L_0x0252:
            int r12 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r12 > 0) goto L_0x0268
            r12 = r29
            if (r12 <= r11) goto L_0x0268
            r11 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            r13 = r17
            boolean r11 = X.182.A06(r13, r2, r11)
            r12 = 1
            if (r11 != 0) goto L_0x026b
        L_0x0268:
            r12 = 0
            if (r14 == 0) goto L_0x02a1
        L_0x026b:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r3 = r11.toHours(r3)
            int r11 = (int) r3
            if (r12 != 0) goto L_0x0276
            if (r14 == 0) goto L_0x02a1
        L_0x0276:
            r3 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r12 != 0) goto L_0x027d
            if (r14 == 0) goto L_0x027f
        L_0x027d:
            r29 = r11
        L_0x027f:
            r4 = r29
            X.U0t r4 = X.DbZ.A0X(r5, r4, r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            r12.setPresenceBadgeDrawable(r4)
            r12.setBottomBadgeDrawable(r8)
            X.3oV r3 = r10.A0B
            boolean r11 = r3.CVM()
            if (r11 == 0) goto L_0x01d0
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r3)
            r3.setPresenceBadgeDrawable(r4)
            r3.setPresenceBadgeDrawable(r8)
            goto L_0x01d0
        L_0x02a1:
            r3 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x027f
        L_0x02a5:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            r12.setBottomBadgeDrawable(r8)
            r12.setPresenceBadgeDrawable(r8)
            X.3oV r3 = r10.A0B
            boolean r4 = r3.CVM()
            if (r4 == 0) goto L_0x01d0
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r3)
            r3.setPresenceBadgeDrawable(r8)
            r3.setBottomBadgeDrawable(r8)
            goto L_0x01d0
        L_0x02c1:
            if (r3 == 0) goto L_0x02d2
            X.3oV r4 = r10.A0B
            X.DbZ.A1X(r4)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r4 = r10.A0C
            r4.setVisibility(r9)
            r4.A0F(r8, r11, r3)
            goto L_0x01ad
        L_0x02d2:
            boolean r3 = r0.A0M()
            if (r3 != 0) goto L_0x02dc
            boolean r3 = r0.A0R
            if (r3 != 0) goto L_0x0331
        L_0x02dc:
            java.lang.Object r4 = r13.A00
            if (r4 == 0) goto L_0x0331
            r14 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            r3 = r17
            boolean r3 = X.182.A06(r3, r2, r14)
            if (r3 == 0) goto L_0x0311
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r10.A0C
            r3.setVisibility(r6)
            r3.setGradientSpinnerVisible(r9)
            X.3oV r3 = r10.A0B
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r3)
            r3.setVisibility(r9)
            com.instagram.user.model.User r12 = r12.A01(r2)
            java.util.List r4 = X.DbT.A14(r0)
            java.util.ArrayList r4 = X.AnonymousClass3UE.A05(r12, r4, r9)
            r3.A08 = r9
            r3.setImageUrls(r4, r11)
            goto L_0x01ad
        L_0x0311:
            X.3oV r3 = r10.A0B
            X.DbZ.A1X(r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            r12.setVisibility(r9)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.Object r3 = r13.A01
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            r12.A0G(r8, r11, r4, r3)
            int r3 = X.2Yu.A0C(r5)
            int r3 = r5.getColor(r3)
            r12.setBackgroundRingColor(r3)
            goto L_0x01ad
        L_0x0331:
            java.lang.Object r4 = r13.A00
            if (r4 == 0) goto L_0x01ad
            X.3oV r3 = r10.A0B
            X.DbZ.A1X(r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r10.A0C
            r3.setVisibility(r9)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            r3.A0F(r8, r11, r4)
            goto L_0x01ad
        L_0x0346:
            r6 = 60
            if (r10 == 0) goto L_0x00b1
            r6 = 480(0x1e0, float:6.73E-43)
            goto L_0x00b1
        L_0x034e:
            int r2 = r1.A01()
            goto L_0x0381
        L_0x0353:
            int r3 = r1.A03()
            java.util.List r2 = r1.A0L
            int r2 = A09(r2, r3)
            goto L_0x0362
        L_0x035e:
            int r2 = r1.A04()
        L_0x0362:
            int r2 = r47 - r2
            int r16 = r2 + -1
            goto L_0x007b
        L_0x0368:
            int r2 = r1.A09
            r16 = r2
            int r2 = r1.A03()
            int r2 = r47 - r2
            int r2 = r2 + -1
            int r16 = r16 + r2
            goto L_0x007b
        L_0x0378:
            int r2 = r1.A02()
            goto L_0x0381
        L_0x037d:
            int r2 = r1.A00()
        L_0x0381:
            int r16 = r47 - r2
            goto L_0x007b
        L_0x0385:
            X.5gg r4 = new X.5gg
            r4.<init>(r5)
            goto L_0x0031
        L_0x038c:
            android.widget.CheckBox r15 = r10.A02     // Catch:{ NullPointerException -> 0x0d5f }
            r13 = -1
            int r14 = X.DbU.A01(r5)     // Catch:{ NullPointerException -> 0x0d5f }
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r4 = new int[]{r3}     // Catch:{ NullPointerException -> 0x0d5f }
            int[] r3 = new int[r9]     // Catch:{ NullPointerException -> 0x0d5f }
            android.graphics.drawable.Drawable[] r19 = new android.graphics.drawable.Drawable[]{r7, r11}     // Catch:{ NullPointerException -> 0x0d5f }
            int[] r18 = new int[]{r14, r13}     // Catch:{ NullPointerException -> 0x0d5f }
            int[][] r17 = new int[][]{r4, r3}     // Catch:{ NullPointerException -> 0x0d5f }
            android.graphics.drawable.StateListDrawable r11 = new android.graphics.drawable.StateListDrawable     // Catch:{ NullPointerException -> 0x0d5f }
            r11.<init>()     // Catch:{ NullPointerException -> 0x0d5f }
            r7 = 0
        L_0x03ae:
            r4 = r19[r7]     // Catch:{ NullPointerException -> 0x0d5f }
            r3 = r18[r7]     // Catch:{ NullPointerException -> 0x0d5f }
            r14 = r17[r7]     // Catch:{ NullPointerException -> 0x0d5f }
            if (r3 == r13) goto L_0x03ba
            android.graphics.drawable.BitmapDrawable r4 = X.AnonymousClass3JT.A01(r5, r4, r3)     // Catch:{ NullPointerException -> 0x0d5f }
        L_0x03ba:
            r11.addState(r14, r4)     // Catch:{ NullPointerException -> 0x0d5f }
            int r7 = r7 + 1
            r3 = r28
            if (r7 < r3) goto L_0x03ae
            r15.setBackground(r11)     // Catch:{ NullPointerException -> 0x0d5f }
            goto L_0x0d6a
        L_0x03c8:
            android.view.View r3 = r10.A00
            r3.setVisibility(r6)
            android.widget.CheckBox r4 = r10.A02
            r3 = 2131099701(0x7f060035, float:1.7811763E38)
            android.graphics.drawable.StateListDrawable r3 = X.AnonymousClass3JT.A07(r5, r3)
            r4.setBackground(r3)
            goto L_0x0d6a
        L_0x03db:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r10.A0C
            if (r26 == 0) goto L_0x03e3
            android.graphics.drawable.Drawable r18 = X.DbY.A07(r5)
        L_0x03e3:
            r3 = r18
            r12.setBottomBadgeDrawable(r3)
            X.3oV r4 = r10.A0B
            boolean r3 = r4.CVM()
            if (r3 == 0) goto L_0x03fa
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r4 = X.DbS.A0Z(r4)
            if (r26 != 0) goto L_0x03ff
            r3 = 0
        L_0x03f7:
            r4.setBottomBadgeDrawable(r3)
        L_0x03fa:
            r12.setPresenceBadgeDrawable(r8)
            goto L_0x0d6a
        L_0x03ff:
            android.graphics.drawable.Drawable r3 = X.DbY.A07(r5)
            goto L_0x03f7
        L_0x0404:
            java.util.LinkedHashSet r3 = r1.A0E
            boolean r38 = r3.contains(r0)
            java.lang.String r3 = r1.A0f
            r30 = r5
            r31 = r2
            r32 = r0
            r33 = r3
            r34 = r23
            r35 = r22
            r36 = r16
            r37 = r29
            X.FV6 r8 = X.FV6.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r3 = r42
            android.view.View r3 = r3.itemView
            java.lang.Object r3 = r3.getTag()
            boolean r3 = r3 instanceof X.C49622Ezf
            if (r3 == 0) goto L_0x0adf
            X.0qQ.A0A(r5)
            X.0iw r14 = r1.A0V
            r3 = r42
            android.view.View r3 = r3.itemView
            r38 = r3
            X.0qQ.A06(r38)
            X.Fb0 r19 = new X.Fb0
            r4 = r19
            r3 = r18
            r4.<init>(r1, r3)
            r11 = 0
            X.0qQ.A0B(r5, r11)
            r10 = 1
            r26 = 3
            r3 = r26
            X.0qQ.A0B(r14, r3)
            java.lang.Object r21 = r38.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.gridview.DirectShareSheetGridItemViewBinder.Holder"
            r4 = r21
            X.0qQ.A0C(r4, r3)
            r3 = r21
            X.Ezf r3 = (X.C49622Ezf) r3
            r21 = r3
            com.instagram.model.direct.DirectShareTarget r9 = r8.A09
            if (r9 == 0) goto L_0x0e2c
            r3 = r19
            X.EIn r6 = r3.A01
            X.G9Z r4 = r6.A0B
            boolean r3 = r4.CKT()
            if (r3 != 0) goto L_0x0478
            com.instagram.common.session.UserSession r3 = r6.A01
            boolean r3 = r4.Es3(r3, r9)
            if (r3 == 0) goto L_0x0482
        L_0x0478:
            java.util.LinkedHashSet r3 = r6.A0E
            boolean r3 = r3.contains(r9)
            r20 = 1
            if (r3 == 0) goto L_0x0484
        L_0x0482:
            r20 = 0
        L_0x0484:
            java.util.LinkedHashSet r3 = r6.A0E
            boolean r35 = r3.contains(r9)
            r3 = r21
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r3.A04
            X.3oV r3 = r3.A03
            r37 = r3
            X.34S r4 = X.OXB.A00(r2, r9)
            com.instagram.common.typedurl.ImageUrl r3 = r8.A07
            r34 = r3
            com.instagram.common.typedurl.ImageUrl r3 = X.OXB.A01(r2, r9)
            r6 = 0
            if (r3 != 0) goto L_0x04a5
            if (r34 == 0) goto L_0x05be
            r3 = r34
        L_0x04a5:
            r7.A0F(r6, r14, r3)
        L_0x04a8:
            int r3 = X.2Yu.A02(r5)
            int r3 = r5.getColor(r3)
            r7.setBackgroundRingColor(r3)
            X.DcN r3 = r8.A08
            r33 = r3
            r3 = r21
            com.instagram.common.ui.base.IgTextView r3 = r3.A01
            r36 = r3
            r3 = r21
            com.instagram.common.ui.base.IgTextView r13 = r3.A02
            r32 = 8
            r3 = r32
            r13.setVisibility(r3)
            java.lang.String r14 = ""
            r13.setText(r14)
            boolean r31 = X.C49961FGt.A05(r5, r9)
            r26 = 1
            if (r31 != 0) goto L_0x04dd
            boolean r3 = r9.A0M()
            r25 = 1
            if (r3 != 0) goto L_0x04e1
        L_0x04dd:
            r25 = 0
            if (r31 != 0) goto L_0x04e7
        L_0x04e1:
            boolean r3 = r9.A0M()
            if (r3 != 0) goto L_0x04f5
        L_0x04e7:
            int r4 = r9.A01
            r3 = 47
            if (r4 != r3) goto L_0x05b1
            java.util.List r3 = r9.A0Q
            int r3 = r3.size()
            if (r3 != r10) goto L_0x05b1
        L_0x04f5:
            java.lang.String r4 = X.C49961FGt.A02(r9)
        L_0x04f9:
            boolean r3 = r9 instanceof com.instagram.model.direct.DirectReplyToMediaAuthorShareTarget
            if (r3 == 0) goto L_0x0504
            r3 = 2131960214(0x7f132196, float:1.955709E38)
            java.lang.String r4 = X.DbW.A0h(r5, r4, r3)
        L_0x0504:
            java.lang.String r30 = " "
            java.lang.String[] r3 = new java.lang.String[]{r30}
            java.util.List r15 = X.00l.A0R(r4, r3, r11)
            java.lang.String r29 = ", "
            if (r25 == 0) goto L_0x051c
            java.lang.String r4 = X.C49961FGt.A01(r9)
            r3 = r29
            java.util.List r15 = X.DbV.A18(r4, r3)
        L_0x051c:
            java.lang.String r4 = X.DbU.A0t(r15, r11)
            java.lang.StringBuilder r28 = new java.lang.StringBuilder
            r3 = r28
            r3.<init>(r4)
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131165566(0x7f07017e, float:1.7945353E38)
            float r12 = r4.getDimension(r3)
            boolean r3 = r9.A0K()
            if (r3 != 0) goto L_0x0540
            boolean r3 = r9.A0V()
            if (r3 != 0) goto L_0x0540
            if (r33 == 0) goto L_0x054c
        L_0x0540:
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2131165288(0x7f070068, float:1.7944789E38)
            float r3 = r3.getDimension(r4)
            float r12 = r12 - r3
        L_0x054c:
            int r4 = r15.size()
            r3 = r26
            if (r3 >= r4) goto L_0x06e8
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            r3 = r28
            if (r25 == 0) goto L_0x059e
            r4.append(r3)
            r3 = r29
            r4.append(r3)
            r3 = r26
            java.lang.String r3 = X.DbU.A0t(r15, r3)
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r3, r4)
        L_0x056e:
            android.text.TextPaint r3 = r36.getPaint()
            float r3 = r3.measureText(r4)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x06be
            if (r25 == 0) goto L_0x0594
            java.lang.StringBuilder r4 = X.AnonymousClass7TF.A0n(r29)
        L_0x0580:
            int r24 = r26 + 1
            r3 = r26
            java.lang.String r3 = X.AnonymousClass7TE.A19(r15, r3)
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r3, r4)
            r3 = r28
            r3.append(r4)
            r26 = r24
            goto L_0x054c
        L_0x0594:
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            r3 = 32
            r4.append(r3)
            goto L_0x0580
        L_0x059e:
            r4.append(r3)
            r3 = 32
            r4.append(r3)
            r3 = r26
            java.lang.String r3 = X.AnonymousClass7TE.A19(r15, r3)
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r3, r4)
            goto L_0x056e
        L_0x05b1:
            com.instagram.user.model.User r3 = X.DbT.A0j(r2)
            java.lang.String r4 = X.AnonymousClass50n.A03(r9, r3)
            X.0qQ.A07(r4)
            goto L_0x04f9
        L_0x05be:
            boolean r3 = r8.A03()
            r13 = 8
            if (r3 != 0) goto L_0x05d8
            boolean r3 = r9.A0R
            if (r3 == 0) goto L_0x05d8
            int r12 = r9.A01
            r3 = 47
            if (r12 != r3) goto L_0x06ac
            java.util.List r3 = r9.A0Q
            int r3 = r3.size()
            if (r3 != r10) goto L_0x06ac
        L_0x05d8:
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x0677
            com.instagram.user.model.User r4 = X.DbT.A0j(r2)
            java.util.List r3 = X.DbT.A14(r9)
            java.util.ArrayList r4 = X.AnonymousClass3UE.A05(r4, r3, r11)
            android.view.View r3 = r37.getView()
            r3.setVisibility(r11)
            r7.setVisibility(r13)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A08 = r11
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setImageUrls(r4, r14)
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131165293(0x7f07006d, float:1.79448E38)
            int r13 = X.DbS.A03(r4, r3)
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            int r12 = X.DbS.A03(r4, r3)
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r4 = X.DbS.A03(r4, r3)
            android.view.View r3 = r37.getView()
            r3.setPadding(r13, r12, r13, r4)
            r14 = 2131433686(0x7f0b18d6, float:1.8489165E38)
        L_0x062c:
            X.4gb r13 = new X.4gb
            r13.<init>()
            r3 = r21
            android.view.View r3 = r3.A00
            r25 = r3
            r3 = 24
            java.lang.String r24 = X.C273654mx.A00(r3)
            r4 = r24
            r3 = r25
            X.0qQ.A0C(r3, r4)
            r3 = r25
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r27 = r3
            r13.A0I(r3)
            r12 = 2131433656(0x7f0b18b8, float:1.8489104E38)
            r3 = r26
            r13.A09(r12, r3)
            r13.A09(r12, r10)
            r15 = 2
            r13.A09(r12, r15)
            r3 = 4
            r4 = r3
            r3 = r26
            r13.A0C(r12, r3, r14, r4)
            r13.A0C(r12, r10, r14, r10)
            r13.A0C(r12, r15, r14, r15)
            r4 = r24
            r3 = r25
            X.0qQ.A0C(r3, r4)
            r3 = r27
            r13.A0G(r3)
            goto L_0x04a8
        L_0x0677:
            X.DbZ.A1X(r37)
            r7.setVisibility(r11)
            r3 = 2131231779(0x7f080423, float:1.8079649E38)
            android.graphics.drawable.Drawable r13 = r5.getDrawable(r3)
            java.lang.Object r12 = r4.A00
            com.instagram.common.typedurl.ImageUrl r12 = (com.instagram.common.typedurl.ImageUrl) r12
            java.lang.Object r4 = r4.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            boolean r3 = r7.A08
            if (r3 == 0) goto L_0x0ad4
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r7.A0L
            if (r3 == 0) goto L_0x0ad4
            if (r12 != 0) goto L_0x06a8
            r3.setImageDrawable(r13)
        L_0x0699:
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r7.A0K
            if (r4 != 0) goto L_0x06a4
            r3.setImageDrawable(r13)
        L_0x06a0:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView.A03(r6, r7)
            goto L_0x06b9
        L_0x06a4:
            r3.setUrl(r4, r14)
            goto L_0x06a0
        L_0x06a8:
            r3.setUrl(r12, r14)
            goto L_0x0699
        L_0x06ac:
            X.DbZ.A1X(r37)
            r7.setVisibility(r11)
            java.lang.Object r3 = r4.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            r7.A0F(r6, r14, r3)
        L_0x06b9:
            r14 = 2131433655(0x7f0b18b7, float:1.8489102E38)
            goto L_0x062c
        L_0x06be:
            int r4 = r15.size()
            r3 = r26
            java.util.List r27 = r15.subList(r3, r4)
            boolean r3 = X.AnonymousClass7TE.A1b(r27)
            if (r3 == 0) goto L_0x06d0
            r32 = 0
        L_0x06d0:
            r3 = r32
            r13.setVisibility(r3)
            int r3 = r27.size()
            if (r3 != r10) goto L_0x0a7a
            r3 = r27
            java.lang.String r3 = X.AnonymousClass7TE.A19(r3, r11)
            java.lang.String r3 = X.C49961FGt.A00(r13, r3, r12)
        L_0x06e5:
            r13.setText(r3)
        L_0x06e8:
            r24 = 36318234865571862(0x81073e00081816, double:3.0311361985567106E-306)
            r14 = r17
            r3 = r24
            boolean r3 = X.182.A06(r14, r2, r3)
            if (r3 == 0) goto L_0x06ff
            r3 = r36
            r3.setTypeface(r6, r10)
            r13.setTypeface(r6, r10)
        L_0x06ff:
            r3 = r36
            r3.setVisibility(r11)
            if (r31 != 0) goto L_0x0719
            boolean r3 = r9.A0M()
            if (r3 == 0) goto L_0x0719
            java.lang.CharSequence r3 = r13.getText()
            if (r3 == 0) goto L_0x0719
            boolean r3 = X.00l.A0W(r3)
            r13 = 1
            if (r3 == 0) goto L_0x071a
        L_0x0719:
            r13 = 0
        L_0x071a:
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131165200(0x7f070010, float:1.794461E38)
            float r3 = r4.getDimension(r3)
            java.lang.String r4 = X.DbT.A10(r28)
            if (r13 == 0) goto L_0x072c
            float r12 = r12 - r3
        L_0x072c:
            r3 = r36
            java.lang.String r4 = X.C49961FGt.A00(r3, r4, r12)
            if (r13 == 0) goto L_0x073a
            r3 = 44
            java.lang.String r4 = X.002.A0C(r4, r3)
        L_0x073a:
            r3 = r36
            r3.setText(r4)
            boolean r3 = r9.A0K()
            if (r3 != 0) goto L_0x074d
            boolean r3 = r9.A0V()
            if (r3 != 0) goto L_0x074d
            if (r33 == 0) goto L_0x0754
        L_0x074d:
            r4 = r21
            r3 = r33
            X.C49961FGt.A04(r5, r2, r4, r3, r9)
        L_0x0754:
            boolean r3 = r8.A0E
            if (r3 == 0) goto L_0x0774
            int r3 = X.2Yu.A09(r5)
            int r25 = r5.getColor(r3)
            X.DcN r4 = new X.DcN
            r24 = r4
            r26 = r25
            r27 = r11
            r28 = r10
            r29 = r11
            r24.<init>(r25, r26, r27, r28, r29)
            r3 = r21
            X.C49961FGt.A04(r5, r2, r3, r4, r9)
        L_0x0774:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            boolean r12 = X.C49961FGt.A05(r5, r9)
            if (r12 != 0) goto L_0x0786
            boolean r3 = r9.A0M()
            r13 = 1
            if (r3 != 0) goto L_0x0789
        L_0x0786:
            r13 = 0
            if (r12 != 0) goto L_0x078f
        L_0x0789:
            boolean r3 = r9.A0M()
            if (r3 != 0) goto L_0x079d
        L_0x078f:
            int r12 = r9.A01
            r3 = 47
            if (r12 != r3) goto L_0x0a6d
            java.util.List r3 = r9.A0Q
            int r3 = r3.size()
            if (r3 != r10) goto L_0x0a6d
        L_0x079d:
            java.lang.String r3 = X.C49961FGt.A02(r9)
        L_0x07a1:
            if (r13 == 0) goto L_0x07a7
            java.lang.String r3 = X.C49961FGt.A01(r9)
        L_0x07a7:
            r4.append(r3)
            boolean r3 = r9.A0K()
            if (r3 == 0) goto L_0x0a51
            boolean r3 = r9.A0T
            if (r3 != 0) goto L_0x0a51
            r3 = r30
            r4.append(r3)
            r3 = 2131959507(0x7f131ed3, float:1.9555656E38)
        L_0x07bc:
            java.lang.String r3 = r5.getString(r3)
            r4.append(r3)
        L_0x07c3:
            r3 = r30
            if (r35 == 0) goto L_0x0a49
            r4.append(r3)
            r3 = 2131955092(0x7f130d94, float:1.9546702E38)
        L_0x07cd:
            java.lang.String r3 = r5.getString(r3)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r3 = r38
            r3.setContentDescription(r4)
            r7.setBottomBadgeDrawable(r6)
            boolean r12 = r8.A0F
            boolean r3 = X.DbV.A1Y(r2)
            if (r3 == 0) goto L_0x07f8
            int r3 = r8.A02
            if (r3 <= 0) goto L_0x07f8
            r3 = 36316031546888049(0x81053d00010f71, double:3.029742810949015E-306)
            boolean r3 = X.182.A06(r14, r2, r3)
            r13 = 1
            if (r3 != 0) goto L_0x07f9
        L_0x07f8:
            r13 = 0
        L_0x07f9:
            if (r35 == 0) goto L_0x08ff
            if (r20 != 0) goto L_0x08ff
            r3 = 2131231736(0x7f0803f8, float:1.8079561E38)
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r3)
            r3 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r3 = r5.getDrawable(r3)
            if (r4 == 0) goto L_0x0882
            if (r3 == 0) goto L_0x0882
            r4.mutate()
            r3.mutate()
            r13 = 2
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r4, r3}
            android.graphics.drawable.LayerDrawable r12 = new android.graphics.drawable.LayerDrawable
            r12.<init>(r3)
            r3 = 2130970208(0x7f040660, float:1.754912E38)
            int r8 = X.AnonymousClass7TF.A03(r5, r3)
            android.content.res.ColorStateList r3 = X.1QE.A0B(r5, r6)
            int r4 = r3.getDefaultColor()
            android.graphics.drawable.Drawable r3 = r12.getDrawable(r11)
            r3.setTint(r8)
            android.graphics.drawable.Drawable r3 = r12.getDrawable(r10)
            r3.setTint(r4)
            int r26 = X.DbS.A02(r5, r13)
            r3 = 20
            int r4 = X.DbS.A02(r5, r3)
            int r3 = X.DbS.A02(r5, r3)
            r12.setLayerSize(r10, r4, r3)
            r24 = r12
            r25 = r10
            r27 = r26
            r28 = r26
            r29 = r26
            r24.setLayerInset(r25, r26, r27, r28, r29)
            r7.setBottomBadgeDrawable(r12)
            boolean r3 = r37.CVM()
            if (r3 == 0) goto L_0x0882
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x0882
            r3 = 11
            float r4 = X.0nA.A04(r5, r3)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A00 = r4
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A01 = r4
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setBottomBadgeDrawable(r12)
        L_0x0882:
            r7.setPresenceBadgeDrawable(r6)
            boolean r3 = r37.CVM()
            if (r3 == 0) goto L_0x0898
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x0898
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setPresenceBadgeDrawable(r6)
        L_0x0898:
            r7.setGradientSpinnerVisible(r11)
            r3 = r21
            android.view.View r4 = r3.A00
            X.FO4 r3 = new X.FO4
            r24 = r3
            r25 = r19
            r26 = r22
            r27 = r9
            r28 = r16
            r29 = r11
            r24.<init>(r25, r26, r27, r28, r29)
            X.AnonymousClass0fU.A00(r3, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r20 == 0) goto L_0x08ba
            r3 = 1050253722(0x3e99999a, float:0.3)
        L_0x08ba:
            r4.setAlpha(r3)
            if (r20 == 0) goto L_0x08c6
            r7 = 54
            r3 = r19
            X.FPE.A01(r4, r7, r3, r9)
        L_0x08c6:
            if (r48 == 0) goto L_0x08fb
            r3 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r3 = X.AnonymousClass7TF.A03(r5, r3)
            r4.setBackgroundColor(r3)
        L_0x08d2:
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            boolean r3 = r3 instanceof X.C320856t4
            if (r3 == 0) goto L_0x0e2c
            boolean r3 = X.DbW.A1T(r14, r2)
            if (r3 == 0) goto L_0x0e2c
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            r3 = 3647(0xe3f, float:5.11E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0qQ.A0C(r7, r3)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r6 = 16
            r3 = r18
            X.C49750F5b.A01(r5, r7, r2, r6, r3)
            r4.setLayoutParams(r7)
            goto L_0x0e2c
        L_0x08fb:
            r4.setBackground(r6)
            goto L_0x08d2
        L_0x08ff:
            r3 = -6
            float r4 = X.0nA.A04(r5, r3)
            boolean r3 = r8.A03()
            if (r3 != 0) goto L_0x0925
            boolean r3 = r8.A0G
            if (r3 == 0) goto L_0x0925
            r3 = 2130970900(0x7f040914, float:1.7550523E38)
            int r3 = X.2Yu.A0H(r5, r3)
            android.graphics.drawable.Drawable r3 = r5.getDrawable(r3)
            r7.setBottomBadgeDrawable(r3)
            r7.A00 = r4
            r7.A01 = r4
            r7.setPresenceBadgeDrawable(r6)
            goto L_0x0898
        L_0x0925:
            if (r12 == 0) goto L_0x0978
            android.graphics.drawable.Drawable r10 = X.DbY.A07(r5)
            r3 = 17
            int r12 = X.DbS.A02(r5, r3)
            r7.setBottomBadgeDrawable(r10)
            android.graphics.drawable.Drawable r3 = r7.A06
            if (r3 == 0) goto L_0x093b
            r3.setBounds(r11, r11, r12, r12)
        L_0x093b:
            r7.setPresenceBadgeDrawable(r6)
            boolean r3 = r37.CVM()
            if (r3 == 0) goto L_0x096a
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x096a
            r3 = 8
            float r12 = X.0nA.A04(r5, r3)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A00 = r12
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A01 = r12
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setPresenceBadgeDrawable(r6)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setBottomBadgeDrawable(r10)
        L_0x096a:
            boolean r3 = r8.A03()
            if (r3 == 0) goto L_0x0972
            if (r34 == 0) goto L_0x0898
        L_0x0972:
            r7.A00 = r4
            r7.A01 = r4
            goto L_0x0898
        L_0x0978:
            if (r13 == 0) goto L_0x0a06
            int r8 = r8.A02
            r3 = 61
            if (r3 > r8) goto L_0x0a02
            r3 = 36316031546822512(0x81053d00000f70, double:3.029742810907569E-306)
            boolean r3 = X.182.A06(r14, r2, r3)
            if (r3 == 0) goto L_0x0997
            r3 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            boolean r3 = X.182.A06(r14, r2, r3)
            r13 = 1
            if (r3 != 0) goto L_0x0998
        L_0x0997:
            r13 = 0
        L_0x0998:
            r3 = 480(0x1e0, float:6.73E-43)
            if (r8 > r3) goto L_0x09b3
            r3 = 36316031546822512(0x81053d00000f70, double:3.029742810907569E-306)
            boolean r3 = X.182.A06(r14, r2, r3)
            if (r3 == 0) goto L_0x09b3
            r3 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            boolean r3 = X.182.A06(r14, r2, r3)
            r12 = 1
            if (r3 != 0) goto L_0x09b6
        L_0x09b3:
            r12 = 0
            if (r13 == 0) goto L_0x0a02
        L_0x09b6:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r3 = (long) r8
            long r3 = r10.toHours(r3)
            int r10 = (int) r3
            if (r12 != 0) goto L_0x09c2
            if (r13 == 0) goto L_0x0a02
        L_0x09c2:
            r3 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r12 != 0) goto L_0x09c9
            if (r13 == 0) goto L_0x09ca
        L_0x09c9:
            r8 = r10
        L_0x09ca:
            X.U0t r4 = X.DbZ.A0X(r5, r8, r3)
            r7.setPresenceBadgeDrawable(r4)
            r7.setBottomBadgeDrawable(r6)
            boolean r3 = r37.CVM()
            if (r3 == 0) goto L_0x0898
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x0898
            r3 = 11
            float r8 = X.0nA.A04(r5, r3)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A01 = r8
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.A00 = r8
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setBottomBadgeDrawable(r6)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setPresenceBadgeDrawable(r4)
            goto L_0x0898
        L_0x0a02:
            r3 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x09ca
        L_0x0a06:
            r7.setPresenceBadgeDrawable(r6)
            r7.setBottomBadgeDrawable(r6)
            r8 = 2
            float r3 = X.0nA.A04(r5, r8)
            r7.A01 = r3
            float r3 = X.0nA.A04(r5, r8)
            r7.A00 = r3
            boolean r3 = r37.CVM()
            if (r3 == 0) goto L_0x0898
            boolean r3 = X.C49961FGt.A06(r2)
            if (r3 == 0) goto L_0x0898
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setPresenceBadgeDrawable(r6)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r3 = X.DbS.A0Z(r37)
            r3.setBottomBadgeDrawable(r6)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r4 = X.DbS.A0Z(r37)
            float r3 = X.0nA.A04(r5, r8)
            r4.A01 = r3
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r4 = X.DbS.A0Z(r37)
            float r3 = X.0nA.A04(r5, r8)
            r4.A00 = r3
            goto L_0x0898
        L_0x0a49:
            r4.append(r3)
            r3 = 2131975845(0x7f135ea5, float:1.9588794E38)
            goto L_0x07cd
        L_0x0a51:
            boolean r3 = r9.A0V()
            if (r3 == 0) goto L_0x0a61
            r3 = r30
            r4.append(r3)
            r3 = 2131976380(0x7f1360bc, float:1.9589879E38)
            goto L_0x07bc
        L_0x0a61:
            if (r33 == 0) goto L_0x07c3
            r3 = r30
            r4.append(r3)
            r3 = 2131959041(0x7f131d01, float:1.9554711E38)
            goto L_0x07bc
        L_0x0a6d:
            com.instagram.user.model.User r3 = X.DbT.A0j(r2)
            java.lang.String r3 = X.AnonymousClass50n.A03(r9, r3)
            X.0qQ.A07(r3)
            goto L_0x07a1
        L_0x0a7a:
            int r3 = r27.size()
            if (r3 <= r10) goto L_0x06e8
            if (r25 == 0) goto L_0x0acb
            java.util.Iterator r26 = r27.iterator()
            r15 = 0
        L_0x0a87:
            boolean r3 = r26.hasNext()
            if (r3 == 0) goto L_0x0ac2
            int r25 = r15 + 1
            java.lang.String r3 = X.AnonymousClass7TE.A18(r26)
            r4 = r29
            java.lang.String r14 = X.002.A0g(r14, r3, r4)
            if (r14 == 0) goto L_0x0ac8
            int r3 = r14.length()
            r24 = 8
            r4 = r3
            r3 = r24
            if (r4 <= r3) goto L_0x0ac8
            int r3 = r27.size()
            int r3 = r3 + -1
            if (r15 == r3) goto L_0x0ac8
            r3 = r24
            java.lang.String r14 = X.00R.A03(r14, r3)
            java.lang.String r4 = "... +"
            r3 = r27
            int r3 = X.DbT.A02(r3, r15)
            int r3 = r3 + -1
            java.lang.String r14 = X.002.A0b(r14, r4, r3)
        L_0x0ac2:
            java.lang.String r3 = X.C49961FGt.A00(r13, r14, r12)
            goto L_0x06e5
        L_0x0ac8:
            r15 = r25
            goto L_0x0a87
        L_0x0acb:
            r4 = r30
            r3 = r27
            java.lang.String r14 = android.text.TextUtils.join(r4, r3)
            goto L_0x0ac2
        L_0x0ad4:
            r0 = 463(0x1cf, float:6.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0adf:
            X.OZA r3 = X.OZA.A00
            boolean r33 = r3.A01(r2, r0)
            r3 = r42
            android.view.View r4 = r3.itemView
            X.MTF r3 = r1.A0d
            r28 = r3
            X.G9Z r3 = r1.A0B
            r25 = r3
            X.G5d r5 = r1.A0X
            int r6 = r1.A0A
            if (r6 == 0) goto L_0x0d56
            r3 = 1
            if (r6 == r3) goto L_0x0d52
            r3 = 2
            if (r6 == r3) goto L_0x0d4e
            java.lang.Integer r29 = X.AnonymousClass05K.A1F
        L_0x0aff:
            X.FbL r21 = new X.FbL
            r24 = r21
            r26 = r5
            r27 = r0
            r30 = r16
            r31 = r22
            r32 = r23
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0iw r15 = r1.A0V
            java.lang.Object r13 = X.DbT.A0o(r4)
            X.F11 r13 = (X.F11) r13
            com.instagram.model.direct.DirectShareTarget r12 = r8.A09
            r12.getClass()
            android.content.Context r11 = r4.getContext()
            android.widget.TextView r6 = r13.A06
            java.lang.String r10 = r8.A0C
            r6.setText(r10)
            java.util.List r7 = r8.A0D
            int r4 = r7.size()
            r5 = 0
            r3 = 1
            if (r4 != r3) goto L_0x0b3d
            java.lang.Object r3 = r7.get(r5)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r3
            boolean r3 = r3.A0b
            if (r3 == 0) goto L_0x0b3d
            r5 = 1
        L_0x0b3d:
            boolean r3 = X.C66651MaK.A00(r2, r12)
            r9 = 0
            if (r3 == 0) goto L_0x0d4b
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.Jw4 r3 = new X.Jw4
            r3.<init>((java.lang.Integer) r4)
        L_0x0b4b:
            X.C46334Dcc.A00(r6, r3, r10, r5)
            boolean r3 = r8.A02()
            r5 = 8
            r14 = 0
            if (r3 == 0) goto L_0x0d44
            boolean r3 = r8.A03()
            if (r3 == 0) goto L_0x0d38
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r3 = r12.A04
            if (r3 != 0) goto L_0x0d38
            android.widget.TextView r4 = r13.A05
            X.FvE r3 = new X.FvE
            r3.<init>(r11, r2, r13, r8)
            r4.post(r3)
        L_0x0b6b:
            android.text.SpannableStringBuilder r7 = r8.A05
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x0d31
            android.widget.TextView r6 = r13.A04
            r6.setText(r7)
            r6.setVisibility(r14)
            boolean r3 = r8.A02()
            if (r3 == 0) goto L_0x0d1f
            r3 = 36314811777092405(0x810421000f0b35, double:3.028971423618631E-306)
            r5 = r17
            boolean r3 = X.182.A06(r5, r2, r3)
            if (r3 == 0) goto L_0x0d0d
            if (r7 == 0) goto L_0x0d0d
            java.lang.String r4 = r7.toString()
            java.lang.String r3 = "You both"
            boolean r3 = r4.startsWith(r3)
            if (r3 != 0) goto L_0x0d0d
            r3 = 2
            r6.setMaxLines(r3)
            android.view.ViewGroup r3 = r13.A03
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.content.res.Resources r4 = r11.getResources()
            r3 = 2131165265(0x7f070051, float:1.7944742E38)
            X.DbT.A1B(r4, r5, r3)
        L_0x0bb0:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r13.A0A
            X.C49758F5j.A00(r15, r2, r8, r7)
            r7.setGradientSpinnerVisible(r14)
            boolean r3 = r8.A03()
            if (r3 != 0) goto L_0x0c91
            boolean r3 = r8.A0G
            if (r3 == 0) goto L_0x0c91
            r3 = 2130970900(0x7f040914, float:1.7550523E38)
            X.DbY.A0x(r11, r7, r3)
        L_0x0bc8:
            X.LRm r5 = r28.AXA()
            r5.getClass()
            X.Juy r3 = X.C61002Juy.A04
            X.Juy r3 = X.C64010LIx.A00(r12)
            X.LMN r6 = r5.A01(r3)
            java.lang.Integer r4 = r6.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r4 == r3) goto L_0x0be3
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            if (r4 != r3) goto L_0x0c01
        L_0x0be3:
            X.Juy r3 = X.C61002Juy.A04
            X.MXS r4 = r5.A02(r3)
            X.Juy r3 = X.C61002Juy.A06
            X.MXS r3 = r5.A02(r3)
            if (r4 == 0) goto L_0x0c6e
            if (r3 == 0) goto L_0x0c69
            boolean r3 = r3.CKn(r12)
            if (r3 != 0) goto L_0x0bff
            boolean r3 = r4.CKn(r12)
            if (r3 == 0) goto L_0x0c77
        L_0x0bff:
            X.LMN r6 = X.LMN.A04
        L_0x0c01:
            X.LRd r7 = r13.A08
            r3 = r21
            r7.A03(r6, r3)
            java.lang.Integer r5 = r6.A01
            r7.A05(r10, r5)
            java.lang.Integer r4 = r7.A05
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            if (r4 != r3) goto L_0x0c2e
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r4 = r17
            boolean r4 = X.182.A05(r4, r2)
            if (r5 != r3) goto L_0x0c60
            r2 = 2131952457(0x7f130349, float:1.9541357E38)
            if (r4 == 0) goto L_0x0c25
            r2 = 2131952458(0x7f13034a, float:1.954136E38)
        L_0x0c25:
            android.view.ViewGroup r3 = r13.A03
            java.lang.String r2 = X.DbW.A0h(r11, r10, r2)
            r3.setContentDescription(r2)
        L_0x0c2e:
            X.LMN r2 = r13.A00
            if (r2 == 0) goto L_0x0c39
            java.lang.Integer r2 = r2.A01
            if (r2 == r5) goto L_0x0c39
            r7.A02()
        L_0x0c39:
            r13.A00 = r6
            android.view.ViewGroup r4 = r13.A03
            X.LMN r3 = X.LMN.A02
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r3) goto L_0x0c46
            r2 = 1050253722(0x3e99999a, float:0.3)
        L_0x0c46:
            r4.setAlpha(r2)
            X.2eb r5 = r13.A07
            X.Mhs r3 = r13.A09
            X.DcN r2 = r8.A08
            X.C46488Dfr.A00(r5, r3, r2)
            if (r48 == 0) goto L_0x0d5a
            r2 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r2 = X.AnonymousClass7TF.A03(r11, r2)
            r4.setBackgroundColor(r2)
            goto L_0x0e2c
        L_0x0c60:
            r2 = 2131952416(0x7f130320, float:1.9541274E38)
            if (r4 == 0) goto L_0x0c25
            r2 = 2131952417(0x7f130321, float:1.9541276E38)
            goto L_0x0c25
        L_0x0c69:
            boolean r3 = r4.CKn(r12)
            goto L_0x0c74
        L_0x0c6e:
            if (r3 == 0) goto L_0x0c77
            boolean r3 = r3.CKn(r12)
        L_0x0c74:
            if (r3 == 0) goto L_0x0c77
            goto L_0x0bff
        L_0x0c77:
            boolean r3 = r1.A0S
            if (r3 != 0) goto L_0x0c8d
            boolean r3 = r25.CKT()
            if (r3 != 0) goto L_0x0c8d
            r3 = r25
            boolean r3 = r3.Es3(r2, r12)
            if (r3 != 0) goto L_0x0c8d
            X.LMN r6 = X.LMN.A05
            goto L_0x0c01
        L_0x0c8d:
            X.LMN r6 = X.LMN.A02
            goto L_0x0c01
        L_0x0c91:
            boolean r3 = r8.A0F
            if (r3 == 0) goto L_0x0c9d
            r3 = 2130970844(0x7f0408dc, float:1.755041E38)
            X.DbY.A0x(r11, r7, r3)
            goto L_0x0bc8
        L_0x0c9d:
            boolean r3 = X.C49758F5j.A01(r2, r8)
            if (r3 == 0) goto L_0x0d05
            int r6 = r8.A02
            long r14 = (long) r6
            r4 = 1440(0x5a0, double:7.115E-321)
            r20 = 60
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0cc3
            r3 = r20
            if (r6 <= r3) goto L_0x0cc3
            r18 = 36318234865309714(0x81073e00041812, double:3.031136198390927E-306)
            r5 = r17
            r3 = r18
            boolean r3 = X.182.A06(r5, r2, r3)
            r19 = 1
            if (r3 != 0) goto L_0x0cc5
        L_0x0cc3:
            r19 = 0
        L_0x0cc5:
            r4 = 480(0x1e0, double:2.37E-321)
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0cde
            r3 = r20
            if (r6 <= r3) goto L_0x0cde
            r4 = 36318234865244177(0x81073e00031811, double:3.0311361983494813E-306)
            r3 = r17
            boolean r3 = X.182.A06(r3, r2, r4)
            r18 = 1
            if (r3 != 0) goto L_0x0ce2
        L_0x0cde:
            r18 = 0
            if (r19 == 0) goto L_0x0d01
        L_0x0ce2:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            long r3 = r3.toHours(r14)
            int r5 = (int) r3
            if (r18 != 0) goto L_0x0ced
            if (r19 == 0) goto L_0x0d01
        L_0x0ced:
            r3 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r18 != 0) goto L_0x0cf4
            if (r19 == 0) goto L_0x0cf5
        L_0x0cf4:
            r6 = r5
        L_0x0cf5:
            X.U0t r3 = X.DbZ.A0X(r11, r6, r3)
            r7.setPresenceBadgeDrawable(r3)
            r7.setBottomBadgeDrawable(r9)
            goto L_0x0bc8
        L_0x0d01:
            r3 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x0cf5
        L_0x0d05:
            r7.setBottomBadgeDrawable(r9)
            r7.setPresenceBadgeDrawable(r9)
            goto L_0x0bc8
        L_0x0d0d:
            android.view.ViewGroup r3 = r13.A03
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.content.res.Resources r4 = r11.getResources()
            r3 = 2131165229(0x7f07002d, float:1.794467E38)
            X.DbT.A1B(r4, r5, r3)
            goto L_0x0bb0
        L_0x0d1f:
            android.view.ViewGroup r3 = r13.A03
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.content.res.Resources r4 = r11.getResources()
            r3 = 2131165251(0x7f070043, float:1.7944714E38)
            X.DbT.A1B(r4, r5, r3)
            goto L_0x0bb0
        L_0x0d31:
            android.widget.TextView r3 = r13.A04
            r3.setVisibility(r5)
            goto L_0x0bb0
        L_0x0d38:
            android.widget.TextView r4 = r13.A05
            android.text.SpannableStringBuilder r3 = r8.A06
            r4.setText(r3)
            r4.setVisibility(r14)
            goto L_0x0b6b
        L_0x0d44:
            android.widget.TextView r3 = r13.A05
            r3.setVisibility(r5)
            goto L_0x0b6b
        L_0x0d4b:
            r3 = r9
            goto L_0x0b4b
        L_0x0d4e:
            java.lang.Integer r29 = X.AnonymousClass05K.A15
            goto L_0x0aff
        L_0x0d52:
            java.lang.Integer r29 = X.AnonymousClass05K.A0j
            goto L_0x0aff
        L_0x0d56:
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            goto L_0x0aff
        L_0x0d5a:
            r4.setBackground(r9)
            goto L_0x0e2c
        L_0x0d5f:
            r11 = move-exception
            X.0wj r7 = X.0wj.A01
            r4 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "shh thread background not set"
            X.AnonymousClass7TG.A1I(r7, r3, r11, r4)
        L_0x0d6a:
            r12.setGradientSpinnerVisible(r9)
            android.widget.TextView r12 = r10.A09
            boolean r7 = r0.A0V()
            boolean r3 = X.C66651MaK.A00(r2, r0)
            if (r3 == 0) goto L_0x0e7a
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.Jw4 r4 = new X.Jw4
            r4.<init>((java.lang.Integer) r3)
        L_0x0d80:
            r3 = r21
            X.C46334Dcc.A00(r12, r4, r3, r7)
            r4 = r3
            r3 = r24
            android.text.SpannableStringBuilder r11 = X.C49751F5c.A00(r5, r2, r0, r4, r3)
            boolean r3 = r0.A0M()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0e62
            boolean r3 = r0.A0I()
            if (r3 == 0) goto L_0x0dac
            r3 = 2130970132(0x7f040614, float:1.7548965E38)
            int r3 = X.AnonymousClass7TF.A03(r5, r3)
            android.widget.TextView r4 = X.DbZ.A0C(r5, r10)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r4.setCompoundDrawableTintList(r3)
        L_0x0dac:
            android.widget.TextView r4 = r10.A0A
            X.Fvh r3 = new X.Fvh
            r26 = r3
            r27 = r5
            r28 = r11
            r29 = r2
            r30 = r10
            r31 = r0
            r26.<init>(r27, r28, r29, r30, r31)
            r4.post(r3)
        L_0x0dc2:
            android.widget.TextView r3 = r10.A07
            r3.setVisibility(r6)
            r2 = r24
            android.text.SpannableStringBuilder r2 = X.C49751F5c.A01(r5, r0, r2)
            boolean r11 = android.text.TextUtils.isEmpty(r2)
            if (r11 != 0) goto L_0x0ddb
            if (r40 == 0) goto L_0x0ddb
            r3.setText(r2)
            r3.setVisibility(r9)
        L_0x0ddb:
            r2 = r25
            boolean r11 = r2.Es2(r0)
            android.widget.ImageView r2 = r10.A04
            r2.setVisibility(r6)
            X.DbY.A12(r12, r5)
            X.DbY.A11(r4, r5)
            X.DbY.A11(r3, r5)
            android.widget.ImageView r2 = r10.A05
            r2.setVisibility(r6)
            if (r11 != 0) goto L_0x0e5c
            android.widget.CheckBox r3 = r10.A02
            r3.setVisibility(r9)
            r2 = r25
            boolean r2 = r2.CbW(r0)
            r3.setChecked(r2)
        L_0x0e04:
            android.widget.LinearLayout r2 = r10.A06
            if (r11 == 0) goto L_0x0e0b
            r7 = 1050253722(0x3e99999a, float:0.3)
        L_0x0e0b:
            r2.setAlpha(r7)
            if (r11 == 0) goto L_0x0e1e
            r4 = 68
            X.FPE r3 = new X.FPE
            r2 = r25
            r3.<init>((X.G8F) r2, (com.instagram.model.direct.DirectShareTarget) r0, (int) r4)
            r2 = r38
            X.AnonymousClass0fU.A00(r3, r2)
        L_0x0e1e:
            if (r48 == 0) goto L_0x0e56
            r2 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r3 = X.AnonymousClass7TF.A03(r5, r2)
            r2 = r38
            r2.setBackgroundColor(r3)
        L_0x0e2c:
            X.2el r5 = r1.A0W
            if (r5 == 0) goto L_0x0e55
            X.ExU r6 = new X.ExU
            r4 = r23
            r3 = r22
            r2 = r16
            r6.<init>(r4, r3, r2)
            java.lang.String r2 = r0.A09()
            X.30a r2 = X.AnonymousClass30Y.A00(r0, r6, r2)
            X.G9Z r1 = r1.A0B
            X.FZM r0 = new X.FZM
            r0.<init>(r1)
            X.30Y r1 = X.DbU.A0a(r0, r2)
            r0 = r42
            android.view.View r0 = r0.itemView
            r5.A05(r0, r1)
        L_0x0e55:
            return
        L_0x0e56:
            r2 = r38
            r2.setBackground(r8)
            goto L_0x0e2c
        L_0x0e5c:
            android.widget.CheckBox r2 = r10.A02
            r2.setVisibility(r6)
            goto L_0x0e04
        L_0x0e62:
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            android.widget.TextView r4 = r10.A0A
            if (r2 == 0) goto L_0x0e6f
            r4.setVisibility(r6)
            goto L_0x0dc2
        L_0x0e6f:
            r4.setText(r11)
            r4.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r9, r9)
            r4.setVisibility(r9)
            goto L_0x0dc2
        L_0x0e7a:
            r4 = 0
            goto L_0x0d80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.A0B(X.3kE, com.instagram.model.direct.DirectShareTarget, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cf, code lost:
        if (r9.A1t() == X.AnonymousClass3QO.FOLLOWERS_ONLY) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x012f, code lost:
        if (X.182.A06(r3, r4, 36325239956714247L) != false) goto L_0x0131;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47816EIn(X.AnonymousClass0iw r15, com.instagram.common.session.UserSession r16, X.2el r17, X.G9Z r18, X.C51866G5d r19, X.1Xj r20, X.1Xl r21, X.2FW r22, X.MTF r23, java.lang.String r24, java.lang.String r25, int r26, int r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            r14 = this;
            r3 = 1
            r8 = r16
            X.0qQ.A0B(r8, r3)
            r0 = 18
            r5 = r22
            X.0qQ.A0B(r5, r0)
            r0 = 19
            r2 = r24
            X.0qQ.A0B(r2, r0)
            r10 = r21
            r9 = r20
            r13 = r38
            r11 = r36
            r12 = r34
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r14.A0D = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r14.A0C = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r14.A00 = r0
            X.Fd1 r0 = new X.Fd1
            r1 = r18
            r0.<init>(r1, r3)
            r14.A0Y = r0
            r14.setHasStableIds(r3)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0Q = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0J = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0N = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0I = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0G = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0L = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0K = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0H = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0M = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0F = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0P = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r14.A0O = r0
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r14.A0E = r0
            r14.A0V = r15
            r14.A0B = r1
            r0 = r19
            r14.A0X = r0
            r0 = r31
            r14.A0S = r0
            r14.A0R = r12
            r0 = r35
            r14.A0i = r0
            r6 = r26
            if (r20 == 0) goto L_0x00d1
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r10 instanceof X.AnonymousClass3OA
            if (r0 != 0) goto L_0x00d1
            com.instagram.model.mediatype.ProductType r1 = r9.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r1 == r0) goto L_0x00c8
            com.instagram.model.mediatype.ProductType r1 = r9.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED_CAROUSEL
            if (r1 == r0) goto L_0x00c8
            boolean r0 = r9.A5G()
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r9.A5Y()
            if (r0 == 0) goto L_0x00d1
        L_0x00c8:
            X.3QO r4 = r9.A1t()
            X.3QO r1 = X.AnonymousClass3QO.FOLLOWERS_ONLY
            r0 = 0
            if (r4 != r1) goto L_0x00d2
        L_0x00d1:
            r0 = r6
        L_0x00d2:
            r14.A00 = r0
            r14.A0U = r6
            r14.A0g = r13
            r0 = r27
            r14.A0A = r0
            r0 = r28
            r14.A0m = r0
            r14.A0Z = r5
            X.17i r0 = X.17h.A00(r8)
            r14.A0c = r0
            X.3mS r0 = X.C251033mS.A00(r8)
            r14.A0a = r0
            X.3mO r0 = X.C250993mO.A01(r8)
            r14.A0b = r0
            boolean r0 = X.DbV.A1Y(r8)
            r14.A0j = r0
            int r0 = r14.A00
            boolean r5 = X.AnonymousClass7TF.A1P(r0)
            X.1Xj r1 = r14.A02
            r6 = 1
            if (r1 == 0) goto L_0x01c7
            boolean r0 = r1.A5G()
            if (r0 != r3) goto L_0x01c7
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x01c7
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01c7
            com.instagram.common.session.UserSession r4 = r14.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x01c7
            r0 = 36325239956714247(0x810d9d00003307, double:3.035566246402393E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x01c7
        L_0x0131:
            java.util.LinkedHashSet r4 = r14.A03
            r4.clear()
            if (r29 == 0) goto L_0x013c
            r0 = 0
            X.AnonymousClass7TF.A1M(r4, r0)
        L_0x013c:
            if (r37 == 0) goto L_0x0143
            r0 = 39
            X.AnonymousClass7TF.A1M(r4, r0)
        L_0x0143:
            if (r5 == 0) goto L_0x0161
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0161
            com.instagram.common.session.UserSession r5 = r14.A01
            boolean r3 = r14.A05
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.DbW.A1T(r0, r5)
            boolean r0 = r14.A06
            r0 = r0 ^ 1
            boolean r0 = X.FGK.A02(r5, r3, r1, r0)
            if (r0 != 0) goto L_0x0161
            r0 = 3
            X.AnonymousClass7TF.A1M(r4, r0)
        L_0x0161:
            if (r30 == 0) goto L_0x0182
            com.instagram.common.session.UserSession r5 = r14.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x017d
            r0 = 36318234865375251(0x81073e00051813, double:3.031136198432373E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x0182
        L_0x017d:
            r0 = 27
            X.AnonymousClass7TF.A1M(r4, r0)
        L_0x0182:
            if (r6 == 0) goto L_0x0189
            r0 = 41
            X.AnonymousClass7TF.A1M(r4, r0)
        L_0x0189:
            r0 = r32
            r14.A0k = r0
            r0 = r33
            r14.A0l = r0
            r0 = r23
            r14.A0d = r0
            r14.A0f = r2
            r0 = r17
            r14.A0W = r0
            r0 = 20
            r14.A09 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314811776961332(0x810421000d0b34, double:3.02897142353574E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r14.A0h = r0
            r0 = r25
            r14.A0e = r0
            r0 = 36602230987559523(0x82098900001263, double:3.210736489662302E-306)
            int r0 = X.DbS.A04(r2, r8, r0)
            r14.A08 = r0
            r0 = 36317521901655314(0x81069800121512, double:3.0306853173050104E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r14.A0T = r0
            return
        L_0x01c7:
            r6 = 0
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816EIn.<init>(X.0iw, com.instagram.common.session.UserSession, X.2el, X.G9Z, X.G5d, X.1Xj, X.1Xl, X.2FW, X.MTF, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
