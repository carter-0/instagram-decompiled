package X;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.ArrayList;
import java.util.Iterator;

public final class LSN {
    public int A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public K99 A04;
    public C62630Kj1 A05;
    public Boolean A06;
    public Integer A07;
    public boolean A08;
    public boolean A09 = false;
    public boolean A0A = true;
    public boolean A0B = true;
    public View A0C;
    public final View A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final FragmentActivity A0I;
    public final AnonymousClass0iw A0J;
    public final UserSession A0K;
    public final MXd A0L;
    public final String A0M;
    public final boolean A0N;
    public final ViewStub A0O;
    public final TextView A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (com.instagram.tagging.activity.TaggingActivity.A0T(r5) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.1iA r6, X.LSN r7, X.C62630Kj1 r8, int r9, boolean r10) {
        /*
            if (r9 <= 0) goto L_0x00eb
            android.widget.ImageView r0 = r7.A01
            X.AnonymousClass7TH.A0R(r0)
            r3 = 0
            r7.A03(r3, r10)
            android.widget.ListView r4 = r7.A02
            if (r4 == 0) goto L_0x005c
            int r1 = r8.ordinal()
            r0 = 6
            if (r1 == r0) goto L_0x005d
            r0 = 1
            if (r1 == r0) goto L_0x005d
            r0 = 2
            if (r1 != r0) goto L_0x0054
            X.K99 r2 = r7.A04
            X.MXd r5 = r7.A0L
            r1 = r5
            com.instagram.tagging.activity.TaggingActivity r1 = (com.instagram.tagging.activity.TaggingActivity) r1
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0V(r1)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r1.CKU()
            if (r0 != 0) goto L_0x0036
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0T(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            boolean r0 = r2.A06
            if (r0 == r1) goto L_0x003d
            r2.A06 = r1
        L_0x003d:
            java.util.ArrayList r0 = r5.BgW()
            java.util.List r5 = r2.A0K
            r5.clear()
            java.util.List r1 = r2.A0L
            r1.clear()
            r1 = 0
            r2.A02 = r1
        L_0x004e:
            r5.addAll(r0)
        L_0x0051:
            r4.setAdapter(r2)
        L_0x0054:
            X.K99 r0 = r7.A04
            r0.A0C()
            r4.setVisibility(r3)
        L_0x005c:
            return
        L_0x005d:
            X.K99 r2 = r7.A04
            X.MXd r6 = r7.A0L
            r5 = r6
            com.instagram.tagging.activity.TaggingActivity r5 = (com.instagram.tagging.activity.TaggingActivity) r5
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0V(r5)
            if (r0 != 0) goto L_0x0077
            boolean r0 = r5.CKU()
            if (r0 != 0) goto L_0x0077
            boolean r0 = com.instagram.tagging.activity.TaggingActivity.A0T(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            boolean r0 = r2.A06
            if (r0 == r1) goto L_0x007e
            r2.A06 = r1
        L_0x007e:
            java.util.ArrayList r0 = r6.BbX()
            r2.A0D(r0)
            java.util.ArrayList r1 = r5.A0M
            if (r1 == 0) goto L_0x00e3
            int r0 = r5.A00
            java.lang.Object r0 = X.DbZ.A0g(r1, r0)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r0
            java.lang.String r0 = r0.A05
            r2.A04 = r0
            java.util.ArrayList r1 = r6.C3x()
            java.util.List r0 = r2.A0I
            r0.clear()
            r0.addAll(r1)
            java.util.ArrayList r0 = r5.A0M
            if (r0 == 0) goto L_0x00e3
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTT.A0i(r5, r0)
            if (r0 != 0) goto L_0x00dc
            X.0sn r1 = X.0sn.A00
        L_0x00ad:
            java.util.List r0 = r2.A0G
            r0.clear()
            r0.addAll(r1)
            java.lang.Boolean r0 = r7.A06
            r2.A03 = r0
            boolean r0 = r7.A0B
            r2.A0A = r0
            boolean r0 = r7.A0A
            r2.A08 = r0
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0051
            java.util.ArrayList r1 = r5.A0M
            if (r1 == 0) goto L_0x00e3
            int r0 = r5.A00
            java.lang.Object r0 = X.DbZ.A0g(r1, r0)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r0
            java.util.ArrayList r0 = r0.A0A
            java.util.List r5 = r2.A0J
            r5.clear()
            if (r0 == 0) goto L_0x0051
            goto L_0x004e
        L_0x00dc:
            java.util.ArrayList r0 = r0.A09
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x00ad
        L_0x00e3:
            X.JTO.A1L()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00eb:
            X.1iA r2 = X.1iA.A0a
            if (r6 == r2) goto L_0x00fe
            androidx.fragment.app.FragmentActivity r3 = r7.A0I
            r0 = 1
            boolean r1 = X.2eO.A01(r3, r0)
            boolean r0 = X.2eO.A00(r3)
            if (r1 == 0) goto L_0x0186
            if (r0 == 0) goto L_0x0186
        L_0x00fe:
            android.widget.ImageView r0 = r7.A01
            if (r0 != 0) goto L_0x011e
            android.view.ViewStub r0 = r7.A0E
            android.view.View r0 = r0.inflate()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A01 = r0
            androidx.fragment.app.FragmentActivity r1 = r7.A0I
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r0)
            android.widget.ImageView r0 = r7.A01
            r0.setColorFilter(r1)
        L_0x011e:
            android.widget.ImageView r1 = r7.A01
            r0 = 0
        L_0x0121:
            r1.setVisibility(r0)
        L_0x0124:
            android.widget.TextView r3 = r7.A0G
            if (r6 == r2) goto L_0x0137
            androidx.fragment.app.FragmentActivity r0 = r7.A0I
            r4 = 1
            boolean r1 = X.2eO.A01(r0, r4)
            boolean r0 = X.2eO.A00(r0)
            if (r1 == 0) goto L_0x015f
            if (r0 == 0) goto L_0x015f
        L_0x0137:
            X.Kj1 r0 = r7.A05
            int r1 = r0.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x0152
            r0 = 2
            if (r1 != r0) goto L_0x018d
            r1 = 2131969874(0x7f134752, float:1.9576683E38)
        L_0x0146:
            r3.setText(r1)
            r7.A03(r2, r10)
            android.widget.ListView r0 = r7.A02
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0152:
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x015b
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x015b
            goto L_0x017e
        L_0x015b:
            r1 = 2131976520(0x7f136148, float:1.9590163E38)
            goto L_0x0146
        L_0x015f:
            X.Kj1 r0 = r7.A05
            int r1 = r0.ordinal()
            r2 = 1
            if (r1 == r4) goto L_0x0176
            r0 = 2
            if (r1 != r0) goto L_0x0194
            boolean r0 = r7.A08
            r1 = 2131969873(0x7f134751, float:1.9576681E38)
            if (r0 == 0) goto L_0x0146
            r1 = 2131974698(0x7f135a2a, float:1.9586467E38)
            goto L_0x0146
        L_0x0176:
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x0182
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0182
        L_0x017e:
            r1 = 2131962269(0x7f13299d, float:1.9561258E38)
            goto L_0x0146
        L_0x0182:
            r1 = 2131969353(0x7f134549, float:1.9575626E38)
            goto L_0x0146
        L_0x0186:
            android.widget.ImageView r1 = r7.A01
            if (r1 == 0) goto L_0x0124
            r0 = 8
            goto L_0x0121
        L_0x018d:
            java.lang.String r0 = "Unsupported tag type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0194:
            java.lang.String r0 = "Unsupported tag type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSN.A00(X.1iA, X.LSN, X.Kj1, int, boolean):void");
    }

    public static void A01(LSN lsn) {
        FragmentActivity fragmentActivity;
        String string;
        String A0h;
        String str;
        int A022 = JTQ.A02(lsn.A0C);
        Integer num = lsn.A07;
        if (num != null && lsn.A05 == C62630Kj1.PRODUCT && lsn.A00 == 0) {
            int intValue = num.intValue();
            if (intValue == 3 || intValue == 4 || intValue == 2) {
                if (intValue == 3 || intValue == 4) {
                    if (lsn.A0C == null) {
                        View inflate = lsn.A0O.inflate();
                        lsn.A0C = inflate;
                        lsn.A03 = AnonymousClass7TE.A0d(inflate, R.id.tags_in_integrity_review_secondary_text);
                    }
                    fragmentActivity = lsn.A0I;
                    string = fragmentActivity.getString(2131956440);
                    A0h = DbW.A0h(fragmentActivity, string, 2131956441);
                    str = "see_review";
                } else if (intValue == 2) {
                    if (lsn.A0C == null) {
                        View inflate2 = lsn.A0O.inflate();
                        lsn.A0C = inflate2;
                        lsn.A03 = AnonymousClass7TE.A0d(inflate2, R.id.tags_in_integrity_review_secondary_text);
                    }
                    fragmentActivity = lsn.A0I;
                    string = fragmentActivity.getString(2131956443);
                    A0h = DbW.A0h(fragmentActivity, string, 2131956444);
                    str = "manage_rejection";
                } else {
                    return;
                }
                TextView textView = lsn.A03;
                if (textView != null) {
                    SpannableStringBuilder A0C2 = DbS.A0C(A0h);
                    AnonymousClass7AV.A05(A0C2, new C62142Kav(lsn, Integer.valueOf(fragmentActivity.getResources().getColor(2Yu.A06(fragmentActivity))), str), string);
                    DbX.A1G(textView, A0C2);
                }
                lsn.A0C.setVisibility(0);
                lsn.A0D.setVisibility(A022);
            }
        }
    }

    public static void A02(LSN lsn) {
        TextView textView;
        int i;
        if (lsn.A05 == C62630Kj1.PRODUCT) {
            TaggingActivity taggingActivity = (TaggingActivity) lsn.A0L;
            ArrayList arrayList = taggingActivity.A0M;
            if (arrayList == null) {
                JTO.A1L();
                throw AnonymousClass00P.createAndThrow();
            }
            ArrayList arrayList2 = JTT.A0i(taggingActivity, arrayList).A0D;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MediaSuggestedProductTag) it.next()).A01 != C62565Khv.A06) {
                            textView = lsn.A0H;
                            i = 0;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        textView = lsn.A0H;
        i = 8;
        textView.setVisibility(i);
    }

    public final void A03(boolean z, boolean z2) {
        View view;
        Integer num;
        int intValue;
        int i = 8;
        if (z) {
            FragmentActivity fragmentActivity = this.A0I;
            RectF rectF = 0nA.A01;
            if (!((fragmentActivity.getResources().getConfiguration().orientation == 1 && (fragmentActivity.getResources().getConfiguration().screenLayout & 15) == 1) || ((num = this.A07) != null && this.A05 == C62630Kj1.PRODUCT && this.A00 == 0 && ((intValue = num.intValue()) == 3 || intValue == 4 || intValue == 2)))) {
                this.A0D.setVisibility(0);
                view = this.A0P;
                if (this.A05 == C62630Kj1.PRODUCT && z2) {
                    i = 0;
                }
                view.setVisibility(i);
                A02(this);
            }
        }
        view = this.A0D;
        view.setVisibility(i);
        A02(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0078, code lost:
        if (X.182.A06(X.DbS.A0J(r11, 0), r11, 36313012185728608L) == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LSN(android.view.View r25, android.view.ViewStub r26, android.view.ViewStub r27, android.view.ViewStub r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.TextView r32, androidx.fragment.app.FragmentActivity r33, X.AnonymousClass0iw r34, com.instagram.common.session.UserSession r35, X.MXd r36, X.C65706LyL r37, X.C62630Kj1 r38, java.lang.Boolean r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, int r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51) {
        /*
            r24 = this;
            r4 = r24
            r4.<init>()
            r3 = 0
            r4.A09 = r3
            r2 = 1
            r4.A0B = r2
            r4.A0A = r2
            r9 = r33
            r4.A0I = r9
            r10 = r34
            r4.A0J = r10
            r11 = r35
            r4.A0K = r11
            r15 = r41
            r4.A0M = r15
            r0 = r36
            r4.A0L = r0
            r7 = r25
            r4.A0D = r7
            r0 = r29
            r4.A0G = r0
            r0 = r30
            r4.A0P = r0
            r5 = r32
            r4.A0H = r5
            r0 = r26
            r4.A0E = r0
            r6 = r27
            r4.A0F = r6
            r0 = r28
            r4.A0O = r0
            r0 = r38
            r4.A05 = r0
            r0 = r43
            r4.A00 = r0
            r0 = r46
            r4.A08 = r0
            r0 = r40
            r4.A07 = r0
            r0 = r39
            r4.A06 = r0
            X.LOQ r0 = X.LOQ.A00
            r1 = r42
            boolean r0 = r0.A01(r11, r1, r3)
            r4.A09 = r0
            r0 = r48
            r4.A0B = r0
            r0 = r49
            r4.A0A = r0
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            if (r51 != 0) goto L_0x007a
            if (r50 == 0) goto L_0x007a
            X.0Tu r8 = X.DbS.A0J(r11, r3)
            r0 = 36313012185728608(0x81027e000e0660, double:3.027833354793793E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            r23 = 1
            if (r0 != 0) goto L_0x007c
        L_0x007a:
            r23 = 0
        L_0x007c:
            r14 = 0
            X.K99 r8 = new X.K99
            r12 = r37
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r21 = r3
            r22 = r2
            r20 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.A04 = r8
            r0 = 61
            X.C64273LXz.A00(r7, r0, r4)
            if (r44 != 0) goto L_0x009d
            r3 = 8
        L_0x009d:
            r0 = r31
            r0.setVisibility(r3)
            r0 = 62
            X.C64273LXz.A00(r5, r0, r4)
            r0 = r47
            r4.A03(r2, r0)
            X.Okf r0 = new X.Okf
            r0.<init>(r2, r10, r4)
            r6.setOnInflateListener(r0)
            r0 = r45
            r4.A0N = r0
            if (r45 == 0) goto L_0x00c8
            android.view.ViewStub r3 = r4.A0F
            X.Kj1 r2 = r4.A05
            X.Kj1 r1 = X.C62630Kj1.PRODUCT
            r0 = 8
            if (r2 != r1) goto L_0x00c5
            r0 = 0
        L_0x00c5:
            r3.setVisibility(r0)
        L_0x00c8:
            A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSN.<init>(android.view.View, android.view.ViewStub, android.view.ViewStub, android.view.ViewStub, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.MXd, X.LyL, X.Kj1, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
